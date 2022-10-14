
package org.radixware.schemas.groupsettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="PropertyBasedParamter" type="{http://schemas.radixware.org/groupsettings.xsd}PropertyBasedFilterParameter" minOccurs="0"/&gt;
 *                   &lt;element name="CustomParameter" type="{http://schemas.radixware.org/groupsettings.xsd}CustomFilterParameter" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Values" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PersistentValue" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameterValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterParameters", propOrder = {
    "parameter",
    "values"
})
public class FilterParameters {

    @XmlElement(name = "Parameter")
    protected List<FilterParameters.Parameter> parameter;
    @XmlElement(name = "Values")
    protected FilterParameters.Values values;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterParameters.Parameter }
     * 
     * 
     */
    public List<FilterParameters.Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<FilterParameters.Parameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link FilterParameters.Values }
     *     
     */
    public FilterParameters.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterParameters.Values }
     *     
     */
    public void setValues(FilterParameters.Values value) {
        this.values = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="PropertyBasedParamter" type="{http://schemas.radixware.org/groupsettings.xsd}PropertyBasedFilterParameter" minOccurs="0"/&gt;
     *         &lt;element name="CustomParameter" type="{http://schemas.radixware.org/groupsettings.xsd}CustomFilterParameter" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "propertyBasedParamter",
        "customParameter"
    })
    public static class Parameter {

        @XmlElement(name = "PropertyBasedParamter")
        protected PropertyBasedFilterParameter propertyBasedParamter;
        @XmlElement(name = "CustomParameter")
        protected CustomFilterParameter customParameter;

        /**
         * Gets the value of the propertyBasedParamter property.
         * 
         * @return
         *     possible object is
         *     {@link PropertyBasedFilterParameter }
         *     
         */
        public PropertyBasedFilterParameter getPropertyBasedParamter() {
            return propertyBasedParamter;
        }

        /**
         * Sets the value of the propertyBasedParamter property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyBasedFilterParameter }
         *     
         */
        public void setPropertyBasedParamter(PropertyBasedFilterParameter value) {
            this.propertyBasedParamter = value;
        }

        /**
         * Gets the value of the customParameter property.
         * 
         * @return
         *     possible object is
         *     {@link CustomFilterParameter }
         *     
         */
        public CustomFilterParameter getCustomParameter() {
            return customParameter;
        }

        /**
         * Sets the value of the customParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomFilterParameter }
         *     
         */
        public void setCustomParameter(CustomFilterParameter value) {
            this.customParameter = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PersistentValue" type="{http://schemas.radixware.org/groupsettings.xsd}FilterParameterValue" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "persistentValue"
    })
    public static class Values {

        @XmlElement(name = "PersistentValue")
        protected List<FilterParameterValue> persistentValue;

        /**
         * Gets the value of the persistentValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the persistentValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersistentValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilterParameterValue }
         * 
         * 
         */
        public List<FilterParameterValue> getPersistentValue() {
            if (persistentValue == null) {
                persistentValue = new ArrayList<FilterParameterValue>();
            }
            return this.persistentValue;
        }

    }

}
