//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Руководитель российской компании
 * 
 * <p>Java class for sparkLeaderRUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkLeaderRUS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LegalCapacityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ManagementCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ManagementCompanyINN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkLeaderRUS")
public class SparkLeaderRUS {

    @XmlAttribute(name = "ActualDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualDate;
    @XmlAttribute(name = "FIO")
    protected String fio;
    @XmlAttribute(name = "Position")
    protected String position;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "LegalCapacityEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar legalCapacityEndDate;
    @XmlAttribute(name = "ManagementCompany")
    protected String managementCompany;
    @XmlAttribute(name = "ManagementCompanyINN")
    protected String managementCompanyINN;

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDate(XMLGregorianCalendar value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
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
     * Gets the value of the legalCapacityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLegalCapacityEndDate() {
        return legalCapacityEndDate;
    }

    /**
     * Sets the value of the legalCapacityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLegalCapacityEndDate(XMLGregorianCalendar value) {
        this.legalCapacityEndDate = value;
    }

    /**
     * Gets the value of the managementCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementCompany() {
        return managementCompany;
    }

    /**
     * Sets the value of the managementCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementCompany(String value) {
        this.managementCompany = value;
    }

    /**
     * Gets the value of the managementCompanyINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementCompanyINN() {
        return managementCompanyINN;
    }

    /**
     * Sets the value of the managementCompanyINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementCompanyINN(String value) {
        this.managementCompanyINN = value;
    }

}
