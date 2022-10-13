
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebuildPinBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebuildPinBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RebuildPinBlockRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RebuildPinBlockRq"/&gt;
 *         &lt;element name="RebuildPinBlockRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RebuildPinBlockRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebuildPinBlock", propOrder = {
    "rebuildPinBlockRq",
    "rebuildPinBlockRs"
})
public class RebuildPinBlock {

    @XmlElement(name = "RebuildPinBlockRq")
    protected RebuildPinBlockRq rebuildPinBlockRq;
    @XmlElement(name = "RebuildPinBlockRs")
    protected RebuildPinBlockRs rebuildPinBlockRs;

    /**
     * Gets the value of the rebuildPinBlockRq property.
     * 
     * @return
     *     possible object is
     *     {@link RebuildPinBlockRq }
     *     
     */
    public RebuildPinBlockRq getRebuildPinBlockRq() {
        return rebuildPinBlockRq;
    }

    /**
     * Sets the value of the rebuildPinBlockRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebuildPinBlockRq }
     *     
     */
    public void setRebuildPinBlockRq(RebuildPinBlockRq value) {
        this.rebuildPinBlockRq = value;
    }

    /**
     * Gets the value of the rebuildPinBlockRs property.
     * 
     * @return
     *     possible object is
     *     {@link RebuildPinBlockRs }
     *     
     */
    public RebuildPinBlockRs getRebuildPinBlockRs() {
        return rebuildPinBlockRs;
    }

    /**
     * Sets the value of the rebuildPinBlockRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebuildPinBlockRs }
     *     
     */
    public void setRebuildPinBlockRs(RebuildPinBlockRs value) {
        this.rebuildPinBlockRs = value;
    }

}
