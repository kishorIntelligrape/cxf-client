package cxf.client.demo.secure;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-11-14T10:35:01.963-06:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "SecureService", 
                  wsdlLocation = "file:docs/SecureService.wsdl",
                  targetNamespace = "http://demo.client.cxf/") 
public class SecureService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.client.cxf/", "SecureService");
    public final static QName SecureServicePort = new QName("http://demo.client.cxf/", "SecureServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:docs/SecureService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SecureService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:docs/SecureService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SecureService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SecureService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecureService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SecureServicePortType
     */
    @WebEndpoint(name = "SecureServicePort")
    public SecureServicePortType getSecureServicePort() {
        return super.getPort(SecureServicePort, SecureServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SecureServicePortType
     */
    @WebEndpoint(name = "SecureServicePort")
    public SecureServicePortType getSecureServicePort(WebServiceFeature... features) {
        return super.getPort(SecureServicePort, SecureServicePortType.class, features);
    }

}
