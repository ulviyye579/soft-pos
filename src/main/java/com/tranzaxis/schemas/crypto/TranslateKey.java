
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranslateKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslateKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TranslateKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}TranslateKeyRq"/&gt;
 *         &lt;element name="TranslateKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}TranslateKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslateKey", propOrder = {
    "translateKeyRq",
    "translateKeyRs"
})
public class TranslateKey {

    @XmlElement(name = "TranslateKeyRq")
    protected TranslateKeyRq translateKeyRq;
    @XmlElement(name = "TranslateKeyRs")
    protected TranslateKeyRs translateKeyRs;

    /**
     * Gets the value of the translateKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateKeyRq }
     *     
     */
    public TranslateKeyRq getTranslateKeyRq() {
        return translateKeyRq;
    }

    /**
     * Sets the value of the translateKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateKeyRq }
     *     
     */
    public void setTranslateKeyRq(TranslateKeyRq value) {
        this.translateKeyRq = value;
    }

    /**
     * Gets the value of the translateKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link TranslateKeyRs }
     *     
     */
    public TranslateKeyRs getTranslateKeyRs() {
        return translateKeyRs;
    }

    /**
     * Sets the value of the translateKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslateKeyRs }
     *     
     */
    public void setTranslateKeyRs(TranslateKeyRs value) {
        this.translateKeyRs = value;
    }

}
