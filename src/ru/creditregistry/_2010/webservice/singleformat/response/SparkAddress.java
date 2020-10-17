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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Адрес российской компании
 * 
 * <p>Java class for sparkAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="REGION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RAYON" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STREETNAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BUILDINGNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasGUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasRegion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasArea" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasPlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasPlan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FiasStreet" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkAddress")
@XmlSeeAlso({
    SparkAddressActual.class
})
public class SparkAddress {

    @XmlAttribute(name = "PostCode")
    protected String postCode;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "REGION")
    protected String region;
    @XmlAttribute(name = "RAYON")
    protected String rayon;
    @XmlAttribute(name = "CITY")
    protected String city;
    @XmlAttribute(name = "STREETNAME")
    protected String streetname;
    @XmlAttribute(name = "BUILDINGNUMBER")
    protected String buildingnumber;
    @XmlAttribute(name = "FiasGUID")
    protected String fiasGUID;
    @XmlAttribute(name = "FiasCode")
    protected String fiasCode;
    @XmlAttribute(name = "FiasRegion")
    protected String fiasRegion;
    @XmlAttribute(name = "FiasArea")
    protected String fiasArea;
    @XmlAttribute(name = "FiasCity")
    protected String fiasCity;
    @XmlAttribute(name = "FiasPlace")
    protected String fiasPlace;
    @XmlAttribute(name = "FiasPlan")
    protected String fiasPlan;
    @XmlAttribute(name = "FiasStreet")
    protected String fiasStreet;
    @XmlAttribute(name = "ActualDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualDate;

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the rayon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAYON() {
        return rayon;
    }

    /**
     * Sets the value of the rayon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAYON(String value) {
        this.rayon = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the streetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREETNAME() {
        return streetname;
    }

    /**
     * Sets the value of the streetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREETNAME(String value) {
        this.streetname = value;
    }

    /**
     * Gets the value of the buildingnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDINGNUMBER() {
        return buildingnumber;
    }

    /**
     * Sets the value of the buildingnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDINGNUMBER(String value) {
        this.buildingnumber = value;
    }

    /**
     * Gets the value of the fiasGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasGUID() {
        return fiasGUID;
    }

    /**
     * Sets the value of the fiasGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasGUID(String value) {
        this.fiasGUID = value;
    }

    /**
     * Gets the value of the fiasCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasCode() {
        return fiasCode;
    }

    /**
     * Sets the value of the fiasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasCode(String value) {
        this.fiasCode = value;
    }

    /**
     * Gets the value of the fiasRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasRegion() {
        return fiasRegion;
    }

    /**
     * Sets the value of the fiasRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasRegion(String value) {
        this.fiasRegion = value;
    }

    /**
     * Gets the value of the fiasArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasArea() {
        return fiasArea;
    }

    /**
     * Sets the value of the fiasArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasArea(String value) {
        this.fiasArea = value;
    }

    /**
     * Gets the value of the fiasCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasCity() {
        return fiasCity;
    }

    /**
     * Sets the value of the fiasCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasCity(String value) {
        this.fiasCity = value;
    }

    /**
     * Gets the value of the fiasPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasPlace() {
        return fiasPlace;
    }

    /**
     * Sets the value of the fiasPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasPlace(String value) {
        this.fiasPlace = value;
    }

    /**
     * Gets the value of the fiasPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasPlan() {
        return fiasPlan;
    }

    /**
     * Sets the value of the fiasPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasPlan(String value) {
        this.fiasPlan = value;
    }

    /**
     * Gets the value of the fiasStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasStreet() {
        return fiasStreet;
    }

    /**
     * Sets the value of the fiasStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasStreet(String value) {
        this.fiasStreet = value;
    }

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

}
