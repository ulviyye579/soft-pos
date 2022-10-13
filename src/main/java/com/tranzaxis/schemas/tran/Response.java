
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.applications.Application;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.invoicing.Invoice;
import com.tranzaxis.schemas.tran_common.AcqInstallmentResponseSpecific;
import com.tranzaxis.schemas.tran_common.AuthScheme;
import com.tranzaxis.schemas.tran_common.CofMatch;
import com.tranzaxis.schemas.tran_common.ContractStatements;
import com.tranzaxis.schemas.tran_common.CustInfoRs;
import com.tranzaxis.schemas.tran_common.ExceptionalCard;
import com.tranzaxis.schemas.tran_common.ExtCardRs;
import com.tranzaxis.schemas.tran_common.InstallmentRs;
import com.tranzaxis.schemas.tran_common.OrganizationInfo;
import com.tranzaxis.schemas.tran_common.PaymentQrcRs;
import com.tranzaxis.schemas.tran_common.PaymentTemplateSettings;
import com.tranzaxis.schemas.tran_common.RefineRq;
import com.tranzaxis.schemas.tran_common.ResultSpecific;
import com.tranzaxis.schemas.tran_common.SetupInvoiceSubscription;
import com.tranzaxis.schemas.tran_common.Surcharge;
import com.tranzaxis.schemas.tran_common.TokenSpecificRs;
import com.tranzaxis.schemas.tran_common.UpdateClientInfoSpecificRs;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclineCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CustInfo" type="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RefineRq" type="{http://schemas.tranzaxis.com/tran-common.xsd}RefineRq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Emv" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Arpc"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IssuerScriptResult"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Script1"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Script2"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Match" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://schemas.tranzaxis.com/tran-common.xsd}MatchingAttrs"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Auth" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PersonalInfo" type="{http://schemas.tranzaxis.com/tran.xsd}PersonalInfoCheck" minOccurs="0"/&gt;
 *                   &lt;element name="PayeePersonalInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="BirthDateOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="DocOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Scheme" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthScheme" minOccurs="0"/&gt;
 *                   &lt;element name="ScaExemptions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Network" type="{http://schemas.tranzaxis.com/tran.xsd}ScaExemptionsNetworkSpecific" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="LowRiskOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="LowRiskScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TrustedMerchantOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="DelegationOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PinOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ArqcOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="CvvOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="Cvv2Ok" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="CavvOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Specific" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Hold" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="HoldId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ExceptionalCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}ExceptionalCard" minOccurs="0"/&gt;
 *                   &lt;element name="Tds" type="{http://schemas.tranzaxis.com/tran.xsd}TdsRs" minOccurs="0"/&gt;
 *                   &lt;element name="Admin" type="{http://schemas.tranzaxis.com/tran.xsd}AdminSpecific" minOccurs="0"/&gt;
 *                   &lt;element name="CreateVirtualCard" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Expiration" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ExpirationFormat"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Cvv2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CreateLogin" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RepaymentLoan" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Application" type="{http://schemas.tranzaxis.com/applications.xsd}Application" minOccurs="0"/&gt;
 *                   &lt;element name="StandingOrder" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Statements" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractStatements" minOccurs="0"/&gt;
 *                   &lt;element name="Group" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Tran" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BalanceSubtask" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="Reserves" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Reserve" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="SubportfolioId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                               &lt;attribute name="DebtKind" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                               &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Payment" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Terminal" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Owner" type="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationInfo" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/tran.xsd}TermTypeEnum" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ExtAttr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SendContractInfo" type="{http://schemas.tranzaxis.com/tran.xsd}SendContractInfoSpecific" minOccurs="0"/&gt;
 *                   &lt;element name="AcqInstallment" type="{http://schemas.tranzaxis.com/tran-common.xsd}AcqInstallmentResponseSpecific" minOccurs="0"/&gt;
 *                   &lt;element name="Installment" type="{http://schemas.tranzaxis.com/tran-common.xsd}InstallmentRs" minOccurs="0"/&gt;
 *                   &lt;element name="RunBatchProc" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Batch" type="{http://schemas.tranzaxis.com/tran.xsd}BatchProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ImportCfgPacket" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ScoreSubject" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Modules" type="{http://schemas.tranzaxis.com/tran.xsd}ScoringModules" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RiskRate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Result" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="ResultDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="MonthlyPayment" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TerminalRefill" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ClosedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="OpenedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}ExtCardRs" minOccurs="0"/&gt;
 *                   &lt;element name="InquiryCardEtuStatus" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryCardEtuStatusSpecific" minOccurs="0"/&gt;
 *                   &lt;element name="UpdateClientInfo" type="{http://schemas.tranzaxis.com/tran-common.xsd}UpdateClientInfoSpecificRs" minOccurs="0"/&gt;
 *                   &lt;element name="Digitization" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationRs" minOccurs="0"/&gt;
 *                   &lt;element name="Token" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}TokenSpecificRs"&gt;
 *                           &lt;sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProvisioningData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Data" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="TavData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="ActivationData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="EphemernalPublicKey" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="EncryptedPassData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LoadCfgPacket" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Report" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
 *                   &lt;element name="Invoice" type="{http://schemas.tranzaxis.com/invoicing.xsd}Invoice" minOccurs="0"/&gt;
 *                   &lt;element name="RegOrgInNetwork" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecific" minOccurs="0"/&gt;
 *                             &lt;element name="Error" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PaymentQrc" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentQrcRs" minOccurs="0"/&gt;
 *                   &lt;element name="SetupInvoiceSubscription" type="{http://schemas.tranzaxis.com/tran-common.xsd}SetupInvoiceSubscription" minOccurs="0"/&gt;
 *                   &lt;element name="InquiryTokenAuthData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Aliases" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tran.xsd}TokenAliasAuthData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
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
 *                 &lt;attribute name="InterchangeReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/tran.xsd}NetworkSpecific" minOccurs="0"/&gt;
 *         &lt;element name="ResultSpecific" type="{http://schemas.tranzaxis.com/tran-common.xsd}ResultSpecific" minOccurs="0"/&gt;
 *         &lt;element name="Moneys" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Settle" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Date" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="CycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IssuerClear" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Dcc" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Surcharges" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="ExternalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                     &lt;attribute name="ToTakeCash" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysCust"/&gt;
 *                           &lt;attribute name="DccStatus"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="DccIneligibleReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Term" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Surcharges" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Dest" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysDest"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinPlanDesc" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FinPlanDesc2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTemplate" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings" minOccurs="0"/&gt;
 *         &lt;element name="EntryPlan" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Entry" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Part" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *                                     &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *                                     &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Sign" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                           &lt;maxInclusive value="1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                     &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="AccountAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                                     &lt;attribute name="AccountCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="AccountNumber" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
 *                           &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ExtId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Result" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}TranResult" /&gt;
 *       &lt;attribute name="IsPartialApproval" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="IsGoodsAuthOnly" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="DeclineReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ApprovalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PayeeApprovalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CaptureToken" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="AsyncBatchId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="NeedAdditionalAuth" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="NeedTerminalCompletion" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="TextMess" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IntMess" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Version" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "declineCode",
    "custInfo",
    "refineRq",
    "emv",
    "match",
    "auth",
    "specific",
    "networkSpecific",
    "resultSpecific",
    "moneys",
    "finPlanDesc",
    "finPlanDesc2",
    "paymentTemplate",
    "entryPlan",
    "userAttrs",
    "ext"
})
public class Response {

