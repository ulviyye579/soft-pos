
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcPinOffsetRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcPinOffsetRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PinOffset" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{4,12}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcPinOffsetRs")
public class CalcPinOffsetRs {

    @XmlAttribute(name = "PinOffset", required = true)
    protected String pinOffset;

    /**
     * Gets the value of the pinOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinOffset() {
        return pinOffset;
    }

    /**
     * Sets the value of the pinOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinOffset(String value) {
        this.pinOffset = value;
    }

}
