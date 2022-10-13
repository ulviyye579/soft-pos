
package com.tranzaxis.schemas.admin_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ListModifyMode;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="ChiefName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AdminGroupName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Warrant" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AuthTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AuthType" type="{http://schemas.tranzaxis.com/admin-admin.xsd}AuthType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Password" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PasswordHashAlgo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PasswordHashHistory" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PasswordHash" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DbTraceProfile" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PersonId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PersonRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LogonTimeScheduleId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LogonTimeScheduleGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WorkScheduleId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="WorkScheduleGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SessionsLimit" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PwdExpirationPeriod" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="UserGroups" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://schemas.tranzaxis.com/admin-admin.xsd}UserGroupName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Stations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://schemas.tranzaxis.com/admin-admin.xsd}StationName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CheckStation" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="LockReason" type="{http://schemas.tranzaxis.com/admin-admin.xsd}AccountLockReason" /&gt;
 *       &lt;attribute name="Locked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MustChangePwd" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="TraceGuiActions" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="TraceLogOut" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "name",
    "chiefName",
    "adminGroupName",
    "personName",
    "position",
    "warrant",
    "mobilePhone",
    "email",
    "notes",
    "authTypes",
    "password",
    "passwordHashAlgo",
    "passwordHashHistory",
    "dbTraceProfile",
    "instId",
    "instName",
    "branchId",
    "branchName",
    "branchCode",
    "personId",
    "personRid",
    "logonTimeScheduleId",
    "logonTimeScheduleGuid",
    "workScheduleId",
    "workScheduleGuid",
    "sessionsLimit",
    "pwdExpirationPeriod",
    "userGroups",
    "stations"
})
public class User {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "ChiefName", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chiefName;
    @XmlElementRef(name = "AdminGroupName", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminGroupName;
    @XmlElementRef(name = "PersonName", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personName;
    @XmlElementRef(name = "Position", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> position;
    @XmlElementRef(name = "Warrant", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrant;
    @XmlElementRef(name = "MobilePhone", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "Email", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "AuthTypes", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<User.AuthTypes> authTypes;
    @XmlElementRef(name = "Password", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElement(name = "PasswordHashAlgo", defaultValue = "SHA-256")
    protected String passwordHashAlgo;
    @XmlElementRef(name = "PasswordHashHistory", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<User.PasswordHashHistory> passwordHashHistory;
    @XmlElementRef(name = "DbTraceProfile", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dbTraceProfile;
    @XmlElementRef(name = "InstId", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> instId;
    @XmlElementRef(name = "InstName", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instName;
    @XmlElementRef(name = "BranchId", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> branchId;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "BranchCode")
    protected Long branchCode;
    @XmlElementRef(name = "PersonId", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> personId;
    @XmlElement(name = "PersonRid")
    protected String personRid;
    @XmlElementRef(name = "LogonTimeScheduleId", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> logonTimeScheduleId;
    @XmlElement(name = "LogonTimeScheduleGuid")
    protected String logonTimeScheduleGuid;
    @XmlElementRef(name = "WorkScheduleId", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workScheduleId;
    @XmlElement(name = "WorkScheduleGuid")
    protected String workScheduleGuid;
    @XmlElementRef(name = "SessionsLimit", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sessionsLimit;
    @XmlElementRef(name = "PwdExpirationPeriod", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pwdExpirationPeriod;
    @XmlElementRef(name = "UserGroups", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<User.UserGroups> userGroups;
    @XmlElementRef(name = "Stations", namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<User.Stations> stations;
    @XmlAttribute(name = "CheckStation")
    protected Boolean checkStation;
    @XmlAttribute(name = "LockReason")
    protected Long lockReason;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "MustChangePwd")
    protected Boolean mustChangePwd;
    @XmlAttribute(name = "TraceGuiActions")
    protected Boolean traceGuiActions;
    @XmlAttribute(name = "TraceLogOut")
    protected Boolean traceLogOut;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the chiefName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChiefName() {
        return chiefName;
    }

    /**
     * Sets the value of the chiefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChiefName(JAXBElement<String> value) {
        this.chiefName = value;
    }

    /**
     * Gets the value of the adminGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminGroupName() {
        return adminGroupName;
    }

    /**
     * Sets the value of the adminGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminGroupName(JAXBElement<String> value) {
        this.adminGroupName = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<String> value) {
        this.personName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosition(JAXBElement<String> value) {
        this.position = value;
    }

    /**
     * Gets the value of the warrant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrant() {
        return warrant;
    }

    /**
     * Sets the value of the warrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrant(JAXBElement<String> value) {
        this.warrant = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
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
     * Gets the value of the authTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User.AuthTypes }{@code >}
     *     
     */
    public JAXBElement<User.AuthTypes> getAuthTypes() {
        return authTypes;
    }

    /**
     * Sets the value of the authTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User.AuthTypes }{@code >}
     *     
     */
    public void setAuthTypes(JAXBElement<User.AuthTypes> value) {
        this.authTypes = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordHashAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordHashAlgo() {
        return passwordHashAlgo;
    }

    /**
     * Sets the value of the passwordHashAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordHashAlgo(String value) {
        this.passwordHashAlgo = value;
    }

    /**
     * Gets the value of the passwordHashHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User.PasswordHashHistory }{@code >}
     *     
     */
    public JAXBElement<User.PasswordHashHistory> getPasswordHashHistory() {
        return passwordHashHistory;
    }

    /**
     * Sets the value of the passwordHashHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User.PasswordHashHistory }{@code >}
     *     
     */
    public void setPasswordHashHistory(JAXBElement<User.PasswordHashHistory> value) {
        this.passwordHashHistory = value;
    }

    /**
     * Gets the value of the dbTraceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDbTraceProfile() {
        return dbTraceProfile;
    }

    /**
     * Sets the value of the dbTraceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDbTraceProfile(JAXBElement<String> value) {
        this.dbTraceProfile = value;
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
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchCode(Long value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPersonId(JAXBElement<Long> value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRid() {
        return personRid;
    }

    /**
     * Sets the value of the personRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRid(String value) {
        this.personRid = value;
    }

    /**
     * Gets the value of the logonTimeScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLogonTimeScheduleId() {
        return logonTimeScheduleId;
    }

    /**
     * Sets the value of the logonTimeScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLogonTimeScheduleId(JAXBElement<Long> value) {
        this.logonTimeScheduleId = value;
    }

    /**
     * Gets the value of the logonTimeScheduleGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogonTimeScheduleGuid() {
        return logonTimeScheduleGuid;
    }

    /**
     * Sets the value of the logonTimeScheduleGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogonTimeScheduleGuid(String value) {
        this.logonTimeScheduleGuid = value;
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
     * Gets the value of the workScheduleGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkScheduleGuid() {
        return workScheduleGuid;
    }

    /**
     * Sets the value of the workScheduleGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkScheduleGuid(String value) {
        this.workScheduleGuid = value;
    }

    /**
     * Gets the value of the sessionsLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSessionsLimit() {
        return sessionsLimit;
    }

    /**
     * Sets the value of the sessionsLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSessionsLimit(JAXBElement<Long> value) {
        this.sessionsLimit = value;
    }

    /**
     * Gets the value of the pwdExpirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPwdExpirationPeriod() {
        return pwdExpirationPeriod;
    }

    /**
     * Sets the value of the pwdExpirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPwdExpirationPeriod(JAXBElement<Long> value) {
        this.pwdExpirationPeriod = value;
    }

    /**
     * Gets the value of the userGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User.UserGroups }{@code >}
     *     
     */
    public JAXBElement<User.UserGroups> getUserGroups() {
        return userGroups;
    }

    /**
     * Sets the value of the userGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User.UserGroups }{@code >}
     *     
     */
    public void setUserGroups(JAXBElement<User.UserGroups> value) {
        this.userGroups = value;
    }

    /**
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User.Stations }{@code >}
     *     
     */
    public JAXBElement<User.Stations> getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User.Stations }{@code >}
     *     
     */
    public void setStations(JAXBElement<User.Stations> value) {
        this.stations = value;
    }

    /**
     * Gets the value of the checkStation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckStation() {
        return checkStation;
    }

    /**
     * Sets the value of the checkStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckStation(Boolean value) {
        this.checkStation = value;
    }

    /**
     * Gets the value of the lockReason property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockReason() {
        return lockReason;
    }

    /**
     * Sets the value of the lockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockReason(Long value) {
        this.lockReason = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the mustChangePwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustChangePwd() {
        return mustChangePwd;
    }

    /**
     * Sets the value of the mustChangePwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustChangePwd(Boolean value) {
        this.mustChangePwd = value;
    }

    /**
     * Gets the value of the traceGuiActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceGuiActions() {
        return traceGuiActions;
    }

    /**
     * Sets the value of the traceGuiActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceGuiActions(Boolean value) {
        this.traceGuiActions = value;
    }

    /**
     * Gets the value of the traceLogOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceLogOut() {
        return traceLogOut;
    }

    /**
     * Sets the value of the traceLogOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceLogOut(Boolean value) {
        this.traceLogOut = value;
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
     *         &lt;element name="AuthType" type="{http://schemas.tranzaxis.com/admin-admin.xsd}AuthType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "authType"
    })
    public static class AuthTypes {

        @XmlElement(name = "AuthType")
        protected List<String> authType;

        /**
         * Gets the value of the authType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAuthType() {
            if (authType == null) {
                authType = new ArrayList<String>();
            }
            return this.authType;
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
     *         &lt;element name="PasswordHash" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "passwordHash"
    })
    public static class PasswordHashHistory {

        @XmlElement(name = "PasswordHash")
        protected List<String> passwordHash;

        /**
         * Gets the value of the passwordHash property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passwordHash property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPasswordHash().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPasswordHash() {
            if (passwordHash == null) {
                passwordHash = new ArrayList<String>();
            }
            return this.passwordHash;
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
     *         &lt;element name="Name" type="{http://schemas.tranzaxis.com/admin-admin.xsd}StationName" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Stations {

        @XmlElement(name = "Name")
        protected List<StationName> name;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StationName }
         * 
         * 
         */
        public List<StationName> getName() {
            if (name == null) {
                name = new ArrayList<StationName>();
            }
            return this.name;
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
            if (mode == null) {
                return ListModifyMode.SYNC;
            } else {
                return mode;
            }
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
     *         &lt;element name="Name" type="{http://schemas.tranzaxis.com/admin-admin.xsd}UserGroupName" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class UserGroups {

        @XmlElement(name = "Name")
        protected List<UserGroupName> name;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserGroupName }
         * 
         * 
         */
        public List<UserGroupName> getName() {
            if (name == null) {
                name = new ArrayList<UserGroupName>();
            }
            return this.name;
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
            if (mode == null) {
                return ListModifyMode.SYNC;
            } else {
                return mode;
            }
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
