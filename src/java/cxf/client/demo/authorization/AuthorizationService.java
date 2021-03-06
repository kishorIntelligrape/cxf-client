package cxf.client.demo.authorization;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-06-12T11:34:12.537-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "AuthorizationService", 
                  wsdlLocation = "docs/AuthorizationService.wsdl",
                  targetNamespace = "http://demo.client.cxf/") 
public class AuthorizationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.client.cxf/", "AuthorizationService");
    public final static QName AuthorizationServicePort = new QName("http://demo.client.cxf/", "AuthorizationServicePort");
    static {
        URL url = AuthorizationService.class.getResource("docs/AuthorizationService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(AuthorizationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "docs/AuthorizationService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public AuthorizationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthorizationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthorizationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AuthorizationServicePortType
     */
    @WebEndpoint(name = "AuthorizationServicePort")
    public AuthorizationServicePortType getAuthorizationServicePort() {
        return super.getPort(AuthorizationServicePort, AuthorizationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthorizationServicePortType
     */
    @WebEndpoint(name = "AuthorizationServicePort")
    public AuthorizationServicePortType getAuthorizationServicePort(WebServiceFeature... features) {
        return super.getPort(AuthorizationServicePort, AuthorizationServicePortType.class, features);
    }

}
