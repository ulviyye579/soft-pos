
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CalcEmvMacRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcEmvMacRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Mac" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcEmvMacRs")
public class CalcEmvMacRs {

    @XmlAttribute(name = "Mac", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] mac;

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(byte[] value) {
        this.mac = value;
    }

}
