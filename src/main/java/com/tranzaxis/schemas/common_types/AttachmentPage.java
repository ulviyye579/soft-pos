
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AttachmentPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Content" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *         &lt;element name="UserAttr" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CreateTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ContentSize" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}MimeTypeEnum" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/common-types.xsd}AttachmentStatusEnum" /&gt;
 *       &lt;attribute name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StatmentTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="StatmentFromDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="StatmentToDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="StatmentTranchePid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubscriptionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OriginFileName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentPage", propOrder = {
    "content",
    "userAttr"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.Attachment.Pages.Page.class
})
public class AttachmentPage {

    @XmlElementRef(name = "Content", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> content;
    @XmlElementRef(name = "UserAttr", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ParamValues> userAttr;
    @XmlAttribute(name = "Id", required = true)
    protected long id;
    @XmlAttribute(name = "Number", required = true)
    protected long number;
    @XmlAttribute(name = "CreateTime", required = true)
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "ContentSize")
    protected Long contentSize;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "StatmentTypeId")
    protected Long statmentTypeId;
    @XmlAttribute(name = "StatmentFromDay")
    protected XMLGregorianCalendar statmentFromDay;
    @XmlAttribute(name = "StatmentToDay")
    protected XMLGregorianCalendar statmentToDay;
    @XmlAttribute(name = "StatmentTranchePid")
    protected String statmentTranchePid;
    @XmlAttribute(name = "SubscriptionId")
    protected Long subscriptionId;
    @XmlAttribute(name = "OriginFileName")
    protected String originFileName;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContent(JAXBElement<byte[]> value) {
        this.content = value;
    }

    /**
     * Gets the value of the userAttr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     *     
     */
    public JAXBElement<ParamValues> getUserAttr() {
        return userAttr;
    }

    /**
     * Sets the value of the userAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     *     
     */
    public void setUserAttr(JAXBElement<ParamValues> value) {
        this.userAttr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(long value) {
        this.number = value;
    }

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
     * Gets the value of the contentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentSize() {
        return contentSize;
    }

    /**
     * Sets the value of the contentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentSize(Long value) {
        this.contentSize = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the statmentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatmentTypeId() {
        return statmentTypeId;
    }

    /**
     * Sets the value of the statmentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatmentTypeId(Long value) {
        this.statmentTypeId = value;
    }

    /**
     * Gets the value of the statmentFromDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatmentFromDay() {
        return statmentFromDay;
    }

    /**
     * Sets the value of the statmentFromDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatmentFromDay(XMLGregorianCalendar value) {
        this.statmentFromDay = value;
    }

    /**
     * Gets the value of the statmentToDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatmentToDay() {
        return statmentToDay;
    }

    /**
     * Sets the value of the statmentToDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatmentToDay(XMLGregorianCalendar value) {
        this.statmentToDay = value;
    }

    /**
     * Gets the value of the statmentTranchePid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatmentTranchePid() {
        return statmentTranchePid;
    }

    /**
     * Sets the value of the statmentTranchePid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatmentTranchePid(String value) {
        this.statmentTranchePid = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionId(Long value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the originFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginFileName() {
        return originFileName;
    }

    /**
     * Sets the value of the originFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginFileName(String value) {
        this.originFileName = value;
    }

}
