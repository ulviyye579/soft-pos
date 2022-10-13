
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}DeviceApp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Platform" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceModel" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OsName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OsVersion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Locale" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AdvertisingId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ScreenResolution" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileApp", propOrder = {
    "platform",
    "deviceModel",
    "deviceName",
    "osName",
    "osVersion",
    "locale",
    "advertisingId",
    "screenResolution",
    "latitude",
    "longitude"
})
public class MobileApp
    extends DeviceApp
{

    @XmlElement(name = "Platform")
    protected String platform;
    @XmlElement(name = "DeviceModel")
    protected String deviceModel;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "OsName")
    protected String osName;
    @XmlElement(name = "OsVersion")
    protected String osVersion;
    @XmlElement(name = "Locale")
    protected String locale;
    @XmlElement(name = "AdvertisingId")
    protected String advertisingId;
    @XmlElement(name = "ScreenResolution")
    protected String screenResolution;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModel(String value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the osName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsName() {
        return osName;
    }

    /**
     * Sets the value of the osName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsName(String value) {
        this.osName = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the advertisingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisingId() {
        return advertisingId;
    }

    /**
     * Sets the value of the advertisingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisingId(String value) {
        this.advertisingId = value;
    }

    /**
     * Gets the value of the screenResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * Sets the value of the screenResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenResolution(String value) {
        this.screenResolution = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
