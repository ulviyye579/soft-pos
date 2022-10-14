
package com.tranzaxis.schemas.acquiring_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ObjectGuid;
import com.tranzaxis.schemas.common_types.ObjectId;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.acquiring_admin package. 
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

    private final static QName _RefillCycleAccountsAccountStartBalance_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "StartBalance");
    private final static QName _TerminalExternalRid_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "ExternalRid");
    private final static QName _TerminalInstCode_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "InstCode");
    private final static QName _TerminalTitle_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Title");
    private final static QName _TerminalNotes_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Notes");
    private final static QName _TerminalActivateTime_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "ActivateTime");
    private final static QName _TerminalActivateDay_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "ActivateDay");
    private final static QName _TerminalLastStatusChangeTime_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastStatusChangeTime");
    private final static QName _TerminalLastStatusChangeDay_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastStatusChangeDay");
    private final static QName _TerminalRiskLevel_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "RiskLevel");
    private final static QName _TerminalDefaultCcy_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "DefaultCcy");
    private final static QName _TerminalDefaultLanguage_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "DefaultLanguage");
    private final static QName _TerminalAddress_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Address");
    private final static QName _TerminalClientAddress_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "ClientAddress");
    private final static QName _TerminalLocationDesc_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LocationDesc");
    private final static QName _TerminalLocationKind_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LocationKind");
    private final static QName _TerminalAreaKind_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "AreaKind");
    private final static QName _TerminalClientAccessibility_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "ClientAccessibility");
    private final static QName _TerminalDeviceModel_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "DeviceModel");
    private final static QName _TerminalDeviceNumber_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "DeviceNumber");
    private final static QName _TerminalDeviceId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "DeviceId");
    private final static QName _TerminalTimeZone_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "TimeZone");
    private final static QName _TerminalTimeOffset_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "TimeOffset");
    private final static QName _TerminalStationName_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "StationName");
    private final static QName _TerminalAccessSchedule_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "AccessSchedule");
    private final static QName _TerminalAdapter_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Adapter");
    private final static QName _TerminalBranch_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Branch");
    private final static QName _TerminalCashProfile_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CashProfile");
    private final static QName _TerminalCassetteSet_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CassetteSet");
    private final static QName _TerminalConfig_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Config");
    private final static QName _TerminalContract_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Contract");
    private final static QName _TerminalIndicationScheme_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "IndicationScheme");
    private final static QName _TerminalOperList_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "OperList");
    private final static QName _TerminalRateGroup_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "RateGroup");
    private final static QName _TerminalRiskProfile_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "RiskProfile");
    private final static QName _TerminalSettings_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Settings");
    private final static QName _TerminalSurchargeTariffPlan_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "SurchargeTariffPlan");
    private final static QName _TerminalChannels_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Channels");
    private final static QName _TerminalTraceProfile_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "TraceProfile");
    private final static QName _TerminalOperDayVariant_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "OperDayVariant");
    private final static QName _TerminalCurOperDay_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CurOperDay");
    private final static QName _TerminalRecvTimeout_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "RecvTimeout");
    private final static QName _TerminalCustomerTimeout_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CustomerTimeout");
    private final static QName _TerminalTranCompletionTimeout_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "TranCompletionTimeout");
    private final static QName _TerminalInactivityPeriod_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "InactivityPeriod");
    private final static QName _TerminalMaxCommandAttemps_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "MaxCommandAttemps");
    private final static QName _TerminalLastStan_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastStan");
    private final static QName _TerminalLastRqTime_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastRqTime");
    private final static QName _TerminalLastRespTime_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastRespTime");
    private final static QName _TerminalLastOnlineRrn_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastOnlineRrn");
    private final static QName _TerminalLastOfflineRrn_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastOfflineRrn");
    private final static QName _TerminalLastOnlineTranId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastOnlineTranId");
    private final static QName _TerminalLastOfflineTranId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "LastOfflineTranId");
    private final static QName _TerminalRefillCycleId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "RefillCycleId");
    private final static QName _TerminalCurBatchId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CurBatchId");
    private final static QName _TerminalPrevBatchId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "PrevBatchId");
    private final static QName _TerminalCurCfgTimestamp_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CurCfgTimestamp");
    private final static QName _TerminalNewCfgTimestamp_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "NewCfgTimestamp");
    private final static QName _TerminalAwakePortAddress_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "AwakePortAddress");
    private final static QName _TerminalCapsProtected_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "CapsProtected");
    private final static QName _TerminalNetworkSpecificsNetworkSpecificMccId_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "MccId");
    private final static QName _TerminalNetworkSpecificsNetworkSpecificRid_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Rid");
    private final static QName _TerminalKeysPmk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Pmk");
    private final static QName _TerminalKeysPwk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Pwk");
    private final static QName _TerminalKeysMmk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Mmk");
    private final static QName _TerminalKeysMwk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Mwk");
    private final static QName _TerminalKeysEmk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Emk");
    private final static QName _TerminalKeysEwk_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Ewk");
    private final static QName _TerminalKeysRkl_QNAME = new QName("http://schemas.tranzaxis.com/acquiring-admin.xsd", "Rkl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.acquiring_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RsaKey }
     * 
     */
    public RsaKey createRsaKey() {
        return new RsaKey();
    }

    /**
     * Create an instance of {@link RefillCycle }
     * 
     */
    public RefillCycle createRefillCycle() {
        return new RefillCycle();
    }

    /**
     * Create an instance of {@link RefillCycle.Accounts }
     * 
     */
    public RefillCycle.Accounts createRefillCycleAccounts() {
        return new RefillCycle.Accounts();
    }

    /**
     * Create an instance of {@link Terminal }
     * 
     */
    public Terminal createTerminal() {
        return new Terminal();
    }

    /**
     * Create an instance of {@link Terminal.NetworkSpecifics }
     * 
     */
    public Terminal.NetworkSpecifics createTerminalNetworkSpecifics() {
        return new Terminal.NetworkSpecifics();
    }

    /**
     * Create an instance of {@link Terminal.Accounts }
     * 
     */
    public Terminal.Accounts createTerminalAccounts() {
        return new Terminal.Accounts();
    }

    /**
     * Create an instance of {@link BranchId }
     * 
     */
    public BranchId createBranchId() {
        return new BranchId();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link Channels }
     * 
     */
    public Channels createChannels() {
        return new Channels();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link DesKey }
     * 
     */
    public DesKey createDesKey() {
        return new DesKey();
    }

    /**
     * Create an instance of {@link DesKeyWithKek }
     * 
     */
    public DesKeyWithKek createDesKeyWithKek() {
        return new DesKeyWithKek();
    }

    /**
     * Create an instance of {@link RsaKey.Chain }
     * 
     */
    public RsaKey.Chain createRsaKeyChain() {
        return new RsaKey.Chain();
    }

    /**
     * Create an instance of {@link RefillCycle.Accounts.Account }
     * 
     */
    public RefillCycle.Accounts.Account createRefillCycleAccountsAccount() {
        return new RefillCycle.Accounts.Account();
    }

    /**
     * Create an instance of {@link Terminal.ExtCutoverWindow }
     * 
     */
    public Terminal.ExtCutoverWindow createTerminalExtCutoverWindow() {
        return new Terminal.ExtCutoverWindow();
    }

    /**
     * Create an instance of {@link Terminal.ExtCutoverFinishTime }
     * 
     */
    public Terminal.ExtCutoverFinishTime createTerminalExtCutoverFinishTime() {
        return new Terminal.ExtCutoverFinishTime();
    }

    /**
     * Create an instance of {@link Terminal.Keys }
     * 
     */
    public Terminal.Keys createTerminalKeys() {
        return new Terminal.Keys();
    }

    /**
     * Create an instance of {@link Terminal.WriteoffDiffs }
     * 
     */
    public Terminal.WriteoffDiffs createTerminalWriteoffDiffs() {
        return new Terminal.WriteoffDiffs();
    }

    /**
     * Create an instance of {@link Terminal.NetworkSpecifics.NetworkSpecific }
     * 
     */
    public Terminal.NetworkSpecifics.NetworkSpecific createTerminalNetworkSpecificsNetworkSpecific() {
        return new Terminal.NetworkSpecifics.NetworkSpecific();
    }

    /**
     * Create an instance of {@link Terminal.Accounts.Account }
     * 
     */
    public Terminal.Accounts.Account createTerminalAccountsAccount() {
        return new Terminal.Accounts.Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "StartBalance", scope = RefillCycle.Accounts.Account.class)
    public JAXBElement<BigDecimal> createRefillCycleAccountsAccountStartBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RefillCycleAccountsAccountStartBalance_QNAME, BigDecimal.class, RefillCycle.Accounts.Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "ExternalRid", scope = Terminal.class)
    public JAXBElement<String> createTerminalExternalRid(String value) {
        return new JAXBElement<String>(_TerminalExternalRid_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "InstCode", scope = Terminal.class)
    public JAXBElement<Long> createTerminalInstCode(Long value) {
        return new JAXBElement<Long>(_TerminalInstCode_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Title", scope = Terminal.class)
    public JAXBElement<String> createTerminalTitle(String value) {
        return new JAXBElement<String>(_TerminalTitle_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Notes", scope = Terminal.class)
    public JAXBElement<String> createTerminalNotes(String value) {
        return new JAXBElement<String>(_TerminalNotes_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "ActivateTime", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalActivateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalActivateTime_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "ActivateDay", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalActivateDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalActivateDay_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastStatusChangeTime", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalLastStatusChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalLastStatusChangeTime_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastStatusChangeDay", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalLastStatusChangeDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalLastStatusChangeDay_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "RiskLevel", scope = Terminal.class)
    public JAXBElement<Long> createTerminalRiskLevel(Long value) {
        return new JAXBElement<Long>(_TerminalRiskLevel_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "DefaultCcy", scope = Terminal.class)
    public JAXBElement<Long> createTerminalDefaultCcy(Long value) {
        return new JAXBElement<Long>(_TerminalDefaultCcy_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "DefaultLanguage", scope = Terminal.class)
    public JAXBElement<String> createTerminalDefaultLanguage(String value) {
        return new JAXBElement<String>(_TerminalDefaultLanguage_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Address", scope = Terminal.class)
    public JAXBElement<MailAddress> createTerminalAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_TerminalAddress_QNAME, MailAddress.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "ClientAddress", scope = Terminal.class)
    public JAXBElement<String> createTerminalClientAddress(String value) {
        return new JAXBElement<String>(_TerminalClientAddress_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LocationDesc", scope = Terminal.class)
    public JAXBElement<String> createTerminalLocationDesc(String value) {
        return new JAXBElement<String>(_TerminalLocationDesc_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LocationKind", scope = Terminal.class)
    public JAXBElement<String> createTerminalLocationKind(String value) {
        return new JAXBElement<String>(_TerminalLocationKind_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "AreaKind", scope = Terminal.class)
    public JAXBElement<String> createTerminalAreaKind(String value) {
        return new JAXBElement<String>(_TerminalAreaKind_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "ClientAccessibility", scope = Terminal.class)
    public JAXBElement<String> createTerminalClientAccessibility(String value) {
        return new JAXBElement<String>(_TerminalClientAccessibility_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "DeviceModel", scope = Terminal.class)
    public JAXBElement<String> createTerminalDeviceModel(String value) {
        return new JAXBElement<String>(_TerminalDeviceModel_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "DeviceNumber", scope = Terminal.class)
    public JAXBElement<String> createTerminalDeviceNumber(String value) {
        return new JAXBElement<String>(_TerminalDeviceNumber_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "DeviceId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalDeviceId(Long value) {
        return new JAXBElement<Long>(_TerminalDeviceId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "TimeZone", scope = Terminal.class)
    public JAXBElement<String> createTerminalTimeZone(String value) {
        return new JAXBElement<String>(_TerminalTimeZone_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "TimeOffset", scope = Terminal.class)
    public JAXBElement<Long> createTerminalTimeOffset(Long value) {
        return new JAXBElement<Long>(_TerminalTimeOffset_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "StationName", scope = Terminal.class)
    public JAXBElement<String> createTerminalStationName(String value) {
        return new JAXBElement<String>(_TerminalStationName_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "AccessSchedule", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalAccessSchedule(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalAccessSchedule_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Adapter", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalAdapter(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalAdapter_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BranchId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Branch", scope = Terminal.class)
    public JAXBElement<BranchId> createTerminalBranch(BranchId value) {
        return new JAXBElement<BranchId>(_TerminalBranch_QNAME, BranchId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CashProfile", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalCashProfile(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalCashProfile_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CassetteSet", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalCassetteSet(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalCassetteSet_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Config", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalConfig(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalConfig_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Contract", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalContract(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalContract_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "IndicationScheme", scope = Terminal.class)
    public JAXBElement<ObjectGuid> createTerminalIndicationScheme(ObjectGuid value) {
        return new JAXBElement<ObjectGuid>(_TerminalIndicationScheme_QNAME, ObjectGuid.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "OperList", scope = Terminal.class)
    public JAXBElement<ObjectGuid> createTerminalOperList(ObjectGuid value) {
        return new JAXBElement<ObjectGuid>(_TerminalOperList_QNAME, ObjectGuid.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "RateGroup", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalRateGroup(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalRateGroup_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "RiskProfile", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalRiskProfile(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalRiskProfile_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Settings", scope = Terminal.class)
    public JAXBElement<ObjectId> createTerminalSettings(ObjectId value) {
        return new JAXBElement<ObjectId>(_TerminalSettings_QNAME, ObjectId.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "SurchargeTariffPlan", scope = Terminal.class)
    public JAXBElement<ObjectGuid> createTerminalSurchargeTariffPlan(ObjectGuid value) {
        return new JAXBElement<ObjectGuid>(_TerminalSurchargeTariffPlan_QNAME, ObjectGuid.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Channels }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Channels }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Channels", scope = Terminal.class)
    public JAXBElement<Channels> createTerminalChannels(Channels value) {
        return new JAXBElement<Channels>(_TerminalChannels_QNAME, Channels.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "TraceProfile", scope = Terminal.class)
    public JAXBElement<String> createTerminalTraceProfile(String value) {
        return new JAXBElement<String>(_TerminalTraceProfile_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "OperDayVariant", scope = Terminal.class)
    public JAXBElement<Long> createTerminalOperDayVariant(Long value) {
        return new JAXBElement<Long>(_TerminalOperDayVariant_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CurOperDay", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalCurOperDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalCurOperDay_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "RecvTimeout", scope = Terminal.class)
    public JAXBElement<Long> createTerminalRecvTimeout(Long value) {
        return new JAXBElement<Long>(_TerminalRecvTimeout_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CustomerTimeout", scope = Terminal.class)
    public JAXBElement<Long> createTerminalCustomerTimeout(Long value) {
        return new JAXBElement<Long>(_TerminalCustomerTimeout_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "TranCompletionTimeout", scope = Terminal.class)
    public JAXBElement<Long> createTerminalTranCompletionTimeout(Long value) {
        return new JAXBElement<Long>(_TerminalTranCompletionTimeout_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "InactivityPeriod", scope = Terminal.class)
    public JAXBElement<Long> createTerminalInactivityPeriod(Long value) {
        return new JAXBElement<Long>(_TerminalInactivityPeriod_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "MaxCommandAttemps", scope = Terminal.class)
    public JAXBElement<Long> createTerminalMaxCommandAttemps(Long value) {
        return new JAXBElement<Long>(_TerminalMaxCommandAttemps_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastStan", scope = Terminal.class)
    public JAXBElement<Long> createTerminalLastStan(Long value) {
        return new JAXBElement<Long>(_TerminalLastStan_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastRqTime", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalLastRqTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalLastRqTime_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastRespTime", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalLastRespTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalLastRespTime_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastOnlineRrn", scope = Terminal.class)
    public JAXBElement<String> createTerminalLastOnlineRrn(String value) {
        return new JAXBElement<String>(_TerminalLastOnlineRrn_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastOfflineRrn", scope = Terminal.class)
    public JAXBElement<String> createTerminalLastOfflineRrn(String value) {
        return new JAXBElement<String>(_TerminalLastOfflineRrn_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastOnlineTranId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalLastOnlineTranId(Long value) {
        return new JAXBElement<Long>(_TerminalLastOnlineTranId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "LastOfflineTranId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalLastOfflineTranId(Long value) {
        return new JAXBElement<Long>(_TerminalLastOfflineTranId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "RefillCycleId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalRefillCycleId(Long value) {
        return new JAXBElement<Long>(_TerminalRefillCycleId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CurBatchId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalCurBatchId(Long value) {
        return new JAXBElement<Long>(_TerminalCurBatchId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "PrevBatchId", scope = Terminal.class)
    public JAXBElement<Long> createTerminalPrevBatchId(Long value) {
        return new JAXBElement<Long>(_TerminalPrevBatchId_QNAME, Long.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CurCfgTimestamp", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalCurCfgTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalCurCfgTimestamp_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "NewCfgTimestamp", scope = Terminal.class)
    public JAXBElement<XMLGregorianCalendar> createTerminalNewCfgTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminalNewCfgTimestamp_QNAME, XMLGregorianCalendar.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "AwakePortAddress", scope = Terminal.class)
    public JAXBElement<String> createTerminalAwakePortAddress(String value) {
        return new JAXBElement<String>(_TerminalAwakePortAddress_QNAME, String.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "CapsProtected", scope = Terminal.class)
    public JAXBElement<Boolean> createTerminalCapsProtected(Boolean value) {
        return new JAXBElement<Boolean>(_TerminalCapsProtected_QNAME, Boolean.class, Terminal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "MccId", scope = Terminal.NetworkSpecifics.NetworkSpecific.class)
    public JAXBElement<Long> createTerminalNetworkSpecificsNetworkSpecificMccId(Long value) {
        return new JAXBElement<Long>(_TerminalNetworkSpecificsNetworkSpecificMccId_QNAME, Long.class, Terminal.NetworkSpecifics.NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Rid", scope = Terminal.NetworkSpecifics.NetworkSpecific.class)
    public JAXBElement<String> createTerminalNetworkSpecificsNetworkSpecificRid(String value) {
        return new JAXBElement<String>(_TerminalNetworkSpecificsNetworkSpecificRid_QNAME, String.class, Terminal.NetworkSpecifics.NetworkSpecific.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKey }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKey }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Pmk", scope = Terminal.Keys.class)
    public JAXBElement<DesKey> createTerminalKeysPmk(DesKey value) {
        return new JAXBElement<DesKey>(_TerminalKeysPmk_QNAME, DesKey.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKey }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKey }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Pwk", scope = Terminal.Keys.class)
    public JAXBElement<DesKey> createTerminalKeysPwk(DesKey value) {
        return new JAXBElement<DesKey>(_TerminalKeysPwk_QNAME, DesKey.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Mmk", scope = Terminal.Keys.class)
    public JAXBElement<DesKeyWithKek> createTerminalKeysMmk(DesKeyWithKek value) {
        return new JAXBElement<DesKeyWithKek>(_TerminalKeysMmk_QNAME, DesKeyWithKek.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Mwk", scope = Terminal.Keys.class)
    public JAXBElement<DesKeyWithKek> createTerminalKeysMwk(DesKeyWithKek value) {
        return new JAXBElement<DesKeyWithKek>(_TerminalKeysMwk_QNAME, DesKeyWithKek.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Emk", scope = Terminal.Keys.class)
    public JAXBElement<DesKeyWithKek> createTerminalKeysEmk(DesKeyWithKek value) {
        return new JAXBElement<DesKeyWithKek>(_TerminalKeysEmk_QNAME, DesKeyWithKek.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Ewk", scope = Terminal.Keys.class)
    public JAXBElement<DesKeyWithKek> createTerminalKeysEwk(DesKeyWithKek value) {
        return new JAXBElement<DesKeyWithKek>(_TerminalKeysEwk_QNAME, DesKeyWithKek.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsaKey }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RsaKey }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Rkl", scope = Terminal.Keys.class)
    public JAXBElement<RsaKey> createTerminalKeysRkl(RsaKey value) {
        return new JAXBElement<RsaKey>(_TerminalKeysRkl_QNAME, RsaKey.class, Terminal.Keys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Address", scope = Channel.class)
    public JAXBElement<String> createChannelAddress(String value) {
        return new JAXBElement<String>(_TerminalAddress_QNAME, String.class, Channel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", name = "Title", scope = Channel.class)
    public JAXBElement<String> createChannelTitle(String value) {
        return new JAXBElement<String>(_TerminalTitle_QNAME, String.class, Channel.class, value);
    }

}
