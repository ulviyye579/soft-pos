
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTitlesRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTitlesRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/eas.xsd}ObjectTitle" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTitlesRs", propOrder = {
    "entity",
    "context",
    "index",
    "objectTitle"
})
public class ObjectTitlesRs {

    @XmlElement(name = "Entity", required = true)
    protected Definition entity;
    @XmlElement(name = "Context")
    protected Context context;
    @XmlElement(name = "Index")
    protected Definition index;
    @XmlElement(name = "ObjectTitle", required = true)
    protected List<ObjectTitle> objectTitle;

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
     * Gets the value of the objectTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectTitle }
     * 
     * 
     */
    public List<ObjectTitle> getObjectTitle() {
        if (objectTitle == null) {
            objectTitle = new ArrayList<ObjectTitle>();
        }
        return this.objectTitle;
    }

}
