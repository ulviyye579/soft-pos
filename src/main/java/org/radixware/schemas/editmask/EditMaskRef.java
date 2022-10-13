
package org.radixware.schemas.editmask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.types.MapStrStr;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for EditMaskRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultSortingIdByFilterId" type="{http://schemas.radixware.org/types.xsd}MapStrStr" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SelectorPresentationId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="DefaultFilterId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="DefaultFilterDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="EditorPresentationIds"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="UseDropDownList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskRef", propOrder = {
    "defaultSortingIdByFilterId",
    "condition"
})
public class EditMaskRef {

    @XmlElement(name = "DefaultSortingIdByFilterId")
    protected MapStrStr defaultSortingIdByFilterId;
    @XmlElement(name = "Condition")
    protected Sqml condition;
    @XmlAttribute(name = "SelectorPresentationId")
    protected String selectorPresentationId;
    @XmlAttribute(name = "DefaultFilterId")
    protected String defaultFilterId;
    @XmlAttribute(name = "DefaultFilterDefined")
    protected Boolean defaultFilterDefined;
    @XmlAttribute(name = "EditorPresentationIds")
    protected List<String> editorPresentationIds;
    @XmlAttribute(name = "UseDropDownList")
    protected Boolean useDropDownList;

    /**
     * Gets the value of the defaultSortingIdByFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getDefaultSortingIdByFilterId() {
        return defaultSortingIdByFilterId;
    }

    /**
     * Sets the value of the defaultSortingIdByFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setDefaultSortingIdByFilterId(MapStrStr value) {
        this.defaultSortingIdByFilterId = value;
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
     * Gets the value of the selectorPresentationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectorPresentationId() {
        return selectorPresentationId;
    }

    /**
     * Sets the value of the selectorPresentationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectorPresentationId(String value) {
        this.selectorPresentationId = value;
    }

    /**
     * Gets the value of the defaultFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultFilterId() {
        return defaultFilterId;
    }

    /**
     * Sets the value of the defaultFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultFilterId(String value) {
        this.defaultFilterId = value;
    }

    /**
     * Gets the value of the defaultFilterDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultFilterDefined() {
        if (defaultFilterDefined == null) {
            return false;
        } else {
            return defaultFilterDefined;
        }
    }

    /**
     * Sets the value of the defaultFilterDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultFilterDefined(Boolean value) {
        this.defaultFilterDefined = value;
    }

    /**
     * Gets the value of the editorPresentationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editorPresentationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditorPresentationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEditorPresentationIds() {
        if (editorPresentationIds == null) {
            editorPresentationIds = new ArrayList<String>();
        }
        return this.editorPresentationIds;
    }

    /**
     * Gets the value of the useDropDownList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseDropDownList() {
        if (useDropDownList == null) {
            return false;
        } else {
            return useDropDownList;
        }
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
