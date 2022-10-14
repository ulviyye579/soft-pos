
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressDialogTraceMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogTraceMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ProgressDialogTraceRs" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogTraceRs"/&gt;
 *         &lt;element name="ProgressDialogTraceRq" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogTraceRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogTraceMess", propOrder = {
    "progressDialogTraceRs",
    "progressDialogTraceRq"
})
public class ProgressDialogTraceMess {

    @XmlElement(name = "ProgressDialogTraceRs")
    protected ProgressDialogTraceRs progressDialogTraceRs;
    @XmlElement(name = "ProgressDialogTraceRq")
    protected ProgressDialogTraceRq progressDialogTraceRq;

    /**
     * Gets the value of the progressDialogTraceRs property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogTraceRs }
     *     
     */
    public ProgressDialogTraceRs getProgressDialogTraceRs() {
        return progressDialogTraceRs;
    }

    /**
     * Sets the value of the progressDialogTraceRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogTraceRs }
     *     
     */
    public void setProgressDialogTraceRs(ProgressDialogTraceRs value) {
        this.progressDialogTraceRs = value;
    }

    /**
     * Gets the value of the progressDialogTraceRq property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogTraceRq }
     *     
     */
    public ProgressDialogTraceRq getProgressDialogTraceRq() {
        return progressDialogTraceRq;
    }

    /**
     * Sets the value of the progressDialogTraceRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogTraceRq }
     *     
     */
    public void setProgressDialogTraceRq(ProgressDialogTraceRq value) {
        this.progressDialogTraceRq = value;
    }

}
