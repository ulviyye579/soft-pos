
package com.tranzaxis.schemas.digitized_card;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.digitized_card package. 
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

    private final static QName _DigitizedCardTitle_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "Title");
    private final static QName _DigitizedCardActivationTime_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "ActivationTime");
    private final static QName _DigitizedCardCloseTime_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "CloseTime");
    private final static QName _DigitizedCardNotes_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "Notes");
    private final static QName _DigitizedCardProvisionTime_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "ProvisionTime");
    private final static QName _DigitizedCardChVerificationStatus_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "ChVerificationStatus");
    private final static QName _DigitizedCardLastChVerificationStatusChangeTime_QNAME = new QName("http://schemas.tranzaxis.com/digitized-card.xsd", "LastChVerificationStatusChangeTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.digitized_card
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindingDeviceType }
     * 
     */
    public BindingDeviceType createBindingDeviceType() {
        return new BindingDeviceType();
    }

    /**
     * Create an instance of {@link DigitizedCard }
     * 
     */
    public DigitizedCard createDigitizedCard() {
        return new DigitizedCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "Title", scope = DigitizedCard.class)
    public JAXBElement<String> createDigitizedCardTitle(String value) {
        return new JAXBElement<String>(_DigitizedCardTitle_QNAME, String.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "ActivationTime", scope = DigitizedCard.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizedCardActivationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizedCardActivationTime_QNAME, XMLGregorianCalendar.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "CloseTime", scope = DigitizedCard.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizedCardCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizedCardCloseTime_QNAME, XMLGregorianCalendar.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "Notes", scope = DigitizedCard.class)
    public JAXBElement<String> createDigitizedCardNotes(String value) {
        return new JAXBElement<String>(_DigitizedCardNotes_QNAME, String.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "ProvisionTime", scope = DigitizedCard.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizedCardProvisionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizedCardProvisionTime_QNAME, XMLGregorianCalendar.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "ChVerificationStatus", scope = DigitizedCard.class)
    public JAXBElement<String> createDigitizedCardChVerificationStatus(String value) {
        return new JAXBElement<String>(_DigitizedCardChVerificationStatus_QNAME, String.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "LastChVerificationStatusChangeTime", scope = DigitizedCard.class)
    public JAXBElement<XMLGregorianCalendar> createDigitizedCardLastChVerificationStatusChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DigitizedCardLastChVerificationStatusChangeTime_QNAME, XMLGregorianCalendar.class, DigitizedCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", name = "Notes", scope = BindingDeviceType.class)
    public JAXBElement<String> createBindingDeviceTypeNotes(String value) {
        return new JAXBElement<String>(_DigitizedCardNotes_QNAME, String.class, BindingDeviceType.class, value);
    }

}
