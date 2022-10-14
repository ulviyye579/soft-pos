
package com.tranzaxis.schemas.subjects_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NetworkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SingleMerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SubMerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DwoRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="FeeProgramIndicators" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MccId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="FloorLimit" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LocationCode2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BaseDiscountRate" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="RiskIndicator" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}RiskIndicator" minOccurs="0"/&gt;
 *         &lt;element name="RoleTypeCode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}AmexRoleTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="AmexStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecStatus" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecStatus" minOccurs="0"/&gt;
 *         &lt;element name="MotoFlag" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}JbcMotoFlag" minOccurs="0"/&gt;
 *         &lt;element name="AgentCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MerchantCapability" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}MerchantCapability" minOccurs="0"/&gt;
 *         &lt;element name="MerchantQrcCapability" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}MerchantQrcCapability" minOccurs="0"/&gt;
 *         &lt;element name="MerchantVerificationValue" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EtuRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}MerchantEtuStatus" minOccurs="0"/&gt;
 *         &lt;element name="EtuRegistered" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EtuUnregistered" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatusUpdTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EtuInquiryEnable" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsMoto" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsEcommerce" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsSeasonal" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="CorporateStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}VisaCorporateStatus" minOccurs="0"/&gt;
 *         &lt;element name="VisaDebitAcceptance" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}VisaDebitAcceptanceEnv" minOccurs="0"/&gt;
 *         &lt;element name="VisaPayWaveAcceptance" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}VisaPayWaveAcceptance" minOccurs="0"/&gt;
 *         &lt;element name="VisaProductAcceptance" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}VisaProductAcceptance" minOccurs="0"/&gt;
 *         &lt;element name="MerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RegisterStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}OrgRegisterStatus" minOccurs="0"/&gt;
 *         &lt;element name="RegisterRequestRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredContracts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Ids"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FacilitatorKind" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}MerchantFacilitatorKind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NetworkId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="NetworkName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSpecific", propOrder = {
    "singleMerchantRid",
    "subMerchantRid",
    "dwoRid",
    "feeProgramIndicators",
    "title",
    "rid",
    "mccId",
    "floorLimit",
    "locationCode2",
    "baseDiscountRate",
    "riskIndicator",
    "roleTypeCode",
    "amexStatus",
    "status",
    "motoFlag",
    "agentCode",
    "reason",
    "stateCode",
    "merchantCapability",
    "merchantQrcCapability",
    "merchantVerificationValue",
    "etuRid",
    "etuStatus",
    "etuRegistered",
    "etuUnregistered",
    "etuStatusUpdTime",
    "etuInquiryEnable",
    "isMoto",
    "isEcommerce",
    "isSeasonal",
    "corporateStatus",
    "visaDebitAcceptance",
    "visaPayWaveAcceptance",
    "visaProductAcceptance",
    "merchantRid",
    "registerStatus",
    "registerRequestRid",
    "registeredContracts",
    "facilitatorKind"
})
public class NetworkSpecific {

