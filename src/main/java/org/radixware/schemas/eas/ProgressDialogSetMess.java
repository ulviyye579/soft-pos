
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressDialogSetMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogSetMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ProgressDialogSetRs" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogSetRs"/&gt;
 *         &lt;element name="ProgressDialogSetRq" type="{http://schemas.radixware.org/eas.xsd}ProgressDialogSetRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogSetMess", propOrder = {
    "progressDialogSetRs",
    "progressDialogSetRq"
})
public class ProgressDialogSetMess {

    @XmlElement(name = "ProgressDialogSetRs")
    protected ProgressDialogSetRs progressDialogSetRs;
    @XmlElement(name = "ProgressDialogSetRq")
    protected ProgressDialogSetRq progressDialogSetRq;

    /**
     * Gets the value of the progressDialogSetRs property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogSetRs }
     *     
     */
    public ProgressDialogSetRs getProgressDialogSetRs() {
        return progressDialogSetRs;
    }

    /**
     * Sets the value of the progressDialogSetRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogSetRs }
     *     
     */
    public void setProgressDialogSetRs(ProgressDialogSetRs value) {
        this.progressDialogSetRs = value;
    }

    /**
     * Gets the value of the progressDialogSetRq property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressDialogSetRq }
     *     
     */
    public ProgressDialogSetRq getProgressDialogSetRq() {
        return progressDialogSetRq;
    }

    /**
     * Sets the value of the progressDialogSetRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressDialogSetRq }
     *     
     */
    public void setProgressDialogSetRq(ProgressDialogSetRq value) {
        this.progressDialogSetRq = value;
    }

}
