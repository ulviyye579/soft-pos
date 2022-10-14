
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zmk"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"&gt;
 *                 &lt;attribute name="AtallaVariant" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KeyInt" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *         &lt;element name="KeyBlockFormat" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockFormat"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportKeyRq", propOrder = {
    "zmk",
    "keyInt",
    "keyBlockFormat"
})
public class ExportKeyRq {

    @XmlElement(name = "Zmk", required = true)
    protected ExportKeyRq.Zmk zmk;
    @XmlElement(name = "KeyInt", required = true)
    protected IntTypedKey keyInt;
    @XmlElement(name = "KeyBlockFormat", required = true)
    protected KeyBlockFormat keyBlockFormat;

    /**
     * Gets the value of the zmk property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyRq.Zmk }
     *     
     */
    public ExportKeyRq.Zmk getZmk() {
        return zmk;
    }

    /**
     * Sets the value of the zmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyRq.Zmk }
     *     
     */
    public void setZmk(ExportKeyRq.Zmk value) {
        this.zmk = value;
    }

    /**
     * Gets the value of the keyInt property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getKeyInt() {
        return keyInt;
    }

    /**
     * Sets the value of the keyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setKeyInt(IntTypedKey value) {
        this.keyInt = value;
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
