
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsaVerify complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaVerify"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RsaVerifyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RsaVerifyRq"/&gt;
 *         &lt;element name="RsaVerifyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RsaVerifyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaVerify", propOrder = {
    "rsaVerifyRq",
    "rsaVerifyRs"
})
public class RsaVerify {

    @XmlElement(name = "RsaVerifyRq")
    protected RsaVerifyRq rsaVerifyRq;
    @XmlElement(name = "RsaVerifyRs")
    protected RsaVerifyRs rsaVerifyRs;

    /**
     * Gets the value of the rsaVerifyRq property.
     * 
     * @return
     *     possible object is
     *     {@link RsaVerifyRq }
     *     
     */
    public RsaVerifyRq getRsaVerifyRq() {
        return rsaVerifyRq;
    }

    /**
     * Sets the value of the rsaVerifyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaVerifyRq }
     *     
     */
    public void setRsaVerifyRq(RsaVerifyRq value) {
        this.rsaVerifyRq = value;
    }

    /**
     * Gets the value of the rsaVerifyRs property.
     * 
     * @return
     *     possible object is
     *     {@link RsaVerifyRs }
     *     
     */
    public RsaVerifyRs getRsaVerifyRs() {
        return rsaVerifyRs;
    }

    /**
     * Sets the value of the rsaVerifyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaVerifyRs }
     *     
     */
    public void setRsaVerifyRs(RsaVerifyRs value) {
        this.rsaVerifyRs = value;
    }

}
