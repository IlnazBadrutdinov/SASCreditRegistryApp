//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPEN_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="FINAL_PMT_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMT_STRING_84M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUR_TO_BASE_LIMIT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUTSTANDING" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="NEXT_PMT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="INF_CONFIRM_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="FACT_CLOSE_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_5_29" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_30_59" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_60_89" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_30" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TTL_DELQ_90_PLUS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PMT_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDIT_LIMIT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="DELQ_BALANCE" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="MAX_PAYMENT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="MAX_DELQ_BALANCE" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="IS_OWN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CURRENT_DELQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *         &lt;element name="PMT_STRING_START" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="EST_NEXT_PMT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="INTEREST_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="LAST_PAYMENT_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="CURR_BALANCE_AMT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="EST_CURR_BALANCE_AMT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="DISPUTE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLLATERAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTHLY_DETAILS" type="{}monthlyDetailsType" minOccurs="0"/>
 *         &lt;element name="CREDIT_COST_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="BUSINESS_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BANK_GUARANTEES" type="{}bankGuaranteesType" minOccurs="0"/>
 *         &lt;element name="LEGALS" type="{}legalsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanType", propOrder = {
    "account",
    "currency",
    "relationship",
    "opendate",
    "finalpmtdate",
    "type",
    "pmtstring84M",
    "curtobaselimit",
    "status",
    "outstanding",
    "nextpmt",
    "infconfirmdate",
    "factclosedate",
    "ttldelq5",
    "ttldelq529",
    "ttldelq3059",
    "ttldelq6089",
    "ttldelq30",
    "ttldelq90PLUS",
    "pmtfreq",
    "creditlimit",
    "delqbalance",
    "maxpayment",
    "maxdelqbalance",
    "isown",
    "currentdelq",
    "infosources",
    "extension",
    "pmtstringstart",
    "estnextpmt",
    "interestrate",
    "lastpaymentdate",
    "currbalanceamt",
    "estcurrbalanceamt",
    "disputeflag",
    "collateralcode",
    "monthlydetails",
    "creditcostrate",
    "businesscategory",
    "bankguarantees",
    "legals",
/*new*/
    "principaloutstanding",
    "principalpastdue",
    "intoutstanding",
    "intpastdue",
    "otheroutstanding",
    "otherpastdue",
    "ttldelq7",
    "ttldelq829",
    "uuid",
    "payments",
    "amendments"
/*new*/    
})
public class LoanType {

