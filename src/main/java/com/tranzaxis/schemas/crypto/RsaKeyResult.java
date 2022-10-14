
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RsaKeyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaKeyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="KeyId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PrivateKeyData" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Modulus" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaKeyResult")
public class RsaKeyResult {

    @XmlAttribute(name = "KeyId")
    protected Long keyId;
    @XmlAttribute(name = "PrivateKeyData", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] privateKeyData;
    @XmlAttribute(name = "Modulus", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] modulus;

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyId(Long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the privateKeyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPrivateKeyData() {
        return privateKeyData;
    }

    /**
     * Sets the value of the privateKeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateKeyData(byte[] value) {
        this.privateKeyData = value;
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

}
