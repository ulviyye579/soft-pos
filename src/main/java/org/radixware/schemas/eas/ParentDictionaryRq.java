
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentDictionaryRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentDictionaryRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentDictionaryPid" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *         &lt;element name="ParentSelectorPresentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="parentReferenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="buildCondition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentDictionaryRq", propOrder = {
    "parentDictionaryPid",
    "parentSelectorPresentation"
})
public class ParentDictionaryRq {

    @XmlElement(name = "ParentDictionaryPid", required = true)
    protected String parentDictionaryPid;
    @XmlElement(name = "ParentSelectorPresentation", required = true)
    protected Presentation parentSelectorPresentation;
    @XmlAttribute(name = "parentReferenceId", required = true)
    protected String parentReferenceId;
    @XmlAttribute(name = "buildCondition")
    protected Boolean buildCondition;

    /**
     * Gets the value of the parentDictionaryPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDictionaryPid() {
        return parentDictionaryPid;
    }

    /**
     * Sets the value of the parentDictionaryPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDictionaryPid(String value) {
        this.parentDictionaryPid = value;
    }

    /**
     * Gets the value of the parentSelectorPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation }
     *     
     */
    public Presentation getParentSelectorPresentation() {
        return parentSelectorPresentation;
    }

    /**
     * Sets the value of the parentSelectorPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation }
     *     
     */
    public void setParentSelectorPresentation(Presentation value) {
        this.parentSelectorPresentation = value;
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
     * Gets the value of the buildCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBuildCondition() {
        if (buildCondition == null) {
            return false;
        } else {
            return buildCondition;
        }
    }

    /**
     * Sets the value of the buildCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildCondition(Boolean value) {
        this.buildCondition = value;
    }

}
