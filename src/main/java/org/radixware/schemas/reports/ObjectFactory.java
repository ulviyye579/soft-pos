
package org.radixware.schemas.reports;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.reports package. 
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

    private final static QName _Band_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "Band");
    private final static QName _GetReportPubTreeRp_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "GetReportPubTreeRp");
    private final static QName _ParametersBinding_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ParametersBinding");
    private final static QName _ReportMsdl_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReportMsdl");
    private final static QName _UserReportListRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportListRs");
    private final static QName _UserReportListRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportListRq");
    private final static QName _UserReportVersionListRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportVersionListRs");
    private final static QName _UserReportVersionListRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportVersionListRq");
    private final static QName _UserReportCreateVersionRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportCreateVersionRs");
    private final static QName _UserReportHeaderListRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "UserReportHeaderListRs");
    private final static QName _ReadReportRuntimeRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReadReportRuntimeRq");
    private final static QName _ReadReportRuntimeRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReadReportRuntimeRs");
    private final static QName _DisableReportPubsRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "DisableReportPubsRq");
    private final static QName _DisableReportPubsRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "DisableReportPubsRs");
    private final static QName _LibUserFuncsListRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "LibUserFuncsListRs");
    private final static QName _LibUserFuncXmlRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "LibUserFuncXmlRq");
    private final static QName _ReportPreviewRq_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReportPreviewRq");
    private final static QName _ReportPreviewRs_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReportPreviewRs");
    private final static QName _ColumnSettings_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ColumnSettings");
    private final static QName _ReportColumnsList_QNAME = new QName("http://schemas.radixware.org/reports.xsd", "ReportColumnsList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.reports
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateReportRq }
     * 
     */
    public GenerateReportRq createGenerateReportRq() {
        return new GenerateReportRq();
    }

    /**
     * Create an instance of {@link CfgReportsPubsRp }
     * 
     */
    public CfgReportsPubsRp createCfgReportsPubsRp() {
        return new CfgReportsPubsRp();
    }

    /**
     * Create an instance of {@link ReportSchedule }
     * 
     */
    public ReportSchedule createReportSchedule() {
        return new ReportSchedule();
    }

    /**
     * Create an instance of {@link ReportPub }
     * 
     */
    public ReportPub createReportPub() {
        return new ReportPub();
    }

    /**
     * Create an instance of {@link ReportPub.Params }
     * 
     */
    public ReportPub.Params createReportPubParams() {
        return new ReportPub.Params();
    }

    /**
     * Create an instance of {@link ReportColumnsList }
     * 
     */
    public ReportColumnsList createReportColumnsList() {
        return new ReportColumnsList();
    }

    /**
     * Create an instance of {@link ReportColumnsList.Column }
     * 
     */
    public ReportColumnsList.Column createReportColumnsListColumn() {
        return new ReportColumnsList.Column();
    }

    /**
     * Create an instance of {@link LibUserFuncsListRs }
     * 
     */
    public LibUserFuncsListRs createLibUserFuncsListRs() {
        return new LibUserFuncsListRs();
    }

    /**
     * Create an instance of {@link DisableReportPubsRs }
     * 
     */
    public DisableReportPubsRs createDisableReportPubsRs() {
        return new DisableReportPubsRs();
    }

    /**
     * Create an instance of {@link UserReportHeaderListRs }
     * 
     */
    public UserReportHeaderListRs createUserReportHeaderListRs() {
        return new UserReportHeaderListRs();
    }

    /**
     * Create an instance of {@link UserReportHeaderListRs.Module }
     * 
     */
    public UserReportHeaderListRs.Module createUserReportHeaderListRsModule() {
        return new UserReportHeaderListRs.Module();
    }

    /**
     * Create an instance of {@link UserReportVersionListRs }
     * 
     */
    public UserReportVersionListRs createUserReportVersionListRs() {
        return new UserReportVersionListRs();
    }

    /**
     * Create an instance of {@link ReportMsdlType }
     * 
     */
    public ReportMsdlType createReportMsdlType() {
        return new ReportMsdlType();
    }

    /**
     * Create an instance of {@link ReportMsdlType.Band }
     * 
     */
    public ReportMsdlType.Band createReportMsdlTypeBand() {
        return new ReportMsdlType.Band();
    }

    /**
     * Create an instance of {@link ParametersBindingType }
     * 
     */
    public ParametersBindingType createParametersBindingType() {
        return new ParametersBindingType();
    }

    /**
     * Create an instance of {@link ParametersBindingType.ParameterBinding }
     * 
     */
    public ParametersBindingType.ParameterBinding createParametersBindingTypeParameterBinding() {
        return new ParametersBindingType.ParameterBinding();
    }

    /**
     * Create an instance of {@link ReportPubTopic }
     * 
     */
    public ReportPubTopic createReportPubTopic() {
        return new ReportPubTopic();
    }

    /**
     * Create an instance of {@link GenerateReportRq.FormatDirectories }
     * 
     */
    public GenerateReportRq.FormatDirectories createGenerateReportRqFormatDirectories() {
        return new GenerateReportRq.FormatDirectories();
    }

    /**
     * Create an instance of {@link BandType }
     * 
     */
    public BandType createBandType() {
        return new BandType();
    }

    /**
     * Create an instance of {@link GenerateReportRq.ExportFormats }
     * 
     */
    public GenerateReportRq.ExportFormats createGenerateReportRqExportFormats() {
        return new GenerateReportRq.ExportFormats();
    }

    /**
     * Create an instance of {@link GetReportPubTreeRq }
     * 
     */
    public GetReportPubTreeRq createGetReportPubTreeRq() {
        return new GetReportPubTreeRq();
    }

    /**
     * Create an instance of {@link ReportPubContext }
     * 
     */
    public ReportPubContext createReportPubContext() {
        return new ReportPubContext();
    }

    /**
     * Create an instance of {@link CfgReportsPubsRq }
     * 
     */
    public CfgReportsPubsRq createCfgReportsPubsRq() {
        return new CfgReportsPubsRq();
    }

    /**
     * Create an instance of {@link CfgReportsPubsRp.PubList }
     * 
     */
    public CfgReportsPubsRp.PubList createCfgReportsPubsRpPubList() {
        return new CfgReportsPubsRp.PubList();
    }

    /**
     * Create an instance of {@link org.radixware.schemas.reports.Report }
     * 
     */
    public org.radixware.schemas.reports.Report createReport() {
        return new org.radixware.schemas.reports.Report();
    }

    /**
     * Create an instance of {@link ReportSchedule.Transformation }
     * 
     */
    public ReportSchedule.Transformation createReportScheduleTransformation() {
        return new ReportSchedule.Transformation();
    }

    /**
     * Create an instance of {@link ColumnSettings }
     * 
     */
    public ColumnSettings createColumnSettings() {
        return new ColumnSettings();
    }

    /**
     * Create an instance of {@link UserReportListRs }
     * 
     */
    public UserReportListRs createUserReportListRs() {
        return new UserReportListRs();
    }

    /**
     * Create an instance of {@link UserReportListRq }
     * 
     */
    public UserReportListRq createUserReportListRq() {
        return new UserReportListRq();
    }

    /**
     * Create an instance of {@link UserReportVersionListRq }
     * 
     */
    public UserReportVersionListRq createUserReportVersionListRq() {
        return new UserReportVersionListRq();
    }

    /**
     * Create an instance of {@link UserReportCreateVersionRs }
     * 
     */
    public UserReportCreateVersionRs createUserReportCreateVersionRs() {
        return new UserReportCreateVersionRs();
    }

    /**
     * Create an instance of {@link ReadReportRuntimeRq }
     * 
     */
    public ReadReportRuntimeRq createReadReportRuntimeRq() {
        return new ReadReportRuntimeRq();
    }

    /**
     * Create an instance of {@link ReadReportRuntimeRs }
     * 
     */
    public ReadReportRuntimeRs createReadReportRuntimeRs() {
        return new ReadReportRuntimeRs();
    }

    /**
     * Create an instance of {@link DisableReportPubsRq }
     * 
     */
    public DisableReportPubsRq createDisableReportPubsRq() {
        return new DisableReportPubsRq();
    }

    /**
     * Create an instance of {@link LibUserFuncXmlRq }
     * 
     */
    public LibUserFuncXmlRq createLibUserFuncXmlRq() {
        return new LibUserFuncXmlRq();
    }

    /**
     * Create an instance of {@link ReportPreviewRq }
     * 
     */
    public ReportPreviewRq createReportPreviewRq() {
        return new ReportPreviewRq();
    }

    /**
     * Create an instance of {@link ReportPreviewRs }
     * 
     */
    public ReportPreviewRs createReportPreviewRs() {
        return new ReportPreviewRs();
    }

    /**
     * Create an instance of {@link UserReportHeader }
     * 
     */
    public UserReportHeader createUserReportHeader() {
        return new UserReportHeader();
    }

    /**
     * Create an instance of {@link ReportPub.Params.Param }
     * 
     */
    public ReportPub.Params.Param createReportPubParamsParam() {
        return new ReportPub.Params.Param();
    }

    /**
     * Create an instance of {@link ReportColumnsList.Column.Width }
     * 
     */
    public ReportColumnsList.Column.Width createReportColumnsListColumnWidth() {
        return new ReportColumnsList.Column.Width();
    }

    /**
     * Create an instance of {@link LibUserFuncsListRs.LibUserFunc }
     * 
     */
    public LibUserFuncsListRs.LibUserFunc createLibUserFuncsListRsLibUserFunc() {
        return new LibUserFuncsListRs.LibUserFunc();
    }

    /**
     * Create an instance of {@link DisableReportPubsRs.PubInfo }
     * 
     */
    public DisableReportPubsRs.PubInfo createDisableReportPubsRsPubInfo() {
        return new DisableReportPubsRs.PubInfo();
    }

    /**
     * Create an instance of {@link UserReportHeaderListRs.Module.Report }
     * 
     */
    public UserReportHeaderListRs.Module.Report createUserReportHeaderListRsModuleReport() {
        return new UserReportHeaderListRs.Module.Report();
    }

    /**
     * Create an instance of {@link UserReportVersionListRs.Version }
     * 
     */
    public UserReportVersionListRs.Version createUserReportVersionListRsVersion() {
        return new UserReportVersionListRs.Version();
    }

    /**
     * Create an instance of {@link ReportMsdlType.Band.Transformation }
     * 
     */
    public ReportMsdlType.Band.Transformation createReportMsdlTypeBandTransformation() {
        return new ReportMsdlType.Band.Transformation();
    }

    /**
     * Create an instance of {@link ParametersBindingType.ParameterBinding.ExternalValue }
     * 
     */
    public ParametersBindingType.ParameterBinding.ExternalValue createParametersBindingTypeParameterBindingExternalValue() {
        return new ParametersBindingType.ParameterBinding.ExternalValue();
    }

    /**
     * Create an instance of {@link ReportPubTopic.Topics }
     * 
     */
    public ReportPubTopic.Topics createReportPubTopicTopics() {
        return new ReportPubTopic.Topics();
    }

    /**
     * Create an instance of {@link ReportPubTopic.Pubs }
     * 
     */
    public ReportPubTopic.Pubs createReportPubTopicPubs() {
        return new ReportPubTopic.Pubs();
    }

    /**
     * Create an instance of {@link GenerateReportRq.FormatDirectories.FormatDirectory }
     * 
     */
    public GenerateReportRq.FormatDirectories.FormatDirectory createGenerateReportRqFormatDirectoriesFormatDirectory() {
        return new GenerateReportRq.FormatDirectories.FormatDirectory();
    }

    /**
     * Create an instance of {@link BandType.Cell }
     * 
     */
    public BandType.Cell createBandTypeCell() {
        return new BandType.Cell();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BandType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "Band")
    public JAXBElement<BandType> createBand(BandType value) {
        return new JAXBElement<BandType>(_Band_QNAME, BandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPubTopic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportPubTopic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "GetReportPubTreeRp")
    public JAXBElement<ReportPubTopic> createGetReportPubTreeRp(ReportPubTopic value) {
        return new JAXBElement<ReportPubTopic>(_GetReportPubTreeRp_QNAME, ReportPubTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersBindingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParametersBindingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ParametersBinding")
    public JAXBElement<ParametersBindingType> createParametersBinding(ParametersBindingType value) {
        return new JAXBElement<ParametersBindingType>(_ParametersBinding_QNAME, ParametersBindingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportMsdlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportMsdlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReportMsdl")
    public JAXBElement<ReportMsdlType> createReportMsdl(ReportMsdlType value) {
        return new JAXBElement<ReportMsdlType>(_ReportMsdl_QNAME, ReportMsdlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportListRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportListRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportListRs")
    public JAXBElement<UserReportListRs> createUserReportListRs(UserReportListRs value) {
        return new JAXBElement<UserReportListRs>(_UserReportListRs_QNAME, UserReportListRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportListRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportListRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportListRq")
    public JAXBElement<UserReportListRq> createUserReportListRq(UserReportListRq value) {
        return new JAXBElement<UserReportListRq>(_UserReportListRq_QNAME, UserReportListRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportVersionListRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportVersionListRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportVersionListRs")
    public JAXBElement<UserReportVersionListRs> createUserReportVersionListRs(UserReportVersionListRs value) {
        return new JAXBElement<UserReportVersionListRs>(_UserReportVersionListRs_QNAME, UserReportVersionListRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportVersionListRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportVersionListRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportVersionListRq")
    public JAXBElement<UserReportVersionListRq> createUserReportVersionListRq(UserReportVersionListRq value) {
        return new JAXBElement<UserReportVersionListRq>(_UserReportVersionListRq_QNAME, UserReportVersionListRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportCreateVersionRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportCreateVersionRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportCreateVersionRs")
    public JAXBElement<UserReportCreateVersionRs> createUserReportCreateVersionRs(UserReportCreateVersionRs value) {
        return new JAXBElement<UserReportCreateVersionRs>(_UserReportCreateVersionRs_QNAME, UserReportCreateVersionRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserReportHeaderListRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserReportHeaderListRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "UserReportHeaderListRs")
    public JAXBElement<UserReportHeaderListRs> createUserReportHeaderListRs(UserReportHeaderListRs value) {
        return new JAXBElement<UserReportHeaderListRs>(_UserReportHeaderListRs_QNAME, UserReportHeaderListRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadReportRuntimeRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadReportRuntimeRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReadReportRuntimeRq")
    public JAXBElement<ReadReportRuntimeRq> createReadReportRuntimeRq(ReadReportRuntimeRq value) {
        return new JAXBElement<ReadReportRuntimeRq>(_ReadReportRuntimeRq_QNAME, ReadReportRuntimeRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadReportRuntimeRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadReportRuntimeRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReadReportRuntimeRs")
    public JAXBElement<ReadReportRuntimeRs> createReadReportRuntimeRs(ReadReportRuntimeRs value) {
        return new JAXBElement<ReadReportRuntimeRs>(_ReadReportRuntimeRs_QNAME, ReadReportRuntimeRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableReportPubsRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisableReportPubsRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "DisableReportPubsRq")
    public JAXBElement<DisableReportPubsRq> createDisableReportPubsRq(DisableReportPubsRq value) {
        return new JAXBElement<DisableReportPubsRq>(_DisableReportPubsRq_QNAME, DisableReportPubsRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableReportPubsRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisableReportPubsRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "DisableReportPubsRs")
    public JAXBElement<DisableReportPubsRs> createDisableReportPubsRs(DisableReportPubsRs value) {
        return new JAXBElement<DisableReportPubsRs>(_DisableReportPubsRs_QNAME, DisableReportPubsRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibUserFuncsListRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibUserFuncsListRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "LibUserFuncsListRs")
    public JAXBElement<LibUserFuncsListRs> createLibUserFuncsListRs(LibUserFuncsListRs value) {
        return new JAXBElement<LibUserFuncsListRs>(_LibUserFuncsListRs_QNAME, LibUserFuncsListRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibUserFuncXmlRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibUserFuncXmlRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "LibUserFuncXmlRq")
    public JAXBElement<LibUserFuncXmlRq> createLibUserFuncXmlRq(LibUserFuncXmlRq value) {
        return new JAXBElement<LibUserFuncXmlRq>(_LibUserFuncXmlRq_QNAME, LibUserFuncXmlRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPreviewRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportPreviewRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReportPreviewRq")
    public JAXBElement<ReportPreviewRq> createReportPreviewRq(ReportPreviewRq value) {
        return new JAXBElement<ReportPreviewRq>(_ReportPreviewRq_QNAME, ReportPreviewRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPreviewRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportPreviewRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReportPreviewRs")
    public JAXBElement<ReportPreviewRs> createReportPreviewRs(ReportPreviewRs value) {
        return new JAXBElement<ReportPreviewRs>(_ReportPreviewRs_QNAME, ReportPreviewRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColumnSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColumnSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ColumnSettings")
    public JAXBElement<ColumnSettings> createColumnSettings(ColumnSettings value) {
        return new JAXBElement<ColumnSettings>(_ColumnSettings_QNAME, ColumnSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportColumnsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportColumnsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/reports.xsd", name = "ReportColumnsList")
    public JAXBElement<ReportColumnsList> createReportColumnsList(ReportColumnsList value) {
        return new JAXBElement<ReportColumnsList>(_ReportColumnsList_QNAME, ReportColumnsList.class, null, value);
    }

}
