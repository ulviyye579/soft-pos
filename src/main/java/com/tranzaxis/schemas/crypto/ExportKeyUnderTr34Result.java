
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExportKeyUnderTr34Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportKeyUnderTr34Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthAttrs" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="EnvelopedData" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="Signature" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyCheck" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportKeyUnderTr34Result", propOrder = {
    "authAttrs",
    "envelopedData",
    "signature"
})
@XmlSeeAlso({
    ExportKeyUnderTr34Rs.class
})
public class ExportKeyUnderTr34Result {

    @XmlElement(name = "AuthAttrs", required = true)
    protected byte[] authAttrs;
    @XmlElement(name = "EnvelopedData", required = true)
    protected byte[] envelopedData;
    @XmlElement(name = "Signature", required = true)
    protected byte[] signature;
    @XmlAttribute(name = "KeyCheck")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] keyCheck;

    /**
     * Gets the value of the authAttrs property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthAttrs() {
        return authAttrs;
    }

    /**
     * Sets the value of the authAttrs property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthAttrs(byte[] value) {
        this.authAttrs = value;
    }

    /**
     * Gets the value of the envelopedData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEnvelopedData() {
        return envelopedData;
    }

    /**
     * Sets the value of the envelopedData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEnvelopedData(byte[] value) {
        this.envelopedData = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the keyCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKeyCheck() {
        return keyCheck;
    }

    /**
     * Sets the value of the keyCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCheck(byte[] value) {
        this.keyCheck = value;
    }

}
