
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquiryInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="InquiryRequest" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryRequest"/&gt;
 *         &lt;element name="InquiryResponse" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryInvoke", propOrder = {
    "inquiryRequest",
    "inquiryResponse"
})
public class InquiryInvoke {

    @XmlElement(name = "InquiryRequest")
    protected InquiryRequest inquiryRequest;
    @XmlElement(name = "InquiryResponse")
    protected InquiryResponse inquiryResponse;

    /**
     * Gets the value of the inquiryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest }
     *     
     */
    public InquiryRequest getInquiryRequest() {
        return inquiryRequest;
    }

    /**
     * Sets the value of the inquiryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest }
     *     
     */
    public void setInquiryRequest(InquiryRequest value) {
        this.inquiryRequest = value;
    }

    /**
     * Gets the value of the inquiryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse }
     *     
     */
    public InquiryResponse getInquiryResponse() {
        return inquiryResponse;
    }

    /**
     * Sets the value of the inquiryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse }
     *     
     */
    public void setInquiryResponse(InquiryResponse value) {
        this.inquiryResponse = value;
    }

}
