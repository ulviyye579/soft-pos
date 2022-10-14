
package com.tranzaxis.schemas.tokens_alias;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.tokens_alias package. 
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

    private final static QName _TokenAliasExtRid_QNAME = new QName("http://schemas.tranzaxis.com/tokens-alias.xsd", "ExtRid");
    private final static QName _TokenAliasValue_QNAME = new QName("http://schemas.tranzaxis.com/tokens-alias.xsd", "Value");
    private final static QName _TokenAliasType_QNAME = new QName("http://schemas.tranzaxis.com/tokens-alias.xsd", "Type");
    private final static QName _TokenAliasNetworkType_QNAME = new QName("http://schemas.tranzaxis.com/tokens-alias.xsd", "NetworkType");
    private final static QName _TokenAliasCreateTime_QNAME = new QName("http://schemas.tranzaxis.com/tokens-alias.xsd", "CreateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.tokens_alias
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TokenAlias }
     * 
     */
    public TokenAlias createTokenAlias() {
        return new TokenAlias();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", name = "ExtRid", scope = TokenAlias.class)
    public JAXBElement<String> createTokenAliasExtRid(String value) {
        return new JAXBElement<String>(_TokenAliasExtRid_QNAME, String.class, TokenAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", name = "Value", scope = TokenAlias.class)
    public JAXBElement<String> createTokenAliasValue(String value) {
        return new JAXBElement<String>(_TokenAliasValue_QNAME, String.class, TokenAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", name = "Type", scope = TokenAlias.class)
    public JAXBElement<String> createTokenAliasType(String value) {
        return new JAXBElement<String>(_TokenAliasType_QNAME, String.class, TokenAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", name = "NetworkType", scope = TokenAlias.class)
    public JAXBElement<String> createTokenAliasNetworkType(String value) {
        return new JAXBElement<String>(_TokenAliasNetworkType_QNAME, String.class, TokenAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", name = "CreateTime", scope = TokenAlias.class)
    public JAXBElement<XMLGregorianCalendar> createTokenAliasCreateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TokenAliasCreateTime_QNAME, XMLGregorianCalendar.class, TokenAlias.class, value);
    }

}
