package ru.creditregistry._2010.webservice.singleformat.request;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import org.apache.ibatis.io.Resources;

import javax.xml.ws.Service;

/**
 * Веб-сервис, предоставляющий сервисы, связанные с Единым форматом
 *
 * This class was generated by Apache CXF 2.4.1
 * 2018-08-02T15:10:28.769+03:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "SingleFormatService", 
                  wsdlLocation = "file:SingleFormatService.wsdl",
                  targetNamespace = "http://creditregistry.ru/2010/webservice/SingleFormatService") 
public class SingleFormatService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "SingleFormatService");
    public final static QName SingleFormatServiceHttpPort = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "SingleFormatServiceHttpPort");
    static {
        URL url = null;
        File file = null;
        try {
        	
        	file = Resources.getResourceAsFile("SingleFormatService.wsdl");
            url = file.toURL();
        } catch (IOException e) {
            java.util.logging.Logger.getLogger(SingleFormatService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:SingleFormatService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SingleFormatService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SingleFormatService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SingleFormatService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SingleFormatService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SingleFormatService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SingleFormatService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SingleFormatService
     */
    @WebEndpoint(name = "SingleFormatServiceHttpPort")
    public SingleFormatService getSingleFormatServiceHttpPort() {
        return super.getPort(SingleFormatServiceHttpPort, SingleFormatService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SingleFormatService
     */
    @WebEndpoint(name = "SingleFormatServiceHttpPort")
    public SingleFormatService getSingleFormatServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(SingleFormatServiceHttpPort, SingleFormatService.class, features);
    }

}
