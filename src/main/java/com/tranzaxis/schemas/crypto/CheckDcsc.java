
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckDcsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckDcsc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckDcscRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckDcscRq"/&gt;
 *         &lt;element name="CheckDcscRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckDcscRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckDcsc", propOrder = {
    "checkDcscRq",
    "checkDcscRs"
})
public class CheckDcsc {

    @XmlElement(name = "CheckDcscRq")
    protected CheckDcscRq checkDcscRq;
    @XmlElement(name = "CheckDcscRs")
    protected CheckDcscRs checkDcscRs;

    /**
     * Gets the value of the checkDcscRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDcscRq }
     *     
     */
    public CheckDcscRq getCheckDcscRq() {
        return checkDcscRq;
    }

    /**
     * Sets the value of the checkDcscRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDcscRq }
     *     
     */
    public void setCheckDcscRq(CheckDcscRq value) {
        this.checkDcscRq = value;
    }

    /**
     * Gets the value of the checkDcscRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDcscRs }
     *     
     */
    public CheckDcscRs getCheckDcscRs() {
        return checkDcscRs;
    }

    /**
     * Sets the value of the checkDcscRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDcscRs }
     *     
     */
    public void setCheckDcscRs(CheckDcscRs value) {
        this.checkDcscRs = value;
    }

}
