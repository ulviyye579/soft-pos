
package com.compassplus.schemas.tip.tranaddendum;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.compassplus.schemas.tip.tranaddendum package. 
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

    private final static QName _TranAddendums_QNAME = new QName("http://schemas.compassplus.com/TIP/tranAddendum.xsd", "TranAddendums");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.compassplus.schemas.tip.tranaddendum
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranAddendums }
     * 
     */
    public TranAddendums createTranAddendums() {
        return new TranAddendums();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum }
     * 
     */
    public TranAddendums.Addendum createTranAddendumsAddendum() {
        return new TranAddendums.Addendum();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.UPOnline }
     * 
     */
    public TranAddendums.Addendum.UPOnline createTranAddendumsAddendumUPOnline() {
        return new TranAddendums.Addendum.UPOnline();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS createTranAddendumsAddendumAmexOMASS() {
        return new TranAddendums.Addendum.AmexOMASS();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData createTranAddendumsAddendumAmexOMASSIndividualData() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData.Identification }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData.Identification createTranAddendumsAddendumAmexOMASSIndividualDataIdentification() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData.Identification();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses createTranAddendumsAddendumAmexOMASSIndividualDataAddresses() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB }
     * 
     */
    public TranAddendums.Addendum.JCB createTranAddendumsAddendumJCB() {
        return new TranAddendums.Addendum.JCB();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.PowerCardLIS }
     * 
     */
    public TranAddendums.Addendum.PowerCardLIS createTranAddendumsAddendumPowerCardLIS() {
        return new TranAddendums.Addendum.PowerCardLIS();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2 }
     * 
     */
    public TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2 createTranAddendumsAddendumPowerCardLISTc05Tcr2() {
        return new TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCBInterchange }
     * 
     */
    public TranAddendums.Addendum.JCBInterchange createTranAddendumsAddendumJCBInterchange() {
        return new TranAddendums.Addendum.JCBInterchange();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCBInterchange.FMSRecord }
     * 
     */
    public TranAddendums.Addendum.JCBInterchange.FMSRecord createTranAddendumsAddendumJCBInterchangeFMSRecord() {
        return new TranAddendums.Addendum.JCBInterchange.FMSRecord();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing }
     * 
     */
    public TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing createTranAddendumsAddendumJCBInterchangeFMSRecordRouting() {
        return new TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns }
     * 
     */
    public TranAddendums.Addendum.AmexGns createTranAddendumsAddendumAmexGns() {
        return new TranAddendums.Addendum.AmexGns();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm createTranAddendumsAddendumMasterCardIpm() {
        return new TranAddendums.Addendum.MasterCardIpm();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail createTranAddendumsAddendumMasterCardIpmVehicleRentalDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.LodgingSummary }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.LodgingSummary createTranAddendumsAddendumMasterCardIpmLodgingSummary() {
        return new TranAddendums.Addendum.MasterCardIpm.LodgingSummary();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.TemporaryServices }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.TemporaryServices createTranAddendumsAddendumMasterCardIpmTemporaryServices() {
        return new TranAddendums.Addendum.MasterCardIpm.TemporaryServices();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.GenericDetails }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.GenericDetails createTranAddendumsAddendumMasterCardIpmGenericDetails() {
        return new TranAddendums.Addendum.MasterCardIpm.GenericDetails();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails createTranAddendumsAddendumMasterCardIpmCorporateLineItemDetails() {
        return new TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices createTranAddendumsAddendumMasterCardIpmElectronicInvoices() {
        return new TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails createTranAddendumsAddendumMasterCardIpmTravelAgencyDetails() {
        return new TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail createTranAddendumsAddendumMasterCardIpmPassengerTransportDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf }
     * 
     */
    public TranAddendums.Addendum.VisaCtf createTranAddendumsAddendumVisaCtf() {
        return new TranAddendums.Addendum.VisaCtf();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData createTranAddendumsAddendumVisaCtfTc50CommercialCardData() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip }
     * 
     */
    public TranAddendums.Addendum.VisaVip createTranAddendumsAddendumVisaVip() {
        return new TranAddendums.Addendum.VisaVip();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F104U2 }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F104U2 createTranAddendumsAddendumVisaVipF104U2() {
        return new TranAddendums.Addendum.VisaVip.F104U2();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.UPOnline.F104AI }
     * 
     */
    public TranAddendums.Addendum.UPOnline.F104AI createTranAddendumsAddendumUPOnlineF104AI() {
        return new TranAddendums.Addendum.UPOnline.F104AI();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData.RoleTypeCode }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData.RoleTypeCode createTranAddendumsAddendumAmexOMASSIndividualDataRoleTypeCode() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData.RoleTypeCode();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData.Identification.Document }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData.Identification.Document createTranAddendumsAddendumAmexOMASSIndividualDataIdentificationDocument() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData.Identification.Document();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses.Address }
     * 
     */
    public TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses.Address createTranAddendumsAddendumAmexOMASSIndividualDataAddressesAddress() {
        return new TranAddendums.Addendum.AmexOMASS.IndividualData.Addresses.Address();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB.TravelGeneral }
     * 
     */
    public TranAddendums.Addendum.JCB.TravelGeneral createTranAddendumsAddendumJCBTravelGeneral() {
        return new TranAddendums.Addendum.JCB.TravelGeneral();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB.TravelLeg }
     * 
     */
    public TranAddendums.Addendum.JCB.TravelLeg createTranAddendumsAddendumJCBTravelLeg() {
        return new TranAddendums.Addendum.JCB.TravelLeg();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB.TravelRail }
     * 
     */
    public TranAddendums.Addendum.JCB.TravelRail createTranAddendumsAddendumJCBTravelRail() {
        return new TranAddendums.Addendum.JCB.TravelRail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB.Lodge }
     * 
     */
    public TranAddendums.Addendum.JCB.Lodge createTranAddendumsAddendumJCBLodge() {
        return new TranAddendums.Addendum.JCB.Lodge();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCB.RentACar }
     * 
     */
    public TranAddendums.Addendum.JCB.RentACar createTranAddendumsAddendumJCBRentACar() {
        return new TranAddendums.Addendum.JCB.RentACar();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2 .F006 }
     * 
     */
    public TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2 .F006 createTranAddendumsAddendumPowerCardLISTc05Tcr2F006() {
        return new TranAddendums.Addendum.PowerCardLIS.Tc05Tcr2 .F006();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing.TripLeg }
     * 
     */
    public TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing.TripLeg createTranAddendumsAddendumJCBInterchangeFMSRecordRoutingTripLeg() {
        return new TranAddendums.Addendum.JCBInterchange.FMSRecord.Routing.TripLeg();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.DeferredPaymentPlan }
     * 
     */
    public TranAddendums.Addendum.AmexGns.DeferredPaymentPlan createTranAddendumsAddendumAmexGnsDeferredPaymentPlan() {
        return new TranAddendums.Addendum.AmexGns.DeferredPaymentPlan();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.DoubleByteCharacter }
     * 
     */
    public TranAddendums.Addendum.AmexGns.DoubleByteCharacter createTranAddendumsAddendumAmexGnsDoubleByteCharacter() {
        return new TranAddendums.Addendum.AmexGns.DoubleByteCharacter();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.ChipCard }
     * 
     */
    public TranAddendums.Addendum.AmexGns.ChipCard createTranAddendumsAddendumAmexGnsChipCard() {
        return new TranAddendums.Addendum.AmexGns.ChipCard();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.MultinationalClientIdentificationAddendum }
     * 
     */
    public TranAddendums.Addendum.AmexGns.MultinationalClientIdentificationAddendum createTranAddendumsAddendumAmexGnsMultinationalClientIdentificationAddendum() {
        return new TranAddendums.Addendum.AmexGns.MultinationalClientIdentificationAddendum();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.AirlineIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.AirlineIndustrySpecificDetail createTranAddendumsAddendumAmexGnsAirlineIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.AirlineIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.TravelCruiseIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.TravelCruiseIndustrySpecificDetail createTranAddendumsAddendumAmexGnsTravelCruiseIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.TravelCruiseIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.RailIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.RailIndustrySpecificDetail createTranAddendumsAddendumAmexGnsRailIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.RailIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.AutoRentalIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.AutoRentalIndustrySpecificDetail createTranAddendumsAddendumAmexGnsAutoRentalIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.AutoRentalIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.LodgingIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.LodgingIndustrySpecificDetail createTranAddendumsAddendumAmexGnsLodgingIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.LodgingIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.CommunicationServicesIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.CommunicationServicesIndustrySpecificDetail createTranAddendumsAddendumAmexGnsCommunicationServicesIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.CommunicationServicesIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.InsuranceIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.InsuranceIndustrySpecificDetail createTranAddendumsAddendumAmexGnsInsuranceIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.InsuranceIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.RetailIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.RetailIndustrySpecificDetail createTranAddendumsAddendumAmexGnsRetailIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.RetailIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.GeneralFormatIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.GeneralFormatIndustrySpecificDetail createTranAddendumsAddendumAmexGnsGeneralFormatIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.GeneralFormatIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.EntertainmentTicketingIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.EntertainmentTicketingIndustrySpecificDetail createTranAddendumsAddendumAmexGnsEntertainmentTicketingIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.EntertainmentTicketingIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.RestaurantIndustrySpecificDetail }
     * 
     */
    public TranAddendums.Addendum.AmexGns.RestaurantIndustrySpecificDetail createTranAddendumsAddendumAmexGnsRestaurantIndustrySpecificDetail() {
        return new TranAddendums.Addendum.AmexGns.RestaurantIndustrySpecificDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.MarketSpecificData }
     * 
     */
    public TranAddendums.Addendum.AmexGns.MarketSpecificData createTranAddendumsAddendumAmexGnsMarketSpecificData() {
        return new TranAddendums.Addendum.AmexGns.MarketSpecificData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.ExtendedFinancialAddendum }
     * 
     */
    public TranAddendums.Addendum.AmexGns.ExtendedFinancialAddendum createTranAddendumsAddendumAmexGnsExtendedFinancialAddendum() {
        return new TranAddendums.Addendum.AmexGns.ExtendedFinancialAddendum();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.AmexGns.PurchasingCard }
     * 
     */
    public TranAddendums.Addendum.AmexGns.PurchasingCard createTranAddendumsAddendumAmexGnsPurchasingCard() {
        return new TranAddendums.Addendum.AmexGns.PurchasingCard();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.CorporateCardCommonData }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.CorporateCardCommonData createTranAddendumsAddendumMasterCardIpmCorporateCardCommonData() {
        return new TranAddendums.Addendum.MasterCardIpm.CorporateCardCommonData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.CorporateFleetTransactionInformation }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.CorporateFleetTransactionInformation createTranAddendumsAddendumMasterCardIpmCorporateFleetTransactionInformation() {
        return new TranAddendums.Addendum.MasterCardIpm.CorporateFleetTransactionInformation();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.Basic }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.Basic createTranAddendumsAddendumMasterCardIpmBasic() {
        return new TranAddendums.Addendum.MasterCardIpm.Basic();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail.Detail createTranAddendumsAddendumMasterCardIpmVehicleRentalDetailDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.VehicleRentalDetail.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.LodgingSummary.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.LodgingSummary.Detail createTranAddendumsAddendumMasterCardIpmLodgingSummaryDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.LodgingSummary.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.TemporaryServices.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.TemporaryServices.Detail createTranAddendumsAddendumMasterCardIpmTemporaryServicesDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.TemporaryServices.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.GenericDetails.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.GenericDetails.Detail createTranAddendumsAddendumMasterCardIpmGenericDetailsDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.GenericDetails.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails.Detail createTranAddendumsAddendumMasterCardIpmCorporateLineItemDetailsDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.CorporateLineItemDetails.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.TransactionData }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.TransactionData createTranAddendumsAddendumMasterCardIpmElectronicInvoicesTransactionData() {
        return new TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.TransactionData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.PartyInformation }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.PartyInformation createTranAddendumsAddendumMasterCardIpmElectronicInvoicesPartyInformation() {
        return new TranAddendums.Addendum.MasterCardIpm.ElectronicInvoices.PartyInformation();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails.Detail }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails.Detail createTranAddendumsAddendumMasterCardIpmTravelAgencyDetailsDetail() {
        return new TranAddendums.Addendum.MasterCardIpm.TravelAgencyDetails.Detail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.GeneralTicketInfo }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.GeneralTicketInfo createTranAddendumsAddendumMasterCardIpmPassengerTransportDetailGeneralTicketInfo() {
        return new TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.GeneralTicketInfo();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.TripLegData }
     * 
     */
    public TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.TripLegData createTranAddendumsAddendumMasterCardIpmPassengerTransportDetailTripLegData() {
        return new TranAddendums.Addendum.MasterCardIpm.PassengerTransportDetail.TripLegData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr0 }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr0 createTranAddendumsAddendumVisaCtfTc05Tcr0() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr0();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr2Brazil }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr2Brazil createTranAddendumsAddendumVisaCtfTc05Tcr2Brazil() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr2Brazil();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr2Russia }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr2Russia createTranAddendumsAddendumVisaCtfTc05Tcr2Russia() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr2Russia();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr2Sweden }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr2Sweden createTranAddendumsAddendumVisaCtfTc05Tcr2Sweden() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr2Sweden();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3Passenger }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3Passenger createTranAddendumsAddendumVisaCtfTc05Tcr3Passenger() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3Passenger();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3PassengerAncillary }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3PassengerAncillary createTranAddendumsAddendumVisaCtfTc05Tcr3PassengerAncillary() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3PassengerAncillary();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3Fleet }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3Fleet createTranAddendumsAddendumVisaCtfTc05Tcr3Fleet() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3Fleet();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3EMVFleet }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3EMVFleet createTranAddendumsAddendumVisaCtfTc05Tcr3EMVFleet() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3EMVFleet();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3Lodging }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3Lodging createTranAddendumsAddendumVisaCtfTc05Tcr3Lodging() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3Lodging();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr3CarRental }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr3CarRental createTranAddendumsAddendumVisaCtfTc05Tcr3CarRental() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr3CarRental();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc05Tcr6 }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc05Tcr6 createTranAddendumsAddendumVisaCtfTc05Tcr6() {
        return new TranAddendums.Addendum.VisaCtf.Tc05Tcr6();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceSummary }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceSummary createTranAddendumsAddendumVisaCtfTc50CommercialCardDataInvoiceSummary() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceSummary();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceLineDetail }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceLineDetail createTranAddendumsAddendumVisaCtfTc50CommercialCardDataInvoiceLineDetail() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.InvoiceLineDetail();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryData }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryData createTranAddendumsAddendumVisaCtfTc50CommercialCardDataPassengerItineraryData() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryDataLegSpecific }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryDataLegSpecific createTranAddendumsAddendumVisaCtfTc50CommercialCardDataPassengerItineraryDataLegSpecific() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.PassengerItineraryDataLegSpecific();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.GenericData }
     * 
     */
    public TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.GenericData createTranAddendumsAddendumVisaCtfTc50CommercialCardDataGenericData() {
        return new TranAddendums.Addendum.VisaCtf.Tc50CommercialCardData.GenericData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F48U2 }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F48U2 createTranAddendumsAddendumVisaVipF48U2() {
        return new TranAddendums.Addendum.VisaVip.F48U2();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F48U36 }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F48U36 createTranAddendumsAddendumVisaVipF48U36() {
        return new TranAddendums.Addendum.VisaVip.F48U36();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F60P4 }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F60P4 createTranAddendumsAddendumVisaVipF60P4() {
        return new TranAddendums.Addendum.VisaVip.F60P4();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F126 }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F126 createTranAddendumsAddendumVisaVipF126() {
        return new TranAddendums.Addendum.VisaVip.F126();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F104U2 .CommercialData }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F104U2 .CommercialData createTranAddendumsAddendumVisaVipF104U2CommercialData() {
        return new TranAddendums.Addendum.VisaVip.F104U2 .CommercialData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F104U2 .AirlineIndustrySpecificData }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F104U2 .AirlineIndustrySpecificData createTranAddendumsAddendumVisaVipF104U2AirlineIndustrySpecificData() {
        return new TranAddendums.Addendum.VisaVip.F104U2 .AirlineIndustrySpecificData();
    }

    /**
     * Create an instance of {@link TranAddendums.Addendum.VisaVip.F104U2 .TransportAncillaryData }
     * 
     */
    public TranAddendums.Addendum.VisaVip.F104U2 .TransportAncillaryData createTranAddendumsAddendumVisaVipF104U2TransportAncillaryData() {
        return new TranAddendums.Addendum.VisaVip.F104U2 .TransportAncillaryData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranAddendums }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranAddendums }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.compassplus.com/TIP/tranAddendum.xsd", name = "TranAddendums")
    public JAXBElement<TranAddendums> createTranAddendums(TranAddendums value) {
        return new JAXBElement<TranAddendums>(_TranAddendums_QNAME, TranAddendums.class, null, value);
    }

}
