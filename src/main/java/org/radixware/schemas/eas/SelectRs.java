
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSet" type="{http://schemas.radixware.org/eas.xsd}ObjectList"/&gt;
 *         &lt;element name="More" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Filter" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="Sorting" type="{http://schemas.radixware.org/eas.xsd}Sorting" minOccurs="0"/&gt;
 *         &lt;element name="ColorScheme" type="{http://schemas.radixware.org/eas.xsd}ColorScheme" minOccurs="0"/&gt;
 *         &lt;element name="DisabledActions" type="{http://schemas.radixware.org/eas.xsd}Actions" minOccurs="0"/&gt;
 *         &lt;element name="CommonFilters" type="{http://schemas.radixware.org/eas.xsd}CommonFilters" minOccurs="0"/&gt;
 *         &lt;element name="CustomColumns" type="{http://schemas.radixware.org/eas.xsd}CustomSelectorColumns" minOccurs="0"/&gt;
 *         &lt;element name="InstantiatableClasses" type="{http://schemas.radixware.org/eas.xsd}InstantiatableClasses" minOccurs="0"/&gt;
 *         &lt;element name="SelectedObjectsCorrection" type="{http://schemas.radixware.org/eas.xsd}SelectedObjects" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectRs", propOrder = {
    "dataSet",
    "more",
    "filter",
    "sorting",
    "colorScheme",
    "disabledActions",
    "commonFilters",
    "customColumns",
    "instantiatableClasses",
    "selectedObjectsCorrection"
})
public class SelectRs
    extends Response
{

    @XmlElement(name = "DataSet", required = true)
    protected ObjectList dataSet;
    @XmlElement(name = "More")
    protected boolean more;
    @XmlElement(name = "Filter")
    protected Definition filter;
    @XmlElement(name = "Sorting")
    protected Sorting sorting;
    @XmlElement(name = "ColorScheme")
    protected ColorScheme colorScheme;
    @XmlElement(name = "DisabledActions")
    protected Actions disabledActions;
    @XmlElement(name = "CommonFilters")
    protected CommonFilters commonFilters;
    @XmlElement(name = "CustomColumns")
    protected CustomSelectorColumns customColumns;
    @XmlElement(name = "InstantiatableClasses")
    protected InstantiatableClasses instantiatableClasses;
    @XmlElement(name = "SelectedObjectsCorrection")
    protected SelectedObjects selectedObjectsCorrection;

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectList }
     *     
     */
    public ObjectList getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectList }
     *     
     */
    public void setDataSet(ObjectList value) {
        this.dataSet = value;
    }

    /**
     * Gets the value of the more property.
     * 
     */
    public boolean isMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     * 
     */
    public void setMore(boolean value) {
        this.more = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setFilter(Definition value) {
        this.filter = value;
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
     * Gets the value of the disabledActions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getDisabledActions() {
        return disabledActions;
    }

    /**
     * Sets the value of the disabledActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setDisabledActions(Actions value) {
        this.disabledActions = value;
    }

    /**
     * Gets the value of the commonFilters property.
     * 
     * @return
     *     possible object is
     *     {@link CommonFilters }
     *     
     */
    public CommonFilters getCommonFilters() {
        return commonFilters;
    }

    /**
     * Sets the value of the commonFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonFilters }
     *     
     */
    public void setCommonFilters(CommonFilters value) {
        this.commonFilters = value;
    }

    /**
     * Gets the value of the customColumns property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSelectorColumns }
     *     
     */
    public CustomSelectorColumns getCustomColumns() {
        return customColumns;
    }

    /**
     * Sets the value of the customColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSelectorColumns }
     *     
     */
    public void setCustomColumns(CustomSelectorColumns value) {
        this.customColumns = value;
    }

    /**
     * Gets the value of the instantiatableClasses property.
     * 
     * @return
     *     possible object is
     *     {@link InstantiatableClasses }
     *     
     */
    public InstantiatableClasses getInstantiatableClasses() {
        return instantiatableClasses;
    }

    /**
     * Sets the value of the instantiatableClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantiatableClasses }
     *     
     */
    public void setInstantiatableClasses(InstantiatableClasses value) {
        this.instantiatableClasses = value;
    }

    /**
     * Gets the value of the selectedObjectsCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedObjects }
     *     
     */
    public SelectedObjects getSelectedObjectsCorrection() {
        return selectedObjectsCorrection;
    }

    /**
     * Sets the value of the selectedObjectsCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedObjects }
     *     
     */
    public void setSelectedObjectsCorrection(SelectedObjects value) {
        this.selectedObjectsCorrection = value;
    }

}
