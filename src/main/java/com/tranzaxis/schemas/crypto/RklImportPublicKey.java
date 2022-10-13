
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RklImportPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklImportPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RklImportPublicKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RklImportPublicKeyRq"/&gt;
 *         &lt;element name="RklImportPublicKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RklImportPublicKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklImportPublicKey", propOrder = {
    "rklImportPublicKeyRq",
    "rklImportPublicKeyRs"
})
public class RklImportPublicKey {

    @XmlElement(name = "RklImportPublicKeyRq")
    protected RklImportPublicKeyRq rklImportPublicKeyRq;
    @XmlElement(name = "RklImportPublicKeyRs")
    protected RklImportPublicKeyRs rklImportPublicKeyRs;

    /**
     * Gets the value of the rklImportPublicKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link RklImportPublicKeyRq }
     *     
     */
    public RklImportPublicKeyRq getRklImportPublicKeyRq() {
        return rklImportPublicKeyRq;
    }

    /**
     * Sets the value of the rklImportPublicKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklImportPublicKeyRq }
     *     
     */
    public void setRklImportPublicKeyRq(RklImportPublicKeyRq value) {
        this.rklImportPublicKeyRq = value;
    }

    /**
     * Gets the value of the rklImportPublicKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link RklImportPublicKeyRs }
     *     
     */
    public RklImportPublicKeyRs getRklImportPublicKeyRs() {
        return rklImportPublicKeyRs;
    }

    /**
     * Sets the value of the rklImportPublicKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklImportPublicKeyRs }
     *     
     */
    public void setRklImportPublicKeyRs(RklImportPublicKeyRs value) {
        this.rklImportPublicKeyRs = value;
    }

}
