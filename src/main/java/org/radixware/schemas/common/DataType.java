
package org.radixware.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValClass" type="{http://schemas.radixware.org/common.xsd}JavaClass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ValType" use="required" type="{http://schemas.radixware.org/common.xsd}ValType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "valClass"
})
public class DataType {

    @XmlElement(name = "ValClass")
    protected JavaClass valClass;
    @XmlAttribute(name = "ValType", required = true)
    protected long valType;

    /**
     * Gets the value of the valClass property.
     * 
     * @return
     *     possible object is
     *     {@link JavaClass }
     *     
     */
    public JavaClass getValClass() {
        return valClass;
    }

    /**
     * Sets the value of the valClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaClass }
     *     
     */
    public void setValClass(JavaClass value) {
        this.valClass = value;
    }

    /**
     * Gets the value of the valType property.
     * 
     */
    public long getValType() {
        return valType;
    }

    /**
     * Sets the value of the valType property.
     * 
     */
    public void setValType(long value) {
        this.valType = value;
    }

}
