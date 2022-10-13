
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JweEncode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JweEncode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="JweEncodeRq" type="{http://schemas.tranzaxis.com/crypto.xsd}JweEncodeRq"/&gt;
 *         &lt;element name="JweEncodeRs" type="{http://schemas.tranzaxis.com/crypto.xsd}JweEncodeRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JweEncode", propOrder = {
    "jweEncodeRq",
    "jweEncodeRs"
})
public class JweEncode {

    @XmlElement(name = "JweEncodeRq")
    protected JweEncodeRq jweEncodeRq;
    @XmlElement(name = "JweEncodeRs")
    protected JweEncodeRs jweEncodeRs;

    /**
     * Gets the value of the jweEncodeRq property.
     * 
     * @return
     *     possible object is
     *     {@link JweEncodeRq }
     *     
     */
    public JweEncodeRq getJweEncodeRq() {
        return jweEncodeRq;
    }

    /**
     * Sets the value of the jweEncodeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JweEncodeRq }
     *     
     */
    public void setJweEncodeRq(JweEncodeRq value) {
        this.jweEncodeRq = value;
    }

    /**
     * Gets the value of the jweEncodeRs property.
     * 
     * @return
     *     possible object is
     *     {@link JweEncodeRs }
     *     
     */
    public JweEncodeRs getJweEncodeRs() {
        return jweEncodeRs;
    }

    /**
     * Sets the value of the jweEncodeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JweEncodeRs }
     *     
     */
    public void setJweEncodeRs(JweEncodeRs value) {
        this.jweEncodeRs = value;
    }

}
