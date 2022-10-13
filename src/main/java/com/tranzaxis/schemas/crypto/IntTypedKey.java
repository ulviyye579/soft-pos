
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
 * <p>Java class for IntTypedKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntTypedKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Id"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Crypto"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
 *                 &lt;attribute name="KeyLength" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntTypedKey", propOrder = {
    "id",
    "crypto"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.crypto.GenKeyRq.MasterKey.class,
    com.tranzaxis.schemas.crypto.GenKeyRq.BaseDeriveKey.class
})
public class IntTypedKey {

    @XmlElement(name = "Id")
    protected IntTypedKey.Id id;
    @XmlElement(name = "Crypto")
    protected IntTypedKey.Crypto crypto;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey.Id }
     *     
     */
    public IntTypedKey.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey.Id }
     *     
     */
    public void setId(IntTypedKey.Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey.Crypto }
     *     
     */
    public IntTypedKey.Crypto getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey.Crypto }
     *     
     */
    public void setCrypto(IntTypedKey.Crypto value) {
        this.crypto = value;
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
     *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyKind" /&gt;
     *       &lt;attribute name="KeyLength" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Crypto {

        @XmlAttribute(name = "Kind", required = true)
        protected KeyKind kind;
        @XmlAttribute(name = "KeyLength")
        protected Long keyLength;
        @XmlAttribute(name = "Value", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] value;

        /**
         * Gets the value of the kind property.
         * 
         * @return
         *     possible object is
         *     {@link KeyKind }
         *     
         */
        public KeyKind getKind() {
            return kind;
        }

        /**
         * Sets the value of the kind property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyKind }
         *     
         */
        public void setKind(KeyKind value) {
            this.kind = value;
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
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Id {

        @XmlAttribute(name = "Value", required = true)
        protected long value;

        /**
         * Gets the value of the value property.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

    }

}