    @XmlElement(name = "DeclineCode")
    protected String declineCode;
    @XmlElement(name = "CustInfo")
    protected List<CustInfoRs> custInfo;
    @XmlElement(name = "RefineRq")
    protected List<RefineRq> refineRq;
    @XmlElement(name = "Emv")
    protected Response.Emv emv;
    @XmlElement(name = "Match")
    protected Response.Match match;
    @XmlElement(name = "Auth")
    protected Response.Auth auth;
    @XmlElement(name = "Specific")
    protected Response.Specific specific;
    @XmlElement(name = "NetworkSpecific")
    protected com.tranzaxis.schemas.tran.NetworkSpecific networkSpecific;
    @XmlElement(name = "ResultSpecific")
    protected ResultSpecific resultSpecific;
    @XmlElement(name = "Moneys")
    protected Response.Moneys moneys;
    @XmlElement(name = "FinPlanDesc")
    protected Object finPlanDesc;
    @XmlElement(name = "FinPlanDesc2")
    protected Object finPlanDesc2;
    @XmlElement(name = "PaymentTemplate")
    protected PaymentTemplateSettings paymentTemplate;
    @XmlElement(name = "EntryPlan")
    protected Response.EntryPlan entryPlan;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "OperDay")
    protected XMLGregorianCalendar operDay;
    @XmlAttribute(name = "ExtId")
    protected Long extId;
    @XmlAttribute(name = "Result", required = true)
    protected String result;
    @XmlAttribute(name = "IsPartialApproval")
    protected Boolean isPartialApproval;
    @XmlAttribute(name = "IsGoodsAuthOnly")
    protected Boolean isGoodsAuthOnly;
    @XmlAttribute(name = "DeclineReason")
    protected String declineReason;
    @XmlAttribute(name = "ApprovalCode")
    protected String approvalCode;
    @XmlAttribute(name = "PayeeApprovalCode")
    protected String payeeApprovalCode;
    @XmlAttribute(name = "CaptureToken")
    protected Boolean captureToken;
    @XmlAttribute(name = "AsyncBatchId")
    protected Long asyncBatchId;
    @XmlAttribute(name = "NeedAdditionalAuth")
    protected Boolean needAdditionalAuth;
    @XmlAttribute(name = "NeedTerminalCompletion")
    protected Boolean needTerminalCompletion;
    @XmlAttribute(name = "TextMess")
    protected String textMess;
    @XmlAttribute(name = "IntMess")
    protected Long intMess;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the declineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineCode() {
        return declineCode;
    }

    /**
     * Sets the value of the declineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineCode(String value) {
        this.declineCode = value;
    }

    /**
     * Gets the value of the custInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustInfoRs }
     * 
     * 
     */
    public List<CustInfoRs> getCustInfo() {
        if (custInfo == null) {
            custInfo = new ArrayList<CustInfoRs>();
        }
        return this.custInfo;
    }

    /**
     * Gets the value of the refineRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineRq }
     * 
     * 
     */
    public List<RefineRq> getRefineRq() {
        if (refineRq == null) {
            refineRq = new ArrayList<RefineRq>();
        }
        return this.refineRq;
    }

    /**
     * Gets the value of the emv property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Emv }
     *     
     */
    public Response.Emv getEmv() {
        return emv;
    }

    /**
     * Sets the value of the emv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Emv }
     *     
     */
    public void setEmv(Response.Emv value) {
        this.emv = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Match }
     *     
     */
    public Response.Match getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Match }
     *     
     */
    public void setMatch(Response.Match value) {
        this.match = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Auth }
     *     
     */
    public Response.Auth getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Auth }
     *     
     */
    public void setAuth(Response.Auth value) {
        this.auth = value;
    }

    /**
     * Gets the value of the specific property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Specific }
     *     
     */
    public Response.Specific getSpecific() {
        return specific;
    }

    /**
     * Sets the value of the specific property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Specific }
     *     
     */
    public void setSpecific(Response.Specific value) {
        this.specific = value;
    }

    /**
     * Gets the value of the networkSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link com.tranzaxis.schemas.tran.NetworkSpecific }
     *     
     */
    public com.tranzaxis.schemas.tran.NetworkSpecific getNetworkSpecific() {
        return networkSpecific;
    }

    /**
     * Sets the value of the networkSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.tranzaxis.schemas.tran.NetworkSpecific }
     *     
     */
    public void setNetworkSpecific(com.tranzaxis.schemas.tran.NetworkSpecific value) {
        this.networkSpecific = value;
    }

    /**
     * Gets the value of the resultSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific }
     *     
     */
    public ResultSpecific getResultSpecific() {
        return resultSpecific;
    }

    /**
     * Sets the value of the resultSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific }
     *     
     */
    public void setResultSpecific(ResultSpecific value) {
        this.resultSpecific = value;
    }

    /**
     * Gets the value of the moneys property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Moneys }
     *     
     */
    public Response.Moneys getMoneys() {
        return moneys;
    }

    /**
     * Sets the value of the moneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Moneys }
     *     
     */
    public void setMoneys(Response.Moneys value) {
        this.moneys = value;
    }

    /**
     * Gets the value of the finPlanDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFinPlanDesc() {
        return finPlanDesc;
    }

    /**
     * Sets the value of the finPlanDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFinPlanDesc(Object value) {
        this.finPlanDesc = value;
    }

    /**
     * Gets the value of the finPlanDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFinPlanDesc2() {
        return finPlanDesc2;
    }

    /**
     * Sets the value of the finPlanDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFinPlanDesc2(Object value) {
        this.finPlanDesc2 = value;
    }

    /**
     * Gets the value of the paymentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public PaymentTemplateSettings getPaymentTemplate() {
        return paymentTemplate;
    }

    /**
     * Sets the value of the paymentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public void setPaymentTemplate(PaymentTemplateSettings value) {
        this.paymentTemplate = value;
    }

    /**
     * Gets the value of the entryPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Response.EntryPlan }
     *     
     */
    public Response.EntryPlan getEntryPlan() {
        return entryPlan;
    }

    /**
     * Sets the value of the entryPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.EntryPlan }
     *     
     */
    public void setEntryPlan(Response.EntryPlan value) {
        this.entryPlan = value;
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
     * Gets the value of the operDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperDay() {
        return operDay;
    }

    /**
     * Sets the value of the operDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperDay(XMLGregorianCalendar value) {
        this.operDay = value;
    }

    /**
     * Gets the value of the extId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtId(Long value) {
        this.extId = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the isPartialApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialApproval() {
        return isPartialApproval;
    }

    /**
     * Sets the value of the isPartialApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialApproval(Boolean value) {
        this.isPartialApproval = value;
    }

    /**
     * Gets the value of the isGoodsAuthOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGoodsAuthOnly() {
        return isGoodsAuthOnly;
    }

    /**
     * Sets the value of the isGoodsAuthOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGoodsAuthOnly(Boolean value) {
        this.isGoodsAuthOnly = value;
    }

    /**
     * Gets the value of the declineReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineReason() {
        return declineReason;
    }

    /**
     * Sets the value of the declineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineReason(String value) {
        this.declineReason = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the payeeApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeApprovalCode() {
        return payeeApprovalCode;
    }

    /**
     * Sets the value of the payeeApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeApprovalCode(String value) {
        this.payeeApprovalCode = value;
    }

    /**
     * Gets the value of the captureToken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaptureToken() {
        return captureToken;
    }

    /**
     * Sets the value of the captureToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaptureToken(Boolean value) {
        this.captureToken = value;
    }

    /**
     * Gets the value of the asyncBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAsyncBatchId() {
        return asyncBatchId;
    }

    /**
     * Sets the value of the asyncBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAsyncBatchId(Long value) {
        this.asyncBatchId = value;
    }

    /**
     * Gets the value of the needAdditionalAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedAdditionalAuth() {
        return needAdditionalAuth;
    }

    /**
     * Sets the value of the needAdditionalAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedAdditionalAuth(Boolean value) {
        this.needAdditionalAuth = value;
    }

    /**
     * Gets the value of the needTerminalCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedTerminalCompletion() {
        return needTerminalCompletion;
    }

    /**
     * Sets the value of the needTerminalCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedTerminalCompletion(Boolean value) {
        this.needTerminalCompletion = value;
    }

    /**
     * Gets the value of the textMess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextMess() {
        return textMess;
    }

    /**
     * Sets the value of the textMess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextMess(String value) {
        this.textMess = value;
    }

    /**
     * Gets the value of the intMess property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntMess() {
        return intMess;
    }

    /**
     * Sets the value of the intMess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntMess(Long value) {
        this.intMess = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="PersonalInfo" type="{http://schemas.tranzaxis.com/tran.xsd}PersonalInfoCheck" minOccurs="0"/&gt;
     *         &lt;element name="PayeePersonalInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="BirthDateOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="DocOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Scheme" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthScheme" minOccurs="0"/&gt;
     *         &lt;element name="ScaExemptions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Network" type="{http://schemas.tranzaxis.com/tran.xsd}ScaExemptionsNetworkSpecific" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="LowRiskOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="LowRiskScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TrustedMerchantOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="DelegationOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PinOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ArqcOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="CvvOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="Cvv2Ok" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="CavvOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personalInfo",
        "payeePersonalInfo",
        "scheme",
        "scaExemptions"
    })
    public static class Auth {

        @XmlElement(name = "PersonalInfo")
        protected PersonalInfoCheck personalInfo;
        @XmlElement(name = "PayeePersonalInfo")
        protected Response.Auth.PayeePersonalInfo payeePersonalInfo;
        @XmlElement(name = "Scheme")
        protected AuthScheme scheme;
        @XmlElement(name = "ScaExemptions")
        protected Response.Auth.ScaExemptions scaExemptions;
        @XmlAttribute(name = "PinOk")
        protected Boolean pinOk;
        @XmlAttribute(name = "ArqcOk")
        protected Boolean arqcOk;
        @XmlAttribute(name = "CvvOk")
        protected Boolean cvvOk;
        @XmlAttribute(name = "Cvv2Ok")
        protected Boolean cvv2Ok;
        @XmlAttribute(name = "CavvOk")
        protected Boolean cavvOk;

        /**
         * Gets the value of the personalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PersonalInfoCheck }
         *     
         */
        public PersonalInfoCheck getPersonalInfo() {
            return personalInfo;
        }

        /**
         * Sets the value of the personalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalInfoCheck }
         *     
         */
        public void setPersonalInfo(PersonalInfoCheck value) {
            this.personalInfo = value;
        }

        /**
         * Gets the value of the payeePersonalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Auth.PayeePersonalInfo }
         *     
         */
        public Response.Auth.PayeePersonalInfo getPayeePersonalInfo() {
            return payeePersonalInfo;
        }

        /**
         * Sets the value of the payeePersonalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Auth.PayeePersonalInfo }
         *     
         */
        public void setPayeePersonalInfo(Response.Auth.PayeePersonalInfo value) {
            this.payeePersonalInfo = value;
        }

        /**
         * Gets the value of the scheme property.
         * 
         * @return
         *     possible object is
         *     {@link AuthScheme }
         *     
         */
        public AuthScheme getScheme() {
            return scheme;
        }

        /**
         * Sets the value of the scheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthScheme }
         *     
         */
        public void setScheme(AuthScheme value) {
            this.scheme = value;
        }

        /**
         * Gets the value of the scaExemptions property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Auth.ScaExemptions }
         *     
         */
        public Response.Auth.ScaExemptions getScaExemptions() {
            return scaExemptions;
        }

        /**
         * Sets the value of the scaExemptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Auth.ScaExemptions }
         *     
         */
        public void setScaExemptions(Response.Auth.ScaExemptions value) {
            this.scaExemptions = value;
        }

        /**
         * Gets the value of the pinOk property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPinOk() {
            return pinOk;
        }

        /**
         * Sets the value of the pinOk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPinOk(Boolean value) {
            this.pinOk = value;
        }

        /**
         * Gets the value of the arqcOk property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isArqcOk() {
            return arqcOk;
        }

        /**
         * Sets the value of the arqcOk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setArqcOk(Boolean value) {
            this.arqcOk = value;
        }

        /**
         * Gets the value of the cvvOk property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCvvOk() {
            return cvvOk;
        }

        /**
         * Sets the value of the cvvOk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCvvOk(Boolean value) {
            this.cvvOk = value;
        }

        /**
         * Gets the value of the cvv2Ok property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCvv2Ok() {
            return cvv2Ok;
        }

        /**
         * Sets the value of the cvv2Ok property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCvv2Ok(Boolean value) {
            this.cvv2Ok = value;
        }

        /**
         * Gets the value of the cavvOk property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCavvOk() {
            return cavvOk;
        }

        /**
         * Sets the value of the cavvOk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCavvOk(Boolean value) {
            this.cavvOk = value;
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
         *       &lt;attribute name="BirthDateOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="DocOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PayeePersonalInfo {

            @XmlAttribute(name = "BirthDateOk")
            protected Boolean birthDateOk;
            @XmlAttribute(name = "DocOk")
            protected Boolean docOk;

            /**
             * Gets the value of the birthDateOk property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBirthDateOk() {
                return birthDateOk;
            }

            /**
             * Sets the value of the birthDateOk property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBirthDateOk(Boolean value) {
                this.birthDateOk = value;
            }

            /**
             * Gets the value of the docOk property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDocOk() {
                return docOk;
            }

            /**
             * Sets the value of the docOk property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDocOk(Boolean value) {
                this.docOk = value;
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
         *         &lt;element name="Network" type="{http://schemas.tranzaxis.com/tran.xsd}ScaExemptionsNetworkSpecific" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="LowRiskOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="LowRiskScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TrustedMerchantOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="DelegationOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "network"
        })
        public static class ScaExemptions {

            @XmlElement(name = "Network")
            protected ScaExemptionsNetworkSpecific network;
            @XmlAttribute(name = "LowRiskOk")
            protected Boolean lowRiskOk;
            @XmlAttribute(name = "LowRiskScore")
            protected String lowRiskScore;
            @XmlAttribute(name = "TrustedMerchantOk")
            protected Boolean trustedMerchantOk;
            @XmlAttribute(name = "DelegationOk")
            protected Boolean delegationOk;

            /**
             * Gets the value of the network property.
             * 
             * @return
             *     possible object is
             *     {@link ScaExemptionsNetworkSpecific }
             *     
             */
            public ScaExemptionsNetworkSpecific getNetwork() {
                return network;
            }

            /**
             * Sets the value of the network property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScaExemptionsNetworkSpecific }
             *     
             */
            public void setNetwork(ScaExemptionsNetworkSpecific value) {
                this.network = value;
            }

            /**
             * Gets the value of the lowRiskOk property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLowRiskOk() {
                return lowRiskOk;
            }

            /**
             * Sets the value of the lowRiskOk property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLowRiskOk(Boolean value) {
                this.lowRiskOk = value;
            }

            /**
             * Gets the value of the lowRiskScore property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLowRiskScore() {
                return lowRiskScore;
            }

            /**
             * Sets the value of the lowRiskScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLowRiskScore(String value) {
                this.lowRiskScore = value;
            }

            /**
             * Gets the value of the trustedMerchantOk property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTrustedMerchantOk() {
                return trustedMerchantOk;
            }

            /**
             * Sets the value of the trustedMerchantOk property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTrustedMerchantOk(Boolean value) {
                this.trustedMerchantOk = value;
            }

            /**
             * Gets the value of the delegationOk property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDelegationOk() {
                return delegationOk;
            }

            /**
             * Sets the value of the delegationOk property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelegationOk(Boolean value) {
                this.delegationOk = value;
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
     *       &lt;attribute name="Arpc"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IssuerScriptResult"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Script1"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Script2"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
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
    @XmlType(name = "")
    public static class Emv {

        @XmlAttribute(name = "Arpc")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] arpc;
        @XmlAttribute(name = "IssuerScriptResult")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] issuerScriptResult;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "Script1")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] script1;
        @XmlAttribute(name = "Script2")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] script2;

        /**
         * Gets the value of the arpc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getArpc() {
            return arpc;
        }

        /**
         * Sets the value of the arpc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArpc(byte[] value) {
            this.arpc = value;
        }

        /**
         * Gets the value of the issuerScriptResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIssuerScriptResult() {
            return issuerScriptResult;
        }

        /**
         * Sets the value of the issuerScriptResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerScriptResult(byte[] value) {
            this.issuerScriptResult = value;
        }

        /**
         * Gets the value of the respCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRespCode() {
            return respCode;
        }

        /**
         * Sets the value of the respCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRespCode(String value) {
            this.respCode = value;
        }

        /**
         * Gets the value of the script1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getScript1() {
            return script1;
        }

        /**
         * Sets the value of the script1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScript1(byte[] value) {
            this.script1 = value;
        }

        /**
         * Gets the value of the script2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getScript2() {
            return script2;
        }

        /**
         * Sets the value of the script2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScript2(byte[] value) {
            this.script2 = value;
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
     *         &lt;element name="Entry" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Part" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
     *                           &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
     *                           &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Sign" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                                 &lt;maxInclusive value="1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="AccountAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                           &lt;attribute name="AccountCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="AccountNumber" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
     *                 &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
        "entry"
    })
    public static class EntryPlan {

        @XmlElement(name = "Entry", required = true)
        protected List<Response.EntryPlan.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.EntryPlan.Entry }
         * 
         * 
         */
        public List<Response.EntryPlan.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Response.EntryPlan.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="Part" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
         *                 &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
         *                 &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Sign" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                       &lt;maxInclusive value="1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="AccountAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                 &lt;attribute name="AccountCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="AccountNumber" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
         *       &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "part",
            "categoryText"
        })
        public static class Entry {

            @XmlElement(name = "Part", required = true)
            protected List<Response.EntryPlan.Entry.Part> part;
            @XmlElement(name = "CategoryText")
            protected String categoryText;
            @XmlAttribute(name = "Kind", required = true)
            protected String kind;
            @XmlAttribute(name = "CategoryCode")
            protected String categoryCode;

            /**
             * Gets the value of the part property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the part property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Response.EntryPlan.Entry.Part }
             * 
             * 
             */
            public List<Response.EntryPlan.Entry.Part> getPart() {
                if (part == null) {
                    part = new ArrayList<Response.EntryPlan.Entry.Part>();
                }
                return this.part;
            }

            /**
             * Gets the value of the categoryText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryText() {
                return categoryText;
            }

            /**
             * Sets the value of the categoryText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryText(String value) {
                this.categoryText = value;
            }

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
             * Gets the value of the categoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryCode() {
                return categoryCode;
            }

            /**
             * Sets the value of the categoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryCode(String value) {
                this.categoryCode = value;
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
             *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
             *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
             *       &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Sign" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *             &lt;maxInclusive value="1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
             *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="AccountAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
             *       &lt;attribute name="AccountCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="AccountNumber" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Part {

                @XmlAttribute(name = "FinOperKind")
                protected String finOperKind;
                @XmlAttribute(name = "RegRole")
                protected String regRole;
                @XmlAttribute(name = "Classification")
                protected String classification;
                @XmlAttribute(name = "ClassificationForGl")
                protected String classificationForGl;
                @XmlAttribute(name = "GlCode")
                protected String glCode;
                @XmlAttribute(name = "Sign", required = true)
                protected int sign;
                @XmlAttribute(name = "Amt", required = true)
                protected BigDecimal amt;
                @XmlAttribute(name = "Ccy", required = true)
                protected long ccy;
                @XmlAttribute(name = "AccountAmt", required = true)
                protected BigDecimal accountAmt;
                @XmlAttribute(name = "AccountCcy", required = true)
                protected long accountCcy;
                @XmlAttribute(name = "AccountId", required = true)
                protected long accountId;
                @XmlAttribute(name = "AccountNumber", required = true)
                protected String accountNumber;

                /**
                 * Gets the value of the finOperKind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFinOperKind() {
                    return finOperKind;
                }

                /**
                 * Sets the value of the finOperKind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFinOperKind(String value) {
                    this.finOperKind = value;
                }

                /**
                 * Gets the value of the regRole property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegRole() {
                    return regRole;
                }

                /**
                 * Sets the value of the regRole property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegRole(String value) {
                    this.regRole = value;
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
                 * Gets the value of the classificationForGl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClassificationForGl() {
                    return classificationForGl;
                }

                /**
                 * Sets the value of the classificationForGl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClassificationForGl(String value) {
                    this.classificationForGl = value;
                }

                /**
                 * Gets the value of the glCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGlCode() {
                    return glCode;
                }

                /**
                 * Sets the value of the glCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGlCode(String value) {
                    this.glCode = value;
                }

                /**
                 * Gets the value of the sign property.
                 * 
                 */
                public int getSign() {
                    return sign;
                }

                /**
                 * Sets the value of the sign property.
                 * 
                 */
                public void setSign(int value) {
                    this.sign = value;
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
                 * Gets the value of the accountAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAccountAmt() {
                    return accountAmt;
                }

                /**
                 * Sets the value of the accountAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAccountAmt(BigDecimal value) {
                    this.accountAmt = value;
                }

                /**
                 * Gets the value of the accountCcy property.
                 * 
                 */
                public long getAccountCcy() {
                    return accountCcy;
                }

                /**
                 * Sets the value of the accountCcy property.
                 * 
                 */
                public void setAccountCcy(long value) {
                    this.accountCcy = value;
                }

                /**
                 * Gets the value of the accountId property.
                 * 
                 */
                public long getAccountId() {
                    return accountId;
                }

                /**
                 * Sets the value of the accountId property.
                 * 
                 */
                public void setAccountId(long value) {
                    this.accountId = value;
                }

                /**
                 * Gets the value of the accountNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccountNumber() {
                    return accountNumber;
                }

                /**
                 * Sets the value of the accountNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccountNumber(String value) {
                    this.accountNumber = value;
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
     *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran-common.xsd}MatchingAttrs"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Match {

        @XmlAttribute(name = "Key")
        protected String key;
        @XmlAttribute(name = "Stan")
        protected String stan;
        @XmlAttribute(name = "Rrn")
        protected String rrn;
        @XmlAttribute(name = "Arn")
        protected String arn;
        @XmlAttribute(name = "Irn")
        protected String irn;
        @XmlAttribute(name = "Nrn")
        protected String nrn;
        @XmlAttribute(name = "TermRid")
        protected String termRid;
        @XmlAttribute(name = "TransTime")
        protected XMLGregorianCalendar transTime;
        @XmlAttribute(name = "AcquirerRid")
        protected String acquirerRid;
        @XmlAttribute(name = "ForwarderRid")
        protected String forwarderRid;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the stan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStan() {
            return stan;
        }

        /**
         * Sets the value of the stan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStan(String value) {
            this.stan = value;
        }

        /**
         * Gets the value of the rrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRrn() {
            return rrn;
        }

        /**
         * Sets the value of the rrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRrn(String value) {
            this.rrn = value;
        }

        /**
         * Gets the value of the arn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArn() {
            return arn;
        }

        /**
         * Sets the value of the arn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArn(String value) {
            this.arn = value;
        }

        /**
         * Gets the value of the irn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIrn() {
            return irn;
        }

        /**
         * Sets the value of the irn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIrn(String value) {
            this.irn = value;
        }

        /**
         * Gets the value of the nrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrn() {
            return nrn;
        }

        /**
         * Sets the value of the nrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrn(String value) {
            this.nrn = value;
        }

        /**
         * Gets the value of the termRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermRid() {
            return termRid;
        }

        /**
         * Sets the value of the termRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermRid(String value) {
            this.termRid = value;
        }

        /**
         * Gets the value of the transTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTransTime() {
            return transTime;
        }

        /**
         * Sets the value of the transTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTransTime(XMLGregorianCalendar value) {
            this.transTime = value;
        }

        /**
         * Gets the value of the acquirerRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcquirerRid() {
            return acquirerRid;
        }

        /**
         * Sets the value of the acquirerRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcquirerRid(String value) {
            this.acquirerRid = value;
        }

        /**
         * Gets the value of the forwarderRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForwarderRid() {
            return forwarderRid;
        }

        /**
         * Sets the value of the forwarderRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForwarderRid(String value) {
            this.forwarderRid = value;
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
     *         &lt;element name="Settle" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Date" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="CycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IssuerClear" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Dcc" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Surcharges" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="ExternalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                           &lt;attribute name="ToTakeCash" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysCust"/&gt;
     *                 &lt;attribute name="DccStatus"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="DccIneligibleReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Term" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Surcharges" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *         &lt;element name="Dest" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysDest"/&gt;
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
        "settle",
        "issuerClear",
        "dcc",
        "term",
        "dest"
    })
    public static class Moneys {

        @XmlElement(name = "Settle")
        protected Response.Moneys.Settle settle;
        @XmlElement(name = "IssuerClear")
        protected Response.Moneys.IssuerClear issuerClear;
        @XmlElement(name = "Dcc")
        protected Response.Moneys.Dcc dcc;
        @XmlElement(name = "Term")
        protected Response.Moneys.Term term;
        @XmlElement(name = "Dest")
        protected Response.Moneys.Dest dest;

        /**
         * Gets the value of the settle property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Moneys.Settle }
         *     
         */
        public Response.Moneys.Settle getSettle() {
            return settle;
        }

        /**
         * Sets the value of the settle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Moneys.Settle }
         *     
         */
        public void setSettle(Response.Moneys.Settle value) {
            this.settle = value;
        }

        /**
         * Gets the value of the issuerClear property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Moneys.IssuerClear }
         *     
         */
        public Response.Moneys.IssuerClear getIssuerClear() {
            return issuerClear;
        }

        /**
         * Sets the value of the issuerClear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Moneys.IssuerClear }
         *     
         */
        public void setIssuerClear(Response.Moneys.IssuerClear value) {
            this.issuerClear = value;
        }

        /**
         * Gets the value of the dcc property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Moneys.Dcc }
         *     
         */
        public Response.Moneys.Dcc getDcc() {
            return dcc;
        }

        /**
         * Sets the value of the dcc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Moneys.Dcc }
         *     
         */
        public void setDcc(Response.Moneys.Dcc value) {
            this.dcc = value;
        }

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Moneys.Term }
         *     
         */
        public Response.Moneys.Term getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Moneys.Term }
         *     
         */
        public void setTerm(Response.Moneys.Term value) {
            this.term = value;
        }

        /**
         * Gets the value of the dest property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Moneys.Dest }
         *     
         */
        public Response.Moneys.Dest getDest() {
            return dest;
        }

        /**
         * Sets the value of the dest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Moneys.Dest }
         *     
         */
        public void setDest(Response.Moneys.Dest value) {
            this.dest = value;
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
         *         &lt;element name="Surcharges" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="ExternalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                 &lt;attribute name="ToTakeCash" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysCust"/&gt;
         *       &lt;attribute name="DccStatus"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="DccIneligibleReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "surcharges"
        })
        public static class Dcc {

            @XmlElement(name = "Surcharges")
            protected Response.Moneys.Dcc.Surcharges surcharges;
            @XmlAttribute(name = "DccStatus")
            protected String dccStatus;
            @XmlAttribute(name = "DccIneligibleReason")
            protected String dccIneligibleReason;
            @XmlAttribute(name = "Amt")
            protected BigDecimal amt;
            @XmlAttribute(name = "PrevAmt")
            protected BigDecimal prevAmt;
            @XmlAttribute(name = "TermConvRate")
            protected BigDecimal termConvRate;
            @XmlAttribute(name = "DccRateStartDay")
            protected XMLGregorianCalendar dccRateStartDay;
            @XmlAttribute(name = "DccRateStartTime")
            protected XMLGregorianCalendar dccRateStartTime;
            @XmlAttribute(name = "DccRefAmt")
            protected BigDecimal dccRefAmt;
            @XmlAttribute(name = "DccRefConvRate")
            protected BigDecimal dccRefConvRate;
            @XmlAttribute(name = "DccRefRateStartDay")
            protected XMLGregorianCalendar dccRefRateStartDay;
            @XmlAttribute(name = "DccRefRateStartTime")
            protected XMLGregorianCalendar dccRefRateStartTime;
            @XmlAttribute(name = "TipAmt")
            protected BigDecimal tipAmt;
            @XmlAttribute(name = "CashbackAmt")
            protected BigDecimal cashbackAmt;
            @XmlAttribute(name = "Ccy", required = true)
            protected long ccy;
            @XmlAttribute(name = "ToConfirmCcyConversion")
            protected Boolean toConfirmCcyConversion;

            /**
             * Gets the value of the surcharges property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Moneys.Dcc.Surcharges }
             *     
             */
            public Response.Moneys.Dcc.Surcharges getSurcharges() {
                return surcharges;
            }

            /**
             * Sets the value of the surcharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Moneys.Dcc.Surcharges }
             *     
             */
            public void setSurcharges(Response.Moneys.Dcc.Surcharges value) {
                this.surcharges = value;
            }

            /**
             * Gets the value of the dccStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDccStatus() {
                return dccStatus;
            }

            /**
             * Sets the value of the dccStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDccStatus(String value) {
                this.dccStatus = value;
            }

            /**
             * Gets the value of the dccIneligibleReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDccIneligibleReason() {
                return dccIneligibleReason;
            }

            /**
             * Sets the value of the dccIneligibleReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDccIneligibleReason(String value) {
                this.dccIneligibleReason = value;
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
             * Gets the value of the prevAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrevAmt() {
                return prevAmt;
            }

            /**
             * Sets the value of the prevAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrevAmt(BigDecimal value) {
                this.prevAmt = value;
            }

            /**
             * Gets the value of the termConvRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTermConvRate() {
                return termConvRate;
            }

            /**
             * Sets the value of the termConvRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTermConvRate(BigDecimal value) {
                this.termConvRate = value;
            }

            /**
             * Gets the value of the dccRateStartDay property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDccRateStartDay() {
                return dccRateStartDay;
            }

            /**
             * Sets the value of the dccRateStartDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDccRateStartDay(XMLGregorianCalendar value) {
                this.dccRateStartDay = value;
            }

            /**
             * Gets the value of the dccRateStartTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDccRateStartTime() {
                return dccRateStartTime;
            }

            /**
             * Sets the value of the dccRateStartTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDccRateStartTime(XMLGregorianCalendar value) {
                this.dccRateStartTime = value;
            }

            /**
             * Gets the value of the dccRefAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDccRefAmt() {
                return dccRefAmt;
            }

            /**
             * Sets the value of the dccRefAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDccRefAmt(BigDecimal value) {
                this.dccRefAmt = value;
            }

            /**
             * Gets the value of the dccRefConvRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDccRefConvRate() {
                return dccRefConvRate;
            }

            /**
             * Sets the value of the dccRefConvRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDccRefConvRate(BigDecimal value) {
                this.dccRefConvRate = value;
            }

            /**
             * Gets the value of the dccRefRateStartDay property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDccRefRateStartDay() {
                return dccRefRateStartDay;
            }

            /**
             * Sets the value of the dccRefRateStartDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDccRefRateStartDay(XMLGregorianCalendar value) {
                this.dccRefRateStartDay = value;
            }

            /**
             * Gets the value of the dccRefRateStartTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDccRefRateStartTime() {
                return dccRefRateStartTime;
            }

            /**
             * Sets the value of the dccRefRateStartTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDccRefRateStartTime(XMLGregorianCalendar value) {
                this.dccRefRateStartTime = value;
            }

            /**
             * Gets the value of the tipAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTipAmt() {
                return tipAmt;
            }

            /**
             * Sets the value of the tipAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTipAmt(BigDecimal value) {
                this.tipAmt = value;
            }

            /**
             * Gets the value of the cashbackAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCashbackAmt() {
                return cashbackAmt;
            }

            /**
             * Sets the value of the cashbackAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCashbackAmt(BigDecimal value) {
                this.cashbackAmt = value;
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
             * Gets the value of the toConfirmCcyConversion property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isToConfirmCcyConversion() {
                return toConfirmCcyConversion;
            }

            /**
             * Sets the value of the toConfirmCcyConversion property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setToConfirmCcyConversion(Boolean value) {
                this.toConfirmCcyConversion = value;
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
             *         &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="ExternalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
             *       &lt;attribute name="ToTakeCash" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "surcharge"
            })
            public static class Surcharges {

                @XmlElement(name = "Surcharge")
                protected List<Surcharge> surcharge;
                @XmlAttribute(name = "ExternalAmt")
                protected BigDecimal externalAmt;
                @XmlAttribute(name = "ToTakeCash")
                protected Boolean toTakeCash;

                /**
                 * Gets the value of the surcharge property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the surcharge property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSurcharge().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Surcharge }
                 * 
                 * 
                 */
                public List<Surcharge> getSurcharge() {
                    if (surcharge == null) {
                        surcharge = new ArrayList<Surcharge>();
                    }
                    return this.surcharge;
                }

                /**
                 * Gets the value of the externalAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getExternalAmt() {
                    return externalAmt;
                }

                /**
                 * Sets the value of the externalAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setExternalAmt(BigDecimal value) {
                    this.externalAmt = value;
                }

                /**
                 * Gets the value of the toTakeCash property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isToTakeCash() {
                    if (toTakeCash == null) {
                        return false;
                    } else {
                        return toTakeCash;
                    }
                }

                /**
                 * Sets the value of the toTakeCash property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setToTakeCash(Boolean value) {
                    this.toTakeCash = value;
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
         *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}MoneysDest"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Dest {

            @XmlAttribute(name = "Date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "ClearAmt")
            protected BigDecimal clearAmt;
            @XmlAttribute(name = "AcqFeeAmt")
            protected BigDecimal acqFeeAmt;
            @XmlAttribute(name = "CashbackAmt")
            protected BigDecimal cashbackAmt;
            @XmlAttribute(name = "ClearCcy")
            protected Long clearCcy;
            @XmlAttribute(name = "ClearConvRate")
            protected BigDecimal clearConvRate;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the clearAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getClearAmt() {
                return clearAmt;
            }

            /**
             * Sets the value of the clearAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setClearAmt(BigDecimal value) {
                this.clearAmt = value;
            }

            /**
             * Gets the value of the acqFeeAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAcqFeeAmt() {
                return acqFeeAmt;
            }

            /**
             * Sets the value of the acqFeeAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAcqFeeAmt(BigDecimal value) {
                this.acqFeeAmt = value;
            }

            /**
             * Gets the value of the cashbackAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCashbackAmt() {
                return cashbackAmt;
            }

            /**
             * Sets the value of the cashbackAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCashbackAmt(BigDecimal value) {
                this.cashbackAmt = value;
            }

            /**
             * Gets the value of the clearCcy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getClearCcy() {
                return clearCcy;
            }

            /**
             * Sets the value of the clearCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setClearCcy(Long value) {
                this.clearCcy = value;
            }

            /**
             * Gets the value of the clearConvRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getClearConvRate() {
                return clearConvRate;
            }

            /**
             * Sets the value of the clearConvRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setClearConvRate(BigDecimal value) {
                this.clearConvRate = value;
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
         *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IssuerClear {

            @XmlAttribute(name = "Amt", required = true)
            protected BigDecimal amt;
            @XmlAttribute(name = "PrevAmt")
            protected BigDecimal prevAmt;
            @XmlAttribute(name = "Ccy", required = true)
            protected long ccy;
            @XmlAttribute(name = "ConvRate")
            protected BigDecimal convRate;
            @XmlAttribute(name = "ConvDate")
            protected XMLGregorianCalendar convDate;

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
             * Gets the value of the prevAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrevAmt() {
                return prevAmt;
            }

            /**
             * Sets the value of the prevAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrevAmt(BigDecimal value) {
                this.prevAmt = value;
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
             * Gets the value of the convRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getConvRate() {
                return convRate;
            }

            /**
             * Sets the value of the convRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setConvRate(BigDecimal value) {
                this.convRate = value;
            }

            /**
             * Gets the value of the convDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getConvDate() {
                return convDate;
            }

            /**
             * Sets the value of the convDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setConvDate(XMLGregorianCalendar value) {
                this.convDate = value;
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
         *       &lt;attribute name="Date" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PrevAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ConvRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="ConvDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="CycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Settle {

            @XmlAttribute(name = "Date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Amt")
            protected BigDecimal amt;
            @XmlAttribute(name = "PrevAmt")
            protected BigDecimal prevAmt;
            @XmlAttribute(name = "Ccy")
            protected Long ccy;
            @XmlAttribute(name = "ConvRate")
            protected BigDecimal convRate;
            @XmlAttribute(name = "ConvDate")
            protected XMLGregorianCalendar convDate;
            @XmlAttribute(name = "CycleId")
            protected Long cycleId;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
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
             * Gets the value of the prevAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrevAmt() {
                return prevAmt;
            }

            /**
             * Sets the value of the prevAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrevAmt(BigDecimal value) {
                this.prevAmt = value;
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
             * Gets the value of the convRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getConvRate() {
                return convRate;
            }

            /**
             * Sets the value of the convRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setConvRate(BigDecimal value) {
                this.convRate = value;
            }

            /**
             * Gets the value of the convDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getConvDate() {
                return convDate;
            }

            /**
             * Sets the value of the convDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setConvDate(XMLGregorianCalendar value) {
                this.convDate = value;
            }

            /**
             * Gets the value of the cycleId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCycleId() {
                return cycleId;
            }

            /**
             * Sets the value of the cycleId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCycleId(Long value) {
                this.cycleId = value;
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
         *         &lt;element name="Surcharges" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "surcharges"
        })
        public static class Term {

            @XmlElement(name = "Surcharges")
            protected Response.Moneys.Term.Surcharges surcharges;

            /**
             * Gets the value of the surcharges property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Moneys.Term.Surcharges }
             *     
             */
            public Response.Moneys.Term.Surcharges getSurcharges() {
                return surcharges;
            }

            /**
             * Sets the value of the surcharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Moneys.Term.Surcharges }
             *     
             */
            public void setSurcharges(Response.Moneys.Term.Surcharges value) {
                this.surcharges = value;
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
             *         &lt;element name="Surcharge" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "surcharge"
            })
            public static class Surcharges {

                @XmlElement(name = "Surcharge")
                protected List<Surcharge> surcharge;

                /**
                 * Gets the value of the surcharge property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the surcharge property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSurcharge().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Surcharge }
                 * 
                 * 
                 */
                public List<Surcharge> getSurcharge() {
                    if (surcharge == null) {
                        surcharge = new ArrayList<Surcharge>();
                    }
                    return this.surcharge;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Hold" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="HoldId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ExceptionalCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}ExceptionalCard" minOccurs="0"/&gt;
     *         &lt;element name="Tds" type="{http://schemas.tranzaxis.com/tran.xsd}TdsRs" minOccurs="0"/&gt;
     *         &lt;element name="Admin" type="{http://schemas.tranzaxis.com/tran.xsd}AdminSpecific" minOccurs="0"/&gt;
     *         &lt;element name="CreateVirtualCard" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Expiration" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ExpirationFormat"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Cvv2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CreateLogin" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RepaymentLoan" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Application" type="{http://schemas.tranzaxis.com/applications.xsd}Application" minOccurs="0"/&gt;
     *         &lt;element name="StandingOrder" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Statements" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractStatements" minOccurs="0"/&gt;
     *         &lt;element name="Group" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Tran" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
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
     *         &lt;element name="BalanceSubtask" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="Reserves" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Reserve" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="SubportfolioId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                                     &lt;attribute name="DebtKind" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                                     &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Payment" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Terminal" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Owner" type="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationInfo" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/tran.xsd}TermTypeEnum" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ExtAttr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SendContractInfo" type="{http://schemas.tranzaxis.com/tran.xsd}SendContractInfoSpecific" minOccurs="0"/&gt;
     *         &lt;element name="AcqInstallment" type="{http://schemas.tranzaxis.com/tran-common.xsd}AcqInstallmentResponseSpecific" minOccurs="0"/&gt;
     *         &lt;element name="Installment" type="{http://schemas.tranzaxis.com/tran-common.xsd}InstallmentRs" minOccurs="0"/&gt;
     *         &lt;element name="RunBatchProc" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Batch" type="{http://schemas.tranzaxis.com/tran.xsd}BatchProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ImportCfgPacket" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ScoreSubject" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Modules" type="{http://schemas.tranzaxis.com/tran.xsd}ScoringModules" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RiskRate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Result" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="ResultDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="MonthlyPayment" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TerminalRefill" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ClosedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="OpenedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}ExtCardRs" minOccurs="0"/&gt;
     *         &lt;element name="InquiryCardEtuStatus" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryCardEtuStatusSpecific" minOccurs="0"/&gt;
     *         &lt;element name="UpdateClientInfo" type="{http://schemas.tranzaxis.com/tran-common.xsd}UpdateClientInfoSpecificRs" minOccurs="0"/&gt;
     *         &lt;element name="Digitization" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationRs" minOccurs="0"/&gt;
     *         &lt;element name="Token" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}TokenSpecificRs"&gt;
     *                 &lt;sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProvisioningData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Data" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="TavData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="ActivationData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="EphemernalPublicKey" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="EncryptedPassData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LoadCfgPacket" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Report" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
     *         &lt;element name="Invoice" type="{http://schemas.tranzaxis.com/invoicing.xsd}Invoice" minOccurs="0"/&gt;
     *         &lt;element name="RegOrgInNetwork" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecific" minOccurs="0"/&gt;
     *                   &lt;element name="Error" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PaymentQrc" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentQrcRs" minOccurs="0"/&gt;
     *         &lt;element name="SetupInvoiceSubscription" type="{http://schemas.tranzaxis.com/tran-common.xsd}SetupInvoiceSubscription" minOccurs="0"/&gt;
     *         &lt;element name="InquiryTokenAuthData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Aliases" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tran.xsd}TokenAliasAuthData" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="InterchangeReason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hold",
        "exceptionalCard",
        "tds",
        "admin",
        "createVirtualCard",
        "createLogin",
        "repaymentLoan",
        "application",
        "standingOrder",
        "statements",
        "group",
        "balanceSubtask",
        "payment",
        "sendContractInfo",
        "acqInstallment",
        "installment",
        "runBatchProc",
        "importCfgPacket",
        "scoreSubject",
        "terminalRefill",
        "extCard",
        "inquiryCardEtuStatus",
        "updateClientInfo",
        "digitization",
        "token",
        "provisioningData",
        "loadCfgPacket",
        "cofMatch",
        "invoice",
        "regOrgInNetwork",
        "paymentQrc",
        "setupInvoiceSubscription",
        "inquiryTokenAuthData"
    })
    public static class Specific {

        @XmlElement(name = "Hold")
        protected Response.Specific.Hold hold;
        @XmlElement(name = "ExceptionalCard")
        protected ExceptionalCard exceptionalCard;
        @XmlElement(name = "Tds")
        protected TdsRs tds;
        @XmlElement(name = "Admin")
        protected AdminSpecific admin;
        @XmlElement(name = "CreateVirtualCard")
        protected Response.Specific.CreateVirtualCard createVirtualCard;
        @XmlElement(name = "CreateLogin")
        protected Response.Specific.CreateLogin createLogin;
        @XmlElement(name = "RepaymentLoan")
        protected Response.Specific.RepaymentLoan repaymentLoan;
        @XmlElement(name = "Application")
        protected Application application;
        @XmlElement(name = "StandingOrder")
        protected Response.Specific.StandingOrder standingOrder;
        @XmlElement(name = "Statements")
        protected ContractStatements statements;
        @XmlElement(name = "Group")
        protected Response.Specific.Group group;
        @XmlElement(name = "BalanceSubtask")
        protected Response.Specific.BalanceSubtask balanceSubtask;
        @XmlElement(name = "Payment")
        protected Response.Specific.Payment payment;
        @XmlElement(name = "SendContractInfo")
        protected SendContractInfoSpecific sendContractInfo;
        @XmlElement(name = "AcqInstallment")
        protected AcqInstallmentResponseSpecific acqInstallment;
        @XmlElement(name = "Installment")
        protected InstallmentRs installment;
        @XmlElement(name = "RunBatchProc")
        protected Response.Specific.RunBatchProc runBatchProc;
        @XmlElement(name = "ImportCfgPacket")
        protected Response.Specific.ImportCfgPacket importCfgPacket;
        @XmlElement(name = "ScoreSubject")
        protected Response.Specific.ScoreSubject scoreSubject;
        @XmlElement(name = "TerminalRefill")
        protected Response.Specific.TerminalRefill terminalRefill;
        @XmlElement(name = "ExtCard")
        protected ExtCardRs extCard;
        @XmlElement(name = "InquiryCardEtuStatus")
        protected InquiryCardEtuStatusSpecific inquiryCardEtuStatus;
        @XmlElement(name = "UpdateClientInfo")
        protected UpdateClientInfoSpecificRs updateClientInfo;
        @XmlElement(name = "Digitization")
        protected DigitizationRs digitization;
        @XmlElement(name = "Token")
        protected Response.Specific.Token token;
        @XmlElement(name = "ProvisioningData")
        protected Response.Specific.ProvisioningData provisioningData;
        @XmlElement(name = "LoadCfgPacket")
        protected Response.Specific.LoadCfgPacket loadCfgPacket;
        @XmlElement(name = "CofMatch")
        protected CofMatch cofMatch;
        @XmlElement(name = "Invoice")
        protected Invoice invoice;
        @XmlElement(name = "RegOrgInNetwork")
        protected Response.Specific.RegOrgInNetwork regOrgInNetwork;
        @XmlElement(name = "PaymentQrc")
        protected PaymentQrcRs paymentQrc;
        @XmlElement(name = "SetupInvoiceSubscription")
        protected SetupInvoiceSubscription setupInvoiceSubscription;
        @XmlElement(name = "InquiryTokenAuthData")
        protected Response.Specific.InquiryTokenAuthData inquiryTokenAuthData;
        @XmlAttribute(name = "InterchangeReason")
        protected String interchangeReason;

        /**
         * Gets the value of the hold property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.Hold }
         *     
         */
        public Response.Specific.Hold getHold() {
            return hold;
        }

        /**
         * Sets the value of the hold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.Hold }
         *     
         */
        public void setHold(Response.Specific.Hold value) {
            this.hold = value;
        }

        /**
         * Gets the value of the exceptionalCard property.
         * 
         * @return
         *     possible object is
         *     {@link ExceptionalCard }
         *     
         */
        public ExceptionalCard getExceptionalCard() {
            return exceptionalCard;
        }

        /**
         * Sets the value of the exceptionalCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExceptionalCard }
         *     
         */
        public void setExceptionalCard(ExceptionalCard value) {
            this.exceptionalCard = value;
        }

        /**
         * Gets the value of the tds property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRs }
         *     
         */
        public TdsRs getTds() {
            return tds;
        }

        /**
         * Sets the value of the tds property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRs }
         *     
         */
        public void setTds(TdsRs value) {
            this.tds = value;
        }

        /**
         * Gets the value of the admin property.
         * 
         * @return
         *     possible object is
         *     {@link AdminSpecific }
         *     
         */
        public AdminSpecific getAdmin() {
            return admin;
        }

        /**
         * Sets the value of the admin property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdminSpecific }
         *     
         */
        public void setAdmin(AdminSpecific value) {
            this.admin = value;
        }

        /**
         * Gets the value of the createVirtualCard property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.CreateVirtualCard }
         *     
         */
        public Response.Specific.CreateVirtualCard getCreateVirtualCard() {
            return createVirtualCard;
        }

        /**
         * Sets the value of the createVirtualCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.CreateVirtualCard }
         *     
         */
        public void setCreateVirtualCard(Response.Specific.CreateVirtualCard value) {
            this.createVirtualCard = value;
        }

        /**
         * Gets the value of the createLogin property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.CreateLogin }
         *     
         */
        public Response.Specific.CreateLogin getCreateLogin() {
            return createLogin;
        }

        /**
         * Sets the value of the createLogin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.CreateLogin }
         *     
         */
        public void setCreateLogin(Response.Specific.CreateLogin value) {
            this.createLogin = value;
        }

        /**
         * Gets the value of the repaymentLoan property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.RepaymentLoan }
         *     
         */
        public Response.Specific.RepaymentLoan getRepaymentLoan() {
            return repaymentLoan;
        }

        /**
         * Sets the value of the repaymentLoan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.RepaymentLoan }
         *     
         */
        public void setRepaymentLoan(Response.Specific.RepaymentLoan value) {
            this.repaymentLoan = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link Application }
         *     
         */
        public Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application }
         *     
         */
        public void setApplication(Application value) {
            this.application = value;
        }

        /**
         * Gets the value of the standingOrder property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.StandingOrder }
         *     
         */
        public Response.Specific.StandingOrder getStandingOrder() {
            return standingOrder;
        }

        /**
         * Sets the value of the standingOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.StandingOrder }
         *     
         */
        public void setStandingOrder(Response.Specific.StandingOrder value) {
            this.standingOrder = value;
        }

        /**
         * Gets the value of the statements property.
         * 
         * @return
         *     possible object is
         *     {@link ContractStatements }
         *     
         */
        public ContractStatements getStatements() {
            return statements;
        }

        /**
         * Sets the value of the statements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractStatements }
         *     
         */
        public void setStatements(ContractStatements value) {
            this.statements = value;
        }

        /**
         * Gets the value of the group property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.Group }
         *     
         */
        public Response.Specific.Group getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.Group }
         *     
         */
        public void setGroup(Response.Specific.Group value) {
            this.group = value;
        }

        /**
         * Gets the value of the balanceSubtask property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.BalanceSubtask }
         *     
         */
        public Response.Specific.BalanceSubtask getBalanceSubtask() {
            return balanceSubtask;
        }

        /**
         * Sets the value of the balanceSubtask property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.BalanceSubtask }
         *     
         */
        public void setBalanceSubtask(Response.Specific.BalanceSubtask value) {
            this.balanceSubtask = value;
        }

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.Payment }
         *     
         */
        public Response.Specific.Payment getPayment() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.Payment }
         *     
         */
        public void setPayment(Response.Specific.Payment value) {
            this.payment = value;
        }

        /**
         * Gets the value of the sendContractInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SendContractInfoSpecific }
         *     
         */
        public SendContractInfoSpecific getSendContractInfo() {
            return sendContractInfo;
        }

        /**
         * Sets the value of the sendContractInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SendContractInfoSpecific }
         *     
         */
        public void setSendContractInfo(SendContractInfoSpecific value) {
            this.sendContractInfo = value;
        }

        /**
         * Gets the value of the acqInstallment property.
         * 
         * @return
         *     possible object is
         *     {@link AcqInstallmentResponseSpecific }
         *     
         */
        public AcqInstallmentResponseSpecific getAcqInstallment() {
            return acqInstallment;
        }

        /**
         * Sets the value of the acqInstallment property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcqInstallmentResponseSpecific }
         *     
         */
        public void setAcqInstallment(AcqInstallmentResponseSpecific value) {
            this.acqInstallment = value;
        }

        /**
         * Gets the value of the installment property.
         * 
         * @return
         *     possible object is
         *     {@link InstallmentRs }
         *     
         */
        public InstallmentRs getInstallment() {
            return installment;
        }

        /**
         * Sets the value of the installment property.
         * 
         * @param value
         *     allowed object is
         *     {@link InstallmentRs }
         *     
         */
        public void setInstallment(InstallmentRs value) {
            this.installment = value;
        }

        /**
         * Gets the value of the runBatchProc property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.RunBatchProc }
         *     
         */
        public Response.Specific.RunBatchProc getRunBatchProc() {
            return runBatchProc;
        }

        /**
         * Sets the value of the runBatchProc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.RunBatchProc }
         *     
         */
        public void setRunBatchProc(Response.Specific.RunBatchProc value) {
            this.runBatchProc = value;
        }

        /**
         * Gets the value of the importCfgPacket property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.ImportCfgPacket }
         *     
         */
        public Response.Specific.ImportCfgPacket getImportCfgPacket() {
            return importCfgPacket;
        }

        /**
         * Sets the value of the importCfgPacket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.ImportCfgPacket }
         *     
         */
        public void setImportCfgPacket(Response.Specific.ImportCfgPacket value) {
            this.importCfgPacket = value;
        }

        /**
         * Gets the value of the scoreSubject property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.ScoreSubject }
         *     
         */
        public Response.Specific.ScoreSubject getScoreSubject() {
            return scoreSubject;
        }

        /**
         * Sets the value of the scoreSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.ScoreSubject }
         *     
         */
        public void setScoreSubject(Response.Specific.ScoreSubject value) {
            this.scoreSubject = value;
        }

        /**
         * Gets the value of the terminalRefill property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.TerminalRefill }
         *     
         */
        public Response.Specific.TerminalRefill getTerminalRefill() {
            return terminalRefill;
        }

        /**
         * Sets the value of the terminalRefill property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.TerminalRefill }
         *     
         */
        public void setTerminalRefill(Response.Specific.TerminalRefill value) {
            this.terminalRefill = value;
        }

        /**
         * Gets the value of the extCard property.
         * 
         * @return
         *     possible object is
         *     {@link ExtCardRs }
         *     
         */
        public ExtCardRs getExtCard() {
            return extCard;
        }

        /**
         * Sets the value of the extCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExtCardRs }
         *     
         */
        public void setExtCard(ExtCardRs value) {
            this.extCard = value;
        }

        /**
         * Gets the value of the inquiryCardEtuStatus property.
         * 
         * @return
         *     possible object is
         *     {@link InquiryCardEtuStatusSpecific }
         *     
         */
        public InquiryCardEtuStatusSpecific getInquiryCardEtuStatus() {
            return inquiryCardEtuStatus;
        }

        /**
         * Sets the value of the inquiryCardEtuStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link InquiryCardEtuStatusSpecific }
         *     
         */
        public void setInquiryCardEtuStatus(InquiryCardEtuStatusSpecific value) {
            this.inquiryCardEtuStatus = value;
        }

        /**
         * Gets the value of the updateClientInfo property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateClientInfoSpecificRs }
         *     
         */
        public UpdateClientInfoSpecificRs getUpdateClientInfo() {
            return updateClientInfo;
        }

        /**
         * Sets the value of the updateClientInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateClientInfoSpecificRs }
         *     
         */
        public void setUpdateClientInfo(UpdateClientInfoSpecificRs value) {
            this.updateClientInfo = value;
        }

        /**
         * Gets the value of the digitization property.
         * 
         * @return
         *     possible object is
         *     {@link DigitizationRs }
         *     
         */
        public DigitizationRs getDigitization() {
            return digitization;
        }

        /**
         * Sets the value of the digitization property.
         * 
         * @param value
         *     allowed object is
         *     {@link DigitizationRs }
         *     
         */
        public void setDigitization(DigitizationRs value) {
            this.digitization = value;
        }

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.Token }
         *     
         */
        public Response.Specific.Token getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.Token }
         *     
         */
        public void setToken(Response.Specific.Token value) {
            this.token = value;
        }

        /**
         * Gets the value of the provisioningData property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.ProvisioningData }
         *     
         */
        public Response.Specific.ProvisioningData getProvisioningData() {
            return provisioningData;
        }

        /**
         * Sets the value of the provisioningData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.ProvisioningData }
         *     
         */
        public void setProvisioningData(Response.Specific.ProvisioningData value) {
            this.provisioningData = value;
        }

        /**
         * Gets the value of the loadCfgPacket property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.LoadCfgPacket }
         *     
         */
        public Response.Specific.LoadCfgPacket getLoadCfgPacket() {
            return loadCfgPacket;
        }

        /**
         * Sets the value of the loadCfgPacket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.LoadCfgPacket }
         *     
         */
        public void setLoadCfgPacket(Response.Specific.LoadCfgPacket value) {
            this.loadCfgPacket = value;
        }

        /**
         * Gets the value of the cofMatch property.
         * 
         * @return
         *     possible object is
         *     {@link CofMatch }
         *     
         */
        public CofMatch getCofMatch() {
            return cofMatch;
        }

        /**
         * Sets the value of the cofMatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link CofMatch }
         *     
         */
        public void setCofMatch(CofMatch value) {
            this.cofMatch = value;
        }

        /**
         * Gets the value of the invoice property.
         * 
         * @return
         *     possible object is
         *     {@link Invoice }
         *     
         */
        public Invoice getInvoice() {
            return invoice;
        }

        /**
         * Sets the value of the invoice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Invoice }
         *     
         */
        public void setInvoice(Invoice value) {
            this.invoice = value;
        }

        /**
         * Gets the value of the regOrgInNetwork property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.RegOrgInNetwork }
         *     
         */
        public Response.Specific.RegOrgInNetwork getRegOrgInNetwork() {
            return regOrgInNetwork;
        }

        /**
         * Sets the value of the regOrgInNetwork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.RegOrgInNetwork }
         *     
         */
        public void setRegOrgInNetwork(Response.Specific.RegOrgInNetwork value) {
            this.regOrgInNetwork = value;
        }

        /**
         * Gets the value of the paymentQrc property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentQrcRs }
         *     
         */
        public PaymentQrcRs getPaymentQrc() {
            return paymentQrc;
        }

        /**
         * Sets the value of the paymentQrc property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentQrcRs }
         *     
         */
        public void setPaymentQrc(PaymentQrcRs value) {
            this.paymentQrc = value;
        }

        /**
         * Gets the value of the setupInvoiceSubscription property.
         * 
         * @return
         *     possible object is
         *     {@link SetupInvoiceSubscription }
         *     
         */
        public SetupInvoiceSubscription getSetupInvoiceSubscription() {
            return setupInvoiceSubscription;
        }

        /**
         * Sets the value of the setupInvoiceSubscription property.
         * 
         * @param value
         *     allowed object is
         *     {@link SetupInvoiceSubscription }
         *     
         */
        public void setSetupInvoiceSubscription(SetupInvoiceSubscription value) {
            this.setupInvoiceSubscription = value;
        }

        /**
         * Gets the value of the inquiryTokenAuthData property.
         * 
         * @return
         *     possible object is
         *     {@link Response.Specific.InquiryTokenAuthData }
         *     
         */
        public Response.Specific.InquiryTokenAuthData getInquiryTokenAuthData() {
            return inquiryTokenAuthData;
        }

        /**
         * Sets the value of the inquiryTokenAuthData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Specific.InquiryTokenAuthData }
         *     
         */
        public void setInquiryTokenAuthData(Response.Specific.InquiryTokenAuthData value) {
            this.inquiryTokenAuthData = value;
        }

        /**
         * Gets the value of the interchangeReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterchangeReason() {
            return interchangeReason;
        }

        /**
         * Sets the value of the interchangeReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterchangeReason(String value) {
            this.interchangeReason = value;
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
         *       &lt;all&gt;
         *         &lt;element name="Reserves" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Reserve" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="SubportfolioId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                           &lt;attribute name="DebtKind" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class BalanceSubtask {

            @XmlElement(name = "Reserves")
            protected Response.Specific.BalanceSubtask.Reserves reserves;

            /**
             * Gets the value of the reserves property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Specific.BalanceSubtask.Reserves }
             *     
             */
            public Response.Specific.BalanceSubtask.Reserves getReserves() {
                return reserves;
            }

            /**
             * Sets the value of the reserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Specific.BalanceSubtask.Reserves }
             *     
             */
            public void setReserves(Response.Specific.BalanceSubtask.Reserves value) {
                this.reserves = value;
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
             *         &lt;element name="Reserve" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="SubportfolioId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *                 &lt;attribute name="DebtKind" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
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
                "reserve"
            })
            public static class Reserves {

                @XmlElement(name = "Reserve")
                protected List<Response.Specific.BalanceSubtask.Reserves.Reserve> reserve;

                /**
                 * Gets the value of the reserve property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the reserve property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReserve().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Response.Specific.BalanceSubtask.Reserves.Reserve }
                 * 
                 * 
                 */
                public List<Response.Specific.BalanceSubtask.Reserves.Reserve> getReserve() {
                    if (reserve == null) {
                        reserve = new ArrayList<Response.Specific.BalanceSubtask.Reserves.Reserve>();
                    }
                    return this.reserve;
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
                 *       &lt;attribute name="SubportfolioId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
                 *       &lt;attribute name="DebtKind" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
                 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Reserve {

                    @XmlAttribute(name = "SubportfolioId", required = true)
                    protected long subportfolioId;
                    @XmlAttribute(name = "DebtKind", required = true)
                    protected String debtKind;
                    @XmlAttribute(name = "Ccy", required = true)
                    protected long ccy;
                    @XmlAttribute(name = "Amt", required = true)
                    protected BigDecimal amt;

                    /**
                     * Gets the value of the subportfolioId property.
                     * 
                     */
                    public long getSubportfolioId() {
                        return subportfolioId;
                    }

                    /**
                     * Sets the value of the subportfolioId property.
                     * 
                     */
                    public void setSubportfolioId(long value) {
                        this.subportfolioId = value;
                    }

                    /**
                     * Gets the value of the debtKind property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDebtKind() {
                        return debtKind;
                    }

                    /**
                     * Sets the value of the debtKind property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDebtKind(String value) {
                        this.debtKind = value;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CreateLogin {

            @XmlAttribute(name = "Id", required = true)
            protected long id;

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
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Expiration" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ExpirationFormat"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Cvv2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "panCrypt"
        })
        public static class CreateVirtualCard {

            @XmlElement(name = "PanCrypt")
            protected AppEncryptedData panCrypt;
            @XmlAttribute(name = "Pan")
            protected String pan;
            @XmlAttribute(name = "Expiration")
            protected String expiration;
            @XmlAttribute(name = "ExpirationFormat")
            protected String expirationFormat;
            @XmlAttribute(name = "Cvv2")
            protected String cvv2;
            @XmlAttribute(name = "Id")
            protected Long id;

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
             * Gets the value of the expiration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpiration() {
                return expiration;
            }

            /**
             * Sets the value of the expiration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpiration(String value) {
                this.expiration = value;
            }

            /**
             * Gets the value of the expirationFormat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationFormat() {
                return expirationFormat;
            }

            /**
             * Sets the value of the expirationFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationFormat(String value) {
                this.expirationFormat = value;
            }

            /**
             * Gets the value of the cvv2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCvv2() {
                return cvv2;
            }

            /**
             * Sets the value of the cvv2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCvv2(String value) {
                this.cvv2 = value;
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
         *         &lt;element name="Tran" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
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
            "tran"
        })
        public static class Group {

            @XmlElement(name = "Tran", required = true)
            protected List<Response.Specific.Group.Tran> tran;

            /**
             * Gets the value of the tran property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tran property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTran().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Response.Specific.Group.Tran }
             * 
             * 
             */
            public List<Response.Specific.Group.Tran> getTran() {
                if (tran == null) {
                    tran = new ArrayList<Response.Specific.Group.Tran>();
                }
                return this.tran;
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
             *         &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
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
                "response"
            })
            public static class Tran {

                @XmlElement(name = "Response", required = true)
                protected Response response;

                /**
                 * Gets the value of the response property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Response }
                 *     
                 */
                public Response getResponse() {
                    return response;
                }

                /**
                 * Sets the value of the response property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Response }
                 *     
                 */
                public void setResponse(Response value) {
                    this.response = value;
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
         *       &lt;attribute name="HoldId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Hold {

            @XmlAttribute(name = "HoldId")
            protected Long holdId;

            /**
             * Gets the value of the holdId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getHoldId() {
                return holdId;
            }

            /**
             * Sets the value of the holdId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHoldId(Long value) {
                this.holdId = value;
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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ImportCfgPacket {

            @XmlAttribute(name = "Id")
            protected Long id;

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
         *         &lt;element name="Aliases" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tran.xsd}TokenAliasAuthData" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "aliases"
        })
        public static class InquiryTokenAuthData {

            @XmlElement(name = "Aliases")
            protected Response.Specific.InquiryTokenAuthData.Aliases aliases;

            /**
             * Gets the value of the aliases property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Specific.InquiryTokenAuthData.Aliases }
             *     
             */
            public Response.Specific.InquiryTokenAuthData.Aliases getAliases() {
                return aliases;
            }

            /**
             * Sets the value of the aliases property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Specific.InquiryTokenAuthData.Aliases }
             *     
             */
            public void setAliases(Response.Specific.InquiryTokenAuthData.Aliases value) {
                this.aliases = value;
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
             *         &lt;element name="Alias" type="{http://schemas.tranzaxis.com/tran.xsd}TokenAliasAuthData" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                protected List<TokenAliasAuthData> alias;

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
                 * {@link TokenAliasAuthData }
                 * 
                 * 
                 */
                public List<TokenAliasAuthData> getAlias() {
                    if (alias == null) {
                        alias = new ArrayList<TokenAliasAuthData>();
                    }
                    return this.alias;
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
         *         &lt;element name="Report" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
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
            "report"
        })
        public static class LoadCfgPacket {

            @XmlElement(name = "Report", required = true)
            protected String report;

            /**
             * Gets the value of the report property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReport() {
                return report;
            }

            /**
             * Sets the value of the report property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReport(String value) {
                this.report = value;
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
         *         &lt;element name="Terminal" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Owner" type="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationInfo" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/tran.xsd}TermTypeEnum" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ExtAttr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "terminal"
        })
        public static class Payment {

            @XmlElement(name = "Terminal")
            protected Response.Specific.Payment.Terminal terminal;
            @XmlAttribute(name = "ExtAttr")
            protected String extAttr;

            /**
             * Gets the value of the terminal property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Specific.Payment.Terminal }
             *     
             */
            public Response.Specific.Payment.Terminal getTerminal() {
                return terminal;
            }

            /**
             * Sets the value of the terminal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Specific.Payment.Terminal }
             *     
             */
            public void setTerminal(Response.Specific.Payment.Terminal value) {
                this.terminal = value;
            }

            /**
             * Gets the value of the extAttr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtAttr() {
                return extAttr;
            }

            /**
             * Sets the value of the extAttr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtAttr(String value) {
                this.extAttr = value;
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
             *         &lt;element name="Owner" type="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationInfo" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/tran.xsd}TermTypeEnum" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "owner"
            })
            public static class Terminal {

                @XmlElement(name = "Owner")
                protected OrganizationInfo owner;
                @XmlAttribute(name = "Rid")
                protected String rid;
                @XmlAttribute(name = "Type")
                protected String type;

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
         *         &lt;element name="Data" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="TavData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="ActivationData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="EphemernalPublicKey" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="EncryptedPassData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
            "data",
            "tavData",
            "activationData",
            "ephemernalPublicKey",
            "encryptedPassData"
        })
        public static class ProvisioningData {

            @XmlElement(name = "Data")
            protected List<String> data;
            @XmlElement(name = "TavData")
            protected String tavData;
            @XmlElement(name = "ActivationData")
            protected String activationData;
            @XmlElement(name = "EphemernalPublicKey")
            protected String ephemernalPublicKey;
            @XmlElement(name = "EncryptedPassData")
            protected String encryptedPassData;

            /**
             * Gets the value of the data property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the data property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getData() {
                if (data == null) {
                    data = new ArrayList<String>();
                }
                return this.data;
            }

            /**
             * Gets the value of the tavData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTavData() {
                return tavData;
            }

            /**
             * Sets the value of the tavData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTavData(String value) {
                this.tavData = value;
            }

            /**
             * Gets the value of the activationData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationData() {
                return activationData;
            }

            /**
             * Sets the value of the activationData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationData(String value) {
                this.activationData = value;
            }

            /**
             * Gets the value of the ephemernalPublicKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEphemernalPublicKey() {
                return ephemernalPublicKey;
            }

            /**
             * Sets the value of the ephemernalPublicKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEphemernalPublicKey(String value) {
                this.ephemernalPublicKey = value;
            }

            /**
             * Gets the value of the encryptedPassData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncryptedPassData() {
                return encryptedPassData;
            }

            /**
             * Sets the value of the encryptedPassData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncryptedPassData(String value) {
                this.encryptedPassData = value;
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
         *         &lt;element name="NetworkSpecific" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}NetworkSpecific" minOccurs="0"/&gt;
         *         &lt;element name="Error" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            "networkSpecific",
            "error"
        })
        public static class RegOrgInNetwork {

            @XmlElement(name = "NetworkSpecific")
            protected com.tranzaxis.schemas.subjects_admin.NetworkSpecific networkSpecific;
            @XmlElement(name = "Error")
            protected Response.Specific.RegOrgInNetwork.Error error;

            /**
             * Gets the value of the networkSpecific property.
             * 
             * @return
             *     possible object is
             *     {@link com.tranzaxis.schemas.subjects_admin.NetworkSpecific }
             *     
             */
            public com.tranzaxis.schemas.subjects_admin.NetworkSpecific getNetworkSpecific() {
                return networkSpecific;
            }

            /**
             * Sets the value of the networkSpecific property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.tranzaxis.schemas.subjects_admin.NetworkSpecific }
             *     
             */
            public void setNetworkSpecific(com.tranzaxis.schemas.subjects_admin.NetworkSpecific value) {
                this.networkSpecific = value;
            }

            /**
             * Gets the value of the error property.
             * 
             * @return
             *     possible object is
             *     {@link Response.Specific.RegOrgInNetwork.Error }
             *     
             */
            public Response.Specific.RegOrgInNetwork.Error getError() {
                return error;
            }

            /**
             * Sets the value of the error property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Specific.RegOrgInNetwork.Error }
             *     
             */
            public void setError(Response.Specific.RegOrgInNetwork.Error value) {
                this.error = value;
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
             *       &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Error {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "Description")
                protected String description;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RepaymentLoan {

            @XmlAttribute(name = "Amt", required = true)
            protected BigDecimal amt;
            @XmlAttribute(name = "Ccy", required = true)
            protected long ccy;

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
         *         &lt;element name="Batch" type="{http://schemas.tranzaxis.com/tran.xsd}BatchProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "batch"
        })
        public static class RunBatchProc {

            @XmlElement(name = "Batch")
            protected List<BatchProcessInfo> batch;

            /**
             * Gets the value of the batch property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the batch property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBatch().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BatchProcessInfo }
             * 
             * 
             */
            public List<BatchProcessInfo> getBatch() {
                if (batch == null) {
                    batch = new ArrayList<BatchProcessInfo>();
                }
                return this.batch;
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
         *         &lt;element name="Modules" type="{http://schemas.tranzaxis.com/tran.xsd}ScoringModules" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RiskRate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Result" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="ResultDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="MonthlyPayment" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "modules"
        })
        public static class ScoreSubject {

            @XmlElement(name = "Modules")
            protected ScoringModules modules;
            @XmlAttribute(name = "RiskRate")
            protected Long riskRate;
            @XmlAttribute(name = "Result")
            protected Boolean result;
            @XmlAttribute(name = "ResultDescription")
            protected String resultDescription;
            @XmlAttribute(name = "MonthlyPayment")
            protected BigDecimal monthlyPayment;

            /**
             * Gets the value of the modules property.
             * 
             * @return
             *     possible object is
             *     {@link ScoringModules }
             *     
             */
            public ScoringModules getModules() {
                return modules;
            }

            /**
             * Sets the value of the modules property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScoringModules }
             *     
             */
            public void setModules(ScoringModules value) {
                this.modules = value;
            }

            /**
             * Gets the value of the riskRate property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getRiskRate() {
                return riskRate;
            }

            /**
             * Sets the value of the riskRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setRiskRate(Long value) {
                this.riskRate = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setResult(Boolean value) {
                this.result = value;
            }

            /**
             * Gets the value of the resultDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResultDescription() {
                return resultDescription;
            }

            /**
             * Sets the value of the resultDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResultDescription(String value) {
                this.resultDescription = value;
            }

            /**
             * Gets the value of the monthlyPayment property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMonthlyPayment() {
                return monthlyPayment;
            }

            /**
             * Sets the value of the monthlyPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMonthlyPayment(BigDecimal value) {
                this.monthlyPayment = value;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StandingOrder {

            @XmlAttribute(name = "Id", required = true)
            protected long id;

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
         *       &lt;attribute name="ClosedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="OpenedCycleId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TerminalRefill {

            @XmlAttribute(name = "ClosedCycleId")
            protected Long closedCycleId;
            @XmlAttribute(name = "OpenedCycleId")
            protected Long openedCycleId;

            /**
             * Gets the value of the closedCycleId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getClosedCycleId() {
                return closedCycleId;
            }

            /**
             * Sets the value of the closedCycleId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setClosedCycleId(Long value) {
                this.closedCycleId = value;
            }

            /**
             * Gets the value of the openedCycleId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getOpenedCycleId() {
                return openedCycleId;
            }

            /**
             * Sets the value of the openedCycleId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setOpenedCycleId(Long value) {
                this.openedCycleId = value;
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
         *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}TokenSpecificRs"&gt;
         *       &lt;sequence&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Token
            extends TokenSpecificRs
        {


        }

    }

}
