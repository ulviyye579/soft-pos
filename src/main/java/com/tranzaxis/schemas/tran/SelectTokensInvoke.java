
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTokensInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTokensInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectTokensRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensRequest"/&gt;
 *         &lt;element name="SelectTokensResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTokensInvoke", propOrder = {
    "selectTokensRequest",
    "selectTokensResponse"
})
public class SelectTokensInvoke {

    @XmlElement(name = "SelectTokensRequest")
    protected SelectTokensRequest selectTokensRequest;
    @XmlElement(name = "SelectTokensResponse")
    protected SelectTokensResponse selectTokensResponse;

    /**
     * Gets the value of the selectTokensRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTokensRequest }
     *     
     */
    public SelectTokensRequest getSelectTokensRequest() {
        return selectTokensRequest;
    }

    /**
     * Sets the value of the selectTokensRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTokensRequest }
     *     
     */
    public void setSelectTokensRequest(SelectTokensRequest value) {
        this.selectTokensRequest = value;
    }

    /**
     * Gets the value of the selectTokensResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTokensResponse }
     *     
     */
    public SelectTokensResponse getSelectTokensResponse() {
        return selectTokensResponse;
    }

    /**
     * Sets the value of the selectTokensResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTokensResponse }
     *     
     */
    public void setSelectTokensResponse(SelectTokensResponse value) {
        this.selectTokensResponse = value;
    }

}
