
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ContactAddress;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.restricting_admin.Restriction;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/subjects-admin.xsd}SubjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastNameLat" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameLat" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MiddleNameLat" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TitleTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TitleTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title2TypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title2TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TitleSuffixTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CGender" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CMaritalStatus" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="BirthPlace" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EducationTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="EducationTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OccupationTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="OccupationTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CPersonEmploymentStatus" minOccurs="0"/&gt;
 *         &lt;element name="EmployerTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ResidentialStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CPersonResidentialStatus" minOccurs="0"/&gt;
 *         &lt;element name="CurResidenceDuration" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RentMortgagePayAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="RentMortgagePayCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ExtraCitizenship" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExtraCitizenshipId" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResidenceCountryId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RegAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="HomeAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="HomeAddress2" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="BirthAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="TwitterScreenName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Emails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MobilePhones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WorkPhones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsTerrorist" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsVip" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="HasCapReader" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="HasExtAuthApp" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Income" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="IncomeCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTemplates" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}PaymentTemplates" minOccurs="0"/&gt;
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
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "lastName",
    "lastNameLat",
    "firstName",
    "firstNameLat",
    "middleName",
    "middleNameLat",
    "titleTypeId",
    "titleTypeRid",
    "title2TypeId",
    "title2TypeRid",
    "titleSuffixTypeId",
    "gender",
    "maritalStatus",
    "childrenCnt",
    "birthDate",
    "birthPlace",
    "birthName",
    "educationTypeId",
    "educationTypeRid",
    "occupationTypeId",
    "occupationTypeRid",
    "employmentStatus",
    "employerTitle",
    "residentialStatus",
    "curResidenceDuration",
    "rentMortgagePayAmt",
    "rentMortgagePayCcy",
    "citizenshipId",
    "extraCitizenship",
    "residenceCountryId",
    "regAddress",
    "homeAddress",
    "homeAddress2",
    "birthAddress",
    "twitterScreenName",
    "emails",
    "mobilePhones",
    "workPhones",
    "isTerrorist",
    "isVip",
    "hasCapReader",
    "hasExtAuthApp",
    "income",
    "incomeCcy",
    "profileId",
    "profileRid",
    "paymentTemplates",
    "restrictions"
})
public class Person
    extends SubjectBase
{

    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElementRef(name = "LastNameLat", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastNameLat;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FirstNameLat", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstNameLat;
    @XmlElementRef(name = "MiddleName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "MiddleNameLat", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleNameLat;
    @XmlElementRef(name = "TitleTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> titleTypeId;
    @XmlElementRef(name = "TitleTypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titleTypeRid;
    @XmlElementRef(name = "Title2TypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> title2TypeId;
    @XmlElementRef(name = "Title2TypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title2TypeRid;
    @XmlElementRef(name = "TitleSuffixTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> titleSuffixTypeId;
    @XmlElementRef(name = "Gender", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "ChildrenCnt", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> childrenCnt;
    @XmlElementRef(name = "BirthDate", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDate;
    @XmlElementRef(name = "BirthPlace", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthPlace;
    @XmlElementRef(name = "BirthName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthName;
    @XmlElementRef(name = "EducationTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> educationTypeId;
    @XmlElementRef(name = "EducationTypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> educationTypeRid;
    @XmlElementRef(name = "OccupationTypeId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> occupationTypeId;
    @XmlElementRef(name = "OccupationTypeRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupationTypeRid;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employmentStatus;
    @XmlElementRef(name = "EmployerTitle", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employerTitle;
    @XmlElementRef(name = "ResidentialStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residentialStatus;
    @XmlElementRef(name = "CurResidenceDuration", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> curResidenceDuration;
    @XmlElementRef(name = "RentMortgagePayAmt", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rentMortgagePayAmt;
    @XmlElementRef(name = "RentMortgagePayCcy", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rentMortgagePayCcy;
    @XmlElementRef(name = "CitizenshipId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> citizenshipId;
    @XmlElementRef(name = "ExtraCitizenship", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Person.ExtraCitizenship> extraCitizenship;
    @XmlElementRef(name = "ResidenceCountryId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> residenceCountryId;
    @XmlElementRef(name = "RegAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> regAddress;
    @XmlElementRef(name = "HomeAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> homeAddress;
    @XmlElementRef(name = "HomeAddress2", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> homeAddress2;
    @XmlElementRef(name = "BirthAddress", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> birthAddress;
    @XmlElementRef(name = "TwitterScreenName", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> twitterScreenName;
    @XmlElementRef(name = "Emails", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Person.Emails> emails;
    @XmlElementRef(name = "MobilePhones", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Person.MobilePhones> mobilePhones;
    @XmlElementRef(name = "WorkPhones", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Person.WorkPhones> workPhones;
    @XmlElement(name = "IsTerrorist")
    protected Boolean isTerrorist;
    @XmlElement(name = "IsVip")
    protected Boolean isVip;
    @XmlElement(name = "HasCapReader")
    protected Boolean hasCapReader;
    @XmlElement(name = "HasExtAuthApp")
    protected Boolean hasExtAuthApp;
    @XmlElementRef(name = "Income", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> income;
    @XmlElementRef(name = "IncomeCcy", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> incomeCcy;
    @XmlElementRef(name = "ProfileId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> profileId;
    @XmlElementRef(name = "ProfileRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileRid;
    @XmlElement(name = "PaymentTemplates")
    protected PaymentTemplates paymentTemplates;
    @XmlElement(name = "Restrictions")
    protected Person.Restrictions restrictions;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastNameLat() {
        return lastNameLat;
    }

    /**
     * Sets the value of the lastNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastNameLat(JAXBElement<String> value) {
        this.lastNameLat = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the firstNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstNameLat() {
        return firstNameLat;
    }

    /**
     * Sets the value of the firstNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstNameLat(JAXBElement<String> value) {
        this.firstNameLat = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the middleNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleNameLat() {
        return middleNameLat;
    }

    /**
     * Sets the value of the middleNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleNameLat(JAXBElement<String> value) {
        this.middleNameLat = value;
    }

    /**
     * Gets the value of the titleTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTitleTypeId() {
        return titleTypeId;
    }

    /**
     * Sets the value of the titleTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTitleTypeId(JAXBElement<Long> value) {
        this.titleTypeId = value;
    }

    /**
     * Gets the value of the titleTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitleTypeRid() {
        return titleTypeRid;
    }

    /**
     * Sets the value of the titleTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitleTypeRid(JAXBElement<String> value) {
        this.titleTypeRid = value;
    }

    /**
     * Gets the value of the title2TypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTitle2TypeId() {
        return title2TypeId;
    }

    /**
     * Sets the value of the title2TypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTitle2TypeId(JAXBElement<Long> value) {
        this.title2TypeId = value;
    }

    /**
     * Gets the value of the title2TypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle2TypeRid() {
        return title2TypeRid;
    }

    /**
     * Sets the value of the title2TypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle2TypeRid(JAXBElement<String> value) {
        this.title2TypeRid = value;
    }

    /**
     * Gets the value of the titleSuffixTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTitleSuffixTypeId() {
        return titleSuffixTypeId;
    }

    /**
     * Sets the value of the titleSuffixTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTitleSuffixTypeId(JAXBElement<Long> value) {
        this.titleSuffixTypeId = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the childrenCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChildrenCnt() {
        return childrenCnt;
    }

    /**
     * Sets the value of the childrenCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChildrenCnt(JAXBElement<Long> value) {
        this.childrenCnt = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthPlace(JAXBElement<String> value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the birthName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthName() {
        return birthName;
    }

    /**
     * Sets the value of the birthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthName(JAXBElement<String> value) {
        this.birthName = value;
    }

    /**
     * Gets the value of the educationTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEducationTypeId() {
        return educationTypeId;
    }

    /**
     * Sets the value of the educationTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEducationTypeId(JAXBElement<Long> value) {
        this.educationTypeId = value;
    }

    /**
     * Gets the value of the educationTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEducationTypeRid() {
        return educationTypeRid;
    }

    /**
     * Sets the value of the educationTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEducationTypeRid(JAXBElement<String> value) {
        this.educationTypeRid = value;
    }

    /**
     * Gets the value of the occupationTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOccupationTypeId() {
        return occupationTypeId;
    }

    /**
     * Sets the value of the occupationTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOccupationTypeId(JAXBElement<Long> value) {
        this.occupationTypeId = value;
    }

    /**
     * Gets the value of the occupationTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationTypeRid() {
        return occupationTypeRid;
    }

    /**
     * Sets the value of the occupationTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationTypeRid(JAXBElement<String> value) {
        this.occupationTypeRid = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmploymentStatus(JAXBElement<String> value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the employerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployerTitle() {
        return employerTitle;
    }

    /**
     * Sets the value of the employerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployerTitle(JAXBElement<String> value) {
        this.employerTitle = value;
    }

    /**
     * Gets the value of the residentialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResidentialStatus() {
        return residentialStatus;
    }

    /**
     * Sets the value of the residentialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResidentialStatus(JAXBElement<String> value) {
        this.residentialStatus = value;
    }

    /**
     * Gets the value of the curResidenceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurResidenceDuration() {
        return curResidenceDuration;
    }

    /**
     * Sets the value of the curResidenceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurResidenceDuration(JAXBElement<Long> value) {
        this.curResidenceDuration = value;
    }

    /**
     * Gets the value of the rentMortgagePayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRentMortgagePayAmt() {
        return rentMortgagePayAmt;
    }

    /**
     * Sets the value of the rentMortgagePayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRentMortgagePayAmt(JAXBElement<BigDecimal> value) {
        this.rentMortgagePayAmt = value;
    }

    /**
     * Gets the value of the rentMortgagePayCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRentMortgagePayCcy() {
        return rentMortgagePayCcy;
    }

    /**
     * Sets the value of the rentMortgagePayCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRentMortgagePayCcy(JAXBElement<Long> value) {
        this.rentMortgagePayCcy = value;
    }

    /**
     * Gets the value of the citizenshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCitizenshipId() {
        return citizenshipId;
    }

    /**
     * Sets the value of the citizenshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCitizenshipId(JAXBElement<Long> value) {
        this.citizenshipId = value;
    }

    /**
     * Gets the value of the extraCitizenship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person.ExtraCitizenship }{@code >}
     *     
     */
    public JAXBElement<Person.ExtraCitizenship> getExtraCitizenship() {
        return extraCitizenship;
    }

    /**
     * Sets the value of the extraCitizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person.ExtraCitizenship }{@code >}
     *     
     */
    public void setExtraCitizenship(JAXBElement<Person.ExtraCitizenship> value) {
        this.extraCitizenship = value;
    }

    /**
     * Gets the value of the residenceCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResidenceCountryId() {
        return residenceCountryId;
    }

    /**
     * Sets the value of the residenceCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResidenceCountryId(JAXBElement<Long> value) {
        this.residenceCountryId = value;
    }

    /**
     * Gets the value of the regAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getRegAddress() {
        return regAddress;
    }

    /**
     * Sets the value of the regAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setRegAddress(JAXBElement<ContactAddress> value) {
        this.regAddress = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setHomeAddress(JAXBElement<ContactAddress> value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getHomeAddress2() {
        return homeAddress2;
    }

    /**
     * Sets the value of the homeAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setHomeAddress2(JAXBElement<ContactAddress> value) {
        this.homeAddress2 = value;
    }

    /**
     * Gets the value of the birthAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getBirthAddress() {
        return birthAddress;
    }

    /**
     * Sets the value of the birthAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setBirthAddress(JAXBElement<ContactAddress> value) {
        this.birthAddress = value;
    }

    /**
     * Gets the value of the twitterScreenName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTwitterScreenName() {
        return twitterScreenName;
    }

    /**
     * Sets the value of the twitterScreenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTwitterScreenName(JAXBElement<String> value) {
        this.twitterScreenName = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person.Emails }{@code >}
     *     
     */
    public JAXBElement<Person.Emails> getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person.Emails }{@code >}
     *     
     */
    public void setEmails(JAXBElement<Person.Emails> value) {
        this.emails = value;
    }

    /**
     * Gets the value of the mobilePhones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person.MobilePhones }{@code >}
     *     
     */
    public JAXBElement<Person.MobilePhones> getMobilePhones() {
        return mobilePhones;
    }

    /**
     * Sets the value of the mobilePhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person.MobilePhones }{@code >}
     *     
     */
    public void setMobilePhones(JAXBElement<Person.MobilePhones> value) {
        this.mobilePhones = value;
    }

    /**
     * Gets the value of the workPhones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person.WorkPhones }{@code >}
     *     
     */
    public JAXBElement<Person.WorkPhones> getWorkPhones() {
        return workPhones;
    }

    /**
     * Sets the value of the workPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person.WorkPhones }{@code >}
     *     
     */
    public void setWorkPhones(JAXBElement<Person.WorkPhones> value) {
        this.workPhones = value;
    }

    /**
     * Gets the value of the isTerrorist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTerrorist() {
        return isTerrorist;
    }

    /**
     * Sets the value of the isTerrorist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTerrorist(Boolean value) {
        this.isTerrorist = value;
    }

    /**
     * Gets the value of the isVip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVip() {
        return isVip;
    }

    /**
     * Sets the value of the isVip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVip(Boolean value) {
        this.isVip = value;
    }

    /**
     * Gets the value of the hasCapReader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCapReader() {
        return hasCapReader;
    }

    /**
     * Sets the value of the hasCapReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCapReader(Boolean value) {
        this.hasCapReader = value;
    }

    /**
     * Gets the value of the hasExtAuthApp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasExtAuthApp() {
        return hasExtAuthApp;
    }

    /**
     * Sets the value of the hasExtAuthApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasExtAuthApp(Boolean value) {
        this.hasExtAuthApp = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIncome(JAXBElement<BigDecimal> value) {
        this.income = value;
    }

    /**
     * Gets the value of the incomeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIncomeCcy() {
        return incomeCcy;
    }

    /**
     * Sets the value of the incomeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIncomeCcy(JAXBElement<Long> value) {
        this.incomeCcy = value;
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
     * Gets the value of the paymentTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplates }
     *     
     */
    public PaymentTemplates getPaymentTemplates() {
        return paymentTemplates;
    }

    /**
     * Sets the value of the paymentTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplates }
     *     
     */
    public void setPaymentTemplates(PaymentTemplates value) {
        this.paymentTemplates = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Restrictions }
     *     
     */
    public Person.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Restrictions }
     *     
     */
    public void setRestrictions(Person.Restrictions value) {
        this.restrictions = value;
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
     *         &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "email"
    })
    public static class Emails {

        @XmlElement(name = "Email")
        protected List<String> email;

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
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
     *         &lt;element name="ExtraCitizenshipId" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "extraCitizenshipId"
    })
    public static class ExtraCitizenship {

        @XmlElement(name = "ExtraCitizenshipId", type = Long.class)
        protected List<Long> extraCitizenshipId;

        /**
         * Gets the value of the extraCitizenshipId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extraCitizenshipId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtraCitizenshipId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getExtraCitizenshipId() {
            if (extraCitizenshipId == null) {
                extraCitizenshipId = new ArrayList<Long>();
            }
            return this.extraCitizenshipId;
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
     *         &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "mobilePhone"
    })
    public static class MobilePhones {

        @XmlElement(name = "MobilePhone")
        protected List<String> mobilePhone;

        /**
         * Gets the value of the mobilePhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobilePhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMobilePhone() {
            if (mobilePhone == null) {
                mobilePhone = new ArrayList<String>();
            }
            return this.mobilePhone;
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
     *         &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "workPhone"
    })
    public static class WorkPhones {

        @XmlElement(name = "WorkPhone")
        protected List<String> workPhone;

        /**
         * Gets the value of the workPhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workPhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWorkPhone() {
            if (workPhone == null) {
                workPhone = new ArrayList<String>();
            }
            return this.workPhone;
        }

    }

}