    @XmlElement(name = "ACCOUNT")
    protected String account;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "RELATIONSHIP")
    protected String relationship;
    @XmlElement(name = "OPEN_DATE")
    protected String opendate;
    @XmlElement(name = "FINAL_PMT_DATE")
    protected String finalpmtdate;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "PMT_STRING_84M")
    protected String pmtstring84M;
    @XmlElement(name = "CUR_TO_BASE_LIMIT")
    protected BigDecimal curtobaselimit;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "OUTSTANDING")
    protected BigDecimal outstanding;
    @XmlElement(name = "NEXT_PMT")
    protected BigDecimal nextpmt;
    @XmlElement(name = "INF_CONFIRM_DATE")
    protected String infconfirmdate;
    @XmlElement(name = "FACT_CLOSE_DATE")
    protected String factclosedate;
    @XmlElement(name = "TTL_DELQ_5")
    protected Integer ttldelq5;
    @XmlElement(name = "TTL_DELQ_5_29")
    protected Integer ttldelq529;
    @XmlElement(name = "TTL_DELQ_30_59")
    protected Integer ttldelq3059;
    @XmlElement(name = "TTL_DELQ_60_89")
    protected Integer ttldelq6089;
    @XmlElement(name = "TTL_DELQ_30")
    protected Integer ttldelq30;
    @XmlElement(name = "TTL_DELQ_90_PLUS")
    protected Integer ttldelq90PLUS;
    @XmlElement(name = "PMT_FREQ")
    protected String pmtfreq;
    @XmlElement(name = "CREDIT_LIMIT")
    protected BigDecimal creditlimit;
    @XmlElement(name = "DELQ_BALANCE")
    protected BigDecimal delqbalance;
    @XmlElement(name = "MAX_PAYMENT")
    protected BigDecimal maxpayment;
    @XmlElement(name = "MAX_DELQ_BALANCE")
    protected BigDecimal maxdelqbalance;
    @XmlElement(name = "IS_OWN")
    protected Integer isown;
   /* @XmlElementRef(name = "CURRENT_DELQ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentdelq;*/
    @XmlElement(name = "CURRENT_DELQ")
    protected String currentdelq;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    @XmlElement(name = "PMT_STRING_START")
    protected String pmtstringstart;
    @XmlElement(name = "EST_NEXT_PMT")
    protected BigDecimal estnextpmt;
    @XmlElement(name = "INTEREST_RATE")
    protected Float interestrate;
    @XmlElement(name = "LAST_PAYMENT_DATE")
    protected String lastpaymentdate;
    @XmlElement(name = "CURR_BALANCE_AMT")
    protected BigDecimal currbalanceamt;
    @XmlElement(name = "EST_CURR_BALANCE_AMT")
    protected BigDecimal estcurrbalanceamt;
    @XmlElement(name = "DISPUTE_FLAG")
    protected String disputeflag;
    @XmlElement(name = "COLLATERAL_CODE")
    protected String collateralcode;
    @XmlElement(name = "MONTHLY_DETAILS")
    protected MonthlyDetailsType monthlydetails;
    @XmlElement(name = "CREDIT_COST_RATE")
    protected Float creditcostrate;
    @XmlElement(name = "BUSINESS_CATEGORY")
    protected Integer businesscategory;
    @XmlElement(name = "BANK_GUARANTEES")
    protected BankGuaranteesType bankguarantees;
    @XmlElement(name = "LEGALS")
    protected LegalsType legals;
    
    /*new*/
    @XmlElement(name = "PRINCIPAL_OUTSTANDING")
    protected BigDecimal principaloutstanding;
    @XmlElement(name = "PRINCIPAL_PAST_DUE")
    protected BigDecimal principalpastdue;
    @XmlElement(name = "INT_OUTSTANDING")
    protected BigDecimal intoutstanding;
    @XmlElement(name = "INT_PAST_DUE")
    protected BigDecimal intpastdue;
    @XmlElement(name = "OTHER_OUTSTANDING")
    protected BigDecimal otheroutstanding;
    @XmlElement(name = "OTHER_PAST_DUE")
    protected BigDecimal otherpastdue;
    @XmlElement(name = "TTL_DELQ_7")
    protected Integer ttldelq7;
    @XmlElement(name = "TTL_DELQ_8_29")
    protected Integer ttldelq829;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "PAYMENTS")
    protected PaymentsType payments;
    @XmlElement(name = "AMENDMENTS")
    protected AmendmentsType amendments;
    /*new*/   
    
    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNT() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNT(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
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
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATIONSHIP() {
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
    public void setRELATIONSHIP(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the opendate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPENDATE() {
        return opendate;
    }

    /**
     * Sets the value of the opendate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPENDATE(String value) {
        this.opendate = value;
    }

    /**
     * Gets the value of the finalpmtdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINALPMTDATE() {
        return finalpmtdate;
    }

    /**
     * Sets the value of the finalpmtdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINALPMTDATE(String value) {
        this.finalpmtdate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the pmtstring84M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMTSTRING84M() {
        return pmtstring84M;
    }

    /**
     * Sets the value of the pmtstring84M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMTSTRING84M(String value) {
        this.pmtstring84M = value;
    }

    /**
     * Gets the value of the curtobaselimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURTOBASELIMIT() {
        return curtobaselimit;
    }

    /**
     * Sets the value of the curtobaselimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURTOBASELIMIT(BigDecimal value) {
        this.curtobaselimit = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the outstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOUTSTANDING() {
        return outstanding;
    }

    /**
     * Sets the value of the outstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOUTSTANDING(BigDecimal value) {
        this.outstanding = value;
    }

    /**
     * Gets the value of the nextpmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEXTPMT() {
        return nextpmt;
    }

    /**
     * Sets the value of the nextpmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEXTPMT(BigDecimal value) {
        this.nextpmt = value;
    }

    /**
     * Gets the value of the infconfirmdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFCONFIRMDATE() {
        return infconfirmdate;
    }

    /**
     * Sets the value of the infconfirmdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFCONFIRMDATE(String value) {
        this.infconfirmdate = value;
    }

    /**
     * Gets the value of the factclosedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTCLOSEDATE() {
        return factclosedate;
    }

    /**
     * Sets the value of the factclosedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTCLOSEDATE(String value) {
        this.factclosedate = value;
    }

    /**
     * Gets the value of the ttldelq5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ5() {
        return ttldelq5;
    }

    /**
     * Sets the value of the ttldelq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ5(Integer value) {
        this.ttldelq5 = value;
    }

    /**
     * Gets the value of the ttldelq529 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ529() {
        return ttldelq529;
    }

    /**
     * Sets the value of the ttldelq529 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ529(Integer value) {
        this.ttldelq529 = value;
    }

    /**
     * Gets the value of the ttldelq3059 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ3059() {
        return ttldelq3059;
    }

    /**
     * Sets the value of the ttldelq3059 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ3059(Integer value) {
        this.ttldelq3059 = value;
    }

    /**
     * Gets the value of the ttldelq6089 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ6089() {
        return ttldelq6089;
    }

    /**
     * Sets the value of the ttldelq6089 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ6089(Integer value) {
        this.ttldelq6089 = value;
    }

    /**
     * Gets the value of the ttldelq30 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ30() {
        return ttldelq30;
    }

    /**
     * Sets the value of the ttldelq30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ30(Integer value) {
        this.ttldelq30 = value;
    }

    /**
     * Gets the value of the ttldelq90PLUS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTTLDELQ90PLUS() {
        return ttldelq90PLUS;
    }

    /**
     * Sets the value of the ttldelq90PLUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTTLDELQ90PLUS(Integer value) {
        this.ttldelq90PLUS = value;
    }

    /**
     * Gets the value of the pmtfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMTFREQ() {
        return pmtfreq;
    }

    /**
     * Sets the value of the pmtfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMTFREQ(String value) {
        this.pmtfreq = value;
    }

    /**
     * Gets the value of the creditlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCREDITLIMIT() {
        return creditlimit;
    }

    /**
     * Sets the value of the creditlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCREDITLIMIT(BigDecimal value) {
        this.creditlimit = value;
    }

    /**
     * Gets the value of the delqbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDELQBALANCE() {
        return delqbalance;
    }

    /**
     * Sets the value of the delqbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDELQBALANCE(BigDecimal value) {
        this.delqbalance = value;
    }

    /**
     * Gets the value of the maxpayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXPAYMENT() {
        return maxpayment;
    }

    /**
     * Sets the value of the maxpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXPAYMENT(BigDecimal value) {
        this.maxpayment = value;
    }

    /**
     * Gets the value of the maxdelqbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXDELQBALANCE() {
        return maxdelqbalance;
    }

    /**
     * Sets the value of the maxdelqbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXDELQBALANCE(BigDecimal value) {
        this.maxdelqbalance = value;
    }

    /**
     * Gets the value of the isown property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getISOWN() {
        return isown;
    }

    /**
     * Sets the value of the isown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setISOWN(Integer value) {
        this.isown = value;
    }

    /**
     * Gets the value of the currentdelq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
  /*  public JAXBElement<String> getCURRENTDELQ() {
		System.out.println("currentdelq"+currentdelq.getValue());
        return currentdelq;
        

    }*/

      public String getCURRENTDELQ() {
  		System.out.println("currentdelq"+currentdelq);
          return currentdelq;        
      }
      
      public void setCURRENTDELQ(String value) {
          this.currentdelq =  value;
          
      }
    /**
     * Sets the value of the currentdelq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    /*-public void setCURRENTDELQ(JAXBElement<String> value) {
        this.currentdelq = ((JAXBElement<String> ) value);
        
    }*/

    /**
     * Gets the value of the infosources property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSourcesType }
     *     
     */
    public InfoSourcesType getINFOSOURCES() {
        return infosources;
    }

    /**
     * Sets the value of the infosources property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSourcesType }
     *     
     */
    public void setINFOSOURCES(InfoSourcesType value) {
        this.infosources = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEXTENSION(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the pmtstringstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMTSTRINGSTART() {
        return pmtstringstart;
    }

    /**
     * Sets the value of the pmtstringstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMTSTRINGSTART(String value) {
        this.pmtstringstart = value;
    }

    /**
     * Gets the value of the estnextpmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESTNEXTPMT() {
        return estnextpmt;
    }

    /**
     * Sets the value of the estnextpmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESTNEXTPMT(BigDecimal value) {
        this.estnextpmt = value;
    }

    /**
     * Gets the value of the interestrate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getINTERESTRATE() {
        return interestrate;
    }

    /**
     * Sets the value of the interestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setINTERESTRATE(Float value) {
        this.interestrate = value;
    }

    /**
     * Gets the value of the lastpaymentdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTPAYMENTDATE() {
        return lastpaymentdate;
    }

    /**
     * Sets the value of the lastpaymentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTPAYMENTDATE(String value) {
        this.lastpaymentdate = value;
    }

    /**
     * Gets the value of the currbalanceamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRBALANCEAMT() {
        return currbalanceamt;
    }

    /**
     * Sets the value of the currbalanceamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRBALANCEAMT(BigDecimal value) {
        this.currbalanceamt = value;
    }

    /**
     * Gets the value of the estcurrbalanceamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESTCURRBALANCEAMT() {
        return estcurrbalanceamt;
    }

    /**
     * Sets the value of the estcurrbalanceamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESTCURRBALANCEAMT(BigDecimal value) {
        this.estcurrbalanceamt = value;
    }

    /**
     * Gets the value of the disputeflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPUTEFLAG() {
        return disputeflag;
    }

    /**
     * Sets the value of the disputeflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPUTEFLAG(String value) {
        this.disputeflag = value;
    }

    /**
     * Gets the value of the collateralcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLATERALCODE() {
        return collateralcode;
    }

    /**
     * Sets the value of the collateralcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLATERALCODE(String value) {
        this.collateralcode = value;
    }

    /**
     * Gets the value of the monthlydetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyDetailsType }
     *     
     */
    public MonthlyDetailsType getMONTHLYDETAILS() {
        return monthlydetails;
    }

    /**
     * Sets the value of the monthlydetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyDetailsType }
     *     
     */
    public void setMONTHLYDETAILS(MonthlyDetailsType value) {
        this.monthlydetails = value;
    }

    /**
     * Gets the value of the creditcostrate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCREDITCOSTRATE() {
        return creditcostrate;
    }

    /**
     * Sets the value of the creditcostrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCREDITCOSTRATE(Float value) {
        this.creditcostrate = value;
    }

    /**
     * Gets the value of the businesscategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBUSINESSCATEGORY() {
        return businesscategory;
    }

    /**
     * Sets the value of the businesscategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBUSINESSCATEGORY(Integer value) {
        this.businesscategory = value;
    }

    /**
     * Gets the value of the bankguarantees property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteesType }
     *     
     */
    public BankGuaranteesType getBANKGUARANTEES() {
        return bankguarantees;
    }

    /**
     * Sets the value of the bankguarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteesType }
     *     
     */
    public void setBANKGUARANTEES(BankGuaranteesType value) {
        this.bankguarantees = value;
    }

    /**
     * Gets the value of the legals property.
     * 
     * @return
     *     possible object is
     *     {@link LegalsType }
     *     
     */
    public LegalsType getLEGALS() {
        return legals;
    }

    /**
     * Sets the value of the legals property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalsType }
     *     
     */
    public void setLEGALS(LegalsType value) {
        this.legals = value;
    }

    
    
    /*new*/
    public BigDecimal getPRINCIPALOUTSTANDING() {
        return principaloutstanding;
    }    
    public void setPRINCIPALOUTSTANDING(BigDecimal value) {
        this.principaloutstanding = value;
    }
    
    
    public BigDecimal getPRINCIPALPASTDUE() {
        return principalpastdue;
    }    
    public void setPRINCIPALPASTDUE(BigDecimal value) {
        this.principalpastdue = value;
    }
    
    
    public BigDecimal getINTOUTSTANDING() {
        return intoutstanding;
    }    
    public void setINTOUTSTANDING(BigDecimal value) {
        this.intoutstanding = value;
    }
    
    
    public BigDecimal getINTPASTDUE() {
        return intpastdue;
    }    
    public void setINTPASTDUE(BigDecimal value) {
        this.intpastdue = value;
    }
    
    
    public BigDecimal getOTHEROUTSTANDING() {
        return otheroutstanding;
    }    
    public void setOTHEROUTSTANDING(BigDecimal value) {
        this.otheroutstanding = value;
    }
    
    
    public BigDecimal getOTHERPASTDUE() {
        return otherpastdue;
    }    
    public void setOTHERPASTDUE(BigDecimal value) {
        this.otherpastdue = value;
    }
    
    
    public Integer getTTLDELQ7() {
        return ttldelq7;
    }    
    public void setTTL_DELQ7(Integer value) {
        this.ttldelq7 = value;
    }
    
    
    public Integer getTTLDELQ829() {
        return ttldelq829;
    }    
    public void setTTL_DELQ829(Integer value) {
        this.ttldelq829 = value;
    }
    
    public String getUUID() {
        return uuid;
    }    
    public void setUUID(String value) {
        this.uuid = value;
    }
    
    
    public PaymentsType getPAYMENTS() {
    	return payments;
    }
    public void setPAYMENTS(PaymentsType value) {
    	this.payments = value;
    }

    public AmendmentsType getAMENDMENTS() {
    	return amendments;
    }
    public void setAMENDMENTS(AmendmentsType value) {
    	this.amendments = value;
    }
    /*new*/
    
 
}