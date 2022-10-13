
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTerminalsInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTerminalsInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectTerminalsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsRequest"/&gt;
 *         &lt;element name="SelectTerminalsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTerminalsInvoke", propOrder = {
    "selectTerminalsRequest",
    "selectTerminalsResponse"
})
public class SelectTerminalsInvoke {

    @XmlElement(name = "SelectTerminalsRequest")
    protected SelectTerminalsRequest selectTerminalsRequest;
    @XmlElement(name = "SelectTerminalsResponse")
    protected SelectTerminalsResponse selectTerminalsResponse;

    /**
     * Gets the value of the selectTerminalsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTerminalsRequest }
     *     
     */
    public SelectTerminalsRequest getSelectTerminalsRequest() {
        return selectTerminalsRequest;
    }

    /**
     * Sets the value of the selectTerminalsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTerminalsRequest }
     *     
     */
    public void setSelectTerminalsRequest(SelectTerminalsRequest value) {
        this.selectTerminalsRequest = value;
    }

    /**
     * Gets the value of the selectTerminalsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTerminalsResponse }
     *     
     */
    public SelectTerminalsResponse getSelectTerminalsResponse() {
        return selectTerminalsResponse;
    }

    /**
     * Sets the value of the selectTerminalsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTerminalsResponse }
     *     
     */
    public void setSelectTerminalsResponse(SelectTerminalsResponse value) {
        this.selectTerminalsResponse = value;
    }

}
