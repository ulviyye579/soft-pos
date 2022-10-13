
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImportHmacKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportHmacKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zmk" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey" minOccurs="0"/&gt;
 *         &lt;element name="ExtKey"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="ExtKeyForm" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DigestMethod" type="{http://schemas.tranzaxis.com/crypto.xsd}DigestMethod" default="SHA1" /&gt;
 *       &lt;attribute name="KeyLength" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
@XmlType(name = "ImportHmacKeyRq", propOrder = {
    "zmk",
    "extKey"
})
public class ImportHmacKeyRq {

    @XmlElement(name = "Zmk")
    protected IntKey zmk;
    @XmlElement(name = "ExtKey", required = true)
    protected ImportHmacKeyRq.ExtKey extKey;
    @XmlAttribute(name = "DigestMethod")
    protected DigestMethod digestMethod;
    @XmlAttribute(name = "KeyLength")
    protected Long keyLength;
    @XmlAttribute(name = "IntKeyForm")
    protected KeyIntForm intKeyForm;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "StationName")
    protected String stationName;

    /**
     * Gets the value of the zmk property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getZmk() {
        return zmk;
    }

    /**
     * Sets the value of the zmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setZmk(IntKey value) {
        this.zmk = value;
    }

    /**
     * Gets the value of the extKey property.
     * 
     * @return
     *     possible object is
     *     {@link ImportHmacKeyRq.ExtKey }
     *     
     */
    public ImportHmacKeyRq.ExtKey getExtKey() {
        return extKey;
    }

    /**
     * Sets the value of the extKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHmacKeyRq.ExtKey }
     *     
     */
    public void setExtKey(ImportHmacKeyRq.ExtKey value) {
        this.extKey = value;
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
        if (digestMethod == null) {
            return DigestMethod.SHA_1;
        } else {
            return digestMethod;
        }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="ExtKeyForm" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtKey {

        @XmlAttribute(name = "Value", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] value;
        @XmlAttribute(name = "ExtKeyForm", required = true)
        protected KeyExtForm extKeyForm;

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

    }

}
