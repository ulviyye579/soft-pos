
package com.tranzaxis.schemas.contracts_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LinkedSubject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedSubject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SubjectInstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title1" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title2" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="QuotaDivisor" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="QuotaNumerator" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
@XmlType(name = "LinkedSubject", propOrder = {
    "status",
    "subjectId",
    "subjectRid",
    "subjectInstId",
    "title1",
    "title2",
    "notes",
    "quotaDivisor",
    "quotaNumerator",
    "activateTime",
    "activateDay",
    "activateUserName",
    "closeTime",
    "closeDay",
    "closeUserName"
})
public class LinkedSubject {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "SubjectId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> subjectId;
    @XmlElementRef(name = "SubjectRid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subjectRid;
    @XmlElementRef(name = "SubjectInstId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> subjectInstId;
    @XmlElementRef(name = "Title1", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title1;
    @XmlElementRef(name = "Title2", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title2;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "QuotaDivisor", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> quotaDivisor;
    @XmlElementRef(name = "QuotaNumerator", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> quotaNumerator;
    @XmlElementRef(name = "ActivateTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateTime;
    @XmlElementRef(name = "ActivateDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateDay;
    @XmlElementRef(name = "ActivateUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activateUserName;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElementRef(name = "CloseDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeDay;
    @XmlElementRef(name = "CloseUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closeUserName;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSubjectId(JAXBElement<Long> value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the subjectRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubjectRid() {
        return subjectRid;
    }

    /**
     * Sets the value of the subjectRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubjectRid(JAXBElement<String> value) {
        this.subjectRid = value;
    }

    /**
     * Gets the value of the subjectInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSubjectInstId() {
        return subjectInstId;
    }

    /**
     * Sets the value of the subjectInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSubjectInstId(JAXBElement<Long> value) {
        this.subjectInstId = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle1(JAXBElement<String> value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the title2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle2() {
        return title2;
    }

    /**
     * Sets the value of the title2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle2(JAXBElement<String> value) {
        this.title2 = value;
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
     * Gets the value of the quotaDivisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQuotaDivisor() {
        return quotaDivisor;
    }

    /**
     * Sets the value of the quotaDivisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQuotaDivisor(JAXBElement<Long> value) {
        this.quotaDivisor = value;
    }

    /**
     * Gets the value of the quotaNumerator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQuotaNumerator() {
        return quotaNumerator;
    }

    /**
     * Sets the value of the quotaNumerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQuotaNumerator(JAXBElement<Long> value) {
        this.quotaNumerator = value;
    }

    /**
     * Gets the value of the activateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateTime() {
        return activateTime;
    }

    /**
     * Sets the value of the activateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.activateTime = value;
    }

    /**
     * Gets the value of the activateDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateDay() {
        return activateDay;
    }

    /**
     * Sets the value of the activateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateDay(JAXBElement<XMLGregorianCalendar> value) {
        this.activateDay = value;
    }

    /**
     * Gets the value of the activateUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivateUserName() {
        return activateUserName;
    }

    /**
     * Sets the value of the activateUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivateUserName(JAXBElement<String> value) {
        this.activateUserName = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the closeDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseDay() {
        return closeDay;
    }

    /**
     * Sets the value of the closeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseDay(JAXBElement<XMLGregorianCalendar> value) {
        this.closeDay = value;
    }

    /**
     * Gets the value of the closeUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloseUserName() {
        return closeUserName;
    }

    /**
     * Sets the value of the closeUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloseUserName(JAXBElement<String> value) {
        this.closeUserName = value;
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
