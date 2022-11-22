
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Caption - \u0417\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a \u043e\u043a\u043d\u0430, \u0435\u0441\u043b\u0438 \u043d\u0435 \u0437\u0430\u0434\u0430\u043d  \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b\u0435 \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043a\u0438 (Information, Confirmation .)
 * 
 * <p>Java class for MessageDialogOpenRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDialogOpenRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="Buttons" type="{http://schemas.radixware.org/eas.xsd}DialogButtonsList"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Caption" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDialogOpenRq", propOrder = {

})
public class MessageDialogOpenRq {

    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "Buttons", required = true)
    protected DialogButtonsList buttons;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Caption")
    protected String caption;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the buttons property.
     * 
     * @return
     *     possible object is
     *     {@link DialogButtonsList }
     *     
     */
    public DialogButtonsList getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogButtonsList }
     *     
     */
    public void setButtons(DialogButtonsList value) {
        this.buttons = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

}
