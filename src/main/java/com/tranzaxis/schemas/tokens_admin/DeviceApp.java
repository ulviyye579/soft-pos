
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uri" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AuthPeriodStart" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="InvalidAuthAttemptsCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceApp", propOrder = {
    "uri",
    "userGuid",
    "authPeriodStart",
    "invalidAuthAttemptsCnt",
    "timeZone",
    "ipAddress"
})
@XmlSeeAlso({
    MobileApp.class,
    WebApp.class
})
public class DeviceApp
    extends Base
{

    @XmlElement(name = "Uri")
    protected String uri;
    @XmlElement(name = "UserGuid")
    protected String userGuid;
    @XmlElementRef(name = "AuthPeriodStart", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> authPeriodStart;
    @XmlElementRef(name = "InvalidAuthAttemptsCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidAuthAttemptsCnt;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the userGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * Sets the value of the userGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuid(String value) {
        this.userGuid = value;
    }

    /**
     * Gets the value of the authPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAuthPeriodStart() {
        return authPeriodStart;
    }

    /**
     * Sets the value of the authPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAuthPeriodStart(JAXBElement<XMLGregorianCalendar> value) {
        this.authPeriodStart = value;
    }

    /**
     * Gets the value of the invalidAuthAttemptsCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidAuthAttemptsCnt() {
        return invalidAuthAttemptsCnt;
    }

    /**
     * Sets the value of the invalidAuthAttemptsCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidAuthAttemptsCnt(JAXBElement<Long> value) {
        this.invalidAuthAttemptsCnt = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

}
