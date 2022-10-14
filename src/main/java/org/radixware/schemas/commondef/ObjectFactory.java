
package org.radixware.schemas.commondef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.commondef package. 
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

    private final static QName _ClipboardInfo_QNAME = new QName("http://schemas.radixware.org/commondef.xsd", "ClipboardInfo");
    private final static QName _ChangeLogItem_QNAME = new QName("http://schemas.radixware.org/commondef.xsd", "ChangeLogItem");
    private final static QName _ChangeLog_QNAME = new QName("http://schemas.radixware.org/commondef.xsd", "ChangeLog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.commondef
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Definition }
     * 
     */
    public Definition createDefinition() {
        return new Definition();
    }

    /**
     * Create an instance of {@link CbInfo }
     * 
     */
    public CbInfo createCbInfo() {
        return new CbInfo();
    }

    /**
     * Create an instance of {@link ChangeLogItem }
     * 
     */
    public ChangeLogItem createChangeLogItem() {
        return new ChangeLogItem();
    }

    /**
     * Create an instance of {@link ChangeLog }
     * 
     */
    public ChangeLog createChangeLog() {
        return new ChangeLog();
    }

    /**
     * Create an instance of {@link NamedDefinition }
     * 
     */
    public NamedDefinition createNamedDefinition() {
        return new NamedDefinition();
    }

    /**
     * Create an instance of {@link DescribedDefinition }
     * 
     */
    public DescribedDefinition createDescribedDefinition() {
        return new DescribedDefinition();
    }

    /**
     * Create an instance of {@link DefaultValue }
     * 
     */
    public DefaultValue createDefaultValue() {
        return new DefaultValue();
    }

    /**
     * Create an instance of {@link ProfileInfo }
     * 
     */
    public ProfileInfo createProfileInfo() {
        return new ProfileInfo();
    }

    /**
     * Create an instance of {@link Definition.ReplacedDeprecatedPaths }
     * 
     */
    public Definition.ReplacedDeprecatedPaths createDefinitionReplacedDeprecatedPaths() {
        return new Definition.ReplacedDeprecatedPaths();
    }

    /**
     * Create an instance of {@link Definition.SuppressedWarning }
     * 
     */
    public Definition.SuppressedWarning createDefinitionSuppressedWarning() {
        return new Definition.SuppressedWarning();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CbInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/commondef.xsd", name = "ClipboardInfo")
    public JAXBElement<CbInfo> createClipboardInfo(CbInfo value) {
        return new JAXBElement<CbInfo>(_ClipboardInfo_QNAME, CbInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLogItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeLogItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/commondef.xsd", name = "ChangeLogItem")
    public JAXBElement<ChangeLogItem> createChangeLogItem(ChangeLogItem value) {
        return new JAXBElement<ChangeLogItem>(_ChangeLogItem_QNAME, ChangeLogItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/commondef.xsd", name = "ChangeLog")
    public JAXBElement<ChangeLog> createChangeLog(ChangeLog value) {
        return new JAXBElement<ChangeLog>(_ChangeLog_QNAME, ChangeLog.class, null, value);
    }

}
