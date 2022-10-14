
package org.radixware.schemas.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.types package. 
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

    private final static QName _Bool_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Bool");
    private final static QName _Char_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Char");
    private final static QName _Num_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Num");
    private final static QName _Int_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Int");
    private final static QName _Str_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Str");
    private final static QName _SafeStr_QNAME = new QName("http://schemas.radixware.org/types.xsd", "SafeStr");
    private final static QName _Id_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Id");
    private final static QName _DateTime_QNAME = new QName("http://schemas.radixware.org/types.xsd", "DateTime");
    private final static QName _BinBase64_QNAME = new QName("http://schemas.radixware.org/types.xsd", "BinBase64");
    private final static QName _BinHex_QNAME = new QName("http://schemas.radixware.org/types.xsd", "BinHex");
    private final static QName _MapStrStr_QNAME = new QName("http://schemas.radixware.org/types.xsd", "MapStrStr");
    private final static QName _MapStrMapStrStr_QNAME = new QName("http://schemas.radixware.org/types.xsd", "MapStrMapStrStr");
    private final static QName _XmlAnyType_QNAME = new QName("http://schemas.radixware.org/types.xsd", "XmlAnyType");
    private final static QName _Void_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Void");
    private final static QName _Reference_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Reference");
    private final static QName _ArrRef_QNAME = new QName("http://schemas.radixware.org/types.xsd", "ArrRef");
    private final static QName _Record_QNAME = new QName("http://schemas.radixware.org/types.xsd", "Record");
    private final static QName _ArrRec_QNAME = new QName("http://schemas.radixware.org/types.xsd", "ArrRec");
    private final static QName _ArrStr_QNAME = new QName("http://schemas.radixware.org/types.xsd", "ArrStr");
    private final static QName _RecordFieldValAsStr_QNAME = new QName("http://schemas.radixware.org/types.xsd", "ValAsStr");
    private final static QName _RecordFieldXmlVal_QNAME = new QName("http://schemas.radixware.org/types.xsd", "XmlVal");
    private final static QName _RecordFieldInnerRecord_QNAME = new QName("http://schemas.radixware.org/types.xsd", "InnerRecord");
    private final static QName _RecordFieldArrRecord_QNAME = new QName("http://schemas.radixware.org/types.xsd", "ArrRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapStrMapStrStr }
     * 
     */
    public MapStrMapStrStr createMapStrMapStrStr() {
        return new MapStrMapStrStr();
    }

    /**
     * Create an instance of {@link MapStrStr }
     * 
     */
    public MapStrStr createMapStrStr() {
        return new MapStrStr();
    }

    /**
     * Create an instance of {@link Void }
     * 
     */
    public Void createVoid() {
        return new Void();
    }

    /**
     * Create an instance of {@link EntityObjectRef }
     * 
     */
    public EntityObjectRef createEntityObjectRef() {
        return new EntityObjectRef();
    }

    /**
     * Create an instance of {@link ArrEntityObjectRef }
     * 
     */
    public ArrEntityObjectRef createArrEntityObjectRef() {
        return new ArrEntityObjectRef();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link ArrRec }
     * 
     */
    public ArrRec createArrRec() {
        return new ArrRec();
    }

    /**
     * Create an instance of {@link ArrStr }
     * 
     */
    public ArrStr createArrStr() {
        return new ArrStr();
    }

    /**
     * Create an instance of {@link RecordField }
     * 
     */
    public RecordField createRecordField() {
        return new RecordField();
    }

    /**
     * Create an instance of {@link MapStrMapStrStr.Entry }
     * 
     */
    public MapStrMapStrStr.Entry createMapStrMapStrStrEntry() {
        return new MapStrMapStrStr.Entry();
    }

    /**
     * Create an instance of {@link MapStrStr.Entry }
     * 
     */
    public MapStrStr.Entry createMapStrStrEntry() {
        return new MapStrStr.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Bool")
    public JAXBElement<Boolean> createBool(Boolean value) {
        return new JAXBElement<Boolean>(_Bool_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Char")
    public JAXBElement<String> createChar(String value) {
        return new JAXBElement<String>(_Char_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Num")
    public JAXBElement<BigDecimal> createNum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Num_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Int")
    public JAXBElement<Long> createInt(Long value) {
        return new JAXBElement<Long>(_Int_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Str")
    public JAXBElement<String> createStr(String value) {
        return new JAXBElement<String>(_Str_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "SafeStr")
    public JAXBElement<String> createSafeStr(String value) {
        return new JAXBElement<String>(_SafeStr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "DateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "BinBase64")
    public JAXBElement<byte[]> createBinBase64(byte[] value) {
        return new JAXBElement<byte[]>(_BinBase64_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "BinHex")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createBinHex(byte[] value) {
        return new JAXBElement<byte[]>(_BinHex_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapStrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MapStrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "MapStrStr")
    public JAXBElement<MapStrStr> createMapStrStr(MapStrStr value) {
        return new JAXBElement<MapStrStr>(_MapStrStr_QNAME, MapStrStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapStrMapStrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MapStrMapStrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "MapStrMapStrStr")
    public JAXBElement<MapStrMapStrStr> createMapStrMapStrStr(MapStrMapStrStr value) {
        return new JAXBElement<MapStrMapStrStr>(_MapStrMapStrStr_QNAME, MapStrMapStrStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "XmlAnyType")
    public JAXBElement<Object> createXmlAnyType(Object value) {
        return new JAXBElement<Object>(_XmlAnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Void }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Void")
    public JAXBElement<Void> createVoid(Void value) {
        return new JAXBElement<Void>(_Void_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityObjectRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityObjectRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Reference")
    public JAXBElement<EntityObjectRef> createReference(EntityObjectRef value) {
        return new JAXBElement<EntityObjectRef>(_Reference_QNAME, EntityObjectRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrEntityObjectRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrEntityObjectRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "ArrRef")
    public JAXBElement<ArrEntityObjectRef> createArrRef(ArrEntityObjectRef value) {
        return new JAXBElement<ArrEntityObjectRef>(_ArrRef_QNAME, ArrEntityObjectRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Record }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Record }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "Record")
    public JAXBElement<Record> createRecord(Record value) {
        return new JAXBElement<Record>(_Record_QNAME, Record.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "ArrRec")
    public JAXBElement<ArrRec> createArrRec(ArrRec value) {
        return new JAXBElement<ArrRec>(_ArrRec_QNAME, ArrRec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "ArrStr")
    public JAXBElement<ArrStr> createArrStr(ArrStr value) {
        return new JAXBElement<ArrStr>(_ArrStr_QNAME, ArrStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "ValAsStr", scope = RecordField.class)
    public JAXBElement<String> createRecordFieldValAsStr(String value) {
        return new JAXBElement<String>(_RecordFieldValAsStr_QNAME, String.class, RecordField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "XmlVal", scope = RecordField.class)
    public JAXBElement<Object> createRecordFieldXmlVal(Object value) {
        return new JAXBElement<Object>(_RecordFieldXmlVal_QNAME, Object.class, RecordField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Record }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Record }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "InnerRecord", scope = RecordField.class)
    public JAXBElement<Record> createRecordFieldInnerRecord(Record value) {
        return new JAXBElement<Record>(_RecordFieldInnerRecord_QNAME, Record.class, RecordField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/types.xsd", name = "ArrRecord", scope = RecordField.class)
    public JAXBElement<ArrRec> createRecordFieldArrRecord(ArrRec value) {
        return new JAXBElement<ArrRec>(_RecordFieldArrRecord_QNAME, ArrRec.class, RecordField.class, value);
    }

}
