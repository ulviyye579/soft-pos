
package org.radixware.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for EditableProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditableProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="EntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditableProperty", propOrder = {
    "rid",
    "value",
    "condition"
})
public class EditableProperty {

    @XmlElement(name = "Rid")
    protected String rid;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Condition")
    protected Sqml condition;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "EntityId")
    protected String entityId;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
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
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Sqml }
     *     
     */
    public Sqml getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sqml }
     *     
     */
    public void setCondition(Sqml value) {
        this.condition = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

}
