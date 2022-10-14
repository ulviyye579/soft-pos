
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckMacDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckMacDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckMacDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckMacDukptRq"/&gt;
 *         &lt;element name="CheckMacDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckMacDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckMacDukpt", propOrder = {
    "checkMacDukptRq",
    "checkMacDukptRs"
})
public class CheckMacDukpt {

    @XmlElement(name = "CheckMacDukptRq")
    protected CheckMacDukptRq checkMacDukptRq;
    @XmlElement(name = "CheckMacDukptRs")
    protected CheckMacDukptRs checkMacDukptRs;

    /**
     * Gets the value of the checkMacDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMacDukptRq }
     *     
     */
    public CheckMacDukptRq getCheckMacDukptRq() {
        return checkMacDukptRq;
    }

    /**
     * Sets the value of the checkMacDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMacDukptRq }
     *     
     */
    public void setCheckMacDukptRq(CheckMacDukptRq value) {
        this.checkMacDukptRq = value;
    }

    /**
     * Gets the value of the checkMacDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMacDukptRs }
     *     
     */
    public CheckMacDukptRs getCheckMacDukptRs() {
        return checkMacDukptRs;
    }

    /**
     * Sets the value of the checkMacDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMacDukptRs }
     *     
     */
    public void setCheckMacDukptRs(CheckMacDukptRs value) {
        this.checkMacDukptRs = value;
    }

}
