
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for InheritableList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InheritableList"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://schemas.tranzaxis.com/common-types.xsd&gt;List"&gt;
 *       &lt;attribute name="IsInherited" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritableList", propOrder = {
    "value"
})
public class InheritableList {

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "IsInherited")
    protected Boolean isInherited;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the isInherited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInherited() {
        return isInherited;
    }

    /**
     * Sets the value of the isInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInherited(Boolean value) {
        this.isInherited = value;
    }

}
