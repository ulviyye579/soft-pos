
package org.radixware.schemas.eas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionVariable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Remove" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Temporary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionVariable", propOrder = {
    "value"
})
public class SessionVariable {

    @XmlElementRef(name = "Value", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Remove")
    protected Boolean remove;
    @XmlAttribute(name = "Temporary")
    protected Boolean temporary;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the remove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemove() {
        if (remove == null) {
            return false;
        } else {
            return remove;
        }
    }

    /**
     * Sets the value of the remove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemove(Boolean value) {
        this.remove = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTemporary() {
        if (temporary == null) {
            return false;
        } else {
            return temporary;
        }
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporary(Boolean value) {
        this.temporary = value;
    }

}
