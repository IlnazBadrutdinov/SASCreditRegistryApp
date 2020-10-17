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
 * <p>Java class for fraudVector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraudVector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ResultBlock" type="{}NHResultBlock"/>
 *         &lt;element name="outputVector" type="{}FPSOutputVector"/>
 *         &lt;element name="xml" type="{}CyberPlatData"/>
 *         &lt;element name="Answer" type="{}CronosAnswer"/>
 *         &lt;element name="afsResponse" type="{}afsResponseType"/>
 *         &lt;element name="snaReport" type="{}afsResponseType"/>
 *         &lt;element name="megafonSubscriberDescriptionResponse" type="{}megafonSubscriberDescriptionResponse"/>
 *         &lt;element name="sparkResponse" type="{}sparkResponseType"/>
 *         &lt;element name="qiwiResponse" type="{}qiwiResponseType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraudVector", propOrder = {
    "resultBlock",
    "outputVector",
    "xml",
    "answer",
    "afsResponse",
    "snaReport",
    "megafonSubscriberDescriptionResponse",
    "sparkResponse",
    "qiwiResponse"
})
public class FraudVector {

    @XmlElement(name = "ResultBlock")
    protected NHResultBlock resultBlock;
    protected FPSOutputVector outputVector;
    protected CyberPlatData xml;
    @XmlElement(name = "Answer")
    protected CronosAnswer answer;
    protected AfsResponseType afsResponse;
    protected AfsResponseType snaReport;
    protected MegafonSubscriberDescriptionResponse megafonSubscriberDescriptionResponse;
    protected SparkResponseType sparkResponse;
    protected QiwiResponseType qiwiResponse;

    /**
     * Gets the value of the resultBlock property.
     * 
     * @return
     *     possible object is
     *     {@link NHResultBlock }
     *     
     */
    public NHResultBlock getResultBlock() {
        return resultBlock;
    }

    /**
     * Sets the value of the resultBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link NHResultBlock }
     *     
     */
    public void setResultBlock(NHResultBlock value) {
        this.resultBlock = value;
    }

    /**
     * Gets the value of the outputVector property.
     * 
     * @return
     *     possible object is
     *     {@link FPSOutputVector }
     *     
     */
    public FPSOutputVector getOutputVector() {
        return outputVector;
    }

    /**
     * Sets the value of the outputVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPSOutputVector }
     *     
     */
    public void setOutputVector(FPSOutputVector value) {
        this.outputVector = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link CyberPlatData }
     *     
     */
    public CyberPlatData getXml() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link CyberPlatData }
     *     
     */
    public void setXml(CyberPlatData value) {
        this.xml = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link CronosAnswer }
     *     
     */
    public CronosAnswer getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CronosAnswer }
     *     
     */
    public void setAnswer(CronosAnswer value) {
        this.answer = value;
    }

    /**
     * Gets the value of the afsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AfsResponseType }
     *     
     */
    public AfsResponseType getAfsResponse() {
        return afsResponse;
    }

    /**
     * Sets the value of the afsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsResponseType }
     *     
     */
    public void setAfsResponse(AfsResponseType value) {
        this.afsResponse = value;
    }

    /**
     * Gets the value of the snaReport property.
     * 
     * @return
     *     possible object is
     *     {@link AfsResponseType }
     *     
     */
    public AfsResponseType getSnaReport() {
        return snaReport;
    }

    /**
     * Sets the value of the snaReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsResponseType }
     *     
     */
    public void setSnaReport(AfsResponseType value) {
        this.snaReport = value;
    }

    /**
     * Gets the value of the megafonSubscriberDescriptionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MegafonSubscriberDescriptionResponse }
     *     
     */
    public MegafonSubscriberDescriptionResponse getMegafonSubscriberDescriptionResponse() {
        return megafonSubscriberDescriptionResponse;
    }

    /**
     * Sets the value of the megafonSubscriberDescriptionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegafonSubscriberDescriptionResponse }
     *     
     */
    public void setMegafonSubscriberDescriptionResponse(MegafonSubscriberDescriptionResponse value) {
        this.megafonSubscriberDescriptionResponse = value;
    }

    /**
     * Gets the value of the sparkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SparkResponseType }
     *     
     */
    public SparkResponseType getSparkResponse() {
        return sparkResponse;
    }

    /**
     * Sets the value of the sparkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparkResponseType }
     *     
     */
    public void setSparkResponse(SparkResponseType value) {
        this.sparkResponse = value;
    }

    /**
     * Gets the value of the qiwiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QiwiResponseType }
     *     
     */
    public QiwiResponseType getQiwiResponse() {
        return qiwiResponse;
    }

    /**
     * Sets the value of the qiwiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QiwiResponseType }
     *     
     */
    public void setQiwiResponse(QiwiResponseType value) {
        this.qiwiResponse = value;
    }
}