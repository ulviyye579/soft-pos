
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdsSignRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdsSignRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Signature" type="{http://schemas.tranzaxis.com/crypto.xsd}RsaSignature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdsSignRs", propOrder = {
    "signature"
})
public class TdsSignRs {

    @XmlElement(name = "Signature", required = true)
    protected RsaSignature signature;

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link RsaSignature }
     *     
     */
    public RsaSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaSignature }
     *     
     */
    public void setSignature(RsaSignature value) {
        this.signature = value;
    }

}
