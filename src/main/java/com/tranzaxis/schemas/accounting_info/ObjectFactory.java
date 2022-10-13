
package com.tranzaxis.schemas.accounting_info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.accounting_info package. 
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

    private final static QName _EntryInfo_QNAME = new QName("http://schemas.tranzaxis.com/accounting-info.xsd", "EntryInfo");
    private final static QName _HoldInfo_QNAME = new QName("http://schemas.tranzaxis.com/accounting-info.xsd", "HoldInfo");
    private final static QName _AccountInfo_QNAME = new QName("http://schemas.tranzaxis.com/accounting-info.xsd", "AccountInfo");
    private final static QName _TariffExplanation_QNAME = new QName("http://schemas.tranzaxis.com/accounting-info.xsd", "TariffExplanation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.accounting_info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TariffInfo }
     * 
     */
    public TariffInfo createTariffInfo() {
        return new TariffInfo();
    }

    /**
     * Create an instance of {@link TariffInfo.Interest }
     * 
     */
    public TariffInfo.Interest createTariffInfoInterest() {
        return new TariffInfo.Interest();
    }

    /**
     * Create an instance of {@link TariffInfo.Fee }
     * 
     */
    public TariffInfo.Fee createTariffInfoFee() {
        return new TariffInfo.Fee();
    }

    /**
     * Create an instance of {@link TariffExplanation }
     * 
     */
    public TariffExplanation createTariffExplanation() {
        return new TariffExplanation();
    }

    /**
     * Create an instance of {@link TariffExplanation.Tariffs }
     * 
     */
    public TariffExplanation.Tariffs createTariffExplanationTariffs() {
        return new TariffExplanation.Tariffs();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link TariffMinMax }
     * 
     */
    public TariffMinMax createTariffMinMax() {
        return new TariffMinMax();
    }

    /**
     * Create an instance of {@link TariffRange }
     * 
     */
    public TariffRange createTariffRange() {
        return new TariffRange();
    }

    /**
     * Create an instance of {@link TariffRate }
     * 
     */
    public TariffRate createTariffRate() {
        return new TariffRate();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link Rounding }
     * 
     */
    public Rounding createRounding() {
        return new Rounding();
    }

    /**
     * Create an instance of {@link TariffInfo.Rate }
     * 
     */
    public TariffInfo.Rate createTariffInfoRate() {
        return new TariffInfo.Rate();
    }

    /**
     * Create an instance of {@link TariffInfo.Interest.Day }
     * 
     */
    public TariffInfo.Interest.Day createTariffInfoInterestDay() {
        return new TariffInfo.Interest.Day();
    }

    /**
     * Create an instance of {@link TariffInfo.Fee.Ranges }
     * 
     */
    public TariffInfo.Fee.Ranges createTariffInfoFeeRanges() {
        return new TariffInfo.Fee.Ranges();
    }

    /**
     * Create an instance of {@link TariffInfo.Fee.Simple }
     * 
     */
    public TariffInfo.Fee.Simple createTariffInfoFeeSimple() {
        return new TariffInfo.Fee.Simple();
    }

    /**
     * Create an instance of {@link TariffExplanation.Tariffs.Tariff }
     * 
     */
    public TariffExplanation.Tariffs.Tariff createTariffExplanationTariffsTariff() {
        return new TariffExplanation.Tariffs.Tariff();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/accounting-info.xsd", name = "EntryInfo")
    public JAXBElement<Info> createEntryInfo(Info value) {
        return new JAXBElement<Info>(_EntryInfo_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/accounting-info.xsd", name = "HoldInfo")
    public JAXBElement<Info> createHoldInfo(Info value) {
        return new JAXBElement<Info>(_HoldInfo_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/accounting-info.xsd", name = "AccountInfo")
    public JAXBElement<Info> createAccountInfo(Info value) {
        return new JAXBElement<Info>(_AccountInfo_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/accounting-info.xsd", name = "TariffExplanation")
    public JAXBElement<TariffExplanation> createTariffExplanation(TariffExplanation value) {
        return new JAXBElement<TariffExplanation>(_TariffExplanation_QNAME, TariffExplanation.class, null, value);
    }

}
