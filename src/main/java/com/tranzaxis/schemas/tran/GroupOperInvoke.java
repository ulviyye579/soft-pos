
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOperInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOperInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GroupOperRequest" type="{http://schemas.tranzaxis.com/tran.xsd}GroupOperRequest"/&gt;
 *         &lt;element name="GroupOperResponse" type="{http://schemas.tranzaxis.com/tran.xsd}GroupOperResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOperInvoke", propOrder = {
    "groupOperRequest",
    "groupOperResponse"
})
public class GroupOperInvoke {

    @XmlElement(name = "GroupOperRequest")
    protected GroupOperRequest groupOperRequest;
    @XmlElement(name = "GroupOperResponse")
    protected GroupOperResponse groupOperResponse;

    /**
     * Gets the value of the groupOperRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOperRequest }
     *     
     */
    public GroupOperRequest getGroupOperRequest() {
        return groupOperRequest;
    }

    /**
     * Sets the value of the groupOperRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOperRequest }
     *     
     */
    public void setGroupOperRequest(GroupOperRequest value) {
        this.groupOperRequest = value;
    }

    /**
     * Gets the value of the groupOperResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOperResponse }
     *     
     */
    public GroupOperResponse getGroupOperResponse() {
        return groupOperResponse;
    }

    /**
     * Sets the value of the groupOperResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOperResponse }
     *     
     */
    public void setGroupOperResponse(GroupOperResponse value) {
        this.groupOperResponse = value;
    }

}
