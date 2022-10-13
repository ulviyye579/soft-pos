
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JmlFuncProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JmlFuncProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Parameter" type="{http://schemas.radixware.org/xscml.xsd}JmlParameterDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ThrownExceptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Exception" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MethodName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JmlFuncProfile", propOrder = {
    "parameters",
    "returnType",
    "thrownExceptions"
})
public class JmlFuncProfile {

    @XmlElement(name = "Parameters")
    protected JmlFuncProfile.Parameters parameters;
    @XmlElement(name = "ReturnType")
    protected JmlFuncProfile.ReturnType returnType;
    @XmlElement(name = "ThrownExceptions")
    protected JmlFuncProfile.ThrownExceptions thrownExceptions;
    @XmlAttribute(name = "MethodName", required = true)
    protected String methodName;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JmlFuncProfile.Parameters }
     *     
     */
    public JmlFuncProfile.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmlFuncProfile.Parameters }
     *     
     */
    public void setParameters(JmlFuncProfile.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link JmlFuncProfile.ReturnType }
     *     
     */
    public JmlFuncProfile.ReturnType getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmlFuncProfile.ReturnType }
     *     
     */
    public void setReturnType(JmlFuncProfile.ReturnType value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the thrownExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link JmlFuncProfile.ThrownExceptions }
     *     
     */
    public JmlFuncProfile.ThrownExceptions getThrownExceptions() {
        return thrownExceptions;
    }

    /**
     * Sets the value of the thrownExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmlFuncProfile.ThrownExceptions }
     *     
     */
    public void setThrownExceptions(JmlFuncProfile.ThrownExceptions value) {
        this.thrownExceptions = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
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
     *         &lt;element name="Parameter" type="{http://schemas.radixware.org/xscml.xsd}JmlParameterDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "parameter"
    })
    public static class Parameters {

        @XmlElement(name = "Parameter")
        protected List<JmlParameterDeclaration> parameter;

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
         * {@link JmlParameterDeclaration }
         * 
         * 
         */
        public List<JmlParameterDeclaration> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<JmlParameterDeclaration>();
            }
            return this.parameter;
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
     *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class ReturnType
        extends TypeDeclaration
    {

        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlAttribute(name = "DescriptionId")
        protected String descriptionId;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the descriptionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptionId() {
            return descriptionId;
        }

        /**
         * Sets the value of the descriptionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptionId(String value) {
            this.descriptionId = value;
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
     *         &lt;element name="Exception" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "exception"
    })
    public static class ThrownExceptions {

        @XmlElement(name = "Exception")
        protected List<JmlFuncProfile.ThrownExceptions.Exception> exception;

        /**
         * Gets the value of the exception property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exception property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getException().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JmlFuncProfile.ThrownExceptions.Exception }
         * 
         * 
         */
        public List<JmlFuncProfile.ThrownExceptions.Exception> getException() {
            if (exception == null) {
                exception = new ArrayList<JmlFuncProfile.ThrownExceptions.Exception>();
            }
            return this.exception;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="DescriptionId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class Exception
            extends TypeDeclaration
        {

            @XmlElement(name = "Description", required = true)
            protected String description;
            @XmlAttribute(name = "DescriptionId")
            protected String descriptionId;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the descriptionId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptionId() {
                return descriptionId;
            }

            /**
             * Sets the value of the descriptionId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptionId(String value) {
                this.descriptionId = value;
            }

        }

    }

}
