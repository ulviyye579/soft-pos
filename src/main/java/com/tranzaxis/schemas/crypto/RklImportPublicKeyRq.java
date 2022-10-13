
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
 * <p>Java class for RklImportPublicKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklImportPublicKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SigningKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="SignedData" type="{http://schemas.radixware.org/types.xsd}BinHex"/&gt;
 *         &lt;element name="Signature" type="{http://schemas.radixware.org/types.xsd}BinHex"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Modulus" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="PublicExponent" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DigestMethod" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}DigestMethod" /&gt;
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
@XmlType(name = "RklImportPublicKeyRq", propOrder = {
    "signingKey",
    "signedData",
    "signature"
})
public class RklImportPublicKeyRq {

    @XmlElement(name = "SigningKey", required = true)
    protected IntTypedRsaKey signingKey;
    @XmlElement(name = "SignedData", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] signedData;
    @XmlElement(name = "Signature", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] signature;
    @XmlAttribute(name = "Modulus", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] modulus;
    @XmlAttribute(name = "PublicExponent", required = true)
    protected long publicExponent;
    @XmlAttribute(name = "DigestMethod", required = true)
    protected DigestMethod digestMethod;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;

    /**
     * Gets the value of the signingKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getSigningKey() {
        return signingKey;
    }

    /**
     * Sets the value of the signingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setSigningKey(IntTypedRsaKey value) {
        this.signingKey = value;
    }

    /**
     * Gets the value of the signedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSignedData() {
        return signedData;
    }

    /**
     * Sets the value of the signedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedData(byte[] value) {
        this.signedData = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulus(byte[] value) {
        this.modulus = value;
    }

    /**
     * Gets the value of the publicExponent property.
     * 
     */
    public long getPublicExponent() {
        return publicExponent;
    }

    /**
     * Sets the value of the publicExponent property.
     * 
     */
    public void setPublicExponent(long value) {
        this.publicExponent = value;
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
