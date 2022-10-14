
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListVisibleExplorerItemsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListVisibleExplorerItemsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisibleExplorerItems"&gt;
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
@XmlType(name = "ListVisibleExplorerItemsRs", propOrder = {
    "visibleExplorerItems"
})
public class ListVisibleExplorerItemsRs
    extends Response
{

    @XmlElement(name = "VisibleExplorerItems", required = true)
    protected ListVisibleExplorerItemsRs.VisibleExplorerItems visibleExplorerItems;

    /**
     * Gets the value of the visibleExplorerItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListVisibleExplorerItemsRs.VisibleExplorerItems }
     *     
     */
    public ListVisibleExplorerItemsRs.VisibleExplorerItems getVisibleExplorerItems() {
        return visibleExplorerItems;
    }

    /**
     * Sets the value of the visibleExplorerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListVisibleExplorerItemsRs.VisibleExplorerItems }
     *     
     */
    public void setVisibleExplorerItems(ListVisibleExplorerItemsRs.VisibleExplorerItems value) {
        this.visibleExplorerItems = value;
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
    public static class VisibleExplorerItems {

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
