
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SelectSubjectsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectSubjectsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutLinkedSubject" type="{http://schemas.tranzaxis.com/tran.xsd}SubjectLinkSelectRq" minOccurs="0"/&gt;
 *         &lt;element name="InLinkedSubject" type="{http://schemas.tranzaxis.com/tran.xsd}SubjectLinkSelectRq" minOccurs="0"/&gt;
 *         &lt;element name="Issues" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Statuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/issue-admin.xsd}IssueStatus" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TypeIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Assignee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CreatedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="CreatedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ClosedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ClosedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstitutionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstitutionName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SubjectRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectDocumentRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectDocumentTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SubjectDocumentTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectDocumentSeries" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OrganizationTitleLike" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PersonLastNameLike" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PersonFirstNameLike" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentCorporationId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ParentCorporationRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentOrganizationId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ParentOrganizationRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectClass" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="SubjectTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SubjectTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StartObjNo" type="{http://schemas.radixware.org/types.xsd}Int" default="1" /&gt;
 *       &lt;attribute name="ObjCnt" type="{http://schemas.radixware.org/types.xsd}Int" default="100" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectSubjectsRequest", propOrder = {
    "outLinkedSubject",
    "inLinkedSubject",
    "issues"
})
@XmlSeeAlso({
    SelectContractsRequest.class
})
public class SelectSubjectsRequest {

    @XmlElement(name = "OutLinkedSubject")
    protected SubjectLinkSelectRq outLinkedSubject;
    @XmlElement(name = "InLinkedSubject")
    protected SubjectLinkSelectRq inLinkedSubject;
    @XmlElement(name = "Issues")
    protected SelectSubjectsRequest.Issues issues;
    @XmlAttribute(name = "InitiatorRid", required = true)
    protected String initiatorRid;
    @XmlAttribute(name = "InstitutionId")
    protected Long institutionId;
    @XmlAttribute(name = "InstitutionName")
    protected String institutionName;
    @XmlAttribute(name = "SubjectId")
    protected Long subjectId;
    @XmlAttribute(name = "SubjectRid")
    protected String subjectRid;
    @XmlAttribute(name = "SubjectDocumentRid")
    protected String subjectDocumentRid;
    @XmlAttribute(name = "SubjectDocumentTypeId")
    protected Long subjectDocumentTypeId;
    @XmlAttribute(name = "SubjectDocumentTypeRid")
    protected String subjectDocumentTypeRid;
    @XmlAttribute(name = "SubjectDocumentSeries")
    protected String subjectDocumentSeries;
    @XmlAttribute(name = "OrganizationTitleLike")
    protected String organizationTitleLike;
    @XmlAttribute(name = "PersonLastNameLike")
    protected String personLastNameLike;
    @XmlAttribute(name = "PersonFirstNameLike")
    protected String personFirstNameLike;
    @XmlAttribute(name = "ParentCorporationId")
    protected Long parentCorporationId;
    @XmlAttribute(name = "ParentCorporationRid")
    protected String parentCorporationRid;
    @XmlAttribute(name = "ParentOrganizationId")
    protected Long parentOrganizationId;
    @XmlAttribute(name = "ParentOrganizationRid")
    protected String parentOrganizationRid;
    @XmlAttribute(name = "SubjectClass")
    protected String subjectClass;
    @XmlAttribute(name = "SubjectTypeId")
    protected Long subjectTypeId;
    @XmlAttribute(name = "SubjectTypeRid")
    protected String subjectTypeRid;
    @XmlAttribute(name = "StartObjNo")
    protected Long startObjNo;
    @XmlAttribute(name = "ObjCnt")
    protected Long objCnt;

    /**
     * Gets the value of the outLinkedSubject property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectLinkSelectRq }
     *     
     */
    public SubjectLinkSelectRq getOutLinkedSubject() {
        return outLinkedSubject;
    }

    /**
     * Sets the value of the outLinkedSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectLinkSelectRq }
     *     
     */
    public void setOutLinkedSubject(SubjectLinkSelectRq value) {
        this.outLinkedSubject = value;
    }

    /**
     * Gets the value of the inLinkedSubject property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectLinkSelectRq }
     *     
     */
    public SubjectLinkSelectRq getInLinkedSubject() {
        return inLinkedSubject;
    }

    /**
     * Sets the value of the inLinkedSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectLinkSelectRq }
     *     
     */
    public void setInLinkedSubject(SubjectLinkSelectRq value) {
        this.inLinkedSubject = value;
    }

