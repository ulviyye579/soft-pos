
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JwtEncode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JwtEncode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="JwtEncodeRq" type="{http://schemas.tranzaxis.com/crypto.xsd}JwtEncodeRq"/&gt;
 *         &lt;element name="JwtEncodeRs" type="{http://schemas.tranzaxis.com/crypto.xsd}JwtEncodeRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JwtEncode", propOrder = {
    "jwtEncodeRq",
    "jwtEncodeRs"
})
public class JwtEncode {

    @XmlElement(name = "JwtEncodeRq")
    protected JwtEncodeRq jwtEncodeRq;
    @XmlElement(name = "JwtEncodeRs")
    protected JwtEncodeRs jwtEncodeRs;

    /**
     * Gets the value of the jwtEncodeRq property.
     * 
     * @return
     *     possible object is
     *     {@link JwtEncodeRq }
     *     
     */
    public JwtEncodeRq getJwtEncodeRq() {
        return jwtEncodeRq;
    }

    /**
     * Sets the value of the jwtEncodeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JwtEncodeRq }
     *     
     */
    public void setJwtEncodeRq(JwtEncodeRq value) {
        this.jwtEncodeRq = value;
    }

    /**
     * Gets the value of the jwtEncodeRs property.
     * 
     * @return
     *     possible object is
     *     {@link JwtEncodeRs }
     *     
     */
    public JwtEncodeRs getJwtEncodeRs() {
        return jwtEncodeRs;
    }

    /**
     * Sets the value of the jwtEncodeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JwtEncodeRs }
     *     
     */
    public void setJwtEncodeRs(JwtEncodeRs value) {
        this.jwtEncodeRs = value;
    }

}
