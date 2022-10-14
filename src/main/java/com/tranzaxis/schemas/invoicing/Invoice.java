
package com.tranzaxis.schemas.invoicing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.tran_common.InvoiceItem;
import com.tranzaxis.schemas.tran_common.PaymentParams;
import com.tranzaxis.schemas.tran_common.Token;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoiceStatus" minOccurs="0"/&gt;
 *         &lt;element name="PrevStatus" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoiceStatus" minOccurs="0"/&gt;
 *         &lt;element name="StatusReasonCode" type="{http://schemas.tranzaxis.com/invoicing.xsd}TranResult" minOccurs="0"/&gt;
 *         &lt;element name="StatusReasonText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StatusReasonDescription" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PayOperType" type="{http://schemas.tranzaxis.com/invoicing.xsd}PaymentOperType" minOccurs="0"/&gt;
 *         &lt;element name="ActionTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TryNumber" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CallbackUrl" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CallbackInterfaceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TemplateOwnerId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RidByPayeeCheckVal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RidByPayeeKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RidByCallbackInterface" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastPaymentTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LastPaybackTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Value" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="SalesTaxAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="Discount" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="SrcSurchargeAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="DstSurchargeAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="AuthAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="PaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="PaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Params" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentParams" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentParams" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentTemplateRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ReferenceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="RemittanceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ControlVal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="RqToPayRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Timestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="NetSettleDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ClaimReason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ClaimRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="ShippingAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *                   &lt;element name="PayerRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PayeeRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="NetworkRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="TdsRequestorDecMaxTime" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="TdsServerTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AcsTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="DsTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="SdkTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="DsUrl" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="MessageCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="MessageVersion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="QrcKind" type="{http://schemas.tranzaxis.com/invoicing.xsd}QrcKind" minOccurs="0"/&gt;
 *                   &lt;element name="QrcPayload" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Source" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardExp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardToken" type="{http://schemas.tranzaxis.com/tran-common.xsd}Token" minOccurs="0"/&gt;
 *                   &lt;element name="AgentBic" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AgentName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="PartySortCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAcctName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAcctNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyFundsCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRidKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyLegalName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyLegalRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDoc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDocKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyTaxNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyPam" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyFirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyLastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDayOfBirth" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="PartyCountry" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRegion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyCity" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyZip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyPhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Destination" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ExtCardExp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="AgentBic" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AgentName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartySortCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAcctNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAcctName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyFundsCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRidKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyLegalName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDoc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDocKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyTaxNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyPam" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyFirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyLastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyDayOfBirth" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="PartyCountry" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="PartyRegion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyCity" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyZip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="PartyPhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoiceLinkKind" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Items" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayerIds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayerId" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoicePayerId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QrcOper" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="TerminalId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="AdditionalData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PaymentTemplateRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="CreateInvoiceKind" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoiceKind" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "status",
    "prevStatus",
    "statusReasonCode",
    "statusReasonText",
    "statusReasonDescription",
    "payOperType",
    "actionTime",
    "dueDate",
    "expTime",
    "tryNumber",
    "title",
    "description",
    "callbackUrl",
    "callbackInterfaceId",
    "ridByTrx",
    "templateOwnerId",
    "ridByPayer",
    "ridByPayee",
    "ridByPayeeCheckVal",
    "ridByPayeeKind",
    "ridByCallbackInterface",
    "lastPaymentTranId",
    "lastPaybackTranId",
    "value",
    "params",
    "userAttrs",
    "source",
    "destination",
    "link",
    "items",
    "payerIds",
    "qrcOper"
})
@XmlSeeAlso({
    AdminInvoice.class
})
public class Invoice {

