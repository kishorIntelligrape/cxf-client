package cxf.client.demo.complex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-11-14T10:33:47.771-06:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "ComplexService", 
                  wsdlLocation = "file:docs/ComplexService.wsdl",
                  targetNamespace = "http://demo.client.cxf/") 
public class ComplexService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.client.cxf/", "ComplexService");
    public final static QName ComplexServicePort = new QName("http://demo.client.cxf/", "ComplexServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:docs/ComplexService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ComplexService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:docs/ComplexService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ComplexService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ComplexService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComplexService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ComplexServicePortType
     */
    @WebEndpoint(name = "ComplexServicePort")
    public ComplexServicePortType getComplexServicePort() {
        return super.getPort(ComplexServicePort, ComplexServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComplexServicePortType
     */
    @WebEndpoint(name = "ComplexServicePort")
    public ComplexServicePortType getComplexServicePort(WebServiceFeature... features) {
        return super.getPort(ComplexServicePort, ComplexServicePortType.class, features);
    }

}
