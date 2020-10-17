
package ru.creditregistry._2010.webservice.singleformat.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип описывает данные субъекта для запроса
 * 
 * <p>Java class for PersonRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defaultStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scndIdType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scndIdSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pastIdType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pastIdSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empOgrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBusinessIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyDocIncome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="incomeProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyUndocIncome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purposeOfFinance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originalChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextPmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmtFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralExistence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseExistence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentPurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consentPurposeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraudStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraudStatuses" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}FraudStatuses" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="photoDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="photoComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRequestData", propOrder = {

})
public class PersonRequestData {

    protected String applicantId;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String pastLastName;
    protected String pastFirstName;
    protected String pastMiddleName;
    protected String spouseLastName;
    protected String spouseFirstName;
    protected String spouseMiddleName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar spouseDateOfBirth;
    protected Integer applicationStatus;
    protected Integer defaultStatus;
    protected String sex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String placeOfBirth;
    protected Integer idType;
    protected String idSeries;
    protected String idNum;
    protected String issueAuthority;
    protected String issueCode;
    protected String issueLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected Integer scndIdType;
    protected String scndIdSeries;
    protected String scndIdNum;
    protected String scndIssueAuthority;
    protected String scndIssueLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scndIssueDate;
    protected Integer pastIdType;
    protected String pastIdSeries;
    protected String pastIdNum;
    protected String pastIssueAuthority;
    protected String pastIssueCode;
    protected String pastIssueLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pastIssueDate;
    protected Integer numChildren;
    protected String education;
    protected String companyName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    protected String inn;
    protected String pfNum;
    protected String nationality;
    protected String maritalStatus;
    protected String driverNo;
    protected String email;
    protected String homePhone;
    protected String mobilePhone;
    protected String mobilePhone2;
    protected String actAddrCountry;
    protected String actAddrPostal;
    protected String actAddrRegion;
    protected String actAddrDistrictType;
    protected String actAddrDistrict;
    protected String actAddrCityType;
    protected String actAddrCity;
    protected String actAddrSettlementType;
    protected String actAddrSettlement;
    protected String actAddrStreetType;
    protected String actAddrStreet;
    protected String actAddrHouse;
    protected String actAddrBuilding;
    protected String actAddrStructure;
    protected String actAddrFlat;
    protected Integer actAddrMonths;
    protected String regAddrCountry;
    protected String regAddrPostal;
    protected String regAddrRegion;
    protected String regAddrDistrictType;
    protected String regAddrDistrict;
    protected String regAddrCityType;
    protected String regAddrCity;
    protected String regAddrSettlementType;
    protected String regAddrSettlement;
    protected String regAddrStreetType;
    protected String regAddrStreet;
    protected String regAddrHouse;
    protected String regAddrBuilding;
    protected String regAddrStructure;
    protected String regAddrFlat;
    protected String regAddrPhone;
    protected String workPhone;
    protected String workPhone2;
    protected String empFullName;
    protected String empShortName;
    protected String empFirmName;
    protected String empEngName;
    protected String empOgrn;
    protected String empInn;
    protected String empPhone;
    protected String empSize;
    protected String empBusinessIndustry;
    protected String empCountry;
    protected String empPostal;
    protected String empRegion;
    protected String empDistrictType;
    protected String empDistrict;
    protected String empCityType;
    protected String empCity;
    protected String empSettlementType;
    protected String empSettlement;
    protected String empStreetType;
    protected String empStreet;
    protected String empHouse;
    protected String empBuilding;
    protected String empStructure;
    protected String empApartment;
    protected String empRestrFullName;
    protected String empRestrShortName;
    protected String empRestrFirmName;
    protected String empRestrEngName;
    protected String empRestrInn;
    protected String current;
    protected String position;
    protected String occupationType;
    protected Integer monthlyDocIncome;
    protected String incomeProof;
    protected Integer monthlyUndocIncome;
    protected String profession;
    protected String workDuration;
    protected String reason;
    protected Integer purposeOfFinance;
    protected String productName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradeDate;
    protected String amount;
    protected String creditLimit;
    protected String currency;
    protected Integer credDuration;
    protected String originalChannel;
    protected String downPaymentAmount;
    protected String finalPaymentAmount;
    protected String nextPmt;
    protected String pmtFreq;
    protected String collateralExistence;
    protected String collateralValue;
    protected String purchaseExistence;
    protected String purchaseValue;
    protected String purchaseModel;
    protected String posCode;
    protected String posPhone;
    protected String posCountry;
    protected String posPostal;
    protected String posDistrict;
    protected String posRegion;
    protected String posCity;
    protected String posSettlement;
    protected String posStreet;
    protected String posHouse;
    protected String posBuilding;
    protected String posStructure;
    protected String posApartment;
    protected String carRegNo;
    protected String vin;
    protected String newApplicant;
    protected Integer exp;
    protected String relationship;
    protected String consent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consentDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consentEndDate;
    protected Integer consentPurpose;
    protected String consentPurposeText;
    protected String consentUser;
    protected Integer applicationWay;
    protected Integer category;
    protected Integer format;
    protected Integer fraudStatus;
    protected FraudStatuses fraudStatuses;
    protected byte[] photo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar photoDate;
    protected String photoComment;
    protected String fraudStatusText;

