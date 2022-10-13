
package com.tranzaxis.schemas.common_types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RegionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RegionTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AreaRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AreaTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CityRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AdminCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentCityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StreetRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="House" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Building" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Construction" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Flat" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AddressInCountry" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientInCareOf" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientFirstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientLastName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RecipientLang" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Longitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Latitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="IsInherited" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailAddress")
@XmlSeeAlso({
    HomeAddress.class
})
public class MailAddress {

    @XmlAttribute(name = "CountryId")
    protected Long countryId;
    @XmlAttribute(name = "RegionRid")
    protected String regionRid;
    @XmlAttribute(name = "RegionTitle")
    protected String regionTitle;
    @XmlAttribute(name = "AreaRid")
    protected String areaRid;
    @XmlAttribute(name = "AreaTitle")
    protected String areaTitle;
    @XmlAttribute(name = "CityRid")
    protected String cityRid;
    @XmlAttribute(name = "CityTitle")
    protected String cityTitle;
    @XmlAttribute(name = "AdminCode")
    protected String adminCode;
    @XmlAttribute(name = "ParentCityTitle")
    protected String parentCityTitle;
    @XmlAttribute(name = "StreetRid")
    protected String streetRid;
    @XmlAttribute(name = "StreetTitle")
    protected String streetTitle;
    @XmlAttribute(name = "Zip")
    protected String zip;
    @XmlAttribute(name = "House")
    protected String house;
    @XmlAttribute(name = "Building")
    protected String building;
    @XmlAttribute(name = "Construction")
    protected String construction;
    @XmlAttribute(name = "Flat")
    protected String flat;
    @XmlAttribute(name = "AddressInCity")
    protected String addressInCity;
    @XmlAttribute(name = "AddressInCountry")
    protected String addressInCountry;
    @XmlAttribute(name = "RecipientName")
    protected String recipientName;
    @XmlAttribute(name = "RecipientInCareOf")
    protected String recipientInCareOf;
    @XmlAttribute(name = "RecipientTitle")
    protected String recipientTitle;
    @XmlAttribute(name = "RecipientFirstName")
    protected String recipientFirstName;
    @XmlAttribute(name = "RecipientMiddleName")
    protected String recipientMiddleName;
    @XmlAttribute(name = "RecipientLastName")
    protected String recipientLastName;
    @XmlAttribute(name = "RecipientLang")
    protected String recipientLang;
    @XmlAttribute(name = "Longitude")
    protected BigDecimal longitude;
    @XmlAttribute(name = "Latitude")
    protected BigDecimal latitude;
    @XmlAttribute(name = "IsInherited")
    protected Boolean isInherited;

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the regionRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionRid() {
        return regionRid;
    }

    /**
     * Sets the value of the regionRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionRid(String value) {
        this.regionRid = value;
    }

    /**
     * Gets the value of the regionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionTitle() {
        return regionTitle;
    }

    /**
     * Sets the value of the regionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionTitle(String value) {
        this.regionTitle = value;
    }

    /**
     * Gets the value of the areaRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaRid() {
        return areaRid;
    }

    /**
     * Sets the value of the areaRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaRid(String value) {
        this.areaRid = value;
    }

    /**
     * Gets the value of the areaTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTitle() {
        return areaTitle;
    }

    /**
     * Sets the value of the areaTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTitle(String value) {
        this.areaTitle = value;
    }

    /**
     * Gets the value of the cityRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityRid() {
        return cityRid;
    }

    /**
     * Sets the value of the cityRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityRid(String value) {
        this.cityRid = value;
    }

    /**
     * Gets the value of the cityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTitle() {
        return cityTitle;
    }

    /**
     * Sets the value of the cityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTitle(String value) {
        this.cityTitle = value;
    }

    /**
     * Gets the value of the adminCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * Sets the value of the adminCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminCode(String value) {
        this.adminCode = value;
    }

    /**
     * Gets the value of the parentCityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCityTitle() {
        return parentCityTitle;
    }

    /**
     * Sets the value of the parentCityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCityTitle(String value) {
        this.parentCityTitle = value;
    }

    /**
     * Gets the value of the streetRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetRid() {
        return streetRid;
    }

    /**
     * Sets the value of the streetRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetRid(String value) {
        this.streetRid = value;
    }

    /**
     * Gets the value of the streetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTitle() {
        return streetTitle;
    }

    /**
     * Sets the value of the streetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTitle(String value) {
        this.streetTitle = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstruction(String value) {
        this.construction = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

    /**
     * Gets the value of the addressInCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInCity() {
        return addressInCity;
    }

    /**
     * Sets the value of the addressInCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInCity(String value) {
        this.addressInCity = value;
    }

    /**
     * Gets the value of the addressInCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInCountry() {
        return addressInCountry;
    }

    /**
     * Sets the value of the addressInCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInCountry(String value) {
        this.addressInCountry = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientInCareOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientInCareOf() {
        return recipientInCareOf;
    }

    /**
     * Sets the value of the recipientInCareOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientInCareOf(String value) {
        this.recipientInCareOf = value;
    }

    /**
     * Gets the value of the recipientTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTitle() {
        return recipientTitle;
    }

    /**
     * Sets the value of the recipientTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTitle(String value) {
        this.recipientTitle = value;
    }

    /**
     * Gets the value of the recipientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    /**
     * Sets the value of the recipientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientFirstName(String value) {
        this.recipientFirstName = value;
    }

    /**
     * Gets the value of the recipientMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientMiddleName() {
        return recipientMiddleName;
    }

    /**
     * Sets the value of the recipientMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientMiddleName(String value) {
        this.recipientMiddleName = value;
    }

    /**
     * Gets the value of the recipientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientLastName() {
        return recipientLastName;
    }

    /**
     * Sets the value of the recipientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientLastName(String value) {
        this.recipientLastName = value;
    }

    /**
     * Gets the value of the recipientLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientLang() {
        return recipientLang;
    }

    /**
     * Sets the value of the recipientLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientLang(String value) {
        this.recipientLang = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the isInherited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInherited() {
        return isInherited;
    }

    /**
     * Sets the value of the isInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInherited(Boolean value) {
        this.isInherited = value;
    }

}
