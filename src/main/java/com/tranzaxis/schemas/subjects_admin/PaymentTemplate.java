
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.invoicing.Invoice;
import com.tranzaxis.schemas.tran_common.PaymentTemplateSettings;


/**
 * <p>Java class for PaymentTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceSettings" type="{http://schemas.tranzaxis.com/invoicing.xsd}Invoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTemplate", propOrder = {
    "title",
    "settings",
    "invoiceSettings"
})
public class PaymentTemplate {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Settings")
    protected PaymentTemplateSettings settings;
    @XmlElement(name = "InvoiceSettings")
    protected Invoice invoiceSettings;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

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
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public PaymentTemplateSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public void setSettings(PaymentTemplateSettings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the invoiceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoiceSettings() {
        return invoiceSettings;
    }

    /**
     * Sets the value of the invoiceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoiceSettings(Invoice value) {
        this.invoiceSettings = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
