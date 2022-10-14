
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenRsaKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenRsaKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="KeyLen" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="PublicExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IntKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyIntForm" default="Id" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "GenRsaKeyRq")
public class GenRsaKeyRq {

    @XmlAttribute(name = "KeyLen", required = true)
    protected long keyLen;
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
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

}
