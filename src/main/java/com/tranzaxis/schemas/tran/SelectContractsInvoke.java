
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectContractsInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectContractsInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectContractsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsRequest"/&gt;
 *         &lt;element name="SelectContractsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectContractsInvoke", propOrder = {
    "selectContractsRequest",
    "selectContractsResponse"
})
public class SelectContractsInvoke {

    @XmlElement(name = "SelectContractsRequest")
    protected SelectContractsRequest selectContractsRequest;
    @XmlElement(name = "SelectContractsResponse")
    protected SelectContractsResponse selectContractsResponse;

    /**
     * Gets the value of the selectContractsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectContractsRequest }
     *     
     */
    public SelectContractsRequest getSelectContractsRequest() {
        return selectContractsRequest;
    }

    /**
     * Sets the value of the selectContractsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectContractsRequest }
     *     
     */
    public void setSelectContractsRequest(SelectContractsRequest value) {
        this.selectContractsRequest = value;
    }

    /**
     * Gets the value of the selectContractsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectContractsResponse }
     *     
     */
    public SelectContractsResponse getSelectContractsResponse() {
        return selectContractsResponse;
    }

    /**
     * Sets the value of the selectContractsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectContractsResponse }
     *     
     */
    public void setSelectContractsResponse(SelectContractsResponse value) {
        this.selectContractsResponse = value;
    }

}
