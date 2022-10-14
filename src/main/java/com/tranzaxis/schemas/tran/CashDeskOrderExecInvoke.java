
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashDeskOrderExecInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashDeskOrderExecInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CashDeskOrderExecRequest" type="{http://schemas.tranzaxis.com/tran.xsd}CashDeskOrderExecRequest"/&gt;
 *         &lt;element name="CashDeskOrderExecResponse" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashDeskOrderExecInvoke", propOrder = {
    "cashDeskOrderExecRequest",
    "cashDeskOrderExecResponse"
})
public class CashDeskOrderExecInvoke {

    @XmlElement(name = "CashDeskOrderExecRequest")
    protected CashDeskOrderExecRequest cashDeskOrderExecRequest;
    @XmlElement(name = "CashDeskOrderExecResponse")
    protected Response cashDeskOrderExecResponse;

    /**
     * Gets the value of the cashDeskOrderExecRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CashDeskOrderExecRequest }
     *     
     */
    public CashDeskOrderExecRequest getCashDeskOrderExecRequest() {
        return cashDeskOrderExecRequest;
    }

    /**
     * Sets the value of the cashDeskOrderExecRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDeskOrderExecRequest }
     *     
     */
    public void setCashDeskOrderExecRequest(CashDeskOrderExecRequest value) {
        this.cashDeskOrderExecRequest = value;
    }

    /**
     * Gets the value of the cashDeskOrderExecResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getCashDeskOrderExecResponse() {
        return cashDeskOrderExecResponse;
    }

    /**
     * Sets the value of the cashDeskOrderExecResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setCashDeskOrderExecResponse(Response value) {
        this.cashDeskOrderExecResponse = value;
    }

}
