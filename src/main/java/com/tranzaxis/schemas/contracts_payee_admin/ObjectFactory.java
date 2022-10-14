
package com.tranzaxis.schemas.contracts_payee_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tranzaxis.schemas.common_types.ArrStr;
import com.tranzaxis.schemas.common_types.InputFormat;
import com.tranzaxis.schemas.common_types.Lexeme;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_payee_admin package. 
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

    private final static QName _PayeeContractExt_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "PayeeContractExt");
    private final static QName _InvoiceSubscriptionContractExt_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "InvoiceSubscriptionContractExt");
    private final static QName _PayeeConsumerTitle_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Title");
    private final static QName _PayeeConsumerStatusTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "StatusTime");
    private final static QName _PaymentBillReasonCode_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "ReasonCode");
    private final static QName _PaymentBillReasonText_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "ReasonText");
    private final static QName _PaymentBillDescription_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Description");
    private final static QName _PaymentBillDueDate_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "DueDate");
    private final static QName _PaymentBillExpTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "ExpTime");
    private final static QName _PaymentBillPayedTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "PayedTime");
    private final static QName _PaymentBillLastTryTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "LastTryTime");
    private final static QName _PaymentVoucherCode1Title_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Code1Title");
    private final static QName _PaymentVoucherCode2_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Code2");
    private final static QName _PaymentVoucherCode2Title_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Code2Title");
    private final static QName _PaymentVoucherSoldTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "SoldTime");
    private final static QName _PayeeDirItemLogoImage_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "LogoImage");
    private final static QName _PayeeDirItemTopicId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "TopicId");
    private final static QName _PayeeDirItemTermTypes_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "TermTypes");
    private final static QName _PayeeDirItemBranchIds_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "BranchIds");
    private final static QName _PayeeDirItemBranchCodes_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "BranchCodes");
    private final static QName _PayeeDirItemBranchNames_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "BranchNames");
    private final static QName _PayeeGatePhase2InterfaceId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Phase2InterfaceId");
    private final static QName _PayeeGateOnlinePhases_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "OnlinePhases");
    private final static QName _PayeeGateInteractionKind_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "InteractionKind");
    private final static QName _PayeeParamInitVal_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "InitVal");
    private final static QName _PayeeParamGroupTitle_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "GroupTitle");
    private final static QName _PayeeParamInputFormat_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "InputFormat");
    private final static QName _PayeeContractExtDefaultInvoiceTypeId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "DefaultInvoiceTypeId");
    private final static QName _PayeeContractExtPartnerInstId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "PartnerInstId");
    private final static QName _PayeeContractExtPhase1InterfaceId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-payee-admin.xsd", "Phase1InterfaceId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_payee_admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BillPayers }
     * 
     */
    public BillPayers createBillPayers() {
        return new BillPayers();
    }

    /**
     * Create an instance of {@link BillItems }
     * 
     */
    public BillItems createBillItems() {
        return new BillItems();
    }

    /**
     * Create an instance of {@link PayeeContractExt }
     * 
     */
    public PayeeContractExt createPayeeContractExt() {
        return new PayeeContractExt();
    }

    /**
     * Create an instance of {@link InvoiceSubscriptionContractExt }
     * 
     */
    public InvoiceSubscriptionContractExt createInvoiceSubscriptionContractExt() {
        return new InvoiceSubscriptionContractExt();
    }

    /**
     * Create an instance of {@link ArrInt }
     * 
     */
    public ArrInt createArrInt() {
        return new ArrInt();
    }

    /**
     * Create an instance of {@link TermTypes }
     * 
     */
    public TermTypes createTermTypes() {
        return new TermTypes();
    }

    /**
     * Create an instance of {@link PayeeParam }
     * 
     */
    public PayeeParam createPayeeParam() {
        return new PayeeParam();
    }

    /**
     * Create an instance of {@link PayeeGate }
     * 
     */
    public PayeeGate createPayeeGate() {
        return new PayeeGate();
    }

    /**
     * Create an instance of {@link PayeeDirItem }
     * 
     */
    public PayeeDirItem createPayeeDirItem() {
        return new PayeeDirItem();
    }

    /**
     * Create an instance of {@link PaymentVoucher }
     * 
     */
    public PaymentVoucher createPaymentVoucher() {
        return new PaymentVoucher();
    }

    /**
     * Create an instance of {@link PaymentBill }
     * 
     */
    public PaymentBill createPaymentBill() {
        return new PaymentBill();
    }

    /**
     * Create an instance of {@link PayeeConsumer }
     * 
     */
    public PayeeConsumer createPayeeConsumer() {
        return new PayeeConsumer();
    }

    /**
     * Create an instance of {@link BillPayers.Payer }
     * 
     */
    public BillPayers.Payer createBillPayersPayer() {
        return new BillPayers.Payer();
    }

    /**
     * Create an instance of {@link BillItems.Item }
     * 
     */
    public BillItems.Item createBillItemsItem() {
        return new BillItems.Item();
    }

    /**
     * Create an instance of {@link PayeeContractExt.PayeeParams }
     * 
     */
    public PayeeContractExt.PayeeParams createPayeeContractExtPayeeParams() {
        return new PayeeContractExt.PayeeParams();
    }

    /**
     * Create an instance of {@link PayeeContractExt.PayeeGates }
     * 
     */
    public PayeeContractExt.PayeeGates createPayeeContractExtPayeeGates() {
        return new PayeeContractExt.PayeeGates();
    }

    /**
     * Create an instance of {@link PayeeContractExt.PayeeDirItems }
     * 
     */
    public PayeeContractExt.PayeeDirItems createPayeeContractExtPayeeDirItems() {
        return new PayeeContractExt.PayeeDirItems();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeContractExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayeeContractExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "PayeeContractExt")
    public JAXBElement<PayeeContractExt> createPayeeContractExt(PayeeContractExt value) {
        return new JAXBElement<PayeeContractExt>(_PayeeContractExt_QNAME, PayeeContractExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceSubscriptionContractExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceSubscriptionContractExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "InvoiceSubscriptionContractExt")
    public JAXBElement<InvoiceSubscriptionContractExt> createInvoiceSubscriptionContractExt(InvoiceSubscriptionContractExt value) {
        return new JAXBElement<InvoiceSubscriptionContractExt>(_InvoiceSubscriptionContractExt_QNAME, InvoiceSubscriptionContractExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Title", scope = PayeeConsumer.class)
    public JAXBElement<String> createPayeeConsumerTitle(String value) {
        return new JAXBElement<String>(_PayeeConsumerTitle_QNAME, String.class, PayeeConsumer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "StatusTime", scope = PayeeConsumer.class)
    public JAXBElement<XMLGregorianCalendar> createPayeeConsumerStatusTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PayeeConsumerStatusTime_QNAME, XMLGregorianCalendar.class, PayeeConsumer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "ReasonCode", scope = PaymentBill.class)
    public JAXBElement<String> createPaymentBillReasonCode(String value) {
        return new JAXBElement<String>(_PaymentBillReasonCode_QNAME, String.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "ReasonText", scope = PaymentBill.class)
    public JAXBElement<String> createPaymentBillReasonText(String value) {
        return new JAXBElement<String>(_PaymentBillReasonText_QNAME, String.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Title", scope = PaymentBill.class)
    public JAXBElement<String> createPaymentBillTitle(String value) {
        return new JAXBElement<String>(_PayeeConsumerTitle_QNAME, String.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Description", scope = PaymentBill.class)
    public JAXBElement<String> createPaymentBillDescription(String value) {
        return new JAXBElement<String>(_PaymentBillDescription_QNAME, String.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "DueDate", scope = PaymentBill.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentBillDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentBillDueDate_QNAME, XMLGregorianCalendar.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "ExpTime", scope = PaymentBill.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentBillExpTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentBillExpTime_QNAME, XMLGregorianCalendar.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "PayedTime", scope = PaymentBill.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentBillPayedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentBillPayedTime_QNAME, XMLGregorianCalendar.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "StatusTime", scope = PaymentBill.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentBillStatusTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PayeeConsumerStatusTime_QNAME, XMLGregorianCalendar.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "LastTryTime", scope = PaymentBill.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentBillLastTryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentBillLastTryTime_QNAME, XMLGregorianCalendar.class, PaymentBill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Code1Title", scope = PaymentVoucher.class)
    public JAXBElement<String> createPaymentVoucherCode1Title(String value) {
        return new JAXBElement<String>(_PaymentVoucherCode1Title_QNAME, String.class, PaymentVoucher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Code2", scope = PaymentVoucher.class)
    public JAXBElement<String> createPaymentVoucherCode2(String value) {
        return new JAXBElement<String>(_PaymentVoucherCode2_QNAME, String.class, PaymentVoucher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Code2Title", scope = PaymentVoucher.class)
    public JAXBElement<String> createPaymentVoucherCode2Title(String value) {
        return new JAXBElement<String>(_PaymentVoucherCode2Title_QNAME, String.class, PaymentVoucher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "SoldTime", scope = PaymentVoucher.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentVoucherSoldTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentVoucherSoldTime_QNAME, XMLGregorianCalendar.class, PaymentVoucher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "ExpTime", scope = PaymentVoucher.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentVoucherExpTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentBillExpTime_QNAME, XMLGregorianCalendar.class, PaymentVoucher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Description", scope = PayeeDirItem.class)
    public JAXBElement<Lexeme> createPayeeDirItemDescription(Lexeme value) {
        return new JAXBElement<Lexeme>(_PaymentBillDescription_QNAME, Lexeme.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "LogoImage", scope = PayeeDirItem.class)
    public JAXBElement<byte[]> createPayeeDirItemLogoImage(byte[] value) {
        return new JAXBElement<byte[]>(_PayeeDirItemLogoImage_QNAME, byte[].class, PayeeDirItem.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "TopicId", scope = PayeeDirItem.class)
    public JAXBElement<Long> createPayeeDirItemTopicId(Long value) {
        return new JAXBElement<Long>(_PayeeDirItemTopicId_QNAME, Long.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TermTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "TermTypes", scope = PayeeDirItem.class)
    public JAXBElement<TermTypes> createPayeeDirItemTermTypes(TermTypes value) {
        return new JAXBElement<TermTypes>(_PayeeDirItemTermTypes_QNAME, TermTypes.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "BranchIds", scope = PayeeDirItem.class)
    public JAXBElement<ArrInt> createPayeeDirItemBranchIds(ArrInt value) {
        return new JAXBElement<ArrInt>(_PayeeDirItemBranchIds_QNAME, ArrInt.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "BranchCodes", scope = PayeeDirItem.class)
    public JAXBElement<ArrInt> createPayeeDirItemBranchCodes(ArrInt value) {
        return new JAXBElement<ArrInt>(_PayeeDirItemBranchCodes_QNAME, ArrInt.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "BranchNames", scope = PayeeDirItem.class)
    public JAXBElement<ArrStr> createPayeeDirItemBranchNames(ArrStr value) {
        return new JAXBElement<ArrStr>(_PayeeDirItemBranchNames_QNAME, ArrStr.class, PayeeDirItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Phase2InterfaceId", scope = PayeeGate.class)
    public JAXBElement<Long> createPayeeGatePhase2InterfaceId(Long value) {
        return new JAXBElement<Long>(_PayeeGatePhase2InterfaceId_QNAME, Long.class, PayeeGate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "OnlinePhases", scope = PayeeGate.class)
    public JAXBElement<String> createPayeeGateOnlinePhases(String value) {
        return new JAXBElement<String>(_PayeeGateOnlinePhases_QNAME, String.class, PayeeGate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "InteractionKind", scope = PayeeGate.class)
    public JAXBElement<String> createPayeeGateInteractionKind(String value) {
        return new JAXBElement<String>(_PayeeGateInteractionKind_QNAME, String.class, PayeeGate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "InitVal", scope = PayeeParam.class)
    public JAXBElement<String> createPayeeParamInitVal(String value) {
        return new JAXBElement<String>(_PayeeParamInitVal_QNAME, String.class, PayeeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "GroupTitle", scope = PayeeParam.class)
    public JAXBElement<Lexeme> createPayeeParamGroupTitle(Lexeme value) {
        return new JAXBElement<Lexeme>(_PayeeParamGroupTitle_QNAME, Lexeme.class, PayeeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Description", scope = PayeeParam.class)
    public JAXBElement<Lexeme> createPayeeParamDescription(Lexeme value) {
        return new JAXBElement<Lexeme>(_PaymentBillDescription_QNAME, Lexeme.class, PayeeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "InputFormat", scope = PayeeParam.class)
    public JAXBElement<InputFormat> createPayeeParamInputFormat(InputFormat value) {
        return new JAXBElement<InputFormat>(_PayeeParamInputFormat_QNAME, InputFormat.class, PayeeParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "DefaultInvoiceTypeId", scope = PayeeContractExt.class)
    public JAXBElement<Long> createPayeeContractExtDefaultInvoiceTypeId(Long value) {
        return new JAXBElement<Long>(_PayeeContractExtDefaultInvoiceTypeId_QNAME, Long.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Code1Title", scope = PayeeContractExt.class)
    public JAXBElement<String> createPayeeContractExtCode1Title(String value) {
        return new JAXBElement<String>(_PaymentVoucherCode1Title_QNAME, String.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Code2Title", scope = PayeeContractExt.class)
    public JAXBElement<String> createPayeeContractExtCode2Title(String value) {
        return new JAXBElement<String>(_PaymentVoucherCode2Title_QNAME, String.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "InteractionKind", scope = PayeeContractExt.class)
    public JAXBElement<String> createPayeeContractExtInteractionKind(String value) {
        return new JAXBElement<String>(_PayeeGateInteractionKind_QNAME, String.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "OnlinePhases", scope = PayeeContractExt.class)
    public JAXBElement<String> createPayeeContractExtOnlinePhases(String value) {
        return new JAXBElement<String>(_PayeeGateOnlinePhases_QNAME, String.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "PartnerInstId", scope = PayeeContractExt.class)
    public JAXBElement<Long> createPayeeContractExtPartnerInstId(Long value) {
        return new JAXBElement<Long>(_PayeeContractExtPartnerInstId_QNAME, Long.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Phase1InterfaceId", scope = PayeeContractExt.class)
    public JAXBElement<Long> createPayeeContractExtPhase1InterfaceId(Long value) {
        return new JAXBElement<Long>(_PayeeContractExtPhase1InterfaceId_QNAME, Long.class, PayeeContractExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", name = "Phase2InterfaceId", scope = PayeeContractExt.class)
    public JAXBElement<Long> createPayeeContractExtPhase2InterfaceId(Long value) {
        return new JAXBElement<Long>(_PayeeGatePhase2InterfaceId_QNAME, Long.class, PayeeContractExt.class, value);
    }

}
