
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ContactAddress;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.MailAddress;


/**
 * <p>Java class for UpdateClientInfoSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateClientInfoSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SstPreferencies" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MailAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="RegAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="HomeAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="HomeAddress2" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
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
 *         &lt;element name="TwitterScreenName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ContractTitles" type="{http://schemas.tranzaxis.com/tran-common.xsd}ObjTitles" minOccurs="0"/&gt;
 *         &lt;element name="ContractInLinkTitles" type="{http://schemas.tranzaxis.com/tran-common.xsd}ObjTitles" minOccurs="0"/&gt;
 *         &lt;element name="ContractOutLinkTitles" type="{http://schemas.tranzaxis.com/tran-common.xsd}ObjTitles" minOccurs="0"/&gt;
 *         &lt;element name="TokenTitles" type="{http://schemas.tranzaxis.com/tran-common.xsd}ObjTitles" minOccurs="0"/&gt;
 *         &lt;element name="DigitizedCardTitles" type="{http://schemas.tranzaxis.com/tran-common.xsd}ObjTitles" minOccurs="0"/&gt;
 *         &lt;element name="HasExtAuthApp" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="PersonAuthQAs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClientInfoSpecific", propOrder = {
    "sstPreferencies",
    "mailAddress",
    "regAddress",
    "homeAddress",
    "homeAddress2",
    "emails",
    "mobilePhones",
    "twitterScreenName",
    "contractTitles",
    "contractInLinkTitles",
    "contractOutLinkTitles",
    "tokenTitles",
    "digitizedCardTitles",
    "hasExtAuthApp",
    "personAuthQAs"
})
public class UpdateClientInfoSpecific {

    @XmlElementRef(name = "SstPreferencies", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> sstPreferencies;
    @XmlElementRef(name = "MailAddress", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> mailAddress;
    @XmlElementRef(name = "RegAddress", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> regAddress;
    @XmlElementRef(name = "HomeAddress", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> homeAddress;
    @XmlElementRef(name = "HomeAddress2", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> homeAddress2;
    @XmlElementRef(name = "Emails", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateClientInfoSpecific.Emails> emails;
    @XmlElementRef(name = "MobilePhones", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateClientInfoSpecific.MobilePhones> mobilePhones;
    @XmlElement(name = "TwitterScreenName")
    protected String twitterScreenName;
    @XmlElement(name = "ContractTitles")
    protected ObjTitles contractTitles;
    @XmlElement(name = "ContractInLinkTitles")
    protected ObjTitles contractInLinkTitles;
    @XmlElement(name = "ContractOutLinkTitles")
    protected ObjTitles contractOutLinkTitles;
    @XmlElement(name = "TokenTitles")
    protected ObjTitles tokenTitles;
    @XmlElement(name = "DigitizedCardTitles")
    protected ObjTitles digitizedCardTitles;
    @XmlElement(name = "HasExtAuthApp")
    protected Boolean hasExtAuthApp;
    @XmlElementRef(name = "PersonAuthQAs", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateClientInfoSpecific.PersonAuthQAs> personAuthQAs;

    /**
     * Gets the value of the sstPreferencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getSstPreferencies() {
        return sstPreferencies;
    }

    /**
     * Sets the value of the sstPreferencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setSstPreferencies(JAXBElement<Object> value) {
        this.sstPreferencies = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setMailAddress(JAXBElement<MailAddress> value) {
        this.mailAddress = value;
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
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.Emails }{@code >}
     *     
     */
    public JAXBElement<UpdateClientInfoSpecific.Emails> getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.Emails }{@code >}
     *     
     */
    public void setEmails(JAXBElement<UpdateClientInfoSpecific.Emails> value) {
        this.emails = value;
    }

    /**
     * Gets the value of the mobilePhones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.MobilePhones }{@code >}
     *     
     */
    public JAXBElement<UpdateClientInfoSpecific.MobilePhones> getMobilePhones() {
        return mobilePhones;
    }

    /**
     * Sets the value of the mobilePhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.MobilePhones }{@code >}
     *     
     */
    public void setMobilePhones(JAXBElement<UpdateClientInfoSpecific.MobilePhones> value) {
        this.mobilePhones = value;
    }

    /**
     * Gets the value of the twitterScreenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    /**
     * Sets the value of the twitterScreenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterScreenName(String value) {
        this.twitterScreenName = value;
    }

    /**
     * Gets the value of the contractTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ObjTitles }
     *     
     */
    public ObjTitles getContractTitles() {
        return contractTitles;
    }

    /**
     * Sets the value of the contractTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTitles }
     *     
     */
    public void setContractTitles(ObjTitles value) {
        this.contractTitles = value;
    }

    /**
     * Gets the value of the contractInLinkTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ObjTitles }
     *     
     */
    public ObjTitles getContractInLinkTitles() {
        return contractInLinkTitles;
    }

    /**
     * Sets the value of the contractInLinkTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTitles }
     *     
     */
    public void setContractInLinkTitles(ObjTitles value) {
        this.contractInLinkTitles = value;
    }

    /**
     * Gets the value of the contractOutLinkTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ObjTitles }
     *     
     */
    public ObjTitles getContractOutLinkTitles() {
        return contractOutLinkTitles;
    }

    /**
     * Sets the value of the contractOutLinkTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTitles }
     *     
     */
    public void setContractOutLinkTitles(ObjTitles value) {
        this.contractOutLinkTitles = value;
    }

    /**
     * Gets the value of the tokenTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ObjTitles }
     *     
     */
    public ObjTitles getTokenTitles() {
        return tokenTitles;
    }

    /**
     * Sets the value of the tokenTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTitles }
     *     
     */
    public void setTokenTitles(ObjTitles value) {
        this.tokenTitles = value;
    }

    /**
     * Gets the value of the digitizedCardTitles property.
     * 
     * @return
     *     possible object is
     *     {@link ObjTitles }
     *     
     */
    public ObjTitles getDigitizedCardTitles() {
        return digitizedCardTitles;
    }

    /**
     * Sets the value of the digitizedCardTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTitles }
     *     
     */
    public void setDigitizedCardTitles(ObjTitles value) {
        this.digitizedCardTitles = value;
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
     * Gets the value of the personAuthQAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.PersonAuthQAs }{@code >}
     *     
     */
    public JAXBElement<UpdateClientInfoSpecific.PersonAuthQAs> getPersonAuthQAs() {
        return personAuthQAs;
    }

    /**
     * Sets the value of the personAuthQAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.PersonAuthQAs }{@code >}
     *     
     */
    public void setPersonAuthQAs(JAXBElement<UpdateClientInfoSpecific.PersonAuthQAs> value) {
        this.personAuthQAs = value;
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
     *         &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "personAuthQA"
    })
    public static class PersonAuthQAs {

        @XmlElement(name = "PersonAuthQA")
        protected List<PersonAuthQA> personAuthQA;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the personAuthQA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personAuthQA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonAuthQA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonAuthQA }
         * 
         * 
         */
        public List<PersonAuthQA> getPersonAuthQA() {
            if (personAuthQA == null) {
                personAuthQA = new ArrayList<PersonAuthQA>();
            }
            return this.personAuthQA;
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
