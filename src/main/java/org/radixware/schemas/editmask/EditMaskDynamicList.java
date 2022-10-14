
package org.radixware.schemas.editmask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskDynamicList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskDynamicList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UdfLibrary" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Udf" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedValues" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "EditMaskDynamicList", propOrder = {
    "udfLibrary",
    "udf",
    "excludedValues"
})
public class EditMaskDynamicList {

    @XmlElement(name = "UdfLibrary")
    protected String udfLibrary;
    @XmlElement(name = "Udf")
    protected String udf;
    @XmlElement(name = "ExcludedValues")
    protected EditMaskDynamicList.ExcludedValues excludedValues;

    /**
     * Gets the value of the udfLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdfLibrary() {
        return udfLibrary;
    }

    /**
     * Sets the value of the udfLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdfLibrary(String value) {
        this.udfLibrary = value;
    }

    /**
     * Gets the value of the udf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf() {
        return udf;
    }

    /**
     * Sets the value of the udf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf(String value) {
        this.udf = value;
    }

    /**
     * Gets the value of the excludedValues property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskDynamicList.ExcludedValues }
     *     
     */
    public EditMaskDynamicList.ExcludedValues getExcludedValues() {
        return excludedValues;
    }

    /**
     * Sets the value of the excludedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskDynamicList.ExcludedValues }
     *     
     */
    public void setExcludedValues(EditMaskDynamicList.ExcludedValues value) {
        this.excludedValues = value;
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
     *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded"/&gt;
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
        "value"
    })
    public static class ExcludedValues {

        @XmlElement(name = "Value", required = true)
        protected List<String> value;

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

    }

}