    @XmlElementRef(name = "SingleMerchantRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> singleMerchantRid;
    @XmlElementRef(name = "SubMerchantRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMerchantRid;
    @XmlElementRef(name = "DwoRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwoRid;
    @XmlElementRef(name = "FeeProgramIndicators", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feeProgramIndicators;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rid;
    @XmlElementRef(name = "MccId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mccId;
    @XmlElementRef(name = "FloorLimit", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> floorLimit;
    @XmlElementRef(name = "LocationCode2", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCode2;
    @XmlElementRef(name = "BaseDiscountRate", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> baseDiscountRate;
    @XmlElementRef(name = "RiskIndicator", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskIndicator;
    @XmlElementRef(name = "RoleTypeCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> roleTypeCode;
    @XmlElementRef(name = "AmexStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amexStatus;
    @XmlElementRef(name = "Status", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "MotoFlag", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> motoFlag;
    @XmlElementRef(name = "AgentCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agentCode;
    @XmlElementRef(name = "Reason", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "StateCode", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "MerchantCapability", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantCapability;
    @XmlElementRef(name = "MerchantQrcCapability", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantQrcCapability;
    @XmlElementRef(name = "MerchantVerificationValue", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantVerificationValue;
    @XmlElementRef(name = "EtuRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etuRid;
    @XmlElementRef(name = "EtuStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etuStatus;
    @XmlElementRef(name = "EtuRegistered", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> etuRegistered;
    @XmlElementRef(name = "EtuUnregistered", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> etuUnregistered;
    @XmlElementRef(name = "EtuStatusUpdTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> etuStatusUpdTime;
    @XmlElementRef(name = "EtuInquiryEnable", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> etuInquiryEnable;
    @XmlElementRef(name = "IsMoto", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMoto;
    @XmlElementRef(name = "IsEcommerce", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEcommerce;
    @XmlElementRef(name = "IsSeasonal", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSeasonal;
    @XmlElementRef(name = "CorporateStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> corporateStatus;
    @XmlElementRef(name = "VisaDebitAcceptance", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> visaDebitAcceptance;
    @XmlElementRef(name = "VisaPayWaveAcceptance", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> visaPayWaveAcceptance;
    @XmlElementRef(name = "VisaProductAcceptance", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> visaProductAcceptance;
    @XmlElementRef(name = "MerchantRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantRid;
    @XmlElementRef(name = "RegisterStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerStatus;
    @XmlElementRef(name = "RegisterRequestRid", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerRequestRid;
    @XmlElementRef(name = "RegisteredContracts", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkSpecific.RegisteredContracts> registeredContracts;
    @XmlElementRef(name = "FacilitatorKind", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facilitatorKind;
    @XmlAttribute(name = "NetworkId")
    protected Long networkId;
    @XmlAttribute(name = "NetworkName")
    protected String networkName;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "InstName")
    protected String instName;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the singleMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSingleMerchantRid() {
        return singleMerchantRid;
    }

    /**
     * Sets the value of the singleMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSingleMerchantRid(JAXBElement<String> value) {
        this.singleMerchantRid = value;
    }

    /**
     * Gets the value of the subMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMerchantRid() {
        return subMerchantRid;
    }

    /**
     * Sets the value of the subMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMerchantRid(JAXBElement<String> value) {
        this.subMerchantRid = value;
    }

    /**
     * Gets the value of the dwoRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDwoRid() {
        return dwoRid;
    }

    /**
     * Sets the value of the dwoRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDwoRid(JAXBElement<String> value) {
        this.dwoRid = value;
    }

    /**
     * Gets the value of the feeProgramIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeeProgramIndicators() {
        return feeProgramIndicators;
    }

    /**
     * Sets the value of the feeProgramIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeeProgramIndicators(JAXBElement<String> value) {
        this.feeProgramIndicators = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRid(JAXBElement<String> value) {
        this.rid = value;
    }

    /**
     * Gets the value of the mccId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMccId() {
        return mccId;
    }

    /**
     * Sets the value of the mccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMccId(JAXBElement<Long> value) {
        this.mccId = value;
    }

    /**
     * Gets the value of the floorLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFloorLimit() {
        return floorLimit;
    }

    /**
     * Sets the value of the floorLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFloorLimit(JAXBElement<Long> value) {
        this.floorLimit = value;
    }

    /**
     * Gets the value of the locationCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCode2() {
        return locationCode2;
    }

    /**
     * Sets the value of the locationCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCode2(JAXBElement<Long> value) {
        this.locationCode2 = value;
    }

    /**
     * Gets the value of the baseDiscountRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBaseDiscountRate() {
        return baseDiscountRate;
    }

    /**
     * Sets the value of the baseDiscountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBaseDiscountRate(JAXBElement<BigDecimal> value) {
        this.baseDiscountRate = value;
    }

    /**
     * Gets the value of the riskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskIndicator() {
        return riskIndicator;
    }

    /**
     * Sets the value of the riskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskIndicator(JAXBElement<String> value) {
        this.riskIndicator = value;
    }

    /**
     * Gets the value of the roleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRoleTypeCode() {
        return roleTypeCode;
    }

    /**
     * Sets the value of the roleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRoleTypeCode(JAXBElement<Long> value) {
        this.roleTypeCode = value;
    }

    /**
     * Gets the value of the amexStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmexStatus() {
        return amexStatus;
    }

    /**
     * Sets the value of the amexStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmexStatus(JAXBElement<String> value) {
        this.amexStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the motoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMotoFlag() {
        return motoFlag;
    }

    /**
     * Sets the value of the motoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMotoFlag(JAXBElement<Long> value) {
        this.motoFlag = value;
    }

    /**
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgentCode(JAXBElement<String> value) {
        this.agentCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the merchantCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantCapability() {
        return merchantCapability;
    }

    /**
     * Sets the value of the merchantCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantCapability(JAXBElement<String> value) {
        this.merchantCapability = value;
    }

    /**
     * Gets the value of the merchantQrcCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantQrcCapability() {
        return merchantQrcCapability;
    }

    /**
     * Sets the value of the merchantQrcCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantQrcCapability(JAXBElement<String> value) {
        this.merchantQrcCapability = value;
    }

    /**
     * Gets the value of the merchantVerificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantVerificationValue() {
        return merchantVerificationValue;
    }

    /**
     * Sets the value of the merchantVerificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantVerificationValue(JAXBElement<String> value) {
        this.merchantVerificationValue = value;
    }

    /**
     * Gets the value of the etuRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtuRid() {
        return etuRid;
    }

    /**
     * Sets the value of the etuRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtuRid(JAXBElement<String> value) {
        this.etuRid = value;
    }

    /**
     * Gets the value of the etuStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtuStatus() {
        return etuStatus;
    }

    /**
     * Sets the value of the etuStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtuStatus(JAXBElement<String> value) {
        this.etuStatus = value;
    }

    /**
     * Gets the value of the etuRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEtuRegistered() {
        return etuRegistered;
    }

    /**
     * Sets the value of the etuRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEtuRegistered(JAXBElement<XMLGregorianCalendar> value) {
        this.etuRegistered = value;
    }

    /**
     * Gets the value of the etuUnregistered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEtuUnregistered() {
        return etuUnregistered;
    }

    /**
     * Sets the value of the etuUnregistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEtuUnregistered(JAXBElement<XMLGregorianCalendar> value) {
        this.etuUnregistered = value;
    }

    /**
     * Gets the value of the etuStatusUpdTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEtuStatusUpdTime() {
        return etuStatusUpdTime;
    }

    /**
     * Sets the value of the etuStatusUpdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEtuStatusUpdTime(JAXBElement<XMLGregorianCalendar> value) {
        this.etuStatusUpdTime = value;
    }

    /**
     * Gets the value of the etuInquiryEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEtuInquiryEnable() {
        return etuInquiryEnable;
    }

    /**
     * Sets the value of the etuInquiryEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEtuInquiryEnable(JAXBElement<Boolean> value) {
        this.etuInquiryEnable = value;
    }

    /**
     * Gets the value of the isMoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMoto() {
        return isMoto;
    }

    /**
     * Sets the value of the isMoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMoto(JAXBElement<Boolean> value) {
        this.isMoto = value;
    }

    /**
     * Gets the value of the isEcommerce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEcommerce() {
        return isEcommerce;
    }

    /**
     * Sets the value of the isEcommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEcommerce(JAXBElement<Boolean> value) {
        this.isEcommerce = value;
    }

    /**
     * Gets the value of the isSeasonal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSeasonal() {
        return isSeasonal;
    }

    /**
     * Sets the value of the isSeasonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSeasonal(JAXBElement<Boolean> value) {
        this.isSeasonal = value;
    }

    /**
     * Gets the value of the corporateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCorporateStatus() {
        return corporateStatus;
    }

    /**
     * Sets the value of the corporateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCorporateStatus(JAXBElement<Long> value) {
        this.corporateStatus = value;
    }

    /**
     * Gets the value of the visaDebitAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVisaDebitAcceptance() {
        return visaDebitAcceptance;
    }

    /**
     * Sets the value of the visaDebitAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVisaDebitAcceptance(JAXBElement<Long> value) {
        this.visaDebitAcceptance = value;
    }

    /**
     * Gets the value of the visaPayWaveAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVisaPayWaveAcceptance() {
        return visaPayWaveAcceptance;
    }

    /**
     * Sets the value of the visaPayWaveAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVisaPayWaveAcceptance(JAXBElement<Long> value) {
        this.visaPayWaveAcceptance = value;
    }

    /**
     * Gets the value of the visaProductAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVisaProductAcceptance() {
        return visaProductAcceptance;
    }

    /**
     * Sets the value of the visaProductAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVisaProductAcceptance(JAXBElement<Long> value) {
        this.visaProductAcceptance = value;
    }

    /**
     * Gets the value of the merchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantRid() {
        return merchantRid;
    }

    /**
     * Sets the value of the merchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantRid(JAXBElement<String> value) {
        this.merchantRid = value;
    }

    /**
     * Gets the value of the registerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterStatus() {
        return registerStatus;
    }

    /**
     * Sets the value of the registerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterStatus(JAXBElement<String> value) {
        this.registerStatus = value;
    }

    /**
     * Gets the value of the registerRequestRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterRequestRid() {
        return registerRequestRid;
    }

    /**
     * Sets the value of the registerRequestRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterRequestRid(JAXBElement<String> value) {
        this.registerRequestRid = value;
    }

    /**
     * Gets the value of the registeredContracts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkSpecific.RegisteredContracts }{@code >}
     *     
     */
    public JAXBElement<NetworkSpecific.RegisteredContracts> getRegisteredContracts() {
        return registeredContracts;
    }

    /**
     * Sets the value of the registeredContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkSpecific.RegisteredContracts }{@code >}
     *     
     */
    public void setRegisteredContracts(JAXBElement<NetworkSpecific.RegisteredContracts> value) {
        this.registeredContracts = value;
    }

    /**
     * Gets the value of the facilitatorKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFacilitatorKind() {
        return facilitatorKind;
    }

    /**
     * Sets the value of the facilitatorKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFacilitatorKind(JAXBElement<String> value) {
        this.facilitatorKind = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkId(Long value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
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
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
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
     *       &lt;attribute name="Ids"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RegisteredContracts {

        @XmlAttribute(name = "Ids")
        protected List<Long> ids;

        /**
         * Gets the value of the ids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getIds() {
            if (ids == null) {
                ids = new ArrayList<Long>();
            }
            return this.ids;
        }

    }

}
