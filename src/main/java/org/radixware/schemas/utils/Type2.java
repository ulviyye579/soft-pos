
package org.radixware.schemas.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Optional" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type2")
public class Type2 {

    @XmlAttribute(name = "Optional")
    protected Long optional;

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptional(Long value) {
        this.optional = value;
    }

}
