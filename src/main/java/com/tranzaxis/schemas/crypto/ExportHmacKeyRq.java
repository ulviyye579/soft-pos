
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportHmacKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportHmacKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtKeyForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm"/&gt;
 *         &lt;element name="Zmk" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *         &lt;element name="KeyInt" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportHmacKeyRq", propOrder = {
    "extKeyForm",
    "zmk",
    "keyInt"
})
public class ExportHmacKeyRq {

    @XmlElement(name = "ExtKeyForm", required = true)
    @XmlSchemaType(name = "string")
    protected KeyExtForm extKeyForm;
    @XmlElement(name = "Zmk", required = true)
    protected IntTypedKey zmk;
    @XmlElement(name = "KeyInt", required = true)
    protected IntTypedKey keyInt;

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
     * Gets the value of the zmk property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedKey }
     *     
     */
    public IntTypedKey getZmk() {
        return zmk;
    }

    /**
     * Sets the value of the zmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedKey }
     *     
     */
    public void setZmk(IntTypedKey value) {
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

}
