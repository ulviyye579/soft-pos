
package com.tranzaxis.schemas.tariffs_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.tariffs_admin package. 
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

    private final static QName _TariffDescription_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Description");
    private final static QName _TariffStartDay_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "StartDay");
    private final static QName _TariffVerStartTime_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "StartTime");
    private final static QName _TariffVerStartOperDay_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "StartOperDay");
    private final static QName _TariffVerFinishOperDay_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "FinishOperDay");
    private final static QName _TariffVerBaseVal_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "BaseVal");
    private final static QName _TariffVerPercent_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Percent");
    private final static QName _TariffVerMinVal_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "MinVal");
    private final static QName _TariffVerMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "MaxVal");
    private final static QName _TariffVerTableCellCcy_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Ccy");
    private final static QName _TariffTableCellValueBase_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Base");
    private final static QName _TariffTableCellValueMin_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Min");
    private final static QName _TariffTableCellValueMax_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Max");
    private final static QName _TariffTableCellDimRid_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Rid");
    private final static QName _TariffTableCellDimVal_QNAME = new QName("http://schemas.tranzaxis.com/tariffs-admin.xsd", "Val");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.tariffs_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TariffVer }
     * 
     */
    public TariffVer createTariffVer() {
        return new TariffVer();
    }

    /**
     * Create an instance of {@link TariffVer.Table }
     * 
     */
    public TariffVer.Table createTariffVerTable() {
        return new TariffVer.Table();
    }

    /**
     * Create an instance of {@link Tier }
     * 
     */
    public Tier createTier() {
        return new Tier();
    }

    /**
     * Create an instance of {@link Tiers }
     * 
     */
    public Tiers createTiers() {
        return new Tiers();
    }

    /**
     * Create an instance of {@link TariffTableCellDim }
     * 
     */
    public TariffTableCellDim createTariffTableCellDim() {
        return new TariffTableCellDim();
    }

    /**
     * Create an instance of {@link TariffTableCellDims }
     * 
     */
    public TariffTableCellDims createTariffTableCellDims() {
        return new TariffTableCellDims();
    }

    /**
     * Create an instance of {@link TariffTableCellValue }
     * 
     */
    public TariffTableCellValue createTariffTableCellValue() {
        return new TariffTableCellValue();
    }

    /**
     * Create an instance of {@link TariffId }
     * 
     */
    public TariffId createTariffId() {
        return new TariffId();
    }

    /**
     * Create an instance of {@link Tariff }
     * 
     */
    public Tariff createTariff() {
        return new Tariff();
    }

    /**
     * Create an instance of {@link Tariffs }
     * 
     */
    public Tariffs createTariffs() {
        return new Tariffs();
    }

    /**
     * Create an instance of {@link TariffIds }
     * 
     */
    public TariffIds createTariffIds() {
        return new TariffIds();
    }

    /**
     * Create an instance of {@link TariffVer.Table.Cell }
     * 
     */
    public TariffVer.Table.Cell createTariffVerTableCell() {
        return new TariffVer.Table.Cell();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Description", scope = Tariff.class)
    public JAXBElement<String> createTariffDescription(String value) {
        return new JAXBElement<String>(_TariffDescription_QNAME, String.class, Tariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "StartDay", scope = Tariff.class)
    public JAXBElement<XMLGregorianCalendar> createTariffStartDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffStartDay_QNAME, XMLGregorianCalendar.class, Tariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "StartTime", scope = TariffVer.class)
    public JAXBElement<XMLGregorianCalendar> createTariffVerStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffVerStartTime_QNAME, XMLGregorianCalendar.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "StartOperDay", scope = TariffVer.class)
    public JAXBElement<XMLGregorianCalendar> createTariffVerStartOperDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffVerStartOperDay_QNAME, XMLGregorianCalendar.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "FinishOperDay", scope = TariffVer.class)
    public JAXBElement<XMLGregorianCalendar> createTariffVerFinishOperDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TariffVerFinishOperDay_QNAME, XMLGregorianCalendar.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "BaseVal", scope = TariffVer.class)
    public JAXBElement<BigDecimal> createTariffVerBaseVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffVerBaseVal_QNAME, BigDecimal.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Percent", scope = TariffVer.class)
    public JAXBElement<BigDecimal> createTariffVerPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffVerPercent_QNAME, BigDecimal.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "MinVal", scope = TariffVer.class)
    public JAXBElement<BigDecimal> createTariffVerMinVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffVerMinVal_QNAME, BigDecimal.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "MaxVal", scope = TariffVer.class)
    public JAXBElement<BigDecimal> createTariffVerMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffVerMaxVal_QNAME, BigDecimal.class, TariffVer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Ccy", scope = TariffVer.Table.Cell.class)
    public JAXBElement<Long> createTariffVerTableCellCcy(Long value) {
        return new JAXBElement<Long>(_TariffVerTableCellCcy_QNAME, Long.class, TariffVer.Table.Cell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Base", scope = TariffTableCellValue.class)
    public JAXBElement<BigDecimal> createTariffTableCellValueBase(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffTableCellValueBase_QNAME, BigDecimal.class, TariffTableCellValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Percent", scope = TariffTableCellValue.class)
    public JAXBElement<BigDecimal> createTariffTableCellValuePercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffVerPercent_QNAME, BigDecimal.class, TariffTableCellValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Min", scope = TariffTableCellValue.class)
    public JAXBElement<BigDecimal> createTariffTableCellValueMin(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffTableCellValueMin_QNAME, BigDecimal.class, TariffTableCellValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Max", scope = TariffTableCellValue.class)
    public JAXBElement<BigDecimal> createTariffTableCellValueMax(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TariffTableCellValueMax_QNAME, BigDecimal.class, TariffTableCellValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Rid", scope = TariffTableCellDim.class)
    public JAXBElement<String> createTariffTableCellDimRid(String value) {
        return new JAXBElement<String>(_TariffTableCellDimRid_QNAME, String.class, TariffTableCellDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", name = "Val", scope = TariffTableCellDim.class)
    public JAXBElement<String> createTariffTableCellDimVal(String value) {
        return new JAXBElement<String>(_TariffTableCellDimVal_QNAME, String.class, TariffTableCellDim.class, value);
    }

}