    @XmlElementRef(name = "Status", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "PrevStatus", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevStatus;
    @XmlElementRef(name = "StatusReasonCode", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusReasonCode;
    @XmlElementRef(name = "StatusReasonText", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusReasonText;
    @XmlElementRef(name = "StatusReasonDescription", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusReasonDescription;
    @XmlElementRef(name = "PayOperType", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payOperType;
    @XmlElementRef(name = "ActionTime", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actionTime;
    @XmlElementRef(name = "DueDate", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "ExpTime", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expTime;
    @XmlElementRef(name = "TryNumber", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tryNumber;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "CallbackUrl", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callbackUrl;
    @XmlElementRef(name = "CallbackInterfaceId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> callbackInterfaceId;
    @XmlElementRef(name = "RidByTrx", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByTrx;
    @XmlElementRef(name = "TemplateOwnerId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> templateOwnerId;
    @XmlElementRef(name = "RidByPayer", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByPayer;
    @XmlElementRef(name = "RidByPayee", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByPayee;
    @XmlElementRef(name = "RidByPayeeCheckVal", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByPayeeCheckVal;
    @XmlElementRef(name = "RidByPayeeKind", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByPayeeKind;
    @XmlElementRef(name = "RidByCallbackInterface", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridByCallbackInterface;
    @XmlElement(name = "LastPaymentTranId")
    protected Long lastPaymentTranId;
    @XmlElement(name = "LastPaybackTranId")
    protected Long lastPaybackTranId;
    @XmlElement(name = "Value")
    protected Invoice.Value value;
    @XmlElement(name = "Params")
    protected Invoice.Params params;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "Source")
    protected Invoice.Source source;
    @XmlElement(name = "Destination")
    protected Invoice.Destination destination;
    @XmlElement(name = "Link")
    protected List<Invoice.Link> link;
    @XmlElement(name = "Items")
    protected Invoice.Items items;
    @XmlElement(name = "PayerIds")
    protected Invoice.PayerIds payerIds;
    @XmlElement(name = "QrcOper")
    protected Invoice.QrcOper qrcOper;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Guid")
    protected String guid;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TypeRid")
    protected String typeRid;
    @XmlAttribute(name = "PaymentTemplateRid")
    protected String paymentTemplateRid;
    @XmlAttribute(name = "CreateTime")
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "CreateInvoiceKind")
    protected String createInvoiceKind;

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
     * Gets the value of the prevStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevStatus() {
        return prevStatus;
    }

    /**
     * Sets the value of the prevStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevStatus(JAXBElement<String> value) {
        this.prevStatus = value;
    }

    /**
     * Gets the value of the statusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Sets the value of the statusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusReasonCode(JAXBElement<String> value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the statusReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusReasonText() {
        return statusReasonText;
    }

    /**
     * Sets the value of the statusReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusReasonText(JAXBElement<String> value) {
        this.statusReasonText = value;
    }

    /**
     * Gets the value of the statusReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusReasonDescription() {
        return statusReasonDescription;
    }

    /**
     * Sets the value of the statusReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusReasonDescription(JAXBElement<String> value) {
        this.statusReasonDescription = value;
    }

    /**
     * Gets the value of the payOperType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayOperType() {
        return payOperType;
    }

    /**
     * Sets the value of the payOperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayOperType(JAXBElement<String> value) {
        this.payOperType = value;
    }

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
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
     * Gets the value of the tryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTryNumber() {
        return tryNumber;
    }

    /**
     * Sets the value of the tryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTryNumber(JAXBElement<Long> value) {
        this.tryNumber = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the callbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets the value of the callbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallbackUrl(JAXBElement<String> value) {
        this.callbackUrl = value;
    }

    /**
     * Gets the value of the callbackInterfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCallbackInterfaceId() {
        return callbackInterfaceId;
    }

    /**
     * Sets the value of the callbackInterfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCallbackInterfaceId(JAXBElement<Long> value) {
        this.callbackInterfaceId = value;
    }

    /**
     * Gets the value of the ridByTrx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByTrx() {
        return ridByTrx;
    }

    /**
     * Sets the value of the ridByTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByTrx(JAXBElement<String> value) {
        this.ridByTrx = value;
    }

    /**
     * Gets the value of the templateOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTemplateOwnerId() {
        return templateOwnerId;
    }

    /**
     * Sets the value of the templateOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTemplateOwnerId(JAXBElement<Long> value) {
        this.templateOwnerId = value;
    }

    /**
     * Gets the value of the ridByPayer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByPayer() {
        return ridByPayer;
    }

    /**
     * Sets the value of the ridByPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByPayer(JAXBElement<String> value) {
        this.ridByPayer = value;
    }

    /**
     * Gets the value of the ridByPayee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByPayee() {
        return ridByPayee;
    }

    /**
     * Sets the value of the ridByPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByPayee(JAXBElement<String> value) {
        this.ridByPayee = value;
    }

    /**
     * Gets the value of the ridByPayeeCheckVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByPayeeCheckVal() {
        return ridByPayeeCheckVal;
    }

    /**
     * Sets the value of the ridByPayeeCheckVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByPayeeCheckVal(JAXBElement<String> value) {
        this.ridByPayeeCheckVal = value;
    }

    /**
     * Gets the value of the ridByPayeeKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByPayeeKind() {
        return ridByPayeeKind;
    }

    /**
     * Sets the value of the ridByPayeeKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByPayeeKind(JAXBElement<String> value) {
        this.ridByPayeeKind = value;
    }

    /**
     * Gets the value of the ridByCallbackInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRidByCallbackInterface() {
        return ridByCallbackInterface;
    }

    /**
     * Sets the value of the ridByCallbackInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRidByCallbackInterface(JAXBElement<String> value) {
        this.ridByCallbackInterface = value;
    }

    /**
     * Gets the value of the lastPaymentTranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastPaymentTranId() {
        return lastPaymentTranId;
    }

    /**
     * Sets the value of the lastPaymentTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastPaymentTranId(Long value) {
        this.lastPaymentTranId = value;
    }

    /**
     * Gets the value of the lastPaybackTranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastPaybackTranId() {
        return lastPaybackTranId;
    }

    /**
     * Sets the value of the lastPaybackTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastPaybackTranId(Long value) {
        this.lastPaybackTranId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.Value }
     *     
     */
    public Invoice.Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.Value }
     *     
     */
    public void setValue(Invoice.Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.Params }
     *     
     */
    public Invoice.Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.Params }
     *     
     */
    public void setParams(Invoice.Params value) {
        this.params = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.Source }
     *     
     */
    public Invoice.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.Source }
     *     
     */
    public void setSource(Invoice.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.Destination }
     *     
     */
    public Invoice.Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.Destination }
     *     
     */
    public void setDestination(Invoice.Destination value) {
        this.destination = value;
    }

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
     * {@link Invoice.Link }
     * 
     * 
     */
    public List<Invoice.Link> getLink() {
        if (link == null) {
            link = new ArrayList<Invoice.Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.Items }
     *     
     */
    public Invoice.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.Items }
     *     
     */
    public void setItems(Invoice.Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the payerIds property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.PayerIds }
     *     
     */
    public Invoice.PayerIds getPayerIds() {
        return payerIds;
    }

    /**
     * Sets the value of the payerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.PayerIds }
     *     
     */
    public void setPayerIds(Invoice.PayerIds value) {
        this.payerIds = value;
    }

    /**
     * Gets the value of the qrcOper property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice.QrcOper }
     *     
     */
    public Invoice.QrcOper getQrcOper() {
        return qrcOper;
    }

    /**
     * Sets the value of the qrcOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice.QrcOper }
     *     
     */
    public void setQrcOper(Invoice.QrcOper value) {
        this.qrcOper = value;
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

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRid(String value) {
        this.typeRid = value;
    }

    /**
     * Gets the value of the paymentTemplateRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTemplateRid() {
        return paymentTemplateRid;
    }

    /**
     * Sets the value of the paymentTemplateRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTemplateRid(String value) {
        this.paymentTemplateRid = value;
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
     * Gets the value of the createInvoiceKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateInvoiceKind() {
        return createInvoiceKind;
    }

    /**
     * Sets the value of the createInvoiceKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateInvoiceKind(String value) {
        this.createInvoiceKind = value;
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
     *         &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardExp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="AgentBic" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AgentName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartySortCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAcctNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAcctName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyFundsCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyRidKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyLegalName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDoc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDocKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyTaxNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyPam" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyFirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyLastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDayOfBirth" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="PartyCountry" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="PartyRegion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyCity" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyZip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyPhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "contractId",
        "extCardId",
        "extCardPan",
        "extCardExp",
        "agentBic",
        "agentRid",
        "agentName",
        "partySortCode",
        "partyAcctNum",
        "partyAcctName",
        "partyFundsCategory",
        "partyRidKind",
        "partyRid",
        "partyName",
        "partyLegalName",
        "partyAddress",
        "partyDoc",
        "partyDocKind",
        "partyTaxNum",
        "partyPam",
        "partyFirstName",
        "partyMiddleName",
        "partyLastName",
        "partyDayOfBirth",
        "partyCountry",
        "partyRegion",
        "partyCity",
        "partyZip",
        "partyPhone"
    })
    public static class Destination {

        @XmlElementRef(name = "ContractId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> contractId;
        @XmlElementRef(name = "ExtCardId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> extCardId;
        @XmlElementRef(name = "ExtCardPan", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> extCardPan;
        @XmlElementRef(name = "ExtCardExp", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> extCardExp;
        @XmlElementRef(name = "AgentBic", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentBic;
        @XmlElementRef(name = "AgentRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentRid;
        @XmlElementRef(name = "AgentName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentName;
        @XmlElementRef(name = "PartySortCode", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partySortCode;
        @XmlElementRef(name = "PartyAcctNum", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAcctNum;
        @XmlElementRef(name = "PartyAcctName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAcctName;
        @XmlElementRef(name = "PartyFundsCategory", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyFundsCategory;
        @XmlElementRef(name = "PartyRidKind", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRidKind;
        @XmlElementRef(name = "PartyRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRid;
        @XmlElementRef(name = "PartyName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyName;
        @XmlElementRef(name = "PartyLegalName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyLegalName;
        @XmlElementRef(name = "PartyAddress", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAddress;
        @XmlElementRef(name = "PartyDoc", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyDoc;
        @XmlElementRef(name = "PartyDocKind", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyDocKind;
        @XmlElementRef(name = "PartyTaxNum", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyTaxNum;
        @XmlElementRef(name = "PartyPam", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyPam;
        @XmlElementRef(name = "PartyFirstName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyFirstName;
        @XmlElementRef(name = "PartyMiddleName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyMiddleName;
        @XmlElementRef(name = "PartyLastName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyLastName;
        @XmlElementRef(name = "PartyDayOfBirth", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> partyDayOfBirth;
        @XmlElementRef(name = "PartyCountry", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> partyCountry;
        @XmlElementRef(name = "PartyRegion", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRegion;
        @XmlElementRef(name = "PartyCity", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyCity;
        @XmlElementRef(name = "PartyZip", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyZip;
        @XmlElementRef(name = "PartyPhone", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyPhone;

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
         * Gets the value of the extCardId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getExtCardId() {
            return extCardId;
        }

        /**
         * Sets the value of the extCardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setExtCardId(JAXBElement<Long> value) {
            this.extCardId = value;
        }

        /**
         * Gets the value of the extCardPan property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExtCardPan() {
            return extCardPan;
        }

        /**
         * Sets the value of the extCardPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExtCardPan(JAXBElement<String> value) {
            this.extCardPan = value;
        }

        /**
         * Gets the value of the extCardExp property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getExtCardExp() {
            return extCardExp;
        }

        /**
         * Sets the value of the extCardExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setExtCardExp(JAXBElement<XMLGregorianCalendar> value) {
            this.extCardExp = value;
        }

        /**
         * Gets the value of the agentBic property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentBic() {
            return agentBic;
        }

        /**
         * Sets the value of the agentBic property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentBic(JAXBElement<String> value) {
            this.agentBic = value;
        }

        /**
         * Gets the value of the agentRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentRid() {
            return agentRid;
        }

        /**
         * Sets the value of the agentRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentRid(JAXBElement<String> value) {
            this.agentRid = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentName(JAXBElement<String> value) {
            this.agentName = value;
        }

        /**
         * Gets the value of the partySortCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartySortCode() {
            return partySortCode;
        }

        /**
         * Sets the value of the partySortCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartySortCode(JAXBElement<String> value) {
            this.partySortCode = value;
        }

        /**
         * Gets the value of the partyAcctNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAcctNum() {
            return partyAcctNum;
        }

        /**
         * Sets the value of the partyAcctNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAcctNum(JAXBElement<String> value) {
            this.partyAcctNum = value;
        }

        /**
         * Gets the value of the partyAcctName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAcctName() {
            return partyAcctName;
        }

        /**
         * Sets the value of the partyAcctName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAcctName(JAXBElement<String> value) {
            this.partyAcctName = value;
        }

        /**
         * Gets the value of the partyFundsCategory property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyFundsCategory() {
            return partyFundsCategory;
        }

        /**
         * Sets the value of the partyFundsCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyFundsCategory(JAXBElement<String> value) {
            this.partyFundsCategory = value;
        }

        /**
         * Gets the value of the partyRidKind property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRidKind() {
            return partyRidKind;
        }

        /**
         * Sets the value of the partyRidKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRidKind(JAXBElement<String> value) {
            this.partyRidKind = value;
        }

        /**
         * Gets the value of the partyRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRid() {
            return partyRid;
        }

        /**
         * Sets the value of the partyRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRid(JAXBElement<String> value) {
            this.partyRid = value;
        }

        /**
         * Gets the value of the partyName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyName() {
            return partyName;
        }

        /**
         * Sets the value of the partyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyName(JAXBElement<String> value) {
            this.partyName = value;
        }

        /**
         * Gets the value of the partyLegalName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyLegalName() {
            return partyLegalName;
        }

        /**
         * Sets the value of the partyLegalName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyLegalName(JAXBElement<String> value) {
            this.partyLegalName = value;
        }

        /**
         * Gets the value of the partyAddress property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAddress() {
            return partyAddress;
        }

        /**
         * Sets the value of the partyAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAddress(JAXBElement<String> value) {
            this.partyAddress = value;
        }

        /**
         * Gets the value of the partyDoc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyDoc() {
            return partyDoc;
        }

        /**
         * Sets the value of the partyDoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyDoc(JAXBElement<String> value) {
            this.partyDoc = value;
        }

        /**
         * Gets the value of the partyDocKind property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyDocKind() {
            return partyDocKind;
        }

        /**
         * Sets the value of the partyDocKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyDocKind(JAXBElement<String> value) {
            this.partyDocKind = value;
        }

        /**
         * Gets the value of the partyTaxNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyTaxNum() {
            return partyTaxNum;
        }

        /**
         * Sets the value of the partyTaxNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyTaxNum(JAXBElement<String> value) {
            this.partyTaxNum = value;
        }

        /**
         * Gets the value of the partyPam property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyPam() {
            return partyPam;
        }

        /**
         * Sets the value of the partyPam property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyPam(JAXBElement<String> value) {
            this.partyPam = value;
        }

        /**
         * Gets the value of the partyFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyFirstName() {
            return partyFirstName;
        }

        /**
         * Sets the value of the partyFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyFirstName(JAXBElement<String> value) {
            this.partyFirstName = value;
        }

        /**
         * Gets the value of the partyMiddleName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyMiddleName() {
            return partyMiddleName;
        }

        /**
         * Sets the value of the partyMiddleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyMiddleName(JAXBElement<String> value) {
            this.partyMiddleName = value;
        }

        /**
         * Gets the value of the partyLastName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyLastName() {
            return partyLastName;
        }

        /**
         * Sets the value of the partyLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyLastName(JAXBElement<String> value) {
            this.partyLastName = value;
        }

        /**
         * Gets the value of the partyDayOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPartyDayOfBirth() {
            return partyDayOfBirth;
        }

        /**
         * Sets the value of the partyDayOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPartyDayOfBirth(JAXBElement<XMLGregorianCalendar> value) {
            this.partyDayOfBirth = value;
        }

        /**
         * Gets the value of the partyCountry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getPartyCountry() {
            return partyCountry;
        }

        /**
         * Sets the value of the partyCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setPartyCountry(JAXBElement<Long> value) {
            this.partyCountry = value;
        }

        /**
         * Gets the value of the partyRegion property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRegion() {
            return partyRegion;
        }

        /**
         * Sets the value of the partyRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRegion(JAXBElement<String> value) {
            this.partyRegion = value;
        }

        /**
         * Gets the value of the partyCity property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyCity() {
            return partyCity;
        }

        /**
         * Sets the value of the partyCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyCity(JAXBElement<String> value) {
            this.partyCity = value;
        }

        /**
         * Gets the value of the partyZip property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyZip() {
            return partyZip;
        }

        /**
         * Sets the value of the partyZip property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyZip(JAXBElement<String> value) {
            this.partyZip = value;
        }

        /**
         * Gets the value of the partyPhone property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyPhone() {
            return partyPhone;
        }

        /**
         * Sets the value of the partyPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyPhone(JAXBElement<String> value) {
            this.partyPhone = value;
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
     *         &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item")
        protected List<InvoiceItem> item;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

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
         * {@link InvoiceItem }
         * 
         * 
         */
        public List<InvoiceItem> getItem() {
            if (item == null) {
                item = new ArrayList<InvoiceItem>();
            }
            return this.item;
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
     *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoiceLinkKind" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link {

        @XmlAttribute(name = "Kind", required = true)
        protected String kind;
        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "RidByTrx")
        protected String ridByTrx;
        @XmlAttribute(name = "RidByPayee")
        protected String ridByPayee;
        @XmlAttribute(name = "RidByPayer")
        protected String ridByPayer;

        /**
         * Gets the value of the kind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKind() {
            return kind;
        }

        /**
         * Sets the value of the kind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKind(String value) {
            this.kind = value;
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
         * Gets the value of the ridByTrx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRidByTrx() {
            return ridByTrx;
        }

        /**
         * Sets the value of the ridByTrx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRidByTrx(String value) {
            this.ridByTrx = value;
        }

        /**
         * Gets the value of the ridByPayee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRidByPayee() {
            return ridByPayee;
        }

        /**
         * Sets the value of the ridByPayee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRidByPayee(String value) {
            this.ridByPayee = value;
        }

        /**
         * Gets the value of the ridByPayer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRidByPayer() {
            return ridByPayer;
        }

        /**
         * Sets the value of the ridByPayer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRidByPayer(String value) {
            this.ridByPayer = value;
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
     *         &lt;element name="PaymentParams" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentParams" minOccurs="0"/&gt;
     *         &lt;element name="PaymentTemplateRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ReferenceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="RemittanceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ControlVal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="RqToPayRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Timestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="NetSettleDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ClaimReason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ClaimRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="ShippingAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
     *         &lt;element name="PayerRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PayeeRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="NetworkRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="TdsRequestorDecMaxTime" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="TdsServerTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AcsTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="DsTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="SdkTransId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="DsUrl" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="MessageCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="MessageVersion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="QrcKind" type="{http://schemas.tranzaxis.com/invoicing.xsd}QrcKind" minOccurs="0"/&gt;
     *         &lt;element name="QrcPayload" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "paymentParams",
        "paymentTemplateRid",
        "referenceInfo",
        "remittanceInfo",
        "controlVal",
        "rqToPayRid",
        "timestamp",
        "netSettleDay",
        "claimReason",
        "claimRid",
        "mcc",
        "shippingAddress",
        "payerRiskIndicator",
        "payeeRiskIndicator",
        "networkRiskIndicator",
        "tdsRequestorDecMaxTime",
        "tdsServerTransId",
        "acsTransId",
        "dsTransId",
        "sdkTransId",
        "dsUrl",
        "messageCategory",
        "messageVersion",
        "qrcKind",
        "qrcPayload"
    })
    public static class Params {

        @XmlElement(name = "PaymentParams")
        protected PaymentParams paymentParams;
        @XmlElementRef(name = "PaymentTemplateRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> paymentTemplateRid;
        @XmlElementRef(name = "ReferenceInfo", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> referenceInfo;
        @XmlElementRef(name = "RemittanceInfo", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> remittanceInfo;
        @XmlElementRef(name = "ControlVal", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> controlVal;
        @XmlElementRef(name = "RqToPayRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> rqToPayRid;
        @XmlElementRef(name = "Timestamp", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> timestamp;
        @XmlElementRef(name = "NetSettleDay", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> netSettleDay;
        @XmlElementRef(name = "ClaimReason", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> claimReason;
        @XmlElementRef(name = "ClaimRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> claimRid;
        @XmlElementRef(name = "Mcc", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> mcc;
        @XmlElement(name = "ShippingAddress")
        protected MailAddress shippingAddress;
        @XmlElementRef(name = "PayerRiskIndicator", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> payerRiskIndicator;
        @XmlElementRef(name = "PayeeRiskIndicator", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> payeeRiskIndicator;
        @XmlElementRef(name = "NetworkRiskIndicator", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> networkRiskIndicator;
        @XmlElement(name = "TdsRequestorDecMaxTime")
        protected Long tdsRequestorDecMaxTime;
        @XmlElement(name = "TdsServerTransId")
        protected String tdsServerTransId;
        @XmlElement(name = "AcsTransId")
        protected String acsTransId;
        @XmlElement(name = "DsTransId")
        protected String dsTransId;
        @XmlElement(name = "SdkTransId")
        protected String sdkTransId;
        @XmlElement(name = "DsUrl")
        protected String dsUrl;
        @XmlElement(name = "MessageCategory")
        protected String messageCategory;
        @XmlElement(name = "MessageVersion")
        protected String messageVersion;
        @XmlElement(name = "QrcKind")
        protected String qrcKind;
        @XmlElement(name = "QrcPayload")
        protected String qrcPayload;

        /**
         * Gets the value of the paymentParams property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentParams }
         *     
         */
        public PaymentParams getPaymentParams() {
            return paymentParams;
        }

        /**
         * Sets the value of the paymentParams property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentParams }
         *     
         */
        public void setPaymentParams(PaymentParams value) {
            this.paymentParams = value;
        }

        /**
         * Gets the value of the paymentTemplateRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPaymentTemplateRid() {
            return paymentTemplateRid;
        }

        /**
         * Sets the value of the paymentTemplateRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPaymentTemplateRid(JAXBElement<String> value) {
            this.paymentTemplateRid = value;
        }

        /**
         * Gets the value of the referenceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReferenceInfo() {
            return referenceInfo;
        }

        /**
         * Sets the value of the referenceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReferenceInfo(JAXBElement<String> value) {
            this.referenceInfo = value;
        }

        /**
         * Gets the value of the remittanceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRemittanceInfo() {
            return remittanceInfo;
        }

        /**
         * Sets the value of the remittanceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRemittanceInfo(JAXBElement<String> value) {
            this.remittanceInfo = value;
        }

        /**
         * Gets the value of the controlVal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getControlVal() {
            return controlVal;
        }

        /**
         * Sets the value of the controlVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setControlVal(JAXBElement<String> value) {
            this.controlVal = value;
        }

        /**
         * Gets the value of the rqToPayRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRqToPayRid() {
            return rqToPayRid;
        }

        /**
         * Sets the value of the rqToPayRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRqToPayRid(JAXBElement<String> value) {
            this.rqToPayRid = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setTimestamp(JAXBElement<XMLGregorianCalendar> value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the netSettleDay property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNetSettleDay() {
            return netSettleDay;
        }

        /**
         * Sets the value of the netSettleDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNetSettleDay(JAXBElement<XMLGregorianCalendar> value) {
            this.netSettleDay = value;
        }

        /**
         * Gets the value of the claimReason property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getClaimReason() {
            return claimReason;
        }

        /**
         * Sets the value of the claimReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setClaimReason(JAXBElement<String> value) {
            this.claimReason = value;
        }

        /**
         * Gets the value of the claimRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getClaimRid() {
            return claimRid;
        }

        /**
         * Sets the value of the claimRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setClaimRid(JAXBElement<String> value) {
            this.claimRid = value;
        }

        /**
         * Gets the value of the mcc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getMcc() {
            return mcc;
        }

        /**
         * Sets the value of the mcc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setMcc(JAXBElement<Long> value) {
            this.mcc = value;
        }

        /**
         * Gets the value of the shippingAddress property.
         * 
         * @return
         *     possible object is
         *     {@link MailAddress }
         *     
         */
        public MailAddress getShippingAddress() {
            return shippingAddress;
        }

        /**
         * Sets the value of the shippingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link MailAddress }
         *     
         */
        public void setShippingAddress(MailAddress value) {
            this.shippingAddress = value;
        }

        /**
         * Gets the value of the payerRiskIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPayerRiskIndicator() {
            return payerRiskIndicator;
        }

        /**
         * Sets the value of the payerRiskIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPayerRiskIndicator(JAXBElement<String> value) {
            this.payerRiskIndicator = value;
        }

        /**
         * Gets the value of the payeeRiskIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPayeeRiskIndicator() {
            return payeeRiskIndicator;
        }

        /**
         * Sets the value of the payeeRiskIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPayeeRiskIndicator(JAXBElement<String> value) {
            this.payeeRiskIndicator = value;
        }

        /**
         * Gets the value of the networkRiskIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNetworkRiskIndicator() {
            return networkRiskIndicator;
        }

        /**
         * Sets the value of the networkRiskIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNetworkRiskIndicator(JAXBElement<String> value) {
            this.networkRiskIndicator = value;
        }

        /**
         * Gets the value of the tdsRequestorDecMaxTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsRequestorDecMaxTime() {
            return tdsRequestorDecMaxTime;
        }

        /**
         * Sets the value of the tdsRequestorDecMaxTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsRequestorDecMaxTime(Long value) {
            this.tdsRequestorDecMaxTime = value;
        }

        /**
         * Gets the value of the tdsServerTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTdsServerTransId() {
            return tdsServerTransId;
        }

        /**
         * Sets the value of the tdsServerTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTdsServerTransId(String value) {
            this.tdsServerTransId = value;
        }

        /**
         * Gets the value of the acsTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcsTransId() {
            return acsTransId;
        }

        /**
         * Sets the value of the acsTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcsTransId(String value) {
            this.acsTransId = value;
        }

        /**
         * Gets the value of the dsTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDsTransId() {
            return dsTransId;
        }

        /**
         * Sets the value of the dsTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDsTransId(String value) {
            this.dsTransId = value;
        }

        /**
         * Gets the value of the sdkTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSdkTransId() {
            return sdkTransId;
        }

        /**
         * Sets the value of the sdkTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSdkTransId(String value) {
            this.sdkTransId = value;
        }

        /**
         * Gets the value of the dsUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDsUrl() {
            return dsUrl;
        }

        /**
         * Sets the value of the dsUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDsUrl(String value) {
            this.dsUrl = value;
        }

        /**
         * Gets the value of the messageCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageCategory() {
            return messageCategory;
        }

        /**
         * Sets the value of the messageCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageCategory(String value) {
            this.messageCategory = value;
        }

        /**
         * Gets the value of the messageVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageVersion() {
            return messageVersion;
        }

        /**
         * Sets the value of the messageVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageVersion(String value) {
            this.messageVersion = value;
        }

        /**
         * Gets the value of the qrcKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrcKind() {
            return qrcKind;
        }

        /**
         * Sets the value of the qrcKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrcKind(String value) {
            this.qrcKind = value;
        }

        /**
         * Gets the value of the qrcPayload property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrcPayload() {
            return qrcPayload;
        }

        /**
         * Sets the value of the qrcPayload property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrcPayload(String value) {
            this.qrcPayload = value;
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
     *         &lt;element name="PayerId" type="{http://schemas.tranzaxis.com/invoicing.xsd}InvoicePayerId" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "payerId"
    })
    public static class PayerIds {

        @XmlElement(name = "PayerId")
        protected List<InvoicePayerId> payerId;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the payerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayerId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoicePayerId }
         * 
         * 
         */
        public List<InvoicePayerId> getPayerId() {
            if (payerId == null) {
                payerId = new ArrayList<InvoicePayerId>();
            }
            return this.payerId;
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
     *         &lt;element name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="TerminalId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="AdditionalData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "merchantId",
        "terminalId",
        "additionalData"
    })
    public static class QrcOper {

        @XmlElement(name = "MerchantId")
        protected Long merchantId;
        @XmlElement(name = "TerminalId")
        protected Long terminalId;
        @XmlElement(name = "AdditionalData")
        protected String additionalData;

        /**
         * Gets the value of the merchantId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMerchantId() {
            return merchantId;
        }

        /**
         * Sets the value of the merchantId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMerchantId(Long value) {
            this.merchantId = value;
        }

        /**
         * Gets the value of the terminalId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTerminalId() {
            return terminalId;
        }

        /**
         * Sets the value of the terminalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTerminalId(Long value) {
            this.terminalId = value;
        }

        /**
         * Gets the value of the additionalData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalData() {
            return additionalData;
        }

        /**
         * Sets the value of the additionalData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalData(String value) {
            this.additionalData = value;
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
     *         &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardExp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ExtCardToken" type="{http://schemas.tranzaxis.com/tran-common.xsd}Token" minOccurs="0"/&gt;
     *         &lt;element name="AgentBic" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AgentName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="PartySortCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAcctName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAcctNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyFundsCategory" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyRidKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyLegalName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyLegalRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDoc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDocKind" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyTaxNum" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyPam" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyFirstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyMiddleName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyLastName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyDayOfBirth" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="PartyCountry" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="PartyRegion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyCity" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyZip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="PartyPhone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "contractId",
        "extCardId",
        "extCardPan",
        "extCardExp",
        "extCardToken",
        "agentBic",
        "agentRid",
        "agentName",
        "partyId",
        "partySortCode",
        "partyAcctName",
        "partyAcctNum",
        "partyFundsCategory",
        "partyRidKind",
        "partyRid",
        "partyName",
        "partyLegalName",
        "partyLegalRid",
        "partyAddress",
        "partyDoc",
        "partyDocKind",
        "partyTaxNum",
        "partyPam",
        "partyFirstName",
        "partyMiddleName",
        "partyLastName",
        "partyDayOfBirth",
        "partyCountry",
        "partyRegion",
        "partyCity",
        "partyZip",
        "partyPhone"
    })
    public static class Source {

        @XmlElementRef(name = "ContractId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> contractId;
        @XmlElementRef(name = "ExtCardId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> extCardId;
        @XmlElementRef(name = "ExtCardPan", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> extCardPan;
        @XmlElementRef(name = "ExtCardExp", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> extCardExp;
        @XmlElement(name = "ExtCardToken")
        protected Token extCardToken;
        @XmlElementRef(name = "AgentBic", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentBic;
        @XmlElementRef(name = "AgentRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentRid;
        @XmlElementRef(name = "AgentName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> agentName;
        @XmlElementRef(name = "PartyId", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> partyId;
        @XmlElementRef(name = "PartySortCode", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partySortCode;
        @XmlElementRef(name = "PartyAcctName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAcctName;
        @XmlElementRef(name = "PartyAcctNum", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAcctNum;
        @XmlElementRef(name = "PartyFundsCategory", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyFundsCategory;
        @XmlElementRef(name = "PartyRidKind", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRidKind;
        @XmlElementRef(name = "PartyRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRid;
        @XmlElementRef(name = "PartyName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyName;
        @XmlElementRef(name = "PartyLegalName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyLegalName;
        @XmlElementRef(name = "PartyLegalRid", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyLegalRid;
        @XmlElementRef(name = "PartyAddress", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyAddress;
        @XmlElementRef(name = "PartyDoc", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyDoc;
        @XmlElementRef(name = "PartyDocKind", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyDocKind;
        @XmlElementRef(name = "PartyTaxNum", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyTaxNum;
        @XmlElementRef(name = "PartyPam", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyPam;
        @XmlElementRef(name = "PartyFirstName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyFirstName;
        @XmlElementRef(name = "PartyMiddleName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyMiddleName;
        @XmlElementRef(name = "PartyLastName", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyLastName;
        @XmlElementRef(name = "PartyDayOfBirth", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> partyDayOfBirth;
        @XmlElementRef(name = "PartyCountry", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> partyCountry;
        @XmlElementRef(name = "PartyRegion", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyRegion;
        @XmlElementRef(name = "PartyCity", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyCity;
        @XmlElementRef(name = "PartyZip", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyZip;
        @XmlElementRef(name = "PartyPhone", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> partyPhone;

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
         * Gets the value of the extCardId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getExtCardId() {
            return extCardId;
        }

        /**
         * Sets the value of the extCardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setExtCardId(JAXBElement<Long> value) {
            this.extCardId = value;
        }

        /**
         * Gets the value of the extCardPan property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExtCardPan() {
            return extCardPan;
        }

        /**
         * Sets the value of the extCardPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExtCardPan(JAXBElement<String> value) {
            this.extCardPan = value;
        }

        /**
         * Gets the value of the extCardExp property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getExtCardExp() {
            return extCardExp;
        }

        /**
         * Sets the value of the extCardExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setExtCardExp(JAXBElement<XMLGregorianCalendar> value) {
            this.extCardExp = value;
        }

        /**
         * Gets the value of the extCardToken property.
         * 
         * @return
         *     possible object is
         *     {@link Token }
         *     
         */
        public Token getExtCardToken() {
            return extCardToken;
        }

        /**
         * Sets the value of the extCardToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token }
         *     
         */
        public void setExtCardToken(Token value) {
            this.extCardToken = value;
        }

        /**
         * Gets the value of the agentBic property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentBic() {
            return agentBic;
        }

        /**
         * Sets the value of the agentBic property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentBic(JAXBElement<String> value) {
            this.agentBic = value;
        }

        /**
         * Gets the value of the agentRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentRid() {
            return agentRid;
        }

        /**
         * Sets the value of the agentRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentRid(JAXBElement<String> value) {
            this.agentRid = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAgentName(JAXBElement<String> value) {
            this.agentName = value;
        }

        /**
         * Gets the value of the partyId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getPartyId() {
            return partyId;
        }

        /**
         * Sets the value of the partyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setPartyId(JAXBElement<Long> value) {
            this.partyId = value;
        }

        /**
         * Gets the value of the partySortCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartySortCode() {
            return partySortCode;
        }

        /**
         * Sets the value of the partySortCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartySortCode(JAXBElement<String> value) {
            this.partySortCode = value;
        }

        /**
         * Gets the value of the partyAcctName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAcctName() {
            return partyAcctName;
        }

        /**
         * Sets the value of the partyAcctName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAcctName(JAXBElement<String> value) {
            this.partyAcctName = value;
        }

        /**
         * Gets the value of the partyAcctNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAcctNum() {
            return partyAcctNum;
        }

        /**
         * Sets the value of the partyAcctNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAcctNum(JAXBElement<String> value) {
            this.partyAcctNum = value;
        }

        /**
         * Gets the value of the partyFundsCategory property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyFundsCategory() {
            return partyFundsCategory;
        }

        /**
         * Sets the value of the partyFundsCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyFundsCategory(JAXBElement<String> value) {
            this.partyFundsCategory = value;
        }

        /**
         * Gets the value of the partyRidKind property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRidKind() {
            return partyRidKind;
        }

        /**
         * Sets the value of the partyRidKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRidKind(JAXBElement<String> value) {
            this.partyRidKind = value;
        }

        /**
         * Gets the value of the partyRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRid() {
            return partyRid;
        }

        /**
         * Sets the value of the partyRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRid(JAXBElement<String> value) {
            this.partyRid = value;
        }

        /**
         * Gets the value of the partyName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyName() {
            return partyName;
        }

        /**
         * Sets the value of the partyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyName(JAXBElement<String> value) {
            this.partyName = value;
        }

        /**
         * Gets the value of the partyLegalName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyLegalName() {
            return partyLegalName;
        }

        /**
         * Sets the value of the partyLegalName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyLegalName(JAXBElement<String> value) {
            this.partyLegalName = value;
        }

        /**
         * Gets the value of the partyLegalRid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyLegalRid() {
            return partyLegalRid;
        }

        /**
         * Sets the value of the partyLegalRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyLegalRid(JAXBElement<String> value) {
            this.partyLegalRid = value;
        }

        /**
         * Gets the value of the partyAddress property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyAddress() {
            return partyAddress;
        }

        /**
         * Sets the value of the partyAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyAddress(JAXBElement<String> value) {
            this.partyAddress = value;
        }

        /**
         * Gets the value of the partyDoc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyDoc() {
            return partyDoc;
        }

        /**
         * Sets the value of the partyDoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyDoc(JAXBElement<String> value) {
            this.partyDoc = value;
        }

        /**
         * Gets the value of the partyDocKind property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyDocKind() {
            return partyDocKind;
        }

        /**
         * Sets the value of the partyDocKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyDocKind(JAXBElement<String> value) {
            this.partyDocKind = value;
        }

        /**
         * Gets the value of the partyTaxNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyTaxNum() {
            return partyTaxNum;
        }

        /**
         * Sets the value of the partyTaxNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyTaxNum(JAXBElement<String> value) {
            this.partyTaxNum = value;
        }

        /**
         * Gets the value of the partyPam property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyPam() {
            return partyPam;
        }

        /**
         * Sets the value of the partyPam property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyPam(JAXBElement<String> value) {
            this.partyPam = value;
        }

        /**
         * Gets the value of the partyFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyFirstName() {
            return partyFirstName;
        }

        /**
         * Sets the value of the partyFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyFirstName(JAXBElement<String> value) {
            this.partyFirstName = value;
        }

        /**
         * Gets the value of the partyMiddleName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyMiddleName() {
            return partyMiddleName;
        }

        /**
         * Sets the value of the partyMiddleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyMiddleName(JAXBElement<String> value) {
            this.partyMiddleName = value;
        }

        /**
         * Gets the value of the partyLastName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyLastName() {
            return partyLastName;
        }

        /**
         * Sets the value of the partyLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyLastName(JAXBElement<String> value) {
            this.partyLastName = value;
        }

        /**
         * Gets the value of the partyDayOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPartyDayOfBirth() {
            return partyDayOfBirth;
        }

        /**
         * Sets the value of the partyDayOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPartyDayOfBirth(JAXBElement<XMLGregorianCalendar> value) {
            this.partyDayOfBirth = value;
        }

        /**
         * Gets the value of the partyCountry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getPartyCountry() {
            return partyCountry;
        }

        /**
         * Sets the value of the partyCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setPartyCountry(JAXBElement<Long> value) {
            this.partyCountry = value;
        }

        /**
         * Gets the value of the partyRegion property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyRegion() {
            return partyRegion;
        }

        /**
         * Sets the value of the partyRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyRegion(JAXBElement<String> value) {
            this.partyRegion = value;
        }

        /**
         * Gets the value of the partyCity property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyCity() {
            return partyCity;
        }

        /**
         * Sets the value of the partyCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyCity(JAXBElement<String> value) {
            this.partyCity = value;
        }

        /**
         * Gets the value of the partyZip property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyZip() {
            return partyZip;
        }

        /**
         * Sets the value of the partyZip property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyZip(JAXBElement<String> value) {
            this.partyZip = value;
        }

        /**
         * Gets the value of the partyPhone property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPartyPhone() {
            return partyPhone;
        }

        /**
         * Sets the value of the partyPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPartyPhone(JAXBElement<String> value) {
            this.partyPhone = value;
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
     *         &lt;element name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="SalesTaxAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="Discount" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="SrcSurchargeAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="DstSurchargeAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="AuthAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="PaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="PaidTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
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
        "amt",
        "ccy",
        "salesTaxAmt",
        "discount",
        "srcSurchargeAmt",
        "dstSurchargeAmt",
        "authAmt",
        "paidAmt",
        "paidTime"
    })
    public static class Value {

        @XmlElement(name = "Amt")
        protected BigDecimal amt;
        @XmlElement(name = "Ccy")
        protected Long ccy;
        @XmlElementRef(name = "SalesTaxAmt", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> salesTaxAmt;
        @XmlElementRef(name = "Discount", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> discount;
        @XmlElementRef(name = "SrcSurchargeAmt", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> srcSurchargeAmt;
        @XmlElementRef(name = "DstSurchargeAmt", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dstSurchargeAmt;
        @XmlElementRef(name = "AuthAmt", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> authAmt;
        @XmlElementRef(name = "PaidAmt", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> paidAmt;
        @XmlElementRef(name = "PaidTime", namespace = "http://schemas.tranzaxis.com/invoicing.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> paidTime;

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
         * Gets the value of the salesTaxAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSalesTaxAmt() {
            return salesTaxAmt;
        }

        /**
         * Sets the value of the salesTaxAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSalesTaxAmt(JAXBElement<BigDecimal> value) {
            this.salesTaxAmt = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDiscount(JAXBElement<BigDecimal> value) {
            this.discount = value;
        }

        /**
         * Gets the value of the srcSurchargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSrcSurchargeAmt() {
            return srcSurchargeAmt;
        }

        /**
         * Sets the value of the srcSurchargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSrcSurchargeAmt(JAXBElement<BigDecimal> value) {
            this.srcSurchargeAmt = value;
        }

        /**
         * Gets the value of the dstSurchargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDstSurchargeAmt() {
            return dstSurchargeAmt;
        }

        /**
         * Sets the value of the dstSurchargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDstSurchargeAmt(JAXBElement<BigDecimal> value) {
            this.dstSurchargeAmt = value;
        }

        /**
         * Gets the value of the authAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getAuthAmt() {
            return authAmt;
        }

        /**
         * Sets the value of the authAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setAuthAmt(JAXBElement<BigDecimal> value) {
            this.authAmt = value;
        }

        /**
         * Gets the value of the paidAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPaidAmt() {
            return paidAmt;
        }

        /**
         * Sets the value of the paidAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPaidAmt(JAXBElement<BigDecimal> value) {
            this.paidAmt = value;
        }

        /**
         * Gets the value of the paidTime property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getPaidTime() {
            return paidTime;
        }

        /**
         * Sets the value of the paidTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setPaidTime(JAXBElement<XMLGregorianCalendar> value) {
            this.paidTime = value;
        }

    }

}
