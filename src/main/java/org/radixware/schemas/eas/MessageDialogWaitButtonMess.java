
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDialogWaitButtonMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDialogWaitButtonMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MessageDialogWaitButtonRs" type="{http://schemas.radixware.org/eas.xsd}MessageDialogWaitButtonRs"/&gt;
 *         &lt;element name="MessageDialogWaitButtonRq" type="{http://schemas.radixware.org/eas.xsd}MessageDialogWaitButtonRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDialogWaitButtonMess", propOrder = {
    "messageDialogWaitButtonRs",
    "messageDialogWaitButtonRq"
})
public class MessageDialogWaitButtonMess {

    @XmlElement(name = "MessageDialogWaitButtonRs")
    protected MessageDialogWaitButtonRs messageDialogWaitButtonRs;
    @XmlElement(name = "MessageDialogWaitButtonRq")
    protected MessageDialogWaitButtonRq messageDialogWaitButtonRq;

    /**
     * Gets the value of the messageDialogWaitButtonRs property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDialogWaitButtonRs }
     *     
     */
    public MessageDialogWaitButtonRs getMessageDialogWaitButtonRs() {
        return messageDialogWaitButtonRs;
    }

    /**
     * Sets the value of the messageDialogWaitButtonRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDialogWaitButtonRs }
     *     
     */
    public void setMessageDialogWaitButtonRs(MessageDialogWaitButtonRs value) {
        this.messageDialogWaitButtonRs = value;
    }

    /**
     * Gets the value of the messageDialogWaitButtonRq property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDialogWaitButtonRq }
     *     
     */
    public MessageDialogWaitButtonRq getMessageDialogWaitButtonRq() {
        return messageDialogWaitButtonRq;
    }

    /**
     * Sets the value of the messageDialogWaitButtonRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDialogWaitButtonRq }
     *     
     */
    public void setMessageDialogWaitButtonRq(MessageDialogWaitButtonRq value) {
        this.messageDialogWaitButtonRq = value;
    }

}
