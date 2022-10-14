
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.accounting_info.TariffExplanation;
import com.tranzaxis.schemas.tariffs_admin.TariffIds;
import org.radixware.schemas.common.MoneyValue;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_types package. 
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

    private final static QName _ChargePostControlQueue_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ChargePostControlQueue");
    private final static QName _BalanceContractRangeParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "BalanceContractRangeParams");
    private final static QName _ActualizeMeasuresContractRangeParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ActualizeMeasuresContractRangeParams");
    private final static QName _TranPlanExecuteParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "TranPlanExecuteParams");
    private final static QName _ContractStatementDeliveryParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ContractStatementDeliveryParams");
    private final static QName _BalancingSnapshot_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "BalancingSnapshot");
    private final static QName _CasAccountMapItem_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "CasAccountMapItem");
    private final static QName _CasAccountRole_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "CasAccountRole");
    private final static QName _CasOper_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "CasOper");
    private final static QName _AccountingScheme_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "AccountingScheme");
    private final static QName _AccountingSchemes_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "AccountingSchemes");
    private final static QName _PaymentSchedule_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "PaymentSchedule");
    private final static QName _MoneySet_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "MoneySet");
    private final static QName _ContractDebtInfo_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ContractDebtInfo");
    private final static QName _Snapshot_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Snapshot");
    private final static QName _TariffPlanSnapshotStartTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "StartTime");
    private final static QName _TariffPlanSnapshotFinishOperDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "FinishOperDay");
    private final static QName _TariffPlanSnapshotInheritedTariffs_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "InheritedTariffs");
    private final static QName _TariffPlanSnapshotExcludedTariffs_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ExcludedTariffs");
    private final static QName _CasOperHandlerConditionIdx_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ConditionIdx");
    private final static QName _SnapshotUsageRestriction_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "UsageRestriction");
    private final static QName _ContractDebtInfoComment_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Comment");
    private final static QName _ContractDebtInfoDeposit_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Deposit");
    private final static QName _ContractDebtInfoDepositTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "DepositTotal");
    private final static QName _ContractDebtInfoLoanPrincipal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "LoanPrincipal");
    private final static QName _ContractDebtInfoLoanPrincipalTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "LoanPrincipalTotal");
    private final static QName _ContractDebtInfoLoanInterests_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "LoanInterests");
    private final static QName _ContractDebtInfoLoanInterestTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "LoanInterestTotal");
    private final static QName _ContractDebtInfoOverdueCharges_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OverdueCharges");
    private final static QName _ContractDebtInfoOverdueChargeTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OverdueChargeTotal");
    private final static QName _ContractDebtInfoOverlimitChargeTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OverlimitChargeTotal");
    private final static QName _ContractDebtInfoOwnFunds_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OwnFunds");
    private final static QName _ContractDebtInfoOwnFundsTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OwnFundsTotal");
    private final static QName _ContractDebtInfoOwnFundsInterests_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OwnFundsInterests");
    private final static QName _ContractDebtInfoOwnFundsInterestTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OwnFundsInterestTotal");
    private final static QName _ContractDebtInfoServiceCharges_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ServiceCharges");
    private final static QName _ContractDebtInfoServiceChargeTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ServiceChargeTotal");
    private final static QName _ContractDebtInfoEarlyRepaymentCharge_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "EarlyRepaymentCharge");
    private final static QName _ContractDebtInfoTotals_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Totals");
    private final static QName _ContractDebtInfoTotalDebt_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "TotalDebt");
    private final static QName _ContractDebtInfoOverdueLoanTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OverdueLoanTotal");
    private final static QName _ContractDebtInfoTechOverTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "TechOverTotal");
    private final static QName _ContractDebtInfoOverdueDebtTotal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "OverdueDebtTotal");
    private final static QName _ContractDebtInfoOverdueDebtsOverdueDebtKind_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Kind");
    private final static QName _ContractDebtInfoOverdueDebtsOverdueDebtMoney_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Money");
    private final static QName _PaymentScheduleItemFlowExplan_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "Explan");
    private final static QName _CasOperExtEntryPartAcctRole_QNAME = new QName("http://schemas.tranzaxis.com/contracts-types.xsd", "ExtEntryPartAcctRole");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Marks }
     * 
     */
    public Marks createMarks() {
        return new Marks();
    }

    /**
     * Create an instance of {@link Snapshot }
     * 
     */
    public Snapshot createSnapshot() {
        return new Snapshot();
    }

    /**
     * Create an instance of {@link Snapshot.Balances }
     * 
     */
    public Snapshot.Balances createSnapshotBalances() {
        return new Snapshot.Balances();
    }

    /**
     * Create an instance of {@link Snapshot.Registers }
     * 
     */
    public Snapshot.Registers createSnapshotRegisters() {
        return new Snapshot.Registers();
    }

    /**
     * Create an instance of {@link ContractDebtInfo }
     * 
     */
    public ContractDebtInfo createContractDebtInfo() {
        return new ContractDebtInfo();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.OverdueDebts }
     * 
     */
    public ContractDebtInfo.OverdueDebts createContractDebtInfoOverdueDebts() {
        return new ContractDebtInfo.OverdueDebts();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.TechOvers }
     * 
     */
    public ContractDebtInfo.TechOvers createContractDebtInfoTechOvers() {
        return new ContractDebtInfo.TechOvers();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.OverdueLoans }
     * 
     */
    public ContractDebtInfo.OverdueLoans createContractDebtInfoOverdueLoans() {
        return new ContractDebtInfo.OverdueLoans();
    }

    /**
     * Create an instance of {@link PaymentSchedule }
     * 
     */
    public PaymentSchedule createPaymentSchedule() {
        return new PaymentSchedule();
    }

    /**
     * Create an instance of {@link PaymentSchedule.Item }
     * 
     */
    public PaymentSchedule.Item createPaymentScheduleItem() {
        return new PaymentSchedule.Item();
    }

    /**
     * Create an instance of {@link ChargePostControlQueue }
     * 
     */
    public ChargePostControlQueue createChargePostControlQueue() {
        return new ChargePostControlQueue();
    }

    /**
     * Create an instance of {@link BalanceContractRangeParams }
     * 
     */
    public BalanceContractRangeParams createBalanceContractRangeParams() {
        return new BalanceContractRangeParams();
    }

    /**
     * Create an instance of {@link ActualizeMeasuresContractRangeParams }
     * 
     */
    public ActualizeMeasuresContractRangeParams createActualizeMeasuresContractRangeParams() {
        return new ActualizeMeasuresContractRangeParams();
    }

    /**
     * Create an instance of {@link TranPlanExecuteParams }
     * 
     */
    public TranPlanExecuteParams createTranPlanExecuteParams() {
        return new TranPlanExecuteParams();
    }

    /**
     * Create an instance of {@link ContractStatementDeliveryParams }
     * 
     */
    public ContractStatementDeliveryParams createContractStatementDeliveryParams() {
        return new ContractStatementDeliveryParams();
    }

    /**
     * Create an instance of {@link BalancingSnapshot }
     * 
     */
    public BalancingSnapshot createBalancingSnapshot() {
        return new BalancingSnapshot();
    }

    /**
     * Create an instance of {@link CasAccountMapItem }
     * 
     */
    public CasAccountMapItem createCasAccountMapItem() {
        return new CasAccountMapItem();
    }

    /**
     * Create an instance of {@link CasAccountRole }
     * 
     */
    public CasAccountRole createCasAccountRole() {
        return new CasAccountRole();
    }

    /**
     * Create an instance of {@link CasOper }
     * 
     */
    public CasOper createCasOper() {
        return new CasOper();
    }

    /**
     * Create an instance of {@link AccountingScheme }
     * 
     */
    public AccountingScheme createAccountingScheme() {
        return new AccountingScheme();
    }

    /**
     * Create an instance of {@link AccountingSchemes }
     * 
     */
    public AccountingSchemes createAccountingSchemes() {
        return new AccountingSchemes();
    }

    /**
     * Create an instance of {@link MoneySet }
     * 
     */
    public MoneySet createMoneySet() {
        return new MoneySet();
    }

    /**
     * Create an instance of {@link BalancingTask }
     * 
     */
    public BalancingTask createBalancingTask() {
        return new BalancingTask();
    }

    /**
     * Create an instance of {@link CasAccountMapItems }
     * 
     */
    public CasAccountMapItems createCasAccountMapItems() {
        return new CasAccountMapItems();
    }

    /**
     * Create an instance of {@link CasOperEntryPart }
     * 
     */
    public CasOperEntryPart createCasOperEntryPart() {
        return new CasOperEntryPart();
    }

    /**
     * Create an instance of {@link CasOperHandler }
     * 
     */
    public CasOperHandler createCasOperHandler() {
        return new CasOperHandler();
    }

    /**
     * Create an instance of {@link CasOpers }
     * 
     */
    public CasOpers createCasOpers() {
        return new CasOpers();
    }

    /**
     * Create an instance of {@link CasAccountRoles }
     * 
     */
    public CasAccountRoles createCasAccountRoles() {
        return new CasAccountRoles();
    }

    /**
     * Create an instance of {@link ContractLink }
     * 
     */
    public ContractLink createContractLink() {
        return new ContractLink();
    }

    /**
     * Create an instance of {@link TariffPlanSnapshot }
     * 
     */
    public TariffPlanSnapshot createTariffPlanSnapshot() {
        return new TariffPlanSnapshot();
    }

    /**
     * Create an instance of {@link TariffPlansHistory }
     * 
     */
    public TariffPlansHistory createTariffPlansHistory() {
        return new TariffPlansHistory();
    }

    /**
     * Create an instance of {@link Marks.Mark }
     * 
     */
    public Marks.Mark createMarksMark() {
        return new Marks.Mark();
    }

    /**
     * Create an instance of {@link Snapshot.OutLinks }
     * 
     */
    public Snapshot.OutLinks createSnapshotOutLinks() {
        return new Snapshot.OutLinks();
    }

    /**
     * Create an instance of {@link Snapshot.InLinks }
     * 
     */
    public Snapshot.InLinks createSnapshotInLinks() {
        return new Snapshot.InLinks();
    }

    /**
     * Create an instance of {@link Snapshot.Strategies }
     * 
     */
    public Snapshot.Strategies createSnapshotStrategies() {
        return new Snapshot.Strategies();
    }

    /**
     * Create an instance of {@link Snapshot.Property }
     * 
     */
    public Snapshot.Property createSnapshotProperty() {
        return new Snapshot.Property();
    }

    /**
     * Create an instance of {@link Snapshot.Balances.Balance }
     * 
     */
    public Snapshot.Balances.Balance createSnapshotBalancesBalance() {
        return new Snapshot.Balances.Balance();
    }

    /**
     * Create an instance of {@link Snapshot.Registers.Register }
     * 
     */
    public Snapshot.Registers.Register createSnapshotRegistersRegister() {
        return new Snapshot.Registers.Register();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.OverdueDebts.OverdueDebt }
     * 
     */
    public ContractDebtInfo.OverdueDebts.OverdueDebt createContractDebtInfoOverdueDebtsOverdueDebt() {
        return new ContractDebtInfo.OverdueDebts.OverdueDebt();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.TechOvers.TechOver }
     * 
     */
    public ContractDebtInfo.TechOvers.TechOver createContractDebtInfoTechOversTechOver() {
        return new ContractDebtInfo.TechOvers.TechOver();
    }

    /**
     * Create an instance of {@link ContractDebtInfo.OverdueLoans.OverdueLoan }
     * 
     */
    public ContractDebtInfo.OverdueLoans.OverdueLoan createContractDebtInfoOverdueLoansOverdueLoan() {
        return new ContractDebtInfo.OverdueLoans.OverdueLoan();
    }

    /**
     * Create an instance of {@link PaymentSchedule.Item.Flow }
     * 
     */
    public PaymentSchedule.Item.Flow createPaymentScheduleItemFlow() {
        return new PaymentSchedule.Item.Flow();
    }

    /**
     * Create an instance of {@link ChargePostControlQueue.Period }
     * 
     */
    public ChargePostControlQueue.Period createChargePostControlQueuePeriod() {
        return new ChargePostControlQueue.Period();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargePostControlQueue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChargePostControlQueue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ChargePostControlQueue")
    public JAXBElement<ChargePostControlQueue> createChargePostControlQueue(ChargePostControlQueue value) {
        return new JAXBElement<ChargePostControlQueue>(_ChargePostControlQueue_QNAME, ChargePostControlQueue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceContractRangeParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalanceContractRangeParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "BalanceContractRangeParams")
    public JAXBElement<BalanceContractRangeParams> createBalanceContractRangeParams(BalanceContractRangeParams value) {
        return new JAXBElement<BalanceContractRangeParams>(_BalanceContractRangeParams_QNAME, BalanceContractRangeParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizeMeasuresContractRangeParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizeMeasuresContractRangeParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ActualizeMeasuresContractRangeParams")
    public JAXBElement<ActualizeMeasuresContractRangeParams> createActualizeMeasuresContractRangeParams(ActualizeMeasuresContractRangeParams value) {
        return new JAXBElement<ActualizeMeasuresContractRangeParams>(_ActualizeMeasuresContractRangeParams_QNAME, ActualizeMeasuresContractRangeParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranPlanExecuteParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranPlanExecuteParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "TranPlanExecuteParams")
    public JAXBElement<TranPlanExecuteParams> createTranPlanExecuteParams(TranPlanExecuteParams value) {
        return new JAXBElement<TranPlanExecuteParams>(_TranPlanExecuteParams_QNAME, TranPlanExecuteParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractStatementDeliveryParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContractStatementDeliveryParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ContractStatementDeliveryParams")
    public JAXBElement<ContractStatementDeliveryParams> createContractStatementDeliveryParams(ContractStatementDeliveryParams value) {
        return new JAXBElement<ContractStatementDeliveryParams>(_ContractStatementDeliveryParams_QNAME, ContractStatementDeliveryParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalancingSnapshot }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalancingSnapshot }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "BalancingSnapshot")
    public JAXBElement<BalancingSnapshot> createBalancingSnapshot(BalancingSnapshot value) {
        return new JAXBElement<BalancingSnapshot>(_BalancingSnapshot_QNAME, BalancingSnapshot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CasAccountMapItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CasAccountMapItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "CasAccountMapItem")
    public JAXBElement<CasAccountMapItem> createCasAccountMapItem(CasAccountMapItem value) {
        return new JAXBElement<CasAccountMapItem>(_CasAccountMapItem_QNAME, CasAccountMapItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CasAccountRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CasAccountRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "CasAccountRole")
    public JAXBElement<CasAccountRole> createCasAccountRole(CasAccountRole value) {
        return new JAXBElement<CasAccountRole>(_CasAccountRole_QNAME, CasAccountRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CasOper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CasOper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "CasOper")
    public JAXBElement<CasOper> createCasOper(CasOper value) {
        return new JAXBElement<CasOper>(_CasOper_QNAME, CasOper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "AccountingScheme")
    public JAXBElement<AccountingScheme> createAccountingScheme(AccountingScheme value) {
        return new JAXBElement<AccountingScheme>(_AccountingScheme_QNAME, AccountingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingSchemes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingSchemes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "AccountingSchemes")
    public JAXBElement<AccountingSchemes> createAccountingSchemes(AccountingSchemes value) {
        return new JAXBElement<AccountingSchemes>(_AccountingSchemes_QNAME, AccountingSchemes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentSchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentSchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "PaymentSchedule")
    public JAXBElement<PaymentSchedule> createPaymentSchedule(PaymentSchedule value) {
        return new JAXBElement<PaymentSchedule>(_PaymentSchedule_QNAME, PaymentSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "MoneySet")
    public JAXBElement<MoneySet> createMoneySet(MoneySet value) {
        return new JAXBElement<MoneySet>(_MoneySet_QNAME, MoneySet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractDebtInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContractDebtInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ContractDebtInfo")
    public JAXBElement<ContractDebtInfo> createContractDebtInfo(ContractDebtInfo value) {
        return new JAXBElement<ContractDebtInfo>(_ContractDebtInfo_QNAME, ContractDebtInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snapshot }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Snapshot }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Snapshot")
    public JAXBElement<Snapshot> createSnapshot(Snapshot value) {
        return new JAXBElement<Snapshot>(_Snapshot_QNAME, Snapshot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "StartTime", scope = TariffPlanSnapshot.class)
    public JAXBElement<XMLGregorianCalendar> createTariffPlanSnapshotStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffPlanSnapshotStartTime_QNAME, XMLGregorianCalendar.class, TariffPlanSnapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "FinishOperDay", scope = TariffPlanSnapshot.class)
    public JAXBElement<XMLGregorianCalendar> createTariffPlanSnapshotFinishOperDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffPlanSnapshotFinishOperDay_QNAME, XMLGregorianCalendar.class, TariffPlanSnapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "InheritedTariffs", scope = TariffPlanSnapshot.class)
    public JAXBElement<TariffIds> createTariffPlanSnapshotInheritedTariffs(TariffIds value) {
        return new JAXBElement<TariffIds>(_TariffPlanSnapshotInheritedTariffs_QNAME, TariffIds.class, TariffPlanSnapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ExcludedTariffs", scope = TariffPlanSnapshot.class)
    public JAXBElement<TariffIds> createTariffPlanSnapshotExcludedTariffs(TariffIds value) {
        return new JAXBElement<TariffIds>(_TariffPlanSnapshotExcludedTariffs_QNAME, TariffIds.class, TariffPlanSnapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ConditionIdx", scope = CasOperHandler.class)
    public JAXBElement<Long> createCasOperHandlerConditionIdx(Long value) {
        return new JAXBElement<Long>(_CasOperHandlerConditionIdx_QNAME, Long.class, CasOperHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "UsageRestriction", scope = Snapshot.class)
    public JAXBElement<String> createSnapshotUsageRestriction(String value) {
        return new JAXBElement<String>(_SnapshotUsageRestriction_QNAME, String.class, Snapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Comment", scope = ContractDebtInfo.class)
    public JAXBElement<String> createContractDebtInfoComment(String value) {
        return new JAXBElement<String>(_ContractDebtInfoComment_QNAME, String.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Deposit", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoDeposit(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoDeposit_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "DepositTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoDepositTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoDepositTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "LoanPrincipal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoLoanPrincipal(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoLoanPrincipal_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "LoanPrincipalTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoLoanPrincipalTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoLoanPrincipalTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "LoanInterests", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoLoanInterests(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoLoanInterests_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "LoanInterestTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoLoanInterestTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoLoanInterestTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OverdueCharges", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoOverdueCharges(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoOverdueCharges_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OverdueChargeTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverdueChargeTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueChargeTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OverlimitChargeTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverlimitChargeTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverlimitChargeTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OwnFunds", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoOwnFunds(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoOwnFunds_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OwnFundsTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOwnFundsTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOwnFundsTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OwnFundsInterests", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoOwnFundsInterests(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoOwnFundsInterests_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OwnFundsInterestTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOwnFundsInterestTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOwnFundsInterestTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ServiceCharges", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoServiceCharges(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoServiceCharges_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ServiceChargeTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoServiceChargeTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoServiceChargeTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "EarlyRepaymentCharge", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoEarlyRepaymentCharge(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoEarlyRepaymentCharge_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Totals", scope = ContractDebtInfo.class)
    public JAXBElement<MoneySet> createContractDebtInfoTotals(MoneySet value) {
        return new JAXBElement<MoneySet>(_ContractDebtInfoTotals_QNAME, MoneySet.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "TotalDebt", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoTotalDebt(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoTotalDebt_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OverdueLoanTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverdueLoanTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueLoanTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "TechOverTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoTechOverTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoTechOverTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "OverdueDebtTotal", scope = ContractDebtInfo.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverdueDebtTotal(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueDebtTotal_QNAME, MoneyValue.class, ContractDebtInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Kind", scope = ContractDebtInfo.OverdueDebts.OverdueDebt.class)
    public JAXBElement<String> createContractDebtInfoOverdueDebtsOverdueDebtKind(String value) {
        return new JAXBElement<String>(_ContractDebtInfoOverdueDebtsOverdueDebtKind_QNAME, String.class, ContractDebtInfo.OverdueDebts.OverdueDebt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Money", scope = ContractDebtInfo.OverdueDebts.OverdueDebt.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverdueDebtsOverdueDebtMoney(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueDebtsOverdueDebtMoney_QNAME, MoneyValue.class, ContractDebtInfo.OverdueDebts.OverdueDebt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Kind", scope = ContractDebtInfo.TechOvers.TechOver.class)
    public JAXBElement<String> createContractDebtInfoTechOversTechOverKind(String value) {
        return new JAXBElement<String>(_ContractDebtInfoOverdueDebtsOverdueDebtKind_QNAME, String.class, ContractDebtInfo.TechOvers.TechOver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Money", scope = ContractDebtInfo.TechOvers.TechOver.class)
    public JAXBElement<MoneyValue> createContractDebtInfoTechOversTechOverMoney(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueDebtsOverdueDebtMoney_QNAME, MoneyValue.class, ContractDebtInfo.TechOvers.TechOver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Kind", scope = ContractDebtInfo.OverdueLoans.OverdueLoan.class)
    public JAXBElement<String> createContractDebtInfoOverdueLoansOverdueLoanKind(String value) {
        return new JAXBElement<String>(_ContractDebtInfoOverdueDebtsOverdueDebtKind_QNAME, String.class, ContractDebtInfo.OverdueLoans.OverdueLoan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Money", scope = ContractDebtInfo.OverdueLoans.OverdueLoan.class)
    public JAXBElement<MoneyValue> createContractDebtInfoOverdueLoansOverdueLoanMoney(MoneyValue value) {
        return new JAXBElement<MoneyValue>(_ContractDebtInfoOverdueDebtsOverdueDebtMoney_QNAME, MoneyValue.class, ContractDebtInfo.OverdueLoans.OverdueLoan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "Explan", scope = PaymentSchedule.Item.Flow.class)
    public JAXBElement<TariffExplanation> createPaymentScheduleItemFlowExplan(TariffExplanation value) {
        return new JAXBElement<TariffExplanation>(_PaymentScheduleItemFlowExplan_QNAME, TariffExplanation.class, PaymentSchedule.Item.Flow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", name = "ExtEntryPartAcctRole", scope = CasOper.class)
    public JAXBElement<String> createCasOperExtEntryPartAcctRole(String value) {
        return new JAXBElement<String>(_CasOperExtEntryPartAcctRole_QNAME, String.class, CasOper.class, value);
    }

}
