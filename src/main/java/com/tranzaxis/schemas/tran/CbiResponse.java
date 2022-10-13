
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbiResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TranResponse" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *         &lt;element name="AccountInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TranFees" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                               &lt;attribute name="OrigAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                               &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                               &lt;attribute name="IsHold" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Balance" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="DebitHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="CreditHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "CbiResponse", propOrder = {
    "tranResponse",
    "accountInfo"
})
public class CbiResponse {

    @XmlElement(name = "TranResponse", required = true)
    protected Response tranResponse;
    @XmlElement(name = "AccountInfo")
    protected CbiResponse.AccountInfo accountInfo;

    /**
     * Gets the value of the tranResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getTranResponse() {
        return tranResponse;
    }

    /**
     * Sets the value of the tranResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setTranResponse(Response value) {
        this.tranResponse = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CbiResponse.AccountInfo }
     *     
     */
    public CbiResponse.AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbiResponse.AccountInfo }
     *     
     */
    public void setAccountInfo(CbiResponse.AccountInfo value) {
        this.accountInfo = value;
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
     *                 &lt;sequence&gt;
     *                   &lt;element name="TranFees" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                                     &lt;attribute name="OrigAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                                     &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                                     &lt;attribute name="IsHold" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Balance" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="DebitHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="CreditHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
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
        protected List<CbiResponse.AccountInfo.Account> account;

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
         * {@link CbiResponse.AccountInfo.Account }
         * 
         * 
         */
        public List<CbiResponse.AccountInfo.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<CbiResponse.AccountInfo.Account>();
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
         *       &lt;sequence&gt;
         *         &lt;element name="TranFees" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                           &lt;attribute name="OrigAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                           &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                           &lt;attribute name="IsHold" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Balance" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="DebitHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="CreditHold" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tranFees"
        })
        public static class Account {

            @XmlElement(name = "TranFees")
            protected CbiResponse.AccountInfo.Account.TranFees tranFees;
            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Number")
            protected String number;
            @XmlAttribute(name = "ExtNumber")
            protected String extNumber;
            @XmlAttribute(name = "ContractId")
            protected Long contractId;
            @XmlAttribute(name = "ContractRid")
            protected String contractRid;
            @XmlAttribute(name = "Balance", required = true)
            protected BigDecimal balance;
            @XmlAttribute(name = "DebitHold", required = true)
            protected BigDecimal debitHold;
            @XmlAttribute(name = "CreditHold", required = true)
            protected BigDecimal creditHold;

            /**
             * Gets the value of the tranFees property.
             * 
             * @return
             *     possible object is
             *     {@link CbiResponse.AccountInfo.Account.TranFees }
             *     
             */
            public CbiResponse.AccountInfo.Account.TranFees getTranFees() {
                return tranFees;
            }

            /**
             * Sets the value of the tranFees property.
             * 
             * @param value
             *     allowed object is
             *     {@link CbiResponse.AccountInfo.Account.TranFees }
             *     
             */
            public void setTranFees(CbiResponse.AccountInfo.Account.TranFees value) {
                this.tranFees = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setId(Long value) {
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
             * Gets the value of the balance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBalance() {
                return balance;
            }

            /**
             * Sets the value of the balance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBalance(BigDecimal value) {
                this.balance = value;
            }

            /**
             * Gets the value of the debitHold property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebitHold() {
                return debitHold;
            }

            /**
             * Sets the value of the debitHold property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDebitHold(BigDecimal value) {
                this.debitHold = value;
            }

            /**
             * Gets the value of the creditHold property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditHold() {
                return creditHold;
            }

            /**
             * Sets the value of the creditHold property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditHold(BigDecimal value) {
                this.creditHold = value;
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
             *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
             *                 &lt;attribute name="OrigAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
             *                 &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *                 &lt;attribute name="IsHold" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
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
                "fee"
            })
            public static class TranFees {

                @XmlElement(name = "Fee")
                protected List<CbiResponse.AccountInfo.Account.TranFees.Fee> fee;

                /**
                 * Gets the value of the fee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CbiResponse.AccountInfo.Account.TranFees.Fee }
                 * 
                 * 
                 */
                public List<CbiResponse.AccountInfo.Account.TranFees.Fee> getFee() {
                    if (fee == null) {
                        fee = new ArrayList<CbiResponse.AccountInfo.Account.TranFees.Fee>();
                    }
                    return this.fee;
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
                 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
                 *       &lt;attribute name="OrigAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
                 *       &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
                 *       &lt;attribute name="IsHold" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Fee {

                    @XmlAttribute(name = "Amt", required = true)
                    protected BigDecimal amt;
                    @XmlAttribute(name = "OrigAmt")
                    protected BigDecimal origAmt;
                    @XmlAttribute(name = "OrigCcy")
                    protected Long origCcy;
                    @XmlAttribute(name = "IsHold")
                    protected Boolean isHold;

                    /**
                     * Gets the value of the amt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmt() {
                        return amt;
                    }

                    /**
                     * Sets the value of the amt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmt(BigDecimal value) {
                        this.amt = value;
                    }

                    /**
                     * Gets the value of the origAmt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOrigAmt() {
                        return origAmt;
                    }

                    /**
                     * Sets the value of the origAmt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOrigAmt(BigDecimal value) {
                        this.origAmt = value;
                    }

                    /**
                     * Gets the value of the origCcy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getOrigCcy() {
                        return origCcy;
                    }

                    /**
                     * Sets the value of the origCcy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setOrigCcy(Long value) {
                        this.origCcy = value;
                    }

                    /**
                     * Gets the value of the isHold property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public boolean isIsHold() {
                        if (isHold == null) {
                            return false;
                        } else {
                            return isHold;
                        }
                    }

                    /**
                     * Sets the value of the isHold property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsHold(Boolean value) {
                        this.isHold = value;
                    }

                }

            }

        }

    }

}
