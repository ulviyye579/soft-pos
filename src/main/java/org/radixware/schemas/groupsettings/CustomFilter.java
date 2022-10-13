
package org.radixware.schemas.groupsettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.NamedDefinition;
import org.radixware.schemas.types.MapStrStr;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for CustomFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}NamedDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameters" minOccurs="0"/&gt;
 *         &lt;element name="PersistentValues" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PersistentValue" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameterValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtAttrs" type="{http://schemas.radixware.org/types.xsd}MapStrStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BaseFilterId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="SelectorPresentations"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFilter", propOrder = {
    "condition",
    "parameters",
    "persistentValues",
    "extAttrs"
})
public class CustomFilter
    extends NamedDefinition
{

    @XmlElement(name = "Condition")
    protected Sqml condition;
    @XmlElement(name = "Parameters")
    protected FilterParameters parameters;
    @XmlElement(name = "PersistentValues")
    protected CustomFilter.PersistentValues persistentValues;
    @XmlElement(name = "ExtAttrs")
    protected MapStrStr extAttrs;
    @XmlAttribute(name = "BaseFilterId")
    protected String baseFilterId;
    @XmlAttribute(name = "TableId", required = true)
    protected String tableId;
    @XmlAttribute(name = "IsActive")
    protected Boolean isActive;
    @XmlAttribute(name = "SelectorPresentations")
    protected List<String> selectorPresentations;

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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FilterParameters }
     *     
     */
    public FilterParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterParameters }
     *     
     */
    public void setParameters(FilterParameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the persistentValues property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFilter.PersistentValues }
     *     
     */
    public CustomFilter.PersistentValues getPersistentValues() {
        return persistentValues;
    }

    /**
     * Sets the value of the persistentValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFilter.PersistentValues }
     *     
     */
    public void setPersistentValues(CustomFilter.PersistentValues value) {
        this.persistentValues = value;
    }

    /**
     * Gets the value of the extAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getExtAttrs() {
        return extAttrs;
    }

    /**
     * Sets the value of the extAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setExtAttrs(MapStrStr value) {
        this.extAttrs = value;
    }

    /**
     * Gets the value of the baseFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFilterId() {
        return baseFilterId;
    }

    /**
     * Sets the value of the baseFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFilterId(String value) {
        this.baseFilterId = value;
    }

    /**
     * Gets the value of the tableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableId(String value) {
        this.tableId = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsActive() {
        if (isActive == null) {
            return true;
        } else {
            return isActive;
        }
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the selectorPresentations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectorPresentations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectorPresentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectorPresentations() {
        if (selectorPresentations == null) {
            selectorPresentations = new ArrayList<String>();
        }
        return this.selectorPresentations;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PersistentValue" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameterValue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "persistentValue"
    })
    public static class PersistentValues {

        @XmlElement(name = "PersistentValue")
        protected List<FilterParameterValue> persistentValue;

        /**
         * Gets the value of the persistentValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the persistentValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersistentValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilterParameterValue }
         * 
         * 
         */
        public List<FilterParameterValue> getPersistentValue() {
            if (persistentValue == null) {
                persistentValue = new ArrayList<FilterParameterValue>();
            }
            return this.persistentValue;
        }

    }

}
