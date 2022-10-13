
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for UndoInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndoInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UndoRequest" type="{http://schemas.tranzaxis.com/tran.xsd}UndoRequest"/&gt;
 *         &lt;element name="UndoResponse" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "UndoTran", namespace = "http://schemas.tranzaxis.com/tran.wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndoInvoke", propOrder = {
    "undoRequest",
    "undoResponse"
})
public class UndoInvoke {

    @XmlElement(name = "UndoRequest")
    protected UndoRequest undoRequest;
    @XmlElement(name = "UndoResponse")
    protected Response undoResponse;

    /**
     * Gets the value of the undoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UndoRequest }
     *     
     */
    public UndoRequest getUndoRequest() {
        return undoRequest;
    }

    /**
     * Sets the value of the undoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndoRequest }
     *     
     */
    public void setUndoRequest(UndoRequest value) {
        this.undoRequest = value;
    }

    /**
     * Gets the value of the undoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getUndoResponse() {
        return undoResponse;
    }

    /**
     * Sets the value of the undoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setUndoResponse(Response value) {
        this.undoResponse = value;
    }

}
