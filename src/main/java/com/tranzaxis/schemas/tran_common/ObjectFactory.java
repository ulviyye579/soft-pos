
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.BusinessPeriod;
import com.tranzaxis.schemas.common_types.ContactAddress;
import com.tranzaxis.schemas.common_types.MailAddress;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.tran_common package. 
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

    private final static QName _BalanceHistory_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "BalanceHistory");
    private final static QName _ContractStatements_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ContractStatements");
    private final static QName _Surcharges_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Surcharges");
    private final static QName _PaymentTemplateSettings_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PaymentTemplateSettings");
    private final static QName _PaymentParams_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PaymentParams");
    private final static QName _CustInfoRq_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CustInfoRq");
    private final static QName _CashDenoms_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CashDenoms");
    private final static QName _CofMatch_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CofMatch");
    private final static QName _SetupInvoiceSubscriptionPayerId_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PayerId");
    private final static QName _SetupInvoiceSubscriptionPayeeId_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PayeeId");
    private final static QName _SetupInvoiceSubscriptionPayerRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PayerRid");
    private final static QName _SetupInvoiceSubscriptionPayeeRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PayeeRid");
    private final static QName _SetupInvoiceSubscriptionStatus_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Status");
    private final static QName _SetupInvoiceSubscriptionConsumerRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ConsumerRid");
    private final static QName _SetupInvoiceSubscriptionCcy_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Ccy");
    private final static QName _SetupInvoiceSubscriptionMaxAutoAmt_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "MaxAutoAmt");
    private final static QName _SetupInvoiceSubscriptionAutoDayOfMonth_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "AutoDayOfMonth");
    private final static QName _SetupInvoiceSubscriptionRechargeBalanceThreshold_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "RechargeBalanceThreshold");
    private final static QName _SetupInvoiceSubscriptionIsCreated_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "IsCreated");
    private final static QName _ExtCardTitle_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Title");
    private final static QName _ContractStatementChannelId_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ChannelId");
    private final static QName _ContractStatementChannelRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ChannelRid");
    private final static QName _ContractStatementActive_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Active");
    private final static QName _ContractStatementValidFrom_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ValidFrom");
    private final static QName _ContractStatementValidTo_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ValidTo");
    private final static QName _ContractStatementDeliveryAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "DeliveryAddress");
    private final static QName _ContractStatementDeliveryAddressTypeId_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "DeliveryAddressTypeId");
    private final static QName _ContractStatementDeliveryAddressTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "DeliveryAddressTypeRid");
    private final static QName _ContractStatementLanguageCode_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "LanguageCode");
    private final static QName _ContractStatementCommunicationLocale_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CommunicationLocale");
    private final static QName _ContractStatementOffset_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Offset");
    private final static QName _ContractStatementCalendarId_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CalendarId");
    private final static QName _ContractStatementCalendarRid_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "CalendarRid");
    private final static QName _ContractStatementKeyDayKind_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "KeyDayKind");
    private final static QName _ContractStatementInherit_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Inherit");
    private final static QName _InstallmentRqContractTitle_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "ContractTitle");
    private final static QName _SetupRestrictionSpecificBegTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "BegTime");
    private final static QName _SetupRestrictionSpecificEndTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "EndTime");
    private final static QName _SetupRestrictionSpecificTmpOffBegTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "TmpOffBegTime");
    private final static QName _SetupRestrictionSpecificTmpOffEndTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "TmpOffEndTime");
    private final static QName _SetupRestrictionSpecificTmpMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "TmpMaxVal");
    private final static QName _SetupRestrictionSpecificTmpMaxStartTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "TmpMaxStartTime");
    private final static QName _SetupRestrictionSpecificTmpMaxFinishTime_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "TmpMaxFinishTime");
    private final static QName _UpdateClientInfoSpecificSstPreferencies_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "SstPreferencies");
    private final static QName _UpdateClientInfoSpecificMailAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "MailAddress");
    private final static QName _UpdateClientInfoSpecificRegAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "RegAddress");
    private final static QName _UpdateClientInfoSpecificHomeAddress_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "HomeAddress");
    private final static QName _UpdateClientInfoSpecificHomeAddress2_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "HomeAddress2");
    private final static QName _UpdateClientInfoSpecificEmails_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Emails");
    private final static QName _UpdateClientInfoSpecificMobilePhones_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "MobilePhones");
    private final static QName _UpdateClientInfoSpecificPersonAuthQAs_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "PersonAuthQAs");
    private final static QName _InvoiceItemUnit_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Unit");
    private final static QName _InvoiceItemSalesTaxAmt_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "SalesTaxAmt");
    private final static QName _InvoiceItemDiscount_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Discount");
    private final static QName _InvoiceItemDescription_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Description");
    private final static QName _InvoiceItemCode_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "Code");
    private final static QName _TokenDeviceAppInvalidAuthAttemptsCnt_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "InvalidAuthAttemptsCnt");
    private final static QName _TokenDeviceAppBrowserJavaEnabled_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "BrowserJavaEnabled");
    private final static QName _TokenDeviceAppBrowserJavaScriptEnabled_QNAME = new QName("http://schemas.tranzaxis.com/tran-common.xsd", "BrowserJavaScriptEnabled");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.tran_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentQrcRs }
     * 
     */
    public PaymentQrcRs createPaymentQrcRs() {
        return new PaymentQrcRs();
    }

    /**
     * Create an instance of {@link PaymentQrcRs.Info }
     * 
     */
    public PaymentQrcRs.Info createPaymentQrcRsInfo() {
        return new PaymentQrcRs.Info();
    }

    /**
     * Create an instance of {@link PaymentQrcRs.Info.Network }
     * 
     */
    public PaymentQrcRs.Info.Network createPaymentQrcRsInfoNetwork() {
        return new PaymentQrcRs.Info.Network();
    }

    /**
     * Create an instance of {@link PaymentQrcRq }
     * 
     */
    public PaymentQrcRq createPaymentQrcRq() {
        return new PaymentQrcRq();
    }

    /**
     * Create an instance of {@link PaymentQrcRq.Network }
     * 
     */
    public PaymentQrcRq.Network createPaymentQrcRqNetwork() {
        return new PaymentQrcRq.Network();
    }

    /**
     * Create an instance of {@link ResultSpecific }
     * 
     */
    public ResultSpecific createResultSpecific() {
        return new ResultSpecific();
    }

    /**
     * Create an instance of {@link InstallmentRs }
     * 
     */
    public InstallmentRs createInstallmentRs() {
        return new InstallmentRs();
    }

    /**
     * Create an instance of {@link AcqInstallmentResponseSpecific }
     * 
     */
    public AcqInstallmentResponseSpecific createAcqInstallmentResponseSpecific() {
        return new AcqInstallmentResponseSpecific();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecificRs }
     * 
     */
    public UpdateClientInfoSpecificRs createUpdateClientInfoSpecificRs() {
        return new UpdateClientInfoSpecificRs();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecific }
     * 
     */
    public UpdateClientInfoSpecific createUpdateClientInfoSpecific() {
        return new UpdateClientInfoSpecific();
    }

    /**
     * Create an instance of {@link ObjTitles }
     * 
     */
    public ObjTitles createObjTitles() {
        return new ObjTitles();
    }

    /**
     * Create an instance of {@link Payee }
     * 
     */
    public Payee createPayee() {
        return new Payee();
    }

    /**
     * Create an instance of {@link TokenSpecificRs }
     * 
     */
    public TokenSpecificRs createTokenSpecificRs() {
        return new TokenSpecificRs();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link TokenSpecific }
     * 
     */
    public TokenSpecific createTokenSpecific() {
        return new TokenSpecific();
    }

    /**
     * Create an instance of {@link Token.Secret }
     * 
     */
    public Token.Secret createTokenSecret() {
        return new Token.Secret();
    }

    /**
     * Create an instance of {@link Token.DeviceApp }
     * 
     */
    public Token.DeviceApp createTokenDeviceApp() {
        return new Token.DeviceApp();
    }

    /**
     * Create an instance of {@link Token.Cert }
     * 
     */
    public Token.Cert createTokenCert() {
        return new Token.Cert();
    }

    /**
     * Create an instance of {@link Token.Login }
     * 
     */
    public Token.Login createTokenLogin() {
        return new Token.Login();
    }

    /**
     * Create an instance of {@link Token.Card }
     * 
     */
    public Token.Card createTokenCard() {
        return new Token.Card();
    }

    /**
     * Create an instance of {@link Token.Card.Tds }
     * 
     */
    public Token.Card.Tds createTokenCardTds() {
        return new Token.Card.Tds();
    }

    /**
     * Create an instance of {@link MoneyPrearrangement }
     * 
     */
    public MoneyPrearrangement createMoneyPrearrangement() {
        return new MoneyPrearrangement();
    }

    /**
     * Create an instance of {@link CustInfoRs }
     * 
     */
    public CustInfoRs createCustInfoRs() {
        return new CustInfoRs();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item }
     * 
     */
    public CustInfoRs.Item createCustInfoRsItem() {
        return new CustInfoRs.Item();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute }
     * 
     */
    public CustInfoRs.Item.Attribute createCustInfoRsItemAttribute() {
        return new CustInfoRs.Item.Attribute();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.TokenAliases }
     * 
     */
    public CustInfoRs.Item.Attribute.TokenAliases createCustInfoRsItemAttributeTokenAliases() {
        return new CustInfoRs.Item.Attribute.TokenAliases();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.PrevTrans }
     * 
     */
    public CustInfoRs.Item.Attribute.PrevTrans createCustInfoRsItemAttributePrevTrans() {
        return new CustInfoRs.Item.Attribute.PrevTrans();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.DigitizedCards }
     * 
     */
    public CustInfoRs.Item.Attribute.DigitizedCards createCustInfoRsItemAttributeDigitizedCards() {
        return new CustInfoRs.Item.Attribute.DigitizedCards();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.PaymentParams }
     * 
     */
    public CustInfoRs.Item.Attribute.PaymentParams createCustInfoRsItemAttributePaymentParams() {
        return new CustInfoRs.Item.Attribute.PaymentParams();
    }

    /**
     * Create an instance of {@link AuthScheme }
     * 
     */
    public AuthScheme createAuthScheme() {
        return new AuthScheme();
    }

    /**
     * Create an instance of {@link CashDenoms }
     * 
     */
    public CashDenoms createCashDenoms() {
        return new CashDenoms();
    }

    /**
     * Create an instance of {@link CustInfoRq }
     * 
     */
    public CustInfoRq createCustInfoRq() {
        return new CustInfoRq();
    }

    /**
     * Create an instance of {@link CustInfoRq.BranchListFilter }
     * 
     */
    public CustInfoRq.BranchListFilter createCustInfoRqBranchListFilter() {
        return new CustInfoRq.BranchListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.BranchListFilter.Capabilities }
     * 
     */
    public CustInfoRq.BranchListFilter.Capabilities createCustInfoRqBranchListFilterCapabilities() {
        return new CustInfoRq.BranchListFilter.Capabilities();
    }

    /**
     * Create an instance of {@link CustInfoRq.TerminalListFilter }
     * 
     */
    public CustInfoRq.TerminalListFilter createCustInfoRqTerminalListFilter() {
        return new CustInfoRq.TerminalListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.Report }
     * 
     */
    public CustInfoRq.Report createCustInfoRqReport() {
        return new CustInfoRq.Report();
    }

    /**
     * Create an instance of {@link CustInfoRq.Report.Params }
     * 
     */
    public CustInfoRq.Report.Params createCustInfoRqReportParams() {
        return new CustInfoRq.Report.Params();
    }

    /**
     * Create an instance of {@link CustInfoRq.PayeeConsumerListFilter }
     * 
     */
    public CustInfoRq.PayeeConsumerListFilter createCustInfoRqPayeeConsumerListFilter() {
        return new CustInfoRq.PayeeConsumerListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.BillListFilter }
     * 
     */
    public CustInfoRq.BillListFilter createCustInfoRqBillListFilter() {
        return new CustInfoRq.BillListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.TranListOpts }
     * 
     */
    public CustInfoRq.TranListOpts createCustInfoRqTranListOpts() {
        return new CustInfoRq.TranListOpts();
    }

    /**
     * Create an instance of {@link PaymentTemplateSettings }
     * 
     */
    public PaymentTemplateSettings createPaymentTemplateSettings() {
        return new PaymentTemplateSettings();
    }

    /**
     * Create an instance of {@link PaymentTemplateSettings.DefaultVal }
     * 
     */
    public PaymentTemplateSettings.DefaultVal createPaymentTemplateSettingsDefaultVal() {
        return new PaymentTemplateSettings.DefaultVal();
    }

    /**
     * Create an instance of {@link BalanceHistory }
     * 
     */
    public BalanceHistory createBalanceHistory() {
        return new BalanceHistory();
    }

    /**
     * Create an instance of {@link ContractStatements }
     * 
     */
    public ContractStatements createContractStatements() {
        return new ContractStatements();
    }

    /**
     * Create an instance of {@link Surcharges }
     * 
     */
    public Surcharges createSurcharges() {
        return new Surcharges();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.tran_common.PaymentParams }
     * 
     */
    public com.tranzaxis.schemas.tran_common.PaymentParams createPaymentParams() {
        return new com.tranzaxis.schemas.tran_common.PaymentParams();
    }

    /**
     * Create an instance of {@link CofMatch }
     * 
     */
    public CofMatch createCofMatch() {
        return new CofMatch();
    }

    /**
     * Create an instance of {@link TranRef }
     * 
     */
    public TranRef createTranRef() {
        return new TranRef();
    }

    /**
     * Create an instance of {@link EntryRef }
     * 
     */
    public EntryRef createEntryRef() {
        return new EntryRef();
    }

    /**
     * Create an instance of {@link TrancheRef }
     * 
     */
    public TrancheRef createTrancheRef() {
        return new TrancheRef();
    }

    /**
     * Create an instance of {@link TrancheListRef }
     * 
     */
    public TrancheListRef createTrancheListRef() {
        return new TrancheListRef();
    }

    /**
     * Create an instance of {@link RefineRq }
     * 
     */
    public RefineRq createRefineRq() {
        return new RefineRq();
    }

    /**
     * Create an instance of {@link RefineRs }
     * 
     */
    public RefineRs createRefineRs() {
        return new RefineRs();
    }

    /**
     * Create an instance of {@link AuthFactor }
     * 
     */
    public AuthFactor createAuthFactor() {
        return new AuthFactor();
    }

    /**
     * Create an instance of {@link AuthMethod }
     * 
     */
    public AuthMethod createAuthMethod() {
        return new AuthMethod();
    }

    /**
     * Create an instance of {@link PersonAuthQA }
     * 
     */
    public PersonAuthQA createPersonAuthQA() {
        return new PersonAuthQA();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link Surcharge }
     * 
     */
    public Surcharge createSurcharge() {
        return new Surcharge();
    }

    /**
     * Create an instance of {@link PartyFromExtCard }
     * 
     */
    public PartyFromExtCard createPartyFromExtCard() {
        return new PartyFromExtCard();
    }

    /**
     * Create an instance of {@link ExceptionalCard }
     * 
     */
    public ExceptionalCard createExceptionalCard() {
        return new ExceptionalCard();
    }

    /**
     * Create an instance of {@link OrganizationBase }
     * 
     */
    public OrganizationBase createOrganizationBase() {
        return new OrganizationBase();
    }

    /**
     * Create an instance of {@link SubMerchantInfo }
     * 
     */
    public SubMerchantInfo createSubMerchantInfo() {
        return new SubMerchantInfo();
    }

    /**
     * Create an instance of {@link OrganizationInfo }
     * 
     */
    public OrganizationInfo createOrganizationInfo() {
        return new OrganizationInfo();
    }

    /**
     * Create an instance of {@link AuthCert }
     * 
     */
    public AuthCert createAuthCert() {
        return new AuthCert();
    }

    /**
     * Create an instance of {@link AuthSecret }
     * 
     */
    public AuthSecret createAuthSecret() {
        return new AuthSecret();
    }

    /**
     * Create an instance of {@link PaymentSpecific }
     * 
     */
    public PaymentSpecific createPaymentSpecific() {
        return new PaymentSpecific();
    }

    /**
     * Create an instance of {@link InvoiceItem }
     * 
     */
    public InvoiceItem createInvoiceItem() {
        return new InvoiceItem();
    }

    /**
     * Create an instance of {@link ContractLinkSpecific }
     * 
     */
    public ContractLinkSpecific createContractLinkSpecific() {
        return new ContractLinkSpecific();
    }

    /**
     * Create an instance of {@link SetupRestrictionSpecific }
     * 
     */
    public SetupRestrictionSpecific createSetupRestrictionSpecific() {
        return new SetupRestrictionSpecific();
    }

    /**
     * Create an instance of {@link TokenUpdateSpecific }
     * 
     */
    public TokenUpdateSpecific createTokenUpdateSpecific() {
        return new TokenUpdateSpecific();
    }

    /**
     * Create an instance of {@link AcqInstallmentRequestSpecific }
     * 
     */
    public AcqInstallmentRequestSpecific createAcqInstallmentRequestSpecific() {
        return new AcqInstallmentRequestSpecific();
    }

    /**
     * Create an instance of {@link InstallmentPlan }
     * 
     */
    public InstallmentPlan createInstallmentPlan() {
        return new InstallmentPlan();
    }

    /**
     * Create an instance of {@link InstallmentRq }
     * 
     */
    public InstallmentRq createInstallmentRq() {
        return new InstallmentRq();
    }

    /**
     * Create an instance of {@link TerminalCapabilites }
     * 
     */
    public TerminalCapabilites createTerminalCapabilites() {
        return new TerminalCapabilites();
    }

    /**
     * Create an instance of {@link ContractStatement }
     * 
     */
    public ContractStatement createContractStatement() {
        return new ContractStatement();
    }

    /**
     * Create an instance of {@link ExtCard }
     * 
     */
    public ExtCard createExtCard() {
        return new ExtCard();
    }

    /**
     * Create an instance of {@link ExtCardRs }
     * 
     */
    public ExtCardRs createExtCardRs() {
        return new ExtCardRs();
    }

    /**
     * Create an instance of {@link RegTokenInNetwork }
     * 
     */
    public RegTokenInNetwork createRegTokenInNetwork() {
        return new RegTokenInNetwork();
    }

    /**
     * Create an instance of {@link SetupInvoiceSubscription }
     * 
     */
    public SetupInvoiceSubscription createSetupInvoiceSubscription() {
        return new SetupInvoiceSubscription();
    }

    /**
     * Create an instance of {@link WriteoffReconDiff }
     * 
     */
    public WriteoffReconDiff createWriteoffReconDiff() {
        return new WriteoffReconDiff();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link PaymentQrcRs.Info.Merchant }
     * 
     */
    public PaymentQrcRs.Info.Merchant createPaymentQrcRsInfoMerchant() {
        return new PaymentQrcRs.Info.Merchant();
    }

    /**
     * Create an instance of {@link PaymentQrcRs.Info.Error }
     * 
     */
    public PaymentQrcRs.Info.Error createPaymentQrcRsInfoError() {
        return new PaymentQrcRs.Info.Error();
    }

    /**
     * Create an instance of {@link PaymentQrcRs.Info.Network.NspkIps }
     * 
     */
    public PaymentQrcRs.Info.Network.NspkIps createPaymentQrcRsInfoNetworkNspkIps() {
        return new PaymentQrcRs.Info.Network.NspkIps();
    }

    /**
     * Create an instance of {@link PaymentQrcRq.Network.NspkIps }
     * 
     */
    public PaymentQrcRq.Network.NspkIps createPaymentQrcRqNetworkNspkIps() {
        return new PaymentQrcRq.Network.NspkIps();
    }

    /**
     * Create an instance of {@link ResultSpecific.LimitViolation }
     * 
     */
    public ResultSpecific.LimitViolation createResultSpecificLimitViolation() {
        return new ResultSpecific.LimitViolation();
    }

    /**
     * Create an instance of {@link ResultSpecific.Correction }
     * 
     */
    public ResultSpecific.Correction createResultSpecificCorrection() {
        return new ResultSpecific.Correction();
    }

    /**
     * Create an instance of {@link ResultSpecific.SuggestedLogins }
     * 
     */
    public ResultSpecific.SuggestedLogins createResultSpecificSuggestedLogins() {
        return new ResultSpecific.SuggestedLogins();
    }

    /**
     * Create an instance of {@link ResultSpecific.ConfirmCcyConversion }
     * 
     */
    public ResultSpecific.ConfirmCcyConversion createResultSpecificConfirmCcyConversion() {
        return new ResultSpecific.ConfirmCcyConversion();
    }

    /**
     * Create an instance of {@link ResultSpecific.InternalReject }
     * 
     */
    public ResultSpecific.InternalReject createResultSpecificInternalReject() {
        return new ResultSpecific.InternalReject();
    }

    /**
     * Create an instance of {@link InstallmentRs.Plans }
     * 
     */
    public InstallmentRs.Plans createInstallmentRsPlans() {
        return new InstallmentRs.Plans();
    }

    /**
     * Create an instance of {@link AcqInstallmentResponseSpecific.Tranche }
     * 
     */
    public AcqInstallmentResponseSpecific.Tranche createAcqInstallmentResponseSpecificTranche() {
        return new AcqInstallmentResponseSpecific.Tranche();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecificRs.PersonAuthQAs }
     * 
     */
    public UpdateClientInfoSpecificRs.PersonAuthQAs createUpdateClientInfoSpecificRsPersonAuthQAs() {
        return new UpdateClientInfoSpecificRs.PersonAuthQAs();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecific.Emails }
     * 
     */
    public UpdateClientInfoSpecific.Emails createUpdateClientInfoSpecificEmails() {
        return new UpdateClientInfoSpecific.Emails();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecific.MobilePhones }
     * 
     */
    public UpdateClientInfoSpecific.MobilePhones createUpdateClientInfoSpecificMobilePhones() {
        return new UpdateClientInfoSpecific.MobilePhones();
    }

    /**
     * Create an instance of {@link UpdateClientInfoSpecific.PersonAuthQAs }
     * 
     */
    public UpdateClientInfoSpecific.PersonAuthQAs createUpdateClientInfoSpecificPersonAuthQAs() {
        return new UpdateClientInfoSpecific.PersonAuthQAs();
    }

    /**
     * Create an instance of {@link ObjTitles.ObjTitle }
     * 
     */
    public ObjTitles.ObjTitle createObjTitlesObjTitle() {
        return new ObjTitles.ObjTitle();
    }

    /**
     * Create an instance of {@link Payee.Card }
     * 
     */
    public Payee.Card createPayeeCard() {
        return new Payee.Card();
    }

    /**
     * Create an instance of {@link TokenSpecificRs.Card }
     * 
     */
    public TokenSpecificRs.Card createTokenSpecificRsCard() {
        return new TokenSpecificRs.Card();
    }

    /**
     * Create an instance of {@link TokenSpecificRs.Person }
     * 
     */
    public TokenSpecificRs.Person createTokenSpecificRsPerson() {
        return new TokenSpecificRs.Person();
    }

    /**
     * Create an instance of {@link TokenSpecificRs.Alias }
     * 
     */
    public TokenSpecificRs.Alias createTokenSpecificRsAlias() {
        return new TokenSpecificRs.Alias();
    }

    /**
     * Create an instance of {@link Token.Phone }
     * 
     */
    public Token.Phone createTokenPhone() {
        return new Token.Phone();
    }

    /**
     * Create an instance of {@link Token.ExtAuthApp }
     * 
     */
    public Token.ExtAuthApp createTokenExtAuthApp() {
        return new Token.ExtAuthApp();
    }

    /**
     * Create an instance of {@link TokenSpecific.Alias }
     * 
     */
    public TokenSpecific.Alias createTokenSpecificAlias() {
        return new TokenSpecific.Alias();
    }

    /**
     * Create an instance of {@link Token.Secret.Auth }
     * 
     */
    public Token.Secret.Auth createTokenSecretAuth() {
        return new Token.Secret.Auth();
    }

    /**
     * Create an instance of {@link Token.DeviceApp.Auth }
     * 
     */
    public Token.DeviceApp.Auth createTokenDeviceAppAuth() {
        return new Token.DeviceApp.Auth();
    }

    /**
     * Create an instance of {@link Token.Cert.Auth }
     * 
     */
    public Token.Cert.Auth createTokenCertAuth() {
        return new Token.Cert.Auth();
    }

    /**
     * Create an instance of {@link Token.Login.Auth }
     * 
     */
    public Token.Login.Auth createTokenLoginAuth() {
        return new Token.Login.Auth();
    }

    /**
     * Create an instance of {@link Token.Card.Auth }
     * 
     */
    public Token.Card.Auth createTokenCardAuth() {
        return new Token.Card.Auth();
    }

    /**
     * Create an instance of {@link Token.Card.Emv }
     * 
     */
    public Token.Card.Emv createTokenCardEmv() {
        return new Token.Card.Emv();
    }

    /**
     * Create an instance of {@link Token.Card.Tds.Visa }
     * 
     */
    public Token.Card.Tds.Visa createTokenCardTdsVisa() {
        return new Token.Card.Tds.Visa();
    }

    /**
     * Create an instance of {@link Token.Card.Tds.Mc }
     * 
     */
    public Token.Card.Tds.Mc createTokenCardTdsMc() {
        return new Token.Card.Tds.Mc();
    }

    /**
     * Create an instance of {@link MoneyPrearrangement.MainEntry }
     * 
     */
    public MoneyPrearrangement.MainEntry createMoneyPrearrangementMainEntry() {
        return new MoneyPrearrangement.MainEntry();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.NotifyTypes }
     * 
     */
    public CustInfoRs.Item.Attribute.NotifyTypes createCustInfoRsItemAttributeNotifyTypes() {
        return new CustInfoRs.Item.Attribute.NotifyTypes();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.PersonAuthQAs }
     * 
     */
    public CustInfoRs.Item.Attribute.PersonAuthQAs createCustInfoRsItemAttributePersonAuthQAs() {
        return new CustInfoRs.Item.Attribute.PersonAuthQAs();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.Doers }
     * 
     */
    public CustInfoRs.Item.Attribute.Doers createCustInfoRsItemAttributeDoers() {
        return new CustInfoRs.Item.Attribute.Doers();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.InvoiceItems }
     * 
     */
    public CustInfoRs.Item.Attribute.InvoiceItems createCustInfoRsItemAttributeInvoiceItems() {
        return new CustInfoRs.Item.Attribute.InvoiceItems();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.TokenAliases.TokenAlias }
     * 
     */
    public CustInfoRs.Item.Attribute.TokenAliases.TokenAlias createCustInfoRsItemAttributeTokenAliasesTokenAlias() {
        return new CustInfoRs.Item.Attribute.TokenAliases.TokenAlias();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.PrevTrans.PrevTran }
     * 
     */
    public CustInfoRs.Item.Attribute.PrevTrans.PrevTran createCustInfoRsItemAttributePrevTransPrevTran() {
        return new CustInfoRs.Item.Attribute.PrevTrans.PrevTran();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard }
     * 
     */
    public CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard createCustInfoRsItemAttributeDigitizedCardsDigitizedCard() {
        return new CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard();
    }

    /**
     * Create an instance of {@link CustInfoRs.Item.Attribute.PaymentParams.Param }
     * 
     */
    public CustInfoRs.Item.Attribute.PaymentParams.Param createCustInfoRsItemAttributePaymentParamsParam() {
        return new CustInfoRs.Item.Attribute.PaymentParams.Param();
    }

    /**
     * Create an instance of {@link AuthScheme.AuthMethods }
     * 
     */
    public AuthScheme.AuthMethods createAuthSchemeAuthMethods() {
        return new AuthScheme.AuthMethods();
    }

    /**
     * Create an instance of {@link CashDenoms.Denom }
     * 
     */
    public CashDenoms.Denom createCashDenomsDenom() {
        return new CashDenoms.Denom();
    }

    /**
     * Create an instance of {@link CustInfoRq.TranListFilter }
     * 
     */
    public CustInfoRq.TranListFilter createCustInfoRqTranListFilter() {
        return new CustInfoRq.TranListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.PayeeListOpts }
     * 
     */
    public CustInfoRq.PayeeListOpts createCustInfoRqPayeeListOpts() {
        return new CustInfoRq.PayeeListOpts();
    }

    /**
     * Create an instance of {@link CustInfoRq.PayeeListFilter }
     * 
     */
    public CustInfoRq.PayeeListFilter createCustInfoRqPayeeListFilter() {
        return new CustInfoRq.PayeeListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.ApplicationContext }
     * 
     */
    public CustInfoRq.ApplicationContext createCustInfoRqApplicationContext() {
        return new CustInfoRq.ApplicationContext();
    }

    /**
     * Create an instance of {@link CustInfoRq.Statement }
     * 
     */
    public CustInfoRq.Statement createCustInfoRqStatement() {
        return new CustInfoRq.Statement();
    }

    /**
     * Create an instance of {@link CustInfoRq.ContractPaymentSchedule }
     * 
     */
    public CustInfoRq.ContractPaymentSchedule createCustInfoRqContractPaymentSchedule() {
        return new CustInfoRq.ContractPaymentSchedule();
    }

    /**
     * Create an instance of {@link CustInfoRq.TokenListOpts }
     * 
     */
    public CustInfoRq.TokenListOpts createCustInfoRqTokenListOpts() {
        return new CustInfoRq.TokenListOpts();
    }

    /**
     * Create an instance of {@link CustInfoRq.ContractListOpts }
     * 
     */
    public CustInfoRq.ContractListOpts createCustInfoRqContractListOpts() {
        return new CustInfoRq.ContractListOpts();
    }

    /**
     * Create an instance of {@link CustInfoRq.TokenListFilter }
     * 
     */
    public CustInfoRq.TokenListFilter createCustInfoRqTokenListFilter() {
        return new CustInfoRq.TokenListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.ContractListFilter }
     * 
     */
    public CustInfoRq.ContractListFilter createCustInfoRqContractListFilter() {
        return new CustInfoRq.ContractListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.ApplicationListFilter }
     * 
     */
    public CustInfoRq.ApplicationListFilter createCustInfoRqApplicationListFilter() {
        return new CustInfoRq.ApplicationListFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.TerminalListOpts }
     * 
     */
    public CustInfoRq.TerminalListOpts createCustInfoRqTerminalListOpts() {
        return new CustInfoRq.TerminalListOpts();
    }

    /**
     * Create an instance of {@link CustInfoRq.InvoiceTypeFilter }
     * 
     */
    public CustInfoRq.InvoiceTypeFilter createCustInfoRqInvoiceTypeFilter() {
        return new CustInfoRq.InvoiceTypeFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.InvoiceFilter }
     * 
     */
    public CustInfoRq.InvoiceFilter createCustInfoRqInvoiceFilter() {
        return new CustInfoRq.InvoiceFilter();
    }

    /**
     * Create an instance of {@link CustInfoRq.BranchListOpts }
     * 
     */
    public CustInfoRq.BranchListOpts createCustInfoRqBranchListOpts() {
        return new CustInfoRq.BranchListOpts();
    }

    /**
     * Create an instance of {@link CustInfoRq.BranchListFilter.Capabilities.Capability }
     * 
     */
    public CustInfoRq.BranchListFilter.Capabilities.Capability createCustInfoRqBranchListFilterCapabilitiesCapability() {
        return new CustInfoRq.BranchListFilter.Capabilities.Capability();
    }

    /**
     * Create an instance of {@link CustInfoRq.TerminalListFilter.IncludeStatuses }
     * 
     */
    public CustInfoRq.TerminalListFilter.IncludeStatuses createCustInfoRqTerminalListFilterIncludeStatuses() {
        return new CustInfoRq.TerminalListFilter.IncludeStatuses();
    }

    /**
     * Create an instance of {@link CustInfoRq.TerminalListFilter.ExcludeStatuses }
     * 
     */
    public CustInfoRq.TerminalListFilter.ExcludeStatuses createCustInfoRqTerminalListFilterExcludeStatuses() {
        return new CustInfoRq.TerminalListFilter.ExcludeStatuses();
    }

    /**
     * Create an instance of {@link CustInfoRq.Report.Params.Param }
     * 
     */
    public CustInfoRq.Report.Params.Param createCustInfoRqReportParamsParam() {
        return new CustInfoRq.Report.Params.Param();
    }

    /**
     * Create an instance of {@link CustInfoRq.PayeeConsumerListFilter.Payers }
     * 
     */
    public CustInfoRq.PayeeConsumerListFilter.Payers createCustInfoRqPayeeConsumerListFilterPayers() {
        return new CustInfoRq.PayeeConsumerListFilter.Payers();
    }

    /**
     * Create an instance of {@link CustInfoRq.BillListFilter.Payers }
     * 
     */
    public CustInfoRq.BillListFilter.Payers createCustInfoRqBillListFilterPayers() {
        return new CustInfoRq.BillListFilter.Payers();
    }

    /**
     * Create an instance of {@link CustInfoRq.TranListOpts.PrevTranParams }
     * 
     */
    public CustInfoRq.TranListOpts.PrevTranParams createCustInfoRqTranListOptsPrevTranParams() {
        return new CustInfoRq.TranListOpts.PrevTranParams();
    }

    /**
     * Create an instance of {@link PaymentTemplateSettings.DefaultVal.Card }
     * 
     */
    public PaymentTemplateSettings.DefaultVal.Card createPaymentTemplateSettingsDefaultValCard() {
        return new PaymentTemplateSettings.DefaultVal.Card();
    }

    /**
     * Create an instance of {@link BalanceHistory.Item }
     * 
     */
    public BalanceHistory.Item createBalanceHistoryItem() {
        return new BalanceHistory.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalanceHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "BalanceHistory")
    public JAXBElement<BalanceHistory> createBalanceHistory(BalanceHistory value) {
        return new JAXBElement<BalanceHistory>(_BalanceHistory_QNAME, BalanceHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractStatements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContractStatements }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ContractStatements")
    public JAXBElement<ContractStatements> createContractStatements(ContractStatements value) {
        return new JAXBElement<ContractStatements>(_ContractStatements_QNAME, ContractStatements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharges }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Surcharges }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Surcharges")
    public JAXBElement<Surcharges> createSurcharges(Surcharges value) {
        return new JAXBElement<Surcharges>(_Surcharges_QNAME, Surcharges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTemplateSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentTemplateSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PaymentTemplateSettings")
    public JAXBElement<PaymentTemplateSettings> createPaymentTemplateSettings(PaymentTemplateSettings value) {
        return new JAXBElement<PaymentTemplateSettings>(_PaymentTemplateSettings_QNAME, PaymentTemplateSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.tran_common.PaymentParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.tran_common.PaymentParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PaymentParams")
    public JAXBElement<com.tranzaxis.schemas.tran_common.PaymentParams> createPaymentParams(com.tranzaxis.schemas.tran_common.PaymentParams value) {
        return new JAXBElement<com.tranzaxis.schemas.tran_common.PaymentParams>(_PaymentParams_QNAME, com.tranzaxis.schemas.tran_common.PaymentParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustInfoRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustInfoRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CustInfoRq")
    public JAXBElement<CustInfoRq> createCustInfoRq(CustInfoRq value) {
        return new JAXBElement<CustInfoRq>(_CustInfoRq_QNAME, CustInfoRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashDenoms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashDenoms }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CashDenoms")
    public JAXBElement<CashDenoms> createCashDenoms(CashDenoms value) {
        return new JAXBElement<CashDenoms>(_CashDenoms_QNAME, CashDenoms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CofMatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CofMatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CofMatch")
    public JAXBElement<CofMatch> createCofMatch(CofMatch value) {
        return new JAXBElement<CofMatch>(_CofMatch_QNAME, CofMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PayerId", scope = SetupInvoiceSubscription.class)
    public JAXBElement<Long> createSetupInvoiceSubscriptionPayerId(Long value) {
        return new JAXBElement<Long>(_SetupInvoiceSubscriptionPayerId_QNAME, Long.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PayeeId", scope = SetupInvoiceSubscription.class)
    public JAXBElement<Long> createSetupInvoiceSubscriptionPayeeId(Long value) {
        return new JAXBElement<Long>(_SetupInvoiceSubscriptionPayeeId_QNAME, Long.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PayerRid", scope = SetupInvoiceSubscription.class)
    public JAXBElement<String> createSetupInvoiceSubscriptionPayerRid(String value) {
        return new JAXBElement<String>(_SetupInvoiceSubscriptionPayerRid_QNAME, String.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PayeeRid", scope = SetupInvoiceSubscription.class)
    public JAXBElement<String> createSetupInvoiceSubscriptionPayeeRid(String value) {
        return new JAXBElement<String>(_SetupInvoiceSubscriptionPayeeRid_QNAME, String.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Status", scope = SetupInvoiceSubscription.class)
    public JAXBElement<String> createSetupInvoiceSubscriptionStatus(String value) {
        return new JAXBElement<String>(_SetupInvoiceSubscriptionStatus_QNAME, String.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ConsumerRid", scope = SetupInvoiceSubscription.class)
    public JAXBElement<String> createSetupInvoiceSubscriptionConsumerRid(String value) {
        return new JAXBElement<String>(_SetupInvoiceSubscriptionConsumerRid_QNAME, String.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Ccy", scope = SetupInvoiceSubscription.class)
    public JAXBElement<Long> createSetupInvoiceSubscriptionCcy(Long value) {
        return new JAXBElement<Long>(_SetupInvoiceSubscriptionCcy_QNAME, Long.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "MaxAutoAmt", scope = SetupInvoiceSubscription.class)
    public JAXBElement<BigDecimal> createSetupInvoiceSubscriptionMaxAutoAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SetupInvoiceSubscriptionMaxAutoAmt_QNAME, BigDecimal.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "AutoDayOfMonth", scope = SetupInvoiceSubscription.class)
    public JAXBElement<Long> createSetupInvoiceSubscriptionAutoDayOfMonth(Long value) {
        return new JAXBElement<Long>(_SetupInvoiceSubscriptionAutoDayOfMonth_QNAME, Long.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "RechargeBalanceThreshold", scope = SetupInvoiceSubscription.class)
    public JAXBElement<BigDecimal> createSetupInvoiceSubscriptionRechargeBalanceThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SetupInvoiceSubscriptionRechargeBalanceThreshold_QNAME, BigDecimal.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "IsCreated", scope = SetupInvoiceSubscription.class, defaultValue = "false")
    public JAXBElement<Boolean> createSetupInvoiceSubscriptionIsCreated(Boolean value) {
        return new JAXBElement<Boolean>(_SetupInvoiceSubscriptionIsCreated_QNAME, Boolean.class, SetupInvoiceSubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Title", scope = ExtCard.class)
    public JAXBElement<String> createExtCardTitle(String value) {
        return new JAXBElement<String>(_ExtCardTitle_QNAME, String.class, ExtCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ChannelId", scope = ContractStatement.class)
    public JAXBElement<Long> createContractStatementChannelId(Long value) {
        return new JAXBElement<Long>(_ContractStatementChannelId_QNAME, Long.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ChannelRid", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementChannelRid(String value) {
        return new JAXBElement<String>(_ContractStatementChannelRid_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Active", scope = ContractStatement.class)
    public JAXBElement<Boolean> createContractStatementActive(Boolean value) {
        return new JAXBElement<Boolean>(_ContractStatementActive_QNAME, Boolean.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ValidFrom", scope = ContractStatement.class)
    public JAXBElement<XMLGregorianCalendar> createContractStatementValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractStatementValidFrom_QNAME, XMLGregorianCalendar.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ValidTo", scope = ContractStatement.class)
    public JAXBElement<XMLGregorianCalendar> createContractStatementValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractStatementValidTo_QNAME, XMLGregorianCalendar.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "DeliveryAddress", scope = ContractStatement.class)
    public JAXBElement<ContactAddress> createContractStatementDeliveryAddress(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_ContractStatementDeliveryAddress_QNAME, ContactAddress.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "DeliveryAddressTypeId", scope = ContractStatement.class)
    public JAXBElement<Long> createContractStatementDeliveryAddressTypeId(Long value) {
        return new JAXBElement<Long>(_ContractStatementDeliveryAddressTypeId_QNAME, Long.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "DeliveryAddressTypeRid", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementDeliveryAddressTypeRid(String value) {
        return new JAXBElement<String>(_ContractStatementDeliveryAddressTypeRid_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "LanguageCode", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementLanguageCode(String value) {
        return new JAXBElement<String>(_ContractStatementLanguageCode_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CommunicationLocale", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementCommunicationLocale(String value) {
        return new JAXBElement<String>(_ContractStatementCommunicationLocale_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Offset", scope = ContractStatement.class)
    public JAXBElement<BusinessPeriod> createContractStatementOffset(BusinessPeriod value) {
        return new JAXBElement<BusinessPeriod>(_ContractStatementOffset_QNAME, BusinessPeriod.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CalendarId", scope = ContractStatement.class)
    public JAXBElement<Long> createContractStatementCalendarId(Long value) {
        return new JAXBElement<Long>(_ContractStatementCalendarId_QNAME, Long.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "CalendarRid", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementCalendarRid(String value) {
        return new JAXBElement<String>(_ContractStatementCalendarRid_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "KeyDayKind", scope = ContractStatement.class)
    public JAXBElement<String> createContractStatementKeyDayKind(String value) {
        return new JAXBElement<String>(_ContractStatementKeyDayKind_QNAME, String.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Inherit", scope = ContractStatement.class)
    public JAXBElement<Boolean> createContractStatementInherit(Boolean value) {
        return new JAXBElement<Boolean>(_ContractStatementInherit_QNAME, Boolean.class, ContractStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "ContractTitle", scope = InstallmentRq.class)
    public JAXBElement<String> createInstallmentRqContractTitle(String value) {
        return new JAXBElement<String>(_InstallmentRqContractTitle_QNAME, String.class, InstallmentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "BegTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificBegTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificBegTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "EndTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificEndTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "TmpOffBegTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificTmpOffBegTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificTmpOffBegTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "TmpOffEndTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificTmpOffEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificTmpOffEndTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "TmpMaxVal", scope = SetupRestrictionSpecific.class)
    public JAXBElement<BigDecimal> createSetupRestrictionSpecificTmpMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SetupRestrictionSpecificTmpMaxVal_QNAME, BigDecimal.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "TmpMaxStartTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificTmpMaxStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificTmpMaxStartTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "TmpMaxFinishTime", scope = SetupRestrictionSpecific.class)
    public JAXBElement<XMLGregorianCalendar> createSetupRestrictionSpecificTmpMaxFinishTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SetupRestrictionSpecificTmpMaxFinishTime_QNAME, XMLGregorianCalendar.class, SetupRestrictionSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "SstPreferencies", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<Object> createUpdateClientInfoSpecificSstPreferencies(Object value) {
        return new JAXBElement<Object>(_UpdateClientInfoSpecificSstPreferencies_QNAME, Object.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "MailAddress", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<MailAddress> createUpdateClientInfoSpecificMailAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_UpdateClientInfoSpecificMailAddress_QNAME, MailAddress.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "RegAddress", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<ContactAddress> createUpdateClientInfoSpecificRegAddress(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_UpdateClientInfoSpecificRegAddress_QNAME, ContactAddress.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "HomeAddress", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<ContactAddress> createUpdateClientInfoSpecificHomeAddress(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_UpdateClientInfoSpecificHomeAddress_QNAME, ContactAddress.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "HomeAddress2", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<ContactAddress> createUpdateClientInfoSpecificHomeAddress2(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_UpdateClientInfoSpecificHomeAddress2_QNAME, ContactAddress.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.Emails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.Emails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Emails", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<UpdateClientInfoSpecific.Emails> createUpdateClientInfoSpecificEmails(UpdateClientInfoSpecific.Emails value) {
        return new JAXBElement<UpdateClientInfoSpecific.Emails>(_UpdateClientInfoSpecificEmails_QNAME, UpdateClientInfoSpecific.Emails.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.MobilePhones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.MobilePhones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "MobilePhones", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<UpdateClientInfoSpecific.MobilePhones> createUpdateClientInfoSpecificMobilePhones(UpdateClientInfoSpecific.MobilePhones value) {
        return new JAXBElement<UpdateClientInfoSpecific.MobilePhones>(_UpdateClientInfoSpecificMobilePhones_QNAME, UpdateClientInfoSpecific.MobilePhones.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.PersonAuthQAs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClientInfoSpecific.PersonAuthQAs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "PersonAuthQAs", scope = UpdateClientInfoSpecific.class)
    public JAXBElement<UpdateClientInfoSpecific.PersonAuthQAs> createUpdateClientInfoSpecificPersonAuthQAs(UpdateClientInfoSpecific.PersonAuthQAs value) {
        return new JAXBElement<UpdateClientInfoSpecific.PersonAuthQAs>(_UpdateClientInfoSpecificPersonAuthQAs_QNAME, UpdateClientInfoSpecific.PersonAuthQAs.class, UpdateClientInfoSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Unit", scope = InvoiceItem.class)
    public JAXBElement<String> createInvoiceItemUnit(String value) {
        return new JAXBElement<String>(_InvoiceItemUnit_QNAME, String.class, InvoiceItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "SalesTaxAmt", scope = InvoiceItem.class)
    public JAXBElement<BigDecimal> createInvoiceItemSalesTaxAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceItemSalesTaxAmt_QNAME, BigDecimal.class, InvoiceItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Discount", scope = InvoiceItem.class)
    public JAXBElement<BigDecimal> createInvoiceItemDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceItemDiscount_QNAME, BigDecimal.class, InvoiceItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Description", scope = InvoiceItem.class)
    public JAXBElement<String> createInvoiceItemDescription(String value) {
        return new JAXBElement<String>(_InvoiceItemDescription_QNAME, String.class, InvoiceItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "Code", scope = InvoiceItem.class)
    public JAXBElement<String> createInvoiceItemCode(String value) {
        return new JAXBElement<String>(_InvoiceItemCode_QNAME, String.class, InvoiceItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "InvalidAuthAttemptsCnt", scope = Token.DeviceApp.class)
    public JAXBElement<Long> createTokenDeviceAppInvalidAuthAttemptsCnt(Long value) {
        return new JAXBElement<Long>(_TokenDeviceAppInvalidAuthAttemptsCnt_QNAME, Long.class, Token.DeviceApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "BrowserJavaEnabled", scope = Token.DeviceApp.class)
    public JAXBElement<Boolean> createTokenDeviceAppBrowserJavaEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_TokenDeviceAppBrowserJavaEnabled_QNAME, Boolean.class, Token.DeviceApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tran-common.xsd", name = "BrowserJavaScriptEnabled", scope = Token.DeviceApp.class)
    public JAXBElement<Boolean> createTokenDeviceAppBrowserJavaScriptEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_TokenDeviceAppBrowserJavaScriptEnabled_QNAME, Boolean.class, Token.DeviceApp.class, value);
    }

}
