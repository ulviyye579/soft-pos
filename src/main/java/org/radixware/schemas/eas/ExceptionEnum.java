
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ShouldChangePassword"/&gt;
 *     &lt;enumeration value="SessionDoesNotExist"/&gt;
 *     &lt;enumeration value="SessionsLimitExceed"/&gt;
 *     &lt;enumeration value="AccessViolation"/&gt;
 *     &lt;enumeration value="DefinitionAccessViolation"/&gt;
 *     &lt;enumeration value="InvalidUser"/&gt;
 *     &lt;enumeration value="InvalidStation"/&gt;
 *     &lt;enumeration value="InvalidCredentials"/&gt;
 *     &lt;enumeration value="NoCredentials"/&gt;
 *     &lt;enumeration value="WebDriverIsNotAllowed"/&gt;
 *     &lt;enumeration value="LogonTimeRestrictionViolation"/&gt;
 *     &lt;enumeration value="UserAccountLocked"/&gt;
 *     &lt;enumeration value="TemporaryPasswordExpired"/&gt;
 *     &lt;enumeration value="InvalidSorting"/&gt;
 *     &lt;enumeration value="InvalidPassword"/&gt;
 *     &lt;enumeration value="InvalidAuthType"/&gt;
 *     &lt;enumeration value="LdapAuthIsNotSupported"/&gt;
 *     &lt;enumeration value="InvalidCertificate"/&gt;
 *     &lt;enumeration value="InvalidChallenge"/&gt;
 *     &lt;enumeration value="RequestDurationLimitExceeded"/&gt;
 *     &lt;enumeration value="KerberosAuthenticationFailed"/&gt;
 *     &lt;enumeration value="LdapAuthenticationFailed"/&gt;
 *     &lt;enumeration value="RepeatativePassword"/&gt;
 *     &lt;enumeration value="ApplicationError"/&gt;
 *     &lt;enumeration value="ObjectNotFound"/&gt;
 *     &lt;enumeration value="DefinitionNotFound"/&gt;
 *     &lt;enumeration value="SubobjectsFound"/&gt;
 *     &lt;enumeration value="ConfirmSubobjectsDelete"/&gt;
 *     &lt;enumeration value="PropertyIsMandatory"/&gt;
 *     &lt;enumeration value="InvalidPropertyValue"/&gt;
 *     &lt;enumeration value="InvalidPlatformVersion"/&gt;
 *     &lt;enumeration value="InvalidDefinitionVersion"/&gt;
 *     &lt;enumeration value="UnsupportedDefinitionVersion"/&gt;
 *     &lt;enumeration value="FormatError"/&gt;
 *     &lt;enumeration value="InvalidRequest"/&gt;
 *     &lt;enumeration value="ServerMalfunction"/&gt;
 *     &lt;enumeration value="ColorSchemeNotFound"/&gt;
 *     &lt;enumeration value="SortingNotFound"/&gt;
 *     &lt;enumeration value="FilterNotFound"/&gt;
 *     &lt;enumeration value="FilterIsObligatory"/&gt;
 *     &lt;enumeration value="FilterIsObsolete"/&gt;
 *     &lt;enumeration value="ServerException"/&gt;
 *     &lt;enumeration value="MissingFilterParam"/&gt;
 *     &lt;enumeration value="UniqueConstraintViolation"/&gt;
 *     &lt;enumeration value="SecondAuthFactorMessageError"/&gt;
 *     &lt;enumeration value="SecondAuthFactorExpired"/&gt;
 *     &lt;enumeration value="InvalidSecondAuthFactor"/&gt;
 *     &lt;enumeration value="TooManyIncompleteAuthAttempts"/&gt;
 *     &lt;enumeration value="TooFastResendSecondAuthFactor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionEnum")
@XmlEnum
public enum ExceptionEnum {

