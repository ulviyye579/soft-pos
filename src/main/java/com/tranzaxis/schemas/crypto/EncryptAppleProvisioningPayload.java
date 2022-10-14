
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptAppleProvisioningPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptAppleProvisioningPayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EncryptAppleProvisioningPayloadRq" type="{http://schemas.tranzaxis.com/crypto.xsd}EncryptAppleProvisioningPayloadRq"/&gt;
 *         &lt;element name="EncryptAppleProvisioningPayloadRs" type="{http://schemas.tranzaxis.com/crypto.xsd}EncryptAppleProvisioningPayloadRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptAppleProvisioningPayload", propOrder = {
    "encryptAppleProvisioningPayloadRq",
    "encryptAppleProvisioningPayloadRs"
})
public class EncryptAppleProvisioningPayload {

    @XmlElement(name = "EncryptAppleProvisioningPayloadRq")
    protected EncryptAppleProvisioningPayloadRq encryptAppleProvisioningPayloadRq;
    @XmlElement(name = "EncryptAppleProvisioningPayloadRs")
    protected EncryptAppleProvisioningPayloadRs encryptAppleProvisioningPayloadRs;

    /**
     * Gets the value of the encryptAppleProvisioningPayloadRq property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptAppleProvisioningPayloadRq }
     *     
     */
    public EncryptAppleProvisioningPayloadRq getEncryptAppleProvisioningPayloadRq() {
        return encryptAppleProvisioningPayloadRq;
    }

    /**
     * Sets the value of the encryptAppleProvisioningPayloadRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptAppleProvisioningPayloadRq }
     *     
     */
    public void setEncryptAppleProvisioningPayloadRq(EncryptAppleProvisioningPayloadRq value) {
        this.encryptAppleProvisioningPayloadRq = value;
    }

    /**
     * Gets the value of the encryptAppleProvisioningPayloadRs property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptAppleProvisioningPayloadRs }
     *     
     */
    public EncryptAppleProvisioningPayloadRs getEncryptAppleProvisioningPayloadRs() {
        return encryptAppleProvisioningPayloadRs;
    }

    /**
     * Sets the value of the encryptAppleProvisioningPayloadRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptAppleProvisioningPayloadRs }
     *     
     */
    public void setEncryptAppleProvisioningPayloadRs(EncryptAppleProvisioningPayloadRs value) {
        this.encryptAppleProvisioningPayloadRs = value;
    }

}
