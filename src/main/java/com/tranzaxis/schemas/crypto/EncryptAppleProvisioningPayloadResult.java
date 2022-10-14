
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EncryptAppleProvisioningPayloadResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptAppleProvisioningPayloadResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncryptedPayload" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="EphemeralPublicKey" type="{http://schemas.radixware.org/types.xsd}BinHex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptAppleProvisioningPayloadResult", propOrder = {
    "encryptedPayload",
    "ephemeralPublicKey"
})
@XmlSeeAlso({
    EncryptAppleProvisioningPayloadRs.class
})
public class EncryptAppleProvisioningPayloadResult {

    @XmlElement(name = "EncryptedPayload", required = true)
    protected byte[] encryptedPayload;
    @XmlElement(name = "EphemeralPublicKey", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ephemeralPublicKey;

    /**
     * Gets the value of the encryptedPayload property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedPayload() {
        return encryptedPayload;
    }

    /**
     * Sets the value of the encryptedPayload property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedPayload(byte[] value) {
        this.encryptedPayload = value;
    }

    /**
     * Gets the value of the ephemeralPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    /**
     * Sets the value of the ephemeralPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEphemeralPublicKey(byte[] value) {
        this.ephemeralPublicKey = value;
    }

}
