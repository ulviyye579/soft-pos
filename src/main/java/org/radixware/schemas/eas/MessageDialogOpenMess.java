
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDialogOpenMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDialogOpenMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MessageDialogOpenRs" type="{http://schemas.radixware.org/eas.xsd}MessageDialogOpenRs"/&gt;
 *         &lt;element name="MessageDialogOpenRq" type="{http://schemas.radixware.org/eas.xsd}MessageDialogOpenRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDialogOpenMess", propOrder = {
    "messageDialogOpenRs",
    "messageDialogOpenRq"
})
public class MessageDialogOpenMess {

    @XmlElement(name = "MessageDialogOpenRs")
    protected MessageDialogOpenRs messageDialogOpenRs;
    @XmlElement(name = "MessageDialogOpenRq")
    protected MessageDialogOpenRq messageDialogOpenRq;

    /**
     * Gets the value of the messageDialogOpenRs property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDialogOpenRs }
     *     
     */
    public MessageDialogOpenRs getMessageDialogOpenRs() {
        return messageDialogOpenRs;
    }

    /**
     * Sets the value of the messageDialogOpenRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDialogOpenRs }
     *     
     */
    public void setMessageDialogOpenRs(MessageDialogOpenRs value) {
        this.messageDialogOpenRs = value;
    }

    /**
     * Gets the value of the messageDialogOpenRq property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDialogOpenRq }
     *     
     */
    public MessageDialogOpenRq getMessageDialogOpenRq() {
        return messageDialogOpenRq;
    }

    /**
     * Sets the value of the messageDialogOpenRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDialogOpenRq }
     *     
     */
    public void setMessageDialogOpenRq(MessageDialogOpenRq value) {
        this.messageDialogOpenRq = value;
    }

}
