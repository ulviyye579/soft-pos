
package org.radixware.schemas.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;BinHex"&gt;
 *       &lt;attribute name="AAA" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type", propOrder = {
    "value"
})
public class Type {

    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] value;
    @XmlAttribute(name = "AAA")
    protected Boolean aaa;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the aaa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAAA() {
        return aaa;
    }

    /**
     * Sets the value of the aaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAAA(Boolean value) {
        this.aaa = value;
    }

}
