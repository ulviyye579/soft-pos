
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserOperInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserOperInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UserOperRequest" type="{http://schemas.tranzaxis.com/tran.xsd}UserOperRequest"/&gt;
 *         &lt;element name="UserOperResponse" type="{http://schemas.tranzaxis.com/tran.xsd}UserOperResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserOperInvoke", propOrder = {
    "userOperRequest",
    "userOperResponse"
})
public class UserOperInvoke {

    @XmlElement(name = "UserOperRequest")
    protected UserOperRequest userOperRequest;
    @XmlElement(name = "UserOperResponse")
    protected UserOperResponse userOperResponse;

    /**
     * Gets the value of the userOperRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserOperRequest }
     *     
     */
    public UserOperRequest getUserOperRequest() {
        return userOperRequest;
    }

    /**
     * Sets the value of the userOperRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOperRequest }
     *     
     */
    public void setUserOperRequest(UserOperRequest value) {
        this.userOperRequest = value;
    }

    /**
     * Gets the value of the userOperResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserOperResponse }
     *     
     */
    public UserOperResponse getUserOperResponse() {
        return userOperResponse;
    }

    /**
     * Sets the value of the userOperResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOperResponse }
     *     
     */
    public void setUserOperResponse(UserOperResponse value) {
        this.userOperResponse = value;
    }

}
