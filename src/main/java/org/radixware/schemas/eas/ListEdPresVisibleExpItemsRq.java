
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListEdPresVisibleExpItemsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListEdPresVisibleExpItemsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context"/&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListEdPresVisibleExpItemsRq", propOrder = {
    "rest"
})
public class ListEdPresVisibleExpItemsRq
    extends ObjectRequest
{

    @XmlElementRefs({
        @XmlElementRef(name = "Context", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Presentation", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Context" is used by two different parts of a schema. See: 
     * line 4270 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/eas.xsd
     * line 1649 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/eas.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Context }{@code >}
     * {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
