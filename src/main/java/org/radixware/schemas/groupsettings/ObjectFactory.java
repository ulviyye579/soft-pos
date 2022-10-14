
package org.radixware.schemas.groupsettings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.groupsettings package. 
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

    private final static QName _Filter_QNAME = new QName("http://schemas.radixware.org/groupsettings.xsd", "Filter");
    private final static QName _Sorting_QNAME = new QName("http://schemas.radixware.org/groupsettings.xsd", "Sorting");
    private final static QName _ConvertFilterRs_QNAME = new QName("http://schemas.radixware.org/groupsettings.xsd", "ConvertFilterRs");
    private final static QName _FilterParameterValueValueAsStr_QNAME = new QName("http://schemas.radixware.org/groupsettings.xsd", "ValueAsStr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.groupsettings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilterParameters }
     * 
     */
    public FilterParameters createFilterParameters() {
        return new FilterParameters();
    }

    /**
     * Create an instance of {@link CustomFilter }
     * 
     */
    public CustomFilter createCustomFilter() {
        return new CustomFilter();
    }

    /**
     * Create an instance of {@link CustomFilters }
     * 
     */
    public CustomFilters createCustomFilters() {
        return new CustomFilters();
    }

    /**
     * Create an instance of {@link CustomSorting }
     * 
     */
    public CustomSorting createCustomSorting() {
        return new CustomSorting();
    }

    /**
     * Create an instance of {@link CustomSortings }
     * 
     */
    public CustomSortings createCustomSortings() {
        return new CustomSortings();
    }

    /**
     * Create an instance of {@link ConvertFilter }
     * 
     */
    public ConvertFilter createConvertFilter() {
        return new ConvertFilter();
    }

    /**
     * Create an instance of {@link PropertyBasedFilterParameter }
     * 
     */
    public PropertyBasedFilterParameter createPropertyBasedFilterParameter() {
        return new PropertyBasedFilterParameter();
    }

    /**
     * Create an instance of {@link CustomFilterParameter }
     * 
     */
    public CustomFilterParameter createCustomFilterParameter() {
        return new CustomFilterParameter();
    }

    /**
     * Create an instance of {@link FilterParameterValue }
     * 
     */
    public FilterParameterValue createFilterParameterValue() {
        return new FilterParameterValue();
    }

    /**
     * Create an instance of {@link SortingItem }
     * 
     */
    public SortingItem createSortingItem() {
        return new SortingItem();
    }

    /**
     * Create an instance of {@link FilterParameters.Parameter }
     * 
     */
    public FilterParameters.Parameter createFilterParametersParameter() {
        return new FilterParameters.Parameter();
    }

    /**
     * Create an instance of {@link FilterParameters.Values }
     * 
     */
    public FilterParameters.Values createFilterParametersValues() {
        return new FilterParameters.Values();
    }

    /**
     * Create an instance of {@link CustomFilter.PersistentValues }
     * 
     */
    public CustomFilter.PersistentValues createCustomFilterPersistentValues() {
        return new CustomFilter.PersistentValues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/groupsettings.xsd", name = "Filter")
    public JAXBElement<CustomFilter> createFilter(CustomFilter value) {
        return new JAXBElement<CustomFilter>(_Filter_QNAME, CustomFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomSorting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomSorting }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/groupsettings.xsd", name = "Sorting")
    public JAXBElement<CustomSorting> createSorting(CustomSorting value) {
        return new JAXBElement<CustomSorting>(_Sorting_QNAME, CustomSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/groupsettings.xsd", name = "ConvertFilterRs")
    public JAXBElement<ConvertFilter> createConvertFilterRs(ConvertFilter value) {
        return new JAXBElement<ConvertFilter>(_ConvertFilterRs_QNAME, ConvertFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/groupsettings.xsd", name = "ValueAsStr", scope = FilterParameterValue.class)
    public JAXBElement<String> createFilterParameterValueValueAsStr(String value) {
        return new JAXBElement<String>(_FilterParameterValueValueAsStr_QNAME, String.class, FilterParameterValue.class, value);
    }

}
