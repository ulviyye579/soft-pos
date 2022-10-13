
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Types" type="{http://schemas.radixware.org/common.xsd}DataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Access"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/common.xsd}Access" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Nature"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/common.xsd}PropNature" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Static" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyRestriction", propOrder = {
    "types"
})
public class PropertyRestriction {

    @XmlElement(name = "Types")
    protected List<DataType> types;
    @XmlAttribute(name = "Access")
    protected List<Long> access;
    @XmlAttribute(name = "Nature")
    protected List<Long> nature;
    @XmlAttribute(name = "Static")
    protected Boolean _static;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataType }
     * 
     * 
     */
    public List<DataType> getTypes() {
        if (types == null) {
            types = new ArrayList<DataType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the access property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the access property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAccess() {
        if (access == null) {
            access = new ArrayList<Long>();
        }
        return this.access;
    }

    /**
     * Gets the value of the nature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNature() {
        if (nature == null) {
            nature = new ArrayList<Long>();
        }
        return this.nature;
    }

    /**
     * Gets the value of the static property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatic(Boolean value) {
        this._static = value;
    }

}
