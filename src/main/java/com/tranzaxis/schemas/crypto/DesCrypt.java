
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesCrypt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesCrypt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DesCryptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}DesCryptRq"/&gt;
 *         &lt;element name="DesCryptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}DesCryptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesCrypt", propOrder = {
    "desCryptRq",
    "desCryptRs"
})
public class DesCrypt {

    @XmlElement(name = "DesCryptRq")
    protected DesCryptRq desCryptRq;
    @XmlElement(name = "DesCryptRs")
    protected DesCryptRs desCryptRs;

    /**
     * Gets the value of the desCryptRq property.
     * 
     * @return
     *     possible object is
     *     {@link DesCryptRq }
     *     
     */
    public DesCryptRq getDesCryptRq() {
        return desCryptRq;
    }

    /**
     * Sets the value of the desCryptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesCryptRq }
     *     
     */
    public void setDesCryptRq(DesCryptRq value) {
        this.desCryptRq = value;
    }

    /**
     * Gets the value of the desCryptRs property.
     * 
     * @return
     *     possible object is
     *     {@link DesCryptRs }
     *     
     */
    public DesCryptRs getDesCryptRs() {
        return desCryptRs;
    }

    /**
     * Sets the value of the desCryptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesCryptRs }
     *     
     */
    public void setDesCryptRs(DesCryptRs value) {
        this.desCryptRs = value;
    }

}
