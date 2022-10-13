
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectSelectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectSelectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Issues" type="{http://schemas.tranzaxis.com/tran.xsd}IssuesInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubjectId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SubjectRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubjectClass" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="OrganizationTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PersonFirstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PersonMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PersonLastName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectSelectInfo", propOrder = {
    "issues"
})
@XmlSeeAlso({
    ContractSelectInfo.class
})
public class SubjectSelectInfo {

    @XmlElement(name = "Issues")
    protected IssuesInfo issues;
    @XmlAttribute(name = "SubjectId", required = true)
    protected long subjectId;
    @XmlAttribute(name = "SubjectRid")
    protected String subjectRid;
    @XmlAttribute(name = "SubjectClass", required = true)
    protected String subjectClass;
    @XmlAttribute(name = "OrganizationTitle")
    protected String organizationTitle;
    @XmlAttribute(name = "PersonFirstName")
    protected String personFirstName;
    @XmlAttribute(name = "PersonMiddleName")
    protected String personMiddleName;
    @XmlAttribute(name = "PersonLastName")
    protected String personLastName;

    /**
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link IssuesInfo }
     *     
     */
    public IssuesInfo getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuesInfo }
     *     
     */
    public void setIssues(IssuesInfo value) {
        this.issues = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     */
    public long getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     */
    public void setSubjectId(long value) {
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
     * Gets the value of the organizationTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationTitle() {
        return organizationTitle;
    }

    /**
     * Sets the value of the organizationTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationTitle(String value) {
        this.organizationTitle = value;
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstName(String value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMiddleName(String value) {
        this.personMiddleName = value;
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastName(String value) {
        this.personLastName = value;
    }

}
