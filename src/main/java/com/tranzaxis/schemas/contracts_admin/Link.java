
package com.tranzaxis.schemas.contracts_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.restricting_admin.Restriction;


/**
 * <p>Java class for Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Link"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Title1" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Contract1PartId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Contract1PartyRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BatchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title2" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Restriction" type="{http://schemas.tranzaxis.com/restricting-admin.xsd}Restriction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", propOrder = {
    "status",
    "title1",
    "contract1PartId",
    "contract1PartyRid",
    "batchId",
    "title2",
    "notes",
    "profileId",
    "profileRid",
    "expTime",
    "createTime",
    "createDay",
    "createUserName",
    "activateTime",
    "activateDay",
    "activateUserName",
    "closeTime",
    "closeDay",
    "closeUserName",
    "restrictions"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.contracts_admin.Contract.InLinks.Link.class,
    OutLink.class
})
public class Link {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "Title1", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title1;
    @XmlElementRef(name = "Contract1PartId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contract1PartId;
    @XmlElementRef(name = "Contract1PartyRid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contract1PartyRid;
    @XmlElementRef(name = "BatchId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> batchId;
    @XmlElementRef(name = "Title2", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title2;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "ProfileId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> profileId;
    @XmlElementRef(name = "ProfileRid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileRid;
    @XmlElementRef(name = "ExpTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expTime;
    @XmlElementRef(name = "CreateTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createTime;
    @XmlElement(name = "CreateDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDay;
    @XmlElementRef(name = "CreateUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createUserName;
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
    @XmlElement(name = "Restrictions")
    protected Link.Restrictions restrictions;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "Id")
    protected Long id;

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
     * Gets the value of the contract1PartId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContract1PartId() {
        return contract1PartId;
    }

    /**
     * Sets the value of the contract1PartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContract1PartId(JAXBElement<Long> value) {
        this.contract1PartId = value;
    }

    /**
     * Gets the value of the contract1PartyRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContract1PartyRid() {
        return contract1PartyRid;
    }

    /**
     * Sets the value of the contract1PartyRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContract1PartyRid(JAXBElement<String> value) {
        this.contract1PartyRid = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBatchId(JAXBElement<Long> value) {
        this.batchId = value;
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
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProfileId(JAXBElement<Long> value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the profileRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileRid() {
        return profileRid;
    }

    /**
     * Sets the value of the profileRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileRid(JAXBElement<String> value) {
        this.profileRid = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDay() {
        return createDay;
    }

    /**
     * Sets the value of the createDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDay(XMLGregorianCalendar value) {
        this.createDay = value;
    }

    /**
     * Gets the value of the createUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateUserName() {
        return createUserName;
    }

    /**
     * Sets the value of the createUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateUserName(JAXBElement<String> value) {
        this.createUserName = value;
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
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Link.Restrictions }
     *     
     */
    public Link.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link.Restrictions }
     *     
     */
    public void setRestrictions(Link.Restrictions value) {
        this.restrictions = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Restriction" type="{http://schemas.tranzaxis.com/restricting-admin.xsd}Restriction" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "restriction"
    })
    public static class Restrictions {

        @XmlElement(name = "Restriction")
        protected List<Restriction> restriction;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the restriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Restriction }
         * 
         * 
         */
        public List<Restriction> getRestriction() {
            if (restriction == null) {
                restriction = new ArrayList<Restriction>();
            }
            return this.restriction;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link ListModifyMode }
         *     
         */
        public ListModifyMode getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListModifyMode }
         *     
         */
        public void setMode(ListModifyMode value) {
            this.mode = value;
        }

    }

}
