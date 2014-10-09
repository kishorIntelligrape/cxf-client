
package org.grails.cxf.soap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://test.cxf.grails.org/}customerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "name",
    "address",
    "numOrders",
    "revenue",
    "test",
    "birthDate",
    "type"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
public class Customer {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected String name;
    @XmlElement(nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected List<String> address;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected int numOrders;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected double revenue;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected BigDecimal test;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected Date birthDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    protected CustomerType type;

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

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public List<String> getAddress() {
        if (address == null) {
            address = new ArrayList<String>();
        }
        return this.address;
    }

    /**
     * Gets the value of the numOrders property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public int getNumOrders() {
        return numOrders;
    }

    /**
     * Sets the value of the numOrders property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setNumOrders(int value) {
        this.numOrders = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public double getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setRevenue(double value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public BigDecimal getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setTest(BigDecimal value) {
        this.test = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public CustomerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-10-05T03:45:34+05:30", comments = "JAXB RI v2.2.6")
    public void setType(CustomerType value) {
        this.type = value;
    }

}
