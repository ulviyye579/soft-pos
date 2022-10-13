
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchicalSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchicalSelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ChildGroup" type="{http://schemas.radixware.org/eas.xsd}SelectedChildGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ChildNode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="recursivelySelected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="recursivelyUnselected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="explicitlySelectedObjectsCount" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchicalSelection", propOrder = {
    "item"
})
public class HierarchicalSelection {

    @XmlElement(name = "Item")
    protected List<HierarchicalSelection.Item> item;
    @XmlAttribute(name = "explicitlySelectedObjectsCount")
    protected Integer explicitlySelectedObjectsCount;

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
     * {@link HierarchicalSelection.Item }
     * 
     * 
     */
    public List<HierarchicalSelection.Item> getItem() {
        if (item == null) {
            item = new ArrayList<HierarchicalSelection.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the explicitlySelectedObjectsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getExplicitlySelectedObjectsCount() {
        if (explicitlySelectedObjectsCount == null) {
            return -1;
        } else {
            return explicitlySelectedObjectsCount;
        }
    }

    /**
     * Sets the value of the explicitlySelectedObjectsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExplicitlySelectedObjectsCount(Integer value) {
        this.explicitlySelectedObjectsCount = value;
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
     *         &lt;element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ChildGroup" type="{http://schemas.radixware.org/eas.xsd}SelectedChildGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ChildNode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="recursivelySelected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="recursivelyUnselected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nodePath",
        "childGroup",
        "childNode"
    })
    public static class Item {

        @XmlElement(name = "NodePath", required = true)
        protected String nodePath;
        @XmlElement(name = "ChildGroup")
        protected List<SelectedChildGroup> childGroup;
        @XmlElement(name = "ChildNode")
        protected List<String> childNode;
        @XmlAttribute(name = "recursivelySelected")
        protected Boolean recursivelySelected;
        @XmlAttribute(name = "recursivelyUnselected")
        protected Boolean recursivelyUnselected;

        /**
         * Gets the value of the nodePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodePath() {
            return nodePath;
        }

        /**
         * Sets the value of the nodePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodePath(String value) {
            this.nodePath = value;
        }

        /**
         * Gets the value of the childGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SelectedChildGroup }
         * 
         * 
         */
        public List<SelectedChildGroup> getChildGroup() {
            if (childGroup == null) {
                childGroup = new ArrayList<SelectedChildGroup>();
            }
            return this.childGroup;
        }

        /**
         * Gets the value of the childNode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childNode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getChildNode() {
            if (childNode == null) {
                childNode = new ArrayList<String>();
            }
            return this.childNode;
        }

        /**
         * Gets the value of the recursivelySelected property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRecursivelySelected() {
            if (recursivelySelected == null) {
                return false;
            } else {
                return recursivelySelected;
            }
        }

        /**
         * Sets the value of the recursivelySelected property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRecursivelySelected(Boolean value) {
            this.recursivelySelected = value;
        }

        /**
         * Gets the value of the recursivelyUnselected property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRecursivelyUnselected() {
            if (recursivelyUnselected == null) {
                return false;
            } else {
                return recursivelyUnselected;
            }
        }

        /**
         * Sets the value of the recursivelyUnselected property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRecursivelyUnselected(Boolean value) {
            this.recursivelyUnselected = value;
        }

    }

}
