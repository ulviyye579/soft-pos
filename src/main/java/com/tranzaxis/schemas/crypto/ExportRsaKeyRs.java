
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExportRsaKeyRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportRsaKeyRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ExportedPrivateExponent" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportRsaKeyRs")
public class ExportRsaKeyRs {

    @XmlAttribute(name = "ExportedPrivateExponent", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] exportedPrivateExponent;

    /**
     * Gets the value of the exportedPrivateExponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getExportedPrivateExponent() {
        return exportedPrivateExponent;
    }

    /**
     * Sets the value of the exportedPrivateExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportedPrivateExponent(byte[] value) {
        this.exportedPrivateExponent = value;
    }

}
