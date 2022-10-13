
package com.tranzaxis.schemas.contracts_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.common_types.Tranches;
import com.tranzaxis.schemas.contracts_shadow_admin.ShadowContractExt;
import com.tranzaxis.schemas.contracts_strategy.Strategy;
import com.tranzaxis.schemas.contracts_strategy.StrategyTypeList;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import com.tranzaxis.schemas.restricting_admin.Restriction;
import com.tranzaxis.schemas.tran_common.ContractStatements;
import org.radixware.schemas.common.UserProps;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractStatements" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractStatements" minOccurs="0"/&gt;
 *         &lt;element name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InstCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TypeExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ClientRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ClientInstId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RiskLevel" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ProfileExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ConclusionDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ConclusionUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ReconclusionDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReconclusionUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TariffPlans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TariffPlan" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}ContractTariffPlan"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OutLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}OutLink"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}Link"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Seq2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Contract1Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LinkedSubjects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Link" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="RcMoratoriums" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcMoratoriums" minOccurs="0"/&gt;
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
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="UserProps" type="{http://schemas.radixware.org/common.xsd}UserProps" minOccurs="0"/&gt;
 *         &lt;element name="Accounts" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}Accounts" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.tranzaxis.com/common-types.xsd}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MainCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CasGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CasGuidMap" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}CasGuidMap" minOccurs="0"/&gt;
 *         &lt;element name="FinishDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinishUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UsageRestriction" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastUsageRestrictionChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUsageRestrictionChangeUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TokensDeliveryBranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="StrategyTypes" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyTypeList" minOccurs="0"/&gt;
 *         &lt;element name="StatementTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="StatementChannelId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="StatementLangCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StatementAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="CardPanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="Tranches" type="{http://schemas.tranzaxis.com/common-types.xsd}Tranches" minOccurs="0"/&gt;
 *         &lt;element name="TrancheFixedBalances" type="{http://schemas.tranzaxis.com/common-types.xsd}Tranches" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LoginName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CardPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CardMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CardExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="AccountNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AccountExtNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PrototypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PrototypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlSeeAlso({Ext.class, ShadowContractExt.class})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "contractStatements",
    "classGuid",
    "instCode",
    "branchId",
    "branchName",
    "branchCode",
    "typeId",
    "typeRid",
    "typeExtGuid",
    "clientId",
    "clientRid",
    "clientInstId",
    "title",
    "status",
    "riskLevel",
    "profileId",
    "profileRid",
    "profileExtGuid",
    "createTime",
    "createDay",
    "createUserName",
    "activateTime",
    "activateDay",
    "activateUserName",
    "conclusionDay",
    "conclusionUserName",
    "reconclusionDay",
    "reconclusionUserName",
    "closeTime",
    "closeDay",
    "closeUserName",
    "notes",
    "tariffPlans",
    "outLinks",
    "inLinks",
    "linkedSubjects",
    "restrictions",
    "rcMoratoriums",
    "strategies",
    "userAttrs",
    "userProps",
    "accounts",
    "attachments",
    "ext",
    "mainCcy",
    "casGuid",
    "casGuidMap",
    "finishDay",
    "finishUserName",
    "usageRestriction",
    "lastUsageRestrictionChangeTime",
    "lastUsageRestrictionChangeUserName",
    "tokensDeliveryBranchId",
    "strategyTypes",
    "statementTypeId",
    "statementChannelId",
    "statementLangCode",
    "statementAddress",
    "cardPanCrypt",
    "tranches",
    "trancheFixedBalances"
})
public class Contract {

