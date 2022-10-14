
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportRsaKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportRsaKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RsaKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *         &lt;element name="Kek" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExtForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportRsaKeyRq", propOrder = {
    "rsaKey",
    "kek"
})
public class ExportRsaKeyRq {

    @XmlElement(name = "RsaKey", required = true)
    protected IntTypedRsaKey rsaKey;
    @XmlElement(name = "Kek", required = true)
    protected IntTypedKey kek;
    @XmlAttribute(name = "ExtForm")
    protected KeyExtForm extForm;

    /**
     * Gets the value of the rsaKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getRsaKey() {
        return rsaKey;
    }

    /**
     * Sets the value of the rsaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setRsaKey(IntTypedRsaKey value) {
        this.rsaKey = value;
    }

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
     * Gets the value of the extForm property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExtForm }
     *     
     */
    public KeyExtForm getExtForm() {
        return extForm;
    }

    /**
     * Sets the value of the extForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExtForm }
     *     
     */
    public void setExtForm(KeyExtForm value) {
        this.extForm = value;
    }

}
