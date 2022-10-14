
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for ObjectOrGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectOrGroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ClassRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Filter" type="{http://schemas.radixware.org/eas.xsd}Filter" minOccurs="0"/&gt;
 *             &lt;element name="ClassFilters" type="{http://schemas.radixware.org/eas.xsd}ClassFilters" minOccurs="0"/&gt;
 *             &lt;element name="Sorting" type="{http://schemas.radixware.org/eas.xsd}Sorting" minOccurs="0"/&gt;
 *             &lt;element name="ColorScheme" type="{http://schemas.radixware.org/eas.xsd}ColorScheme" minOccurs="0"/&gt;
 *             &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *             &lt;element name="GroupProperties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *             &lt;element name="SelectedObjects" type="{http://schemas.radixware.org/eas.xsd}SelectedObjects" minOccurs="0"/&gt;
 *             &lt;element name="HierarchicalSelection" type="{http://schemas.radixware.org/eas.xsd}HierarchicalSelection" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectOrGroupRequest", propOrder = {
    "presentation",
    "pid",
    "filter",
    "classFilters",
    "sorting",
    "colorScheme",
    "condition",
    "groupProperties",
    "selectedObjects",
    "hierarchicalSelection"
})
@XmlSeeAlso({
    DeleteRq.class,
    CommandRq.class
})
public class ObjectOrGroupRequest
    extends ClassRequest
{

    @XmlElement(name = "Presentation", required = true)
    protected Definition presentation;
    @XmlElement(name = "PID")
    protected String pid;
    @XmlElement(name = "Filter")
    protected Filter filter;
    @XmlElement(name = "ClassFilters")
    protected ClassFilters classFilters;
    @XmlElement(name = "Sorting")
    protected Sorting sorting;
    @XmlElement(name = "ColorScheme")
    protected ColorScheme colorScheme;
    @XmlElement(name = "Condition")
    protected Sqml condition;
    @XmlElement(name = "GroupProperties")
    protected PropertyList groupProperties;
    @XmlElement(name = "SelectedObjects")
    protected SelectedObjects selectedObjects;
    @XmlElement(name = "HierarchicalSelection")
    protected HierarchicalSelection hierarchicalSelection;

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
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
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
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Sorting }
     *     
     */
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sorting }
     *     
     */
    public void setSorting(Sorting value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the colorScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ColorScheme }
     *     
     */
    public ColorScheme getColorScheme() {
        return colorScheme;
    }

    /**
     * Sets the value of the colorScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorScheme }
     *     
     */
    public void setColorScheme(ColorScheme value) {
        this.colorScheme = value;
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

    /**
     * Gets the value of the hierarchicalSelection property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalSelection }
     *     
     */
    public HierarchicalSelection getHierarchicalSelection() {
        return hierarchicalSelection;
    }

    /**
     * Sets the value of the hierarchicalSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalSelection }
     *     
     */
    public void setHierarchicalSelection(HierarchicalSelection value) {
        this.hierarchicalSelection = value;
    }

}
