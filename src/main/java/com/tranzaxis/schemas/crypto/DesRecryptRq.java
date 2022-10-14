
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DesRecryptRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesRecryptRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *         &lt;element name="DestinationKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Data" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="DecryptionMode" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}CipherMode" /&gt;
 *       &lt;attribute name="EncryptionMode" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}CipherMode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesRecryptRq", propOrder = {
    "sourceKey",
    "destinationKey"
})
public class DesRecryptRq {

    @XmlElement(name = "SourceKey", required = true)
    protected IntTypedKey sourceKey;
    @XmlElement(name = "DestinationKey", required = true)
    protected IntTypedKey destinationKey;
    @XmlAttribute(name = "Data", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] data;
    @XmlAttribute(name = "DecryptionMode", required = true)
    protected CipherMode decryptionMode;
    @XmlAttribute(name = "EncryptionMode", required = true)
    protected CipherMode encryptionMode;

    /**
     * Gets the value of the sourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setSourceKey(IntTypedKey value) {
        this.sourceKey = value;
    }

    /**
     * Gets the value of the destinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getDestinationKey() {
        return destinationKey;
    }

    /**
     * Sets the value of the destinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setDestinationKey(IntTypedKey value) {
        this.destinationKey = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the decryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link CipherMode }
     *     
     */
    public CipherMode getDecryptionMode() {
        return decryptionMode;
    }

    /**
     * Sets the value of the decryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherMode }
     *     
     */
    public void setDecryptionMode(CipherMode value) {
        this.decryptionMode = value;
    }

    /**
     * Gets the value of the encryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link CipherMode }
     *     
     */
    public CipherMode getEncryptionMode() {
        return encryptionMode;
    }

    /**
     * Sets the value of the encryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherMode }
     *     
     */
    public void setEncryptionMode(CipherMode value) {
        this.encryptionMode = value;
    }

}
