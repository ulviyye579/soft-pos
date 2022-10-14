
package com.tranzaxis.schemas.contracts_shadow_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_shadow_admin package. 
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

    private final static QName _ShadowContractExt_QNAME = new QName("http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", "ShadowContractExt");
    private final static QName _ShadowContractExtTmpOverdraft_QNAME = new QName("http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", "TmpOverdraft");
    private final static QName _ShadowContractExtTmpOverdraftExpiration_QNAME = new QName("http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", "TmpOverdraftExpiration");
    private final static QName _ShadowContractExtLedgerBalanceCorr_QNAME = new QName("http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", "LedgerBalanceCorr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_shadow_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShadowContractExt }
     * 
     */
    public ShadowContractExt createShadowContractExt() {
        return new ShadowContractExt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShadowContractExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShadowContractExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", name = "ShadowContractExt")
    public JAXBElement<ShadowContractExt> createShadowContractExt(ShadowContractExt value) {
        return new JAXBElement<ShadowContractExt>(_ShadowContractExt_QNAME, ShadowContractExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", name = "TmpOverdraft", scope = ShadowContractExt.class)
    public JAXBElement<BigDecimal> createShadowContractExtTmpOverdraft(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ShadowContractExtTmpOverdraft_QNAME, BigDecimal.class, ShadowContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", name = "TmpOverdraftExpiration", scope = ShadowContractExt.class)
    public JAXBElement<XMLGregorianCalendar> createShadowContractExtTmpOverdraftExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShadowContractExtTmpOverdraftExpiration_QNAME, XMLGregorianCalendar.class, ShadowContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", name = "LedgerBalanceCorr", scope = ShadowContractExt.class)
    public JAXBElement<BigDecimal> createShadowContractExtLedgerBalanceCorr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ShadowContractExtLedgerBalanceCorr_QNAME, BigDecimal.class, ShadowContractExt.class, value);
    }

}
