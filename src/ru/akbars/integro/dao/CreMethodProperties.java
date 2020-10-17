package ru.akbars.integro.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import ru.creditregistry._2010.webservice.singleformat.request.ConnectorCode;

public class CreMethodProperties {
	
	private static final Logger log = Logger.getLogger(CreMethodProperties.class);
	
	private Properties creCredentials;
	
	List<DictIntegroCreMethod> integroMethodList;

	public CreMethodProperties() {
		Reader reader = null;	
		creCredentials = new Properties();
		try {
			reader = Resources
			          .getResourceAsReader("creparam.properties");
			if(reader==null)
	            log.info("Sorry, unable to find " + "creparam");
			// load a properties file
			creCredentials.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		RtdmSomeMapper rtdmMapper = sqlSession.getMapper(RtdmSomeMapper.class);
		integroMethodList = rtdmMapper.getIntegroMethod();
		log.info("integroMethodList size = " + integroMethodList.size());
		for (DictIntegroCreMethod integroMethod : integroMethodList) {
			log.info("integro method : " + integroMethod.getMethodName());
			List<DictCreConnectorCode> dictCCList = rtdmMapper.getConnectorCode(integroMethod.getMethodName());
			log.info("dictCCList size = " + dictCCList.size());
			integroMethod.getConCode().addAll(dictCCList);
		}
	}
	
	public List<DictIntegroCreMethod> getCreMethodList() {
		return integroMethodList;
	}

	public void setCreMethodList(List<DictIntegroCreMethod> integroMethodList) {
		this.integroMethodList = integroMethodList;
	}

	public DictIntegroCreMethod getIntegroCreMethod(String method) {
		
		log.info("getIntegroCreMethod for " + method);
		for (DictIntegroCreMethod integroMethod : integroMethodList) {
			log.info(integroMethod.getMethodName());
			if (integroMethod.getMethodName().equals(method))
				return integroMethod;
		}
		log.info("return null");
		return null;
	}

	public List<ru.creditregistry._2010.webservice.singleformat.request.ConnectorCode> getConnectorCodeForGroupRequest(
			DictIntegroCreMethod integroMethod) {

		List<ConnectorCode> iCCList = new ArrayList<ConnectorCode>();
		for (DictCreConnectorCode dictCC : integroMethod.getConCode()) {
			ConnectorCode iCC = null;
			for (ConnectorCode tmpCC : iCCList) {
				if (tmpCC.getConnectorCode().equals(dictCC.getConnectorCode())) {
					iCC = tmpCC;
				}
			}
			if (iCC == null) {
				iCC = new ConnectorCode();
				iCC.setConnectorCode(dictCC.getConnectorCode());
				iCCList.add(iCC);
			}
			iCC.getSubRequestCode().add(dictCC.getSubrequestCode());
		}
		return iCCList;
	}

	public ru.creditregistry._2010.webservice.singleformat.request.ConnectorCode getConnectorCodeForProcessRequest(
			DictIntegroCreMethod integroMethod) {

		ConnectorCode iCC = new ConnectorCode();
		iCC.setConnectorCode(integroMethod.getConCode().get(0).connectorCode);
		for (DictCreConnectorCode dictCC : integroMethod.getConCode()) {
			iCC.getSubRequestCode().add(dictCC.getSubrequestCode());
		}

		return iCC;
	}

	public Properties getCreCredentials() {
		return creCredentials;
	}

	public void setCreCredentials(Properties creCredentials) {
		this.creCredentials = creCredentials;
	}
}
