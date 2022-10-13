
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCapToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCapToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckCapTokenRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCapTokenRq"/&gt;
 *         &lt;element name="CheckCapTokenRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCapTokenRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCapToken", propOrder = {
    "checkCapTokenRq",
    "checkCapTokenRs"
})
public class CheckCapToken {

    @XmlElement(name = "CheckCapTokenRq")
    protected CheckCapTokenRq checkCapTokenRq;
    @XmlElement(name = "CheckCapTokenRs")
    protected CheckCapTokenRs checkCapTokenRs;

    /**
     * Gets the value of the checkCapTokenRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCapTokenRq }
     *     
     */
    public CheckCapTokenRq getCheckCapTokenRq() {
        return checkCapTokenRq;
    }

    /**
     * Sets the value of the checkCapTokenRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCapTokenRq }
     *     
     */
    public void setCheckCapTokenRq(CheckCapTokenRq value) {
        this.checkCapTokenRq = value;
    }

    /**
     * Gets the value of the checkCapTokenRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCapTokenRs }
     *     
     */
    public CheckCapTokenRs getCheckCapTokenRs() {
        return checkCapTokenRs;
    }

    /**
     * Sets the value of the checkCapTokenRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCapTokenRs }
     *     
     */
    public void setCheckCapTokenRs(CheckCapTokenRs value) {
        this.checkCapTokenRs = value;
    }

}
