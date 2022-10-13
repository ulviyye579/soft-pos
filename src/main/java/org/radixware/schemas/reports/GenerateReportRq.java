
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.eas.PropertyList;


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
 *         &lt;element name="ParamValues" type="{http://schemas.radixware.org/eas.xsd}PropertyList"/&gt;
 *         &lt;element name="ExportFormats" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExportFormat" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FormatDirectories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FormatDirectory" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Format"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
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
 *       &lt;attribute name="File" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportPubPid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DefaultFileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paramValues",
    "exportFormats",
    "formatDirectories"
})
@XmlRootElement(name = "GenerateReportRq")
public class GenerateReportRq {

    @XmlElement(name = "ParamValues", required = true)
    protected PropertyList paramValues;
    @XmlElement(name = "ExportFormats")
    protected GenerateReportRq.ExportFormats exportFormats;
    @XmlElement(name = "FormatDirectories")
    protected GenerateReportRq.FormatDirectories formatDirectories;
    @XmlAttribute(name = "File", required = true)
    protected String file;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ReportPubPid")
    protected String reportPubPid;
    @XmlAttribute(name = "DefaultFileName")
    protected String defaultFileName;

    /**
     * Gets the value of the paramValues property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getParamValues() {
        return paramValues;
    }

    /**
     * Sets the value of the paramValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setParamValues(PropertyList value) {
        this.paramValues = value;
    }

    /**
     * Gets the value of the exportFormats property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateReportRq.ExportFormats }
     *     
     */
    public GenerateReportRq.ExportFormats getExportFormats() {
        return exportFormats;
    }

    /**
     * Sets the value of the exportFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateReportRq.ExportFormats }
     *     
     */
    public void setExportFormats(GenerateReportRq.ExportFormats value) {
        this.exportFormats = value;
    }

    /**
     * Gets the value of the formatDirectories property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateReportRq.FormatDirectories }
     *     
     */
    public GenerateReportRq.FormatDirectories getFormatDirectories() {
        return formatDirectories;
    }

    /**
     * Sets the value of the formatDirectories property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateReportRq.FormatDirectories }
     *     
     */
    public void setFormatDirectories(GenerateReportRq.FormatDirectories value) {
        this.formatDirectories = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
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
        return type;
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
     * Gets the value of the reportPubPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPubPid() {
        return reportPubPid;
    }

    /**
     * Sets the value of the reportPubPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPubPid(String value) {
        this.reportPubPid = value;
    }

    /**
     * Gets the value of the defaultFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultFileName() {
        return defaultFileName;
    }

    /**
     * Sets the value of the defaultFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultFileName(String value) {
        this.defaultFileName = value;
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
     *         &lt;element name="ExportFormat" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "exportFormat"
    })
    public static class ExportFormats {

        @XmlElement(name = "ExportFormat")
        protected List<String> exportFormat;

        /**
         * Gets the value of the exportFormat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exportFormat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExportFormat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExportFormat() {
            if (exportFormat == null) {
                exportFormat = new ArrayList<String>();
            }
            return this.exportFormat;
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
     *         &lt;element name="FormatDirectory" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Format"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "formatDirectory"
    })
    public static class FormatDirectories {

        @XmlElement(name = "FormatDirectory")
        protected List<GenerateReportRq.FormatDirectories.FormatDirectory> formatDirectory;

        /**
         * Gets the value of the formatDirectory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formatDirectory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormatDirectory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GenerateReportRq.FormatDirectories.FormatDirectory }
         * 
         * 
         */
        public List<GenerateReportRq.FormatDirectories.FormatDirectory> getFormatDirectory() {
            if (formatDirectory == null) {
                formatDirectory = new ArrayList<GenerateReportRq.FormatDirectories.FormatDirectory>();
            }
            return this.formatDirectory;
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
         *         &lt;element name="Format"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "format",
            "path"
        })
        public static class FormatDirectory {

            @XmlElement(name = "Format", required = true)
            protected String format;
            @XmlElement(name = "Path", required = true)
            protected String path;

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the path property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPath() {
                return path;
            }

            /**
             * Sets the value of the path property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPath(String value) {
                this.path = value;
            }

        }

    }

}
