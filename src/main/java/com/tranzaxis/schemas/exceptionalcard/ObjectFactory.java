
package com.tranzaxis.schemas.exceptionalcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.exceptionalcard package. 
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

    private final static QName _CardInfo_QNAME = new QName("http://schemas.tranzaxis.com/exceptionalCard.xsd", "CardInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.exceptionalcard
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
     * Create an instance of {@link SpecificInfo.Jcb }
     * 
     */
    public SpecificInfo.Jcb createSpecificInfoJcb() {
        return new SpecificInfo.Jcb();
    }

    /**
     * Create an instance of {@link SpecificInfo.MasterCard }
     * 
     */
    public SpecificInfo.MasterCard createSpecificInfoMasterCard() {
        return new SpecificInfo.MasterCard();
    }

    /**
     * Create an instance of {@link SpecificInfo.Visa }
     * 
     */
    public SpecificInfo.Visa createSpecificInfoVisa() {
        return new SpecificInfo.Visa();
    }

    /**
     * Create an instance of {@link SpecificInfo.Discover }
     * 
     */
    public SpecificInfo.Discover createSpecificInfoDiscover() {
        return new SpecificInfo.Discover();
    }

    /**
     * Create an instance of {@link SpecificInfo.Jcb.Regions }
     * 
     */
    public SpecificInfo.Jcb.Regions createSpecificInfoJcbRegions() {
        return new SpecificInfo.Jcb.Regions();
    }

    /**
     * Create an instance of {@link SpecificInfo.MasterCard.Regions }
     * 
     */
    public SpecificInfo.MasterCard.Regions createSpecificInfoMasterCardRegions() {
        return new SpecificInfo.MasterCard.Regions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/exceptionalCard.xsd", name = "CardInfo")
    public JAXBElement<SpecificInfo> createCardInfo(SpecificInfo value) {
        return new JAXBElement<SpecificInfo>(_CardInfo_QNAME, SpecificInfo.class, null, value);
    }

}
