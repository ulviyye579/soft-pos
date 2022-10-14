
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCsc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckCscRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCscRq"/&gt;
 *         &lt;element name="CheckCscRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCscRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCsc", propOrder = {
    "checkCscRq",
    "checkCscRs"
})
public class CheckCsc {

    @XmlElement(name = "CheckCscRq")
    protected CheckCscRq checkCscRq;
    @XmlElement(name = "CheckCscRs")
    protected CheckCscRs checkCscRs;

    /**
     * Gets the value of the checkCscRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCscRq }
     *     
     */
    public CheckCscRq getCheckCscRq() {
        return checkCscRq;
    }

    /**
     * Sets the value of the checkCscRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCscRq }
     *     
     */
    public void setCheckCscRq(CheckCscRq value) {
        this.checkCscRq = value;
    }

    /**
     * Gets the value of the checkCscRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCscRs }
     *     
     */
    public CheckCscRs getCheckCscRs() {
        return checkCscRs;
    }

    /**
     * Sets the value of the checkCscRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCscRs }
     *     
     */
    public void setCheckCscRs(CheckCscRs value) {
        this.checkCscRs = value;
    }

}
