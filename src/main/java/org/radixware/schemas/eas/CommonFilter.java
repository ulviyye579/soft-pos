
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.groupsettings.FilterParameters;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for CommonFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameters" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/xscml.xsd}Sqml"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="BaseFilterId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Title" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="LastUpdateTime" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFilter", propOrder = {
    "parameters",
    "condition"
})
public class CommonFilter {

    @XmlElement(name = "Parameters")
    protected FilterParameters parameters;
    @XmlElement(name = "Condition", required = true)
    protected Sqml condition;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "BaseFilterId")
    protected String baseFilterId;
    @XmlAttribute(name = "Title", required = true)
    protected String title;
    @XmlAttribute(name = "LastUpdateTime", required = true)
    protected long lastUpdateTime;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FilterParameters }
     *     
     */
    public FilterParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterParameters }
     *     
     */
    public void setParameters(FilterParameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Sqml }
     *     
     */
    public Sqml getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sqml }
     *     
     */
    public void setCondition(Sqml value) {
        this.condition = value;
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
     * Gets the value of the baseFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFilterId() {
        return baseFilterId;
    }

    /**
     * Sets the value of the baseFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFilterId(String value) {
        this.baseFilterId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     */
    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     */
    public void setLastUpdateTime(long value) {
        this.lastUpdateTime = value;
    }

}
