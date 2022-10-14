
package com.tranzaxis.schemas.subjects_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.applications.Application;
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import org.radixware.schemas.common.UserProps;


/**
 * <p>Java class for SubjectBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CStatus" minOccurs="0"/&gt;
 *         &lt;element name="IsInsider" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsAffiliated" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsBankParticipant" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ShareFraction" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="FinancialCat" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CFinCat" minOccurs="0"/&gt;
 *         &lt;element name="ExtQualCat" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RiskLevel" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CLanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationLocale" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="ExtraData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SstPreferencies" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MailAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="MailAddressLat" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SubjectContactAddresses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubjectContactAddress" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}ContactAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectDocuments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Document" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectEstates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Estate" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Estate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectNetworkSpecifics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecific" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectNotes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Note" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InSubjects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LinkedSubject" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OutSubjects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LinkedSubject" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectApplications" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Application" type="{http://schemas.tranzaxis.com/applications.xsd}Application" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AuthQAs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AuthQA" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}AuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RcMoratoriums" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcMoratoriums" minOccurs="0"/&gt;
 *         &lt;element name="UserProps" type="{http://schemas.radixware.org/common.xsd}UserProps" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.tranzaxis.com/common-types.xsd}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="TrustedPayees" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}TrustedPayees" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectBase", propOrder = {
    "rid",
    "instId",
    "instName",
    "branchId",
    "branchName",
    "branchCode",
    "status",
    "isInsider",
    "isAffiliated",
    "isBankParticipant",
    "shareFraction",
    "financialCat",
    "extQualCat",
    "notes",
    "riskLevel",
    "languageCode",
    "communicationLocale",
    "timeZone",
    "userAttrs",
    "extraData",
    "sstPreferencies",
    "mailAddress",
    "mailAddressLat",
    "startTime",
    "subjectContactAddresses",
    "subjectDocuments",
    "subjectEstates",
    "subjectNetworkSpecifics",
    "subjectNotes",
    "inSubjects",
    "outSubjects",
    "subjectApplications",
    "authQAs",
    "rcMoratoriums",
    "userProps",
    "attachments",
    "trustedPayees"
})
@XmlSeeAlso({
    Person.class,
    Organization.class
})
public class SubjectBase {

    @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rid;
    @XmlElementRef(name = "InstId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> instId;
    @XmlElementRef(name = "InstName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instName;
    @XmlElementRef(name = "BranchId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> branchId;
    @XmlElementRef(name = "BranchName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchName;
    @XmlElementRef(name = "BranchCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> branchCode;
    @XmlElementRef(name = "Status", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "IsInsider")
    protected Boolean isInsider;
    @XmlElement(name = "IsAffiliated")
    protected Boolean isAffiliated;
    @XmlElement(name = "IsBankParticipant")
    protected Boolean isBankParticipant;
    @XmlElementRef(name = "ShareFraction", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shareFraction;
    @XmlElement(name = "FinancialCat")
    protected String financialCat;
    @XmlElementRef(name = "ExtQualCat", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> extQualCat;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "RiskLevel", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevel;
    @XmlElementRef(name = "LanguageCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageCode;
    @XmlElementRef(name = "CommunicationLocale", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communicationLocale;
    @XmlElementRef(name = "TimeZone", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZone;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElementRef(name = "ExtraData", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> extraData;
    @XmlElementRef(name = "SstPreferencies", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> sstPreferencies;
    @XmlElementRef(name = "MailAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> mailAddress;
    @XmlElementRef(name = "MailAddressLat", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailAddressLat;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "SubjectContactAddresses", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectContactAddresses> subjectContactAddresses;
    @XmlElementRef(name = "SubjectDocuments", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectDocuments> subjectDocuments;
    @XmlElementRef(name = "SubjectEstates", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectEstates> subjectEstates;
    @XmlElementRef(name = "SubjectNetworkSpecifics", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectNetworkSpecifics> subjectNetworkSpecifics;
    @XmlElementRef(name = "SubjectNotes", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectNotes> subjectNotes;
    @XmlElementRef(name = "InSubjects", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.InSubjects> inSubjects;
    @XmlElementRef(name = "OutSubjects", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.OutSubjects> outSubjects;
    @XmlElementRef(name = "SubjectApplications", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.SubjectApplications> subjectApplications;
    @XmlElementRef(name = "AuthQAs", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectBase.AuthQAs> authQAs;
    @XmlElementRef(name = "RcMoratoriums", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RcMoratoriums> rcMoratoriums;
    @XmlElementRef(name = "UserProps", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserProps> userProps;
    @XmlElementRef(name = "Attachments", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Attachments> attachments;
    @XmlElement(name = "TrustedPayees")
    protected TrustedPayees trustedPayees;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TypeRid")
    protected String typeRid;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRid(JAXBElement<String> value) {
        this.rid = value;
    }

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInstId(JAXBElement<Long> value) {
        this.instId = value;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstName(JAXBElement<String> value) {
        this.instName = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBranchId(JAXBElement<Long> value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchName(JAXBElement<String> value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBranchCode(JAXBElement<Long> value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the isInsider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInsider() {
        return isInsider;
    }

    /**
     * Sets the value of the isInsider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInsider(Boolean value) {
        this.isInsider = value;
    }

    /**
     * Gets the value of the isAffiliated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAffiliated() {
        return isAffiliated;
    }

    /**
     * Sets the value of the isAffiliated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAffiliated(Boolean value) {
        this.isAffiliated = value;
    }

    /**
     * Gets the value of the isBankParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBankParticipant() {
        return isBankParticipant;
    }

    /**
     * Sets the value of the isBankParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBankParticipant(Boolean value) {
        this.isBankParticipant = value;
    }

    /**
     * Gets the value of the shareFraction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShareFraction() {
        return shareFraction;
    }

    /**
     * Sets the value of the shareFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShareFraction(JAXBElement<BigDecimal> value) {
        this.shareFraction = value;
    }

    /**
     * Gets the value of the financialCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialCat() {
        return financialCat;
    }

    /**
     * Sets the value of the financialCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialCat(String value) {
        this.financialCat = value;
    }

    /**
     * Gets the value of the extQualCat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExtQualCat() {
        return extQualCat;
    }

    /**
     * Sets the value of the extQualCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExtQualCat(JAXBElement<Long> value) {
        this.extQualCat = value;
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
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRiskLevel(JAXBElement<Long> value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageCode(JAXBElement<String> value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the communicationLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunicationLocale() {
        return communicationLocale;
    }

    /**
     * Sets the value of the communicationLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunicationLocale(JAXBElement<String> value) {
        this.communicationLocale = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = value;
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
     * Gets the value of the extraData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getExtraData() {
        return extraData;
    }

    /**
     * Sets the value of the extraData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setExtraData(JAXBElement<Object> value) {
        this.extraData = value;
    }

    /**
     * Gets the value of the sstPreferencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getSstPreferencies() {
        return sstPreferencies;
    }

    /**
     * Sets the value of the sstPreferencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setSstPreferencies(JAXBElement<Object> value) {
        this.sstPreferencies = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setMailAddress(JAXBElement<MailAddress> value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the mailAddressLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailAddressLat() {
        return mailAddressLat;
    }

    /**
     * Sets the value of the mailAddressLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailAddressLat(JAXBElement<String> value) {
        this.mailAddressLat = value;
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
     * Gets the value of the subjectContactAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectContactAddresses }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectContactAddresses> getSubjectContactAddresses() {
        return subjectContactAddresses;
    }

    /**
     * Sets the value of the subjectContactAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectContactAddresses }{@code >}
     *     
     */
    public void setSubjectContactAddresses(JAXBElement<SubjectBase.SubjectContactAddresses> value) {
        this.subjectContactAddresses = value;
    }

    /**
     * Gets the value of the subjectDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectDocuments }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectDocuments> getSubjectDocuments() {
        return subjectDocuments;
    }

    /**
     * Sets the value of the subjectDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectDocuments }{@code >}
     *     
     */
    public void setSubjectDocuments(JAXBElement<SubjectBase.SubjectDocuments> value) {
        this.subjectDocuments = value;
    }

    /**
     * Gets the value of the subjectEstates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectEstates }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectEstates> getSubjectEstates() {
        return subjectEstates;
    }

    /**
     * Sets the value of the subjectEstates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectEstates }{@code >}
     *     
     */
    public void setSubjectEstates(JAXBElement<SubjectBase.SubjectEstates> value) {
        this.subjectEstates = value;
    }

    /**
     * Gets the value of the subjectNetworkSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNetworkSpecifics }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectNetworkSpecifics> getSubjectNetworkSpecifics() {
        return subjectNetworkSpecifics;
    }

    /**
     * Sets the value of the subjectNetworkSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNetworkSpecifics }{@code >}
     *     
     */
    public void setSubjectNetworkSpecifics(JAXBElement<SubjectBase.SubjectNetworkSpecifics> value) {
        this.subjectNetworkSpecifics = value;
    }

    /**
     * Gets the value of the subjectNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNotes }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectNotes> getSubjectNotes() {
        return subjectNotes;
    }

    /**
     * Sets the value of the subjectNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNotes }{@code >}
     *     
     */
    public void setSubjectNotes(JAXBElement<SubjectBase.SubjectNotes> value) {
        this.subjectNotes = value;
    }

    /**
     * Gets the value of the inSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.InSubjects }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.InSubjects> getInSubjects() {
        return inSubjects;
    }

    /**
     * Sets the value of the inSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.InSubjects }{@code >}
     *     
     */
    public void setInSubjects(JAXBElement<SubjectBase.InSubjects> value) {
        this.inSubjects = value;
    }

    /**
     * Gets the value of the outSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.OutSubjects }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.OutSubjects> getOutSubjects() {
        return outSubjects;
    }

    /**
     * Sets the value of the outSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.OutSubjects }{@code >}
     *     
     */
    public void setOutSubjects(JAXBElement<SubjectBase.OutSubjects> value) {
        this.outSubjects = value;
    }

    /**
     * Gets the value of the subjectApplications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectApplications }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.SubjectApplications> getSubjectApplications() {
        return subjectApplications;
    }

    /**
     * Sets the value of the subjectApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.SubjectApplications }{@code >}
     *     
     */
    public void setSubjectApplications(JAXBElement<SubjectBase.SubjectApplications> value) {
        this.subjectApplications = value;
    }

    /**
     * Gets the value of the authQAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.AuthQAs }{@code >}
     *     
     */
    public JAXBElement<SubjectBase.AuthQAs> getAuthQAs() {
        return authQAs;
    }

    /**
     * Sets the value of the authQAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectBase.AuthQAs }{@code >}
     *     
     */
    public void setAuthQAs(JAXBElement<SubjectBase.AuthQAs> value) {
        this.authQAs = value;
    }

    /**
     * Gets the value of the rcMoratoriums property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     *     
     */
    public JAXBElement<RcMoratoriums> getRcMoratoriums() {
        return rcMoratoriums;
    }

    /**
     * Sets the value of the rcMoratoriums property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     *     
     */
    public void setRcMoratoriums(JAXBElement<RcMoratoriums> value) {
        this.rcMoratoriums = value;
    }

    /**
     * Gets the value of the userProps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public JAXBElement<UserProps> getUserProps() {
        return userProps;
    }

    /**
     * Sets the value of the userProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public void setUserProps(JAXBElement<UserProps> value) {
        this.userProps = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     *     
     */
    public JAXBElement<Attachments> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<Attachments> value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the trustedPayees property.
     * 
     * @return
     *     possible object is
     *     {@link TrustedPayees }
     *     
     */
    public TrustedPayees getTrustedPayees() {
        return trustedPayees;
    }

    /**
     * Sets the value of the trustedPayees property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustedPayees }
     *     
     */
    public void setTrustedPayees(TrustedPayees value) {
        this.trustedPayees = value;
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
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRid(String value) {
        this.typeRid = value;
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
     *         &lt;element name="AuthQA" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}AuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authQA"
    })
    public static class AuthQAs {

        @XmlElement(name = "AuthQA")
        protected List<AuthQA> authQA;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the authQA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authQA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthQA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuthQA }
         * 
         * 
         */
        public List<AuthQA> getAuthQA() {
            if (authQA == null) {
                authQA = new ArrayList<AuthQA>();
            }
            return this.authQA;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="LinkedSubject" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "linkedSubject"
    })
    public static class InSubjects {

        @XmlElement(name = "LinkedSubject")
        protected List<LinkedSubject> linkedSubject;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the linkedSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkedSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkedSubject }
         * 
         * 
         */
        public List<LinkedSubject> getLinkedSubject() {
            if (linkedSubject == null) {
                linkedSubject = new ArrayList<LinkedSubject>();
            }
            return this.linkedSubject;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="LinkedSubject" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "linkedSubject"
    })
    public static class OutSubjects {

        @XmlElement(name = "LinkedSubject")
        protected List<LinkedSubject> linkedSubject;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the linkedSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkedSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkedSubject }
         * 
         * 
         */
        public List<LinkedSubject> getLinkedSubject() {
            if (linkedSubject == null) {
                linkedSubject = new ArrayList<LinkedSubject>();
            }
            return this.linkedSubject;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="Application" type="{http://schemas.tranzaxis.com/applications.xsd}Application" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "application"
    })
    public static class SubjectApplications {

        @XmlElement(name = "Application")
        protected List<Application> application;

        /**
         * Gets the value of the application property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the application property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Application }
         * 
         * 
         */
        public List<Application> getApplication() {
            if (application == null) {
                application = new ArrayList<Application>();
            }
            return this.application;
        }

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
     *         &lt;element name="SubjectContactAddress" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}ContactAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subjectContactAddress"
    })
    public static class SubjectContactAddresses {

        @XmlElement(name = "SubjectContactAddress")
        protected List<ContactAddress> subjectContactAddress;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the subjectContactAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectContactAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectContactAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactAddress }
         * 
         * 
         */
        public List<ContactAddress> getSubjectContactAddress() {
            if (subjectContactAddress == null) {
                subjectContactAddress = new ArrayList<ContactAddress>();
            }
            return this.subjectContactAddress;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="Document" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class SubjectDocuments {

        @XmlElement(name = "Document")
        protected List<Document> document;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document }
         * 
         * 
         */
        public List<Document> getDocument() {
            if (document == null) {
                document = new ArrayList<Document>();
            }
            return this.document;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="Estate" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Estate" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "estate"
    })
    public static class SubjectEstates {

        @XmlElement(name = "Estate")
        protected List<Estate> estate;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the estate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEstate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Estate }
         * 
         * 
         */
        public List<Estate> getEstate() {
            if (estate == null) {
                estate = new ArrayList<Estate>();
            }
            return this.estate;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecific" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "networkSpecific"
    })
    public static class SubjectNetworkSpecifics {

        @XmlElement(name = "NetworkSpecific")
        protected List<NetworkSpecific> networkSpecific;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the networkSpecific property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkSpecific property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkSpecific().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetworkSpecific }
         * 
         * 
         */
        public List<NetworkSpecific> getNetworkSpecific() {
            if (networkSpecific == null) {
                networkSpecific = new ArrayList<NetworkSpecific>();
            }
            return this.networkSpecific;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

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
     *         &lt;element name="Note" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "note"
    })
    public static class SubjectNotes {

        @XmlElement(name = "Note")
        protected List<Note> note;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Note }
         * 
         * 
         */
        public List<Note> getNote() {
            if (note == null) {
                note = new ArrayList<Note>();
            }
            return this.note;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

    }

}
