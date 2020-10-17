package ru.akbars.integro.creapp;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import ru.akbars.integro.dao.CreMethodProperties;
import ru.akbars.integro.dao.SingleFormatMapper;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.InetAddress;

@WebService(targetNamespace = "http://creapp.integro.akbars.ru/", endpointInterface = "ru.akbars.integro.creapp.SASCreditRegistryPort", portName = "SASCreditRegistryPortImplPort", serviceName = "SASCreditRegistryPortImplService")
public class SASCreditRegistryPortImpl implements SASCreditRegistryPort {

	public static final Logger log = Logger.getLogger(SASCreditRegistryPortImpl.class);
	private String iHostName;
	private CreMethodProperties creProp;
	ru.creditregistry._2010.webservice.singleformat.request.ObjectFactory reqOF = new ru.creditregistry._2010.webservice.singleformat.request.ObjectFactory();

	SingleFormatParser sfParser = new SingleFormatParser();

	public SASCreditRegistryPortImpl() {
		log.info("SASCreditRegistryPortImpl starting ...");
		try {
			creProp = new CreMethodProperties();
			iHostName = InetAddress.getLocalHost().getHostName();
		} catch (Exception e1) {
			e1.printStackTrace();
			iHostName = "localhost";
		}
	}

	@Override
	public IntegrationResponse executeRequest(RequestData requestData) {
		SqlSession sqlSession = null;
		ru.akbars.integro.dao.SingleFormatMapper sfMapper = null;
		IntegrationResponse resp = new IntegrationResponse();

		Long creId = 0L;
		Long rtdmId = requestData.getRtdmId();
		CallCRE iCallCRE = new CallCRE();
		System.out.println("CallCRE has created");

		java.util.Date startdt = null;
		int i = 1;
		int cacheUse = 0;
		try {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
			sfMapper = sqlSession.getMapper(SingleFormatMapper.class);
			creId = sfMapper.nextCreId();
			resp.setCreId(creId);
			ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestOut iOut;
			int iterationCount = 3;
			for (i = 1; i <= iterationCount; i++) {
				Integer requestStatus = 0;
				startdt = new java.util.Date();
				System.out.println("startdt = " + startdt);
				try {
					iOut = iCallCRE.execute(requestData, creId, sfMapper, reqOF, creProp);
					cacheUse = sfParser.parseProcessRequest(requestData, creId, iOut, sfMapper);
				} catch (CRECallException e) {
					// TODO Auto-generated catch block
					requestStatus = 2;
				}
				java.util.Date endts = new java.util.Date();
				System.out.println("endts = " + endts);
				sfMapper.insertCreRequest(requestData.getRtdmId(), creId, i, requestData.getIntegroMethod(),
						requestStatus, startdt, endts, requestData.getApplicantId());
				if (requestStatus == 0) {
					if (cacheUse == 1) {
						sfMapper.insertServicesWork(requestData.getRtdmId(), requestData.getApplicantId(),
								requestData.getIntegroMethod(), "2");
					} else {
						sfMapper.insertServicesWork(requestData.getRtdmId(), requestData.getApplicantId(),
								requestData.getIntegroMethod(), "0");
					}
					break;
				}

				if (i == iterationCount && requestStatus == 2) {
					throw new CRECallException();
				}
			}
			System.out.println("CallCRE has executed");
			System.out.println("sfParser.parseProcessRequest has executed");
		} catch (SAXException | IOException | ParserConfigurationException | JAXBException | NullPointerException | PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setStatus(1);
			java.util.Date endts = new java.util.Date();
			log.error("RTDM_ID=" + rtdmId + ", CRE_ID=" + creId + "\n" + e.getClass().getName() + "\n" + e.getMessage());
			sfMapper.insertCreRequest(requestData.getRtdmId(), creId, i, requestData.getIntegroMethod(), 1, startdt,
					endts, requestData.getApplicantId());
			sfMapper.insertServicesWork(requestData.getRtdmId(), requestData.getApplicantId(),
					requestData.getIntegroMethod(), "1");
		} catch (CRECallException ex) {
			resp.setStatus(2);
			log.error(ex.getMessage());
			sfMapper.insertServicesWork(requestData.getRtdmId(), requestData.getApplicantId(),
					requestData.getIntegroMethod(), "1");
		} finally {
			if (sqlSession != null) {
				sqlSession.commit();
			}
		}
		resp.setCreId(creId);
		return resp;
	}
}
