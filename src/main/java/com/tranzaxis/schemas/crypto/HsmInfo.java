
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HsmInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HsmInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="LmkCheckValue" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HsmInfo")
@XmlSeeAlso({
    GetHsmInfoRs.class
})
public class HsmInfo {

    @XmlAttribute(name = "LmkCheckValue")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] lmkCheckValue;

    /**
     * Gets the value of the lmkCheckValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getLmkCheckValue() {
        return lmkCheckValue;
    }

    /**
     * Sets the value of the lmkCheckValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmkCheckValue(byte[] value) {
        this.lmkCheckValue = value;
    }

}
