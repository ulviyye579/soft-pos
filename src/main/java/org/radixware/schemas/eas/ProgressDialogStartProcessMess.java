
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressDialogStartProcessMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogStartProcessMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ProgressDialogStartProcessRs" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogStartProcessRs"/&gt;
 *         &lt;element name="ProgressDialogStartProcessRq" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogStartProcessRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogStartProcessMess", propOrder = {
    "progressDialogStartProcessRs",
    "progressDialogStartProcessRq"
})
public class ProgressDialogStartProcessMess {

    @XmlElement(name = "ProgressDialogStartProcessRs")
    protected ProgressDialogStartProcessRs progressDialogStartProcessRs;
    @XmlElement(name = "ProgressDialogStartProcessRq")
    protected ProgressDialogStartProcessRq progressDialogStartProcessRq;

    /**
     * Gets the value of the progressDialogStartProcessRs property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogStartProcessRs }
     *     
     */
    public ProgressDialogStartProcessRs getProgressDialogStartProcessRs() {
        return progressDialogStartProcessRs;
    }

    /**
     * Sets the value of the progressDialogStartProcessRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogStartProcessRs }
     *     
     */
    public void setProgressDialogStartProcessRs(ProgressDialogStartProcessRs value) {
        this.progressDialogStartProcessRs = value;
    }

    /**
     * Gets the value of the progressDialogStartProcessRq property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogStartProcessRq }
     *     
     */
    public ProgressDialogStartProcessRq getProgressDialogStartProcessRq() {
        return progressDialogStartProcessRq;
    }

    /**
     * Sets the value of the progressDialogStartProcessRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogStartProcessRq }
     *     
     */
    public void setProgressDialogStartProcessRq(ProgressDialogStartProcessRq value) {
        this.progressDialogStartProcessRq = value;
    }

}
