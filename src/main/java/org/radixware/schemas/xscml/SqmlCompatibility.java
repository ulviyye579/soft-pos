
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * SQL database compatibility
 * 
 * <p>Java class for SqmlCompatibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqmlCompatibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="database" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="compatibility" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "SqmlCompatibility", propOrder = {
    "database"
})
public class SqmlCompatibility {

    protected List<SqmlCompatibility.Database> database;

    /**
     * Gets the value of the database property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the database property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqmlCompatibility.Database }
     * 
     * 
     */
    public List<SqmlCompatibility.Database> getDatabase() {
        if (database == null) {
            database = new ArrayList<SqmlCompatibility.Database>();
        }
        return this.database;
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
     *       &lt;attribute name="type" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="compatibility" use="required"&gt;
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
    @XmlType(name = "")
    public static class Database {

        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "compatibility", required = true)
        protected String compatibility;

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
         * Gets the value of the compatibility property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompatibility() {
            return compatibility;
        }

        /**
         * Sets the value of the compatibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompatibility(String value) {
            this.compatibility = value;
        }

    }

}
