package org.grails.cxf.soap;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.6
 * 2014-10-05T15:45:34.499+05:30
 * Generated source version: 2.6.6
 * 
 */
@WebService(targetNamespace = "http://test.cxf.grails.org/", name = "CustomerServiceWsdlEndpointPortType")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.499+05:30", comments = "Apache CXF 2.6.6")
public interface CustomerServiceWsdlEndpointPortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCustomersByName", targetNamespace = "http://test.cxf.grails.org/", className = "org.grails.cxf.soap.GetCustomersByName")
    @WebMethod
    @ResponseWrapper(localName = "getCustomersByNameResponse", targetNamespace = "http://test.cxf.grails.org/", className = "org.grails.cxf.soap.GetCustomersByNameResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2014-10-05T15:45:34.499+05:30")
    public java.util.List<org.grails.cxf.soap.Customer> getCustomersByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    ) throws NoSuchCustomerException;
}
