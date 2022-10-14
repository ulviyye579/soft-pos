
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WithAccessibleExplorerItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithLOBValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Properties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadRq", propOrder = {
    "presentations",
    "withAccessibleExplorerItems",
    "withLOBValues",
    "properties"
})
public class ReadRq
    extends ObjectRequest
{

    @XmlElement(name = "Presentations", required = true)
    protected ReadRq.Presentations presentations;
    @XmlElement(name = "WithAccessibleExplorerItems", defaultValue = "false")
    protected Boolean withAccessibleExplorerItems;
    @XmlElement(name = "WithLOBValues", defaultValue = "true")
    protected Boolean withLOBValues;
    @XmlElement(name = "Properties")
    protected ReadRq.Properties properties;

    /**
     * Gets the value of the presentations property.
     * 
     * @return
     *     possible object is
     *     {@link ReadRq.Presentations }
     *     
     */
    public ReadRq.Presentations getPresentations() {
        return presentations;
    }

    /**
     * Sets the value of the presentations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadRq.Presentations }
     *     
     */
    public void setPresentations(ReadRq.Presentations value) {
        this.presentations = value;
    }

    /**
     * Gets the value of the withAccessibleExplorerItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithAccessibleExplorerItems() {
        return withAccessibleExplorerItems;
    }

    /**
     * Sets the value of the withAccessibleExplorerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithAccessibleExplorerItems(Boolean value) {
        this.withAccessibleExplorerItems = value;
    }

    /**
     * Gets the value of the withLOBValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithLOBValues() {
        return withLOBValues;
    }

    /**
     * Sets the value of the withLOBValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithLOBValues(Boolean value) {
        this.withLOBValues = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ReadRq.Properties }
     *     
     */
    public ReadRq.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadRq.Properties }
     *     
     */
    public void setProperties(ReadRq.Properties value) {
        this.properties = value;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded"/&gt;
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
    public static class Presentations {

        @XmlElement(name = "Item", required = true)
        protected List<Definition> item;

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
         * {@link Definition }
         * 
         * 
         */
        public List<Definition> getItem() {
            if (item == null) {
                item = new ArrayList<Definition>();
            }
            return this.item;
        }

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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class Properties {

        @XmlElement(name = "Item")
        protected List<Definition> item;

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
         * {@link Definition }
         * 
         * 
         */
        public List<Definition> getItem() {
            if (item == null) {
                item = new ArrayList<Definition>();
            }
            return this.item;
        }

    }

}
