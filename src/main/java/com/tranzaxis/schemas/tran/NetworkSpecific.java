
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ParamValue;
import org.radixware.schemas.common.MoneyValue;


/**
 * <p>Java class for NetworkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Tic" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ExtTranCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ExtTermClass" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ExtRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DetailedRespCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Visa" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="WalletAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ResponseSourceReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AddressVerificationResultCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="F44_3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardProductType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExtendedStipReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CvvIcvvResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PacmDeversionLevelCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PacmDiversionReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardAuthResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="F44_9" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Cvv2ResultCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OriginalResponseCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CheckSettlementCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CavvResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ResponseReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PrimaryAccountNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OriginalCreditTransaction" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AuthIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ValidationCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MarketDataId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Duration" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PrestigiousIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PurchaseIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AutoRentalAndLodgingDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NoShowIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExtraCharges" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ClearingSeqNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ClearingSeqCount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RestrictedTicketIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TotalAmountAuthorized" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RequestedPaymentService" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChargebackRightsIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MasterCardInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MerchantVerification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OnlineRiskAssessmentRiskScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OnlineRiskAssessmentConditionCodes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardLevelResults" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ProgramIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SpendIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChargebackFlags" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeProgramIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BusinessApplicationId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TokenAssuranceLevel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="eCommerceProgramIndicator" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="MessageReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosEnvironment" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CumulativeAmount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SettlementFlag" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ReimbursementAttribute" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcceptanceTermIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ServiceDevelopmentField" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AgentUniqueId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="StipReason" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="F48FieldId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AamVelocityCheckingResult" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CardholderDeviceCvm" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="TokenVerificationResult" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TransactionCodeQualifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ElapsedTimeToLive" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CumulativeTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CumulativeTranAmount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RoutingTableUniqueId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="DomesticAndLocalizedData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="AdditionalTraceData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AuxiliaryTransactionData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="VerificationData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="SupportingInformation" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="FileRecord" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="OrigTokenAssuranceLevel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="InitiatingPartyIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CavvDataPresence" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="SenderReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AtmBusinessQualifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterCard" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnBehalf" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ServiceId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Result1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Result2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CatLevel" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PosCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetworkData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AddRespData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="McTopUpData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FraudNotification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="WalletId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="McAssignedId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PanMapping" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AtcInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ElectronicCommerceInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TranIntegrityClass" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TraceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ResubmissionmCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TransitProgram" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TerminalCompliantIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PaymentTranTypeIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PromotionCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeRule" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Utrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="McMemberDefinedData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ParcelarInstallmentData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ParcelarInstallmentResponseData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ParcelarInstallmentResponseAddData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MoneySendReferenceData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AdditionalNationalData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RMAC" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IpmPosEntryMode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AncillaryServiceCharges" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RecordData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="LowRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MerchantAdviceCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardValidationCodeResult" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SanctionScreeningScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="EstimatedAmount" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="RemoteCommerceAcceptorId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcquirerBin" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MerchantOriginCountryId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SecurityServicesAddDataForIssuers" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FraudScoringData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amex" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Reason2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosDataCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TID" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NationalUseData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SberRf" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AdditionalData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Way4" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fees"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Type" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Direction" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IpsEci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="McUcaf" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_47_912" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_47_925" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_47_938" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_47_951" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_47_958" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_48_868" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="W4_112_E9" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TpII" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CustomerInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Discover" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NodeId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AtmNetworkId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetworkReferenceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TransmissionDateTime" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Stan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SettleDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigTransmissionDateTime" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigSettleDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="WalletId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="WalletName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigPosEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CdcvmIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigMessType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DinersClub" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NetworkReferenceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardHolderPresence" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardPresence" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardInputMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ECommercePaymentIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardInputCaps" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ParticipantDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ParticipantIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SourceDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SourceIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="DestinationDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DestinationIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RecapNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RecapDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="SeqNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="BatchNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TypeCharge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChargeType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="DisputeStage" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CreditDebitInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="GrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Disputes" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FeeDetails" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FxRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="DebitCreditInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigGrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="OrigChargeType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OrigCurrency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeGrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="FeeRuleSn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeRuleDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeVolume" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="FeeTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FeeBasis" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FeeRateAmount" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Jcb" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ElectronicCommerceInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PointOfServiceEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PointOfServiceInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TransitProgram" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TecBan" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TermType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="GenericText" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="GenericText2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ConfirmationCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Nspk" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Trn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PreauthorizationTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FundingTransactionTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AssignedMerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetworkIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardProductId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosEntryMode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MultipurposePaymentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SpecialProgramId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ActualEci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="InitialRrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ReversalTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OrigSettleCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OrigSettleAmt" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OrigSettleConvRate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="LocalSettleConvRateTypeInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AdditionalData4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="TokenizationDecision" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TokenizationDecisionInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TokenEventRequestor" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MessageType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RespCodeSrcInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AdditionalData2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="AdditionalData3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                 &lt;attribute name="OnBehalfServices" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CdCvmIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="HashPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Postilion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="EchoData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SwitchKey" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SourceNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SinkNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SourceNodeStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SinkNodeStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TotalsGroup" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OriginalSwitchKey" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosStateCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PosCountyCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SponsorBank" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OriginatorSettleDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="StructuredData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OriginalSourceNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Custom" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Attr" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FasterPayments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SendersCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ReceiversCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ChargesDetails" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FileId" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="DateSent" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="FileOriginatorOin" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="UserOrSeqNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="SerialNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="FileNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Filler" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RemittanceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="RegulatoryReport" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Limits" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="SettlementIndividualLimitStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="NewSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PrevSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="NewSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PrevSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Members" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SubmittingMember" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
 *                             &lt;element name="ReceivingMemeber" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
 *                             &lt;element name="BeneficiaryMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
 *                             &lt;element name="ReceivingMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AgencyAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AgencySortCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FpsReason" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OrigPaymentTypeCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SenderRole" type="{http://schemas.radixware.org/types.xsd}Int" default="0" /&gt;
 *                 &lt;attribute name="ReceiverRole" type="{http://schemas.radixware.org/types.xsd}Int" default="0" /&gt;
 *                 &lt;attribute name="ExchangeRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="OrigDateSent" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="OrigActionCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FpsResponseCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ProcessedAsync" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ServiceStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RespTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RedirectedBenificiaryFi" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RedirectedBenificiaryAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PaymentSubCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PaymentPurpose" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AccountTypeCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SuspensionStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PrevSuspensionStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PriorityGroup" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MemberAvailability" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SendingInstitution" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BeneficiaryMemberId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SendingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SubmittingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetSenderCap" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="PrevNetSenderCap" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="NetSenderCapStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="OrigSettlementPosition" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="OriginalSignIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RecalculatedSettlementPosition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RecalculatedSignIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ReceivingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NetSenderTresholdStatus" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="NetSenderTresholdVal" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="NetSenderTresholdPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="NewNetSenderTreshold" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="NewNetSenderTresholdPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SettlementRiskPositionVal" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SettlementRiskPositionPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ResidialSettlementRiskPosition" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InfoText" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PaymentReturnCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IsRepeat" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="SyntaxErrorData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BeneficiaryAcctNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tieto" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IssuerRefereneceData"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AcquirerRqAddData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="IsLegacyFormat" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PrevalidationResults" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PosDataCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardAcceptorLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PaymentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NbcCss" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TransactionFee" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="NbcFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcquirerFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IssuerFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BeneficiaryFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NbcDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcqDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IssDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BnbDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mpu" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RecordType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ProcessingCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ServiceFeeReceivable" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="ServiceFeePayable" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="InterchangeServiceFee" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="AdditionalTransactionFee" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cortex" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PrimaryAccountNumberCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ForwardingInstitutionCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ResponseCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CardAcceptorLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IccAdditionalPosInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TerminalType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PosConditionCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PartnerRelease" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSpecific", propOrder = {
    "tic",
    "visa",
    "masterCard",
    "amex",
    "sberRf",
    "way4",
    "tpII",
    "discover",
    "cup",
    "dinersClub",
    "jcb",
    "tecBan",
    "nspk",
    "postilion",
    "custom",
    "fasterPayments",
    "tieto",
    "nbcCss",
    "mpu",
    "cortex"
})
public class NetworkSpecific {

    @XmlElement(name = "Tic")
    protected NetworkSpecific.Tic tic;
    @XmlElement(name = "Visa")
    protected NetworkSpecific.Visa visa;
    @XmlElement(name = "MasterCard")
    protected NetworkSpecific.MasterCard masterCard;
    @XmlElement(name = "Amex")
    protected NetworkSpecific.Amex amex;
    @XmlElement(name = "SberRf")
    protected NetworkSpecific.SberRf sberRf;
    @XmlElement(name = "Way4")
    protected NetworkSpecific.Way4 way4;
    @XmlElement(name = "TpII")
    protected NetworkSpecific.TpII tpII;
    @XmlElement(name = "Discover")
    protected NetworkSpecific.Discover discover;
    @XmlElement(name = "Cup")
    protected NetworkSpecific.Cup cup;
    @XmlElement(name = "DinersClub")
    protected NetworkSpecific.DinersClub dinersClub;
    @XmlElement(name = "Jcb")
    protected NetworkSpecific.Jcb jcb;
    @XmlElement(name = "TecBan")
    protected NetworkSpecific.TecBan tecBan;
    @XmlElement(name = "Nspk")
    protected NetworkSpecific.Nspk nspk;
    @XmlElement(name = "Postilion")
    protected NetworkSpecific.Postilion postilion;
    @XmlElement(name = "Custom")
    protected NetworkSpecific.Custom custom;
    @XmlElement(name = "FasterPayments")
    protected NetworkSpecific.FasterPayments fasterPayments;
    @XmlElement(name = "Tieto")
    protected NetworkSpecific.Tieto tieto;
    @XmlElement(name = "NbcCss")
    protected NetworkSpecific.NbcCss nbcCss;
    @XmlElement(name = "Mpu")
    protected NetworkSpecific.Mpu mpu;
    @XmlElement(name = "Cortex")
    protected NetworkSpecific.Cortex cortex;
    @XmlAttribute(name = "PartnerRelease")
    protected String partnerRelease;

    /**
     * Gets the value of the tic property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Tic }
     *     
     */
    public NetworkSpecific.Tic getTic() {
        return tic;
    }

    /**
     * Sets the value of the tic property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Tic }
     *     
     */
    public void setTic(NetworkSpecific.Tic value) {
        this.tic = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Visa }
     *     
     */
    public NetworkSpecific.Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Visa }
     *     
     */
    public void setVisa(NetworkSpecific.Visa value) {
        this.visa = value;
    }

    /**
     * Gets the value of the masterCard property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.MasterCard }
     *     
     */
    public NetworkSpecific.MasterCard getMasterCard() {
        return masterCard;
    }

    /**
     * Sets the value of the masterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.MasterCard }
     *     
     */
    public void setMasterCard(NetworkSpecific.MasterCard value) {
        this.masterCard = value;
    }

    /**
     * Gets the value of the amex property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Amex }
     *     
     */
    public NetworkSpecific.Amex getAmex() {
        return amex;
    }

    /**
     * Sets the value of the amex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Amex }
     *     
     */
    public void setAmex(NetworkSpecific.Amex value) {
        this.amex = value;
    }

    /**
     * Gets the value of the sberRf property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.SberRf }
     *     
     */
    public NetworkSpecific.SberRf getSberRf() {
        return sberRf;
    }

    /**
     * Sets the value of the sberRf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.SberRf }
     *     
     */
    public void setSberRf(NetworkSpecific.SberRf value) {
        this.sberRf = value;
    }

    /**
     * Gets the value of the way4 property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Way4 }
     *     
     */
    public NetworkSpecific.Way4 getWay4() {
        return way4;
    }

    /**
     * Sets the value of the way4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Way4 }
     *     
     */
    public void setWay4(NetworkSpecific.Way4 value) {
        this.way4 = value;
    }

    /**
     * Gets the value of the tpII property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.TpII }
     *     
     */
    public NetworkSpecific.TpII getTpII() {
        return tpII;
    }

    /**
     * Sets the value of the tpII property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.TpII }
     *     
     */
    public void setTpII(NetworkSpecific.TpII value) {
        this.tpII = value;
    }

    /**
     * Gets the value of the discover property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Discover }
     *     
     */
    public NetworkSpecific.Discover getDiscover() {
        return discover;
    }

    /**
     * Sets the value of the discover property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Discover }
     *     
     */
    public void setDiscover(NetworkSpecific.Discover value) {
        this.discover = value;
    }

    /**
     * Gets the value of the cup property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Cup }
     *     
     */
    public NetworkSpecific.Cup getCup() {
        return cup;
    }

    /**
     * Sets the value of the cup property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Cup }
     *     
     */
    public void setCup(NetworkSpecific.Cup value) {
        this.cup = value;
    }

    /**
     * Gets the value of the dinersClub property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.DinersClub }
     *     
     */
    public NetworkSpecific.DinersClub getDinersClub() {
        return dinersClub;
    }

    /**
     * Sets the value of the dinersClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.DinersClub }
     *     
     */
    public void setDinersClub(NetworkSpecific.DinersClub value) {
        this.dinersClub = value;
    }

    /**
     * Gets the value of the jcb property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Jcb }
     *     
     */
    public NetworkSpecific.Jcb getJcb() {
        return jcb;
    }

    /**
     * Sets the value of the jcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Jcb }
     *     
     */
    public void setJcb(NetworkSpecific.Jcb value) {
        this.jcb = value;
    }

    /**
     * Gets the value of the tecBan property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.TecBan }
     *     
     */
    public NetworkSpecific.TecBan getTecBan() {
        return tecBan;
    }

    /**
     * Sets the value of the tecBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.TecBan }
     *     
     */
    public void setTecBan(NetworkSpecific.TecBan value) {
        this.tecBan = value;
    }

    /**
     * Gets the value of the nspk property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Nspk }
     *     
     */
    public NetworkSpecific.Nspk getNspk() {
        return nspk;
    }

    /**
     * Sets the value of the nspk property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Nspk }
     *     
     */
    public void setNspk(NetworkSpecific.Nspk value) {
        this.nspk = value;
    }

    /**
     * Gets the value of the postilion property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Postilion }
     *     
     */
    public NetworkSpecific.Postilion getPostilion() {
        return postilion;
    }

    /**
     * Sets the value of the postilion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Postilion }
     *     
     */
    public void setPostilion(NetworkSpecific.Postilion value) {
        this.postilion = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Custom }
     *     
     */
    public NetworkSpecific.Custom getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Custom }
     *     
     */
    public void setCustom(NetworkSpecific.Custom value) {
        this.custom = value;
    }

    /**
     * Gets the value of the fasterPayments property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.FasterPayments }
     *     
     */
    public NetworkSpecific.FasterPayments getFasterPayments() {
        return fasterPayments;
    }

    /**
     * Sets the value of the fasterPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.FasterPayments }
     *     
     */
    public void setFasterPayments(NetworkSpecific.FasterPayments value) {
        this.fasterPayments = value;
    }

    /**
     * Gets the value of the tieto property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Tieto }
     *     
     */
    public NetworkSpecific.Tieto getTieto() {
        return tieto;
    }

    /**
     * Sets the value of the tieto property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Tieto }
     *     
     */
    public void setTieto(NetworkSpecific.Tieto value) {
        this.tieto = value;
    }

    /**
     * Gets the value of the nbcCss property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.NbcCss }
     *     
     */
    public NetworkSpecific.NbcCss getNbcCss() {
        return nbcCss;
    }

    /**
     * Sets the value of the nbcCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.NbcCss }
     *     
     */
    public void setNbcCss(NetworkSpecific.NbcCss value) {
        this.nbcCss = value;
    }

    /**
     * Gets the value of the mpu property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Mpu }
     *     
     */
    public NetworkSpecific.Mpu getMpu() {
        return mpu;
    }

    /**
     * Sets the value of the mpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Mpu }
     *     
     */
    public void setMpu(NetworkSpecific.Mpu value) {
        this.mpu = value;
    }

    /**
     * Gets the value of the cortex property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSpecific.Cortex }
     *     
     */
    public NetworkSpecific.Cortex getCortex() {
        return cortex;
    }

    /**
     * Sets the value of the cortex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSpecific.Cortex }
     *     
     */
    public void setCortex(NetworkSpecific.Cortex value) {
        this.cortex = value;
    }

    /**
     * Gets the value of the partnerRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRelease() {
        return partnerRelease;
    }

    /**
     * Sets the value of the partnerRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRelease(String value) {
        this.partnerRelease = value;
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
     *       &lt;attribute name="Reason2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosDataCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TID" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NationalUseData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amex {

        @XmlAttribute(name = "Reason2")
        protected String reason2;
        @XmlAttribute(name = "PosDataCode")
        protected String posDataCode;
        @XmlAttribute(name = "TID")
        protected String tid;
        @XmlAttribute(name = "NationalUseData")
        protected String nationalUseData;

        /**
         * Gets the value of the reason2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason2() {
            return reason2;
        }

        /**
         * Sets the value of the reason2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason2(String value) {
            this.reason2 = value;
        }

        /**
         * Gets the value of the posDataCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosDataCode() {
            return posDataCode;
        }

        /**
         * Sets the value of the posDataCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosDataCode(String value) {
            this.posDataCode = value;
        }

        /**
         * Gets the value of the tid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTID() {
            return tid;
        }

        /**
         * Sets the value of the tid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTID(String value) {
            this.tid = value;
        }

        /**
         * Gets the value of the nationalUseData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationalUseData() {
            return nationalUseData;
        }

        /**
         * Sets the value of the nationalUseData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationalUseData(String value) {
            this.nationalUseData = value;
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
     *       &lt;attribute name="PrimaryAccountNumberCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ForwardingInstitutionCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ResponseCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CardAcceptorLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IccAdditionalPosInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TerminalType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PosConditionCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cortex {

        @XmlAttribute(name = "PrimaryAccountNumberCountryCode")
        protected Long primaryAccountNumberCountryCode;
        @XmlAttribute(name = "ForwardingInstitutionCountryCode")
        protected Long forwardingInstitutionCountryCode;
        @XmlAttribute(name = "ResponseCode")
        protected Long responseCode;
        @XmlAttribute(name = "ServiceCode")
        protected Long serviceCode;
        @XmlAttribute(name = "CardAcceptorLocation")
        protected String cardAcceptorLocation;
        @XmlAttribute(name = "IccAdditionalPosInformation")
        protected String iccAdditionalPosInformation;
        @XmlAttribute(name = "TerminalType")
        protected Long terminalType;
        @XmlAttribute(name = "PosConditionCode")
        protected Long posConditionCode;

        /**
         * Gets the value of the primaryAccountNumberCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrimaryAccountNumberCountryCode() {
            return primaryAccountNumberCountryCode;
        }

        /**
         * Sets the value of the primaryAccountNumberCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrimaryAccountNumberCountryCode(Long value) {
            this.primaryAccountNumberCountryCode = value;
        }

        /**
         * Gets the value of the forwardingInstitutionCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getForwardingInstitutionCountryCode() {
            return forwardingInstitutionCountryCode;
        }

        /**
         * Sets the value of the forwardingInstitutionCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setForwardingInstitutionCountryCode(Long value) {
            this.forwardingInstitutionCountryCode = value;
        }

        /**
         * Gets the value of the responseCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getResponseCode() {
            return responseCode;
        }

        /**
         * Sets the value of the responseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setResponseCode(Long value) {
            this.responseCode = value;
        }

        /**
         * Gets the value of the serviceCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getServiceCode() {
            return serviceCode;
        }

        /**
         * Sets the value of the serviceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setServiceCode(Long value) {
            this.serviceCode = value;
        }

        /**
         * Gets the value of the cardAcceptorLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardAcceptorLocation() {
            return cardAcceptorLocation;
        }

        /**
         * Sets the value of the cardAcceptorLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardAcceptorLocation(String value) {
            this.cardAcceptorLocation = value;
        }

        /**
         * Gets the value of the iccAdditionalPosInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIccAdditionalPosInformation() {
            return iccAdditionalPosInformation;
        }

        /**
         * Sets the value of the iccAdditionalPosInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIccAdditionalPosInformation(String value) {
            this.iccAdditionalPosInformation = value;
        }

        /**
         * Gets the value of the terminalType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTerminalType() {
            return terminalType;
        }

        /**
         * Sets the value of the terminalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTerminalType(Long value) {
            this.terminalType = value;
        }

        /**
         * Gets the value of the posConditionCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPosConditionCode() {
            return posConditionCode;
        }

        /**
         * Sets the value of the posConditionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPosConditionCode(Long value) {
            this.posConditionCode = value;
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
     *       &lt;attribute name="TransmissionDateTime" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Stan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SettleDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigTransmissionDateTime" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigSettleDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="WalletId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="WalletName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigPosEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CdcvmIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigMessType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cup {

        @XmlAttribute(name = "TransmissionDateTime")
        protected String transmissionDateTime;
        @XmlAttribute(name = "Stan")
        protected String stan;
        @XmlAttribute(name = "SettleDate")
        protected String settleDate;
        @XmlAttribute(name = "OrigTransmissionDateTime")
        protected String origTransmissionDateTime;
        @XmlAttribute(name = "OrigStan")
        protected String origStan;
        @XmlAttribute(name = "OrigSettleDate")
        protected String origSettleDate;
        @XmlAttribute(name = "PosCondition")
        protected String posCondition;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "WalletId")
        protected String walletId;
        @XmlAttribute(name = "WalletName")
        protected String walletName;
        @XmlAttribute(name = "OrigPosEntryMode")
        protected Long origPosEntryMode;
        @XmlAttribute(name = "CdcvmIndicator")
        protected String cdcvmIndicator;
        @XmlAttribute(name = "OrigMessType")
        protected String origMessType;

        /**
         * Gets the value of the transmissionDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransmissionDateTime() {
            return transmissionDateTime;
        }

        /**
         * Sets the value of the transmissionDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransmissionDateTime(String value) {
            this.transmissionDateTime = value;
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
         * Gets the value of the settleDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettleDate() {
            return settleDate;
        }

        /**
         * Sets the value of the settleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettleDate(String value) {
            this.settleDate = value;
        }

        /**
         * Gets the value of the origTransmissionDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigTransmissionDateTime() {
            return origTransmissionDateTime;
        }

        /**
         * Sets the value of the origTransmissionDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigTransmissionDateTime(String value) {
            this.origTransmissionDateTime = value;
        }

        /**
         * Gets the value of the origStan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigStan() {
            return origStan;
        }

        /**
         * Sets the value of the origStan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigStan(String value) {
            this.origStan = value;
        }

        /**
         * Gets the value of the origSettleDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigSettleDate() {
            return origSettleDate;
        }

        /**
         * Sets the value of the origSettleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigSettleDate(String value) {
            this.origSettleDate = value;
        }

        /**
         * Gets the value of the posCondition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosCondition() {
            return posCondition;
        }

        /**
         * Sets the value of the posCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosCondition(String value) {
            this.posCondition = value;
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
         * Gets the value of the walletId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWalletId() {
            return walletId;
        }

        /**
         * Sets the value of the walletId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWalletId(String value) {
            this.walletId = value;
        }

        /**
         * Gets the value of the walletName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWalletName() {
            return walletName;
        }

        /**
         * Sets the value of the walletName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWalletName(String value) {
            this.walletName = value;
        }

        /**
         * Gets the value of the origPosEntryMode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigPosEntryMode() {
            return origPosEntryMode;
        }

        /**
         * Sets the value of the origPosEntryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigPosEntryMode(Long value) {
            this.origPosEntryMode = value;
        }

        /**
         * Gets the value of the cdcvmIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdcvmIndicator() {
            return cdcvmIndicator;
        }

        /**
         * Sets the value of the cdcvmIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdcvmIndicator(String value) {
            this.cdcvmIndicator = value;
        }

        /**
         * Gets the value of the origMessType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigMessType() {
            return origMessType;
        }

        /**
         * Sets the value of the origMessType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigMessType(String value) {
            this.origMessType = value;
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
     *         &lt;element name="Attr" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValue" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "attr"
    })
    public static class Custom {

        @XmlElement(name = "Attr")
        protected List<ParamValue> attr;

        /**
         * Gets the value of the attr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParamValue }
         * 
         * 
         */
        public List<ParamValue> getAttr() {
            if (attr == null) {
                attr = new ArrayList<ParamValue>();
            }
            return this.attr;
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
     *       &lt;attribute name="NetworkReferenceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardHolderPresence" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardPresence" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardInputMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ECommercePaymentIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardInputCaps" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ParticipantDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ParticipantIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SourceDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SourceIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="DestinationDxs" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DestinationIso" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RecapNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RecapDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="SeqNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="BatchNum" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TypeCharge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChargeType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="DisputeStage" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CreditDebitInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="GrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Disputes" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FeeDetails" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FxRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="DebitCreditInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigGrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="OrigChargeType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OrigCurrency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeGrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="FeeRuleSn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeRuleDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeVolume" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="FeeTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FeeBasis" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeRateAmount" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DinersClub {

        @XmlAttribute(name = "NetworkReferenceId")
        protected String networkReferenceId;
        @XmlAttribute(name = "CardHolderPresence")
        protected String cardHolderPresence;
        @XmlAttribute(name = "CardPresence")
        protected String cardPresence;
        @XmlAttribute(name = "CardInputMethod")
        protected String cardInputMethod;
        @XmlAttribute(name = "ECommercePaymentIndicator")
        protected String eCommercePaymentIndicator;
        @XmlAttribute(name = "CardInputCaps")
        protected String cardInputCaps;
        @XmlAttribute(name = "ParticipantDxs")
        protected String participantDxs;
        @XmlAttribute(name = "ParticipantIso")
        protected Long participantIso;
        @XmlAttribute(name = "SourceDxs")
        protected String sourceDxs;
        @XmlAttribute(name = "SourceIso")
        protected Long sourceIso;
        @XmlAttribute(name = "DestinationDxs")
        protected String destinationDxs;
        @XmlAttribute(name = "DestinationIso")
        protected Long destinationIso;
        @XmlAttribute(name = "RecapNum")
        protected Long recapNum;
        @XmlAttribute(name = "RecapDate")
        protected XMLGregorianCalendar recapDate;
        @XmlAttribute(name = "SeqNum")
        protected Long seqNum;
        @XmlAttribute(name = "BatchNum")
        protected Long batchNum;
        @XmlAttribute(name = "TypeCharge")
        protected String typeCharge;
        @XmlAttribute(name = "ChargeType")
        protected Long chargeType;
        @XmlAttribute(name = "DisputeStage")
        protected String disputeStage;
        @XmlAttribute(name = "CreditDebitInd")
        protected String creditDebitInd;
        @XmlAttribute(name = "NetAmt")
        protected BigDecimal netAmt;
        @XmlAttribute(name = "GrossAmt")
        protected BigDecimal grossAmt;
        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "Disputes")
        protected Long disputes;
        @XmlAttribute(name = "FeeDetails")
        protected Long feeDetails;
        @XmlAttribute(name = "FxRate")
        protected BigDecimal fxRate;
        @XmlAttribute(name = "DebitCreditInd")
        protected String debitCreditInd;
        @XmlAttribute(name = "OrigGrossAmt")
        protected BigDecimal origGrossAmt;
        @XmlAttribute(name = "OrigChargeType")
        protected Long origChargeType;
        @XmlAttribute(name = "OrigCurrency")
        protected String origCurrency;
        @XmlAttribute(name = "FeeGrossAmt")
        protected BigDecimal feeGrossAmt;
        @XmlAttribute(name = "FeeRuleSn")
        protected String feeRuleSn;
        @XmlAttribute(name = "FeeRuleDescription")
        protected String feeRuleDescription;
        @XmlAttribute(name = "FeeVolume")
        protected BigDecimal feeVolume;
        @XmlAttribute(name = "FeeTranCount")
        protected Long feeTranCount;
        @XmlAttribute(name = "FeeBasis")
        protected String feeBasis;
        @XmlAttribute(name = "FeeRateAmount")
        protected BigDecimal feeRateAmount;

        /**
         * Gets the value of the networkReferenceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkReferenceId() {
            return networkReferenceId;
        }

        /**
         * Sets the value of the networkReferenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkReferenceId(String value) {
            this.networkReferenceId = value;
        }

        /**
         * Gets the value of the cardHolderPresence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardHolderPresence() {
            return cardHolderPresence;
        }

        /**
         * Sets the value of the cardHolderPresence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardHolderPresence(String value) {
            this.cardHolderPresence = value;
        }

        /**
         * Gets the value of the cardPresence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardPresence() {
            return cardPresence;
        }

        /**
         * Sets the value of the cardPresence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardPresence(String value) {
            this.cardPresence = value;
        }

        /**
         * Gets the value of the cardInputMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardInputMethod() {
            return cardInputMethod;
        }

        /**
         * Sets the value of the cardInputMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardInputMethod(String value) {
            this.cardInputMethod = value;
        }

        /**
         * Gets the value of the eCommercePaymentIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getECommercePaymentIndicator() {
            return eCommercePaymentIndicator;
        }

        /**
         * Sets the value of the eCommercePaymentIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setECommercePaymentIndicator(String value) {
            this.eCommercePaymentIndicator = value;
        }

        /**
         * Gets the value of the cardInputCaps property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardInputCaps() {
            return cardInputCaps;
        }

        /**
         * Sets the value of the cardInputCaps property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardInputCaps(String value) {
            this.cardInputCaps = value;
        }

        /**
         * Gets the value of the participantDxs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipantDxs() {
            return participantDxs;
        }

        /**
         * Sets the value of the participantDxs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipantDxs(String value) {
            this.participantDxs = value;
        }

        /**
         * Gets the value of the participantIso property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getParticipantIso() {
            return participantIso;
        }

        /**
         * Sets the value of the participantIso property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setParticipantIso(Long value) {
            this.participantIso = value;
        }

        /**
         * Gets the value of the sourceDxs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceDxs() {
            return sourceDxs;
        }

        /**
         * Sets the value of the sourceDxs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceDxs(String value) {
            this.sourceDxs = value;
        }

        /**
         * Gets the value of the sourceIso property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSourceIso() {
            return sourceIso;
        }

        /**
         * Sets the value of the sourceIso property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSourceIso(Long value) {
            this.sourceIso = value;
        }

        /**
         * Gets the value of the destinationDxs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationDxs() {
            return destinationDxs;
        }

        /**
         * Sets the value of the destinationDxs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationDxs(String value) {
            this.destinationDxs = value;
        }

        /**
         * Gets the value of the destinationIso property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDestinationIso() {
            return destinationIso;
        }

        /**
         * Sets the value of the destinationIso property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDestinationIso(Long value) {
            this.destinationIso = value;
        }

        /**
         * Gets the value of the recapNum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRecapNum() {
            return recapNum;
        }

        /**
         * Sets the value of the recapNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRecapNum(Long value) {
            this.recapNum = value;
        }

        /**
         * Gets the value of the recapDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRecapDate() {
            return recapDate;
        }

        /**
         * Sets the value of the recapDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRecapDate(XMLGregorianCalendar value) {
            this.recapDate = value;
        }

        /**
         * Gets the value of the seqNum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSeqNum() {
            return seqNum;
        }

        /**
         * Sets the value of the seqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSeqNum(Long value) {
            this.seqNum = value;
        }

        /**
         * Gets the value of the batchNum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBatchNum() {
            return batchNum;
        }

        /**
         * Sets the value of the batchNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBatchNum(Long value) {
            this.batchNum = value;
        }

        /**
         * Gets the value of the typeCharge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeCharge() {
            return typeCharge;
        }

        /**
         * Sets the value of the typeCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeCharge(String value) {
            this.typeCharge = value;
        }

        /**
         * Gets the value of the chargeType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getChargeType() {
            return chargeType;
        }

        /**
         * Sets the value of the chargeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setChargeType(Long value) {
            this.chargeType = value;
        }

        /**
         * Gets the value of the disputeStage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisputeStage() {
            return disputeStage;
        }

        /**
         * Sets the value of the disputeStage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisputeStage(String value) {
            this.disputeStage = value;
        }

        /**
         * Gets the value of the creditDebitInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditDebitInd() {
            return creditDebitInd;
        }

        /**
         * Sets the value of the creditDebitInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditDebitInd(String value) {
            this.creditDebitInd = value;
        }

        /**
         * Gets the value of the netAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetAmt() {
            return netAmt;
        }

        /**
         * Sets the value of the netAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetAmt(BigDecimal value) {
            this.netAmt = value;
        }

        /**
         * Gets the value of the grossAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossAmt() {
            return grossAmt;
        }

        /**
         * Sets the value of the grossAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossAmt(BigDecimal value) {
            this.grossAmt = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the disputes property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDisputes() {
            return disputes;
        }

        /**
         * Sets the value of the disputes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDisputes(Long value) {
            this.disputes = value;
        }

        /**
         * Gets the value of the feeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFeeDetails() {
            return feeDetails;
        }

        /**
         * Sets the value of the feeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFeeDetails(Long value) {
            this.feeDetails = value;
        }

        /**
         * Gets the value of the fxRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFxRate() {
            return fxRate;
        }

        /**
         * Sets the value of the fxRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFxRate(BigDecimal value) {
            this.fxRate = value;
        }

        /**
         * Gets the value of the debitCreditInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitCreditInd() {
            return debitCreditInd;
        }

        /**
         * Sets the value of the debitCreditInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitCreditInd(String value) {
            this.debitCreditInd = value;
        }

        /**
         * Gets the value of the origGrossAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOrigGrossAmt() {
            return origGrossAmt;
        }

        /**
         * Sets the value of the origGrossAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOrigGrossAmt(BigDecimal value) {
            this.origGrossAmt = value;
        }

        /**
         * Gets the value of the origChargeType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigChargeType() {
            return origChargeType;
        }

        /**
         * Sets the value of the origChargeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigChargeType(Long value) {
            this.origChargeType = value;
        }

        /**
         * Gets the value of the origCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigCurrency() {
            return origCurrency;
        }

        /**
         * Sets the value of the origCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigCurrency(String value) {
            this.origCurrency = value;
        }

        /**
         * Gets the value of the feeGrossAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFeeGrossAmt() {
            return feeGrossAmt;
        }

        /**
         * Sets the value of the feeGrossAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFeeGrossAmt(BigDecimal value) {
            this.feeGrossAmt = value;
        }

        /**
         * Gets the value of the feeRuleSn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeRuleSn() {
            return feeRuleSn;
        }

        /**
         * Sets the value of the feeRuleSn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeRuleSn(String value) {
            this.feeRuleSn = value;
        }

        /**
         * Gets the value of the feeRuleDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeRuleDescription() {
            return feeRuleDescription;
        }

        /**
         * Sets the value of the feeRuleDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeRuleDescription(String value) {
            this.feeRuleDescription = value;
        }

        /**
         * Gets the value of the feeVolume property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFeeVolume() {
            return feeVolume;
        }

        /**
         * Sets the value of the feeVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFeeVolume(BigDecimal value) {
            this.feeVolume = value;
        }

        /**
         * Gets the value of the feeTranCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFeeTranCount() {
            return feeTranCount;
        }

        /**
         * Sets the value of the feeTranCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFeeTranCount(Long value) {
            this.feeTranCount = value;
        }

        /**
         * Gets the value of the feeBasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeBasis() {
            return feeBasis;
        }

        /**
         * Sets the value of the feeBasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeBasis(String value) {
            this.feeBasis = value;
        }

        /**
         * Gets the value of the feeRateAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFeeRateAmount() {
            return feeRateAmount;
        }

        /**
         * Sets the value of the feeRateAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFeeRateAmount(BigDecimal value) {
            this.feeRateAmount = value;
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
     *       &lt;attribute name="NodeId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AtmNetworkId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetworkReferenceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discover {

        @XmlAttribute(name = "NodeId")
        protected String nodeId;
        @XmlAttribute(name = "AtmNetworkId")
        protected String atmNetworkId;
        @XmlAttribute(name = "NetworkReferenceId")
        protected String networkReferenceId;

        /**
         * Gets the value of the nodeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodeId() {
            return nodeId;
        }

        /**
         * Sets the value of the nodeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodeId(String value) {
            this.nodeId = value;
        }

        /**
         * Gets the value of the atmNetworkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtmNetworkId() {
            return atmNetworkId;
        }

        /**
         * Sets the value of the atmNetworkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtmNetworkId(String value) {
            this.atmNetworkId = value;
        }

        /**
         * Gets the value of the networkReferenceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkReferenceId() {
            return networkReferenceId;
        }

        /**
         * Sets the value of the networkReferenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkReferenceId(String value) {
            this.networkReferenceId = value;
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
     *         &lt;element name="ChargeInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SendersCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ReceiversCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ChargesDetails" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FileId" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="DateSent" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="FileOriginatorOin" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="UserOrSeqNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="SerialNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="FileNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Filler" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RemittanceInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="RegulatoryReport" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Limits" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="SettlementIndividualLimitStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="NewSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PrevSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="NewSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PrevSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Members" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SubmittingMember" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
     *                   &lt;element name="ReceivingMemeber" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
     *                   &lt;element name="BeneficiaryMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
     *                   &lt;element name="ReceivingMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AgencyAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AgencySortCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FpsReason" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OrigPaymentTypeCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SenderRole" type="{http://schemas.radixware.org/types.xsd}Int" default="0" /&gt;
     *       &lt;attribute name="ReceiverRole" type="{http://schemas.radixware.org/types.xsd}Int" default="0" /&gt;
     *       &lt;attribute name="ExchangeRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="OrigDateSent" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="OrigActionCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FpsResponseCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ProcessedAsync" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ServiceStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RespTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RedirectedBenificiaryFi" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RedirectedBenificiaryAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PaymentSubCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PaymentPurpose" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AccountTypeCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SuspensionStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PrevSuspensionStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PriorityGroup" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MemberAvailability" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SendingInstitution" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BeneficiaryMemberId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SendingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SubmittingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetSenderCap" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="PrevNetSenderCap" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="NetSenderCapStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OrigSettlementPosition" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OriginalSignIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RecalculatedSettlementPosition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RecalculatedSignIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ReceivingMemberName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetSenderTresholdStatus" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="NetSenderTresholdVal" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="NetSenderTresholdPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="NewNetSenderTreshold" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="NewNetSenderTresholdPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SettlementRiskPositionVal" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SettlementRiskPositionPercent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ResidialSettlementRiskPosition" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InfoText" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PaymentReturnCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IsRepeat" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="SyntaxErrorData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BeneficiaryAcctNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chargeInfo",
        "fileId",
        "remittanceInfo",
        "regulatoryReport",
        "limits",
        "members"
    })
    public static class FasterPayments {

        @XmlElement(name = "ChargeInfo")
        protected NetworkSpecific.FasterPayments.ChargeInfo chargeInfo;
        @XmlElement(name = "FileId")
        protected NetworkSpecific.FasterPayments.FileId fileId;
        @XmlElement(name = "RemittanceInfo")
        protected String remittanceInfo;
        @XmlElement(name = "RegulatoryReport")
        protected String regulatoryReport;
        @XmlElement(name = "Limits")
        protected NetworkSpecific.FasterPayments.Limits limits;
        @XmlElement(name = "Members")
        protected NetworkSpecific.FasterPayments.Members members;
        @XmlAttribute(name = "AgencyAccount")
        protected String agencyAccount;
        @XmlAttribute(name = "AgencySortCode")
        protected String agencySortCode;
        @XmlAttribute(name = "FpsReason")
        protected Long fpsReason;
        @XmlAttribute(name = "OrigPaymentTypeCode")
        protected Long origPaymentTypeCode;
        @XmlAttribute(name = "SenderRole")
        protected Long senderRole;
        @XmlAttribute(name = "ReceiverRole")
        protected Long receiverRole;
        @XmlAttribute(name = "ExchangeRate")
        protected BigDecimal exchangeRate;
        @XmlAttribute(name = "OrigDateSent")
        protected XMLGregorianCalendar origDateSent;
        @XmlAttribute(name = "OrigActionCode")
        protected Long origActionCode;
        @XmlAttribute(name = "FpsResponseCode")
        protected Long fpsResponseCode;
        @XmlAttribute(name = "ProcessedAsync")
        protected Long processedAsync;
        @XmlAttribute(name = "ServiceStatus")
        protected String serviceStatus;
        @XmlAttribute(name = "RespTime")
        protected Long respTime;
        @XmlAttribute(name = "RedirectedBenificiaryFi")
        protected String redirectedBenificiaryFi;
        @XmlAttribute(name = "RedirectedBenificiaryAccount")
        protected String redirectedBenificiaryAccount;
        @XmlAttribute(name = "PaymentSubCode")
        protected String paymentSubCode;
        @XmlAttribute(name = "PaymentPurpose")
        protected String paymentPurpose;
        @XmlAttribute(name = "AccountTypeCode")
        protected String accountTypeCode;
        @XmlAttribute(name = "SuspensionStatus")
        protected String suspensionStatus;
        @XmlAttribute(name = "PrevSuspensionStatus")
        protected String prevSuspensionStatus;
        @XmlAttribute(name = "PriorityGroup")
        protected String priorityGroup;
        @XmlAttribute(name = "MemberAvailability")
        protected String memberAvailability;
        @XmlAttribute(name = "SendingInstitution")
        protected String sendingInstitution;
        @XmlAttribute(name = "BeneficiaryMemberId")
        protected Long beneficiaryMemberId;
        @XmlAttribute(name = "SendingMemberName")
        protected String sendingMemberName;
        @XmlAttribute(name = "SubmittingMemberName")
        protected String submittingMemberName;
        @XmlAttribute(name = "NetSenderCap")
        protected BigDecimal netSenderCap;
        @XmlAttribute(name = "PrevNetSenderCap")
        protected BigDecimal prevNetSenderCap;
        @XmlAttribute(name = "NetSenderCapStatus")
        protected String netSenderCapStatus;
        @XmlAttribute(name = "OrigSettlementPosition")
        protected Long origSettlementPosition;
        @XmlAttribute(name = "OriginalSignIndicator")
        protected String originalSignIndicator;
        @XmlAttribute(name = "RecalculatedSettlementPosition")
        protected String recalculatedSettlementPosition;
        @XmlAttribute(name = "RecalculatedSignIndicator")
        protected String recalculatedSignIndicator;
        @XmlAttribute(name = "ReceivingMemberName")
        protected String receivingMemberName;
        @XmlAttribute(name = "NetSenderTresholdStatus")
        protected Long netSenderTresholdStatus;
        @XmlAttribute(name = "NetSenderTresholdVal")
        protected Long netSenderTresholdVal;
        @XmlAttribute(name = "NetSenderTresholdPercent")
        protected Long netSenderTresholdPercent;
        @XmlAttribute(name = "NewNetSenderTreshold")
        protected Long newNetSenderTreshold;
        @XmlAttribute(name = "NewNetSenderTresholdPercent")
        protected Long newNetSenderTresholdPercent;
        @XmlAttribute(name = "SettlementRiskPositionVal")
        protected Long settlementRiskPositionVal;
        @XmlAttribute(name = "SettlementRiskPositionPercent")
        protected Long settlementRiskPositionPercent;
        @XmlAttribute(name = "ResidialSettlementRiskPosition")
        protected Long residialSettlementRiskPosition;
        @XmlAttribute(name = "InfoText")
        protected String infoText;
        @XmlAttribute(name = "PaymentReturnCode")
        protected String paymentReturnCode;
        @XmlAttribute(name = "IsRepeat")
        protected Boolean isRepeat;
        @XmlAttribute(name = "SyntaxErrorData")
        protected String syntaxErrorData;
        @XmlAttribute(name = "BeneficiaryAcctNumber")
        protected String beneficiaryAcctNumber;

        /**
         * Gets the value of the chargeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.FasterPayments.ChargeInfo }
         *     
         */
        public NetworkSpecific.FasterPayments.ChargeInfo getChargeInfo() {
            return chargeInfo;
        }

        /**
         * Sets the value of the chargeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.FasterPayments.ChargeInfo }
         *     
         */
        public void setChargeInfo(NetworkSpecific.FasterPayments.ChargeInfo value) {
            this.chargeInfo = value;
        }

        /**
         * Gets the value of the fileId property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.FasterPayments.FileId }
         *     
         */
        public NetworkSpecific.FasterPayments.FileId getFileId() {
            return fileId;
        }

        /**
         * Sets the value of the fileId property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.FasterPayments.FileId }
         *     
         */
        public void setFileId(NetworkSpecific.FasterPayments.FileId value) {
            this.fileId = value;
        }

        /**
         * Gets the value of the remittanceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemittanceInfo() {
            return remittanceInfo;
        }

        /**
         * Sets the value of the remittanceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemittanceInfo(String value) {
            this.remittanceInfo = value;
        }

        /**
         * Gets the value of the regulatoryReport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegulatoryReport() {
            return regulatoryReport;
        }

        /**
         * Sets the value of the regulatoryReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegulatoryReport(String value) {
            this.regulatoryReport = value;
        }

        /**
         * Gets the value of the limits property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.FasterPayments.Limits }
         *     
         */
        public NetworkSpecific.FasterPayments.Limits getLimits() {
            return limits;
        }

        /**
         * Sets the value of the limits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.FasterPayments.Limits }
         *     
         */
        public void setLimits(NetworkSpecific.FasterPayments.Limits value) {
            this.limits = value;
        }

        /**
         * Gets the value of the members property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.FasterPayments.Members }
         *     
         */
        public NetworkSpecific.FasterPayments.Members getMembers() {
            return members;
        }

        /**
         * Sets the value of the members property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.FasterPayments.Members }
         *     
         */
        public void setMembers(NetworkSpecific.FasterPayments.Members value) {
            this.members = value;
        }

        /**
         * Gets the value of the agencyAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyAccount() {
            return agencyAccount;
        }

        /**
         * Sets the value of the agencyAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyAccount(String value) {
            this.agencyAccount = value;
        }

        /**
         * Gets the value of the agencySortCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencySortCode() {
            return agencySortCode;
        }

        /**
         * Sets the value of the agencySortCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencySortCode(String value) {
            this.agencySortCode = value;
        }

        /**
         * Gets the value of the fpsReason property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFpsReason() {
            return fpsReason;
        }

        /**
         * Sets the value of the fpsReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFpsReason(Long value) {
            this.fpsReason = value;
        }

        /**
         * Gets the value of the origPaymentTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigPaymentTypeCode() {
            return origPaymentTypeCode;
        }

        /**
         * Sets the value of the origPaymentTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigPaymentTypeCode(Long value) {
            this.origPaymentTypeCode = value;
        }

        /**
         * Gets the value of the senderRole property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getSenderRole() {
            if (senderRole == null) {
                return  0L;
            } else {
                return senderRole;
            }
        }

        /**
         * Sets the value of the senderRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSenderRole(Long value) {
            this.senderRole = value;
        }

        /**
         * Gets the value of the receiverRole property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getReceiverRole() {
            if (receiverRole == null) {
                return  0L;
            } else {
                return receiverRole;
            }
        }

        /**
         * Sets the value of the receiverRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setReceiverRole(Long value) {
            this.receiverRole = value;
        }

        /**
         * Gets the value of the exchangeRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }

        /**
         * Sets the value of the exchangeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExchangeRate(BigDecimal value) {
            this.exchangeRate = value;
        }

        /**
         * Gets the value of the origDateSent property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOrigDateSent() {
            return origDateSent;
        }

        /**
         * Sets the value of the origDateSent property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOrigDateSent(XMLGregorianCalendar value) {
            this.origDateSent = value;
        }

        /**
         * Gets the value of the origActionCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigActionCode() {
            return origActionCode;
        }

        /**
         * Sets the value of the origActionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigActionCode(Long value) {
            this.origActionCode = value;
        }

        /**
         * Gets the value of the fpsResponseCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFpsResponseCode() {
            return fpsResponseCode;
        }

        /**
         * Sets the value of the fpsResponseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFpsResponseCode(Long value) {
            this.fpsResponseCode = value;
        }

        /**
         * Gets the value of the processedAsync property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProcessedAsync() {
            return processedAsync;
        }

        /**
         * Sets the value of the processedAsync property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProcessedAsync(Long value) {
            this.processedAsync = value;
        }

        /**
         * Gets the value of the serviceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceStatus() {
            return serviceStatus;
        }

        /**
         * Sets the value of the serviceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceStatus(String value) {
            this.serviceStatus = value;
        }

        /**
         * Gets the value of the respTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRespTime() {
            return respTime;
        }

        /**
         * Sets the value of the respTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRespTime(Long value) {
            this.respTime = value;
        }

        /**
         * Gets the value of the redirectedBenificiaryFi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRedirectedBenificiaryFi() {
            return redirectedBenificiaryFi;
        }

        /**
         * Sets the value of the redirectedBenificiaryFi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRedirectedBenificiaryFi(String value) {
            this.redirectedBenificiaryFi = value;
        }

        /**
         * Gets the value of the redirectedBenificiaryAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRedirectedBenificiaryAccount() {
            return redirectedBenificiaryAccount;
        }

        /**
         * Sets the value of the redirectedBenificiaryAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRedirectedBenificiaryAccount(String value) {
            this.redirectedBenificiaryAccount = value;
        }

        /**
         * Gets the value of the paymentSubCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentSubCode() {
            return paymentSubCode;
        }

        /**
         * Sets the value of the paymentSubCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentSubCode(String value) {
            this.paymentSubCode = value;
        }

        /**
         * Gets the value of the paymentPurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentPurpose() {
            return paymentPurpose;
        }

        /**
         * Sets the value of the paymentPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentPurpose(String value) {
            this.paymentPurpose = value;
        }

        /**
         * Gets the value of the accountTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountTypeCode() {
            return accountTypeCode;
        }

        /**
         * Sets the value of the accountTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountTypeCode(String value) {
            this.accountTypeCode = value;
        }

        /**
         * Gets the value of the suspensionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspensionStatus() {
            return suspensionStatus;
        }

        /**
         * Sets the value of the suspensionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspensionStatus(String value) {
            this.suspensionStatus = value;
        }

        /**
         * Gets the value of the prevSuspensionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrevSuspensionStatus() {
            return prevSuspensionStatus;
        }

        /**
         * Sets the value of the prevSuspensionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrevSuspensionStatus(String value) {
            this.prevSuspensionStatus = value;
        }

        /**
         * Gets the value of the priorityGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriorityGroup() {
            return priorityGroup;
        }

        /**
         * Sets the value of the priorityGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriorityGroup(String value) {
            this.priorityGroup = value;
        }

        /**
         * Gets the value of the memberAvailability property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberAvailability() {
            return memberAvailability;
        }

        /**
         * Sets the value of the memberAvailability property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberAvailability(String value) {
            this.memberAvailability = value;
        }

        /**
         * Gets the value of the sendingInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendingInstitution() {
            return sendingInstitution;
        }

        /**
         * Sets the value of the sendingInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendingInstitution(String value) {
            this.sendingInstitution = value;
        }

        /**
         * Gets the value of the beneficiaryMemberId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBeneficiaryMemberId() {
            return beneficiaryMemberId;
        }

        /**
         * Sets the value of the beneficiaryMemberId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBeneficiaryMemberId(Long value) {
            this.beneficiaryMemberId = value;
        }

        /**
         * Gets the value of the sendingMemberName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendingMemberName() {
            return sendingMemberName;
        }

        /**
         * Sets the value of the sendingMemberName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendingMemberName(String value) {
            this.sendingMemberName = value;
        }

        /**
         * Gets the value of the submittingMemberName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmittingMemberName() {
            return submittingMemberName;
        }

        /**
         * Sets the value of the submittingMemberName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmittingMemberName(String value) {
            this.submittingMemberName = value;
        }

        /**
         * Gets the value of the netSenderCap property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetSenderCap() {
            return netSenderCap;
        }

        /**
         * Sets the value of the netSenderCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetSenderCap(BigDecimal value) {
            this.netSenderCap = value;
        }

        /**
         * Gets the value of the prevNetSenderCap property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrevNetSenderCap() {
            return prevNetSenderCap;
        }

        /**
         * Sets the value of the prevNetSenderCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrevNetSenderCap(BigDecimal value) {
            this.prevNetSenderCap = value;
        }

        /**
         * Gets the value of the netSenderCapStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetSenderCapStatus() {
            return netSenderCapStatus;
        }

        /**
         * Sets the value of the netSenderCapStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetSenderCapStatus(String value) {
            this.netSenderCapStatus = value;
        }

        /**
         * Gets the value of the origSettlementPosition property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigSettlementPosition() {
            return origSettlementPosition;
        }

        /**
         * Sets the value of the origSettlementPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigSettlementPosition(Long value) {
            this.origSettlementPosition = value;
        }

        /**
         * Gets the value of the originalSignIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalSignIndicator() {
            return originalSignIndicator;
        }

        /**
         * Sets the value of the originalSignIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalSignIndicator(String value) {
            this.originalSignIndicator = value;
        }

        /**
         * Gets the value of the recalculatedSettlementPosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecalculatedSettlementPosition() {
            return recalculatedSettlementPosition;
        }

        /**
         * Sets the value of the recalculatedSettlementPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecalculatedSettlementPosition(String value) {
            this.recalculatedSettlementPosition = value;
        }

        /**
         * Gets the value of the recalculatedSignIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecalculatedSignIndicator() {
            return recalculatedSignIndicator;
        }

        /**
         * Sets the value of the recalculatedSignIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecalculatedSignIndicator(String value) {
            this.recalculatedSignIndicator = value;
        }

        /**
         * Gets the value of the receivingMemberName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceivingMemberName() {
            return receivingMemberName;
        }

        /**
         * Sets the value of the receivingMemberName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceivingMemberName(String value) {
            this.receivingMemberName = value;
        }

        /**
         * Gets the value of the netSenderTresholdStatus property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNetSenderTresholdStatus() {
            return netSenderTresholdStatus;
        }

        /**
         * Sets the value of the netSenderTresholdStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNetSenderTresholdStatus(Long value) {
            this.netSenderTresholdStatus = value;
        }

        /**
         * Gets the value of the netSenderTresholdVal property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNetSenderTresholdVal() {
            return netSenderTresholdVal;
        }

        /**
         * Sets the value of the netSenderTresholdVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNetSenderTresholdVal(Long value) {
            this.netSenderTresholdVal = value;
        }

        /**
         * Gets the value of the netSenderTresholdPercent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNetSenderTresholdPercent() {
            return netSenderTresholdPercent;
        }

        /**
         * Sets the value of the netSenderTresholdPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNetSenderTresholdPercent(Long value) {
            this.netSenderTresholdPercent = value;
        }

        /**
         * Gets the value of the newNetSenderTreshold property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNewNetSenderTreshold() {
            return newNetSenderTreshold;
        }

        /**
         * Sets the value of the newNetSenderTreshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNewNetSenderTreshold(Long value) {
            this.newNetSenderTreshold = value;
        }

        /**
         * Gets the value of the newNetSenderTresholdPercent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNewNetSenderTresholdPercent() {
            return newNetSenderTresholdPercent;
        }

        /**
         * Sets the value of the newNetSenderTresholdPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNewNetSenderTresholdPercent(Long value) {
            this.newNetSenderTresholdPercent = value;
        }

        /**
         * Gets the value of the settlementRiskPositionVal property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSettlementRiskPositionVal() {
            return settlementRiskPositionVal;
        }

        /**
         * Sets the value of the settlementRiskPositionVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSettlementRiskPositionVal(Long value) {
            this.settlementRiskPositionVal = value;
        }

        /**
         * Gets the value of the settlementRiskPositionPercent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSettlementRiskPositionPercent() {
            return settlementRiskPositionPercent;
        }

        /**
         * Sets the value of the settlementRiskPositionPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSettlementRiskPositionPercent(Long value) {
            this.settlementRiskPositionPercent = value;
        }

        /**
         * Gets the value of the residialSettlementRiskPosition property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getResidialSettlementRiskPosition() {
            return residialSettlementRiskPosition;
        }

        /**
         * Sets the value of the residialSettlementRiskPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setResidialSettlementRiskPosition(Long value) {
            this.residialSettlementRiskPosition = value;
        }

        /**
         * Gets the value of the infoText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoText() {
            return infoText;
        }

        /**
         * Sets the value of the infoText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoText(String value) {
            this.infoText = value;
        }

        /**
         * Gets the value of the paymentReturnCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentReturnCode() {
            return paymentReturnCode;
        }

        /**
         * Sets the value of the paymentReturnCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentReturnCode(String value) {
            this.paymentReturnCode = value;
        }

        /**
         * Gets the value of the isRepeat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRepeat() {
            return isRepeat;
        }

        /**
         * Sets the value of the isRepeat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRepeat(Boolean value) {
            this.isRepeat = value;
        }

        /**
         * Gets the value of the syntaxErrorData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSyntaxErrorData() {
            return syntaxErrorData;
        }

        /**
         * Sets the value of the syntaxErrorData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSyntaxErrorData(String value) {
            this.syntaxErrorData = value;
        }

        /**
         * Gets the value of the beneficiaryAcctNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeneficiaryAcctNumber() {
            return beneficiaryAcctNumber;
        }

        /**
         * Sets the value of the beneficiaryAcctNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeneficiaryAcctNumber(String value) {
            this.beneficiaryAcctNumber = value;
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
         *         &lt;element name="SendersCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ReceiversCharges" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ChargesDetails" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sendersCharges",
            "receiversCharges"
        })
        public static class ChargeInfo {

            @XmlElement(name = "SendersCharges")
            protected List<MoneyValue> sendersCharges;
            @XmlElement(name = "ReceiversCharges")
            protected MoneyValue receiversCharges;
            @XmlAttribute(name = "ChargesDetails")
            protected String chargesDetails;

            /**
             * Gets the value of the sendersCharges property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sendersCharges property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSendersCharges().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MoneyValue }
             * 
             * 
             */
            public List<MoneyValue> getSendersCharges() {
                if (sendersCharges == null) {
                    sendersCharges = new ArrayList<MoneyValue>();
                }
                return this.sendersCharges;
            }

            /**
             * Gets the value of the receiversCharges property.
             * 
             * @return
             *     possible object is
             *     {@link MoneyValue }
             *     
             */
            public MoneyValue getReceiversCharges() {
                return receiversCharges;
            }

            /**
             * Sets the value of the receiversCharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link MoneyValue }
             *     
             */
            public void setReceiversCharges(MoneyValue value) {
                this.receiversCharges = value;
            }

            /**
             * Gets the value of the chargesDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargesDetails() {
                return chargesDetails;
            }

            /**
             * Sets the value of the chargesDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargesDetails(String value) {
                this.chargesDetails = value;
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
         *       &lt;attribute name="DateSent" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="FileOriginatorOin" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="UserOrSeqNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="SerialNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="FileNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Filler" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FileId {

            @XmlAttribute(name = "DateSent")
            protected XMLGregorianCalendar dateSent;
            @XmlAttribute(name = "FileOriginatorOin")
            protected String fileOriginatorOin;
            @XmlAttribute(name = "UserOrSeqNumber")
            protected String userOrSeqNumber;
            @XmlAttribute(name = "SerialNumber")
            protected String serialNumber;
            @XmlAttribute(name = "FileNumber")
            protected String fileNumber;
            @XmlAttribute(name = "Filler")
            protected String filler;

            /**
             * Gets the value of the dateSent property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateSent() {
                return dateSent;
            }

            /**
             * Sets the value of the dateSent property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateSent(XMLGregorianCalendar value) {
                this.dateSent = value;
            }

            /**
             * Gets the value of the fileOriginatorOin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileOriginatorOin() {
                return fileOriginatorOin;
            }

            /**
             * Sets the value of the fileOriginatorOin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileOriginatorOin(String value) {
                this.fileOriginatorOin = value;
            }

            /**
             * Gets the value of the userOrSeqNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserOrSeqNumber() {
                return userOrSeqNumber;
            }

            /**
             * Sets the value of the userOrSeqNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserOrSeqNumber(String value) {
                this.userOrSeqNumber = value;
            }

            /**
             * Gets the value of the serialNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * Sets the value of the serialNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

            /**
             * Gets the value of the fileNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileNumber() {
                return fileNumber;
            }

            /**
             * Sets the value of the fileNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileNumber(String value) {
                this.fileNumber = value;
            }

            /**
             * Gets the value of the filler property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiller() {
                return filler;
            }

            /**
             * Sets the value of the filler property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiller(String value) {
                this.filler = value;
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
         *       &lt;attribute name="SettlementIndividualLimitStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="NewSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PrevSettlementIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="NewSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PrevSecurityIndividualLimit" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Limits {

            @XmlAttribute(name = "SettlementIndividualLimitStatus")
            protected String settlementIndividualLimitStatus;
            @XmlAttribute(name = "NewSettlementIndividualLimit")
            protected BigDecimal newSettlementIndividualLimit;
            @XmlAttribute(name = "PrevSettlementIndividualLimit")
            protected BigDecimal prevSettlementIndividualLimit;
            @XmlAttribute(name = "NewSecurityIndividualLimit")
            protected BigDecimal newSecurityIndividualLimit;
            @XmlAttribute(name = "PrevSecurityIndividualLimit")
            protected BigDecimal prevSecurityIndividualLimit;

            /**
             * Gets the value of the settlementIndividualLimitStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementIndividualLimitStatus() {
                return settlementIndividualLimitStatus;
            }

            /**
             * Sets the value of the settlementIndividualLimitStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementIndividualLimitStatus(String value) {
                this.settlementIndividualLimitStatus = value;
            }

            /**
             * Gets the value of the newSettlementIndividualLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNewSettlementIndividualLimit() {
                return newSettlementIndividualLimit;
            }

            /**
             * Sets the value of the newSettlementIndividualLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNewSettlementIndividualLimit(BigDecimal value) {
                this.newSettlementIndividualLimit = value;
            }

            /**
             * Gets the value of the prevSettlementIndividualLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrevSettlementIndividualLimit() {
                return prevSettlementIndividualLimit;
            }

            /**
             * Sets the value of the prevSettlementIndividualLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrevSettlementIndividualLimit(BigDecimal value) {
                this.prevSettlementIndividualLimit = value;
            }

            /**
             * Gets the value of the newSecurityIndividualLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNewSecurityIndividualLimit() {
                return newSecurityIndividualLimit;
            }

            /**
             * Sets the value of the newSecurityIndividualLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNewSecurityIndividualLimit(BigDecimal value) {
                this.newSecurityIndividualLimit = value;
            }

            /**
             * Gets the value of the prevSecurityIndividualLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrevSecurityIndividualLimit() {
                return prevSecurityIndividualLimit;
            }

            /**
             * Sets the value of the prevSecurityIndividualLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrevSecurityIndividualLimit(BigDecimal value) {
                this.prevSecurityIndividualLimit = value;
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
         *         &lt;element name="SubmittingMember" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
         *         &lt;element name="ReceivingMemeber" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
         *         &lt;element name="BeneficiaryMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
         *         &lt;element name="ReceivingMemberId" type="{http://schemas.tranzaxis.com/tran.xsd}FasterPaymentsMemberId" minOccurs="0"/&gt;
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
            "submittingMember",
            "receivingMemeber",
            "beneficiaryMemberId",
            "receivingMemberId"
        })
        public static class Members {

            @XmlElement(name = "SubmittingMember")
            protected FasterPaymentsMemberId submittingMember;
            @XmlElement(name = "ReceivingMemeber")
            protected FasterPaymentsMemberId receivingMemeber;
            @XmlElement(name = "BeneficiaryMemberId")
            protected FasterPaymentsMemberId beneficiaryMemberId;
            @XmlElement(name = "ReceivingMemberId")
            protected FasterPaymentsMemberId receivingMemberId;

            /**
             * Gets the value of the submittingMember property.
             * 
             * @return
             *     possible object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public FasterPaymentsMemberId getSubmittingMember() {
                return submittingMember;
            }

            /**
             * Sets the value of the submittingMember property.
             * 
             * @param value
             *     allowed object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public void setSubmittingMember(FasterPaymentsMemberId value) {
                this.submittingMember = value;
            }

            /**
             * Gets the value of the receivingMemeber property.
             * 
             * @return
             *     possible object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public FasterPaymentsMemberId getReceivingMemeber() {
                return receivingMemeber;
            }

            /**
             * Sets the value of the receivingMemeber property.
             * 
             * @param value
             *     allowed object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public void setReceivingMemeber(FasterPaymentsMemberId value) {
                this.receivingMemeber = value;
            }

            /**
             * Gets the value of the beneficiaryMemberId property.
             * 
             * @return
             *     possible object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public FasterPaymentsMemberId getBeneficiaryMemberId() {
                return beneficiaryMemberId;
            }

            /**
             * Sets the value of the beneficiaryMemberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public void setBeneficiaryMemberId(FasterPaymentsMemberId value) {
                this.beneficiaryMemberId = value;
            }

            /**
             * Gets the value of the receivingMemberId property.
             * 
             * @return
             *     possible object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public FasterPaymentsMemberId getReceivingMemberId() {
                return receivingMemberId;
            }

            /**
             * Sets the value of the receivingMemberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link FasterPaymentsMemberId }
             *     
             */
            public void setReceivingMemberId(FasterPaymentsMemberId value) {
                this.receivingMemberId = value;
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
     *       &lt;attribute name="ElectronicCommerceInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PointOfServiceEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PointOfServiceInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TransitProgram" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Jcb {

        @XmlAttribute(name = "ElectronicCommerceInd")
        protected String electronicCommerceInd;
        @XmlAttribute(name = "PointOfServiceEntryMode")
        protected Long pointOfServiceEntryMode;
        @XmlAttribute(name = "PointOfServiceInformation")
        protected String pointOfServiceInformation;
        @XmlAttribute(name = "TransitProgram")
        protected String transitProgram;

        /**
         * Gets the value of the electronicCommerceInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElectronicCommerceInd() {
            return electronicCommerceInd;
        }

        /**
         * Sets the value of the electronicCommerceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElectronicCommerceInd(String value) {
            this.electronicCommerceInd = value;
        }

        /**
         * Gets the value of the pointOfServiceEntryMode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPointOfServiceEntryMode() {
            return pointOfServiceEntryMode;
        }

        /**
         * Sets the value of the pointOfServiceEntryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPointOfServiceEntryMode(Long value) {
            this.pointOfServiceEntryMode = value;
        }

        /**
         * Gets the value of the pointOfServiceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointOfServiceInformation() {
            return pointOfServiceInformation;
        }

        /**
         * Sets the value of the pointOfServiceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointOfServiceInformation(String value) {
            this.pointOfServiceInformation = value;
        }

        /**
         * Gets the value of the transitProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransitProgram() {
            return transitProgram;
        }

        /**
         * Sets the value of the transitProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransitProgram(String value) {
            this.transitProgram = value;
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
     *         &lt;element name="OnBehalf" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ServiceId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Result1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Result2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CatLevel" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PosCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetworkData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AddRespData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="McTopUpData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FraudNotification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="WalletId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="McAssignedId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PanMapping" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AtcInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ElectronicCommerceInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TranIntegrityClass" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TraceId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ResubmissionmCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TransitProgram" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TerminalCompliantIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PaymentTranTypeIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PromotionCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeRule" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Utrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="McMemberDefinedData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ParcelarInstallmentData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ParcelarInstallmentResponseData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ParcelarInstallmentResponseAddData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MoneySendReferenceData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AdditionalNationalData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RMAC" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IpmPosEntryMode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AncillaryServiceCharges" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RecordData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="LowRiskIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MerchantAdviceCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardValidationCodeResult" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SanctionScreeningScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="EstimatedAmount" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="RemoteCommerceAcceptorId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcquirerBin" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MerchantOriginCountryId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SecurityServicesAddDataForIssuers" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FraudScoringData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onBehalf"
    })
    public static class MasterCard {

        @XmlElement(name = "OnBehalf")
        protected List<NetworkSpecific.MasterCard.OnBehalf> onBehalf;
        @XmlAttribute(name = "CatLevel")
        protected Long catLevel;
        @XmlAttribute(name = "PosCondition")
        protected String posCondition;
        @XmlAttribute(name = "NetworkData")
        protected String networkData;
        @XmlAttribute(name = "AddRespData")
        protected String addRespData;
        @XmlAttribute(name = "McTopUpData")
        protected String mcTopUpData;
        @XmlAttribute(name = "FraudNotification")
        protected String fraudNotification;
        @XmlAttribute(name = "WalletId")
        protected String walletId;
        @XmlAttribute(name = "McAssignedId")
        protected String mcAssignedId;
        @XmlAttribute(name = "PanMapping")
        protected String panMapping;
        @XmlAttribute(name = "AtcInformation")
        protected String atcInformation;
        @XmlAttribute(name = "ElectronicCommerceInd")
        protected String electronicCommerceInd;
        @XmlAttribute(name = "TranIntegrityClass")
        protected String tranIntegrityClass;
        @XmlAttribute(name = "TraceId")
        protected String traceId;
        @XmlAttribute(name = "ResubmissionmCode")
        protected String resubmissionmCode;
        @XmlAttribute(name = "TransitProgram")
        protected String transitProgram;
        @XmlAttribute(name = "TerminalCompliantIndicator")
        protected String terminalCompliantIndicator;
        @XmlAttribute(name = "PaymentTranTypeIndicator")
        protected String paymentTranTypeIndicator;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "FeeRule")
        protected String feeRule;
        @XmlAttribute(name = "Utrn")
        protected String utrn;
        @XmlAttribute(name = "McMemberDefinedData")
        protected String mcMemberDefinedData;
        @XmlAttribute(name = "ParcelarInstallmentData")
        protected String parcelarInstallmentData;
        @XmlAttribute(name = "ParcelarInstallmentResponseData")
        protected String parcelarInstallmentResponseData;
        @XmlAttribute(name = "ParcelarInstallmentResponseAddData")
        protected String parcelarInstallmentResponseAddData;
        @XmlAttribute(name = "MoneySendReferenceData")
        protected String moneySendReferenceData;
        @XmlAttribute(name = "AdditionalNationalData")
        protected String additionalNationalData;
        @XmlAttribute(name = "RMAC")
        protected Long rmac;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "IpmPosEntryMode")
        protected String ipmPosEntryMode;
        @XmlAttribute(name = "AncillaryServiceCharges")
        protected String ancillaryServiceCharges;
        @XmlAttribute(name = "RecordData")
        protected String recordData;
        @XmlAttribute(name = "LowRiskIndicator")
        protected String lowRiskIndicator;
        @XmlAttribute(name = "MerchantAdviceCode")
        protected String merchantAdviceCode;
        @XmlAttribute(name = "CardValidationCodeResult")
        protected String cardValidationCodeResult;
        @XmlAttribute(name = "SanctionScreeningScore")
        protected String sanctionScreeningScore;
        @XmlAttribute(name = "EstimatedAmount")
        protected BigDecimal estimatedAmount;
        @XmlAttribute(name = "RemoteCommerceAcceptorId")
        protected String remoteCommerceAcceptorId;
        @XmlAttribute(name = "AcquirerBin")
        protected String acquirerBin;
        @XmlAttribute(name = "MerchantOriginCountryId")
        protected Long merchantOriginCountryId;
        @XmlAttribute(name = "SecurityServicesAddDataForIssuers")
        protected String securityServicesAddDataForIssuers;
        @XmlAttribute(name = "FraudScoringData")
        protected String fraudScoringData;

        /**
         * Gets the value of the onBehalf property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the onBehalf property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnBehalf().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetworkSpecific.MasterCard.OnBehalf }
         * 
         * 
         */
        public List<NetworkSpecific.MasterCard.OnBehalf> getOnBehalf() {
            if (onBehalf == null) {
                onBehalf = new ArrayList<NetworkSpecific.MasterCard.OnBehalf>();
            }
            return this.onBehalf;
        }

        /**
         * Gets the value of the catLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCatLevel() {
            return catLevel;
        }

        /**
         * Sets the value of the catLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCatLevel(Long value) {
            this.catLevel = value;
        }

        /**
         * Gets the value of the posCondition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosCondition() {
            return posCondition;
        }

        /**
         * Sets the value of the posCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosCondition(String value) {
            this.posCondition = value;
        }

        /**
         * Gets the value of the networkData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkData() {
            return networkData;
        }

        /**
         * Sets the value of the networkData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkData(String value) {
            this.networkData = value;
        }

        /**
         * Gets the value of the addRespData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddRespData() {
            return addRespData;
        }

        /**
         * Sets the value of the addRespData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddRespData(String value) {
            this.addRespData = value;
        }

        /**
         * Gets the value of the mcTopUpData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcTopUpData() {
            return mcTopUpData;
        }

        /**
         * Sets the value of the mcTopUpData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcTopUpData(String value) {
            this.mcTopUpData = value;
        }

        /**
         * Gets the value of the fraudNotification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudNotification() {
            return fraudNotification;
        }

        /**
         * Sets the value of the fraudNotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudNotification(String value) {
            this.fraudNotification = value;
        }

        /**
         * Gets the value of the walletId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWalletId() {
            return walletId;
        }

        /**
         * Sets the value of the walletId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWalletId(String value) {
            this.walletId = value;
        }

        /**
         * Gets the value of the mcAssignedId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcAssignedId() {
            return mcAssignedId;
        }

        /**
         * Sets the value of the mcAssignedId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcAssignedId(String value) {
            this.mcAssignedId = value;
        }

        /**
         * Gets the value of the panMapping property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPanMapping() {
            return panMapping;
        }

        /**
         * Sets the value of the panMapping property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPanMapping(String value) {
            this.panMapping = value;
        }

        /**
         * Gets the value of the atcInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtcInformation() {
            return atcInformation;
        }

        /**
         * Sets the value of the atcInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtcInformation(String value) {
            this.atcInformation = value;
        }

        /**
         * Gets the value of the electronicCommerceInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElectronicCommerceInd() {
            return electronicCommerceInd;
        }

        /**
         * Sets the value of the electronicCommerceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElectronicCommerceInd(String value) {
            this.electronicCommerceInd = value;
        }

        /**
         * Gets the value of the tranIntegrityClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranIntegrityClass() {
            return tranIntegrityClass;
        }

        /**
         * Sets the value of the tranIntegrityClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranIntegrityClass(String value) {
            this.tranIntegrityClass = value;
        }

        /**
         * Gets the value of the traceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTraceId() {
            return traceId;
        }

        /**
         * Sets the value of the traceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTraceId(String value) {
            this.traceId = value;
        }

        /**
         * Gets the value of the resubmissionmCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResubmissionmCode() {
            return resubmissionmCode;
        }

        /**
         * Sets the value of the resubmissionmCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResubmissionmCode(String value) {
            this.resubmissionmCode = value;
        }

        /**
         * Gets the value of the transitProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransitProgram() {
            return transitProgram;
        }

        /**
         * Sets the value of the transitProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransitProgram(String value) {
            this.transitProgram = value;
        }

        /**
         * Gets the value of the terminalCompliantIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminalCompliantIndicator() {
            return terminalCompliantIndicator;
        }

        /**
         * Sets the value of the terminalCompliantIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminalCompliantIndicator(String value) {
            this.terminalCompliantIndicator = value;
        }

        /**
         * Gets the value of the paymentTranTypeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTranTypeIndicator() {
            return paymentTranTypeIndicator;
        }

        /**
         * Sets the value of the paymentTranTypeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTranTypeIndicator(String value) {
            this.paymentTranTypeIndicator = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the feeRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeRule() {
            return feeRule;
        }

        /**
         * Sets the value of the feeRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeRule(String value) {
            this.feeRule = value;
        }

        /**
         * Gets the value of the utrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUtrn() {
            return utrn;
        }

        /**
         * Sets the value of the utrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUtrn(String value) {
            this.utrn = value;
        }

        /**
         * Gets the value of the mcMemberDefinedData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcMemberDefinedData() {
            return mcMemberDefinedData;
        }

        /**
         * Sets the value of the mcMemberDefinedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcMemberDefinedData(String value) {
            this.mcMemberDefinedData = value;
        }

        /**
         * Gets the value of the parcelarInstallmentData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParcelarInstallmentData() {
            return parcelarInstallmentData;
        }

        /**
         * Sets the value of the parcelarInstallmentData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParcelarInstallmentData(String value) {
            this.parcelarInstallmentData = value;
        }

        /**
         * Gets the value of the parcelarInstallmentResponseData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParcelarInstallmentResponseData() {
            return parcelarInstallmentResponseData;
        }

        /**
         * Sets the value of the parcelarInstallmentResponseData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParcelarInstallmentResponseData(String value) {
            this.parcelarInstallmentResponseData = value;
        }

        /**
         * Gets the value of the parcelarInstallmentResponseAddData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParcelarInstallmentResponseAddData() {
            return parcelarInstallmentResponseAddData;
        }

        /**
         * Sets the value of the parcelarInstallmentResponseAddData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParcelarInstallmentResponseAddData(String value) {
            this.parcelarInstallmentResponseAddData = value;
        }

        /**
         * Gets the value of the moneySendReferenceData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoneySendReferenceData() {
            return moneySendReferenceData;
        }

        /**
         * Sets the value of the moneySendReferenceData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoneySendReferenceData(String value) {
            this.moneySendReferenceData = value;
        }

        /**
         * Gets the value of the additionalNationalData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalNationalData() {
            return additionalNationalData;
        }

        /**
         * Sets the value of the additionalNationalData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalNationalData(String value) {
            this.additionalNationalData = value;
        }

        /**
         * Gets the value of the rmac property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRMAC() {
            return rmac;
        }

        /**
         * Sets the value of the rmac property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRMAC(Long value) {
            this.rmac = value;
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
         * Gets the value of the ipmPosEntryMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpmPosEntryMode() {
            return ipmPosEntryMode;
        }

        /**
         * Sets the value of the ipmPosEntryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpmPosEntryMode(String value) {
            this.ipmPosEntryMode = value;
        }

        /**
         * Gets the value of the ancillaryServiceCharges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAncillaryServiceCharges() {
            return ancillaryServiceCharges;
        }

        /**
         * Sets the value of the ancillaryServiceCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAncillaryServiceCharges(String value) {
            this.ancillaryServiceCharges = value;
        }

        /**
         * Gets the value of the recordData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordData() {
            return recordData;
        }

        /**
         * Sets the value of the recordData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordData(String value) {
            this.recordData = value;
        }

        /**
         * Gets the value of the lowRiskIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLowRiskIndicator() {
            return lowRiskIndicator;
        }

        /**
         * Sets the value of the lowRiskIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLowRiskIndicator(String value) {
            this.lowRiskIndicator = value;
        }

        /**
         * Gets the value of the merchantAdviceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantAdviceCode() {
            return merchantAdviceCode;
        }

        /**
         * Sets the value of the merchantAdviceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantAdviceCode(String value) {
            this.merchantAdviceCode = value;
        }

        /**
         * Gets the value of the cardValidationCodeResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardValidationCodeResult() {
            return cardValidationCodeResult;
        }

        /**
         * Sets the value of the cardValidationCodeResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardValidationCodeResult(String value) {
            this.cardValidationCodeResult = value;
        }

        /**
         * Gets the value of the sanctionScreeningScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSanctionScreeningScore() {
            return sanctionScreeningScore;
        }

        /**
         * Sets the value of the sanctionScreeningScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSanctionScreeningScore(String value) {
            this.sanctionScreeningScore = value;
        }

        /**
         * Gets the value of the estimatedAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedAmount() {
            return estimatedAmount;
        }

        /**
         * Sets the value of the estimatedAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedAmount(BigDecimal value) {
            this.estimatedAmount = value;
        }

        /**
         * Gets the value of the remoteCommerceAcceptorId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteCommerceAcceptorId() {
            return remoteCommerceAcceptorId;
        }

        /**
         * Sets the value of the remoteCommerceAcceptorId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteCommerceAcceptorId(String value) {
            this.remoteCommerceAcceptorId = value;
        }

        /**
         * Gets the value of the acquirerBin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcquirerBin() {
            return acquirerBin;
        }

        /**
         * Sets the value of the acquirerBin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcquirerBin(String value) {
            this.acquirerBin = value;
        }

        /**
         * Gets the value of the merchantOriginCountryId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMerchantOriginCountryId() {
            return merchantOriginCountryId;
        }

        /**
         * Sets the value of the merchantOriginCountryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMerchantOriginCountryId(Long value) {
            this.merchantOriginCountryId = value;
        }

        /**
         * Gets the value of the securityServicesAddDataForIssuers property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityServicesAddDataForIssuers() {
            return securityServicesAddDataForIssuers;
        }

        /**
         * Sets the value of the securityServicesAddDataForIssuers property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityServicesAddDataForIssuers(String value) {
            this.securityServicesAddDataForIssuers = value;
        }

        /**
         * Gets the value of the fraudScoringData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudScoringData() {
            return fraudScoringData;
        }

        /**
         * Sets the value of the fraudScoringData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudScoringData(String value) {
            this.fraudScoringData = value;
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
         *       &lt;attribute name="ServiceId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Result1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Result2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OnBehalf {

            @XmlAttribute(name = "ServiceId", required = true)
            protected String serviceId;
            @XmlAttribute(name = "Result1")
            protected String result1;
            @XmlAttribute(name = "Result2")
            protected String result2;

            /**
             * Gets the value of the serviceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceId() {
                return serviceId;
            }

            /**
             * Sets the value of the serviceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceId(String value) {
                this.serviceId = value;
            }

            /**
             * Gets the value of the result1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult1() {
                return result1;
            }

            /**
             * Sets the value of the result1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult1(String value) {
                this.result1 = value;
            }

            /**
             * Gets the value of the result2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult2() {
                return result2;
            }

            /**
             * Sets the value of the result2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult2(String value) {
                this.result2 = value;
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
     *       &lt;attribute name="RecordType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ProcessingCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ServiceFeeReceivable" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="ServiceFeePayable" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="InterchangeServiceFee" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="AdditionalTransactionFee" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mpu {

        @XmlAttribute(name = "RecordType")
        protected Long recordType;
        @XmlAttribute(name = "ProcessingCode")
        protected String processingCode;
        @XmlAttribute(name = "ServiceFeeReceivable")
        protected BigDecimal serviceFeeReceivable;
        @XmlAttribute(name = "ServiceFeePayable")
        protected BigDecimal serviceFeePayable;
        @XmlAttribute(name = "InterchangeServiceFee")
        protected BigDecimal interchangeServiceFee;
        @XmlAttribute(name = "AdditionalTransactionFee")
        protected BigDecimal additionalTransactionFee;

        /**
         * Gets the value of the recordType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRecordType() {
            return recordType;
        }

        /**
         * Sets the value of the recordType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRecordType(Long value) {
            this.recordType = value;
        }

        /**
         * Gets the value of the processingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessingCode() {
            return processingCode;
        }

        /**
         * Sets the value of the processingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessingCode(String value) {
            this.processingCode = value;
        }

        /**
         * Gets the value of the serviceFeeReceivable property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getServiceFeeReceivable() {
            return serviceFeeReceivable;
        }

        /**
         * Sets the value of the serviceFeeReceivable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setServiceFeeReceivable(BigDecimal value) {
            this.serviceFeeReceivable = value;
        }

        /**
         * Gets the value of the serviceFeePayable property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getServiceFeePayable() {
            return serviceFeePayable;
        }

        /**
         * Sets the value of the serviceFeePayable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setServiceFeePayable(BigDecimal value) {
            this.serviceFeePayable = value;
        }

        /**
         * Gets the value of the interchangeServiceFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInterchangeServiceFee() {
            return interchangeServiceFee;
        }

        /**
         * Sets the value of the interchangeServiceFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInterchangeServiceFee(BigDecimal value) {
            this.interchangeServiceFee = value;
        }

        /**
         * Gets the value of the additionalTransactionFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAdditionalTransactionFee() {
            return additionalTransactionFee;
        }

        /**
         * Sets the value of the additionalTransactionFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAdditionalTransactionFee(BigDecimal value) {
            this.additionalTransactionFee = value;
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
     *       &lt;attribute name="TransactionFee" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="NbcFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcquirerFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IssuerFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BeneficiaryFee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NbcDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcqDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IssDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BnbDisputeRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NbcCss {

        @XmlAttribute(name = "TransactionFee")
        protected Long transactionFee;
        @XmlAttribute(name = "NbcFee")
        protected String nbcFee;
        @XmlAttribute(name = "AcquirerFee")
        protected String acquirerFee;
        @XmlAttribute(name = "IssuerFee")
        protected String issuerFee;
        @XmlAttribute(name = "BeneficiaryFee")
        protected String beneficiaryFee;
        @XmlAttribute(name = "NbcDisputeRespCode")
        protected String nbcDisputeRespCode;
        @XmlAttribute(name = "AcqDisputeRespCode")
        protected String acqDisputeRespCode;
        @XmlAttribute(name = "IssDisputeRespCode")
        protected String issDisputeRespCode;
        @XmlAttribute(name = "BnbDisputeRespCode")
        protected String bnbDisputeRespCode;

        /**
         * Gets the value of the transactionFee property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTransactionFee() {
            return transactionFee;
        }

        /**
         * Sets the value of the transactionFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTransactionFee(Long value) {
            this.transactionFee = value;
        }

        /**
         * Gets the value of the nbcFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNbcFee() {
            return nbcFee;
        }

        /**
         * Sets the value of the nbcFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNbcFee(String value) {
            this.nbcFee = value;
        }

        /**
         * Gets the value of the acquirerFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcquirerFee() {
            return acquirerFee;
        }

        /**
         * Sets the value of the acquirerFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcquirerFee(String value) {
            this.acquirerFee = value;
        }

        /**
         * Gets the value of the issuerFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuerFee() {
            return issuerFee;
        }

        /**
         * Sets the value of the issuerFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerFee(String value) {
            this.issuerFee = value;
        }

        /**
         * Gets the value of the beneficiaryFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeneficiaryFee() {
            return beneficiaryFee;
        }

        /**
         * Sets the value of the beneficiaryFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeneficiaryFee(String value) {
            this.beneficiaryFee = value;
        }

        /**
         * Gets the value of the nbcDisputeRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNbcDisputeRespCode() {
            return nbcDisputeRespCode;
        }

        /**
         * Sets the value of the nbcDisputeRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNbcDisputeRespCode(String value) {
            this.nbcDisputeRespCode = value;
        }

        /**
         * Gets the value of the acqDisputeRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcqDisputeRespCode() {
            return acqDisputeRespCode;
        }

        /**
         * Sets the value of the acqDisputeRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcqDisputeRespCode(String value) {
            this.acqDisputeRespCode = value;
        }

        /**
         * Gets the value of the issDisputeRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssDisputeRespCode() {
            return issDisputeRespCode;
        }

        /**
         * Sets the value of the issDisputeRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssDisputeRespCode(String value) {
            this.issDisputeRespCode = value;
        }

        /**
         * Gets the value of the bnbDisputeRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBnbDisputeRespCode() {
            return bnbDisputeRespCode;
        }

        /**
         * Sets the value of the bnbDisputeRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBnbDisputeRespCode(String value) {
            this.bnbDisputeRespCode = value;
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
     *       &lt;attribute name="Trn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PreauthorizationTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FundingTransactionTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AssignedMerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetworkIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardProductId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosEntryMode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MultipurposePaymentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SpecialProgramId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ActualEci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="InitialRrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ReversalTrn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OrigSettleCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OrigSettleAmt" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="OrigSettleConvRate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="LocalSettleConvRateTypeInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AdditionalData4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="TokenizationDecision" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TokenizationDecisionInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TokenEventRequestor" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MessageType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RespCodeSrcInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AdditionalData2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="AdditionalData3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="OnBehalfServices" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CdCvmIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="HashPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Nspk {

        @XmlAttribute(name = "Trn")
        protected Long trn;
        @XmlAttribute(name = "PreauthorizationTrn")
        protected Long preauthorizationTrn;
        @XmlAttribute(name = "FundingTransactionTrn")
        protected Long fundingTransactionTrn;
        @XmlAttribute(name = "AssignedMerchantId")
        protected String assignedMerchantId;
        @XmlAttribute(name = "NetworkIdentifier")
        protected String networkIdentifier;
        @XmlAttribute(name = "CardProductId")
        protected String cardProductId;
        @XmlAttribute(name = "PosEntryMode")
        protected String posEntryMode;
        @XmlAttribute(name = "PosData")
        protected String posData;
        @XmlAttribute(name = "MultipurposePaymentId")
        protected String multipurposePaymentId;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "SpecialProgramId")
        protected String specialProgramId;
        @XmlAttribute(name = "ActualEci")
        protected String actualEci;
        @XmlAttribute(name = "InitialRrn")
        protected String initialRrn;
        @XmlAttribute(name = "ReversalTrn")
        protected Long reversalTrn;
        @XmlAttribute(name = "OrigSettleCcy")
        protected Long origSettleCcy;
        @XmlAttribute(name = "OrigSettleAmt")
        protected Long origSettleAmt;
        @XmlAttribute(name = "OrigSettleConvRate")
        protected Long origSettleConvRate;
        @XmlAttribute(name = "LocalSettleConvRateTypeInd")
        protected String localSettleConvRateTypeInd;
        @XmlAttribute(name = "AdditionalData4")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] additionalData4;
        @XmlAttribute(name = "TokenizationDecision")
        protected String tokenizationDecision;
        @XmlAttribute(name = "TokenizationDecisionInd")
        protected String tokenizationDecisionInd;
        @XmlAttribute(name = "TokenEventRequestor")
        protected String tokenEventRequestor;
        @XmlAttribute(name = "MessageType")
        protected Long messageType;
        @XmlAttribute(name = "RespCodeSrcInd")
        protected String respCodeSrcInd;
        @XmlAttribute(name = "AdditionalData2")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] additionalData2;
        @XmlAttribute(name = "AdditionalData3")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] additionalData3;
        @XmlAttribute(name = "OnBehalfServices")
        protected String onBehalfServices;
        @XmlAttribute(name = "CdCvmIndicator")
        protected String cdCvmIndicator;
        @XmlAttribute(name = "HashPan")
        protected String hashPan;

        /**
         * Gets the value of the trn property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTrn() {
            return trn;
        }

        /**
         * Sets the value of the trn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTrn(Long value) {
            this.trn = value;
        }

        /**
         * Gets the value of the preauthorizationTrn property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPreauthorizationTrn() {
            return preauthorizationTrn;
        }

        /**
         * Sets the value of the preauthorizationTrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPreauthorizationTrn(Long value) {
            this.preauthorizationTrn = value;
        }

        /**
         * Gets the value of the fundingTransactionTrn property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFundingTransactionTrn() {
            return fundingTransactionTrn;
        }

        /**
         * Sets the value of the fundingTransactionTrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFundingTransactionTrn(Long value) {
            this.fundingTransactionTrn = value;
        }

        /**
         * Gets the value of the assignedMerchantId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignedMerchantId() {
            return assignedMerchantId;
        }

        /**
         * Sets the value of the assignedMerchantId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignedMerchantId(String value) {
            this.assignedMerchantId = value;
        }

        /**
         * Gets the value of the networkIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkIdentifier() {
            return networkIdentifier;
        }

        /**
         * Sets the value of the networkIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkIdentifier(String value) {
            this.networkIdentifier = value;
        }

        /**
         * Gets the value of the cardProductId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardProductId() {
            return cardProductId;
        }

        /**
         * Sets the value of the cardProductId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardProductId(String value) {
            this.cardProductId = value;
        }

        /**
         * Gets the value of the posEntryMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosEntryMode() {
            return posEntryMode;
        }

        /**
         * Sets the value of the posEntryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosEntryMode(String value) {
            this.posEntryMode = value;
        }

        /**
         * Gets the value of the posData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosData() {
            return posData;
        }

        /**
         * Sets the value of the posData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosData(String value) {
            this.posData = value;
        }

        /**
         * Gets the value of the multipurposePaymentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultipurposePaymentId() {
            return multipurposePaymentId;
        }

        /**
         * Sets the value of the multipurposePaymentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultipurposePaymentId(String value) {
            this.multipurposePaymentId = value;
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
         * Gets the value of the specialProgramId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialProgramId() {
            return specialProgramId;
        }

        /**
         * Sets the value of the specialProgramId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialProgramId(String value) {
            this.specialProgramId = value;
        }

        /**
         * Gets the value of the actualEci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActualEci() {
            return actualEci;
        }

        /**
         * Sets the value of the actualEci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActualEci(String value) {
            this.actualEci = value;
        }

        /**
         * Gets the value of the initialRrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialRrn() {
            return initialRrn;
        }

        /**
         * Sets the value of the initialRrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialRrn(String value) {
            this.initialRrn = value;
        }

        /**
         * Gets the value of the reversalTrn property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getReversalTrn() {
            return reversalTrn;
        }

        /**
         * Sets the value of the reversalTrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setReversalTrn(Long value) {
            this.reversalTrn = value;
        }

        /**
         * Gets the value of the origSettleCcy property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigSettleCcy() {
            return origSettleCcy;
        }

        /**
         * Sets the value of the origSettleCcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigSettleCcy(Long value) {
            this.origSettleCcy = value;
        }

        /**
         * Gets the value of the origSettleAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigSettleAmt() {
            return origSettleAmt;
        }

        /**
         * Sets the value of the origSettleAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigSettleAmt(Long value) {
            this.origSettleAmt = value;
        }

        /**
         * Gets the value of the origSettleConvRate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigSettleConvRate() {
            return origSettleConvRate;
        }

        /**
         * Sets the value of the origSettleConvRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigSettleConvRate(Long value) {
            this.origSettleConvRate = value;
        }

        /**
         * Gets the value of the localSettleConvRateTypeInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalSettleConvRateTypeInd() {
            return localSettleConvRateTypeInd;
        }

        /**
         * Sets the value of the localSettleConvRateTypeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalSettleConvRateTypeInd(String value) {
            this.localSettleConvRateTypeInd = value;
        }

        /**
         * Gets the value of the additionalData4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getAdditionalData4() {
            return additionalData4;
        }

        /**
         * Sets the value of the additionalData4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalData4(byte[] value) {
            this.additionalData4 = value;
        }

        /**
         * Gets the value of the tokenizationDecision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTokenizationDecision() {
            return tokenizationDecision;
        }

        /**
         * Sets the value of the tokenizationDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTokenizationDecision(String value) {
            this.tokenizationDecision = value;
        }

        /**
         * Gets the value of the tokenizationDecisionInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTokenizationDecisionInd() {
            return tokenizationDecisionInd;
        }

        /**
         * Sets the value of the tokenizationDecisionInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTokenizationDecisionInd(String value) {
            this.tokenizationDecisionInd = value;
        }

        /**
         * Gets the value of the tokenEventRequestor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTokenEventRequestor() {
            return tokenEventRequestor;
        }

        /**
         * Sets the value of the tokenEventRequestor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTokenEventRequestor(String value) {
            this.tokenEventRequestor = value;
        }

        /**
         * Gets the value of the messageType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMessageType() {
            return messageType;
        }

        /**
         * Sets the value of the messageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMessageType(Long value) {
            this.messageType = value;
        }

        /**
         * Gets the value of the respCodeSrcInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRespCodeSrcInd() {
            return respCodeSrcInd;
        }

        /**
         * Sets the value of the respCodeSrcInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRespCodeSrcInd(String value) {
            this.respCodeSrcInd = value;
        }

        /**
         * Gets the value of the additionalData2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getAdditionalData2() {
            return additionalData2;
        }

        /**
         * Sets the value of the additionalData2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalData2(byte[] value) {
            this.additionalData2 = value;
        }

        /**
         * Gets the value of the additionalData3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getAdditionalData3() {
            return additionalData3;
        }

        /**
         * Sets the value of the additionalData3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalData3(byte[] value) {
            this.additionalData3 = value;
        }

        /**
         * Gets the value of the onBehalfServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnBehalfServices() {
            return onBehalfServices;
        }

        /**
         * Sets the value of the onBehalfServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnBehalfServices(String value) {
            this.onBehalfServices = value;
        }

        /**
         * Gets the value of the cdCvmIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdCvmIndicator() {
            return cdCvmIndicator;
        }

        /**
         * Sets the value of the cdCvmIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdCvmIndicator(String value) {
            this.cdCvmIndicator = value;
        }

        /**
         * Gets the value of the hashPan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHashPan() {
            return hashPan;
        }

        /**
         * Sets the value of the hashPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHashPan(String value) {
            this.hashPan = value;
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
     *       &lt;attribute name="EchoData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SwitchKey" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SourceNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SinkNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SourceNodeStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SinkNodeStan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TotalsGroup" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OriginalSwitchKey" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosStateCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PosCountyCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SponsorBank" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OriginatorSettleDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="StructuredData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OriginalSourceNode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Postilion {

        @XmlAttribute(name = "EchoData")
        protected String echoData;
        @XmlAttribute(name = "SwitchKey")
        protected String switchKey;
        @XmlAttribute(name = "SourceNode")
        protected String sourceNode;
        @XmlAttribute(name = "SinkNode")
        protected String sinkNode;
        @XmlAttribute(name = "SourceNodeStan")
        protected String sourceNodeStan;
        @XmlAttribute(name = "SinkNodeStan")
        protected String sinkNodeStan;
        @XmlAttribute(name = "TotalsGroup")
        protected String totalsGroup;
        @XmlAttribute(name = "OriginalSwitchKey")
        protected String originalSwitchKey;
        @XmlAttribute(name = "PosStateCode")
        protected Long posStateCode;
        @XmlAttribute(name = "PosCountyCode")
        protected Long posCountyCode;
        @XmlAttribute(name = "SponsorBank")
        protected String sponsorBank;
        @XmlAttribute(name = "OriginatorSettleDate")
        protected XMLGregorianCalendar originatorSettleDate;
        @XmlAttribute(name = "StructuredData")
        protected String structuredData;
        @XmlAttribute(name = "OriginalSourceNode")
        protected String originalSourceNode;

        /**
         * Gets the value of the echoData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEchoData() {
            return echoData;
        }

        /**
         * Sets the value of the echoData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEchoData(String value) {
            this.echoData = value;
        }

        /**
         * Gets the value of the switchKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSwitchKey() {
            return switchKey;
        }

        /**
         * Sets the value of the switchKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSwitchKey(String value) {
            this.switchKey = value;
        }

        /**
         * Gets the value of the sourceNode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceNode() {
            return sourceNode;
        }

        /**
         * Sets the value of the sourceNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceNode(String value) {
            this.sourceNode = value;
        }

        /**
         * Gets the value of the sinkNode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSinkNode() {
            return sinkNode;
        }

        /**
         * Sets the value of the sinkNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSinkNode(String value) {
            this.sinkNode = value;
        }

        /**
         * Gets the value of the sourceNodeStan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceNodeStan() {
            return sourceNodeStan;
        }

        /**
         * Sets the value of the sourceNodeStan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceNodeStan(String value) {
            this.sourceNodeStan = value;
        }

        /**
         * Gets the value of the sinkNodeStan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSinkNodeStan() {
            return sinkNodeStan;
        }

        /**
         * Sets the value of the sinkNodeStan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSinkNodeStan(String value) {
            this.sinkNodeStan = value;
        }

        /**
         * Gets the value of the totalsGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalsGroup() {
            return totalsGroup;
        }

        /**
         * Sets the value of the totalsGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalsGroup(String value) {
            this.totalsGroup = value;
        }

        /**
         * Gets the value of the originalSwitchKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalSwitchKey() {
            return originalSwitchKey;
        }

        /**
         * Sets the value of the originalSwitchKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalSwitchKey(String value) {
            this.originalSwitchKey = value;
        }

        /**
         * Gets the value of the posStateCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPosStateCode() {
            return posStateCode;
        }

        /**
         * Sets the value of the posStateCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPosStateCode(Long value) {
            this.posStateCode = value;
        }

        /**
         * Gets the value of the posCountyCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPosCountyCode() {
            return posCountyCode;
        }

        /**
         * Sets the value of the posCountyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPosCountyCode(Long value) {
            this.posCountyCode = value;
        }

        /**
         * Gets the value of the sponsorBank property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSponsorBank() {
            return sponsorBank;
        }

        /**
         * Sets the value of the sponsorBank property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSponsorBank(String value) {
            this.sponsorBank = value;
        }

        /**
         * Gets the value of the originatorSettleDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginatorSettleDate() {
            return originatorSettleDate;
        }

        /**
         * Sets the value of the originatorSettleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginatorSettleDate(XMLGregorianCalendar value) {
            this.originatorSettleDate = value;
        }

        /**
         * Gets the value of the structuredData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStructuredData() {
            return structuredData;
        }

        /**
         * Sets the value of the structuredData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStructuredData(String value) {
            this.structuredData = value;
        }

        /**
         * Gets the value of the originalSourceNode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalSourceNode() {
            return originalSourceNode;
        }

        /**
         * Sets the value of the originalSourceNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalSourceNode(String value) {
            this.originalSourceNode = value;
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
     *       &lt;attribute name="AdditionalData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SberRf {

        @XmlAttribute(name = "AdditionalData")
        protected String additionalData;

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
     *       &lt;attribute name="TermType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="GenericText" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="GenericText2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ConfirmationCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TecBan {

        @XmlAttribute(name = "TermType")
        protected Long termType;
        @XmlAttribute(name = "GenericText")
        protected String genericText;
        @XmlAttribute(name = "GenericText2")
        protected String genericText2;
        @XmlAttribute(name = "ConfirmationCode")
        protected String confirmationCode;

        /**
         * Gets the value of the termType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTermType() {
            return termType;
        }

        /**
         * Sets the value of the termType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTermType(Long value) {
            this.termType = value;
        }

        /**
         * Gets the value of the genericText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenericText() {
            return genericText;
        }

        /**
         * Sets the value of the genericText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenericText(String value) {
            this.genericText = value;
        }

        /**
         * Gets the value of the genericText2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenericText2() {
            return genericText2;
        }

        /**
         * Sets the value of the genericText2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenericText2(String value) {
            this.genericText2 = value;
        }

        /**
         * Gets the value of the confirmationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmationCode() {
            return confirmationCode;
        }

        /**
         * Sets the value of the confirmationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmationCode(String value) {
            this.confirmationCode = value;
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
     *       &lt;attribute name="ExtTranCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ExtTermClass" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ExtRespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DetailedRespCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tic {

        @XmlAttribute(name = "ExtTranCode")
        protected Long extTranCode;
        @XmlAttribute(name = "ExtTermClass")
        protected Long extTermClass;
        @XmlAttribute(name = "ExtRespCode")
        protected String extRespCode;
        @XmlAttribute(name = "DetailedRespCode")
        protected Long detailedRespCode;

        /**
         * Gets the value of the extTranCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getExtTranCode() {
            return extTranCode;
        }

        /**
         * Sets the value of the extTranCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setExtTranCode(Long value) {
            this.extTranCode = value;
        }

        /**
         * Gets the value of the extTermClass property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getExtTermClass() {
            return extTermClass;
        }

        /**
         * Sets the value of the extTermClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setExtTermClass(Long value) {
            this.extTermClass = value;
        }

        /**
         * Gets the value of the extRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtRespCode() {
            return extRespCode;
        }

        /**
         * Sets the value of the extRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtRespCode(String value) {
            this.extRespCode = value;
        }

        /**
         * Gets the value of the detailedRespCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDetailedRespCode() {
            return detailedRespCode;
        }

        /**
         * Sets the value of the detailedRespCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDetailedRespCode(Long value) {
            this.detailedRespCode = value;
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
     *         &lt;element name="IssuerRefereneceData"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AcquirerRqAddData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="IsLegacyFormat" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PrevalidationResults" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosDataCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardAcceptorLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PaymentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "issuerRefereneceData",
        "acquirerRqAddData"
    })
    public static class Tieto {

        @XmlElement(name = "IssuerRefereneceData", required = true)
        protected NetworkSpecific.Tieto.IssuerRefereneceData issuerRefereneceData;
        @XmlElement(name = "AcquirerRqAddData")
        protected NetworkSpecific.Tieto.AcquirerRqAddData acquirerRqAddData;
        @XmlAttribute(name = "PrevalidationResults")
        protected String prevalidationResults;
        @XmlAttribute(name = "PosDataCode")
        protected String posDataCode;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "CardAcceptorLocation")
        protected String cardAcceptorLocation;
        @XmlAttribute(name = "PaymentId")
        protected String paymentId;

        /**
         * Gets the value of the issuerRefereneceData property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.Tieto.IssuerRefereneceData }
         *     
         */
        public NetworkSpecific.Tieto.IssuerRefereneceData getIssuerRefereneceData() {
            return issuerRefereneceData;
        }

        /**
         * Sets the value of the issuerRefereneceData property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.Tieto.IssuerRefereneceData }
         *     
         */
        public void setIssuerRefereneceData(NetworkSpecific.Tieto.IssuerRefereneceData value) {
            this.issuerRefereneceData = value;
        }

        /**
         * Gets the value of the acquirerRqAddData property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.Tieto.AcquirerRqAddData }
         *     
         */
        public NetworkSpecific.Tieto.AcquirerRqAddData getAcquirerRqAddData() {
            return acquirerRqAddData;
        }

        /**
         * Sets the value of the acquirerRqAddData property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.Tieto.AcquirerRqAddData }
         *     
         */
        public void setAcquirerRqAddData(NetworkSpecific.Tieto.AcquirerRqAddData value) {
            this.acquirerRqAddData = value;
        }

        /**
         * Gets the value of the prevalidationResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrevalidationResults() {
            return prevalidationResults;
        }

        /**
         * Sets the value of the prevalidationResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrevalidationResults(String value) {
            this.prevalidationResults = value;
        }

        /**
         * Gets the value of the posDataCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosDataCode() {
            return posDataCode;
        }

        /**
         * Sets the value of the posDataCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosDataCode(String value) {
            this.posDataCode = value;
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
         * Gets the value of the cardAcceptorLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardAcceptorLocation() {
            return cardAcceptorLocation;
        }

        /**
         * Sets the value of the cardAcceptorLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardAcceptorLocation(String value) {
            this.cardAcceptorLocation = value;
        }

        /**
         * Gets the value of the paymentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentId() {
            return paymentId;
        }

        /**
         * Sets the value of the paymentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentId(String value) {
            this.paymentId = value;
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
         *         &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="IsLegacyFormat" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class AcquirerRqAddData {

            @XmlElement(name = "Tag")
            protected List<NetworkSpecific.Tieto.AcquirerRqAddData.Tag> tag;
            @XmlAttribute(name = "IsLegacyFormat")
            protected Boolean isLegacyFormat;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NetworkSpecific.Tieto.AcquirerRqAddData.Tag }
             * 
             * 
             */
            public List<NetworkSpecific.Tieto.AcquirerRqAddData.Tag> getTag() {
                if (tag == null) {
                    tag = new ArrayList<NetworkSpecific.Tieto.AcquirerRqAddData.Tag>();
                }
                return this.tag;
            }

            /**
             * Gets the value of the isLegacyFormat property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLegacyFormat() {
                return isLegacyFormat;
            }

            /**
             * Sets the value of the isLegacyFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLegacyFormat(Boolean value) {
                this.isLegacyFormat = value;
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
             *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Tag {

                @XmlAttribute(name = "Id", required = true)
                protected String id;
                @XmlAttribute(name = "Val")
                protected String val;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
         *         &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            "tag"
        })
        public static class IssuerRefereneceData {

            @XmlElement(name = "Tag")
            protected List<NetworkSpecific.Tieto.IssuerRefereneceData.Tag> tag;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NetworkSpecific.Tieto.IssuerRefereneceData.Tag }
             * 
             * 
             */
            public List<NetworkSpecific.Tieto.IssuerRefereneceData.Tag> getTag() {
                if (tag == null) {
                    tag = new ArrayList<NetworkSpecific.Tieto.IssuerRefereneceData.Tag>();
                }
                return this.tag;
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
             *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Tag {

                @XmlAttribute(name = "Id", required = true)
                protected String id;
                @XmlAttribute(name = "Val")
                protected String val;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
     *       &lt;attribute name="CustomerInformation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TpII {

        @XmlAttribute(name = "CustomerInformation")
        protected String customerInformation;

        /**
         * Gets the value of the customerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerInformation() {
            return customerInformation;
        }

        /**
         * Sets the value of the customerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerInformation(String value) {
            this.customerInformation = value;
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
     *       &lt;attribute name="WalletAccount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NetId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ResponseSourceReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AddressVerificationResultCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="F44_3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardProductType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExtendedStipReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CvvIcvvResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PacmDeversionLevelCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PacmDiversionReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardAuthResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="F44_9" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Cvv2ResultCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OriginalResponseCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CheckSettlementCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CavvResultsCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ResponseReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PrimaryAccountNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OriginalCreditTransaction" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AuthIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ValidationCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MarketDataId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Duration" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PrestigiousIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PurchaseIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AutoRentalAndLodgingDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NoShowIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExtraCharges" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ClearingSeqNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ClearingSeqCount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RestrictedTicketIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TotalAmountAuthorized" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RequestedPaymentService" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChargebackRightsIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MasterCardInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MerchantVerification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OnlineRiskAssessmentRiskScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="OnlineRiskAssessmentConditionCodes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardLevelResults" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ProgramIdentifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SpendIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChargebackFlags" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FeeProgramIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BusinessApplicationId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TokenAssuranceLevel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="eCommerceProgramIndicator" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="MessageReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PosEnvironment" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CumulativeAmount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SettlementFlag" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ReimbursementAttribute" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcceptanceTermIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ServiceDevelopmentField" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AgentUniqueId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="StipReason" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="F48FieldId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AamVelocityCheckingResult" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CardholderDeviceCvm" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="TokenVerificationResult" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TransactionCodeQualifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ElapsedTimeToLive" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CumulativeTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CumulativeTranAmount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RoutingTableUniqueId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="DomesticAndLocalizedData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="AdditionalTraceData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AuxiliaryTransactionData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="VerificationData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="SupportingInformation" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="FileRecord" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *       &lt;attribute name="OrigTokenAssuranceLevel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="InitiatingPartyIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CavvDataPresence" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="SenderReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AtmBusinessQualifier" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Visa {

        @XmlAttribute(name = "WalletAccount")
        protected String walletAccount;
        @XmlAttribute(name = "NetId")
        protected Long netId;
        @XmlAttribute(name = "ResponseSourceReasonCode")
        protected String responseSourceReasonCode;
        @XmlAttribute(name = "AddressVerificationResultCode")
        protected String addressVerificationResultCode;
        @XmlAttribute(name = "F44_3")
        protected String f443;
        @XmlAttribute(name = "CardProductType")
        protected String cardProductType;
        @XmlAttribute(name = "ExtendedStipReasonCode")
        protected String extendedStipReasonCode;
        @XmlAttribute(name = "CvvIcvvResultsCode")
        protected String cvvIcvvResultsCode;
        @XmlAttribute(name = "PacmDeversionLevelCode")
        protected String pacmDeversionLevelCode;
        @XmlAttribute(name = "PacmDiversionReasonCode")
        protected String pacmDiversionReasonCode;
        @XmlAttribute(name = "CardAuthResultsCode")
        protected String cardAuthResultsCode;
        @XmlAttribute(name = "F44_9")
        protected String f449;
        @XmlAttribute(name = "Cvv2ResultCode")
        protected String cvv2ResultCode;
        @XmlAttribute(name = "OriginalResponseCode")
        protected String originalResponseCode;
        @XmlAttribute(name = "CheckSettlementCode")
        protected String checkSettlementCode;
        @XmlAttribute(name = "CavvResultsCode")
        protected String cavvResultsCode;
        @XmlAttribute(name = "ResponseReasonCode")
        protected String responseReasonCode;
        @XmlAttribute(name = "PrimaryAccountNumber")
        protected String primaryAccountNumber;
        @XmlAttribute(name = "OriginalCreditTransaction")
        protected String originalCreditTransaction;
        @XmlAttribute(name = "PosInfo")
        protected String posInfo;
        @XmlAttribute(name = "AuthIndicator")
        protected String authIndicator;
        @XmlAttribute(name = "TranId")
        protected String tranId;
        @XmlAttribute(name = "ValidationCode")
        protected String validationCode;
        @XmlAttribute(name = "MarketDataId")
        protected String marketDataId;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "PrestigiousIndicator")
        protected String prestigiousIndicator;
        @XmlAttribute(name = "PurchaseIdentifier")
        protected String purchaseIdentifier;
        @XmlAttribute(name = "AutoRentalAndLodgingDate")
        protected String autoRentalAndLodgingDate;
        @XmlAttribute(name = "NoShowIndicator")
        protected String noShowIndicator;
        @XmlAttribute(name = "ExtraCharges")
        protected String extraCharges;
        @XmlAttribute(name = "ClearingSeqNumber")
        protected String clearingSeqNumber;
        @XmlAttribute(name = "ClearingSeqCount")
        protected String clearingSeqCount;
        @XmlAttribute(name = "RestrictedTicketIndicator")
        protected String restrictedTicketIndicator;
        @XmlAttribute(name = "TotalAmountAuthorized")
        protected String totalAmountAuthorized;
        @XmlAttribute(name = "RequestedPaymentService")
        protected String requestedPaymentService;
        @XmlAttribute(name = "ChargebackRightsIndicator")
        protected String chargebackRightsIndicator;
        @XmlAttribute(name = "MasterCardInfo")
        protected String masterCardInfo;
        @XmlAttribute(name = "MerchantVerification")
        protected String merchantVerification;
        @XmlAttribute(name = "OnlineRiskAssessmentRiskScore")
        protected String onlineRiskAssessmentRiskScore;
        @XmlAttribute(name = "OnlineRiskAssessmentConditionCodes")
        protected String onlineRiskAssessmentConditionCodes;
        @XmlAttribute(name = "CardLevelResults")
        protected String cardLevelResults;
        @XmlAttribute(name = "ProgramIdentifier")
        protected String programIdentifier;
        @XmlAttribute(name = "SpendIndicator")
        protected String spendIndicator;
        @XmlAttribute(name = "ChargebackFlags")
        protected String chargebackFlags;
        @XmlAttribute(name = "FeeProgramIndicator")
        protected String feeProgramIndicator;
        @XmlAttribute(name = "BusinessApplicationId")
        protected String businessApplicationId;
        @XmlAttribute(name = "TokenAssuranceLevel")
        protected String tokenAssuranceLevel;
        @XmlAttribute(name = "MerchantId")
        protected String merchantId;
        @XmlAttribute(name = "eCommerceProgramIndicator")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] eCommerceProgramIndicator;
        @XmlAttribute(name = "MessageReasonCode")
        protected String messageReasonCode;
        @XmlAttribute(name = "PosEnvironment")
        protected String posEnvironment;
        @XmlAttribute(name = "CumulativeAmount")
        protected String cumulativeAmount;
        @XmlAttribute(name = "SettlementFlag")
        protected Long settlementFlag;
        @XmlAttribute(name = "ReimbursementAttribute")
        protected String reimbursementAttribute;
        @XmlAttribute(name = "AcceptanceTermIndicator")
        protected String acceptanceTermIndicator;
        @XmlAttribute(name = "ServiceDevelopmentField")
        protected String serviceDevelopmentField;
        @XmlAttribute(name = "AgentUniqueId")
        protected String agentUniqueId;
        @XmlAttribute(name = "RespCode")
        protected String respCode;
        @XmlAttribute(name = "StipReason")
        protected Long stipReason;
        @XmlAttribute(name = "F48FieldId")
        protected String f48FieldId;
        @XmlAttribute(name = "AamVelocityCheckingResult")
        protected Long aamVelocityCheckingResult;
        @XmlAttribute(name = "CardholderDeviceCvm")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] cardholderDeviceCvm;
        @XmlAttribute(name = "TokenVerificationResult")
        protected Long tokenVerificationResult;
        @XmlAttribute(name = "TransactionCodeQualifier")
        protected String transactionCodeQualifier;
        @XmlAttribute(name = "ElapsedTimeToLive")
        protected Long elapsedTimeToLive;
        @XmlAttribute(name = "CumulativeTranCount")
        protected Long cumulativeTranCount;
        @XmlAttribute(name = "CumulativeTranAmount")
        protected Long cumulativeTranAmount;
        @XmlAttribute(name = "RoutingTableUniqueId")
        protected Long routingTableUniqueId;
        @XmlAttribute(name = "DomesticAndLocalizedData")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] domesticAndLocalizedData;
        @XmlAttribute(name = "AdditionalTraceData")
        protected String additionalTraceData;
        @XmlAttribute(name = "AuxiliaryTransactionData")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] auxiliaryTransactionData;
        @XmlAttribute(name = "VerificationData")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] verificationData;
        @XmlAttribute(name = "SupportingInformation")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] supportingInformation;
        @XmlAttribute(name = "FileRecord")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] fileRecord;
        @XmlAttribute(name = "OrigTokenAssuranceLevel")
        protected String origTokenAssuranceLevel;
        @XmlAttribute(name = "InitiatingPartyIndicator")
        protected String initiatingPartyIndicator;
        @XmlAttribute(name = "CavvDataPresence")
        protected Boolean cavvDataPresence;
        @XmlAttribute(name = "SenderReferenceNumber")
        protected String senderReferenceNumber;
        @XmlAttribute(name = "AtmBusinessQualifier")
        protected String atmBusinessQualifier;

        /**
         * Gets the value of the walletAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWalletAccount() {
            return walletAccount;
        }

        /**
         * Sets the value of the walletAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWalletAccount(String value) {
            this.walletAccount = value;
        }

        /**
         * Gets the value of the netId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNetId() {
            return netId;
        }

        /**
         * Sets the value of the netId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNetId(Long value) {
            this.netId = value;
        }

        /**
         * Gets the value of the responseSourceReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseSourceReasonCode() {
            return responseSourceReasonCode;
        }

        /**
         * Sets the value of the responseSourceReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseSourceReasonCode(String value) {
            this.responseSourceReasonCode = value;
        }

        /**
         * Gets the value of the addressVerificationResultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressVerificationResultCode() {
            return addressVerificationResultCode;
        }

        /**
         * Sets the value of the addressVerificationResultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressVerificationResultCode(String value) {
            this.addressVerificationResultCode = value;
        }

        /**
         * Gets the value of the f443 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getF443() {
            return f443;
        }

        /**
         * Sets the value of the f443 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setF443(String value) {
            this.f443 = value;
        }

        /**
         * Gets the value of the cardProductType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardProductType() {
            return cardProductType;
        }

        /**
         * Sets the value of the cardProductType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardProductType(String value) {
            this.cardProductType = value;
        }

        /**
         * Gets the value of the extendedStipReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedStipReasonCode() {
            return extendedStipReasonCode;
        }

        /**
         * Sets the value of the extendedStipReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedStipReasonCode(String value) {
            this.extendedStipReasonCode = value;
        }

        /**
         * Gets the value of the cvvIcvvResultsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvvIcvvResultsCode() {
            return cvvIcvvResultsCode;
        }

        /**
         * Sets the value of the cvvIcvvResultsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvvIcvvResultsCode(String value) {
            this.cvvIcvvResultsCode = value;
        }

        /**
         * Gets the value of the pacmDeversionLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacmDeversionLevelCode() {
            return pacmDeversionLevelCode;
        }

        /**
         * Sets the value of the pacmDeversionLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacmDeversionLevelCode(String value) {
            this.pacmDeversionLevelCode = value;
        }

        /**
         * Gets the value of the pacmDiversionReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacmDiversionReasonCode() {
            return pacmDiversionReasonCode;
        }

        /**
         * Sets the value of the pacmDiversionReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacmDiversionReasonCode(String value) {
            this.pacmDiversionReasonCode = value;
        }

        /**
         * Gets the value of the cardAuthResultsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardAuthResultsCode() {
            return cardAuthResultsCode;
        }

        /**
         * Sets the value of the cardAuthResultsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardAuthResultsCode(String value) {
            this.cardAuthResultsCode = value;
        }

        /**
         * Gets the value of the f449 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getF449() {
            return f449;
        }

        /**
         * Sets the value of the f449 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setF449(String value) {
            this.f449 = value;
        }

        /**
         * Gets the value of the cvv2ResultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvv2ResultCode() {
            return cvv2ResultCode;
        }

        /**
         * Sets the value of the cvv2ResultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvv2ResultCode(String value) {
            this.cvv2ResultCode = value;
        }

        /**
         * Gets the value of the originalResponseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalResponseCode() {
            return originalResponseCode;
        }

        /**
         * Sets the value of the originalResponseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalResponseCode(String value) {
            this.originalResponseCode = value;
        }

        /**
         * Gets the value of the checkSettlementCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckSettlementCode() {
            return checkSettlementCode;
        }

        /**
         * Sets the value of the checkSettlementCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckSettlementCode(String value) {
            this.checkSettlementCode = value;
        }

        /**
         * Gets the value of the cavvResultsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCavvResultsCode() {
            return cavvResultsCode;
        }

        /**
         * Sets the value of the cavvResultsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCavvResultsCode(String value) {
            this.cavvResultsCode = value;
        }

        /**
         * Gets the value of the responseReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseReasonCode() {
            return responseReasonCode;
        }

        /**
         * Sets the value of the responseReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseReasonCode(String value) {
            this.responseReasonCode = value;
        }

        /**
         * Gets the value of the primaryAccountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryAccountNumber() {
            return primaryAccountNumber;
        }

        /**
         * Sets the value of the primaryAccountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryAccountNumber(String value) {
            this.primaryAccountNumber = value;
        }

        /**
         * Gets the value of the originalCreditTransaction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalCreditTransaction() {
            return originalCreditTransaction;
        }

        /**
         * Sets the value of the originalCreditTransaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalCreditTransaction(String value) {
            this.originalCreditTransaction = value;
        }

        /**
         * Gets the value of the posInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosInfo() {
            return posInfo;
        }

        /**
         * Sets the value of the posInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosInfo(String value) {
            this.posInfo = value;
        }

        /**
         * Gets the value of the authIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthIndicator() {
            return authIndicator;
        }

        /**
         * Sets the value of the authIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthIndicator(String value) {
            this.authIndicator = value;
        }

        /**
         * Gets the value of the tranId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranId() {
            return tranId;
        }

        /**
         * Sets the value of the tranId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranId(String value) {
            this.tranId = value;
        }

        /**
         * Gets the value of the validationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidationCode() {
            return validationCode;
        }

        /**
         * Sets the value of the validationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidationCode(String value) {
            this.validationCode = value;
        }

        /**
         * Gets the value of the marketDataId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketDataId() {
            return marketDataId;
        }

        /**
         * Sets the value of the marketDataId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketDataId(String value) {
            this.marketDataId = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the prestigiousIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrestigiousIndicator() {
            return prestigiousIndicator;
        }

        /**
         * Sets the value of the prestigiousIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrestigiousIndicator(String value) {
            this.prestigiousIndicator = value;
        }

        /**
         * Gets the value of the purchaseIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseIdentifier() {
            return purchaseIdentifier;
        }

        /**
         * Sets the value of the purchaseIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseIdentifier(String value) {
            this.purchaseIdentifier = value;
        }

        /**
         * Gets the value of the autoRentalAndLodgingDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutoRentalAndLodgingDate() {
            return autoRentalAndLodgingDate;
        }

        /**
         * Sets the value of the autoRentalAndLodgingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutoRentalAndLodgingDate(String value) {
            this.autoRentalAndLodgingDate = value;
        }

        /**
         * Gets the value of the noShowIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoShowIndicator() {
            return noShowIndicator;
        }

        /**
         * Sets the value of the noShowIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoShowIndicator(String value) {
            this.noShowIndicator = value;
        }

        /**
         * Gets the value of the extraCharges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtraCharges() {
            return extraCharges;
        }

        /**
         * Sets the value of the extraCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtraCharges(String value) {
            this.extraCharges = value;
        }

        /**
         * Gets the value of the clearingSeqNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClearingSeqNumber() {
            return clearingSeqNumber;
        }

        /**
         * Sets the value of the clearingSeqNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClearingSeqNumber(String value) {
            this.clearingSeqNumber = value;
        }

        /**
         * Gets the value of the clearingSeqCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClearingSeqCount() {
            return clearingSeqCount;
        }

        /**
         * Sets the value of the clearingSeqCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClearingSeqCount(String value) {
            this.clearingSeqCount = value;
        }

        /**
         * Gets the value of the restrictedTicketIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestrictedTicketIndicator() {
            return restrictedTicketIndicator;
        }

        /**
         * Sets the value of the restrictedTicketIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestrictedTicketIndicator(String value) {
            this.restrictedTicketIndicator = value;
        }

        /**
         * Gets the value of the totalAmountAuthorized property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalAmountAuthorized() {
            return totalAmountAuthorized;
        }

        /**
         * Sets the value of the totalAmountAuthorized property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalAmountAuthorized(String value) {
            this.totalAmountAuthorized = value;
        }

        /**
         * Gets the value of the requestedPaymentService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedPaymentService() {
            return requestedPaymentService;
        }

        /**
         * Sets the value of the requestedPaymentService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedPaymentService(String value) {
            this.requestedPaymentService = value;
        }

        /**
         * Gets the value of the chargebackRightsIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargebackRightsIndicator() {
            return chargebackRightsIndicator;
        }

        /**
         * Sets the value of the chargebackRightsIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargebackRightsIndicator(String value) {
            this.chargebackRightsIndicator = value;
        }

        /**
         * Gets the value of the masterCardInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasterCardInfo() {
            return masterCardInfo;
        }

        /**
         * Sets the value of the masterCardInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterCardInfo(String value) {
            this.masterCardInfo = value;
        }

        /**
         * Gets the value of the merchantVerification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantVerification() {
            return merchantVerification;
        }

        /**
         * Sets the value of the merchantVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantVerification(String value) {
            this.merchantVerification = value;
        }

        /**
         * Gets the value of the onlineRiskAssessmentRiskScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnlineRiskAssessmentRiskScore() {
            return onlineRiskAssessmentRiskScore;
        }

        /**
         * Sets the value of the onlineRiskAssessmentRiskScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnlineRiskAssessmentRiskScore(String value) {
            this.onlineRiskAssessmentRiskScore = value;
        }

        /**
         * Gets the value of the onlineRiskAssessmentConditionCodes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnlineRiskAssessmentConditionCodes() {
            return onlineRiskAssessmentConditionCodes;
        }

        /**
         * Sets the value of the onlineRiskAssessmentConditionCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnlineRiskAssessmentConditionCodes(String value) {
            this.onlineRiskAssessmentConditionCodes = value;
        }

        /**
         * Gets the value of the cardLevelResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardLevelResults() {
            return cardLevelResults;
        }

        /**
         * Sets the value of the cardLevelResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardLevelResults(String value) {
            this.cardLevelResults = value;
        }

        /**
         * Gets the value of the programIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramIdentifier() {
            return programIdentifier;
        }

        /**
         * Sets the value of the programIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramIdentifier(String value) {
            this.programIdentifier = value;
        }

        /**
         * Gets the value of the spendIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpendIndicator() {
            return spendIndicator;
        }

        /**
         * Sets the value of the spendIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpendIndicator(String value) {
            this.spendIndicator = value;
        }

        /**
         * Gets the value of the chargebackFlags property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargebackFlags() {
            return chargebackFlags;
        }

        /**
         * Sets the value of the chargebackFlags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargebackFlags(String value) {
            this.chargebackFlags = value;
        }

        /**
         * Gets the value of the feeProgramIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeProgramIndicator() {
            return feeProgramIndicator;
        }

        /**
         * Sets the value of the feeProgramIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeProgramIndicator(String value) {
            this.feeProgramIndicator = value;
        }

        /**
         * Gets the value of the businessApplicationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessApplicationId() {
            return businessApplicationId;
        }

        /**
         * Sets the value of the businessApplicationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessApplicationId(String value) {
            this.businessApplicationId = value;
        }

        /**
         * Gets the value of the tokenAssuranceLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTokenAssuranceLevel() {
            return tokenAssuranceLevel;
        }

        /**
         * Sets the value of the tokenAssuranceLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTokenAssuranceLevel(String value) {
            this.tokenAssuranceLevel = value;
        }

        /**
         * Gets the value of the merchantId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantId() {
            return merchantId;
        }

        /**
         * Sets the value of the merchantId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantId(String value) {
            this.merchantId = value;
        }

        /**
         * Gets the value of the eCommerceProgramIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getECommerceProgramIndicator() {
            return eCommerceProgramIndicator;
        }

        /**
         * Sets the value of the eCommerceProgramIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setECommerceProgramIndicator(byte[] value) {
            this.eCommerceProgramIndicator = value;
        }

        /**
         * Gets the value of the messageReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageReasonCode() {
            return messageReasonCode;
        }

        /**
         * Sets the value of the messageReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageReasonCode(String value) {
            this.messageReasonCode = value;
        }

        /**
         * Gets the value of the posEnvironment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosEnvironment() {
            return posEnvironment;
        }

        /**
         * Sets the value of the posEnvironment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosEnvironment(String value) {
            this.posEnvironment = value;
        }

        /**
         * Gets the value of the cumulativeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCumulativeAmount() {
            return cumulativeAmount;
        }

        /**
         * Sets the value of the cumulativeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCumulativeAmount(String value) {
            this.cumulativeAmount = value;
        }

        /**
         * Gets the value of the settlementFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSettlementFlag() {
            return settlementFlag;
        }

        /**
         * Sets the value of the settlementFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSettlementFlag(Long value) {
            this.settlementFlag = value;
        }

        /**
         * Gets the value of the reimbursementAttribute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReimbursementAttribute() {
            return reimbursementAttribute;
        }

        /**
         * Sets the value of the reimbursementAttribute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReimbursementAttribute(String value) {
            this.reimbursementAttribute = value;
        }

        /**
         * Gets the value of the acceptanceTermIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcceptanceTermIndicator() {
            return acceptanceTermIndicator;
        }

        /**
         * Sets the value of the acceptanceTermIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcceptanceTermIndicator(String value) {
            this.acceptanceTermIndicator = value;
        }

        /**
         * Gets the value of the serviceDevelopmentField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceDevelopmentField() {
            return serviceDevelopmentField;
        }

        /**
         * Sets the value of the serviceDevelopmentField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceDevelopmentField(String value) {
            this.serviceDevelopmentField = value;
        }

        /**
         * Gets the value of the agentUniqueId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentUniqueId() {
            return agentUniqueId;
        }

        /**
         * Sets the value of the agentUniqueId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentUniqueId(String value) {
            this.agentUniqueId = value;
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
         * Gets the value of the stipReason property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getStipReason() {
            return stipReason;
        }

        /**
         * Sets the value of the stipReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setStipReason(Long value) {
            this.stipReason = value;
        }

        /**
         * Gets the value of the f48FieldId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getF48FieldId() {
            return f48FieldId;
        }

        /**
         * Sets the value of the f48FieldId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setF48FieldId(String value) {
            this.f48FieldId = value;
        }

        /**
         * Gets the value of the aamVelocityCheckingResult property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAamVelocityCheckingResult() {
            return aamVelocityCheckingResult;
        }

        /**
         * Sets the value of the aamVelocityCheckingResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAamVelocityCheckingResult(Long value) {
            this.aamVelocityCheckingResult = value;
        }

        /**
         * Gets the value of the cardholderDeviceCvm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getCardholderDeviceCvm() {
            return cardholderDeviceCvm;
        }

        /**
         * Sets the value of the cardholderDeviceCvm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardholderDeviceCvm(byte[] value) {
            this.cardholderDeviceCvm = value;
        }

        /**
         * Gets the value of the tokenVerificationResult property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTokenVerificationResult() {
            return tokenVerificationResult;
        }

        /**
         * Sets the value of the tokenVerificationResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTokenVerificationResult(Long value) {
            this.tokenVerificationResult = value;
        }

        /**
         * Gets the value of the transactionCodeQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionCodeQualifier() {
            return transactionCodeQualifier;
        }

        /**
         * Sets the value of the transactionCodeQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionCodeQualifier(String value) {
            this.transactionCodeQualifier = value;
        }

        /**
         * Gets the value of the elapsedTimeToLive property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getElapsedTimeToLive() {
            return elapsedTimeToLive;
        }

        /**
         * Sets the value of the elapsedTimeToLive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setElapsedTimeToLive(Long value) {
            this.elapsedTimeToLive = value;
        }

        /**
         * Gets the value of the cumulativeTranCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCumulativeTranCount() {
            return cumulativeTranCount;
        }

        /**
         * Sets the value of the cumulativeTranCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCumulativeTranCount(Long value) {
            this.cumulativeTranCount = value;
        }

        /**
         * Gets the value of the cumulativeTranAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCumulativeTranAmount() {
            return cumulativeTranAmount;
        }

        /**
         * Sets the value of the cumulativeTranAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCumulativeTranAmount(Long value) {
            this.cumulativeTranAmount = value;
        }

        /**
         * Gets the value of the routingTableUniqueId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRoutingTableUniqueId() {
            return routingTableUniqueId;
        }

        /**
         * Sets the value of the routingTableUniqueId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRoutingTableUniqueId(Long value) {
            this.routingTableUniqueId = value;
        }

        /**
         * Gets the value of the domesticAndLocalizedData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getDomesticAndLocalizedData() {
            return domesticAndLocalizedData;
        }

        /**
         * Sets the value of the domesticAndLocalizedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomesticAndLocalizedData(byte[] value) {
            this.domesticAndLocalizedData = value;
        }

        /**
         * Gets the value of the additionalTraceData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalTraceData() {
            return additionalTraceData;
        }

        /**
         * Sets the value of the additionalTraceData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalTraceData(String value) {
            this.additionalTraceData = value;
        }

        /**
         * Gets the value of the auxiliaryTransactionData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getAuxiliaryTransactionData() {
            return auxiliaryTransactionData;
        }

        /**
         * Sets the value of the auxiliaryTransactionData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuxiliaryTransactionData(byte[] value) {
            this.auxiliaryTransactionData = value;
        }

        /**
         * Gets the value of the verificationData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getVerificationData() {
            return verificationData;
        }

        /**
         * Sets the value of the verificationData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerificationData(byte[] value) {
            this.verificationData = value;
        }

        /**
         * Gets the value of the supportingInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getSupportingInformation() {
            return supportingInformation;
        }

        /**
         * Sets the value of the supportingInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupportingInformation(byte[] value) {
            this.supportingInformation = value;
        }

        /**
         * Gets the value of the fileRecord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getFileRecord() {
            return fileRecord;
        }

        /**
         * Sets the value of the fileRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileRecord(byte[] value) {
            this.fileRecord = value;
        }

        /**
         * Gets the value of the origTokenAssuranceLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigTokenAssuranceLevel() {
            return origTokenAssuranceLevel;
        }

        /**
         * Sets the value of the origTokenAssuranceLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigTokenAssuranceLevel(String value) {
            this.origTokenAssuranceLevel = value;
        }

        /**
         * Gets the value of the initiatingPartyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitiatingPartyIndicator() {
            return initiatingPartyIndicator;
        }

        /**
         * Sets the value of the initiatingPartyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitiatingPartyIndicator(String value) {
            this.initiatingPartyIndicator = value;
        }

        /**
         * Gets the value of the cavvDataPresence property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCavvDataPresence() {
            return cavvDataPresence;
        }

        /**
         * Sets the value of the cavvDataPresence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCavvDataPresence(Boolean value) {
            this.cavvDataPresence = value;
        }

        /**
         * Gets the value of the senderReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderReferenceNumber() {
            return senderReferenceNumber;
        }

        /**
         * Sets the value of the senderReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderReferenceNumber(String value) {
            this.senderReferenceNumber = value;
        }

        /**
         * Gets the value of the atmBusinessQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtmBusinessQualifier() {
            return atmBusinessQualifier;
        }

        /**
         * Sets the value of the atmBusinessQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtmBusinessQualifier(String value) {
            this.atmBusinessQualifier = value;
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
     *         &lt;element name="Fees"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Type" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Direction" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IpsEci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="McUcaf" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_47_912" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_47_925" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_47_938" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_47_951" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_47_958" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_48_868" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="W4_112_E9" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fees"
    })
    public static class Way4 {

        @XmlElement(name = "Fees", required = true)
        protected NetworkSpecific.Way4 .Fees fees;
        @XmlAttribute(name = "IpsEci")
        protected String ipsEci;
        @XmlAttribute(name = "McUcaf")
        protected String mcUcaf;
        @XmlAttribute(name = "W4_47_912")
        protected String w447912;
        @XmlAttribute(name = "W4_47_925")
        protected String w447925;
        @XmlAttribute(name = "W4_47_938")
        protected String w447938;
        @XmlAttribute(name = "W4_47_951")
        protected String w447951;
        @XmlAttribute(name = "W4_47_958")
        protected String w447958;
        @XmlAttribute(name = "W4_48_868")
        protected String w448868;
        @XmlAttribute(name = "W4_112_E9")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] w4112E9;

        /**
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link NetworkSpecific.Way4 .Fees }
         *     
         */
        public NetworkSpecific.Way4 .Fees getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkSpecific.Way4 .Fees }
         *     
         */
        public void setFees(NetworkSpecific.Way4 .Fees value) {
            this.fees = value;
        }

        /**
         * Gets the value of the ipsEci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpsEci() {
            return ipsEci;
        }

        /**
         * Sets the value of the ipsEci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpsEci(String value) {
            this.ipsEci = value;
        }

        /**
         * Gets the value of the mcUcaf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcUcaf() {
            return mcUcaf;
        }

        /**
         * Sets the value of the mcUcaf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcUcaf(String value) {
            this.mcUcaf = value;
        }

        /**
         * Gets the value of the w447912 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW447912() {
            return w447912;
        }

        /**
         * Sets the value of the w447912 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW447912(String value) {
            this.w447912 = value;
        }

        /**
         * Gets the value of the w447925 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW447925() {
            return w447925;
        }

        /**
         * Sets the value of the w447925 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW447925(String value) {
            this.w447925 = value;
        }

        /**
         * Gets the value of the w447938 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW447938() {
            return w447938;
        }

        /**
         * Sets the value of the w447938 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW447938(String value) {
            this.w447938 = value;
        }

        /**
         * Gets the value of the w447951 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW447951() {
            return w447951;
        }

        /**
         * Sets the value of the w447951 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW447951(String value) {
            this.w447951 = value;
        }

        /**
         * Gets the value of the w447958 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW447958() {
            return w447958;
        }

        /**
         * Sets the value of the w447958 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW447958(String value) {
            this.w447958 = value;
        }

        /**
         * Gets the value of the w448868 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getW448868() {
            return w448868;
        }

        /**
         * Sets the value of the w448868 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW448868(String value) {
            this.w448868 = value;
        }

        /**
         * Gets the value of the w4112E9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getW4112E9() {
            return w4112E9;
        }

        /**
         * Sets the value of the w4112E9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setW4112E9(byte[] value) {
            this.w4112E9 = value;
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
         *                 &lt;attribute name="Type" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Direction" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            "fee"
        })
        public static class Fees {

            @XmlElement(name = "Fee")
            protected List<NetworkSpecific.Way4 .Fees.Fee> fee;

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
             * {@link NetworkSpecific.Way4 .Fees.Fee }
             * 
             * 
             */
            public List<NetworkSpecific.Way4 .Fees.Fee> getFee() {
                if (fee == null) {
                    fee = new ArrayList<NetworkSpecific.Way4 .Fees.Fee>();
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
             *       &lt;attribute name="Type" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Direction" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            public static class Fee {

                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "Direction", required = true)
                protected String direction;
                @XmlAttribute(name = "Amt", required = true)
                protected BigDecimal amt;

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

                /**
                 * Gets the value of the direction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDirection() {
                    return direction;
                }

                /**
                 * Sets the value of the direction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDirection(String value) {
                    this.direction = value;
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

}
