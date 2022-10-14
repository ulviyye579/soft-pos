
package com.tranzaxis.schemas.rc_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.rc_admin package. 
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

    private final static QName _RiskObject_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "RiskObject");
    private final static QName _RcMoratoriumDetectorId_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "DetectorId");
    private final static QName _RcMoratoriumNotes_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "Notes");
    private final static QName _RiskObjectAssigneeName_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "AssigneeName");
    private final static QName _RiskObjectSubject_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "Subject");
    private final static QName _RiskObjectBaseObjectStatus_QNAME = new QName("http://schemas.tranzaxis.com/rc-admin.xsd", "BaseObjectStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.rc_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RiskObject }
     * 
     */
    public RiskObject createRiskObject() {
        return new RiskObject();
    }

    /**
     * Create an instance of {@link RcMoratorium }
     * 
     */
    public RcMoratorium createRcMoratorium() {
        return new RcMoratorium();
    }

    /**
     * Create an instance of {@link RcMoratoriums }
     * 
     */
    public RcMoratoriums createRcMoratoriums() {
        return new RcMoratoriums();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RiskObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "RiskObject")
    public JAXBElement<RiskObject> createRiskObject(RiskObject value) {
        return new JAXBElement<RiskObject>(_RiskObject_QNAME, RiskObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "DetectorId", scope = RcMoratorium.class)
    public JAXBElement<Long> createRcMoratoriumDetectorId(Long value) {
        return new JAXBElement<Long>(_RcMoratoriumDetectorId_QNAME, Long.class, RcMoratorium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "Notes", scope = RcMoratorium.class)
    public JAXBElement<String> createRcMoratoriumNotes(String value) {
        return new JAXBElement<String>(_RcMoratoriumNotes_QNAME, String.class, RcMoratorium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "AssigneeName", scope = RiskObject.class)
    public JAXBElement<String> createRiskObjectAssigneeName(String value) {
        return new JAXBElement<String>(_RiskObjectAssigneeName_QNAME, String.class, RiskObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "Subject", scope = RiskObject.class)
    public JAXBElement<String> createRiskObjectSubject(String value) {
        return new JAXBElement<String>(_RiskObjectSubject_QNAME, String.class, RiskObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/rc-admin.xsd", name = "BaseObjectStatus", scope = RiskObject.class)
    public JAXBElement<String> createRiskObjectBaseObjectStatus(String value) {
        return new JAXBElement<String>(_RiskObjectBaseObjectStatus_QNAME, String.class, RiskObject.class, value);
    }

}
