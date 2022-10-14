
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsaSign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaSign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RsaSignRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RsaSignRq"/&gt;
 *         &lt;element name="RsaSignRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RsaSignRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaSign", propOrder = {
    "rsaSignRq",
    "rsaSignRs"
})
public class RsaSign {

    @XmlElement(name = "RsaSignRq")
    protected RsaSignRq rsaSignRq;
    @XmlElement(name = "RsaSignRs")
    protected RsaSignRs rsaSignRs;

    /**
     * Gets the value of the rsaSignRq property.
     * 
     * @return
     *     possible object is
     *     {@link RsaSignRq }
     *     
     */
    public RsaSignRq getRsaSignRq() {
        return rsaSignRq;
    }

    /**
     * Sets the value of the rsaSignRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaSignRq }
     *     
     */
    public void setRsaSignRq(RsaSignRq value) {
        this.rsaSignRq = value;
    }

    /**
     * Gets the value of the rsaSignRs property.
     * 
     * @return
     *     possible object is
     *     {@link RsaSignRs }
     *     
     */
    public RsaSignRs getRsaSignRs() {
        return rsaSignRs;
    }

    /**
     * Sets the value of the rsaSignRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaSignRs }
     *     
     */
    public void setRsaSignRs(RsaSignRs value) {
        this.rsaSignRs = value;
    }

}
