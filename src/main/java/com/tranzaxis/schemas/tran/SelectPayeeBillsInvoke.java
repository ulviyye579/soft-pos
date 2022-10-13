
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectPayeeBillsInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectPayeeBillsInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectPayeeBillsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsRequest"/&gt;
 *         &lt;element name="SelectPayeeBillsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectPayeeBillsInvoke", propOrder = {
    "selectPayeeBillsRequest",
    "selectPayeeBillsResponse"
})
public class SelectPayeeBillsInvoke {

    @XmlElement(name = "SelectPayeeBillsRequest")
    protected SelectPayeeBillsRequest selectPayeeBillsRequest;
    @XmlElement(name = "SelectPayeeBillsResponse")
    protected SelectPayeeBillsResponse selectPayeeBillsResponse;

    /**
     * Gets the value of the selectPayeeBillsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectPayeeBillsRequest }
     *     
     */
    public SelectPayeeBillsRequest getSelectPayeeBillsRequest() {
        return selectPayeeBillsRequest;
    }

    /**
     * Sets the value of the selectPayeeBillsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectPayeeBillsRequest }
     *     
     */
    public void setSelectPayeeBillsRequest(SelectPayeeBillsRequest value) {
        this.selectPayeeBillsRequest = value;
    }

    /**
     * Gets the value of the selectPayeeBillsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectPayeeBillsResponse }
     *     
     */
    public SelectPayeeBillsResponse getSelectPayeeBillsResponse() {
        return selectPayeeBillsResponse;
    }

    /**
     * Sets the value of the selectPayeeBillsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectPayeeBillsResponse }
     *     
     */
    public void setSelectPayeeBillsResponse(SelectPayeeBillsResponse value) {
        this.selectPayeeBillsResponse = value;
    }

}
