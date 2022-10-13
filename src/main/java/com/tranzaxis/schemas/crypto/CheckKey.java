
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckKeyRq"/&gt;
 *         &lt;element name="CheckKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckKey", propOrder = {
    "checkKeyRq",
    "checkKeyRs"
})
public class CheckKey {

    @XmlElement(name = "CheckKeyRq")
    protected CheckKeyRq checkKeyRq;
    @XmlElement(name = "CheckKeyRs")
    protected CheckKeyRs checkKeyRs;

    /**
     * Gets the value of the checkKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckKeyRq }
     *     
     */
    public CheckKeyRq getCheckKeyRq() {
        return checkKeyRq;
    }

    /**
     * Sets the value of the checkKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckKeyRq }
     *     
     */
    public void setCheckKeyRq(CheckKeyRq value) {
        this.checkKeyRq = value;
    }

    /**
     * Gets the value of the checkKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckKeyRs }
     *     
     */
    public CheckKeyRs getCheckKeyRs() {
        return checkKeyRs;
    }

    /**
     * Sets the value of the checkKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckKeyRs }
     *     
     */
    public void setCheckKeyRs(CheckKeyRs value) {
        this.checkKeyRs = value;
    }

}
