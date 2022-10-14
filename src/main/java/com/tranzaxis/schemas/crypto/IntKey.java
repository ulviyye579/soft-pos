
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
 * <p>Java class for IntKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntKey"&gt;
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
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="Check" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
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
@XmlType(name = "IntKey", propOrder = {
    "id",
    "crypto"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.crypto.ImportKeyRq.Zmk.class,
    com.tranzaxis.schemas.crypto.ExportKeyRq.Zmk.class
})
public class IntKey {

    @XmlElement(name = "Id")
    protected IntKey.Id id;
    @XmlElement(name = "Crypto")
    protected IntKey.Crypto crypto;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey.Id }
     *     
     */
    public IntKey.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey.Id }
     *     
     */
    public void setId(IntKey.Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey.Crypto }
     *     
     */
    public IntKey.Crypto getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey.Crypto }
     *     
     */
    public void setCrypto(IntKey.Crypto value) {
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
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="Check" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
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

        @XmlAttribute(name = "Value", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] value;
        @XmlAttribute(name = "Check")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] check;

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
         * Gets the value of the check property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getCheck() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheck(byte[] value) {
            this.check = value;
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
