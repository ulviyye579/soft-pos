
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsaSignRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaSignRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DigestMethod" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}DigestMethod" /&gt;
 *       &lt;attribute name="PaddingMethod" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}PaddingMethod" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaSignRq", propOrder = {
    "data",
    "key"
})
public class RsaSignRq {

    @XmlElement(name = "Data", required = true)
    protected byte[] data;
    @XmlElement(name = "Key", required = true)
    protected IntTypedRsaKey key;
    @XmlAttribute(name = "DigestMethod", required = true)
    protected DigestMethod digestMethod;
    @XmlAttribute(name = "PaddingMethod", required = true)
    protected PaddingMethod paddingMethod;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setKey(IntTypedRsaKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the digestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethod }
     *     
     */
    public DigestMethod getDigestMethod() {
        return digestMethod;
    }

    /**
     * Sets the value of the digestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethod }
     *     
     */
    public void setDigestMethod(DigestMethod value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the paddingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaddingMethod }
     *     
     */
    public PaddingMethod getPaddingMethod() {
        return paddingMethod;
    }

    /**
     * Sets the value of the paddingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaddingMethod }
     *     
     */
    public void setPaddingMethod(PaddingMethod value) {
        this.paddingMethod = value;
    }

}
