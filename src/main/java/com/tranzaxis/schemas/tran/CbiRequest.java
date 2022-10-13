
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbiRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbiRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TranRequest" type="{http://schemas.tranzaxis.com/tran.xsd}Request"/&gt;
 *         &lt;element name="AccountInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ContractId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ContractRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Entries" type="{http://schemas.tranzaxis.com/tran.xsd}Entries" minOccurs="0"/&gt;
 *         &lt;element name="Postings" type="{http://schemas.tranzaxis.com/tran.xsd}Postings" minOccurs="0"/&gt;
 *         &lt;element name="HoldActions" type="{http://schemas.tranzaxis.com/tran.xsd}HoldActions" minOccurs="0"/&gt;
 *         &lt;element name="Stip" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CbiRequest" type="{http://schemas.tranzaxis.com/tran.xsd}CbiRequest" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "CbiRequest", propOrder = {
    "tranRequest",
    "accountInfo",
    "entries",
    "postings",
    "holdActions",
    "stip"
})
public class CbiRequest {

    @XmlElement(name = "TranRequest", required = true)
    protected Request tranRequest;
    @XmlElement(name = "AccountInfo")
    protected CbiRequest.AccountInfo accountInfo;
    @XmlElement(name = "Entries")
    protected Entries entries;
    @XmlElement(name = "Postings")
    protected Postings postings;
    @XmlElement(name = "HoldActions")
    protected HoldActions holdActions;
    @XmlElement(name = "Stip")
    protected CbiRequest.Stip stip;

    /**
     * Gets the value of the tranRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getTranRequest() {
        return tranRequest;
    }

    /**
     * Sets the value of the tranRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setTranRequest(Request value) {
        this.tranRequest = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CbiRequest.AccountInfo }
     *     
     */
    public CbiRequest.AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbiRequest.AccountInfo }
     *     
     */
    public void setAccountInfo(CbiRequest.AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link Entries }
     *     
     */
    public Entries getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entries }
     *     
     */
    public void setEntries(Entries value) {
        this.entries = value;
    }

    /**
     * Gets the value of the postings property.
     * 
     * @return
     *     possible object is
     *     {@link Postings }
     *     
     */
    public Postings getPostings() {
        return postings;
    }

    /**
     * Sets the value of the postings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postings }
     *     
     */
    public void setPostings(Postings value) {
        this.postings = value;
    }

    /**
     * Gets the value of the holdActions property.
     * 
     * @return
     *     possible object is
     *     {@link HoldActions }
     *     
     */
    public HoldActions getHoldActions() {
        return holdActions;
    }

    /**
     * Sets the value of the holdActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldActions }
     *     
     */
    public void setHoldActions(HoldActions value) {
        this.holdActions = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * @return
     *     possible object is
     *     {@link CbiRequest.Stip }
     *     
     */
    public CbiRequest.Stip getStip() {
        return stip;
    }

    /**
     * Sets the value of the stip property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbiRequest.Stip }
     *     
     */
    public void setStip(CbiRequest.Stip value) {
        this.stip = value;
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
     *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ContractId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ContractRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
    @XmlType(name = "", propOrder = {
        "account"
    })
    public static class AccountInfo {

        @XmlElement(name = "Account")
        protected List<CbiRequest.AccountInfo.Account> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CbiRequest.AccountInfo.Account }
         * 
         * 
         */
        public List<CbiRequest.AccountInfo.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<CbiRequest.AccountInfo.Account>();
            }
            return this.account;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ContractId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ContractRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "Id", required = true)
            protected long id;
            @XmlAttribute(name = "Number", required = true)
            protected String number;
            @XmlAttribute(name = "ExtNumber")
            protected String extNumber;
            @XmlAttribute(name = "ContractId", required = true)
            protected long contractId;
            @XmlAttribute(name = "ContractRid", required = true)
            protected String contractRid;

            /**
             * Gets the value of the id property.
             * 
             */
            public long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(long value) {
                this.id = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the extNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtNumber() {
                return extNumber;
            }

            /**
             * Sets the value of the extNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtNumber(String value) {
                this.extNumber = value;
            }

            /**
             * Gets the value of the contractId property.
             * 
             */
            public long getContractId() {
                return contractId;
            }

            /**
             * Sets the value of the contractId property.
             * 
             */
            public void setContractId(long value) {
                this.contractId = value;
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
     *         &lt;element name="CbiRequest" type="{http://schemas.tranzaxis.com/tran.xsd}CbiRequest" maxOccurs="unbounded"/&gt;
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
        "cbiRequest"
    })
    public static class Stip {

        @XmlElement(name = "CbiRequest", required = true)
        protected List<CbiRequest> cbiRequest;

        /**
         * Gets the value of the cbiRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cbiRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCbiRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CbiRequest }
         * 
         * 
         */
        public List<CbiRequest> getCbiRequest() {
            if (cbiRequest == null) {
                cbiRequest = new ArrayList<CbiRequest>();
            }
            return this.cbiRequest;
        }

    }

}
