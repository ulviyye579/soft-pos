
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442 Timeout - \u0432\u0440\u0435\u043c\u044f ( \u0441\u0435\u043a\u0443\u043d\u0434 ) \u0432 \u0442\u0435\u0447\u0435\u043d\u0438\u0438 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043a\u043b\u0438\u0435\u043d\u0442 \u0434\u043e\u043b\u0436\u0435\u043d \u043e\u0436\u0438\u0434\u0430\u0442\u044c \u043d\u0430\u0436\u0430\u0442\u0438\u044f \u043a\u043d\u043e\u043f\u043a\u0438
 * 
 * <p>Java class for MessageDialogWaitButtonRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDialogWaitButtonRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Timeout" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDialogWaitButtonRq")
public class MessageDialogWaitButtonRq {

    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Timeout", required = true)
    protected int timeout;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

}
