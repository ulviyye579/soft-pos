
package com.tranzaxis.schemas.rc_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RcMoratorium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RcMoratorium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DetectorId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="FromTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcMoratorium", propOrder = {
    "createTime",
    "createUserName",
    "lastUpdateUserName",
    "lastUpdateTime",
    "detectorId",
    "fromTime",
    "toTime",
    "instId",
    "notes"
})
public class RcMoratorium {

    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserName")
    protected String createUserName;
    @XmlElement(name = "LastUpdateUserName")
    protected String lastUpdateUserName;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElementRef(name = "DetectorId", namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> detectorId;
    @XmlElement(name = "FromTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromTime;
    @XmlElement(name = "ToTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toTime;
    @XmlElement(name = "InstId")
    protected Long instId;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * Sets the value of the createUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUserName(String value) {
        this.createUserName = value;
    }

    /**
     * Gets the value of the lastUpdateUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    /**
     * Sets the value of the lastUpdateUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateUserName(String value) {
        this.lastUpdateUserName = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the detectorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDetectorId() {
        return detectorId;
    }

    /**
     * Sets the value of the detectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDetectorId(JAXBElement<Long> value) {
        this.detectorId = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromTime(XMLGregorianCalendar value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToTime(XMLGregorianCalendar value) {
        this.toTime = value;
    }

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstId(Long value) {
        this.instId = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
