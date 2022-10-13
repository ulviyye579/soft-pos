
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImportKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="Form" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Zmk" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"&gt;
 *                 &lt;attribute name="AtallaVariant" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyKind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *       &lt;attribute name="KeyLength" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IntKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyIntForm" default="Id" /&gt;
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
@XmlType(name = "ImportKeyRq", propOrder = {
    "key",
    "zmk"
})
public class ImportKeyRq {

    @XmlElement(name = "Key", required = true)
    protected ImportKeyRq.Key key;
    @XmlElement(name = "Zmk")
    protected ImportKeyRq.Zmk zmk;
    @XmlAttribute(name = "KeyKind", required = true)
    protected KeyKind keyKind;
    @XmlAttribute(name = "KeyLength")
    protected Long keyLength;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "IntKeyForm")
    protected KeyIntForm intKeyForm;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ImportKeyRq.Key }
     *     
     */
    public ImportKeyRq.Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportKeyRq.Key }
     *     
     */
    public void setKey(ImportKeyRq.Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the zmk property.
     * 
     * @return
     *     possible object is
     *     {@link ImportKeyRq.Zmk }
     *     
     */
    public ImportKeyRq.Zmk getZmk() {
        return zmk;
    }

    /**
     * Sets the value of the zmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportKeyRq.Zmk }
     *     
     */
    public void setZmk(ImportKeyRq.Zmk value) {
        this.zmk = value;
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
     * Gets the value of the keyLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyLength(Long value) {
        this.keyLength = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="Form" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Key {

        @XmlAttribute(name = "Value", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] value;
        @XmlAttribute(name = "Form", required = true)
        protected KeyExtForm form;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(byte[] value) {
            this.value = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"&gt;
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
    public static class Zmk
        extends IntKey
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
