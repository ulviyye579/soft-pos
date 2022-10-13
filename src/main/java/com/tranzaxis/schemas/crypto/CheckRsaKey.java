
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckRsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRsaKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckRsaKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckRsaKeyRq"/&gt;
 *         &lt;element name="CheckRsaKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckRsaKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRsaKey", propOrder = {
    "checkRsaKeyRq",
    "checkRsaKeyRs"
})
public class CheckRsaKey {

    @XmlElement(name = "CheckRsaKeyRq")
    protected CheckRsaKeyRq checkRsaKeyRq;
    @XmlElement(name = "CheckRsaKeyRs")
    protected CheckRsaKeyRs checkRsaKeyRs;

    /**
     * Gets the value of the checkRsaKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRsaKeyRq }
     *     
     */
    public CheckRsaKeyRq getCheckRsaKeyRq() {
        return checkRsaKeyRq;
    }

    /**
     * Sets the value of the checkRsaKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRsaKeyRq }
     *     
     */
    public void setCheckRsaKeyRq(CheckRsaKeyRq value) {
        this.checkRsaKeyRq = value;
    }

    /**
     * Gets the value of the checkRsaKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRsaKeyRs }
     *     
     */
    public CheckRsaKeyRs getCheckRsaKeyRs() {
        return checkRsaKeyRs;
    }

    /**
     * Sets the value of the checkRsaKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRsaKeyRs }
     *     
     */
    public void setCheckRsaKeyRs(CheckRsaKeyRs value) {
        this.checkRsaKeyRs = value;
    }

}
