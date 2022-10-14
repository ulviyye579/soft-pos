
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ContactAddress;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/subjects-admin.xsd}SubjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LegalTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LatTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ShortTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OwnerTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="OwnerTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgMustExist" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="LegalTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LegalTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MccId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="QualityCode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CQualityCode" minOccurs="0"/&gt;
 *         &lt;element name="LocationCode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CLocationCode" minOccurs="0"/&gt;
 *         &lt;element name="CancelledDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReinstatedDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkScheduleId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="LegalAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "title",
    "legalTitle",
    "latTitle",
    "shortTitle",
    "ownerTypeId",
    "ownerTypeRid",
    "parentOrgId",
    "parentOrgRid",
    "parentOrgMustExist",
    "legalTypeId",
    "legalTypeRid",
    "mccId",
    "qualityCode",
    "locationCode",
    "cancelledDate",
    "reinstatedDate",
    "workScheduleId",
    "address",
    "legalAddress"
})
@XmlSeeAlso({
    Corporation.class,
    Department.class
})
public class Organization
    extends SubjectBase
{

    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "LegalTitle", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalTitle;
    @XmlElementRef(name = "LatTitle", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latTitle;
    @XmlElementRef(name = "ShortTitle", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortTitle;
    @XmlElementRef(name = "OwnerTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ownerTypeId;
    @XmlElementRef(name = "OwnerTypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerTypeRid;
    @XmlElementRef(name = "ParentOrgId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentOrgId;
    @XmlElementRef(name = "ParentOrgRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentOrgRid;
    @XmlElementRef(name = "ParentOrgMustExist", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> parentOrgMustExist;
    @XmlElementRef(name = "LegalTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> legalTypeId;
    @XmlElementRef(name = "LegalTypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalTypeRid;
    @XmlElementRef(name = "MccId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mccId;
    @XmlElementRef(name = "QualityCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> qualityCode;
    @XmlElementRef(name = "LocationCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCode;
    @XmlElementRef(name = "CancelledDate", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cancelledDate;
    @XmlElementRef(name = "ReinstatedDate", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reinstatedDate;
    @XmlElementRef(name = "WorkScheduleId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workScheduleId;
    @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> address;
    @XmlElementRef(name = "LegalAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> legalAddress;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the legalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalTitle() {
        return legalTitle;
    }

    /**
     * Sets the value of the legalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalTitle(JAXBElement<String> value) {
        this.legalTitle = value;
    }

    /**
     * Gets the value of the latTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatTitle() {
        return latTitle;
    }

    /**
     * Sets the value of the latTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatTitle(JAXBElement<String> value) {
        this.latTitle = value;
    }

    /**
     * Gets the value of the shortTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortTitle(JAXBElement<String> value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the ownerTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerTypeId() {
        return ownerTypeId;
    }

    /**
     * Sets the value of the ownerTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerTypeId(JAXBElement<Long> value) {
        this.ownerTypeId = value;
    }

    /**
     * Gets the value of the ownerTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTypeRid() {
        return ownerTypeRid;
    }

    /**
     * Sets the value of the ownerTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTypeRid(JAXBElement<String> value) {
        this.ownerTypeRid = value;
    }

    /**
     * Gets the value of the parentOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentOrgId() {
        return parentOrgId;
    }

    /**
     * Sets the value of the parentOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentOrgId(JAXBElement<Long> value) {
        this.parentOrgId = value;
    }

    /**
     * Gets the value of the parentOrgRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentOrgRid() {
        return parentOrgRid;
    }

    /**
     * Sets the value of the parentOrgRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentOrgRid(JAXBElement<String> value) {
        this.parentOrgRid = value;
    }

    /**
     * Gets the value of the parentOrgMustExist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getParentOrgMustExist() {
        return parentOrgMustExist;
    }

    /**
     * Sets the value of the parentOrgMustExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setParentOrgMustExist(JAXBElement<Boolean> value) {
        this.parentOrgMustExist = value;
    }

    /**
     * Gets the value of the legalTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLegalTypeId() {
        return legalTypeId;
    }

    /**
     * Sets the value of the legalTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLegalTypeId(JAXBElement<Long> value) {
        this.legalTypeId = value;
    }

    /**
     * Gets the value of the legalTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalTypeRid() {
        return legalTypeRid;
    }

    /**
     * Sets the value of the legalTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalTypeRid(JAXBElement<String> value) {
        this.legalTypeRid = value;
    }

    /**
     * Gets the value of the mccId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMccId() {
        return mccId;
    }

    /**
     * Sets the value of the mccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMccId(JAXBElement<Long> value) {
        this.mccId = value;
    }

    /**
     * Gets the value of the qualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQualityCode() {
        return qualityCode;
    }

    /**
     * Sets the value of the qualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQualityCode(JAXBElement<Long> value) {
        this.qualityCode = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCode(JAXBElement<Long> value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the cancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Sets the value of the cancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCancelledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.cancelledDate = value;
    }

    /**
     * Gets the value of the reinstatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReinstatedDate() {
        return reinstatedDate;
    }

    /**
     * Sets the value of the reinstatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReinstatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reinstatedDate = value;
    }

    /**
     * Gets the value of the workScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkScheduleId() {
        return workScheduleId;
    }

    /**
     * Sets the value of the workScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkScheduleId(JAXBElement<Long> value) {
        this.workScheduleId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<ContactAddress> value) {
        this.address = value;
    }

    /**
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setLegalAddress(JAXBElement<ContactAddress> value) {
        this.legalAddress = value;
    }

}
