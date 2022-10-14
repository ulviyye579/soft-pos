
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListVisibleExplorerItemsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListVisibleExplorerItemsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ListVisibleExplorerItemsRs" type="{http://schemas.radixware.org/eas.xsd}ListVisibleExplorerItemsRs"/&gt;
 *         &lt;element name="ListVisibleExplorerItemsRq" type="{http://schemas.radixware.org/eas.xsd}ListVisibleExplorerItemsRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListVisibleExplorerItemsMess", propOrder = {
    "listVisibleExplorerItemsRs",
    "listVisibleExplorerItemsRq"
})
public class ListVisibleExplorerItemsMess {

    @XmlElement(name = "ListVisibleExplorerItemsRs")
    protected ListVisibleExplorerItemsRs listVisibleExplorerItemsRs;
    @XmlElement(name = "ListVisibleExplorerItemsRq")
    protected ListVisibleExplorerItemsRq listVisibleExplorerItemsRq;

    /**
     * Gets the value of the listVisibleExplorerItemsRs property.
     * 
     * @return
     *     possible object is
     *     {@link ListVisibleExplorerItemsRs }
     *     
     */
    public ListVisibleExplorerItemsRs getListVisibleExplorerItemsRs() {
        return listVisibleExplorerItemsRs;
    }

    /**
     * Sets the value of the listVisibleExplorerItemsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListVisibleExplorerItemsRs }
     *     
     */
    public void setListVisibleExplorerItemsRs(ListVisibleExplorerItemsRs value) {
        this.listVisibleExplorerItemsRs = value;
    }

    /**
     * Gets the value of the listVisibleExplorerItemsRq property.
     * 
     * @return
     *     possible object is
     *     {@link ListVisibleExplorerItemsRq }
     *     
     */
    public ListVisibleExplorerItemsRq getListVisibleExplorerItemsRq() {
        return listVisibleExplorerItemsRq;
    }

    /**
     * Sets the value of the listVisibleExplorerItemsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListVisibleExplorerItemsRq }
     *     
     */
    public void setListVisibleExplorerItemsRq(ListVisibleExplorerItemsRq value) {
        this.listVisibleExplorerItemsRq = value;
    }

}
