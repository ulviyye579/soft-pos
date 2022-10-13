
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EncryptDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}EncryptDukptRq"/&gt;
 *         &lt;element name="EncryptDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}EncryptDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptDukpt", propOrder = {
    "encryptDukptRq",
    "encryptDukptRs"
})
public class EncryptDukpt {

    @XmlElement(name = "EncryptDukptRq")
    protected EncryptDukptRq encryptDukptRq;
    @XmlElement(name = "EncryptDukptRs")
    protected EncryptDukptRs encryptDukptRs;

    /**
     * Gets the value of the encryptDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptDukptRq }
     *     
     */
    public EncryptDukptRq getEncryptDukptRq() {
        return encryptDukptRq;
    }

    /**
     * Sets the value of the encryptDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptDukptRq }
     *     
     */
    public void setEncryptDukptRq(EncryptDukptRq value) {
        this.encryptDukptRq = value;
    }

    /**
     * Gets the value of the encryptDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptDukptRs }
     *     
     */
    public EncryptDukptRs getEncryptDukptRs() {
        return encryptDukptRs;
    }

    /**
     * Sets the value of the encryptDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptDukptRs }
     *     
     */
    public void setEncryptDukptRs(EncryptDukptRs value) {
        this.encryptDukptRs = value;
    }

}
