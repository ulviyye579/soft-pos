
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JwtDecode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JwtDecode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="JwtDecodeRq" type="{http://schemas.tranzaxis.com/crypto.xsd}JwtDecodeRq"/&gt;
 *         &lt;element name="JwtDecodeRs" type="{http://schemas.tranzaxis.com/crypto.xsd}JwtDecodeRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JwtDecode", propOrder = {
    "jwtDecodeRq",
    "jwtDecodeRs"
})
public class JwtDecode {

    @XmlElement(name = "JwtDecodeRq")
    protected JwtDecodeRq jwtDecodeRq;
    @XmlElement(name = "JwtDecodeRs")
    protected JwtDecodeRs jwtDecodeRs;

    /**
     * Gets the value of the jwtDecodeRq property.
     * 
     * @return
     *     possible object is
     *     {@link JwtDecodeRq }
     *     
     */
    public JwtDecodeRq getJwtDecodeRq() {
        return jwtDecodeRq;
    }

    /**
     * Sets the value of the jwtDecodeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JwtDecodeRq }
     *     
     */
    public void setJwtDecodeRq(JwtDecodeRq value) {
        this.jwtDecodeRq = value;
    }

    /**
     * Gets the value of the jwtDecodeRs property.
     * 
     * @return
     *     possible object is
     *     {@link JwtDecodeRs }
     *     
     */
    public JwtDecodeRs getJwtDecodeRs() {
        return jwtDecodeRs;
    }

    /**
     * Sets the value of the jwtDecodeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JwtDecodeRs }
     *     
     */
    public void setJwtDecodeRs(JwtDecodeRs value) {
        this.jwtDecodeRs = value;
    }

}
