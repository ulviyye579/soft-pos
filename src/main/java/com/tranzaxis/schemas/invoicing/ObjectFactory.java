
package com.tranzaxis.schemas.invoicing;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.invoicing package. 
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

    private final static QName _Invoice_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Invoice");
    private final static QName _InvoiceStatus_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Status");
    private final static QName _InvoicePrevStatus_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PrevStatus");
    private final static QName _InvoiceStatusReasonCode_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "StatusReasonCode");
    private final static QName _InvoiceStatusReasonText_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "StatusReasonText");
    private final static QName _InvoiceStatusReasonDescription_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "StatusReasonDescription");
    private final static QName _InvoicePayOperType_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PayOperType");
    private final static QName _InvoiceActionTime_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ActionTime");
    private final static QName _InvoiceDueDate_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "DueDate");
    private final static QName _InvoiceExpTime_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ExpTime");
    private final static QName _InvoiceTryNumber_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "TryNumber");
    private final static QName _InvoiceTitle_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Title");
    private final static QName _InvoiceDescription_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Description");
    private final static QName _InvoiceCallbackUrl_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "CallbackUrl");
    private final static QName _InvoiceCallbackInterfaceId_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "CallbackInterfaceId");
    private final static QName _InvoiceRidByTrx_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByTrx");
    private final static QName _InvoiceTemplateOwnerId_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "TemplateOwnerId");
    private final static QName _InvoiceRidByPayer_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByPayer");
    private final static QName _InvoiceRidByPayee_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByPayee");
    private final static QName _InvoiceRidByPayeeCheckVal_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByPayeeCheckVal");
    private final static QName _InvoiceRidByPayeeKind_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByPayeeKind");
    private final static QName _InvoiceRidByCallbackInterface_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RidByCallbackInterface");
    private final static QName _InvoiceDestinationContractId_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ContractId");
    private final static QName _InvoiceDestinationExtCardId_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ExtCardId");
    private final static QName _InvoiceDestinationExtCardPan_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ExtCardPan");
    private final static QName _InvoiceDestinationExtCardExp_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ExtCardExp");
    private final static QName _InvoiceDestinationAgentBic_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "AgentBic");
    private final static QName _InvoiceDestinationAgentRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "AgentRid");
    private final static QName _InvoiceDestinationAgentName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "AgentName");
    private final static QName _InvoiceDestinationPartySortCode_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartySortCode");
    private final static QName _InvoiceDestinationPartyAcctNum_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyAcctNum");
    private final static QName _InvoiceDestinationPartyAcctName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyAcctName");
    private final static QName _InvoiceDestinationPartyFundsCategory_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyFundsCategory");
    private final static QName _InvoiceDestinationPartyRidKind_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyRidKind");
    private final static QName _InvoiceDestinationPartyRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyRid");
    private final static QName _InvoiceDestinationPartyName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyName");
    private final static QName _InvoiceDestinationPartyLegalName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyLegalName");
    private final static QName _InvoiceDestinationPartyAddress_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyAddress");
    private final static QName _InvoiceDestinationPartyDoc_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyDoc");
    private final static QName _InvoiceDestinationPartyDocKind_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyDocKind");
    private final static QName _InvoiceDestinationPartyTaxNum_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyTaxNum");
    private final static QName _InvoiceDestinationPartyPam_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyPam");
    private final static QName _InvoiceDestinationPartyFirstName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyFirstName");
    private final static QName _InvoiceDestinationPartyMiddleName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyMiddleName");
    private final static QName _InvoiceDestinationPartyLastName_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyLastName");
    private final static QName _InvoiceDestinationPartyDayOfBirth_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyDayOfBirth");
    private final static QName _InvoiceDestinationPartyCountry_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyCountry");
    private final static QName _InvoiceDestinationPartyRegion_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyRegion");
    private final static QName _InvoiceDestinationPartyCity_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyCity");
    private final static QName _InvoiceDestinationPartyZip_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyZip");
    private final static QName _InvoiceDestinationPartyPhone_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyPhone");
    private final static QName _InvoiceSourcePartyId_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyId");
    private final static QName _InvoiceSourcePartyLegalRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PartyLegalRid");
    private final static QName _InvoiceParamsPaymentTemplateRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PaymentTemplateRid");
    private final static QName _InvoiceParamsReferenceInfo_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ReferenceInfo");
    private final static QName _InvoiceParamsRemittanceInfo_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RemittanceInfo");
    private final static QName _InvoiceParamsControlVal_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ControlVal");
    private final static QName _InvoiceParamsRqToPayRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "RqToPayRid");
    private final static QName _InvoiceParamsTimestamp_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Timestamp");
    private final static QName _InvoiceParamsNetSettleDay_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "NetSettleDay");
    private final static QName _InvoiceParamsClaimReason_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ClaimReason");
    private final static QName _InvoiceParamsClaimRid_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "ClaimRid");
    private final static QName _InvoiceParamsMcc_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Mcc");
    private final static QName _InvoiceParamsPayerRiskIndicator_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PayerRiskIndicator");
    private final static QName _InvoiceParamsPayeeRiskIndicator_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PayeeRiskIndicator");
    private final static QName _InvoiceParamsNetworkRiskIndicator_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "NetworkRiskIndicator");
    private final static QName _InvoiceValueSalesTaxAmt_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "SalesTaxAmt");
    private final static QName _InvoiceValueDiscount_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "Discount");
    private final static QName _InvoiceValueSrcSurchargeAmt_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "SrcSurchargeAmt");
    private final static QName _InvoiceValueDstSurchargeAmt_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "DstSurchargeAmt");
    private final static QName _InvoiceValueAuthAmt_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "AuthAmt");
    private final static QName _InvoiceValuePaidAmt_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PaidAmt");
    private final static QName _InvoiceValuePaidTime_QNAME = new QName("http://schemas.tranzaxis.com/invoicing.xsd", "PaidTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.invoicing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link InvoicePayerId }
     * 
     */
    public InvoicePayerId createInvoicePayerId() {
        return new InvoicePayerId();
    }

    /**
     * Create an instance of {@link AdminInvoice }
     * 
     */
    public AdminInvoice createAdminInvoice() {
        return new AdminInvoice();
    }

    /**
     * Create an instance of {@link Invoice.Value }
     * 
     */
    public Invoice.Value createInvoiceValue() {
        return new Invoice.Value();
    }

    /**
     * Create an instance of {@link Invoice.Params }
     * 
     */
    public Invoice.Params createInvoiceParams() {
        return new Invoice.Params();
    }

    /**
     * Create an instance of {@link Invoice.Source }
     * 
     */
    public Invoice.Source createInvoiceSource() {
        return new Invoice.Source();
    }

    /**
     * Create an instance of {@link Invoice.Destination }
     * 
     */
    public Invoice.Destination createInvoiceDestination() {
        return new Invoice.Destination();
    }

    /**
     * Create an instance of {@link Invoice.Link }
     * 
     */
    public Invoice.Link createInvoiceLink() {
        return new Invoice.Link();
    }

    /**
     * Create an instance of {@link Invoice.Items }
     * 
     */
    public Invoice.Items createInvoiceItems() {
        return new Invoice.Items();
    }

    /**
     * Create an instance of {@link Invoice.PayerIds }
     * 
     */
    public Invoice.PayerIds createInvoicePayerIds() {
        return new Invoice.PayerIds();
    }

    /**
     * Create an instance of {@link Invoice.QrcOper }
     * 
     */
    public Invoice.QrcOper createInvoiceQrcOper() {
        return new Invoice.QrcOper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Invoice")
    public JAXBElement<Invoice> createInvoice(Invoice value) {
        return new JAXBElement<Invoice>(_Invoice_QNAME, Invoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Status", scope = Invoice.class)
    public JAXBElement<String> createInvoiceStatus(String value) {
        return new JAXBElement<String>(_InvoiceStatus_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PrevStatus", scope = Invoice.class)
    public JAXBElement<String> createInvoicePrevStatus(String value) {
        return new JAXBElement<String>(_InvoicePrevStatus_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "StatusReasonCode", scope = Invoice.class)
    public JAXBElement<String> createInvoiceStatusReasonCode(String value) {
        return new JAXBElement<String>(_InvoiceStatusReasonCode_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "StatusReasonText", scope = Invoice.class)
    public JAXBElement<String> createInvoiceStatusReasonText(String value) {
        return new JAXBElement<String>(_InvoiceStatusReasonText_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "StatusReasonDescription", scope = Invoice.class)
    public JAXBElement<String> createInvoiceStatusReasonDescription(String value) {
        return new JAXBElement<String>(_InvoiceStatusReasonDescription_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PayOperType", scope = Invoice.class)
    public JAXBElement<String> createInvoicePayOperType(String value) {
        return new JAXBElement<String>(_InvoicePayOperType_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ActionTime", scope = Invoice.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceActionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceActionTime_QNAME, XMLGregorianCalendar.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "DueDate", scope = Invoice.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDueDate_QNAME, XMLGregorianCalendar.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExpTime", scope = Invoice.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceExpTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceExpTime_QNAME, XMLGregorianCalendar.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "TryNumber", scope = Invoice.class)
    public JAXBElement<Long> createInvoiceTryNumber(Long value) {
        return new JAXBElement<Long>(_InvoiceTryNumber_QNAME, Long.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Title", scope = Invoice.class)
    public JAXBElement<String> createInvoiceTitle(String value) {
        return new JAXBElement<String>(_InvoiceTitle_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Description", scope = Invoice.class)
    public JAXBElement<String> createInvoiceDescription(String value) {
        return new JAXBElement<String>(_InvoiceDescription_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "CallbackUrl", scope = Invoice.class)
    public JAXBElement<String> createInvoiceCallbackUrl(String value) {
        return new JAXBElement<String>(_InvoiceCallbackUrl_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "CallbackInterfaceId", scope = Invoice.class)
    public JAXBElement<Long> createInvoiceCallbackInterfaceId(Long value) {
        return new JAXBElement<Long>(_InvoiceCallbackInterfaceId_QNAME, Long.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByTrx", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByTrx(String value) {
        return new JAXBElement<String>(_InvoiceRidByTrx_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "TemplateOwnerId", scope = Invoice.class)
    public JAXBElement<Long> createInvoiceTemplateOwnerId(Long value) {
        return new JAXBElement<Long>(_InvoiceTemplateOwnerId_QNAME, Long.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByPayer", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByPayer(String value) {
        return new JAXBElement<String>(_InvoiceRidByPayer_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByPayee", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByPayee(String value) {
        return new JAXBElement<String>(_InvoiceRidByPayee_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByPayeeCheckVal", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByPayeeCheckVal(String value) {
        return new JAXBElement<String>(_InvoiceRidByPayeeCheckVal_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByPayeeKind", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByPayeeKind(String value) {
        return new JAXBElement<String>(_InvoiceRidByPayeeKind_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RidByCallbackInterface", scope = Invoice.class)
    public JAXBElement<String> createInvoiceRidByCallbackInterface(String value) {
        return new JAXBElement<String>(_InvoiceRidByCallbackInterface_QNAME, String.class, Invoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ContractId", scope = Invoice.Destination.class)
    public JAXBElement<Long> createInvoiceDestinationContractId(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationContractId_QNAME, Long.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardId", scope = Invoice.Destination.class)
    public JAXBElement<Long> createInvoiceDestinationExtCardId(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationExtCardId_QNAME, Long.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardPan", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationExtCardPan(String value) {
        return new JAXBElement<String>(_InvoiceDestinationExtCardPan_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardExp", scope = Invoice.Destination.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceDestinationExtCardExp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDestinationExtCardExp_QNAME, XMLGregorianCalendar.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentBic", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationAgentBic(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentBic_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentRid", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationAgentRid(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentRid_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationAgentName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartySortCode", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartySortCode(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartySortCode_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAcctNum", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyAcctNum(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAcctNum_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAcctName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyAcctName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAcctName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyFundsCategory", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyFundsCategory(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyFundsCategory_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRidKind", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyRidKind(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRidKind_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRid", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyRid(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRid_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyLegalName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyLegalName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyLegalName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAddress", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyAddress(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAddress_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDoc", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyDoc(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyDoc_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDocKind", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyDocKind(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyDocKind_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyTaxNum", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyTaxNum(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyTaxNum_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyPam", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyPam(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyPam_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyFirstName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyFirstName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyFirstName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyMiddleName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyMiddleName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyMiddleName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyLastName", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyLastName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyLastName_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDayOfBirth", scope = Invoice.Destination.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceDestinationPartyDayOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDestinationPartyDayOfBirth_QNAME, XMLGregorianCalendar.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyCountry", scope = Invoice.Destination.class)
    public JAXBElement<Long> createInvoiceDestinationPartyCountry(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationPartyCountry_QNAME, Long.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRegion", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyRegion(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRegion_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyCity", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyCity(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyCity_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyZip", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyZip(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyZip_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyPhone", scope = Invoice.Destination.class)
    public JAXBElement<String> createInvoiceDestinationPartyPhone(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyPhone_QNAME, String.class, Invoice.Destination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ContractId", scope = Invoice.Source.class)
    public JAXBElement<Long> createInvoiceSourceContractId(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationContractId_QNAME, Long.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardId", scope = Invoice.Source.class)
    public JAXBElement<Long> createInvoiceSourceExtCardId(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationExtCardId_QNAME, Long.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardPan", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourceExtCardPan(String value) {
        return new JAXBElement<String>(_InvoiceDestinationExtCardPan_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ExtCardExp", scope = Invoice.Source.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceSourceExtCardExp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDestinationExtCardExp_QNAME, XMLGregorianCalendar.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentBic", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourceAgentBic(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentBic_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentRid", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourceAgentRid(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentRid_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AgentName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourceAgentName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationAgentName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyId", scope = Invoice.Source.class)
    public JAXBElement<Long> createInvoiceSourcePartyId(Long value) {
        return new JAXBElement<Long>(_InvoiceSourcePartyId_QNAME, Long.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartySortCode", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartySortCode(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartySortCode_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAcctName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyAcctName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAcctName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAcctNum", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyAcctNum(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAcctNum_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyFundsCategory", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyFundsCategory(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyFundsCategory_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRidKind", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyRidKind(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRidKind_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRid", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyRid(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRid_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyLegalName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyLegalName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyLegalName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyLegalRid", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyLegalRid(String value) {
        return new JAXBElement<String>(_InvoiceSourcePartyLegalRid_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyAddress", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyAddress(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyAddress_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDoc", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyDoc(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyDoc_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDocKind", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyDocKind(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyDocKind_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyTaxNum", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyTaxNum(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyTaxNum_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyPam", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyPam(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyPam_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyFirstName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyFirstName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyFirstName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyMiddleName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyMiddleName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyMiddleName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyLastName", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyLastName(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyLastName_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyDayOfBirth", scope = Invoice.Source.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceSourcePartyDayOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDestinationPartyDayOfBirth_QNAME, XMLGregorianCalendar.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyCountry", scope = Invoice.Source.class)
    public JAXBElement<Long> createInvoiceSourcePartyCountry(Long value) {
        return new JAXBElement<Long>(_InvoiceDestinationPartyCountry_QNAME, Long.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyRegion", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyRegion(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyRegion_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyCity", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyCity(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyCity_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyZip", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyZip(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyZip_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PartyPhone", scope = Invoice.Source.class)
    public JAXBElement<String> createInvoiceSourcePartyPhone(String value) {
        return new JAXBElement<String>(_InvoiceDestinationPartyPhone_QNAME, String.class, Invoice.Source.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PaymentTemplateRid", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsPaymentTemplateRid(String value) {
        return new JAXBElement<String>(_InvoiceParamsPaymentTemplateRid_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ReferenceInfo", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsReferenceInfo(String value) {
        return new JAXBElement<String>(_InvoiceParamsReferenceInfo_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RemittanceInfo", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsRemittanceInfo(String value) {
        return new JAXBElement<String>(_InvoiceParamsRemittanceInfo_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ControlVal", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsControlVal(String value) {
        return new JAXBElement<String>(_InvoiceParamsControlVal_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "RqToPayRid", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsRqToPayRid(String value) {
        return new JAXBElement<String>(_InvoiceParamsRqToPayRid_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Timestamp", scope = Invoice.Params.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceParamsTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceParamsTimestamp_QNAME, XMLGregorianCalendar.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "NetSettleDay", scope = Invoice.Params.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceParamsNetSettleDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceParamsNetSettleDay_QNAME, XMLGregorianCalendar.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ClaimReason", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsClaimReason(String value) {
        return new JAXBElement<String>(_InvoiceParamsClaimReason_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "ClaimRid", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsClaimRid(String value) {
        return new JAXBElement<String>(_InvoiceParamsClaimRid_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Mcc", scope = Invoice.Params.class)
    public JAXBElement<Long> createInvoiceParamsMcc(Long value) {
        return new JAXBElement<Long>(_InvoiceParamsMcc_QNAME, Long.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PayerRiskIndicator", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsPayerRiskIndicator(String value) {
        return new JAXBElement<String>(_InvoiceParamsPayerRiskIndicator_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PayeeRiskIndicator", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsPayeeRiskIndicator(String value) {
        return new JAXBElement<String>(_InvoiceParamsPayeeRiskIndicator_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "NetworkRiskIndicator", scope = Invoice.Params.class)
    public JAXBElement<String> createInvoiceParamsNetworkRiskIndicator(String value) {
        return new JAXBElement<String>(_InvoiceParamsNetworkRiskIndicator_QNAME, String.class, Invoice.Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "SalesTaxAmt", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValueSalesTaxAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValueSalesTaxAmt_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "Discount", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValueDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValueDiscount_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "SrcSurchargeAmt", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValueSrcSurchargeAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValueSrcSurchargeAmt_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "DstSurchargeAmt", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValueDstSurchargeAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValueDstSurchargeAmt_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "AuthAmt", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValueAuthAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValueAuthAmt_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PaidAmt", scope = Invoice.Value.class)
    public JAXBElement<BigDecimal> createInvoiceValuePaidAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceValuePaidAmt_QNAME, BigDecimal.class, Invoice.Value.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/invoicing.xsd", name = "PaidTime", scope = Invoice.Value.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceValuePaidTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceValuePaidTime_QNAME, XMLGregorianCalendar.class, Invoice.Value.class, value);
    }

}
