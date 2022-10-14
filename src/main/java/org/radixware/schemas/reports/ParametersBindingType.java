
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.eas.Property;


/**
 * <p>Java class for ParametersBindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametersBindingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ParameterBinding" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="ExternalValue"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Value" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="OwnerPID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *                             &lt;attribute name="OwnerClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;attribute name="OwnerExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                             &lt;attribute name="IsUpOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Value" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
 *                     &lt;element name="Parameter" type="{http://schemas.radixware.org/types.xsd}Id" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ParameterId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="Type" default="Value"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Final" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="Restriction"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametersBindingType", propOrder = {
    "parameterBinding"
})
public class ParametersBindingType {

    @XmlElement(name = "ParameterBinding")
    protected List<ParametersBindingType.ParameterBinding> parameterBinding;

    /**
     * Gets the value of the parameterBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersBindingType.ParameterBinding }
     * 
     * 
     */
    public List<ParametersBindingType.ParameterBinding> getParameterBinding() {
        if (parameterBinding == null) {
            parameterBinding = new ArrayList<ParametersBindingType.ParameterBinding>();
        }
        return this.parameterBinding;
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
     *         &lt;choice&gt;
     *           &lt;element name="ExternalValue"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Value" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="OwnerPID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
     *                   &lt;attribute name="OwnerClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="OwnerExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                   &lt;attribute name="IsUpOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Value" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
     *           &lt;element name="Parameter" type="{http://schemas.radixware.org/types.xsd}Id" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ParameterId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="Type" default="Value"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Final" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="Restriction"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "externalValue",
        "value",
        "parameter"
    })
    public static class ParameterBinding {

        @XmlElement(name = "ExternalValue")
        protected ParametersBindingType.ParameterBinding.ExternalValue externalValue;
        @XmlElement(name = "Value")
        protected Property value;
        @XmlElement(name = "Parameter")
        protected String parameter;
        @XmlAttribute(name = "ParameterId", required = true)
        protected String parameterId;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Final")
        protected Boolean _final;
        @XmlAttribute(name = "Restriction")
        protected String restriction;

        /**
         * Gets the value of the externalValue property.
         * 
         * @return
         *     possible object is
         *     {@link ParametersBindingType.ParameterBinding.ExternalValue }
         *     
         */
        public ParametersBindingType.ParameterBinding.ExternalValue getExternalValue() {
            return externalValue;
        }

        /**
         * Sets the value of the externalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParametersBindingType.ParameterBinding.ExternalValue }
         *     
         */
        public void setExternalValue(ParametersBindingType.ParameterBinding.ExternalValue value) {
            this.externalValue = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Property }
         *     
         */
        public Property getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Property }
         *     
         */
        public void setValue(Property value) {
            this.value = value;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameter() {
            return parameter;
        }

        /**
         * Sets the value of the parameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameter(String value) {
            this.parameter = value;
        }

        /**
         * Gets the value of the parameterId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterId() {
            return parameterId;
        }

        /**
         * Sets the value of the parameterId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterId(String value) {
            this.parameterId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "Value";
            } else {
                return type;
            }
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the final property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isFinal() {
            if (_final == null) {
                return false;
            } else {
                return _final;
            }
        }

        /**
         * Sets the value of the final property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFinal(Boolean value) {
            this._final = value;
        }

        /**
         * Gets the value of the restriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * Sets the value of the restriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
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
         *         &lt;element name="Value" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="OwnerPID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
         *       &lt;attribute name="OwnerClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="OwnerExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IsUpOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        public static class ExternalValue {

            @XmlElement(name = "Value")
            protected Property value;
            @XmlAttribute(name = "OwnerPID")
            protected String ownerPID;
            @XmlAttribute(name = "OwnerClassId")
            protected String ownerClassId;
            @XmlAttribute(name = "OwnerExtGuid")
            protected String ownerExtGuid;
            @XmlAttribute(name = "IsUpOwner")
            protected Boolean isUpOwner;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Property }
             *     
             */
            public Property getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Property }
             *     
             */
            public void setValue(Property value) {
                this.value = value;
            }

            /**
             * Gets the value of the ownerPID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerPID() {
                return ownerPID;
            }

            /**
             * Sets the value of the ownerPID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerPID(String value) {
                this.ownerPID = value;
            }

            /**
             * Gets the value of the ownerClassId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerClassId() {
                return ownerClassId;
            }

            /**
             * Sets the value of the ownerClassId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerClassId(String value) {
                this.ownerClassId = value;
            }

            /**
             * Gets the value of the ownerExtGuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerExtGuid() {
                return ownerExtGuid;
            }

            /**
             * Sets the value of the ownerExtGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerExtGuid(String value) {
                this.ownerExtGuid = value;
            }

            /**
             * Gets the value of the isUpOwner property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsUpOwner() {
                return isUpOwner;
            }

            /**
             * Sets the value of the isUpOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsUpOwner(Boolean value) {
                this.isUpOwner = value;
            }

        }

    }

}
