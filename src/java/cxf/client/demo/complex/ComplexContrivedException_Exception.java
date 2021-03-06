
package cxf.client.demo.complex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-06-12T11:35:53.808-05:00
 * Generated source version: 2.6.2
 */

@WebFault(name = "ComplexContrivedException", targetNamespace = "http://demo.client.cxf/")
public class ComplexContrivedException_Exception extends Exception {
    
    private cxf.client.demo.complex.ComplexContrivedException complexContrivedException;

    public ComplexContrivedException_Exception() {
        super();
    }
    
    public ComplexContrivedException_Exception(String message) {
        super(message);
    }
    
    public ComplexContrivedException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ComplexContrivedException_Exception(String message, cxf.client.demo.complex.ComplexContrivedException complexContrivedException) {
        super(message);
        this.complexContrivedException = complexContrivedException;
    }

    public ComplexContrivedException_Exception(String message, cxf.client.demo.complex.ComplexContrivedException complexContrivedException, Throwable cause) {
        super(message, cause);
        this.complexContrivedException = complexContrivedException;
    }

    public cxf.client.demo.complex.ComplexContrivedException getFaultInfo() {
        return this.complexContrivedException;
    }
}
