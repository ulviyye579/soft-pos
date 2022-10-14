
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserReportHeaderListRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserReportHeaderListRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Module" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Report" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ContextClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="SuperInterfaces"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "UserReportHeaderListRs", propOrder = {
    "module"
})
public class UserReportHeaderListRs {

    @XmlElement(name = "Module")
    protected List<UserReportHeaderListRs.Module> module;

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
     * {@link UserReportHeaderListRs.Module }
     * 
     * 
     */
    public List<UserReportHeaderListRs.Module> getModule() {
        if (module == null) {
            module = new ArrayList<UserReportHeaderListRs.Module>();
        }
        return this.module;
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
     *         &lt;element name="Report" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ContextClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="SuperInterfaces"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "report"
    })
    public static class Module {

        @XmlElement(name = "Report")
        protected List<UserReportHeaderListRs.Module.Report> report;
        @XmlAttribute(name = "Title")
        protected String title;

        /**
         * Gets the value of the report property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the report property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserReportHeaderListRs.Module.Report }
         * 
         * 
         */
        public List<UserReportHeaderListRs.Module.Report> getReport() {
            if (report == null) {
                report = new ArrayList<UserReportHeaderListRs.Module.Report>();
            }
            return this.report;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ContextClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="SuperInterfaces"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
        @XmlType(name = "")
        public static class Report {

            @XmlAttribute(name = "Title")
            protected String title;
            @XmlAttribute(name = "Id")
            protected String id;
            @XmlAttribute(name = "FullName")
            protected String fullName;
            @XmlAttribute(name = "ContextClassId")
            protected String contextClassId;
            @XmlAttribute(name = "SuperInterfaces")
            protected List<String> superInterfaces;

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
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the contextClassId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContextClassId() {
                return contextClassId;
            }

            /**
             * Sets the value of the contextClassId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContextClassId(String value) {
                this.contextClassId = value;
            }

            /**
             * Gets the value of the superInterfaces property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the superInterfaces property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSuperInterfaces().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSuperInterfaces() {
                if (superInterfaces == null) {
                    superInterfaces = new ArrayList<String>();
                }
                return this.superInterfaces;
            }

        }

    }

}
