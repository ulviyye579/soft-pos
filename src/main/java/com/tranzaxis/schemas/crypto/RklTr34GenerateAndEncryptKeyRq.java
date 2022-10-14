
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RklTr34GenerateAndEncryptKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklTr34GenerateAndEncryptKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KdhRsaKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="KrdRsaPublicKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="KeyBlockFormat" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockFormat"/&gt;
 *         &lt;element name="KrdNonce" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="KeyLen" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyLen" /&gt;
 *       &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StationName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklTr34GenerateAndEncryptKeyRq", propOrder = {
    "kdhRsaKey",
    "krdRsaPublicKey",
    "keyBlockFormat",
    "krdNonce"
})
public class RklTr34GenerateAndEncryptKeyRq {

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
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
    @XmlAttribute(name = "KeyLen", required = true)
    protected long keyLen;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;

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

    /**
     * Gets the value of the keyKind property.
     * 
     * @return
     *     possible object is
     *     {@link KeyKind }
     *     
     */
    public KeyKind getKeyKind() {
        return keyKind;
    }

    /**
     * Sets the value of the keyKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyKind }
     *     
     */
    public void setKeyKind(KeyKind value) {
        this.keyKind = value;
    }

    /**
     * Gets the value of the keyLen property.
     * 
     */
    public long getKeyLen() {
        return keyLen;
    }

    /**
     * Sets the value of the keyLen property.
     * 
     */
    public void setKeyLen(long value) {
        this.keyLen = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

}