    @XmlEnumValue("ShouldChangePassword")
    SHOULD_CHANGE_PASSWORD("ShouldChangePassword"),
    @XmlEnumValue("SessionDoesNotExist")
    SESSION_DOES_NOT_EXIST("SessionDoesNotExist"),
    @XmlEnumValue("SessionsLimitExceed")
    SESSIONS_LIMIT_EXCEED("SessionsLimitExceed"),
    @XmlEnumValue("AccessViolation")
    ACCESS_VIOLATION("AccessViolation"),
    @XmlEnumValue("DefinitionAccessViolation")
    DEFINITION_ACCESS_VIOLATION("DefinitionAccessViolation"),
    @XmlEnumValue("InvalidUser")
    INVALID_USER("InvalidUser"),
    @XmlEnumValue("InvalidStation")
    INVALID_STATION("InvalidStation"),
    @XmlEnumValue("InvalidCredentials")
    INVALID_CREDENTIALS("InvalidCredentials"),
    @XmlEnumValue("NoCredentials")
    NO_CREDENTIALS("NoCredentials"),
    @XmlEnumValue("WebDriverIsNotAllowed")
    WEB_DRIVER_IS_NOT_ALLOWED("WebDriverIsNotAllowed"),
    @XmlEnumValue("LogonTimeRestrictionViolation")
    LOGON_TIME_RESTRICTION_VIOLATION("LogonTimeRestrictionViolation"),
    @XmlEnumValue("UserAccountLocked")
    USER_ACCOUNT_LOCKED("UserAccountLocked"),
    @XmlEnumValue("TemporaryPasswordExpired")
    TEMPORARY_PASSWORD_EXPIRED("TemporaryPasswordExpired"),
    @XmlEnumValue("InvalidSorting")
    INVALID_SORTING("InvalidSorting"),
    @XmlEnumValue("InvalidPassword")
    INVALID_PASSWORD("InvalidPassword"),
    @XmlEnumValue("InvalidAuthType")
    INVALID_AUTH_TYPE("InvalidAuthType"),
    @XmlEnumValue("LdapAuthIsNotSupported")
    LDAP_AUTH_IS_NOT_SUPPORTED("LdapAuthIsNotSupported"),
    @XmlEnumValue("InvalidCertificate")
    INVALID_CERTIFICATE("InvalidCertificate"),
    @XmlEnumValue("InvalidChallenge")
    INVALID_CHALLENGE("InvalidChallenge"),
    @XmlEnumValue("RequestDurationLimitExceeded")
    REQUEST_DURATION_LIMIT_EXCEEDED("RequestDurationLimitExceeded"),
    @XmlEnumValue("KerberosAuthenticationFailed")
    KERBEROS_AUTHENTICATION_FAILED("KerberosAuthenticationFailed"),
    @XmlEnumValue("LdapAuthenticationFailed")
    LDAP_AUTHENTICATION_FAILED("LdapAuthenticationFailed"),
    @XmlEnumValue("RepeatativePassword")
    REPEATATIVE_PASSWORD("RepeatativePassword"),
    @XmlEnumValue("ApplicationError")
    APPLICATION_ERROR("ApplicationError"),
    @XmlEnumValue("ObjectNotFound")
    OBJECT_NOT_FOUND("ObjectNotFound"),
    @XmlEnumValue("DefinitionNotFound")
    DEFINITION_NOT_FOUND("DefinitionNotFound"),
    @XmlEnumValue("SubobjectsFound")
    SUBOBJECTS_FOUND("SubobjectsFound"),
    @XmlEnumValue("ConfirmSubobjectsDelete")
    CONFIRM_SUBOBJECTS_DELETE("ConfirmSubobjectsDelete"),
    @XmlEnumValue("PropertyIsMandatory")
    PROPERTY_IS_MANDATORY("PropertyIsMandatory"),
    @XmlEnumValue("InvalidPropertyValue")
    INVALID_PROPERTY_VALUE("InvalidPropertyValue"),
    @XmlEnumValue("InvalidPlatformVersion")
    INVALID_PLATFORM_VERSION("InvalidPlatformVersion"),
    @XmlEnumValue("InvalidDefinitionVersion")
    INVALID_DEFINITION_VERSION("InvalidDefinitionVersion"),
    @XmlEnumValue("UnsupportedDefinitionVersion")
    UNSUPPORTED_DEFINITION_VERSION("UnsupportedDefinitionVersion"),
    @XmlEnumValue("FormatError")
    FORMAT_ERROR("FormatError"),
    @XmlEnumValue("InvalidRequest")
    INVALID_REQUEST("InvalidRequest"),
    @XmlEnumValue("ServerMalfunction")
    SERVER_MALFUNCTION("ServerMalfunction"),
    @XmlEnumValue("ColorSchemeNotFound")
    COLOR_SCHEME_NOT_FOUND("ColorSchemeNotFound"),
    @XmlEnumValue("SortingNotFound")
    SORTING_NOT_FOUND("SortingNotFound"),
    @XmlEnumValue("FilterNotFound")
    FILTER_NOT_FOUND("FilterNotFound"),
    @XmlEnumValue("FilterIsObligatory")
    FILTER_IS_OBLIGATORY("FilterIsObligatory"),
    @XmlEnumValue("FilterIsObsolete")
    FILTER_IS_OBSOLETE("FilterIsObsolete"),
    @XmlEnumValue("ServerException")
    SERVER_EXCEPTION("ServerException"),
    @XmlEnumValue("MissingFilterParam")
    MISSING_FILTER_PARAM("MissingFilterParam"),
    @XmlEnumValue("UniqueConstraintViolation")
    UNIQUE_CONSTRAINT_VIOLATION("UniqueConstraintViolation"),
    @XmlEnumValue("SecondAuthFactorMessageError")
    SECOND_AUTH_FACTOR_MESSAGE_ERROR("SecondAuthFactorMessageError"),
    @XmlEnumValue("SecondAuthFactorExpired")
    SECOND_AUTH_FACTOR_EXPIRED("SecondAuthFactorExpired"),
    @XmlEnumValue("InvalidSecondAuthFactor")
    INVALID_SECOND_AUTH_FACTOR("InvalidSecondAuthFactor"),
    @XmlEnumValue("TooManyIncompleteAuthAttempts")
    TOO_MANY_INCOMPLETE_AUTH_ATTEMPTS("TooManyIncompleteAuthAttempts"),
    @XmlEnumValue("TooFastResendSecondAuthFactor")
    TOO_FAST_RESEND_SECOND_AUTH_FACTOR("TooFastResendSecondAuthFactor");
    private final String value;

    ExceptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionEnum fromValue(String v) {
        for (ExceptionEnum c: ExceptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
