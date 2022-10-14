
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.contracts_payee_admin.PaymentBill;


/**
 * <p>Java class for SelectPayeeBillsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectPayeeBillsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeBill" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PaymentBill" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasMore" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectPayeeBillsResponse", propOrder = {
    "payeeBill"
})
public class SelectPayeeBillsResponse {

    @XmlElement(name = "PayeeBill")
    protected List<PaymentBill> payeeBill;
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;

    /**
     * Gets the value of the payeeBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentBill }
     * 
     * 
     */
    public List<PaymentBill> getPayeeBill() {
        if (payeeBill == null) {
            payeeBill = new ArrayList<PaymentBill>();
        }
        return this.payeeBill;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

}
