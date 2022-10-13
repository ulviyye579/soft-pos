
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExportPinBlockRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportPinBlockRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PinBlockInt" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="PinBlockFormat" type="{http://schemas.tranzaxis.com/crypto.xsd}PinBlockFormat" default="Ansi" /&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPinBlockRq", propOrder = {
    "key"
})
public class ExportPinBlockRq {

    @XmlElement(name = "Key", required = true)
    protected IntTypedKey key;
    @XmlAttribute(name = "PinBlockInt", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pinBlockInt;
    @XmlAttribute(name = "PinBlockFormat")
    protected PinBlockFormat pinBlockFormat;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;

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
     * Gets the value of the pinBlockInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPinBlockInt() {
        return pinBlockInt;
    }

    /**
     * Sets the value of the pinBlockInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinBlockInt(byte[] value) {
        this.pinBlockInt = value;
    }

    /**
     * Gets the value of the pinBlockFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PinBlockFormat }
     *     
     */
    public PinBlockFormat getPinBlockFormat() {
        if (pinBlockFormat == null) {
            return PinBlockFormat.ANSI;
        } else {
            return pinBlockFormat;
        }
    }

    /**
     * Sets the value of the pinBlockFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinBlockFormat }
     *     
     */
    public void setPinBlockFormat(PinBlockFormat value) {
        this.pinBlockFormat = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

}
