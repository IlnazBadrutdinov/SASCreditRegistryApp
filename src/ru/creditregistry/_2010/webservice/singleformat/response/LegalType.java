//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAIM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COURT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JUDGMENT_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="PLAINTIFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESOLUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SATISFIED_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *         &lt;element name="CREDIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESOLUTION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESOLUTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RECOVERY_AMOUNT" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="RECOVERY_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIRST_UPDATE" type="{}dateTimeType" minOccurs="0"/>
 *         &lt;element name="LAST_UPDATE" type="{}dateTimeType" minOccurs="0"/>
 *         &lt;element name="REPORT_DATE" type="{}dateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalType", propOrder = {
    "claimnumber",
    "courtname",
    "judgmentdate",
    "plaintiff",
    "resolution",
    "satisfieddate",
    "infosources",
    "extension",
    "creditid",
    "resolutionnumber",
    "resolutiontype",
    "recoveryamount",
    "recoverycurrency",
    "firstupdate",
    "lastupdate",
    "reportdate"
})
public class LegalType {

    @XmlElement(name = "CLAIM_NUMBER")
    protected String claimnumber;
    @XmlElement(name = "COURT_NAME")
    protected String courtname;
    @XmlElement(name = "JUDGMENT_DATE")
    protected String judgmentdate;
    @XmlElement(name = "PLAINTIFF")
    protected String plaintiff;
    @XmlElement(name = "RESOLUTION")
    protected String resolution;
    @XmlElement(name = "SATISFIED_DATE")
    protected String satisfieddate;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    @XmlElement(name = "CREDIT_ID")
    protected String creditid;
    @XmlElement(name = "RESOLUTION_NUMBER")
    protected String resolutionnumber;
    @XmlElement(name = "RESOLUTION_TYPE")
    protected Integer resolutiontype;
    @XmlElement(name = "RECOVERY_AMOUNT")
    protected BigDecimal recoveryamount;
    @XmlElement(name = "RECOVERY_CURRENCY")
    protected String recoverycurrency;
    @XmlElement(name = "FIRST_UPDATE")
    protected String firstupdate;
    @XmlElement(name = "LAST_UPDATE")
    protected String lastupdate;
    @XmlElement(name = "REPORT_DATE")
    protected String reportdate;

    /**
     * Gets the value of the claimnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAIMNUMBER() {
        return claimnumber;
    }

    /**
     * Sets the value of the claimnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAIMNUMBER(String value) {
        this.claimnumber = value;
    }

    /**
     * Gets the value of the courtname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOURTNAME() {
        return courtname;
    }

    /**
     * Sets the value of the courtname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOURTNAME(String value) {
        this.courtname = value;
    }

    /**
     * Gets the value of the judgmentdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUDGMENTDATE() {
        return judgmentdate;
    }

    /**
     * Sets the value of the judgmentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUDGMENTDATE(String value) {
        this.judgmentdate = value;
    }

    /**
     * Gets the value of the plaintiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLAINTIFF() {
        return plaintiff;
    }

    /**
     * Sets the value of the plaintiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLAINTIFF(String value) {
        this.plaintiff = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESOLUTION() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESOLUTION(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the satisfieddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATISFIEDDATE() {
        return satisfieddate;
    }

    /**
     * Sets the value of the satisfieddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATISFIEDDATE(String value) {
        this.satisfieddate = value;
    }

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
     * Gets the value of the creditid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITID() {
        return creditid;
    }

    /**
     * Sets the value of the creditid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITID(String value) {
        this.creditid = value;
    }

    /**
     * Gets the value of the resolutionnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESOLUTIONNUMBER() {
        return resolutionnumber;
    }

    /**
     * Sets the value of the resolutionnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESOLUTIONNUMBER(String value) {
        this.resolutionnumber = value;
    }

    /**
     * Gets the value of the resolutiontype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRESOLUTIONTYPE() {
        return resolutiontype;
    }

    /**
     * Sets the value of the resolutiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRESOLUTIONTYPE(Integer value) {
        this.resolutiontype = value;
    }

    /**
     * Gets the value of the recoveryamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRECOVERYAMOUNT() {
        return recoveryamount;
    }

    /**
     * Sets the value of the recoveryamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRECOVERYAMOUNT(BigDecimal value) {
        this.recoveryamount = value;
    }

    /**
     * Gets the value of the recoverycurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOVERYCURRENCY() {
        return recoverycurrency;
    }

    /**
     * Sets the value of the recoverycurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOVERYCURRENCY(String value) {
        this.recoverycurrency = value;
    }

    /**
     * Gets the value of the firstupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTUPDATE() {
        return firstupdate;
    }

    /**
     * Sets the value of the firstupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTUPDATE(String value) {
        this.firstupdate = value;
    }

    /**
     * Gets the value of the lastupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTUPDATE() {
        return lastupdate;
    }

    /**
     * Sets the value of the lastupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTUPDATE(String value) {
        this.lastupdate = value;
    }

    /**
     * Gets the value of the reportdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTDATE() {
        return reportdate;
    }

    /**
     * Sets the value of the reportdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTDATE(String value) {
        this.reportdate = value;
    }

}
