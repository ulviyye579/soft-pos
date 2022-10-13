
package com.tranzaxis.schemas.contracts_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.accounting_info.Info;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import com.tranzaxis.schemas.tariffs_admin.TariffIds;
import org.radixware.schemas.common.UserProps;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_admin package. 
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

    private final static QName _Contract_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Contract");
    private final static QName _ContractTariffPlanStartTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "StartTime");
    private final static QName _ContractTariffPlanFinishOperDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "FinishOperDay");
    private final static QName _ContractTariffPlanRelativeId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "RelativeId");
    private final static QName _ContractTariffPlanInheritedTariffs_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "InheritedTariffs");
    private final static QName _ContractTariffPlanExcludedTariffs_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ExcludedTariffs");
    private final static QName _AccountOpenDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "OpenDay");
    private final static QName _AccountOpenUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "OpenUserName");
    private final static QName _AccountCloseDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CloseDay");
    private final static QName _AccountCloseUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CloseUserName");
    private final static QName _AccountContractAcctState_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ContractAcctState");
    private final static QName _AccountContractAcctStateReason_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ContractAcctStateReason");
    private final static QName _AccountContractAcctStatus_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ContractAcctStatus");
    private final static QName _AccountContractAcctStatusReason_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ContractAcctStatusReason");
    private final static QName _AccountKeyDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "KeyDay");
    private final static QName _AccountInfo_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Info");
    private final static QName _AccountNotes_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Notes");
    private final static QName _LinkTitle1_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Title1");
    private final static QName _LinkContract1PartId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Contract1PartId");
    private final static QName _LinkContract1PartyRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Contract1PartyRid");
    private final static QName _LinkBatchId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "BatchId");
    private final static QName _LinkTitle2_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Title2");
    private final static QName _LinkProfileId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ProfileId");
    private final static QName _LinkProfileRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ProfileRid");
    private final static QName _LinkExpTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ExpTime");
    private final static QName _LinkCreateTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CreateTime");
    private final static QName _LinkCreateUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CreateUserName");
    private final static QName _LinkActivateTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ActivateTime");
    private final static QName _LinkActivateDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ActivateDay");
    private final static QName _LinkActivateUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ActivateUserName");
    private final static QName _LinkCloseTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CloseTime");
    private final static QName _LinkedSubjectSubjectId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "SubjectId");
    private final static QName _LinkedSubjectSubjectRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "SubjectRid");
    private final static QName _LinkedSubjectSubjectInstId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "SubjectInstId");
    private final static QName _LinkedSubjectQuotaDivisor_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "QuotaDivisor");
    private final static QName _LinkedSubjectQuotaNumerator_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "QuotaNumerator");
    private final static QName _ContractInstCode_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "InstCode");
    private final static QName _ContractBranchId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "BranchId");
    private final static QName _ContractBranchName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "BranchName");
    private final static QName _ContractBranchCode_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "BranchCode");
    private final static QName _ContractTypeId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "TypeId");
    private final static QName _ContractTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "TypeRid");
    private final static QName _ContractTypeExtGuid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "TypeExtGuid");
    private final static QName _ContractTitle_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Title");
    private final static QName _ContractRiskLevel_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "RiskLevel");
    private final static QName _ContractProfileExtGuid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ProfileExtGuid");
    private final static QName _ContractConclusionDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ConclusionDay");
    private final static QName _ContractConclusionUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ConclusionUserName");
    private final static QName _ContractReconclusionDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ReconclusionDay");
    private final static QName _ContractReconclusionUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "ReconclusionUserName");
    private final static QName _ContractTariffPlans_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "TariffPlans");
    private final static QName _ContractRcMoratoriums_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "RcMoratoriums");
    private final static QName _ContractUserProps_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "UserProps");
    private final static QName _ContractCasGuid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "CasGuid");
    private final static QName _ContractFinishDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "FinishDay");
    private final static QName _ContractFinishUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "FinishUserName");
    private final static QName _ContractUsageRestriction_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "UsageRestriction");
    private final static QName _ContractLastUsageRestrictionChangeTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "LastUsageRestrictionChangeTime");
    private final static QName _ContractLastUsageRestrictionChangeUserName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "LastUsageRestrictionChangeUserName");
    private final static QName _ContractTokensDeliveryBranchId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "TokensDeliveryBranchId");
    private final static QName _ContractStatementTypeId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "StatementTypeId");
    private final static QName _ContractStatementChannelId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "StatementChannelId");
    private final static QName _ContractStatementLangCode_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "StatementLangCode");
    private final static QName _ContractStatementAddress_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "StatementAddress");
    private final static QName _ContractInLinksLinkSeq2_QNAME = new QName("http://schemas.tranzaxis.com/contracts-admin.xsd", "Seq2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContractTariffPlan }
     * 
     */
    public ContractTariffPlan createContractTariffPlan() {
        return new ContractTariffPlan();
    }

    /**
     * Create an instance of {@link ContractTariffPlan.Strategies }
     * 
     */
    public ContractTariffPlan.Strategies createContractTariffPlanStrategies() {
        return new ContractTariffPlan.Strategies();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.contracts_admin.Link }
     * 
     */
    public com.tranzaxis.schemas.contracts_admin.Link createLink() {
        return new com.tranzaxis.schemas.contracts_admin.Link();
    }

    /**
     * Create an instance of {@link CasGuidMap }
     * 
     */
    public CasGuidMap createCasGuidMap() {
        return new CasGuidMap();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link Contract.InLinks }
     * 
     */
    public Contract.InLinks createContractInLinks() {
        return new Contract.InLinks();
    }

    /**
     * Create an instance of {@link Contract.OutLinks }
     * 
     */
    public Contract.OutLinks createContractOutLinks() {
        return new Contract.OutLinks();
    }

    /**
     * Create an instance of {@link Contract.TariffPlans }
     * 
     */
    public Contract.TariffPlans createContractTariffPlanInner() {
        return new Contract.TariffPlans();
    }

    /**
     * Create an instance of {@link LinkedSubject }
     * 
     */
    public LinkedSubject createLinkedSubject() {
        return new LinkedSubject();
    }

    /**
     * Create an instance of {@link OutLink }
     * 
     */
    public OutLink createOutLink() {
        return new OutLink();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Accounts }
     * 
     */
    public Accounts createAccounts() {
        return new Accounts();
    }

    /**
     * Create an instance of {@link ContractTariffPlans }
     * 
     */
    public ContractTariffPlans createContractTariffPlans() {
        return new ContractTariffPlans();
    }

    /**
     * Create an instance of {@link ContractTariffPlan.Strategies.Strategy }
     * 
     */
    public ContractTariffPlan.Strategies.Strategy createContractTariffPlanStrategiesStrategy() {
        return new ContractTariffPlan.Strategies.Strategy();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.contracts_admin.Link.Restrictions }
     * 
     */
    public com.tranzaxis.schemas.contracts_admin.Link.Restrictions createLinkRestrictions() {
        return new com.tranzaxis.schemas.contracts_admin.Link.Restrictions();
    }

    /**
     * Create an instance of {@link CasGuidMap.CasGuidItem }
     * 
     */
    public CasGuidMap.CasGuidItem createCasGuidMapCasGuidItem() {
        return new CasGuidMap.CasGuidItem();
    }

    /**
     * Create an instance of {@link Contract.LinkedSubjects }
     * 
     */
    public Contract.LinkedSubjects createContractLinkedSubjects() {
        return new Contract.LinkedSubjects();
    }

    /**
     * Create an instance of {@link Contract.Restrictions }
     * 
     */
    public Contract.Restrictions createContractRestrictions() {
        return new Contract.Restrictions();
    }

    /**
     * Create an instance of {@link Contract.Strategies }
     * 
     */
    public Contract.Strategies createContractStrategies() {
        return new Contract.Strategies();
    }

    /**
     * Create an instance of {@link Contract.InLinks.Link }
     * 
     */
    public Contract.InLinks.Link createContractInLinksLink() {
        return new Contract.InLinks.Link();
    }

    /**
     * Create an instance of {@link Contract.OutLinks.Link }
     * 
     */
    public Contract.OutLinks.Link createContractOutLinksLink() {
        return new Contract.OutLinks.Link();
    }

    /**
     * Create an instance of {@link Contract.TariffPlans.TariffPlan }
     * 
     */
    public Contract.TariffPlans.TariffPlan createContractTariffPlansTariffPlan() {
        return new Contract.TariffPlans.TariffPlan();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Contract")
    public JAXBElement<Contract> createContract(Contract value) {
        return new JAXBElement<Contract>(_Contract_QNAME, Contract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "StartTime", scope = ContractTariffPlan.class)
    public JAXBElement<XMLGregorianCalendar> createContractTariffPlanStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractTariffPlanStartTime_QNAME, XMLGregorianCalendar.class, ContractTariffPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "FinishOperDay", scope = ContractTariffPlan.class)
    public JAXBElement<XMLGregorianCalendar> createContractTariffPlanFinishOperDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractTariffPlanFinishOperDay_QNAME, XMLGregorianCalendar.class, ContractTariffPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "RelativeId", scope = ContractTariffPlan.class)
    public JAXBElement<Long> createContractTariffPlanRelativeId(Long value) {
        return new JAXBElement<Long>(_ContractTariffPlanRelativeId_QNAME, Long.class, ContractTariffPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "InheritedTariffs", scope = ContractTariffPlan.class)
    public JAXBElement<TariffIds> createContractTariffPlanInheritedTariffs(TariffIds value) {
        return new JAXBElement<TariffIds>(_ContractTariffPlanInheritedTariffs_QNAME, TariffIds.class, ContractTariffPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ExcludedTariffs", scope = ContractTariffPlan.class)
    public JAXBElement<TariffIds> createContractTariffPlanExcludedTariffs(TariffIds value) {
        return new JAXBElement<TariffIds>(_ContractTariffPlanExcludedTariffs_QNAME, TariffIds.class, ContractTariffPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "OpenDay", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountOpenDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountOpenDay_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "OpenUserName", scope = Account.class)
    public JAXBElement<String> createAccountOpenUserName(String value) {
        return new JAXBElement<String>(_AccountOpenUserName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseDay", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountCloseDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountCloseDay_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseUserName", scope = Account.class)
    public JAXBElement<String> createAccountCloseUserName(String value) {
        return new JAXBElement<String>(_AccountCloseUserName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ContractAcctState", scope = Account.class)
    public JAXBElement<String> createAccountContractAcctState(String value) {
        return new JAXBElement<String>(_AccountContractAcctState_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ContractAcctStateReason", scope = Account.class)
    public JAXBElement<String> createAccountContractAcctStateReason(String value) {
        return new JAXBElement<String>(_AccountContractAcctStateReason_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ContractAcctStatus", scope = Account.class)
    public JAXBElement<String> createAccountContractAcctStatus(String value) {
        return new JAXBElement<String>(_AccountContractAcctStatus_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ContractAcctStatusReason", scope = Account.class)
    public JAXBElement<String> createAccountContractAcctStatusReason(String value) {
        return new JAXBElement<String>(_AccountContractAcctStatusReason_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "KeyDay", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountKeyDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountKeyDay_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Info", scope = Account.class)
    public JAXBElement<Info> createAccountInfo(Info value) {
        return new JAXBElement<Info>(_AccountInfo_QNAME, Info.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Notes", scope = Account.class)
    public JAXBElement<String> createAccountNotes(String value) {
        return new JAXBElement<String>(_AccountNotes_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Title1", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkTitle1(String value) {
        return new JAXBElement<String>(_LinkTitle1_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Contract1PartId", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<Long> createLinkContract1PartId(Long value) {
        return new JAXBElement<Long>(_LinkContract1PartId_QNAME, Long.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Contract1PartyRid", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkContract1PartyRid(String value) {
        return new JAXBElement<String>(_LinkContract1PartyRid_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "BatchId", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<Long> createLinkBatchId(Long value) {
        return new JAXBElement<Long>(_LinkBatchId_QNAME, Long.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Title2", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkTitle2(String value) {
        return new JAXBElement<String>(_LinkTitle2_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Notes", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkNotes(String value) {
        return new JAXBElement<String>(_AccountNotes_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ProfileId", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<Long> createLinkProfileId(Long value) {
        return new JAXBElement<Long>(_LinkProfileId_QNAME, Long.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ProfileRid", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkProfileRid(String value) {
        return new JAXBElement<String>(_LinkProfileRid_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ExpTime", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkExpTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkExpTime_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CreateTime", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkCreateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkCreateTime_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CreateUserName", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkCreateUserName(String value) {
        return new JAXBElement<String>(_LinkCreateUserName_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateTime", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkActivateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateTime_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateDay", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkActivateDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateDay_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateUserName", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkActivateUserName(String value) {
        return new JAXBElement<String>(_LinkActivateUserName_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseTime", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkCloseTime_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseDay", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<XMLGregorianCalendar> createLinkCloseDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountCloseDay_QNAME, XMLGregorianCalendar.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseUserName", scope = com.tranzaxis.schemas.contracts_admin.Link.class)
    public JAXBElement<String> createLinkCloseUserName(String value) {
        return new JAXBElement<String>(_AccountCloseUserName_QNAME, String.class, com.tranzaxis.schemas.contracts_admin.Link.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "SubjectId", scope = LinkedSubject.class)
    public JAXBElement<Long> createLinkedSubjectSubjectId(Long value) {
        return new JAXBElement<Long>(_LinkedSubjectSubjectId_QNAME, Long.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "SubjectRid", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectSubjectRid(String value) {
        return new JAXBElement<String>(_LinkedSubjectSubjectRid_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "SubjectInstId", scope = LinkedSubject.class)
    public JAXBElement<Long> createLinkedSubjectSubjectInstId(Long value) {
        return new JAXBElement<Long>(_LinkedSubjectSubjectInstId_QNAME, Long.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Title1", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectTitle1(String value) {
        return new JAXBElement<String>(_LinkTitle1_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Title2", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectTitle2(String value) {
        return new JAXBElement<String>(_LinkTitle2_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Notes", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectNotes(String value) {
        return new JAXBElement<String>(_AccountNotes_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "QuotaDivisor", scope = LinkedSubject.class)
    public JAXBElement<Long> createLinkedSubjectQuotaDivisor(Long value) {
        return new JAXBElement<Long>(_LinkedSubjectQuotaDivisor_QNAME, Long.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "QuotaNumerator", scope = LinkedSubject.class)
    public JAXBElement<Long> createLinkedSubjectQuotaNumerator(Long value) {
        return new JAXBElement<Long>(_LinkedSubjectQuotaNumerator_QNAME, Long.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateTime", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectActivateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateTime_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateDay", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectActivateDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateDay_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateUserName", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectActivateUserName(String value) {
        return new JAXBElement<String>(_LinkActivateUserName_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseTime", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkCloseTime_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseDay", scope = LinkedSubject.class)
    public JAXBElement<XMLGregorianCalendar> createLinkedSubjectCloseDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountCloseDay_QNAME, XMLGregorianCalendar.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseUserName", scope = LinkedSubject.class)
    public JAXBElement<String> createLinkedSubjectCloseUserName(String value) {
        return new JAXBElement<String>(_AccountCloseUserName_QNAME, String.class, LinkedSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "InstCode", scope = Contract.class)
    public JAXBElement<Long> createContractInstCode(Long value) {
        return new JAXBElement<Long>(_ContractInstCode_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "BranchId", scope = Contract.class)
    public JAXBElement<Long> createContractBranchId(Long value) {
        return new JAXBElement<Long>(_ContractBranchId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "BranchName", scope = Contract.class)
    public JAXBElement<String> createContractBranchName(String value) {
        return new JAXBElement<String>(_ContractBranchName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "BranchCode", scope = Contract.class)
    public JAXBElement<Long> createContractBranchCode(Long value) {
        return new JAXBElement<Long>(_ContractBranchCode_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "TypeId", scope = Contract.class)
    public JAXBElement<Long> createContractTypeId(Long value) {
        return new JAXBElement<Long>(_ContractTypeId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "TypeRid", scope = Contract.class)
    public JAXBElement<String> createContractTypeRid(String value) {
        return new JAXBElement<String>(_ContractTypeRid_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "TypeExtGuid", scope = Contract.class)
    public JAXBElement<String> createContractTypeExtGuid(String value) {
        return new JAXBElement<String>(_ContractTypeExtGuid_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Title", scope = Contract.class)
    public JAXBElement<String> createContractTitle(String value) {
        return new JAXBElement<String>(_ContractTitle_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "RiskLevel", scope = Contract.class)
    public JAXBElement<Long> createContractRiskLevel(Long value) {
        return new JAXBElement<Long>(_ContractRiskLevel_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ProfileId", scope = Contract.class)
    public JAXBElement<Long> createContractProfileId(Long value) {
        return new JAXBElement<Long>(_LinkProfileId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ProfileRid", scope = Contract.class)
    public JAXBElement<String> createContractProfileRid(String value) {
        return new JAXBElement<String>(_LinkProfileRid_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ProfileExtGuid", scope = Contract.class)
    public JAXBElement<String> createContractProfileExtGuid(String value) {
        return new JAXBElement<String>(_ContractProfileExtGuid_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CreateUserName", scope = Contract.class)
    public JAXBElement<String> createContractCreateUserName(String value) {
        return new JAXBElement<String>(_LinkCreateUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateTime", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractActivateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateTime_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateDay", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractActivateDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkActivateDay_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ActivateUserName", scope = Contract.class)
    public JAXBElement<String> createContractActivateUserName(String value) {
        return new JAXBElement<String>(_LinkActivateUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ConclusionDay", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractConclusionDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractConclusionDay_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ConclusionUserName", scope = Contract.class)
    public JAXBElement<String> createContractConclusionUserName(String value) {
        return new JAXBElement<String>(_ContractConclusionUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ReconclusionDay", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractReconclusionDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractReconclusionDay_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "ReconclusionUserName", scope = Contract.class)
    public JAXBElement<String> createContractReconclusionUserName(String value) {
        return new JAXBElement<String>(_ContractReconclusionUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseTime", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LinkCloseTime_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseDay", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractCloseDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountCloseDay_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CloseUserName", scope = Contract.class)
    public JAXBElement<String> createContractCloseUserName(String value) {
        return new JAXBElement<String>(_AccountCloseUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Notes", scope = Contract.class)
    public JAXBElement<String> createContractNotes(String value) {
        return new JAXBElement<String>(_AccountNotes_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract.TariffPlans }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Contract.TariffPlans }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "TariffPlans", scope = Contract.class)
    public JAXBElement<Contract.TariffPlans> createContractTariffPlans(Contract.TariffPlans value) {
        return new JAXBElement<Contract.TariffPlans>(_ContractTariffPlans_QNAME, Contract.TariffPlans.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RcMoratoriums }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "RcMoratoriums", scope = Contract.class)
    public JAXBElement<RcMoratoriums> createContractRcMoratoriums(RcMoratoriums value) {
        return new JAXBElement<RcMoratoriums>(_ContractRcMoratoriums_QNAME, RcMoratoriums.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "UserProps", scope = Contract.class)
    public JAXBElement<UserProps> createContractUserProps(UserProps value) {
        return new JAXBElement<UserProps>(_ContractUserProps_QNAME, UserProps.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "CasGuid", scope = Contract.class)
    public JAXBElement<String> createContractCasGuid(String value) {
        return new JAXBElement<String>(_ContractCasGuid_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "FinishDay", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractFinishDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractFinishDay_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "FinishUserName", scope = Contract.class)
    public JAXBElement<String> createContractFinishUserName(String value) {
        return new JAXBElement<String>(_ContractFinishUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "UsageRestriction", scope = Contract.class)
    public JAXBElement<String> createContractUsageRestriction(String value) {
        return new JAXBElement<String>(_ContractUsageRestriction_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "LastUsageRestrictionChangeTime", scope = Contract.class)
    public JAXBElement<XMLGregorianCalendar> createContractLastUsageRestrictionChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractLastUsageRestrictionChangeTime_QNAME, XMLGregorianCalendar.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "LastUsageRestrictionChangeUserName", scope = Contract.class)
    public JAXBElement<String> createContractLastUsageRestrictionChangeUserName(String value) {
        return new JAXBElement<String>(_ContractLastUsageRestrictionChangeUserName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "TokensDeliveryBranchId", scope = Contract.class)
    public JAXBElement<Long> createContractTokensDeliveryBranchId(Long value) {
        return new JAXBElement<Long>(_ContractTokensDeliveryBranchId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "StatementTypeId", scope = Contract.class)
    public JAXBElement<Long> createContractStatementTypeId(Long value) {
        return new JAXBElement<Long>(_ContractStatementTypeId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "StatementChannelId", scope = Contract.class)
    public JAXBElement<Long> createContractStatementChannelId(Long value) {
        return new JAXBElement<Long>(_ContractStatementChannelId_QNAME, Long.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "StatementLangCode", scope = Contract.class)
    public JAXBElement<String> createContractStatementLangCode(String value) {
        return new JAXBElement<String>(_ContractStatementLangCode_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "StatementAddress", scope = Contract.class)
    public JAXBElement<MailAddress> createContractStatementAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_ContractStatementAddress_QNAME, MailAddress.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", name = "Seq2", scope = Contract.InLinks.Link.class)
    public JAXBElement<Long> createContractInLinksLinkSeq2(Long value) {
        return new JAXBElement<Long>(_ContractInLinksLinkSeq2_QNAME, Long.class, Contract.InLinks.Link.class, value);
    }

}
