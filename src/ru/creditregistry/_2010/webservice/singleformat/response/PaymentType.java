package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentType", propOrder = {
    "paymentdate",
    "paymentamount",
    "paymentamountexc30dpastdue",
    "paymentamount12mexc30dpastdue",
    "paymentvolume",
    "currency",
    "infosources",
    "extension"
})

public class PaymentType {

    @XmlElement(name = "PAYMENT_DATE")
    protected String paymentdate;
    @XmlElement(name = "PAYMENT_AMOUNT")
    protected BigDecimal paymentamount;
    @XmlElement(name = "PAYMENT_AMOUNT_EXC30D_PAST_DUE")
    protected BigDecimal paymentamountexc30dpastdue;
    @XmlElement(name = "PAYMENT_AMOUNT_12M_EXC30D_PAST_DUE")
    protected BigDecimal paymentamount12mexc30dpastdue;
    @XmlElement(name = "PAYMENT_VOLUME")
    protected BigDecimal paymentvolume;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;

    
    
    public String getPAYMENTDATE() {
        return paymentdate;
    }
    public void setPAYMENTDATE(String value) {
        this.paymentdate = value;
    }
     
    public BigDecimal getPAYMENTAMOUNT() {
        return paymentamount;
    }
    public void setPAYMENTAMOUNT(BigDecimal value) {
        this.paymentamount = value;
    }
    
    public BigDecimal getPAYMENTAMOUNTEXC30DPASTDUE() {
        return paymentamountexc30dpastdue;
    }
    public void setPAYMENTAMOUNTEXC30DPASTDUE(BigDecimal value) {
        this.paymentamountexc30dpastdue = value;
    }
    
    
    public BigDecimal getPAYMENTAMOUNT12MEXC30DPASTDUE() {
        return paymentamount12mexc30dpastdue;
    }
    public void setPAYMENTAMOUNT12MEXC30DPASTDUE(BigDecimal value) {
        this.paymentamount12mexc30dpastdue = value;
    }
    
    
    public BigDecimal getPAYMENTVOLUME() {
        return paymentvolume;
    }
    public void setPAYMENTVOLUME(BigDecimal value) {
        this.paymentvolume = value;
    }
    
    
    public String getCURRENCY() {
        return currency;
    }
    public void setCURRENCY(String value) {
        this.currency = value;
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

