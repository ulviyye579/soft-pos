
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ParamValues;


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
 *         &lt;element name="Subject1Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Subject2Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkPosition" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkFax" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkMobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkEmail" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkMailAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Role" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LinkedSubjectRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LinkedSubjectId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
    "subject1Title",
    "subject2Title",
    "startTime",
    "endTime",
    "notes",
    "employeeRid",
    "employeeCategory",
    "workPosition",
    "workPhone",
    "workFax",
    "workMobilePhone",
    "workEmail",
    "workMailAddress",
    "userAttrs"
})
public class LinkedSubject {

    @XmlElementRef(name = "Subject1Title", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject1Title;
    @XmlElementRef(name = "Subject2Title", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject2Title;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "EndTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "EmployeeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeRid;
    @XmlElementRef(name = "EmployeeCategory", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeCategory;
    @XmlElementRef(name = "WorkPosition", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPosition;
    @XmlElementRef(name = "WorkPhone", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhone;
    @XmlElementRef(name = "WorkFax", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workFax;
    @XmlElementRef(name = "WorkMobilePhone", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workMobilePhone;
    @XmlElementRef(name = "WorkEmail", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workEmail;
    @XmlElementRef(name = "WorkMailAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> workMailAddress;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "LinkedSubjectRid")
    protected String linkedSubjectRid;
    @XmlAttribute(name = "LinkedSubjectId")
    protected Long linkedSubjectId;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the subject1Title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject1Title() {
        return subject1Title;
    }

    /**
     * Sets the value of the subject1Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject1Title(JAXBElement<String> value) {
        this.subject1Title = value;
    }

    /**
     * Gets the value of the subject2Title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject2Title() {
        return subject2Title;
    }

    /**
     * Sets the value of the subject2Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject2Title(JAXBElement<String> value) {
        this.subject2Title = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
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
     * Gets the value of the employeeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeRid() {
        return employeeRid;
    }

    /**
     * Sets the value of the employeeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeRid(JAXBElement<String> value) {
        this.employeeRid = value;
    }

    /**
     * Gets the value of the employeeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeCategory() {
        return employeeCategory;
    }

    /**
     * Sets the value of the employeeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeCategory(JAXBElement<String> value) {
        this.employeeCategory = value;
    }

    /**
     * Gets the value of the workPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPosition() {
        return workPosition;
    }

    /**
     * Sets the value of the workPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPosition(JAXBElement<String> value) {
        this.workPosition = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone(JAXBElement<String> value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkFax() {
        return workFax;
    }

    /**
     * Sets the value of the workFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkFax(JAXBElement<String> value) {
        this.workFax = value;
    }

    /**
     * Gets the value of the workMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkMobilePhone() {
        return workMobilePhone;
    }

    /**
     * Sets the value of the workMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkMobilePhone(JAXBElement<String> value) {
        this.workMobilePhone = value;
    }

    /**
     * Gets the value of the workEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkEmail() {
        return workEmail;
    }

    /**
     * Sets the value of the workEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkEmail(JAXBElement<String> value) {
        this.workEmail = value;
    }

    /**
     * Gets the value of the workMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getWorkMailAddress() {
        return workMailAddress;
    }

    /**
     * Sets the value of the workMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setWorkMailAddress(JAXBElement<MailAddress> value) {
        this.workMailAddress = value;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the linkedSubjectRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedSubjectRid() {
        return linkedSubjectRid;
    }

    /**
     * Sets the value of the linkedSubjectRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedSubjectRid(String value) {
        this.linkedSubjectRid = value;
    }

    /**
     * Gets the value of the linkedSubjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkedSubjectId() {
        return linkedSubjectId;
    }

    /**
     * Sets the value of the linkedSubjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkedSubjectId(Long value) {
        this.linkedSubjectId = value;
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
