
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for UserProp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SafeValue" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Func" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="Obj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;anyAttribute processContents='skip'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="OwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProp", propOrder = {
    "safeValue",
    "value",
    "func",
    "obj"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.UserProp.class
})
public class UserProp {

    @XmlElement(name = "SafeValue")
    protected String safeValue;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Func")
    protected UserFunc func;
    @XmlElement(name = "Obj")
    protected UserProp.Obj obj;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "OwnVal")
    protected Boolean ownVal;

    /**
     * Gets the value of the safeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeValue() {
        return safeValue;
    }

    /**
     * Sets the value of the safeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeValue(String value) {
        this.safeValue = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the func property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getFunc() {
        return func;
    }

    /**
     * Sets the value of the func property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setFunc(UserFunc value) {
        this.func = value;
    }

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link UserProp.Obj }
     *     
     */
    public UserProp.Obj getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProp.Obj }
     *     
     */
    public void setObj(UserProp.Obj value) {
        this.obj = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ownVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwnVal() {
        if (ownVal == null) {
            return true;
        } else {
            return ownVal;
        }
    }

    /**
     * Sets the value of the ownVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnVal(Boolean value) {
        this.ownVal = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;anyAttribute processContents='skip'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Obj {

        @XmlAnyElement
        protected List<Element> any;
        @XmlAttribute(name = "ClassId", required = true)
        protected String classId;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

        /**
         * Gets the value of the classId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassId() {
            return classId;
        }

        /**
         * Sets the value of the classId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassId(String value) {
            this.classId = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
