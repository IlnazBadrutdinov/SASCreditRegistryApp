//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Совладелец
 * 
 * <p>Java class for sparkCoowners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkCoowners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SparkID" type="{}sparkSparkID" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{}sparkCountry" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKOPF" type="{}sparkOKxType" minOccurs="0"/>
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RNN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharePart" type="{}sparkMyDecimal" minOccurs="0"/>
 *         &lt;element name="SharePartRUR" type="{}sparkMyDecimal" minOccurs="0"/>
 *         &lt;element name="IndirectSharePart" type="{}sparkMyDecimal" minOccurs="0"/>
 *         &lt;element name="CoownerType" type="{}sparkCoownerType" minOccurs="0"/>
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkCoowners", propOrder = {
    "id",
    "parentId",
    "level",
    "name",
    "sparkID",
    "address",
    "country",
    "inn",
    "ogrn",
    "okpo",
    "okopf",
    "okato",
    "edrpu",
    "rnn",
    "bin",
    "manager",
    "sharePart",
    "sharePartRUR",
    "indirectSharePart",
    "coownerType",
    "actualDate"
})
public class SparkCoowners {

    @XmlElement(name = "Id")
    protected BigInteger id;
    @XmlElement(name = "ParentId")
    protected List<BigInteger> parentId;
    @XmlElement(name = "Level")
    protected BigInteger level;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SparkID")
    protected Integer sparkID;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Country")
    protected SparkCountry country;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "OKPO")
    protected String okpo;
    @XmlElement(name = "OKOPF")
    protected SparkOKxType okopf;
    @XmlElement(name = "OKATO")
    protected String okato;
    @XmlElement(name = "EDRPU")
    protected String edrpu;
    @XmlElement(name = "RNN")
    protected String rnn;
    @XmlElement(name = "BIN")
    protected String bin;
    @XmlElement(name = "Manager")
    protected String manager;
    @XmlElement(name = "SharePart")
    protected String sharePart;
    @XmlElement(name = "SharePartRUR")
    protected String sharePartRUR;
    @XmlElement(name = "IndirectSharePart")
    protected String indirectSharePart;
    @XmlElement(name = "CoownerType")
    protected Integer coownerType;
    @XmlElement(name = "ActualDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getParentId() {
        if (parentId == null) {
            parentId = new ArrayList<BigInteger>();
        }
        return this.parentId;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sparkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSparkID() {
        return sparkID;
    }

    /**
     * Sets the value of the sparkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSparkID(Integer value) {
        this.sparkID = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link SparkCountry }
     *     
     */
    public SparkCountry getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkCountry }
     *     
     */
    public void setCountry(SparkCountry value) {
        this.country = value;
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
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
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
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link SparkOKxType }
     *     
     */
    public SparkOKxType getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkOKxType }
     *     
     */
    public void setOKOPF(SparkOKxType value) {
        this.okopf = value;
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
     * Gets the value of the edrpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRPU() {
        return edrpu;
    }

    /**
     * Sets the value of the edrpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRPU(String value) {
        this.edrpu = value;
    }

    /**
     * Gets the value of the rnn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNN() {
        return rnn;
    }

    /**
     * Sets the value of the rnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNN(String value) {
        this.rnn = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIN() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIN(String value) {
        this.bin = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the sharePart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePart() {
        return sharePart;
    }

    /**
     * Sets the value of the sharePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePart(String value) {
        this.sharePart = value;
    }

    /**
     * Gets the value of the sharePartRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePartRUR() {
        return sharePartRUR;
    }

    /**
     * Sets the value of the sharePartRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePartRUR(String value) {
        this.sharePartRUR = value;
    }

    /**
     * Gets the value of the indirectSharePart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirectSharePart() {
        return indirectSharePart;
    }

    /**
     * Sets the value of the indirectSharePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirectSharePart(String value) {
        this.indirectSharePart = value;
    }

    /**
     * Gets the value of the coownerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoownerType() {
        return coownerType;
    }

    /**
     * Sets the value of the coownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoownerType(Integer value) {
        this.coownerType = value;
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