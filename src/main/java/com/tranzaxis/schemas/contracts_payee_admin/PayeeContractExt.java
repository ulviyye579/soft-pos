
package com.tranzaxis.schemas.contracts_payee_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ListModifyMode;


/**
 * <p>Java class for PayeeContractExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeContractExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasChilds" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UseLocalParams" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UseExternalParams" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UseLocalBills" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="BillSurchargeTariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="HasInvoices" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="DefaultInvoiceTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="HasVouchers" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UseLocalVouchers" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Code1Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Code2Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AccessType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InteractionKind" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OnlinePhases" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartnerInstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Phase1InterfaceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Phase2InterfaceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PayeeParams" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Param" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayeeGates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Gate" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeGate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayeeDirItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DirItem" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeDirItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PayeeContractExt", propOrder = {
    "hasChilds",
    "useLocalParams",
    "useExternalParams",
    "hasBills",
    "useLocalBills",
    "billSurchargeTariffPlanGuid",
    "hasInvoices",
    "defaultInvoiceTypeId",
    "hasVouchers",
    "useLocalVouchers",
    "code1Title",
    "code2Title",
    "accessType",
    "interactionKind",
    "onlinePhases",
    "partnerInstId",
    "phase1InterfaceId",
    "phase2InterfaceId",
    "payeeParams",
    "payeeGates",
    "payeeDirItems"
})
public class PayeeContractExt {

    @XmlElement(name = "HasChilds")
    protected Boolean hasChilds;
    @XmlElement(name = "UseLocalParams")
    protected Boolean useLocalParams;
    @XmlElement(name = "UseExternalParams")
    protected Boolean useExternalParams;
    @XmlElement(name = "HasBills")
    protected Boolean hasBills;
    @XmlElement(name = "UseLocalBills")
    protected Boolean useLocalBills;
    @XmlElement(name = "BillSurchargeTariffPlanGuid")
    protected String billSurchargeTariffPlanGuid;
    @XmlElement(name = "HasInvoices")
    protected Boolean hasInvoices;
    @XmlElementRef(name = "DefaultInvoiceTypeId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultInvoiceTypeId;
    @XmlElement(name = "HasVouchers")
    protected Boolean hasVouchers;
    @XmlElement(name = "UseLocalVouchers")
    protected Boolean useLocalVouchers;
    @XmlElementRef(name = "Code1Title", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code1Title;
    @XmlElementRef(name = "Code2Title", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code2Title;
    @XmlElement(name = "AccessType")
    protected String accessType;
    @XmlElementRef(name = "InteractionKind", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interactionKind;
    @XmlElementRef(name = "OnlinePhases", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onlinePhases;
    @XmlElementRef(name = "PartnerInstId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> partnerInstId;
    @XmlElementRef(name = "Phase1InterfaceId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phase1InterfaceId;
    @XmlElementRef(name = "Phase2InterfaceId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phase2InterfaceId;
    @XmlElement(name = "PayeeParams")
    protected PayeeContractExt.PayeeParams payeeParams;
    @XmlElement(name = "PayeeGates")
    protected PayeeContractExt.PayeeGates payeeGates;
    @XmlElement(name = "PayeeDirItems")
    protected PayeeContractExt.PayeeDirItems payeeDirItems;

    /**
     * Gets the value of the hasChilds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChilds() {
        return hasChilds;
    }

    /**
     * Sets the value of the hasChilds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChilds(Boolean value) {
        this.hasChilds = value;
    }

    /**
     * Gets the value of the useLocalParams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLocalParams() {
        return useLocalParams;
    }

    /**
     * Sets the value of the useLocalParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLocalParams(Boolean value) {
        this.useLocalParams = value;
    }

    /**
     * Gets the value of the useExternalParams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExternalParams() {
        return useExternalParams;
    }

    /**
     * Sets the value of the useExternalParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExternalParams(Boolean value) {
        this.useExternalParams = value;
    }

    /**
     * Gets the value of the hasBills property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBills() {
        return hasBills;
    }

    /**
     * Sets the value of the hasBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBills(Boolean value) {
        this.hasBills = value;
    }

    /**
     * Gets the value of the useLocalBills property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLocalBills() {
        return useLocalBills;
    }

    /**
     * Sets the value of the useLocalBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLocalBills(Boolean value) {
        this.useLocalBills = value;
    }

    /**
     * Gets the value of the billSurchargeTariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSurchargeTariffPlanGuid() {
        return billSurchargeTariffPlanGuid;
    }

    /**
     * Sets the value of the billSurchargeTariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSurchargeTariffPlanGuid(String value) {
        this.billSurchargeTariffPlanGuid = value;
    }

    /**
     * Gets the value of the hasInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasInvoices() {
        return hasInvoices;
    }

    /**
     * Sets the value of the hasInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasInvoices(Boolean value) {
        this.hasInvoices = value;
    }

    /**
     * Gets the value of the defaultInvoiceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultInvoiceTypeId() {
        return defaultInvoiceTypeId;
    }

    /**
     * Sets the value of the defaultInvoiceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultInvoiceTypeId(JAXBElement<Long> value) {
        this.defaultInvoiceTypeId = value;
    }

    /**
     * Gets the value of the hasVouchers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasVouchers() {
        return hasVouchers;
    }

    /**
     * Sets the value of the hasVouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasVouchers(Boolean value) {
        this.hasVouchers = value;
    }

    /**
     * Gets the value of the useLocalVouchers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLocalVouchers() {
        return useLocalVouchers;
    }

    /**
     * Sets the value of the useLocalVouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLocalVouchers(Boolean value) {
        this.useLocalVouchers = value;
    }

    /**
     * Gets the value of the code1Title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode1Title() {
        return code1Title;
    }

    /**
     * Sets the value of the code1Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode1Title(JAXBElement<String> value) {
        this.code1Title = value;
    }

    /**
     * Gets the value of the code2Title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode2Title() {
        return code2Title;
    }

    /**
     * Sets the value of the code2Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode2Title(JAXBElement<String> value) {
        this.code2Title = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the interactionKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInteractionKind() {
        return interactionKind;
    }

    /**
     * Sets the value of the interactionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInteractionKind(JAXBElement<String> value) {
        this.interactionKind = value;
    }

    /**
     * Gets the value of the onlinePhases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnlinePhases() {
        return onlinePhases;
    }

    /**
     * Sets the value of the onlinePhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnlinePhases(JAXBElement<String> value) {
        this.onlinePhases = value;
    }

    /**
     * Gets the value of the partnerInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartnerInstId() {
        return partnerInstId;
    }

    /**
     * Sets the value of the partnerInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartnerInstId(JAXBElement<Long> value) {
        this.partnerInstId = value;
    }

    /**
     * Gets the value of the phase1InterfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhase1InterfaceId() {
        return phase1InterfaceId;
    }

    /**
     * Sets the value of the phase1InterfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhase1InterfaceId(JAXBElement<Long> value) {
        this.phase1InterfaceId = value;
    }

    /**
     * Gets the value of the phase2InterfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhase2InterfaceId() {
        return phase2InterfaceId;
    }

    /**
     * Sets the value of the phase2InterfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhase2InterfaceId(JAXBElement<Long> value) {
        this.phase2InterfaceId = value;
    }

    /**
     * Gets the value of the payeeParams property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeContractExt.PayeeParams }
     *     
     */
    public PayeeContractExt.PayeeParams getPayeeParams() {
        return payeeParams;
    }

    /**
     * Sets the value of the payeeParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeContractExt.PayeeParams }
     *     
     */
    public void setPayeeParams(PayeeContractExt.PayeeParams value) {
        this.payeeParams = value;
    }

    /**
     * Gets the value of the payeeGates property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeContractExt.PayeeGates }
     *     
     */
    public PayeeContractExt.PayeeGates getPayeeGates() {
        return payeeGates;
    }

    /**
     * Sets the value of the payeeGates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeContractExt.PayeeGates }
     *     
     */
    public void setPayeeGates(PayeeContractExt.PayeeGates value) {
        this.payeeGates = value;
    }

    /**
     * Gets the value of the payeeDirItems property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeContractExt.PayeeDirItems }
     *     
     */
    public PayeeContractExt.PayeeDirItems getPayeeDirItems() {
        return payeeDirItems;
    }

    /**
     * Sets the value of the payeeDirItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeContractExt.PayeeDirItems }
     *     
     */
    public void setPayeeDirItems(PayeeContractExt.PayeeDirItems value) {
        this.payeeDirItems = value;
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
     *         &lt;element name="DirItem" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeDirItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dirItem"
    })
    public static class PayeeDirItems {

        @XmlElement(name = "DirItem")
        protected List<PayeeDirItem> dirItem;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the dirItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dirItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayeeDirItem }
         * 
         * 
         */
        public List<PayeeDirItem> getDirItem() {
            if (dirItem == null) {
                dirItem = new ArrayList<PayeeDirItem>();
            }
            return this.dirItem;
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
     *         &lt;element name="Gate" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeGate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "gate"
    })
    public static class PayeeGates {

        @XmlElement(name = "Gate")
        protected List<PayeeGate> gate;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the gate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayeeGate }
         * 
         * 
         */
        public List<PayeeGate> getGate() {
            if (gate == null) {
                gate = new ArrayList<PayeeGate>();
            }
            return this.gate;
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
     *         &lt;element name="Param" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeParam" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "param"
    })
    public static class PayeeParams {

        @XmlElement(name = "Param")
        protected List<PayeeParam> param;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayeeParam }
         * 
         * 
         */
        public List<PayeeParam> getParam() {
            if (param == null) {
                param = new ArrayList<PayeeParam>();
            }
            return this.param;
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
