
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PressedButtonId - \u0438\u0434\u043a\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440 \u043d\u0430\u0436\u0430\u0442\u043e\u0439 \u043a\u043d\u043e\u043f\u043a\u0438.
 *                 \u0415\u0441\u043b\u0438 \u0432 \u0442\u0435\u0447\u0435\u043d\u0438\u0438 \u0437\u0430\u0434\u0430\u043d\u043d\u043e\u0433\u043e \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u043a\u043d\u043e\u043f\u043a\u0438 \u043d\u0435 \u0431\u044b\u043b\u0438 \u043d\u0430\u0436\u0430\u0442\u044b – \u043a\u043b\u0438\u0435\u043d\u0442 \u0434\u043e\u043b\u0436\u0435\u043d \u043f\u0440\u0438\u0441\u043b\u0430\u0442\u044c \u043f\u0443\u0441\u0442\u043e\u0439 \u043e\u0442\u0432\u0435\u0442, \u043f\u0440\u0438 \u044d\u0442\u043e\u043c \u0434\u0438\u0430\u043b\u043e\u0433 \u043e\u0441\u0442\u0430\u0435\u0442\u0441\u044f \u043e\u0442\u043a\u0440\u044b\u0442\u044b\u043c. \u0415\u0441\u043b\u0438 \u043a\u043d\u043e\u043f\u043a\u0430 \u0431\u044b\u043b\u0430 \u043d\u0430\u0436\u0430\u0442\u0430, \u0442\u043e \u0435\u0435 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440 \u0437\u0430\u043f\u0438\u0441\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u0432 PressedButtonId, \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043e\u0442\u0432\u0435\u0442 \u0438 \u0434\u0438\u0430\u043b\u043e\u0433 \u0437\u0430\u043a\u0440\u044b\u0432\u0430\u0435\u0442\u0441\u044f.
 * 
 * <p>Java class for MessageDialogWaitButtonRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDialogWaitButtonRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PressedButtonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDialogWaitButtonRs", propOrder = {
    "pressedButtonId"
})
public class MessageDialogWaitButtonRs {

    @XmlElement(name = "PressedButtonId")
    protected String pressedButtonId;

    /**
     * Gets the value of the pressedButtonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressedButtonId() {
        return pressedButtonId;
    }

    /**
     * Sets the value of the pressedButtonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressedButtonId(String value) {
        this.pressedButtonId = value;
    }

}
