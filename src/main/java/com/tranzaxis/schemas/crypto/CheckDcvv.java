
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckDcvv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckDcvv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckDcvvRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckDcvvRq"/&gt;
 *         &lt;element name="CheckDcvvRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckDcvvRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckDcvv", propOrder = {
    "checkDcvvRq",
    "checkDcvvRs"
})
public class CheckDcvv {

    @XmlElement(name = "CheckDcvvRq")
    protected CheckDcvvRq checkDcvvRq;
    @XmlElement(name = "CheckDcvvRs")
    protected CheckDcvvRs checkDcvvRs;

    /**
     * Gets the value of the checkDcvvRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDcvvRq }
     *     
     */
    public CheckDcvvRq getCheckDcvvRq() {
        return checkDcvvRq;
    }

    /**
     * Sets the value of the checkDcvvRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDcvvRq }
     *     
     */
    public void setCheckDcvvRq(CheckDcvvRq value) {
        this.checkDcvvRq = value;
    }

    /**
     * Gets the value of the checkDcvvRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDcvvRs }
     *     
     */
    public CheckDcvvRs getCheckDcvvRs() {
        return checkDcvvRs;
    }

    /**
     * Sets the value of the checkDcvvRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDcvvRs }
     *     
     */
    public void setCheckDcvvRs(CheckDcvvRs value) {
        this.checkDcvvRs = value;
    }

}
