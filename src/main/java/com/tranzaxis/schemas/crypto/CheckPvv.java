
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPvv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPvv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckPvvRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckPvvRq"/&gt;
 *         &lt;element name="CheckPvvRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckPvvRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPvv", propOrder = {
    "checkPvvRq",
    "checkPvvRs"
})
public class CheckPvv {

    @XmlElement(name = "CheckPvvRq")
    protected CheckPvvRq checkPvvRq;
    @XmlElement(name = "CheckPvvRs")
    protected CheckPvvRs checkPvvRs;

    /**
     * Gets the value of the checkPvvRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPvvRq }
     *     
     */
    public CheckPvvRq getCheckPvvRq() {
        return checkPvvRq;
    }

    /**
     * Sets the value of the checkPvvRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPvvRq }
     *     
     */
    public void setCheckPvvRq(CheckPvvRq value) {
        this.checkPvvRq = value;
    }

    /**
     * Gets the value of the checkPvvRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPvvRs }
     *     
     */
    public CheckPvvRs getCheckPvvRs() {
        return checkPvvRs;
    }

    /**
     * Sets the value of the checkPvvRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPvvRs }
     *     
     */
    public void setCheckPvvRs(CheckPvvRs value) {
        this.checkPvvRs = value;
    }

}
