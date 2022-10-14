
package org.radixware.schemas.adsdef;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.adsdef package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.adsdef
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocalizedString }
     * 
     */
    public LocalizedString createLocalizedString() {
        return new LocalizedString();
    }

    /**
     * Create an instance of {@link LocalizingBundleDefinition }
     * 
     */
    public LocalizingBundleDefinition createLocalizingBundleDefinition() {
        return new LocalizingBundleDefinition();
    }

    /**
     * Create an instance of {@link LocalizedString.Value }
     * 
     */
    public LocalizedString.Value createLocalizedStringValue() {
        return new LocalizedString.Value();
    }

}
