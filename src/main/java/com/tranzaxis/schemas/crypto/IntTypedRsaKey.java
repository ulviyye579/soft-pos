
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IntTypedRsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntTypedRsaKey"&gt;
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
 *                 &lt;attribute name="Modulus" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PublicExponent" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PublicKeyblock" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="Certificate" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyData" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyP" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyQ" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyDP" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyDQ" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="PrivateKeyC12" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
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
@XmlType(name = "IntTypedRsaKey", propOrder = {
    "id",
    "crypto"
})
public class IntTypedRsaKey {

    @XmlElement(name = "Id")
    protected IntTypedRsaKey.Id id;
    @XmlElement(name = "Crypto")
    protected IntTypedRsaKey.Crypto crypto;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey.Id }
     *     
     */
    public IntTypedRsaKey.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey.Id }
     *     
     */
    public void setId(IntTypedRsaKey.Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey.Crypto }
     *     
     */
    public IntTypedRsaKey.Crypto getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey.Crypto }
     *     
     */
    public void setCrypto(IntTypedRsaKey.Crypto value) {
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
     *       &lt;attribute name="Modulus" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PublicExponent" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PublicKeyblock" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="Certificate" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyData" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyP" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyQ" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyDP" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyDQ" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="PrivateKeyC12" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
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
        @XmlAttribute(name = "Modulus", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] modulus;
        @XmlAttribute(name = "PublicExponent", required = true)
        protected long publicExponent;
        @XmlAttribute(name = "PublicKeyblock")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] publicKeyblock;
        @XmlAttribute(name = "Certificate")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] certificate;
        @XmlAttribute(name = "PrivateKeyData", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyData;
        @XmlAttribute(name = "PrivateKeyP")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyP;
        @XmlAttribute(name = "PrivateKeyQ")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyQ;
        @XmlAttribute(name = "PrivateKeyDP")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyDP;
        @XmlAttribute(name = "PrivateKeyDQ")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyDQ;
        @XmlAttribute(name = "PrivateKeyC12")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] privateKeyC12;

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
         * Gets the value of the publicKeyblock property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPublicKeyblock() {
            return publicKeyblock;
        }

        /**
         * Sets the value of the publicKeyblock property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicKeyblock(byte[] value) {
            this.publicKeyblock = value;
        }

        /**
         * Gets the value of the certificate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getCertificate() {
            return certificate;
        }

        /**
         * Sets the value of the certificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificate(byte[] value) {
            this.certificate = value;
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
         * Gets the value of the privateKeyP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPrivateKeyP() {
            return privateKeyP;
        }

        /**
         * Sets the value of the privateKeyP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateKeyP(byte[] value) {
            this.privateKeyP = value;
        }

        /**
         * Gets the value of the privateKeyQ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPrivateKeyQ() {
            return privateKeyQ;
        }

        /**
         * Sets the value of the privateKeyQ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateKeyQ(byte[] value) {
            this.privateKeyQ = value;
        }

        /**
         * Gets the value of the privateKeyDP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPrivateKeyDP() {
            return privateKeyDP;
        }

        /**
         * Sets the value of the privateKeyDP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateKeyDP(byte[] value) {
            this.privateKeyDP = value;
        }

        /**
         * Gets the value of the privateKeyDQ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPrivateKeyDQ() {
            return privateKeyDQ;
        }

        /**
         * Sets the value of the privateKeyDQ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateKeyDQ(byte[] value) {
            this.privateKeyDQ = value;
        }

        /**
         * Gets the value of the privateKeyC12 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getPrivateKeyC12() {
            return privateKeyC12;
        }

        /**
         * Sets the value of the privateKeyC12 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateKeyC12(byte[] value) {
            this.privateKeyC12 = value;
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
