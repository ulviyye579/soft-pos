
package org.radixware.schemas.utils;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtSnapshotTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtSnapshotTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotTableHeader" minOccurs="0"/&gt;
 *         &lt;element name="Rows" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Row" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Cell" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotTableCell" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ExtSnapshotTable", propOrder = {
    "header",
    "rows"
})
public class ExtSnapshotTable {

    @XmlElement(name = "Header")
    protected ExtSnapshotTableHeader header;
    @XmlElement(name = "Rows")
    protected ExtSnapshotTable.Rows rows;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSnapshotTableHeader }
     *     
     */
    public ExtSnapshotTableHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSnapshotTableHeader }
     *     
     */
    public void setHeader(ExtSnapshotTableHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSnapshotTable.Rows }
     *     
     */
    public ExtSnapshotTable.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSnapshotTable.Rows }
     *     
     */
    public void setRows(ExtSnapshotTable.Rows value) {
        this.rows = value;
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
     *         &lt;element name="Row" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Cell" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotTableCell" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class Rows {

        @XmlElement(name = "Row")
        protected List<ExtSnapshotTable.Rows.Row> row;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtSnapshotTable.Rows.Row }
         * 
         * 
         */
        public List<ExtSnapshotTable.Rows.Row> getRow() {
            if (row == null) {
                row = new ArrayList<ExtSnapshotTable.Rows.Row>();
            }
            return this.row;
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
         *         &lt;element name="Cell" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotTableCell" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "cell"
        })
        public static class Row {

            @XmlElement(name = "Cell")
            protected List<ExtSnapshotTableCell> cell;

            /**
             * Gets the value of the cell property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cell property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCell().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExtSnapshotTableCell }
             * 
             * 
             */
            public List<ExtSnapshotTableCell> getCell() {
                if (cell == null) {
                    cell = new ArrayList<ExtSnapshotTableCell>();
                }
                return this.cell;
            }

        }

    }

}
