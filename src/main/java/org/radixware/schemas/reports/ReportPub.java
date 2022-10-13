
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
 * <p>Java class for ReportPub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPub"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Params" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DefaultVal" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="SupportedFormats"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/list&gt;
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
@XmlType(name = "ReportPub", propOrder = {
    "title",
    "location",
    "reportClassName",
    "description",
    "params"
})
public class ReportPub {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "ReportClassName")
    protected String reportClassName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Params")
    protected ReportPub.Params params;
    @XmlAttribute(name = "Pid", required = true)
    protected String pid;
    @XmlAttribute(name = "ReportClassId")
    protected String reportClassId;
    @XmlAttribute(name = "SupportedFormats")
    protected List<String> supportedFormats;

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the reportClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportClassName() {
        return reportClassName;
    }

    /**
     * Sets the value of the reportClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportClassName(String value) {
        this.reportClassName = value;
    }

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
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPub.Params }
     *     
     */
    public ReportPub.Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPub.Params }
     *     
     */
    public void setParams(ReportPub.Params value) {
        this.params = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the reportClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportClassId() {
        return reportClassId;
    }

    /**
     * Sets the value of the reportClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportClassId(String value) {
        this.reportClassId = value;
    }

    /**
     * Gets the value of the supportedFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedFormats() {
        if (supportedFormats == null) {
            supportedFormats = new ArrayList<String>();
        }
        return this.supportedFormats;
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
     *         &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DefaultVal" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "param"
    })
    public static class Params {

        @XmlElement(name = "Param")
        protected List<ReportPub.Params.Param> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPub.Params.Param }
         * 
         * 
         */
        public List<ReportPub.Params.Param> getParam() {
            if (param == null) {
                param = new ArrayList<ReportPub.Params.Param>();
            }
            return this.param;
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
         *         &lt;element name="DefaultVal" type="{http://schemas.radixware.org/eas.xsd}Property" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "defaultVal"
        })
        public static class Param {

            @XmlElement(name = "DefaultVal")
            protected Property defaultVal;
            @XmlAttribute(name = "Id", required = true)
            protected String id;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Type", required = true)
            protected long type;
            @XmlAttribute(name = "Title")
            protected String title;
            @XmlAttribute(name = "IsMandatory")
            protected Boolean isMandatory;

            /**
             * Gets the value of the defaultVal property.
             * 
             * @return
             *     possible object is
             *     {@link Property }
             *     
             */
            public Property getDefaultVal() {
                return defaultVal;
            }

            /**
             * Sets the value of the defaultVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Property }
             *     
             */
            public void setDefaultVal(Property value) {
                this.defaultVal = value;
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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the type property.
             * 
             */
            public long getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             */
            public void setType(long value) {
                this.type = value;
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
             * Gets the value of the isMandatory property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsMandatory() {
                return isMandatory;
            }

            /**
             * Sets the value of the isMandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsMandatory(Boolean value) {
                this.isMandatory = value;
            }

        }

    }

}
