
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectPayeeConsumersInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectPayeeConsumersInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectPayeeConsumersRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersRequest"/&gt;
 *         &lt;element name="SelectPayeeConsumersResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectPayeeConsumersInvoke", propOrder = {
    "selectPayeeConsumersRequest",
    "selectPayeeConsumersResponse"
})
public class SelectPayeeConsumersInvoke {

    @XmlElement(name = "SelectPayeeConsumersRequest")
    protected SelectPayeeConsumersRequest selectPayeeConsumersRequest;
    @XmlElement(name = "SelectPayeeConsumersResponse")
    protected SelectPayeeConsumersResponse selectPayeeConsumersResponse;

    /**
     * Gets the value of the selectPayeeConsumersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectPayeeConsumersRequest }
     *     
     */
    public SelectPayeeConsumersRequest getSelectPayeeConsumersRequest() {
        return selectPayeeConsumersRequest;
    }

    /**
     * Sets the value of the selectPayeeConsumersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectPayeeConsumersRequest }
     *     
     */
    public void setSelectPayeeConsumersRequest(SelectPayeeConsumersRequest value) {
        this.selectPayeeConsumersRequest = value;
    }

    /**
     * Gets the value of the selectPayeeConsumersResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectPayeeConsumersResponse }
     *     
     */
    public SelectPayeeConsumersResponse getSelectPayeeConsumersResponse() {
        return selectPayeeConsumersResponse;
    }

    /**
     * Sets the value of the selectPayeeConsumersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectPayeeConsumersResponse }
     *     
     */
    public void setSelectPayeeConsumersResponse(SelectPayeeConsumersResponse value) {
        this.selectPayeeConsumersResponse = value;
    }

}
