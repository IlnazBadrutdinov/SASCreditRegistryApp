package ru.akbars.integro.creapp;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.log4j.Logger;
import ru.akbars.integro.dao.CreMethodProperties;
import ru.akbars.integro.dao.OkzEmplAddress;
import ru.akbars.integro.dao.SingleFormatMapper;
import ru.creditregistry._2010.webservice.singleformat.request.ConnectorCode;
import ru.creditregistry._2010.webservice.singleformat.request.SingleFormatService;
import ru.creditregistry._2010.webservice.singleformat.request.SingleFormatService_Service;

public class CallCRE {
	
	private static final Logger log = Logger.getLogger(CallCRE.class);
	
	public ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestOut execute(RequestData requestData,
			Long creId, SingleFormatMapper sfMapper,
			ru.creditregistry._2010.webservice.singleformat.request.ObjectFactory reqOF, CreMethodProperties creProp) throws CRECallException, NullPointerException {

		log.info("Start execute()");
		JAXBContext jaxbContext;
		Long rtdmId = requestData.getRtdmId();
		String applicantId = requestData.getApplicantId();
		String integroMethod = requestData.getIntegroMethod().toUpperCase();
		String uidList = requestData.getUidList();

		SingleFormatService iCRE = (new SingleFormatService_Service()).getSingleFormatServiceHttpPort();
		log.info("iCRE has created");
		ru.creditregistry._2010.webservice.singleformat.request.AuthData iAuth = reqOF.createAuthData();
		iAuth.setLogin(creProp.getCreCredentials().getProperty("login"));
		iAuth.setPassword(creProp.getCreCredentials().getProperty("password"));
		log.info("Login has set");
		ru.creditregistry._2010.webservice.singleformat.request.PersonRequestData iPerson = reqOF
				.createPersonRequestData();
		log.info("iPerson has set by createPersonRequestData");
		ru.akbars.integro.dao.OkzAddress regAddress = sfMapper.getRegAddress(rtdmId, applicantId);
		ru.akbars.integro.dao.OkzAddress actAddress = sfMapper.getActAddress(rtdmId, applicantId);
		OkzEmplAddress emplAddress = sfMapper.getEmplAddress(rtdmId, applicantId);
		ru.akbars.integro.dao.OkzIdentyCard identyCard = sfMapper.getIdentyCard(rtdmId, applicantId);
		ru.akbars.integro.dao.OkzIdentyCard identyCardPfNum = sfMapper.getIdentyCardPfNum(rtdmId, applicantId);
		if (identyCard == null)
			log.info("getIdentyCard is null");
		ru.akbars.integro.dao.OkzLoanRequest loanRequest = sfMapper.getLoanRequest(rtdmId, applicantId);
		ru.akbars.integro.dao.OkzNaturalPerson naturalPerson = sfMapper.getNaturalPerson(rtdmId, applicantId);
		if (naturalPerson != null) {
			if (naturalPerson.getPlaceOfBirth() == null) {
				naturalPerson.setPlaceOfBirth(actAddress.getCity().replaceAll("[\\p{Punct}«»&&[^.,\\-]]", ""));
			}
		}
		log.info("DAO Objects have gotten");
		// Act Address
		if (actAddress != null) {
			iPerson.setActAddrCity(actAddress.getCity());
			iPerson.setActAddrCountry("RU");
			iPerson.setActAddrRegion(actAddress.getRegion());
			iPerson.setActAddrDistrict(actAddress.getDistrict());
			iPerson.setActAddrFlat(actAddress.getFlat());
			iPerson.setActAddrHouse(actAddress.getHouse());
			iPerson.setActAddrStreet(actAddress.getStreet());
			if (actAddress.getPostal() == null || "000000".equals(actAddress.getPostal())) {
				iPerson.setActAddrPostal("101010");
			} else {
				iPerson.setActAddrPostal(actAddress.getPostal());
			}
			iPerson.setActAddrSettlement(actAddress.getSettlement());
		}
		log.info("Act Address");

		if (regAddress != null) {
			// Reg Address
			iPerson.setRegAddrCity(regAddress.getCity());
			iPerson.setRegAddrCountry("RU");
			iPerson.setRegAddrRegion(regAddress.getRegion());
			iPerson.setRegAddrDistrict(regAddress.getDistrict());
			iPerson.setRegAddrFlat(regAddress.getFlat());
			iPerson.setRegAddrHouse(regAddress.getHouse());
			iPerson.setRegAddrStreet(regAddress.getStreet());
			if (regAddress.getPostal() == null || "000000".equals(regAddress.getPostal())) {
				iPerson.setRegAddrPostal("101010");
			} else {
				iPerson.setRegAddrPostal(regAddress.getPostal());
			}
			iPerson.setRegAddrSettlement(regAddress.getSettlement());
		}
		log.info("Reg Address");

		if (integroMethod.equals("GETMEGAFON")) {
			if (emplAddress != null) {
				// Empl Address
				iPerson.setEmpApartment(emplAddress.getEmpApartment());
				iPerson.setEmpBuilding(emplAddress.getEmpBuilding());
				iPerson.setEmpCity(emplAddress.getEmpCity());
				iPerson.setEmpCityType(emplAddress.getEmpCityType());
				iPerson.setEmpCountry("RU");
				iPerson.setEmpDistrict(emplAddress.getEmpDistrict());
				iPerson.setEmpDistrictType(emplAddress.getEmpDistrictType());
				iPerson.setEmpHouse(emplAddress.getEmpHouse());
				iPerson.setEmpPhone(emplAddress.getEmpPhone());
				iPerson.setEmpPostal(emplAddress.getEmpPostal());
				iPerson.setEmpRegion(emplAddress.getEmpRegion());
				iPerson.setEmpSettlement(emplAddress.getEmpSettlement());
				iPerson.setEmpSettlementType(emplAddress.getEmpSettlementType());
				iPerson.setEmpStreet(emplAddress.getEmpStreet());
				iPerson.setEmpStreetType(emplAddress.getEmpStreetType());
			} else {
				throw new NullPointerException();
			}
			log.info("Emp Address");
		}
		// Person Data
		if (naturalPerson != null) {
			iPerson.setConsentDate(naturalPerson.getConsentDate());
			iPerson.setConsentEndDate(naturalPerson.getConsentEndDate());
			iPerson.setConsentPurpose(1);
			iPerson.setConsentUser("ПАО \"АК БАРС БАНК\"");
			iPerson.setDateOfBirth(naturalPerson.getDateOfBirth());
			iPerson.setLastName(naturalPerson.getLastName());
			System.out.println("LAST NAME OF A PERSON === " + iPerson.getLastName());
			iPerson.setFirstName(naturalPerson.getFirstName());
			iPerson.setMiddleName(naturalPerson.getMiddleName());
			iPerson.setPlaceOfBirth(naturalPerson.getPlaceOfBirth());
			if (identyCardPfNum != null){
				iPerson.setPfNum(identyCardPfNum.getNumber().replaceAll("[^0-9]+", ""));
			}
			iPerson.setMobilePhone(naturalPerson.getMobilePhone());
		}
		log.info("Person Data");
		// Loan Request
		if (loanRequest != null) {
			iPerson.setCurrency("RUB");
			iPerson.setAmount(loanRequest.getCreditSum());
			iPerson.setCredDuration(loanRequest.getCreditTerm());
			iPerson.setReason(loanRequest.getReason());
		}
		log.info("Loan Request");
		// Identity Card
		if (identyCard != null) {
			iPerson.setIdNum(identyCard.getNumber());
			iPerson.setIdSeries(identyCard.getSeries());
			iPerson.setIdType(21);
			
			if (identyCard.getIssuer() == null) {
				iPerson.setIssueAuthority("-");
			} else {
				iPerson.setIssueAuthority(identyCard.getIssuer().replaceAll("[\\p{Punct}«»&&[^.,\\-]]", ""));
			}
			
			iPerson.setIssueDate(identyCard.getIssueDate());
			iPerson.setIssueLocation("RU");
		}
		log.info("Identy Card");

		String creMethod = creProp.getIntegroCreMethod(integroMethod).getCreMethod();
		log.info(creMethod);
		ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestOut iOut = null;

		XMLGregorianCalendar time2 = null;
		GregorianCalendar c = new GregorianCalendar();
		Calendar.getInstance().getWeekYear();
		c.setTime(new java.util.Date());
		try {
			time2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		if (creMethod.equals("PROCESSREQUEST")) 
		{
			log.debug("PROCESSREQUEST EXECUTE");
			ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestData iProcessRD = reqOF.createProcessRequestData();
			ConnectorCode iCC = creProp.getConnectorCodeForProcessRequest(creProp.getIntegroCreMethod(integroMethod));
			iProcessRD.setConnectorCode(iCC);
			iProcessRD.setAuthData(iAuth);
			iProcessRD.getPersonParam().add(iPerson);
			iProcessRD.setCacheUse(creProp.getIntegroCreMethod(integroMethod).getCacheUse());
			iProcessRD.setUid(applicantId + ":" + creId);
			iProcessRD.setUidApplication(applicantId);
			iProcessRD.setDateTimeApplication(time2);
			try 
			{
				jaxbContext = JAXBContext.newInstance(ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestData.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				StringWriter sw = new StringWriter();
				jaxbMarshaller.marshal(iProcessRD,sw);
				String xmlString = sw.toString();
				log.debug("INTEGRATION TO CRE REQUEST PROCESSREQUEST --- " + xmlString);
				iOut = iCRE.processRequest(iAuth, iProcessRD);
			} 
			catch (Exception ex) 
			{
				throw new CRECallException();
			}
		} else {
			if (creMethod.equals("GROUPREQUEST")) 
			{
				log.debug("GROUPREQUEST EXECUTE");
				ru.creditregistry._2010.webservice.singleformat.request.GroupRequestData iGroupRD = reqOF.createGroupRequestData();
				List<ConnectorCode> iCCList = creProp.getConnectorCodeForGroupRequest(creProp.getIntegroCreMethod(integroMethod));
				iGroupRD.getConnectorCodes().addAll(iCCList);
				iGroupRD.setAuthData(iAuth);
				iGroupRD.getPersonParam().add(iPerson);
				iGroupRD.setCacheUse(creProp.getIntegroCreMethod(integroMethod).getCacheUse());
				iGroupRD.setUid(applicantId + ":" + creId);
				iGroupRD.setUidApplication(applicantId);
				iGroupRD.setDateTimeApplication(time2);
				try 
				{
					jaxbContext = JAXBContext.newInstance(ru.creditregistry._2010.webservice.singleformat.request.GroupRequestData.class);
					Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
					StringWriter sw = new StringWriter();
					jaxbMarshaller.marshal(iGroupRD,sw);
					String xmlString = sw.toString();
					log.debug("INTEGRATION TO CRE REQUEST GROUPREQUEST --- " + xmlString);
				} 
				catch (JAXBException e) 
				{
					e.printStackTrace();
				}
				iOut = iCRE.groupRequest(iAuth, iGroupRD);
			} else {
				if (creMethod.equals("JOINUIDRESPONSES")) {
					log.debug("JOINUIDRESPONSES EXECUTE");
					ru.creditregistry._2010.webservice.singleformat.request.JoinUidResponsesData iJoinRD = reqOF.createJoinUidResponsesData();
					iJoinRD.setAuthData(iAuth);
					System.out.println("uidList == " + uidList);
					for (String iJoinRDUID : uidList.split("\\|"))
					{
						iJoinRD.getUid().add(iJoinRDUID);
						System.out.println(iJoinRDUID);
					}
					try 
					{
						jaxbContext = JAXBContext.newInstance(ru.creditregistry._2010.webservice.singleformat.request.JoinUidResponsesData.class);
						Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
						StringWriter sw = new StringWriter();
						jaxbMarshaller.marshal(iJoinRD,sw);
						String xmlString = sw.toString();
						log.debug("INTEGRATION TO CRE REQUEST JOINUIDRESPONSES --- " + xmlString);
					} catch (JAXBException e) 
					{
						e.printStackTrace();
					}
					iOut = iCRE.joinUidResponses(iAuth, iJoinRD);
				}
			}
		}
		log.info("before return iOut");
		return iOut;
	}
}
