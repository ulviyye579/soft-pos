
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterKey" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"&gt;
 *                 &lt;attribute name="AtallaVariant" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BaseDeriveKey" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"&gt;
 *                 &lt;attribute name="Ksn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KeyBlockFormat" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockFormat"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="KeyLen" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyLen" /&gt;
 *       &lt;attribute name="IntKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyIntForm" default="Id" /&gt;
 *       &lt;attribute name="ExtKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
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
@XmlType(name = "GenKeyRq", propOrder = {
    "masterKey",
    "baseDeriveKey",
    "keyBlockFormat"
})
public class GenKeyRq {

    @XmlElement(name = "MasterKey")
    protected GenKeyRq.MasterKey masterKey;
    @XmlElement(name = "BaseDeriveKey")
    protected GenKeyRq.BaseDeriveKey baseDeriveKey;
    @XmlElement(name = "KeyBlockFormat", required = true)
    protected KeyBlockFormat keyBlockFormat;
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
    @XmlAttribute(name = "KeyLen", required = true)
    protected long keyLen;
    @XmlAttribute(name = "IntKeyForm")
    protected KeyIntForm intKeyForm;
    @XmlAttribute(name = "ExtKeyForm")
    protected KeyExtForm extKeyForm;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;

    /**
     * Gets the value of the masterKey property.
     * 
     * @return
     *     possible object is
     *     {@link GenKeyRq.MasterKey }
     *     
     */
    public GenKeyRq.MasterKey getMasterKey() {
        return masterKey;
    }

    /**
     * Sets the value of the masterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenKeyRq.MasterKey }
     *     
     */
    public void setMasterKey(GenKeyRq.MasterKey value) {
        this.masterKey = value;
    }

    /**
     * Gets the value of the baseDeriveKey property.
     * 
     * @return
     *     possible object is
     *     {@link GenKeyRq.BaseDeriveKey }
     *     
     */
    public GenKeyRq.BaseDeriveKey getBaseDeriveKey() {
        return baseDeriveKey;
    }

    /**
     * Sets the value of the baseDeriveKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenKeyRq.BaseDeriveKey }
     *     
     */
    public void setBaseDeriveKey(GenKeyRq.BaseDeriveKey value) {
        this.baseDeriveKey = value;
    }

    /**
     * Gets the value of the keyBlockFormat property.
     * 
     * @return
     *     possible object is
     *     {@link KeyBlockFormat }
     *     
     */
    public KeyBlockFormat getKeyBlockFormat() {
        return keyBlockFormat;
    }

    /**
     * Sets the value of the keyBlockFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyBlockFormat }
     *     
     */
    public void setKeyBlockFormat(KeyBlockFormat value) {
        this.keyBlockFormat = value;
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
     * Gets the value of the extKeyForm property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExtForm }
     *     
     */
    public KeyExtForm getExtKeyForm() {
        return extKeyForm;
    }

    /**
     * Sets the value of the extKeyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExtForm }
     *     
     */
    public void setExtKeyForm(KeyExtForm value) {
        this.extKeyForm = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"&gt;
     *       &lt;attribute name="Ksn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseDeriveKey
        extends IntTypedKey
    {

        @XmlAttribute(name = "Ksn")
        protected String ksn;

        /**
         * Gets the value of the ksn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKsn() {
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
        public void setKsn(String value) {
            this.ksn = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"&gt;
     *       &lt;attribute name="AtallaVariant" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterKey
        extends IntTypedKey
    {

        @XmlAttribute(name = "AtallaVariant")
        protected Long atallaVariant;

        /**
         * Gets the value of the atallaVariant property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAtallaVariant() {
            return atallaVariant;
        }

        /**
         * Sets the value of the atallaVariant property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAtallaVariant(Long value) {
            this.atallaVariant = value;
        }

    }

}
