
package com.tranzaxis.schemas.contracts_strategy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_strategy package. 
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

    private final static QName _StrategyMappingInfo_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "StrategyMappingInfo");
    private final static QName _Tranche_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "Tranche");
    private final static QName _Tranches_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "Tranches");
    private final static QName _ChildStrategies_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "ChildStrategies");
    private final static QName _StrategyTypeId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "TypeId");
    private final static QName _StrategyStrategyTypeRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "StrategyTypeRid");
    private final static QName _StrategyActive_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "Active");
    private final static QName _StrategyContractId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "ContractId");
    private final static QName _StrategyCreateInstanceSettings_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "CreateInstanceSettings");
    private final static QName _StrategyDeleteInstanceSettings_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "DeleteInstanceSettings");
    private final static QName _StrategySeq_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "Seq");
    private final static QName _TrancheStateDebtCategoryId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "DebtCategoryId");
    private final static QName _TrancheStateCategory_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "Category");
    private final static QName _TrancheStateLastAccrualDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "LastAccrualDay");
    private final static QName _TrancheStatePaidDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "PaidDay");
    private final static QName _TrancheStateDoerRolePath_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "DoerRolePath");
    private final static QName _TrancheStateOrigRegRole_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "OrigRegRole");
    private final static QName _TrancheStateOrigRegCcy_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "OrigRegCcy");
    private final static QName _TrancheStateOrigRegClassification_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "OrigRegClassification");
    private final static QName _TrancheStateOrigEpClassification_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "OrigEpClassification");
    private final static QName _TrancheStateRegClassification_QNAME = new QName("http://schemas.tranzaxis.com/contracts-strategy.xsd", "RegClassification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_strategy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyMappingInfo }
     * 
     */
    public StrategyMappingInfo createStrategyMappingInfo() {
        return new StrategyMappingInfo();
    }

    /**
     * Create an instance of {@link TrancheState }
     * 
     */
    public TrancheState createTrancheState() {
        return new TrancheState();
    }

    /**
     * Create an instance of {@link Tranches }
     * 
     */
    public Tranches createTranches() {
        return new Tranches();
    }

    /**
     * Create an instance of {@link ChildStrategies }
     * 
     */
    public ChildStrategies createChildStrategies() {
        return new ChildStrategies();
    }

    /**
     * Create an instance of {@link StrategyMappingItem }
     * 
     */
    public StrategyMappingItem createStrategyMappingItem() {
        return new StrategyMappingItem();
    }

    /**
     * Create an instance of {@link StrategyTypeItem }
     * 
     */
    public StrategyTypeItem createStrategyTypeItem() {
        return new StrategyTypeItem();
    }

    /**
     * Create an instance of {@link StrategyTypeList }
     * 
     */
    public StrategyTypeList createStrategyTypeList() {
        return new StrategyTypeList();
    }

    /**
     * Create an instance of {@link StrategyTypeData }
     * 
     */
    public StrategyTypeData createStrategyTypeData() {
        return new StrategyTypeData();
    }

    /**
     * Create an instance of {@link Strategy }
     * 
     */
    public Strategy createStrategy() {
        return new Strategy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyMappingInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StrategyMappingInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "StrategyMappingInfo")
    public JAXBElement<StrategyMappingInfo> createStrategyMappingInfo(StrategyMappingInfo value) {
        return new JAXBElement<StrategyMappingInfo>(_StrategyMappingInfo_QNAME, StrategyMappingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrancheState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrancheState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "Tranche")
    public JAXBElement<TrancheState> createTranche(TrancheState value) {
        return new JAXBElement<TrancheState>(_Tranche_QNAME, TrancheState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tranches }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tranches }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "Tranches")
    public JAXBElement<Tranches> createTranches(Tranches value) {
        return new JAXBElement<Tranches>(_Tranches_QNAME, Tranches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildStrategies }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChildStrategies }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "ChildStrategies")
    public JAXBElement<ChildStrategies> createChildStrategies(ChildStrategies value) {
        return new JAXBElement<ChildStrategies>(_ChildStrategies_QNAME, ChildStrategies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "TypeId", scope = Strategy.class)
    public JAXBElement<Long> createStrategyTypeId(Long value) {
        return new JAXBElement<Long>(_StrategyTypeId_QNAME, Long.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "StrategyTypeRid", scope = Strategy.class)
    public JAXBElement<String> createStrategyStrategyTypeRid(String value) {
        return new JAXBElement<String>(_StrategyStrategyTypeRid_QNAME, String.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "Active", scope = Strategy.class)
    public JAXBElement<Boolean> createStrategyActive(Boolean value) {
        return new JAXBElement<Boolean>(_StrategyActive_QNAME, Boolean.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "ContractId", scope = Strategy.class)
    public JAXBElement<Long> createStrategyContractId(Long value) {
        return new JAXBElement<Long>(_StrategyContractId_QNAME, Long.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "CreateInstanceSettings", scope = Strategy.class)
    public JAXBElement<Boolean> createStrategyCreateInstanceSettings(Boolean value) {
        return new JAXBElement<Boolean>(_StrategyCreateInstanceSettings_QNAME, Boolean.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "DeleteInstanceSettings", scope = Strategy.class)
    public JAXBElement<Boolean> createStrategyDeleteInstanceSettings(Boolean value) {
        return new JAXBElement<Boolean>(_StrategyDeleteInstanceSettings_QNAME, Boolean.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "Seq", scope = Strategy.class)
    public JAXBElement<Long> createStrategySeq(Long value) {
        return new JAXBElement<Long>(_StrategySeq_QNAME, Long.class, Strategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "DebtCategoryId", scope = TrancheState.class)
    public JAXBElement<Long> createTrancheStateDebtCategoryId(Long value) {
        return new JAXBElement<Long>(_TrancheStateDebtCategoryId_QNAME, Long.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "Category", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateCategory(String value) {
        return new JAXBElement<String>(_TrancheStateCategory_QNAME, String.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "LastAccrualDay", scope = TrancheState.class)
    public JAXBElement<XMLGregorianCalendar> createTrancheStateLastAccrualDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrancheStateLastAccrualDay_QNAME, XMLGregorianCalendar.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "PaidDay", scope = TrancheState.class)
    public JAXBElement<XMLGregorianCalendar> createTrancheStatePaidDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrancheStatePaidDay_QNAME, XMLGregorianCalendar.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "DoerRolePath", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateDoerRolePath(String value) {
        return new JAXBElement<String>(_TrancheStateDoerRolePath_QNAME, String.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "OrigRegRole", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateOrigRegRole(String value) {
        return new JAXBElement<String>(_TrancheStateOrigRegRole_QNAME, String.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "OrigRegCcy", scope = TrancheState.class)
    public JAXBElement<Long> createTrancheStateOrigRegCcy(Long value) {
        return new JAXBElement<Long>(_TrancheStateOrigRegCcy_QNAME, Long.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "OrigRegClassification", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateOrigRegClassification(String value) {
        return new JAXBElement<String>(_TrancheStateOrigRegClassification_QNAME, String.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "OrigEpClassification", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateOrigEpClassification(String value) {
        return new JAXBElement<String>(_TrancheStateOrigEpClassification_QNAME, String.class, TrancheState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", name = "RegClassification", scope = TrancheState.class)
    public JAXBElement<String> createTrancheStateRegClassification(String value) {
        return new JAXBElement<String>(_TrancheStateRegClassification_QNAME, String.class, TrancheState.class, value);
    }

}
