
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import org.radixware.schemas.common.UserProps;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.tokens_admin package. 
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

    private final static QName _Token_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Token");
    private final static QName _BaseContractId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ContractId");
    private final static QName _BaseContractRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ContractRid");
    private final static QName _BaseCreateContractTypeId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateContractTypeId");
    private final static QName _BaseCreateContractTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateContractTypeRid");
    private final static QName _BaseCreateContractClientId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateContractClientId");
    private final static QName _BaseCreateContractClientRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateContractClientRid");
    private final static QName _BaseProfileId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ProfileId");
    private final static QName _BaseProductId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ProductId");
    private final static QName _BaseLifePhaseId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "LifePhaseId");
    private final static QName _BaseInitialLifePhaseId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InitialLifePhaseId");
    private final static QName _BasePackageId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PackageId");
    private final static QName _BaseSeqInPackage_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "SeqInPackage");
    private final static QName _BaseCurBranchId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CurBranchId");
    private final static QName _BaseCurBranchCode_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CurBranchCode");
    private final static QName _BaseCurBranchName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CurBranchName");
    private final static QName _BaseDeliveryBranchId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DeliveryBranchId");
    private final static QName _BaseProlongExpDays_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ProlongExpDays");
    private final static QName _BaseDeliveryBranchCode_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DeliveryBranchCode");
    private final static QName _BaseDeliveryBranchName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DeliveryBranchName");
    private final static QName _BaseDeliveryAddress_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DeliveryAddress");
    private final static QName _BaseNotes_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Notes");
    private final static QName _BaseActivateTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ActivateTime");
    private final static QName _BaseActivateDay_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ActivateDay");
    private final static QName _BaseActivateUserName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ActivateUserName");
    private final static QName _BaseCloseTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CloseTime");
    private final static QName _BaseCloseDay_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CloseDay");
    private final static QName _BaseLastStatusChangeTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "LastStatusChangeTime");
    private final static QName _BaseLastStatusChangeDay_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "LastStatusChangeDay");
    private final static QName _BaseValidTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ValidTime");
    private final static QName _BaseExpTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ExpTime");
    private final static QName _BaseRiskLevel_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "RiskLevel");
    private final static QName _BaseTmpDisableRestrictions_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TmpDisableRestrictions");
    private final static QName _BaseTmpDisableAuth_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TmpDisableAuth");
    private final static QName _BasePwdHash_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PwdHash");
    private final static QName _BaseInvalidSecretTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidSecretTriesCnt");
    private final static QName _BaseInvalidCallbackTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidCallbackTriesCnt");
    private final static QName _BaseInvalidAnswerTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidAnswerTriesCnt");
    private final static QName _BaseSecretEnabledTill_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "SecretEnabledTill");
    private final static QName _BaseClerk_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Clerk");
    private final static QName _BaseExtRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "ExtRid");
    private final static QName _BaseMainTokenId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "MainTokenId");
    private final static QName _BaseMainTokenExtRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "MainTokenExtRid");
    private final static QName _BaseUserProps_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "UserProps");
    private final static QName _BaseRcMoratoriums_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "RcMoratoriums");
    private final static QName _BaseRegInNetworkTypes_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "RegInNetworkTypes");
    private final static QName _BaseTerminalId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TerminalId");
    private final static QName _CardPinEnabledTill_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PinEnabledTill");
    private final static QName _CardPinClerk_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PinClerk");
    private final static QName _CardDesignId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DesignId");
    private final static QName _CardDesignRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DesignRid");
    private final static QName _CardPvki_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Pvki");
    private final static QName _CardPvv_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Pvv");
    private final static QName _CardIPvv_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "IPvv");
    private final static QName _CardAntiAmbushPvv_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "AntiAmbushPvv");
    private final static QName _CardEmbossName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "EmbossName");
    private final static QName _CardTrackName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TrackName");
    private final static QName _CardPrintName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PrintName");
    private final static QName _CardPinBlock_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "PinBlock");
    private final static QName _CardIPinBlock_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "IPinBlock");
    private final static QName _CardAntiAmbushPinBlock_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "AntiAmbushPinBlock");
    private final static QName _CardIsDomestic_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "IsDomestic");
    private final static QName _CardTdsEnrollment_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TdsEnrollment");
    private final static QName _CardDigitizationEligibility_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DigitizationEligibility");
    private final static QName _CardDigitizationRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DigitizationRid");
    private final static QName _CardTrack1Dd_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Track1Dd");
    private final static QName _CardTrack2Dd_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "Track2Dd");
    private final static QName _CardInvalidCvv2TriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidCvv2TriesCnt");
    private final static QName _CardInvalidIPinTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidIPinTriesCnt");
    private final static QName _CardInvalidPinTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidPinTriesCnt");
    private final static QName _CardInvalidTdsEnrollTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidTdsEnrollTriesCnt");
    private final static QName _CardEmvUseCap_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "UseCap");
    private final static QName _CardEmvLastAtc_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "LastAtc");
    private final static QName _CardEmvAppCcy_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "AppCcy");
    private final static QName _CardEmvTotalAmtUpLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalAmtUpLmt");
    private final static QName _CardEmvTotalAmtLwLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalAmtLwLmt");
    private final static QName _CardEmvTotalCntUpLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntUpLmt");
    private final static QName _CardEmvTotalCntLwLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntLwLmt");
    private final static QName _CardEmvInvalidCapTriesCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidCapTriesCnt");
    private final static QName _CardEmvEmvAppBlocked_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "EmvAppBlocked");
    private final static QName _CardEmvEmvCardBlocked_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "EmvCardBlocked");
    private final static QName _CardEmvMainCardAppId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "MainCardAppId");
    private final static QName _CardNspkVlpFundsLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "VlpFundsLmt");
    private final static QName _CardCupIcTotalCntICLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntICLmt");
    private final static QName _CardCupIcTotalCntILmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntILmt");
    private final static QName _CardJcbSngTranDmstLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "SngTranDmstLmt");
    private final static QName _CardJcbTotalCntUpDmstLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntUpDmstLmt");
    private final static QName _CardJcbTotalCntLwDmstLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntLwDmstLmt");
    private final static QName _CardJcbTotalCntUpIntlLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntUpIntlLmt");
    private final static QName _CardJcbTotalCntLwIntlLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntLwIntlLmt");
    private final static QName _CardVsdcTotalCntUpILmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntUpILmt");
    private final static QName _CardVsdcTotalAmtDCLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalAmtDCLmt");
    private final static QName _CardVsdcVlpTranLmt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "VlpTranLmt");
    private final static QName _CardVsdcVlpResetThreshold_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "VlpResetThreshold");
    private final static QName _CardVsdcAppCapabilities_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "AppCapabilities");
    private final static QName _CardVsdcCvmLimit_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CvmLimit");
    private final static QName _CardMcAdvanceTotalAmtUpLmt2_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalAmtUpLmt2");
    private final static QName _CardMcAdvanceTotalAmtLwLmt2_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalAmtLwLmt2");
    private final static QName _CardMcAdvanceTotalCntUpLmt2_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntUpLmt2");
    private final static QName _CardMcAdvanceTotalCntLwLmt2_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TotalCntLwLmt2");
    private final static QName _CardMcAdvanceInterfaceEnablingSwitch_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InterfaceEnablingSwitch");
    private final static QName _DeviceAppAuthPeriodStart_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "AuthPeriodStart");
    private final static QName _DeviceAppInvalidAuthAttemptsCnt_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "InvalidAuthAttemptsCnt");
    private final static QName _WebAppBrowserJavaEnabled_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "BrowserJavaEnabled");
    private final static QName _WebAppBrowserJavaScriptEnabled_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "BrowserJavaScriptEnabled");
    private final static QName _TokenPackageCardDesignId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CardDesignId");
    private final static QName _TokenPackageCreateTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateTime");
    private final static QName _TokenPackageCreateUserName_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "CreateUserName");
    private final static QName _TokenPackageDepartmentId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "DepartmentId");
    private final static QName _TokenPackageTokenCount_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TokenCount");
    private final static QName _TokenPackageTokenProductId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TokenProductId");
    private final static QName _TokenPackageTransformedFromPackageId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TransformedFromPackageId");
    private final static QName _TokenPackageTransformedToPackageId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TransformedToPackageId");
    private final static QName _TokenAliasTokenId_QNAME = new QName("http://schemas.tranzaxis.com/tokens-admin.xsd", "TokenId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.tokens_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link Card.AdditionalCards }
     * 
     */
    public Card.AdditionalCards createCardAdditionalCards() {
        return new Card.AdditionalCards();
    }

    /**
     * Create an instance of {@link Card.DigitizedCards }
     * 
     */
    public Card.DigitizedCards createCardDigitizedCards() {
        return new Card.DigitizedCards();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link TerminalBin }
     * 
     */
    public TerminalBin createTerminalBin() {
        return new TerminalBin();
    }

    /**
     * Create an instance of {@link TokenAlias }
     * 
     */
    public TokenAlias createTokenAlias() {
        return new TokenAlias();
    }

    /**
     * Create an instance of {@link TokenPackage }
     * 
     */
    public TokenPackage createTokenPackage() {
        return new TokenPackage();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link Cert }
     * 
     */
    public Cert createCert() {
        return new Cert();
    }

    /**
     * Create an instance of {@link ExtAuthApp }
     * 
     */
    public ExtAuthApp createExtAuthApp() {
        return new ExtAuthApp();
    }

    /**
     * Create an instance of {@link DeviceApp }
     * 
     */
    public DeviceApp createDeviceApp() {
        return new DeviceApp();
    }

    /**
     * Create an instance of {@link MobileApp }
     * 
     */
    public MobileApp createMobileApp() {
        return new MobileApp();
    }

    /**
     * Create an instance of {@link WebApp }
     * 
     */
    public WebApp createWebApp() {
        return new WebApp();
    }

    /**
     * Create an instance of {@link CardEmv }
     * 
     */
    public CardEmv createCardEmv() {
        return new CardEmv();
    }

    /**
     * Create an instance of {@link CardMcLite }
     * 
     */
    public CardMcLite createCardMcLite() {
        return new CardMcLite();
    }

    /**
     * Create an instance of {@link CardMcSelect }
     * 
     */
    public CardMcSelect createCardMcSelect() {
        return new CardMcSelect();
    }

    /**
     * Create an instance of {@link CardMcAdvance }
     * 
     */
    public CardMcAdvance createCardMcAdvance() {
        return new CardMcAdvance();
    }

    /**
     * Create an instance of {@link CardVsdc }
     * 
     */
    public CardVsdc createCardVsdc() {
        return new CardVsdc();
    }

    /**
     * Create an instance of {@link CardAmex }
     * 
     */
    public CardAmex createCardAmex() {
        return new CardAmex();
    }

    /**
     * Create an instance of {@link CardJcb }
     * 
     */
    public CardJcb createCardJcb() {
        return new CardJcb();
    }

    /**
     * Create an instance of {@link CardNsiccs }
     * 
     */
    public CardNsiccs createCardNsiccs() {
        return new CardNsiccs();
    }

    /**
     * Create an instance of {@link CardVccs }
     * 
     */
    public CardVccs createCardVccs() {
        return new CardVccs();
    }

    /**
     * Create an instance of {@link CardCupIc }
     * 
     */
    public CardCupIc createCardCupIc() {
        return new CardCupIc();
    }

    /**
     * Create an instance of {@link CardCcd }
     * 
     */
    public CardCcd createCardCcd() {
        return new CardCcd();
    }

    /**
     * Create an instance of {@link CardCpa }
     * 
     */
    public CardCpa createCardCpa() {
        return new CardCpa();
    }

    /**
     * Create an instance of {@link CardNspk }
     * 
     */
    public CardNspk createCardNspk() {
        return new CardNspk();
    }

    /**
     * Create an instance of {@link Base.CreateContractOutLinks }
     * 
     */
    public Base.CreateContractOutLinks createBaseCreateContractOutLinks() {
        return new Base.CreateContractOutLinks();
    }

    /**
     * Create an instance of {@link Base.Restrictions }
     * 
     */
    public Base.Restrictions createBaseRestrictions() {
        return new Base.Restrictions();
    }

    /**
     * Create an instance of {@link Base.RegInNetworkTypes }
     * 
     */
    public Base.RegInNetworkTypes createBaseRegInNetworkTypes() {
        return new Base.RegInNetworkTypes();
    }

    /**
     * Create an instance of {@link Base.Aliases }
     * 
     */
    public Base.Aliases createBaseAliases() {
        return new Base.Aliases();
    }

    /**
     * Create an instance of {@link Card.AdditionalCards.AdditionalCard }
     * 
     */
    public Card.AdditionalCards.AdditionalCard createCardAdditionalCardsAdditionalCard() {
        return new Card.AdditionalCards.AdditionalCard();
    }

    /**
     * Create an instance of {@link Card.DigitizedCards.DigitizedCard }
     * 
     */
    public Card.DigitizedCards.DigitizedCard createCardDigitizedCardsDigitizedCard() {
        return new Card.DigitizedCards.DigitizedCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Token }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ContractId", scope = Base.class)
    public JAXBElement<Long> createBaseContractId(Long value) {
        return new JAXBElement<Long>(_BaseContractId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ContractRid", scope = Base.class)
    public JAXBElement<String> createBaseContractRid(String value) {
        return new JAXBElement<String>(_BaseContractRid_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateContractTypeId", scope = Base.class)
    public JAXBElement<Long> createBaseCreateContractTypeId(Long value) {
        return new JAXBElement<Long>(_BaseCreateContractTypeId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateContractTypeRid", scope = Base.class)
    public JAXBElement<String> createBaseCreateContractTypeRid(String value) {
        return new JAXBElement<String>(_BaseCreateContractTypeRid_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateContractClientId", scope = Base.class)
    public JAXBElement<Long> createBaseCreateContractClientId(Long value) {
        return new JAXBElement<Long>(_BaseCreateContractClientId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateContractClientRid", scope = Base.class)
    public JAXBElement<String> createBaseCreateContractClientRid(String value) {
        return new JAXBElement<String>(_BaseCreateContractClientRid_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ProfileId", scope = Base.class)
    public JAXBElement<Long> createBaseProfileId(Long value) {
        return new JAXBElement<Long>(_BaseProfileId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ProductId", scope = Base.class)
    public JAXBElement<Long> createBaseProductId(Long value) {
        return new JAXBElement<Long>(_BaseProductId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "LifePhaseId", scope = Base.class)
    public JAXBElement<Long> createBaseLifePhaseId(Long value) {
        return new JAXBElement<Long>(_BaseLifePhaseId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InitialLifePhaseId", scope = Base.class)
    public JAXBElement<Long> createBaseInitialLifePhaseId(Long value) {
        return new JAXBElement<Long>(_BaseInitialLifePhaseId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PackageId", scope = Base.class)
    public JAXBElement<Long> createBasePackageId(Long value) {
        return new JAXBElement<Long>(_BasePackageId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "SeqInPackage", scope = Base.class)
    public JAXBElement<Long> createBaseSeqInPackage(Long value) {
        return new JAXBElement<Long>(_BaseSeqInPackage_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CurBranchId", scope = Base.class)
    public JAXBElement<Long> createBaseCurBranchId(Long value) {
        return new JAXBElement<Long>(_BaseCurBranchId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CurBranchCode", scope = Base.class)
    public JAXBElement<Long> createBaseCurBranchCode(Long value) {
        return new JAXBElement<Long>(_BaseCurBranchCode_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CurBranchName", scope = Base.class)
    public JAXBElement<String> createBaseCurBranchName(String value) {
        return new JAXBElement<String>(_BaseCurBranchName_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchId", scope = Base.class)
    public JAXBElement<Long> createBaseDeliveryBranchId(Long value) {
        return new JAXBElement<Long>(_BaseDeliveryBranchId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ProlongExpDays", scope = Base.class)
    public JAXBElement<Long> createBaseProlongExpDays(Long value) {
        return new JAXBElement<Long>(_BaseProlongExpDays_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchCode", scope = Base.class)
    public JAXBElement<Long> createBaseDeliveryBranchCode(Long value) {
        return new JAXBElement<Long>(_BaseDeliveryBranchCode_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchName", scope = Base.class)
    public JAXBElement<String> createBaseDeliveryBranchName(String value) {
        return new JAXBElement<String>(_BaseDeliveryBranchName_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryAddress", scope = Base.class)
    public JAXBElement<MailAddress> createBaseDeliveryAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_BaseDeliveryAddress_QNAME, MailAddress.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Notes", scope = Base.class)
    public JAXBElement<String> createBaseNotes(String value) {
        return new JAXBElement<String>(_BaseNotes_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ActivateTime", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseActivateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseActivateTime_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ActivateDay", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseActivateDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseActivateDay_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ActivateUserName", scope = Base.class)
    public JAXBElement<String> createBaseActivateUserName(String value) {
        return new JAXBElement<String>(_BaseActivateUserName_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CloseTime", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseCloseTime_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CloseDay", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseCloseDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseCloseDay_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "LastStatusChangeTime", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseLastStatusChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseLastStatusChangeTime_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "LastStatusChangeDay", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseLastStatusChangeDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseLastStatusChangeDay_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ValidTime", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseValidTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseValidTime_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ExpTime", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseExpTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseExpTime_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "RiskLevel", scope = Base.class)
    public JAXBElement<Long> createBaseRiskLevel(Long value) {
        return new JAXBElement<Long>(_BaseRiskLevel_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TmpDisableRestrictions", scope = Base.class)
    public JAXBElement<Boolean> createBaseTmpDisableRestrictions(Boolean value) {
        return new JAXBElement<Boolean>(_BaseTmpDisableRestrictions_QNAME, Boolean.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TmpDisableAuth", scope = Base.class)
    public JAXBElement<Boolean> createBaseTmpDisableAuth(Boolean value) {
        return new JAXBElement<Boolean>(_BaseTmpDisableAuth_QNAME, Boolean.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PwdHash", scope = Base.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createBasePwdHash(byte[] value) {
        return new JAXBElement<byte[]>(_BasePwdHash_QNAME, byte[].class, Base.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidSecretTriesCnt", scope = Base.class)
    public JAXBElement<Long> createBaseInvalidSecretTriesCnt(Long value) {
        return new JAXBElement<Long>(_BaseInvalidSecretTriesCnt_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidCallbackTriesCnt", scope = Base.class)
    public JAXBElement<Long> createBaseInvalidCallbackTriesCnt(Long value) {
        return new JAXBElement<Long>(_BaseInvalidCallbackTriesCnt_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidAnswerTriesCnt", scope = Base.class)
    public JAXBElement<Long> createBaseInvalidAnswerTriesCnt(Long value) {
        return new JAXBElement<Long>(_BaseInvalidAnswerTriesCnt_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "SecretEnabledTill", scope = Base.class)
    public JAXBElement<XMLGregorianCalendar> createBaseSecretEnabledTill(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BaseSecretEnabledTill_QNAME, XMLGregorianCalendar.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Clerk", scope = Base.class)
    public JAXBElement<String> createBaseClerk(String value) {
        return new JAXBElement<String>(_BaseClerk_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ExtRid", scope = Base.class)
    public JAXBElement<String> createBaseExtRid(String value) {
        return new JAXBElement<String>(_BaseExtRid_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "MainTokenId", scope = Base.class)
    public JAXBElement<Long> createBaseMainTokenId(Long value) {
        return new JAXBElement<Long>(_BaseMainTokenId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "MainTokenExtRid", scope = Base.class)
    public JAXBElement<String> createBaseMainTokenExtRid(String value) {
        return new JAXBElement<String>(_BaseMainTokenExtRid_QNAME, String.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "UserProps", scope = Base.class)
    public JAXBElement<UserProps> createBaseUserProps(UserProps value) {
        return new JAXBElement<UserProps>(_BaseUserProps_QNAME, UserProps.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "RcMoratoriums", scope = Base.class)
    public JAXBElement<RcMoratoriums> createBaseRcMoratoriums(RcMoratoriums value) {
        return new JAXBElement<RcMoratoriums>(_BaseRcMoratoriums_QNAME, RcMoratoriums.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base.RegInNetworkTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Base.RegInNetworkTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "RegInNetworkTypes", scope = Base.class)
    public JAXBElement<Base.RegInNetworkTypes> createBaseRegInNetworkTypes(Base.RegInNetworkTypes value) {
        return new JAXBElement<Base.RegInNetworkTypes>(_BaseRegInNetworkTypes_QNAME, Base.RegInNetworkTypes.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TerminalId", scope = Base.class)
    public JAXBElement<Long> createBaseTerminalId(Long value) {
        return new JAXBElement<Long>(_BaseTerminalId_QNAME, Long.class, Base.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PinEnabledTill", scope = Card.class)
    public JAXBElement<XMLGregorianCalendar> createCardPinEnabledTill(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CardPinEnabledTill_QNAME, XMLGregorianCalendar.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PinClerk", scope = Card.class)
    public JAXBElement<String> createCardPinClerk(String value) {
        return new JAXBElement<String>(_CardPinClerk_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DesignId", scope = Card.class)
    public JAXBElement<Long> createCardDesignId(Long value) {
        return new JAXBElement<Long>(_CardDesignId_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DesignRid", scope = Card.class)
    public JAXBElement<String> createCardDesignRid(String value) {
        return new JAXBElement<String>(_CardDesignRid_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Pvki", scope = Card.class)
    public JAXBElement<Long> createCardPvki(Long value) {
        return new JAXBElement<Long>(_CardPvki_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Pvv", scope = Card.class)
    public JAXBElement<String> createCardPvv(String value) {
        return new JAXBElement<String>(_CardPvv_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "IPvv", scope = Card.class)
    public JAXBElement<String> createCardIPvv(String value) {
        return new JAXBElement<String>(_CardIPvv_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "AntiAmbushPvv", scope = Card.class)
    public JAXBElement<String> createCardAntiAmbushPvv(String value) {
        return new JAXBElement<String>(_CardAntiAmbushPvv_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "EmbossName", scope = Card.class)
    public JAXBElement<String> createCardEmbossName(String value) {
        return new JAXBElement<String>(_CardEmbossName_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TrackName", scope = Card.class)
    public JAXBElement<String> createCardTrackName(String value) {
        return new JAXBElement<String>(_CardTrackName_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PrintName", scope = Card.class)
    public JAXBElement<String> createCardPrintName(String value) {
        return new JAXBElement<String>(_CardPrintName_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "PinBlock", scope = Card.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createCardPinBlock(byte[] value) {
        return new JAXBElement<byte[]>(_CardPinBlock_QNAME, byte[].class, Card.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "IPinBlock", scope = Card.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createCardIPinBlock(byte[] value) {
        return new JAXBElement<byte[]>(_CardIPinBlock_QNAME, byte[].class, Card.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "AntiAmbushPinBlock", scope = Card.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createCardAntiAmbushPinBlock(byte[] value) {
        return new JAXBElement<byte[]>(_CardAntiAmbushPinBlock_QNAME, byte[].class, Card.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "IsDomestic", scope = Card.class)
    public JAXBElement<Boolean> createCardIsDomestic(Boolean value) {
        return new JAXBElement<Boolean>(_CardIsDomestic_QNAME, Boolean.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TdsEnrollment", scope = Card.class)
    public JAXBElement<Boolean> createCardTdsEnrollment(Boolean value) {
        return new JAXBElement<Boolean>(_CardTdsEnrollment_QNAME, Boolean.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DigitizationEligibility", scope = Card.class)
    public JAXBElement<Boolean> createCardDigitizationEligibility(Boolean value) {
        return new JAXBElement<Boolean>(_CardDigitizationEligibility_QNAME, Boolean.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DigitizationRid", scope = Card.class)
    public JAXBElement<String> createCardDigitizationRid(String value) {
        return new JAXBElement<String>(_CardDigitizationRid_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Track1Dd", scope = Card.class)
    public JAXBElement<String> createCardTrack1Dd(String value) {
        return new JAXBElement<String>(_CardTrack1Dd_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Track2Dd", scope = Card.class)
    public JAXBElement<String> createCardTrack2Dd(String value) {
        return new JAXBElement<String>(_CardTrack2Dd_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidCvv2TriesCnt", scope = Card.class)
    public JAXBElement<Long> createCardInvalidCvv2TriesCnt(Long value) {
        return new JAXBElement<Long>(_CardInvalidCvv2TriesCnt_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidIPinTriesCnt", scope = Card.class)
    public JAXBElement<Long> createCardInvalidIPinTriesCnt(Long value) {
        return new JAXBElement<Long>(_CardInvalidIPinTriesCnt_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidPinTriesCnt", scope = Card.class)
    public JAXBElement<Long> createCardInvalidPinTriesCnt(Long value) {
        return new JAXBElement<Long>(_CardInvalidPinTriesCnt_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidTdsEnrollTriesCnt", scope = Card.class)
    public JAXBElement<Long> createCardInvalidTdsEnrollTriesCnt(Long value) {
        return new JAXBElement<Long>(_CardInvalidTdsEnrollTriesCnt_QNAME, Long.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "UseCap", scope = CardEmv.class)
    public JAXBElement<Boolean> createCardEmvUseCap(Boolean value) {
        return new JAXBElement<Boolean>(_CardEmvUseCap_QNAME, Boolean.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "LastAtc", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvLastAtc(Long value) {
        return new JAXBElement<Long>(_CardEmvLastAtc_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "AppCcy", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvAppCcy(Long value) {
        return new JAXBElement<Long>(_CardEmvAppCcy_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalAmtUpLmt", scope = CardEmv.class)
    public JAXBElement<BigDecimal> createCardEmvTotalAmtUpLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardEmvTotalAmtUpLmt_QNAME, BigDecimal.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalAmtLwLmt", scope = CardEmv.class)
    public JAXBElement<BigDecimal> createCardEmvTotalAmtLwLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardEmvTotalAmtLwLmt_QNAME, BigDecimal.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpLmt", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvTotalCntUpLmt(Long value) {
        return new JAXBElement<Long>(_CardEmvTotalCntUpLmt_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntLwLmt", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvTotalCntLwLmt(Long value) {
        return new JAXBElement<Long>(_CardEmvTotalCntLwLmt_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidCapTriesCnt", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvInvalidCapTriesCnt(Long value) {
        return new JAXBElement<Long>(_CardEmvInvalidCapTriesCnt_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "EmvAppBlocked", scope = CardEmv.class)
    public JAXBElement<Boolean> createCardEmvEmvAppBlocked(Boolean value) {
        return new JAXBElement<Boolean>(_CardEmvEmvAppBlocked_QNAME, Boolean.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "EmvCardBlocked", scope = CardEmv.class)
    public JAXBElement<Boolean> createCardEmvEmvCardBlocked(Boolean value) {
        return new JAXBElement<Boolean>(_CardEmvEmvCardBlocked_QNAME, Boolean.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "MainCardAppId", scope = CardEmv.class)
    public JAXBElement<Long> createCardEmvMainCardAppId(Long value) {
        return new JAXBElement<Long>(_CardEmvMainCardAppId_QNAME, Long.class, CardEmv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "VlpFundsLmt", scope = CardNspk.class)
    public JAXBElement<BigDecimal> createCardNspkVlpFundsLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardNspkVlpFundsLmt_QNAME, BigDecimal.class, CardNspk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntICLmt", scope = CardCupIc.class)
    public JAXBElement<Long> createCardCupIcTotalCntICLmt(Long value) {
        return new JAXBElement<Long>(_CardCupIcTotalCntICLmt_QNAME, Long.class, CardCupIc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntILmt", scope = CardCupIc.class)
    public JAXBElement<Long> createCardCupIcTotalCntILmt(Long value) {
        return new JAXBElement<Long>(_CardCupIcTotalCntILmt_QNAME, Long.class, CardCupIc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "SngTranDmstLmt", scope = CardJcb.class)
    public JAXBElement<BigDecimal> createCardJcbSngTranDmstLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardJcbSngTranDmstLmt_QNAME, BigDecimal.class, CardJcb.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpDmstLmt", scope = CardJcb.class)
    public JAXBElement<Long> createCardJcbTotalCntUpDmstLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntUpDmstLmt_QNAME, Long.class, CardJcb.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntLwDmstLmt", scope = CardJcb.class)
    public JAXBElement<Long> createCardJcbTotalCntLwDmstLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntLwDmstLmt_QNAME, Long.class, CardJcb.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpIntlLmt", scope = CardJcb.class)
    public JAXBElement<Long> createCardJcbTotalCntUpIntlLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntUpIntlLmt_QNAME, Long.class, CardJcb.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntLwIntlLmt", scope = CardJcb.class)
    public JAXBElement<Long> createCardJcbTotalCntLwIntlLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntLwIntlLmt_QNAME, Long.class, CardJcb.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpIntlLmt", scope = CardAmex.class)
    public JAXBElement<Long> createCardAmexTotalCntUpIntlLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntUpIntlLmt_QNAME, Long.class, CardAmex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntLwIntlLmt", scope = CardAmex.class)
    public JAXBElement<Long> createCardAmexTotalCntLwIntlLmt(Long value) {
        return new JAXBElement<Long>(_CardJcbTotalCntLwIntlLmt_QNAME, Long.class, CardAmex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntICLmt", scope = CardVsdc.class)
    public JAXBElement<Long> createCardVsdcTotalCntICLmt(Long value) {
        return new JAXBElement<Long>(_CardCupIcTotalCntICLmt_QNAME, Long.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntILmt", scope = CardVsdc.class)
    public JAXBElement<Long> createCardVsdcTotalCntILmt(Long value) {
        return new JAXBElement<Long>(_CardCupIcTotalCntILmt_QNAME, Long.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpILmt", scope = CardVsdc.class)
    public JAXBElement<Long> createCardVsdcTotalCntUpILmt(Long value) {
        return new JAXBElement<Long>(_CardVsdcTotalCntUpILmt_QNAME, Long.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalAmtDCLmt", scope = CardVsdc.class)
    public JAXBElement<BigDecimal> createCardVsdcTotalAmtDCLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardVsdcTotalAmtDCLmt_QNAME, BigDecimal.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "VlpFundsLmt", scope = CardVsdc.class)
    public JAXBElement<BigDecimal> createCardVsdcVlpFundsLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardNspkVlpFundsLmt_QNAME, BigDecimal.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "VlpTranLmt", scope = CardVsdc.class)
    public JAXBElement<BigDecimal> createCardVsdcVlpTranLmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardVsdcVlpTranLmt_QNAME, BigDecimal.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "VlpResetThreshold", scope = CardVsdc.class)
    public JAXBElement<BigDecimal> createCardVsdcVlpResetThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardVsdcVlpResetThreshold_QNAME, BigDecimal.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "AppCapabilities", scope = CardVsdc.class)
    public JAXBElement<Long> createCardVsdcAppCapabilities(Long value) {
        return new JAXBElement<Long>(_CardVsdcAppCapabilities_QNAME, Long.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CvmLimit", scope = CardVsdc.class)
    public JAXBElement<BigDecimal> createCardVsdcCvmLimit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardVsdcCvmLimit_QNAME, BigDecimal.class, CardVsdc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalAmtUpLmt2", scope = CardMcAdvance.class)
    public JAXBElement<BigDecimal> createCardMcAdvanceTotalAmtUpLmt2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardMcAdvanceTotalAmtUpLmt2_QNAME, BigDecimal.class, CardMcAdvance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalAmtLwLmt2", scope = CardMcAdvance.class)
    public JAXBElement<BigDecimal> createCardMcAdvanceTotalAmtLwLmt2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CardMcAdvanceTotalAmtLwLmt2_QNAME, BigDecimal.class, CardMcAdvance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntUpLmt2", scope = CardMcAdvance.class)
    public JAXBElement<Long> createCardMcAdvanceTotalCntUpLmt2(Long value) {
        return new JAXBElement<Long>(_CardMcAdvanceTotalCntUpLmt2_QNAME, Long.class, CardMcAdvance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TotalCntLwLmt2", scope = CardMcAdvance.class)
    public JAXBElement<Long> createCardMcAdvanceTotalCntLwLmt2(Long value) {
        return new JAXBElement<Long>(_CardMcAdvanceTotalCntLwLmt2_QNAME, Long.class, CardMcAdvance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InterfaceEnablingSwitch", scope = CardMcAdvance.class)
    public JAXBElement<Long> createCardMcAdvanceInterfaceEnablingSwitch(Long value) {
        return new JAXBElement<Long>(_CardMcAdvanceInterfaceEnablingSwitch_QNAME, Long.class, CardMcAdvance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "AuthPeriodStart", scope = DeviceApp.class)
    public JAXBElement<XMLGregorianCalendar> createDeviceAppAuthPeriodStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeviceAppAuthPeriodStart_QNAME, XMLGregorianCalendar.class, DeviceApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "InvalidAuthAttemptsCnt", scope = DeviceApp.class)
    public JAXBElement<Long> createDeviceAppInvalidAuthAttemptsCnt(Long value) {
        return new JAXBElement<Long>(_DeviceAppInvalidAuthAttemptsCnt_QNAME, Long.class, DeviceApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "BrowserJavaEnabled", scope = WebApp.class)
    public JAXBElement<Boolean> createWebAppBrowserJavaEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_WebAppBrowserJavaEnabled_QNAME, Boolean.class, WebApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "BrowserJavaScriptEnabled", scope = WebApp.class)
    public JAXBElement<Boolean> createWebAppBrowserJavaScriptEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_WebAppBrowserJavaScriptEnabled_QNAME, Boolean.class, WebApp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "LifePhaseId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageLifePhaseId(Long value) {
        return new JAXBElement<Long>(_BaseLifePhaseId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CardDesignId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageCardDesignId(Long value) {
        return new JAXBElement<Long>(_TokenPackageCardDesignId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "ContractId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageContractId(Long value) {
        return new JAXBElement<Long>(_BaseContractId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateTime", scope = TokenPackage.class)
    public JAXBElement<XMLGregorianCalendar> createTokenPackageCreateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TokenPackageCreateTime_QNAME, XMLGregorianCalendar.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "CreateUserName", scope = TokenPackage.class)
    public JAXBElement<String> createTokenPackageCreateUserName(String value) {
        return new JAXBElement<String>(_TokenPackageCreateUserName_QNAME, String.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageDeliveryBranchId(Long value) {
        return new JAXBElement<Long>(_BaseDeliveryBranchId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchCode", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageDeliveryBranchCode(Long value) {
        return new JAXBElement<Long>(_BaseDeliveryBranchCode_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DeliveryBranchName", scope = TokenPackage.class)
    public JAXBElement<String> createTokenPackageDeliveryBranchName(String value) {
        return new JAXBElement<String>(_BaseDeliveryBranchName_QNAME, String.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "DepartmentId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageDepartmentId(Long value) {
        return new JAXBElement<Long>(_TokenPackageDepartmentId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "Notes", scope = TokenPackage.class)
    public JAXBElement<String> createTokenPackageNotes(String value) {
        return new JAXBElement<String>(_BaseNotes_QNAME, String.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TokenCount", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageTokenCount(Long value) {
        return new JAXBElement<Long>(_TokenPackageTokenCount_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TokenProductId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageTokenProductId(Long value) {
        return new JAXBElement<Long>(_TokenPackageTokenProductId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TransformedFromPackageId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageTransformedFromPackageId(Long value) {
        return new JAXBElement<Long>(_TokenPackageTransformedFromPackageId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TransformedToPackageId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageTransformedToPackageId(Long value) {
        return new JAXBElement<Long>(_TokenPackageTransformedToPackageId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "UserProps", scope = TokenPackage.class)
    public JAXBElement<UserProps> createTokenPackageUserProps(UserProps value) {
        return new JAXBElement<UserProps>(_BaseUserProps_QNAME, UserProps.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TerminalId", scope = TokenPackage.class)
    public JAXBElement<Long> createTokenPackageTerminalId(Long value) {
        return new JAXBElement<Long>(_BaseTerminalId_QNAME, Long.class, TokenPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", name = "TokenId", scope = TokenAlias.class)
    public JAXBElement<Long> createTokenAliasTokenId(Long value) {
        return new JAXBElement<Long>(_TokenAliasTokenId_QNAME, Long.class, TokenAlias.class, value);
    }

}
