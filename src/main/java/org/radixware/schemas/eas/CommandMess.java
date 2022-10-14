
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CommandRq" type="{http://schemas.radixware.org/eas.xsd}CommandRq"/&gt;
 *         &lt;element name="CommandRs" type="{http://schemas.radixware.org/eas.xsd}CommandRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandMess", propOrder = {
    "commandRq",
    "commandRs"
})
public class CommandMess {

    @XmlElement(name = "CommandRq")
    protected CommandRq commandRq;
    @XmlElement(name = "CommandRs")
    protected CommandRs commandRs;

    /**
     * Gets the value of the commandRq property.
     * 
     * @return
     *     possible object is
     *     {@link CommandRq }
     *     
     */
    public CommandRq getCommandRq() {
        return commandRq;
    }

    /**
     * Sets the value of the commandRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandRq }
     *     
     */
    public void setCommandRq(CommandRq value) {
        this.commandRq = value;
    }

    /**
     * Gets the value of the commandRs property.
     * 
     * @return
     *     possible object is
     *     {@link CommandRs }
     *     
     */
    public CommandRs getCommandRs() {
        return commandRs;
    }

    /**
     * Sets the value of the commandRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandRs }
     *     
     */
    public void setCommandRs(CommandRs value) {
        this.commandRs = value;
    }

}
