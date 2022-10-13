
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPinOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPinOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckPinOffsetRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckPinOffsetRq"/&gt;
 *         &lt;element name="CheckPinOffsetRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckPinOffsetRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPinOffset", propOrder = {
    "checkPinOffsetRq",
    "checkPinOffsetRs"
})
public class CheckPinOffset {

    @XmlElement(name = "CheckPinOffsetRq")
    protected CheckPinOffsetRq checkPinOffsetRq;
    @XmlElement(name = "CheckPinOffsetRs")
    protected CheckPinOffsetRs checkPinOffsetRs;

    /**
     * Gets the value of the checkPinOffsetRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPinOffsetRq }
     *     
     */
    public CheckPinOffsetRq getCheckPinOffsetRq() {
        return checkPinOffsetRq;
    }

    /**
     * Sets the value of the checkPinOffsetRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPinOffsetRq }
     *     
     */
    public void setCheckPinOffsetRq(CheckPinOffsetRq value) {
        this.checkPinOffsetRq = value;
    }

    /**
     * Gets the value of the checkPinOffsetRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPinOffsetRs }
     *     
     */
    public CheckPinOffsetRs getCheckPinOffsetRs() {
        return checkPinOffsetRs;
    }

    /**
     * Sets the value of the checkPinOffsetRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPinOffsetRs }
     *     
     */
    public void setCheckPinOffsetRs(CheckPinOffsetRs value) {
        this.checkPinOffsetRs = value;
    }

}
