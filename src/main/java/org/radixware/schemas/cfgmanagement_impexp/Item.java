
package org.radixware.schemas.cfgmanagement_impexp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.ImpExpEntity;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectPid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectOwnerPid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectOwnerTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LocalNotes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://schemas.radixware.org/cfgManagement-impExp.xsd}ItemSettings" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://schemas.radixware.org/common.xsd}ImpExpEntity" minOccurs="0"/&gt;
 *         &lt;element name="Children" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="EntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="AppVer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "objectPid",
    "objectRid",
    "objectTitle",
    "objectOwnerPid",
    "objectOwnerTitle",
    "objectExtGuid",
    "data",
    "notes",
    "localNotes",
    "settings",
    "options",
    "children"
})
public class Item {

    @XmlElement(name = "ObjectPid")
    protected String objectPid;
    @XmlElement(name = "ObjectRid")
    protected String objectRid;
    @XmlElement(name = "ObjectTitle")
    protected String objectTitle;
    @XmlElement(name = "ObjectOwnerPid")
    protected String objectOwnerPid;
    @XmlElement(name = "ObjectOwnerTitle")
    protected String objectOwnerTitle;
    @XmlElement(name = "ObjectExtGuid")
    protected String objectExtGuid;
    @XmlElement(name = "Data")
    protected Object data;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "LocalNotes")
    protected String localNotes;
    @XmlElement(name = "Settings")
    protected ItemSettings settings;
    @XmlElement(name = "Options")
    protected ImpExpEntity options;
    @XmlElement(name = "Children")
    protected Item.Children children;
    @XmlAttribute(name = "Id", required = true)
    protected long id;
    @XmlAttribute(name = "ClassId", required = true)
    protected String classId;
    @XmlAttribute(name = "EntityId")
    protected String entityId;
    @XmlAttribute(name = "AppVer")
    protected String appVer;

    /**
     * Gets the value of the objectPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPid() {
        return objectPid;
    }

    /**
     * Sets the value of the objectPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPid(String value) {
        this.objectPid = value;
    }

    /**
     * Gets the value of the objectRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectRid() {
        return objectRid;
    }

    /**
     * Sets the value of the objectRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectRid(String value) {
        this.objectRid = value;
    }

    /**
     * Gets the value of the objectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTitle() {
        return objectTitle;
    }

    /**
     * Sets the value of the objectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTitle(String value) {
        this.objectTitle = value;
    }

    /**
     * Gets the value of the objectOwnerPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectOwnerPid() {
        return objectOwnerPid;
    }

    /**
     * Sets the value of the objectOwnerPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectOwnerPid(String value) {
        this.objectOwnerPid = value;
    }

    /**
     * Gets the value of the objectOwnerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectOwnerTitle() {
        return objectOwnerTitle;
    }

    /**
     * Sets the value of the objectOwnerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectOwnerTitle(String value) {
        this.objectOwnerTitle = value;
    }

    /**
     * Gets the value of the objectExtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectExtGuid() {
        return objectExtGuid;
    }

    /**
     * Sets the value of the objectExtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectExtGuid(String value) {
        this.objectExtGuid = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the localNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNotes() {
        return localNotes;
    }

    /**
     * Sets the value of the localNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNotes(String value) {
        this.localNotes = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSettings }
     *     
     */
    public ItemSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSettings }
     *     
     */
    public void setSettings(ItemSettings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExpEntity }
     *     
     */
    public ImpExpEntity getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExpEntity }
     *     
     */
    public void setOptions(ImpExpEntity value) {
        this.options = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Item.Children }
     *     
     */
    public Item.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.Children }
     *     
     */
    public void setChildren(Item.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the appVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVer() {
        return appVer;
    }

    /**
     * Sets the value of the appVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVer(String value) {
        this.appVer = value;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "item"
    })
    public static class Children {

        @XmlElement(name = "Item")
        protected List<Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item }
         * 
         * 
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }

    }

}
