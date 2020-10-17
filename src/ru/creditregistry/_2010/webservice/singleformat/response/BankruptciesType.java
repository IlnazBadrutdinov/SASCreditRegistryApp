//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankruptciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankruptciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANKRUPTCY" type="{}bankruptcyType" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankruptciesType", propOrder = {
    "bankruptcy"
})
public class BankruptciesType {

    @XmlElement(name = "BANKRUPTCY")
    protected List<BankruptcyType> bankruptcy;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANKRUPTCY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankruptcyType }
     * 
     * 
     */
    public List<BankruptcyType> getBANKRUPTCY() {
        if (bankruptcy == null) {
            bankruptcy = new ArrayList<BankruptcyType>();
        }
        return this.bankruptcy;
    }

}