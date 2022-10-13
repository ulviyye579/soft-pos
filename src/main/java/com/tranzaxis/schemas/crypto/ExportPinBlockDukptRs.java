
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExportPinBlockDukptRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportPinBlockDukptRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PinBlock" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPinBlockDukptRs")
public class ExportPinBlockDukptRs {

    @XmlAttribute(name = "PinBlock", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pinBlock;

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPinBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinBlock(byte[] value) {
        this.pinBlock = value;
    }

}
