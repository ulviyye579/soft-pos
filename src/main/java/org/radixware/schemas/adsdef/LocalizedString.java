
package org.radixware.schemas.adsdef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import org.radixware.schemas.commondef.Definition;


/**
 * <p>Java class for LocalizedString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalizedString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Language" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NeedsCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="LastModified" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DateChangeOfStatus" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="AuthorChangeOfStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DateChangeAgreedString" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="AuthorChangeAgreedString" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Agreed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SrcKind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SpellCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="EventSeverity"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="EventSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreationDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedString", propOrder = {
    "value"
})
public class LocalizedString
    extends Definition
{

    @XmlElement(name = "Value")
    protected List<LocalizedString.Value> value;
    @XmlAttribute(name = "SrcKind", required = true)
    protected long srcKind;
    @XmlAttribute(name = "SpellCheck")
    protected Boolean spellCheck;
    @XmlAttribute(name = "EventSeverity")
    protected Long eventSeverity;
    @XmlAttribute(name = "EventSource")
    protected String eventSource;
    @XmlAttribute(name = "Version")
    protected Integer version;
    @XmlAttribute(name = "Creator")
    protected String creator;
    @XmlAttribute(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedString.Value }
     * 
     * 
     */
    public List<LocalizedString.Value> getValue() {
        if (value == null) {
            value = new ArrayList<LocalizedString.Value>();
        }
        return this.value;
    }

    /**
     * Gets the value of the srcKind property.
     * 
     */
    public long getSrcKind() {
        return srcKind;
    }

    /**
     * Sets the value of the srcKind property.
     * 
     */
    public void setSrcKind(long value) {
        this.srcKind = value;
    }

    /**
     * Gets the value of the spellCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSpellCheck() {
        if (spellCheck == null) {
            return true;
        } else {
            return spellCheck;
        }
    }

    /**
     * Sets the value of the spellCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpellCheck(Boolean value) {
        this.spellCheck = value;
    }

    /**
     * Gets the value of the eventSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventSeverity() {
        return eventSeverity;
    }

    /**
     * Sets the value of the eventSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventSeverity(Long value) {
        this.eventSeverity = value;
    }

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSource(String value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Language" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NeedsCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="LastModified" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DateChangeOfStatus" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="AuthorChangeOfStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DateChangeAgreedString" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="AuthorChangeAgreedString" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Agreed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Value {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Language", required = true)
        protected String language;
        @XmlAttribute(name = "NeedsCheck")
        protected Boolean needsCheck;
        @XmlAttribute(name = "LastModified")
        protected XMLGregorianCalendar lastModified;
        @XmlAttribute(name = "Author")
        protected String author;
        @XmlAttribute(name = "DateChangeOfStatus")
        protected XMLGregorianCalendar dateChangeOfStatus;
        @XmlAttribute(name = "AuthorChangeOfStatus")
        protected String authorChangeOfStatus;
        @XmlAttribute(name = "DateChangeAgreedString")
        protected XMLGregorianCalendar dateChangeAgreedString;
        @XmlAttribute(name = "AuthorChangeAgreedString")
        protected String authorChangeAgreedString;
        @XmlAttribute(name = "Agreed")
        protected Boolean agreed;
        @XmlAttribute(name = "Version")
        protected Long version;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the needsCheck property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNeedsCheck() {
            return needsCheck;
        }

        /**
         * Sets the value of the needsCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNeedsCheck(Boolean value) {
            this.needsCheck = value;
        }

        /**
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastModified(XMLGregorianCalendar value) {
            this.lastModified = value;
        }

        /**
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Gets the value of the dateChangeOfStatus property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateChangeOfStatus() {
            return dateChangeOfStatus;
        }

        /**
         * Sets the value of the dateChangeOfStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateChangeOfStatus(XMLGregorianCalendar value) {
            this.dateChangeOfStatus = value;
        }

        /**
         * Gets the value of the authorChangeOfStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorChangeOfStatus() {
            return authorChangeOfStatus;
        }

        /**
         * Sets the value of the authorChangeOfStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorChangeOfStatus(String value) {
            this.authorChangeOfStatus = value;
        }

        /**
         * Gets the value of the dateChangeAgreedString property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateChangeAgreedString() {
            return dateChangeAgreedString;
        }

        /**
         * Sets the value of the dateChangeAgreedString property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateChangeAgreedString(XMLGregorianCalendar value) {
            this.dateChangeAgreedString = value;
        }

        /**
         * Gets the value of the authorChangeAgreedString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorChangeAgreedString() {
            return authorChangeAgreedString;
        }

        /**
         * Sets the value of the authorChangeAgreedString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorChangeAgreedString(String value) {
            this.authorChangeAgreedString = value;
        }

        /**
         * Gets the value of the agreed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAgreed() {
            return agreed;
        }

        /**
         * Sets the value of the agreed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAgreed(Boolean value) {
            this.agreed = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setVersion(Long value) {
            this.version = value;
        }

    }

}
