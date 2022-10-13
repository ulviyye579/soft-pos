
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for Token complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Token"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Card"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Auth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CardPwdHashBlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                             &lt;element name="CardPwdHash2BlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                             &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Presence" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                           &lt;attribute name="PinBlock"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                                 &lt;length value="8"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="IPinBlock"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                                 &lt;length value="8"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Cvv2"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                                 &lt;length value="3"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Cvv2PresenceIndicator"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="CavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="CapOtp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CapSign" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="SignChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="PhotoChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="PinChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="TdsChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="CvvChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Cvv2Checked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="ArqcChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Challenge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CardPwdHashBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="CardPwdHash2Block"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="UsedHashAlgo" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
 *                           &lt;attribute name="ForgotPassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="CredentialCaptured" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="CredentialCapturedForResults" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Emv" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                             &lt;element name="Track1Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                             &lt;element name="Track2Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                             &lt;element name="EquivalentDataCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Mbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="DMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Ac"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="TermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="CvmResults"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Tvr"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="AppProfile" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TranDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="TranStatusInfo" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TranType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Amount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="CashBackAmount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssuerData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TermCountry" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TermSerialNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CryptInformData" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TermType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AppTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="DuplicatedAtc" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Random" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TermTranSeqCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="DynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IssuerScriptResults" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="FormFactorIndicator" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="DedicatedFileName" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="Aid" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="CardholderName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CardholderNameExt" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ApplicationPreferredName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ApplicationLabel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="EquivalentData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CardProductIdentificationInformation" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="AppCurrency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AppId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ApplicationUsageControl" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TermAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IssuerAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="AuthAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="CertAuthorityPublicKeyIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TranCertDataObjectList" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TranCertHashValue" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TranPinData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssuerUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AcquirerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="OtherAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="LastOnlineAtcReg" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="LowerConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="MerchantCategoryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="PinTryCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssuerScriptId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TermFloorLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TermId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Track1DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Track2DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TranTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="UpperConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="PosEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="RefCurrencyAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="TranRefCurrencyCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TranRefCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AdditionalTermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="MerchantNameLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="IssIdNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="IssPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IssAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IssPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="Track1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Track2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Track3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AppExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="AppEffectiveDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="TranCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IssCountryCodeAlpha2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="IssCountryCodeAlpha3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AppDiscretionaryData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="CardAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IssCodeTableIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Par" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="IccPinEnciphermentPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IccPinEnciphermentPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IccPinEnciphermentPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="AppCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IccPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IccPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="IccPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="SignedDynamicAppData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="IccDynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="KernelReaderCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ProtectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ProtectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ProtectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ProtectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ProtectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="UnprotectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="UnprotectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="UnprotectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="UnprotectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="UnprotectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="ResponseMessageTemplateFormat2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                           &lt;attribute name="LanguagePreference" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AppRefCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AppRefCcyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Tds" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Visa" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Xid" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Mc" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="StaticAav" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Version"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NetworkType" type="{http://schemas.tranzaxis.com/tran-common.xsd}NetworkTypeEnum" /&gt;
 *                           &lt;attribute name="Condition"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Eci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DSTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                   &lt;element name="Track1Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                   &lt;element name="Track2Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                   &lt;element name="GetFromExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}PartyFromExtCard" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Pan"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;minLength value="6"/&gt;
 *                       &lt;maxLength value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DigitizationRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DPan"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                       &lt;minLength value="13"/&gt;
 *                       &lt;maxLength value="19"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="DigitizedCardRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Track1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Track2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Track3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="EntryMode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RangeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AccountKind"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ProductKind"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RegExtCardForTokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="GetFromExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Login"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Auth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LoginName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Phone"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cert"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Auth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Static" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
 *                             &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CaName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviceApp"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Auth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Uri" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="UserGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AuthPeriodStart" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="InvalidAuthAttemptsCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                   &lt;element name="Platform" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="DeviceModel" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="OsName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="OsVersion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Locale" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="TimeZone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="AdvertisingId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="ScreenResolution" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="IpAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Latitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Longitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserJavaEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserJavaScriptEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserLanguage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserUserAgent" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserScreenColorDepth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserScreenHeight" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="BrowserScreenWidth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IssuingContractExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IssuingContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IssuingContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Secret"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Auth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Part" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtAuthApp"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AppURL" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AppLabel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsoAccountType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractLinkId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SecondAuthKind" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthKindEnum" /&gt;
 *       &lt;attribute name="CallbackChannelKind" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersoCommChannelKindEnum" /&gt;
 *       &lt;attribute name="CallbackPhone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CallbackEmail" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CallbackPushReceiverId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="UsedIpAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LifeCycleRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LastLoggedTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token", propOrder = {
    "card",
    "login",
    "phone",
    "cert",
    "deviceApp",
    "secret",
    "extAuthApp"
})
@XmlSeeAlso({
    TokenSpecific.class
})
public class Token {

