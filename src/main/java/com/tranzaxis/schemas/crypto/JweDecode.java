
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JweDecode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JweDecode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="JweDecodeRq" type="{http://schemas.tranzaxis.com/crypto.xsd}JweDecodeRq"/&gt;
 *         &lt;element name="JweDecodeRs" type="{http://schemas.tranzaxis.com/crypto.xsd}JweDecodeRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JweDecode", propOrder = {
    "jweDecodeRq",
    "jweDecodeRs"
})
public class JweDecode {

    @XmlElement(name = "JweDecodeRq")
    protected JweDecodeRq jweDecodeRq;
    @XmlElement(name = "JweDecodeRs")
    protected JweDecodeRs jweDecodeRs;

    /**
     * Gets the value of the jweDecodeRq property.
     * 
     * @return
     *     possible object is
     *     {@link JweDecodeRq }
     *     
     */
    public JweDecodeRq getJweDecodeRq() {
        return jweDecodeRq;
    }

    /**
     * Sets the value of the jweDecodeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JweDecodeRq }
     *     
     */
    public void setJweDecodeRq(JweDecodeRq value) {
        this.jweDecodeRq = value;
    }

    /**
     * Gets the value of the jweDecodeRs property.
     * 
     * @return
     *     possible object is
     *     {@link JweDecodeRs }
     *     
     */
    public JweDecodeRs getJweDecodeRs() {
        return jweDecodeRs;
    }

    /**
     * Sets the value of the jweDecodeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JweDecodeRs }
     *     
     */
    public void setJweDecodeRs(JweDecodeRs value) {
        this.jweDecodeRs = value;
    }

}
