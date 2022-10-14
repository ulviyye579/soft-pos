
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * \u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u043c\u044b\u0439 \u0444\u0438\u043b\u044c\u0442\u0440
 * 
 * <p>Java class for Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalCondition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="LastUpdateTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filter", propOrder = {
    "additionalCondition",
    "parameters"
})
@XmlSeeAlso({
    org.radixware.schemas.eas.Context.TreePath.FilterList.Filter.class
})
public class Filter {

    @XmlElement(name = "AdditionalCondition")
    protected Sqml additionalCondition;
    @XmlElement(name = "Parameters")
    protected PropertyList parameters;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "LastUpdateTime")
    protected Long lastUpdateTime;

    /**
     * Gets the value of the additionalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Sqml }
     *     
     */
    public Sqml getAdditionalCondition() {
        return additionalCondition;
    }

    /**
     * Sets the value of the additionalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sqml }
     *     
     */
    public void setAdditionalCondition(Sqml value) {
        this.additionalCondition = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setParameters(PropertyList value) {
        this.parameters = value;
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
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastUpdateTime(Long value) {
        this.lastUpdateTime = value;
    }

}
