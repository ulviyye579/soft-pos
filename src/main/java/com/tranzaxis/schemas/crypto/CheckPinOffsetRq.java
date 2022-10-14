
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPinOffsetRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPinOffsetRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}CalcPinOffsetRq"&gt;
 *       &lt;attribute name="PinOffset" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPinOffsetRq")
public class CheckPinOffsetRq
    extends CalcPinOffsetRq
{

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
