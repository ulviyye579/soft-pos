
package com.tranzaxis.schemas.tran_common;

import com.tranzaxis.schemas.common_types.ObjectFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustInfoRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfoRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TranListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PrevTranParams" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRq"&gt;
 *                           &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ForClientContracts" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ForClientTokens" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TranListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="StartRecordNo" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="HighBoundTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RecordCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RegDateFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="RegDateTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="TranKindDomain"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;enumeration value="Customer"/&gt;
 *                       &lt;enumeration value="Credit/Debit"/&gt;
 *                       &lt;enumeration value="Credit"/&gt;
 *                       &lt;enumeration value="Credit/Adjust"/&gt;
 *                       &lt;enumeration value="Debit"/&gt;
 *                       &lt;enumeration value="Debit/Adjust"/&gt;
 *                       &lt;enumeration value="Info"/&gt;
 *                       &lt;enumeration value="Info/Contract"/&gt;
 *                       &lt;enumeration value="Info/Token"/&gt;
 *                       &lt;enumeration value="Demand"/&gt;
 *                       &lt;enumeration value="Demand/Contract"/&gt;
 *                       &lt;enumeration value="Demant/Token"/&gt;
 *                       &lt;enumeration value="Demand/Terminal"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IncludeTranKinds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeTranKinds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IncludeTranCategoryCodes"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeTranCategoryCodes"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IncludeLifePhases"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranLifePhaseEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IncludeTranResults"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeTranResults"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludePresentedAuth" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ExcludeAuthPresentment" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ExcludeReversed" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="IncludeApprovalCodes"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeApprovalCodes"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TranSignum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FinancialImpact"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;enumeration value="Postings"/&gt;
 *                       &lt;enumeration value="Holds"/&gt;
 *                       &lt;enumeration value="PostingsOrHolds"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CustCurrencies"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CustAmtFrom" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="CustAmtTo" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="TermId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayeeListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ByTitle" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayeeListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ParentTopicRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="HasParams" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="NumericalParams" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="MaxParamCnt" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="HasVouchers" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="OrHasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="HasInvoices" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="OrHasInvoices" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="AutoTemplates" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="BillId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="BillRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Statuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}ContractBillStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="FromDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="FromPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="FromRegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToRegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="PayeeConsumerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayeeConsumerListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="PayeeConsumerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Statuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}PayeeConsumerStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApplicationContext" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Statement" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FormId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FromDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Report" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Params" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
 *                 &lt;attribute name="PubPid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ReportClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractPaymentSchedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Variant" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractPaymentScheduleVariantEnum" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TokenListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="IdTokenOnly" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="RefineAliasExtData" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ClosedContractsAllowed" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="BalanceHistoryFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="BalanceHistoryTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ForecastDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="OwnContracts" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ForIssuingContract" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ForVirtualCardCreation" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ContractTranCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TokenListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApplicationListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AttachmentIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TypeIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TerminalListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CoordLatitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="CoordLongitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TerminalListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="IncludeStatuses" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ExcludeStatuses" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MaxCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Types"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalTypeEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DispenseCurrencies"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DepositCurrencies"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MaxDistance" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InstitutionIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvoiceTypeFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InvoiceTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InvoiceTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvoiceFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InvoiceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InvoiceGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Statuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="FromDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="FromPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BranchListOpts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CoordLatitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="CoordLongitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BranchListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Capabilities" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Capability" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
 *                 &lt;attribute name="IncludeStatuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeStatuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IncludeKinds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchKindEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExcludeKinds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchKindEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="StartRecord" type="{http://schemas.radixware.org/types.xsd}Int" default="1" /&gt;
 *                 &lt;attribute name="RecordCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="IncludeCurrentlyOpened" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="MaxDistance" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InstitutionIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kinds"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranCustInfoKindEnum" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Language"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;length value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Country"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;length value="2"/&gt;
 *           &lt;/restriction&gt;
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
@XmlType(name = "CustInfoRq", propOrder = {
    "tranListOpts",
    "tranListFilter",
    "payeeListOpts",
    "payeeListFilter",
    "billListFilter",
    "payeeConsumerListFilter",
    "applicationContext",
    "statement",
    "report",
    "contractPaymentSchedule",
    "tokenListOpts",
    "contractListOpts",
    "tokenListFilter",
    "contractListFilter",
    "applicationListFilter",
    "terminalListOpts",
    "terminalListFilter",
    "invoiceTypeFilter",
    "invoiceFilter",
    "branchListOpts",
    "branchListFilter"
})
@XmlSeeAlso({
    CustInfoRq.TranListOpts.PrevTranParams.class
})
@XmlRootElement(name = "CustInfoRq")
public class CustInfoRq {

    @XmlElement(name = "TranListOpts")
    protected CustInfoRq.TranListOpts tranListOpts;
    @XmlElement(name = "TranListFilter")
    protected CustInfoRq.TranListFilter tranListFilter;
    @XmlElement(name = "PayeeListOpts")
    protected CustInfoRq.PayeeListOpts payeeListOpts;
    @XmlElement(name = "PayeeListFilter")
    protected CustInfoRq.PayeeListFilter payeeListFilter;
    @XmlElement(name = "BillListFilter")
    protected CustInfoRq.BillListFilter billListFilter;
    @XmlElement(name = "PayeeConsumerListFilter")
    protected CustInfoRq.PayeeConsumerListFilter payeeConsumerListFilter;
    @XmlElement(name = "ApplicationContext")
    protected CustInfoRq.ApplicationContext applicationContext;
    @XmlElement(name = "Statement")
    protected CustInfoRq.Statement statement;
    @XmlElement(name = "Report")
    protected CustInfoRq.Report report;
    @XmlElement(name = "ContractPaymentSchedule")
    protected CustInfoRq.ContractPaymentSchedule contractPaymentSchedule;
    @XmlElement(name = "TokenListOpts")
    protected CustInfoRq.TokenListOpts tokenListOpts;
    @XmlElement(name = "ContractListOpts")
    protected CustInfoRq.ContractListOpts contractListOpts;
    @XmlElement(name = "TokenListFilter")
    protected CustInfoRq.TokenListFilter tokenListFilter;
    @XmlElement(name = "ContractListFilter")
    protected CustInfoRq.ContractListFilter contractListFilter;
    @XmlElement(name = "ApplicationListFilter")
    protected CustInfoRq.ApplicationListFilter applicationListFilter;
    @XmlElement(name = "TerminalListOpts")
    protected CustInfoRq.TerminalListOpts terminalListOpts;
    @XmlElement(name = "TerminalListFilter")
    protected CustInfoRq.TerminalListFilter terminalListFilter;
    @XmlElement(name = "InvoiceTypeFilter")
    protected CustInfoRq.InvoiceTypeFilter invoiceTypeFilter;
    @XmlElement(name = "InvoiceFilter")
    protected CustInfoRq.InvoiceFilter invoiceFilter;
    @XmlElement(name = "BranchListOpts")
    protected CustInfoRq.BranchListOpts branchListOpts;
    @XmlElement(name = "BranchListFilter")
    protected CustInfoRq.BranchListFilter branchListFilter;
    @XmlAttribute(name = "Kinds")
    protected List<String> kinds;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "Country")
    protected String country;

    /**
     * Gets the value of the tranListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TranListOpts }
     *     
     */
    public CustInfoRq.TranListOpts getTranListOpts() {
        return tranListOpts;
    }

    /**
     * Sets the value of the tranListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TranListOpts }
     *     
     */
    public void setTranListOpts(CustInfoRq.TranListOpts value) {
        this.tranListOpts = value;
    }

    /**
     * Gets the value of the tranListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TranListFilter }
     *     
     */
    public CustInfoRq.TranListFilter getTranListFilter() {
        return tranListFilter;
    }

    /**
     * Sets the value of the tranListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TranListFilter }
     *     
     */
    public void setTranListFilter(CustInfoRq.TranListFilter value) {
        this.tranListFilter = value;
    }

    /**
     * Gets the value of the payeeListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.PayeeListOpts }
     *     
     */
    public CustInfoRq.PayeeListOpts getPayeeListOpts() {
        return payeeListOpts;
    }

    /**
     * Sets the value of the payeeListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.PayeeListOpts }
     *     
     */
    public void setPayeeListOpts(CustInfoRq.PayeeListOpts value) {
        this.payeeListOpts = value;
    }

    /**
     * Gets the value of the payeeListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.PayeeListFilter }
     *     
     */
    public CustInfoRq.PayeeListFilter getPayeeListFilter() {
        return payeeListFilter;
    }

    /**
     * Sets the value of the payeeListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.PayeeListFilter }
     *     
     */
    public void setPayeeListFilter(CustInfoRq.PayeeListFilter value) {
        this.payeeListFilter = value;
    }

    /**
     * Gets the value of the billListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.BillListFilter }
     *     
     */
    public CustInfoRq.BillListFilter getBillListFilter() {
        return billListFilter;
    }

    /**
     * Sets the value of the billListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.BillListFilter }
     *     
     */
    public void setBillListFilter(CustInfoRq.BillListFilter value) {
        this.billListFilter = value;
    }

    /**
     * Gets the value of the payeeConsumerListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.PayeeConsumerListFilter }
     *     
     */
    public CustInfoRq.PayeeConsumerListFilter getPayeeConsumerListFilter() {
        return payeeConsumerListFilter;
    }

    /**
     * Sets the value of the payeeConsumerListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.PayeeConsumerListFilter }
     *     
     */
    public void setPayeeConsumerListFilter(CustInfoRq.PayeeConsumerListFilter value) {
        this.payeeConsumerListFilter = value;
    }

    /**
     * Gets the value of the applicationContext property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.ApplicationContext }
     *     
     */
    public CustInfoRq.ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the value of the applicationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.ApplicationContext }
     *     
     */
    public void setApplicationContext(CustInfoRq.ApplicationContext value) {
        this.applicationContext = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.Statement }
     *     
     */
    public CustInfoRq.Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.Statement }
     *     
     */
    public void setStatement(CustInfoRq.Statement value) {
        this.statement = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.Report }
     *     
     */
    public CustInfoRq.Report getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.Report }
     *     
     */
    public void setReport(CustInfoRq.Report value) {
        this.report = value;
    }

    /**
     * Gets the value of the contractPaymentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.ContractPaymentSchedule }
     *     
     */
    public CustInfoRq.ContractPaymentSchedule getContractPaymentSchedule() {
        return contractPaymentSchedule;
    }

    /**
     * Sets the value of the contractPaymentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.ContractPaymentSchedule }
     *     
     */
    public void setContractPaymentSchedule(CustInfoRq.ContractPaymentSchedule value) {
        this.contractPaymentSchedule = value;
    }

    /**
     * Gets the value of the tokenListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TokenListOpts }
     *     
     */
    public CustInfoRq.TokenListOpts getTokenListOpts() {
        return tokenListOpts;
    }

    /**
     * Sets the value of the tokenListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TokenListOpts }
     *     
     */
    public void setTokenListOpts(CustInfoRq.TokenListOpts value) {
        this.tokenListOpts = value;
    }

    /**
     * Gets the value of the contractListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.ContractListOpts }
     *     
     */
    public CustInfoRq.ContractListOpts getContractListOpts() {
        return contractListOpts;
    }

    /**
     * Sets the value of the contractListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.ContractListOpts }
     *     
     */
    public void setContractListOpts(CustInfoRq.ContractListOpts value) {
        this.contractListOpts = value;
    }

    /**
     * Gets the value of the tokenListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TokenListFilter }
     *     
     */
    public CustInfoRq.TokenListFilter getTokenListFilter() {
        return tokenListFilter;
    }

    /**
     * Sets the value of the tokenListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TokenListFilter }
     *     
     */
    public void setTokenListFilter(CustInfoRq.TokenListFilter value) {
        this.tokenListFilter = value;
    }

    /**
     * Gets the value of the contractListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.ContractListFilter }
     *     
     */
    public CustInfoRq.ContractListFilter getContractListFilter() {
        return contractListFilter;
    }

    /**
     * Sets the value of the contractListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.ContractListFilter }
     *     
     */
    public void setContractListFilter(CustInfoRq.ContractListFilter value) {
        this.contractListFilter = value;
    }

    /**
     * Gets the value of the applicationListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.ApplicationListFilter }
     *     
     */
    public CustInfoRq.ApplicationListFilter getApplicationListFilter() {
        return applicationListFilter;
    }

    /**
     * Sets the value of the applicationListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.ApplicationListFilter }
     *     
     */
    public void setApplicationListFilter(CustInfoRq.ApplicationListFilter value) {
        this.applicationListFilter = value;
    }

    /**
     * Gets the value of the terminalListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TerminalListOpts }
     *     
     */
    public CustInfoRq.TerminalListOpts getTerminalListOpts() {
        return terminalListOpts;
    }

    /**
     * Sets the value of the terminalListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TerminalListOpts }
     *     
     */
    public void setTerminalListOpts(CustInfoRq.TerminalListOpts value) {
        this.terminalListOpts = value;
    }

    /**
     * Gets the value of the terminalListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.TerminalListFilter }
     *     
     */
    public CustInfoRq.TerminalListFilter getTerminalListFilter() {
        return terminalListFilter;
    }

    /**
     * Sets the value of the terminalListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.TerminalListFilter }
     *     
     */
    public void setTerminalListFilter(CustInfoRq.TerminalListFilter value) {
        this.terminalListFilter = value;
    }

    /**
     * Gets the value of the invoiceTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.InvoiceTypeFilter }
     *     
     */
    public CustInfoRq.InvoiceTypeFilter getInvoiceTypeFilter() {
        return invoiceTypeFilter;
    }

    /**
     * Sets the value of the invoiceTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.InvoiceTypeFilter }
     *     
     */
    public void setInvoiceTypeFilter(CustInfoRq.InvoiceTypeFilter value) {
        this.invoiceTypeFilter = value;
    }

    /**
     * Gets the value of the invoiceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.InvoiceFilter }
     *     
     */
    public CustInfoRq.InvoiceFilter getInvoiceFilter() {
        return invoiceFilter;
    }

    /**
     * Sets the value of the invoiceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.InvoiceFilter }
     *     
     */
    public void setInvoiceFilter(CustInfoRq.InvoiceFilter value) {
        this.invoiceFilter = value;
    }

    /**
     * Gets the value of the branchListOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.BranchListOpts }
     *     
     */
    public CustInfoRq.BranchListOpts getBranchListOpts() {
        return branchListOpts;
    }

    /**
     * Sets the value of the branchListOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.BranchListOpts }
     *     
     */
    public void setBranchListOpts(CustInfoRq.BranchListOpts value) {
        this.branchListOpts = value;
    }

    /**
     * Gets the value of the branchListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq.BranchListFilter }
     *     
     */
    public CustInfoRq.BranchListFilter getBranchListFilter() {
        return branchListFilter;
    }

    /**
     * Sets the value of the branchListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq.BranchListFilter }
     *     
     */
    public void setBranchListFilter(CustInfoRq.BranchListFilter value) {
        this.branchListFilter = value;
    }

    /**
     * Gets the value of the kinds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kinds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKinds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKinds() {
        if (kinds == null) {
            kinds = new ArrayList<String>();
        }
        return this.kinds;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicationContext {

        @XmlAttribute(name = "ContractId")
        protected Long contractId;
        @XmlAttribute(name = "TokenId")
        protected Long tokenId;

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
     *       &lt;attribute name="AttachmentIds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TypeIds"&gt;
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
    public static class ApplicationListFilter {

        @XmlAttribute(name = "AttachmentIds")
        protected List<Long> attachmentIds;
        @XmlAttribute(name = "TypeIds")
        protected List<Long> typeIds;

        /**
         * Gets the value of the attachmentIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachmentIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachmentIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getAttachmentIds() {
            if (attachmentIds == null) {
                attachmentIds = new ArrayList<Long>();
            }
            return this.attachmentIds;
        }

        /**
         * Gets the value of the typeIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTypeIds() {
            if (typeIds == null) {
                typeIds = new ArrayList<Long>();
            }
            return this.typeIds;
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
     *         &lt;element name="Payers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="BillId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="BillRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Statuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}ContractBillStatusEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="FromDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="FromPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="FromRegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToRegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="PayeeConsumerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payers"
    })
    public static class BillListFilter {

        @XmlElement(name = "Payers")
        protected CustInfoRq.BillListFilter.Payers payers;
        @XmlAttribute(name = "BillId")
        protected Long billId;
        @XmlAttribute(name = "BillRid")
        protected String billRid;
        @XmlAttribute(name = "Statuses")
        protected List<String> statuses;
        @XmlAttribute(name = "FromDueDate")
        protected XMLGregorianCalendar fromDueDate;
        @XmlAttribute(name = "ToDueDate")
        protected XMLGregorianCalendar toDueDate;
        @XmlAttribute(name = "FromPaidTime")
        protected XMLGregorianCalendar fromPaidTime;
        @XmlAttribute(name = "ToPaidTime")
        protected XMLGregorianCalendar toPaidTime;
        @XmlAttribute(name = "FromRegTime")
        protected XMLGregorianCalendar fromRegTime;
        @XmlAttribute(name = "ToRegTime")
        protected XMLGregorianCalendar toRegTime;
        @XmlAttribute(name = "PayeeConsumerId")
        protected Long payeeConsumerId;

        /**
         * Gets the value of the payers property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.BillListFilter.Payers }
         *     
         */
        public CustInfoRq.BillListFilter.Payers getPayers() {
            return payers;
        }

        /**
         * Sets the value of the payers property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.BillListFilter.Payers }
         *     
         */
        public void setPayers(CustInfoRq.BillListFilter.Payers value) {
            this.payers = value;
        }

        /**
         * Gets the value of the billId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBillId() {
            return billId;
        }

        /**
         * Sets the value of the billId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBillId(Long value) {
            this.billId = value;
        }

        /**
         * Gets the value of the billRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillRid() {
            return billRid;
        }

        /**
         * Sets the value of the billRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillRid(String value) {
            this.billRid = value;
        }

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
        }

        /**
         * Gets the value of the fromDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDueDate() {
            return fromDueDate;
        }

        /**
         * Sets the value of the fromDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDueDate(XMLGregorianCalendar value) {
            this.fromDueDate = value;
        }

        /**
         * Gets the value of the toDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDueDate() {
            return toDueDate;
        }

        /**
         * Sets the value of the toDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDueDate(XMLGregorianCalendar value) {
            this.toDueDate = value;
        }

        /**
         * Gets the value of the fromPaidTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromPaidTime() {
            return fromPaidTime;
        }

        /**
         * Sets the value of the fromPaidTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromPaidTime(XMLGregorianCalendar value) {
            this.fromPaidTime = value;
        }

        /**
         * Gets the value of the toPaidTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToPaidTime() {
            return toPaidTime;
        }

        /**
         * Sets the value of the toPaidTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToPaidTime(XMLGregorianCalendar value) {
            this.toPaidTime = value;
        }

        /**
         * Gets the value of the fromRegTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromRegTime() {
            return fromRegTime;
        }

        /**
         * Sets the value of the fromRegTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromRegTime(XMLGregorianCalendar value) {
            this.fromRegTime = value;
        }

        /**
         * Gets the value of the toRegTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToRegTime() {
            return toRegTime;
        }

        /**
         * Sets the value of the toRegTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToRegTime(XMLGregorianCalendar value) {
            this.toRegTime = value;
        }

        /**
         * Gets the value of the payeeConsumerId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPayeeConsumerId() {
            return payeeConsumerId;
        }

        /**
         * Sets the value of the payeeConsumerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPayeeConsumerId(Long value) {
            this.payeeConsumerId = value;
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
         *       &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Payers {

            @XmlAttribute(name = "Kind1")
            protected String kind1;
            @XmlAttribute(name = "Rid1")
            protected String rid1;
            @XmlAttribute(name = "Kind2")
            protected String kind2;
            @XmlAttribute(name = "Rid2")
            protected String rid2;

            /**
             * Gets the value of the kind1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind1() {
                return kind1;
            }

            /**
             * Sets the value of the kind1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind1(String value) {
                this.kind1 = value;
            }

            /**
             * Gets the value of the rid1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid1() {
                return rid1;
            }

            /**
             * Sets the value of the rid1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid1(String value) {
                this.rid1 = value;
            }

            /**
             * Gets the value of the kind2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind2() {
                return kind2;
            }

            /**
             * Sets the value of the kind2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind2(String value) {
                this.kind2 = value;
            }

            /**
             * Gets the value of the rid2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid2() {
                return rid2;
            }

            /**
             * Sets the value of the rid2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid2(String value) {
                this.rid2 = value;
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
     *         &lt;element name="Capabilities" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Capability" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
     *       &lt;attribute name="IncludeStatuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchStatusEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeStatuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchStatusEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IncludeKinds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchKindEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeKinds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}BranchKindEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="StartRecord" type="{http://schemas.radixware.org/types.xsd}Int" default="1" /&gt;
     *       &lt;attribute name="RecordCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="IncludeCurrentlyOpened" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="MaxDistance" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InstitutionIds"&gt;
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
    @XmlType(name = "", propOrder = {
        "capabilities"
    })
    public static class BranchListFilter {

        @XmlElement(name = "Capabilities")
        protected CustInfoRq.BranchListFilter.Capabilities capabilities;
        @XmlAttribute(name = "IncludeStatuses")
        protected List<String> includeStatuses;
        @XmlAttribute(name = "ExcludeStatuses")
        protected List<String> excludeStatuses;
        @XmlAttribute(name = "IncludeKinds")
        protected List<String> includeKinds;
        @XmlAttribute(name = "ExcludeKinds")
        protected List<String> excludeKinds;
        @XmlAttribute(name = "StartRecord")
        protected Long startRecord;
        @XmlAttribute(name = "RecordCount")
        protected Long recordCount;
        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "IncludeCurrentlyOpened")
        protected Boolean includeCurrentlyOpened;
        @XmlAttribute(name = "MaxDistance")
        protected Long maxDistance;
        @XmlAttribute(name = "InstitutionIds")
        protected List<Long> institutionIds;

        /**
         * Gets the value of the capabilities property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.BranchListFilter.Capabilities }
         *     
         */
        public CustInfoRq.BranchListFilter.Capabilities getCapabilities() {
            return capabilities;
        }

        /**
         * Sets the value of the capabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.BranchListFilter.Capabilities }
         *     
         */
        public void setCapabilities(CustInfoRq.BranchListFilter.Capabilities value) {
            this.capabilities = value;
        }

        /**
         * Gets the value of the includeStatuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeStatuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeStatuses() {
            if (includeStatuses == null) {
                includeStatuses = new ArrayList<String>();
            }
            return this.includeStatuses;
        }

        /**
         * Gets the value of the excludeStatuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeStatuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeStatuses() {
            if (excludeStatuses == null) {
                excludeStatuses = new ArrayList<String>();
            }
            return this.excludeStatuses;
        }

        /**
         * Gets the value of the includeKinds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeKinds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeKinds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeKinds() {
            if (includeKinds == null) {
                includeKinds = new ArrayList<String>();
            }
            return this.includeKinds;
        }

        /**
         * Gets the value of the excludeKinds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeKinds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeKinds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeKinds() {
            if (excludeKinds == null) {
                excludeKinds = new ArrayList<String>();
            }
            return this.excludeKinds;
        }

        /**
         * Gets the value of the startRecord property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getStartRecord() {
            if (startRecord == null) {
                return  1L;
            } else {
                return startRecord;
            }
        }

        /**
         * Sets the value of the startRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setStartRecord(Long value) {
            this.startRecord = value;
        }

        /**
         * Gets the value of the recordCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRecordCount() {
            return recordCount;
        }

        /**
         * Sets the value of the recordCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRecordCount(Long value) {
            this.recordCount = value;
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
         * Gets the value of the includeCurrentlyOpened property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeCurrentlyOpened() {
            return includeCurrentlyOpened;
        }

        /**
         * Sets the value of the includeCurrentlyOpened property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeCurrentlyOpened(Boolean value) {
            this.includeCurrentlyOpened = value;
        }

        /**
         * Gets the value of the maxDistance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMaxDistance() {
            return maxDistance;
        }

        /**
         * Sets the value of the maxDistance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMaxDistance(Long value) {
            this.maxDistance = value;
        }

        /**
         * Gets the value of the institutionIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the institutionIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstitutionIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getInstitutionIds() {
            if (institutionIds == null) {
                institutionIds = new ArrayList<Long>();
            }
            return this.institutionIds;
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
         *         &lt;element name="Capability" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            "capability"
        })
        public static class Capabilities {

            @XmlElement(name = "Capability")
            protected List<CustInfoRq.BranchListFilter.Capabilities.Capability> capability;

            /**
             * Gets the value of the capability property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the capability property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCapability().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CustInfoRq.BranchListFilter.Capabilities.Capability }
             * 
             * 
             */
            public List<CustInfoRq.BranchListFilter.Capabilities.Capability> getCapability() {
                if (capability == null) {
                    capability = new ArrayList<CustInfoRq.BranchListFilter.Capabilities.Capability>();
                }
                return this.capability;
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
             *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Capability {

                @XmlAttribute(name = "Rid")
                protected String rid;

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
     *       &lt;attribute name="CoordLatitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="CoordLongitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BranchListOpts {

        @XmlAttribute(name = "CoordLatitude")
        protected BigDecimal coordLatitude;
        @XmlAttribute(name = "CoordLongitude")
        protected BigDecimal coordLongitude;

        /**
         * Gets the value of the coordLatitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCoordLatitude() {
            return coordLatitude;
        }

        /**
         * Sets the value of the coordLatitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCoordLatitude(BigDecimal value) {
            this.coordLatitude = value;
        }

        /**
         * Gets the value of the coordLongitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCoordLongitude() {
            return coordLongitude;
        }

        /**
         * Sets the value of the coordLongitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCoordLongitude(BigDecimal value) {
            this.coordLongitude = value;
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
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractListFilter {

        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "Rid")
        protected String rid;

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
     *       &lt;attribute name="ClosedContractsAllowed" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="BalanceHistoryFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="BalanceHistoryTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ForecastDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="OwnContracts" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ForIssuingContract" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ForVirtualCardCreation" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ContractTranCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractListOpts {

        @XmlAttribute(name = "ClosedContractsAllowed")
        protected Boolean closedContractsAllowed;
        @XmlAttribute(name = "BalanceHistoryFrom")
        protected XMLGregorianCalendar balanceHistoryFrom;
        @XmlAttribute(name = "BalanceHistoryTo")
        protected XMLGregorianCalendar balanceHistoryTo;
        @XmlAttribute(name = "ForecastDay")
        protected XMLGregorianCalendar forecastDay;
        @XmlAttribute(name = "OwnContracts")
        protected Boolean ownContracts;
        @XmlAttribute(name = "ForIssuingContract")
        protected Boolean forIssuingContract;
        @XmlAttribute(name = "ForVirtualCardCreation")
        protected Boolean forVirtualCardCreation;
        @XmlAttribute(name = "ContractTranCcy")
        protected Long contractTranCcy;

        /**
         * Gets the value of the closedContractsAllowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isClosedContractsAllowed() {
            return closedContractsAllowed;
        }

        /**
         * Sets the value of the closedContractsAllowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setClosedContractsAllowed(Boolean value) {
            this.closedContractsAllowed = value;
        }

        /**
         * Gets the value of the balanceHistoryFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBalanceHistoryFrom() {
            return balanceHistoryFrom;
        }

        /**
         * Sets the value of the balanceHistoryFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBalanceHistoryFrom(XMLGregorianCalendar value) {
            this.balanceHistoryFrom = value;
        }

        /**
         * Gets the value of the balanceHistoryTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBalanceHistoryTo() {
            return balanceHistoryTo;
        }

        /**
         * Sets the value of the balanceHistoryTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBalanceHistoryTo(XMLGregorianCalendar value) {
            this.balanceHistoryTo = value;
        }

        /**
         * Gets the value of the forecastDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getForecastDay() {
            return forecastDay;
        }

        /**
         * Sets the value of the forecastDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setForecastDay(XMLGregorianCalendar value) {
            this.forecastDay = value;
        }

        /**
         * Gets the value of the ownContracts property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOwnContracts() {
            return ownContracts;
        }

        /**
         * Sets the value of the ownContracts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwnContracts(Boolean value) {
            this.ownContracts = value;
        }

        /**
         * Gets the value of the forIssuingContract property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForIssuingContract() {
            return forIssuingContract;
        }

        /**
         * Sets the value of the forIssuingContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForIssuingContract(Boolean value) {
            this.forIssuingContract = value;
        }

        /**
         * Gets the value of the forVirtualCardCreation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForVirtualCardCreation() {
            return forVirtualCardCreation;
        }

        /**
         * Sets the value of the forVirtualCardCreation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForVirtualCardCreation(Boolean value) {
            this.forVirtualCardCreation = value;
        }

        /**
         * Gets the value of the contractTranCcy property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getContractTranCcy() {
            return contractTranCcy;
        }

        /**
         * Sets the value of the contractTranCcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setContractTranCcy(Long value) {
            this.contractTranCcy = value;
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
     *       &lt;attribute name="Variant" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractPaymentScheduleVariantEnum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractPaymentSchedule {

        @XmlAttribute(name = "Variant")
        protected String variant;

        /**
         * Gets the value of the variant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariant() {
            return variant;
        }

        /**
         * Sets the value of the variant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariant(String value) {
            this.variant = value;
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
     *       &lt;attribute name="InvoiceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InvoiceGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Statuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceStatusEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="FromDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToDueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="FromPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToPaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InvoiceFilter {

        @XmlAttribute(name = "InvoiceId")
        protected Long invoiceId;
        @XmlAttribute(name = "InvoiceGuid")
        protected String invoiceGuid;
        @XmlAttribute(name = "Statuses")
        protected List<String> statuses;
        @XmlAttribute(name = "FromDueDate")
        protected XMLGregorianCalendar fromDueDate;
        @XmlAttribute(name = "ToDueDate")
        protected XMLGregorianCalendar toDueDate;
        @XmlAttribute(name = "FromPaidTime")
        protected XMLGregorianCalendar fromPaidTime;
        @XmlAttribute(name = "ToPaidTime")
        protected XMLGregorianCalendar toPaidTime;

        /**
         * Gets the value of the invoiceId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInvoiceId() {
            return invoiceId;
        }

        /**
         * Sets the value of the invoiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInvoiceId(Long value) {
            this.invoiceId = value;
        }

        /**
         * Gets the value of the invoiceGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceGuid() {
            return invoiceGuid;
        }

        /**
         * Sets the value of the invoiceGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceGuid(String value) {
            this.invoiceGuid = value;
        }

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
        }

        /**
         * Gets the value of the fromDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDueDate() {
            return fromDueDate;
        }

        /**
         * Sets the value of the fromDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDueDate(XMLGregorianCalendar value) {
            this.fromDueDate = value;
        }

        /**
         * Gets the value of the toDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDueDate() {
            return toDueDate;
        }

        /**
         * Sets the value of the toDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDueDate(XMLGregorianCalendar value) {
            this.toDueDate = value;
        }

        /**
         * Gets the value of the fromPaidTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromPaidTime() {
            return fromPaidTime;
        }

        /**
         * Sets the value of the fromPaidTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromPaidTime(XMLGregorianCalendar value) {
            this.fromPaidTime = value;
        }

        /**
         * Gets the value of the toPaidTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToPaidTime() {
            return toPaidTime;
        }

        /**
         * Sets the value of the toPaidTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToPaidTime(XMLGregorianCalendar value) {
            this.toPaidTime = value;
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
     *       &lt;attribute name="InvoiceTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InvoiceTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InvoiceTypeFilter {

        @XmlAttribute(name = "InvoiceTypeId")
        protected Long invoiceTypeId;
        @XmlAttribute(name = "InvoiceTypeRid")
        protected String invoiceTypeRid;

        /**
         * Gets the value of the invoiceTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInvoiceTypeId() {
            return invoiceTypeId;
        }

        /**
         * Sets the value of the invoiceTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInvoiceTypeId(Long value) {
            this.invoiceTypeId = value;
        }

        /**
         * Gets the value of the invoiceTypeRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceTypeRid() {
            return invoiceTypeRid;
        }

        /**
         * Sets the value of the invoiceTypeRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceTypeRid(String value) {
            this.invoiceTypeRid = value;
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
     *         &lt;element name="Payers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="PayeeConsumerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Statuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}PayeeConsumerStatusEnum" /&gt;
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
    @XmlType(name = "", propOrder = {
        "payers"
    })
    public static class PayeeConsumerListFilter {

        @XmlElement(name = "Payers")
        protected CustInfoRq.PayeeConsumerListFilter.Payers payers;
        @XmlAttribute(name = "HasBills")
        protected Boolean hasBills;
        @XmlAttribute(name = "PayeeConsumerId")
        protected Long payeeConsumerId;
        @XmlAttribute(name = "Statuses")
        protected List<String> statuses;

        /**
         * Gets the value of the payers property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.PayeeConsumerListFilter.Payers }
         *     
         */
        public CustInfoRq.PayeeConsumerListFilter.Payers getPayers() {
            return payers;
        }

        /**
         * Sets the value of the payers property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.PayeeConsumerListFilter.Payers }
         *     
         */
        public void setPayers(CustInfoRq.PayeeConsumerListFilter.Payers value) {
            this.payers = value;
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
         * Gets the value of the payeeConsumerId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPayeeConsumerId() {
            return payeeConsumerId;
        }

        /**
         * Sets the value of the payeeConsumerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPayeeConsumerId(Long value) {
            this.payeeConsumerId = value;
        }

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
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
         *       &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Payers {

            @XmlAttribute(name = "Kind1")
            protected String kind1;
            @XmlAttribute(name = "Rid1")
            protected String rid1;
            @XmlAttribute(name = "Kind2")
            protected String kind2;
            @XmlAttribute(name = "Rid2")
            protected String rid2;

            /**
             * Gets the value of the kind1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind1() {
                return kind1;
            }

            /**
             * Sets the value of the kind1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind1(String value) {
                this.kind1 = value;
            }

            /**
             * Gets the value of the rid1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid1() {
                return rid1;
            }

            /**
             * Sets the value of the rid1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid1(String value) {
                this.rid1 = value;
            }

            /**
             * Gets the value of the kind2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind2() {
                return kind2;
            }

            /**
             * Sets the value of the kind2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind2(String value) {
                this.kind2 = value;
            }

            /**
             * Gets the value of the rid2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid2() {
                return rid2;
            }

            /**
             * Sets the value of the rid2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid2(String value) {
                this.rid2 = value;
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
     *       &lt;attribute name="ParentTopicRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="HasParams" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="NumericalParams" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="MaxParamCnt" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="HasVouchers" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="OrHasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="HasInvoices" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="OrHasInvoices" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="AutoTemplates" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PayeeListFilter {

        @XmlAttribute(name = "ParentTopicRid")
        protected String parentTopicRid;
        @XmlAttribute(name = "HasParams")
        protected Boolean hasParams;
        @XmlAttribute(name = "NumericalParams")
        protected Boolean numericalParams;
        @XmlAttribute(name = "MaxParamCnt")
        protected Long maxParamCnt;
        @XmlAttribute(name = "HasVouchers")
        protected Boolean hasVouchers;
        @XmlAttribute(name = "HasBills")
        protected Boolean hasBills;
        @XmlAttribute(name = "OrHasBills")
        protected Boolean orHasBills;
        @XmlAttribute(name = "HasInvoices")
        protected Boolean hasInvoices;
        @XmlAttribute(name = "OrHasInvoices")
        protected Boolean orHasInvoices;
        @XmlAttribute(name = "AutoTemplates")
        protected Boolean autoTemplates;

        /**
         * Gets the value of the parentTopicRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentTopicRid() {
            return parentTopicRid;
        }

        /**
         * Sets the value of the parentTopicRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentTopicRid(String value) {
            this.parentTopicRid = value;
        }

        /**
         * Gets the value of the hasParams property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasParams() {
            return hasParams;
        }

        /**
         * Sets the value of the hasParams property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasParams(Boolean value) {
            this.hasParams = value;
        }

        /**
         * Gets the value of the numericalParams property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNumericalParams() {
            return numericalParams;
        }

        /**
         * Sets the value of the numericalParams property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNumericalParams(Boolean value) {
            this.numericalParams = value;
        }

        /**
         * Gets the value of the maxParamCnt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMaxParamCnt() {
            return maxParamCnt;
        }

        /**
         * Sets the value of the maxParamCnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMaxParamCnt(Long value) {
            this.maxParamCnt = value;
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
         * Gets the value of the orHasBills property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOrHasBills() {
            return orHasBills;
        }

        /**
         * Sets the value of the orHasBills property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrHasBills(Boolean value) {
            this.orHasBills = value;
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
         * Gets the value of the orHasInvoices property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOrHasInvoices() {
            return orHasInvoices;
        }

        /**
         * Sets the value of the orHasInvoices property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrHasInvoices(Boolean value) {
            this.orHasInvoices = value;
        }

        /**
         * Gets the value of the autoTemplates property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoTemplates() {
            return autoTemplates;
        }

        /**
         * Sets the value of the autoTemplates property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoTemplates(Boolean value) {
            this.autoTemplates = value;
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
     *       &lt;attribute name="ByTitle" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PayeeListOpts {

        @XmlAttribute(name = "ByTitle")
        protected Boolean byTitle;

        /**
         * Gets the value of the byTitle property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isByTitle() {
            return byTitle;
        }

        /**
         * Sets the value of the byTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setByTitle(Boolean value) {
            this.byTitle = value;
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
     *         &lt;element name="Params" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
     *       &lt;attribute name="PubPid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ReportClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "params"
    })
    public static class Report {

        @XmlElement(name = "Params")
        protected CustInfoRq.Report.Params params;
        @XmlAttribute(name = "PubPid")
        protected String pubPid;
        @XmlAttribute(name = "ReportClassGuid")
        protected String reportClassGuid;

        /**
         * Gets the value of the params property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.Report.Params }
         *     
         */
        public CustInfoRq.Report.Params getParams() {
            return params;
        }

        /**
         * Sets the value of the params property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.Report.Params }
         *     
         */
        public void setParams(CustInfoRq.Report.Params value) {
            this.params = value;
        }

        /**
         * Gets the value of the pubPid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPubPid() {
            return pubPid;
        }

        /**
         * Sets the value of the pubPid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPubPid(String value) {
            this.pubPid = value;
        }

        /**
         * Gets the value of the reportClassGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportClassGuid() {
            return reportClassGuid;
        }

        /**
         * Sets the value of the reportClassGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportClassGuid(String value) {
            this.reportClassGuid = value;
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
         *         &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            "param"
        })
        public static class Params {

            @XmlElement(name = "Param")
            protected List<CustInfoRq.Report.Params.Param> param;

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
             * {@link CustInfoRq.Report.Params.Param }
             * 
             * 
             */
            public List<CustInfoRq.Report.Params.Param> getParam() {
                if (param == null) {
                    param = new ArrayList<CustInfoRq.Report.Params.Param>();
                }
                return this.param;
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
             *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Param {

                @XmlElement(name = "Value")
                protected String value;
                @XmlAttribute(name = "Guid", required = true)
                protected String guid;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the guid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuid() {
                    return guid;
                }

                /**
                 * Sets the value of the guid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuid(String value) {
                    this.guid = value;
                }

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
     *       &lt;attribute name="FormId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FromDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Statement {

        @XmlAttribute(name = "FormId")
        protected Long formId;
        @XmlAttribute(name = "FromDay")
        protected XMLGregorianCalendar fromDay;
        @XmlAttribute(name = "ToDay")
        protected XMLGregorianCalendar toDay;

        /**
         * Gets the value of the formId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFormId() {
            return formId;
        }

        /**
         * Sets the value of the formId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFormId(Long value) {
            this.formId = value;
        }

        /**
         * Gets the value of the fromDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDay() {
            return fromDay;
        }

        /**
         * Sets the value of the fromDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDay(XMLGregorianCalendar value) {
            this.fromDay = value;
        }

        /**
         * Gets the value of the toDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDay() {
            return toDay;
        }

        /**
         * Sets the value of the toDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDay(XMLGregorianCalendar value) {
            this.toDay = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="IncludeStatuses" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ExcludeStatuses" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MaxCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Types"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalTypeEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DispenseCurrencies"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DepositCurrencies"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MaxDistance" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InstitutionIds"&gt;
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
    @XmlType(name = "", propOrder = {
        "includeStatuses",
        "excludeStatuses"
    })
    public static class TerminalListFilter {

        @XmlElement(name = "IncludeStatuses")
        protected CustInfoRq.TerminalListFilter.IncludeStatuses includeStatuses;
        @XmlElement(name = "ExcludeStatuses")
        protected CustInfoRq.TerminalListFilter.ExcludeStatuses excludeStatuses;
        @XmlAttribute(name = "MaxCount")
        protected Long maxCount;
        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "Types")
        protected List<String> types;
        @XmlAttribute(name = "DispenseCurrencies")
        protected List<Long> dispenseCurrencies;
        @XmlAttribute(name = "DepositCurrencies")
        protected List<Long> depositCurrencies;
        @XmlAttribute(name = "MaxDistance")
        protected Long maxDistance;
        @XmlAttribute(name = "InstitutionIds")
        protected List<Long> institutionIds;

        /**
         * Gets the value of the includeStatuses property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.TerminalListFilter.IncludeStatuses }
         *     
         */
        public CustInfoRq.TerminalListFilter.IncludeStatuses getIncludeStatuses() {
            return includeStatuses;
        }

        /**
         * Sets the value of the includeStatuses property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.TerminalListFilter.IncludeStatuses }
         *     
         */
        public void setIncludeStatuses(CustInfoRq.TerminalListFilter.IncludeStatuses value) {
            this.includeStatuses = value;
        }

        /**
         * Gets the value of the excludeStatuses property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfoRq.TerminalListFilter.ExcludeStatuses }
         *     
         */
        public CustInfoRq.TerminalListFilter.ExcludeStatuses getExcludeStatuses() {
            return excludeStatuses;
        }

        /**
         * Sets the value of the excludeStatuses property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfoRq.TerminalListFilter.ExcludeStatuses }
         *     
         */
        public void setExcludeStatuses(CustInfoRq.TerminalListFilter.ExcludeStatuses value) {
            this.excludeStatuses = value;
        }

        /**
         * Gets the value of the maxCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMaxCount() {
            return maxCount;
        }

        /**
         * Sets the value of the maxCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMaxCount(Long value) {
            this.maxCount = value;
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
         * Gets the value of the types property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the types property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTypes() {
            if (types == null) {
                types = new ArrayList<String>();
            }
            return this.types;
        }

        /**
         * Gets the value of the dispenseCurrencies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dispenseCurrencies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDispenseCurrencies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getDispenseCurrencies() {
            if (dispenseCurrencies == null) {
                dispenseCurrencies = new ArrayList<Long>();
            }
            return this.dispenseCurrencies;
        }

        /**
         * Gets the value of the depositCurrencies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the depositCurrencies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepositCurrencies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getDepositCurrencies() {
            if (depositCurrencies == null) {
                depositCurrencies = new ArrayList<Long>();
            }
            return this.depositCurrencies;
        }

        /**
         * Gets the value of the maxDistance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMaxDistance() {
            return maxDistance;
        }

        /**
         * Sets the value of the maxDistance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMaxDistance(Long value) {
            this.maxDistance = value;
        }

        /**
         * Gets the value of the institutionIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the institutionIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstitutionIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getInstitutionIds() {
            if (institutionIds == null) {
                institutionIds = new ArrayList<Long>();
            }
            return this.institutionIds;
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
         *         &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "item"
        })
        public static class ExcludeStatuses {

            @XmlElement(name = "Item")
            protected List<String> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
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
         *         &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}TerminalStatusEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "item"
        })
        public static class IncludeStatuses {

            @XmlElement(name = "Item")
            protected List<String> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
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
     *       &lt;attribute name="CoordLatitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="CoordLongitude" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TerminalListOpts {

        @XmlAttribute(name = "CoordLatitude")
        protected BigDecimal coordLatitude;
        @XmlAttribute(name = "CoordLongitude")
        protected BigDecimal coordLongitude;

        /**
         * Gets the value of the coordLatitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCoordLatitude() {
            return coordLatitude;
        }

        /**
         * Sets the value of the coordLatitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCoordLatitude(BigDecimal value) {
            this.coordLatitude = value;
        }

        /**
         * Gets the value of the coordLongitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCoordLongitude() {
            return coordLongitude;
        }

        /**
         * Sets the value of the coordLongitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCoordLongitude(BigDecimal value) {
            this.coordLongitude = value;
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
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TokenListFilter {

        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "ExtRid")
        protected String extRid;

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
     *       &lt;attribute name="IdTokenOnly" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="RefineAliasExtData" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TokenListOpts {

        @XmlAttribute(name = "IdTokenOnly")
        protected Boolean idTokenOnly;
        @XmlAttribute(name = "RefineAliasExtData")
        protected Boolean refineAliasExtData;

        /**
         * Gets the value of the idTokenOnly property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIdTokenOnly() {
            return idTokenOnly;
        }

        /**
         * Sets the value of the idTokenOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIdTokenOnly(Boolean value) {
            this.idTokenOnly = value;
        }

        /**
         * Gets the value of the refineAliasExtData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefineAliasExtData() {
            return refineAliasExtData;
        }

        /**
         * Sets the value of the refineAliasExtData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefineAliasExtData(Boolean value) {
            this.refineAliasExtData = value;
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
     *       &lt;attribute name="StartRecordNo" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="HighBoundTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RecordCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RegDateFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="RegDateTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="TranKindDomain"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;enumeration value="Customer"/&gt;
     *             &lt;enumeration value="Credit/Debit"/&gt;
     *             &lt;enumeration value="Credit"/&gt;
     *             &lt;enumeration value="Credit/Adjust"/&gt;
     *             &lt;enumeration value="Debit"/&gt;
     *             &lt;enumeration value="Debit/Adjust"/&gt;
     *             &lt;enumeration value="Info"/&gt;
     *             &lt;enumeration value="Info/Contract"/&gt;
     *             &lt;enumeration value="Info/Token"/&gt;
     *             &lt;enumeration value="Demand"/&gt;
     *             &lt;enumeration value="Demand/Contract"/&gt;
     *             &lt;enumeration value="Demant/Token"/&gt;
     *             &lt;enumeration value="Demand/Terminal"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IncludeTranKinds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeTranKinds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IncludeTranCategoryCodes"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeTranCategoryCodes"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IncludeLifePhases"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranLifePhaseEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IncludeTranResults"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeTranResults"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludePresentedAuth" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ExcludeAuthPresentment" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ExcludeReversed" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="IncludeApprovalCodes"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExcludeApprovalCodes"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TranSignum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FinancialImpact"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;enumeration value="Postings"/&gt;
     *             &lt;enumeration value="Holds"/&gt;
     *             &lt;enumeration value="PostingsOrHolds"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CustCurrencies"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CustAmtFrom" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="CustAmtTo" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="TermId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TranListFilter {

        @XmlAttribute(name = "StartRecordNo")
        protected Long startRecordNo;
        @XmlAttribute(name = "HighBoundTranId")
        protected Long highBoundTranId;
        @XmlAttribute(name = "RecordCount")
        protected Long recordCount;
        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "RegDateFrom")
        protected XMLGregorianCalendar regDateFrom;
        @XmlAttribute(name = "RegDateTo")
        protected XMLGregorianCalendar regDateTo;
        @XmlAttribute(name = "TranKindDomain")
        protected String tranKindDomain;
        @XmlAttribute(name = "IncludeTranKinds")
        protected List<String> includeTranKinds;
        @XmlAttribute(name = "ExcludeTranKinds")
        protected List<String> excludeTranKinds;
        @XmlAttribute(name = "IncludeTranCategoryCodes")
        protected List<String> includeTranCategoryCodes;
        @XmlAttribute(name = "ExcludeTranCategoryCodes")
        protected List<String> excludeTranCategoryCodes;
        @XmlAttribute(name = "IncludeLifePhases")
        protected List<String> includeLifePhases;
        @XmlAttribute(name = "IncludeTranResults")
        protected List<String> includeTranResults;
        @XmlAttribute(name = "ExcludeTranResults")
        protected List<String> excludeTranResults;
        @XmlAttribute(name = "ExcludePresentedAuth")
        protected Boolean excludePresentedAuth;
        @XmlAttribute(name = "ExcludeAuthPresentment")
        protected Boolean excludeAuthPresentment;
        @XmlAttribute(name = "ExcludeReversed")
        protected Boolean excludeReversed;
        @XmlAttribute(name = "IncludeApprovalCodes")
        protected List<String> includeApprovalCodes;
        @XmlAttribute(name = "ExcludeApprovalCodes")
        protected List<String> excludeApprovalCodes;
        @XmlAttribute(name = "TranSignum")
        protected Long tranSignum;
        @XmlAttribute(name = "FinancialImpact")
        protected String financialImpact;
        @XmlAttribute(name = "CustCurrencies")
        protected List<Long> custCurrencies;
        @XmlAttribute(name = "CustAmtFrom")
        protected BigDecimal custAmtFrom;
        @XmlAttribute(name = "CustAmtTo")
        protected BigDecimal custAmtTo;
        @XmlAttribute(name = "TermId")
        protected Long termId;

        /**
         * Gets the value of the startRecordNo property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getStartRecordNo() {
            return startRecordNo;
        }

        /**
         * Sets the value of the startRecordNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setStartRecordNo(Long value) {
            this.startRecordNo = value;
        }

        /**
         * Gets the value of the highBoundTranId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHighBoundTranId() {
            return highBoundTranId;
        }

        /**
         * Sets the value of the highBoundTranId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHighBoundTranId(Long value) {
            this.highBoundTranId = value;
        }

        /**
         * Gets the value of the recordCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRecordCount() {
            return recordCount;
        }

        /**
         * Sets the value of the recordCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRecordCount(Long value) {
            this.recordCount = value;
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
         * Gets the value of the regDateFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDateFrom() {
            return regDateFrom;
        }

        /**
         * Sets the value of the regDateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegDateFrom(XMLGregorianCalendar value) {
            this.regDateFrom = value;
        }

        /**
         * Gets the value of the regDateTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDateTo() {
            return regDateTo;
        }

        /**
         * Sets the value of the regDateTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegDateTo(XMLGregorianCalendar value) {
            this.regDateTo = value;
        }

        /**
         * Gets the value of the tranKindDomain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranKindDomain() {
            return tranKindDomain;
        }

        /**
         * Sets the value of the tranKindDomain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranKindDomain(String value) {
            this.tranKindDomain = value;
        }

        /**
         * Gets the value of the includeTranKinds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeTranKinds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeTranKinds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeTranKinds() {
            if (includeTranKinds == null) {
                includeTranKinds = new ArrayList<String>();
            }
            return this.includeTranKinds;
        }

        /**
         * Gets the value of the excludeTranKinds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeTranKinds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeTranKinds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeTranKinds() {
            if (excludeTranKinds == null) {
                excludeTranKinds = new ArrayList<String>();
            }
            return this.excludeTranKinds;
        }

        /**
         * Gets the value of the includeTranCategoryCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeTranCategoryCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeTranCategoryCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeTranCategoryCodes() {
            if (includeTranCategoryCodes == null) {
                includeTranCategoryCodes = new ArrayList<String>();
            }
            return this.includeTranCategoryCodes;
        }

        /**
         * Gets the value of the excludeTranCategoryCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeTranCategoryCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeTranCategoryCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeTranCategoryCodes() {
            if (excludeTranCategoryCodes == null) {
                excludeTranCategoryCodes = new ArrayList<String>();
            }
            return this.excludeTranCategoryCodes;
        }

        /**
         * Gets the value of the includeLifePhases property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeLifePhases property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeLifePhases().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeLifePhases() {
            if (includeLifePhases == null) {
                includeLifePhases = new ArrayList<String>();
            }
            return this.includeLifePhases;
        }

        /**
         * Gets the value of the includeTranResults property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeTranResults property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeTranResults().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeTranResults() {
            if (includeTranResults == null) {
                includeTranResults = new ArrayList<String>();
            }
            return this.includeTranResults;
        }

        /**
         * Gets the value of the excludeTranResults property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeTranResults property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeTranResults().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeTranResults() {
            if (excludeTranResults == null) {
                excludeTranResults = new ArrayList<String>();
            }
            return this.excludeTranResults;
        }

        /**
         * Gets the value of the excludePresentedAuth property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludePresentedAuth() {
            return excludePresentedAuth;
        }

        /**
         * Sets the value of the excludePresentedAuth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludePresentedAuth(Boolean value) {
            this.excludePresentedAuth = value;
        }

        /**
         * Gets the value of the excludeAuthPresentment property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludeAuthPresentment() {
            return excludeAuthPresentment;
        }

        /**
         * Sets the value of the excludeAuthPresentment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludeAuthPresentment(Boolean value) {
            this.excludeAuthPresentment = value;
        }

        /**
         * Gets the value of the excludeReversed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludeReversed() {
            return excludeReversed;
        }

        /**
         * Sets the value of the excludeReversed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludeReversed(Boolean value) {
            this.excludeReversed = value;
        }

        /**
         * Gets the value of the includeApprovalCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeApprovalCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeApprovalCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludeApprovalCodes() {
            if (includeApprovalCodes == null) {
                includeApprovalCodes = new ArrayList<String>();
            }
            return this.includeApprovalCodes;
        }

        /**
         * Gets the value of the excludeApprovalCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeApprovalCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeApprovalCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludeApprovalCodes() {
            if (excludeApprovalCodes == null) {
                excludeApprovalCodes = new ArrayList<String>();
            }
            return this.excludeApprovalCodes;
        }

        /**
         * Gets the value of the tranSignum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTranSignum() {
            return tranSignum;
        }

        /**
         * Sets the value of the tranSignum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTranSignum(Long value) {
            this.tranSignum = value;
        }

        /**
         * Gets the value of the financialImpact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialImpact() {
            return financialImpact;
        }

        /**
         * Sets the value of the financialImpact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialImpact(String value) {
            this.financialImpact = value;
        }

        /**
         * Gets the value of the custCurrencies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custCurrencies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustCurrencies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCustCurrencies() {
            if (custCurrencies == null) {
                custCurrencies = new ArrayList<Long>();
            }
            return this.custCurrencies;
        }

        /**
         * Gets the value of the custAmtFrom property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCustAmtFrom() {
            return custAmtFrom;
        }

        /**
         * Sets the value of the custAmtFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCustAmtFrom(BigDecimal value) {
            this.custAmtFrom = value;
        }

        /**
         * Gets the value of the custAmtTo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCustAmtTo() {
            return custAmtTo;
        }

        /**
         * Sets the value of the custAmtTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCustAmtTo(BigDecimal value) {
            this.custAmtTo = value;
        }

        /**
         * Gets the value of the termId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTermId() {
            return termId;
        }

        /**
         * Sets the value of the termId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTermId(Long value) {
            this.termId = value;
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
     *         &lt;element name="PrevTranParams" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRq"&gt;
     *                 &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ForClientContracts" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ForClientTokens" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prevTranParams"
    })
    public static class TranListOpts {

        @XmlElement(name = "PrevTranParams")
        protected List<CustInfoRq.TranListOpts.PrevTranParams> prevTranParams;
        @XmlAttribute(name = "ForClientContracts")
        protected Boolean forClientContracts;
        @XmlAttribute(name = "ForClientTokens")
        protected Boolean forClientTokens;

        /**
         * Gets the value of the prevTranParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prevTranParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrevTranParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustInfoRq.TranListOpts.PrevTranParams }
         * 
         * 
         */
        public List<CustInfoRq.TranListOpts.PrevTranParams> getPrevTranParams() {
            if (prevTranParams == null) {
                prevTranParams = new ArrayList<CustInfoRq.TranListOpts.PrevTranParams>();
            }
            return this.prevTranParams;
        }

        /**
         * Gets the value of the forClientContracts property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForClientContracts() {
            return forClientContracts;
        }

        /**
         * Sets the value of the forClientContracts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForClientContracts(Boolean value) {
            this.forClientContracts = value;
        }

        /**
         * Gets the value of the forClientTokens property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForClientTokens() {
            return forClientTokens;
        }

        /**
         * Sets the value of the forClientTokens property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForClientTokens(Boolean value) {
            this.forClientTokens = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRq"&gt;
         *       &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrevTranParams
            extends CustInfoRq
        {

            @XmlAttribute(name = "LinkKind", required = true)
            protected String linkKind;

            /**
             * Gets the value of the linkKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkKind() {
                return linkKind;
            }

            /**
             * Sets the value of the linkKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkKind(String value) {
                this.linkKind = value;
            }

        }

    }

}
