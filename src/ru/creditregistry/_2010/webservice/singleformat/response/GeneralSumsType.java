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
 * <p>Java class for generalSumsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalSumsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INS_CONTRIBS" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="COFIN_CONTRIBS" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="MATERNITY_SUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="INS_ASSIGNED" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="ACC_ASSIGNED" type="{}moneyValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalSumsType", propOrder = {
    "inscontribs",
    "cofincontribs",
    "maternitysum",
    "insassigned",
    "accassigned"
})
public class GeneralSumsType {

    @XmlElement(name = "INS_CONTRIBS")
    protected BigDecimal inscontribs;
    @XmlElement(name = "COFIN_CONTRIBS")
    protected BigDecimal cofincontribs;
    @XmlElement(name = "MATERNITY_SUM")
    protected BigDecimal maternitysum;
    @XmlElement(name = "INS_ASSIGNED")
    protected BigDecimal insassigned;
    @XmlElement(name = "ACC_ASSIGNED")
    protected BigDecimal accassigned;

    /**
     * Gets the value of the inscontribs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINSCONTRIBS() {
        return inscontribs;
    }

    /**
     * Sets the value of the inscontribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINSCONTRIBS(BigDecimal value) {
        this.inscontribs = value;
    }

    /**
     * Gets the value of the cofincontribs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOFINCONTRIBS() {
        return cofincontribs;
    }

    /**
     * Sets the value of the cofincontribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOFINCONTRIBS(BigDecimal value) {
        this.cofincontribs = value;
    }

    /**
     * Gets the value of the maternitysum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMATERNITYSUM() {
        return maternitysum;
    }

    /**
     * Sets the value of the maternitysum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMATERNITYSUM(BigDecimal value) {
        this.maternitysum = value;
    }

    /**
     * Gets the value of the insassigned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINSASSIGNED() {
        return insassigned;
    }

    /**
     * Sets the value of the insassigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINSASSIGNED(BigDecimal value) {
        this.insassigned = value;
    }

    /**
     * Gets the value of the accassigned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCASSIGNED() {
        return accassigned;
    }

    /**
     * Sets the value of the accassigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCASSIGNED(BigDecimal value) {
        this.accassigned = value;
    }

}
