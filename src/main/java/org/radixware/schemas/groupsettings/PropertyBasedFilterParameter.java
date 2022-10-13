
package org.radixware.schemas.groupsettings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.Definition;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for PropertyBasedFilterParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyBasedFilterParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentSelectorCondition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OwnerClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseDropDownList" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyBasedFilterParameter", propOrder = {
    "defaultVal",
    "parentSelectorCondition"
})
public class PropertyBasedFilterParameter
    extends Definition
{

    @XmlElement(name = "DefaultVal")
    protected String defaultVal;
    @XmlElement(name = "ParentSelectorCondition")
    protected Sqml parentSelectorCondition;
    @XmlAttribute(name = "OwnerClassId", required = true)
    protected String ownerClassId;
    @XmlAttribute(name = "PropertyId", required = true)
    protected String propertyId;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "NotNull")
    protected Boolean notNull;
    @XmlAttribute(name = "UseDropDownList")
    protected Boolean useDropDownList;

    /**
     * Gets the value of the defaultVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultVal() {
        return defaultVal;
    }

    /**
     * Sets the value of the defaultVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultVal(String value) {
        this.defaultVal = value;
    }

    /**
     * Gets the value of the parentSelectorCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Sqml }
     *     
     */
    public Sqml getParentSelectorCondition() {
        return parentSelectorCondition;
    }

    /**
     * Sets the value of the parentSelectorCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sqml }
     *     
     */
    public void setParentSelectorCondition(Sqml value) {
        this.parentSelectorCondition = value;
    }

    /**
     * Gets the value of the ownerClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerClassId() {
        return ownerClassId;
    }

    /**
     * Sets the value of the ownerClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerClassId(String value) {
        this.ownerClassId = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyId(String value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotNull() {
        return notNull;
    }

    /**
     * Sets the value of the notNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotNull(Boolean value) {
        this.notNull = value;
    }

    /**
     * Gets the value of the useDropDownList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDropDownList() {
        return useDropDownList;
    }

    /**
     * Sets the value of the useDropDownList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDropDownList(Boolean value) {
        this.useDropDownList = value;
    }

}
