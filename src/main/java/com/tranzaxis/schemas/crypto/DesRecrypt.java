
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesRecrypt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesRecrypt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DesRecryptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}DesRecryptRq"/&gt;
 *         &lt;element name="DesRecryptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}DesRecryptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesRecrypt", propOrder = {
    "desRecryptRq",
    "desRecryptRs"
})
public class DesRecrypt {

    @XmlElement(name = "DesRecryptRq")
    protected DesRecryptRq desRecryptRq;
    @XmlElement(name = "DesRecryptRs")
    protected DesRecryptRs desRecryptRs;

    /**
     * Gets the value of the desRecryptRq property.
     * 
     * @return
     *     possible object is
     *     {@link DesRecryptRq }
     *     
     */
    public DesRecryptRq getDesRecryptRq() {
        return desRecryptRq;
    }

    /**
     * Sets the value of the desRecryptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesRecryptRq }
     *     
     */
    public void setDesRecryptRq(DesRecryptRq value) {
        this.desRecryptRq = value;
    }

    /**
     * Gets the value of the desRecryptRs property.
     * 
     * @return
     *     possible object is
     *     {@link DesRecryptRs }
     *     
     */
    public DesRecryptRs getDesRecryptRs() {
        return desRecryptRs;
    }

    /**
     * Sets the value of the desRecryptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesRecryptRs }
     *     
     */
    public void setDesRecryptRs(DesRecryptRs value) {
        this.desRecryptRs = value;
    }

}
