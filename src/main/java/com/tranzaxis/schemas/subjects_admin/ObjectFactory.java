
package com.tranzaxis.schemas.subjects_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import org.radixware.schemas.common.UserProps;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.subjects_admin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Person");
    private final static QName _Organization_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Organization");
    private final static QName _Corporation_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Corporation");
    private final static QName _CorporationBankProperty_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CorporationBankProperty");
    private final static QName _Department_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Department");
    private final static QName _ExtCard_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ExtCard");
    private final static QName _Subject_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Subject");
    private final static QName _TrustedPayee_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TrustedPayee");
    private final static QName _TrustedPayees_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TrustedPayees");
    private final static QName _SubjectBaseRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Rid");
    private final static QName _SubjectBaseInstId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "InstId");
    private final static QName _SubjectBaseInstName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "InstName");
    private final static QName _SubjectBaseBranchId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BranchId");
    private final static QName _SubjectBaseBranchName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BranchName");
    private final static QName _SubjectBaseBranchCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BranchCode");
    private final static QName _SubjectBaseStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Status");
    private final static QName _SubjectBaseShareFraction_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ShareFraction");
    private final static QName _SubjectBaseExtQualCat_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ExtQualCat");
    private final static QName _SubjectBaseNotes_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Notes");
    private final static QName _SubjectBaseRiskLevel_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RiskLevel");
    private final static QName _SubjectBaseLanguageCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LanguageCode");
    private final static QName _SubjectBaseCommunicationLocale_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CommunicationLocale");
    private final static QName _SubjectBaseTimeZone_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TimeZone");
    private final static QName _SubjectBaseExtraData_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ExtraData");
    private final static QName _SubjectBaseSstPreferencies_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SstPreferencies");
    private final static QName _SubjectBaseMailAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MailAddress");
    private final static QName _SubjectBaseMailAddressLat_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MailAddressLat");
    private final static QName _SubjectBaseStartTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "StartTime");
    private final static QName _SubjectBaseSubjectContactAddresses_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectContactAddresses");
    private final static QName _SubjectBaseSubjectDocuments_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectDocuments");
    private final static QName _SubjectBaseSubjectEstates_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectEstates");
    private final static QName _SubjectBaseSubjectNetworkSpecifics_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectNetworkSpecifics");
    private final static QName _SubjectBaseSubjectNotes_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectNotes");
    private final static QName _SubjectBaseInSubjects_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "InSubjects");
    private final static QName _SubjectBaseOutSubjects_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "OutSubjects");
    private final static QName _SubjectBaseSubjectApplications_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubjectApplications");
    private final static QName _SubjectBaseAuthQAs_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "AuthQAs");
    private final static QName _SubjectBaseRcMoratoriums_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RcMoratoriums");
    private final static QName _SubjectBaseUserProps_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "UserProps");
    private final static QName _SubjectBaseAttachments_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Attachments");
    private final static QName _NetworkSpecificSingleMerchantRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SingleMerchantRid");
    private final static QName _NetworkSpecificSubMerchantRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SubMerchantRid");
    private final static QName _NetworkSpecificDwoRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "DwoRid");
    private final static QName _NetworkSpecificFeeProgramIndicators_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "FeeProgramIndicators");
    private final static QName _NetworkSpecificTitle_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Title");
    private final static QName _NetworkSpecificMccId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MccId");
    private final static QName _NetworkSpecificFloorLimit_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "FloorLimit");
    private final static QName _NetworkSpecificLocationCode2_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LocationCode2");
    private final static QName _NetworkSpecificBaseDiscountRate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BaseDiscountRate");
    private final static QName _NetworkSpecificRiskIndicator_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RiskIndicator");
    private final static QName _NetworkSpecificRoleTypeCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RoleTypeCode");
    private final static QName _NetworkSpecificAmexStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "AmexStatus");
    private final static QName _NetworkSpecificMotoFlag_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MotoFlag");
    private final static QName _NetworkSpecificAgentCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "AgentCode");
    private final static QName _NetworkSpecificReason_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Reason");
    private final static QName _NetworkSpecificStateCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "StateCode");
    private final static QName _NetworkSpecificMerchantCapability_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MerchantCapability");
    private final static QName _NetworkSpecificMerchantQrcCapability_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MerchantQrcCapability");
    private final static QName _NetworkSpecificMerchantVerificationValue_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MerchantVerificationValue");
    private final static QName _NetworkSpecificEtuRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuRid");
    private final static QName _NetworkSpecificEtuStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuStatus");
    private final static QName _NetworkSpecificEtuRegistered_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuRegistered");
    private final static QName _NetworkSpecificEtuUnregistered_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuUnregistered");
    private final static QName _NetworkSpecificEtuStatusUpdTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuStatusUpdTime");
    private final static QName _NetworkSpecificEtuInquiryEnable_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuInquiryEnable");
    private final static QName _NetworkSpecificIsMoto_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IsMoto");
    private final static QName _NetworkSpecificIsEcommerce_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IsEcommerce");
    private final static QName _NetworkSpecificIsSeasonal_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IsSeasonal");
    private final static QName _NetworkSpecificCorporateStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CorporateStatus");
    private final static QName _NetworkSpecificVisaDebitAcceptance_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "VisaDebitAcceptance");
    private final static QName _NetworkSpecificVisaPayWaveAcceptance_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "VisaPayWaveAcceptance");
    private final static QName _NetworkSpecificVisaProductAcceptance_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "VisaProductAcceptance");
    private final static QName _NetworkSpecificMerchantRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MerchantRid");
    private final static QName _NetworkSpecificRegisterStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RegisterStatus");
    private final static QName _NetworkSpecificRegisterRequestRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RegisterRequestRid");
    private final static QName _NetworkSpecificRegisteredContracts_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RegisteredContracts");
    private final static QName _NetworkSpecificFacilitatorKind_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "FacilitatorKind");
    private final static QName _LinkedSubjectSubject1Title_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Subject1Title");
    private final static QName _LinkedSubjectSubject2Title_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Subject2Title");
    private final static QName _LinkedSubjectEndTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EndTime");
    private final static QName _LinkedSubjectEmployeeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EmployeeRid");
    private final static QName _LinkedSubjectEmployeeCategory_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EmployeeCategory");
    private final static QName _LinkedSubjectWorkPosition_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkPosition");
    private final static QName _LinkedSubjectWorkPhone_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkPhone");
    private final static QName _LinkedSubjectWorkFax_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkFax");
    private final static QName _LinkedSubjectWorkMobilePhone_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkMobilePhone");
    private final static QName _LinkedSubjectWorkEmail_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkEmail");
    private final static QName _LinkedSubjectWorkMailAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkMailAddress");
    private final static QName _NoteText_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Text");
    private final static QName _EstateCost_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Cost");
    private final static QName _EstateCostCcy_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CostCcy");
    private final static QName _EstateLiquidity_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Liquidity");
    private final static QName _DocumentSeries_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Series");
    private final static QName _DocumentExpDate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ExpDate");
    private final static QName _DocumentIssuerId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IssuerId");
    private final static QName _DocumentIssuer_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Issuer");
    private final static QName _DocumentIssuerRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IssuerRid");
    private final static QName _DocumentCountryId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CountryId");
    private final static QName _DocumentRegionRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RegionRid");
    private final static QName _DocumentDescription1_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Description1");
    private final static QName _DocumentDescription2_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Description2");
    private final static QName _DocumentDescription3_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Description3");
    private final static QName _DocumentIssueDate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IssueDate");
    private final static QName _ContactAddressAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Address");
    private final static QName _TrustedPayeeInitTranId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "InitTranId");
    private final static QName _TrustedPayeeInitInvoiceId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "InitInvoiceId");
    private final static QName _TrustedPayeeCreateTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CreateTime");
    private final static QName _TrustedPayeeLastActiveChangeTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LastActiveChangeTime");
    private final static QName _ExtCardMbr_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Mbr");
    private final static QName _ExtCardPvv_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Pvv");
    private final static QName _ExtCardPvki_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Pvki");
    private final static QName _ExtCardCheckTranId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CheckTranId");
    private final static QName _ExtCardActivateTill_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ActivateTill");
    private final static QName _ExtCardBinNetworkId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BinNetworkId");
    private final static QName _ExtCardSettleContractId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "SettleContractId");
    private final static QName _ExtCardEtuStatusDesc_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuStatusDesc");
    private final static QName _ExtCardEtuStatusReqTime_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EtuStatusReqTime");
    private final static QName _OrganizationLegalTitle_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LegalTitle");
    private final static QName _OrganizationLatTitle_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LatTitle");
    private final static QName _OrganizationShortTitle_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ShortTitle");
    private final static QName _OrganizationOwnerTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "OwnerTypeId");
    private final static QName _OrganizationOwnerTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "OwnerTypeRid");
    private final static QName _OrganizationParentOrgId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ParentOrgId");
    private final static QName _OrganizationParentOrgRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ParentOrgRid");
    private final static QName _OrganizationParentOrgMustExist_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ParentOrgMustExist");
    private final static QName _OrganizationLegalTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LegalTypeId");
    private final static QName _OrganizationLegalTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LegalTypeRid");
    private final static QName _OrganizationQualityCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "QualityCode");
    private final static QName _OrganizationLocationCode_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LocationCode");
    private final static QName _OrganizationCancelledDate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CancelledDate");
    private final static QName _OrganizationReinstatedDate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ReinstatedDate");
    private final static QName _OrganizationWorkScheduleId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkScheduleId");
    private final static QName _OrganizationLegalAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LegalAddress");
    private final static QName _CorporationCorporationBankProps_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CorporationBankProps");
    private final static QName _PersonLastNameLat_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "LastNameLat");
    private final static QName _PersonFirstName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "FirstName");
    private final static QName _PersonFirstNameLat_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "FirstNameLat");
    private final static QName _PersonMiddleName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MiddleName");
    private final static QName _PersonMiddleNameLat_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MiddleNameLat");
    private final static QName _PersonTitleTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TitleTypeId");
    private final static QName _PersonTitleTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TitleTypeRid");
    private final static QName _PersonTitle2TypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Title2TypeId");
    private final static QName _PersonTitle2TypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Title2TypeRid");
    private final static QName _PersonTitleSuffixTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TitleSuffixTypeId");
    private final static QName _PersonGender_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Gender");
    private final static QName _PersonMaritalStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MaritalStatus");
    private final static QName _PersonChildrenCnt_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ChildrenCnt");
    private final static QName _PersonBirthDate_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BirthDate");
    private final static QName _PersonBirthPlace_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BirthPlace");
    private final static QName _PersonBirthName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BirthName");
    private final static QName _PersonEducationTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EducationTypeId");
    private final static QName _PersonEducationTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EducationTypeRid");
    private final static QName _PersonOccupationTypeId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "OccupationTypeId");
    private final static QName _PersonOccupationTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "OccupationTypeRid");
    private final static QName _PersonEmploymentStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EmploymentStatus");
    private final static QName _PersonEmployerTitle_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "EmployerTitle");
    private final static QName _PersonResidentialStatus_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ResidentialStatus");
    private final static QName _PersonCurResidenceDuration_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CurResidenceDuration");
    private final static QName _PersonRentMortgagePayAmt_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RentMortgagePayAmt");
    private final static QName _PersonRentMortgagePayCcy_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RentMortgagePayCcy");
    private final static QName _PersonCitizenshipId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "CitizenshipId");
    private final static QName _PersonExtraCitizenship_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ExtraCitizenship");
    private final static QName _PersonResidenceCountryId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ResidenceCountryId");
    private final static QName _PersonRegAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "RegAddress");
    private final static QName _PersonHomeAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "HomeAddress");
    private final static QName _PersonHomeAddress2_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "HomeAddress2");
    private final static QName _PersonBirthAddress_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "BirthAddress");
    private final static QName _PersonTwitterScreenName_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "TwitterScreenName");
    private final static QName _PersonEmails_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Emails");
    private final static QName _PersonMobilePhones_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "MobilePhones");
    private final static QName _PersonWorkPhones_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "WorkPhones");
    private final static QName _PersonIncome_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "Income");
    private final static QName _PersonIncomeCcy_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "IncomeCcy");
    private final static QName _PersonProfileId_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ProfileId");
    private final static QName _PersonProfileRid_QNAME = new QName("http://schemas.tranzaxis.com/subjects-admin.xsd", "ProfileRid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.subjects_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectBase }
     * 
     */
    public SubjectBase createSubjectBase() {
        return new SubjectBase();
    }

    /**
     * Create an instance of {@link NetworkSpecific }
     * 
     */
    public NetworkSpecific createNetworkSpecific() {
        return new NetworkSpecific();
    }

    /**
     * Create an instance of {@link Corporation }
     * 
     */
    public Corporation createCorporation() {
        return new Corporation();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link CorporationBankProperty }
     * 
     */
    public CorporationBankProperty createCorporationBankProperty() {
        return new CorporationBankProperty();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link ExtCard }
     * 
     */
    public ExtCard createExtCard() {
        return new ExtCard();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link TrustedPayee }
     * 
     */
    public TrustedPayee createTrustedPayee() {
        return new TrustedPayee();
    }

    /**
     * Create an instance of {@link TrustedPayees }
     * 
     */
    public TrustedPayees createTrustedPayees() {
        return new TrustedPayees();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.subjects_admin.ContactAddress }
     * 
     */
    public com.tranzaxis.schemas.subjects_admin.ContactAddress createContactAddress() {
        return new com.tranzaxis.schemas.subjects_admin.ContactAddress();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Estate }
     * 
     */
    public Estate createEstate() {
        return new Estate();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link LinkedSubject }
     * 
     */
    public LinkedSubject createLinkedSubject() {
        return new LinkedSubject();
    }

    /**
     * Create an instance of {@link AuthQA }
     * 
     */
    public AuthQA createAuthQA() {
        return new AuthQA();
    }

    /**
     * Create an instance of {@link PaymentTemplate }
     * 
     */
    public PaymentTemplate createPaymentTemplate() {
        return new PaymentTemplate();
    }

    /**
     * Create an instance of {@link PaymentTemplates }
     * 
     */
    public PaymentTemplates createPaymentTemplates() {
        return new PaymentTemplates();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectContactAddresses }
     * 
     */
    public SubjectBase.SubjectContactAddresses createSubjectBaseSubjectContactAddresses() {
        return new SubjectBase.SubjectContactAddresses();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectDocuments }
     * 
     */
    public SubjectBase.SubjectDocuments createSubjectBaseSubjectDocuments() {
        return new SubjectBase.SubjectDocuments();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectEstates }
     * 
     */
    public SubjectBase.SubjectEstates createSubjectBaseSubjectEstates() {
        return new SubjectBase.SubjectEstates();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectNetworkSpecifics }
     * 
     */
    public SubjectBase.SubjectNetworkSpecifics createSubjectBaseSubjectNetworkSpecifics() {
        return new SubjectBase.SubjectNetworkSpecifics();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectNotes }
     * 
     */
    public SubjectBase.SubjectNotes createSubjectBaseSubjectNotes() {
        return new SubjectBase.SubjectNotes();
    }

    /**
     * Create an instance of {@link SubjectBase.InSubjects }
     * 
     */
    public SubjectBase.InSubjects createSubjectBaseInSubjects() {
        return new SubjectBase.InSubjects();
    }

    /**
     * Create an instance of {@link SubjectBase.OutSubjects }
     * 
     */
    public SubjectBase.OutSubjects createSubjectBaseOutSubjects() {
        return new SubjectBase.OutSubjects();
    }

    /**
     * Create an instance of {@link SubjectBase.SubjectApplications }
     * 
     */
    public SubjectBase.SubjectApplications createSubjectBaseSubjectApplications() {
        return new SubjectBase.SubjectApplications();
    }

    /**
     * Create an instance of {@link SubjectBase.AuthQAs }
     * 
     */
    public SubjectBase.AuthQAs createSubjectBaseAuthQAs() {
        return new SubjectBase.AuthQAs();
    }

    /**
     * Create an instance of {@link NetworkSpecific.RegisteredContracts }
     * 
     */
    public NetworkSpecific.RegisteredContracts createNetworkSpecificRegisteredContracts() {
        return new NetworkSpecific.RegisteredContracts();
    }

    /**
     * Create an instance of {@link Corporation.CorporationBankProps }
     * 
     */
    public Corporation.CorporationBankProps createCorporationCorporationBankProps() {
        return new Corporation.CorporationBankProps();
    }

    /**
     * Create an instance of {@link Person.ExtraCitizenship }
     * 
     */
    public Person.ExtraCitizenship createPersonExtraCitizenship() {
        return new Person.ExtraCitizenship();
    }

    /**
     * Create an instance of {@link Person.Emails }
     * 
     */
    public Person.Emails createPersonEmails() {
        return new Person.Emails();
    }

    /**
     * Create an instance of {@link Person.MobilePhones }
     * 
     */
    public Person.MobilePhones createPersonMobilePhones() {
        return new Person.MobilePhones();
    }

    /**
     * Create an instance of {@link Person.WorkPhones }
     * 
     */
    public Person.WorkPhones createPersonWorkPhones() {
        return new Person.WorkPhones();
    }

    /**
     * Create an instance of {@link Person.Restrictions }
     * 
     */
    public Person.Restrictions createPersonRestrictions() {
        return new Person.Restrictions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Corporation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Corporation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Corporation")
    public JAXBElement<Corporation> createCorporation(Corporation value) {
        return new JAXBElement<Corporation>(_Corporation_QNAME, Corporation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporationBankProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CorporationBankProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CorporationBankProperty")
    public JAXBElement<CorporationBankProperty> createCorporationBankProperty(CorporationBankProperty value) {
        return new JAXBElement<CorporationBankProperty>(_CorporationBankProperty_QNAME, CorporationBankProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Department }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Department")
    public JAXBElement<Department> createDepartment(Department value) {
        return new JAXBElement<Department>(_Department_QNAME, Department.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtCard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtCard }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExtCard")
    public JAXBElement<ExtCard> createExtCard(ExtCard value) {
        return new JAXBElement<ExtCard>(_ExtCard_QNAME, ExtCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedPayee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrustedPayee }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TrustedPayee")
    public JAXBElement<TrustedPayee> createTrustedPayee(TrustedPayee value) {
        return new JAXBElement<TrustedPayee>(_TrustedPayee_QNAME, TrustedPayee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedPayees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrustedPayees }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TrustedPayees")
    public JAXBElement<TrustedPayees> createTrustedPayees(TrustedPayees value) {
        return new JAXBElement<TrustedPayees>(_TrustedPayees_QNAME, TrustedPayees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Rid", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseRid(String value) {
        return new JAXBElement<String>(_SubjectBaseRid_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "InstId", scope = SubjectBase.class)
    public JAXBElement<Long> createSubjectBaseInstId(Long value) {
        return new JAXBElement<Long>(_SubjectBaseInstId_QNAME, Long.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "InstName", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseInstName(String value) {
        return new JAXBElement<String>(_SubjectBaseInstName_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BranchId", scope = SubjectBase.class)
    public JAXBElement<Long> createSubjectBaseBranchId(Long value) {
        return new JAXBElement<Long>(_SubjectBaseBranchId_QNAME, Long.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BranchName", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseBranchName(String value) {
        return new JAXBElement<String>(_SubjectBaseBranchName_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BranchCode", scope = SubjectBase.class)
    public JAXBElement<Long> createSubjectBaseBranchCode(Long value) {
        return new JAXBElement<Long>(_SubjectBaseBranchCode_QNAME, Long.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Status", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseStatus(String value) {
        return new JAXBElement<String>(_SubjectBaseStatus_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ShareFraction", scope = SubjectBase.class)
    public JAXBElement<BigDecimal> createSubjectBaseShareFraction(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SubjectBaseShareFraction_QNAME, BigDecimal.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExtQualCat", scope = SubjectBase.class)
    public JAXBElement<Long> createSubjectBaseExtQualCat(Long value) {
        return new JAXBElement<Long>(_SubjectBaseExtQualCat_QNAME, Long.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Notes", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseNotes(String value) {
        return new JAXBElement<String>(_SubjectBaseNotes_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RiskLevel", scope = SubjectBase.class)
    public JAXBElement<Long> createSubjectBaseRiskLevel(Long value) {
        return new JAXBElement<Long>(_SubjectBaseRiskLevel_QNAME, Long.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LanguageCode", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseLanguageCode(String value) {
        return new JAXBElement<String>(_SubjectBaseLanguageCode_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CommunicationLocale", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseCommunicationLocale(String value) {
        return new JAXBElement<String>(_SubjectBaseCommunicationLocale_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TimeZone", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseTimeZone(String value) {
        return new JAXBElement<String>(_SubjectBaseTimeZone_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExtraData", scope = SubjectBase.class)
    public JAXBElement<Object> createSubjectBaseExtraData(Object value) {
        return new JAXBElement<Object>(_SubjectBaseExtraData_QNAME, Object.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SstPreferencies", scope = SubjectBase.class)
    public JAXBElement<Object> createSubjectBaseSstPreferencies(Object value) {
        return new JAXBElement<Object>(_SubjectBaseSstPreferencies_QNAME, Object.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MailAddress", scope = SubjectBase.class)
    public JAXBElement<MailAddress> createSubjectBaseMailAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_SubjectBaseMailAddress_QNAME, MailAddress.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MailAddressLat", scope = SubjectBase.class)
    public JAXBElement<String> createSubjectBaseMailAddressLat(String value) {
        return new JAXBElement<String>(_SubjectBaseMailAddressLat_QNAME, String.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "StartTime", scope = SubjectBase.class)
    public JAXBElement<XMLGregorianCalendar> createSubjectBaseStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SubjectBaseStartTime_QNAME, XMLGregorianCalendar.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectContactAddresses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectContactAddresses }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectContactAddresses", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectContactAddresses> createSubjectBaseSubjectContactAddresses(SubjectBase.SubjectContactAddresses value) {
        return new JAXBElement<SubjectBase.SubjectContactAddresses>(_SubjectBaseSubjectContactAddresses_QNAME, SubjectBase.SubjectContactAddresses.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectDocuments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectDocuments }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectDocuments", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectDocuments> createSubjectBaseSubjectDocuments(SubjectBase.SubjectDocuments value) {
        return new JAXBElement<SubjectBase.SubjectDocuments>(_SubjectBaseSubjectDocuments_QNAME, SubjectBase.SubjectDocuments.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectEstates }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectEstates }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectEstates", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectEstates> createSubjectBaseSubjectEstates(SubjectBase.SubjectEstates value) {
        return new JAXBElement<SubjectBase.SubjectEstates>(_SubjectBaseSubjectEstates_QNAME, SubjectBase.SubjectEstates.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNetworkSpecifics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNetworkSpecifics }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectNetworkSpecifics", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectNetworkSpecifics> createSubjectBaseSubjectNetworkSpecifics(SubjectBase.SubjectNetworkSpecifics value) {
        return new JAXBElement<SubjectBase.SubjectNetworkSpecifics>(_SubjectBaseSubjectNetworkSpecifics_QNAME, SubjectBase.SubjectNetworkSpecifics.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNotes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectNotes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectNotes", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectNotes> createSubjectBaseSubjectNotes(SubjectBase.SubjectNotes value) {
        return new JAXBElement<SubjectBase.SubjectNotes>(_SubjectBaseSubjectNotes_QNAME, SubjectBase.SubjectNotes.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.InSubjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.InSubjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "InSubjects", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.InSubjects> createSubjectBaseInSubjects(SubjectBase.InSubjects value) {
        return new JAXBElement<SubjectBase.InSubjects>(_SubjectBaseInSubjects_QNAME, SubjectBase.InSubjects.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.OutSubjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.OutSubjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "OutSubjects", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.OutSubjects> createSubjectBaseOutSubjects(SubjectBase.OutSubjects value) {
        return new JAXBElement<SubjectBase.OutSubjects>(_SubjectBaseOutSubjects_QNAME, SubjectBase.OutSubjects.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectApplications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.SubjectApplications }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubjectApplications", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.SubjectApplications> createSubjectBaseSubjectApplications(SubjectBase.SubjectApplications value) {
        return new JAXBElement<SubjectBase.SubjectApplications>(_SubjectBaseSubjectApplications_QNAME, SubjectBase.SubjectApplications.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectBase.AuthQAs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectBase.AuthQAs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "AuthQAs", scope = SubjectBase.class)
    public JAXBElement<SubjectBase.AuthQAs> createSubjectBaseAuthQAs(SubjectBase.AuthQAs value) {
        return new JAXBElement<SubjectBase.AuthQAs>(_SubjectBaseAuthQAs_QNAME, SubjectBase.AuthQAs.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RcMoratoriums", scope = SubjectBase.class)
    public JAXBElement<RcMoratoriums> createSubjectBaseRcMoratoriums(RcMoratoriums value) {
        return new JAXBElement<RcMoratoriums>(_SubjectBaseRcMoratoriums_QNAME, RcMoratoriums.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "UserProps", scope = SubjectBase.class)
    public JAXBElement<UserProps> createSubjectBaseUserProps(UserProps value) {
        return new JAXBElement<UserProps>(_SubjectBaseUserProps_QNAME, UserProps.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Attachments", scope = SubjectBase.class)
    public JAXBElement<Attachments> createSubjectBaseAttachments(Attachments value) {
        return new JAXBElement<Attachments>(_SubjectBaseAttachments_QNAME, Attachments.class, SubjectBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SingleMerchantRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificSingleMerchantRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificSingleMerchantRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SubMerchantRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificSubMerchantRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificSubMerchantRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "DwoRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificDwoRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificDwoRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "FeeProgramIndicators", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificFeeProgramIndicators(String value) {
        return new JAXBElement<String>(_NetworkSpecificFeeProgramIndicators_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificTitle(String value) {
        return new JAXBElement<String>(_NetworkSpecificTitle_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Rid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificRid(String value) {
        return new JAXBElement<String>(_SubjectBaseRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MccId", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificMccId(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificMccId_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "FloorLimit", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificFloorLimit(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificFloorLimit_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LocationCode2", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificLocationCode2(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificLocationCode2_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BaseDiscountRate", scope = NetworkSpecific.class)
    public JAXBElement<BigDecimal> createNetworkSpecificBaseDiscountRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NetworkSpecificBaseDiscountRate_QNAME, BigDecimal.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RiskIndicator", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificRiskIndicator(String value) {
        return new JAXBElement<String>(_NetworkSpecificRiskIndicator_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RoleTypeCode", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificRoleTypeCode(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificRoleTypeCode_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "AmexStatus", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificAmexStatus(String value) {
        return new JAXBElement<String>(_NetworkSpecificAmexStatus_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Status", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificStatus(String value) {
        return new JAXBElement<String>(_SubjectBaseStatus_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MotoFlag", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificMotoFlag(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificMotoFlag_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "AgentCode", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificAgentCode(String value) {
        return new JAXBElement<String>(_NetworkSpecificAgentCode_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Reason", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificReason(String value) {
        return new JAXBElement<String>(_NetworkSpecificReason_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "StateCode", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificStateCode(String value) {
        return new JAXBElement<String>(_NetworkSpecificStateCode_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MerchantCapability", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificMerchantCapability(String value) {
        return new JAXBElement<String>(_NetworkSpecificMerchantCapability_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MerchantQrcCapability", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificMerchantQrcCapability(String value) {
        return new JAXBElement<String>(_NetworkSpecificMerchantQrcCapability_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MerchantVerificationValue", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificMerchantVerificationValue(String value) {
        return new JAXBElement<String>(_NetworkSpecificMerchantVerificationValue_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificEtuRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificEtuRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatus", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificEtuStatus(String value) {
        return new JAXBElement<String>(_NetworkSpecificEtuStatus_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuRegistered", scope = NetworkSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createNetworkSpecificEtuRegistered(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NetworkSpecificEtuRegistered_QNAME, XMLGregorianCalendar.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuUnregistered", scope = NetworkSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createNetworkSpecificEtuUnregistered(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NetworkSpecificEtuUnregistered_QNAME, XMLGregorianCalendar.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatusUpdTime", scope = NetworkSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createNetworkSpecificEtuStatusUpdTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NetworkSpecificEtuStatusUpdTime_QNAME, XMLGregorianCalendar.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuInquiryEnable", scope = NetworkSpecific.class)
    public JAXBElement<Boolean> createNetworkSpecificEtuInquiryEnable(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkSpecificEtuInquiryEnable_QNAME, Boolean.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IsMoto", scope = NetworkSpecific.class)
    public JAXBElement<Boolean> createNetworkSpecificIsMoto(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkSpecificIsMoto_QNAME, Boolean.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IsEcommerce", scope = NetworkSpecific.class)
    public JAXBElement<Boolean> createNetworkSpecificIsEcommerce(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkSpecificIsEcommerce_QNAME, Boolean.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IsSeasonal", scope = NetworkSpecific.class)
    public JAXBElement<Boolean> createNetworkSpecificIsSeasonal(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkSpecificIsSeasonal_QNAME, Boolean.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CorporateStatus", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificCorporateStatus(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificCorporateStatus_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "VisaDebitAcceptance", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificVisaDebitAcceptance(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificVisaDebitAcceptance_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "VisaPayWaveAcceptance", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificVisaPayWaveAcceptance(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificVisaPayWaveAcceptance_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "VisaProductAcceptance", scope = NetworkSpecific.class)
    public JAXBElement<Long> createNetworkSpecificVisaProductAcceptance(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificVisaProductAcceptance_QNAME, Long.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MerchantRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificMerchantRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificMerchantRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RegisterStatus", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificRegisterStatus(String value) {
        return new JAXBElement<String>(_NetworkSpecificRegisterStatus_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RegisterRequestRid", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificRegisterRequestRid(String value) {
        return new JAXBElement<String>(_NetworkSpecificRegisterRequestRid_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkSpecific.RegisteredContracts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkSpecific.RegisteredContracts }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RegisteredContracts", scope = NetworkSpecific.class)
    public JAXBElement<NetworkSpecific.RegisteredContracts> createNetworkSpecificRegisteredContracts(NetworkSpecific.RegisteredContracts value) {
        return new JAXBElement<NetworkSpecific.RegisteredContracts>(_NetworkSpecificRegisteredContracts_QNAME, NetworkSpecific.RegisteredContracts.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "FacilitatorKind", scope = NetworkSpecific.class)
    public JAXBElement<String> createNetworkSpecificFacilitatorKind(String value) {
        return new JAXBElement<String>(_NetworkSpecificFacilitatorKind_QNAME, String.class, NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Subject1Title", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectSubject1Title(String value) {
        return new JAXBElement<String>(_LinkedSubjectSubject1Title_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Subject2Title", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectSubject2Title(String value) {
        return new JAXBElement<String>(_LinkedSubjectSubject2Title_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "StartTime", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SubjectBaseStartTime_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EndTime", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkedSubjectEndTime_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Notes", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectNotes(String value) {
        return new JAXBElement<String>(_SubjectBaseNotes_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EmployeeRid", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectEmployeeRid(String value) {
        return new JAXBElement<String>(_LinkedSubjectEmployeeRid_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EmployeeCategory", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectEmployeeCategory(String value) {
        return new JAXBElement<String>(_LinkedSubjectEmployeeCategory_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkPosition", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectWorkPosition(String value) {
        return new JAXBElement<String>(_LinkedSubjectWorkPosition_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkPhone", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectWorkPhone(String value) {
        return new JAXBElement<String>(_LinkedSubjectWorkPhone_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkFax", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectWorkFax(String value) {
        return new JAXBElement<String>(_LinkedSubjectWorkFax_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkMobilePhone", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectWorkMobilePhone(String value) {
        return new JAXBElement<String>(_LinkedSubjectWorkMobilePhone_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkEmail", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectWorkEmail(String value) {
        return new JAXBElement<String>(_LinkedSubjectWorkEmail_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkMailAddress", scope = LinkedSubject.class)
    public JAXBElement<MailAddress> createLinkedSubjectWorkMailAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_LinkedSubjectWorkMailAddress_QNAME, MailAddress.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Text", scope = Note.class)
    public JAXBElement<String> createNoteText(String value) {
        return new JAXBElement<String>(_NoteText_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Cost", scope = Estate.class)
    public JAXBElement<BigDecimal> createEstateCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EstateCost_QNAME, BigDecimal.class, Estate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CostCcy", scope = Estate.class)
    public JAXBElement<Long> createEstateCostCcy(Long value) {
        return new JAXBElement<Long>(_EstateCostCcy_QNAME, Long.class, Estate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Liquidity", scope = Estate.class)
    public JAXBElement<Long> createEstateLiquidity(Long value) {
        return new JAXBElement<Long>(_EstateLiquidity_QNAME, Long.class, Estate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Notes", scope = Estate.class)
    public JAXBElement<String> createEstateNotes(String value) {
        return new JAXBElement<String>(_SubjectBaseNotes_QNAME, String.class, Estate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Series", scope = Document.class)
    public JAXBElement<String> createDocumentSeries(String value) {
        return new JAXBElement<String>(_DocumentSeries_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExpDate", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentExpDate_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IssuerId", scope = Document.class)
    public JAXBElement<Long> createDocumentIssuerId(Long value) {
        return new JAXBElement<Long>(_DocumentIssuerId_QNAME, Long.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Issuer", scope = Document.class)
    public JAXBElement<String> createDocumentIssuer(String value) {
        return new JAXBElement<String>(_DocumentIssuer_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IssuerRid", scope = Document.class)
    public JAXBElement<String> createDocumentIssuerRid(String value) {
        return new JAXBElement<String>(_DocumentIssuerRid_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Notes", scope = Document.class)
    public JAXBElement<String> createDocumentNotes(String value) {
        return new JAXBElement<String>(_SubjectBaseNotes_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CountryId", scope = Document.class)
    public JAXBElement<Long> createDocumentCountryId(Long value) {
        return new JAXBElement<Long>(_DocumentCountryId_QNAME, Long.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RegionRid", scope = Document.class)
    public JAXBElement<String> createDocumentRegionRid(String value) {
        return new JAXBElement<String>(_DocumentRegionRid_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Description1", scope = Document.class)
    public JAXBElement<String> createDocumentDescription1(String value) {
        return new JAXBElement<String>(_DocumentDescription1_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Description2", scope = Document.class)
    public JAXBElement<String> createDocumentDescription2(String value) {
        return new JAXBElement<String>(_DocumentDescription2_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Description3", scope = Document.class)
    public JAXBElement<String> createDocumentDescription3(String value) {
        return new JAXBElement<String>(_DocumentDescription3_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IssueDate", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentIssueDate_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Address", scope = com.tranzaxis.schemas.subjects_admin.ContactAddress.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createContactAddressAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_ContactAddressAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, com.tranzaxis.schemas.subjects_admin.ContactAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Notes", scope = com.tranzaxis.schemas.subjects_admin.ContactAddress.class)
    public JAXBElement<String> createContactAddressNotes(String value) {
        return new JAXBElement<String>(_SubjectBaseNotes_QNAME, String.class, com.tranzaxis.schemas.subjects_admin.ContactAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "InitTranId", scope = TrustedPayee.class)
    public JAXBElement<Long> createTrustedPayeeInitTranId(Long value) {
        return new JAXBElement<Long>(_TrustedPayeeInitTranId_QNAME, Long.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "InitInvoiceId", scope = TrustedPayee.class)
    public JAXBElement<Long> createTrustedPayeeInitInvoiceId(Long value) {
        return new JAXBElement<Long>(_TrustedPayeeInitInvoiceId_QNAME, Long.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title", scope = TrustedPayee.class)
    public JAXBElement<String> createTrustedPayeeTitle(String value) {
        return new JAXBElement<String>(_NetworkSpecificTitle_QNAME, String.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExpDate", scope = TrustedPayee.class)
    public JAXBElement<XMLGregorianCalendar> createTrustedPayeeExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentExpDate_QNAME, XMLGregorianCalendar.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CreateTime", scope = TrustedPayee.class)
    public JAXBElement<XMLGregorianCalendar> createTrustedPayeeCreateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrustedPayeeCreateTime_QNAME, XMLGregorianCalendar.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LastActiveChangeTime", scope = TrustedPayee.class)
    public JAXBElement<XMLGregorianCalendar> createTrustedPayeeLastActiveChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrustedPayeeLastActiveChangeTime_QNAME, XMLGregorianCalendar.class, TrustedPayee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Mbr", scope = ExtCard.class)
    public JAXBElement<Long> createExtCardMbr(Long value) {
        return new JAXBElement<Long>(_ExtCardMbr_QNAME, Long.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExpDate", scope = ExtCard.class)
    public JAXBElement<XMLGregorianCalendar> createExtCardExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentExpDate_QNAME, XMLGregorianCalendar.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Pvv", scope = ExtCard.class)
    public JAXBElement<String> createExtCardPvv(String value) {
        return new JAXBElement<String>(_ExtCardPvv_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Pvki", scope = ExtCard.class)
    public JAXBElement<Long> createExtCardPvki(Long value) {
        return new JAXBElement<Long>(_ExtCardPvki_QNAME, Long.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Status", scope = ExtCard.class)
    public JAXBElement<String> createExtCardStatus(String value) {
        return new JAXBElement<String>(_SubjectBaseStatus_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title", scope = ExtCard.class)
    public JAXBElement<String> createExtCardTitle(String value) {
        return new JAXBElement<String>(_NetworkSpecificTitle_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CheckTranId", scope = ExtCard.class)
    public JAXBElement<Long> createExtCardCheckTranId(Long value) {
        return new JAXBElement<Long>(_ExtCardCheckTranId_QNAME, Long.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ActivateTill", scope = ExtCard.class)
    public JAXBElement<XMLGregorianCalendar> createExtCardActivateTill(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtCardActivateTill_QNAME, XMLGregorianCalendar.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BinNetworkId", scope = ExtCard.class)
    public JAXBElement<Long> createExtCardBinNetworkId(Long value) {
        return new JAXBElement<Long>(_ExtCardBinNetworkId_QNAME, Long.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "SettleContractId", scope = ExtCard.class)
    public JAXBElement<Long> createExtCardSettleContractId(Long value) {
        return new JAXBElement<Long>(_ExtCardSettleContractId_QNAME, Long.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatus", scope = ExtCard.class)
    public JAXBElement<String> createExtCardEtuStatus(String value) {
        return new JAXBElement<String>(_NetworkSpecificEtuStatus_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatusDesc", scope = ExtCard.class)
    public JAXBElement<String> createExtCardEtuStatusDesc(String value) {
        return new JAXBElement<String>(_ExtCardEtuStatusDesc_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatusReqTime", scope = ExtCard.class)
    public JAXBElement<XMLGregorianCalendar> createExtCardEtuStatusReqTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtCardEtuStatusReqTime_QNAME, XMLGregorianCalendar.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EtuStatusUpdTime", scope = ExtCard.class)
    public JAXBElement<XMLGregorianCalendar> createExtCardEtuStatusUpdTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NetworkSpecificEtuStatusUpdTime_QNAME, XMLGregorianCalendar.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title", scope = Organization.class)
    public JAXBElement<String> createOrganizationTitle(String value) {
        return new JAXBElement<String>(_NetworkSpecificTitle_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LegalTitle", scope = Organization.class)
    public JAXBElement<String> createOrganizationLegalTitle(String value) {
        return new JAXBElement<String>(_OrganizationLegalTitle_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LatTitle", scope = Organization.class)
    public JAXBElement<String> createOrganizationLatTitle(String value) {
        return new JAXBElement<String>(_OrganizationLatTitle_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ShortTitle", scope = Organization.class)
    public JAXBElement<String> createOrganizationShortTitle(String value) {
        return new JAXBElement<String>(_OrganizationShortTitle_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "OwnerTypeId", scope = Organization.class)
    public JAXBElement<Long> createOrganizationOwnerTypeId(Long value) {
        return new JAXBElement<Long>(_OrganizationOwnerTypeId_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "OwnerTypeRid", scope = Organization.class)
    public JAXBElement<String> createOrganizationOwnerTypeRid(String value) {
        return new JAXBElement<String>(_OrganizationOwnerTypeRid_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ParentOrgId", scope = Organization.class)
    public JAXBElement<Long> createOrganizationParentOrgId(Long value) {
        return new JAXBElement<Long>(_OrganizationParentOrgId_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ParentOrgRid", scope = Organization.class)
    public JAXBElement<String> createOrganizationParentOrgRid(String value) {
        return new JAXBElement<String>(_OrganizationParentOrgRid_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ParentOrgMustExist", scope = Organization.class)
    public JAXBElement<Boolean> createOrganizationParentOrgMustExist(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationParentOrgMustExist_QNAME, Boolean.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LegalTypeId", scope = Organization.class)
    public JAXBElement<Long> createOrganizationLegalTypeId(Long value) {
        return new JAXBElement<Long>(_OrganizationLegalTypeId_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LegalTypeRid", scope = Organization.class)
    public JAXBElement<String> createOrganizationLegalTypeRid(String value) {
        return new JAXBElement<String>(_OrganizationLegalTypeRid_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MccId", scope = Organization.class)
    public JAXBElement<Long> createOrganizationMccId(Long value) {
        return new JAXBElement<Long>(_NetworkSpecificMccId_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "QualityCode", scope = Organization.class)
    public JAXBElement<Long> createOrganizationQualityCode(Long value) {
        return new JAXBElement<Long>(_OrganizationQualityCode_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LocationCode", scope = Organization.class)
    public JAXBElement<Long> createOrganizationLocationCode(Long value) {
        return new JAXBElement<Long>(_OrganizationLocationCode_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CancelledDate", scope = Organization.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationCancelledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationCancelledDate_QNAME, XMLGregorianCalendar.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ReinstatedDate", scope = Organization.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationReinstatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationReinstatedDate_QNAME, XMLGregorianCalendar.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkScheduleId", scope = Organization.class)
    public JAXBElement<Long> createOrganizationWorkScheduleId(Long value) {
        return new JAXBElement<Long>(_OrganizationWorkScheduleId_QNAME, Long.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Address", scope = Organization.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createOrganizationAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_ContactAddressAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LegalAddress", scope = Organization.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createOrganizationLegalAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_OrganizationLegalAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Corporation.CorporationBankProps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Corporation.CorporationBankProps }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CorporationBankProps", scope = Corporation.class)
    public JAXBElement<Corporation.CorporationBankProps> createCorporationCorporationBankProps(Corporation.CorporationBankProps value) {
        return new JAXBElement<Corporation.CorporationBankProps>(_CorporationCorporationBankProps_QNAME, Corporation.CorporationBankProps.class, Corporation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "LastNameLat", scope = Person.class)
    public JAXBElement<String> createPersonLastNameLat(String value) {
        return new JAXBElement<String>(_PersonLastNameLat_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "FirstName", scope = Person.class)
    public JAXBElement<String> createPersonFirstName(String value) {
        return new JAXBElement<String>(_PersonFirstName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "FirstNameLat", scope = Person.class)
    public JAXBElement<String> createPersonFirstNameLat(String value) {
        return new JAXBElement<String>(_PersonFirstNameLat_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MiddleName", scope = Person.class)
    public JAXBElement<String> createPersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonMiddleName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MiddleNameLat", scope = Person.class)
    public JAXBElement<String> createPersonMiddleNameLat(String value) {
        return new JAXBElement<String>(_PersonMiddleNameLat_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TitleTypeId", scope = Person.class)
    public JAXBElement<Long> createPersonTitleTypeId(Long value) {
        return new JAXBElement<Long>(_PersonTitleTypeId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TitleTypeRid", scope = Person.class)
    public JAXBElement<String> createPersonTitleTypeRid(String value) {
        return new JAXBElement<String>(_PersonTitleTypeRid_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title2TypeId", scope = Person.class)
    public JAXBElement<Long> createPersonTitle2TypeId(Long value) {
        return new JAXBElement<Long>(_PersonTitle2TypeId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Title2TypeRid", scope = Person.class)
    public JAXBElement<String> createPersonTitle2TypeRid(String value) {
        return new JAXBElement<String>(_PersonTitle2TypeRid_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TitleSuffixTypeId", scope = Person.class)
    public JAXBElement<Long> createPersonTitleSuffixTypeId(Long value) {
        return new JAXBElement<Long>(_PersonTitleSuffixTypeId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Gender", scope = Person.class)
    public JAXBElement<String> createPersonGender(String value) {
        return new JAXBElement<String>(_PersonGender_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MaritalStatus", scope = Person.class)
    public JAXBElement<String> createPersonMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonMaritalStatus_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ChildrenCnt", scope = Person.class)
    public JAXBElement<Long> createPersonChildrenCnt(Long value) {
        return new JAXBElement<Long>(_PersonChildrenCnt_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BirthDate", scope = Person.class)
    public JAXBElement<XMLGregorianCalendar> createPersonBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonBirthDate_QNAME, XMLGregorianCalendar.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BirthPlace", scope = Person.class)
    public JAXBElement<String> createPersonBirthPlace(String value) {
        return new JAXBElement<String>(_PersonBirthPlace_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BirthName", scope = Person.class)
    public JAXBElement<String> createPersonBirthName(String value) {
        return new JAXBElement<String>(_PersonBirthName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EducationTypeId", scope = Person.class)
    public JAXBElement<Long> createPersonEducationTypeId(Long value) {
        return new JAXBElement<Long>(_PersonEducationTypeId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EducationTypeRid", scope = Person.class)
    public JAXBElement<String> createPersonEducationTypeRid(String value) {
        return new JAXBElement<String>(_PersonEducationTypeRid_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "OccupationTypeId", scope = Person.class)
    public JAXBElement<Long> createPersonOccupationTypeId(Long value) {
        return new JAXBElement<Long>(_PersonOccupationTypeId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "OccupationTypeRid", scope = Person.class)
    public JAXBElement<String> createPersonOccupationTypeRid(String value) {
        return new JAXBElement<String>(_PersonOccupationTypeRid_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EmploymentStatus", scope = Person.class)
    public JAXBElement<String> createPersonEmploymentStatus(String value) {
        return new JAXBElement<String>(_PersonEmploymentStatus_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "EmployerTitle", scope = Person.class)
    public JAXBElement<String> createPersonEmployerTitle(String value) {
        return new JAXBElement<String>(_PersonEmployerTitle_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ResidentialStatus", scope = Person.class)
    public JAXBElement<String> createPersonResidentialStatus(String value) {
        return new JAXBElement<String>(_PersonResidentialStatus_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CurResidenceDuration", scope = Person.class)
    public JAXBElement<Long> createPersonCurResidenceDuration(Long value) {
        return new JAXBElement<Long>(_PersonCurResidenceDuration_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RentMortgagePayAmt", scope = Person.class)
    public JAXBElement<BigDecimal> createPersonRentMortgagePayAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonRentMortgagePayAmt_QNAME, BigDecimal.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RentMortgagePayCcy", scope = Person.class)
    public JAXBElement<Long> createPersonRentMortgagePayCcy(Long value) {
        return new JAXBElement<Long>(_PersonRentMortgagePayCcy_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "CitizenshipId", scope = Person.class)
    public JAXBElement<Long> createPersonCitizenshipId(Long value) {
        return new JAXBElement<Long>(_PersonCitizenshipId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person.ExtraCitizenship }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person.ExtraCitizenship }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ExtraCitizenship", scope = Person.class)
    public JAXBElement<Person.ExtraCitizenship> createPersonExtraCitizenship(Person.ExtraCitizenship value) {
        return new JAXBElement<Person.ExtraCitizenship>(_PersonExtraCitizenship_QNAME, Person.ExtraCitizenship.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ResidenceCountryId", scope = Person.class)
    public JAXBElement<Long> createPersonResidenceCountryId(Long value) {
        return new JAXBElement<Long>(_PersonResidenceCountryId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "RegAddress", scope = Person.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createPersonRegAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_PersonRegAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "HomeAddress", scope = Person.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createPersonHomeAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_PersonHomeAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "HomeAddress2", scope = Person.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createPersonHomeAddress2(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_PersonHomeAddress2_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "BirthAddress", scope = Person.class)
    public JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> createPersonBirthAddress(com.tranzaxis.schemas.common_types.ContactAddress value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress>(_PersonBirthAddress_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "TwitterScreenName", scope = Person.class)
    public JAXBElement<String> createPersonTwitterScreenName(String value) {
        return new JAXBElement<String>(_PersonTwitterScreenName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person.Emails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person.Emails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Emails", scope = Person.class)
    public JAXBElement<Person.Emails> createPersonEmails(Person.Emails value) {
        return new JAXBElement<Person.Emails>(_PersonEmails_QNAME, Person.Emails.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person.MobilePhones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person.MobilePhones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "MobilePhones", scope = Person.class)
    public JAXBElement<Person.MobilePhones> createPersonMobilePhones(Person.MobilePhones value) {
        return new JAXBElement<Person.MobilePhones>(_PersonMobilePhones_QNAME, Person.MobilePhones.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person.WorkPhones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person.WorkPhones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "WorkPhones", scope = Person.class)
    public JAXBElement<Person.WorkPhones> createPersonWorkPhones(Person.WorkPhones value) {
        return new JAXBElement<Person.WorkPhones>(_PersonWorkPhones_QNAME, Person.WorkPhones.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "Income", scope = Person.class)
    public JAXBElement<BigDecimal> createPersonIncome(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonIncome_QNAME, BigDecimal.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "IncomeCcy", scope = Person.class)
    public JAXBElement<Long> createPersonIncomeCcy(Long value) {
        return new JAXBElement<Long>(_PersonIncomeCcy_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ProfileId", scope = Person.class)
    public JAXBElement<Long> createPersonProfileId(Long value) {
        return new JAXBElement<Long>(_PersonProfileId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", name = "ProfileRid", scope = Person.class)
    public JAXBElement<String> createPersonProfileRid(String value) {
        return new JAXBElement<String>(_PersonProfileRid_QNAME, String.class, Person.class, value);
    }

}
