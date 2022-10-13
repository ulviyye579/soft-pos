
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomAttrsDynamicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomAttrsDynamicData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectTitles" type="{http://schemas.radixware.org/eas.xsd}ObjectTitlesRs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentDictionary" type="{http://schemas.radixware.org/eas.xsd}ParentDictionaryRs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DynamicList" type="{http://schemas.radixware.org/eas.xsd}DynamicListRs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomAttrsDynamicData", propOrder = {
    "objectTitles",
    "parentDictionary",
    "dynamicList"
})
public class CustomAttrsDynamicData {

    @XmlElement(name = "ObjectTitles")
    protected List<ObjectTitlesRs> objectTitles;
    @XmlElement(name = "ParentDictionary")
    protected List<ParentDictionaryRs> parentDictionary;
    @XmlElement(name = "DynamicList")
    protected List<DynamicListRs> dynamicList;

    /**
     * Gets the value of the objectTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectTitlesRs }
     * 
     * 
     */
    public List<ObjectTitlesRs> getObjectTitles() {
        if (objectTitles == null) {
            objectTitles = new ArrayList<ObjectTitlesRs>();
        }
        return this.objectTitles;
    }

    /**
     * Gets the value of the parentDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentDictionaryRs }
     * 
     * 
     */
    public List<ParentDictionaryRs> getParentDictionary() {
        if (parentDictionary == null) {
            parentDictionary = new ArrayList<ParentDictionaryRs>();
        }
        return this.parentDictionary;
    }

    /**
     * Gets the value of the dynamicList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicListRs }
     * 
     * 
     */
    public List<DynamicListRs> getDynamicList() {
        if (dynamicList == null) {
            dynamicList = new ArrayList<DynamicListRs>();
        }
        return this.dynamicList;
    }

}
