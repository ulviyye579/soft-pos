
package com.tranzaxis.schemas.admin_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.admin_admin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _User_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "User");
    private final static QName _UserChiefName_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "ChiefName");
    private final static QName _UserAdminGroupName_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "AdminGroupName");
    private final static QName _UserPersonName_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "PersonName");
    private final static QName _UserPosition_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Position");
    private final static QName _UserWarrant_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Warrant");
    private final static QName _UserMobilePhone_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "MobilePhone");
    private final static QName _UserEmail_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Email");
    private final static QName _UserNotes_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Notes");
    private final static QName _UserAuthTypes_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "AuthTypes");
    private final static QName _UserPassword_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Password");
    private final static QName _UserPasswordHashHistory_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "PasswordHashHistory");
    private final static QName _UserDbTraceProfile_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "DbTraceProfile");
    private final static QName _UserInstId_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "InstId");
    private final static QName _UserInstName_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "InstName");
    private final static QName _UserBranchId_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "BranchId");
    private final static QName _UserPersonId_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "PersonId");
    private final static QName _UserLogonTimeScheduleId_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "LogonTimeScheduleId");
    private final static QName _UserWorkScheduleId_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "WorkScheduleId");
    private final static QName _UserSessionsLimit_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "SessionsLimit");
    private final static QName _UserPwdExpirationPeriod_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "PwdExpirationPeriod");
    private final static QName _UserUserGroups_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "UserGroups");
    private final static QName _UserStations_QNAME = new QName("http://schemas.tranzaxis.com/admin-admin.xsd", "Stations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.admin_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UserGroupName }
     * 
     */
    public UserGroupName createUserGroupName() {
        return new UserGroupName();
    }

    /**
     * Create an instance of {@link StationName }
     * 
     */
    public StationName createStationName() {
        return new StationName();
    }

    /**
     * Create an instance of {@link User.AuthTypes }
     * 
     */
    public User.AuthTypes createUserAuthTypes() {
        return new User.AuthTypes();
    }

    /**
     * Create an instance of {@link User.PasswordHashHistory }
     * 
     */
    public User.PasswordHashHistory createUserPasswordHashHistory() {
        return new User.PasswordHashHistory();
    }

    /**
     * Create an instance of {@link User.UserGroups }
     * 
     */
    public User.UserGroups createUserUserGroups() {
        return new User.UserGroups();
    }

    /**
     * Create an instance of {@link User.Stations }
     * 
     */
    public User.Stations createUserStations() {
        return new User.Stations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "ChiefName", scope = User.class)
    public JAXBElement<String> createUserChiefName(String value) {
        return new JAXBElement<String>(_UserChiefName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "AdminGroupName", scope = User.class)
    public JAXBElement<String> createUserAdminGroupName(String value) {
        return new JAXBElement<String>(_UserAdminGroupName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "PersonName", scope = User.class)
    public JAXBElement<String> createUserPersonName(String value) {
        return new JAXBElement<String>(_UserPersonName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Position", scope = User.class)
    public JAXBElement<String> createUserPosition(String value) {
        return new JAXBElement<String>(_UserPosition_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Warrant", scope = User.class)
    public JAXBElement<String> createUserWarrant(String value) {
        return new JAXBElement<String>(_UserWarrant_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "MobilePhone", scope = User.class)
    public JAXBElement<String> createUserMobilePhone(String value) {
        return new JAXBElement<String>(_UserMobilePhone_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Email", scope = User.class)
    public JAXBElement<String> createUserEmail(String value) {
        return new JAXBElement<String>(_UserEmail_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Notes", scope = User.class)
    public JAXBElement<String> createUserNotes(String value) {
        return new JAXBElement<String>(_UserNotes_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User.AuthTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User.AuthTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "AuthTypes", scope = User.class)
    public JAXBElement<User.AuthTypes> createUserAuthTypes(User.AuthTypes value) {
        return new JAXBElement<User.AuthTypes>(_UserAuthTypes_QNAME, User.AuthTypes.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Password", scope = User.class)
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User.PasswordHashHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User.PasswordHashHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "PasswordHashHistory", scope = User.class)
    public JAXBElement<User.PasswordHashHistory> createUserPasswordHashHistory(User.PasswordHashHistory value) {
        return new JAXBElement<User.PasswordHashHistory>(_UserPasswordHashHistory_QNAME, User.PasswordHashHistory.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "DbTraceProfile", scope = User.class)
    public JAXBElement<String> createUserDbTraceProfile(String value) {
        return new JAXBElement<String>(_UserDbTraceProfile_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "InstId", scope = User.class)
    public JAXBElement<Long> createUserInstId(Long value) {
        return new JAXBElement<Long>(_UserInstId_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "InstName", scope = User.class)
    public JAXBElement<String> createUserInstName(String value) {
        return new JAXBElement<String>(_UserInstName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "BranchId", scope = User.class)
    public JAXBElement<Long> createUserBranchId(Long value) {
        return new JAXBElement<Long>(_UserBranchId_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "PersonId", scope = User.class)
    public JAXBElement<Long> createUserPersonId(Long value) {
        return new JAXBElement<Long>(_UserPersonId_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "LogonTimeScheduleId", scope = User.class)
    public JAXBElement<Long> createUserLogonTimeScheduleId(Long value) {
        return new JAXBElement<Long>(_UserLogonTimeScheduleId_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "WorkScheduleId", scope = User.class)
    public JAXBElement<Long> createUserWorkScheduleId(Long value) {
        return new JAXBElement<Long>(_UserWorkScheduleId_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "SessionsLimit", scope = User.class)
    public JAXBElement<Long> createUserSessionsLimit(Long value) {
        return new JAXBElement<Long>(_UserSessionsLimit_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "PwdExpirationPeriod", scope = User.class)
    public JAXBElement<Long> createUserPwdExpirationPeriod(Long value) {
        return new JAXBElement<Long>(_UserPwdExpirationPeriod_QNAME, Long.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User.UserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User.UserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "UserGroups", scope = User.class)
    public JAXBElement<User.UserGroups> createUserUserGroups(User.UserGroups value) {
        return new JAXBElement<User.UserGroups>(_UserUserGroups_QNAME, User.UserGroups.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User.Stations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User.Stations }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/admin-admin.xsd", name = "Stations", scope = User.class)
    public JAXBElement<User.Stations> createUserStations(User.Stations value) {
        return new JAXBElement<User.Stations>(_UserStations_QNAME, User.Stations.class, User.class, value);
    }

}
