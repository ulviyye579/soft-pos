
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExportKeyUnderTr34Rq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportKeyUnderTr34Rq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *         &lt;element name="KdhRsaKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="KrdRsaPublicKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="KeyBlockFormat" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockFormat"/&gt;
 *         &lt;element name="KrdNonce" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportKeyUnderTr34Rq", propOrder = {
    "key",
    "kdhRsaKey",
    "krdRsaPublicKey",
    "keyBlockFormat",
    "krdNonce"
})
public class ExportKeyUnderTr34Rq {

    @XmlElement(name = "Key", required = true)
    protected IntTypedKey key;
    @XmlElement(name = "KdhRsaKey", required = true)
    protected IntTypedRsaKey kdhRsaKey;
    @XmlElement(name = "KrdRsaPublicKey", required = true)
    protected IntTypedRsaKey krdRsaPublicKey;
    @XmlElement(name = "KeyBlockFormat", required = true)
    protected KeyBlockFormat keyBlockFormat;
    @XmlElement(name = "KrdNonce", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] krdNonce;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setKey(IntTypedKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the kdhRsaKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getKdhRsaKey() {
        return kdhRsaKey;
    }

    /**
     * Sets the value of the kdhRsaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setKdhRsaKey(IntTypedRsaKey value) {
        this.kdhRsaKey = value;
    }

    /**
     * Gets the value of the krdRsaPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getKrdRsaPublicKey() {
        return krdRsaPublicKey;
    }

    /**
     * Sets the value of the krdRsaPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setKrdRsaPublicKey(IntTypedRsaKey value) {
        this.krdRsaPublicKey = value;
    }

    /**
     * Gets the value of the keyBlockFormat property.
     * 
     * @return
     *     possible object is
     *     {@link KeyBlockFormat }
     *     
     */
    public KeyBlockFormat getKeyBlockFormat() {
        return keyBlockFormat;
    }

    /**
     * Sets the value of the keyBlockFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyBlockFormat }
     *     
     */
    public void setKeyBlockFormat(KeyBlockFormat value) {
        this.keyBlockFormat = value;
    }

    /**
     * Gets the value of the krdNonce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKrdNonce() {
        return krdNonce;
    }

    /**
     * Sets the value of the krdNonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrdNonce(byte[] value) {
        this.krdNonce = value;
    }

}
