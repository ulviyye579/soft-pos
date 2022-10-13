
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckHmac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckHmac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckHmacRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckHmacRq"/&gt;
 *         &lt;element name="CheckHmacRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckHmacRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckHmac", propOrder = {
    "checkHmacRq",
    "checkHmacRs"
})
public class CheckHmac {

    @XmlElement(name = "CheckHmacRq")
    protected CheckHmacRq checkHmacRq;
    @XmlElement(name = "CheckHmacRs")
    protected CheckHmacRs checkHmacRs;

    /**
     * Gets the value of the checkHmacRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckHmacRq }
     *     
     */
    public CheckHmacRq getCheckHmacRq() {
        return checkHmacRq;
    }

    /**
     * Sets the value of the checkHmacRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckHmacRq }
     *     
     */
    public void setCheckHmacRq(CheckHmacRq value) {
        this.checkHmacRq = value;
    }

    /**
     * Gets the value of the checkHmacRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckHmacRs }
     *     
     */
    public CheckHmacRs getCheckHmacRs() {
        return checkHmacRs;
    }

    /**
     * Sets the value of the checkHmacRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckHmacRs }
     *     
     */
    public void setCheckHmacRs(CheckHmacRs value) {
        this.checkHmacRs = value;
    }

}
