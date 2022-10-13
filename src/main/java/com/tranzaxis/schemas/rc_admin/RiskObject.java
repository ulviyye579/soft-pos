
package com.tranzaxis.schemas.rc_admin;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for RiskObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssigneeName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LevelIsAbsolute" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="DueTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="AssigneeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.tranzaxis.com/rc-admin.xsd}Importance" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ClosedAlerts" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ObjectStatus" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcObjectStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="ObjectCloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ObjectScore" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AlertCount" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SumAlertScore" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MaxAlertScore" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RoKey" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DetectorId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SchemeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Score" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/rc-admin.xsd}AlertStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TranIds" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Confirmed" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="BaseObjectStatus" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AlertId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskObject", propOrder = {
    "assigneeName",
    "level",
    "levelIsAbsolute",
    "dueTime",
    "assigneeTime",
    "email",
    "phone",
    "importance",
    "subject",
    "text",
    "closedAlerts",
    "objectStatus",
    "objectCloseTime",
    "objectScore",
    "alertCount",
    "sumAlertScore",
    "maxAlertScore",
    "roKey",
    "instId",
    "detectorId",
    "schemeId",
    "score",
    "description",
    "status",
    "closeTime",
    "updateTime",
    "tranIds",
    "confirmed",
    "baseObjectStatus",
    "alertId"
})
public class RiskObject {

    @XmlElementRef(name = "AssigneeName", namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assigneeName;
    @XmlElement(name = "Level")
    protected Long level;
    @XmlElement(name = "LevelIsAbsolute")
    protected Boolean levelIsAbsolute;
    @XmlElement(name = "DueTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueTime;
    @XmlElement(name = "AssigneeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assigneeTime;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Importance")
    protected Long importance;
    @XmlElementRef(name = "Subject", namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "ClosedAlerts", type = Long.class)
    protected List<Long> closedAlerts;
    @XmlElement(name = "ObjectStatus")
    protected String objectStatus;
    @XmlElement(name = "ObjectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar objectCloseTime;
    @XmlElement(name = "ObjectScore")
    protected Long objectScore;
    @XmlElement(name = "AlertCount")
    protected Long alertCount;
    @XmlElement(name = "SumAlertScore")
    protected Long sumAlertScore;
    @XmlElement(name = "MaxAlertScore")
    protected Long maxAlertScore;
    @XmlElement(name = "RoKey")
    protected String roKey;
    @XmlElement(name = "InstId")
    protected Long instId;
    @XmlElement(name = "DetectorId")
    protected Long detectorId;
    @XmlElement(name = "SchemeId")
    protected Long schemeId;
    @XmlElement(name = "Score")
    protected Long score;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "CloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeTime;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "TranIds", type = Long.class)
    protected List<Long> tranIds;
    @XmlElement(name = "Confirmed")
    protected Boolean confirmed;
    @XmlElementRef(name = "BaseObjectStatus", namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseObjectStatus;
    @XmlElement(name = "AlertId")
    protected Long alertId;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the assigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssigneeName() {
        return assigneeName;
    }

    /**
     * Sets the value of the assigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssigneeName(JAXBElement<String> value) {
        this.assigneeName = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLevel(Long value) {
        this.level = value;
    }

    /**
     * Gets the value of the levelIsAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelIsAbsolute() {
        return levelIsAbsolute;
    }

    /**
     * Sets the value of the levelIsAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelIsAbsolute(Boolean value) {
        this.levelIsAbsolute = value;
    }

    /**
     * Gets the value of the dueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueTime() {
        return dueTime;
    }

    /**
     * Sets the value of the dueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueTime(XMLGregorianCalendar value) {
        this.dueTime = value;
    }

    /**
     * Gets the value of the assigneeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssigneeTime() {
        return assigneeTime;
    }

    /**
     * Sets the value of the assigneeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssigneeTime(XMLGregorianCalendar value) {
        this.assigneeTime = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportance(Long value) {
        this.importance = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
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
     * Gets the value of the closedAlerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closedAlerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosedAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getClosedAlerts() {
        if (closedAlerts == null) {
            closedAlerts = new ArrayList<Long>();
        }
        return this.closedAlerts;
    }

    /**
     * Gets the value of the objectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * Sets the value of the objectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectStatus(String value) {
        this.objectStatus = value;
    }

    /**
     * Gets the value of the objectCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectCloseTime() {
        return objectCloseTime;
    }

    /**
     * Sets the value of the objectCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjectCloseTime(XMLGregorianCalendar value) {
        this.objectCloseTime = value;
    }

    /**
     * Gets the value of the objectScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectScore() {
        return objectScore;
    }

    /**
     * Sets the value of the objectScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectScore(Long value) {
        this.objectScore = value;
    }

    /**
     * Gets the value of the alertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlertCount() {
        return alertCount;
    }

    /**
     * Sets the value of the alertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlertCount(Long value) {
        this.alertCount = value;
    }

    /**
     * Gets the value of the sumAlertScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSumAlertScore() {
        return sumAlertScore;
    }

    /**
     * Sets the value of the sumAlertScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSumAlertScore(Long value) {
        this.sumAlertScore = value;
    }

    /**
     * Gets the value of the maxAlertScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAlertScore() {
        return maxAlertScore;
    }

    /**
     * Sets the value of the maxAlertScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAlertScore(Long value) {
        this.maxAlertScore = value;
    }

    /**
     * Gets the value of the roKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoKey() {
        return roKey;
    }

    /**
     * Sets the value of the roKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoKey(String value) {
        this.roKey = value;
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
     * Gets the value of the detectorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetectorId() {
        return detectorId;
    }

    /**
     * Sets the value of the detectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetectorId(Long value) {
        this.detectorId = value;
    }

    /**
     * Gets the value of the schemeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchemeId() {
        return schemeId;
    }

    /**
     * Sets the value of the schemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchemeId(Long value) {
        this.schemeId = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScore(Long value) {
        this.score = value;
    }

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
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseTime(XMLGregorianCalendar value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the tranIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTranIds() {
        if (tranIds == null) {
            tranIds = new ArrayList<Long>();
        }
        return this.tranIds;
    }

    /**
     * Gets the value of the confirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmed(Boolean value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the baseObjectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseObjectStatus() {
        return baseObjectStatus;
    }

    /**
     * Sets the value of the baseObjectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseObjectStatus(JAXBElement<String> value) {
        this.baseObjectStatus = value;
    }

    /**
     * Gets the value of the alertId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlertId() {
        return alertId;
    }

    /**
     * Sets the value of the alertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlertId(Long value) {
        this.alertId = value;
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

}
