
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassFilters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="classId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="includeDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
@XmlType(name = "ClassFilters", propOrder = {
    "item"
})
public class ClassFilters {

    @XmlElement(name = "Item")
    protected List<ClassFilters.Item> item;

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
     * {@link ClassFilters.Item }
     * 
     * 
     */
    public List<ClassFilters.Item> getItem() {
        if (item == null) {
            item = new ArrayList<ClassFilters.Item>();
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
     *       &lt;attribute name="classId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="includeDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Item {

        @XmlAttribute(name = "classId", required = true)
        protected String classId;
        @XmlAttribute(name = "includeDescendants")
        protected Boolean includeDescendants;

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
         * Gets the value of the includeDescendants property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIncludeDescendants() {
            if (includeDescendants == null) {
                return false;
            } else {
                return includeDescendants;
            }
        }

        /**
         * Sets the value of the includeDescendants property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeDescendants(Boolean value) {
            this.includeDescendants = value;
        }

    }

}
