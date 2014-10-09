
package org.grails.cxf.soap;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomersByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomersByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomersByName", propOrder = {
    "name"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
public class GetCustomersByName {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setName(String value) {
        this.name = value;
    }

}
