
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EncryptDukptRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptDukptRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Ksn" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Data" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/crypto.xsd}CipherMode" default="CBC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptDukptRq", propOrder = {
    "key"
})
public class EncryptDukptRq {

    @XmlElement(name = "Key", required = true)
    protected IntTypedKey key;
    @XmlAttribute(name = "Ksn", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] ksn;
    @XmlAttribute(name = "Data", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] data;
    @XmlAttribute(name = "Mode")
    protected CipherMode mode;

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
     * Gets the value of the ksn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKsn() {
        return ksn;
    }

    /**
     * Sets the value of the ksn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKsn(byte[] value) {
        this.ksn = value;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link CipherMode }
     *     
     */
    public CipherMode getMode() {
        if (mode == null) {
            return CipherMode.CBC;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherMode }
     *     
     */
    public void setMode(CipherMode value) {
        this.mode = value;
    }

}
