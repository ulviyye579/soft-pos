
package org.radixware.schemas.cfgmanagement_impexp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.types.MapStrStr;


/**
 * <p>Java class for ItemSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StringParams" type="{http://schemas.radixware.org/types.xsd}MapStrStr" minOccurs="0"/&gt;
 *         &lt;element name="XmlParams" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XmlParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Key" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ItemSettings", propOrder = {
    "stringParams",
    "xmlParams"
})
public class ItemSettings {

    @XmlElement(name = "StringParams")
    protected MapStrStr stringParams;
    @XmlElement(name = "XmlParams")
    protected ItemSettings.XmlParams xmlParams;

    /**
     * Gets the value of the stringParams property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getStringParams() {
        return stringParams;
    }

    /**
     * Sets the value of the stringParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setStringParams(MapStrStr value) {
        this.stringParams = value;
    }

    /**
     * Gets the value of the xmlParams property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSettings.XmlParams }
     *     
     */
    public ItemSettings.XmlParams getXmlParams() {
        return xmlParams;
    }

    /**
     * Sets the value of the xmlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSettings.XmlParams }
     *     
     */
    public void setXmlParams(ItemSettings.XmlParams value) {
        this.xmlParams = value;
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
     *         &lt;element name="XmlParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Key" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
    @XmlType(name = "", propOrder = {
        "xmlParam"
    })
    public static class XmlParams {

        @XmlElement(name = "XmlParam")
        protected List<ItemSettings.XmlParams.XmlParam> xmlParam;

        /**
         * Gets the value of the xmlParam property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the xmlParam property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getXmlParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemSettings.XmlParams.XmlParam }
         * 
         * 
         */
        public List<ItemSettings.XmlParams.XmlParam> getXmlParam() {
            if (xmlParam == null) {
                xmlParam = new ArrayList<ItemSettings.XmlParams.XmlParam>();
            }
            return this.xmlParam;
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
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Key" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class XmlParam {

            @XmlElement(name = "Value", required = true)
            protected Object value;
            @XmlAttribute(name = "Key", required = true)
            protected String key;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setValue(Object value) {
                this.value = value;
            }

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

        }

    }

}
