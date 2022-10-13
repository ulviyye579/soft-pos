
package com.tranzaxis.schemas.subjects_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTemplates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTemplates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentTemplate" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}PaymentTemplate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTemplates", propOrder = {
    "paymentTemplate"
})
public class PaymentTemplates {

    @XmlElement(name = "PaymentTemplate")
    protected List<PaymentTemplate> paymentTemplate;
    @XmlAttribute(name = "Mode")
    protected Mode mode;

    /**
     * Gets the value of the paymentTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTemplate }
     * 
     * 
     */
    public List<PaymentTemplate> getPaymentTemplate() {
        if (paymentTemplate == null) {
            paymentTemplate = new ArrayList<PaymentTemplate>();
        }
        return this.paymentTemplate;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Mode }
     *     
     */
    public Mode getMode() {
        if (mode == null) {
            return Mode.SYNC;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mode }
     *     
     */
    public void setMode(Mode value) {
        this.mode = value;
    }

}
