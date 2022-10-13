
package org.radixware.schemas.commondef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangeLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeLogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RefDoc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LocalNotes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ObjectXml" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ObjectPreview" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Date" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="RevisionNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SinceVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="DescriptionMlsId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Author" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AppVer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Kind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ChangeType"&gt;
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
@XmlType(name = "ChangeLogItem", propOrder = {
    "description",
    "refDoc",
    "localNotes",
    "objectXml",
    "objectPreview"
})
public class ChangeLogItem {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "RefDoc")
    protected String refDoc;
    @XmlElement(name = "LocalNotes")
    protected String localNotes;
    @XmlElement(name = "ObjectXml")
    protected Object objectXml;
    @XmlElement(name = "ObjectPreview")
    protected String objectPreview;
    @XmlAttribute(name = "Date", required = true)
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "RevisionNumber")
    protected Long revisionNumber;
    @XmlAttribute(name = "SinceVersion")
    protected String sinceVersion;
    @XmlAttribute(name = "DescriptionMlsId")
    protected String descriptionMlsId;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "AppVer")
    protected String appVer;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "ChangeType")
    protected String changeType;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the refDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDoc() {
        return refDoc;
    }

    /**
     * Sets the value of the refDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDoc(String value) {
        this.refDoc = value;
    }

    /**
     * Gets the value of the localNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNotes() {
        return localNotes;
    }

    /**
     * Sets the value of the localNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNotes(String value) {
        this.localNotes = value;
    }

    /**
     * Gets the value of the objectXml property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObjectXml() {
        return objectXml;
    }

    /**
     * Sets the value of the objectXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObjectXml(Object value) {
        this.objectXml = value;
    }

    /**
     * Gets the value of the objectPreview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPreview() {
        return objectPreview;
    }

    /**
     * Sets the value of the objectPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPreview(String value) {
        this.objectPreview = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisionNumber(Long value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the sinceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinceVersion() {
        return sinceVersion;
    }

    /**
     * Sets the value of the sinceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinceVersion(String value) {
        this.sinceVersion = value;
    }

    /**
     * Gets the value of the descriptionMlsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionMlsId() {
        return descriptionMlsId;
    }

    /**
     * Sets the value of the descriptionMlsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionMlsId(String value) {
        this.descriptionMlsId = value;
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
     * Gets the value of the appVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVer() {
        return appVer;
    }

    /**
     * Sets the value of the appVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVer(String value) {
        this.appVer = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

}
