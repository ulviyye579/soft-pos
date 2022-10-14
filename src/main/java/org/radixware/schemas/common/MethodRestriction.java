
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParamTypes" type="{http://schemas.radixware.org/common.xsd}DataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTypes" type="{http://schemas.radixware.org/common.xsd}DataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StartFromClass" type="{http://schemas.radixware.org/common.xsd}JavaClass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Access"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/common.xsd}Access" /&gt;
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
@XmlType(name = "MethodRestriction", propOrder = {
    "paramTypes",
    "returnTypes",
    "startFromClass"
})
public class MethodRestriction {

    @XmlElement(name = "ParamTypes")
    protected List<DataType> paramTypes;
    @XmlElement(name = "ReturnTypes")
    protected List<DataType> returnTypes;
    @XmlElement(name = "StartFromClass")
    protected JavaClass startFromClass;
    @XmlAttribute(name = "Access")
    protected List<Long> access;
    @XmlAttribute(name = "Static")
    protected Boolean _static;

    /**
     * Gets the value of the paramTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataType }
     * 
     * 
     */
    public List<DataType> getParamTypes() {
        if (paramTypes == null) {
            paramTypes = new ArrayList<DataType>();
        }
        return this.paramTypes;
    }

    /**
     * Gets the value of the returnTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataType }
     * 
     * 
     */
    public List<DataType> getReturnTypes() {
        if (returnTypes == null) {
            returnTypes = new ArrayList<DataType>();
        }
        return this.returnTypes;
    }

    /**
     * Gets the value of the startFromClass property.
     * 
     * @return
     *     possible object is
     *     {@link JavaClass }
     *     
     */
    public JavaClass getStartFromClass() {
        return startFromClass;
    }

    /**
     * Sets the value of the startFromClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaClass }
     *     
     */
    public void setStartFromClass(JavaClass value) {
        this.startFromClass = value;
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
