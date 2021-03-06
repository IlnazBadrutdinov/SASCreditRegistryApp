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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Санкция
 * 
 * <p>Java class for sparkSanction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkSanction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanctionProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InclusionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnotherUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SanctionProgramNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkSanction", propOrder = {
    "sanctionProgram",
    "inclusionReason",
    "startDate",
    "endDate",
    "uid",
    "anotherUID",
    "sanctionProgramNumber"
})
@XmlSeeAlso({
    ru.creditregistry._2010.webservice.singleformat.response.SparkResponseType.Data.Report.SanctionLists.List.Sanction.class
})
public class SparkSanction {

    @XmlElement(name = "SanctionProgram")
    protected String sanctionProgram;
    @XmlElement(name = "InclusionReason")
    protected String inclusionReason;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "AnotherUID")
    protected String anotherUID;
    @XmlElement(name = "SanctionProgramNumber")
    protected String sanctionProgramNumber;

    /**
     * Gets the value of the sanctionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionProgram() {
        return sanctionProgram;
    }

    /**
     * Sets the value of the sanctionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionProgram(String value) {
        this.sanctionProgram = value;
    }

    /**
     * Gets the value of the inclusionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionReason() {
        return inclusionReason;
    }

    /**
     * Sets the value of the inclusionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionReason(String value) {
        this.inclusionReason = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the anotherUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotherUID() {
        return anotherUID;
    }

    /**
     * Sets the value of the anotherUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotherUID(String value) {
        this.anotherUID = value;
    }

    /**
     * Gets the value of the sanctionProgramNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionProgramNumber() {
        return sanctionProgramNumber;
    }

    /**
     * Sets the value of the sanctionProgramNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionProgramNumber(String value) {
        this.sanctionProgramNumber = value;
    }

}
