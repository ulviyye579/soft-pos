
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckMac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckMac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckMacRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckMacRq"/&gt;
 *         &lt;element name="CheckMacRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckMacRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckMac", propOrder = {
    "checkMacRq",
    "checkMacRs"
})
public class CheckMac {

    @XmlElement(name = "CheckMacRq")
    protected CheckMacRq checkMacRq;
    @XmlElement(name = "CheckMacRs")
    protected CheckMacRs checkMacRs;

    /**
     * Gets the value of the checkMacRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMacRq }
     *     
     */
    public CheckMacRq getCheckMacRq() {
        return checkMacRq;
    }

    /**
     * Sets the value of the checkMacRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMacRq }
     *     
     */
    public void setCheckMacRq(CheckMacRq value) {
        this.checkMacRq = value;
    }

    /**
     * Gets the value of the checkMacRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMacRs }
     *     
     */
    public CheckMacRs getCheckMacRs() {
        return checkMacRs;
    }

    /**
     * Sets the value of the checkMacRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMacRs }
     *     
     */
    public void setCheckMacRs(CheckMacRs value) {
        this.checkMacRs = value;
    }

}
