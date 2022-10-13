
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * method's parameter
 * 
 * <p>Java class for JmlParameterDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JmlParameterDeclaration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Variable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JmlParameterDeclaration", propOrder = {
    "type",
    "description"
})
public class JmlParameterDeclaration {

    @XmlElement(name = "Type", required = true)
    protected TypeDeclaration type;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Variable")
    protected Boolean variable;
    @XmlAttribute(name = "DescriptionId")
    protected String descriptionId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDeclaration }
     *     
     */
    public TypeDeclaration getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDeclaration }
     *     
     */
    public void setType(TypeDeclaration value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariable(Boolean value) {
        this.variable = value;
    }

    /**
     * Gets the value of the descriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionId() {
        return descriptionId;
    }

    /**
     * Sets the value of the descriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionId(String value) {
        this.descriptionId = value;
    }

}
