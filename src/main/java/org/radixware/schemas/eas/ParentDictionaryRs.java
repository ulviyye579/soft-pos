
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for ParentDictionaryRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentDictionaryRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/eas.xsd}ObjectTitle" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="parentReferenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="parentEntityClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="parentSelectorPresentationId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentDictionaryRs", propOrder = {
    "objectTitle",
    "condition"
})
public class ParentDictionaryRs {

    @XmlElement(name = "ObjectTitle")
    protected ObjectTitle objectTitle;
    @XmlElement(name = "Condition", required = true)
    protected Sqml condition;
    @XmlAttribute(name = "parentReferenceId", required = true)
    protected String parentReferenceId;
    @XmlAttribute(name = "parentEntityClassId", required = true)
    protected String parentEntityClassId;
    @XmlAttribute(name = "parentSelectorPresentationId")
    protected String parentSelectorPresentationId;

    /**
     * Gets the value of the objectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTitle }
     *     
     */
    public ObjectTitle getObjectTitle() {
        return objectTitle;
    }

    /**
     * Sets the value of the objectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTitle }
     *     
     */
    public void setObjectTitle(ObjectTitle value) {
        this.objectTitle = value;
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
     * Gets the value of the parentReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentReferenceId() {
        return parentReferenceId;
    }

    /**
     * Sets the value of the parentReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentReferenceId(String value) {
        this.parentReferenceId = value;
    }

    /**
     * Gets the value of the parentEntityClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEntityClassId() {
        return parentEntityClassId;
    }

    /**
     * Sets the value of the parentEntityClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEntityClassId(String value) {
        this.parentEntityClassId = value;
    }

    /**
     * Gets the value of the parentSelectorPresentationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSelectorPresentationId() {
        return parentSelectorPresentationId;
    }

    /**
     * Sets the value of the parentSelectorPresentationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSelectorPresentationId(String value) {
        this.parentSelectorPresentationId = value;
    }

}
