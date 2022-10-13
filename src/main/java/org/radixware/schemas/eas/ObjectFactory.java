
package org.radixware.schemas.eas;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.eas package. 
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

    private final static QName _PasswordRequirements_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "PasswordRequirements");
    private final static QName _DeleteCascadeConfirmations_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "DeleteCascadeConfirmations");
    private final static QName _SessionVariableValue_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Value");
    private final static QName _SetParentRqParentTitleProperty_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ParentTitleProperty");
    private final static QName _SetParentRqPID_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "PID");
    private final static QName _SetParentRqClass_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Class");
    private final static QName _SetParentRqSrcPID_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "SrcPID");
    private final static QName _SetParentRqCurrentData_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "CurrentData");
    private final static QName _SetParentRqEditorPresentation_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "EditorPresentation");
    private final static QName _SetParentRqSelectorPresentation_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "SelectorPresentation");
    private final static QName _SetParentRqRespWithLOBValues_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "RespWithLOBValues");
    private final static QName _SetParentRqForm_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Form");
    private final static QName _SetParentRqReport_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Report");
    private final static QName _ListEdPresVisibleExpItemsRqContext_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Context");
    private final static QName _ListEdPresVisibleExpItemsRqPresentation_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Presentation");
    private final static QName _DeleteRejectionsRejectionDeleteCascadeRestriction_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "DeleteCascadeRestriction");
    private final static QName _PropertyBin_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Bin");
    private final static QName _PropertyBool_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Bool");
    private final static QName _PropertyStr_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Str");
    private final static QName _PropertyDateTime_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "DateTime");
    private final static QName _PropertyInt_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Int");
    private final static QName _PropertyNum_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Num");
    private final static QName _PropertyXml_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Xml");
    private final static QName _PropertyRef_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Ref");
    private final static QName _PropertyObj_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "Obj");
    private final static QName _PropertyArrBin_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrBin");
    private final static QName _PropertyArrBool_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrBool");
    private final static QName _PropertyArrStr_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrStr");
    private final static QName _PropertyArrDateTime_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrDateTime");
    private final static QName _PropertyArrInt_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrInt");
    private final static QName _PropertyArrNum_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrNum");
    private final static QName _PropertyArrRef_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "ArrRef");
    private final static QName _PropertyInheritableValue_QNAME = new QName("http://schemas.radixware.org/eas.xsd", "InheritableValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.eas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DialogButtonsList }
     * 
     */
    public DialogButtonsList createDialogButtonsList() {
        return new DialogButtonsList();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRs }
     * 
     */
    public GetObjectTitlesRs createGetObjectTitlesRs() {
        return new GetObjectTitlesRs();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRs.ObjectTitles }
     * 
     */
    public GetObjectTitlesRs.ObjectTitles createGetObjectTitlesRsObjectTitles() {
        return new GetObjectTitlesRs.ObjectTitles();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRq }
     * 
     */
    public GetObjectTitlesRq createGetObjectTitlesRq() {
        return new GetObjectTitlesRq();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRq.Objects }
     * 
     */
    public GetObjectTitlesRq.Objects createGetObjectTitlesRqObjects() {
        return new GetObjectTitlesRq.Objects();
    }

    /**
     * Create an instance of {@link CommandRq }
     * 
     */
    public CommandRq createCommandRq() {
        return new CommandRq();
    }

    /**
     * Create an instance of {@link PrepareCreateRq }
     * 
     */
    public PrepareCreateRq createPrepareCreateRq() {
        return new PrepareCreateRq();
    }

    /**
     * Create an instance of {@link SetParentRq }
     * 
     */
    public SetParentRq createSetParentRq() {
        return new SetParentRq();
    }

    /**
     * Create an instance of {@link EditorPages }
     * 
     */
    public EditorPages createEditorPages() {
        return new EditorPages();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link ReadRq }
     * 
     */
    public ReadRq createReadRq() {
        return new ReadRq();
    }

    /**
     * Create an instance of {@link ListVisibleExplorerItemsRs }
     * 
     */
    public ListVisibleExplorerItemsRs createListVisibleExplorerItemsRs() {
        return new ListVisibleExplorerItemsRs();
    }

    /**
     * Create an instance of {@link ReadManifestRs }
     * 
     */
    public ReadManifestRs createReadManifestRs() {
        return new ReadManifestRs();
    }

    /**
     * Create an instance of {@link ReadManifestRs.SAPs }
     * 
     */
    public ReadManifestRs.SAPs createReadManifestRsSAPs() {
        return new ReadManifestRs.SAPs();
    }

    /**
     * Create an instance of {@link LoginRq }
     * 
     */
    public LoginRq createLoginRq() {
        return new LoginRq();
    }

    /**
     * Create an instance of {@link CreateSessionRs }
     * 
     */
    public CreateSessionRs createCreateSessionRs() {
        return new CreateSessionRs();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ServerResources }
     * 
     */
    public CreateSessionRs.ServerResources createCreateSessionRsServerResources() {
        return new CreateSessionRs.ServerResources();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ExplorerRoots }
     * 
     */
    public CreateSessionRs.ExplorerRoots createCreateSessionRsExplorerRoots() {
        return new CreateSessionRs.ExplorerRoots();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ExplorerRoots.Item }
     * 
     */
    public CreateSessionRs.ExplorerRoots.Item createCreateSessionRsExplorerRootsItem() {
        return new CreateSessionRs.ExplorerRoots.Item();
    }

    /**
     * Create an instance of {@link CreateSessionRq }
     * 
     */
    public CreateSessionRq createCreateSessionRq() {
        return new CreateSessionRq();
    }

    /**
     * Create an instance of {@link DynamicList }
     * 
     */
    public DynamicList createDynamicList() {
        return new DynamicList();
    }

    /**
     * Create an instance of {@link AggregateFunctions }
     * 
     */
    public AggregateFunctions createAggregateFunctions() {
        return new AggregateFunctions();
    }

    /**
     * Create an instance of {@link DeleteRejections }
     * 
     */
    public DeleteRejections createDeleteRejections() {
        return new DeleteRejections();
    }

    /**
     * Create an instance of {@link HierarchicalSelection }
     * 
     */
    public HierarchicalSelection createHierarchicalSelection() {
        return new HierarchicalSelection();
    }

    /**
     * Create an instance of {@link Actions }
     * 
     */
    public Actions createActions() {
        return new Actions();
    }

    /**
     * Create an instance of {@link Trace }
     * 
     */
    public Trace createTrace() {
        return new Trace();
    }

    /**
     * Create an instance of {@link NextDialogRequest }
     * 
     */
    public NextDialogRequest createNextDialogRequest() {
        return new NextDialogRequest();
    }

    /**
     * Create an instance of {@link Sorting }
     * 
     */
    public Sorting createSorting() {
        return new Sorting();
    }

    /**
     * Create an instance of {@link Sorting.AdditionalSortingColumns }
     * 
     */
    public Sorting.AdditionalSortingColumns createSortingAdditionalSortingColumns() {
        return new Sorting.AdditionalSortingColumns();
    }

    /**
     * Create an instance of {@link ClassFilters }
     * 
     */
    public ClassFilters createClassFilters() {
        return new ClassFilters();
    }

    /**
     * Create an instance of {@link InstantiatableClasses }
     * 
     */
    public InstantiatableClasses createInstantiatableClasses() {
        return new InstantiatableClasses();
    }

    /**
     * Create an instance of {@link ObjectList }
     * 
     */
    public ObjectList createObjectList() {
        return new ObjectList();
    }

    /**
     * Create an instance of {@link ObjectList.Rows }
     * 
     */
    public ObjectList.Rows createObjectListRows() {
        return new ObjectList.Rows();
    }

    /**
     * Create an instance of {@link ObjectList.Rows.Item }
     * 
     */
    public ObjectList.Rows.Item createObjectListRowsItem() {
        return new ObjectList.Rows.Item();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link Context.TreePath }
     * 
     */
    public Context.TreePath createContextTreePath() {
        return new Context.TreePath();
    }

    /**
     * Create an instance of {@link Context.TreePath.FilterList }
     * 
     */
    public Context.TreePath.FilterList createContextTreePathFilterList() {
        return new Context.TreePath.FilterList();
    }

    /**
     * Create an instance of {@link ParentModelInfo }
     * 
     */
    public ParentModelInfo createParentModelInfo() {
        return new ParentModelInfo();
    }

    /**
     * Create an instance of {@link ExplorerItemList }
     * 
     */
    public ExplorerItemList createExplorerItemList() {
        return new ExplorerItemList();
    }

    /**
     * Create an instance of {@link ExplorerItemList.Item }
     * 
     */
    public ExplorerItemList.Item createExplorerItemListItem() {
        return new ExplorerItemList.Item();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Property.InheritableValue }
     * 
     */
    public Property.InheritableValue createPropertyInheritableValue() {
        return new Property.InheritableValue();
    }

    /**
     * Create an instance of {@link Property.InheritableValue.Path }
     * 
     */
    public Property.InheritableValue.Path createPropertyInheritableValuePath() {
        return new Property.InheritableValue.Path();
    }

    /**
     * Create an instance of {@link Property.InheritableValue.Path.Item }
     * 
     */
    public Property.InheritableValue.Path.Item createPropertyInheritableValuePathItem() {
        return new Property.InheritableValue.Path.Item();
    }

    /**
     * Create an instance of {@link PasswordRequirements }
     * 
     */
    public PasswordRequirements createPasswordRequirements() {
        return new PasswordRequirements();
    }

    /**
     * Create an instance of {@link PropertyList }
     * 
     */
    public PropertyList createPropertyList() {
        return new PropertyList();
    }

    /**
     * Create an instance of {@link SelectedObjects }
     * 
     */
    public SelectedObjects createSelectedObjects() {
        return new SelectedObjects();
    }

    /**
     * Create an instance of {@link UserSessions }
     * 
     */
    public UserSessions createUserSessions() {
        return new UserSessions();
    }

    /**
     * Create an instance of {@link SessionDescription }
     * 
     */
    public SessionDescription createSessionDescription() {
        return new SessionDescription();
    }

    /**
     * Create an instance of {@link DeleteCascadeConfirmations }
     * 
     */
    public DeleteCascadeConfirmations createDeleteCascadeConfirmations() {
        return new DeleteCascadeConfirmations();
    }

    /**
     * Create an instance of {@link Definition }
     * 
     */
    public Definition createDefinition() {
        return new Definition();
    }

    /**
     * Create an instance of {@link Presentation }
     * 
     */
    public Presentation createPresentation() {
        return new Presentation();
    }

    /**
     * Create an instance of {@link ObjectReference }
     * 
     */
    public ObjectReference createObjectReference() {
        return new ObjectReference();
    }

    /**
     * Create an instance of {@link org.radixware.schemas.eas.Object }
     * 
     */
    public org.radixware.schemas.eas.Object createObject() {
        return new org.radixware.schemas.eas.Object();
    }

    /**
     * Create an instance of {@link PresentableObject }
     * 
     */
    public PresentableObject createPresentableObject() {
        return new PresentableObject();
    }

    /**
     * Create an instance of {@link ParentModelList }
     * 
     */
    public ParentModelList createParentModelList() {
        return new ParentModelList();
    }

    /**
     * Create an instance of {@link org.radixware.schemas.eas.Filter }
     * 
     */
    public org.radixware.schemas.eas.Filter createFilter() {
        return new org.radixware.schemas.eas.Filter();
    }

    /**
     * Create an instance of {@link ColorScheme }
     * 
     */
    public ColorScheme createColorScheme() {
        return new ColorScheme();
    }

    /**
     * Create an instance of {@link CommonFilter }
     * 
     */
    public CommonFilter createCommonFilter() {
        return new CommonFilter();
    }

    /**
     * Create an instance of {@link CommonFilters }
     * 
     */
    public CommonFilters createCommonFilters() {
        return new CommonFilters();
    }

    /**
     * Create an instance of {@link CustomSelectorColumn }
     * 
     */
    public CustomSelectorColumn createCustomSelectorColumn() {
        return new CustomSelectorColumn();
    }

    /**
     * Create an instance of {@link CustomSelectorColumns }
     * 
     */
    public CustomSelectorColumns createCustomSelectorColumns() {
        return new CustomSelectorColumns();
    }

    /**
     * Create an instance of {@link NamedParam }
     * 
     */
    public NamedParam createNamedParam() {
        return new NamedParam();
    }

    /**
     * Create an instance of {@link Form }
     * 
     */
    public Form createForm() {
        return new Form();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link SelectedObject }
     * 
     */
    public SelectedObject createSelectedObject() {
        return new SelectedObject();
    }

    /**
     * Create an instance of {@link SelectedChildGroup }
     * 
     */
    public SelectedChildGroup createSelectedChildGroup() {
        return new SelectedChildGroup();
    }

    /**
     * Create an instance of {@link DeleteCascadeConfirmation }
     * 
     */
    public DeleteCascadeConfirmation createDeleteCascadeConfirmation() {
        return new DeleteCascadeConfirmation();
    }

    /**
     * Create an instance of {@link CfgSegmentInfo }
     * 
     */
    public CfgSegmentInfo createCfgSegmentInfo() {
        return new CfgSegmentInfo();
    }

    /**
     * Create an instance of {@link DynamicListRq }
     * 
     */
    public DynamicListRq createDynamicListRq() {
        return new DynamicListRq();
    }

    /**
     * Create an instance of {@link DynamicListRs }
     * 
     */
    public DynamicListRs createDynamicListRs() {
        return new DynamicListRs();
    }

    /**
     * Create an instance of {@link ObjectTitlesRq }
     * 
     */
    public ObjectTitlesRq createObjectTitlesRq() {
        return new ObjectTitlesRq();
    }

    /**
     * Create an instance of {@link ObjectTitle }
     * 
     */
    public ObjectTitle createObjectTitle() {
        return new ObjectTitle();
    }

    /**
     * Create an instance of {@link ObjectTitlesRs }
     * 
     */
    public ObjectTitlesRs createObjectTitlesRs() {
        return new ObjectTitlesRs();
    }

    /**
     * Create an instance of {@link ParentDictionaryRq }
     * 
     */
    public ParentDictionaryRq createParentDictionaryRq() {
        return new ParentDictionaryRq();
    }

    /**
     * Create an instance of {@link ParentDictionaryRs }
     * 
     */
    public ParentDictionaryRs createParentDictionaryRs() {
        return new ParentDictionaryRs();
    }

    /**
     * Create an instance of {@link CustomAttrsDynamicData }
     * 
     */
    public CustomAttrsDynamicData createCustomAttrsDynamicData() {
        return new CustomAttrsDynamicData();
    }

    /**
     * Create an instance of {@link SecondAuthenticationFactorReceiver }
     * 
     */
    public SecondAuthenticationFactorReceiver createSecondAuthenticationFactorReceiver() {
        return new SecondAuthenticationFactorReceiver();
    }

    /**
     * Create an instance of {@link SecondAuthenticationFactorRequest }
     * 
     */
    public SecondAuthenticationFactorRequest createSecondAuthenticationFactorRequest() {
        return new SecondAuthenticationFactorRequest();
    }

    /**
     * Create an instance of {@link SecondAuthenticationFactorResponse }
     * 
     */
    public SecondAuthenticationFactorResponse createSecondAuthenticationFactorResponse() {
        return new SecondAuthenticationFactorResponse();
    }

    /**
     * Create an instance of {@link ContextRequest }
     * 
     */
    public ContextRequest createContextRequest() {
        return new ContextRequest();
    }

    /**
     * Create an instance of {@link ClassRequest }
     * 
     */
    public ClassRequest createClassRequest() {
        return new ClassRequest();
    }

    /**
     * Create an instance of {@link EntityRequest }
     * 
     */
    public EntityRequest createEntityRequest() {
        return new EntityRequest();
    }

    /**
     * Create an instance of {@link ObjectRequest }
     * 
     */
    public ObjectRequest createObjectRequest() {
        return new ObjectRequest();
    }

    /**
     * Create an instance of {@link GroupRequest }
     * 
     */
    public GroupRequest createGroupRequest() {
        return new GroupRequest();
    }

    /**
     * Create an instance of {@link ObjectOrGroupRequest }
     * 
     */
    public ObjectOrGroupRequest createObjectOrGroupRequest() {
        return new ObjectOrGroupRequest();
    }

    /**
     * Create an instance of {@link LoginRs }
     * 
     */
    public LoginRs createLoginRs() {
        return new LoginRs();
    }

    /**
     * Create an instance of {@link TestRq }
     * 
     */
    public TestRq createTestRq() {
        return new TestRq();
    }

    /**
     * Create an instance of {@link TestRs }
     * 
     */
    public TestRs createTestRs() {
        return new TestRs();
    }

    /**
     * Create an instance of {@link ReadManifestRq }
     * 
     */
    public ReadManifestRq createReadManifestRq() {
        return new ReadManifestRq();
    }

    /**
     * Create an instance of {@link ChangePasswordRq }
     * 
     */
    public ChangePasswordRq createChangePasswordRq() {
        return new ChangePasswordRq();
    }

    /**
     * Create an instance of {@link ChangePasswordRs }
     * 
     */
    public ChangePasswordRs createChangePasswordRs() {
        return new ChangePasswordRs();
    }

    /**
     * Create an instance of {@link GetPasswordRequirementsRq }
     * 
     */
    public GetPasswordRequirementsRq createGetPasswordRequirementsRq() {
        return new GetPasswordRequirementsRq();
    }

    /**
     * Create an instance of {@link GetPasswordRequirementsRs }
     * 
     */
    public GetPasswordRequirementsRs createGetPasswordRequirementsRs() {
        return new GetPasswordRequirementsRs();
    }

    /**
     * Create an instance of {@link CloseSessionRq }
     * 
     */
    public CloseSessionRq createCloseSessionRq() {
        return new CloseSessionRq();
    }

    /**
     * Create an instance of {@link CloseSessionRs }
     * 
     */
    public CloseSessionRs createCloseSessionRs() {
        return new CloseSessionRs();
    }

    /**
     * Create an instance of {@link SelectRq }
     * 
     */
    public SelectRq createSelectRq() {
        return new SelectRq();
    }

    /**
     * Create an instance of {@link SelectRs }
     * 
     */
    public SelectRs createSelectRs() {
        return new SelectRs();
    }

    /**
     * Create an instance of {@link ListVisibleExplorerItemsRq }
     * 
     */
    public ListVisibleExplorerItemsRq createListVisibleExplorerItemsRq() {
        return new ListVisibleExplorerItemsRq();
    }

    /**
     * Create an instance of {@link ListEdPresVisibleExpItemsRq }
     * 
     */
    public ListEdPresVisibleExpItemsRq createListEdPresVisibleExpItemsRq() {
        return new ListEdPresVisibleExpItemsRq();
    }

    /**
     * Create an instance of {@link ListEdPresVisibleExpItemsRs }
     * 
     */
    public ListEdPresVisibleExpItemsRs createListEdPresVisibleExpItemsRs() {
        return new ListEdPresVisibleExpItemsRs();
    }

    /**
     * Create an instance of {@link ReadRs }
     * 
     */
    public ReadRs createReadRs() {
        return new ReadRs();
    }

    /**
     * Create an instance of {@link SetParentRs }
     * 
     */
    public SetParentRs createSetParentRs() {
        return new SetParentRs();
    }

    /**
     * Create an instance of {@link ListInstantiatableClassesRq }
     * 
     */
    public ListInstantiatableClassesRq createListInstantiatableClassesRq() {
        return new ListInstantiatableClassesRq();
    }

    /**
     * Create an instance of {@link ListInstantiatableClassesRs }
     * 
     */
    public ListInstantiatableClassesRs createListInstantiatableClassesRs() {
        return new ListInstantiatableClassesRs();
    }

    /**
     * Create an instance of {@link PrepareCreateRs }
     * 
     */
    public PrepareCreateRs createPrepareCreateRs() {
        return new PrepareCreateRs();
    }

    /**
     * Create an instance of {@link CreateRq }
     * 
     */
    public CreateRq createCreateRq() {
        return new CreateRq();
    }

    /**
     * Create an instance of {@link CreateRs }
     * 
     */
    public CreateRs createCreateRs() {
        return new CreateRs();
    }

    /**
     * Create an instance of {@link DeleteRq }
     * 
     */
    public DeleteRq createDeleteRq() {
        return new DeleteRq();
    }

    /**
     * Create an instance of {@link DeleteRs }
     * 
     */
    public DeleteRs createDeleteRs() {
        return new DeleteRs();
    }

    /**
     * Create an instance of {@link UpdateRq }
     * 
     */
    public UpdateRq createUpdateRq() {
        return new UpdateRq();
    }

    /**
     * Create an instance of {@link UpdateRs }
     * 
     */
    public UpdateRs createUpdateRs() {
        return new UpdateRs();
    }

    /**
     * Create an instance of {@link CommandRs }
     * 
     */
    public CommandRs createCommandRs() {
        return new CommandRs();
    }

    /**
     * Create an instance of {@link ContextlessCommandRq }
     * 
     */
    public ContextlessCommandRq createContextlessCommandRq() {
        return new ContextlessCommandRq();
    }

    /**
     * Create an instance of {@link ContextlessCommandRs }
     * 
     */
    public ContextlessCommandRs createContextlessCommandRs() {
        return new ContextlessCommandRs();
    }

    /**
     * Create an instance of {@link CalcSelectionStatisticRq }
     * 
     */
    public CalcSelectionStatisticRq createCalcSelectionStatisticRq() {
        return new CalcSelectionStatisticRq();
    }

    /**
     * Create an instance of {@link CalcSelectionStatisticRs }
     * 
     */
    public CalcSelectionStatisticRs createCalcSelectionStatisticRs() {
        return new CalcSelectionStatisticRs();
    }

    /**
     * Create an instance of {@link GetDatabaseInfoRq }
     * 
     */
    public GetDatabaseInfoRq createGetDatabaseInfoRq() {
        return new GetDatabaseInfoRq();
    }

    /**
     * Create an instance of {@link GetDatabaseInfoRs }
     * 
     */
    public GetDatabaseInfoRs createGetDatabaseInfoRs() {
        return new GetDatabaseInfoRs();
    }

    /**
     * Create an instance of {@link GetCustomAttrsDynamicDataRq }
     * 
     */
    public GetCustomAttrsDynamicDataRq createGetCustomAttrsDynamicDataRq() {
        return new GetCustomAttrsDynamicDataRq();
    }

    /**
     * Create an instance of {@link GetCustomAttrsDynamicDataRs }
     * 
     */
    public GetCustomAttrsDynamicDataRs createGetCustomAttrsDynamicDataRs() {
        return new GetCustomAttrsDynamicDataRs();
    }

    /**
     * Create an instance of {@link GetTlsPublicKeysRq }
     * 
     */
    public GetTlsPublicKeysRq createGetTlsPublicKeysRq() {
        return new GetTlsPublicKeysRq();
    }

    /**
     * Create an instance of {@link GetTlsPublicKeysRs }
     * 
     */
    public GetTlsPublicKeysRs createGetTlsPublicKeysRs() {
        return new GetTlsPublicKeysRs();
    }

    /**
     * Create an instance of {@link ProgressDialogStartProcessRq }
     * 
     */
    public ProgressDialogStartProcessRq createProgressDialogStartProcessRq() {
        return new ProgressDialogStartProcessRq();
    }

    /**
     * Create an instance of {@link ProgressDialogStartProcessRs }
     * 
     */
    public ProgressDialogStartProcessRs createProgressDialogStartProcessRs() {
        return new ProgressDialogStartProcessRs();
    }

    /**
     * Create an instance of {@link ProgressDialogSetRq }
     * 
     */
    public ProgressDialogSetRq createProgressDialogSetRq() {
        return new ProgressDialogSetRq();
    }

    /**
     * Create an instance of {@link ProgressDialogSetRs }
     * 
     */
    public ProgressDialogSetRs createProgressDialogSetRs() {
        return new ProgressDialogSetRs();
    }

    /**
     * Create an instance of {@link ProgressDialogTraceRq }
     * 
     */
    public ProgressDialogTraceRq createProgressDialogTraceRq() {
        return new ProgressDialogTraceRq();
    }

    /**
     * Create an instance of {@link ProgressDialogTraceRs }
     * 
     */
    public ProgressDialogTraceRs createProgressDialogTraceRs() {
        return new ProgressDialogTraceRs();
    }

    /**
     * Create an instance of {@link ProgressDialogFinishProcessRq }
     * 
     */
    public ProgressDialogFinishProcessRq createProgressDialogFinishProcessRq() {
        return new ProgressDialogFinishProcessRq();
    }

    /**
     * Create an instance of {@link ProgressDialogFinishProcessRs }
     * 
     */
    public ProgressDialogFinishProcessRs createProgressDialogFinishProcessRs() {
        return new ProgressDialogFinishProcessRs();
    }

    /**
     * Create an instance of {@link MessageDialogOpenRq }
     * 
     */
    public MessageDialogOpenRq createMessageDialogOpenRq() {
        return new MessageDialogOpenRq();
    }

    /**
     * Create an instance of {@link MessageDialogOpenRs }
     * 
     */
    public MessageDialogOpenRs createMessageDialogOpenRs() {
        return new MessageDialogOpenRs();
    }

    /**
     * Create an instance of {@link MessageDialogWaitButtonRq }
     * 
     */
    public MessageDialogWaitButtonRq createMessageDialogWaitButtonRq() {
        return new MessageDialogWaitButtonRq();
    }

    /**
     * Create an instance of {@link MessageDialogWaitButtonRs }
     * 
     */
    public MessageDialogWaitButtonRs createMessageDialogWaitButtonRs() {
        return new MessageDialogWaitButtonRs();
    }

    /**
     * Create an instance of {@link FileMask }
     * 
     */
    public FileMask createFileMask() {
        return new FileMask();
    }

    /**
     * Create an instance of {@link FileSelectRq }
     * 
     */
    public FileSelectRq createFileSelectRq() {
        return new FileSelectRq();
    }

    /**
     * Create an instance of {@link FileSelectRs }
     * 
     */
    public FileSelectRs createFileSelectRs() {
        return new FileSelectRs();
    }

    /**
     * Create an instance of {@link FileAccessRq }
     * 
     */
    public FileAccessRq createFileAccessRq() {
        return new FileAccessRq();
    }

    /**
     * Create an instance of {@link FileAccessRs }
     * 
     */
    public FileAccessRs createFileAccessRs() {
        return new FileAccessRs();
    }

    /**
     * Create an instance of {@link FileOpenRq }
     * 
     */
    public FileOpenRq createFileOpenRq() {
        return new FileOpenRq();
    }

    /**
     * Create an instance of {@link FileOpenRs }
     * 
     */
    public FileOpenRs createFileOpenRs() {
        return new FileOpenRs();
    }

    /**
     * Create an instance of {@link FileTransitRq }
     * 
     */
    public FileTransitRq createFileTransitRq() {
        return new FileTransitRq();
    }

    /**
     * Create an instance of {@link FileTransitRs }
     * 
     */
    public FileTransitRs createFileTransitRs() {
        return new FileTransitRs();
    }

    /**
     * Create an instance of {@link FileCloseRq }
     * 
     */
    public FileCloseRq createFileCloseRq() {
        return new FileCloseRq();
    }

    /**
     * Create an instance of {@link FileCloseRs }
     * 
     */
    public FileCloseRs createFileCloseRs() {
        return new FileCloseRs();
    }

    /**
     * Create an instance of {@link FileReadRq }
     * 
     */
    public FileReadRq createFileReadRq() {
        return new FileReadRq();
    }

    /**
     * Create an instance of {@link FileReadRs }
     * 
     */
    public FileReadRs createFileReadRs() {
        return new FileReadRs();
    }

    /**
     * Create an instance of {@link FileWriteRq }
     * 
     */
    public FileWriteRq createFileWriteRq() {
        return new FileWriteRq();
    }

    /**
     * Create an instance of {@link FileWriteRs }
     * 
     */
    public FileWriteRs createFileWriteRs() {
        return new FileWriteRs();
    }

    /**
     * Create an instance of {@link FileSeekRq }
     * 
     */
    public FileSeekRq createFileSeekRq() {
        return new FileSeekRq();
    }

    /**
     * Create an instance of {@link FileSeekRs }
     * 
     */
    public FileSeekRs createFileSeekRs() {
        return new FileSeekRs();
    }

    /**
     * Create an instance of {@link FileDeleteRq }
     * 
     */
    public FileDeleteRq createFileDeleteRq() {
        return new FileDeleteRq();
    }

    /**
     * Create an instance of {@link FileDeleteRs }
     * 
     */
    public FileDeleteRs createFileDeleteRs() {
        return new FileDeleteRs();
    }

    /**
     * Create an instance of {@link FileCopyRq }
     * 
     */
    public FileCopyRq createFileCopyRq() {
        return new FileCopyRq();
    }

    /**
     * Create an instance of {@link FileCopyRs }
     * 
     */
    public FileCopyRs createFileCopyRs() {
        return new FileCopyRs();
    }

    /**
     * Create an instance of {@link FileMoveRq }
     * 
     */
    public FileMoveRq createFileMoveRq() {
        return new FileMoveRq();
    }

    /**
     * Create an instance of {@link FileMoveRs }
     * 
     */
    public FileMoveRs createFileMoveRs() {
        return new FileMoveRs();
    }

    /**
     * Create an instance of {@link FileSizeRq }
     * 
     */
    public FileSizeRq createFileSizeRq() {
        return new FileSizeRq();
    }

    /**
     * Create an instance of {@link FileSizeRs }
     * 
     */
    public FileSizeRs createFileSizeRs() {
        return new FileSizeRs();
    }

    /**
     * Create an instance of {@link FileDirSelectRq }
     * 
     */
    public FileDirSelectRq createFileDirSelectRq() {
        return new FileDirSelectRq();
    }

    /**
     * Create an instance of {@link FileDirSelectRs }
     * 
     */
    public FileDirSelectRs createFileDirSelectRs() {
        return new FileDirSelectRs();
    }

    /**
     * Create an instance of {@link FileDirGetUserHomeRq }
     * 
     */
    public FileDirGetUserHomeRq createFileDirGetUserHomeRq() {
        return new FileDirGetUserHomeRq();
    }

    /**
     * Create an instance of {@link FileDirGetUserHomeRs }
     * 
     */
    public FileDirGetUserHomeRs createFileDirGetUserHomeRs() {
        return new FileDirGetUserHomeRs();
    }

    /**
     * Create an instance of {@link GetUserDownloadsDirRq }
     * 
     */
    public GetUserDownloadsDirRq createGetUserDownloadsDirRq() {
        return new GetUserDownloadsDirRq();
    }

    /**
     * Create an instance of {@link GetUserDownloadsDirRs }
     * 
     */
    public GetUserDownloadsDirRs createGetUserDownloadsDirRs() {
        return new GetUserDownloadsDirRs();
    }

    /**
     * Create an instance of {@link TestIfFileExistsRq }
     * 
     */
    public TestIfFileExistsRq createTestIfFileExistsRq() {
        return new TestIfFileExistsRq();
    }

    /**
     * Create an instance of {@link TestIfFileExistsRs }
     * 
     */
    public TestIfFileExistsRs createTestIfFileExistsRs() {
        return new TestIfFileExistsRs();
    }

    /**
     * Create an instance of {@link TestIfDirExistsRq }
     * 
     */
    public TestIfDirExistsRq createTestIfDirExistsRq() {
        return new TestIfDirExistsRq();
    }

    /**
     * Create an instance of {@link TestIfDirExistsRs }
     * 
     */
    public TestIfDirExistsRs createTestIfDirExistsRs() {
        return new TestIfDirExistsRs();
    }

    /**
     * Create an instance of {@link FileDirCreateRq }
     * 
     */
    public FileDirCreateRq createFileDirCreateRq() {
        return new FileDirCreateRq();
    }

    /**
     * Create an instance of {@link FileDirCreateRs }
     * 
     */
    public FileDirCreateRs createFileDirCreateRs() {
        return new FileDirCreateRs();
    }

    /**
     * Create an instance of {@link FileDirDeleteRq }
     * 
     */
    public FileDirDeleteRq createFileDirDeleteRq() {
        return new FileDirDeleteRq();
    }

    /**
     * Create an instance of {@link FileDirDeleteRs }
     * 
     */
    public FileDirDeleteRs createFileDirDeleteRs() {
        return new FileDirDeleteRs();
    }

    /**
     * Create an instance of {@link FileDirMoveRq }
     * 
     */
    public FileDirMoveRq createFileDirMoveRq() {
        return new FileDirMoveRq();
    }

    /**
     * Create an instance of {@link FileDirMoveRs }
     * 
     */
    public FileDirMoveRs createFileDirMoveRs() {
        return new FileDirMoveRs();
    }

    /**
     * Create an instance of {@link FileDirReadRq }
     * 
     */
    public FileDirReadRq createFileDirReadRq() {
        return new FileDirReadRq();
    }

    /**
     * Create an instance of {@link FileDirReadItem }
     * 
     */
    public FileDirReadItem createFileDirReadItem() {
        return new FileDirReadItem();
    }

    /**
     * Create an instance of {@link FileDirReadRs }
     * 
     */
    public FileDirReadRs createFileDirReadRs() {
        return new FileDirReadRs();
    }

    /**
     * Create an instance of {@link ClientMethodInvocationRq }
     * 
     */
    public ClientMethodInvocationRq createClientMethodInvocationRq() {
        return new ClientMethodInvocationRq();
    }

    /**
     * Create an instance of {@link ClientMethodInvocationRs }
     * 
     */
    public ClientMethodInvocationRs createClientMethodInvocationRs() {
        return new ClientMethodInvocationRs();
    }

    /**
     * Create an instance of {@link GetSecurityTokenRq }
     * 
     */
    public GetSecurityTokenRq createGetSecurityTokenRq() {
        return new GetSecurityTokenRq();
    }

    /**
     * Create an instance of {@link GetSecurityTokenRs }
     * 
     */
    public GetSecurityTokenRs createGetSecurityTokenRs() {
        return new GetSecurityTokenRs();
    }

    /**
     * Create an instance of {@link CreateSessionMess }
     * 
     */
    public CreateSessionMess createCreateSessionMess() {
        return new CreateSessionMess();
    }

    /**
     * Create an instance of {@link LocalProperty }
     * 
     */
    public LocalProperty createLocalProperty() {
        return new LocalProperty();
    }

    /**
     * Create an instance of {@link LocalSettings }
     * 
     */
    public LocalSettings createLocalSettings() {
        return new LocalSettings();
    }

    /**
     * Create an instance of {@link SessionVariable }
     * 
     */
    public SessionVariable createSessionVariable() {
        return new SessionVariable();
    }

    /**
     * Create an instance of {@link SessionVariables }
     * 
     */
    public SessionVariables createSessionVariables() {
        return new SessionVariables();
    }

    /**
     * Create an instance of {@link WriteClientSettingsRq }
     * 
     */
    public WriteClientSettingsRq createWriteClientSettingsRq() {
        return new WriteClientSettingsRq();
    }

    /**
     * Create an instance of {@link WriteClientSettingsRs }
     * 
     */
    public WriteClientSettingsRs createWriteClientSettingsRs() {
        return new WriteClientSettingsRs();
    }

    /**
     * Create an instance of {@link WriteClientSettingsMess }
     * 
     */
    public WriteClientSettingsMess createWriteClientSettingsMess() {
        return new WriteClientSettingsMess();
    }

    /**
     * Create an instance of {@link ReadSessionVariablesRq }
     * 
     */
    public ReadSessionVariablesRq createReadSessionVariablesRq() {
        return new ReadSessionVariablesRq();
    }

    /**
     * Create an instance of {@link ReadSessionVariablesRs }
     * 
     */
    public ReadSessionVariablesRs createReadSessionVariablesRs() {
        return new ReadSessionVariablesRs();
    }

    /**
     * Create an instance of {@link ReadSessionVariablesMess }
     * 
     */
    public ReadSessionVariablesMess createReadSessionVariablesMess() {
        return new ReadSessionVariablesMess();
    }

    /**
     * Create an instance of {@link LoginMess }
     * 
     */
    public LoginMess createLoginMess() {
        return new LoginMess();
    }

    /**
     * Create an instance of {@link TestMess }
     * 
     */
    public TestMess createTestMess() {
        return new TestMess();
    }

    /**
     * Create an instance of {@link ReadManifestMess }
     * 
     */
    public ReadManifestMess createReadManifestMess() {
        return new ReadManifestMess();
    }

    /**
     * Create an instance of {@link ListInstantiatableClassesMess }
     * 
     */
    public ListInstantiatableClassesMess createListInstantiatableClassesMess() {
        return new ListInstantiatableClassesMess();
    }

    /**
     * Create an instance of {@link ChangePasswordMess }
     * 
     */
    public ChangePasswordMess createChangePasswordMess() {
        return new ChangePasswordMess();
    }

    /**
     * Create an instance of {@link GetPasswordRequirementsMess }
     * 
     */
    public GetPasswordRequirementsMess createGetPasswordRequirementsMess() {
        return new GetPasswordRequirementsMess();
    }

    /**
     * Create an instance of {@link ListEdPresVisibleExpItemsMess }
     * 
     */
    public ListEdPresVisibleExpItemsMess createListEdPresVisibleExpItemsMess() {
        return new ListEdPresVisibleExpItemsMess();
    }

    /**
     * Create an instance of {@link ListVisibleExplorerItemsMess }
     * 
     */
    public ListVisibleExplorerItemsMess createListVisibleExplorerItemsMess() {
        return new ListVisibleExplorerItemsMess();
    }

    /**
     * Create an instance of {@link ReadMess }
     * 
     */
    public ReadMess createReadMess() {
        return new ReadMess();
    }

    /**
     * Create an instance of {@link PrepareCreateMess }
     * 
     */
    public PrepareCreateMess createPrepareCreateMess() {
        return new PrepareCreateMess();
    }

    /**
     * Create an instance of {@link SelectMess }
     * 
     */
    public SelectMess createSelectMess() {
        return new SelectMess();
    }

    /**
     * Create an instance of {@link CommandMess }
     * 
     */
    public CommandMess createCommandMess() {
        return new CommandMess();
    }

    /**
     * Create an instance of {@link ContextlessCommandMess }
     * 
     */
    public ContextlessCommandMess createContextlessCommandMess() {
        return new ContextlessCommandMess();
    }

    /**
     * Create an instance of {@link CreateMess }
     * 
     */
    public CreateMess createCreateMess() {
        return new CreateMess();
    }

    /**
     * Create an instance of {@link DeleteMess }
     * 
     */
    public DeleteMess createDeleteMess() {
        return new DeleteMess();
    }

    /**
     * Create an instance of {@link UpdateMess }
     * 
     */
    public UpdateMess createUpdateMess() {
        return new UpdateMess();
    }

    /**
     * Create an instance of {@link SetParentMess }
     * 
     */
    public SetParentMess createSetParentMess() {
        return new SetParentMess();
    }

    /**
     * Create an instance of {@link GetObjectTitlesMess }
     * 
     */
    public GetObjectTitlesMess createGetObjectTitlesMess() {
        return new GetObjectTitlesMess();
    }

    /**
     * Create an instance of {@link CalcSelectionStatisticMess }
     * 
     */
    public CalcSelectionStatisticMess createCalcSelectionStatisticMess() {
        return new CalcSelectionStatisticMess();
    }

    /**
     * Create an instance of {@link GetDatabaseInfoMess }
     * 
     */
    public GetDatabaseInfoMess createGetDatabaseInfoMess() {
        return new GetDatabaseInfoMess();
    }

    /**
     * Create an instance of {@link GetCustomAttrsDynamicDataMess }
     * 
     */
    public GetCustomAttrsDynamicDataMess createGetCustomAttrsDynamicDataMess() {
        return new GetCustomAttrsDynamicDataMess();
    }

    /**
     * Create an instance of {@link GetTlsPublicKeysMess }
     * 
     */
    public GetTlsPublicKeysMess createGetTlsPublicKeysMess() {
        return new GetTlsPublicKeysMess();
    }

    /**
     * Create an instance of {@link CloseSessionMess }
     * 
     */
    public CloseSessionMess createCloseSessionMess() {
        return new CloseSessionMess();
    }

    /**
     * Create an instance of {@link ProgressDialogStartProcessMess }
     * 
     */
    public ProgressDialogStartProcessMess createProgressDialogStartProcessMess() {
        return new ProgressDialogStartProcessMess();
    }

    /**
     * Create an instance of {@link ProgressDialogSetMess }
     * 
     */
    public ProgressDialogSetMess createProgressDialogSetMess() {
        return new ProgressDialogSetMess();
    }

    /**
     * Create an instance of {@link ProgressDialogTraceMess }
     * 
     */
    public ProgressDialogTraceMess createProgressDialogTraceMess() {
        return new ProgressDialogTraceMess();
    }

    /**
     * Create an instance of {@link ProgressDialogFinishProcessMess }
     * 
     */
    public ProgressDialogFinishProcessMess createProgressDialogFinishProcessMess() {
        return new ProgressDialogFinishProcessMess();
    }

    /**
     * Create an instance of {@link MessageDialogOpenMess }
     * 
     */
    public MessageDialogOpenMess createMessageDialogOpenMess() {
        return new MessageDialogOpenMess();
    }

    /**
     * Create an instance of {@link MessageDialogWaitButtonMess }
     * 
     */
    public MessageDialogWaitButtonMess createMessageDialogWaitButtonMess() {
        return new MessageDialogWaitButtonMess();
    }

    /**
     * Create an instance of {@link FileSelectMess }
     * 
     */
    public FileSelectMess createFileSelectMess() {
        return new FileSelectMess();
    }

    /**
     * Create an instance of {@link FileAccessMess }
     * 
     */
    public FileAccessMess createFileAccessMess() {
        return new FileAccessMess();
    }

    /**
     * Create an instance of {@link FileTransitMess }
     * 
     */
    public FileTransitMess createFileTransitMess() {
        return new FileTransitMess();
    }

    /**
     * Create an instance of {@link FileOpenMess }
     * 
     */
    public FileOpenMess createFileOpenMess() {
        return new FileOpenMess();
    }

    /**
     * Create an instance of {@link FileCloseMess }
     * 
     */
    public FileCloseMess createFileCloseMess() {
        return new FileCloseMess();
    }

    /**
     * Create an instance of {@link FileReadMess }
     * 
     */
    public FileReadMess createFileReadMess() {
        return new FileReadMess();
    }

    /**
     * Create an instance of {@link FileWriteMess }
     * 
     */
    public FileWriteMess createFileWriteMess() {
        return new FileWriteMess();
    }

    /**
     * Create an instance of {@link FileSeekMess }
     * 
     */
    public FileSeekMess createFileSeekMess() {
        return new FileSeekMess();
    }

    /**
     * Create an instance of {@link FileDeleteMess }
     * 
     */
    public FileDeleteMess createFileDeleteMess() {
        return new FileDeleteMess();
    }

    /**
     * Create an instance of {@link FileMoveMess }
     * 
     */
    public FileMoveMess createFileMoveMess() {
        return new FileMoveMess();
    }

    /**
     * Create an instance of {@link FileCopyMess }
     * 
     */
    public FileCopyMess createFileCopyMess() {
        return new FileCopyMess();
    }

    /**
     * Create an instance of {@link FileSizeMess }
     * 
     */
    public FileSizeMess createFileSizeMess() {
        return new FileSizeMess();
    }

    /**
     * Create an instance of {@link FileDirSelectMess }
     * 
     */
    public FileDirSelectMess createFileDirSelectMess() {
        return new FileDirSelectMess();
    }

    /**
     * Create an instance of {@link FileDirGetUserHomeMess }
     * 
     */
    public FileDirGetUserHomeMess createFileDirGetUserHomeMess() {
        return new FileDirGetUserHomeMess();
    }

    /**
     * Create an instance of {@link GetUserDownloadsDirMess }
     * 
     */
    public GetUserDownloadsDirMess createGetUserDownloadsDirMess() {
        return new GetUserDownloadsDirMess();
    }

    /**
     * Create an instance of {@link TestIfFileExistsMess }
     * 
     */
    public TestIfFileExistsMess createTestIfFileExistsMess() {
        return new TestIfFileExistsMess();
    }

    /**
     * Create an instance of {@link TestIfDirExistsMess }
     * 
     */
    public TestIfDirExistsMess createTestIfDirExistsMess() {
        return new TestIfDirExistsMess();
    }

    /**
     * Create an instance of {@link FileDirCreateMess }
     * 
     */
    public FileDirCreateMess createFileDirCreateMess() {
        return new FileDirCreateMess();
    }

    /**
     * Create an instance of {@link FileDirDeleteMess }
     * 
     */
    public FileDirDeleteMess createFileDirDeleteMess() {
        return new FileDirDeleteMess();
    }

    /**
     * Create an instance of {@link FileDirMoveMess }
     * 
     */
    public FileDirMoveMess createFileDirMoveMess() {
        return new FileDirMoveMess();
    }

    /**
     * Create an instance of {@link FileDirReadMess }
     * 
     */
    public FileDirReadMess createFileDirReadMess() {
        return new FileDirReadMess();
    }

    /**
     * Create an instance of {@link ClientMethodInvocationMess }
     * 
     */
    public ClientMethodInvocationMess createClientMethodInvocationMess() {
        return new ClientMethodInvocationMess();
    }

    /**
     * Create an instance of {@link GetSecurityTokenMess }
     * 
     */
    public GetSecurityTokenMess createGetSecurityTokenMess() {
        return new GetSecurityTokenMess();
    }

    /**
     * Create an instance of {@link DialogButtonsList.Item }
     * 
     */
    public DialogButtonsList.Item createDialogButtonsListItem() {
        return new DialogButtonsList.Item();
    }

    /**
     * Create an instance of {@link org.radixware.schemas.eas.Request.DefinitionsVer }
     * 
     */
    public org.radixware.schemas.eas.Request.DefinitionsVer createRequestDefinitionsVer() {
        return new org.radixware.schemas.eas.Request.DefinitionsVer();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRs.ObjectTitles.Item }
     * 
     */
    public GetObjectTitlesRs.ObjectTitles.Item createGetObjectTitlesRsObjectTitlesItem() {
        return new GetObjectTitlesRs.ObjectTitles.Item();
    }

    /**
     * Create an instance of {@link GetObjectTitlesRq.Objects.Item }
     * 
     */
    public GetObjectTitlesRq.Objects.Item createGetObjectTitlesRqObjectsItem() {
        return new GetObjectTitlesRq.Objects.Item();
    }

    /**
     * Create an instance of {@link CommandRq.CurrentData }
     * 
     */
    public CommandRq.CurrentData createCommandRqCurrentData() {
        return new CommandRq.CurrentData();
    }

    /**
     * Create an instance of {@link PrepareCreateRq.Presentations }
     * 
     */
    public PrepareCreateRq.Presentations createPrepareCreateRqPresentations() {
        return new PrepareCreateRq.Presentations();
    }

    /**
     * Create an instance of {@link SetParentRq.CurrentData }
     * 
     */
    public SetParentRq.CurrentData createSetParentRqCurrentData() {
        return new SetParentRq.CurrentData();
    }

    /**
     * Create an instance of {@link EditorPages.Item }
     * 
     */
    public EditorPages.Item createEditorPagesItem() {
        return new EditorPages.Item();
    }

    /**
     * Create an instance of {@link Warnings.Warning }
     * 
     */
    public Warnings.Warning createWarningsWarning() {
        return new Warnings.Warning();
    }

    /**
     * Create an instance of {@link ReadRq.Presentations }
     * 
     */
    public ReadRq.Presentations createReadRqPresentations() {
        return new ReadRq.Presentations();
    }

    /**
     * Create an instance of {@link ReadRq.Properties }
     * 
     */
    public ReadRq.Properties createReadRqProperties() {
        return new ReadRq.Properties();
    }

    /**
     * Create an instance of {@link ListVisibleExplorerItemsRs.VisibleExplorerItems }
     * 
     */
    public ListVisibleExplorerItemsRs.VisibleExplorerItems createListVisibleExplorerItemsRsVisibleExplorerItems() {
        return new ListVisibleExplorerItemsRs.VisibleExplorerItems();
    }

    /**
     * Create an instance of {@link ReadManifestRs.SAPs.Item }
     * 
     */
    public ReadManifestRs.SAPs.Item createReadManifestRsSAPsItem() {
        return new ReadManifestRs.SAPs.Item();
    }

    /**
     * Create an instance of {@link LoginRq.SessionsToTerminate }
     * 
     */
    public LoginRq.SessionsToTerminate createLoginRqSessionsToTerminate() {
        return new LoginRq.SessionsToTerminate();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ContextlessCommands }
     * 
     */
    public CreateSessionRs.ContextlessCommands createCreateSessionRsContextlessCommands() {
        return new CreateSessionRs.ContextlessCommands();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ServerResources.Item }
     * 
     */
    public CreateSessionRs.ServerResources.Item createCreateSessionRsServerResourcesItem() {
        return new CreateSessionRs.ServerResources.Item();
    }

    /**
     * Create an instance of {@link CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems }
     * 
     */
    public CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems createCreateSessionRsExplorerRootsItemVisibleExplorerItems() {
        return new CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems();
    }

    /**
     * Create an instance of {@link CreateSessionRq.Platform }
     * 
     */
    public CreateSessionRq.Platform createCreateSessionRqPlatform() {
        return new CreateSessionRq.Platform();
    }

    /**
     * Create an instance of {@link CreateSessionRq.UserCertificatesChain }
     * 
     */
    public CreateSessionRq.UserCertificatesChain createCreateSessionRqUserCertificatesChain() {
        return new CreateSessionRq.UserCertificatesChain();
    }

    /**
     * Create an instance of {@link CreateSessionRq.SessionsToTerminate }
     * 
     */
    public CreateSessionRq.SessionsToTerminate createCreateSessionRqSessionsToTerminate() {
        return new CreateSessionRq.SessionsToTerminate();
    }

    /**
     * Create an instance of {@link DynamicList.Item }
     * 
     */
    public DynamicList.Item createDynamicListItem() {
        return new DynamicList.Item();
    }

    /**
     * Create an instance of {@link AggregateFunctions.FunctionCall }
     * 
     */
    public AggregateFunctions.FunctionCall createAggregateFunctionsFunctionCall() {
        return new AggregateFunctions.FunctionCall();
    }

    /**
     * Create an instance of {@link DeleteRejections.Rejection }
     * 
     */
    public DeleteRejections.Rejection createDeleteRejectionsRejection() {
        return new DeleteRejections.Rejection();
    }

    /**
     * Create an instance of {@link HierarchicalSelection.Item }
     * 
     */
    public HierarchicalSelection.Item createHierarchicalSelectionItem() {
        return new HierarchicalSelection.Item();
    }

    /**
     * Create an instance of {@link Actions.Item }
     * 
     */
    public Actions.Item createActionsItem() {
        return new Actions.Item();
    }

    /**
     * Create an instance of {@link Trace.Item }
     * 
     */
    public Trace.Item createTraceItem() {
        return new Trace.Item();
    }

    /**
     * Create an instance of {@link NextDialogRequest.MessageBox }
     * 
     */
    public NextDialogRequest.MessageBox createNextDialogRequestMessageBox() {
        return new NextDialogRequest.MessageBox();
    }

    /**
     * Create an instance of {@link Sorting.AdditionalSortingColumns.Item }
     * 
     */
    public Sorting.AdditionalSortingColumns.Item createSortingAdditionalSortingColumnsItem() {
        return new Sorting.AdditionalSortingColumns.Item();
    }

    /**
     * Create an instance of {@link ClassFilters.Item }
     * 
     */
    public ClassFilters.Item createClassFiltersItem() {
        return new ClassFilters.Item();
    }

    /**
     * Create an instance of {@link InstantiatableClasses.Item }
     * 
     */
    public InstantiatableClasses.Item createInstantiatableClassesItem() {
        return new InstantiatableClasses.Item();
    }

    /**
     * Create an instance of {@link ObjectList.Rows.Item.Exception }
     * 
     */
    public ObjectList.Rows.Item.Exception createObjectListRowsItemException() {
        return new ObjectList.Rows.Item.Exception();
    }

    /**
     * Create an instance of {@link Context.ObjectProperty }
     * 
     */
    public Context.ObjectProperty createContextObjectProperty() {
        return new Context.ObjectProperty();
    }

    /**
     * Create an instance of {@link Context.FormProperty }
     * 
     */
    public Context.FormProperty createContextFormProperty() {
        return new Context.FormProperty();
    }

    /**
     * Create an instance of {@link Context.ReportProperty }
     * 
     */
    public Context.ReportProperty createContextReportProperty() {
        return new Context.ReportProperty();
    }

    /**
     * Create an instance of {@link Context.Selector }
     * 
     */
    public Context.Selector createContextSelector() {
        return new Context.Selector();
    }

    /**
     * Create an instance of {@link Context.Editor }
     * 
     */
    public Context.Editor createContextEditor() {
        return new Context.Editor();
    }

    /**
     * Create an instance of {@link Context.TreePath.RootItem }
     * 
     */
    public Context.TreePath.RootItem createContextTreePathRootItem() {
        return new Context.TreePath.RootItem();
    }

    /**
     * Create an instance of {@link Context.TreePath.EdPresExplrItem }
     * 
     */
    public Context.TreePath.EdPresExplrItem createContextTreePathEdPresExplrItem() {
        return new Context.TreePath.EdPresExplrItem();
    }

    /**
     * Create an instance of {@link Context.TreePath.FilterList.Filter }
     * 
     */
    public Context.TreePath.FilterList.Filter createContextTreePathFilterListFilter() {
        return new Context.TreePath.FilterList.Filter();
    }

    /**
     * Create an instance of {@link ParentModelInfo.EntityObjectInfo }
     * 
     */
    public ParentModelInfo.EntityObjectInfo createParentModelInfoEntityObjectInfo() {
        return new ParentModelInfo.EntityObjectInfo();
    }

    /**
     * Create an instance of {@link ParentModelInfo.EntityGroupInfo }
     * 
     */
    public ParentModelInfo.EntityGroupInfo createParentModelInfoEntityGroupInfo() {
        return new ParentModelInfo.EntityGroupInfo();
    }

    /**
     * Create an instance of {@link ExplorerItemList.Item.Object }
     * 
     */
    public ExplorerItemList.Item.Object createExplorerItemListItemObject() {
        return new ExplorerItemList.Item.Object();
    }

    /**
     * Create an instance of {@link Property.ArrBin }
     * 
     */
    public Property.ArrBin createPropertyArrBin() {
        return new Property.ArrBin();
    }

    /**
     * Create an instance of {@link Property.ArrBool }
     * 
     */
    public Property.ArrBool createPropertyArrBool() {
        return new Property.ArrBool();
    }

    /**
     * Create an instance of {@link Property.ArrStr }
     * 
     */
    public Property.ArrStr createPropertyArrStr() {
        return new Property.ArrStr();
    }

    /**
     * Create an instance of {@link Property.ArrDateTime }
     * 
     */
    public Property.ArrDateTime createPropertyArrDateTime() {
        return new Property.ArrDateTime();
    }

    /**
     * Create an instance of {@link Property.ArrInt }
     * 
     */
    public Property.ArrInt createPropertyArrInt() {
        return new Property.ArrInt();
    }

    /**
     * Create an instance of {@link Property.ArrNum }
     * 
     */
    public Property.ArrNum createPropertyArrNum() {
        return new Property.ArrNum();
    }

    /**
     * Create an instance of {@link Property.ArrRef }
     * 
     */
    public Property.ArrRef createPropertyArrRef() {
        return new Property.ArrRef();
    }

    /**
     * Create an instance of {@link Property.InheritableValue.Path.Item.ReferenceProperty }
     * 
     */
    public Property.InheritableValue.Path.Item.ReferenceProperty createPropertyInheritableValuePathItemReferenceProperty() {
        return new Property.InheritableValue.Path.Item.ReferenceProperty();
    }

    /**
     * Create an instance of {@link PasswordRequirements.BlackList }
     * 
     */
    public PasswordRequirements.BlackList createPasswordRequirementsBlackList() {
        return new PasswordRequirements.BlackList();
    }

    /**
     * Create an instance of {@link PropertyList.Item }
     * 
     */
    public PropertyList.Item createPropertyListItem() {
        return new PropertyList.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequirements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PasswordRequirements }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "PasswordRequirements")
    public JAXBElement<PasswordRequirements> createPasswordRequirements(PasswordRequirements value) {
        return new JAXBElement<PasswordRequirements>(_PasswordRequirements_QNAME, PasswordRequirements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCascadeConfirmations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCascadeConfirmations }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "DeleteCascadeConfirmations")
    public JAXBElement<DeleteCascadeConfirmations> createDeleteCascadeConfirmations(DeleteCascadeConfirmations value) {
        return new JAXBElement<DeleteCascadeConfirmations>(_DeleteCascadeConfirmations_QNAME, DeleteCascadeConfirmations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Value", scope = SessionVariable.class)
    public JAXBElement<String> createSessionVariableValue(String value) {
        return new JAXBElement<String>(_SessionVariableValue_QNAME, String.class, SessionVariable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ParentTitleProperty", scope = SetParentRq.class)
    public JAXBElement<Definition> createSetParentRqParentTitleProperty(Definition value) {
        return new JAXBElement<Definition>(_SetParentRqParentTitleProperty_QNAME, Definition.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "PID", scope = SetParentRq.class)
    public JAXBElement<String> createSetParentRqPID(String value) {
        return new JAXBElement<String>(_SetParentRqPID_QNAME, String.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Class", scope = SetParentRq.class)
    public JAXBElement<Definition> createSetParentRqClass(Definition value) {
        return new JAXBElement<Definition>(_SetParentRqClass_QNAME, Definition.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "SrcPID", scope = SetParentRq.class)
    public JAXBElement<String> createSetParentRqSrcPID(String value) {
        return new JAXBElement<String>(_SetParentRqSrcPID_QNAME, String.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetParentRq.CurrentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetParentRq.CurrentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "CurrentData", scope = SetParentRq.class)
    public JAXBElement<SetParentRq.CurrentData> createSetParentRqCurrentData(SetParentRq.CurrentData value) {
        return new JAXBElement<SetParentRq.CurrentData>(_SetParentRqCurrentData_QNAME, SetParentRq.CurrentData.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "EditorPresentation", scope = SetParentRq.class)
    public JAXBElement<Definition> createSetParentRqEditorPresentation(Definition value) {
        return new JAXBElement<Definition>(_SetParentRqEditorPresentation_QNAME, Definition.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "SelectorPresentation", scope = SetParentRq.class)
    public JAXBElement<Definition> createSetParentRqSelectorPresentation(Definition value) {
        return new JAXBElement<Definition>(_SetParentRqSelectorPresentation_QNAME, Definition.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "RespWithLOBValues", scope = SetParentRq.class, defaultValue = "true")
    public JAXBElement<Boolean> createSetParentRqRespWithLOBValues(Boolean value) {
        return new JAXBElement<Boolean>(_SetParentRqRespWithLOBValues_QNAME, Boolean.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Form }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Form", scope = SetParentRq.class)
    public JAXBElement<Form> createSetParentRqForm(Form value) {
        return new JAXBElement<Form>(_SetParentRqForm_QNAME, Form.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Report }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Report }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Report", scope = SetParentRq.class)
    public JAXBElement<Report> createSetParentRqReport(Report value) {
        return new JAXBElement<Report>(_SetParentRqReport_QNAME, Report.class, SetParentRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Context }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Context }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Context", scope = ListEdPresVisibleExpItemsRq.class)
    public JAXBElement<Context> createListEdPresVisibleExpItemsRqContext(Context value) {
        return new JAXBElement<Context>(_ListEdPresVisibleExpItemsRqContext_QNAME, Context.class, ListEdPresVisibleExpItemsRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Definition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Presentation", scope = ListEdPresVisibleExpItemsRq.class)
    public JAXBElement<Definition> createListEdPresVisibleExpItemsRqPresentation(Definition value) {
        return new JAXBElement<Definition>(_ListEdPresVisibleExpItemsRqPresentation_QNAME, Definition.class, ListEdPresVisibleExpItemsRq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "DeleteCascadeRestriction", scope = DeleteRejections.Rejection.class)
    public JAXBElement<String> createDeleteRejectionsRejectionDeleteCascadeRestriction(String value) {
        return new JAXBElement<String>(_DeleteRejectionsRejectionDeleteCascadeRestriction_QNAME, String.class, DeleteRejections.Rejection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Bin", scope = Property.class)
    public JAXBElement<byte[]> createPropertyBin(byte[] value) {
        return new JAXBElement<byte[]>(_PropertyBin_QNAME, byte[].class, Property.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Bool", scope = Property.class)
    public JAXBElement<Boolean> createPropertyBool(Boolean value) {
        return new JAXBElement<Boolean>(_PropertyBool_QNAME, Boolean.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Str", scope = Property.class)
    public JAXBElement<String> createPropertyStr(String value) {
        return new JAXBElement<String>(_PropertyStr_QNAME, String.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "DateTime", scope = Property.class)
    public JAXBElement<XMLGregorianCalendar> createPropertyDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PropertyDateTime_QNAME, XMLGregorianCalendar.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Int", scope = Property.class)
    public JAXBElement<Long> createPropertyInt(Long value) {
        return new JAXBElement<Long>(_PropertyInt_QNAME, Long.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Num", scope = Property.class)
    public JAXBElement<BigDecimal> createPropertyNum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PropertyNum_QNAME, BigDecimal.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Xml", scope = Property.class)
    public JAXBElement<java.lang.Object> createPropertyXml(java.lang.Object value) {
        return new JAXBElement<java.lang.Object>(_PropertyXml_QNAME, java.lang.Object.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Ref", scope = Property.class)
    public JAXBElement<ObjectReference> createPropertyRef(ObjectReference value) {
        return new JAXBElement<ObjectReference>(_PropertyRef_QNAME, ObjectReference.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentableObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PresentableObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "Obj", scope = Property.class)
    public JAXBElement<PresentableObject> createPropertyObj(PresentableObject value) {
        return new JAXBElement<PresentableObject>(_PropertyObj_QNAME, PresentableObject.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrBin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrBin }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrBin", scope = Property.class)
    public JAXBElement<Property.ArrBin> createPropertyArrBin(Property.ArrBin value) {
        return new JAXBElement<Property.ArrBin>(_PropertyArrBin_QNAME, Property.ArrBin.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrBool }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrBool }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrBool", scope = Property.class)
    public JAXBElement<Property.ArrBool> createPropertyArrBool(Property.ArrBool value) {
        return new JAXBElement<Property.ArrBool>(_PropertyArrBool_QNAME, Property.ArrBool.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrStr", scope = Property.class)
    public JAXBElement<Property.ArrStr> createPropertyArrStr(Property.ArrStr value) {
        return new JAXBElement<Property.ArrStr>(_PropertyArrStr_QNAME, Property.ArrStr.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrDateTime", scope = Property.class)
    public JAXBElement<Property.ArrDateTime> createPropertyArrDateTime(Property.ArrDateTime value) {
        return new JAXBElement<Property.ArrDateTime>(_PropertyArrDateTime_QNAME, Property.ArrDateTime.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrInt", scope = Property.class)
    public JAXBElement<Property.ArrInt> createPropertyArrInt(Property.ArrInt value) {
        return new JAXBElement<Property.ArrInt>(_PropertyArrInt_QNAME, Property.ArrInt.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrNum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrNum }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrNum", scope = Property.class)
    public JAXBElement<Property.ArrNum> createPropertyArrNum(Property.ArrNum value) {
        return new JAXBElement<Property.ArrNum>(_PropertyArrNum_QNAME, Property.ArrNum.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.ArrRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.ArrRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "ArrRef", scope = Property.class)
    public JAXBElement<Property.ArrRef> createPropertyArrRef(Property.ArrRef value) {
        return new JAXBElement<Property.ArrRef>(_PropertyArrRef_QNAME, Property.ArrRef.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property.InheritableValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property.InheritableValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/eas.xsd", name = "InheritableValue", scope = Property.class)
    public JAXBElement<Property.InheritableValue> createPropertyInheritableValue(Property.InheritableValue value) {
        return new JAXBElement<Property.InheritableValue>(_PropertyInheritableValue_QNAME, Property.InheritableValue.class, Property.class, value);
    }

}
