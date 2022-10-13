
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressDialogFinishProcessMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogFinishProcessMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ProgressDialogFinishProcessRs" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogFinishProcessRs"/&gt;
 *         &lt;element name="ProgressDialogFinishProcessRq" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogFinishProcessRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogFinishProcessMess", propOrder = {
    "progressDialogFinishProcessRs",
    "progressDialogFinishProcessRq"
})
public class ProgressDialogFinishProcessMess {

    @XmlElement(name = "ProgressDialogFinishProcessRs")
    protected ProgressDialogFinishProcessRs progressDialogFinishProcessRs;
    @XmlElement(name = "ProgressDialogFinishProcessRq")
    protected ProgressDialogFinishProcessRq progressDialogFinishProcessRq;

    /**
     * Gets the value of the progressDialogFinishProcessRs property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogFinishProcessRs }
     *     
     */
    public ProgressDialogFinishProcessRs getProgressDialogFinishProcessRs() {
        return progressDialogFinishProcessRs;
    }

    /**
     * Sets the value of the progressDialogFinishProcessRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogFinishProcessRs }
     *     
     */
    public void setProgressDialogFinishProcessRs(ProgressDialogFinishProcessRs value) {
        this.progressDialogFinishProcessRs = value;
    }

    /**
     * Gets the value of the progressDialogFinishProcessRq property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogFinishProcessRq }
     *     
     */
    public ProgressDialogFinishProcessRq getProgressDialogFinishProcessRq() {
        return progressDialogFinishProcessRq;
    }

    /**
     * Sets the value of the progressDialogFinishProcessRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogFinishProcessRq }
     *     
     */
    public void setProgressDialogFinishProcessRq(ProgressDialogFinishProcessRq value) {
        this.progressDialogFinishProcessRq = value;
    }

}