    @XmlElement(name = "Card")
    protected Token.Card card;
    @XmlElement(name = "Login")
    protected Token.Login login;
    @XmlElement(name = "Phone")
    protected Token.Phone phone;
    @XmlElement(name = "Cert")
    protected Token.Cert cert;
    @XmlElement(name = "DeviceApp")
    protected Token.DeviceApp deviceApp;
    @XmlElement(name = "Secret")
    protected Token.Secret secret;
    @XmlElement(name = "ExtAuthApp")
    protected Token.ExtAuthApp extAuthApp;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ExtRid")
    protected String extRid;
    @XmlAttribute(name = "IsoAccountType")
    protected Long isoAccountType;
    @XmlAttribute(name = "ContractRid")
    protected String contractRid;
    @XmlAttribute(name = "ContractExtRid")
    protected String contractExtRid;
    @XmlAttribute(name = "ContractLinkId")
    protected Long contractLinkId;
    @XmlAttribute(name = "CountryId")
    protected Long countryId;
    @XmlAttribute(name = "SecondAuthKind")
    protected String secondAuthKind;
    @XmlAttribute(name = "CallbackChannelKind")
    protected String callbackChannelKind;
    @XmlAttribute(name = "CallbackPhone")
    protected String callbackPhone;
    @XmlAttribute(name = "CallbackEmail")
    protected String callbackEmail;
    @XmlAttribute(name = "CallbackPushReceiverId")
    protected String callbackPushReceiverId;
    @XmlAttribute(name = "UsedIpAddress")
    protected String usedIpAddress;
    @XmlAttribute(name = "LifeCycleRid")
    protected String lifeCycleRid;
    @XmlAttribute(name = "LastLoggedTime")
    protected XMLGregorianCalendar lastLoggedTime;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Token.Card }
     *     
     */
    public Token.Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.Card }
     *     
     */
    public void setCard(Token.Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Token.Login }
     *     
     */
    public Token.Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.Login }
     *     
     */
    public void setLogin(Token.Login value) {
        this.login = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Token.Phone }
     *     
     */
    public Token.Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.Phone }
     *     
     */
    public void setPhone(Token.Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link Token.Cert }
     *     
     */
    public Token.Cert getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.Cert }
     *     
     */
    public void setCert(Token.Cert value) {
        this.cert = value;
    }

    /**
     * Gets the value of the deviceApp property.
     * 
     * @return
     *     possible object is
     *     {@link Token.DeviceApp }
     *     
     */
    public Token.DeviceApp getDeviceApp() {
        return deviceApp;
    }

    /**
     * Sets the value of the deviceApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.DeviceApp }
     *     
     */
    public void setDeviceApp(Token.DeviceApp value) {
        this.deviceApp = value;
    }

    /**
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link Token.Secret }
     *     
     */
    public Token.Secret getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.Secret }
     *     
     */
    public void setSecret(Token.Secret value) {
        this.secret = value;
    }

    /**
     * Gets the value of the extAuthApp property.
     * 
     * @return
     *     possible object is
     *     {@link Token.ExtAuthApp }
     *     
     */
    public Token.ExtAuthApp getExtAuthApp() {
        return extAuthApp;
    }

    /**
     * Sets the value of the extAuthApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token.ExtAuthApp }
     *     
     */
    public void setExtAuthApp(Token.ExtAuthApp value) {
        this.extAuthApp = value;
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

    /**
     * Gets the value of the isoAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsoAccountType() {
        return isoAccountType;
    }

    /**
     * Sets the value of the isoAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsoAccountType(Long value) {
        this.isoAccountType = value;
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
     * Gets the value of the contractExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractExtRid() {
        return contractExtRid;
    }

    /**
     * Sets the value of the contractExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractExtRid(String value) {
        this.contractExtRid = value;
    }

    /**
     * Gets the value of the contractLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractLinkId() {
        return contractLinkId;
    }

    /**
     * Sets the value of the contractLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractLinkId(Long value) {
        this.contractLinkId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the secondAuthKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAuthKind() {
        return secondAuthKind;
    }

    /**
     * Sets the value of the secondAuthKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAuthKind(String value) {
        this.secondAuthKind = value;
    }

    /**
     * Gets the value of the callbackChannelKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackChannelKind() {
        return callbackChannelKind;
    }

    /**
     * Sets the value of the callbackChannelKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackChannelKind(String value) {
        this.callbackChannelKind = value;
    }

    /**
     * Gets the value of the callbackPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackPhone() {
        return callbackPhone;
    }

    /**
     * Sets the value of the callbackPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackPhone(String value) {
        this.callbackPhone = value;
    }

    /**
     * Gets the value of the callbackEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackEmail() {
        return callbackEmail;
    }

    /**
     * Sets the value of the callbackEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackEmail(String value) {
        this.callbackEmail = value;
    }

    /**
     * Gets the value of the callbackPushReceiverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackPushReceiverId() {
        return callbackPushReceiverId;
    }

    /**
     * Sets the value of the callbackPushReceiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackPushReceiverId(String value) {
        this.callbackPushReceiverId = value;
    }

    /**
     * Gets the value of the usedIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedIpAddress() {
        return usedIpAddress;
    }

    /**
     * Sets the value of the usedIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedIpAddress(String value) {
        this.usedIpAddress = value;
    }

    /**
     * Gets the value of the lifeCycleRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleRid() {
        return lifeCycleRid;
    }

    /**
     * Sets the value of the lifeCycleRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleRid(String value) {
        this.lifeCycleRid = value;
    }

    /**
     * Gets the value of the lastLoggedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoggedTime() {
        return lastLoggedTime;
    }

    /**
     * Sets the value of the lastLoggedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoggedTime(XMLGregorianCalendar value) {
        this.lastLoggedTime = value;
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
     *         &lt;element name="Auth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CardPwdHashBlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                   &lt;element name="CardPwdHash2BlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                   &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Presence" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                 &lt;attribute name="PinBlock"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                       &lt;length value="8"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="IPinBlock"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                       &lt;length value="8"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Cvv2"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *                       &lt;length value="3"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Cvv2PresenceIndicator"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="CapOtp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CapSign" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="SignChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="PhotoChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="PinChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="TdsChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="CvvChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Cvv2Checked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="ArqcChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Challenge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CardPwdHashBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="CardPwdHash2Block"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="UsedHashAlgo" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
     *                 &lt;attribute name="ForgotPassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="CredentialCaptured" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="CredentialCapturedForResults" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Emv" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                   &lt;element name="Track1Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                   &lt;element name="Track2Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                   &lt;element name="EquivalentDataCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Mbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="DMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Ac"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="TermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="CvmResults"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Tvr"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="AppProfile" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TranDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="TranStatusInfo" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TranType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Amount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="CashBackAmount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssuerData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TermCountry" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TermSerialNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CryptInformData" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TermType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AppTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="DuplicatedAtc" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Random" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TermTranSeqCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="DynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IssuerScriptResults" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="FormFactorIndicator" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="DedicatedFileName" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="Aid" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="CardholderName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CardholderNameExt" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ApplicationPreferredName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ApplicationLabel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="EquivalentData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CardProductIdentificationInformation" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="AppCurrency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AppId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ApplicationUsageControl" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TermAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IssuerAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="AuthAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="CertAuthorityPublicKeyIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TranCertDataObjectList" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TranCertHashValue" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TranPinData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssuerUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AcquirerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="OtherAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="LastOnlineAtcReg" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="LowerConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="MerchantCategoryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="PinTryCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssuerScriptId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TermFloorLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TermId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Track1DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Track2DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TranTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="UpperConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="PosEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="RefCurrencyAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="TranRefCurrencyCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TranRefCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AdditionalTermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="MerchantNameLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="IssIdNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="IssPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IssAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IssPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="Track1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Track2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Track3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AppExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="AppEffectiveDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="TranCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IssCountryCodeAlpha2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="IssCountryCodeAlpha3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AppDiscretionaryData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="CardAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IssCodeTableIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Par" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="IccPinEnciphermentPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IccPinEnciphermentPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IccPinEnciphermentPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="AppCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IccPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IccPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="IccPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="SignedDynamicAppData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="IccDynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="KernelReaderCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ProtectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ProtectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ProtectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ProtectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ProtectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="UnprotectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="UnprotectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="UnprotectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="UnprotectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="UnprotectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="ResponseMessageTemplateFormat2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                 &lt;attribute name="LanguagePreference" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AppRefCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AppRefCcyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Tds" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Visa" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Xid" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Mc" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="StaticAav" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Version"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NetworkType" type="{http://schemas.tranzaxis.com/tran-common.xsd}NetworkTypeEnum" /&gt;
     *                 &lt;attribute name="Condition"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Eci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DSTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *         &lt;element name="Track1Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *         &lt;element name="Track2Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *         &lt;element name="GetFromExtCard" type="{http://schemas.tranzaxis.com/tran-common.xsd}PartyFromExtCard" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Pan"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;minLength value="6"/&gt;
     *             &lt;maxLength value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DigitizationRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DPan"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *             &lt;minLength value="13"/&gt;
     *             &lt;maxLength value="19"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="DigitizedCardRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Track1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Track2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Track3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="EntryMode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RangeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AccountKind"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ProductKind"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RegExtCardForTokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="GetFromExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "auth",
        "emv",
        "tds",
        "panCrypt",
        "track1Crypt",
        "track2Crypt",
        "getFromExtCard"
    })
    public static class Card {

        @XmlElement(name = "Auth")
        protected Token.Card.Auth auth;
        @XmlElement(name = "Emv")
        protected Token.Card.Emv emv;
        @XmlElement(name = "Tds")
        protected Token.Card.Tds tds;
        @XmlElement(name = "PanCrypt")
        protected AppEncryptedData panCrypt;
        @XmlElement(name = "Track1Crypt")
        protected AppEncryptedData track1Crypt;
        @XmlElement(name = "Track2Crypt")
        protected AppEncryptedData track2Crypt;
        @XmlElement(name = "GetFromExtCard")
        protected PartyFromExtCard getFromExtCard;
        @XmlAttribute(name = "Pan")
        protected String pan;
        @XmlAttribute(name = "DigitizationRid")
        protected String digitizationRid;
        @XmlAttribute(name = "DPan")
        protected String dPan;
        @XmlAttribute(name = "DExpDate")
        protected XMLGregorianCalendar dExpDate;
        @XmlAttribute(name = "DigitizedCardRid")
        protected String digitizedCardRid;
        @XmlAttribute(name = "ExpDate")
        protected XMLGregorianCalendar expDate;
        @XmlAttribute(name = "ServiceCode")
        protected String serviceCode;
        @XmlAttribute(name = "Track1")
        protected String track1;
        @XmlAttribute(name = "Track2")
        protected String track2;
        @XmlAttribute(name = "Track3")
        protected String track3;
        @XmlAttribute(name = "EntryMode")
        protected String entryMode;
        @XmlAttribute(name = "RangeId")
        protected Long rangeId;
        @XmlAttribute(name = "AccountKind")
        protected String accountKind;
        @XmlAttribute(name = "ProductKind")
        protected String productKind;
        @XmlAttribute(name = "RegExtCardForTokenId")
        protected Long regExtCardForTokenId;
        @XmlAttribute(name = "GetFromExtCardId")
        protected Long getFromExtCardId;

        /**
         * Gets the value of the auth property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Card.Auth }
         *     
         */
        public Token.Card.Auth getAuth() {
            return auth;
        }

        /**
         * Sets the value of the auth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Card.Auth }
         *     
         */
        public void setAuth(Token.Card.Auth value) {
            this.auth = value;
        }

        /**
         * Gets the value of the emv property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Card.Emv }
         *     
         */
        public Token.Card.Emv getEmv() {
            return emv;
        }

        /**
         * Sets the value of the emv property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Card.Emv }
         *     
         */
        public void setEmv(Token.Card.Emv value) {
            this.emv = value;
        }

        /**
         * Gets the value of the tds property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Card.Tds }
         *     
         */
        public Token.Card.Tds getTds() {
            return tds;
        }

        /**
         * Sets the value of the tds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Card.Tds }
         *     
         */
        public void setTds(Token.Card.Tds value) {
            this.tds = value;
        }

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
         * Gets the value of the track1Crypt property.
         * 
         * @return
         *     possible object is
         *     {@link AppEncryptedData }
         *     
         */
        public AppEncryptedData getTrack1Crypt() {
            return track1Crypt;
        }

        /**
         * Sets the value of the track1Crypt property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppEncryptedData }
         *     
         */
        public void setTrack1Crypt(AppEncryptedData value) {
            this.track1Crypt = value;
        }

        /**
         * Gets the value of the track2Crypt property.
         * 
         * @return
         *     possible object is
         *     {@link AppEncryptedData }
         *     
         */
        public AppEncryptedData getTrack2Crypt() {
            return track2Crypt;
        }

        /**
         * Sets the value of the track2Crypt property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppEncryptedData }
         *     
         */
        public void setTrack2Crypt(AppEncryptedData value) {
            this.track2Crypt = value;
        }

        /**
         * Gets the value of the getFromExtCard property.
         * 
         * @return
         *     possible object is
         *     {@link PartyFromExtCard }
         *     
         */
        public PartyFromExtCard getGetFromExtCard() {
            return getFromExtCard;
        }

        /**
         * Sets the value of the getFromExtCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartyFromExtCard }
         *     
         */
        public void setGetFromExtCard(PartyFromExtCard value) {
            this.getFromExtCard = value;
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
         * Gets the value of the digitizationRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDigitizationRid() {
            return digitizationRid;
        }

        /**
         * Sets the value of the digitizationRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDigitizationRid(String value) {
            this.digitizationRid = value;
        }

        /**
         * Gets the value of the dPan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDPan() {
            return dPan;
        }

        /**
         * Sets the value of the dPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDPan(String value) {
            this.dPan = value;
        }

        /**
         * Gets the value of the dExpDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDExpDate() {
            return dExpDate;
        }

        /**
         * Sets the value of the dExpDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDExpDate(XMLGregorianCalendar value) {
            this.dExpDate = value;
        }

        /**
         * Gets the value of the digitizedCardRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDigitizedCardRid() {
            return digitizedCardRid;
        }

        /**
         * Sets the value of the digitizedCardRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDigitizedCardRid(String value) {
            this.digitizedCardRid = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the serviceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * Sets the value of the serviceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
        }

        /**
         * Gets the value of the track1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrack1() {
            return track1;
        }

        /**
         * Sets the value of the track1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrack1(String value) {
            this.track1 = value;
        }

        /**
         * Gets the value of the track2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrack2() {
            return track2;
        }

        /**
         * Sets the value of the track2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrack2(String value) {
            this.track2 = value;
        }

        /**
         * Gets the value of the track3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrack3() {
            return track3;
        }

        /**
         * Sets the value of the track3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrack3(String value) {
            this.track3 = value;
        }

        /**
         * Gets the value of the entryMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryMode() {
            return entryMode;
        }

        /**
         * Sets the value of the entryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryMode(String value) {
            this.entryMode = value;
        }

        /**
         * Gets the value of the rangeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRangeId() {
            return rangeId;
        }

        /**
         * Sets the value of the rangeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRangeId(Long value) {
            this.rangeId = value;
        }

        /**
         * Gets the value of the accountKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountKind() {
            return accountKind;
        }

        /**
         * Sets the value of the accountKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountKind(String value) {
            this.accountKind = value;
        }

        /**
         * Gets the value of the productKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductKind() {
            return productKind;
        }

        /**
         * Sets the value of the productKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductKind(String value) {
            this.productKind = value;
        }

        /**
         * Gets the value of the regExtCardForTokenId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRegExtCardForTokenId() {
            return regExtCardForTokenId;
        }

        /**
         * Sets the value of the regExtCardForTokenId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRegExtCardForTokenId(Long value) {
            this.regExtCardForTokenId = value;
        }

        /**
         * Gets the value of the getFromExtCardId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getGetFromExtCardId() {
            return getFromExtCardId;
        }

        /**
         * Sets the value of the getFromExtCardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setGetFromExtCardId(Long value) {
            this.getFromExtCardId = value;
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
         *         &lt;element name="CardPwdHashBlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *         &lt;element name="CardPwdHash2BlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *         &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Presence" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *       &lt;attribute name="PinBlock"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *             &lt;length value="8"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="IPinBlock"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *             &lt;length value="8"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Cvv2"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
         *             &lt;length value="3"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Cvv2PresenceIndicator"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TavvData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="CapOtp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CapSign" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="SignChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="PhotoChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="PinChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="TdsChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="CvvChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Cvv2Checked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="ArqcChecked" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Challenge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CardPwdHashBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="CardPwdHash2Block"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="UsedHashAlgo" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
         *       &lt;attribute name="ForgotPassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="CredentialCaptured" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="CredentialCapturedForResults" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cardPwdHashBlockCrypt",
            "cardPwdHash2BlockCrypt",
            "cofMatch"
        })
        public static class Auth {

            @XmlElement(name = "CardPwdHashBlockCrypt")
            protected AppEncryptedData cardPwdHashBlockCrypt;
            @XmlElement(name = "CardPwdHash2BlockCrypt")
            protected AppEncryptedData cardPwdHash2BlockCrypt;
            @XmlElement(name = "CofMatch")
            protected CofMatch cofMatch;
            @XmlAttribute(name = "Presence")
            protected Boolean presence;
            @XmlAttribute(name = "PinBlock")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] pinBlock;
            @XmlAttribute(name = "IPinBlock")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iPinBlock;
            @XmlAttribute(name = "Cvv2")
            protected String cvv2;
            @XmlAttribute(name = "Cvv2PresenceIndicator")
            protected String cvv2PresenceIndicator;
            @XmlAttribute(name = "CavvData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cavvData;
            @XmlAttribute(name = "TavvData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tavvData;
            @XmlAttribute(name = "CapOtp")
            protected String capOtp;
            @XmlAttribute(name = "CapSign")
            protected String capSign;
            @XmlAttribute(name = "SignChecked")
            protected Boolean signChecked;
            @XmlAttribute(name = "PhotoChecked")
            protected Boolean photoChecked;
            @XmlAttribute(name = "PinChecked")
            protected Boolean pinChecked;
            @XmlAttribute(name = "TdsChecked")
            protected Boolean tdsChecked;
            @XmlAttribute(name = "CvvChecked")
            protected Boolean cvvChecked;
            @XmlAttribute(name = "Cvv2Checked")
            protected Boolean cvv2Checked;
            @XmlAttribute(name = "ArqcChecked")
            protected Boolean arqcChecked;
            @XmlAttribute(name = "Challenge")
            protected String challenge;
            @XmlAttribute(name = "CardPwdHashBlock")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cardPwdHashBlock;
            @XmlAttribute(name = "CardPwdHash2Block")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cardPwdHash2Block;
            @XmlAttribute(name = "UsedHashAlgo")
            protected String usedHashAlgo;
            @XmlAttribute(name = "ForgotPassword")
            protected Boolean forgotPassword;
            @XmlAttribute(name = "CredentialCaptured")
            protected Boolean credentialCaptured;
            @XmlAttribute(name = "CredentialCapturedForResults")
            protected String credentialCapturedForResults;

            /**
             * Gets the value of the cardPwdHashBlockCrypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getCardPwdHashBlockCrypt() {
                return cardPwdHashBlockCrypt;
            }

            /**
             * Sets the value of the cardPwdHashBlockCrypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setCardPwdHashBlockCrypt(AppEncryptedData value) {
                this.cardPwdHashBlockCrypt = value;
            }

            /**
             * Gets the value of the cardPwdHash2BlockCrypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getCardPwdHash2BlockCrypt() {
                return cardPwdHash2BlockCrypt;
            }

            /**
             * Sets the value of the cardPwdHash2BlockCrypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setCardPwdHash2BlockCrypt(AppEncryptedData value) {
                this.cardPwdHash2BlockCrypt = value;
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
             * Gets the value of the presence property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isPresence() {
                if (presence == null) {
                    return false;
                } else {
                    return presence;
                }
            }

            /**
             * Sets the value of the presence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPresence(Boolean value) {
                this.presence = value;
            }

            /**
             * Gets the value of the pinBlock property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getPinBlock() {
                return pinBlock;
            }

            /**
             * Sets the value of the pinBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPinBlock(byte[] value) {
                this.pinBlock = value;
            }

            /**
             * Gets the value of the iPinBlock property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIPinBlock() {
                return iPinBlock;
            }

            /**
             * Sets the value of the iPinBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIPinBlock(byte[] value) {
                this.iPinBlock = value;
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
             * Gets the value of the cvv2PresenceIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCvv2PresenceIndicator() {
                return cvv2PresenceIndicator;
            }

            /**
             * Sets the value of the cvv2PresenceIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCvv2PresenceIndicator(String value) {
                this.cvv2PresenceIndicator = value;
            }

            /**
             * Gets the value of the cavvData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCavvData() {
                return cavvData;
            }

            /**
             * Sets the value of the cavvData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCavvData(byte[] value) {
                this.cavvData = value;
            }

            /**
             * Gets the value of the tavvData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTavvData() {
                return tavvData;
            }

            /**
             * Sets the value of the tavvData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTavvData(byte[] value) {
                this.tavvData = value;
            }

            /**
             * Gets the value of the capOtp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCapOtp() {
                return capOtp;
            }

            /**
             * Sets the value of the capOtp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCapOtp(String value) {
                this.capOtp = value;
            }

            /**
             * Gets the value of the capSign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCapSign() {
                return capSign;
            }

            /**
             * Sets the value of the capSign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCapSign(String value) {
                this.capSign = value;
            }

            /**
             * Gets the value of the signChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSignChecked() {
                return signChecked;
            }

            /**
             * Sets the value of the signChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSignChecked(Boolean value) {
                this.signChecked = value;
            }

            /**
             * Gets the value of the photoChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPhotoChecked() {
                return photoChecked;
            }

            /**
             * Sets the value of the photoChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPhotoChecked(Boolean value) {
                this.photoChecked = value;
            }

            /**
             * Gets the value of the pinChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPinChecked() {
                return pinChecked;
            }

            /**
             * Sets the value of the pinChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPinChecked(Boolean value) {
                this.pinChecked = value;
            }

            /**
             * Gets the value of the tdsChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTdsChecked() {
                return tdsChecked;
            }

            /**
             * Sets the value of the tdsChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTdsChecked(Boolean value) {
                this.tdsChecked = value;
            }

            /**
             * Gets the value of the cvvChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCvvChecked() {
                return cvvChecked;
            }

            /**
             * Sets the value of the cvvChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCvvChecked(Boolean value) {
                this.cvvChecked = value;
            }

            /**
             * Gets the value of the cvv2Checked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCvv2Checked() {
                return cvv2Checked;
            }

            /**
             * Sets the value of the cvv2Checked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCvv2Checked(Boolean value) {
                this.cvv2Checked = value;
            }

            /**
             * Gets the value of the arqcChecked property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isArqcChecked() {
                return arqcChecked;
            }

            /**
             * Sets the value of the arqcChecked property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setArqcChecked(Boolean value) {
                this.arqcChecked = value;
            }

            /**
             * Gets the value of the challenge property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChallenge() {
                return challenge;
            }

            /**
             * Sets the value of the challenge property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChallenge(String value) {
                this.challenge = value;
            }

            /**
             * Gets the value of the cardPwdHashBlock property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCardPwdHashBlock() {
                return cardPwdHashBlock;
            }

            /**
             * Sets the value of the cardPwdHashBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardPwdHashBlock(byte[] value) {
                this.cardPwdHashBlock = value;
            }

            /**
             * Gets the value of the cardPwdHash2Block property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCardPwdHash2Block() {
                return cardPwdHash2Block;
            }

            /**
             * Sets the value of the cardPwdHash2Block property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardPwdHash2Block(byte[] value) {
                this.cardPwdHash2Block = value;
            }

            /**
             * Gets the value of the usedHashAlgo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsedHashAlgo() {
                return usedHashAlgo;
            }

            /**
             * Sets the value of the usedHashAlgo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsedHashAlgo(String value) {
                this.usedHashAlgo = value;
            }

            /**
             * Gets the value of the forgotPassword property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isForgotPassword() {
                return forgotPassword;
            }

            /**
             * Sets the value of the forgotPassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setForgotPassword(Boolean value) {
                this.forgotPassword = value;
            }

            /**
             * Gets the value of the credentialCaptured property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCredentialCaptured() {
                return credentialCaptured;
            }

            /**
             * Sets the value of the credentialCaptured property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCredentialCaptured(Boolean value) {
                this.credentialCaptured = value;
            }

            /**
             * Gets the value of the credentialCapturedForResults property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCredentialCapturedForResults() {
                return credentialCapturedForResults;
            }

            /**
             * Sets the value of the credentialCapturedForResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCredentialCapturedForResults(String value) {
                this.credentialCapturedForResults = value;
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
         *         &lt;element name="Track1Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *         &lt;element name="Track2Crypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *         &lt;element name="EquivalentDataCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Mbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="DMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Ac"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="TermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="CvmResults"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Tvr"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="AppProfile" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TranDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="TranStatusInfo" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TranType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Amount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="CashBackAmount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssuerData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TermCountry" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TermSerialNum" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CryptInformData" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TermType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssCountryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AppTranCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="DuplicatedAtc" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Random" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TermTranSeqCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="DynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IssuerScriptResults" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="RespCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="FormFactorIndicator" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="DedicatedFileName" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="Aid" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="CardholderName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CardholderNameExt" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ApplicationPreferredName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ApplicationLabel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="EquivalentData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CardProductIdentificationInformation" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="AppCurrency" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AppId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ApplicationUsageControl" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TermAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IssuerAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="AuthAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="CertAuthorityPublicKeyIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TranCertDataObjectList" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TranCertHashValue" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TranPinData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ServiceCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssuerUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AcquirerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="OtherAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="LastOnlineAtcReg" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="LowerConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="MerchantCategoryCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="PinTryCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssuerScriptId" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TermFloorLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TermId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Track1DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Track2DiscretionaryData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TranTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="UpperConsecutiveOfflineLimit" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="PosEntryMode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="RefCurrencyAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="TranRefCurrencyCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TranRefCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AdditionalTermCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="MerchantNameLocation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IssIdNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IssPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IssAuthData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IssPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="Track1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Track2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Track3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AppExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="AppEffectiveDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="TranCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IssCountryCodeAlpha2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IssCountryCodeAlpha3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AppDiscretionaryData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="CardAppVersionNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IssCodeTableIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Par" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IccPinEnciphermentPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IccPinEnciphermentPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IccPinEnciphermentPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="AppCurrencyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IccPublicKeyCert" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IccPublicKeyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="IccPublicKeyRemainder" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="SignedDynamicAppData" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="IccDynamicNumber" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="KernelReaderCaps" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ProtectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ProtectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ProtectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ProtectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ProtectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="UnprotectedDataEnvelope1" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="UnprotectedDataEnvelope2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="UnprotectedDataEnvelope3" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="UnprotectedDataEnvelope4" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="UnprotectedDataEnvelope5" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="ResponseMessageTemplateFormat2" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *       &lt;attribute name="LanguagePreference" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AppRefCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AppRefCcyExponent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "panCrypt",
            "track1Crypt",
            "track2Crypt",
            "equivalentDataCrypt"
        })
        public static class Emv {

            @XmlElement(name = "PanCrypt")
            protected AppEncryptedData panCrypt;
            @XmlElement(name = "Track1Crypt")
            protected AppEncryptedData track1Crypt;
            @XmlElement(name = "Track2Crypt")
            protected AppEncryptedData track2Crypt;
            @XmlElement(name = "EquivalentDataCrypt")
            protected AppEncryptedData equivalentDataCrypt;
            @XmlAttribute(name = "Mbr")
            protected Long mbr;
            @XmlAttribute(name = "DMbr")
            protected Long dMbr;
            @XmlAttribute(name = "Ac")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] ac;
            @XmlAttribute(name = "TermCaps")
            protected Long termCaps;
            @XmlAttribute(name = "CvmResults")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cvmResults;
            @XmlAttribute(name = "Tvr")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tvr;
            @XmlAttribute(name = "AppProfile")
            protected Long appProfile;
            @XmlAttribute(name = "TranDate")
            protected XMLGregorianCalendar tranDate;
            @XmlAttribute(name = "TranStatusInfo")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tranStatusInfo;
            @XmlAttribute(name = "TranType")
            protected Long tranType;
            @XmlAttribute(name = "Currency")
            protected Long currency;
            @XmlAttribute(name = "Amount")
            protected Long amount;
            @XmlAttribute(name = "CashBackAmount")
            protected Long cashBackAmount;
            @XmlAttribute(name = "IssuerData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issuerData;
            @XmlAttribute(name = "TermCountry")
            protected Long termCountry;
            @XmlAttribute(name = "TermSerialNum")
            protected String termSerialNum;
            @XmlAttribute(name = "CryptInformData")
            protected Long cryptInformData;
            @XmlAttribute(name = "TermType")
            protected Long termType;
            @XmlAttribute(name = "IssCountryCode")
            protected Long issCountryCode;
            @XmlAttribute(name = "AppTranCount")
            protected Long appTranCount;
            @XmlAttribute(name = "DuplicatedAtc")
            protected Boolean duplicatedAtc;
            @XmlAttribute(name = "Random")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] random;
            @XmlAttribute(name = "TermTranSeqCount")
            protected Long termTranSeqCount;
            @XmlAttribute(name = "DynamicNumber")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] dynamicNumber;
            @XmlAttribute(name = "IssuerScriptResults")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issuerScriptResults;
            @XmlAttribute(name = "RespCode")
            protected String respCode;
            @XmlAttribute(name = "FormFactorIndicator")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] formFactorIndicator;
            @XmlAttribute(name = "DedicatedFileName")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] dedicatedFileName;
            @XmlAttribute(name = "Aid")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] aid;
            @XmlAttribute(name = "CardholderName")
            protected String cardholderName;
            @XmlAttribute(name = "CardholderNameExt")
            protected String cardholderNameExt;
            @XmlAttribute(name = "ApplicationPreferredName")
            protected String applicationPreferredName;
            @XmlAttribute(name = "ApplicationLabel")
            protected String applicationLabel;
            @XmlAttribute(name = "EquivalentData")
            protected String equivalentData;
            @XmlAttribute(name = "CardProductIdentificationInformation")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cardProductIdentificationInformation;
            @XmlAttribute(name = "AppCurrency")
            protected Long appCurrency;
            @XmlAttribute(name = "AppId")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] appId;
            @XmlAttribute(name = "TranCategoryCode")
            protected String tranCategoryCode;
            @XmlAttribute(name = "ApplicationUsageControl")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] applicationUsageControl;
            @XmlAttribute(name = "TermAppVersionNumber")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] termAppVersionNumber;
            @XmlAttribute(name = "IssuerAuthData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issuerAuthData;
            @XmlAttribute(name = "AuthAmount")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] authAmount;
            @XmlAttribute(name = "CertAuthorityPublicKeyIndex")
            protected Long certAuthorityPublicKeyIndex;
            @XmlAttribute(name = "TranCertDataObjectList")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tranCertDataObjectList;
            @XmlAttribute(name = "TranCertHashValue")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tranCertHashValue;
            @XmlAttribute(name = "TranPinData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] tranPinData;
            @XmlAttribute(name = "ServiceCode")
            protected Long serviceCode;
            @XmlAttribute(name = "IssuerUrl")
            protected String issuerUrl;
            @XmlAttribute(name = "AcquirerId")
            protected Long acquirerId;
            @XmlAttribute(name = "OtherAmount")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] otherAmount;
            @XmlAttribute(name = "LastOnlineAtcReg")
            protected Long lastOnlineAtcReg;
            @XmlAttribute(name = "LowerConsecutiveOfflineLimit")
            protected Long lowerConsecutiveOfflineLimit;
            @XmlAttribute(name = "MerchantCategoryCode")
            protected Long merchantCategoryCode;
            @XmlAttribute(name = "MerchantId")
            protected String merchantId;
            @XmlAttribute(name = "PinTryCounter")
            protected Long pinTryCounter;
            @XmlAttribute(name = "IssuerScriptId")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issuerScriptId;
            @XmlAttribute(name = "TermFloorLimit")
            protected Long termFloorLimit;
            @XmlAttribute(name = "TermId")
            protected String termId;
            @XmlAttribute(name = "Track1DiscretionaryData")
            protected String track1DiscretionaryData;
            @XmlAttribute(name = "Track2DiscretionaryData")
            protected String track2DiscretionaryData;
            @XmlAttribute(name = "TranTime")
            protected XMLGregorianCalendar tranTime;
            @XmlAttribute(name = "UpperConsecutiveOfflineLimit")
            protected Long upperConsecutiveOfflineLimit;
            @XmlAttribute(name = "IssPublicKeyExponent")
            protected Long issPublicKeyExponent;
            @XmlAttribute(name = "PosEntryMode")
            protected Long posEntryMode;
            @XmlAttribute(name = "RefCurrencyAmount")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] refCurrencyAmount;
            @XmlAttribute(name = "TranRefCurrencyCode")
            protected Long tranRefCurrencyCode;
            @XmlAttribute(name = "TranRefCurrencyExponent")
            protected Long tranRefCurrencyExponent;
            @XmlAttribute(name = "AdditionalTermCaps")
            protected Long additionalTermCaps;
            @XmlAttribute(name = "MerchantNameLocation")
            protected String merchantNameLocation;
            @XmlAttribute(name = "IssIdNumber")
            protected Long issIdNumber;
            @XmlAttribute(name = "Pan")
            protected String pan;
            @XmlAttribute(name = "IssPublicKeyCert")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issPublicKeyCert;
            @XmlAttribute(name = "IssAuthData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issAuthData;
            @XmlAttribute(name = "IssPublicKeyRemainder")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] issPublicKeyRemainder;
            @XmlAttribute(name = "Track1")
            protected String track1;
            @XmlAttribute(name = "Track2")
            protected String track2;
            @XmlAttribute(name = "Track3")
            protected String track3;
            @XmlAttribute(name = "AppExpDate")
            protected XMLGregorianCalendar appExpDate;
            @XmlAttribute(name = "AppEffectiveDate")
            protected XMLGregorianCalendar appEffectiveDate;
            @XmlAttribute(name = "TranCurrencyExponent")
            protected Long tranCurrencyExponent;
            @XmlAttribute(name = "IssCountryCodeAlpha2")
            protected String issCountryCodeAlpha2;
            @XmlAttribute(name = "IssCountryCodeAlpha3")
            protected String issCountryCodeAlpha3;
            @XmlAttribute(name = "AppDiscretionaryData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] appDiscretionaryData;
            @XmlAttribute(name = "CardAppVersionNumber")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] cardAppVersionNumber;
            @XmlAttribute(name = "IssCodeTableIndex")
            protected Long issCodeTableIndex;
            @XmlAttribute(name = "Par")
            protected String par;
            @XmlAttribute(name = "IccPinEnciphermentPublicKeyCert")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iccPinEnciphermentPublicKeyCert;
            @XmlAttribute(name = "IccPinEnciphermentPublicKeyExponent")
            protected Long iccPinEnciphermentPublicKeyExponent;
            @XmlAttribute(name = "IccPinEnciphermentPublicKeyRemainder")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iccPinEnciphermentPublicKeyRemainder;
            @XmlAttribute(name = "AppCurrencyExponent")
            protected Long appCurrencyExponent;
            @XmlAttribute(name = "IccPublicKeyCert")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iccPublicKeyCert;
            @XmlAttribute(name = "IccPublicKeyExponent")
            protected Long iccPublicKeyExponent;
            @XmlAttribute(name = "IccPublicKeyRemainder")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iccPublicKeyRemainder;
            @XmlAttribute(name = "SignedDynamicAppData")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] signedDynamicAppData;
            @XmlAttribute(name = "IccDynamicNumber")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] iccDynamicNumber;
            @XmlAttribute(name = "KernelReaderCaps")
            protected Long kernelReaderCaps;
            @XmlAttribute(name = "ProtectedDataEnvelope1")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] protectedDataEnvelope1;
            @XmlAttribute(name = "ProtectedDataEnvelope2")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] protectedDataEnvelope2;
            @XmlAttribute(name = "ProtectedDataEnvelope3")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] protectedDataEnvelope3;
            @XmlAttribute(name = "ProtectedDataEnvelope4")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] protectedDataEnvelope4;
            @XmlAttribute(name = "ProtectedDataEnvelope5")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] protectedDataEnvelope5;
            @XmlAttribute(name = "UnprotectedDataEnvelope1")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] unprotectedDataEnvelope1;
            @XmlAttribute(name = "UnprotectedDataEnvelope2")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] unprotectedDataEnvelope2;
            @XmlAttribute(name = "UnprotectedDataEnvelope3")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] unprotectedDataEnvelope3;
            @XmlAttribute(name = "UnprotectedDataEnvelope4")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] unprotectedDataEnvelope4;
            @XmlAttribute(name = "UnprotectedDataEnvelope5")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] unprotectedDataEnvelope5;
            @XmlAttribute(name = "ResponseMessageTemplateFormat2")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            protected byte[] responseMessageTemplateFormat2;
            @XmlAttribute(name = "LanguagePreference")
            protected String languagePreference;
            @XmlAttribute(name = "AppRefCcy")
            protected Long appRefCcy;
            @XmlAttribute(name = "AppRefCcyExponent")
            protected Long appRefCcyExponent;

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
             * Gets the value of the track1Crypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getTrack1Crypt() {
                return track1Crypt;
            }

            /**
             * Sets the value of the track1Crypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setTrack1Crypt(AppEncryptedData value) {
                this.track1Crypt = value;
            }

            /**
             * Gets the value of the track2Crypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getTrack2Crypt() {
                return track2Crypt;
            }

            /**
             * Sets the value of the track2Crypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setTrack2Crypt(AppEncryptedData value) {
                this.track2Crypt = value;
            }

            /**
             * Gets the value of the equivalentDataCrypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getEquivalentDataCrypt() {
                return equivalentDataCrypt;
            }

            /**
             * Sets the value of the equivalentDataCrypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setEquivalentDataCrypt(AppEncryptedData value) {
                this.equivalentDataCrypt = value;
            }

            /**
             * Gets the value of the mbr property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMbr() {
                return mbr;
            }

            /**
             * Sets the value of the mbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMbr(Long value) {
                this.mbr = value;
            }

            /**
             * Gets the value of the dMbr property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDMbr() {
                return dMbr;
            }

            /**
             * Sets the value of the dMbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDMbr(Long value) {
                this.dMbr = value;
            }

            /**
             * Gets the value of the ac property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getAc() {
                return ac;
            }

            /**
             * Sets the value of the ac property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAc(byte[] value) {
                this.ac = value;
            }

            /**
             * Gets the value of the termCaps property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTermCaps() {
                return termCaps;
            }

            /**
             * Sets the value of the termCaps property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTermCaps(Long value) {
                this.termCaps = value;
            }

            /**
             * Gets the value of the cvmResults property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCvmResults() {
                return cvmResults;
            }

            /**
             * Sets the value of the cvmResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCvmResults(byte[] value) {
                this.cvmResults = value;
            }

            /**
             * Gets the value of the tvr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTvr() {
                return tvr;
            }

            /**
             * Sets the value of the tvr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTvr(byte[] value) {
                this.tvr = value;
            }

            /**
             * Gets the value of the appProfile property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppProfile() {
                return appProfile;
            }

            /**
             * Sets the value of the appProfile property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppProfile(Long value) {
                this.appProfile = value;
            }

            /**
             * Gets the value of the tranDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTranDate() {
                return tranDate;
            }

            /**
             * Sets the value of the tranDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTranDate(XMLGregorianCalendar value) {
                this.tranDate = value;
            }

            /**
             * Gets the value of the tranStatusInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTranStatusInfo() {
                return tranStatusInfo;
            }

            /**
             * Sets the value of the tranStatusInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranStatusInfo(byte[] value) {
                this.tranStatusInfo = value;
            }

            /**
             * Gets the value of the tranType property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTranType() {
                return tranType;
            }

            /**
             * Sets the value of the tranType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTranType(Long value) {
                this.tranType = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCurrency(Long value) {
                this.currency = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAmount(Long value) {
                this.amount = value;
            }

            /**
             * Gets the value of the cashBackAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCashBackAmount() {
                return cashBackAmount;
            }

            /**
             * Sets the value of the cashBackAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCashBackAmount(Long value) {
                this.cashBackAmount = value;
            }

            /**
             * Gets the value of the issuerData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssuerData() {
                return issuerData;
            }

            /**
             * Sets the value of the issuerData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerData(byte[] value) {
                this.issuerData = value;
            }

            /**
             * Gets the value of the termCountry property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTermCountry() {
                return termCountry;
            }

            /**
             * Sets the value of the termCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTermCountry(Long value) {
                this.termCountry = value;
            }

            /**
             * Gets the value of the termSerialNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTermSerialNum() {
                return termSerialNum;
            }

            /**
             * Sets the value of the termSerialNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTermSerialNum(String value) {
                this.termSerialNum = value;
            }

            /**
             * Gets the value of the cryptInformData property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCryptInformData() {
                return cryptInformData;
            }

            /**
             * Sets the value of the cryptInformData property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCryptInformData(Long value) {
                this.cryptInformData = value;
            }

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
             * Gets the value of the issCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIssCountryCode() {
                return issCountryCode;
            }

            /**
             * Sets the value of the issCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIssCountryCode(Long value) {
                this.issCountryCode = value;
            }

            /**
             * Gets the value of the appTranCount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppTranCount() {
                return appTranCount;
            }

            /**
             * Sets the value of the appTranCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppTranCount(Long value) {
                this.appTranCount = value;
            }

            /**
             * Gets the value of the duplicatedAtc property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDuplicatedAtc() {
                return duplicatedAtc;
            }

            /**
             * Sets the value of the duplicatedAtc property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDuplicatedAtc(Boolean value) {
                this.duplicatedAtc = value;
            }

            /**
             * Gets the value of the random property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getRandom() {
                return random;
            }

            /**
             * Sets the value of the random property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRandom(byte[] value) {
                this.random = value;
            }

            /**
             * Gets the value of the termTranSeqCount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTermTranSeqCount() {
                return termTranSeqCount;
            }

            /**
             * Sets the value of the termTranSeqCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTermTranSeqCount(Long value) {
                this.termTranSeqCount = value;
            }

            /**
             * Gets the value of the dynamicNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getDynamicNumber() {
                return dynamicNumber;
            }

            /**
             * Sets the value of the dynamicNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDynamicNumber(byte[] value) {
                this.dynamicNumber = value;
            }

            /**
             * Gets the value of the issuerScriptResults property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssuerScriptResults() {
                return issuerScriptResults;
            }

            /**
             * Sets the value of the issuerScriptResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerScriptResults(byte[] value) {
                this.issuerScriptResults = value;
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
             * Gets the value of the formFactorIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getFormFactorIndicator() {
                return formFactorIndicator;
            }

            /**
             * Sets the value of the formFactorIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormFactorIndicator(byte[] value) {
                this.formFactorIndicator = value;
            }

            /**
             * Gets the value of the dedicatedFileName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getDedicatedFileName() {
                return dedicatedFileName;
            }

            /**
             * Sets the value of the dedicatedFileName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDedicatedFileName(byte[] value) {
                this.dedicatedFileName = value;
            }

            /**
             * Gets the value of the aid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getAid() {
                return aid;
            }

            /**
             * Sets the value of the aid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAid(byte[] value) {
                this.aid = value;
            }

            /**
             * Gets the value of the cardholderName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardholderName() {
                return cardholderName;
            }

            /**
             * Sets the value of the cardholderName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardholderName(String value) {
                this.cardholderName = value;
            }

            /**
             * Gets the value of the cardholderNameExt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardholderNameExt() {
                return cardholderNameExt;
            }

            /**
             * Sets the value of the cardholderNameExt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardholderNameExt(String value) {
                this.cardholderNameExt = value;
            }

            /**
             * Gets the value of the applicationPreferredName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationPreferredName() {
                return applicationPreferredName;
            }

            /**
             * Sets the value of the applicationPreferredName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationPreferredName(String value) {
                this.applicationPreferredName = value;
            }

            /**
             * Gets the value of the applicationLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationLabel() {
                return applicationLabel;
            }

            /**
             * Sets the value of the applicationLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationLabel(String value) {
                this.applicationLabel = value;
            }

            /**
             * Gets the value of the equivalentData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquivalentData() {
                return equivalentData;
            }

            /**
             * Sets the value of the equivalentData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquivalentData(String value) {
                this.equivalentData = value;
            }

            /**
             * Gets the value of the cardProductIdentificationInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCardProductIdentificationInformation() {
                return cardProductIdentificationInformation;
            }

            /**
             * Sets the value of the cardProductIdentificationInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardProductIdentificationInformation(byte[] value) {
                this.cardProductIdentificationInformation = value;
            }

            /**
             * Gets the value of the appCurrency property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppCurrency() {
                return appCurrency;
            }

            /**
             * Sets the value of the appCurrency property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppCurrency(Long value) {
                this.appCurrency = value;
            }

            /**
             * Gets the value of the appId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getAppId() {
                return appId;
            }

            /**
             * Sets the value of the appId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppId(byte[] value) {
                this.appId = value;
            }

            /**
             * Gets the value of the tranCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTranCategoryCode() {
                return tranCategoryCode;
            }

            /**
             * Sets the value of the tranCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranCategoryCode(String value) {
                this.tranCategoryCode = value;
            }

            /**
             * Gets the value of the applicationUsageControl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getApplicationUsageControl() {
                return applicationUsageControl;
            }

            /**
             * Sets the value of the applicationUsageControl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationUsageControl(byte[] value) {
                this.applicationUsageControl = value;
            }

            /**
             * Gets the value of the termAppVersionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTermAppVersionNumber() {
                return termAppVersionNumber;
            }

            /**
             * Sets the value of the termAppVersionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTermAppVersionNumber(byte[] value) {
                this.termAppVersionNumber = value;
            }

            /**
             * Gets the value of the issuerAuthData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssuerAuthData() {
                return issuerAuthData;
            }

            /**
             * Sets the value of the issuerAuthData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerAuthData(byte[] value) {
                this.issuerAuthData = value;
            }

            /**
             * Gets the value of the authAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getAuthAmount() {
                return authAmount;
            }

            /**
             * Sets the value of the authAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthAmount(byte[] value) {
                this.authAmount = value;
            }

            /**
             * Gets the value of the certAuthorityPublicKeyIndex property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCertAuthorityPublicKeyIndex() {
                return certAuthorityPublicKeyIndex;
            }

            /**
             * Sets the value of the certAuthorityPublicKeyIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCertAuthorityPublicKeyIndex(Long value) {
                this.certAuthorityPublicKeyIndex = value;
            }

            /**
             * Gets the value of the tranCertDataObjectList property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTranCertDataObjectList() {
                return tranCertDataObjectList;
            }

            /**
             * Sets the value of the tranCertDataObjectList property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranCertDataObjectList(byte[] value) {
                this.tranCertDataObjectList = value;
            }

            /**
             * Gets the value of the tranCertHashValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTranCertHashValue() {
                return tranCertHashValue;
            }

            /**
             * Sets the value of the tranCertHashValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranCertHashValue(byte[] value) {
                this.tranCertHashValue = value;
            }

            /**
             * Gets the value of the tranPinData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getTranPinData() {
                return tranPinData;
            }

            /**
             * Sets the value of the tranPinData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranPinData(byte[] value) {
                this.tranPinData = value;
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
             * Gets the value of the issuerUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuerUrl() {
                return issuerUrl;
            }

            /**
             * Sets the value of the issuerUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerUrl(String value) {
                this.issuerUrl = value;
            }

            /**
             * Gets the value of the acquirerId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAcquirerId() {
                return acquirerId;
            }

            /**
             * Sets the value of the acquirerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAcquirerId(Long value) {
                this.acquirerId = value;
            }

            /**
             * Gets the value of the otherAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getOtherAmount() {
                return otherAmount;
            }

            /**
             * Sets the value of the otherAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherAmount(byte[] value) {
                this.otherAmount = value;
            }

            /**
             * Gets the value of the lastOnlineAtcReg property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLastOnlineAtcReg() {
                return lastOnlineAtcReg;
            }

            /**
             * Sets the value of the lastOnlineAtcReg property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLastOnlineAtcReg(Long value) {
                this.lastOnlineAtcReg = value;
            }

            /**
             * Gets the value of the lowerConsecutiveOfflineLimit property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLowerConsecutiveOfflineLimit() {
                return lowerConsecutiveOfflineLimit;
            }

            /**
             * Sets the value of the lowerConsecutiveOfflineLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLowerConsecutiveOfflineLimit(Long value) {
                this.lowerConsecutiveOfflineLimit = value;
            }

            /**
             * Gets the value of the merchantCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMerchantCategoryCode() {
                return merchantCategoryCode;
            }

            /**
             * Sets the value of the merchantCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMerchantCategoryCode(Long value) {
                this.merchantCategoryCode = value;
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
             * Gets the value of the pinTryCounter property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPinTryCounter() {
                return pinTryCounter;
            }

            /**
             * Sets the value of the pinTryCounter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPinTryCounter(Long value) {
                this.pinTryCounter = value;
            }

            /**
             * Gets the value of the issuerScriptId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssuerScriptId() {
                return issuerScriptId;
            }

            /**
             * Sets the value of the issuerScriptId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerScriptId(byte[] value) {
                this.issuerScriptId = value;
            }

            /**
             * Gets the value of the termFloorLimit property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTermFloorLimit() {
                return termFloorLimit;
            }

            /**
             * Sets the value of the termFloorLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTermFloorLimit(Long value) {
                this.termFloorLimit = value;
            }

            /**
             * Gets the value of the termId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTermId() {
                return termId;
            }

            /**
             * Sets the value of the termId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTermId(String value) {
                this.termId = value;
            }

            /**
             * Gets the value of the track1DiscretionaryData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrack1DiscretionaryData() {
                return track1DiscretionaryData;
            }

            /**
             * Sets the value of the track1DiscretionaryData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrack1DiscretionaryData(String value) {
                this.track1DiscretionaryData = value;
            }

            /**
             * Gets the value of the track2DiscretionaryData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrack2DiscretionaryData() {
                return track2DiscretionaryData;
            }

            /**
             * Sets the value of the track2DiscretionaryData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrack2DiscretionaryData(String value) {
                this.track2DiscretionaryData = value;
            }

            /**
             * Gets the value of the tranTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTranTime() {
                return tranTime;
            }

            /**
             * Sets the value of the tranTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTranTime(XMLGregorianCalendar value) {
                this.tranTime = value;
            }

            /**
             * Gets the value of the upperConsecutiveOfflineLimit property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUpperConsecutiveOfflineLimit() {
                return upperConsecutiveOfflineLimit;
            }

            /**
             * Sets the value of the upperConsecutiveOfflineLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUpperConsecutiveOfflineLimit(Long value) {
                this.upperConsecutiveOfflineLimit = value;
            }

            /**
             * Gets the value of the issPublicKeyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIssPublicKeyExponent() {
                return issPublicKeyExponent;
            }

            /**
             * Sets the value of the issPublicKeyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIssPublicKeyExponent(Long value) {
                this.issPublicKeyExponent = value;
            }

            /**
             * Gets the value of the posEntryMode property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPosEntryMode() {
                return posEntryMode;
            }

            /**
             * Sets the value of the posEntryMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPosEntryMode(Long value) {
                this.posEntryMode = value;
            }

            /**
             * Gets the value of the refCurrencyAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getRefCurrencyAmount() {
                return refCurrencyAmount;
            }

            /**
             * Sets the value of the refCurrencyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefCurrencyAmount(byte[] value) {
                this.refCurrencyAmount = value;
            }

            /**
             * Gets the value of the tranRefCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTranRefCurrencyCode() {
                return tranRefCurrencyCode;
            }

            /**
             * Sets the value of the tranRefCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTranRefCurrencyCode(Long value) {
                this.tranRefCurrencyCode = value;
            }

            /**
             * Gets the value of the tranRefCurrencyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTranRefCurrencyExponent() {
                return tranRefCurrencyExponent;
            }

            /**
             * Sets the value of the tranRefCurrencyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTranRefCurrencyExponent(Long value) {
                this.tranRefCurrencyExponent = value;
            }

            /**
             * Gets the value of the additionalTermCaps property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAdditionalTermCaps() {
                return additionalTermCaps;
            }

            /**
             * Sets the value of the additionalTermCaps property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAdditionalTermCaps(Long value) {
                this.additionalTermCaps = value;
            }

            /**
             * Gets the value of the merchantNameLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMerchantNameLocation() {
                return merchantNameLocation;
            }

            /**
             * Sets the value of the merchantNameLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMerchantNameLocation(String value) {
                this.merchantNameLocation = value;
            }

            /**
             * Gets the value of the issIdNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIssIdNumber() {
                return issIdNumber;
            }

            /**
             * Sets the value of the issIdNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIssIdNumber(Long value) {
                this.issIdNumber = value;
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
             * Gets the value of the issPublicKeyCert property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssPublicKeyCert() {
                return issPublicKeyCert;
            }

            /**
             * Sets the value of the issPublicKeyCert property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssPublicKeyCert(byte[] value) {
                this.issPublicKeyCert = value;
            }

            /**
             * Gets the value of the issAuthData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssAuthData() {
                return issAuthData;
            }

            /**
             * Sets the value of the issAuthData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssAuthData(byte[] value) {
                this.issAuthData = value;
            }

            /**
             * Gets the value of the issPublicKeyRemainder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIssPublicKeyRemainder() {
                return issPublicKeyRemainder;
            }

            /**
             * Sets the value of the issPublicKeyRemainder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssPublicKeyRemainder(byte[] value) {
                this.issPublicKeyRemainder = value;
            }

            /**
             * Gets the value of the track1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrack1() {
                return track1;
            }

            /**
             * Sets the value of the track1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrack1(String value) {
                this.track1 = value;
            }

            /**
             * Gets the value of the track2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrack2() {
                return track2;
            }

            /**
             * Sets the value of the track2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrack2(String value) {
                this.track2 = value;
            }

            /**
             * Gets the value of the track3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrack3() {
                return track3;
            }

            /**
             * Sets the value of the track3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrack3(String value) {
                this.track3 = value;
            }

            /**
             * Gets the value of the appExpDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAppExpDate() {
                return appExpDate;
            }

            /**
             * Sets the value of the appExpDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAppExpDate(XMLGregorianCalendar value) {
                this.appExpDate = value;
            }

            /**
             * Gets the value of the appEffectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAppEffectiveDate() {
                return appEffectiveDate;
            }

            /**
             * Sets the value of the appEffectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAppEffectiveDate(XMLGregorianCalendar value) {
                this.appEffectiveDate = value;
            }

            /**
             * Gets the value of the tranCurrencyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTranCurrencyExponent() {
                return tranCurrencyExponent;
            }

            /**
             * Sets the value of the tranCurrencyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTranCurrencyExponent(Long value) {
                this.tranCurrencyExponent = value;
            }

            /**
             * Gets the value of the issCountryCodeAlpha2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssCountryCodeAlpha2() {
                return issCountryCodeAlpha2;
            }

            /**
             * Sets the value of the issCountryCodeAlpha2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssCountryCodeAlpha2(String value) {
                this.issCountryCodeAlpha2 = value;
            }

            /**
             * Gets the value of the issCountryCodeAlpha3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssCountryCodeAlpha3() {
                return issCountryCodeAlpha3;
            }

            /**
             * Sets the value of the issCountryCodeAlpha3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssCountryCodeAlpha3(String value) {
                this.issCountryCodeAlpha3 = value;
            }

            /**
             * Gets the value of the appDiscretionaryData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getAppDiscretionaryData() {
                return appDiscretionaryData;
            }

            /**
             * Sets the value of the appDiscretionaryData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppDiscretionaryData(byte[] value) {
                this.appDiscretionaryData = value;
            }

            /**
             * Gets the value of the cardAppVersionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getCardAppVersionNumber() {
                return cardAppVersionNumber;
            }

            /**
             * Sets the value of the cardAppVersionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardAppVersionNumber(byte[] value) {
                this.cardAppVersionNumber = value;
            }

            /**
             * Gets the value of the issCodeTableIndex property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIssCodeTableIndex() {
                return issCodeTableIndex;
            }

            /**
             * Sets the value of the issCodeTableIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIssCodeTableIndex(Long value) {
                this.issCodeTableIndex = value;
            }

            /**
             * Gets the value of the par property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPar() {
                return par;
            }

            /**
             * Sets the value of the par property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPar(String value) {
                this.par = value;
            }

            /**
             * Gets the value of the iccPinEnciphermentPublicKeyCert property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIccPinEnciphermentPublicKeyCert() {
                return iccPinEnciphermentPublicKeyCert;
            }

            /**
             * Sets the value of the iccPinEnciphermentPublicKeyCert property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccPinEnciphermentPublicKeyCert(byte[] value) {
                this.iccPinEnciphermentPublicKeyCert = value;
            }

            /**
             * Gets the value of the iccPinEnciphermentPublicKeyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIccPinEnciphermentPublicKeyExponent() {
                return iccPinEnciphermentPublicKeyExponent;
            }

            /**
             * Sets the value of the iccPinEnciphermentPublicKeyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIccPinEnciphermentPublicKeyExponent(Long value) {
                this.iccPinEnciphermentPublicKeyExponent = value;
            }

            /**
             * Gets the value of the iccPinEnciphermentPublicKeyRemainder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIccPinEnciphermentPublicKeyRemainder() {
                return iccPinEnciphermentPublicKeyRemainder;
            }

            /**
             * Sets the value of the iccPinEnciphermentPublicKeyRemainder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccPinEnciphermentPublicKeyRemainder(byte[] value) {
                this.iccPinEnciphermentPublicKeyRemainder = value;
            }

            /**
             * Gets the value of the appCurrencyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppCurrencyExponent() {
                return appCurrencyExponent;
            }

            /**
             * Sets the value of the appCurrencyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppCurrencyExponent(Long value) {
                this.appCurrencyExponent = value;
            }

            /**
             * Gets the value of the iccPublicKeyCert property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIccPublicKeyCert() {
                return iccPublicKeyCert;
            }

            /**
             * Sets the value of the iccPublicKeyCert property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccPublicKeyCert(byte[] value) {
                this.iccPublicKeyCert = value;
            }

            /**
             * Gets the value of the iccPublicKeyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIccPublicKeyExponent() {
                return iccPublicKeyExponent;
            }

            /**
             * Sets the value of the iccPublicKeyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIccPublicKeyExponent(Long value) {
                this.iccPublicKeyExponent = value;
            }

            /**
             * Gets the value of the iccPublicKeyRemainder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIccPublicKeyRemainder() {
                return iccPublicKeyRemainder;
            }

            /**
             * Sets the value of the iccPublicKeyRemainder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccPublicKeyRemainder(byte[] value) {
                this.iccPublicKeyRemainder = value;
            }

            /**
             * Gets the value of the signedDynamicAppData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getSignedDynamicAppData() {
                return signedDynamicAppData;
            }

            /**
             * Sets the value of the signedDynamicAppData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignedDynamicAppData(byte[] value) {
                this.signedDynamicAppData = value;
            }

            /**
             * Gets the value of the iccDynamicNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getIccDynamicNumber() {
                return iccDynamicNumber;
            }

            /**
             * Sets the value of the iccDynamicNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccDynamicNumber(byte[] value) {
                this.iccDynamicNumber = value;
            }

            /**
             * Gets the value of the kernelReaderCaps property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getKernelReaderCaps() {
                return kernelReaderCaps;
            }

            /**
             * Sets the value of the kernelReaderCaps property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setKernelReaderCaps(Long value) {
                this.kernelReaderCaps = value;
            }

            /**
             * Gets the value of the protectedDataEnvelope1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getProtectedDataEnvelope1() {
                return protectedDataEnvelope1;
            }

            /**
             * Sets the value of the protectedDataEnvelope1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedDataEnvelope1(byte[] value) {
                this.protectedDataEnvelope1 = value;
            }

            /**
             * Gets the value of the protectedDataEnvelope2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getProtectedDataEnvelope2() {
                return protectedDataEnvelope2;
            }

            /**
             * Sets the value of the protectedDataEnvelope2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedDataEnvelope2(byte[] value) {
                this.protectedDataEnvelope2 = value;
            }

            /**
             * Gets the value of the protectedDataEnvelope3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getProtectedDataEnvelope3() {
                return protectedDataEnvelope3;
            }

            /**
             * Sets the value of the protectedDataEnvelope3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedDataEnvelope3(byte[] value) {
                this.protectedDataEnvelope3 = value;
            }

            /**
             * Gets the value of the protectedDataEnvelope4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getProtectedDataEnvelope4() {
                return protectedDataEnvelope4;
            }

            /**
             * Sets the value of the protectedDataEnvelope4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedDataEnvelope4(byte[] value) {
                this.protectedDataEnvelope4 = value;
            }

            /**
             * Gets the value of the protectedDataEnvelope5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getProtectedDataEnvelope5() {
                return protectedDataEnvelope5;
            }

            /**
             * Sets the value of the protectedDataEnvelope5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedDataEnvelope5(byte[] value) {
                this.protectedDataEnvelope5 = value;
            }

            /**
             * Gets the value of the unprotectedDataEnvelope1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getUnprotectedDataEnvelope1() {
                return unprotectedDataEnvelope1;
            }

            /**
             * Sets the value of the unprotectedDataEnvelope1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnprotectedDataEnvelope1(byte[] value) {
                this.unprotectedDataEnvelope1 = value;
            }

            /**
             * Gets the value of the unprotectedDataEnvelope2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getUnprotectedDataEnvelope2() {
                return unprotectedDataEnvelope2;
            }

            /**
             * Sets the value of the unprotectedDataEnvelope2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnprotectedDataEnvelope2(byte[] value) {
                this.unprotectedDataEnvelope2 = value;
            }

            /**
             * Gets the value of the unprotectedDataEnvelope3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getUnprotectedDataEnvelope3() {
                return unprotectedDataEnvelope3;
            }

            /**
             * Sets the value of the unprotectedDataEnvelope3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnprotectedDataEnvelope3(byte[] value) {
                this.unprotectedDataEnvelope3 = value;
            }

            /**
             * Gets the value of the unprotectedDataEnvelope4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getUnprotectedDataEnvelope4() {
                return unprotectedDataEnvelope4;
            }

            /**
             * Sets the value of the unprotectedDataEnvelope4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnprotectedDataEnvelope4(byte[] value) {
                this.unprotectedDataEnvelope4 = value;
            }

            /**
             * Gets the value of the unprotectedDataEnvelope5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getUnprotectedDataEnvelope5() {
                return unprotectedDataEnvelope5;
            }

            /**
             * Sets the value of the unprotectedDataEnvelope5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnprotectedDataEnvelope5(byte[] value) {
                this.unprotectedDataEnvelope5 = value;
            }

            /**
             * Gets the value of the responseMessageTemplateFormat2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getResponseMessageTemplateFormat2() {
                return responseMessageTemplateFormat2;
            }

            /**
             * Sets the value of the responseMessageTemplateFormat2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseMessageTemplateFormat2(byte[] value) {
                this.responseMessageTemplateFormat2 = value;
            }

            /**
             * Gets the value of the languagePreference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguagePreference() {
                return languagePreference;
            }

            /**
             * Sets the value of the languagePreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguagePreference(String value) {
                this.languagePreference = value;
            }

            /**
             * Gets the value of the appRefCcy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppRefCcy() {
                return appRefCcy;
            }

            /**
             * Sets the value of the appRefCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppRefCcy(Long value) {
                this.appRefCcy = value;
            }

            /**
             * Gets the value of the appRefCcyExponent property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAppRefCcyExponent() {
                return appRefCcyExponent;
            }

            /**
             * Sets the value of the appRefCcyExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAppRefCcyExponent(Long value) {
                this.appRefCcyExponent = value;
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
         *         &lt;element name="Visa" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Xid" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Mc" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="StaticAav" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Version"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NetworkType" type="{http://schemas.tranzaxis.com/tran-common.xsd}NetworkTypeEnum" /&gt;
         *       &lt;attribute name="Condition"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Eci" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DSTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "visa",
            "mc"
        })
        public static class Tds {

            @XmlElement(name = "Visa")
            protected Token.Card.Tds.Visa visa;
            @XmlElement(name = "Mc")
            protected Token.Card.Tds.Mc mc;
            @XmlAttribute(name = "Version")
            protected String version;
            @XmlAttribute(name = "NetworkType")
            protected String networkType;
            @XmlAttribute(name = "Condition")
            protected String condition;
            @XmlAttribute(name = "Eci")
            protected String eci;
            @XmlAttribute(name = "DSTranId")
            protected String dsTranId;

            /**
             * Gets the value of the visa property.
             * 
             * @return
             *     possible object is
             *     {@link Token.Card.Tds.Visa }
             *     
             */
            public Token.Card.Tds.Visa getVisa() {
                return visa;
            }

            /**
             * Sets the value of the visa property.
             * 
             * @param value
             *     allowed object is
             *     {@link Token.Card.Tds.Visa }
             *     
             */
            public void setVisa(Token.Card.Tds.Visa value) {
                this.visa = value;
            }

            /**
             * Gets the value of the mc property.
             * 
             * @return
             *     possible object is
             *     {@link Token.Card.Tds.Mc }
             *     
             */
            public Token.Card.Tds.Mc getMc() {
                return mc;
            }

            /**
             * Sets the value of the mc property.
             * 
             * @param value
             *     allowed object is
             *     {@link Token.Card.Tds.Mc }
             *     
             */
            public void setMc(Token.Card.Tds.Mc value) {
                this.mc = value;
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
             * Gets the value of the networkType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetworkType() {
                return networkType;
            }

            /**
             * Sets the value of the networkType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetworkType(String value) {
                this.networkType = value;
            }

            /**
             * Gets the value of the condition property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCondition() {
                return condition;
            }

            /**
             * Sets the value of the condition property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCondition(String value) {
                this.condition = value;
            }

            /**
             * Gets the value of the eci property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEci() {
                return eci;
            }

            /**
             * Sets the value of the eci property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEci(String value) {
                this.eci = value;
            }

            /**
             * Gets the value of the dsTranId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSTranId() {
                return dsTranId;
            }

            /**
             * Sets the value of the dsTranId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSTranId(String value) {
                this.dsTranId = value;
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
             *       &lt;attribute name="StaticAav" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Mc {

                @XmlAttribute(name = "StaticAav", required = true)
                protected String staticAav;

                /**
                 * Gets the value of the staticAav property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStaticAav() {
                    return staticAav;
                }

                /**
                 * Sets the value of the staticAav property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStaticAav(String value) {
                    this.staticAav = value;
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
             *       &lt;attribute name="Xid" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
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

                @XmlAttribute(name = "Xid", required = true)
                @XmlJavaTypeAdapter(HexBinaryAdapter.class)
                protected byte[] xid;

                /**
                 * Gets the value of the xid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public byte[] getXid() {
                    return xid;
                }

                /**
                 * Sets the value of the xid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXid(byte[] value) {
                    this.xid = value;
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
     *         &lt;element name="Auth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Static" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
     *                   &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CaName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "auth"
    })
    public static class Cert {

        @XmlElement(name = "Auth")
        protected Token.Cert.Auth auth;
        @XmlAttribute(name = "CaName", required = true)
        protected String caName;
        @XmlAttribute(name = "Rid", required = true)
        protected String rid;

        /**
         * Gets the value of the auth property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Cert.Auth }
         *     
         */
        public Token.Cert.Auth getAuth() {
            return auth;
        }

        /**
         * Sets the value of the auth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Cert.Auth }
         *     
         */
        public void setAuth(Token.Cert.Auth value) {
            this.auth = value;
        }

        /**
         * Gets the value of the caName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaName() {
            return caName;
        }

        /**
         * Sets the value of the caName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaName(String value) {
            this.caName = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Static" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
         *         &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthCert" minOccurs="0"/&gt;
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
            "_static",
            "tran"
        })
        public static class Auth {

            @XmlElement(name = "Static")
            protected AuthCert _static;
            @XmlElement(name = "Tran")
            protected AuthCert tran;

            /**
             * Gets the value of the static property.
             * 
             * @return
             *     possible object is
             *     {@link AuthCert }
             *     
             */
            public AuthCert getStatic() {
                return _static;
            }

            /**
             * Sets the value of the static property.
             * 
             * @param value
             *     allowed object is
             *     {@link AuthCert }
             *     
             */
            public void setStatic(AuthCert value) {
                this._static = value;
            }

            /**
             * Gets the value of the tran property.
             * 
             * @return
             *     possible object is
             *     {@link AuthCert }
             *     
             */
            public AuthCert getTran() {
                return tran;
            }

            /**
             * Sets the value of the tran property.
             * 
             * @param value
             *     allowed object is
             *     {@link AuthCert }
             *     
             */
            public void setTran(AuthCert value) {
                this.tran = value;
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
     *         &lt;element name="Auth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Uri" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="UserGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AuthPeriodStart" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="InvalidAuthAttemptsCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *         &lt;element name="Platform" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="DeviceModel" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="OsName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="OsVersion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Locale" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="TimeZone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="AdvertisingId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="ScreenResolution" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="IpAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Latitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Longitude" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="BrowserJavaEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
     *         &lt;element name="BrowserJavaScriptEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
     *         &lt;element name="BrowserLanguage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="BrowserUserAgent" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="BrowserScreenColorDepth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="BrowserScreenHeight" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="BrowserScreenWidth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IssuingContractExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IssuingContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IssuingContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "auth",
        "uri",
        "userGuid",
        "authPeriodStart",
        "invalidAuthAttemptsCnt",
        "platform",
        "deviceModel",
        "deviceName",
        "osName",
        "osVersion",
        "locale",
        "timeZone",
        "advertisingId",
        "screenResolution",
        "ipAddress",
        "latitude",
        "longitude",
        "browserJavaEnabled",
        "browserJavaScriptEnabled",
        "browserLanguage",
        "browserUserAgent",
        "browserScreenColorDepth",
        "browserScreenHeight",
        "browserScreenWidth"
    })
    public static class DeviceApp {

        @XmlElement(name = "Auth")
        protected Token.DeviceApp.Auth auth;
        @XmlElement(name = "Uri")
        protected String uri;
        @XmlElement(name = "UserGuid")
        protected String userGuid;
        @XmlElement(name = "AuthPeriodStart")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar authPeriodStart;
        @XmlElementRef(name = "InvalidAuthAttemptsCnt", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> invalidAuthAttemptsCnt;
        @XmlElement(name = "Platform")
        protected String platform;
        @XmlElement(name = "DeviceModel")
        protected String deviceModel;
        @XmlElement(name = "DeviceName")
        protected String deviceName;
        @XmlElement(name = "OsName")
        protected String osName;
        @XmlElement(name = "OsVersion")
        protected String osVersion;
        @XmlElement(name = "Locale")
        protected String locale;
        @XmlElement(name = "TimeZone")
        protected String timeZone;
        @XmlElement(name = "AdvertisingId")
        protected String advertisingId;
        @XmlElement(name = "ScreenResolution")
        protected String screenResolution;
        @XmlElement(name = "IpAddress")
        protected String ipAddress;
        @XmlElement(name = "Latitude")
        protected String latitude;
        @XmlElement(name = "Longitude")
        protected String longitude;
        @XmlElementRef(name = "BrowserJavaEnabled", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> browserJavaEnabled;
        @XmlElementRef(name = "BrowserJavaScriptEnabled", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> browserJavaScriptEnabled;
        @XmlElement(name = "BrowserLanguage")
        protected String browserLanguage;
        @XmlElement(name = "BrowserUserAgent")
        protected String browserUserAgent;
        @XmlElement(name = "BrowserScreenColorDepth")
        protected String browserScreenColorDepth;
        @XmlElement(name = "BrowserScreenHeight")
        protected String browserScreenHeight;
        @XmlElement(name = "BrowserScreenWidth")
        protected String browserScreenWidth;
        @XmlAttribute(name = "IssuingContractExtRid")
        protected String issuingContractExtRid;
        @XmlAttribute(name = "IssuingContractRid")
        protected String issuingContractRid;
        @XmlAttribute(name = "IssuingContractId")
        protected Long issuingContractId;

        /**
         * Gets the value of the auth property.
         * 
         * @return
         *     possible object is
         *     {@link Token.DeviceApp.Auth }
         *     
         */
        public Token.DeviceApp.Auth getAuth() {
            return auth;
        }

        /**
         * Sets the value of the auth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.DeviceApp.Auth }
         *     
         */
        public void setAuth(Token.DeviceApp.Auth value) {
            this.auth = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUri() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUri(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the userGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserGuid() {
            return userGuid;
        }

        /**
         * Sets the value of the userGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserGuid(String value) {
            this.userGuid = value;
        }

        /**
         * Gets the value of the authPeriodStart property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAuthPeriodStart() {
            return authPeriodStart;
        }

        /**
         * Sets the value of the authPeriodStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAuthPeriodStart(XMLGregorianCalendar value) {
            this.authPeriodStart = value;
        }

        /**
         * Gets the value of the invalidAuthAttemptsCnt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getInvalidAuthAttemptsCnt() {
            return invalidAuthAttemptsCnt;
        }

        /**
         * Sets the value of the invalidAuthAttemptsCnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setInvalidAuthAttemptsCnt(JAXBElement<Long> value) {
            this.invalidAuthAttemptsCnt = value;
        }

        /**
         * Gets the value of the platform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatform() {
            return platform;
        }

        /**
         * Sets the value of the platform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatform(String value) {
            this.platform = value;
        }

        /**
         * Gets the value of the deviceModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceModel() {
            return deviceModel;
        }

        /**
         * Sets the value of the deviceModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceModel(String value) {
            this.deviceModel = value;
        }

        /**
         * Gets the value of the deviceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceName() {
            return deviceName;
        }

        /**
         * Sets the value of the deviceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceName(String value) {
            this.deviceName = value;
        }

        /**
         * Gets the value of the osName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOsName() {
            return osName;
        }

        /**
         * Sets the value of the osName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOsName(String value) {
            this.osName = value;
        }

        /**
         * Gets the value of the osVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOsVersion() {
            return osVersion;
        }

        /**
         * Sets the value of the osVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOsVersion(String value) {
            this.osVersion = value;
        }

        /**
         * Gets the value of the locale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocale() {
            return locale;
        }

        /**
         * Sets the value of the locale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocale(String value) {
            this.locale = value;
        }

        /**
         * Gets the value of the timeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeZone() {
            return timeZone;
        }

        /**
         * Sets the value of the timeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeZone(String value) {
            this.timeZone = value;
        }

        /**
         * Gets the value of the advertisingId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvertisingId() {
            return advertisingId;
        }

        /**
         * Sets the value of the advertisingId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvertisingId(String value) {
            this.advertisingId = value;
        }

        /**
         * Gets the value of the screenResolution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScreenResolution() {
            return screenResolution;
        }

        /**
         * Sets the value of the screenResolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScreenResolution(String value) {
            this.screenResolution = value;
        }

        /**
         * Gets the value of the ipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpAddress() {
            return ipAddress;
        }

        /**
         * Sets the value of the ipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpAddress(String value) {
            this.ipAddress = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the browserJavaEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getBrowserJavaEnabled() {
            return browserJavaEnabled;
        }

        /**
         * Sets the value of the browserJavaEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setBrowserJavaEnabled(JAXBElement<Boolean> value) {
            this.browserJavaEnabled = value;
        }

        /**
         * Gets the value of the browserJavaScriptEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getBrowserJavaScriptEnabled() {
            return browserJavaScriptEnabled;
        }

        /**
         * Sets the value of the browserJavaScriptEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setBrowserJavaScriptEnabled(JAXBElement<Boolean> value) {
            this.browserJavaScriptEnabled = value;
        }

        /**
         * Gets the value of the browserLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserLanguage() {
            return browserLanguage;
        }

        /**
         * Sets the value of the browserLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserLanguage(String value) {
            this.browserLanguage = value;
        }

        /**
         * Gets the value of the browserUserAgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserUserAgent() {
            return browserUserAgent;
        }

        /**
         * Sets the value of the browserUserAgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserUserAgent(String value) {
            this.browserUserAgent = value;
        }

        /**
         * Gets the value of the browserScreenColorDepth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserScreenColorDepth() {
            return browserScreenColorDepth;
        }

        /**
         * Sets the value of the browserScreenColorDepth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserScreenColorDepth(String value) {
            this.browserScreenColorDepth = value;
        }

        /**
         * Gets the value of the browserScreenHeight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserScreenHeight() {
            return browserScreenHeight;
        }

        /**
         * Sets the value of the browserScreenHeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserScreenHeight(String value) {
            this.browserScreenHeight = value;
        }

        /**
         * Gets the value of the browserScreenWidth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserScreenWidth() {
            return browserScreenWidth;
        }

        /**
         * Sets the value of the browserScreenWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserScreenWidth(String value) {
            this.browserScreenWidth = value;
        }

        /**
         * Gets the value of the issuingContractExtRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuingContractExtRid() {
            return issuingContractExtRid;
        }

        /**
         * Sets the value of the issuingContractExtRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuingContractExtRid(String value) {
            this.issuingContractExtRid = value;
        }

        /**
         * Gets the value of the issuingContractRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuingContractRid() {
            return issuingContractRid;
        }

        /**
         * Sets the value of the issuingContractRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuingContractRid(String value) {
            this.issuingContractRid = value;
        }

        /**
         * Gets the value of the issuingContractId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getIssuingContractId() {
            return issuingContractId;
        }

        /**
         * Sets the value of the issuingContractId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setIssuingContractId(Long value) {
            this.issuingContractId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Auth
            extends AuthSecret
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
     *       &lt;attribute name="AppURL" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AppLabel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtAuthApp {

        @XmlAttribute(name = "AppURL")
        protected String appURL;
        @XmlAttribute(name = "AppLabel")
        protected String appLabel;
        @XmlAttribute(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the appURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppURL() {
            return appURL;
        }

        /**
         * Sets the value of the appURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppURL(String value) {
            this.appURL = value;
        }

        /**
         * Gets the value of the appLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppLabel() {
            return appLabel;
        }

        /**
         * Sets the value of the appLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppLabel(String value) {
            this.appLabel = value;
        }

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
     *         &lt;element name="Auth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LoginName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "auth"
    })
    public static class Login {

        @XmlElement(name = "Auth")
        protected Token.Login.Auth auth;
        @XmlAttribute(name = "LoginName", required = true)
        protected String loginName;

        /**
         * Gets the value of the auth property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Login.Auth }
         *     
         */
        public Token.Login.Auth getAuth() {
            return auth;
        }

        /**
         * Sets the value of the auth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Login.Auth }
         *     
         */
        public void setAuth(Token.Login.Auth value) {
            this.auth = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}AuthSecret"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Auth
            extends AuthSecret
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
     *       &lt;attribute name="Number" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Phone {

        @XmlAttribute(name = "Number", required = true)
        protected String number;

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
     *         &lt;element name="Auth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Part" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "auth"
    })
    public static class Secret {

        @XmlElement(name = "Auth")
        protected Token.Secret.Auth auth;
        @XmlAttribute(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the auth property.
         * 
         * @return
         *     possible object is
         *     {@link Token.Secret.Auth }
         *     
         */
        public Token.Secret.Auth getAuth() {
            return auth;
        }

        /**
         * Sets the value of the auth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Token.Secret.Auth }
         *     
         */
        public void setAuth(Token.Secret.Auth value) {
            this.auth = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Part" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Auth {

            @XmlAttribute(name = "Value", required = true)
            protected String value;
            @XmlAttribute(name = "Part")
            protected String part;

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
             * Gets the value of the part property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPart() {
                return part;
            }

            /**
             * Sets the value of the part property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPart(String value) {
                this.part = value;
            }

        }

    }

}
