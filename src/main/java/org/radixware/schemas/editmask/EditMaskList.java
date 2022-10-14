
package org.radixware.schemas.editmask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExtendedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ToolTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="TitleOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="ExtendedTitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="IconId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="ToolTipId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaxItemsInDDList" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="AutoSortByTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskList", propOrder = {
    "item"
})
public class EditMaskList {

    @XmlElement(name = "Item")
    protected List<EditMaskList.Item> item;
    @XmlAttribute(name = "MaxItemsInDDList")
    protected Integer maxItemsInDDList;
    @XmlAttribute(name = "AutoSortByTitle")
    protected Boolean autoSortByTitle;

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
     * {@link EditMaskList.Item }
     * 
     * 
     */
    public List<EditMaskList.Item> getItem() {
        if (item == null) {
            item = new ArrayList<EditMaskList.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the maxItemsInDDList property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxItemsInDDList() {
        if (maxItemsInDDList == null) {
            return -1;
        } else {
            return maxItemsInDDList;
        }
    }

    /**
     * Sets the value of the maxItemsInDDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemsInDDList(Integer value) {
        this.maxItemsInDDList = value;
    }

    /**
     * Gets the value of the autoSortByTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoSortByTitle() {
        if (autoSortByTitle == null) {
            return false;
        } else {
            return autoSortByTitle;
        }
    }

    /**
     * Sets the value of the autoSortByTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSortByTitle(Boolean value) {
        this.autoSortByTitle = value;
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
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExtendedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ToolTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="TitleOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="ExtendedTitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="IconId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="ToolTipId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "extendedTitle",
        "toolTip",
        "value"
    })
    public static class Item {

        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "ExtendedTitle")
        protected String extendedTitle;
        @XmlElement(name = "ToolTip")
        protected String toolTip;
        @XmlElement(name = "Value")
        protected String value;
        @XmlAttribute(name = "TitleId")
        protected String titleId;
        @XmlAttribute(name = "TitleOwnerId")
        protected String titleOwnerId;
        @XmlAttribute(name = "ExtendedTitleId")
        protected String extendedTitleId;
        @XmlAttribute(name = "IconId")
        protected String iconId;
        @XmlAttribute(name = "ToolTipId")
        protected String toolTipId;

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
         * Gets the value of the extendedTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedTitle() {
            return extendedTitle;
        }

        /**
         * Sets the value of the extendedTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedTitle(String value) {
            this.extendedTitle = value;
        }

        /**
         * Gets the value of the toolTip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToolTip() {
            return toolTip;
        }

        /**
         * Sets the value of the toolTip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToolTip(String value) {
            this.toolTip = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the titleId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleId() {
            return titleId;
        }

        /**
         * Sets the value of the titleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleId(String value) {
            this.titleId = value;
        }

        /**
         * Gets the value of the titleOwnerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleOwnerId() {
            return titleOwnerId;
        }

        /**
         * Sets the value of the titleOwnerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleOwnerId(String value) {
            this.titleOwnerId = value;
        }

        /**
         * Gets the value of the extendedTitleId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedTitleId() {
            return extendedTitleId;
        }

        /**
         * Sets the value of the extendedTitleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedTitleId(String value) {
            this.extendedTitleId = value;
        }

        /**
         * Gets the value of the iconId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIconId() {
            return iconId;
        }

        /**
         * Sets the value of the iconId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIconId(String value) {
            this.iconId = value;
        }

        /**
         * Gets the value of the toolTipId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToolTipId() {
            return toolTipId;
        }

        /**
         * Sets the value of the toolTipId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToolTipId(String value) {
            this.toolTipId = value;
        }

    }

}
