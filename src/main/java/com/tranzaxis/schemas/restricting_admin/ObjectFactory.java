
package com.tranzaxis.schemas.restricting_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.Lexeme;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.ParamValues;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.restricting_admin package. 
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

    private final static QName _Restrictions_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Restrictions");
    private final static QName _Restriction_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Restriction");
    private final static QName _RestrictionToDelete_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ToDelete");
    private final static QName _RestrictionMode_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Mode");
    private final static QName _RestrictionClerkCanChange_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ClerkCanChange");
    private final static QName _RestrictionClerkUpperMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ClerkUpperMaxVal");
    private final static QName _RestrictionClientUpperMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ClientUpperMaxVal");
    private final static QName _RestrictionCreatedAsOverride_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "CreatedAsOverride");
    private final static QName _RestrictionRestrictedGuid_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "RestrictedGuid");
    private final static QName _RestrictionClientCanChange_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ClientCanChange");
    private final static QName _RestrictionTitle_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Title");
    private final static QName _RestrictionRid_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Rid");
    private final static QName _RestrictionInUse_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "InUse");
    private final static QName _RestrictionBegTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "BegTime");
    private final static QName _RestrictionEndTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "EndTime");
    private final static QName _RestrictionTmpOffBegTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "TmpOffBegTime");
    private final static QName _RestrictionTmpOffEndTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "TmpOffEndTime");
    private final static QName _RestrictionMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "MaxVal");
    private final static QName _RestrictionCcy_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Ccy");
    private final static QName _RestrictionTmpMaxVal_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "TmpMaxVal");
    private final static QName _RestrictionTmpMaxStartTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "TmpMaxStartTime");
    private final static QName _RestrictionTmpMaxFinishTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "TmpMaxFinishTime");
    private final static QName _RestrictionAccumulatorValue_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "AccumulatorValue");
    private final static QName _RestrictionCashbackCurrency_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "CashbackCurrency");
    private final static QName _RestrictionMaxCashbackAmount_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "MaxCashbackAmount");
    private final static QName _RestrictionResetPeriodType_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ResetPeriodType");
    private final static QName _RestrictionOwnership_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Ownership");
    private final static QName _RestrictionResetTime_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ResetTime");
    private final static QName _RestrictionDeclineCode_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "DeclineCode");
    private final static QName _RestrictionResetScheduleId_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ResetScheduleId");
    private final static QName _RestrictionResetScheduleRid_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ResetScheduleRid");
    private final static QName _RestrictionAccumulateCnt_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "AccumulateCnt");
    private final static QName _RestrictionNotes_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Notes");
    private final static QName _RestrictionCustomerDescription_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "CustomerDescription");
    private final static QName _RestrictionCustomerCanSee_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "CustomerCanSee");
    private final static QName _RestrictionSTIPMode_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "STIPMode");
    private final static QName _RestrictionOrderNum_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "OrderNum");
    private final static QName _RestrictionApproveSpecialCondition_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ApproveSpecialCondition");
    private final static QName _RestrictionExt_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Ext");
    private final static QName _RestrictionCondition_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "Condition");
    private final static QName _RestrictionMaxValAdjustFunc_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "MaxValAdjustFunc");
    private final static QName _RestrictionResetControlFunc_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "ResetControlFunc");
    private final static QName _RestrictionUserAttrs_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "UserAttrs");
    private final static QName _RestrictionAccumulatorPrevValues_QNAME = new QName("http://schemas.tranzaxis.com/restricting-admin.xsd", "AccumulatorPrevValues");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.restricting_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link Restrictions }
     * 
     */
    public Restrictions createRestrictions() {
        return new Restrictions();
    }

    /**
     * Create an instance of {@link Restriction.Condition }
     * 
     */
    public Restriction.Condition createRestrictionCondition() {
        return new Restriction.Condition();
    }

    /**
     * Create an instance of {@link Restriction.MaxValAdjustFunc }
     * 
     */
    public Restriction.MaxValAdjustFunc createRestrictionMaxValAdjustFunc() {
        return new Restriction.MaxValAdjustFunc();
    }

    /**
     * Create an instance of {@link Restriction.ResetControlFunc }
     * 
     */
    public Restriction.ResetControlFunc createRestrictionResetControlFunc() {
        return new Restriction.ResetControlFunc();
    }

    /**
     * Create an instance of {@link Restriction.AccumulatorPrevValues }
     * 
     */
    public Restriction.AccumulatorPrevValues createRestrictionAccumulatorPrevValues() {
        return new Restriction.AccumulatorPrevValues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restrictions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restrictions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Restrictions")
    public JAXBElement<Restrictions> createRestrictions(Restrictions value) {
        return new JAXBElement<Restrictions>(_Restrictions_QNAME, Restrictions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restriction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Restriction")
    public JAXBElement<Restriction> createRestriction(Restriction value) {
        return new JAXBElement<Restriction>(_Restriction_QNAME, Restriction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ToDelete", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionToDelete(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionToDelete_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListModifyMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListModifyMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Mode", scope = Restriction.class)
    public JAXBElement<ListModifyMode> createRestrictionMode(ListModifyMode value) {
        return new JAXBElement<ListModifyMode>(_RestrictionMode_QNAME, ListModifyMode.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ClerkCanChange", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionClerkCanChange(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionClerkCanChange_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ClerkUpperMaxVal", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionClerkUpperMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionClerkUpperMaxVal_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ClientUpperMaxVal", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionClientUpperMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionClientUpperMaxVal_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "CreatedAsOverride", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionCreatedAsOverride(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionCreatedAsOverride_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "RestrictedGuid", scope = Restriction.class)
    public JAXBElement<String> createRestrictionRestrictedGuid(String value) {
        return new JAXBElement<String>(_RestrictionRestrictedGuid_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ClientCanChange", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionClientCanChange(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionClientCanChange_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Title", scope = Restriction.class)
    public JAXBElement<String> createRestrictionTitle(String value) {
        return new JAXBElement<String>(_RestrictionTitle_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Rid", scope = Restriction.class)
    public JAXBElement<String> createRestrictionRid(String value) {
        return new JAXBElement<String>(_RestrictionRid_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "InUse", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionInUse(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionInUse_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "BegTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionBegTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionBegTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "EndTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionEndTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "TmpOffBegTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionTmpOffBegTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionTmpOffBegTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "TmpOffEndTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionTmpOffEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionTmpOffEndTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "MaxVal", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionMaxVal_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Ccy", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionCcy(Long value) {
        return new JAXBElement<Long>(_RestrictionCcy_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "TmpMaxVal", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionTmpMaxVal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionTmpMaxVal_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "TmpMaxStartTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionTmpMaxStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionTmpMaxStartTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "TmpMaxFinishTime", scope = Restriction.class)
    public JAXBElement<XMLGregorianCalendar> createRestrictionTmpMaxFinishTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionTmpMaxFinishTime_QNAME, XMLGregorianCalendar.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "AccumulatorValue", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionAccumulatorValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionAccumulatorValue_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "CashbackCurrency", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionCashbackCurrency(Long value) {
        return new JAXBElement<Long>(_RestrictionCashbackCurrency_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "MaxCashbackAmount", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionMaxCashbackAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionMaxCashbackAmount_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ResetPeriodType", scope = Restriction.class)
    public JAXBElement<String> createRestrictionResetPeriodType(String value) {
        return new JAXBElement<String>(_RestrictionResetPeriodType_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Ownership", scope = Restriction.class)
    public JAXBElement<String> createRestrictionOwnership(String value) {
        return new JAXBElement<String>(_RestrictionOwnership_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ResetTime", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionResetTime(Long value) {
        return new JAXBElement<Long>(_RestrictionResetTime_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "DeclineCode", scope = Restriction.class)
    public JAXBElement<String> createRestrictionDeclineCode(String value) {
        return new JAXBElement<String>(_RestrictionDeclineCode_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ResetScheduleId", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionResetScheduleId(Long value) {
        return new JAXBElement<Long>(_RestrictionResetScheduleId_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ResetScheduleRid", scope = Restriction.class)
    public JAXBElement<String> createRestrictionResetScheduleRid(String value) {
        return new JAXBElement<String>(_RestrictionResetScheduleRid_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "AccumulateCnt", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionAccumulateCnt(Long value) {
        return new JAXBElement<Long>(_RestrictionAccumulateCnt_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Notes", scope = Restriction.class)
    public JAXBElement<String> createRestrictionNotes(String value) {
        return new JAXBElement<String>(_RestrictionNotes_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "CustomerDescription", scope = Restriction.class)
    public JAXBElement<Lexeme> createRestrictionCustomerDescription(Lexeme value) {
        return new JAXBElement<Lexeme>(_RestrictionCustomerDescription_QNAME, Lexeme.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "CustomerCanSee", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionCustomerCanSee(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionCustomerCanSee_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "STIPMode", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionSTIPMode(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionSTIPMode_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "OrderNum", scope = Restriction.class)
    public JAXBElement<BigDecimal> createRestrictionOrderNum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RestrictionOrderNum_QNAME, BigDecimal.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ApproveSpecialCondition", scope = Restriction.class)
    public JAXBElement<String> createRestrictionApproveSpecialCondition(String value) {
        return new JAXBElement<String>(_RestrictionApproveSpecialCondition_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Ext", scope = Restriction.class)
    public JAXBElement<Object> createRestrictionExt(Object value) {
        return new JAXBElement<Object>(_RestrictionExt_QNAME, Object.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction.Condition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restriction.Condition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "Condition", scope = Restriction.class)
    public JAXBElement<Restriction.Condition> createRestrictionCondition(Restriction.Condition value) {
        return new JAXBElement<Restriction.Condition>(_RestrictionCondition_QNAME, Restriction.Condition.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction.MaxValAdjustFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restriction.MaxValAdjustFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "MaxValAdjustFunc", scope = Restriction.class)
    public JAXBElement<Restriction.MaxValAdjustFunc> createRestrictionMaxValAdjustFunc(Restriction.MaxValAdjustFunc value) {
        return new JAXBElement<Restriction.MaxValAdjustFunc>(_RestrictionMaxValAdjustFunc_QNAME, Restriction.MaxValAdjustFunc.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction.ResetControlFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restriction.ResetControlFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "ResetControlFunc", scope = Restriction.class)
    public JAXBElement<Restriction.ResetControlFunc> createRestrictionResetControlFunc(Restriction.ResetControlFunc value) {
        return new JAXBElement<Restriction.ResetControlFunc>(_RestrictionResetControlFunc_QNAME, Restriction.ResetControlFunc.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "UserAttrs", scope = Restriction.class)
    public JAXBElement<ParamValues> createRestrictionUserAttrs(ParamValues value) {
        return new JAXBElement<ParamValues>(_RestrictionUserAttrs_QNAME, ParamValues.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction.AccumulatorPrevValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restriction.AccumulatorPrevValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", name = "AccumulatorPrevValues", scope = Restriction.class)
    public JAXBElement<Restriction.AccumulatorPrevValues> createRestrictionAccumulatorPrevValues(Restriction.AccumulatorPrevValues value) {
        return new JAXBElement<Restriction.AccumulatorPrevValues>(_RestrictionAccumulatorPrevValues_QNAME, Restriction.AccumulatorPrevValues.class, Restriction.class, value);
    }

}
