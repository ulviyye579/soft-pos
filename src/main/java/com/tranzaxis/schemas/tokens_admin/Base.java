
package com.tranzaxis.schemas.tokens_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.contracts_admin.OutLink;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import com.tranzaxis.schemas.restricting_admin.Restriction;
import org.radixware.schemas.common.UserProps;


/**
 * <p>Java class for Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateContractTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CreateContractTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateContractClientId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CreateContractClientRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateContractOutLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Link" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}OutLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProductRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LifePhaseId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LifePhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InitialLifePhaseId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PackageId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SeqInPackage" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CurBranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CurBranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CurBranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProlongExpDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="TemplateTokenId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TemplateTokenExtRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="IsReplacement" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="EtuNewChain" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="EtuOptout" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="KeepPan" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="KeepPin" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="KeepLimits" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="KeepExtRid" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenStatus" minOccurs="0"/&gt;
 *         &lt;element name="InitialStatus" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenStatus" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastStatusChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastStatusChangeDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="RiskLevel" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TmpDisableRestrictions" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="TmpDisableAuth" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="PwdHash" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *         &lt;element name="PwdHashCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="PwdUsagesLeft" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PwdExpirationTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="InvalidSecretTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidCallbackTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidAnswerTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SecretEnabledTill" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Clerk" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Restriction" type="{http://schemas.tranzaxis.com/restricting-admin.xsd}Restriction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MainTokenId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MainTokenExtRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="UserProps" type="{http://schemas.radixware.org/common.xsd}UserProps" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.tranzaxis.com/common-types.xsd}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="RcMoratoriums" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcMoratoriums" minOccurs="0"/&gt;
 *         &lt;element name="ToUnblockEmvPin" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ToUpdateEmvTags" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ToResetEmvAtc" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="RegInNetworkTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NetworkType" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}NetworkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TerminalId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="FromBin" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ToBin" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Aliases" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenAlias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base", propOrder = {
    "contractId",
    "contractRid",
    "createContractTypeId",
    "createContractTypeRid",
    "createContractClientId",
    "createContractClientRid",
    "createContractOutLinks",
    "profileId",
    "profileRid",
    "productId",
    "productRid",
    "lifePhaseId",
    "lifePhaseRid",
    "initialLifePhaseId",
    "packageId",
    "seqInPackage",
    "curBranchId",
    "curBranchCode",
    "curBranchName",
    "deliveryBranchId",
    "prolongExpDays",
    "deliveryBranchCode",
    "deliveryBranchName",
    "deliveryAddress",
    "templateTokenId",
    "templateTokenExtRid",
    "isReplacement",
    "etuNewChain",
    "etuOptout",
    "keepPan",
    "keepPin",
    "keepLimits",
    "keepExtRid",
    "notes",
    "status",
    "initialStatus",
    "createTime",
    "createDay",
    "activateTime",
    "activateDay",
    "activateUserName",
    "closeTime",
    "closeDay",
    "lastStatusChangeTime",
    "lastStatusChangeDay",
    "validTime",
    "expTime",
    "riskLevel",
    "tmpDisableRestrictions",
    "tmpDisableAuth",
    "pwdHash",
    "pwdHashCrypt",
    "pwdUsagesLeft",
    "pwdExpirationTime",
    "invalidSecretTriesCnt",
    "invalidCallbackTriesCnt",
    "invalidAnswerTriesCnt",
    "secretEnabledTill",
    "clerk",
    "restrictions",
    "extRid",
    "mainTokenId",
    "mainTokenExtRid",
    "userAttrs",
    "userProps",
    "attachments",
    "rcMoratoriums",
    "toUnblockEmvPin",
    "toUpdateEmvTags",
    "toResetEmvAtc",
    "regInNetworkTypes",
    "terminalId",
    "fromBin",
    "toBin",
    "aliases"
})
@XmlSeeAlso({
    Login.class,
    Phone.class,
    Cert.class,
    ExtAuthApp.class,
    DeviceApp.class,
    Card.class
})
public abstract class Base {

    @XmlElementRef(name = "ContractId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contractId;
    @XmlElementRef(name = "ContractRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractRid;
    @XmlElementRef(name = "CreateContractTypeId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> createContractTypeId;
    @XmlElementRef(name = "CreateContractTypeRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createContractTypeRid;
    @XmlElementRef(name = "CreateContractClientId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> createContractClientId;
    @XmlElementRef(name = "CreateContractClientRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createContractClientRid;
    @XmlElement(name = "CreateContractOutLinks")
    protected Base.CreateContractOutLinks createContractOutLinks;
    @XmlElementRef(name = "ProfileId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> profileId;
    @XmlElement(name = "ProfileRid")
    protected String profileRid;
    @XmlElementRef(name = "ProductId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> productId;
    @XmlElement(name = "ProductRid")
    protected String productRid;
    @XmlElementRef(name = "LifePhaseId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lifePhaseId;
    @XmlElement(name = "LifePhaseRid")
    protected String lifePhaseRid;
    @XmlElementRef(name = "InitialLifePhaseId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> initialLifePhaseId;
    @XmlElementRef(name = "PackageId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> packageId;
    @XmlElementRef(name = "SeqInPackage", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> seqInPackage;
    @XmlElementRef(name = "CurBranchId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> curBranchId;
    @XmlElementRef(name = "CurBranchCode", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> curBranchCode;
    @XmlElementRef(name = "CurBranchName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curBranchName;
    @XmlElementRef(name = "DeliveryBranchId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deliveryBranchId;
    @XmlElementRef(name = "ProlongExpDays", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prolongExpDays;
    @XmlElementRef(name = "DeliveryBranchCode", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deliveryBranchCode;
    @XmlElementRef(name = "DeliveryBranchName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryBranchName;
    @XmlElementRef(name = "DeliveryAddress", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> deliveryAddress;
    @XmlElement(name = "TemplateTokenId")
    protected Long templateTokenId;
    @XmlElement(name = "TemplateTokenExtRid")
    protected String templateTokenExtRid;
    @XmlElement(name = "IsReplacement")
    protected Boolean isReplacement;
    @XmlElement(name = "EtuNewChain")
    protected Boolean etuNewChain;
    @XmlElement(name = "EtuOptout")
    protected Boolean etuOptout;
    @XmlElement(name = "KeepPan")
    protected Boolean keepPan;
    @XmlElement(name = "KeepPin")
    protected Boolean keepPin;
    @XmlElement(name = "KeepLimits")
    protected Boolean keepLimits;
    @XmlElement(name = "KeepExtRid")
    protected Boolean keepExtRid;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "InitialStatus")
    protected String initialStatus;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDay;
    @XmlElementRef(name = "ActivateTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateTime;
    @XmlElementRef(name = "ActivateDay", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateDay;
    @XmlElementRef(name = "ActivateUserName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activateUserName;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElementRef(name = "CloseDay", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeDay;
    @XmlElementRef(name = "LastStatusChangeTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastStatusChangeTime;
    @XmlElementRef(name = "LastStatusChangeDay", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastStatusChangeDay;
    @XmlElementRef(name = "ValidTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validTime;
    @XmlElementRef(name = "ExpTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expTime;
    @XmlElementRef(name = "RiskLevel", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevel;
    @XmlElementRef(name = "TmpDisableRestrictions", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tmpDisableRestrictions;
    @XmlElementRef(name = "TmpDisableAuth", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tmpDisableAuth;
    @XmlElementRef(name = "PwdHash", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> pwdHash;
    @XmlElement(name = "PwdHashCrypt")
    protected AppEncryptedData pwdHashCrypt;
    @XmlElement(name = "PwdUsagesLeft")
    protected Long pwdUsagesLeft;
    @XmlElement(name = "PwdExpirationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pwdExpirationTime;
    @XmlElementRef(name = "InvalidSecretTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidSecretTriesCnt;
    @XmlElementRef(name = "InvalidCallbackTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidCallbackTriesCnt;
    @XmlElementRef(name = "InvalidAnswerTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidAnswerTriesCnt;
    @XmlElementRef(name = "SecretEnabledTill", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> secretEnabledTill;
    @XmlElementRef(name = "Clerk", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clerk;
    @XmlElement(name = "Restrictions")
    protected Base.Restrictions restrictions;
    @XmlElementRef(name = "ExtRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRid;
    @XmlElementRef(name = "MainTokenId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mainTokenId;
    @XmlElementRef(name = "MainTokenExtRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainTokenExtRid;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElementRef(name = "UserProps", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserProps> userProps;
    @XmlElement(name = "Attachments")
    protected Attachments attachments;
    @XmlElementRef(name = "RcMoratoriums", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RcMoratoriums> rcMoratoriums;
    @XmlElement(name = "ToUnblockEmvPin")
    protected Boolean toUnblockEmvPin;
    @XmlElement(name = "ToUpdateEmvTags")
    protected Boolean toUpdateEmvTags;
    @XmlElement(name = "ToResetEmvAtc")
    protected Boolean toResetEmvAtc;
    @XmlElementRef(name = "RegInNetworkTypes", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Base.RegInNetworkTypes> regInNetworkTypes;
    @XmlElementRef(name = "TerminalId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> terminalId;
    @XmlElement(name = "FromBin")
    protected String fromBin;
    @XmlElement(name = "ToBin")
    protected String toBin;
    @XmlElement(name = "Aliases")
    protected Base.Aliases aliases;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContractId(JAXBElement<Long> value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractRid() {
        return contractRid;
    }

    /**
     * Sets the value of the contractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractRid(JAXBElement<String> value) {
        this.contractRid = value;
    }

    /**
     * Gets the value of the createContractTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreateContractTypeId() {
        return createContractTypeId;
    }

    /**
     * Sets the value of the createContractTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreateContractTypeId(JAXBElement<Long> value) {
        this.createContractTypeId = value;
    }

    /**
     * Gets the value of the createContractTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateContractTypeRid() {
        return createContractTypeRid;
    }

    /**
     * Sets the value of the createContractTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateContractTypeRid(JAXBElement<String> value) {
        this.createContractTypeRid = value;
    }

    /**
     * Gets the value of the createContractClientId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreateContractClientId() {
        return createContractClientId;
    }

    /**
     * Sets the value of the createContractClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreateContractClientId(JAXBElement<Long> value) {
        this.createContractClientId = value;
    }

    /**
     * Gets the value of the createContractClientRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateContractClientRid() {
        return createContractClientRid;
    }

    /**
     * Sets the value of the createContractClientRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateContractClientRid(JAXBElement<String> value) {
        this.createContractClientRid = value;
    }

    /**
     * Gets the value of the createContractOutLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Base.CreateContractOutLinks }
     *     
     */
    public Base.CreateContractOutLinks getCreateContractOutLinks() {
        return createContractOutLinks;
    }

    /**
     * Sets the value of the createContractOutLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base.CreateContractOutLinks }
     *     
     */
    public void setCreateContractOutLinks(Base.CreateContractOutLinks value) {
        this.createContractOutLinks = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProfileId(JAXBElement<Long> value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the profileRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileRid() {
        return profileRid;
    }

    /**
     * Sets the value of the profileRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileRid(String value) {
        this.profileRid = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProductId(JAXBElement<Long> value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRid() {
        return productRid;
    }

    /**
     * Sets the value of the productRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRid(String value) {
        this.productRid = value;
    }

    /**
     * Gets the value of the lifePhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLifePhaseId() {
        return lifePhaseId;
    }

    /**
     * Sets the value of the lifePhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLifePhaseId(JAXBElement<Long> value) {
        this.lifePhaseId = value;
    }

    /**
     * Gets the value of the lifePhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifePhaseRid() {
        return lifePhaseRid;
    }

    /**
     * Sets the value of the lifePhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifePhaseRid(String value) {
        this.lifePhaseRid = value;
    }

    /**
     * Gets the value of the initialLifePhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInitialLifePhaseId() {
        return initialLifePhaseId;
    }

    /**
     * Sets the value of the initialLifePhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInitialLifePhaseId(JAXBElement<Long> value) {
        this.initialLifePhaseId = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPackageId(JAXBElement<Long> value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the seqInPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSeqInPackage() {
        return seqInPackage;
    }

    /**
     * Sets the value of the seqInPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSeqInPackage(JAXBElement<Long> value) {
        this.seqInPackage = value;
    }

    /**
     * Gets the value of the curBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurBranchId() {
        return curBranchId;
    }

    /**
     * Sets the value of the curBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurBranchId(JAXBElement<Long> value) {
        this.curBranchId = value;
    }

    /**
     * Gets the value of the curBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurBranchCode() {
        return curBranchCode;
    }

    /**
     * Sets the value of the curBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurBranchCode(JAXBElement<Long> value) {
        this.curBranchCode = value;
    }

    /**
     * Gets the value of the curBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurBranchName() {
        return curBranchName;
    }

    /**
     * Sets the value of the curBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurBranchName(JAXBElement<String> value) {
        this.curBranchName = value;
    }

    /**
     * Gets the value of the deliveryBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeliveryBranchId() {
        return deliveryBranchId;
    }

    /**
     * Sets the value of the deliveryBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeliveryBranchId(JAXBElement<Long> value) {
        this.deliveryBranchId = value;
    }

    /**
     * Gets the value of the prolongExpDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProlongExpDays() {
        return prolongExpDays;
    }

    /**
     * Sets the value of the prolongExpDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProlongExpDays(JAXBElement<Long> value) {
        this.prolongExpDays = value;
    }

    /**
     * Gets the value of the deliveryBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeliveryBranchCode() {
        return deliveryBranchCode;
    }

    /**
     * Sets the value of the deliveryBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeliveryBranchCode(JAXBElement<Long> value) {
        this.deliveryBranchCode = value;
    }

    /**
     * Gets the value of the deliveryBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryBranchName() {
        return deliveryBranchName;
    }

    /**
     * Sets the value of the deliveryBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryBranchName(JAXBElement<String> value) {
        this.deliveryBranchName = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setDeliveryAddress(JAXBElement<MailAddress> value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the templateTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateTokenId() {
        return templateTokenId;
    }

    /**
     * Sets the value of the templateTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateTokenId(Long value) {
        this.templateTokenId = value;
    }

    /**
     * Gets the value of the templateTokenExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateTokenExtRid() {
        return templateTokenExtRid;
    }

    /**
     * Sets the value of the templateTokenExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateTokenExtRid(String value) {
        this.templateTokenExtRid = value;
    }

    /**
     * Gets the value of the isReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReplacement() {
        return isReplacement;
    }

    /**
     * Sets the value of the isReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReplacement(Boolean value) {
        this.isReplacement = value;
    }

    /**
     * Gets the value of the etuNewChain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEtuNewChain() {
        return etuNewChain;
    }

    /**
     * Sets the value of the etuNewChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEtuNewChain(Boolean value) {
        this.etuNewChain = value;
    }

    /**
     * Gets the value of the etuOptout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEtuOptout() {
        return etuOptout;
    }

    /**
     * Sets the value of the etuOptout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEtuOptout(Boolean value) {
        this.etuOptout = value;
    }

    /**
     * Gets the value of the keepPan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepPan() {
        return keepPan;
    }

    /**
     * Sets the value of the keepPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepPan(Boolean value) {
        this.keepPan = value;
    }

    /**
     * Gets the value of the keepPin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepPin() {
        return keepPin;
    }

    /**
     * Sets the value of the keepPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepPin(Boolean value) {
        this.keepPin = value;
    }

    /**
     * Gets the value of the keepLimits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepLimits() {
        return keepLimits;
    }

    /**
     * Sets the value of the keepLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepLimits(Boolean value) {
        this.keepLimits = value;
    }

    /**
     * Gets the value of the keepExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepExtRid() {
        return keepExtRid;
    }

    /**
     * Sets the value of the keepExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepExtRid(Boolean value) {
        this.keepExtRid = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
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
     * Gets the value of the initialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialStatus() {
        return initialStatus;
    }

    /**
     * Sets the value of the initialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialStatus(String value) {
        this.initialStatus = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDay() {
        return createDay;
    }

    /**
     * Sets the value of the createDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDay(XMLGregorianCalendar value) {
        this.createDay = value;
    }

    /**
     * Gets the value of the activateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateTime() {
        return activateTime;
    }

    /**
     * Sets the value of the activateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.activateTime = value;
    }

    /**
     * Gets the value of the activateDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateDay() {
        return activateDay;
    }

    /**
     * Sets the value of the activateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateDay(JAXBElement<XMLGregorianCalendar> value) {
        this.activateDay = value;
    }

    /**
     * Gets the value of the activateUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivateUserName() {
        return activateUserName;
    }

    /**
     * Sets the value of the activateUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivateUserName(JAXBElement<String> value) {
        this.activateUserName = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the closeDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseDay() {
        return closeDay;
    }

    /**
     * Sets the value of the closeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseDay(JAXBElement<XMLGregorianCalendar> value) {
        this.closeDay = value;
    }

    /**
     * Gets the value of the lastStatusChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastStatusChangeTime() {
        return lastStatusChangeTime;
    }

    /**
     * Sets the value of the lastStatusChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastStatusChangeTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastStatusChangeTime = value;
    }

    /**
     * Gets the value of the lastStatusChangeDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastStatusChangeDay() {
        return lastStatusChangeDay;
    }

    /**
     * Sets the value of the lastStatusChangeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastStatusChangeDay(JAXBElement<XMLGregorianCalendar> value) {
        this.lastStatusChangeDay = value;
    }

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidTime(JAXBElement<XMLGregorianCalendar> value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRiskLevel(JAXBElement<Long> value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the tmpDisableRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTmpDisableRestrictions() {
        return tmpDisableRestrictions;
    }

    /**
     * Sets the value of the tmpDisableRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTmpDisableRestrictions(JAXBElement<Boolean> value) {
        this.tmpDisableRestrictions = value;
    }

    /**
     * Gets the value of the tmpDisableAuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTmpDisableAuth() {
        return tmpDisableAuth;
    }

    /**
     * Sets the value of the tmpDisableAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTmpDisableAuth(JAXBElement<Boolean> value) {
        this.tmpDisableAuth = value;
    }

    /**
     * Gets the value of the pwdHash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPwdHash() {
        return pwdHash;
    }

    /**
     * Sets the value of the pwdHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPwdHash(JAXBElement<byte[]> value) {
        this.pwdHash = value;
    }

    /**
     * Gets the value of the pwdHashCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getPwdHashCrypt() {
        return pwdHashCrypt;
    }

    /**
     * Sets the value of the pwdHashCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setPwdHashCrypt(AppEncryptedData value) {
        this.pwdHashCrypt = value;
    }

    /**
     * Gets the value of the pwdUsagesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPwdUsagesLeft() {
        return pwdUsagesLeft;
    }

    /**
     * Sets the value of the pwdUsagesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPwdUsagesLeft(Long value) {
        this.pwdUsagesLeft = value;
    }

    /**
     * Gets the value of the pwdExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPwdExpirationTime() {
        return pwdExpirationTime;
    }

    /**
     * Sets the value of the pwdExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPwdExpirationTime(XMLGregorianCalendar value) {
        this.pwdExpirationTime = value;
    }

    /**
     * Gets the value of the invalidSecretTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidSecretTriesCnt() {
        return invalidSecretTriesCnt;
    }

    /**
     * Sets the value of the invalidSecretTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidSecretTriesCnt(JAXBElement<Long> value) {
        this.invalidSecretTriesCnt = value;
    }

    /**
     * Gets the value of the invalidCallbackTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidCallbackTriesCnt() {
        return invalidCallbackTriesCnt;
    }

    /**
     * Sets the value of the invalidCallbackTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidCallbackTriesCnt(JAXBElement<Long> value) {
        this.invalidCallbackTriesCnt = value;
    }

    /**
     * Gets the value of the invalidAnswerTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidAnswerTriesCnt() {
        return invalidAnswerTriesCnt;
    }

    /**
     * Sets the value of the invalidAnswerTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidAnswerTriesCnt(JAXBElement<Long> value) {
        this.invalidAnswerTriesCnt = value;
    }

    /**
     * Gets the value of the secretEnabledTill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSecretEnabledTill() {
        return secretEnabledTill;
    }

    /**
     * Sets the value of the secretEnabledTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSecretEnabledTill(JAXBElement<XMLGregorianCalendar> value) {
        this.secretEnabledTill = value;
    }

    /**
     * Gets the value of the clerk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClerk() {
        return clerk;
    }

    /**
     * Sets the value of the clerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClerk(JAXBElement<String> value) {
        this.clerk = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Base.Restrictions }
     *     
     */
    public Base.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base.Restrictions }
     *     
     */
    public void setRestrictions(Base.Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the extRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRid() {
        return extRid;
    }

    /**
     * Sets the value of the extRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRid(JAXBElement<String> value) {
        this.extRid = value;
    }

    /**
     * Gets the value of the mainTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMainTokenId() {
        return mainTokenId;
    }

    /**
     * Sets the value of the mainTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMainTokenId(JAXBElement<Long> value) {
        this.mainTokenId = value;
    }

    /**
     * Gets the value of the mainTokenExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainTokenExtRid() {
        return mainTokenExtRid;
    }

    /**
     * Sets the value of the mainTokenExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainTokenExtRid(JAXBElement<String> value) {
        this.mainTokenExtRid = value;
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
     * Gets the value of the userProps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public JAXBElement<UserProps> getUserProps() {
        return userProps;
    }

    /**
     * Sets the value of the userProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public void setUserProps(JAXBElement<UserProps> value) {
        this.userProps = value;
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
     * Gets the value of the rcMoratoriums property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     *     
     */
    public JAXBElement<RcMoratoriums> getRcMoratoriums() {
        return rcMoratoriums;
    }

    /**
     * Sets the value of the rcMoratoriums property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     *     
     */
    public void setRcMoratoriums(JAXBElement<RcMoratoriums> value) {
        this.rcMoratoriums = value;
    }

    /**
     * Gets the value of the toUnblockEmvPin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToUnblockEmvPin() {
        return toUnblockEmvPin;
    }

    /**
     * Sets the value of the toUnblockEmvPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToUnblockEmvPin(Boolean value) {
        this.toUnblockEmvPin = value;
    }

    /**
     * Gets the value of the toUpdateEmvTags property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToUpdateEmvTags() {
        return toUpdateEmvTags;
    }

    /**
     * Sets the value of the toUpdateEmvTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToUpdateEmvTags(Boolean value) {
        this.toUpdateEmvTags = value;
    }

    /**
     * Gets the value of the toResetEmvAtc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToResetEmvAtc() {
        return toResetEmvAtc;
    }

    /**
     * Sets the value of the toResetEmvAtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToResetEmvAtc(Boolean value) {
        this.toResetEmvAtc = value;
    }

    /**
     * Gets the value of the regInNetworkTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Base.RegInNetworkTypes }{@code >}
     *     
     */
    public JAXBElement<Base.RegInNetworkTypes> getRegInNetworkTypes() {
        return regInNetworkTypes;
    }

    /**
     * Sets the value of the regInNetworkTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Base.RegInNetworkTypes }{@code >}
     *     
     */
    public void setRegInNetworkTypes(JAXBElement<Base.RegInNetworkTypes> value) {
        this.regInNetworkTypes = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTerminalId(JAXBElement<Long> value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the fromBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBin() {
        return fromBin;
    }

    /**
     * Sets the value of the fromBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBin(String value) {
        this.fromBin = value;
    }

    /**
     * Gets the value of the toBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBin() {
        return toBin;
    }

    /**
     * Sets the value of the toBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBin(String value) {
        this.toBin = value;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * @return
     *     possible object is
     *     {@link Base.Aliases }
     *     
     */
    public Base.Aliases getAliases() {
        return aliases;
    }

    /**
     * Sets the value of the aliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base.Aliases }
     *     
     */
    public void setAliases(Base.Aliases value) {
        this.aliases = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenAlias" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "alias"
    })
    public static class Aliases {

        @XmlElement(name = "Alias")
        protected List<TokenAlias> alias;

        /**
         * Gets the value of the alias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TokenAlias }
         * 
         * 
         */
        public List<TokenAlias> getAlias() {
            if (alias == null) {
                alias = new ArrayList<TokenAlias>();
            }
            return this.alias;
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
     *         &lt;element name="Link" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}OutLink" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "link"
    })
    public static class CreateContractOutLinks {

        @XmlElement(name = "Link")
        protected List<OutLink> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OutLink }
         * 
         * 
         */
        public List<OutLink> getLink() {
            if (link == null) {
                link = new ArrayList<OutLink>();
            }
            return this.link;
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
     *         &lt;element name="NetworkType" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}NetworkType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "networkType"
    })
    public static class RegInNetworkTypes {

        @XmlElement(name = "NetworkType")
        protected List<String> networkType;

        /**
         * Gets the value of the networkType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNetworkType() {
            if (networkType == null) {
                networkType = new ArrayList<String>();
            }
            return this.networkType;
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
     *         &lt;element name="Restriction" type="{http://schemas.tranzaxis.com/restricting-admin.xsd}Restriction" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "restriction"
    })
    public static class Restrictions {

        @XmlElement(name = "Restriction")
        protected List<Restriction> restriction;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the restriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Restriction }
         * 
         * 
         */
        public List<Restriction> getRestriction() {
            if (restriction == null) {
                restriction = new ArrayList<Restriction>();
            }
            return this.restriction;
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
            return mode;
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
