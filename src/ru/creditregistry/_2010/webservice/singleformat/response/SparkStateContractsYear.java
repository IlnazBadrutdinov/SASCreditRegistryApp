//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 11:42:46 AM MSK 
//


package ru.creditregistry._2010.webservice.singleformat.response;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сводные данные по госконтрактам за год
 * 
 * <p>Java class for sparkStateContractsYear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkStateContractsYear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tenders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AdmittedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="NotAdmittedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="WinnerNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contracts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SignedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Sum" type="{}sparkMyDecimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Year" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkStateContractsYear", propOrder = {
    "tenders",
    "contracts"
})
public class SparkStateContractsYear {

    @XmlElement(name = "Tenders", required = true)
    protected SparkStateContractsYear.Tenders tenders;
    @XmlElement(name = "Contracts", required = true)
    protected SparkStateContractsYear.Contracts contracts;
    @XmlAttribute(name = "Year", required = true)
    protected BigInteger year;

    /**
     * Gets the value of the tenders property.
     * 
     * @return
     *     possible object is
     *     {@link SparkStateContractsYear.Tenders }
     *     
     */
    public SparkStateContractsYear.Tenders getTenders() {
        return tenders;
    }

    /**
     * Sets the value of the tenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkStateContractsYear.Tenders }
     *     
     */
    public void setTenders(SparkStateContractsYear.Tenders value) {
        this.tenders = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link SparkStateContractsYear.Contracts }
     *     
     */
    public SparkStateContractsYear.Contracts getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkStateContractsYear.Contracts }
     *     
     */
    public void setContracts(SparkStateContractsYear.Contracts value) {
        this.contracts = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SignedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Sum" type="{}sparkMyDecimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contracts {

        @XmlAttribute(name = "SignedNumber")
        protected BigInteger signedNumber;
        @XmlAttribute(name = "Sum")
        protected String sum;

        /**
         * Gets the value of the signedNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSignedNumber() {
            return signedNumber;
        }

        /**
         * Sets the value of the signedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSignedNumber(BigInteger value) {
            this.signedNumber = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSum(String value) {
            this.sum = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AdmittedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="NotAdmittedNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="WinnerNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tenders {

        @XmlAttribute(name = "AdmittedNumber")
        protected BigInteger admittedNumber;
        @XmlAttribute(name = "NotAdmittedNumber")
        protected BigInteger notAdmittedNumber;
        @XmlAttribute(name = "WinnerNumber")
        protected BigInteger winnerNumber;

        /**
         * Gets the value of the admittedNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdmittedNumber() {
            return admittedNumber;
        }

        /**
         * Sets the value of the admittedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdmittedNumber(BigInteger value) {
            this.admittedNumber = value;
        }

        /**
         * Gets the value of the notAdmittedNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNotAdmittedNumber() {
            return notAdmittedNumber;
        }

        /**
         * Sets the value of the notAdmittedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNotAdmittedNumber(BigInteger value) {
            this.notAdmittedNumber = value;
        }

        /**
         * Gets the value of the winnerNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWinnerNumber() {
            return winnerNumber;
        }

        /**
         * Sets the value of the winnerNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWinnerNumber(BigInteger value) {
            this.winnerNumber = value;
        }

    }

}