
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextlessCommandRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextlessCommandRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Output" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="NextDialog" type="{http://schemas.radixware.org/eas.xsd}NextDialogRequest"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextlessCommandRs", propOrder = {
    "output",
    "nextDialog"
})
@XmlSeeAlso({
    CommandRs.class
})
public class ContextlessCommandRs
    extends Response
{

    @XmlElement(name = "Output")
    protected java.lang.Object output;
    @XmlElement(name = "NextDialog")
    protected NextDialogRequest nextDialog;

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setOutput(java.lang.Object value) {
        this.output = value;
    }

    /**
     * Gets the value of the nextDialog property.
     * 
     * @return
     *     possible object is
     *     {@link NextDialogRequest }
     *     
     */
    public NextDialogRequest getNextDialog() {
        return nextDialog;
    }

    /**
     * Sets the value of the nextDialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextDialogRequest }
     *     
     */
    public void setNextDialog(NextDialogRequest value) {
        this.nextDialog = value;
    }

}
