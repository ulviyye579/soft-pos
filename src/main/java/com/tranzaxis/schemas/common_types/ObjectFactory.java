
package com.tranzaxis.schemas.common_types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import com.tranzaxis.schemas.tran_common.CustInfoRq;
import org.radixware.schemas.common.Map;
import org.radixware.schemas.eas.SelectedObjects;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.common_types package. 
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

    private final static QName _MailAddress_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "MailAddress");
    private final static QName _HomeAddress_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "HomeAddress");
    private final static QName _ContactAddress_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ContactAddress");
    private final static QName _StrVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "StrVal");
    private final static QName _IntVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "IntVal");
    private final static QName _NumVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "NumVal");
    private final static QName _CharVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "CharVal");
    private final static QName _BoolVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "BoolVal");
    private final static QName _DateTimeVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "DateTimeVal");
    private final static QName _ArrStrVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ArrStrVal");
    private final static QName _ArrIntVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ArrIntVal");
    private final static QName _ArrNumVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ArrNumVal");
    private final static QName _ArrDateTimeVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ArrDateTimeVal");
    private final static QName _MapStrObjectElem_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "MapStrObjectElem");
    private final static QName _Money_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Money");
    private final static QName _TariffClassifications_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "TariffClassifications");
    private final static QName _InputFormat_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "InputFormat");
    private final static QName _ParamDescriptions_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ParamDescriptions");
    private final static QName _ParamValues_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ParamValues");
    private final static QName _ArrParams_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "ArrParams");
    private final static QName _Attachments_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Attachments");
    private final static QName _Tranches_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Tranches");
    private final static QName _SelectionCriterionSet_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "SelectionCriterionSet");
    private final static QName _BusinessPeriod_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "BusinessPeriod");
    private final static QName _SelectedObjects_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "SelectedObjects");
    private final static QName _XmlPropValue_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Value");
    private final static QName _BusinessPeriodAddDays_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "AddDays");
    private final static QName _BusinessPeriodAddMonths_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "AddMonths");
    private final static QName _BusinessPeriodAddBusinessDays_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "AddBusinessDays");
    private final static QName _BusinessPeriodHolidayCalendarGuid_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "HolidayCalendarGuid");
    private final static QName _BusinessPeriodSetDayOfMonth_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "SetDayOfMonth");
    private final static QName _BusinessPeriodSetDayOfMonthMode_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "SetDayOfMonthMode");
    private final static QName _BusinessPeriodSetDayOfWeek_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "SetDayOfWeek");
    private final static QName _BusinessPeriodCalcFunc_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "CalcFunc");
    private final static QName _AttachmentTitle_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Title");
    private final static QName _AttachmentNotes_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Notes");
    private final static QName _AttachmentPageContent_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Content");
    private final static QName _AttachmentPageUserAttr_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "UserAttr");
    private final static QName _ParamValueVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "Val");
    private final static QName _ParamValueXmlVal_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "XmlVal");
    private final static QName _ParamDescriptionInitialValue_QNAME = new QName("http://schemas.tranzaxis.com/common-types.xsd", "InitialValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.common_types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapStrStrElem }
     * 
     */
    public MapStrStrElem createMapStrStrElem() {
        return new MapStrStrElem();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Tranche }
     * 
     */
    public com.tranzaxis.schemas.common_types.Tranche createTranche() {
        return new com.tranzaxis.schemas.common_types.Tranche();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas }
     * 
     */
    public com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas createTrancheTrancheDeltas() {
        return new com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Attachment }
     * 
     */
    public com.tranzaxis.schemas.common_types.Attachment createAttachment() {
        return new com.tranzaxis.schemas.common_types.Attachment();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Attachment.Pages }
     * 
     */
    public com.tranzaxis.schemas.common_types.Attachment.Pages createAttachmentPages() {
        return new com.tranzaxis.schemas.common_types.Attachment.Pages();
    }

    /**
     * Create an instance of {@link ParamValue }
     * 
     */
    public ParamValue createParamValue() {
        return new ParamValue();
    }

    /**
     * Create an instance of {@link TariffClassification }
     * 
     */
    public TariffClassification createTariffClassification() {
        return new TariffClassification();
    }

    /**
     * Create an instance of {@link Lexeme }
     * 
     */
    public Lexeme createLexeme() {
        return new Lexeme();
    }

    /**
     * Create an instance of {@link SelectionCriterionSet }
     * 
     */
    public SelectionCriterionSet createSelectionCriterionSet() {
        return new SelectionCriterionSet();
    }

    /**
     * Create an instance of {@link Tranches }
     * 
     */
    public Tranches createTranches() {
        return new Tranches();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link InputFormat }
     * 
     */
    public InputFormat createInputFormat() {
        return new InputFormat();
    }

    /**
     * Create an instance of {@link InputFormat.Auto }
     * 
     */
    public InputFormat.Auto createInputFormatAuto() {
        return new InputFormat.Auto();
    }

    /**
     * Create an instance of {@link InputFormat.Lookup }
     * 
     */
    public InputFormat.Lookup createInputFormatLookup() {
        return new InputFormat.Lookup();
    }

    /**
     * Create an instance of {@link TariffClassifications }
     * 
     */
    public TariffClassifications createTariffClassifications() {
        return new TariffClassifications();
    }

    /**
     * Create an instance of {@link MailAddress }
     * 
     */
    public MailAddress createMailAddress() {
        return new MailAddress();
    }

    /**
     * Create an instance of {@link HomeAddress }
     * 
     */
    public HomeAddress createHomeAddress() {
        return new HomeAddress();
    }

    /**
     * Create an instance of {@link ContactAddress }
     * 
     */
    public ContactAddress createContactAddress() {
        return new ContactAddress();
    }

    /**
     * Create an instance of {@link ArrStr }
     * 
     */
    public ArrStr createArrStr() {
        return new ArrStr();
    }

    /**
     * Create an instance of {@link ArrInt }
     * 
     */
    public ArrInt createArrInt() {
        return new ArrInt();
    }

    /**
     * Create an instance of {@link ArrNum }
     * 
     */
    public ArrNum createArrNum() {
        return new ArrNum();
    }

    /**
     * Create an instance of {@link ArrCharVal }
     * 
     */
    public ArrCharVal createArrCharVal() {
        return new ArrCharVal();
    }

    /**
     * Create an instance of {@link ArrBoolVal }
     * 
     */
    public ArrBoolVal createArrBoolVal() {
        return new ArrBoolVal();
    }

    /**
     * Create an instance of {@link ArrDateTime }
     * 
     */
    public ArrDateTime createArrDateTime() {
        return new ArrDateTime();
    }

    /**
     * Create an instance of {@link MapStrStrElem.Item }
     * 
     */
    public MapStrStrElem.Item createMapStrStrElemItem() {
        return new MapStrStrElem.Item();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link ParamDescriptions }
     * 
     */
    public ParamDescriptions createParamDescriptions() {
        return new ParamDescriptions();
    }

    /**
     * Create an instance of {@link ParamValues }
     * 
     */
    public ParamValues createParamValues() {
        return new ParamValues();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.ArrParams }
     * 
     */
    public com.tranzaxis.schemas.common_types.ArrParams createArrParams() {
        return new com.tranzaxis.schemas.common_types.ArrParams();
    }

    /**
     * Create an instance of {@link BusinessPeriod }
     * 
     */
    public BusinessPeriod createBusinessPeriod() {
        return new BusinessPeriod();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link ObjectGuid }
     * 
     */
    public ObjectGuid createObjectGuid() {
        return new ObjectGuid();
    }

    /**
     * Create an instance of {@link ParamDescription }
     * 
     */
    public ParamDescription createParamDescription() {
        return new ParamDescription();
    }

    /**
     * Create an instance of {@link AttachmentPage }
     * 
     */
    public AttachmentPage createAttachmentPage() {
        return new AttachmentPage();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.TrancheDelta }
     * 
     */
    public com.tranzaxis.schemas.common_types.TrancheDelta createTrancheDelta() {
        return new com.tranzaxis.schemas.common_types.TrancheDelta();
    }

    /**
     * Create an instance of {@link InheritableBusinessPeriod }
     * 
     */
    public InheritableBusinessPeriod createInheritableBusinessPeriod() {
        return new InheritableBusinessPeriod();
    }

    /**
     * Create an instance of {@link InheritableStr }
     * 
     */
    public InheritableStr createInheritableStr() {
        return new InheritableStr();
    }

    /**
     * Create an instance of {@link InheritableNum }
     * 
     */
    public InheritableNum createInheritableNum() {
        return new InheritableNum();
    }

    /**
     * Create an instance of {@link InheritableInt }
     * 
     */
    public InheritableInt createInheritableInt() {
        return new InheritableInt();
    }

    /**
     * Create an instance of {@link InheritableBool }
     * 
     */
    public InheritableBool createInheritableBool() {
        return new InheritableBool();
    }

    /**
     * Create an instance of {@link InheritableList }
     * 
     */
    public InheritableList createInheritableList() {
        return new InheritableList();
    }

    /**
     * Create an instance of {@link UserProp }
     * 
     */
    public UserProp createUserProp() {
        return new UserProp();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.UserFunc }
     * 
     */
    public com.tranzaxis.schemas.common_types.UserFunc createUserFunc() {
        return new com.tranzaxis.schemas.common_types.UserFunc();
    }

    /**
     * Create an instance of {@link XmlProp }
     * 
     */
    public XmlProp createXmlProp() {
        return new XmlProp();
    }

    /**
     * Create an instance of {@link AppEncryptedData }
     * 
     */
    public AppEncryptedData createAppEncryptedData() {
        return new AppEncryptedData();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas.TrancheDelta }
     * 
     */
    public com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas.TrancheDelta createTrancheTrancheDeltasTrancheDelta() {
        return new com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas.TrancheDelta();
    }

    /**
     * Create an instance of {@link com.tranzaxis.schemas.common_types.Attachment.Pages.Page }
     * 
     */
    public com.tranzaxis.schemas.common_types.Attachment.Pages.Page createAttachmentPagesPage() {
        return new com.tranzaxis.schemas.common_types.Attachment.Pages.Page();
    }

    /**
     * Create an instance of {@link ParamValue.ArrParams }
     * 
     */
    public ParamValue.ArrParams createParamValueArrParams() {
        return new ParamValue.ArrParams();
    }

    /**
     * Create an instance of {@link TariffClassification.Item }
     * 
     */
    public TariffClassification.Item createTariffClassificationItem() {
        return new TariffClassification.Item();
    }

    /**
     * Create an instance of {@link Lexeme.Translate }
     * 
     */
    public Lexeme.Translate createLexemeTranslate() {
        return new Lexeme.Translate();
    }

    /**
     * Create an instance of {@link SelectionCriterionSet.Criteria }
     * 
     */
    public SelectionCriterionSet.Criteria createSelectionCriterionSetCriteria() {
        return new SelectionCriterionSet.Criteria();
    }

    /**
     * Create an instance of {@link Tranches.Tranche }
     * 
     */
    public Tranches.Tranche createTranchesTranche() {
        return new Tranches.Tranche();
    }

    /**
     * Create an instance of {@link Attachments.Attachment }
     * 
     */
    public Attachments.Attachment createAttachmentsAttachment() {
        return new Attachments.Attachment();
    }

    /**
     * Create an instance of {@link InputFormat.Integer }
     * 
     */
    public InputFormat.Integer createInputFormatInteger() {
        return new InputFormat.Integer();
    }

    /**
     * Create an instance of {@link InputFormat.DynamicList }
     * 
     */
    public InputFormat.DynamicList createInputFormatDynamicList() {
        return new InputFormat.DynamicList();
    }

    /**
     * Create an instance of {@link InputFormat.FilePath }
     * 
     */
    public InputFormat.FilePath createInputFormatFilePath() {
        return new InputFormat.FilePath();
    }

    /**
     * Create an instance of {@link InputFormat.DateTime }
     * 
     */
    public InputFormat.DateTime createInputFormatDateTime() {
        return new InputFormat.DateTime();
    }

    /**
     * Create an instance of {@link InputFormat.Real }
     * 
     */
    public InputFormat.Real createInputFormatReal() {
        return new InputFormat.Real();
    }

    /**
     * Create an instance of {@link InputFormat.Auto.ByOtherParam }
     * 
     */
    public InputFormat.Auto.ByOtherParam createInputFormatAutoByOtherParam() {
        return new InputFormat.Auto.ByOtherParam();
    }

    /**
     * Create an instance of {@link InputFormat.Lookup.Item }
     * 
     */
    public InputFormat.Lookup.Item createInputFormatLookupItem() {
        return new InputFormat.Lookup.Item();
    }

    /**
     * Create an instance of {@link TariffClassifications.Any }
     * 
     */
    public TariffClassifications.Any createTariffClassificationsAny() {
        return new TariffClassifications.Any();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "MailAddress")
    public JAXBElement<MailAddress> createMailAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_MailAddress_QNAME, MailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HomeAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "HomeAddress")
    public JAXBElement<HomeAddress> createHomeAddress(HomeAddress value) {
        return new JAXBElement<HomeAddress>(_HomeAddress_QNAME, HomeAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ContactAddress")
    public JAXBElement<ContactAddress> createContactAddress(ContactAddress value) {
        return new JAXBElement<ContactAddress>(_ContactAddress_QNAME, ContactAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "StrVal")
    public JAXBElement<String> createStrVal(String value) {
        return new JAXBElement<String>(_StrVal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "IntVal")
    public JAXBElement<Long> createIntVal(Long value) {
        return new JAXBElement<Long>(_IntVal_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "NumVal")
    public JAXBElement<BigDecimal> createNumVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NumVal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "CharVal")
    public JAXBElement<String> createCharVal(String value) {
        return new JAXBElement<String>(_CharVal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "BoolVal")
    public JAXBElement<Boolean> createBoolVal(Boolean value) {
        return new JAXBElement<Boolean>(_BoolVal_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "DateTimeVal")
    public JAXBElement<XMLGregorianCalendar> createDateTimeVal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeVal_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ArrStrVal")
    public JAXBElement<ArrStr> createArrStrVal(ArrStr value) {
        return new JAXBElement<ArrStr>(_ArrStrVal_QNAME, ArrStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ArrIntVal")
    public JAXBElement<ArrInt> createArrIntVal(ArrInt value) {
        return new JAXBElement<ArrInt>(_ArrIntVal_QNAME, ArrInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrNum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrNum }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ArrNumVal")
    public JAXBElement<ArrNum> createArrNumVal(ArrNum value) {
        return new JAXBElement<ArrNum>(_ArrNumVal_QNAME, ArrNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ArrDateTimeVal")
    public JAXBElement<ArrDateTime> createArrDateTimeVal(ArrDateTime value) {
        return new JAXBElement<ArrDateTime>(_ArrDateTimeVal_QNAME, ArrDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Map }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "MapStrObjectElem")
    public JAXBElement<Map> createMapStrObjectElem(Map value) {
        return new JAXBElement<Map>(_MapStrObjectElem_QNAME, Map.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Money }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffClassifications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffClassifications }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "TariffClassifications")
    public JAXBElement<TariffClassifications> createTariffClassifications(TariffClassifications value) {
        return new JAXBElement<TariffClassifications>(_TariffClassifications_QNAME, TariffClassifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "InputFormat")
    public JAXBElement<InputFormat> createInputFormat(InputFormat value) {
        return new JAXBElement<InputFormat>(_InputFormat_QNAME, InputFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamDescriptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamDescriptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ParamDescriptions")
    public JAXBElement<ParamDescriptions> createParamDescriptions(ParamDescriptions value) {
        return new JAXBElement<ParamDescriptions>(_ParamDescriptions_QNAME, ParamDescriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ParamValues")
    public JAXBElement<ParamValues> createParamValues(ParamValues value) {
        return new JAXBElement<ParamValues>(_ParamValues_QNAME, ParamValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ArrParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.tranzaxis.schemas.common_types.ArrParams }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "ArrParams")
    public JAXBElement<com.tranzaxis.schemas.common_types.ArrParams> createArrParams(com.tranzaxis.schemas.common_types.ArrParams value) {
        return new JAXBElement<com.tranzaxis.schemas.common_types.ArrParams>(_ArrParams_QNAME, com.tranzaxis.schemas.common_types.ArrParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Attachments")
    public JAXBElement<Attachments> createAttachments(Attachments value) {
        return new JAXBElement<Attachments>(_Attachments_QNAME, Attachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tranches }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tranches }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Tranches")
    public JAXBElement<Tranches> createTranches(Tranches value) {
        return new JAXBElement<Tranches>(_Tranches_QNAME, Tranches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionCriterionSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectionCriterionSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "SelectionCriterionSet")
    public JAXBElement<SelectionCriterionSet> createSelectionCriterionSet(SelectionCriterionSet value) {
        return new JAXBElement<SelectionCriterionSet>(_SelectionCriterionSet_QNAME, SelectionCriterionSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "BusinessPeriod")
    public JAXBElement<BusinessPeriod> createBusinessPeriod(BusinessPeriod value) {
        return new JAXBElement<BusinessPeriod>(_BusinessPeriod_QNAME, BusinessPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedObjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectedObjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "SelectedObjects")
    public JAXBElement<SelectedObjects> createSelectedObjects(SelectedObjects value) {
        return new JAXBElement<SelectedObjects>(_SelectedObjects_QNAME, SelectedObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Value", scope = XmlProp.class)
    public JAXBElement<Object> createXmlPropValue(Object value) {
        return new JAXBElement<Object>(_XmlPropValue_QNAME, Object.class, XmlProp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "AddDays", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodAddDays(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodAddDays_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "AddMonths", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodAddMonths(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodAddMonths_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "AddBusinessDays", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodAddBusinessDays(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodAddBusinessDays_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "HolidayCalendarGuid", scope = BusinessPeriod.class)
    public JAXBElement<String> createBusinessPeriodHolidayCalendarGuid(String value) {
        return new JAXBElement<String>(_BusinessPeriodHolidayCalendarGuid_QNAME, String.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "SetDayOfMonth", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodSetDayOfMonth(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodSetDayOfMonth_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "SetDayOfMonthMode", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodSetDayOfMonthMode(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodSetDayOfMonthMode_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "SetDayOfWeek", scope = BusinessPeriod.class)
    public JAXBElement<Long> createBusinessPeriodSetDayOfWeek(Long value) {
        return new JAXBElement<Long>(_BusinessPeriodSetDayOfWeek_QNAME, Long.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.radixware.schemas.common.UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.radixware.schemas.common.UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "CalcFunc", scope = BusinessPeriod.class)
    public JAXBElement<org.radixware.schemas.common.UserFunc> createBusinessPeriodCalcFunc(org.radixware.schemas.common.UserFunc value) {
        return new JAXBElement<org.radixware.schemas.common.UserFunc>(_BusinessPeriodCalcFunc_QNAME, org.radixware.schemas.common.UserFunc.class, BusinessPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Title", scope = com.tranzaxis.schemas.common_types.Attachment.class)
    public JAXBElement<String> createAttachmentTitle(String value) {
        return new JAXBElement<String>(_AttachmentTitle_QNAME, String.class, com.tranzaxis.schemas.common_types.Attachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Notes", scope = com.tranzaxis.schemas.common_types.Attachment.class)
    public JAXBElement<String> createAttachmentNotes(String value) {
        return new JAXBElement<String>(_AttachmentNotes_QNAME, String.class, com.tranzaxis.schemas.common_types.Attachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Content", scope = AttachmentPage.class)
    public JAXBElement<byte[]> createAttachmentPageContent(byte[] value) {
        return new JAXBElement<byte[]>(_AttachmentPageContent_QNAME, byte[].class, AttachmentPage.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "UserAttr", scope = AttachmentPage.class)
    public JAXBElement<ParamValues> createAttachmentPageUserAttr(ParamValues value) {
        return new JAXBElement<ParamValues>(_AttachmentPageUserAttr_QNAME, ParamValues.class, AttachmentPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Val", scope = ParamValue.class)
    public JAXBElement<String> createParamValueVal(String value) {
        return new JAXBElement<String>(_ParamValueVal_QNAME, String.class, ParamValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "XmlVal", scope = ParamValue.class)
    public JAXBElement<Object> createParamValueXmlVal(Object value) {
        return new JAXBElement<Object>(_ParamValueXmlVal_QNAME, Object.class, ParamValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "Value", scope = ParamDescription.class)
    public JAXBElement<String> createParamDescriptionValue(String value) {
        return new JAXBElement<String>(_XmlPropValue_QNAME, String.class, ParamDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/common-types.xsd", name = "InitialValue", scope = ParamDescription.class)
    public JAXBElement<String> createParamDescriptionInitialValue(String value) {
        return new JAXBElement<String>(_ParamDescriptionInitialValue_QNAME, String.class, ParamDescription.class, value);
    }

}
