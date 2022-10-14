
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TranInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Request" type="{http://schemas.tranzaxis.com/tran.xsd}Request"/&gt;
 *         &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "Tran", namespace = "http://schemas.tranzaxis.com/tran.wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranInvoke", propOrder = {
    "request",
    "response"
})
public class TranInvoke {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "Response")
    protected Response response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

}
