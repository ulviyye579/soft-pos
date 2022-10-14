
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
 * <p>Java class for RklGenerateAndEncryptKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklGenerateAndEncryptKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncryptionKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="KeyData" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="KeyLen" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyLen" /&gt;
 *       &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StationName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Padding" type="{http://schemas.tranzaxis.com/crypto.xsd}PaddingMethod" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklGenerateAndEncryptKeyRq", propOrder = {
    "encryptionKey",
    "keyData"
})
public class RklGenerateAndEncryptKeyRq {

    @XmlElement(name = "EncryptionKey", required = true)
    protected IntTypedRsaKey encryptionKey;
    @XmlElement(name = "KeyData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] keyData;
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
    @XmlAttribute(name = "KeyLen", required = true)
    protected long keyLen;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;
    @XmlAttribute(name = "Padding")
    protected PaddingMethod padding;

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setEncryptionKey(IntTypedRsaKey value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the keyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKeyData() {
        return keyData;
    }

    /**
     * Sets the value of the keyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyData(byte[] value) {
        this.keyData = value;
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

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link PaddingMethod }
     *     
     */
    public PaddingMethod getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaddingMethod }
     *     
     */
    public void setPadding(PaddingMethod value) {
        this.padding = value;
    }

}
