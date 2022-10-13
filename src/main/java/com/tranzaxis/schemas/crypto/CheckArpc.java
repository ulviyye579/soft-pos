
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckArpc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckArpc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckArpcRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckArpcRq"/&gt;
 *         &lt;element name="CheckArpcRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckArpcRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckArpc", propOrder = {
    "checkArpcRq",
    "checkArpcRs"
})
public class CheckArpc {

    @XmlElement(name = "CheckArpcRq")
    protected CheckArpcRq checkArpcRq;
    @XmlElement(name = "CheckArpcRs")
    protected CheckArpcRs checkArpcRs;

    /**
     * Gets the value of the checkArpcRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckArpcRq }
     *     
     */
    public CheckArpcRq getCheckArpcRq() {
        return checkArpcRq;
    }

    /**
     * Sets the value of the checkArpcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckArpcRq }
     *     
     */
    public void setCheckArpcRq(CheckArpcRq value) {
        this.checkArpcRq = value;
    }

    /**
     * Gets the value of the checkArpcRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckArpcRs }
     *     
     */
    public CheckArpcRs getCheckArpcRs() {
        return checkArpcRs;
    }

    /**
     * Sets the value of the checkArpcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckArpcRs }
     *     
     */
    public void setCheckArpcRs(CheckArpcRs value) {
        this.checkArpcRs = value;
    }

}
