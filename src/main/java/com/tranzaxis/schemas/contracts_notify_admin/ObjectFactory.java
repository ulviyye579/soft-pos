
package com.tranzaxis.schemas.contracts_notify_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.contracts_notify.NotifyContract;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_notify_admin package. 
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

    private final static QName _NotifyContractExt_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify-admin.xsd", "NotifyContractExt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_notify_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyContract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifyContract }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify-admin.xsd", name = "NotifyContractExt")
    public JAXBElement<NotifyContract> createNotifyContractExt(NotifyContract value) {
        return new JAXBElement<NotifyContract>(_NotifyContractExt_QNAME, NotifyContract.class, null, value);
    }

}
