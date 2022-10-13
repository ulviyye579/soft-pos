
package org.radixware.schemas.faultdetail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.faultdetail package. 
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

    private final static QName _Exception_QNAME = new QName("http://schemas.radixware.org/faultdetail.xsd", "Exception");
    private final static QName _Trace_QNAME = new QName("http://schemas.radixware.org/faultdetail.xsd", "Trace");
    private final static QName _Message_QNAME = new QName("http://schemas.radixware.org/faultdetail.xsd", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.faultdetail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Trace }
     * 
     */
    public Trace createTrace() {
        return new Trace();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Trace.Item }
     * 
     */
    public Trace.Item createTraceItem() {
        return new Trace.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/faultdetail.xsd", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Trace }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/faultdetail.xsd", name = "Trace")
    public JAXBElement<Trace> createTrace(Trace value) {
        return new JAXBElement<Trace>(_Trace_QNAME, Trace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/faultdetail.xsd", name = "Message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

}
