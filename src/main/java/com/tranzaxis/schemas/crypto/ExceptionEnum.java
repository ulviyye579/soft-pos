
package com.tranzaxis.schemas.crypto;

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
 *     &lt;enumeration value="FormatError"/&gt;
 *     &lt;enumeration value="KeyNotFound"/&gt;
 *     &lt;enumeration value="KeyError"/&gt;
 *     &lt;enumeration value="InvalidRequest"/&gt;
 *     &lt;enumeration value="ServerException"/&gt;
 *     &lt;enumeration value="ApplicationError"/&gt;
 *     &lt;enumeration value="HardwareError"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionEnum")
@XmlEnum
public enum ExceptionEnum {

    @XmlEnumValue("FormatError")
    FORMAT_ERROR("FormatError"),
    @XmlEnumValue("KeyNotFound")
    KEY_NOT_FOUND("KeyNotFound"),
    @XmlEnumValue("KeyError")
    KEY_ERROR("KeyError"),
    @XmlEnumValue("InvalidRequest")
    INVALID_REQUEST("InvalidRequest"),
    @XmlEnumValue("ServerException")
    SERVER_EXCEPTION("ServerException"),
    @XmlEnumValue("ApplicationError")
    APPLICATION_ERROR("ApplicationError"),
    @XmlEnumValue("HardwareError")
    HARDWARE_ERROR("HardwareError"),
    @XmlEnumValue("Error")
    ERROR("Error");
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
