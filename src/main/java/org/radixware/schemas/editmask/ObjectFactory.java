
package org.radixware.schemas.editmask;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.editmask package. 
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

    private final static QName _RadixEditMask_QNAME = new QName("http://schemas.radixware.org/editmask.xsd", "RadixEditMask");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.editmask
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditMaskDynamicList }
     * 
     */
    public EditMaskDynamicList createEditMaskDynamicList() {
        return new EditMaskDynamicList();
    }

    /**
     * Create an instance of {@link EditMaskFilePath }
     * 
     */
    public EditMaskFilePath createEditMaskFilePath() {
        return new EditMaskFilePath();
    }

    /**
     * Create an instance of {@link EditMaskFilePath.MimeTypeGroups }
     * 
     */
    public EditMaskFilePath.MimeTypeGroups createEditMaskFilePathMimeTypeGroups() {
        return new EditMaskFilePath.MimeTypeGroups();
    }

    /**
     * Create an instance of {@link EditMaskList }
     * 
     */
    public EditMaskList createEditMaskList() {
        return new EditMaskList();
    }

    /**
     * Create an instance of {@link EditMaskInt }
     * 
     */
    public EditMaskInt createEditMaskInt() {
        return new EditMaskInt();
    }

    /**
     * Create an instance of {@link EditMaskNum }
     * 
     */
    public EditMaskNum createEditMaskNum() {
        return new EditMaskNum();
    }

    /**
     * Create an instance of {@link EditMaskStr }
     * 
     */
    public EditMaskStr createEditMaskStr() {
        return new EditMaskStr();
    }

    /**
     * Create an instance of {@link EditMaskDateTime }
     * 
     */
    public EditMaskDateTime createEditMaskDateTime() {
        return new EditMaskDateTime();
    }

    /**
     * Create an instance of {@link EditMaskTimeInterval }
     * 
     */
    public EditMaskTimeInterval createEditMaskTimeInterval() {
        return new EditMaskTimeInterval();
    }

    /**
     * Create an instance of {@link EditMaskEnum }
     * 
     */
    public EditMaskEnum createEditMaskEnum() {
        return new EditMaskEnum();
    }

    /**
     * Create an instance of {@link EditMaskBool }
     * 
     */
    public EditMaskBool createEditMaskBool() {
        return new EditMaskBool();
    }

    /**
     * Create an instance of {@link EditMaskRef }
     * 
     */
    public EditMaskRef createEditMaskRef() {
        return new EditMaskRef();
    }

    /**
     * Create an instance of {@link EditMaskDictionary }
     * 
     */
    public EditMaskDictionary createEditMaskDictionary() {
        return new EditMaskDictionary();
    }

    /**
     * Create an instance of {@link EditMaskDynamicList.ExcludedValues }
     * 
     */
    public EditMaskDynamicList.ExcludedValues createEditMaskDynamicListExcludedValues() {
        return new EditMaskDynamicList.ExcludedValues();
    }

    /**
     * Create an instance of {@link EditMaskFilePath.MimeTypes }
     * 
     */
    public EditMaskFilePath.MimeTypes createEditMaskFilePathMimeTypes() {
        return new EditMaskFilePath.MimeTypes();
    }

    /**
     * Create an instance of {@link EditMaskFilePath.MimeTypeGroups.MimeTypeGroup }
     * 
     */
    public EditMaskFilePath.MimeTypeGroups.MimeTypeGroup createEditMaskFilePathMimeTypeGroupsMimeTypeGroup() {
        return new EditMaskFilePath.MimeTypeGroups.MimeTypeGroup();
    }

    /**
     * Create an instance of {@link EditMaskList.Item }
     * 
     */
    public EditMaskList.Item createEditMaskListItem() {
        return new EditMaskList.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditMask }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/editmask.xsd", name = "RadixEditMask")
    public JAXBElement<EditMask> createRadixEditMask(EditMask value) {
        return new JAXBElement<EditMask>(_RadixEditMask_QNAME, EditMask.class, null, value);
    }

}
