
package org.radixware.schemas.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.common package. 
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

    private final static QName _ParamsBindingList_QNAME = new QName("http://schemas.radixware.org/common.xsd", "ParamsBindingList");
    private final static QName _UserFunc_QNAME = new QName("http://schemas.radixware.org/common.xsd", "UserFunc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserFunc }
     * 
     */
    public UserFunc createUserFunc() {
        return new UserFunc();
    }

    /**
     * Create an instance of {@link UserFunc.Binding }
     * 
     */
    public UserFunc.Binding createUserFuncBinding() {
        return new UserFunc.Binding();
    }

    /**
     * Create an instance of {@link UserFunc.Binding.LinkedFunctions }
     * 
     */
    public UserFunc.Binding.LinkedFunctions createUserFuncBindingLinkedFunctions() {
        return new UserFunc.Binding.LinkedFunctions();
    }

    /**
     * Create an instance of {@link UserProp }
     * 
     */
    public UserProp createUserProp() {
        return new UserProp();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link ArrayStr }
     * 
     */
    public ArrayStr createArrayStr() {
        return new ArrayStr();
    }

    /**
     * Create an instance of {@link ArrayStr.Values }
     * 
     */
    public ArrayStr.Values createArrayStrValues() {
        return new ArrayStr.Values();
    }

    /**
     * Create an instance of {@link MethodInfo }
     * 
     */
    public MethodInfo createMethodInfo() {
        return new MethodInfo();
    }

    /**
     * Create an instance of {@link ParamsBindingList }
     * 
     */
    public ParamsBindingList createParamsBindingList() {
        return new ParamsBindingList();
    }

    /**
     * Create an instance of {@link DomainList }
     * 
     */
    public DomainList createDomainList() {
        return new DomainList();
    }

    /**
     * Create an instance of {@link Domain }
     * 
     */
    public Domain createDomain() {
        return new Domain();
    }

    /**
     * Create an instance of {@link JavaClass }
     * 
     */
    public JavaClass createJavaClass() {
        return new JavaClass();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link ClassInfo }
     * 
     */
    public ClassInfo createClassInfo() {
        return new ClassInfo();
    }

    /**
     * Create an instance of {@link ClassRestriction }
     * 
     */
    public ClassRestriction createClassRestriction() {
        return new ClassRestriction();
    }

    /**
     * Create an instance of {@link ClassList }
     * 
     */
    public ClassList createClassList() {
        return new ClassList();
    }

    /**
     * Create an instance of {@link MethodRestriction }
     * 
     */
    public MethodRestriction createMethodRestriction() {
        return new MethodRestriction();
    }

    /**
     * Create an instance of {@link MethodList }
     * 
     */
    public MethodList createMethodList() {
        return new MethodList();
    }

    /**
     * Create an instance of {@link PropertyInfo }
     * 
     */
    public PropertyInfo createPropertyInfo() {
        return new PropertyInfo();
    }

    /**
     * Create an instance of {@link PropertyList }
     * 
     */
    public PropertyList createPropertyList() {
        return new PropertyList();
    }

    /**
     * Create an instance of {@link PropertyRestriction }
     * 
     */
    public PropertyRestriction createPropertyRestriction() {
        return new PropertyRestriction();
    }

    /**
     * Create an instance of {@link EditableProperty }
     * 
     */
    public EditableProperty createEditableProperty() {
        return new EditableProperty();
    }

    /**
     * Create an instance of {@link EditableProperties }
     * 
     */
    public EditableProperties createEditableProperties() {
        return new EditableProperties();
    }

    /**
     * Create an instance of {@link MoneyValue }
     * 
     */
    public MoneyValue createMoneyValue() {
        return new MoneyValue();
    }

    /**
     * Create an instance of {@link UserProps }
     * 
     */
    public UserProps createUserProps() {
        return new UserProps();
    }

    /**
     * Create an instance of {@link ImpExpEntity }
     * 
     */
    public ImpExpEntity createImpExpEntity() {
        return new ImpExpEntity();
    }

    /**
     * Create an instance of {@link UserFunc.Binding.LinkedFunctions.Function }
     * 
     */
    public UserFunc.Binding.LinkedFunctions.Function createUserFuncBindingLinkedFunctionsFunction() {
        return new UserFunc.Binding.LinkedFunctions.Function();
    }

    /**
     * Create an instance of {@link UserProp.Obj }
     * 
     */
    public UserProp.Obj createUserPropObj() {
        return new UserProp.Obj();
    }

    /**
     * Create an instance of {@link Map.Entry }
     * 
     */
    public Map.Entry createMapEntry() {
        return new Map.Entry();
    }

    /**
     * Create an instance of {@link ArrayStr.Values.Item }
     * 
     */
    public ArrayStr.Values.Item createArrayStrValuesItem() {
        return new ArrayStr.Values.Item();
    }

    /**
     * Create an instance of {@link MethodInfo.Parameter }
     * 
     */
    public MethodInfo.Parameter createMethodInfoParameter() {
        return new MethodInfo.Parameter();
    }

    /**
     * Create an instance of {@link ParamsBindingList.Bindings }
     * 
     */
    public ParamsBindingList.Bindings createParamsBindingListBindings() {
        return new ParamsBindingList.Bindings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsBindingList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamsBindingList }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/common.xsd", name = "ParamsBindingList")
    public JAXBElement<ParamsBindingList> createParamsBindingList(ParamsBindingList value) {
        return new JAXBElement<ParamsBindingList>(_ParamsBindingList_QNAME, ParamsBindingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/common.xsd", name = "UserFunc")
    public JAXBElement<UserFunc> createUserFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_UserFunc_QNAME, UserFunc.class, null, value);
    }

}
