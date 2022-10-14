
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressDialogTraceRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogTraceRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Trace" type="{http://schemas.radixware.org/eas.xsd}Trace"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogTraceRq", propOrder = {
    "trace"
})
public class ProgressDialogTraceRq {

    @XmlElement(name = "Trace")
    protected Trace trace;

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link Trace }
     *     
     */
    public Trace getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trace }
     *     
     */
    public void setTrace(Trace value) {
        this.trace = value;
    }

}
