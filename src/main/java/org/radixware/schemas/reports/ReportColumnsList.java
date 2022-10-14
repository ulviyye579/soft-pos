
package org.radixware.schemas.reports;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportColumnsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportColumnsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Column" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Width" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="Millimeters" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ColumnId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ReportColumnsList", propOrder = {
    "column"
})
public class ReportColumnsList {

    @XmlElement(name = "Column", required = true)
    protected List<ReportColumnsList.Column> column;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportColumnsList.Column }
     * 
     * 
     */
    public List<ReportColumnsList.Column> getColumn() {
        if (column == null) {
            column = new ArrayList<ReportColumnsList.Column>();
        }
        return this.column;
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
     *         &lt;element name="Width" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="Millimeters" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ColumnId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "width"
    })
    public static class Column {

        @XmlElement(name = "Width")
        protected ReportColumnsList.Column.Width width;
        @XmlAttribute(name = "ColumnId")
        protected String columnId;
        @XmlAttribute(name = "ColumnName")
        protected String columnName;

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link ReportColumnsList.Column.Width }
         *     
         */
        public ReportColumnsList.Column.Width getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportColumnsList.Column.Width }
         *     
         */
        public void setWidth(ReportColumnsList.Column.Width value) {
            this.width = value;
        }

        /**
         * Gets the value of the columnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnId() {
            return columnId;
        }

        /**
         * Sets the value of the columnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnId(String value) {
            this.columnId = value;
        }

        /**
         * Gets the value of the columnName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnName() {
            return columnName;
        }

        /**
         * Sets the value of the columnName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnName(String value) {
            this.columnName = value;
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
         *       &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="Millimeters" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Width {

            @XmlAttribute(name = "Columns")
            protected Integer columns;
            @XmlAttribute(name = "Millimeters")
            protected BigDecimal millimeters;

            /**
             * Gets the value of the columns property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getColumns() {
                return columns;
            }

            /**
             * Sets the value of the columns property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setColumns(Integer value) {
                this.columns = value;
            }

            /**
             * Gets the value of the millimeters property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMillimeters() {
                return millimeters;
            }

            /**
             * Sets the value of the millimeters property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMillimeters(BigDecimal value) {
                this.millimeters = value;
            }

        }

    }

}
