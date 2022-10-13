
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImportRsaKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRsaKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kek" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="Modulus" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="PrivateExponent" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="PublicExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IntKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyIntForm" default="Id" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StationName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Form" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRsaKeyRq", propOrder = {
    "kek"
})
public class ImportRsaKeyRq {

    @XmlElement(name = "Kek", required = true)
    protected IntTypedKey kek;
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
    @XmlAttribute(name = "Modulus", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] modulus;
    @XmlAttribute(name = "PrivateExponent", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] privateExponent;
    @XmlAttribute(name = "PublicExponent")
    protected Long publicExponent;
    @XmlAttribute(name = "IntKeyForm")
    protected KeyIntForm intKeyForm;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;
    @XmlAttribute(name = "Form")
    protected KeyExtForm form;

    /**
     * Gets the value of the kek property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getKek() {
        return kek;
    }

    /**
     * Sets the value of the kek property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setKek(IntTypedKey value) {
        this.kek = value;
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
     * Gets the value of the privateExponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPrivateExponent() {
        return privateExponent;
    }

    /**
     * Sets the value of the privateExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateExponent(byte[] value) {
        this.privateExponent = value;
    }

    /**
     * Gets the value of the publicExponent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPublicExponent() {
        return publicExponent;
    }

    /**
     * Sets the value of the publicExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPublicExponent(Long value) {
        this.publicExponent = value;
    }

    /**
     * Gets the value of the intKeyForm property.
     * 
     * @return
     *     possible object is
     *     {@link KeyIntForm }
     *     
     */
    public KeyIntForm getIntKeyForm() {
        if (intKeyForm == null) {
            return KeyIntForm.ID;
        } else {
            return intKeyForm;
        }
    }

    /**
     * Sets the value of the intKeyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyIntForm }
     *     
     */
    public void setIntKeyForm(KeyIntForm value) {
        this.intKeyForm = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
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
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExtForm }
     *     
     */
    public KeyExtForm getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExtForm }
     *     
     */
    public void setForm(KeyExtForm value) {
        this.form = value;
    }

}
