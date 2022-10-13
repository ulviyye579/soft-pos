
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JwtDecodeRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JwtDecodeRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HostKeyPair" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="NetworkPublicKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="EncryptedMessage" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JwtDecodeRq", propOrder = {
    "hostKeyPair",
    "networkPublicKey",
    "encryptedMessage"
})
public class JwtDecodeRq {

    @XmlElement(name = "HostKeyPair", required = true)
    protected IntTypedRsaKey hostKeyPair;
    @XmlElement(name = "NetworkPublicKey", required = true)
    protected IntTypedRsaKey networkPublicKey;
    @XmlElement(name = "EncryptedMessage", required = true)
    protected String encryptedMessage;

    /**
     * Gets the value of the hostKeyPair property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getHostKeyPair() {
        return hostKeyPair;
    }

    /**
     * Sets the value of the hostKeyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setHostKeyPair(IntTypedRsaKey value) {
        this.hostKeyPair = value;
    }

    /**
     * Gets the value of the networkPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getNetworkPublicKey() {
        return networkPublicKey;
    }

    /**
     * Sets the value of the networkPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setNetworkPublicKey(IntTypedRsaKey value) {
        this.networkPublicKey = value;
    }

    /**
     * Gets the value of the encryptedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    /**
     * Sets the value of the encryptedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedMessage(String value) {
        this.encryptedMessage = value;
    }

}
