
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for Payee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Card" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                   &lt;element name="GetFromExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}PartyFromExtCard" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Pan"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;minLength value="6"/&gt;
 *                       &lt;maxLength value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DPan"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;minLength value="13"/&gt;
 *                       &lt;maxLength value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="LifeCycleRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="DExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="IsoAccountType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RangeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AccountKind"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ProductKind"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CardFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Person" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonInfo" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Alias" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Rids"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PayeeContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="AccountNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AccountExtNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstAcctMapGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="UsePayerToken" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payee", propOrder = {
    "card",
    "person",
    "owner"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Parties.Payee.class
})
public class Payee {

    @XmlElement(name = "Card")
    protected Payee.Card card;
    @XmlElement(name = "Person")
    protected PersonInfo person;
    @XmlElement(name = "Owner")
    protected OrganizationInfo owner;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "InstRid")
    protected String instRid;
    @XmlAttribute(name = "InstName")
    protected String instName;
    @XmlAttribute(name = "InstTitle")
    protected String instTitle;
    @XmlAttribute(name = "Alias")
    protected String alias;
    @XmlAttribute(name = "Rids")
    protected List<String> rids;
    @XmlAttribute(name = "ContractRid")
    protected String contractRid;
    @XmlAttribute(name = "ContractExtRid")
    protected String contractExtRid;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "PayeeContractId")
    protected Long payeeContractId;
    @XmlAttribute(name = "ContractFromTemplateTran")
    protected Boolean contractFromTemplateTran;
    @XmlAttribute(name = "AccountNum")
    protected String accountNum;
    @XmlAttribute(name = "AccountExtNum")
    protected String accountExtNum;
    @XmlAttribute(name = "InstAcctMapGuid")
    protected String instAcctMapGuid;
    @XmlAttribute(name = "Phone")
    protected String phone;
    @XmlAttribute(name = "UsePayerToken")
    protected Boolean usePayerToken;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Payee.Card }
     *     
     */
    public Payee.Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee.Card }
     *     
     */
    public void setCard(Payee.Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPerson(PersonInfo value) {
        this.person = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInfo }
     *     
     */
    public OrganizationInfo getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInfo }
     *     
     */
    public void setOwner(OrganizationInfo value) {
        this.owner = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstId(Long value) {
        this.instId = value;
    }

    /**
     * Gets the value of the instRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstRid() {
        return instRid;
    }

    /**
     * Sets the value of the instRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstRid(String value) {
        this.instRid = value;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * Gets the value of the instTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstTitle() {
        return instTitle;
    }

    /**
     * Sets the value of the instTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstTitle(String value) {
        this.instTitle = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the rids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRids() {
        if (rids == null) {
            rids = new ArrayList<String>();
        }
        return this.rids;
    }

    /**
     * Gets the value of the contractRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRid() {
        return contractRid;
    }

    /**
     * Sets the value of the contractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRid(String value) {
        this.contractRid = value;
    }

    /**
     * Gets the value of the contractExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractExtRid() {
        return contractExtRid;
    }

    /**
     * Sets the value of the contractExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractExtRid(String value) {
        this.contractExtRid = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the payeeContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayeeContractId() {
        return payeeContractId;
    }

    /**
     * Sets the value of the payeeContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayeeContractId(Long value) {
        this.payeeContractId = value;
    }

    /**
     * Gets the value of the contractFromTemplateTran property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContractFromTemplateTran() {
        if (contractFromTemplateTran == null) {
            return false;
        } else {
            return contractFromTemplateTran;
        }
    }

    /**
     * Sets the value of the contractFromTemplateTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractFromTemplateTran(Boolean value) {
        this.contractFromTemplateTran = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the accountExtNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountExtNum() {
        return accountExtNum;
    }

    /**
     * Sets the value of the accountExtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountExtNum(String value) {
        this.accountExtNum = value;
    }

    /**
     * Gets the value of the instAcctMapGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstAcctMapGuid() {
        return instAcctMapGuid;
    }

    /**
     * Sets the value of the instAcctMapGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstAcctMapGuid(String value) {
        this.instAcctMapGuid = value;
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

    /**
     * Gets the value of the usePayerToken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsePayerToken() {
        if (usePayerToken == null) {
            return false;
        } else {
            return usePayerToken;
        }
    }

    /**
     * Sets the value of the usePayerToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePayerToken(Boolean value) {
        this.usePayerToken = value;
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
     *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *         &lt;element name="GetFromExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}PartyFromExtCard" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Pan"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;minLength value="6"/&gt;
     *             &lt;maxLength value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DPan"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;minLength value="13"/&gt;
     *             &lt;maxLength value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="LifeCycleRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="DExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="IsoAccountType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RangeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AccountKind"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ProductKind"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CardFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "panCrypt",
        "getFromExtCard"
    })
    public static class Card {

        @XmlElement(name = "PanCrypt")
        protected AppEncryptedData panCrypt;
        @XmlElement(name = "GetFromExtCard")
        protected PartyFromExtCard getFromExtCard;
        @XmlAttribute(name = "Pan")
        protected String pan;
        @XmlAttribute(name = "DPan")
        protected String dPan;
        @XmlAttribute(name = "LifeCycleRid")
        protected String lifeCycleRid;
        @XmlAttribute(name = "ExpDate")
        protected XMLGregorianCalendar expDate;
        @XmlAttribute(name = "DExpDate")
        protected XMLGregorianCalendar dExpDate;
        @XmlAttribute(name = "IsoAccountType")
        protected Long isoAccountType;
        @XmlAttribute(name = "RangeId")
        protected Long rangeId;
        @XmlAttribute(name = "AccountKind")
        protected String accountKind;
        @XmlAttribute(name = "ProductKind")
        protected String productKind;
        @XmlAttribute(name = "CardFromTemplateTran")
        protected Boolean cardFromTemplateTran;

        /**
         * Gets the value of the panCrypt property.
         * 
         * @return
         *     possible object is
         *     {@link AppEncryptedData }
         *     
         */
        public AppEncryptedData getPanCrypt() {
            return panCrypt;
        }

        /**
         * Sets the value of the panCrypt property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppEncryptedData }
         *     
         */
        public void setPanCrypt(AppEncryptedData value) {
            this.panCrypt = value;
        }

        /**
         * Gets the value of the getFromExtCard property.
         * 
         * @return
         *     possible object is
         *     {@link PartyFromExtCard }
         *     
         */
        public PartyFromExtCard getGetFromExtCard() {
            return getFromExtCard;
        }

        /**
         * Sets the value of the getFromExtCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyFromExtCard }
         *     
         */
        public void setGetFromExtCard(PartyFromExtCard value) {
            this.getFromExtCard = value;
        }

        /**
         * Gets the value of the pan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPan() {
            return pan;
        }

        /**
         * Sets the value of the pan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPan(String value) {
            this.pan = value;
        }

        /**
         * Gets the value of the dPan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDPan() {
            return dPan;
        }

        /**
         * Sets the value of the dPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDPan(String value) {
            this.dPan = value;
        }

        /**
         * Gets the value of the lifeCycleRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLifeCycleRid() {
            return lifeCycleRid;
        }

        /**
         * Sets the value of the lifeCycleRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLifeCycleRid(String value) {
            this.lifeCycleRid = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the dExpDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDExpDate() {
            return dExpDate;
        }

        /**
         * Sets the value of the dExpDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDExpDate(XMLGregorianCalendar value) {
            this.dExpDate = value;
        }

        /**
         * Gets the value of the isoAccountType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getIsoAccountType() {
            return isoAccountType;
        }

        /**
         * Sets the value of the isoAccountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setIsoAccountType(Long value) {
            this.isoAccountType = value;
        }

        /**
         * Gets the value of the rangeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRangeId() {
            return rangeId;
        }

        /**
         * Sets the value of the rangeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRangeId(Long value) {
            this.rangeId = value;
        }

        /**
         * Gets the value of the accountKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountKind() {
            return accountKind;
        }

        /**
         * Sets the value of the accountKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountKind(String value) {
            this.accountKind = value;
        }

        /**
         * Gets the value of the productKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductKind() {
            return productKind;
        }

        /**
         * Sets the value of the productKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductKind(String value) {
            this.productKind = value;
        }

        /**
         * Gets the value of the cardFromTemplateTran property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCardFromTemplateTran() {
            if (cardFromTemplateTran == null) {
                return false;
            } else {
                return cardFromTemplateTran;
            }
        }

        /**
         * Sets the value of the cardFromTemplateTran property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCardFromTemplateTran(Boolean value) {
            this.cardFromTemplateTran = value;
        }

    }

}
