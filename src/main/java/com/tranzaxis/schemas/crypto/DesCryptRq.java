
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DesCryptRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesCryptRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Data" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Mode" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}CipherMode" /&gt;
 *       &lt;attribute name="IsEncryption" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesCryptRq", propOrder = {
    "key"
})
public class DesCryptRq {

    @XmlElement(name = "Key", required = true)
    protected IntTypedKey key;
    @XmlAttribute(name = "Data", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] data;
    @XmlAttribute(name = "Mode", required = true)
    protected CipherMode mode;
    @XmlAttribute(name = "IsEncryption", required = true)
    protected boolean isEncryption;

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
        return mode;
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

    /**
     * Gets the value of the isEncryption property.
     * 
     */
    public boolean isIsEncryption() {
        return isEncryption;
    }

    /**
     * Sets the value of the isEncryption property.
     * 
     */
    public void setIsEncryption(boolean value) {
        this.isEncryption = value;
    }

}
