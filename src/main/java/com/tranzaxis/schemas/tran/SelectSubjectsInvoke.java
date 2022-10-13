
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectSubjectsInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectSubjectsInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectSubjectsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsRequest"/&gt;
 *         &lt;element name="SelectSubjectsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectSubjectsInvoke", propOrder = {
    "selectSubjectsRequest",
    "selectSubjectsResponse"
})
public class SelectSubjectsInvoke {

    @XmlElement(name = "SelectSubjectsRequest")
    protected SelectSubjectsRequest selectSubjectsRequest;
    @XmlElement(name = "SelectSubjectsResponse")
    protected SelectSubjectsResponse selectSubjectsResponse;

    /**
     * Gets the value of the selectSubjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SelectSubjectsRequest }
     *     
     */
    public SelectSubjectsRequest getSelectSubjectsRequest() {
        return selectSubjectsRequest;
    }

    /**
     * Sets the value of the selectSubjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectSubjectsRequest }
     *     
     */
    public void setSelectSubjectsRequest(SelectSubjectsRequest value) {
        this.selectSubjectsRequest = value;
    }

    /**
     * Gets the value of the selectSubjectsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SelectSubjectsResponse }
     *     
     */
    public SelectSubjectsResponse getSelectSubjectsResponse() {
        return selectSubjectsResponse;
    }

    /**
     * Sets the value of the selectSubjectsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectSubjectsResponse }
     *     
     */
    public void setSelectSubjectsResponse(SelectSubjectsResponse value) {
        this.selectSubjectsResponse = value;
    }

}
