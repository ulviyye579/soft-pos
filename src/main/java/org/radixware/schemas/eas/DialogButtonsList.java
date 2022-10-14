
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DialogButtonsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DialogButtonsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ButtonType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ButtonId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ButtonTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IconId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogButtonsList", propOrder = {
    "item"
})
public class DialogButtonsList {

    @XmlElement(name = "Item", required = true)
    protected List<DialogButtonsList.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogButtonsList.Item }
     * 
     * 
     */
    public List<DialogButtonsList.Item> getItem() {
        if (item == null) {
            item = new ArrayList<DialogButtonsList.Item>();
        }
        return this.item;
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
     *         &lt;element name="ButtonType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ButtonId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ButtonTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IconId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "buttonType",
        "buttonId",
        "buttonTitle"
    })
    public static class Item {

        @XmlElement(name = "ButtonType", required = true)
        protected String buttonType;
        @XmlElement(name = "ButtonId", required = true)
        protected String buttonId;
        @XmlElement(name = "ButtonTitle")
        protected String buttonTitle;
        @XmlAttribute(name = "IconId")
        protected String iconId;

        /**
         * Gets the value of the buttonType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getButtonType() {
            return buttonType;
        }

        /**
         * Sets the value of the buttonType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setButtonType(String value) {
            this.buttonType = value;
        }

        /**
         * Gets the value of the buttonId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getButtonId() {
            return buttonId;
        }

        /**
         * Sets the value of the buttonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setButtonId(String value) {
            this.buttonId = value;
        }

        /**
         * Gets the value of the buttonTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getButtonTitle() {
            return buttonTitle;
        }

        /**
         * Sets the value of the buttonTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setButtonTitle(String value) {
            this.buttonTitle = value;
        }

        /**
         * Gets the value of the iconId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIconId() {
            return iconId;
        }

        /**
         * Sets the value of the iconId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIconId(String value) {
            this.iconId = value;
        }

    }

}
