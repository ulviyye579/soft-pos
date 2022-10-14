
package com.tranzaxis.schemas.contracts_standingorder_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_standingorder_types package. 
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

    private final static QName _ConditionParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "ConditionParams");
    private final static QName _AmtAlgoParams_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "AmtAlgoParams");
    private final static QName _ContractStandingOrderEndDay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "EndDay");
    private final static QName _ContractStandingOrderTitle_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "Title");
    private final static QName _ContractStandingOrderChargedContractId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "ChargedContractId");
    private final static QName _ContractStandingOrderPrevOrderId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "PrevOrderId");
    private final static QName _ContractStandingOrderNextOrderId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "NextOrderId");
    private final static QName _ContractStandingOrderAddress_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "Address");
    private final static QName _ContractStandingOrderRetryDuration_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "RetryDuration");
    private final static QName _ContractStandingOrderRetryDays_QNAME = new QName("http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", "RetryDays");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_standingorder_types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeSettings }
     * 
     */
    public TypeSettings createTypeSettings() {
        return new TypeSettings();
    }

    /**
     * Create an instance of {@link ConditionParams }
     * 
     */
    public ConditionParams createConditionParams() {
        return new ConditionParams();
    }

    /**
     * Create an instance of {@link AmtAlgoParams }
     * 
     */
    public AmtAlgoParams createAmtAlgoParams() {
        return new AmtAlgoParams();
    }

    /**
     * Create an instance of {@link StandingOrderParams }
     * 
     */
    public StandingOrderParams createStandingOrderParams() {
        return new StandingOrderParams();
    }

    /**
     * Create an instance of {@link ContractStandingOrder }
     * 
     */
    public ContractStandingOrder createContractStandingOrder() {
        return new ContractStandingOrder();
    }

    /**
     * Create an instance of {@link TypeSettings.Condition }
     * 
     */
    public TypeSettings.Condition createTypeSettingsCondition() {
        return new TypeSettings.Condition();
    }

    /**
     * Create an instance of {@link TypeSettings.AmtAlgo }
     * 
     */
    public TypeSettings.AmtAlgo createTypeSettingsAmtAlgo() {
        return new TypeSettings.AmtAlgo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConditionParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "ConditionParams")
    public JAXBElement<ConditionParams> createConditionParams(ConditionParams value) {
        return new JAXBElement<ConditionParams>(_ConditionParams_QNAME, ConditionParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmtAlgoParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmtAlgoParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "AmtAlgoParams")
    public JAXBElement<AmtAlgoParams> createAmtAlgoParams(AmtAlgoParams value) {
        return new JAXBElement<AmtAlgoParams>(_AmtAlgoParams_QNAME, AmtAlgoParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "EndDay", scope = ContractStandingOrder.class)
    public JAXBElement<XMLGregorianCalendar> createContractStandingOrderEndDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractStandingOrderEndDay_QNAME, XMLGregorianCalendar.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "Title", scope = ContractStandingOrder.class)
    public JAXBElement<String> createContractStandingOrderTitle(String value) {
        return new JAXBElement<String>(_ContractStandingOrderTitle_QNAME, String.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "ChargedContractId", scope = ContractStandingOrder.class)
    public JAXBElement<Long> createContractStandingOrderChargedContractId(Long value) {
        return new JAXBElement<Long>(_ContractStandingOrderChargedContractId_QNAME, Long.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "PrevOrderId", scope = ContractStandingOrder.class)
    public JAXBElement<Long> createContractStandingOrderPrevOrderId(Long value) {
        return new JAXBElement<Long>(_ContractStandingOrderPrevOrderId_QNAME, Long.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "NextOrderId", scope = ContractStandingOrder.class)
    public JAXBElement<Long> createContractStandingOrderNextOrderId(Long value) {
        return new JAXBElement<Long>(_ContractStandingOrderNextOrderId_QNAME, Long.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "Address", scope = ContractStandingOrder.class)
    public JAXBElement<String> createContractStandingOrderAddress(String value) {
        return new JAXBElement<String>(_ContractStandingOrderAddress_QNAME, String.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "RetryDuration", scope = ContractStandingOrder.class)
    public JAXBElement<Long> createContractStandingOrderRetryDuration(Long value) {
        return new JAXBElement<Long>(_ContractStandingOrderRetryDuration_QNAME, Long.class, ContractStandingOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", name = "RetryDays", scope = ContractStandingOrder.class)
    public JAXBElement<Long> createContractStandingOrderRetryDays(Long value) {
        return new JAXBElement<Long>(_ContractStandingOrderRetryDays_QNAME, Long.class, ContractStandingOrder.class, value);
    }

}
