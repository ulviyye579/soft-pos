
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectOrGroupRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Command" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="Property" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="CurrentData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Object"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "CommandRq", propOrder = {
    "command",
    "property",
    "currentData",
    "input",
    "form"
})
public class CommandRq
    extends ObjectOrGroupRequest
{

    @XmlElement(name = "Command", required = true)
    protected Definition command;
    @XmlElement(name = "Property")
    protected Definition property;
    @XmlElement(name = "CurrentData")
    protected CommandRq.CurrentData currentData;
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
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setProperty(Definition value) {
        this.property = value;
    }

    /**
     * Gets the value of the currentData property.
     * 
     * @return
     *     possible object is
     *     {@link CommandRq.CurrentData }
     *     
     */
    public CommandRq.CurrentData getCurrentData() {
        return currentData;
    }

    /**
     * Sets the value of the currentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandRq.CurrentData }
     *     
     */
    public void setCurrentData(CommandRq.CurrentData value) {
        this.currentData = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Object"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "presentation"
    })
    public static class CurrentData
        extends org.radixware.schemas.eas.Object
    {

        @XmlElement(name = "Presentation", required = true)
        protected Definition presentation;

        /**
         * Gets the value of the presentation property.
         * 
         * @return
         *     possible object is
         *     {@link Definition }
         *     
         */
        public Definition getPresentation() {
            return presentation;
        }

        /**
         * Sets the value of the presentation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Definition }
         *     
         */
        public void setPresentation(Definition value) {
            this.presentation = value;
        }

    }

}