    /**
     * Gets the value of the applicantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * Sets the value of the applicantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantId(String value) {
        this.applicantId = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the pastLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastLastName() {
        return pastLastName;
    }

    /**
     * Sets the value of the pastLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastLastName(String value) {
        this.pastLastName = value;
    }

    /**
     * Gets the value of the pastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastFirstName() {
        return pastFirstName;
    }

    /**
     * Sets the value of the pastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastFirstName(String value) {
        this.pastFirstName = value;
    }

    /**
     * Gets the value of the pastMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastMiddleName() {
        return pastMiddleName;
    }

    /**
     * Sets the value of the pastMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastMiddleName(String value) {
        this.pastMiddleName = value;
    }

    /**
     * Gets the value of the spouseLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }

    /**
     * Sets the value of the spouseLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseLastName(String value) {
        this.spouseLastName = value;
    }

    /**
     * Gets the value of the spouseFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Sets the value of the spouseFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFirstName(String value) {
        this.spouseFirstName = value;
    }

    /**
     * Gets the value of the spouseMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    /**
     * Sets the value of the spouseMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseMiddleName(String value) {
        this.spouseMiddleName = value;
    }

    /**
     * Gets the value of the spouseDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpouseDateOfBirth() {
        return spouseDateOfBirth;
    }

    /**
     * Sets the value of the spouseDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpouseDateOfBirth(XMLGregorianCalendar value) {
        this.spouseDateOfBirth = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationStatus(Integer value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the defaultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Sets the value of the defaultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultStatus(Integer value) {
        this.defaultStatus = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdType(Integer value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSeries() {
        return idSeries;
    }

    /**
     * Sets the value of the idSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSeries(String value) {
        this.idSeries = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNum(String value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the issueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueAuthority() {
        return issueAuthority;
    }

    /**
     * Sets the value of the issueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueAuthority(String value) {
        this.issueAuthority = value;
    }

    /**
     * Gets the value of the issueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCode() {
        return issueCode;
    }

    /**
     * Sets the value of the issueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCode(String value) {
        this.issueCode = value;
    }

    /**
     * Gets the value of the issueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueLocation() {
        return issueLocation;
    }

    /**
     * Sets the value of the issueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueLocation(String value) {
        this.issueLocation = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the scndIdType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScndIdType() {
        return scndIdType;
    }

    /**
     * Sets the value of the scndIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScndIdType(Integer value) {
        this.scndIdType = value;
    }

    /**
     * Gets the value of the scndIdSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndIdSeries() {
        return scndIdSeries;
    }

    /**
     * Sets the value of the scndIdSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndIdSeries(String value) {
        this.scndIdSeries = value;
    }

    /**
     * Gets the value of the scndIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndIdNum() {
        return scndIdNum;
    }

    /**
     * Sets the value of the scndIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndIdNum(String value) {
        this.scndIdNum = value;
    }

    /**
     * Gets the value of the scndIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndIssueAuthority() {
        return scndIssueAuthority;
    }

    /**
     * Sets the value of the scndIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndIssueAuthority(String value) {
        this.scndIssueAuthority = value;
    }

    /**
     * Gets the value of the scndIssueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndIssueLocation() {
        return scndIssueLocation;
    }

    /**
     * Sets the value of the scndIssueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndIssueLocation(String value) {
        this.scndIssueLocation = value;
    }

    /**
     * Gets the value of the scndIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScndIssueDate() {
        return scndIssueDate;
    }

    /**
     * Sets the value of the scndIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScndIssueDate(XMLGregorianCalendar value) {
        this.scndIssueDate = value;
    }

    /**
     * Gets the value of the pastIdType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastIdType() {
        return pastIdType;
    }

    /**
     * Sets the value of the pastIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastIdType(Integer value) {
        this.pastIdType = value;
    }

    /**
     * Gets the value of the pastIdSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastIdSeries() {
        return pastIdSeries;
    }

    /**
     * Sets the value of the pastIdSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastIdSeries(String value) {
        this.pastIdSeries = value;
    }

    /**
     * Gets the value of the pastIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastIdNum() {
        return pastIdNum;
    }

    /**
     * Sets the value of the pastIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastIdNum(String value) {
        this.pastIdNum = value;
    }

    /**
     * Gets the value of the pastIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastIssueAuthority() {
        return pastIssueAuthority;
    }

    /**
     * Sets the value of the pastIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastIssueAuthority(String value) {
        this.pastIssueAuthority = value;
    }

    /**
     * Gets the value of the pastIssueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastIssueCode() {
        return pastIssueCode;
    }

    /**
     * Sets the value of the pastIssueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastIssueCode(String value) {
        this.pastIssueCode = value;
    }

    /**
     * Gets the value of the pastIssueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastIssueLocation() {
        return pastIssueLocation;
    }

    /**
     * Sets the value of the pastIssueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastIssueLocation(String value) {
        this.pastIssueLocation = value;
    }

    /**
     * Gets the value of the pastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPastIssueDate() {
        return pastIssueDate;
    }

    /**
     * Sets the value of the pastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPastIssueDate(XMLGregorianCalendar value) {
        this.pastIssueDate = value;
    }

    /**
     * Gets the value of the numChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumChildren() {
        return numChildren;
    }

    /**
     * Sets the value of the numChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumChildren(Integer value) {
        this.numChildren = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the pfNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfNum() {
        return pfNum;
    }

    /**
     * Sets the value of the pfNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfNum(String value) {
        this.pfNum = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the driverNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverNo() {
        return driverNo;
    }

    /**
     * Sets the value of the driverNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverNo(String value) {
        this.driverNo = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the mobilePhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone2() {
        return mobilePhone2;
    }

    /**
     * Sets the value of the mobilePhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone2(String value) {
        this.mobilePhone2 = value;
    }

    /**
     * Gets the value of the actAddrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrCountry() {
        return actAddrCountry;
    }

    /**
     * Sets the value of the actAddrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrCountry(String value) {
        this.actAddrCountry = value;
    }

    /**
     * Gets the value of the actAddrPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrPostal() {
        return actAddrPostal;
    }

    /**
     * Sets the value of the actAddrPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrPostal(String value) {
        this.actAddrPostal = value;
    }

    /**
     * Gets the value of the actAddrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrRegion() {
        return actAddrRegion;
    }

    /**
     * Sets the value of the actAddrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrRegion(String value) {
        this.actAddrRegion = value;
    }

    /**
     * Gets the value of the actAddrDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrDistrictType() {
        return actAddrDistrictType;
    }

    /**
     * Sets the value of the actAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrDistrictType(String value) {
        this.actAddrDistrictType = value;
    }

    /**
     * Gets the value of the actAddrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrDistrict() {
        return actAddrDistrict;
    }

    /**
     * Sets the value of the actAddrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrDistrict(String value) {
        this.actAddrDistrict = value;
    }

    /**
     * Gets the value of the actAddrCityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrCityType() {
        return actAddrCityType;
    }

    /**
     * Sets the value of the actAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrCityType(String value) {
        this.actAddrCityType = value;
    }

    /**
     * Gets the value of the actAddrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrCity() {
        return actAddrCity;
    }

    /**
     * Sets the value of the actAddrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrCity(String value) {
        this.actAddrCity = value;
    }

    /**
     * Gets the value of the actAddrSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrSettlementType() {
        return actAddrSettlementType;
    }

    /**
     * Sets the value of the actAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrSettlementType(String value) {
        this.actAddrSettlementType = value;
    }

    /**
     * Gets the value of the actAddrSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrSettlement() {
        return actAddrSettlement;
    }

    /**
     * Sets the value of the actAddrSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrSettlement(String value) {
        this.actAddrSettlement = value;
    }

    /**
     * Gets the value of the actAddrStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrStreetType() {
        return actAddrStreetType;
    }

    /**
     * Sets the value of the actAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrStreetType(String value) {
        this.actAddrStreetType = value;
    }

    /**
     * Gets the value of the actAddrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrStreet() {
        return actAddrStreet;
    }

    /**
     * Sets the value of the actAddrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrStreet(String value) {
        this.actAddrStreet = value;
    }

    /**
     * Gets the value of the actAddrHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrHouse() {
        return actAddrHouse;
    }

    /**
     * Sets the value of the actAddrHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrHouse(String value) {
        this.actAddrHouse = value;
    }

    /**
     * Gets the value of the actAddrBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrBuilding() {
        return actAddrBuilding;
    }

    /**
     * Sets the value of the actAddrBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrBuilding(String value) {
        this.actAddrBuilding = value;
    }

    /**
     * Gets the value of the actAddrStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrStructure() {
        return actAddrStructure;
    }

    /**
     * Sets the value of the actAddrStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrStructure(String value) {
        this.actAddrStructure = value;
    }

    /**
     * Gets the value of the actAddrFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActAddrFlat() {
        return actAddrFlat;
    }

    /**
     * Sets the value of the actAddrFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrFlat(String value) {
        this.actAddrFlat = value;
    }

    /**
     * Gets the value of the actAddrMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActAddrMonths() {
        return actAddrMonths;
    }

    /**
     * Sets the value of the actAddrMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActAddrMonths(Integer value) {
        this.actAddrMonths = value;
    }

    /**
     * Gets the value of the regAddrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrCountry() {
        return regAddrCountry;
    }

    /**
     * Sets the value of the regAddrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrCountry(String value) {
        this.regAddrCountry = value;
    }

    /**
     * Gets the value of the regAddrPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrPostal() {
        return regAddrPostal;
    }

    /**
     * Sets the value of the regAddrPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrPostal(String value) {
        this.regAddrPostal = value;
    }

    /**
     * Gets the value of the regAddrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrRegion() {
        return regAddrRegion;
    }

    /**
     * Sets the value of the regAddrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrRegion(String value) {
        this.regAddrRegion = value;
    }

    /**
     * Gets the value of the regAddrDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrDistrictType() {
        return regAddrDistrictType;
    }

    /**
     * Sets the value of the regAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrDistrictType(String value) {
        this.regAddrDistrictType = value;
    }

    /**
     * Gets the value of the regAddrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrDistrict() {
        return regAddrDistrict;
    }

    /**
     * Sets the value of the regAddrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrDistrict(String value) {
        this.regAddrDistrict = value;
    }

    /**
     * Gets the value of the regAddrCityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrCityType() {
        return regAddrCityType;
    }

    /**
     * Sets the value of the regAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrCityType(String value) {
        this.regAddrCityType = value;
    }

    /**
     * Gets the value of the regAddrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrCity() {
        return regAddrCity;
    }

    /**
     * Sets the value of the regAddrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrCity(String value) {
        this.regAddrCity = value;
    }

    /**
     * Gets the value of the regAddrSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrSettlementType() {
        return regAddrSettlementType;
    }

    /**
     * Sets the value of the regAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrSettlementType(String value) {
        this.regAddrSettlementType = value;
    }

    /**
     * Gets the value of the regAddrSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrSettlement() {
        return regAddrSettlement;
    }

    /**
     * Sets the value of the regAddrSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrSettlement(String value) {
        this.regAddrSettlement = value;
    }

    /**
     * Gets the value of the regAddrStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrStreetType() {
        return regAddrStreetType;
    }

    /**
     * Sets the value of the regAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrStreetType(String value) {
        this.regAddrStreetType = value;
    }

    /**
     * Gets the value of the regAddrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrStreet() {
        return regAddrStreet;
    }

    /**
     * Sets the value of the regAddrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrStreet(String value) {
        this.regAddrStreet = value;
    }

    /**
     * Gets the value of the regAddrHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrHouse() {
        return regAddrHouse;
    }

    /**
     * Sets the value of the regAddrHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrHouse(String value) {
        this.regAddrHouse = value;
    }

    /**
     * Gets the value of the regAddrBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrBuilding() {
        return regAddrBuilding;
    }

    /**
     * Sets the value of the regAddrBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrBuilding(String value) {
        this.regAddrBuilding = value;
    }

    /**
     * Gets the value of the regAddrStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrStructure() {
        return regAddrStructure;
    }

    /**
     * Sets the value of the regAddrStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrStructure(String value) {
        this.regAddrStructure = value;
    }

    /**
     * Gets the value of the regAddrFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrFlat() {
        return regAddrFlat;
    }

    /**
     * Sets the value of the regAddrFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrFlat(String value) {
        this.regAddrFlat = value;
    }

    /**
     * Gets the value of the regAddrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddrPhone() {
        return regAddrPhone;
    }

    /**
     * Sets the value of the regAddrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrPhone(String value) {
        this.regAddrPhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone2() {
        return workPhone2;
    }

    /**
     * Sets the value of the workPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone2(String value) {
        this.workPhone2 = value;
    }

    /**
     * Gets the value of the empFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpFullName() {
        return empFullName;
    }

    /**
     * Sets the value of the empFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpFullName(String value) {
        this.empFullName = value;
    }

    /**
     * Gets the value of the empShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpShortName() {
        return empShortName;
    }

    /**
     * Sets the value of the empShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpShortName(String value) {
        this.empShortName = value;
    }

    /**
     * Gets the value of the empFirmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpFirmName() {
        return empFirmName;
    }

    /**
     * Sets the value of the empFirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpFirmName(String value) {
        this.empFirmName = value;
    }

    /**
     * Gets the value of the empEngName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpEngName() {
        return empEngName;
    }

    /**
     * Sets the value of the empEngName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpEngName(String value) {
        this.empEngName = value;
    }

    /**
     * Gets the value of the empOgrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpOgrn() {
        return empOgrn;
    }

    /**
     * Sets the value of the empOgrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpOgrn(String value) {
        this.empOgrn = value;
    }

    /**
     * Gets the value of the empInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpInn() {
        return empInn;
    }

    /**
     * Sets the value of the empInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpInn(String value) {
        this.empInn = value;
    }

    /**
     * Gets the value of the empPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpPhone() {
        return empPhone;
    }

    /**
     * Sets the value of the empPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpPhone(String value) {
        this.empPhone = value;
    }

    /**
     * Gets the value of the empSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpSize() {
        return empSize;
    }

    /**
     * Sets the value of the empSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSize(String value) {
        this.empSize = value;
    }

    /**
     * Gets the value of the empBusinessIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpBusinessIndustry() {
        return empBusinessIndustry;
    }

    /**
     * Sets the value of the empBusinessIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpBusinessIndustry(String value) {
        this.empBusinessIndustry = value;
    }

    /**
     * Gets the value of the empCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpCountry() {
        return empCountry;
    }

    /**
     * Sets the value of the empCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpCountry(String value) {
        this.empCountry = value;
    }

    /**
     * Gets the value of the empPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpPostal() {
        return empPostal;
    }

    /**
     * Sets the value of the empPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpPostal(String value) {
        this.empPostal = value;
    }

    /**
     * Gets the value of the empRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRegion() {
        return empRegion;
    }

    /**
     * Sets the value of the empRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRegion(String value) {
        this.empRegion = value;
    }

    /**
     * Gets the value of the empDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpDistrictType() {
        return empDistrictType;
    }

    /**
     * Sets the value of the empDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpDistrictType(String value) {
        this.empDistrictType = value;
    }

    /**
     * Gets the value of the empDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpDistrict() {
        return empDistrict;
    }

    /**
     * Sets the value of the empDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpDistrict(String value) {
        this.empDistrict = value;
    }

    /**
     * Gets the value of the empCityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpCityType() {
        return empCityType;
    }

    /**
     * Sets the value of the empCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpCityType(String value) {
        this.empCityType = value;
    }

    /**
     * Gets the value of the empCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpCity() {
        return empCity;
    }

    /**
     * Sets the value of the empCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpCity(String value) {
        this.empCity = value;
    }

    /**
     * Gets the value of the empSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpSettlementType() {
        return empSettlementType;
    }

    /**
     * Sets the value of the empSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSettlementType(String value) {
        this.empSettlementType = value;
    }

    /**
     * Gets the value of the empSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpSettlement() {
        return empSettlement;
    }

    /**
     * Sets the value of the empSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSettlement(String value) {
        this.empSettlement = value;
    }

    /**
     * Gets the value of the empStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpStreetType() {
        return empStreetType;
    }

    /**
     * Sets the value of the empStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpStreetType(String value) {
        this.empStreetType = value;
    }

    /**
     * Gets the value of the empStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpStreet() {
        return empStreet;
    }

    /**
     * Sets the value of the empStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpStreet(String value) {
        this.empStreet = value;
    }

    /**
     * Gets the value of the empHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpHouse() {
        return empHouse;
    }

    /**
     * Sets the value of the empHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpHouse(String value) {
        this.empHouse = value;
    }

    /**
     * Gets the value of the empBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpBuilding() {
        return empBuilding;
    }

    /**
     * Sets the value of the empBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpBuilding(String value) {
        this.empBuilding = value;
    }

    /**
     * Gets the value of the empStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpStructure() {
        return empStructure;
    }

    /**
     * Sets the value of the empStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpStructure(String value) {
        this.empStructure = value;
    }

    /**
     * Gets the value of the empApartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpApartment() {
        return empApartment;
    }

    /**
     * Sets the value of the empApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpApartment(String value) {
        this.empApartment = value;
    }

    /**
     * Gets the value of the empRestrFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRestrFullName() {
        return empRestrFullName;
    }

    /**
     * Sets the value of the empRestrFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRestrFullName(String value) {
        this.empRestrFullName = value;
    }

    /**
     * Gets the value of the empRestrShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRestrShortName() {
        return empRestrShortName;
    }

    /**
     * Sets the value of the empRestrShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRestrShortName(String value) {
        this.empRestrShortName = value;
    }

    /**
     * Gets the value of the empRestrFirmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRestrFirmName() {
        return empRestrFirmName;
    }

    /**
     * Sets the value of the empRestrFirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRestrFirmName(String value) {
        this.empRestrFirmName = value;
    }

    /**
     * Gets the value of the empRestrEngName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRestrEngName() {
        return empRestrEngName;
    }

    /**
     * Sets the value of the empRestrEngName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRestrEngName(String value) {
        this.empRestrEngName = value;
    }

    /**
     * Gets the value of the empRestrInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRestrInn() {
        return empRestrInn;
    }

    /**
     * Sets the value of the empRestrInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRestrInn(String value) {
        this.empRestrInn = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the occupationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationType() {
        return occupationType;
    }

    /**
     * Sets the value of the occupationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationType(String value) {
        this.occupationType = value;
    }

    /**
     * Gets the value of the monthlyDocIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthlyDocIncome() {
        return monthlyDocIncome;
    }

    /**
     * Sets the value of the monthlyDocIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthlyDocIncome(Integer value) {
        this.monthlyDocIncome = value;
    }

    /**
     * Gets the value of the incomeProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeProof() {
        return incomeProof;
    }

    /**
     * Sets the value of the incomeProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeProof(String value) {
        this.incomeProof = value;
    }

    /**
     * Gets the value of the monthlyUndocIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthlyUndocIncome() {
        return monthlyUndocIncome;
    }

    /**
     * Sets the value of the monthlyUndocIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthlyUndocIncome(Integer value) {
        this.monthlyUndocIncome = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the workDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDuration() {
        return workDuration;
    }

    /**
     * Sets the value of the workDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDuration(String value) {
        this.workDuration = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the purposeOfFinance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurposeOfFinance() {
        return purposeOfFinance;
    }

    /**
     * Sets the value of the purposeOfFinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurposeOfFinance(Integer value) {
        this.purposeOfFinance = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the tradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeDate() {
        return tradeDate;
    }

    /**
     * Sets the value of the tradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeDate(XMLGregorianCalendar value) {
        this.tradeDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the credDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCredDuration() {
        return credDuration;
    }

    /**
     * Sets the value of the credDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCredDuration(Integer value) {
        this.credDuration = value;
    }

    /**
     * Gets the value of the originalChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalChannel() {
        return originalChannel;
    }

    /**
     * Sets the value of the originalChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalChannel(String value) {
        this.originalChannel = value;
    }

    /**
     * Gets the value of the downPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Sets the value of the downPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPaymentAmount(String value) {
        this.downPaymentAmount = value;
    }

    /**
     * Gets the value of the finalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    /**
     * Sets the value of the finalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalPaymentAmount(String value) {
        this.finalPaymentAmount = value;
    }

    /**
     * Gets the value of the nextPmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPmt() {
        return nextPmt;
    }

    /**
     * Sets the value of the nextPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPmt(String value) {
        this.nextPmt = value;
    }

    /**
     * Gets the value of the pmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtFreq() {
        return pmtFreq;
    }

    /**
     * Sets the value of the pmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtFreq(String value) {
        this.pmtFreq = value;
    }

    /**
     * Gets the value of the collateralExistence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralExistence() {
        return collateralExistence;
    }

    /**
     * Sets the value of the collateralExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralExistence(String value) {
        this.collateralExistence = value;
    }

    /**
     * Gets the value of the collateralValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralValue() {
        return collateralValue;
    }

    /**
     * Sets the value of the collateralValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralValue(String value) {
        this.collateralValue = value;
    }

    /**
     * Gets the value of the purchaseExistence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseExistence() {
        return purchaseExistence;
    }

    /**
     * Sets the value of the purchaseExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseExistence(String value) {
        this.purchaseExistence = value;
    }

    /**
     * Gets the value of the purchaseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseValue() {
        return purchaseValue;
    }

    /**
     * Sets the value of the purchaseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseValue(String value) {
        this.purchaseValue = value;
    }

    /**
     * Gets the value of the purchaseModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseModel() {
        return purchaseModel;
    }

    /**
     * Sets the value of the purchaseModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseModel(String value) {
        this.purchaseModel = value;
    }

    /**
     * Gets the value of the posCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosCode() {
        return posCode;
    }

    /**
     * Sets the value of the posCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosCode(String value) {
        this.posCode = value;
    }

    /**
     * Gets the value of the posPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosPhone() {
        return posPhone;
    }

    /**
     * Sets the value of the posPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosPhone(String value) {
        this.posPhone = value;
    }

    /**
     * Gets the value of the posCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosCountry() {
        return posCountry;
    }

    /**
     * Sets the value of the posCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosCountry(String value) {
        this.posCountry = value;
    }

    /**
     * Gets the value of the posPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosPostal() {
        return posPostal;
    }

    /**
     * Sets the value of the posPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosPostal(String value) {
        this.posPostal = value;
    }

    /**
     * Gets the value of the posDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosDistrict() {
        return posDistrict;
    }

    /**
     * Sets the value of the posDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosDistrict(String value) {
        this.posDistrict = value;
    }

    /**
     * Gets the value of the posRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosRegion() {
        return posRegion;
    }

    /**
     * Sets the value of the posRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosRegion(String value) {
        this.posRegion = value;
    }

    /**
     * Gets the value of the posCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosCity() {
        return posCity;
    }

    /**
     * Sets the value of the posCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosCity(String value) {
        this.posCity = value;
    }

    /**
     * Gets the value of the posSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosSettlement() {
        return posSettlement;
    }

    /**
     * Sets the value of the posSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosSettlement(String value) {
        this.posSettlement = value;
    }

    /**
     * Gets the value of the posStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosStreet() {
        return posStreet;
    }

    /**
     * Sets the value of the posStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosStreet(String value) {
        this.posStreet = value;
    }

    /**
     * Gets the value of the posHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosHouse() {
        return posHouse;
    }

    /**
     * Sets the value of the posHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosHouse(String value) {
        this.posHouse = value;
    }

    /**
     * Gets the value of the posBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosBuilding() {
        return posBuilding;
    }

    /**
     * Sets the value of the posBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosBuilding(String value) {
        this.posBuilding = value;
    }

    /**
     * Gets the value of the posStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosStructure() {
        return posStructure;
    }

    /**
     * Sets the value of the posStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosStructure(String value) {
        this.posStructure = value;
    }

    /**
     * Gets the value of the posApartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosApartment() {
        return posApartment;
    }

    /**
     * Sets the value of the posApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosApartment(String value) {
        this.posApartment = value;
    }

    /**
     * Gets the value of the carRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarRegNo() {
        return carRegNo;
    }

    /**
     * Sets the value of the carRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarRegNo(String value) {
        this.carRegNo = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the newApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewApplicant() {
        return newApplicant;
    }

    /**
     * Sets the value of the newApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewApplicant(String value) {
        this.newApplicant = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExp(Integer value) {
        this.exp = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsent(String value) {
        this.consent = value;
    }

    /**
     * Gets the value of the consentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsentDate() {
        return consentDate;
    }

    /**
     * Sets the value of the consentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsentDate(XMLGregorianCalendar value) {
        this.consentDate = value;
    }

    /**
     * Gets the value of the consentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsentEndDate() {
        return consentEndDate;
    }

    /**
     * Sets the value of the consentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsentEndDate(XMLGregorianCalendar value) {
        this.consentEndDate = value;
    }

    /**
     * Gets the value of the consentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsentPurpose() {
        return consentPurpose;
    }

    /**
     * Sets the value of the consentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsentPurpose(Integer value) {
        this.consentPurpose = value;
    }

    /**
     * Gets the value of the consentPurposeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentPurposeText() {
        return consentPurposeText;
    }

    /**
     * Sets the value of the consentPurposeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentPurposeText(String value) {
        this.consentPurposeText = value;
    }

    /**
     * Gets the value of the consentUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentUser() {
        return consentUser;
    }

    /**
     * Sets the value of the consentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentUser(String value) {
        this.consentUser = value;
    }

    /**
     * Gets the value of the applicationWay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationWay() {
        return applicationWay;
    }

    /**
     * Sets the value of the applicationWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationWay(Integer value) {
        this.applicationWay = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategory(Integer value) {
        this.category = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormat(Integer value) {
        this.format = value;
    }

    /**
     * Gets the value of the fraudStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudStatus() {
        return fraudStatus;
    }

    /**
     * Sets the value of the fraudStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudStatus(Integer value) {
        this.fraudStatus = value;
    }

    /**
     * Gets the value of the fraudStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link FraudStatuses }
     *     
     */
    public FraudStatuses getFraudStatuses() {
        return fraudStatuses;
    }

    /**
     * Sets the value of the fraudStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudStatuses }
     *     
     */
    public void setFraudStatuses(FraudStatuses value) {
        this.fraudStatuses = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = ((byte[]) value);
    }

    /**
     * Gets the value of the photoDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPhotoDate() {
        return photoDate;
    }

    /**
     * Sets the value of the photoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPhotoDate(XMLGregorianCalendar value) {
        this.photoDate = value;
    }

    /**
     * Gets the value of the photoComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoComment() {
        return photoComment;
    }

    /**
     * Sets the value of the photoComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoComment(String value) {
        this.photoComment = value;
    }

    /**
     * Gets the value of the fraudStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudStatusText() {
        return fraudStatusText;
    }

    /**
     * Sets the value of the fraudStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudStatusText(String value) {
        this.fraudStatusText = value;
    }

}
