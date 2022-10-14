
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTitlesRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTitlesRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTitlesRq", propOrder = {
    "entity",
    "context",
    "index",
    "key"
})
public class ObjectTitlesRq {

    @XmlElement(name = "Entity", required = true)
    protected Definition entity;
    @XmlElement(name = "Context")
    protected Context context;
    @XmlElement(name = "Index")
    protected Definition index;
    @XmlElement(name = "Key", required = true)
    protected List<String> key;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setEntity(Definition value) {
        this.entity = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setIndex(Definition value) {
        this.index = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKey() {
        if (key == null) {
            key = new ArrayList<String>();
        }
        return this.key;
    }

}