    /**
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link SelectSubjectsRequest.Issues }
     *     
     */
    public SelectSubjectsRequest.Issues getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectSubjectsRequest.Issues }
     *     
     */
    public void setIssues(SelectSubjectsRequest.Issues value) {
        this.issues = value;
    }

    /**
     * Gets the value of the initiatorRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorRid() {
        return initiatorRid;
    }

    /**
     * Sets the value of the initiatorRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorRid(String value) {
        this.initiatorRid = value;
    }

    /**
     * Gets the value of the institutionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstitutionId() {
        return institutionId;
    }

    /**
     * Sets the value of the institutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstitutionId(Long value) {
        this.institutionId = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
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
     * Gets the value of the subjectRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectRid() {
        return subjectRid;
    }

    /**
     * Sets the value of the subjectRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectRid(String value) {
        this.subjectRid = value;
    }

    /**
     * Gets the value of the subjectDocumentRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectDocumentRid() {
        return subjectDocumentRid;
    }

    /**
     * Sets the value of the subjectDocumentRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectDocumentRid(String value) {
        this.subjectDocumentRid = value;
    }

    /**
     * Gets the value of the subjectDocumentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectDocumentTypeId() {
        return subjectDocumentTypeId;
    }

    /**
     * Sets the value of the subjectDocumentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectDocumentTypeId(Long value) {
        this.subjectDocumentTypeId = value;
    }

    /**
     * Gets the value of the subjectDocumentTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectDocumentTypeRid() {
        return subjectDocumentTypeRid;
    }

    /**
     * Sets the value of the subjectDocumentTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectDocumentTypeRid(String value) {
        this.subjectDocumentTypeRid = value;
    }

    /**
     * Gets the value of the subjectDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectDocumentSeries() {
        return subjectDocumentSeries;
    }

    /**
     * Sets the value of the subjectDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectDocumentSeries(String value) {
        this.subjectDocumentSeries = value;
    }

    /**
     * Gets the value of the organizationTitleLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationTitleLike() {
        return organizationTitleLike;
    }

    /**
     * Sets the value of the organizationTitleLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationTitleLike(String value) {
        this.organizationTitleLike = value;
    }

    /**
     * Gets the value of the personLastNameLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastNameLike() {
        return personLastNameLike;
    }

    /**
     * Sets the value of the personLastNameLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastNameLike(String value) {
        this.personLastNameLike = value;
    }

    /**
     * Gets the value of the personFirstNameLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstNameLike() {
        return personFirstNameLike;
    }

    /**
     * Sets the value of the personFirstNameLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstNameLike(String value) {
        this.personFirstNameLike = value;
    }

    /**
     * Gets the value of the parentCorporationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCorporationId() {
        return parentCorporationId;
    }

    /**
     * Sets the value of the parentCorporationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCorporationId(Long value) {
        this.parentCorporationId = value;
    }

    /**
     * Gets the value of the parentCorporationRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCorporationRid() {
        return parentCorporationRid;
    }

    /**
     * Sets the value of the parentCorporationRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCorporationRid(String value) {
        this.parentCorporationRid = value;
    }

    /**
     * Gets the value of the parentOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentOrganizationId() {
        return parentOrganizationId;
    }

    /**
     * Sets the value of the parentOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentOrganizationId(Long value) {
        this.parentOrganizationId = value;
    }

    /**
     * Gets the value of the parentOrganizationRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrganizationRid() {
        return parentOrganizationRid;
    }

    /**
     * Sets the value of the parentOrganizationRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrganizationRid(String value) {
        this.parentOrganizationRid = value;
    }

    /**
     * Gets the value of the subjectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectClass() {
        return subjectClass;
    }

    /**
     * Sets the value of the subjectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectClass(String value) {
        this.subjectClass = value;
    }

    /**
     * Gets the value of the subjectTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectTypeId() {
        return subjectTypeId;
    }

    /**
     * Sets the value of the subjectTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectTypeId(Long value) {
        this.subjectTypeId = value;
    }

    /**
     * Gets the value of the subjectTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeRid() {
        return subjectTypeRid;
    }

    /**
     * Sets the value of the subjectTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeRid(String value) {
        this.subjectTypeRid = value;
    }

    /**
     * Gets the value of the startObjNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getStartObjNo() {
        if (startObjNo == null) {
            return  1L;
        } else {
            return startObjNo;
        }
    }

    /**
     * Sets the value of the startObjNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartObjNo(Long value) {
        this.startObjNo = value;
    }

    /**
     * Gets the value of the objCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getObjCnt() {
        if (objCnt == null) {
            return  100L;
        } else {
            return objCnt;
        }
    }

    /**
     * Sets the value of the objCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjCnt(Long value) {
        this.objCnt = value;
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
     *       &lt;attribute name="Statuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/issue-admin.xsd}IssueStatus" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TypeIds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Assignee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CreatedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="CreatedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ClosedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ClosedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Issues {

        @XmlAttribute(name = "Statuses")
        protected List<String> statuses;
        @XmlAttribute(name = "TypeIds")
        protected List<Long> typeIds;
        @XmlAttribute(name = "Assignee")
        protected String assignee;
        @XmlAttribute(name = "CreatedFrom")
        protected XMLGregorianCalendar createdFrom;
        @XmlAttribute(name = "CreatedTo")
        protected XMLGregorianCalendar createdTo;
        @XmlAttribute(name = "ClosedFrom")
        protected XMLGregorianCalendar closedFrom;
        @XmlAttribute(name = "ClosedTo")
        protected XMLGregorianCalendar closedTo;

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
        }

        /**
         * Gets the value of the typeIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTypeIds() {
            if (typeIds == null) {
                typeIds = new ArrayList<Long>();
            }
            return this.typeIds;
        }

        /**
         * Gets the value of the assignee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignee() {
            return assignee;
        }

        /**
         * Sets the value of the assignee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignee(String value) {
            this.assignee = value;
        }

        /**
         * Gets the value of the createdFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedFrom() {
            return createdFrom;
        }

        /**
         * Sets the value of the createdFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedFrom(XMLGregorianCalendar value) {
            this.createdFrom = value;
        }

        /**
         * Gets the value of the createdTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedTo() {
            return createdTo;
        }

        /**
         * Sets the value of the createdTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedTo(XMLGregorianCalendar value) {
            this.createdTo = value;
        }

        /**
         * Gets the value of the closedFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClosedFrom() {
            return closedFrom;
        }

        /**
         * Sets the value of the closedFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setClosedFrom(XMLGregorianCalendar value) {
            this.closedFrom = value;
        }

        /**
         * Gets the value of the closedTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClosedTo() {
            return closedTo;
        }

        /**
         * Sets the value of the closedTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setClosedTo(XMLGregorianCalendar value) {
            this.closedTo = value;
        }

    }

}
