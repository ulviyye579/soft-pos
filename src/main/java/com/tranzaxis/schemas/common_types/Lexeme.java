
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lexeme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lexeme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Translate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LangCode" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lexeme", propOrder = {
    "translate",
    "text"
})
public class Lexeme {

    @XmlElement(name = "Translate")
    protected List<Lexeme.Translate> translate;
    @XmlElement(name = "Text", required = true, nillable = true)
    protected String text;

    /**
     * Gets the value of the translate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lexeme.Translate }
     * 
     * 
     */
    public List<Lexeme.Translate> getTranslate() {
        if (translate == null) {
            translate = new ArrayList<Lexeme.Translate>();
        }
        return this.translate;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LangCode" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Translate {

        @XmlElement(name = "Text", required = true)
        protected String text;
        @XmlAttribute(name = "LangCode", required = true)
        protected String langCode;

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
         * Gets the value of the langCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLangCode() {
            return langCode;
        }

        /**
         * Sets the value of the langCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLangCode(String value) {
            this.langCode = value;
        }

    }

}
