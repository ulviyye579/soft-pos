
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenHmacKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenHmacKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GenHmacKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}GenHmacKeyRq"/&gt;
 *         &lt;element name="GenHmacKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}GenHmacKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenHmacKey", propOrder = {
    "genHmacKeyRq",
    "genHmacKeyRs"
})
public class GenHmacKey {

    @XmlElement(name = "GenHmacKeyRq")
    protected GenHmacKeyRq genHmacKeyRq;
    @XmlElement(name = "GenHmacKeyRs")
    protected GenHmacKeyRs genHmacKeyRs;

    /**
     * Gets the value of the genHmacKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link GenHmacKeyRq }
     *     
     */
    public GenHmacKeyRq getGenHmacKeyRq() {
        return genHmacKeyRq;
    }

    /**
     * Sets the value of the genHmacKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenHmacKeyRq }
     *     
     */
    public void setGenHmacKeyRq(GenHmacKeyRq value) {
        this.genHmacKeyRq = value;
    }

    /**
     * Gets the value of the genHmacKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link GenHmacKeyRs }
     *     
     */
    public GenHmacKeyRs getGenHmacKeyRs() {
        return genHmacKeyRs;
    }

    /**
     * Sets the value of the genHmacKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenHmacKeyRs }
     *     
     */
    public void setGenHmacKeyRs(GenHmacKeyRs value) {
        this.genHmacKeyRs = value;
    }

}
