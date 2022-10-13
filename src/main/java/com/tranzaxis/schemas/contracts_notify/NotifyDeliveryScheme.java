
package com.tranzaxis.schemas.contracts_notify;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.ImpExpEntity;


/**
 * <p>Java class for NotifyDeliveryScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyDeliveryScheme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="NotifyDeliverySchemeItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NotifyDeliverySchemeItem" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyDeliverySchemeItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "NotifyDeliveryScheme", propOrder = {
    "rid",
    "title",
    "notes",
    "notifyDeliverySchemeItems"
})
public class NotifyDeliveryScheme
    extends ImpExpEntity
{

    @XmlElement(name = "Rid")
    protected String rid;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "NotifyDeliverySchemeItems", required = true)
    protected NotifyDeliveryScheme.NotifyDeliverySchemeItems notifyDeliverySchemeItems;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notifyDeliverySchemeItems property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyDeliveryScheme.NotifyDeliverySchemeItems }
     *     
     */
    public NotifyDeliveryScheme.NotifyDeliverySchemeItems getNotifyDeliverySchemeItems() {
        return notifyDeliverySchemeItems;
    }

    /**
     * Sets the value of the notifyDeliverySchemeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyDeliveryScheme.NotifyDeliverySchemeItems }
     *     
     */
    public void setNotifyDeliverySchemeItems(NotifyDeliveryScheme.NotifyDeliverySchemeItems value) {
        this.notifyDeliverySchemeItems = value;
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
     *         &lt;element name="NotifyDeliverySchemeItem" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyDeliverySchemeItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "notifyDeliverySchemeItem"
    })
    public static class NotifyDeliverySchemeItems {

        @XmlElement(name = "NotifyDeliverySchemeItem")
        protected List<NotifyDeliverySchemeItem> notifyDeliverySchemeItem;

        /**
         * Gets the value of the notifyDeliverySchemeItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notifyDeliverySchemeItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotifyDeliverySchemeItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotifyDeliverySchemeItem }
         * 
         * 
         */
        public List<NotifyDeliverySchemeItem> getNotifyDeliverySchemeItem() {
            if (notifyDeliverySchemeItem == null) {
                notifyDeliverySchemeItem = new ArrayList<NotifyDeliverySchemeItem>();
            }
            return this.notifyDeliverySchemeItem;
        }

    }

}
