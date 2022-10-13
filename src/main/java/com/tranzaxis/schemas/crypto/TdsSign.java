
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdsSign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdsSign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TdsSignRq" type="{http://schemas.tranzaxis.com/crypto.xsd}TdsSignRq"/&gt;
 *         &lt;element name="TdsSignRs" type="{http://schemas.tranzaxis.com/crypto.xsd}TdsSignRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdsSign", propOrder = {
    "tdsSignRq",
    "tdsSignRs"
})
public class TdsSign {

    @XmlElement(name = "TdsSignRq")
    protected TdsSignRq tdsSignRq;
    @XmlElement(name = "TdsSignRs")
    protected TdsSignRs tdsSignRs;

    /**
     * Gets the value of the tdsSignRq property.
     * 
     * @return
     *     possible object is
     *     {@link TdsSignRq }
     *     
     */
    public TdsSignRq getTdsSignRq() {
        return tdsSignRq;
    }

    /**
     * Sets the value of the tdsSignRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsSignRq }
     *     
     */
    public void setTdsSignRq(TdsSignRq value) {
        this.tdsSignRq = value;
    }

    /**
     * Gets the value of the tdsSignRs property.
     * 
     * @return
     *     possible object is
     *     {@link TdsSignRs }
     *     
     */
    public TdsSignRs getTdsSignRs() {
        return tdsSignRs;
    }

    /**
     * Sets the value of the tdsSignRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsSignRs }
     *     
     */
    public void setTdsSignRs(TdsSignRs value) {
        this.tdsSignRs = value;
    }

}
