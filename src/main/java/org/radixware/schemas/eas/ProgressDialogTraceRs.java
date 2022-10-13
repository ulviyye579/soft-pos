
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442 Canceled - \u0411\u044b\u043b\u0430 \u043d\u0430\u0436\u0430\u0442\u0430 \u043a\u043d\u043e\u043f\u043a\u0430 Cancel
 * 
 * <p>Java class for ProgressDialogTraceRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogTraceRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Cancelled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogTraceRs")
public class ProgressDialogTraceRs {

    @XmlAttribute(name = "Cancelled", required = true)
    protected boolean cancelled;

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(boolean value) {
        this.cancelled = value;
    }

}
