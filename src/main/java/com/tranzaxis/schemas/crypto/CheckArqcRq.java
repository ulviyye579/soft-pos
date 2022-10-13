
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CheckArqcRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckArqcRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}CalcArqcRq"&gt;
 *       &lt;attribute name="Arqc" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckArqcRq")
public class CheckArqcRq
    extends CalcArqcRq
{

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
