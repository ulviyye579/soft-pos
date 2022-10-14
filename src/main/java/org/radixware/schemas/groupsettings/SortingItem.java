
package org.radixware.schemas.groupsettings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Desc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortingItem")
public class SortingItem {

    @XmlAttribute(name = "PropId", required = true)
    protected String propId;
    @XmlAttribute(name = "Desc")
    protected Boolean desc;

    /**
     * Gets the value of the propId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropId() {
        return propId;
    }

    /**
     * Sets the value of the propId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropId(String value) {
        this.propId = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDesc() {
        if (desc == null) {
            return false;
        } else {
            return desc;
        }
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesc(Boolean value) {
        this.desc = value;
    }

}
