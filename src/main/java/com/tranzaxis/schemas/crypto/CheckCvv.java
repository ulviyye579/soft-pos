
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCvv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCvv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckCvvRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCvvRq"/&gt;
 *         &lt;element name="CheckCvvRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCvvRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCvv", propOrder = {
    "checkCvvRq",
    "checkCvvRs"
})
public class CheckCvv {

    @XmlElement(name = "CheckCvvRq")
    protected CheckCvvRq checkCvvRq;
    @XmlElement(name = "CheckCvvRs")
    protected CheckCvvRs checkCvvRs;

    /**
     * Gets the value of the checkCvvRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCvvRq }
     *     
     */
    public CheckCvvRq getCheckCvvRq() {
        return checkCvvRq;
    }

    /**
     * Sets the value of the checkCvvRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCvvRq }
     *     
     */
    public void setCheckCvvRq(CheckCvvRq value) {
        this.checkCvvRq = value;
    }

    /**
     * Gets the value of the checkCvvRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCvvRs }
     *     
     */
    public CheckCvvRs getCheckCvvRs() {
        return checkCvvRs;
    }

    /**
     * Sets the value of the checkCvvRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCvvRs }
     *     
     */
    public void setCheckCvvRs(CheckCvvRs value) {
        this.checkCvvRs = value;
    }

}
