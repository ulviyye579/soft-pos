
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomAttrsDynamicDataRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomAttrsDynamicDataRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectTitlesRq" type="{http://schemas.radixware.org/eas.xsd}ObjectTitlesRq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DynamicListRq" type="{http://schemas.radixware.org/eas.xsd}DynamicListRq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentDictionaryRq" type="{http://schemas.radixware.org/eas.xsd}ParentDictionaryRq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomAttrsDynamicDataRq", propOrder = {
    "objectTitlesRq",
    "dynamicListRq",
    "parentDictionaryRq"
})
public class GetCustomAttrsDynamicDataRq
    extends Request
{

    @XmlElement(name = "ObjectTitlesRq")
    protected List<ObjectTitlesRq> objectTitlesRq;
    @XmlElement(name = "DynamicListRq")
    protected List<DynamicListRq> dynamicListRq;
    @XmlElement(name = "ParentDictionaryRq")
    protected List<ParentDictionaryRq> parentDictionaryRq;

    /**
     * Gets the value of the objectTitlesRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTitlesRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTitlesRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectTitlesRq }
     * 
     * 
     */
    public List<ObjectTitlesRq> getObjectTitlesRq() {
        if (objectTitlesRq == null) {
            objectTitlesRq = new ArrayList<ObjectTitlesRq>();
        }
        return this.objectTitlesRq;
    }

    /**
     * Gets the value of the dynamicListRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicListRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicListRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicListRq }
     * 
     * 
     */
    public List<DynamicListRq> getDynamicListRq() {
        if (dynamicListRq == null) {
            dynamicListRq = new ArrayList<DynamicListRq>();
        }
        return this.dynamicListRq;
    }

    /**
     * Gets the value of the parentDictionaryRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentDictionaryRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentDictionaryRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentDictionaryRq }
     * 
     * 
     */
    public List<ParentDictionaryRq> getParentDictionaryRq() {
        if (parentDictionaryRq == null) {
            parentDictionaryRq = new ArrayList<ParentDictionaryRq>();
        }
        return this.parentDictionaryRq;
    }

}
