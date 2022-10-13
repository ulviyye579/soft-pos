
package com.tranzaxis.schemas.tran;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.ContactAddress;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.tran package. 
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

    private final static QName _Request_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Request");
    private final static QName _Response_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Response");
    private final static QName _UndoRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "UndoRequest");
    private final static QName _CashDeskOrderExecRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CashDeskOrderExecRequest");
    private final static QName _InquiryRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "InquiryRequest");
    private final static QName _InquiryResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "InquiryResponse");
    private final static QName _SelectSubjectsRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectSubjectsRequest");
    private final static QName _SelectSubjectsResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectSubjectsResponse");
    private final static QName _SelectContractsRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectContractsRequest");
    private final static QName _SelectContractsResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectContractsResponse");
    private final static QName _SelectTokensRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTokensRequest");
    private final static QName _SelectTokensResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTokensResponse");
    private final static QName _SelectTerminalsRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTerminalsRequest");
    private final static QName _SelectTerminalsResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTerminalsResponse");
    private final static QName _SelectTransRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTransRequest");
    private final static QName _SelectTransResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectTransResponse");
    private final static QName _SelectPayeeBillsRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectPayeeBillsRequest");
    private final static QName _SelectPayeeBillsResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectPayeeBillsResponse");
    private final static QName _SelectPayeeConsumersRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectPayeeConsumersRequest");
    private final static QName _SelectPayeeConsumersResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "SelectPayeeConsumersResponse");
    private final static QName _UserOperRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "UserOperRequest");
    private final static QName _UserOperResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "UserOperResponse");
    private final static QName _GroupOperRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "GroupOperRequest");
    private final static QName _GroupOperResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "GroupOperResponse");
    private final static QName _CbiRequest_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CbiRequest");
    private final static QName _CbiResponse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CbiResponse");
    private final static QName _Tran_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "Tran");
    private final static QName _UndoTran_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "UndoTran");
    private final static QName _CbiTran_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "CbiTran");
    private final static QName _CashDeskOrderExec_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "CashDeskOrderExec");
    private final static QName _Inquiry_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "Inquiry");
    private final static QName _SelectSubjects_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectSubjects");
    private final static QName _SelectContracts_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectContracts");
    private final static QName _SelectTokens_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectTokens");
    private final static QName _SelectTerminals_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectTerminals");
    private final static QName _SelectTrans_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectTrans");
    private final static QName _SelectPayeeBills_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectPayeeBills");
    private final static QName _SelectPayeeConsumers_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "SelectPayeeConsumers");
    private final static QName _InvokeCryptoService_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "InvokeCryptoService");
    private final static QName _UserOper_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "UserOper");
    private final static QName _GroupOper_QNAME = new QName("http://schemas.tranzaxis.com/tran.wsdl", "GroupOper");
    private final static QName _TokenAliasAuthDataInUse_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "InUse");
    private final static QName _TokenAliasAuthDataConsentTime_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "ConsentTime");
    private final static QName _TokenAliasAuthDataOwnerCountryId_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CountryId");
    private final static QName _TokenAliasAuthDataOwnerLastName_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "LastName");
    private final static QName _TokenAliasAuthDataOwnerMiddleName_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "MiddleName");
    private final static QName _TokenAliasAuthDataOwnerCity_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "City");
    private final static QName _TokenAliasAuthDataOwnerAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Address");
    private final static QName _TokenAliasAuthDataOwnerEmail_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Email");
    private final static QName _TokenAliasAuthDataOwnerFirstName_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "FirstName");
    private final static QName _TokenAliasAuthDataOwnerInstTitle_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "InstTitle");
    private final static QName _TokenAliasAuthDataOwnerZip_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Zip");
    private final static QName _TokenAliasAuthDataOwnerCardBrandTitle_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CardBrandTitle");
    private final static QName _TokenAliasAuthDataOwnerLastNameLocal_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "LastNameLocal");
    private final static QName _TokenAliasAuthDataOwnerMiddleNameLocal_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "MiddleNameLocal");
    private final static QName _TokenAliasAuthDataOwnerFirstNameLocal_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "FirstNameLocal");
    private final static QName _TokenAliasAuthDataOwnerMobile_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Mobile");
    private final static QName _DigitizationRqActivationTime_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "ActivationTime");
    private final static QName _DigitizationRqCloseTime_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "CloseTime");
    private final static QName _DigitizationRqProvisionTime_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "ProvisionTime");
    private final static QName _SendContractInfoSpecificStatementDeliveryAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "DeliveryAddress");
    private final static QName _SendContractInfoSpecificStatementReportMessage_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "ReportMessage");
    private final static QName _RequestSpecificUpdateTokenAuthDataCardholderAuthDocuments_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "Documents");
    private final static QName _RequestSpecificPaymentDueDay_QNAME = new QName("http://schemas.tranzaxis.com/tran.xsd", "DueDay");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.tran
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CryptoServiceInvoke }
     * 
     */
    public CryptoServiceInvoke createCryptoServiceInvoke() {
        return new CryptoServiceInvoke();
    }

    /**
     * Create an instance of {@link RequestGroup }
     * 
     */
    public RequestGroup createRequestGroup() {
        return new RequestGroup();
    }

    /**
     * Create an instance of {@link RequestGroup.Tran }
     * 
     */
    public RequestGroup.Tran createRequestGroupTran() {
        return new RequestGroup.Tran();
    }

    /**
     * Create an instance of {@link ScoringModules }
     * 
     */
    public ScoringModules createScoringModules() {
        return new ScoringModules();
    }

    /**
     * Create an instance of {@link TokenAliasAuthData }
     * 
     */
    public TokenAliasAuthData createTokenAliasAuthData() {
        return new TokenAliasAuthData();
    }

    /**
     * Create an instance of {@link ScaExemptionsNetworkSpecific }
     * 
     */
    public ScaExemptionsNetworkSpecific createScaExemptionsNetworkSpecific() {
        return new ScaExemptionsNetworkSpecific();
    }

    /**
     * Create an instance of {@link DigitizationRs }
     * 
     */
    public DigitizationRs createDigitizationRs() {
        return new DigitizationRs();
    }

    /**
     * Create an instance of {@link DigitizationRs.ActivationMethods }
     * 
     */
    public DigitizationRs.ActivationMethods createDigitizationRsActivationMethods() {
        return new DigitizationRs.ActivationMethods();
    }

    /**
     * Create an instance of {@link DigitizationRq }
     * 
     */
    public DigitizationRq createDigitizationRq() {
        return new DigitizationRq();
    }

    /**
     * Create an instance of {@link DigitizationRq.RiskInfo }
     * 
     */
    public DigitizationRq.RiskInfo createDigitizationRqRiskInfo() {
        return new DigitizationRq.RiskInfo();
    }

    /**
     * Create an instance of {@link HoldActions }
     * 
     */
    public HoldActions createHoldActions() {
        return new HoldActions();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Postings }
     * 
     */
    public com.tranzaxis.schemas.tran.Postings createPostings() {
        return new com.tranzaxis.schemas.tran.Postings();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Entries }
     * 
     */
    public com.tranzaxis.schemas.tran.Entries createEntries() {
        return new com.tranzaxis.schemas.tran.Entries();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Entries.Entry }
     * 
     */
    public com.tranzaxis.schemas.tran.Entries.Entry createEntriesEntry() {
        return new com.tranzaxis.schemas.tran.Entries.Entry();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Entries.Entry.Part }
     * 
     */
    public com.tranzaxis.schemas.tran.Entries.Entry.Part createEntriesEntryPart() {
        return new com.tranzaxis.schemas.tran.Entries.Entry.Part();
    }

    /**
     * Create an instance of {@link FinPlan }
     * 
     */
    public FinPlan createFinPlan() {
        return new FinPlan();
    }

    /**
     * Create an instance of {@link TdsRs }
     * 
     */
    public TdsRs createTdsRs() {
        return new TdsRs();
    }

    /**
     * Create an instance of {@link TdsRs.PAResScheme }
     * 
     */
    public TdsRs.PAResScheme createTdsRsPAResScheme() {
        return new TdsRs.PAResScheme();
    }

    /**
     * Create an instance of {@link TdsRs.PAResScheme.Variants }
     * 
     */
    public TdsRs.PAResScheme.Variants createTdsRsPAResSchemeVariants() {
        return new TdsRs.PAResScheme.Variants();
    }

    /**
     * Create an instance of {@link TdsRs.Extensions }
     * 
     */
    public TdsRs.Extensions createTdsRsExtensions() {
        return new TdsRs.Extensions();
    }

    /**
     * Create an instance of {@link TdsRq }
     * 
     */
    public TdsRq createTdsRq() {
        return new TdsRq();
    }

    /**
     * Create an instance of {@link TdsRq.TranDetails }
     * 
     */
    public TdsRq.TranDetails createTdsRqTranDetails() {
        return new TdsRq.TranDetails();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo }
     * 
     */
    public TdsRq.CardholderInfo createTdsRqCardholderInfo() {
        return new TdsRq.CardholderInfo();
    }

    /**
     * Create an instance of {@link TdsRq.PersonalQAs }
     * 
     */
    public TdsRq.PersonalQAs createTdsRqPersonalQAs() {
        return new TdsRq.PersonalQAs();
    }

    /**
     * Create an instance of {@link TdsRq.Extensions }
     * 
     */
    public TdsRq.Extensions createTdsRqExtensions() {
        return new TdsRq.Extensions();
    }

    /**
     * Create an instance of {@link TdsPAResVariant }
     * 
     */
    public TdsPAResVariant createTdsPAResVariant() {
        return new TdsPAResVariant();
    }

    /**
     * Create an instance of {@link TdsPAResVariant.CallbackAddresses }
     * 
     */
    public TdsPAResVariant.CallbackAddresses createTdsPAResVariantCallbackAddresses() {
        return new TdsPAResVariant.CallbackAddresses();
    }

    /**
     * Create an instance of {@link SendContractInfoSpecific }
     * 
     */
    public SendContractInfoSpecific createSendContractInfoSpecific() {
        return new SendContractInfoSpecific();
    }

    /**
     * Create an instance of {@link SendContractInfoSpecific.Postings }
     * 
     */
    public SendContractInfoSpecific.Postings createSendContractInfoSpecificPostings() {
        return new SendContractInfoSpecific.Postings();
    }

    /**
     * Create an instance of {@link UpdateEtuMerchantSpecific }
     * 
     */
    public UpdateEtuMerchantSpecific createUpdateEtuMerchantSpecific() {
        return new UpdateEtuMerchantSpecific();
    }

    /**
     * Create an instance of {@link NetworkSpecific }
     * 
     */
    public NetworkSpecific createNetworkSpecific() {
        return new NetworkSpecific();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tieto }
     * 
     */
    public NetworkSpecific.Tieto createNetworkSpecificTieto() {
        return new NetworkSpecific.Tieto();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tieto.AcquirerRqAddData }
     * 
     */
    public NetworkSpecific.Tieto.AcquirerRqAddData createNetworkSpecificTietoAcquirerRqAddData() {
        return new NetworkSpecific.Tieto.AcquirerRqAddData();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tieto.IssuerRefereneceData }
     * 
     */
    public NetworkSpecific.Tieto.IssuerRefereneceData createNetworkSpecificTietoIssuerRefereneceData() {
        return new NetworkSpecific.Tieto.IssuerRefereneceData();
    }

    /**
     * Create an instance of {@link NetworkSpecific.FasterPayments }
     * 
     */
    public NetworkSpecific.FasterPayments createNetworkSpecificFasterPayments() {
        return new NetworkSpecific.FasterPayments();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Way4 }
     * 
     */
    public NetworkSpecific.Way4 createNetworkSpecificWay4() {
        return new NetworkSpecific.Way4();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Way4 .Fees }
     * 
     */
    public NetworkSpecific.Way4 .Fees createNetworkSpecificWay4Fees() {
        return new NetworkSpecific.Way4 .Fees();
    }

    /**
     * Create an instance of {@link NetworkSpecific.MasterCard }
     * 
     */
    public NetworkSpecific.MasterCard createNetworkSpecificMasterCard() {
        return new NetworkSpecific.MasterCard();
    }

    /**
     * Create an instance of {@link ReconciliationNetworkSpecific }
     * 
     */
    public ReconciliationNetworkSpecific createReconciliationNetworkSpecific() {
        return new ReconciliationNetworkSpecific();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific }
     * 
     */
    public DisputeNetworkSpecific createDisputeNetworkSpecific() {
        return new DisputeNetworkSpecific();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific.DinersClub }
     * 
     */
    public DisputeNetworkSpecific.DinersClub createDisputeNetworkSpecificDinersClub() {
        return new DisputeNetworkSpecific.DinersClub();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific.Visa }
     * 
     */
    public DisputeNetworkSpecific.Visa createDisputeNetworkSpecificVisa() {
        return new DisputeNetworkSpecific.Visa();
    }

    /**
     * Create an instance of {@link PostEntryPart }
     * 
     */
    public PostEntryPart createPostEntryPart() {
        return new PostEntryPart();
    }

    /**
     * Create an instance of {@link CbiResponse }
     * 
     */
    public CbiResponse createCbiResponse() {
        return new CbiResponse();
    }

    /**
     * Create an instance of {@link CbiResponse.AccountInfo }
     * 
     */
    public CbiResponse.AccountInfo createCbiResponseAccountInfo() {
        return new CbiResponse.AccountInfo();
    }

    /**
     * Create an instance of {@link CbiResponse.AccountInfo.Account }
     * 
     */
    public CbiResponse.AccountInfo.Account createCbiResponseAccountInfoAccount() {
        return new CbiResponse.AccountInfo.Account();
    }

    /**
     * Create an instance of {@link CbiResponse.AccountInfo.Account.TranFees }
     * 
     */
    public CbiResponse.AccountInfo.Account.TranFees createCbiResponseAccountInfoAccountTranFees() {
        return new CbiResponse.AccountInfo.Account.TranFees();
    }

    /**
     * Create an instance of {@link CbiRequest }
     * 
     */
    public CbiRequest createCbiRequest() {
        return new CbiRequest();
    }

    /**
     * Create an instance of {@link CbiRequest.AccountInfo }
     * 
     */
    public CbiRequest.AccountInfo createCbiRequestAccountInfo() {
        return new CbiRequest.AccountInfo();
    }

    /**
     * Create an instance of {@link GroupOperResponse }
     * 
     */
    public GroupOperResponse createGroupOperResponse() {
        return new GroupOperResponse();
    }

    /**
     * Create an instance of {@link GroupOperRequest }
     * 
     */
    public GroupOperRequest createGroupOperRequest() {
        return new GroupOperRequest();
    }

    /**
     * Create an instance of {@link UserOperResponse }
     * 
     */
    public UserOperResponse createUserOperResponse() {
        return new UserOperResponse();
    }

    /**
     * Create an instance of {@link SelectPayeeConsumersRequest }
     * 
     */
    public SelectPayeeConsumersRequest createSelectPayeeConsumersRequest() {
        return new SelectPayeeConsumersRequest();
    }

    /**
     * Create an instance of {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter }
     * 
     */
    public SelectPayeeConsumersRequest.PayeeConsumerListFilter createSelectPayeeConsumersRequestPayeeConsumerListFilter() {
        return new SelectPayeeConsumersRequest.PayeeConsumerListFilter();
    }

    /**
     * Create an instance of {@link SelectPayeeBillsRequest }
     * 
     */
    public SelectPayeeBillsRequest createSelectPayeeBillsRequest() {
        return new SelectPayeeBillsRequest();
    }

    /**
     * Create an instance of {@link SelectPayeeBillsRequest.BillListFilter }
     * 
     */
    public SelectPayeeBillsRequest.BillListFilter createSelectPayeeBillsRequestBillListFilter() {
        return new SelectPayeeBillsRequest.BillListFilter();
    }

    /**
     * Create an instance of {@link SelectTransRequest }
     * 
     */
    public SelectTransRequest createSelectTransRequest() {
        return new SelectTransRequest();
    }

    /**
     * Create an instance of {@link SelectTransRequest.Party }
     * 
     */
    public SelectTransRequest.Party createSelectTransRequestParty() {
        return new SelectTransRequest.Party();
    }

    /**
     * Create an instance of {@link SelectSubjectsRequest }
     * 
     */
    public SelectSubjectsRequest createSelectSubjectsRequest() {
        return new SelectSubjectsRequest();
    }

    /**
     * Create an instance of {@link InquiryResponse }
     * 
     */
    public InquiryResponse createInquiryResponse() {
        return new InquiryResponse();
    }

    /**
     * Create an instance of {@link InquiryResponse.EventLog }
     * 
     */
    public InquiryResponse.EventLog createInquiryResponseEventLog() {
        return new InquiryResponse.EventLog();
    }

    /**
     * Create an instance of {@link InquiryResponse.CfgPackets }
     * 
     */
    public InquiryResponse.CfgPackets createInquiryResponseCfgPackets() {
        return new InquiryResponse.CfgPackets();
    }

    /**
     * Create an instance of {@link InquiryResponse.Metrics }
     * 
     */
    public InquiryResponse.Metrics createInquiryResponseMetrics() {
        return new InquiryResponse.Metrics();
    }

    /**
     * Create an instance of {@link InquiryResponse.Tasks }
     * 
     */
    public InquiryResponse.Tasks createInquiryResponseTasks() {
        return new InquiryResponse.Tasks();
    }

    /**
     * Create an instance of {@link InquiryRequest }
     * 
     */
    public InquiryRequest createInquiryRequest() {
        return new InquiryRequest();
    }

    /**
     * Create an instance of {@link InquiryRequest.Invoices }
     * 
     */
    public InquiryRequest.Invoices createInquiryRequestInvoices() {
        return new InquiryRequest.Invoices();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Response.EntryPlan }
     * 
     */
    public Response.EntryPlan createResponseEntryPlan() {
        return new Response.EntryPlan();
    }

    /**
     * Create an instance of {@link Response.EntryPlan.Entry }
     * 
     */
    public Response.EntryPlan.Entry createResponseEntryPlanEntry() {
        return new Response.EntryPlan.Entry();
    }

    /**
     * Create an instance of {@link Response.Moneys }
     * 
     */
    public Response.Moneys createResponseMoneys() {
        return new Response.Moneys();
    }

    /**
     * Create an instance of {@link Response.Moneys.Term }
     * 
     */
    public Response.Moneys.Term createResponseMoneysTerm() {
        return new Response.Moneys.Term();
    }

    /**
     * Create an instance of {@link Response.Moneys.Dcc }
     * 
     */
    public Response.Moneys.Dcc createResponseMoneysDcc() {
        return new Response.Moneys.Dcc();
    }

    /**
     * Create an instance of {@link Response.Specific }
     * 
     */
    public Response.Specific createResponseSpecific() {
        return new Response.Specific();
    }

    /**
     * Create an instance of {@link Response.Specific.InquiryTokenAuthData }
     * 
     */
    public Response.Specific.InquiryTokenAuthData createResponseSpecificInquiryTokenAuthData() {
        return new Response.Specific.InquiryTokenAuthData();
    }

    /**
     * Create an instance of {@link Response.Specific.RegOrgInNetwork }
     * 
     */
    public Response.Specific.RegOrgInNetwork createResponseSpecificRegOrgInNetwork() {
        return new Response.Specific.RegOrgInNetwork();
    }

    /**
     * Create an instance of {@link Response.Specific.Payment }
     * 
     */
    public Response.Specific.Payment createResponseSpecificPayment() {
        return new Response.Specific.Payment();
    }

    /**
     * Create an instance of {@link Response.Specific.BalanceSubtask }
     * 
     */
    public Response.Specific.BalanceSubtask createResponseSpecificBalanceSubtask() {
        return new Response.Specific.BalanceSubtask();
    }

    /**
     * Create an instance of {@link Response.Specific.BalanceSubtask.Reserves }
     * 
     */
    public Response.Specific.BalanceSubtask.Reserves createResponseSpecificBalanceSubtaskReserves() {
        return new Response.Specific.BalanceSubtask.Reserves();
    }

    /**
     * Create an instance of {@link Response.Specific.Group }
     * 
     */
    public Response.Specific.Group createResponseSpecificGroup() {
        return new Response.Specific.Group();
    }

    /**
     * Create an instance of {@link Response.Auth }
     * 
     */
    public Response.Auth createResponseAuth() {
        return new Response.Auth();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Request.Classification }
     * 
     */
    public Request.Classification createRequestClassification() {
        return new Request.Classification();
    }

    /**
     * Create an instance of {@link Request.Specific }
     * 
     */
    public Request.Specific createRequestSpecific() {
        return new Request.Specific();
    }

    /**
     * Create an instance of {@link Request.Specific.InquiryTokenAuthData }
     * 
     */
    public Request.Specific.InquiryTokenAuthData createRequestSpecificInquiryTokenAuthData() {
        return new Request.Specific.InquiryTokenAuthData();
    }

    /**
     * Create an instance of {@link Request.Specific.InquiryTokenAuthData.Aliases }
     * 
     */
    public Request.Specific.InquiryTokenAuthData.Aliases createRequestSpecificInquiryTokenAuthDataAliases() {
        return new Request.Specific.InquiryTokenAuthData.Aliases();
    }

    /**
     * Create an instance of {@link Request.Specific.RegOrgInNetwork }
     * 
     */
    public Request.Specific.RegOrgInNetwork createRequestSpecificRegOrgInNetwork() {
        return new Request.Specific.RegOrgInNetwork();
    }

    /**
     * Create an instance of {@link Request.Specific.Cheques }
     * 
     */
    public Request.Specific.Cheques createRequestSpecificCheques() {
        return new Request.Specific.Cheques();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData }
     * 
     */
    public Request.Specific.UpdateTokenAuthData createRequestSpecificUpdateTokenAuthData() {
        return new Request.Specific.UpdateTokenAuthData();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization createRequestSpecificUpdateTokenAuthDataDigitization() {
        return new Request.Specific.UpdateTokenAuthData.Digitization();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard createRequestSpecificUpdateTokenAuthDataDigitizationDigitizedCard() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.Card }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.Card createRequestSpecificUpdateTokenAuthDataDigitizationCard() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.Card();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.CardholderAuth }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.CardholderAuth createRequestSpecificUpdateTokenAuthDataCardholderAuth() {
        return new Request.Specific.UpdateTokenAuthData.CardholderAuth();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration }
     * 
     */
    public Request.Specific.Migration createRequestSpecificMigration() {
        return new Request.Specific.Migration();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts }
     * 
     */
    public Request.Specific.Migration.Contracts createRequestSpecificMigrationContracts() {
        return new Request.Specific.Migration.Contracts();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts.Contract }
     * 
     */
    public Request.Specific.Migration.Contracts.Contract createRequestSpecificMigrationContractsContract() {
        return new Request.Specific.Migration.Contracts.Contract();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts.Contract.BalancedPhases }
     * 
     */
    public Request.Specific.Migration.Contracts.Contract.BalancedPhases createRequestSpecificMigrationContractsContractBalancedPhases() {
        return new Request.Specific.Migration.Contracts.Contract.BalancedPhases();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts.Contract.Marks }
     * 
     */
    public Request.Specific.Migration.Contracts.Contract.Marks createRequestSpecificMigrationContractsContractMarks() {
        return new Request.Specific.Migration.Contracts.Contract.Marks();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Holds }
     * 
     */
    public Request.Specific.Migration.Holds createRequestSpecificMigrationHolds() {
        return new Request.Specific.Migration.Holds();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Entries }
     * 
     */
    public Request.Specific.Migration.Entries createRequestSpecificMigrationEntries() {
        return new Request.Specific.Migration.Entries();
    }

    /**
     * Create an instance of {@link Request.Specific.SetCcyRates }
     * 
     */
    public Request.Specific.SetCcyRates createRequestSpecificSetCcyRates() {
        return new Request.Specific.SetCcyRates();
    }

    /**
     * Create an instance of {@link Request.Specific.SetCcyRates.Group }
     * 
     */
    public Request.Specific.SetCcyRates.Group createRequestSpecificSetCcyRatesGroup() {
        return new Request.Specific.SetCcyRates.Group();
    }

    /**
     * Create an instance of {@link Request.Specific.Reject }
     * 
     */
    public Request.Specific.Reject createRequestSpecificReject() {
        return new Request.Specific.Reject();
    }

    /**
     * Create an instance of {@link Request.Specific.Group }
     * 
     */
    public Request.Specific.Group createRequestSpecificGroup() {
        return new Request.Specific.Group();
    }

    /**
     * Create an instance of {@link Request.Specific.Group.Tran }
     * 
     */
    public Request.Specific.Group.Tran createRequestSpecificGroupTran() {
        return new Request.Specific.Group.Tran();
    }

    /**
     * Create an instance of {@link Request.Specific.PostEntries }
     * 
     */
    public Request.Specific.PostEntries createRequestSpecificPostEntries() {
        return new Request.Specific.PostEntries();
    }

    /**
     * Create an instance of {@link Request.Specific.Purchase }
     * 
     */
    public Request.Specific.Purchase createRequestSpecificPurchase() {
        return new Request.Specific.Purchase();
    }

    /**
     * Create an instance of {@link Request.Specific.ProvisioningData }
     * 
     */
    public Request.Specific.ProvisioningData createRequestSpecificProvisioningData() {
        return new Request.Specific.ProvisioningData();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalRefill }
     * 
     */
    public Request.Specific.TerminalRefill createRequestSpecificTerminalRefill() {
        return new Request.Specific.TerminalRefill();
    }

    /**
     * Create an instance of {@link Request.Specific.ExportObj }
     * 
     */
    public Request.Specific.ExportObj createRequestSpecificExportObj() {
        return new Request.Specific.ExportObj();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalCutover }
     * 
     */
    public Request.Specific.TerminalCutover createRequestSpecificTerminalCutover() {
        return new Request.Specific.TerminalCutover();
    }

    /**
     * Create an instance of {@link Request.Specific.Reconciliation }
     * 
     */
    public Request.Specific.Reconciliation createRequestSpecificReconciliation() {
        return new Request.Specific.Reconciliation();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment }
     * 
     */
    public Request.Specific.Payment createRequestSpecificPayment() {
        return new Request.Specific.Payment();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment.Payee }
     * 
     */
    public Request.Specific.Payment.Payee createRequestSpecificPaymentPayee() {
        return new Request.Specific.Payment.Payee();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment.Payee.AmtAllocation }
     * 
     */
    public Request.Specific.Payment.Payee.AmtAllocation createRequestSpecificPaymentPayeeAmtAllocation() {
        return new Request.Specific.Payment.Payee.AmtAllocation();
    }

    /**
     * Create an instance of {@link Request.Moneys }
     * 
     */
    public Request.Moneys createRequestMoneys() {
        return new Request.Moneys();
    }

    /**
     * Create an instance of {@link Request.Moneys.Term }
     * 
     */
    public Request.Moneys.Term createRequestMoneysTerm() {
        return new Request.Moneys.Term();
    }

    /**
     * Create an instance of {@link Request.Moneys.Cust }
     * 
     */
    public Request.Moneys.Cust createRequestMoneysCust() {
        return new Request.Moneys.Cust();
    }

    /**
     * Create an instance of {@link Request.Match }
     * 
     */
    public Request.Match createRequestMatch() {
        return new Request.Match();
    }

    /**
     * Create an instance of {@link Request.Link }
     * 
     */
    public Request.Link createRequestLink() {
        return new Request.Link();
    }

    /**
     * Create an instance of {@link Request.Link.Prev }
     * 
     */
    public Request.Link.Prev createRequestLinkPrev() {
        return new Request.Link.Prev();
    }

    /**
     * Create an instance of {@link Request.Parties }
     * 
     */
    public Request.Parties createRequestParties() {
        return new Request.Parties();
    }

    /**
     * Create an instance of {@link Request.Parties.Payee }
     * 
     */
    public Request.Parties.Payee createRequestPartiesPayee() {
        return new Request.Parties.Payee();
    }

    /**
     * Create an instance of {@link Request.Parties.Payee.Auth }
     * 
     */
    public Request.Parties.Payee.Auth createRequestPartiesPayeeAuth() {
        return new Request.Parties.Payee.Auth();
    }

    /**
     * Create an instance of {@link Request.Parties.Cust }
     * 
     */
    public Request.Parties.Cust createRequestPartiesCust() {
        return new Request.Parties.Cust();
    }

    /**
     * Create an instance of {@link Request.Parties.Cust.Auth }
     * 
     */
    public Request.Parties.Cust.Auth createRequestPartiesCustAuth() {
        return new Request.Parties.Cust.Auth();
    }

    /**
     * Create an instance of {@link Request.Parties.Term }
     * 
     */
    public Request.Parties.Term createRequestPartiesTerm() {
        return new Request.Parties.Term();
    }

    /**
     * Create an instance of {@link Rtp }
     * 
     */
    public Rtp createRtp() {
        return new Rtp();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Tran }
     * 
     */
    public com.tranzaxis.schemas.tran.Tran createTran() {
        return new com.tranzaxis.schemas.tran.Tran();
    }

    /**
     * Create an instance of {@link UndoRequest }
     * 
     */
    public UndoRequest createUndoRequest() {
        return new UndoRequest();
    }

    /**
     * Create an instance of {@link CashDeskOrderExecRequest }
     * 
     */
    public CashDeskOrderExecRequest createCashDeskOrderExecRequest() {
        return new CashDeskOrderExecRequest();
    }

    /**
     * Create an instance of {@link SelectSubjectsResponse }
     * 
     */
    public SelectSubjectsResponse createSelectSubjectsResponse() {
        return new SelectSubjectsResponse();
    }

    /**
     * Create an instance of {@link SelectContractsRequest }
     * 
     */
    public SelectContractsRequest createSelectContractsRequest() {
        return new SelectContractsRequest();
    }

    /**
     * Create an instance of {@link SelectContractsResponse }
     * 
     */
    public SelectContractsResponse createSelectContractsResponse() {
        return new SelectContractsResponse();
    }

    /**
     * Create an instance of {@link SelectTokensRequest }
     * 
     */
    public SelectTokensRequest createSelectTokensRequest() {
        return new SelectTokensRequest();
    }

    /**
     * Create an instance of {@link SelectTokensResponse }
     * 
     */
    public SelectTokensResponse createSelectTokensResponse() {
        return new SelectTokensResponse();
    }

    /**
     * Create an instance of {@link SelectTerminalsRequest }
     * 
     */
    public SelectTerminalsRequest createSelectTerminalsRequest() {
        return new SelectTerminalsRequest();
    }

    /**
     * Create an instance of {@link SelectTerminalsResponse }
     * 
     */
    public SelectTerminalsResponse createSelectTerminalsResponse() {
        return new SelectTerminalsResponse();
    }

    /**
     * Create an instance of {@link SelectTransResponse }
     * 
     */
    public SelectTransResponse createSelectTransResponse() {
        return new SelectTransResponse();
    }

    /**
     * Create an instance of {@link SelectPayeeBillsResponse }
     * 
     */
    public SelectPayeeBillsResponse createSelectPayeeBillsResponse() {
        return new SelectPayeeBillsResponse();
    }

    /**
     * Create an instance of {@link SelectPayeeConsumersResponse }
     * 
     */
    public SelectPayeeConsumersResponse createSelectPayeeConsumersResponse() {
        return new SelectPayeeConsumersResponse();
    }

    /**
     * Create an instance of {@link UserOperRequest }
     * 
     */
    public UserOperRequest createUserOperRequest() {
        return new UserOperRequest();
    }

    /**
     * Create an instance of {@link MigrationEntryPart }
     * 
     */
    public MigrationEntryPart createMigrationEntryPart() {
        return new MigrationEntryPart();
    }

    /**
     * Create an instance of {@link FasterPaymentsMemberId }
     * 
     */
    public FasterPaymentsMemberId createFasterPaymentsMemberId() {
        return new FasterPaymentsMemberId();
    }

    /**
     * Create an instance of {@link AdminSpecific }
     * 
     */
    public AdminSpecific createAdminSpecific() {
        return new AdminSpecific();
    }

    /**
     * Create an instance of {@link InquiryCardEtuStatusSpecific }
     * 
     */
    public InquiryCardEtuStatusSpecific createInquiryCardEtuStatusSpecific() {
        return new InquiryCardEtuStatusSpecific();
    }

    /**
     * Create an instance of {@link Doers }
     * 
     */
    public Doers createDoers() {
        return new Doers();
    }

    /**
     * Create an instance of {@link BatchProcessInfo }
     * 
     */
    public BatchProcessInfo createBatchProcessInfo() {
        return new BatchProcessInfo();
    }

    /**
     * Create an instance of {@link PersonalInfoCheck }
     * 
     */
    public PersonalInfoCheck createPersonalInfoCheck() {
        return new PersonalInfoCheck();
    }

    /**
     * Create an instance of {@link IssuesInfo }
     * 
     */
    public IssuesInfo createIssuesInfo() {
        return new IssuesInfo();
    }

    /**
     * Create an instance of {@link SubjectSelectInfo }
     * 
     */
    public SubjectSelectInfo createSubjectSelectInfo() {
        return new SubjectSelectInfo();
    }

    /**
     * Create an instance of {@link ContractSelectInfo }
     * 
     */
    public ContractSelectInfo createContractSelectInfo() {
        return new ContractSelectInfo();
    }

    /**
     * Create an instance of {@link TokenSelectInfo }
     * 
     */
    public TokenSelectInfo createTokenSelectInfo() {
        return new TokenSelectInfo();
    }

    /**
     * Create an instance of {@link TerminalSelectInfo }
     * 
     */
    public TerminalSelectInfo createTerminalSelectInfo() {
        return new TerminalSelectInfo();
    }

    /**
     * Create an instance of {@link SubjectLinkSelectRq }
     * 
     */
    public SubjectLinkSelectRq createSubjectLinkSelectRq() {
        return new SubjectLinkSelectRq();
    }

    /**
     * Create an instance of {@link ContractLinkSelectRq }
     * 
     */
    public ContractLinkSelectRq createContractLinkSelectRq() {
        return new ContractLinkSelectRq();
    }

    /**
     * Create an instance of {@link TranInvoke }
     * 
     */
    public TranInvoke createTranInvoke() {
        return new TranInvoke();
    }

    /**
     * Create an instance of {@link UndoInvoke }
     * 
     */
    public UndoInvoke createUndoInvoke() {
        return new UndoInvoke();
    }

    /**
     * Create an instance of {@link CashDeskOrderExecInvoke }
     * 
     */
    public CashDeskOrderExecInvoke createCashDeskOrderExecInvoke() {
        return new CashDeskOrderExecInvoke();
    }

    /**
     * Create an instance of {@link InquiryInvoke }
     * 
     */
    public InquiryInvoke createInquiryInvoke() {
        return new InquiryInvoke();
    }

    /**
     * Create an instance of {@link SelectSubjectsInvoke }
     * 
     */
    public SelectSubjectsInvoke createSelectSubjectsInvoke() {
        return new SelectSubjectsInvoke();
    }

    /**
     * Create an instance of {@link SelectContractsInvoke }
     * 
     */
    public SelectContractsInvoke createSelectContractsInvoke() {
        return new SelectContractsInvoke();
    }

    /**
     * Create an instance of {@link SelectTokensInvoke }
     * 
     */
    public SelectTokensInvoke createSelectTokensInvoke() {
        return new SelectTokensInvoke();
    }

    /**
     * Create an instance of {@link SelectTerminalsInvoke }
     * 
     */
    public SelectTerminalsInvoke createSelectTerminalsInvoke() {
        return new SelectTerminalsInvoke();
    }

    /**
     * Create an instance of {@link SelectTransInvoke }
     * 
     */
    public SelectTransInvoke createSelectTransInvoke() {
        return new SelectTransInvoke();
    }

    /**
     * Create an instance of {@link SelectPayeeBillsInvoke }
     * 
     */
    public SelectPayeeBillsInvoke createSelectPayeeBillsInvoke() {
        return new SelectPayeeBillsInvoke();
    }

    /**
     * Create an instance of {@link SelectPayeeConsumersInvoke }
     * 
     */
    public SelectPayeeConsumersInvoke createSelectPayeeConsumersInvoke() {
        return new SelectPayeeConsumersInvoke();
    }

    /**
     * Create an instance of {@link UserOperInvoke }
     * 
     */
    public UserOperInvoke createUserOperInvoke() {
        return new UserOperInvoke();
    }

    /**
     * Create an instance of {@link GroupOperInvoke }
     * 
     */
    public GroupOperInvoke createGroupOperInvoke() {
        return new GroupOperInvoke();
    }

    /**
     * Create an instance of {@link CbiTran }
     * 
     */
    public CbiTran createCbiTran() {
        return new CbiTran();
    }

    /**
     * Create an instance of {@link CryptoServiceInvoke.CryptoServiceRequest }
     * 
     */
    public CryptoServiceInvoke.CryptoServiceRequest createCryptoServiceInvokeCryptoServiceRequest() {
        return new CryptoServiceInvoke.CryptoServiceRequest();
    }

    /**
     * Create an instance of {@link CryptoServiceInvoke.CryptoServiceResponse }
     * 
     */
    public CryptoServiceInvoke.CryptoServiceResponse createCryptoServiceInvokeCryptoServiceResponse() {
        return new CryptoServiceInvoke.CryptoServiceResponse();
    }

    /**
     * Create an instance of {@link RequestGroup.Tran.CopyCmd }
     * 
     */
    public RequestGroup.Tran.CopyCmd createRequestGroupTranCopyCmd() {
        return new RequestGroup.Tran.CopyCmd();
    }

    /**
     * Create an instance of {@link ScoringModules.Module }
     * 
     */
    public ScoringModules.Module createScoringModulesModule() {
        return new ScoringModules.Module();
    }

    /**
     * Create an instance of {@link TokenAliasAuthData.Owner }
     * 
     */
    public TokenAliasAuthData.Owner createTokenAliasAuthDataOwner() {
        return new TokenAliasAuthData.Owner();
    }

    /**
     * Create an instance of {@link ScaExemptionsNetworkSpecific.Visa }
     * 
     */
    public ScaExemptionsNetworkSpecific.Visa createScaExemptionsNetworkSpecificVisa() {
        return new ScaExemptionsNetworkSpecific.Visa();
    }

    /**
     * Create an instance of {@link DigitizationRs.ActivationMethods.ActivationMethod }
     * 
     */
    public DigitizationRs.ActivationMethods.ActivationMethod createDigitizationRsActivationMethodsActivationMethod() {
        return new DigitizationRs.ActivationMethods.ActivationMethod();
    }

    /**
     * Create an instance of {@link DigitizationRq.DeviceInfo }
     * 
     */
    public DigitizationRq.DeviceInfo createDigitizationRqDeviceInfo() {
        return new DigitizationRq.DeviceInfo();
    }

    /**
     * Create an instance of {@link DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons }
     * 
     */
    public DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons createDigitizationRqRiskInfoWpDigitizationRecommendationReasons() {
        return new DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons();
    }

    /**
     * Create an instance of {@link HoldActions.Action }
     * 
     */
    public HoldActions.Action createHoldActionsAction() {
        return new HoldActions.Action();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Postings.Posting }
     * 
     */
    public com.tranzaxis.schemas.tran.Postings.Posting createPostingsPosting() {
        return new com.tranzaxis.schemas.tran.Postings.Posting();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran.Entries.Entry.Part.InLink }
     * 
     */
    public com.tranzaxis.schemas.tran.Entries.Entry.Part.InLink createEntriesEntryPartInLink() {
        return new com.tranzaxis.schemas.tran.Entries.Entry.Part.InLink();
    }

    /**
     * Create an instance of {@link FinPlan.Oper }
     * 
     */
    public FinPlan.Oper createFinPlanOper() {
        return new FinPlan.Oper();
    }

    /**
     * Create an instance of {@link TdsRs.Cavv }
     * 
     */
    public TdsRs.Cavv createTdsRsCavv() {
        return new TdsRs.Cavv();
    }

    /**
     * Create an instance of {@link TdsRs.PersonalQuestions }
     * 
     */
    public TdsRs.PersonalQuestions createTdsRsPersonalQuestions() {
        return new TdsRs.PersonalQuestions();
    }

    /**
     * Create an instance of {@link TdsRs.CommonQuestions }
     * 
     */
    public TdsRs.CommonQuestions createTdsRsCommonQuestions() {
        return new TdsRs.CommonQuestions();
    }

    /**
     * Create an instance of {@link TdsRs.SetPassword }
     * 
     */
    public TdsRs.SetPassword createTdsRsSetPassword() {
        return new TdsRs.SetPassword();
    }

    /**
     * Create an instance of {@link TdsRs.AuthInvoice }
     * 
     */
    public TdsRs.AuthInvoice createTdsRsAuthInvoice() {
        return new TdsRs.AuthInvoice();
    }

    /**
     * Create an instance of {@link TdsRs.PAResScheme.Variants.Variant }
     * 
     */
    public TdsRs.PAResScheme.Variants.Variant createTdsRsPAResSchemeVariantsVariant() {
        return new TdsRs.PAResScheme.Variants.Variant();
    }

    /**
     * Create an instance of {@link TdsRs.Extensions.Extension }
     * 
     */
    public TdsRs.Extensions.Extension createTdsRsExtensionsExtension() {
        return new TdsRs.Extensions.Extension();
    }

    /**
     * Create an instance of {@link TdsRq.CommonQAs }
     * 
     */
    public TdsRq.CommonQAs createTdsRqCommonQAs() {
        return new TdsRq.CommonQAs();
    }

    /**
     * Create an instance of {@link TdsRq.AuthInvoice }
     * 
     */
    public TdsRq.AuthInvoice createTdsRqAuthInvoice() {
        return new TdsRq.AuthInvoice();
    }

    /**
     * Create an instance of {@link TdsRq.TranDetails.MerchantRiskIndicator }
     * 
     */
    public TdsRq.TranDetails.MerchantRiskIndicator createTdsRqTranDetailsMerchantRiskIndicator() {
        return new TdsRq.TranDetails.MerchantRiskIndicator();
    }

    /**
     * Create an instance of {@link TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo }
     * 
     */
    public TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo createTdsRqTranDetailsTdsRequestorPriorAuthenticationInfo() {
        return new TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo.MobilePhones }
     * 
     */
    public TdsRq.CardholderInfo.MobilePhones createTdsRqCardholderInfoMobilePhones() {
        return new TdsRq.CardholderInfo.MobilePhones();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo.WorkPhones }
     * 
     */
    public TdsRq.CardholderInfo.WorkPhones createTdsRqCardholderInfoWorkPhones() {
        return new TdsRq.CardholderInfo.WorkPhones();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo.Emails }
     * 
     */
    public TdsRq.CardholderInfo.Emails createTdsRqCardholderInfoEmails() {
        return new TdsRq.CardholderInfo.Emails();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo.MailAddress }
     * 
     */
    public TdsRq.CardholderInfo.MailAddress createTdsRqCardholderInfoMailAddress() {
        return new TdsRq.CardholderInfo.MailAddress();
    }

    /**
     * Create an instance of {@link TdsRq.CardholderInfo.HomeAddress }
     * 
     */
    public TdsRq.CardholderInfo.HomeAddress createTdsRqCardholderInfoHomeAddress() {
        return new TdsRq.CardholderInfo.HomeAddress();
    }

    /**
     * Create an instance of {@link TdsRq.PersonalQAs.QA }
     * 
     */
    public TdsRq.PersonalQAs.QA createTdsRqPersonalQAsQA() {
        return new TdsRq.PersonalQAs.QA();
    }

    /**
     * Create an instance of {@link TdsRq.Extensions.Extension }
     * 
     */
    public TdsRq.Extensions.Extension createTdsRqExtensionsExtension() {
        return new TdsRq.Extensions.Extension();
    }

    /**
     * Create an instance of {@link TdsPAResVariant.CallbackAddresses.CallbackAddress }
     * 
     */
    public TdsPAResVariant.CallbackAddresses.CallbackAddress createTdsPAResVariantCallbackAddressesCallbackAddress() {
        return new TdsPAResVariant.CallbackAddresses.CallbackAddress();
    }

    /**
     * Create an instance of {@link SendContractInfoSpecific.Statement }
     * 
     */
    public SendContractInfoSpecific.Statement createSendContractInfoSpecificStatement() {
        return new SendContractInfoSpecific.Statement();
    }

    /**
     * Create an instance of {@link SendContractInfoSpecific.Postings.Posting }
     * 
     */
    public SendContractInfoSpecific.Postings.Posting createSendContractInfoSpecificPostingsPosting() {
        return new SendContractInfoSpecific.Postings.Posting();
    }

    /**
     * Create an instance of {@link UpdateEtuMerchantSpecific.Error }
     * 
     */
    public UpdateEtuMerchantSpecific.Error createUpdateEtuMerchantSpecificError() {
        return new UpdateEtuMerchantSpecific.Error();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tic }
     * 
     */
    public NetworkSpecific.Tic createNetworkSpecificTic() {
        return new NetworkSpecific.Tic();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Visa }
     * 
     */
    public NetworkSpecific.Visa createNetworkSpecificVisa() {
        return new NetworkSpecific.Visa();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Amex }
     * 
     */
    public NetworkSpecific.Amex createNetworkSpecificAmex() {
        return new NetworkSpecific.Amex();
    }

    /**
     * Create an instance of {@link NetworkSpecific.SberRf }
     * 
     */
    public NetworkSpecific.SberRf createNetworkSpecificSberRf() {
        return new NetworkSpecific.SberRf();
    }

    /**
     * Create an instance of {@link NetworkSpecific.TpII }
     * 
     */
    public NetworkSpecific.TpII createNetworkSpecificTpII() {
        return new NetworkSpecific.TpII();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Discover }
     * 
     */
    public NetworkSpecific.Discover createNetworkSpecificDiscover() {
        return new NetworkSpecific.Discover();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Cup }
     * 
     */
    public NetworkSpecific.Cup createNetworkSpecificCup() {
        return new NetworkSpecific.Cup();
    }

    /**
     * Create an instance of {@link NetworkSpecific.DinersClub }
     * 
     */
    public NetworkSpecific.DinersClub createNetworkSpecificDinersClub() {
        return new NetworkSpecific.DinersClub();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Jcb }
     * 
     */
    public NetworkSpecific.Jcb createNetworkSpecificJcb() {
        return new NetworkSpecific.Jcb();
    }

    /**
     * Create an instance of {@link NetworkSpecific.TecBan }
     * 
     */
    public NetworkSpecific.TecBan createNetworkSpecificTecBan() {
        return new NetworkSpecific.TecBan();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Nspk }
     * 
     */
    public NetworkSpecific.Nspk createNetworkSpecificNspk() {
        return new NetworkSpecific.Nspk();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Postilion }
     * 
     */
    public NetworkSpecific.Postilion createNetworkSpecificPostilion() {
        return new NetworkSpecific.Postilion();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Custom }
     * 
     */
    public NetworkSpecific.Custom createNetworkSpecificCustom() {
        return new NetworkSpecific.Custom();
    }

    /**
     * Create an instance of {@link NetworkSpecific.NbcCss }
     * 
     */
    public NetworkSpecific.NbcCss createNetworkSpecificNbcCss() {
        return new NetworkSpecific.NbcCss();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Mpu }
     * 
     */
    public NetworkSpecific.Mpu createNetworkSpecificMpu() {
        return new NetworkSpecific.Mpu();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Cortex }
     * 
     */
    public NetworkSpecific.Cortex createNetworkSpecificCortex() {
        return new NetworkSpecific.Cortex();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tieto.AcquirerRqAddData.Tag }
     * 
     */
    public NetworkSpecific.Tieto.AcquirerRqAddData.Tag createNetworkSpecificTietoAcquirerRqAddDataTag() {
        return new NetworkSpecific.Tieto.AcquirerRqAddData.Tag();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Tieto.IssuerRefereneceData.Tag }
     * 
     */
    public NetworkSpecific.Tieto.IssuerRefereneceData.Tag createNetworkSpecificTietoIssuerRefereneceDataTag() {
        return new NetworkSpecific.Tieto.IssuerRefereneceData.Tag();
    }

    /**
     * Create an instance of {@link NetworkSpecific.FasterPayments.ChargeInfo }
     * 
     */
    public NetworkSpecific.FasterPayments.ChargeInfo createNetworkSpecificFasterPaymentsChargeInfo() {
        return new NetworkSpecific.FasterPayments.ChargeInfo();
    }

    /**
     * Create an instance of {@link NetworkSpecific.FasterPayments.FileId }
     * 
     */
    public NetworkSpecific.FasterPayments.FileId createNetworkSpecificFasterPaymentsFileId() {
        return new NetworkSpecific.FasterPayments.FileId();
    }

    /**
     * Create an instance of {@link NetworkSpecific.FasterPayments.Limits }
     * 
     */
    public NetworkSpecific.FasterPayments.Limits createNetworkSpecificFasterPaymentsLimits() {
        return new NetworkSpecific.FasterPayments.Limits();
    }

    /**
     * Create an instance of {@link NetworkSpecific.FasterPayments.Members }
     * 
     */
    public NetworkSpecific.FasterPayments.Members createNetworkSpecificFasterPaymentsMembers() {
        return new NetworkSpecific.FasterPayments.Members();
    }

    /**
     * Create an instance of {@link NetworkSpecific.Way4 .Fees.Fee }
     * 
     */
    public NetworkSpecific.Way4 .Fees.Fee createNetworkSpecificWay4FeesFee() {
        return new NetworkSpecific.Way4 .Fees.Fee();
    }

    /**
     * Create an instance of {@link NetworkSpecific.MasterCard.OnBehalf }
     * 
     */
    public NetworkSpecific.MasterCard.OnBehalf createNetworkSpecificMasterCardOnBehalf() {
        return new NetworkSpecific.MasterCard.OnBehalf();
    }

    /**
     * Create an instance of {@link ReconciliationNetworkSpecific.DinersClub }
     * 
     */
    public ReconciliationNetworkSpecific.DinersClub createReconciliationNetworkSpecificDinersClub() {
        return new ReconciliationNetworkSpecific.DinersClub();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific.MasterCard }
     * 
     */
    public DisputeNetworkSpecific.MasterCard createDisputeNetworkSpecificMasterCard() {
        return new DisputeNetworkSpecific.MasterCard();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific.DinersClub.RequiredDocs }
     * 
     */
    public DisputeNetworkSpecific.DinersClub.RequiredDocs createDisputeNetworkSpecificDinersClubRequiredDocs() {
        return new DisputeNetworkSpecific.DinersClub.RequiredDocs();
    }

    /**
     * Create an instance of {@link DisputeNetworkSpecific.Visa.ReturnReason }
     * 
     */
    public DisputeNetworkSpecific.Visa.ReturnReason createDisputeNetworkSpecificVisaReturnReason() {
        return new DisputeNetworkSpecific.Visa.ReturnReason();
    }

    /**
     * Create an instance of {@link PostEntryPart.InLink }
     * 
     */
    public PostEntryPart.InLink createPostEntryPartInLink() {
        return new PostEntryPart.InLink();
    }

    /**
     * Create an instance of {@link CbiResponse.AccountInfo.Account.TranFees.Fee }
     * 
     */
    public CbiResponse.AccountInfo.Account.TranFees.Fee createCbiResponseAccountInfoAccountTranFeesFee() {
        return new CbiResponse.AccountInfo.Account.TranFees.Fee();
    }

    /**
     * Create an instance of {@link CbiRequest.Stip }
     * 
     */
    public CbiRequest.Stip createCbiRequestStip() {
        return new CbiRequest.Stip();
    }

    /**
     * Create an instance of {@link CbiRequest.AccountInfo.Account }
     * 
     */
    public CbiRequest.AccountInfo.Account createCbiRequestAccountInfoAccount() {
        return new CbiRequest.AccountInfo.Account();
    }

    /**
     * Create an instance of {@link GroupOperResponse.Oper }
     * 
     */
    public GroupOperResponse.Oper createGroupOperResponseOper() {
        return new GroupOperResponse.Oper();
    }

    /**
     * Create an instance of {@link GroupOperRequest.Oper }
     * 
     */
    public GroupOperRequest.Oper createGroupOperRequestOper() {
        return new GroupOperRequest.Oper();
    }

    /**
     * Create an instance of {@link UserOperResponse.List }
     * 
     */
    public UserOperResponse.List createUserOperResponseList() {
        return new UserOperResponse.List();
    }

    /**
     * Create an instance of {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers }
     * 
     */
    public SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers createSelectPayeeConsumersRequestPayeeConsumerListFilterPayers() {
        return new SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers();
    }

    /**
     * Create an instance of {@link SelectPayeeBillsRequest.BillListFilter.Payers }
     * 
     */
    public SelectPayeeBillsRequest.BillListFilter.Payers createSelectPayeeBillsRequestBillListFilterPayers() {
        return new SelectPayeeBillsRequest.BillListFilter.Payers();
    }

    /**
     * Create an instance of {@link SelectTransRequest.Party.Token }
     * 
     */
    public SelectTransRequest.Party.Token createSelectTransRequestPartyToken() {
        return new SelectTransRequest.Party.Token();
    }

    /**
     * Create an instance of {@link SelectTransRequest.Party.Contract }
     * 
     */
    public SelectTransRequest.Party.Contract createSelectTransRequestPartyContract() {
        return new SelectTransRequest.Party.Contract();
    }

    /**
     * Create an instance of {@link SelectTransRequest.Party.Subject }
     * 
     */
    public SelectTransRequest.Party.Subject createSelectTransRequestPartySubject() {
        return new SelectTransRequest.Party.Subject();
    }

    /**
     * Create an instance of {@link SelectTransRequest.Party.Batch }
     * 
     */
    public SelectTransRequest.Party.Batch createSelectTransRequestPartyBatch() {
        return new SelectTransRequest.Party.Batch();
    }

    /**
     * Create an instance of {@link SelectSubjectsRequest.Issues }
     * 
     */
    public SelectSubjectsRequest.Issues createSelectSubjectsRequestIssues() {
        return new SelectSubjectsRequest.Issues();
    }

    /**
     * Create an instance of {@link InquiryResponse.Batches }
     * 
     */
    public InquiryResponse.Batches createInquiryResponseBatches() {
        return new InquiryResponse.Batches();
    }

    /**
     * Create an instance of {@link InquiryResponse.Invoices }
     * 
     */
    public InquiryResponse.Invoices createInquiryResponseInvoices() {
        return new InquiryResponse.Invoices();
    }

    /**
     * Create an instance of {@link InquiryResponse.EventLog.Rec }
     * 
     */
    public InquiryResponse.EventLog.Rec createInquiryResponseEventLogRec() {
        return new InquiryResponse.EventLog.Rec();
    }

    /**
     * Create an instance of {@link InquiryResponse.CfgPackets.Packet }
     * 
     */
    public InquiryResponse.CfgPackets.Packet createInquiryResponseCfgPacketsPacket() {
        return new InquiryResponse.CfgPackets.Packet();
    }

    /**
     * Create an instance of {@link InquiryResponse.Metrics.Metric }
     * 
     */
    public InquiryResponse.Metrics.Metric createInquiryResponseMetricsMetric() {
        return new InquiryResponse.Metrics.Metric();
    }

    /**
     * Create an instance of {@link InquiryResponse.Tasks.Task }
     * 
     */
    public InquiryResponse.Tasks.Task createInquiryResponseTasksTask() {
        return new InquiryResponse.Tasks.Task();
    }

    /**
     * Create an instance of {@link InquiryRequest.Batches }
     * 
     */
    public InquiryRequest.Batches createInquiryRequestBatches() {
        return new InquiryRequest.Batches();
    }

    /**
     * Create an instance of {@link InquiryRequest.Tasks }
     * 
     */
    public InquiryRequest.Tasks createInquiryRequestTasks() {
        return new InquiryRequest.Tasks();
    }

    /**
     * Create an instance of {@link InquiryRequest.Metrics }
     * 
     */
    public InquiryRequest.Metrics createInquiryRequestMetrics() {
        return new InquiryRequest.Metrics();
    }

    /**
     * Create an instance of {@link InquiryRequest.CfgPackets }
     * 
     */
    public InquiryRequest.CfgPackets createInquiryRequestCfgPackets() {
        return new InquiryRequest.CfgPackets();
    }

    /**
     * Create an instance of {@link InquiryRequest.EventLog }
     * 
     */
    public InquiryRequest.EventLog createInquiryRequestEventLog() {
        return new InquiryRequest.EventLog();
    }

    /**
     * Create an instance of {@link InquiryRequest.Invoices.Invoice }
     * 
     */
    public InquiryRequest.Invoices.Invoice createInquiryRequestInvoicesInvoice() {
        return new InquiryRequest.Invoices.Invoice();
    }

    /**
     * Create an instance of {@link Response.Emv }
     * 
     */
    public Response.Emv createResponseEmv() {
        return new Response.Emv();
    }

    /**
     * Create an instance of {@link Response.Match }
     * 
     */
    public Response.Match createResponseMatch() {
        return new Response.Match();
    }

    /**
     * Create an instance of {@link Response.EntryPlan.Entry.Part }
     * 
     */
    public Response.EntryPlan.Entry.Part createResponseEntryPlanEntryPart() {
        return new Response.EntryPlan.Entry.Part();
    }

    /**
     * Create an instance of {@link Response.Moneys.Settle }
     * 
     */
    public Response.Moneys.Settle createResponseMoneysSettle() {
        return new Response.Moneys.Settle();
    }

    /**
     * Create an instance of {@link Response.Moneys.IssuerClear }
     * 
     */
    public Response.Moneys.IssuerClear createResponseMoneysIssuerClear() {
        return new Response.Moneys.IssuerClear();
    }

    /**
     * Create an instance of {@link Response.Moneys.Dest }
     * 
     */
    public Response.Moneys.Dest createResponseMoneysDest() {
        return new Response.Moneys.Dest();
    }

    /**
     * Create an instance of {@link Response.Moneys.Term.Surcharges }
     * 
     */
    public Response.Moneys.Term.Surcharges createResponseMoneysTermSurcharges() {
        return new Response.Moneys.Term.Surcharges();
    }

    /**
     * Create an instance of {@link Response.Moneys.Dcc.Surcharges }
     * 
     */
    public Response.Moneys.Dcc.Surcharges createResponseMoneysDccSurcharges() {
        return new Response.Moneys.Dcc.Surcharges();
    }

    /**
     * Create an instance of {@link Response.Specific.Hold }
     * 
     */
    public Response.Specific.Hold createResponseSpecificHold() {
        return new Response.Specific.Hold();
    }

    /**
     * Create an instance of {@link Response.Specific.CreateVirtualCard }
     * 
     */
    public Response.Specific.CreateVirtualCard createResponseSpecificCreateVirtualCard() {
        return new Response.Specific.CreateVirtualCard();
    }

    /**
     * Create an instance of {@link Response.Specific.CreateLogin }
     * 
     */
    public Response.Specific.CreateLogin createResponseSpecificCreateLogin() {
        return new Response.Specific.CreateLogin();
    }

    /**
     * Create an instance of {@link Response.Specific.RepaymentLoan }
     * 
     */
    public Response.Specific.RepaymentLoan createResponseSpecificRepaymentLoan() {
        return new Response.Specific.RepaymentLoan();
    }

    /**
     * Create an instance of {@link Response.Specific.StandingOrder }
     * 
     */
    public Response.Specific.StandingOrder createResponseSpecificStandingOrder() {
        return new Response.Specific.StandingOrder();
    }

    /**
     * Create an instance of {@link Response.Specific.RunBatchProc }
     * 
     */
    public Response.Specific.RunBatchProc createResponseSpecificRunBatchProc() {
        return new Response.Specific.RunBatchProc();
    }

    /**
     * Create an instance of {@link Response.Specific.ImportCfgPacket }
     * 
     */
    public Response.Specific.ImportCfgPacket createResponseSpecificImportCfgPacket() {
        return new Response.Specific.ImportCfgPacket();
    }

    /**
     * Create an instance of {@link Response.Specific.ScoreSubject }
     * 
     */
    public Response.Specific.ScoreSubject createResponseSpecificScoreSubject() {
        return new Response.Specific.ScoreSubject();
    }

    /**
     * Create an instance of {@link Response.Specific.TerminalRefill }
     * 
     */
    public Response.Specific.TerminalRefill createResponseSpecificTerminalRefill() {
        return new Response.Specific.TerminalRefill();
    }

    /**
     * Create an instance of {@link Response.Specific.Token }
     * 
     */
    public Response.Specific.Token createResponseSpecificToken() {
        return new Response.Specific.Token();
    }

    /**
     * Create an instance of {@link Response.Specific.ProvisioningData }
     * 
     */
    public Response.Specific.ProvisioningData createResponseSpecificProvisioningData() {
        return new Response.Specific.ProvisioningData();
    }

    /**
     * Create an instance of {@link Response.Specific.LoadCfgPacket }
     * 
     */
    public Response.Specific.LoadCfgPacket createResponseSpecificLoadCfgPacket() {
        return new Response.Specific.LoadCfgPacket();
    }

    /**
     * Create an instance of {@link Response.Specific.InquiryTokenAuthData.Aliases }
     * 
     */
    public Response.Specific.InquiryTokenAuthData.Aliases createResponseSpecificInquiryTokenAuthDataAliases() {
        return new Response.Specific.InquiryTokenAuthData.Aliases();
    }

    /**
     * Create an instance of {@link Response.Specific.RegOrgInNetwork.Error }
     * 
     */
    public Response.Specific.RegOrgInNetwork.Error createResponseSpecificRegOrgInNetworkError() {
        return new Response.Specific.RegOrgInNetwork.Error();
    }

    /**
     * Create an instance of {@link Response.Specific.Payment.Terminal }
     * 
     */
    public Response.Specific.Payment.Terminal createResponseSpecificPaymentTerminal() {
        return new Response.Specific.Payment.Terminal();
    }

    /**
     * Create an instance of {@link Response.Specific.BalanceSubtask.Reserves.Reserve }
     * 
     */
    public Response.Specific.BalanceSubtask.Reserves.Reserve createResponseSpecificBalanceSubtaskReservesReserve() {
        return new Response.Specific.BalanceSubtask.Reserves.Reserve();
    }

    /**
     * Create an instance of {@link Response.Specific.Group.Tran }
     * 
     */
    public Response.Specific.Group.Tran createResponseSpecificGroupTran() {
        return new Response.Specific.Group.Tran();
    }

    /**
     * Create an instance of {@link Response.Auth.PayeePersonalInfo }
     * 
     */
    public Response.Auth.PayeePersonalInfo createResponseAuthPayeePersonalInfo() {
        return new Response.Auth.PayeePersonalInfo();
    }

    /**
     * Create an instance of {@link Response.Auth.ScaExemptions }
     * 
     */
    public Response.Auth.ScaExemptions createResponseAuthScaExemptions() {
        return new Response.Auth.ScaExemptions();
    }

    /**
     * Create an instance of {@link Request.InitiatorExtMessages }
     * 
     */
    public Request.InitiatorExtMessages createRequestInitiatorExtMessages() {
        return new Request.InitiatorExtMessages();
    }

    /**
     * Create an instance of {@link Request.Classification.Classifier }
     * 
     */
    public Request.Classification.Classifier createRequestClassificationClassifier() {
        return new Request.Classification.Classifier();
    }

    /**
     * Create an instance of {@link Request.Specific.PaymentTemplate }
     * 
     */
    public Request.Specific.PaymentTemplate createRequestSpecificPaymentTemplate() {
        return new Request.Specific.PaymentTemplate();
    }

    /**
     * Create an instance of {@link Request.Specific.PinChange }
     * 
     */
    public Request.Specific.PinChange createRequestSpecificPinChange() {
        return new Request.Specific.PinChange();
    }

    /**
     * Create an instance of {@link Request.Specific.PasswordChange }
     * 
     */
    public Request.Specific.PasswordChange createRequestSpecificPasswordChange() {
        return new Request.Specific.PasswordChange();
    }

    /**
     * Create an instance of {@link Request.Specific.Admin }
     * 
     */
    public Request.Specific.Admin createRequestSpecificAdmin() {
        return new Request.Specific.Admin();
    }

    /**
     * Create an instance of {@link Request.Specific.Dispute }
     * 
     */
    public Request.Specific.Dispute createRequestSpecificDispute() {
        return new Request.Specific.Dispute();
    }

    /**
     * Create an instance of {@link Request.Specific.Settlement }
     * 
     */
    public Request.Specific.Settlement createRequestSpecificSettlement() {
        return new Request.Specific.Settlement();
    }

    /**
     * Create an instance of {@link Request.Specific.TranReconciliation }
     * 
     */
    public Request.Specific.TranReconciliation createRequestSpecificTranReconciliation() {
        return new Request.Specific.TranReconciliation();
    }

    /**
     * Create an instance of {@link Request.Specific.InterchangeDemand }
     * 
     */
    public Request.Specific.InterchangeDemand createRequestSpecificInterchangeDemand() {
        return new Request.Specific.InterchangeDemand();
    }

    /**
     * Create an instance of {@link Request.Specific.Balance }
     * 
     */
    public Request.Specific.Balance createRequestSpecificBalance() {
        return new Request.Specific.Balance();
    }

    /**
     * Create an instance of {@link Request.Specific.BalanceSubtask }
     * 
     */
    public Request.Specific.BalanceSubtask createRequestSpecificBalanceSubtask() {
        return new Request.Specific.BalanceSubtask();
    }

    /**
     * Create an instance of {@link Request.Specific.Hold }
     * 
     */
    public Request.Specific.Hold createRequestSpecificHold() {
        return new Request.Specific.Hold();
    }

    /**
     * Create an instance of {@link Request.Specific.ExceptionalCard }
     * 
     */
    public Request.Specific.ExceptionalCard createRequestSpecificExceptionalCard() {
        return new Request.Specific.ExceptionalCard();
    }

    /**
     * Create an instance of {@link Request.Specific.ExportTran }
     * 
     */
    public Request.Specific.ExportTran createRequestSpecificExportTran() {
        return new Request.Specific.ExportTran();
    }

    /**
     * Create an instance of {@link Request.Specific.CurrencyExchange }
     * 
     */
    public Request.Specific.CurrencyExchange createRequestSpecificCurrencyExchange() {
        return new Request.Specific.CurrencyExchange();
    }

    /**
     * Create an instance of {@link Request.Specific.RecurringPayment }
     * 
     */
    public Request.Specific.RecurringPayment createRequestSpecificRecurringPayment() {
        return new Request.Specific.RecurringPayment();
    }

    /**
     * Create an instance of {@link Request.Specific.Warrant }
     * 
     */
    public Request.Specific.Warrant createRequestSpecificWarrant() {
        return new Request.Specific.Warrant();
    }

    /**
     * Create an instance of {@link Request.Specific.CreateVirtualCard }
     * 
     */
    public Request.Specific.CreateVirtualCard createRequestSpecificCreateVirtualCard() {
        return new Request.Specific.CreateVirtualCard();
    }

    /**
     * Create an instance of {@link Request.Specific.CreateLogin }
     * 
     */
    public Request.Specific.CreateLogin createRequestSpecificCreateLogin() {
        return new Request.Specific.CreateLogin();
    }

    /**
     * Create an instance of {@link Request.Specific.ChargeNotification }
     * 
     */
    public Request.Specific.ChargeNotification createRequestSpecificChargeNotification() {
        return new Request.Specific.ChargeNotification();
    }

    /**
     * Create an instance of {@link Request.Specific.RepaymentLoan }
     * 
     */
    public Request.Specific.RepaymentLoan createRequestSpecificRepaymentLoan() {
        return new Request.Specific.RepaymentLoan();
    }

    /**
     * Create an instance of {@link Request.Specific.FinishContract }
     * 
     */
    public Request.Specific.FinishContract createRequestSpecificFinishContract() {
        return new Request.Specific.FinishContract();
    }

    /**
     * Create an instance of {@link Request.Specific.RetryRejectedTran }
     * 
     */
    public Request.Specific.RetryRejectedTran createRequestSpecificRetryRejectedTran() {
        return new Request.Specific.RetryRejectedTran();
    }

    /**
     * Create an instance of {@link Request.Specific.ChangeInterfaceKeys }
     * 
     */
    public Request.Specific.ChangeInterfaceKeys createRequestSpecificChangeInterfaceKeys() {
        return new Request.Specific.ChangeInterfaceKeys();
    }

    /**
     * Create an instance of {@link Request.Specific.RunBatchProc }
     * 
     */
    public Request.Specific.RunBatchProc createRequestSpecificRunBatchProc() {
        return new Request.Specific.RunBatchProc();
    }

    /**
     * Create an instance of {@link Request.Specific.RunTask }
     * 
     */
    public Request.Specific.RunTask createRequestSpecificRunTask() {
        return new Request.Specific.RunTask();
    }

    /**
     * Create an instance of {@link Request.Specific.ImportCfgPacket }
     * 
     */
    public Request.Specific.ImportCfgPacket createRequestSpecificImportCfgPacket() {
        return new Request.Specific.ImportCfgPacket();
    }

    /**
     * Create an instance of {@link Request.Specific.LoadCfgPacket }
     * 
     */
    public Request.Specific.LoadCfgPacket createRequestSpecificLoadCfgPacket() {
        return new Request.Specific.LoadCfgPacket();
    }

    /**
     * Create an instance of {@link Request.Specific.ImportCfgSnapshot }
     * 
     */
    public Request.Specific.ImportCfgSnapshot createRequestSpecificImportCfgSnapshot() {
        return new Request.Specific.ImportCfgSnapshot();
    }

    /**
     * Create an instance of {@link Request.Specific.ApplyCfgSnapshot }
     * 
     */
    public Request.Specific.ApplyCfgSnapshot createRequestSpecificApplyCfgSnapshot() {
        return new Request.Specific.ApplyCfgSnapshot();
    }

    /**
     * Create an instance of {@link Request.Specific.ScoreSubject }
     * 
     */
    public Request.Specific.ScoreSubject createRequestSpecificScoreSubject() {
        return new Request.Specific.ScoreSubject();
    }

    /**
     * Create an instance of {@link Request.Specific.ChangeMACKey }
     * 
     */
    public Request.Specific.ChangeMACKey createRequestSpecificChangeMACKey() {
        return new Request.Specific.ChangeMACKey();
    }

    /**
     * Create an instance of {@link Request.Specific.MultiClearing }
     * 
     */
    public Request.Specific.MultiClearing createRequestSpecificMultiClearing() {
        return new Request.Specific.MultiClearing();
    }

    /**
     * Create an instance of {@link Request.Specific.WriteOff }
     * 
     */
    public Request.Specific.WriteOff createRequestSpecificWriteOff() {
        return new Request.Specific.WriteOff();
    }

    /**
     * Create an instance of {@link Request.Specific.ClearFee }
     * 
     */
    public Request.Specific.ClearFee createRequestSpecificClearFee() {
        return new Request.Specific.ClearFee();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalFinanceDelay }
     * 
     */
    public Request.Specific.TerminalFinanceDelay createRequestSpecificTerminalFinanceDelay() {
        return new Request.Specific.TerminalFinanceDelay();
    }

    /**
     * Create an instance of {@link Request.Specific.QuasiCash }
     * 
     */
    public Request.Specific.QuasiCash createRequestSpecificQuasiCash() {
        return new Request.Specific.QuasiCash();
    }

    /**
     * Create an instance of {@link Request.Specific.SetupTrustedPayee }
     * 
     */
    public Request.Specific.SetupTrustedPayee createRequestSpecificSetupTrustedPayee() {
        return new Request.Specific.SetupTrustedPayee();
    }

    /**
     * Create an instance of {@link Request.Specific.InquiryTokenAuthData.Aliases.Alias }
     * 
     */
    public Request.Specific.InquiryTokenAuthData.Aliases.Alias createRequestSpecificInquiryTokenAuthDataAliasesAlias() {
        return new Request.Specific.InquiryTokenAuthData.Aliases.Alias();
    }

    /**
     * Create an instance of {@link Request.Specific.RegOrgInNetwork.Documents }
     * 
     */
    public Request.Specific.RegOrgInNetwork.Documents createRequestSpecificRegOrgInNetworkDocuments() {
        return new Request.Specific.RegOrgInNetwork.Documents();
    }

    /**
     * Create an instance of {@link Request.Specific.RegOrgInNetwork.Error }
     * 
     */
    public Request.Specific.RegOrgInNetwork.Error createRequestSpecificRegOrgInNetworkError() {
        return new Request.Specific.RegOrgInNetwork.Error();
    }

    /**
     * Create an instance of {@link Request.Specific.Cheques.Cheque }
     * 
     */
    public Request.Specific.Cheques.Cheque createRequestSpecificChequesCheque() {
        return new Request.Specific.Cheques.Cheque();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.CardAuth }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.CardAuth createRequestSpecificUpdateTokenAuthDataCardAuth() {
        return new Request.Specific.UpdateTokenAuthData.CardAuth();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.RegTokenInNetwork }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.RegTokenInNetwork createRequestSpecificUpdateTokenAuthDataRegTokenInNetwork() {
        return new Request.Specific.UpdateTokenAuthData.RegTokenInNetwork();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Alias }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Alias createRequestSpecificUpdateTokenAuthDataAlias() {
        return new Request.Specific.UpdateTokenAuthData.Alias();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.StatusChange }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.StatusChange createRequestSpecificUpdateTokenAuthDataDigitizationDigitizedCardStatusChange() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.StatusChange();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.DeviceBinding }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.DeviceBinding createRequestSpecificUpdateTokenAuthDataDigitizationDigitizedCardDeviceBinding() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.DeviceBinding();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.CardholderVerification }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.CardholderVerification createRequestSpecificUpdateTokenAuthDataDigitizationDigitizedCardCardholderVerification() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.DigitizedCard.CardholderVerification();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.Card.Reissue }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.Card.Reissue createRequestSpecificUpdateTokenAuthDataDigitizationCardReissue() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.Card.Reissue();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.Digitization.Card.StatusChange }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.Digitization.Card.StatusChange createRequestSpecificUpdateTokenAuthDataDigitizationCardStatusChange() {
        return new Request.Specific.UpdateTokenAuthData.Digitization.Card.StatusChange();
    }

    /**
     * Create an instance of {@link Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents }
     * 
     */
    public Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents createRequestSpecificUpdateTokenAuthDataCardholderAuthDocuments() {
        return new Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.DestMatch }
     * 
     */
    public Request.Specific.Migration.DestMatch createRequestSpecificMigrationDestMatch() {
        return new Request.Specific.Migration.DestMatch();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts.Contract.BalancedPhases.BalancedPhase }
     * 
     */
    public Request.Specific.Migration.Contracts.Contract.BalancedPhases.BalancedPhase createRequestSpecificMigrationContractsContractBalancedPhasesBalancedPhase() {
        return new Request.Specific.Migration.Contracts.Contract.BalancedPhases.BalancedPhase();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Contracts.Contract.Marks.Mark }
     * 
     */
    public Request.Specific.Migration.Contracts.Contract.Marks.Mark createRequestSpecificMigrationContractsContractMarksMark() {
        return new Request.Specific.Migration.Contracts.Contract.Marks.Mark();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Holds.Hold }
     * 
     */
    public Request.Specific.Migration.Holds.Hold createRequestSpecificMigrationHoldsHold() {
        return new Request.Specific.Migration.Holds.Hold();
    }

    /**
     * Create an instance of {@link Request.Specific.Migration.Entries.Entry }
     * 
     */
    public Request.Specific.Migration.Entries.Entry createRequestSpecificMigrationEntriesEntry() {
        return new Request.Specific.Migration.Entries.Entry();
    }

    /**
     * Create an instance of {@link Request.Specific.SetCcyRates.Group.Rate }
     * 
     */
    public Request.Specific.SetCcyRates.Group.Rate createRequestSpecificSetCcyRatesGroupRate() {
        return new Request.Specific.SetCcyRates.Group.Rate();
    }

    /**
     * Create an instance of {@link Request.Specific.Reject.Reason }
     * 
     */
    public Request.Specific.Reject.Reason createRequestSpecificRejectReason() {
        return new Request.Specific.Reject.Reason();
    }

    /**
     * Create an instance of {@link Request.Specific.Group.Tran.Refine }
     * 
     */
    public Request.Specific.Group.Tran.Refine createRequestSpecificGroupTranRefine() {
        return new Request.Specific.Group.Tran.Refine();
    }

    /**
     * Create an instance of {@link Request.Specific.PostEntries.Entry }
     * 
     */
    public Request.Specific.PostEntries.Entry createRequestSpecificPostEntriesEntry() {
        return new Request.Specific.PostEntries.Entry();
    }

    /**
     * Create an instance of {@link Request.Specific.Purchase.Params }
     * 
     */
    public Request.Specific.Purchase.Params createRequestSpecificPurchaseParams() {
        return new Request.Specific.Purchase.Params();
    }

    /**
     * Create an instance of {@link Request.Specific.ProvisioningData.Certificates }
     * 
     */
    public Request.Specific.ProvisioningData.Certificates createRequestSpecificProvisioningDataCertificates() {
        return new Request.Specific.ProvisioningData.Certificates();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalRefill.Value }
     * 
     */
    public Request.Specific.TerminalRefill.Value createRequestSpecificTerminalRefillValue() {
        return new Request.Specific.TerminalRefill.Value();
    }

    /**
     * Create an instance of {@link Request.Specific.ExportObj.ObjProps }
     * 
     */
    public Request.Specific.ExportObj.ObjProps createRequestSpecificExportObjObjProps() {
        return new Request.Specific.ExportObj.ObjProps();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalCutover.COUnit }
     * 
     */
    public Request.Specific.TerminalCutover.COUnit createRequestSpecificTerminalCutoverCOUnit() {
        return new Request.Specific.TerminalCutover.COUnit();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalCutover.CIUnit }
     * 
     */
    public Request.Specific.TerminalCutover.CIUnit createRequestSpecificTerminalCutoverCIUnit() {
        return new Request.Specific.TerminalCutover.CIUnit();
    }

    /**
     * Create an instance of {@link Request.Specific.TerminalCutover.Cassette }
     * 
     */
    public Request.Specific.TerminalCutover.Cassette createRequestSpecificTerminalCutoverCassette() {
        return new Request.Specific.TerminalCutover.Cassette();
    }

    /**
     * Create an instance of {@link Request.Specific.Reconciliation.ExtTotal }
     * 
     */
    public Request.Specific.Reconciliation.ExtTotal createRequestSpecificReconciliationExtTotal() {
        return new Request.Specific.Reconciliation.ExtTotal();
    }

    /**
     * Create an instance of {@link Request.Specific.Reconciliation.IntTotal }
     * 
     */
    public Request.Specific.Reconciliation.IntTotal createRequestSpecificReconciliationIntTotal() {
        return new Request.Specific.Reconciliation.IntTotal();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment.SecondPartMatch }
     * 
     */
    public Request.Specific.Payment.SecondPartMatch createRequestSpecificPaymentSecondPartMatch() {
        return new Request.Specific.Payment.SecondPartMatch();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment.Payer }
     * 
     */
    public Request.Specific.Payment.Payer createRequestSpecificPaymentPayer() {
        return new Request.Specific.Payment.Payer();
    }

    /**
     * Create an instance of {@link Request.Specific.Payment.Payee.AmtAllocation.Item }
     * 
     */
    public Request.Specific.Payment.Payee.AmtAllocation.Item createRequestSpecificPaymentPayeeAmtAllocationItem() {
        return new Request.Specific.Payment.Payee.AmtAllocation.Item();
    }

    /**
     * Create an instance of {@link Request.Moneys.Clear }
     * 
     */
    public Request.Moneys.Clear createRequestMoneysClear() {
        return new Request.Moneys.Clear();
    }

    /**
     * Create an instance of {@link Request.Moneys.Recon }
     * 
     */
    public Request.Moneys.Recon createRequestMoneysRecon() {
        return new Request.Moneys.Recon();
    }

    /**
     * Create an instance of {@link Request.Moneys.Settle }
     * 
     */
    public Request.Moneys.Settle createRequestMoneysSettle() {
        return new Request.Moneys.Settle();
    }

    /**
     * Create an instance of {@link Request.Moneys.Dest }
     * 
     */
    public Request.Moneys.Dest createRequestMoneysDest() {
        return new Request.Moneys.Dest();
    }

    /**
     * Create an instance of {@link Request.Moneys.InterchangeFee }
     * 
     */
    public Request.Moneys.InterchangeFee createRequestMoneysInterchangeFee() {
        return new Request.Moneys.InterchangeFee();
    }

    /**
     * Create an instance of {@link Request.Moneys.Prearrangement }
     * 
     */
    public Request.Moneys.Prearrangement createRequestMoneysPrearrangement() {
        return new Request.Moneys.Prearrangement();
    }

    /**
     * Create an instance of {@link Request.Moneys.Term.Surcharges }
     * 
     */
    public Request.Moneys.Term.Surcharges createRequestMoneysTermSurcharges() {
        return new Request.Moneys.Term.Surcharges();
    }

    /**
     * Create an instance of {@link Request.Moneys.Cust.Surcharges }
     * 
     */
    public Request.Moneys.Cust.Surcharges createRequestMoneysCustSurcharges() {
        return new Request.Moneys.Cust.Surcharges();
    }

    /**
     * Create an instance of {@link Request.Match.StoreToDoer }
     * 
     */
    public Request.Match.StoreToDoer createRequestMatchStoreToDoer() {
        return new Request.Match.StoreToDoer();
    }

    /**
     * Create an instance of {@link Request.Link.Prev.Auth }
     * 
     */
    public Request.Link.Prev.Auth createRequestLinkPrevAuth() {
        return new Request.Link.Prev.Auth();
    }

    /**
     * Create an instance of {@link Request.Parties.Sender }
     * 
     */
    public Request.Parties.Sender createRequestPartiesSender() {
        return new Request.Parties.Sender();
    }

    /**
     * Create an instance of {@link Request.Parties.Receiver }
     * 
     */
    public Request.Parties.Receiver createRequestPartiesReceiver() {
        return new Request.Parties.Receiver();
    }

    /**
     * Create an instance of {@link Request.Parties.Party }
     * 
     */
    public Request.Parties.Party createRequestPartiesParty() {
        return new Request.Parties.Party();
    }

    /**
     * Create an instance of {@link Request.Parties.ContextSubject }
     * 
     */
    public Request.Parties.ContextSubject createRequestPartiesContextSubject() {
        return new Request.Parties.ContextSubject();
    }

    /**
     * Create an instance of {@link Request.Parties.Payee.Auth.PersonalInfo }
     * 
     */
    public Request.Parties.Payee.Auth.PersonalInfo createRequestPartiesPayeeAuthPersonalInfo() {
        return new Request.Parties.Payee.Auth.PersonalInfo();
    }

    /**
     * Create an instance of {@link Request.Parties.Cust.Auth.PersonalInfo }
     * 
     */
    public Request.Parties.Cust.Auth.PersonalInfo createRequestPartiesCustAuthPersonalInfo() {
        return new Request.Parties.Cust.Auth.PersonalInfo();
    }

    /**
     * Create an instance of {@link Request.Parties.Cust.Auth.ScaExemptions }
     * 
     */
    public Request.Parties.Cust.Auth.ScaExemptions createRequestPartiesCustAuthScaExemptions() {
        return new Request.Parties.Cust.Auth.ScaExemptions();
    }

    /**
     * Create an instance of {@link Request.Parties.Term.Total }
     * 
     */
    public Request.Parties.Term.Total createRequestPartiesTermTotal() {
        return new Request.Parties.Term.Total();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UndoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "UndoRequest")
    public JAXBElement<UndoRequest> createUndoRequest(UndoRequest value) {
        return new JAXBElement<UndoRequest>(_UndoRequest_QNAME, UndoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashDeskOrderExecRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashDeskOrderExecRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CashDeskOrderExecRequest")
    public JAXBElement<CashDeskOrderExecRequest> createCashDeskOrderExecRequest(CashDeskOrderExecRequest value) {
        return new JAXBElement<CashDeskOrderExecRequest>(_CashDeskOrderExecRequest_QNAME, CashDeskOrderExecRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InquiryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "InquiryRequest")
    public JAXBElement<InquiryRequest> createInquiryRequest(InquiryRequest value) {
        return new JAXBElement<InquiryRequest>(_InquiryRequest_QNAME, InquiryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InquiryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "InquiryResponse")
    public JAXBElement<InquiryResponse> createInquiryResponse(InquiryResponse value) {
        return new JAXBElement<InquiryResponse>(_InquiryResponse_QNAME, InquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSubjectsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectSubjectsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectSubjectsRequest")
    public JAXBElement<SelectSubjectsRequest> createSelectSubjectsRequest(SelectSubjectsRequest value) {
        return new JAXBElement<SelectSubjectsRequest>(_SelectSubjectsRequest_QNAME, SelectSubjectsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSubjectsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectSubjectsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectSubjectsResponse")
    public JAXBElement<SelectSubjectsResponse> createSelectSubjectsResponse(SelectSubjectsResponse value) {
        return new JAXBElement<SelectSubjectsResponse>(_SelectSubjectsResponse_QNAME, SelectSubjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectContractsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectContractsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectContractsRequest")
    public JAXBElement<SelectContractsRequest> createSelectContractsRequest(SelectContractsRequest value) {
        return new JAXBElement<SelectContractsRequest>(_SelectContractsRequest_QNAME, SelectContractsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectContractsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectContractsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectContractsResponse")
    public JAXBElement<SelectContractsResponse> createSelectContractsResponse(SelectContractsResponse value) {
        return new JAXBElement<SelectContractsResponse>(_SelectContractsResponse_QNAME, SelectContractsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTokensRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTokensRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTokensRequest")
    public JAXBElement<SelectTokensRequest> createSelectTokensRequest(SelectTokensRequest value) {
        return new JAXBElement<SelectTokensRequest>(_SelectTokensRequest_QNAME, SelectTokensRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTokensResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTokensResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTokensResponse")
    public JAXBElement<SelectTokensResponse> createSelectTokensResponse(SelectTokensResponse value) {
        return new JAXBElement<SelectTokensResponse>(_SelectTokensResponse_QNAME, SelectTokensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTerminalsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTerminalsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTerminalsRequest")
    public JAXBElement<SelectTerminalsRequest> createSelectTerminalsRequest(SelectTerminalsRequest value) {
        return new JAXBElement<SelectTerminalsRequest>(_SelectTerminalsRequest_QNAME, SelectTerminalsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTerminalsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTerminalsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTerminalsResponse")
    public JAXBElement<SelectTerminalsResponse> createSelectTerminalsResponse(SelectTerminalsResponse value) {
        return new JAXBElement<SelectTerminalsResponse>(_SelectTerminalsResponse_QNAME, SelectTerminalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTransRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTransRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTransRequest")
    public JAXBElement<SelectTransRequest> createSelectTransRequest(SelectTransRequest value) {
        return new JAXBElement<SelectTransRequest>(_SelectTransRequest_QNAME, SelectTransRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTransResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTransResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectTransResponse")
    public JAXBElement<SelectTransResponse> createSelectTransResponse(SelectTransResponse value) {
        return new JAXBElement<SelectTransResponse>(_SelectTransResponse_QNAME, SelectTransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectPayeeBillsRequest")
    public JAXBElement<SelectPayeeBillsRequest> createSelectPayeeBillsRequest(SelectPayeeBillsRequest value) {
        return new JAXBElement<SelectPayeeBillsRequest>(_SelectPayeeBillsRequest_QNAME, SelectPayeeBillsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectPayeeBillsResponse")
    public JAXBElement<SelectPayeeBillsResponse> createSelectPayeeBillsResponse(SelectPayeeBillsResponse value) {
        return new JAXBElement<SelectPayeeBillsResponse>(_SelectPayeeBillsResponse_QNAME, SelectPayeeBillsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectPayeeConsumersRequest")
    public JAXBElement<SelectPayeeConsumersRequest> createSelectPayeeConsumersRequest(SelectPayeeConsumersRequest value) {
        return new JAXBElement<SelectPayeeConsumersRequest>(_SelectPayeeConsumersRequest_QNAME, SelectPayeeConsumersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "SelectPayeeConsumersResponse")
    public JAXBElement<SelectPayeeConsumersResponse> createSelectPayeeConsumersResponse(SelectPayeeConsumersResponse value) {
        return new JAXBElement<SelectPayeeConsumersResponse>(_SelectPayeeConsumersResponse_QNAME, SelectPayeeConsumersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOperRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserOperRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "UserOperRequest")
    public JAXBElement<UserOperRequest> createUserOperRequest(UserOperRequest value) {
        return new JAXBElement<UserOperRequest>(_UserOperRequest_QNAME, UserOperRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOperResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserOperResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "UserOperResponse")
    public JAXBElement<UserOperResponse> createUserOperResponse(UserOperResponse value) {
        return new JAXBElement<UserOperResponse>(_UserOperResponse_QNAME, UserOperResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupOperRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupOperRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "GroupOperRequest")
    public JAXBElement<GroupOperRequest> createGroupOperRequest(GroupOperRequest value) {
        return new JAXBElement<GroupOperRequest>(_GroupOperRequest_QNAME, GroupOperRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupOperResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupOperResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "GroupOperResponse")
    public JAXBElement<GroupOperResponse> createGroupOperResponse(GroupOperResponse value) {
        return new JAXBElement<GroupOperResponse>(_GroupOperResponse_QNAME, GroupOperResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbiRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CbiRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CbiRequest")
    public JAXBElement<CbiRequest> createCbiRequest(CbiRequest value) {
        return new JAXBElement<CbiRequest>(_CbiRequest_QNAME, CbiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CbiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CbiResponse")
    public JAXBElement<CbiResponse> createCbiResponse(CbiResponse value) {
        return new JAXBElement<CbiResponse>(_CbiResponse_QNAME, CbiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "Tran")
    public JAXBElement<TranInvoke> createTran(TranInvoke value) {
        return new JAXBElement<TranInvoke>(_Tran_QNAME, TranInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UndoInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "UndoTran")
    public JAXBElement<UndoInvoke> createUndoTran(UndoInvoke value) {
        return new JAXBElement<UndoInvoke>(_UndoTran_QNAME, UndoInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbiTran }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CbiTran }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "CbiTran")
    public JAXBElement<CbiTran> createCbiTran(CbiTran value) {
        return new JAXBElement<CbiTran>(_CbiTran_QNAME, CbiTran.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashDeskOrderExecInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashDeskOrderExecInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "CashDeskOrderExec")
    public JAXBElement<CashDeskOrderExecInvoke> createCashDeskOrderExec(CashDeskOrderExecInvoke value) {
        return new JAXBElement<CashDeskOrderExecInvoke>(_CashDeskOrderExec_QNAME, CashDeskOrderExecInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InquiryInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "Inquiry")
    public JAXBElement<InquiryInvoke> createInquiry(InquiryInvoke value) {
        return new JAXBElement<InquiryInvoke>(_Inquiry_QNAME, InquiryInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSubjectsInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectSubjectsInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectSubjects")
    public JAXBElement<SelectSubjectsInvoke> createSelectSubjects(SelectSubjectsInvoke value) {
        return new JAXBElement<SelectSubjectsInvoke>(_SelectSubjects_QNAME, SelectSubjectsInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectContractsInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectContractsInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectContracts")
    public JAXBElement<SelectContractsInvoke> createSelectContracts(SelectContractsInvoke value) {
        return new JAXBElement<SelectContractsInvoke>(_SelectContracts_QNAME, SelectContractsInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTokensInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTokensInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectTokens")
    public JAXBElement<SelectTokensInvoke> createSelectTokens(SelectTokensInvoke value) {
        return new JAXBElement<SelectTokensInvoke>(_SelectTokens_QNAME, SelectTokensInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTerminalsInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTerminalsInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectTerminals")
    public JAXBElement<SelectTerminalsInvoke> createSelectTerminals(SelectTerminalsInvoke value) {
        return new JAXBElement<SelectTerminalsInvoke>(_SelectTerminals_QNAME, SelectTerminalsInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectTransInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectTransInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectTrans")
    public JAXBElement<SelectTransInvoke> createSelectTrans(SelectTransInvoke value) {
        return new JAXBElement<SelectTransInvoke>(_SelectTrans_QNAME, SelectTransInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeBillsInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectPayeeBills")
    public JAXBElement<SelectPayeeBillsInvoke> createSelectPayeeBills(SelectPayeeBillsInvoke value) {
        return new JAXBElement<SelectPayeeBillsInvoke>(_SelectPayeeBills_QNAME, SelectPayeeBillsInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectPayeeConsumersInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "SelectPayeeConsumers")
    public JAXBElement<SelectPayeeConsumersInvoke> createSelectPayeeConsumers(SelectPayeeConsumersInvoke value) {
        return new JAXBElement<SelectPayeeConsumersInvoke>(_SelectPayeeConsumers_QNAME, SelectPayeeConsumersInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptoServiceInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CryptoServiceInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "InvokeCryptoService")
    public JAXBElement<CryptoServiceInvoke> createInvokeCryptoService(CryptoServiceInvoke value) {
        return new JAXBElement<CryptoServiceInvoke>(_InvokeCryptoService_QNAME, CryptoServiceInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOperInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserOperInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "UserOper")
    public JAXBElement<UserOperInvoke> createUserOper(UserOperInvoke value) {
        return new JAXBElement<UserOperInvoke>(_UserOper_QNAME, UserOperInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupOperInvoke }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupOperInvoke }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.wsdl", name = "GroupOper")
    public JAXBElement<GroupOperInvoke> createGroupOper(GroupOperInvoke value) {
        return new JAXBElement<GroupOperInvoke>(_GroupOper_QNAME, GroupOperInvoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "InUse", scope = TokenAliasAuthData.class)
    public JAXBElement<Boolean> createTokenAliasAuthDataInUse(Boolean value) {
        return new JAXBElement<Boolean>(_TokenAliasAuthDataInUse_QNAME, Boolean.class, TokenAliasAuthData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "ConsentTime", scope = TokenAliasAuthData.class)
    public JAXBElement<XMLGregorianCalendar> createTokenAliasAuthDataConsentTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TokenAliasAuthDataConsentTime_QNAME, XMLGregorianCalendar.class, TokenAliasAuthData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CountryId", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<Long> createTokenAliasAuthDataOwnerCountryId(Long value) {
        return new JAXBElement<Long>(_TokenAliasAuthDataOwnerCountryId_QNAME, Long.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "LastName", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerLastName(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerLastName_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "MiddleName", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerMiddleName(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerMiddleName_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "City", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerCity(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerCity_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Address", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerAddress(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerAddress_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Email", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerEmail(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerEmail_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "FirstName", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerFirstName(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerFirstName_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "InstTitle", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerInstTitle(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerInstTitle_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Zip", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerZip(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerZip_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CardBrandTitle", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerCardBrandTitle(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerCardBrandTitle_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "LastNameLocal", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerLastNameLocal(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerLastNameLocal_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "MiddleNameLocal", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerMiddleNameLocal(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerMiddleNameLocal_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "FirstNameLocal", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerFirstNameLocal(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerFirstNameLocal_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Mobile", scope = TokenAliasAuthData.Owner.class)
    public JAXBElement<String> createTokenAliasAuthDataOwnerMobile(String value) {
        return new JAXBElement<String>(_TokenAliasAuthDataOwnerMobile_QNAME, String.class, TokenAliasAuthData.Owner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "ActivationTime", scope = DigitizationRq.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizationRqActivationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizationRqActivationTime_QNAME, XMLGregorianCalendar.class, DigitizationRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "CloseTime", scope = DigitizationRq.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizationRqCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizationRqCloseTime_QNAME, XMLGregorianCalendar.class, DigitizationRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "ProvisionTime", scope = DigitizationRq.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizationRqProvisionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizationRqProvisionTime_QNAME, XMLGregorianCalendar.class, DigitizationRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "DeliveryAddress", scope = SendContractInfoSpecific.Statement.class)
    public JAXBElement<ContactAddress> createSendContractInfoSpecificStatementDeliveryAddress(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_SendContractInfoSpecificStatementDeliveryAddress_QNAME, ContactAddress.class, SendContractInfoSpecific.Statement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "ReportMessage", scope = SendContractInfoSpecific.Statement.class)
    public JAXBElement<String> createSendContractInfoSpecificStatementReportMessage(String value) {
        return new JAXBElement<String>(_SendContractInfoSpecificStatementReportMessage_QNAME, String.class, SendContractInfoSpecific.Statement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "Documents", scope = Request.Specific.UpdateTokenAuthData.CardholderAuth.class)
    public JAXBElement<Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents> createRequestSpecificUpdateTokenAuthDataCardholderAuthDocuments(Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents value) {
        return new JAXBElement<Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents>(_RequestSpecificUpdateTokenAuthDataCardholderAuthDocuments_QNAME, Request.Specific.UpdateTokenAuthData.CardholderAuth.Documents.class, Request.Specific.UpdateTokenAuthData.CardholderAuth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran.xsd", name = "DueDay", scope = Request.Specific.Payment.class)
    public JAXBElement<XMLGregorianCalendar> createRequestSpecificPaymentDueDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequestSpecificPaymentDueDay_QNAME, XMLGregorianCalendar.class, Request.Specific.Payment.class, value);
    }

}
