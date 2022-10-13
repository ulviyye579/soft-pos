
package org.radixware.schemas.groupsettings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.Definition;
import org.radixware.schemas.editmask.EditMask;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for CustomFilterParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFilterParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditMask" type="{http://schemas.radixware.org/editmask.xsd}EditMask" minOccurs="0"/&gt;
 *         &lt;element name="DefaultVal" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="ParentSelectorCondition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ValType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="EnumId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="ReferencedClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="ParentSelectorPresentationId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="NullTitle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UseDropDownList" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maxArrayItemsCount" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="minArrayItemsCount" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFilterParameter", propOrder = {
    "editMask",
    "defaultVal",
    "parentSelectorCondition"
})
public class CustomFilterParameter
    extends Definition
{

    @XmlElement(name = "EditMask")
    protected EditMask editMask;
    @XmlElement(name = "DefaultVal")
    protected String defaultVal;
    @XmlElement(name = "ParentSelectorCondition")
    protected Sqml parentSelectorCondition;
    @XmlAttribute(name = "Title", required = true)
    protected String title;
    @XmlAttribute(name = "ValType", required = true)
    protected long valType;
    @XmlAttribute(name = "NotNull")
    protected Boolean notNull;
    @XmlAttribute(name = "EnumId")
    protected String enumId;
    @XmlAttribute(name = "ReferencedClassId")
    protected String referencedClassId;
    @XmlAttribute(name = "ParentSelectorPresentationId")
    protected String parentSelectorPresentationId;
    @XmlAttribute(name = "NullTitle")
    protected String nullTitle;
    @XmlAttribute(name = "UseDropDownList")
    protected Boolean useDropDownList;
    @XmlAttribute(name = "maxArrayItemsCount")
    protected Integer maxArrayItemsCount;
    @XmlAttribute(name = "minArrayItemsCount")
    protected Integer minArrayItemsCount;

    /**
     * Gets the value of the editMask property.
     * 
     * @return
     *     possible object is
     *     {@link EditMask }
     *     
     */
    public EditMask getEditMask() {
        return editMask;
    }

    /**
     * Sets the value of the editMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMask }
     *     
     */
    public void setEditMask(EditMask value) {
        this.editMask = value;
    }

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

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotNull() {
        if (notNull == null) {
            return false;
        } else {
            return notNull;
        }
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
     * Gets the value of the enumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * Sets the value of the enumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumId(String value) {
        this.enumId = value;
    }

    /**
     * Gets the value of the referencedClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedClassId() {
        return referencedClassId;
    }

    /**
     * Sets the value of the referencedClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedClassId(String value) {
        this.referencedClassId = value;
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

    /**
     * Gets the value of the nullTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullTitle() {
        return nullTitle;
    }

    /**
     * Sets the value of the nullTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullTitle(String value) {
        this.nullTitle = value;
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

    /**
     * Gets the value of the maxArrayItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxArrayItemsCount() {
        if (maxArrayItemsCount == null) {
            return -1;
        } else {
            return maxArrayItemsCount;
        }
    }

    /**
     * Sets the value of the maxArrayItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxArrayItemsCount(Integer value) {
        this.maxArrayItemsCount = value;
    }

    /**
     * Gets the value of the minArrayItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinArrayItemsCount() {
        if (minArrayItemsCount == null) {
            return -1;
        } else {
            return minArrayItemsCount;
        }
    }

    /**
     * Sets the value of the minArrayItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinArrayItemsCount(Integer value) {
        this.minArrayItemsCount = value;
    }

}
