
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CalcArqcRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcArqcRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Arqc" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcArqcRs")
public class CalcArqcRs {

    @XmlAttribute(name = "Arqc", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] arqc;

    /**
     * Gets the value of the arqc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getArqc() {
        return arqc;
    }

    /**
     * Sets the value of the arqc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArqc(byte[] value) {
        this.arqc = value;
    }

}
