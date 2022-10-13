
package org.radixware.schemas.utils;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Layer" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Module" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Class" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Method" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="Environment" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="uri" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "", propOrder = {
    "layer"
})
@XmlRootElement(name = "Names")
public class Names {

    @XmlElement(name = "Layer", required = true)
    protected List<Names.Layer> layer;

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Names.Layer }
     * 
     * 
     */
    public List<Names.Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<Names.Layer>();
        }
        return this.layer;
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
     *         &lt;element name="Module" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Class" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Method" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Environment" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="uri" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "module"
    })
    public static class Layer {

        @XmlElement(name = "Module", required = true)
        protected List<Names.Layer.Module> module;
        @XmlAttribute(name = "uri", required = true)
        protected String uri;

        /**
         * Gets the value of the module property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the module property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Names.Layer.Module }
         * 
         * 
         */
        public List<Names.Layer.Module> getModule() {
            if (module == null) {
                module = new ArrayList<Names.Layer.Module>();
            }
            return this.module;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUri() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUri(String value) {
            this.uri = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Class" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Method" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Environment" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "clazz"
        })
        public static class Module
            extends NamedElement
        {

            @XmlElement(name = "Class", required = true)
            protected List<Names.Layer.Module.Class> clazz;

            /**
             * Gets the value of the clazz property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the clazz property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClazz().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Names.Layer.Module.Class }
             * 
             * 
             */
            public List<Names.Layer.Module.Class> getClazz() {
                if (clazz == null) {
                    clazz = new ArrayList<Names.Layer.Module.Class>();
                }
                return this.clazz;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Method" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Environment" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "method"
            })
            public static class Class
                extends NamedElement
            {

                @XmlElement(name = "Method", required = true)
                protected List<Names.Layer.Module.Class.Method> method;
                @XmlAttribute(name = "Environment", required = true)
                protected String environment;

                /**
                 * Gets the value of the method property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the method property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMethod().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Names.Layer.Module.Class.Method }
                 * 
                 * 
                 */
                public List<Names.Layer.Module.Class.Method> getMethod() {
                    if (method == null) {
                        method = new ArrayList<Names.Layer.Module.Class.Method>();
                    }
                    return this.method;
                }

                /**
                 * Gets the value of the environment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnvironment() {
                    return environment;
                }

                /**
                 * Sets the value of the environment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnvironment(String value) {
                    this.environment = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://schemas.radixware.org/utils.xsd}NamedElement"&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Method
                    extends NamedElement
                {


                }

            }

        }

    }

}
