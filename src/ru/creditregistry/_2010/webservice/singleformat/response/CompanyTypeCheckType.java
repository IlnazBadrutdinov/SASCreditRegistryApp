//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyTypeCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyTypeCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REG_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPANY_AGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="COMPANY_FULL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPANY_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLOYEES_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_SECOND_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKVED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OWNERSHIP_CODE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PHONE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHONE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHONE_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEARCH_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyTypeCheckType", propOrder = {
    "regaddress",
    "companyage",
    "companyfullname",
    "companyshortname",
    "egrn",
    "employeesnumber",
    "inn",
    "ceofirstname",
    "ceosecondname",
    "okato",
    "okpo",
    "okved",
    "ownershipcode",
    "phone1",
    "phone2",
    "phone3",
    "position",
    "searchtype",
    "ceolastname",
    "extension",
    "infosources"
})
public class CompanyTypeCheckType {

    @XmlElement(name = "REG_ADDRESS")
    protected String regaddress;
    @XmlElement(name = "COMPANY_AGE")
    protected Integer companyage;
    @XmlElement(name = "COMPANY_FULL_NAME")
    protected String companyfullname;
    @XmlElement(name = "COMPANY_SHORT_NAME")
    protected String companyshortname;
    @XmlElement(name = "EGRN")
    protected String egrn;
    @XmlElement(name = "EMPLOYEES_NUMBER")
    protected Integer employeesnumber;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "CEO_FIRST_NAME")
    protected String ceofirstname;
    @XmlElement(name = "CEO_SECOND_NAME")
    protected String ceosecondname;
    @XmlElement(name = "OKATO")
    protected String okato;
    @XmlElement(name = "OKPO")
    protected String okpo;
    @XmlElement(name = "OKVED")
    protected String okved;
    @XmlElement(name = "OWNERSHIP_CODE")
    protected Integer ownershipcode;
    @XmlElement(name = "PHONE_1")
    protected String phone1;
    @XmlElement(name = "PHONE_2")
    protected String phone2;
    @XmlElement(name = "PHONE_3")
    protected String phone3;
    @XmlElement(name = "POSITION")
    protected String position;
    @XmlElement(name = "SEARCH_TYPE")
    protected String searchtype;
    @XmlElement(name = "CEO_LAST_NAME")
    protected String ceolastname;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;

    /**
     * Gets the value of the regaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGADDRESS() {
        return regaddress;
    }

    /**
     * Sets the value of the regaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGADDRESS(String value) {
        this.regaddress = value;
    }

    /**
     * Gets the value of the companyage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOMPANYAGE() {
        return companyage;
    }

    /**
     * Sets the value of the companyage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOMPANYAGE(Integer value) {
        this.companyage = value;
    }

    /**
     * Gets the value of the companyfullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYFULLNAME() {
        return companyfullname;
    }

    /**
     * Sets the value of the companyfullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYFULLNAME(String value) {
        this.companyfullname = value;
    }

    /**
     * Gets the value of the companyshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYSHORTNAME() {
        return companyshortname;
    }

    /**
     * Sets the value of the companyshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYSHORTNAME(String value) {
        this.companyshortname = value;
    }

    /**
     * Gets the value of the egrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGRN() {
        return egrn;
    }

    /**
     * Sets the value of the egrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGRN(String value) {
        this.egrn = value;
    }

    /**
     * Gets the value of the employeesnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEMPLOYEESNUMBER() {
        return employeesnumber;
    }

    /**
     * Sets the value of the employeesnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEMPLOYEESNUMBER(Integer value) {
        this.employeesnumber = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
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
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ceofirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOFIRSTNAME() {
        return ceofirstname;
    }

    /**
     * Sets the value of the ceofirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOFIRSTNAME(String value) {
        this.ceofirstname = value;
    }

    /**
     * Gets the value of the ceosecondname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOSECONDNAME() {
        return ceosecondname;
    }

    /**
     * Sets the value of the ceosecondname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOSECONDNAME(String value) {
        this.ceosecondname = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATO(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKPO(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKVED() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKVED(String value) {
        this.okved = value;
    }

    /**
     * Gets the value of the ownershipcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOWNERSHIPCODE() {
        return ownershipcode;
    }

    /**
     * Sets the value of the ownershipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOWNERSHIPCODE(Integer value) {
        this.ownershipcode = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the phone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE3() {
        return phone3;
    }

    /**
     * Sets the value of the phone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE3(String value) {
        this.phone3 = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION() {
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
    public void setPOSITION(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the searchtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEARCHTYPE() {
        return searchtype;
    }

    /**
     * Sets the value of the searchtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEARCHTYPE(String value) {
        this.searchtype = value;
    }

    /**
     * Gets the value of the ceolastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOLASTNAME() {
        return ceolastname;
    }

    /**
     * Sets the value of the ceolastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOLASTNAME(String value) {
        this.ceolastname = value;
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

}
