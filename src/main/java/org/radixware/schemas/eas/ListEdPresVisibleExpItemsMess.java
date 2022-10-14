
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListEdPresVisibleExpItemsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListEdPresVisibleExpItemsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ListEdPresVisibleExpItemsRs" type="{http://schemas.radixware.org/eas.xsd}ListEdPresVisibleExpItemsRs"/&gt;
 *         &lt;element name="ListEdPresVisibleExpItemsRq" type="{http://schemas.radixware.org/eas.xsd}ListEdPresVisibleExpItemsRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListEdPresVisibleExpItemsMess", propOrder = {
    "listEdPresVisibleExpItemsRs",
    "listEdPresVisibleExpItemsRq"
})
public class ListEdPresVisibleExpItemsMess {

    @XmlElement(name = "ListEdPresVisibleExpItemsRs")
    protected ListEdPresVisibleExpItemsRs listEdPresVisibleExpItemsRs;
    @XmlElement(name = "ListEdPresVisibleExpItemsRq")
    protected ListEdPresVisibleExpItemsRq listEdPresVisibleExpItemsRq;

    /**
     * Gets the value of the listEdPresVisibleExpItemsRs property.
     * 
     * @return
     *     possible object is
     *     {@link ListEdPresVisibleExpItemsRs }
     *     
     */
    public ListEdPresVisibleExpItemsRs getListEdPresVisibleExpItemsRs() {
        return listEdPresVisibleExpItemsRs;
    }

    /**
     * Sets the value of the listEdPresVisibleExpItemsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEdPresVisibleExpItemsRs }
     *     
     */
    public void setListEdPresVisibleExpItemsRs(ListEdPresVisibleExpItemsRs value) {
        this.listEdPresVisibleExpItemsRs = value;
    }

    /**
     * Gets the value of the listEdPresVisibleExpItemsRq property.
     * 
     * @return
     *     possible object is
     *     {@link ListEdPresVisibleExpItemsRq }
     *     
     */
    public ListEdPresVisibleExpItemsRq getListEdPresVisibleExpItemsRq() {
        return listEdPresVisibleExpItemsRq;
    }

    /**
     * Sets the value of the listEdPresVisibleExpItemsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEdPresVisibleExpItemsRq }
     *     
     */
    public void setListEdPresVisibleExpItemsRq(ListEdPresVisibleExpItemsRq value) {
        this.listEdPresVisibleExpItemsRq = value;
    }

}
