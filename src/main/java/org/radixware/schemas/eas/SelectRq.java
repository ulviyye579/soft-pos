
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}GroupRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sorting" type="{http://schemas.radixware.org/eas.xsd}Sorting" minOccurs="0"/&gt;
 *         &lt;element name="PreviousObjectReference" type="{http://schemas.radixware.org/eas.xsd}ObjectReference" minOccurs="0"/&gt;
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EntireObjectIndexes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EntireObjectPids" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomColumns" type="{http://schemas.radixware.org/eas.xsd}CustomSelectorColumns" minOccurs="0"/&gt;
 *         &lt;element name="WithSelectorAddons" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommonFiltersLastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WithInstantiatableClasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectRq", propOrder = {
    "sorting",
    "previousObjectReference",
    "startIndex",
    "count",
    "entireObjectIndexes",
    "entireObjectPids",
    "customColumns",
    "withSelectorAddons",
    "commonFiltersLastUpdateTime",
    "withInstantiatableClasses"
})
public class SelectRq
    extends GroupRequest
{

    @XmlElement(name = "Sorting")
    protected Sorting sorting;
    @XmlElement(name = "PreviousObjectReference")
    protected ObjectReference previousObjectReference;
    @XmlElement(name = "StartIndex", defaultValue = "1")
    protected Long startIndex;
    @XmlElement(name = "Count", defaultValue = "10")
    protected Integer count;
    @XmlList
    @XmlElement(name = "EntireObjectIndexes", type = Long.class)
    protected List<Long> entireObjectIndexes;
    @XmlList
    @XmlElement(name = "EntireObjectPids")
    protected List<String> entireObjectPids;
    @XmlElement(name = "CustomColumns")
    protected CustomSelectorColumns customColumns;
    @XmlElement(name = "WithSelectorAddons", defaultValue = "false")
    protected Boolean withSelectorAddons;
    @XmlElement(name = "CommonFiltersLastUpdateTime", defaultValue = "-1")
    protected Long commonFiltersLastUpdateTime;
    @XmlElement(name = "WithInstantiatableClasses", defaultValue = "false")
    protected Boolean withInstantiatableClasses;

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
     * Gets the value of the previousObjectReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReference }
     *     
     */
    public ObjectReference getPreviousObjectReference() {
        return previousObjectReference;
    }

    /**
     * Sets the value of the previousObjectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReference }
     *     
     */
    public void setPreviousObjectReference(ObjectReference value) {
        this.previousObjectReference = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartIndex(Long value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the entireObjectIndexes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entireObjectIndexes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntireObjectIndexes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEntireObjectIndexes() {
        if (entireObjectIndexes == null) {
            entireObjectIndexes = new ArrayList<Long>();
        }
        return this.entireObjectIndexes;
    }

    /**
     * Gets the value of the entireObjectPids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entireObjectPids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntireObjectPids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntireObjectPids() {
        if (entireObjectPids == null) {
            entireObjectPids = new ArrayList<String>();
        }
        return this.entireObjectPids;
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
     * Gets the value of the withSelectorAddons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithSelectorAddons() {
        return withSelectorAddons;
    }

    /**
     * Sets the value of the withSelectorAddons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithSelectorAddons(Boolean value) {
        this.withSelectorAddons = value;
    }

    /**
     * Gets the value of the commonFiltersLastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommonFiltersLastUpdateTime() {
        return commonFiltersLastUpdateTime;
    }

    /**
     * Sets the value of the commonFiltersLastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommonFiltersLastUpdateTime(Long value) {
        this.commonFiltersLastUpdateTime = value;
    }

    /**
     * Gets the value of the withInstantiatableClasses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithInstantiatableClasses() {
        return withInstantiatableClasses;
    }

    /**
     * Sets the value of the withInstantiatableClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithInstantiatableClasses(Boolean value) {
        this.withInstantiatableClasses = value;
    }

}
