
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckArqc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckArqc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckArqcRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckArqcRq"/&gt;
 *         &lt;element name="CheckArqcRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckArqcRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckArqc", propOrder = {
    "checkArqcRq",
    "checkArqcRs"
})
public class CheckArqc {

    @XmlElement(name = "CheckArqcRq")
    protected CheckArqcRq checkArqcRq;
    @XmlElement(name = "CheckArqcRs")
    protected CheckArqcRs checkArqcRs;

    /**
     * Gets the value of the checkArqcRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckArqcRq }
     *     
     */
    public CheckArqcRq getCheckArqcRq() {
        return checkArqcRq;
    }

    /**
     * Sets the value of the checkArqcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckArqcRq }
     *     
     */
    public void setCheckArqcRq(CheckArqcRq value) {
        this.checkArqcRq = value;
    }

    /**
     * Gets the value of the checkArqcRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckArqcRs }
     *     
     */
    public CheckArqcRs getCheckArqcRs() {
        return checkArqcRs;
    }

    /**
     * Sets the value of the checkArqcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckArqcRs }
     *     
     */
    public void setCheckArqcRs(CheckArqcRs value) {
        this.checkArqcRs = value;
    }

}
