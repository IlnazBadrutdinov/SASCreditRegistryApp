
package ru.creditregistry._2010.webservice.singleformat.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Структура описывает данные для выполнения одиночного запроса
 * 
 * <p>Java class for ProcessRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authData" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}AuthData" minOccurs="0"/>
 *         &lt;element name="cacheUse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uidApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeApplication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="connectorCode" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}ConnectorCode"/>
 *         &lt;element name="matchScheme" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}MatchScheme" minOccurs="0"/>
 *         &lt;element name="personParam" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}PersonRequestData" maxOccurs="unbounded"/>
 *         &lt;element name="extraFields" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}extraFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRequestData", propOrder = {
    "authData",
    "cacheUse",
    "uid",
    "uidApplication",
    "dateTimeApplication",
    "connectorCode",
    "matchScheme",
    "personParam",
    "extraFields"
})
@XmlRootElement(name = "ProcessRequestData")
public class ProcessRequestData {

    protected AuthData authData;
    protected Integer cacheUse;
    protected String uid;
    protected String uidApplication;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeApplication;
    @XmlElement(required = true)
    protected ConnectorCode connectorCode;
    protected MatchScheme matchScheme;
    @XmlElement(required = true)
    protected List<PersonRequestData> personParam;
    protected ExtraFields extraFields;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the cacheUse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheUse() {
        return cacheUse;
    }

    /**
     * Sets the value of the cacheUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheUse(Integer value) {
        this.cacheUse = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
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
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the uidApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidApplication() {
        return uidApplication;
    }

    /**
     * Sets the value of the uidApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidApplication(String value) {
        this.uidApplication = value;
    }

    /**
     * Gets the value of the dateTimeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeApplication() {
        return dateTimeApplication;
    }

    /**
     * Sets the value of the dateTimeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeApplication(XMLGregorianCalendar value) {
        this.dateTimeApplication = value;
    }

    /**
     * Gets the value of the connectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorCode }
     *     
     */
    public ConnectorCode getConnectorCode() {
        return connectorCode;
    }

    /**
     * Sets the value of the connectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorCode }
     *     
     */
    public void setConnectorCode(ConnectorCode value) {
        this.connectorCode = value;
    }

    /**
     * Gets the value of the matchScheme property.
     * 
     * @return
     *     possible object is
     *     {@link MatchScheme }
     *     
     */
    public MatchScheme getMatchScheme() {
        return matchScheme;
    }

    /**
     * Sets the value of the matchScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchScheme }
     *     
     */
    public void setMatchScheme(MatchScheme value) {
        this.matchScheme = value;
    }

    /**
     * Gets the value of the personParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonRequestData }
     * 
     * 
     */
    public List<PersonRequestData> getPersonParam() {
        if (personParam == null) {
            personParam = new ArrayList<PersonRequestData>();
        }
        return this.personParam;
    }

    /**
     * Gets the value of the extraFields property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraFields }
     *     
     */
    public ExtraFields getExtraFields() {
        return extraFields;
    }

    /**
     * Sets the value of the extraFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraFields }
     *     
     */
    public void setExtraFields(ExtraFields value) {
        this.extraFields = value;
    }

}
