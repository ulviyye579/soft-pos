
package com.tranzaxis.schemas.contracts_payee_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Unit" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="quantity" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
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
@XmlType(name = "BillItems", propOrder = {
    "item"
})
public class BillItems {

    @XmlElement(name = "Item")
    protected List<BillItems.Item> item;

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
     * {@link BillItems.Item }
     * 
     * 
     */
    public List<BillItems.Item> getItem() {
        if (item == null) {
            item = new ArrayList<BillItems.Item>();
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
     *         &lt;element name="Code" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Unit" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="quantity" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "unit",
        "description"
    })
    public static class Item {

        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Unit")
        protected String unit;
        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "Seq", required = true)
        protected long seq;
        @XmlAttribute(name = "quantity", required = true)
        protected long quantity;
        @XmlAttribute(name = "amt", required = true)
        protected BigDecimal amt;
        @XmlAttribute(name = "ToDelete")
        protected Boolean toDelete;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the seq property.
         * 
         */
        public long getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         */
        public void setSeq(long value) {
            this.seq = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public long getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(long value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmt(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the toDelete property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isToDelete() {
            return toDelete;
        }

        /**
         * Sets the value of the toDelete property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setToDelete(Boolean value) {
            this.toDelete = value;
        }

    }

}