    @XmlElement(name = "ContractStatements")
    protected ContractStatements contractStatements;
    @XmlElement(name = "ClassGuid")
    protected String classGuid;
    @XmlElementRef(name = "InstCode", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> instCode;
    @XmlElementRef(name = "BranchId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> branchId;
    @XmlElementRef(name = "BranchName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchName;
    @XmlElementRef(name = "BranchCode", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> branchCode;
    @XmlElementRef(name = "TypeId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> typeId;
    @XmlElementRef(name = "TypeRid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeRid;
    @XmlElementRef(name = "TypeExtGuid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeExtGuid;
    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "ClientRid")
    protected String clientRid;
    @XmlElement(name = "ClientInstId")
    protected Long clientInstId;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "RiskLevel", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevel;
    @XmlElementRef(name = "ProfileId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> profileId;
    @XmlElementRef(name = "ProfileRid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileRid;
    @XmlElementRef(name = "ProfileExtGuid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileExtGuid;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDay;
    @XmlElementRef(name = "CreateUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createUserName;
    @XmlElementRef(name = "ActivateTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateTime;
    @XmlElementRef(name = "ActivateDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateDay;
    @XmlElementRef(name = "ActivateUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activateUserName;
    @XmlElementRef(name = "ConclusionDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> conclusionDay;
    @XmlElementRef(name = "ConclusionUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conclusionUserName;
    @XmlElementRef(name = "ReconclusionDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reconclusionDay;
    @XmlElementRef(name = "ReconclusionUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reconclusionUserName;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElementRef(name = "CloseDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeDay;
    @XmlElementRef(name = "CloseUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closeUserName;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "TariffPlans", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Contract.TariffPlans> tariffPlans;
    @XmlElement(name = "OutLinks")
    protected Contract.OutLinks outLinks;
    @XmlElement(name = "InLinks")
    protected Contract.InLinks inLinks;
    @XmlElement(name = "LinkedSubjects")
    protected Contract.LinkedSubjects linkedSubjects;
    @XmlElement(name = "Restrictions")
    protected Contract.Restrictions restrictions;
    @XmlElementRef(name = "RcMoratoriums", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RcMoratoriums> rcMoratoriums;
    @XmlElement(name = "Strategies")
    protected Contract.Strategies strategies;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElementRef(name = "UserProps", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserProps> userProps;
    @XmlElement(name = "Accounts")
    protected Accounts accounts;
    @XmlElement(name = "Attachments")
    protected Attachments attachments;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlElement(name = "MainCcy")
    protected Long mainCcy;
    @XmlElementRef(name = "CasGuid", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> casGuid;
    @XmlElement(name = "CasGuidMap")
    protected CasGuidMap casGuidMap;
    @XmlElementRef(name = "FinishDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishDay;
    @XmlElementRef(name = "FinishUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> finishUserName;
    @XmlElementRef(name = "UsageRestriction", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usageRestriction;
    @XmlElementRef(name = "LastUsageRestrictionChangeTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUsageRestrictionChangeTime;
    @XmlElementRef(name = "LastUsageRestrictionChangeUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUsageRestrictionChangeUserName;
    @XmlElementRef(name = "TokensDeliveryBranchId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tokensDeliveryBranchId;
    @XmlElement(name = "StrategyTypes")
    protected StrategyTypeList strategyTypes;
    @XmlElementRef(name = "StatementTypeId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> statementTypeId;
    @XmlElementRef(name = "StatementChannelId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> statementChannelId;
    @XmlElementRef(name = "StatementLangCode", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statementLangCode;
    @XmlElementRef(name = "StatementAddress", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> statementAddress;
    @XmlElement(name = "CardPanCrypt")
    protected AppEncryptedData cardPanCrypt;
    @XmlElement(name = "Tranches")
    protected Tranches tranches;
    @XmlElement(name = "TrancheFixedBalances")
    protected Tranches trancheFixedBalances;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "InstName")
    protected String instName;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "ExtRid")
    protected String extRid;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "TokenId")
    protected Long tokenId;
    @XmlAttribute(name = "TokenExtRid")
    protected String tokenExtRid;
    @XmlAttribute(name = "LoginName")
    protected String loginName;
    @XmlAttribute(name = "CardPan")
    protected String cardPan;
    @XmlAttribute(name = "CardMbr")
    protected Long cardMbr;
    @XmlAttribute(name = "CardExpDate")
    protected XMLGregorianCalendar cardExpDate;
    @XmlAttribute(name = "AccountNum")
    protected String accountNum;
    @XmlAttribute(name = "AccountExtNum")
    protected String accountExtNum;
    @XmlAttribute(name = "PrototypeRid")
    protected String prototypeRid;
    @XmlAttribute(name = "PrototypeId")
    protected Long prototypeId;

    /**
     * Gets the value of the contractStatements property.
     * 
     * @return
     *     possible object is
     *     {@link ContractStatements }
     *     
     */
    public ContractStatements getContractStatements() {
        return contractStatements;
    }

    /**
     * Sets the value of the contractStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractStatements }
     *     
     */
    public void setContractStatements(ContractStatements value) {
        this.contractStatements = value;
    }

    /**
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
    }

    /**
     * Gets the value of the instCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInstCode() {
        return instCode;
    }

    /**
     * Sets the value of the instCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInstCode(JAXBElement<Long> value) {
        this.instCode = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBranchId(JAXBElement<Long> value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchName(JAXBElement<String> value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBranchCode(JAXBElement<Long> value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<Long> value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeRid(JAXBElement<String> value) {
        this.typeRid = value;
    }

    /**
     * Gets the value of the typeExtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeExtGuid() {
        return typeExtGuid;
    }

    /**
     * Sets the value of the typeExtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeExtGuid(JAXBElement<String> value) {
        this.typeExtGuid = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRid() {
        return clientRid;
    }

    /**
     * Sets the value of the clientRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRid(String value) {
        this.clientRid = value;
    }

    /**
     * Gets the value of the clientInstId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientInstId() {
        return clientInstId;
    }

    /**
     * Sets the value of the clientInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientInstId(Long value) {
        this.clientInstId = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileRid() {
        return profileRid;
    }

    /**
     * Sets the value of the profileRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileRid(JAXBElement<String> value) {
        this.profileRid = value;
    }

    /**
     * Gets the value of the profileExtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileExtGuid() {
        return profileExtGuid;
    }

    /**
     * Sets the value of the profileExtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileExtGuid(JAXBElement<String> value) {
        this.profileExtGuid = value;
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
     * Gets the value of the createUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateUserName() {
        return createUserName;
    }

    /**
     * Sets the value of the createUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateUserName(JAXBElement<String> value) {
        this.createUserName = value;
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
     * Gets the value of the conclusionDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConclusionDay() {
        return conclusionDay;
    }

    /**
     * Sets the value of the conclusionDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConclusionDay(JAXBElement<XMLGregorianCalendar> value) {
        this.conclusionDay = value;
    }

    /**
     * Gets the value of the conclusionUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConclusionUserName() {
        return conclusionUserName;
    }

    /**
     * Sets the value of the conclusionUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConclusionUserName(JAXBElement<String> value) {
        this.conclusionUserName = value;
    }

    /**
     * Gets the value of the reconclusionDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReconclusionDay() {
        return reconclusionDay;
    }

    /**
     * Sets the value of the reconclusionDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReconclusionDay(JAXBElement<XMLGregorianCalendar> value) {
        this.reconclusionDay = value;
    }

    /**
     * Gets the value of the reconclusionUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReconclusionUserName() {
        return reconclusionUserName;
    }

    /**
     * Sets the value of the reconclusionUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReconclusionUserName(JAXBElement<String> value) {
        this.reconclusionUserName = value;
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
     * Gets the value of the closeUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloseUserName() {
        return closeUserName;
    }

    /**
     * Sets the value of the closeUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloseUserName(JAXBElement<String> value) {
        this.closeUserName = value;
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
     * Gets the value of the tariffPlans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contract.TariffPlans }{@code >}
     *     
     */
    public JAXBElement<Contract.TariffPlans> getTariffPlans() {
        return tariffPlans;
    }

    /**
     * Sets the value of the tariffPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contract.TariffPlans }{@code >}
     *     
     */
    public void setTariffPlans(JAXBElement<Contract.TariffPlans> value) {
        this.tariffPlans = value;
    }

    /**
     * Gets the value of the outLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Contract.OutLinks }
     *     
     */
    public Contract.OutLinks getOutLinks() {
        return outLinks;
    }

    /**
     * Sets the value of the outLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract.OutLinks }
     *     
     */
    public void setOutLinks(Contract.OutLinks value) {
        this.outLinks = value;
    }

    /**
     * Gets the value of the inLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Contract.InLinks }
     *     
     */
    public Contract.InLinks getInLinks() {
        return inLinks;
    }

    /**
     * Sets the value of the inLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract.InLinks }
     *     
     */
    public void setInLinks(Contract.InLinks value) {
        this.inLinks = value;
    }

    /**
     * Gets the value of the linkedSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link Contract.LinkedSubjects }
     *     
     */
    public Contract.LinkedSubjects getLinkedSubjects() {
        return linkedSubjects;
    }

    /**
     * Sets the value of the linkedSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract.LinkedSubjects }
     *     
     */
    public void setLinkedSubjects(Contract.LinkedSubjects value) {
        this.linkedSubjects = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Contract.Restrictions }
     *     
     */
    public Contract.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract.Restrictions }
     *     
     */
    public void setRestrictions(Contract.Restrictions value) {
        this.restrictions = value;
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
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link Contract.Strategies }
     *     
     */
    public Contract.Strategies getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract.Strategies }
     *     
     */
    public void setStrategies(Contract.Strategies value) {
        this.strategies = value;
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
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setAccounts(Accounts value) {
        this.accounts = value;
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
     * Gets the value of the mainCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainCcy() {
        return mainCcy;
    }

    /**
     * Sets the value of the mainCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainCcy(Long value) {
        this.mainCcy = value;
    }

    /**
     * Gets the value of the casGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCasGuid() {
        return casGuid;
    }

    /**
     * Sets the value of the casGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCasGuid(JAXBElement<String> value) {
        this.casGuid = value;
    }

    /**
     * Gets the value of the casGuidMap property.
     * 
     * @return
     *     possible object is
     *     {@link CasGuidMap }
     *     
     */
    public CasGuidMap getCasGuidMap() {
        return casGuidMap;
    }

    /**
     * Sets the value of the casGuidMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasGuidMap }
     *     
     */
    public void setCasGuidMap(CasGuidMap value) {
        this.casGuidMap = value;
    }

    /**
     * Gets the value of the finishDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishDay() {
        return finishDay;
    }

    /**
     * Sets the value of the finishDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishDay(JAXBElement<XMLGregorianCalendar> value) {
        this.finishDay = value;
    }

    /**
     * Gets the value of the finishUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinishUserName() {
        return finishUserName;
    }

    /**
     * Sets the value of the finishUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinishUserName(JAXBElement<String> value) {
        this.finishUserName = value;
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
     * Gets the value of the lastUsageRestrictionChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUsageRestrictionChangeTime() {
        return lastUsageRestrictionChangeTime;
    }

    /**
     * Sets the value of the lastUsageRestrictionChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUsageRestrictionChangeTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUsageRestrictionChangeTime = value;
    }

    /**
     * Gets the value of the lastUsageRestrictionChangeUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUsageRestrictionChangeUserName() {
        return lastUsageRestrictionChangeUserName;
    }

    /**
     * Sets the value of the lastUsageRestrictionChangeUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUsageRestrictionChangeUserName(JAXBElement<String> value) {
        this.lastUsageRestrictionChangeUserName = value;
    }

    /**
     * Gets the value of the tokensDeliveryBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTokensDeliveryBranchId() {
        return tokensDeliveryBranchId;
    }

    /**
     * Sets the value of the tokensDeliveryBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTokensDeliveryBranchId(JAXBElement<Long> value) {
        this.tokensDeliveryBranchId = value;
    }

    /**
     * Gets the value of the strategyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyTypeList }
     *     
     */
    public StrategyTypeList getStrategyTypes() {
        return strategyTypes;
    }

    /**
     * Sets the value of the strategyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyTypeList }
     *     
     */
    public void setStrategyTypes(StrategyTypeList value) {
        this.strategyTypes = value;
    }

    /**
     * Gets the value of the statementTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStatementTypeId() {
        return statementTypeId;
    }

    /**
     * Sets the value of the statementTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStatementTypeId(JAXBElement<Long> value) {
        this.statementTypeId = value;
    }

    /**
     * Gets the value of the statementChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStatementChannelId() {
        return statementChannelId;
    }

    /**
     * Sets the value of the statementChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStatementChannelId(JAXBElement<Long> value) {
        this.statementChannelId = value;
    }

    /**
     * Gets the value of the statementLangCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatementLangCode() {
        return statementLangCode;
    }

    /**
     * Sets the value of the statementLangCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatementLangCode(JAXBElement<String> value) {
        this.statementLangCode = value;
    }

    /**
     * Gets the value of the statementAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getStatementAddress() {
        return statementAddress;
    }

    /**
     * Sets the value of the statementAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setStatementAddress(JAXBElement<MailAddress> value) {
        this.statementAddress = value;
    }

    /**
     * Gets the value of the cardPanCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getCardPanCrypt() {
        return cardPanCrypt;
    }

    /**
     * Sets the value of the cardPanCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setCardPanCrypt(AppEncryptedData value) {
        this.cardPanCrypt = value;
    }

    /**
     * Gets the value of the tranches property.
     * 
     * @return
     *     possible object is
     *     {@link Tranches }
     *     
     */
    public Tranches getTranches() {
        return tranches;
    }

    /**
     * Sets the value of the tranches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranches }
     *     
     */
    public void setTranches(Tranches value) {
        this.tranches = value;
    }

    /**
     * Gets the value of the trancheFixedBalances property.
     * 
     * @return
     *     possible object is
     *     {@link Tranches }
     *     
     */
    public Tranches getTrancheFixedBalances() {
        return trancheFixedBalances;
    }

    /**
     * Sets the value of the trancheFixedBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranches }
     *     
     */
    public void setTrancheFixedBalances(Tranches value) {
        this.trancheFixedBalances = value;
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
     * Gets the value of the extRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRid() {
        return extRid;
    }

    /**
     * Sets the value of the extRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRid(String value) {
        this.extRid = value;
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
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenId(Long value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the tokenExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenExtRid() {
        return tokenExtRid;
    }

    /**
     * Sets the value of the tokenExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenExtRid(String value) {
        this.tokenExtRid = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the cardPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPan() {
        return cardPan;
    }

    /**
     * Sets the value of the cardPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPan(String value) {
        this.cardPan = value;
    }

    /**
     * Gets the value of the cardMbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardMbr() {
        return cardMbr;
    }

    /**
     * Sets the value of the cardMbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardMbr(Long value) {
        this.cardMbr = value;
    }

    /**
     * Gets the value of the cardExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpDate() {
        return cardExpDate;
    }

    /**
     * Sets the value of the cardExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpDate(XMLGregorianCalendar value) {
        this.cardExpDate = value;
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
     * Gets the value of the prototypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrototypeRid() {
        return prototypeRid;
    }

    /**
     * Sets the value of the prototypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrototypeRid(String value) {
        this.prototypeRid = value;
    }

    /**
     * Gets the value of the prototypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrototypeId() {
        return prototypeId;
    }

    /**
     * Sets the value of the prototypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrototypeId(Long value) {
        this.prototypeId = value;
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
     *         &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}Link"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Seq2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Contract1Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/extension&gt;
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
        "link"
    })
    public static class InLinks {

        @XmlElement(name = "Link")
        protected List<Contract.InLinks.Link> link;

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
         * {@link Contract.InLinks.Link }
         * 
         * 
         */
        public List<Contract.InLinks.Link> getLink() {
            if (link == null) {
                link = new ArrayList<Contract.InLinks.Link>();
            }
            return this.link;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}Link"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Seq2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Contract1Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "seq2"
        })
        public static class Link
            extends com.tranzaxis.schemas.contracts_admin.Link
        {

            @XmlElementRef(name = "Seq2", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> seq2;
            @XmlAttribute(name = "Contract1Rid")
            protected String contract1Rid;

            /**
             * Gets the value of the seq2 property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getSeq2() {
                return seq2;
            }

            /**
             * Sets the value of the seq2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setSeq2(JAXBElement<Long> value) {
                this.seq2 = value;
            }

            /**
             * Gets the value of the contract1Rid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract1Rid() {
                return contract1Rid;
            }

            /**
             * Sets the value of the contract1Rid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract1Rid(String value) {
                this.contract1Rid = value;
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
     *         &lt;element name="Link" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}LinkedSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "link"
    })
    public static class LinkedSubjects {

        @XmlElement(name = "Link")
        protected List<LinkedSubject> link;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

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
         * {@link LinkedSubject }
         * 
         * 
         */
        public List<LinkedSubject> getLink() {
            if (link == null) {
                link = new ArrayList<LinkedSubject>();
            }
            return this.link;
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
     *         &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}OutLink"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "link"
    })
    public static class OutLinks {

        @XmlElement(name = "Link")
        protected List<Contract.OutLinks.Link> link;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

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
         * {@link Contract.OutLinks.Link }
         * 
         * 
         */
        public List<Contract.OutLinks.Link> getLink() {
            if (link == null) {
                link = new ArrayList<Contract.OutLinks.Link>();
            }
            return this.link;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}OutLink"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Link
            extends OutLink
        {


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
     *         &lt;element name="TariffPlan" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}ContractTariffPlan"&gt;
     *               &lt;/extension&gt;
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
        "tariffPlan"
    })
    public static class TariffPlans {

        @XmlElement(name = "TariffPlan")
        protected List<Contract.TariffPlans.TariffPlan> tariffPlan;

        /**
         * Gets the value of the tariffPlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariffPlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariffPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Contract.TariffPlans.TariffPlan }
         * 
         * 
         */
        public List<Contract.TariffPlans.TariffPlan> getTariffPlan() {
            if (tariffPlan == null) {
                tariffPlan = new ArrayList<Contract.TariffPlans.TariffPlan>();
            }
            return this.tariffPlan;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}ContractTariffPlan"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TariffPlan
            extends ContractTariffPlan
        {


        }

    }

}
