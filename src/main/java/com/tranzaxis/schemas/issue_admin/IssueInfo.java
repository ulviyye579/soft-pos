
package com.tranzaxis.schemas.issue_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ParamValues;


/**
 * <p>Java class for IssueInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Watchers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Watcher" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Descrition" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ReporterName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AssigneeName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionNotes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Resolution" type="{http://schemas.tranzaxis.com/issue-admin.xsd}Resolution" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartProgressTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SubjectId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TerminalId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InvoiceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DebtCollectionStratInstanceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DebtCollectionActionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Priority" type="{http://schemas.tranzaxis.com/issue-admin.xsd}Priority" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/issue-admin.xsd}IssueStatus" /&gt;
 *       &lt;attribute name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="DueStartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="DueFinishTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ControlTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="EditTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="AssignTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ReviewTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ReconDiffAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ReconDiffCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ReconDiffBalance" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ReconDiffRegRole" type="{http://schemas.tranzaxis.com/issue-admin.xsd}RegisterRole" /&gt;
 *       &lt;attribute name="ReconDiffPostingAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="State" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueInfo", propOrder = {
    "watchers",
    "title",
    "descrition",
    "contactName",
    "reporterName",
    "assigneeName",
    "resolutionNotes",
    "resolution",
    "closeTime",
    "startProgressTime",
    "userAttrs"
})
public class IssueInfo {

    @XmlElementRef(name = "Watchers", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<IssueInfo.Watchers> watchers;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElementRef(name = "Descrition", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrition;
    @XmlElementRef(name = "ContactName", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactName;
    @XmlElement(name = "ReporterName")
    protected String reporterName;
    @XmlElementRef(name = "AssigneeName", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assigneeName;
    @XmlElementRef(name = "ResolutionNotes", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolutionNotes;
    @XmlElementRef(name = "Resolution", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolution;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElementRef(name = "StartProgressTime", namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startProgressTime;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ClassGuid")
    protected String classGuid;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "BranchId")
    protected Long branchId;
    @XmlAttribute(name = "SubjectId")
    protected Long subjectId;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "TerminalId")
    protected Long terminalId;
    @XmlAttribute(name = "TokenId")
    protected Long tokenId;
    @XmlAttribute(name = "InvoiceId")
    protected Long invoiceId;
    @XmlAttribute(name = "DebtCollectionStratInstanceId")
    protected Long debtCollectionStratInstanceId;
    @XmlAttribute(name = "DebtCollectionActionId")
    protected Long debtCollectionActionId;
    @XmlAttribute(name = "Priority")
    protected Long priority;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "CreateTime")
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "DueStartTime")
    protected XMLGregorianCalendar dueStartTime;
    @XmlAttribute(name = "DueFinishTime")
    protected XMLGregorianCalendar dueFinishTime;
    @XmlAttribute(name = "ControlTime")
    protected XMLGregorianCalendar controlTime;
    @XmlAttribute(name = "EditTime")
    protected XMLGregorianCalendar editTime;
    @XmlAttribute(name = "AssignTime")
    protected XMLGregorianCalendar assignTime;
    @XmlAttribute(name = "ReviewTime")
    protected XMLGregorianCalendar reviewTime;
    @XmlAttribute(name = "ReconDiffAccount")
    protected String reconDiffAccount;
    @XmlAttribute(name = "ReconDiffCcy")
    protected Long reconDiffCcy;
    @XmlAttribute(name = "ReconDiffBalance")
    protected BigDecimal reconDiffBalance;
    @XmlAttribute(name = "ReconDiffRegRole")
    protected String reconDiffRegRole;
    @XmlAttribute(name = "ReconDiffPostingAmt")
    protected BigDecimal reconDiffPostingAmt;
    @XmlAttribute(name = "State")
    protected String state;

    /**
     * Gets the value of the watchers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IssueInfo.Watchers }{@code >}
     *     
     */
    public JAXBElement<IssueInfo.Watchers> getWatchers() {
        return watchers;
    }

    /**
     * Sets the value of the watchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IssueInfo.Watchers }{@code >}
     *     
     */
    public void setWatchers(JAXBElement<IssueInfo.Watchers> value) {
        this.watchers = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the descrition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrition() {
        return descrition;
    }

    /**
     * Sets the value of the descrition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrition(JAXBElement<String> value) {
        this.descrition = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the reporterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterName() {
        return reporterName;
    }

    /**
     * Sets the value of the reporterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterName(String value) {
        this.reporterName = value;
    }

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
     * Gets the value of the resolutionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolutionNotes() {
        return resolutionNotes;
    }

    /**
     * Sets the value of the resolutionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolutionNotes(JAXBElement<String> value) {
        this.resolutionNotes = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolution(JAXBElement<String> value) {
        this.resolution = value;
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
     * Gets the value of the startProgressTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartProgressTime() {
        return startProgressTime;
    }

    /**
     * Sets the value of the startProgressTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartProgressTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startProgressTime = value;
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
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
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
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchId(Long value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectId(Long value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerminalId(Long value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenId(Long value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceId(Long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the debtCollectionStratInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtCollectionStratInstanceId() {
        return debtCollectionStratInstanceId;
    }

    /**
     * Sets the value of the debtCollectionStratInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtCollectionStratInstanceId(Long value) {
        this.debtCollectionStratInstanceId = value;
    }

    /**
     * Gets the value of the debtCollectionActionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtCollectionActionId() {
        return debtCollectionActionId;
    }

    /**
     * Sets the value of the debtCollectionActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtCollectionActionId(Long value) {
        this.debtCollectionActionId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
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
     * Gets the value of the dueStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueStartTime() {
        return dueStartTime;
    }

    /**
     * Sets the value of the dueStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueStartTime(XMLGregorianCalendar value) {
        this.dueStartTime = value;
    }

    /**
     * Gets the value of the dueFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueFinishTime() {
        return dueFinishTime;
    }

    /**
     * Sets the value of the dueFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueFinishTime(XMLGregorianCalendar value) {
        this.dueFinishTime = value;
    }

    /**
     * Gets the value of the controlTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getControlTime() {
        return controlTime;
    }

    /**
     * Sets the value of the controlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setControlTime(XMLGregorianCalendar value) {
        this.controlTime = value;
    }

    /**
     * Gets the value of the editTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditTime() {
        return editTime;
    }

    /**
     * Sets the value of the editTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditTime(XMLGregorianCalendar value) {
        this.editTime = value;
    }

    /**
     * Gets the value of the assignTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignTime() {
        return assignTime;
    }

    /**
     * Sets the value of the assignTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignTime(XMLGregorianCalendar value) {
        this.assignTime = value;
    }

    /**
     * Gets the value of the reviewTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewTime() {
        return reviewTime;
    }

    /**
     * Sets the value of the reviewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewTime(XMLGregorianCalendar value) {
        this.reviewTime = value;
    }

    /**
     * Gets the value of the reconDiffAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconDiffAccount() {
        return reconDiffAccount;
    }

    /**
     * Sets the value of the reconDiffAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconDiffAccount(String value) {
        this.reconDiffAccount = value;
    }

    /**
     * Gets the value of the reconDiffCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconDiffCcy() {
        return reconDiffCcy;
    }

    /**
     * Sets the value of the reconDiffCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconDiffCcy(Long value) {
        this.reconDiffCcy = value;
    }

    /**
     * Gets the value of the reconDiffBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReconDiffBalance() {
        return reconDiffBalance;
    }

    /**
     * Sets the value of the reconDiffBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReconDiffBalance(BigDecimal value) {
        this.reconDiffBalance = value;
    }

    /**
     * Gets the value of the reconDiffRegRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconDiffRegRole() {
        return reconDiffRegRole;
    }

    /**
     * Sets the value of the reconDiffRegRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconDiffRegRole(String value) {
        this.reconDiffRegRole = value;
    }

    /**
     * Gets the value of the reconDiffPostingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReconDiffPostingAmt() {
        return reconDiffPostingAmt;
    }

    /**
     * Sets the value of the reconDiffPostingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReconDiffPostingAmt(BigDecimal value) {
        this.reconDiffPostingAmt = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     *         &lt;element name="Watcher" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "watcher"
    })
    public static class Watchers {

        @XmlElement(name = "Watcher")
        protected List<String> watcher;

        /**
         * Gets the value of the watcher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the watcher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWatcher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWatcher() {
            if (watcher == null) {
                watcher = new ArrayList<String>();
            }
            return this.watcher;
        }

    }

}
