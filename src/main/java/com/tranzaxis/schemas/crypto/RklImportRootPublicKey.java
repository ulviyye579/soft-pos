
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RklImportRootPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklImportRootPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RklImportRootPublicKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RklImportRootPublicKeyRq"/&gt;
 *         &lt;element name="RklImportRootPublicKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RklImportRootPublicKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklImportRootPublicKey", propOrder = {
    "rklImportRootPublicKeyRq",
    "rklImportRootPublicKeyRs"
})
public class RklImportRootPublicKey {

    @XmlElement(name = "RklImportRootPublicKeyRq")
    protected RklImportRootPublicKeyRq rklImportRootPublicKeyRq;
    @XmlElement(name = "RklImportRootPublicKeyRs")
    protected RklImportRootPublicKeyRs rklImportRootPublicKeyRs;

    /**
     * Gets the value of the rklImportRootPublicKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link RklImportRootPublicKeyRq }
     *     
     */
    public RklImportRootPublicKeyRq getRklImportRootPublicKeyRq() {
        return rklImportRootPublicKeyRq;
    }

    /**
     * Sets the value of the rklImportRootPublicKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklImportRootPublicKeyRq }
     *     
     */
    public void setRklImportRootPublicKeyRq(RklImportRootPublicKeyRq value) {
        this.rklImportRootPublicKeyRq = value;
    }

    /**
     * Gets the value of the rklImportRootPublicKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link RklImportRootPublicKeyRs }
     *     
     */
    public RklImportRootPublicKeyRs getRklImportRootPublicKeyRs() {
        return rklImportRootPublicKeyRs;
    }

    /**
     * Sets the value of the rklImportRootPublicKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklImportRootPublicKeyRs }
     *     
     */
    public void setRklImportRootPublicKeyRs(RklImportRootPublicKeyRs value) {
        this.rklImportRootPublicKeyRs = value;
    }

}
