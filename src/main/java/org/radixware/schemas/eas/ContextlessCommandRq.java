
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextlessCommandRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextlessCommandRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Command" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="Form" type="{http://schemas.radixware.org/eas.xsd}Form"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextlessCommandRq", propOrder = {
    "command",
    "input",
    "form"
})
public class ContextlessCommandRq
    extends Request
{

    @XmlElement(name = "Command", required = true)
    protected Definition command;
    @XmlElement(name = "Input")
    protected java.lang.Object input;
    @XmlElement(name = "Form")
    protected Form form;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setCommand(Definition value) {
        this.command = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setInput(java.lang.Object value) {
        this.input = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link Form }
     *     
     */
    public Form getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link Form }
     *     
     */
    public void setForm(Form value) {
        this.form = value;
    }

}
