
package com.tranzaxis.schemas.tran;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.tokens_alias.TokenAlias;


/**
 * <p>Java class for TokenAliasAuthData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenAliasAuthData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ConsentTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Owner" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CountryId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="LastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="MiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="City" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Address" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="FirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="InstTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="CardBrandTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="LastNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="MiddleNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="FirstNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Mobile" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "TokenAliasAuthData", propOrder = {
    "inUse",
    "consentTime",
    "owner"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.UpdateTokenAuthData.Alias.class
})
public class TokenAliasAuthData
    extends TokenAlias
{

    @XmlElementRef(name = "InUse", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> inUse;
    @XmlElementRef(name = "ConsentTime", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> consentTime;
    @XmlElement(name = "Owner")
    protected TokenAliasAuthData.Owner owner;

    /**
     * Gets the value of the inUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInUse(JAXBElement<Boolean> value) {
        this.inUse = value;
    }

    /**
     * Gets the value of the consentTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConsentTime() {
        return consentTime;
    }

    /**
     * Sets the value of the consentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConsentTime(JAXBElement<XMLGregorianCalendar> value) {
        this.consentTime = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link TokenAliasAuthData.Owner }
     *     
     */
    public TokenAliasAuthData.Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenAliasAuthData.Owner }
     *     
     */
    public void setOwner(TokenAliasAuthData.Owner value) {
        this.owner = value;
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
     *         &lt;element name="CountryId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="LastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="MiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="City" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Address" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="FirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="InstTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="CardBrandTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="LastNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="MiddleNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="FirstNameLocal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Mobile" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "countryId",
        "lastName",
        "middleName",
        "city",
        "address",
        "email",
        "firstName",
        "instTitle",
        "zip",
        "cardBrandTitle",
        "lastNameLocal",
        "middleNameLocal",
        "firstNameLocal",
        "mobile"
    })
    public static class Owner {

        @XmlElementRef(name = "CountryId", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> countryId;
        @XmlElementRef(name = "LastName", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> lastName;
        @XmlElementRef(name = "MiddleName", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> middleName;
        @XmlElementRef(name = "City", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> city;
        @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> address;
        @XmlElementRef(name = "Email", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> email;
        @XmlElementRef(name = "FirstName", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> firstName;
        @XmlElementRef(name = "InstTitle", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> instTitle;
        @XmlElementRef(name = "Zip", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> zip;
        @XmlElementRef(name = "CardBrandTitle", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> cardBrandTitle;
        @XmlElementRef(name = "LastNameLocal", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> lastNameLocal;
        @XmlElementRef(name = "MiddleNameLocal", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> middleNameLocal;
        @XmlElementRef(name = "FirstNameLocal", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> firstNameLocal;
        @XmlElementRef(name = "Mobile", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> mobile;

        /**
         * Gets the value of the countryId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCountryId() {
            return countryId;
        }

        /**
         * Sets the value of the countryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCountryId(JAXBElement<Long> value) {
            this.countryId = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLastName(JAXBElement<String> value) {
            this.lastName = value;
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
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCity(JAXBElement<String> value) {
            this.city = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAddress(JAXBElement<String> value) {
            this.address = value;
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
         * Gets the value of the instTitle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getInstTitle() {
            return instTitle;
        }

        /**
         * Sets the value of the instTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setInstTitle(JAXBElement<String> value) {
            this.instTitle = value;
        }

        /**
         * Gets the value of the zip property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getZip() {
            return zip;
        }

        /**
         * Sets the value of the zip property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setZip(JAXBElement<String> value) {
            this.zip = value;
        }

        /**
         * Gets the value of the cardBrandTitle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCardBrandTitle() {
            return cardBrandTitle;
        }

        /**
         * Sets the value of the cardBrandTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCardBrandTitle(JAXBElement<String> value) {
            this.cardBrandTitle = value;
        }

        /**
         * Gets the value of the lastNameLocal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLastNameLocal() {
            return lastNameLocal;
        }

        /**
         * Sets the value of the lastNameLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLastNameLocal(JAXBElement<String> value) {
            this.lastNameLocal = value;
        }

        /**
         * Gets the value of the middleNameLocal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMiddleNameLocal() {
            return middleNameLocal;
        }

        /**
         * Sets the value of the middleNameLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMiddleNameLocal(JAXBElement<String> value) {
            this.middleNameLocal = value;
        }

        /**
         * Gets the value of the firstNameLocal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFirstNameLocal() {
            return firstNameLocal;
        }

        /**
         * Sets the value of the firstNameLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFirstNameLocal(JAXBElement<String> value) {
            this.firstNameLocal = value;
        }

        /**
         * Gets the value of the mobile property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMobile() {
            return mobile;
        }

        /**
         * Sets the value of the mobile property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMobile(JAXBElement<String> value) {
            this.mobile = value;
        }

    }

}
