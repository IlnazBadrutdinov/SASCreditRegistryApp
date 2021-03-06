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
import javax.xml.bind.annotation.XmlType;


/**
 * Сводные данные об арбитражных делах для отдельной роли участника
 * 
 * <p>Java class for sparkArbitrationSummaryByRoleShort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkArbitrationSummaryByRoleShort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Considered" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Appealed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Completed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkArbitrationSummaryByRoleShort")
public class SparkArbitrationSummaryByRoleShort {

    @XmlAttribute(name = "Total", required = true)
    protected int total;
    @XmlAttribute(name = "Considered", required = true)
    protected int considered;
    @XmlAttribute(name = "Appealed", required = true)
    protected int appealed;
    @XmlAttribute(name = "Completed", required = true)
    protected int completed;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the considered property.
     * 
     */
    public int getConsidered() {
        return considered;
    }

    /**
     * Sets the value of the considered property.
     * 
     */
    public void setConsidered(int value) {
        this.considered = value;
    }

    /**
     * Gets the value of the appealed property.
     * 
     */
    public int getAppealed() {
        return appealed;
    }

    /**
     * Sets the value of the appealed property.
     * 
     */
    public void setAppealed(int value) {
        this.appealed = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     */
    public int getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     */
    public void setCompleted(int value) {
        this.completed = value;
    }

}
