
package com.tranzaxis.schemas.applications;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.radixware.schemas.common.UserFunc;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.applications package. 
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

    private final static QName _ApplicationType_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ApplicationType");
    private final static QName _ApplicationTypeGroup_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ApplicationTypeGroup");
    private final static QName _ApplicationTypeParamVal_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Val");
    private final static QName _ApplicationTypeParamDescription_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Description");
    private final static QName _ApplicationRid_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Rid");
    private final static QName _ApplicationKey_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Key");
    private final static QName _ApplicationTitle_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Title");
    private final static QName _ApplicationComment_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "Comment");
    private final static QName _ApplicationContextContractId_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ContextContractId");
    private final static QName _ApplicationContextTokenId_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ContextTokenId");
    private final static QName _ApplicationTypeDescription_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "TypeDescription");
    private final static QName _ApplicationFinishTime_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "FinishTime");
    private final static QName _ApplicationTypeProcessTypeGuid_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ProcessTypeGuid");
    private final static QName _ApplicationTypeDataSchemeInCore_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "DataSchemeInCore");
    private final static QName _ApplicationTypeDataSchemeUri_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "DataSchemeUri");
    private final static QName _ApplicationTypeDataScheme_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "DataScheme");
    private final static QName _ApplicationTypeHtmlTransform_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "HtmlTransform");
    private final static QName _ApplicationTypeInitData_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "InitData");
    private final static QName _ApplicationTypeAccessibilityFunc_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "AccessibilityFunc");
    private final static QName _ApplicationTypeInitFunc_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "InitFunc");
    private final static QName _ApplicationTypeCheckFunc_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "CheckFunc");
    private final static QName _ApplicationTypeProcessFunc_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "ProcessFunc");
    private final static QName _ApplicationTypeGetParamsFunc_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "GetParamsFunc");
    private final static QName _ApplicationTypeInitPhaseGuid_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "InitPhaseGuid");
    private final static QName _ApplicationTypeOperListGuid_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "OperListGuid");
    private final static QName _ApplicationTypeFinishedShowDays_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "FinishedShowDays");
    private final static QName _ApplicationTypeFinishedStoreDays_QNAME = new QName("http://schemas.tranzaxis.com/applications.xsd", "FinishedStoreDays");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.applications
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link Application.Messages }
     * 
     */
    public Application.Messages createApplicationMessages() {
        return new Application.Messages();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link ApplicationTypeGroup }
     * 
     */
    public ApplicationTypeGroup createApplicationTypeGroup() {
        return new ApplicationTypeGroup();
    }

    /**
     * Create an instance of {@link AppProcessingParams }
     * 
     */
    public AppProcessingParams createAppProcessingParams() {
        return new AppProcessingParams();
    }

    /**
     * Create an instance of {@link ApplicationPhase }
     * 
     */
    public ApplicationPhase createApplicationPhase() {
        return new ApplicationPhase();
    }

    /**
     * Create an instance of {@link ApplicationTypeParam }
     * 
     */
    public ApplicationTypeParam createApplicationTypeParam() {
        return new ApplicationTypeParam();
    }

    /**
     * Create an instance of {@link Application.ContextContract }
     * 
     */
    public Application.ContextContract createApplicationContextContract() {
        return new Application.ContextContract();
    }

    /**
     * Create an instance of {@link Application.ContextToken }
     * 
     */
    public Application.ContextToken createApplicationContextToken() {
        return new Application.ContextToken();
    }

    /**
     * Create an instance of {@link Application.Messages.Message }
     * 
     */
    public Application.Messages.Message createApplicationMessagesMessage() {
        return new Application.Messages.Message();
    }

    /**
     * Create an instance of {@link ApplicationType.Phases }
     * 
     */
    public ApplicationType.Phases createApplicationTypePhases() {
        return new ApplicationType.Phases();
    }

    /**
     * Create an instance of {@link ApplicationType.Params }
     * 
     */
    public ApplicationType.Params createApplicationTypeParams() {
        return new ApplicationType.Params();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ApplicationType")
    public JAXBElement<ApplicationType> createApplicationType(ApplicationType value) {
        return new JAXBElement<ApplicationType>(_ApplicationType_QNAME, ApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationTypeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationTypeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ApplicationTypeGroup")
    public JAXBElement<ApplicationTypeGroup> createApplicationTypeGroup(ApplicationTypeGroup value) {
        return new JAXBElement<ApplicationTypeGroup>(_ApplicationTypeGroup_QNAME, ApplicationTypeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Val", scope = ApplicationTypeParam.class)
    public JAXBElement<String> createApplicationTypeParamVal(String value) {
        return new JAXBElement<String>(_ApplicationTypeParamVal_QNAME, String.class, ApplicationTypeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Description", scope = ApplicationTypeParam.class)
    public JAXBElement<String> createApplicationTypeParamDescription(String value) {
        return new JAXBElement<String>(_ApplicationTypeParamDescription_QNAME, String.class, ApplicationTypeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Rid", scope = Application.class)
    public JAXBElement<String> createApplicationRid(String value) {
        return new JAXBElement<String>(_ApplicationRid_QNAME, String.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Key", scope = Application.class)
    public JAXBElement<String> createApplicationKey(String value) {
        return new JAXBElement<String>(_ApplicationKey_QNAME, String.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Title", scope = Application.class)
    public JAXBElement<String> createApplicationTitle(String value) {
        return new JAXBElement<String>(_ApplicationTitle_QNAME, String.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Comment", scope = Application.class)
    public JAXBElement<String> createApplicationComment(String value) {
        return new JAXBElement<String>(_ApplicationComment_QNAME, String.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ContextContractId", scope = Application.class)
    public JAXBElement<Long> createApplicationContextContractId(Long value) {
        return new JAXBElement<Long>(_ApplicationContextContractId_QNAME, Long.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ContextTokenId", scope = Application.class)
    public JAXBElement<Long> createApplicationContextTokenId(Long value) {
        return new JAXBElement<Long>(_ApplicationContextTokenId_QNAME, Long.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "TypeDescription", scope = Application.class)
    public JAXBElement<String> createApplicationTypeDescription(String value) {
        return new JAXBElement<String>(_ApplicationTypeDescription_QNAME, String.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "FinishTime", scope = Application.class)
    public JAXBElement<XMLGregorianCalendar> createApplicationFinishTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApplicationFinishTime_QNAME, XMLGregorianCalendar.class, Application.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "Rid", scope = ApplicationType.class)
    public JAXBElement<String> createApplicationTypeRid(String value) {
        return new JAXBElement<String>(_ApplicationRid_QNAME, String.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ProcessTypeGuid", scope = ApplicationType.class)
    public JAXBElement<String> createApplicationTypeProcessTypeGuid(String value) {
        return new JAXBElement<String>(_ApplicationTypeProcessTypeGuid_QNAME, String.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "DataSchemeInCore", scope = ApplicationType.class)
    public JAXBElement<Boolean> createApplicationTypeDataSchemeInCore(Boolean value) {
        return new JAXBElement<Boolean>(_ApplicationTypeDataSchemeInCore_QNAME, Boolean.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "DataSchemeUri", scope = ApplicationType.class)
    public JAXBElement<String> createApplicationTypeDataSchemeUri(String value) {
        return new JAXBElement<String>(_ApplicationTypeDataSchemeUri_QNAME, String.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "DataScheme", scope = ApplicationType.class)
    public JAXBElement<Object> createApplicationTypeDataScheme(Object value) {
        return new JAXBElement<Object>(_ApplicationTypeDataScheme_QNAME, Object.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "HtmlTransform", scope = ApplicationType.class)
    public JAXBElement<Object> createApplicationTypeHtmlTransform(Object value) {
        return new JAXBElement<Object>(_ApplicationTypeHtmlTransform_QNAME, Object.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "InitData", scope = ApplicationType.class)
    public JAXBElement<Object> createApplicationTypeInitData(Object value) {
        return new JAXBElement<Object>(_ApplicationTypeInitData_QNAME, Object.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "AccessibilityFunc", scope = ApplicationType.class)
    public JAXBElement<UserFunc> createApplicationTypeAccessibilityFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ApplicationTypeAccessibilityFunc_QNAME, UserFunc.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "InitFunc", scope = ApplicationType.class)
    public JAXBElement<UserFunc> createApplicationTypeInitFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ApplicationTypeInitFunc_QNAME, UserFunc.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "CheckFunc", scope = ApplicationType.class)
    public JAXBElement<UserFunc> createApplicationTypeCheckFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ApplicationTypeCheckFunc_QNAME, UserFunc.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "ProcessFunc", scope = ApplicationType.class)
    public JAXBElement<UserFunc> createApplicationTypeProcessFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ApplicationTypeProcessFunc_QNAME, UserFunc.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "GetParamsFunc", scope = ApplicationType.class)
    public JAXBElement<UserFunc> createApplicationTypeGetParamsFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ApplicationTypeGetParamsFunc_QNAME, UserFunc.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "InitPhaseGuid", scope = ApplicationType.class)
    public JAXBElement<String> createApplicationTypeInitPhaseGuid(String value) {
        return new JAXBElement<String>(_ApplicationTypeInitPhaseGuid_QNAME, String.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "OperListGuid", scope = ApplicationType.class)
    public JAXBElement<String> createApplicationTypeOperListGuid(String value) {
        return new JAXBElement<String>(_ApplicationTypeOperListGuid_QNAME, String.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "FinishedShowDays", scope = ApplicationType.class)
    public JAXBElement<Long> createApplicationTypeFinishedShowDays(Long value) {
        return new JAXBElement<Long>(_ApplicationTypeFinishedShowDays_QNAME, Long.class, ApplicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/applications.xsd", name = "FinishedStoreDays", scope = ApplicationType.class)
    public JAXBElement<Long> createApplicationTypeFinishedStoreDays(Long value) {
        return new JAXBElement<Long>(_ApplicationTypeFinishedStoreDays_QNAME, Long.class, ApplicationType.class, value);
    }

}
