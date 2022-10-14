
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for GroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ClassRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://schemas.radixware.org/eas.xsd}Filter" minOccurs="0"/&gt;
 *         &lt;element name="ClassFilters" type="{http://schemas.radixware.org/eas.xsd}ClassFilters" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *         &lt;element name="GroupProperties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *         &lt;element name="SelectedObjects" type="{http://schemas.radixware.org/eas.xsd}SelectedObjects" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupRequest", propOrder = {
    "presentation",
    "filter",
    "classFilters",
    "condition",
    "groupProperties",
    "selectedObjects"
})
@XmlSeeAlso({
    SelectRq.class,
    CalcSelectionStatisticRq.class
})
public class GroupRequest
    extends ClassRequest
{

    @XmlElement(name = "Presentation")
    protected Definition presentation;
    @XmlElement(name = "Filter")
    protected Filter filter;
    @XmlElement(name = "ClassFilters")
    protected ClassFilters classFilters;
    @XmlElement(name = "Condition")
    protected Sqml condition;
    @XmlElement(name = "GroupProperties")
    protected PropertyList groupProperties;
    @XmlElement(name = "SelectedObjects")
    protected SelectedObjects selectedObjects;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setPresentation(Definition value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the classFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ClassFilters }
     *     
     */
    public ClassFilters getClassFilters() {
        return classFilters;
    }

    /**
     * Sets the value of the classFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassFilters }
     *     
     */
    public void setClassFilters(ClassFilters value) {
        this.classFilters = value;
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
     * Gets the value of the groupProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getGroupProperties() {
        return groupProperties;
    }

    /**
     * Sets the value of the groupProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setGroupProperties(PropertyList value) {
        this.groupProperties = value;
    }

    /**
     * Gets the value of the selectedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedObjects }
     *     
     */
    public SelectedObjects getSelectedObjects() {
        return selectedObjects;
    }

    /**
     * Sets the value of the selectedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedObjects }
     *     
     */
    public void setSelectedObjects(SelectedObjects value) {
        this.selectedObjects = value;
    }

}
