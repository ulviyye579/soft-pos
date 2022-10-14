
package org.radixware.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JavaClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JavaClass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DacId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="QName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PrimitiveType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JavaClass")
public class JavaClass {

    @XmlAttribute(name = "DacId")
    protected String dacId;
    @XmlAttribute(name = "QName")
    protected String qName;
    @XmlAttribute(name = "PrimitiveType")
    protected String primitiveType;

    /**
     * Gets the value of the dacId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDacId() {
        return dacId;
    }

    /**
     * Sets the value of the dacId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDacId(String value) {
        this.dacId = value;
    }

    /**
     * Gets the value of the qName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQName() {
        return qName;
    }

    /**
     * Sets the value of the qName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQName(String value) {
        this.qName = value;
    }

    /**
     * Gets the value of the primitiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimitiveType() {
        return primitiveType;
    }

    /**
     * Sets the value of the primitiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimitiveType(String value) {
        this.primitiveType = value;
    }

}
