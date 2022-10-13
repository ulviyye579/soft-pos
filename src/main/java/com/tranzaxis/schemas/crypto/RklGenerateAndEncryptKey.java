
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RklGenerateAndEncryptKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklGenerateAndEncryptKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RklGenerateAndEncryptKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RklGenerateAndEncryptKeyRq"/&gt;
 *         &lt;element name="RklGenerateAndEncryptKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RklGenerateAndEncryptKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklGenerateAndEncryptKey", propOrder = {
    "rklGenerateAndEncryptKeyRq",
    "rklGenerateAndEncryptKeyRs"
})
public class RklGenerateAndEncryptKey {

    @XmlElement(name = "RklGenerateAndEncryptKeyRq")
    protected RklGenerateAndEncryptKeyRq rklGenerateAndEncryptKeyRq;
    @XmlElement(name = "RklGenerateAndEncryptKeyRs")
    protected RklGenerateAndEncryptKeyRs rklGenerateAndEncryptKeyRs;

    /**
     * Gets the value of the rklGenerateAndEncryptKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link RklGenerateAndEncryptKeyRq }
     *     
     */
    public RklGenerateAndEncryptKeyRq getRklGenerateAndEncryptKeyRq() {
        return rklGenerateAndEncryptKeyRq;
    }

    /**
     * Sets the value of the rklGenerateAndEncryptKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklGenerateAndEncryptKeyRq }
     *     
     */
    public void setRklGenerateAndEncryptKeyRq(RklGenerateAndEncryptKeyRq value) {
        this.rklGenerateAndEncryptKeyRq = value;
    }

    /**
     * Gets the value of the rklGenerateAndEncryptKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link RklGenerateAndEncryptKeyRs }
     *     
     */
    public RklGenerateAndEncryptKeyRs getRklGenerateAndEncryptKeyRs() {
        return rklGenerateAndEncryptKeyRs;
    }

    /**
     * Sets the value of the rklGenerateAndEncryptKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklGenerateAndEncryptKeyRs }
     *     
     */
    public void setRklGenerateAndEncryptKeyRs(RklGenerateAndEncryptKeyRs value) {
        this.rklGenerateAndEncryptKeyRs = value;
    }

}
