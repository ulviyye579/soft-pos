
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents" type="{http://schemas.tranzaxis.com/tran-common.xsd}Documents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FirstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MiddleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LastName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MaskedName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="DayOfBirth" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="IdInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Country" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Region" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="City" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Address" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo", propOrder = {
    "documents"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran_common.TokenSpecificRs.Person.class
})
public class PersonInfo {

    @XmlElement(name = "Documents")
    protected Documents documents;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "MiddleName")
    protected String middleName;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "MaskedName")
    protected String maskedName;
    @XmlAttribute(name = "DayOfBirth")
    protected XMLGregorianCalendar dayOfBirth;
    @XmlAttribute(name = "IdInfo")
    protected String idInfo;
    @XmlAttribute(name = "Country")
    protected Long country;
    @XmlAttribute(name = "Region")
    protected String region;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "Zip")
    protected String zip;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "Phone")
    protected String phone;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link Documents }
     *     
     */
    public Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documents }
     *     
     */
    public void setDocuments(Documents value) {
        this.documents = value;
    }

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

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
     * Gets the value of the maskedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedName() {
        return maskedName;
    }

    /**
     * Sets the value of the maskedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedName(String value) {
        this.maskedName = value;
    }

    /**
     * Gets the value of the dayOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfBirth() {
        return dayOfBirth;
    }

    /**
     * Sets the value of the dayOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfBirth(XMLGregorianCalendar value) {
        this.dayOfBirth = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInfo() {
        return idInfo;
    }

    /**
     * Sets the value of the idInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInfo(String value) {
        this.idInfo = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountry(Long value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
