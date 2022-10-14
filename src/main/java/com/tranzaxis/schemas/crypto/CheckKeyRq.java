
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CheckKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckKeyRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}CalcKeyCheckRq"&gt;
 *       &lt;attribute name="Check" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckKeyRq")
public class CheckKeyRq
    extends CalcKeyCheckRq
{

    @XmlAttribute(name = "Check")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] check;

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(byte[] value) {
        this.check = value;
    }

}
