
package org.radixware.schemas.utils;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.utils package. 
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

    private final static QName _RPCRequest_QNAME = new QName("http://schemas.radixware.org/utils.xsd", "RPCRequest");
    private final static QName _RPCResponse_QNAME = new QName("http://schemas.radixware.org/utils.xsd", "RPCResponse");
    private final static QName _Instance_QNAME = new QName("http://schemas.radixware.org/utils.xsd", "Instance");
    private final static QName _Instance2_QNAME = new QName("http://schemas.radixware.org/utils.xsd", "Instance2");
    private final static QName _RadixTypeTestTypeTestNillableSimpleList_QNAME = new QName("http://schemas.radixware.org/utils.xsd", "TestNillableSimpleList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.utils
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Names }
     * 
     */
    public Names createNames() {
        return new Names();
    }

    /**
     * Create an instance of {@link ExtSnapshotNode }
     * 
     */
    public ExtSnapshotNode createExtSnapshotNode() {
        return new ExtSnapshotNode();
    }

    /**
     * Create an instance of {@link ExtSnapshotTable }
     * 
     */
    public ExtSnapshotTable createExtSnapshotTable() {
        return new ExtSnapshotTable();
    }

    /**
     * Create an instance of {@link ExtSnapshotTable.Rows }
     * 
     */
    public ExtSnapshotTable.Rows createExtSnapshotTableRows() {
        return new ExtSnapshotTable.Rows();
    }

    /**
     * Create an instance of {@link ExtSnapshotTableHeader }
     * 
     */
    public ExtSnapshotTableHeader createExtSnapshotTableHeader() {
        return new ExtSnapshotTableHeader();
    }

    /**
     * Create an instance of {@link Names.Layer }
     * 
     */
    public Names.Layer createNamesLayer() {
        return new Names.Layer();
    }

    /**
     * Create an instance of {@link Names.Layer.Module }
     * 
     */
    public Names.Layer.Module createNamesLayerModule() {
        return new Names.Layer.Module();
    }

    /**
     * Create an instance of {@link Names.Layer.Module.Class }
     * 
     */
    public Names.Layer.Module.Class createNamesLayerModuleClass() {
        return new Names.Layer.Module.Class();
    }

    /**
     * Create an instance of {@link RPCResponseType }
     * 
     */
    public RPCResponseType createRPCResponseType() {
        return new RPCResponseType();
    }

    /**
     * Create an instance of {@link RPCRequestType }
     * 
     */
    public RPCRequestType createRPCRequestType() {
        return new RPCRequestType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Type2 }
     * 
     */
    public Type2 createType2() {
        return new Type2();
    }

    /**
     * Create an instance of {@link RadixTypeTestType }
     * 
     */
    public RadixTypeTestType createRadixTypeTestType() {
        return new RadixTypeTestType();
    }

    /**
     * Create an instance of {@link NamedElement }
     * 
     */
    public NamedElement createNamedElement() {
        return new NamedElement();
    }

    /**
     * Create an instance of {@link SuppressedWarning }
     * 
     */
    public SuppressedWarning createSuppressedWarning() {
        return new SuppressedWarning();
    }

    /**
     * Create an instance of {@link ExtSnapshotTableColumn }
     * 
     */
    public ExtSnapshotTableColumn createExtSnapshotTableColumn() {
        return new ExtSnapshotTableColumn();
    }

    /**
     * Create an instance of {@link ExtSnapshotTableCell }
     * 
     */
    public ExtSnapshotTableCell createExtSnapshotTableCell() {
        return new ExtSnapshotTableCell();
    }

    /**
     * Create an instance of {@link ExtSnapshot }
     * 
     */
    public ExtSnapshot createExtSnapshot() {
        return new ExtSnapshot();
    }

    /**
     * Create an instance of {@link ExtSnapshots }
     * 
     */
    public ExtSnapshots createExtSnapshots() {
        return new ExtSnapshots();
    }

    /**
     * Create an instance of {@link ExtSnapshotNode.Children }
     * 
     */
    public ExtSnapshotNode.Children createExtSnapshotNodeChildren() {
        return new ExtSnapshotNode.Children();
    }

    /**
     * Create an instance of {@link ExtSnapshotTable.Rows.Row }
     * 
     */
    public ExtSnapshotTable.Rows.Row createExtSnapshotTableRowsRow() {
        return new ExtSnapshotTable.Rows.Row();
    }

    /**
     * Create an instance of {@link ExtSnapshotTableHeader.Columns }
     * 
     */
    public ExtSnapshotTableHeader.Columns createExtSnapshotTableHeaderColumns() {
        return new ExtSnapshotTableHeader.Columns();
    }

    /**
     * Create an instance of {@link Names.Layer.Module.Class.Method }
     * 
     */
    public Names.Layer.Module.Class.Method createNamesLayerModuleClassMethod() {
        return new Names.Layer.Module.Class.Method();
    }

    /**
     * Create an instance of {@link RPCResponseType.Result }
     * 
     */
    public RPCResponseType.Result createRPCResponseTypeResult() {
        return new RPCResponseType.Result();
    }

    /**
     * Create an instance of {@link RPCRequestType.Arg }
     * 
     */
    public RPCRequestType.Arg createRPCRequestTypeArg() {
        return new RPCRequestType.Arg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RPCRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RPCRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/utils.xsd", name = "RPCRequest")
    public JAXBElement<RPCRequestType> createRPCRequest(RPCRequestType value) {
        return new JAXBElement<RPCRequestType>(_RPCRequest_QNAME, RPCRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RPCResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RPCResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/utils.xsd", name = "RPCResponse")
    public JAXBElement<RPCResponseType> createRPCResponse(RPCResponseType value) {
        return new JAXBElement<RPCResponseType>(_RPCResponse_QNAME, RPCResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/utils.xsd", name = "Instance")
    public JAXBElement<Type> createInstance(Type value) {
        return new JAXBElement<Type>(_Instance_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Type2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/utils.xsd", name = "Instance2")
    public JAXBElement<Type2> createInstance2(Type2 value) {
        return new JAXBElement<Type2>(_Instance2_QNAME, Type2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/utils.xsd", name = "TestNillableSimpleList", scope = RadixTypeTestType.class)
    public JAXBElement<List<Long>> createRadixTypeTestTypeTestNillableSimpleList(List<Long> value) {
        return new JAXBElement<List<Long>>(_RadixTypeTestTypeTestNillableSimpleList_QNAME, ((java.lang.Class) List.class), RadixTypeTestType.class, ((List<Long> ) value));
    }

}
