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
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ������, ����������� ����� ���� AFS ��� ���� SNA
 * 
 * <p>Java class for afsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionSNA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleSetIdSNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="appsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rulesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matchResult" type="{}afsMatchResultType" minOccurs="0"/>
 *         &lt;element name="image" type="{}afsImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="network" type="{}afsSNAType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afsResponseType", propOrder = {
    "action",
    "actionSNA",
    "correlationId",
    "sourceId",
    "ruleSetId",
    "ruleSetIdSNA",
    "duration",
    "appId",
    "appVersion",
    "appsCount",
    "rulesCount",
    "matchCount",
    "matchResult",
    "image",
    "network"
})
public class AfsResponseType {

    protected String action;
    protected Integer actionSNA;
    protected String correlationId;
    protected String sourceId;
    protected String ruleSetId;
    protected String ruleSetIdSNA;
    protected Short duration;
    protected String appId;
    protected Integer appVersion;
    protected Integer appsCount;
    protected Integer rulesCount;
    protected Integer matchCount;
    protected AfsMatchResultType matchResult;
    protected List<AfsImageType> image;
    protected AfsSNAType network;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionSNA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActionSNA() {
        return actionSNA;
    }

    /**
     * Sets the value of the actionSNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActionSNA(Integer value) {
        this.actionSNA = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the ruleSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleSetId() {
        return ruleSetId;
    }

    /**
     * Sets the value of the ruleSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleSetId(String value) {
        this.ruleSetId = value;
    }

    /**
     * Gets the value of the ruleSetIdSNA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleSetIdSNA() {
        return ruleSetIdSNA;
    }

    /**
     * Sets the value of the ruleSetIdSNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleSetIdSNA(String value) {
        this.ruleSetIdSNA = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDuration(Short value) {
        this.duration = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppVersion(Integer value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the appsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppsCount() {
        return appsCount;
    }

    /**
     * Sets the value of the appsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppsCount(Integer value) {
        this.appsCount = value;
    }

    /**
     * Gets the value of the rulesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRulesCount() {
        return rulesCount;
    }

    /**
     * Sets the value of the rulesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRulesCount(Integer value) {
        this.rulesCount = value;
    }

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchCount(Integer value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the matchResult property.
     * 
     * @return
     *     possible object is
     *     {@link AfsMatchResultType }
     *     
     */
    public AfsMatchResultType getMatchResult() {
        return matchResult;
    }

    /**
     * Sets the value of the matchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsMatchResultType }
     *     
     */
    public void setMatchResult(AfsMatchResultType value) {
        this.matchResult = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AfsImageType }
     * 
     * 
     */
    public List<AfsImageType> getImage() {
        if (image == null) {
            image = new ArrayList<AfsImageType>();
        }
        return this.image;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link AfsSNAType }
     *     
     */
    public AfsSNAType getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsSNAType }
     *     
     */
    public void setNetwork(AfsSNAType value) {
        this.network = value;
    }

}
