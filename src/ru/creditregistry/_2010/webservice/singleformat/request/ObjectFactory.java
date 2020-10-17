
package ru.creditregistry._2010.webservice.singleformat.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.creditregistry._2010.webservice.singleformatservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessRequestData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "ProcessRequestData");
    private final static QName _GroupRequestData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "GroupRequestData");
    private final static QName _StatusUpdateData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "StatusUpdateData");
    private final static QName _JoinUidResponsesData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "JoinUidResponsesData");
    private final static QName _AuthData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "AuthData");
    private final static QName _JoinApplicationResponsesData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "JoinApplicationResponsesData");
    private final static QName _ProcessRequestOut_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "ProcessRequestOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.creditregistry._2010.webservice.singleformatservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtraFields }
     * 
     */
    public ExtraFields createExtraFields() {
        return new ExtraFields();
    }

    /**
     * Create an instance of {@link JoinApplicationResponsesData }
     * 
     */
    public JoinApplicationResponsesData createJoinApplicationResponsesData() {
        return new JoinApplicationResponsesData();
    }

    /**
     * Create an instance of {@link AuthData }
     * 
     */
    public AuthData createAuthData() {
        return new AuthData();
    }

    /**
     * Create an instance of {@link StatusUpdateData }
     * 
     */
    public StatusUpdateData createStatusUpdateData() {
        return new StatusUpdateData();
    }

    /**
     * Create an instance of {@link JoinUidResponsesData }
     * 
     */
    public JoinUidResponsesData createJoinUidResponsesData() {
        return new JoinUidResponsesData();
    }

    /**
     * Create an instance of {@link ProcessRequestData }
     * 
     */
    public ProcessRequestData createProcessRequestData() {
        return new ProcessRequestData();
    }

    /**
     * Create an instance of {@link GroupRequestData }
     * 
     */
    public GroupRequestData createGroupRequestData() {
        return new GroupRequestData();
    }

    /**
     * Create an instance of {@link ProcessRequestOut }
     * 
     */
    public ProcessRequestOut createProcessRequestOut() {
        return new ProcessRequestOut();
    }

    /**
     * Create an instance of {@link ConnectorCode }
     * 
     */
    public ConnectorCode createConnectorCode() {
        return new ConnectorCode();
    }

    /**
     * Create an instance of {@link PersonRequestData }
     * 
     */
    public PersonRequestData createPersonRequestData() {
        return new PersonRequestData();
    }

    /**
     * Create an instance of {@link MatchScheme }
     * 
     */
    public MatchScheme createMatchScheme() {
        return new MatchScheme();
    }

    /**
     * Create an instance of {@link FraudStatuses }
     * 
     */
    public FraudStatuses createFraudStatuses() {
        return new FraudStatuses();
    }

    /**
     * Create an instance of {@link ExtraFields.Field }
     * 
     */
    public ExtraFields.Field createExtraFieldsField() {
        return new ExtraFields.Field();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "ProcessRequestData")
    public JAXBElement<ProcessRequestData> createProcessRequestData(ProcessRequestData value) {
        return new JAXBElement<ProcessRequestData>(_ProcessRequestData_QNAME, ProcessRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "GroupRequestData")
    public JAXBElement<GroupRequestData> createGroupRequestData(GroupRequestData value) {
        return new JAXBElement<GroupRequestData>(_GroupRequestData_QNAME, GroupRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "StatusUpdateData")
    public JAXBElement<StatusUpdateData> createStatusUpdateData(StatusUpdateData value) {
        return new JAXBElement<StatusUpdateData>(_StatusUpdateData_QNAME, StatusUpdateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinUidResponsesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "JoinUidResponsesData")
    public JAXBElement<JoinUidResponsesData> createJoinUidResponsesData(JoinUidResponsesData value) {
        return new JAXBElement<JoinUidResponsesData>(_JoinUidResponsesData_QNAME, JoinUidResponsesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "AuthData")
    public JAXBElement<AuthData> createAuthData(AuthData value) {
        return new JAXBElement<AuthData>(_AuthData_QNAME, AuthData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinApplicationResponsesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "JoinApplicationResponsesData")
    public JAXBElement<JoinApplicationResponsesData> createJoinApplicationResponsesData(JoinApplicationResponsesData value) {
        return new JAXBElement<JoinApplicationResponsesData>(_JoinApplicationResponsesData_QNAME, JoinApplicationResponsesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "ProcessRequestOut")
    public JAXBElement<ProcessRequestOut> createProcessRequestOut(ProcessRequestOut value) {
        return new JAXBElement<ProcessRequestOut>(_ProcessRequestOut_QNAME, ProcessRequestOut.class, null, value);
    }

}
