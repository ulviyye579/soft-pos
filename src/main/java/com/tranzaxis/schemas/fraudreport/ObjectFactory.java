
package com.tranzaxis.schemas.fraudreport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.fraudreport package. 
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

    private final static QName _SpecificInfo_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "SpecificInfo");
    private final static QName _FraudReportNetworkId_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "NetworkId");
    private final static QName _FraudReportNetworkType_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "NetworkType");
    private final static QName _FraudReportNetworkReason_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "NetworkReason");
    private final static QName _FraudReportStatusDesc_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "StatusDesc");
    private final static QName _FraudReportDescription_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "Description");
    private final static QName _FraudReportRespTime_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "RespTime");
    private final static QName _FraudReportSenderInstBin_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "SenderInstBin");
    private final static QName _FraudReportId_QNAME = new QName("http://schemas.tranzaxis.com/fraudReport.xsd", "Id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.fraudreport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpecificInfo }
     * 
     */
    public SpecificInfo createSpecificInfo() {
        return new SpecificInfo();
    }

    /**
     * Create an instance of {@link FraudReport }
     * 
     */
    public FraudReport createFraudReport() {
        return new FraudReport();
    }

    /**
     * Create an instance of {@link SpecificInfo.Nspk }
     * 
     */
    public SpecificInfo.Nspk createSpecificInfoNspk() {
        return new SpecificInfo.Nspk();
    }

    /**
     * Create an instance of {@link SpecificInfo.Visa }
     * 
     */
    public SpecificInfo.Visa createSpecificInfoVisa() {
        return new SpecificInfo.Visa();
    }

    /**
     * Create an instance of {@link SpecificInfo.MasterCard }
     * 
     */
    public SpecificInfo.MasterCard createSpecificInfoMasterCard() {
        return new SpecificInfo.MasterCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "SpecificInfo")
    public JAXBElement<SpecificInfo> createSpecificInfo(SpecificInfo value) {
        return new JAXBElement<SpecificInfo>(_SpecificInfo_QNAME, SpecificInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "NetworkId", scope = FraudReport.class)
    public JAXBElement<Long> createFraudReportNetworkId(Long value) {
        return new JAXBElement<Long>(_FraudReportNetworkId_QNAME, Long.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "NetworkType", scope = FraudReport.class)
    public JAXBElement<String> createFraudReportNetworkType(String value) {
        return new JAXBElement<String>(_FraudReportNetworkType_QNAME, String.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "NetworkReason", scope = FraudReport.class)
    public JAXBElement<String> createFraudReportNetworkReason(String value) {
        return new JAXBElement<String>(_FraudReportNetworkReason_QNAME, String.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "StatusDesc", scope = FraudReport.class)
    public JAXBElement<String> createFraudReportStatusDesc(String value) {
        return new JAXBElement<String>(_FraudReportStatusDesc_QNAME, String.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "Description", scope = FraudReport.class)
    public JAXBElement<String> createFraudReportDescription(String value) {
        return new JAXBElement<String>(_FraudReportDescription_QNAME, String.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "RespTime", scope = FraudReport.class)
    public JAXBElement<XMLGregorianCalendar> createFraudReportRespTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FraudReportRespTime_QNAME, XMLGregorianCalendar.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "SenderInstBin", scope = FraudReport.class)
    public JAXBElement<String> createFraudReportSenderInstBin(String value) {
        return new JAXBElement<String>(_FraudReportSenderInstBin_QNAME, String.class, FraudReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", name = "Id", scope = FraudReport.class)
    public JAXBElement<Long> createFraudReportId(Long value) {
        return new JAXBElement<Long>(_FraudReportId_QNAME, Long.class, FraudReport.class, value);
    }

}
