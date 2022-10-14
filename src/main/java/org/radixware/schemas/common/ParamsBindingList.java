
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.reports.ParametersBindingType;


/**
 * <p>Java class for ParamsBindingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsBindingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bindings" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Binding" type="{http://schemas.radixware.org/reports.xsd}ParametersBindingType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="UserFuncGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UserFuncSignature" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UserFuncSignatureNew" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="IsFuncUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LinkedResultsCombinationMode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LinkedResultsEvaluationMode"&gt;
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
@XmlType(name = "ParamsBindingList", propOrder = {
    "bindings"
})
public class ParamsBindingList {

    @XmlElement(name = "Bindings")
    protected List<ParamsBindingList.Bindings> bindings;
    @XmlAttribute(name = "LinkedResultsCombinationMode")
    protected String linkedResultsCombinationMode;
    @XmlAttribute(name = "LinkedResultsEvaluationMode")
    protected String linkedResultsEvaluationMode;

    /**
     * Gets the value of the bindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamsBindingList.Bindings }
     * 
     * 
     */
    public List<ParamsBindingList.Bindings> getBindings() {
        if (bindings == null) {
            bindings = new ArrayList<ParamsBindingList.Bindings>();
        }
        return this.bindings;
    }

    /**
     * Gets the value of the linkedResultsCombinationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedResultsCombinationMode() {
        return linkedResultsCombinationMode;
    }

    /**
     * Sets the value of the linkedResultsCombinationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedResultsCombinationMode(String value) {
        this.linkedResultsCombinationMode = value;
    }

    /**
     * Gets the value of the linkedResultsEvaluationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedResultsEvaluationMode() {
        return linkedResultsEvaluationMode;
    }

    /**
     * Sets the value of the linkedResultsEvaluationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedResultsEvaluationMode(String value) {
        this.linkedResultsEvaluationMode = value;
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
     *         &lt;element name="Binding" type="{http://schemas.radixware.org/reports.xsd}ParametersBindingType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="UserFuncGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UserFuncSignature" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UserFuncSignatureNew" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="IsFuncUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "binding"
    })
    public static class Bindings {

        @XmlElement(name = "Binding")
        protected ParametersBindingType binding;
        @XmlAttribute(name = "UserFuncGuid")
        protected String userFuncGuid;
        @XmlAttribute(name = "UserFuncSignature")
        protected String userFuncSignature;
        @XmlAttribute(name = "UserFuncSignatureNew")
        protected String userFuncSignatureNew;
        @XmlAttribute(name = "IsFuncUsed")
        protected Boolean isFuncUsed;

        /**
         * Gets the value of the binding property.
         * 
         * @return
         *     possible object is
         *     {@link ParametersBindingType }
         *     
         */
        public ParametersBindingType getBinding() {
            return binding;
        }

        /**
         * Sets the value of the binding property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParametersBindingType }
         *     
         */
        public void setBinding(ParametersBindingType value) {
            this.binding = value;
        }

        /**
         * Gets the value of the userFuncGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFuncGuid() {
            return userFuncGuid;
        }

        /**
         * Sets the value of the userFuncGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFuncGuid(String value) {
            this.userFuncGuid = value;
        }

        /**
         * Gets the value of the userFuncSignature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFuncSignature() {
            return userFuncSignature;
        }

        /**
         * Sets the value of the userFuncSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFuncSignature(String value) {
            this.userFuncSignature = value;
        }

        /**
         * Gets the value of the userFuncSignatureNew property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFuncSignatureNew() {
            return userFuncSignatureNew;
        }

        /**
         * Sets the value of the userFuncSignatureNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFuncSignatureNew(String value) {
            this.userFuncSignatureNew = value;
        }

        /**
         * Gets the value of the isFuncUsed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIsFuncUsed() {
            if (isFuncUsed == null) {
                return true;
            } else {
                return isFuncUsed;
            }
        }

        /**
         * Sets the value of the isFuncUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsFuncUsed(Boolean value) {
            this.isFuncUsed = value;
        }

    }

}
