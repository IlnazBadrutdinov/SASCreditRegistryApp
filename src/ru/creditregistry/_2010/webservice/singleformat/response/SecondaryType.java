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
 * <p>Java class for secondaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESPONSE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ERROR_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "secondaryType", propOrder = {
    "responsestatus",
    "errortext",
    "infosources",
    "extension"
})
public class SecondaryType {

    @XmlElement(name = "RESPONSE_STATUS", required = true)
    protected String responsestatus;
    @XmlElement(name = "ERROR_TEXT")
    protected String errortext;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;

    /**
     * Gets the value of the responsestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSESTATUS() {
        return responsestatus;
    }

    /**
     * Sets the value of the responsestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSESTATUS(String value) {
        this.responsestatus = value;
    }

    /**
     * Gets the value of the errortext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORTEXT() {
        return errortext;
    }

    /**
     * Sets the value of the errortext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORTEXT(String value) {
        this.errortext = value;
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

}
