
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTransInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTransInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectTransRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransRequest"/&gt;
 *         &lt;element name="SelectTransResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTransInvoke", propOrder = {
    "selectTransRequest",
    "selectTransResponse"
})
public class SelectTransInvoke {

    @XmlElement(name = "SelectTransRequest")
    protected SelectTransRequest selectTransRequest;
    @XmlElement(name = "SelectTransResponse")
    protected SelectTransResponse selectTransResponse;

    /**
     * Gets the value of the selectTransRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTransRequest }
     *     
     */
    public SelectTransRequest getSelectTransRequest() {
        return selectTransRequest;
    }

    /**
     * Sets the value of the selectTransRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTransRequest }
     *     
     */
    public void setSelectTransRequest(SelectTransRequest value) {
        this.selectTransRequest = value;
    }

    /**
     * Gets the value of the selectTransResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTransResponse }
     *     
     */
    public SelectTransResponse getSelectTransResponse() {
        return selectTransResponse;
    }

    /**
     * Sets the value of the selectTransResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTransResponse }
     *     
     */
    public void setSelectTransResponse(SelectTransResponse value) {
        this.selectTransResponse = value;
    }

}
