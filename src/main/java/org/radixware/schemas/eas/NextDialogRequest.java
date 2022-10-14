
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextDialogRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextDialogRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageBox" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HtmlText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ContinueButtonType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CancelButtonType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Form" type="{http://schemas.radixware.org/eas.xsd}Form" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextDialogRequest", propOrder = {
    "messageBox",
    "form"
})
public class NextDialogRequest {

    @XmlElement(name = "MessageBox")
    protected NextDialogRequest.MessageBox messageBox;
    @XmlElement(name = "Form")
    protected Form form;

    /**
     * Gets the value of the messageBox property.
     * 
     * @return
     *     possible object is
     *     {@link NextDialogRequest.MessageBox }
     *     
     */
    public NextDialogRequest.MessageBox getMessageBox() {
        return messageBox;
    }

    /**
     * Sets the value of the messageBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextDialogRequest.MessageBox }
     *     
     */
    public void setMessageBox(NextDialogRequest.MessageBox value) {
        this.messageBox = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="HtmlText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ContinueButtonType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CancelButtonType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "htmlText",
        "text"
    })
    public static class MessageBox {

        @XmlElement(name = "HtmlText", required = true, nillable = true)
        protected String htmlText;
        @XmlElement(name = "Text", required = true, nillable = true)
        protected String text;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "ContinueButtonType", required = true)
        protected String continueButtonType;
        @XmlAttribute(name = "CancelButtonType", required = true)
        protected String cancelButtonType;

        /**
         * Gets the value of the htmlText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHtmlText() {
            return htmlText;
        }

        /**
         * Sets the value of the htmlText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHtmlText(String value) {
            this.htmlText = value;
        }

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
         * Gets the value of the continueButtonType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContinueButtonType() {
            return continueButtonType;
        }

        /**
         * Sets the value of the continueButtonType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContinueButtonType(String value) {
            this.continueButtonType = value;
        }

        /**
         * Gets the value of the cancelButtonType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelButtonType() {
            return cancelButtonType;
        }

        /**
         * Sets the value of the cancelButtonType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelButtonType(String value) {
            this.cancelButtonType = value;
        }

    }

}
