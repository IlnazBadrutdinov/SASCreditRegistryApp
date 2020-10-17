package ru.akbars.integro.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface SingleFormatMapper {

	int insertCreRequest(@Param("rtdmid") Long rtdmId,
			@Param("creid") Long creId,
			@Param("iternum") Integer iterNum,
			@Param("methodname")String methodName,
			@Param("requeststatus") Integer requestStatus,
			@Param("startts") java.util.Date startts,
			@Param("endts") java.util.Date endts,
			@Param("applicantid") String applicantId);
	
	@Select("select cre_id_seq.nextval from dual")
	Long nextCreId();
	
	@Select("select CRE_ADDRESS_ID.nextval from dual")
	Long nextCreAdrID();
	
	@Select("select CRE_BANKRUPTCY_ID.nextval from dual")
	Long nextCreBankID();
	
	@Select("select CRE_CDD_ID.nextval from dual")
	Long nextCDDId();
	
	@Select("select CRE_DOCUMENT_ID.nextval from dual")
	Long nextCreDocID();
	
	@Select("select CRE_EMPLOYMENT_ID.nextval from dual")
	Long nextCreEmplId();
	
	@Select("select CRE_GENERAL_ID.nextval from dual")
	Long nextCreGenID();
	
	@Select("select CRE_INQUIRY_ID.nextval from dual")
	Long nextCreInqId();
	
	@Select("select CRE_LEGAL_ID.nextval from dual")
	Long nextCreLegId();
	
	@Select("select CRE_LOAN_ID.nextval from dual")
	Long nextCreLoanId();
	
	@Select("select CRE_LOAN_OV_ID.nextval from dual")
	Long nextCreLoanOVId();
	
	@Select("select CRE_MAIN_ID.nextval from dual")
	Long nextCreMainId();
	
	@Select("select CRE_MD_ID.nextval from dual")
	Long nextCreMDId();
	
	@Select("select CRE_NAME_ID.nextval from dual")
	Long nextCreNameId();
	
	@Select("select CRE_OFFICIAL_ID.nextval from dual")
	Long nextCreOffId();
	
	@Select("select CRE_PASSPORT_ID.nextval from dual")
	Long nextCrePassId();
	
	@Select("select CRE_PHONE_ID.nextval from dual")
	Long nextCrePhoneId();
	
	@Select("select CRE_REQUEST_ID.nextval from dual")
	Long nextCreReqId();
	
	@Select("select CRE_SCORE_ID.nextval from dual")
	Long nextCreScoreId();
	
	@Select("select CRE_SECONDARY_ID.nextval from dual")
	Long nextCreSecId();
	
	@Select("select CRE_BUSINESS_ID.nextval from dual")
	Long nextCreBusId();
	
	@Select("select CRE_BANKG_ID.nextval from dual")
	Long nextCreBankGId();
	
	
	
	
	/*new*/
	@Select("select CRE_AMENDMENT_ID.nextval from dual")
	Long nextCreAmendId();
	
	@Select("select CRE_PAYMENT_ID.nextval from dual")
	Long nextCrePayId();
	/*new*/
	
	
	
	
	
	@Results({ 
			@Result(property = "consentDate", column = "BKIAGREEMENTSTARTDATE"),
			@Result(property = "consentEndDate", column = "BKIAGREEMENTENDDATE"), 
			@Result(property = "dateOfBirth", column = "BIRTHDATE"),
			@Result(property = "lastName", column = "LASTNAME"), 
			@Result(property = "firstName", column = "FIRSTNAME"),
			@Result(property = "middleName", column = "SECONDNAME"), 
			@Result(property = "placeOfBirth", column = "BIRTHPLACE"),
            @Result(property = "mobilePhone", column = "CELLPHONE")

	})
	@Select("select BKIAGREEMENTSTARTDATE," + "BKIAGREEMENTENDDATE," + "BIRTHDATE," + "LASTNAME," + "FIRSTNAME,"
			+ "SECONDNAME," + "BIRTHPLACE," + "CELLPHONE" + " from OKZ_NATURALPERSON"
			+ "	where rtdmid = #{rtdmid} and naturalpersonid = #{applicantid}")
	ru.akbars.integro.dao.OkzNaturalPerson getNaturalPerson(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);

	@Results({ 
			@Result(property = "creditTerm", column = "CREDITTERM"), 
			@Result(property = "creditSum", column = "CREDITSUM"),
			@Result(property = "reason", column = "REASON")
	})
	@Select("select CREDITTERM," + " CREDITSUM, " 
			+ "	fn_cre_reason(parentproducttype,producttypename) as REASON" 
			+ " from OKZ_LOANREQUEST"
			+ "	where rtdmid = #{rtdmid} ")
	ru.akbars.integro.dao.OkzLoanRequest getLoanRequest(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);

	@Results({
		@Result(property = "region", column = "REGIONCODE"),
		@Result(property = "district", column = "RAYON"),
		@Result(property = "flat", column = "APARTMENT"),
		@Result(property = "house", column = "HOUSE"),
		@Result(property = "street", column = "STREET"),
		@Result(property = "postal", column = "POSTINDEX"),
		@Result(property = "settlement", column = "SETTLEMENT")
		})
	@Select("select CITY," + "REGIONCODE," + "RAYON," + "APARTMENT," + "HOUSE," + "STREET," + "POSTINDEX," + "SETTLEMENT"
			+ " from OKZ_ADDRESS" + " where rtdmid = #{rtdmid} and naturalpersonid = #{applicantid}"
			+ "	and ADDRESSTYPE = 2")
	ru.akbars.integro.dao.OkzAddress getActAddress(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);

	@Results({
		@Result(property = "region", column = "REGIONCODE"),
		@Result(property = "district", column = "RAYON"),
		@Result(property = "flat", column = "APARTMENT"),
		@Result(property = "house", column = "HOUSE"),
		@Result(property = "street", column = "STREET"),
		@Result(property = "postal", column = "POSTINDEX"),
		@Result(property = "settlement", column = "SETTLEMENT")
		})
	@Select("select CITY," + "REGIONCODE," + "RAYON," + "APARTMENT," + "HOUSE," + "STREET," + "POSTINDEX," + "SETTLEMENT"
			+ " from OKZ_ADDRESS" + " where rtdmid = #{rtdmid} and naturalpersonid = #{applicantid}"
			+ "	and ADDRESSTYPE = 1")
	ru.akbars.integro.dao.OkzAddress getRegAddress(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);

	@Results({
			@Result(property = "empApartment", column = "APARTMENT"),
			@Result(property = "empBuilding", column = "BUILDING"),
			@Result(property = "empCity", column = "CITY"),
			@Result(property = "empCityType", column = "CITYTYPE"),
			@Result(property = "empDistrict", column = "RAYON"),
			@Result(property = "empDistrictType", column = "RAYONTYPE"),
			@Result(property = "empHouse", column = "HOUSE"),
			@Result(property = "empPhone", column = "OFFICEPHONE"),
			@Result(property = "empPostal", column = "POSTINDEX"),
			@Result(property = "empRegion", column = "REGIONCODE"),
			@Result(property = "empSettlement", column = "SETTLEMENT"),
			@Result(property = "empSettlementType", column = "SETTLEMENTTYPE"),
			@Result(property = "empStreet", column = "STREET"),
			@Result(property = "empStreetType", column = "STREETTYPE")
	})
	@Select("SELECT A.APARTMENT, A.BUILDING, A.CITY, A.CITYTYPE, A.RAYON, A.RAYONTYPE, A.HOUSE, N.OFFICEPHONE, A.POSTINDEX,\n" +
			"A.REGIONCODE, A.SETTLEMENT, A.SETTLEMENTTYPE, A.STREET, A.STREETTYPE FROM OKZ_ADDRESS A LEFT JOIN OKZ_NATURALPERSON N \n" +
			"ON A.NATURALPERSONID = N.NATURALPERSONID AND A.RTDMID = N.RTDMID WHERE A.RTDMID = #{rtdmid} AND \n" +
			"A.NATURALPERSONID = #{applicantid} AND A.ADDRESSTYPE = 4")

	OkzEmplAddress getEmplAddress(@Param("rtdmid") Long rtdmId,
								  @Param("applicantid") String applicantId);
	
	@Results({
		@Result(property = "number", column = "CARDNUMBER"),
		@Result(property = "series", column = "CARDSERIES"),
		@Result(property = "issuer", column = "CARDISSUER"),
		@Result(property = "issueDate", column = "CARDDATE")	
		})
	@Select("select CARDNUMBER," + " CARDSERIES," + " CARDISSUER," + " CARDDATE"
			+ " from OKZ_IDENTITYCARD"
			+ " where rtdmid = #{rtdmid} and naturalpersonid = #{applicantid}" + "	and ACTIVE = 1 and CODE = 21")
	ru.akbars.integro.dao.OkzIdentyCard getIdentyCard(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);

	@Results({
		@Result(property = "number", column = "CARDNUMBER")	
		})
	@Select("select CARDNUMBER"
			+ " from OKZ_IDENTITYCARD"
			+ " where rtdmid = #{rtdmid} and naturalpersonid = #{applicantid}" + "	and ACTIVE = 1 and CODE = 000")
	ru.akbars.integro.dao.OkzIdentyCard getIdentyCardPfNum(@Param("rtdmid") Long rtdmId,
			@Param("applicantid") String applicantId);	
	
	int insertMain(@Param("imainid") Long iMainId ,@Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.MainType iMain, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertCDD(@Param("cddid") Long CDDID, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.ConnectorDataDetailType iCDD, @Param("applicantid") String applicantId);

	int insertSecondary(@Param("secondaryid") Long secondaryId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.SecondaryType iSecondary, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertGeneral(@Param("generalid") Long generalId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.GeneralType iGeneral, @Param("extension") String iExtension, @Param("applicantid") String applicantId);

	int insertName(@Param("nameid") Long nameId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.NameType iName, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertDocument(@Param("documentid") Long documentId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.DocumentType iDocument, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertAddress(@Param("addressid") Long addressId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.AddressType iAddress, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertPhone(@Param("phoneid") Long phoneId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.PhoneType iPhone, @Param("extension") String iExtension, @Param("applicantid") String applicantId);

	int insertEmployment(@Param("employmentid") Long employmentId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.EmploymentType iEmp, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertLoansOverview(@Param("loanovid") Long loanOvId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.LoansOverviewType iLoansOverview, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertLoan(@Param("loanid") Long loanId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.LoanType iLoan, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId, @Param("type") String iLoanType, @Param("status") String iLoanStatus);
	
	
	/*new*/
	int insertPay(@Param("payid") Long payId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.PaymentType iPayment, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId,@Param("loanid") Long loanId);

	int insertAmend(@Param("amendid") Long amendId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.AmendmentType iPayment, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId,@Param("loanid") Long loanId);
	/*new*/
	
	
	int insertInquiry(@Param("inquiryid") Long inquiryId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.InquiryType iInq, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertLegal(@Param("legalid") Long legalId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.LegalType iLegal, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertBankruptcy(@Param("bankid") Long bankId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.BankruptcyType iBankrupcy, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertOfficial(@Param("offid") Long offId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.OfficialType iOfficial, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertScore(@Param("scoreid") Long scoreId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.ScoreType iScore, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);
	
	int insertBusiness(@Param("businessid") Long businessId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.BusinessType iBusinessType, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId);

	int insertMD(@Param("mdid") Long mdId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.MonthlyDetailType iMDType, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId, @Param("loanid") Long loanId);
	
	int insertLoanLegal(@Param("legalid") Long legalId, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.LegalType iLegal, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId, @Param("loanid") Long loanId);

	int insertBankGuarantee(@Param("bankgid") Long bankgid, @Param("rtdmid") Long rtdmId, @Param("creid") Long creId,
			@Param("req") ru.creditregistry._2010.webservice.singleformat.response.BankGuaranteeType iBankGuarantee, @Param("extension") String iExtension, @Param("infosources") String infoSources, @Param("applicantid") String applicantId, @Param("loanid") Long loanId);
	
	int insertServicesWork(@Param("rtdmId") Long rtdmId, @Param("naturalPersonId") String naturalPersonId,
						   @Param("serviceName") String serviceName, @Param("response") String response);
}
