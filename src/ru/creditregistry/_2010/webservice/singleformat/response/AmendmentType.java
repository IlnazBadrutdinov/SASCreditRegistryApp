package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amendmentType", propOrder = {
    "amendmenttype",
    "lastupdatedate",
    "creditlimit",
    "nextpmt",
    "currency",
    "closeddate",
    "paymentduedate",
    "interestpaymentduedate",
    "creditcostrate",
    "infconfirmdate",
    "requestreason",
    "startdate",
    "planenddate",
    "factenddate",
    "periodtype",
    "reasonfortermination",
    "infosources",
    "extension"
    
})

public class AmendmentType {


    @XmlElement(name = "AMEND_TYPE")
    protected BigDecimal amendmenttype;
    @XmlElement(name = "LAST_UPDATED_DATE")
    protected String lastupdatedate;
    @XmlElement(name = "CREDIT_LIMIT")
    protected BigDecimal creditlimit;
    @XmlElement(name = "NEXT_PMT")
    protected BigDecimal nextpmt;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "CLOSED_DATE")
    protected String closeddate;
    @XmlElement(name = "PAYMENT_DUE_DATE")
    protected String paymentduedate;
    @XmlElement(name = "INTEREST_PAYMENT_DUE_DATE")
    protected String interestpaymentduedate;
    @XmlElement(name = "CREDIT_COST_RATE")
    protected BigDecimal creditcostrate;
    @XmlElement(name = "INF_CONFIRM_DATE")
    protected String infconfirmdate;
    @XmlElement(name = "REQUEST_REASON")
    protected BigDecimal requestreason;
    @XmlElement(name = "START_DATE")
    protected String startdate;
    @XmlElement(name = "PLAN_END_DATE")
    protected String planenddate;
    @XmlElement(name = "FACT_END_DATE")
    protected String factenddate;
    @XmlElement(name = "PERIOD_TYPE")
    protected BigDecimal periodtype;
    @XmlElement(name = "REASON_FOR_TERMINATION")
    protected BigDecimal reasonfortermination;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    
    
    public BigDecimal AMENDTYPE() {
        return amendmenttype;
    }
    public void setAMENDTYPE(BigDecimal value) {
        this.amendmenttype = value;
    }
     
    public String getLASTUPDATEDDATE() {
        return lastupdatedate;
    }
    public void setLASTUPDATEDDATE(String value) {
        this.lastupdatedate = value;
    }
    
    public BigDecimal getCREDITLIMIT() {
        return creditlimit;
    }
    public void setCREDITLIMIT(BigDecimal value) {
        this.creditlimit = value;
    }
    
    
    public BigDecimal getNEXTPMT() {
        return nextpmt;
    }
    public void setNEXTPMT(BigDecimal value) {
        this.nextpmt = value;
    }
    
    public String getCURRENCY() {
        return currency;
    }
    public void setCURRENCY(String value) {
        this.currency = value;
    }
    
    public String getCLOSEDDATE() {
        return closeddate;
    }
    public void setCLOSEDDATE(String value) {
        this.closeddate = value;
    }
        
    public String getPAYMENTDUEDATE() {
        return paymentduedate;
    }
    public void setPAYMENTDUEDATE(String value) {
        this.paymentduedate = value;
    }
    
    public String getINTERESTPAYMENTDUEDATE() {
        return interestpaymentduedate;
    }
    public void setINTERESTPAYMENTDUEDATE(String value) {
        this.interestpaymentduedate = value;  
    }    
    
    public BigDecimal getCREDITCOSTRATE() {
        return creditcostrate;
    }
    public void setCREDITCOSTRATE(BigDecimal value) {
        this.creditcostrate = value;
    }
    
    public String getINFCONFIRMDATE() {
        return infconfirmdate;
    }
    public void setINFCONFIRMDATE(String value) {
        this.currency = infconfirmdate;
    }
    
    public BigDecimal getREQUESTREASON() {
        return requestreason;
    }
    public void setREQUESTREASON(BigDecimal value) {
        this.requestreason = value;
    }
    
    public String getSTARTDATE() {
        return startdate;
    }
    public void setSTARTDATE(String value) {
        this.startdate = value;
    }
    
    public String getPLANENDDATE() {
        return planenddate;
    }
    public void setPLANENDDATE(String value) {
        this.planenddate = value;
    }
    
    public String getFACTENDDATE() {
        return factenddate;
    }
    public void setFACTENDDATE(String value) {
        this.factenddate = value;
    }
    
    public BigDecimal getPERIODTYPE() {
        return periodtype;
    }
    public void setPERIODTYPE(BigDecimal value) {
        this.periodtype = value;
    }
    
    public BigDecimal getREASONFORTERMINATION() {
        return reasonfortermination;
    }
    public void setREASONFORTERMINATION(BigDecimal value) {
        this.reasonfortermination = value;
    }
    
    public InfoSourcesType getINFOSOURCES() {
        return infosources;
    }
    public void setINFOSOURCES(InfoSourcesType value) {
        this.infosources = value;
    }    
    
    public ExtensionType getEXTENSION() {
        return extension;
    }
    public void setEXTENSION(ExtensionType value) {
        this.extension = value;
    }
    
}
