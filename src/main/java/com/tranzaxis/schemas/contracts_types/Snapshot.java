
package com.tranzaxis.schemas.contracts_types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.contracts_strategy.Strategy;


/**
 * <p>Java class for Snapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Snapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Registers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Register" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AcctRole" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="RegisterRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole"/&gt;
 *                             &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *                             &lt;element name="Classification" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="RegisterSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection"/&gt;
 *                             &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Balances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Balance" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CBalanceKind" /&gt;
 *                           &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Day" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CContractStatus" minOccurs="0"/&gt;
 *         &lt;element name="UsageRestriction" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CUsageRestriction" minOccurs="0"/&gt;
 *         &lt;element name="Marks" type="{http://schemas.tranzaxis.com/contracts-types.xsd}Marks" minOccurs="0"/&gt;
 *         &lt;element name="OutLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OutLink" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InLink" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Strategies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Strategy" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}Strategy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TariffPlans" type="{http://schemas.tranzaxis.com/contracts-types.xsd}TariffPlansHistory" minOccurs="0"/&gt;
 *         &lt;element name="Property" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                   &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="UserFields" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.tranzaxis.com/common-types.xsd}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Snapshot", propOrder = {
    "registers",
    "balances",
    "status",
    "usageRestriction",
    "marks",
    "outLinks",
    "inLinks",
    "strategies",
    "tariffPlans",
    "property",
    "userAttrs",
    "userFields",
    "attachments",
    "ext"
})
public class Snapshot {

    @XmlElement(name = "Registers")
    protected Snapshot.Registers registers;
    @XmlElement(name = "Balances")
    protected Snapshot.Balances balances;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "UsageRestriction", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usageRestriction;
    @XmlElement(name = "Marks")
    protected Marks marks;
    @XmlElement(name = "OutLinks")
    protected Snapshot.OutLinks outLinks;
    @XmlElement(name = "InLinks")
    protected Snapshot.InLinks inLinks;
    @XmlElement(name = "Strategies")
    protected Snapshot.Strategies strategies;
    @XmlElement(name = "TariffPlans")
    protected TariffPlansHistory tariffPlans;
    @XmlElement(name = "Property")
    protected List<Snapshot.Property> property;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "UserFields")
    protected ParamValues userFields;
    @XmlElement(name = "Attachments")
    protected Attachments attachments;
    @XmlElement(name = "Ext")
    protected Object ext;

    /**
     * Gets the value of the registers property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot.Registers }
     *     
     */
    public Snapshot.Registers getRegisters() {
        return registers;
    }

    /**
     * Sets the value of the registers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot.Registers }
     *     
     */
    public void setRegisters(Snapshot.Registers value) {
        this.registers = value;
    }

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot.Balances }
     *     
     */
    public Snapshot.Balances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot.Balances }
     *     
     */
    public void setBalances(Snapshot.Balances value) {
        this.balances = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the usageRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsageRestriction() {
        return usageRestriction;
    }

    /**
     * Sets the value of the usageRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsageRestriction(JAXBElement<String> value) {
        this.usageRestriction = value;
    }

    /**
     * Gets the value of the marks property.
     * 
     * @return
     *     possible object is
     *     {@link Marks }
     *     
     */
    public Marks getMarks() {
        return marks;
    }

    /**
     * Sets the value of the marks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marks }
     *     
     */
    public void setMarks(Marks value) {
        this.marks = value;
    }

    /**
     * Gets the value of the outLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot.OutLinks }
     *     
     */
    public Snapshot.OutLinks getOutLinks() {
        return outLinks;
    }

    /**
     * Sets the value of the outLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot.OutLinks }
     *     
     */
    public void setOutLinks(Snapshot.OutLinks value) {
        this.outLinks = value;
    }

    /**
     * Gets the value of the inLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot.InLinks }
     *     
     */
    public Snapshot.InLinks getInLinks() {
        return inLinks;
    }

    /**
     * Sets the value of the inLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot.InLinks }
     *     
     */
    public void setInLinks(Snapshot.InLinks value) {
        this.inLinks = value;
    }

    /**
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot.Strategies }
     *     
     */
    public Snapshot.Strategies getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot.Strategies }
     *     
     */
    public void setStrategies(Snapshot.Strategies value) {
        this.strategies = value;
    }

    /**
     * Gets the value of the tariffPlans property.
     * 
     * @return
     *     possible object is
     *     {@link TariffPlansHistory }
     *     
     */
    public TariffPlansHistory getTariffPlans() {
        return tariffPlans;
    }

    /**
     * Sets the value of the tariffPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffPlansHistory }
     *     
     */
    public void setTariffPlans(TariffPlansHistory value) {
        this.tariffPlans = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Snapshot.Property }
     * 
     * 
     */
    public List<Snapshot.Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Snapshot.Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the userFields property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserFields() {
        return userFields;
    }

    /**
     * Sets the value of the userFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserFields(ParamValues value) {
        this.userFields = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExt(Object value) {
        this.ext = value;
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
     *         &lt;element name="Balance" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CBalanceKind" /&gt;
     *                 &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Day" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
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
        "balance"
    })
    public static class Balances {

        @XmlElement(name = "Balance")
        protected List<Snapshot.Balances.Balance> balance;

        /**
         * Gets the value of the balance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Snapshot.Balances.Balance }
         * 
         * 
         */
        public List<Snapshot.Balances.Balance> getBalance() {
            if (balance == null) {
                balance = new ArrayList<Snapshot.Balances.Balance>();
            }
            return this.balance;
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
         *       &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CBalanceKind" /&gt;
         *       &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Day" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Balance {

            @XmlAttribute(name = "Kind")
            protected Long kind;
            @XmlAttribute(name = "Amt")
            protected BigDecimal amt;
            @XmlAttribute(name = "Ccy")
            protected Long ccy;
            @XmlAttribute(name = "Day")
            protected XMLGregorianCalendar day;

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setKind(Long value) {
                this.kind = value;
            }

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
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCcy(Long value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the day property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDay() {
                return day;
            }

            /**
             * Sets the value of the day property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDay(XMLGregorianCalendar value) {
                this.day = value;
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
     *         &lt;element name="InLink" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractLink" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "inLink"
    })
    public static class InLinks {

        @XmlElement(name = "InLink")
        protected List<ContractLink> inLink;

        /**
         * Gets the value of the inLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractLink }
         * 
         * 
         */
        public List<ContractLink> getInLink() {
            if (inLink == null) {
                inLink = new ArrayList<ContractLink>();
            }
            return this.inLink;
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
     *         &lt;element name="OutLink" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractLink" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "outLink"
    })
    public static class OutLinks {

        @XmlElement(name = "OutLink")
        protected List<ContractLink> outLink;

        /**
         * Gets the value of the outLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractLink }
         * 
         * 
         */
        public List<ContractLink> getOutLink() {
            if (outLink == null) {
                outLink = new ArrayList<ContractLink>();
            }
            return this.outLink;
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
     *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *         &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
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
        "rid",
        "val"
    })
    public static class Property {

        @XmlElement(name = "Rid", required = true)
        protected String rid;
        @XmlElement(name = "Val", required = true, nillable = true)
        protected String val;

        /**
         * Gets the value of the rid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRid() {
            return rid;
        }

        /**
         * Sets the value of the rid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRid(String value) {
            this.rid = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
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
     *         &lt;element name="Register" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AcctRole" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="RegisterRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole"/&gt;
     *                   &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
     *                   &lt;element name="Classification" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="RegisterSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection"/&gt;
     *                   &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
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
    @XmlType(name = "", propOrder = {
        "register"
    })
    public static class Registers {

        @XmlElement(name = "Register")
        protected List<Snapshot.Registers.Register> register;

        /**
         * Gets the value of the register property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the register property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegister().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Snapshot.Registers.Register }
         * 
         * 
         */
        public List<Snapshot.Registers.Register> getRegister() {
            if (register == null) {
                register = new ArrayList<Snapshot.Registers.Register>();
            }
            return this.register;
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
         *         &lt;element name="AcctRole" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="RegisterRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole"/&gt;
         *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
         *         &lt;element name="Classification" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="RegisterSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection"/&gt;
         *         &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
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
            "acctRole",
            "registerRole",
            "ccy",
            "classification",
            "registerSection",
            "balance"
        })
        public static class Register {

            @XmlElement(name = "AcctRole", required = true, nillable = true)
            protected String acctRole;
            @XmlElement(name = "RegisterRole", required = true, nillable = true)
            protected String registerRole;
            @XmlElement(name = "Ccy")
            protected long ccy;
            @XmlElement(name = "Classification", required = true, nillable = true)
            protected String classification;
            @XmlElement(name = "RegisterSection", required = true, nillable = true)
            protected String registerSection;
            @XmlElement(name = "Balance", required = true)
            protected BigDecimal balance;

            /**
             * Gets the value of the acctRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctRole() {
                return acctRole;
            }

            /**
             * Sets the value of the acctRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctRole(String value) {
                this.acctRole = value;
            }

            /**
             * Gets the value of the registerRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegisterRole() {
                return registerRole;
            }

            /**
             * Sets the value of the registerRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegisterRole(String value) {
                this.registerRole = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             */
            public long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             */
            public void setCcy(long value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the classification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassification() {
                return classification;
            }

            /**
             * Sets the value of the classification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassification(String value) {
                this.classification = value;
            }

            /**
             * Gets the value of the registerSection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegisterSection() {
                return registerSection;
            }

            /**
             * Sets the value of the registerSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegisterSection(String value) {
                this.registerSection = value;
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
     *         &lt;element name="Strategy" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}Strategy" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "strategy"
    })
    public static class Strategies {

        @XmlElement(name = "Strategy")
        protected List<Strategy> strategy;

        /**
         * Gets the value of the strategy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the strategy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStrategy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Strategy }
         * 
         * 
         */
        public List<Strategy> getStrategy() {
            if (strategy == null) {
                strategy = new ArrayList<Strategy>();
            }
            return this.strategy;
        }

    }

}
