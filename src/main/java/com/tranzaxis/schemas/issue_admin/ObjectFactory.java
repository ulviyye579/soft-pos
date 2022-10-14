
package com.tranzaxis.schemas.issue_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.issue_admin package. 
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

    private final static QName _IssueInfo_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "IssueInfo");
    private final static QName _IssueInfoWatchers_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "Watchers");
    private final static QName _IssueInfoDescrition_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "Descrition");
    private final static QName _IssueInfoContactName_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "ContactName");
    private final static QName _IssueInfoAssigneeName_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "AssigneeName");
    private final static QName _IssueInfoResolutionNotes_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "ResolutionNotes");
    private final static QName _IssueInfoResolution_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "Resolution");
    private final static QName _IssueInfoCloseTime_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "CloseTime");
    private final static QName _IssueInfoStartProgressTime_QNAME = new QName("http://schemas.tranzaxis.com/issue-admin.xsd", "StartProgressTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.issue_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IssueInfo }
     * 
     */
    public IssueInfo createIssueInfo() {
        return new IssueInfo();
    }

    /**
     * Create an instance of {@link IssueInfo.Watchers }
     * 
     */
    public IssueInfo.Watchers createIssueInfoWatchers() {
        return new IssueInfo.Watchers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IssueInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "IssueInfo")
    public JAXBElement<IssueInfo> createIssueInfo(IssueInfo value) {
        return new JAXBElement<IssueInfo>(_IssueInfo_QNAME, IssueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueInfo.Watchers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IssueInfo.Watchers }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "Watchers", scope = IssueInfo.class)
    public JAXBElement<IssueInfo.Watchers> createIssueInfoWatchers(IssueInfo.Watchers value) {
        return new JAXBElement<IssueInfo.Watchers>(_IssueInfoWatchers_QNAME, IssueInfo.Watchers.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "Descrition", scope = IssueInfo.class)
    public JAXBElement<String> createIssueInfoDescrition(String value) {
        return new JAXBElement<String>(_IssueInfoDescrition_QNAME, String.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "ContactName", scope = IssueInfo.class)
    public JAXBElement<String> createIssueInfoContactName(String value) {
        return new JAXBElement<String>(_IssueInfoContactName_QNAME, String.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "AssigneeName", scope = IssueInfo.class)
    public JAXBElement<String> createIssueInfoAssigneeName(String value) {
        return new JAXBElement<String>(_IssueInfoAssigneeName_QNAME, String.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "ResolutionNotes", scope = IssueInfo.class)
    public JAXBElement<String> createIssueInfoResolutionNotes(String value) {
        return new JAXBElement<String>(_IssueInfoResolutionNotes_QNAME, String.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "Resolution", scope = IssueInfo.class)
    public JAXBElement<String> createIssueInfoResolution(String value) {
        return new JAXBElement<String>(_IssueInfoResolution_QNAME, String.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "CloseTime", scope = IssueInfo.class)
    public JAXBElement<XMLGregorianCalendar> createIssueInfoCloseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IssueInfoCloseTime_QNAME, XMLGregorianCalendar.class, IssueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/issue-admin.xsd", name = "StartProgressTime", scope = IssueInfo.class)
    public JAXBElement<XMLGregorianCalendar> createIssueInfoStartProgressTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IssueInfoStartProgressTime_QNAME, XMLGregorianCalendar.class, IssueInfo.class, value);
    }

}
