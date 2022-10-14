
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstantiatableClasses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstantiatableClasses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Class" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstantiatableClasses", propOrder = {
    "item"
})
public class InstantiatableClasses {

    @XmlElement(name = "Item", required = true)
    protected List<InstantiatableClasses.Item> item;

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
     * {@link InstantiatableClasses.Item }
     * 
     * 
     */
    public List<InstantiatableClasses.Item> getItem() {
        if (item == null) {
            item = new ArrayList<InstantiatableClasses.Item>();
        }
        return this.item;
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
     *         &lt;element name="Class" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clazz",
        "title",
        "level"
    })
    public static class Item {

        @XmlElement(name = "Class")
        protected Definition clazz;
        @XmlElement(name = "Title", required = true)
        protected String title;
        @XmlElement(name = "Level")
        protected int level;
        @XmlAttribute(name = "Id")
        protected String id;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link Definition }
         *     
         */
        public Definition getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Definition }
         *     
         */
        public void setClazz(Definition value) {
            this.clazz = value;
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
         * Gets the value of the level property.
         * 
         */
        public int getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         */
        public void setLevel(int value) {
            this.level = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
