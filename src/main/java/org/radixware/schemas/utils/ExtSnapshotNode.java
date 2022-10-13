
package org.radixware.schemas.utils;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtSnapshotNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtSnapshotNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalcError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Table" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotTable" minOccurs="0"/&gt;
 *         &lt;element name="Children" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Node" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSnapshotNode", propOrder = {
    "comment",
    "calcError",
    "table",
    "children"
})
public class ExtSnapshotNode {

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CalcError")
    protected String calcError;
    @XmlElement(name = "Table")
    protected ExtSnapshotTable table;
    @XmlElement(name = "Children")
    protected ExtSnapshotNode.Children children;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the calcError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcError() {
        return calcError;
    }

    /**
     * Sets the value of the calcError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcError(String value) {
        this.calcError = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSnapshotTable }
     *     
     */
    public ExtSnapshotTable getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSnapshotTable }
     *     
     */
    public void setTable(ExtSnapshotTable value) {
        this.table = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSnapshotNode.Children }
     *     
     */
    public ExtSnapshotNode.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSnapshotNode.Children }
     *     
     */
    public void setChildren(ExtSnapshotNode.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     *         &lt;element name="Node" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotNode" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "node"
    })
    public static class Children {

        @XmlElement(name = "Node")
        protected List<ExtSnapshotNode> node;

        /**
         * Gets the value of the node property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the node property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtSnapshotNode }
         * 
         * 
         */
        public List<ExtSnapshotNode> getNode() {
            if (node == null) {
                node = new ArrayList<ExtSnapshotNode>();
            }
            return this.node;
        }

    }

}
