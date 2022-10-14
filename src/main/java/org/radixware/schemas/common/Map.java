
package org.radixware.schemas.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Map"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="BoolVal" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
 *                   &lt;element name="CharVal" type="{http://schemas.radixware.org/types.xsd}Char"/&gt;
 *                   &lt;element name="StrVal" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                   &lt;element name="IntVal" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *                   &lt;element name="NumVal" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *                   &lt;element name="DateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *                   &lt;element name="BinHexVal" type="{http://schemas.radixware.org/types.xsd}BinHex"/&gt;
 *                   &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "Map", propOrder = {
    "entry"
})
public class Map {

    @XmlElement(name = "Entry")
    protected List<Map.Entry> entry;

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map.Entry }
     * 
     * 
     */
    public List<Map.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Map.Entry>();
        }
        return this.entry;
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
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="BoolVal" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
     *         &lt;element name="CharVal" type="{http://schemas.radixware.org/types.xsd}Char"/&gt;
     *         &lt;element name="StrVal" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *         &lt;element name="IntVal" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
     *         &lt;element name="NumVal" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
     *         &lt;element name="DateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
     *         &lt;element name="BinHexVal" type="{http://schemas.radixware.org/types.xsd}BinHex"/&gt;
     *         &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/choice&gt;
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
        "boolVal",
        "charVal",
        "strVal",
        "intVal",
        "numVal",
        "dateTimeVal",
        "binHexVal",
        "xmlVal"
    })
    public static class Entry {

        @XmlElement(name = "BoolVal")
        protected Boolean boolVal;
        @XmlElement(name = "CharVal")
        protected String charVal;
        @XmlElement(name = "StrVal")
        protected String strVal;
        @XmlElement(name = "IntVal")
        protected Long intVal;
        @XmlElement(name = "NumVal")
        protected BigDecimal numVal;
        @XmlElement(name = "DateTimeVal")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTimeVal;
        @XmlElement(name = "BinHexVal", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] binHexVal;
        @XmlElement(name = "XmlVal")
        protected Object xmlVal;
        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the boolVal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBoolVal() {
            return boolVal;
        }

        /**
         * Sets the value of the boolVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBoolVal(Boolean value) {
            this.boolVal = value;
        }

        /**
         * Gets the value of the charVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharVal() {
            return charVal;
        }

        /**
         * Sets the value of the charVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharVal(String value) {
            this.charVal = value;
        }

        /**
         * Gets the value of the strVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrVal() {
            return strVal;
        }

        /**
         * Sets the value of the strVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrVal(String value) {
            this.strVal = value;
        }

        /**
         * Gets the value of the intVal property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getIntVal() {
            return intVal;
        }

        /**
         * Sets the value of the intVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setIntVal(Long value) {
            this.intVal = value;
        }

        /**
         * Gets the value of the numVal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumVal() {
            return numVal;
        }

        /**
         * Sets the value of the numVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumVal(BigDecimal value) {
            this.numVal = value;
        }

        /**
         * Gets the value of the dateTimeVal property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTimeVal() {
            return dateTimeVal;
        }

        /**
         * Sets the value of the dateTimeVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTimeVal(XMLGregorianCalendar value) {
            this.dateTimeVal = value;
        }

        /**
         * Gets the value of the binHexVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getBinHexVal() {
            return binHexVal;
        }

        /**
         * Sets the value of the binHexVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinHexVal(byte[] value) {
            this.binHexVal = value;
        }

        /**
         * Gets the value of the xmlVal property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getXmlVal() {
            return xmlVal;
        }

        /**
         * Sets the value of the xmlVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setXmlVal(Object value) {
            this.xmlVal = value;
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
