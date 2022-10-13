
package org.radixware.schemas.xscml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.xscml package. 
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

    private final static QName _Jml_QNAME = new QName("http://schemas.radixware.org/xscml.xsd", "Jml");
    private final static QName _Sqml_QNAME = new QName("http://schemas.radixware.org/xscml.xsd", "Sqml");
    private final static QName _TypeDeclaration_QNAME = new QName("http://schemas.radixware.org/xscml.xsd", "TypeDeclaration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.xscml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JmlFuncProfile }
     * 
     */
    public JmlFuncProfile createJmlFuncProfile() {
        return new JmlFuncProfile();
    }

    /**
     * Create an instance of {@link JmlFuncProfile.ThrownExceptions }
     * 
     */
    public JmlFuncProfile.ThrownExceptions createJmlFuncProfileThrownExceptions() {
        return new JmlFuncProfile.ThrownExceptions();
    }

    /**
     * Create an instance of {@link SqmlCompatibility }
     * 
     */
    public SqmlCompatibility createSqmlCompatibility() {
        return new SqmlCompatibility();
    }

    /**
     * Create an instance of {@link TypeArguments }
     * 
     */
    public TypeArguments createTypeArguments() {
        return new TypeArguments();
    }

    /**
     * Create an instance of {@link MmlType }
     * 
     */
    public MmlType createMmlType() {
        return new MmlType();
    }

    /**
     * Create an instance of {@link MmlType.Item }
     * 
     */
    public MmlType.Item createMmlTypeItem() {
        return new MmlType.Item();
    }

    /**
     * Create an instance of {@link MmlType.Item.MmlTagTable }
     * 
     */
    public MmlType.Item.MmlTagTable createMmlTypeItemMmlTagTable() {
        return new MmlType.Item.MmlTagTable();
    }

    /**
     * Create an instance of {@link Sqml }
     * 
     */
    public Sqml createSqml() {
        return new Sqml();
    }

    /**
     * Create an instance of {@link Sqml.Item }
     * 
     */
    public Sqml.Item createSqmlItem() {
        return new Sqml.Item();
    }

    /**
     * Create an instance of {@link Sqml.Item.XPath }
     * 
     */
    public Sqml.Item.XPath createSqmlItemXPath() {
        return new Sqml.Item.XPath();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint }
     * 
     */
    public Sqml.Item.OracleHint createSqmlItemOracleHint() {
        return new Sqml.Item.OracleHint();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint.Items }
     * 
     */
    public Sqml.Item.OracleHint.Items createSqmlItemOracleHintItems() {
        return new Sqml.Item.OracleHint.Items();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint.Items.HintItem }
     * 
     */
    public Sqml.Item.OracleHint.Items.HintItem createSqmlItemOracleHintItemsHintItem() {
        return new Sqml.Item.OracleHint.Items.HintItem();
    }

    /**
     * Create an instance of {@link Sqml.Item.DbFuncCall }
     * 
     */
    public Sqml.Item.DbFuncCall createSqmlItemDbFuncCall() {
        return new Sqml.Item.DbFuncCall();
    }

    /**
     * Create an instance of {@link Sqml.Item.DbFuncCall.Params }
     * 
     */
    public Sqml.Item.DbFuncCall.Params createSqmlItemDbFuncCallParams() {
        return new Sqml.Item.DbFuncCall.Params();
    }

    /**
     * Create an instance of {@link Sqml.Item.TargetDbPreprocessor }
     * 
     */
    public Sqml.Item.TargetDbPreprocessor createSqmlItemTargetDbPreprocessor() {
        return new Sqml.Item.TargetDbPreprocessor();
    }

    /**
     * Create an instance of {@link JmlType }
     * 
     */
    public JmlType createJmlType() {
        return new JmlType();
    }

    /**
     * Create an instance of {@link JmlType.Item }
     * 
     */
    public JmlType.Item createJmlTypeItem() {
        return new JmlType.Item();
    }

    /**
     * Create an instance of {@link TypeDeclaration }
     * 
     */
    public TypeDeclaration createTypeDeclaration() {
        return new TypeDeclaration();
    }

    /**
     * Create an instance of {@link JmlTagItem }
     * 
     */
    public JmlTagItem createJmlTagItem() {
        return new JmlTagItem();
    }

    /**
     * Create an instance of {@link MmlTagItem }
     * 
     */
    public MmlTagItem createMmlTagItem() {
        return new MmlTagItem();
    }

    /**
     * Create an instance of {@link DocResource }
     * 
     */
    public DocResource createDocResource() {
        return new DocResource();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link TaskTagType }
     * 
     */
    public TaskTagType createTaskTagType() {
        return new TaskTagType();
    }

    /**
     * Create an instance of {@link JmlParameterDeclaration }
     * 
     */
    public JmlParameterDeclaration createJmlParameterDeclaration() {
        return new JmlParameterDeclaration();
    }

    /**
     * Create an instance of {@link JmlFuncProfile.Parameters }
     * 
     */
    public JmlFuncProfile.Parameters createJmlFuncProfileParameters() {
        return new JmlFuncProfile.Parameters();
    }

    /**
     * Create an instance of {@link JmlFuncProfile.ReturnType }
     * 
     */
    public JmlFuncProfile.ReturnType createJmlFuncProfileReturnType() {
        return new JmlFuncProfile.ReturnType();
    }

    /**
     * Create an instance of {@link JmlFuncProfile.ThrownExceptions.Exception }
     * 
     */
    public JmlFuncProfile.ThrownExceptions.Exception createJmlFuncProfileThrownExceptionsException() {
        return new JmlFuncProfile.ThrownExceptions.Exception();
    }

    /**
     * Create an instance of {@link SqmlCompatibility.Database }
     * 
     */
    public SqmlCompatibility.Database createSqmlCompatibilityDatabase() {
        return new SqmlCompatibility.Database();
    }

    /**
     * Create an instance of {@link TypeArguments.Argument }
     * 
     */
    public TypeArguments.Argument createTypeArgumentsArgument() {
        return new TypeArguments.Argument();
    }

    /**
     * Create an instance of {@link MmlType.Item.IdReference }
     * 
     */
    public MmlType.Item.IdReference createMmlTypeItemIdReference() {
        return new MmlType.Item.IdReference();
    }

    /**
     * Create an instance of {@link MmlType.Item.MarkdownImage }
     * 
     */
    public MmlType.Item.MarkdownImage createMmlTypeItemMarkdownImage() {
        return new MmlType.Item.MarkdownImage();
    }

    /**
     * Create an instance of {@link MmlType.Item.MarkdownRef }
     * 
     */
    public MmlType.Item.MarkdownRef createMmlTypeItemMarkdownRef() {
        return new MmlType.Item.MarkdownRef();
    }

    /**
     * Create an instance of {@link MmlType.Item.Comment }
     * 
     */
    public MmlType.Item.Comment createMmlTypeItemComment() {
        return new MmlType.Item.Comment();
    }

    /**
     * Create an instance of {@link MmlType.Item.MmlTagTable.MmlTagTableCell }
     * 
     */
    public MmlType.Item.MmlTagTable.MmlTagTableCell createMmlTypeItemMmlTagTableMmlTagTableCell() {
        return new MmlType.Item.MmlTagTable.MmlTagTableCell();
    }

    /**
     * Create an instance of {@link Sqml.Item.CalcField }
     * 
     */
    public Sqml.Item.CalcField createSqmlItemCalcField() {
        return new Sqml.Item.CalcField();
    }

    /**
     * Create an instance of {@link Sqml.Item.ConstValue }
     * 
     */
    public Sqml.Item.ConstValue createSqmlItemConstValue() {
        return new Sqml.Item.ConstValue();
    }

    /**
     * Create an instance of {@link Sqml.Item.DbName }
     * 
     */
    public Sqml.Item.DbName createSqmlItemDbName() {
        return new Sqml.Item.DbName();
    }

    /**
     * Create an instance of {@link Sqml.Item.IfParam }
     * 
     */
    public Sqml.Item.IfParam createSqmlItemIfParam() {
        return new Sqml.Item.IfParam();
    }

    /**
     * Create an instance of {@link Sqml.Item.ElseIf }
     * 
     */
    public Sqml.Item.ElseIf createSqmlItemElseIf() {
        return new Sqml.Item.ElseIf();
    }

    /**
     * Create an instance of {@link Sqml.Item.EndIf }
     * 
     */
    public Sqml.Item.EndIf createSqmlItemEndIf() {
        return new Sqml.Item.EndIf();
    }

    /**
     * Create an instance of {@link Sqml.Item.Id }
     * 
     */
    public Sqml.Item.Id createSqmlItemId() {
        return new Sqml.Item.Id();
    }

    /**
     * Create an instance of {@link Sqml.Item.IndexDbName }
     * 
     */
    public Sqml.Item.IndexDbName createSqmlItemIndexDbName() {
        return new Sqml.Item.IndexDbName();
    }

    /**
     * Create an instance of {@link Sqml.Item.Join }
     * 
     */
    public Sqml.Item.Join createSqmlItemJoin() {
        return new Sqml.Item.Join();
    }

    /**
     * Create an instance of {@link Sqml.Item.Parameter }
     * 
     */
    public Sqml.Item.Parameter createSqmlItemParameter() {
        return new Sqml.Item.Parameter();
    }

    /**
     * Create an instance of {@link Sqml.Item.ParamValCount }
     * 
     */
    public Sqml.Item.ParamValCount createSqmlItemParamValCount() {
        return new Sqml.Item.ParamValCount();
    }

    /**
     * Create an instance of {@link Sqml.Item.EntityRefParameter }
     * 
     */
    public Sqml.Item.EntityRefParameter createSqmlItemEntityRefParameter() {
        return new Sqml.Item.EntityRefParameter();
    }

    /**
     * Create an instance of {@link Sqml.Item.EntityRefValue }
     * 
     */
    public Sqml.Item.EntityRefValue createSqmlItemEntityRefValue() {
        return new Sqml.Item.EntityRefValue();
    }

    /**
     * Create an instance of {@link Sqml.Item.ParentCondition }
     * 
     */
    public Sqml.Item.ParentCondition createSqmlItemParentCondition() {
        return new Sqml.Item.ParentCondition();
    }

    /**
     * Create an instance of {@link Sqml.Item.ParentRefPropSqlName }
     * 
     */
    public Sqml.Item.ParentRefPropSqlName createSqmlItemParentRefPropSqlName() {
        return new Sqml.Item.ParentRefPropSqlName();
    }

    /**
     * Create an instance of {@link Sqml.Item.PropSqlName }
     * 
     */
    public Sqml.Item.PropSqlName createSqmlItemPropSqlName() {
        return new Sqml.Item.PropSqlName();
    }

    /**
     * Create an instance of {@link Sqml.Item.SequenceDbName }
     * 
     */
    public Sqml.Item.SequenceDbName createSqmlItemSequenceDbName() {
        return new Sqml.Item.SequenceDbName();
    }

    /**
     * Create an instance of {@link Sqml.Item.TableSqlName }
     * 
     */
    public Sqml.Item.TableSqlName createSqmlItemTableSqlName() {
        return new Sqml.Item.TableSqlName();
    }

    /**
     * Create an instance of {@link Sqml.Item.ThisTableRef }
     * 
     */
    public Sqml.Item.ThisTableRef createSqmlItemThisTableRef() {
        return new Sqml.Item.ThisTableRef();
    }

    /**
     * Create an instance of {@link Sqml.Item.TypifiedValue }
     * 
     */
    public Sqml.Item.TypifiedValue createSqmlItemTypifiedValue() {
        return new Sqml.Item.TypifiedValue();
    }

    /**
     * Create an instance of {@link Sqml.Item.TypifiedCalcField }
     * 
     */
    public Sqml.Item.TypifiedCalcField createSqmlItemTypifiedCalcField() {
        return new Sqml.Item.TypifiedCalcField();
    }

    /**
     * Create an instance of {@link Sqml.Item.Data }
     * 
     */
    public Sqml.Item.Data createSqmlItemData() {
        return new Sqml.Item.Data();
    }

    /**
     * Create an instance of {@link Sqml.Item.EventCode }
     * 
     */
    public Sqml.Item.EventCode createSqmlItemEventCode() {
        return new Sqml.Item.EventCode();
    }

    /**
     * Create an instance of {@link Sqml.Item.ReportColumnsVisibilityPreprocessor }
     * 
     */
    public Sqml.Item.ReportColumnsVisibilityPreprocessor createSqmlItemReportColumnsVisibilityPreprocessor() {
        return new Sqml.Item.ReportColumnsVisibilityPreprocessor();
    }

    /**
     * Create an instance of {@link Sqml.Item.XPath.XPathItem }
     * 
     */
    public Sqml.Item.XPath.XPathItem createSqmlItemXPathXPathItem() {
        return new Sqml.Item.XPath.XPathItem();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint.Items.HintItem.Index }
     * 
     */
    public Sqml.Item.OracleHint.Items.HintItem.Index createSqmlItemOracleHintItemsHintItemIndex() {
        return new Sqml.Item.OracleHint.Items.HintItem.Index();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint.Items.HintItem.FirstRow }
     * 
     */
    public Sqml.Item.OracleHint.Items.HintItem.FirstRow createSqmlItemOracleHintItemsHintItemFirstRow() {
        return new Sqml.Item.OracleHint.Items.HintItem.FirstRow();
    }

    /**
     * Create an instance of {@link Sqml.Item.OracleHint.Items.HintItem.AllRows }
     * 
     */
    public Sqml.Item.OracleHint.Items.HintItem.AllRows createSqmlItemOracleHintItemsHintItemAllRows() {
        return new Sqml.Item.OracleHint.Items.HintItem.AllRows();
    }

    /**
     * Create an instance of {@link Sqml.Item.DbFuncCall.Params.Param }
     * 
     */
    public Sqml.Item.DbFuncCall.Params.Param createSqmlItemDbFuncCallParamsParam() {
        return new Sqml.Item.DbFuncCall.Params.Param();
    }

    /**
     * Create an instance of {@link Sqml.Item.TargetDbPreprocessor.Option }
     * 
     */
    public Sqml.Item.TargetDbPreprocessor.Option createSqmlItemTargetDbPreprocessorOption() {
        return new Sqml.Item.TargetDbPreprocessor.Option();
    }

    /**
     * Create an instance of {@link JmlType.Item.Literal }
     * 
     */
    public JmlType.Item.Literal createJmlTypeItemLiteral() {
        return new JmlType.Item.Literal();
    }

    /**
     * Create an instance of {@link JmlType.Item.IdReference }
     * 
     */
    public JmlType.Item.IdReference createJmlTypeItemIdReference() {
        return new JmlType.Item.IdReference();
    }

    /**
     * Create an instance of {@link JmlType.Item.LocalizedString }
     * 
     */
    public JmlType.Item.LocalizedString createJmlTypeItemLocalizedString() {
        return new JmlType.Item.LocalizedString();
    }

    /**
     * Create an instance of {@link JmlType.Item.EventCode }
     * 
     */
    public JmlType.Item.EventCode createJmlTypeItemEventCode() {
        return new JmlType.Item.EventCode();
    }

    /**
     * Create an instance of {@link JmlType.Item.DbEntity }
     * 
     */
    public JmlType.Item.DbEntity createJmlTypeItemDbEntity() {
        return new JmlType.Item.DbEntity();
    }

    /**
     * Create an instance of {@link JmlType.Item.Pin }
     * 
     */
    public JmlType.Item.Pin createJmlTypeItemPin() {
        return new JmlType.Item.Pin();
    }

    /**
     * Create an instance of {@link JmlType.Item.Data }
     * 
     */
    public JmlType.Item.Data createJmlTypeItemData() {
        return new JmlType.Item.Data();
    }

    /**
     * Create an instance of {@link JmlType.Item.ReadLicense }
     * 
     */
    public JmlType.Item.ReadLicense createJmlTypeItemReadLicense() {
        return new JmlType.Item.ReadLicense();
    }

    /**
     * Create an instance of {@link JmlType.Item.CheckLicense }
     * 
     */
    public JmlType.Item.CheckLicense createJmlTypeItemCheckLicense() {
        return new JmlType.Item.CheckLicense();
    }

    /**
     * Create an instance of {@link JmlType.Item.ActionBlock }
     * 
     */
    public JmlType.Item.ActionBlock createJmlTypeItemActionBlock() {
        return new JmlType.Item.ActionBlock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JmlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JmlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/xscml.xsd", name = "Jml")
    public JAXBElement<JmlType> createJml(JmlType value) {
        return new JAXBElement<JmlType>(_Jml_QNAME, JmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sqml }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sqml }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/xscml.xsd", name = "Sqml")
    public JAXBElement<Sqml> createSqml(Sqml value) {
        return new JAXBElement<Sqml>(_Sqml_QNAME, Sqml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeDeclaration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeDeclaration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/xscml.xsd", name = "TypeDeclaration")
    public JAXBElement<TypeDeclaration> createTypeDeclaration(TypeDeclaration value) {
        return new JAXBElement<TypeDeclaration>(_TypeDeclaration_QNAME, TypeDeclaration.class, null, value);
    }

}
