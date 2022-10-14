
package org.radixware.schemas.reports;

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
 *         &lt;element name="ParametersBinding" type="{http://schemas.radixware.org/reports.xsd}ParametersBindingType" minOccurs="0"/&gt;
 *         &lt;element name="Transformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Xslt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Msdl" type="{http://schemas.radixware.org/reports.xsd}ReportMsdlType" minOccurs="0"/&gt;
 *         &lt;element name="ColumnsSettings" type="{http://schemas.radixware.org/reports.xsd}ColumnSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReportClassGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Dir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileNameFormat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CustomFileExt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Format" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PostOsCommand" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Lag" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parametersBinding",
    "transformation",
    "msdl",
    "columnsSettings"
})
@XmlRootElement(name = "ReportSchedule")
public class ReportSchedule {

    @XmlElement(name = "ParametersBinding")
    protected ParametersBindingType parametersBinding;
    @XmlElement(name = "Transformation")
    protected ReportSchedule.Transformation transformation;
    @XmlElement(name = "Msdl")
    protected ReportMsdlType msdl;
    @XmlElement(name = "ColumnsSettings")
    protected ColumnSettings columnsSettings;
    @XmlAttribute(name = "ReportClassGuid", required = true)
    protected String reportClassGuid;
    @XmlAttribute(name = "Dir", required = true)
    protected String dir;
    @XmlAttribute(name = "FileNameFormat", required = true)
    protected String fileNameFormat;
    @XmlAttribute(name = "CustomFileExt")
    protected String customFileExt;
    @XmlAttribute(name = "Format", required = true)
    protected String format;
    @XmlAttribute(name = "PostOsCommand")
    protected String postOsCommand;
    @XmlAttribute(name = "Lag")
    protected Long lag;

    /**
     * Gets the value of the parametersBinding property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersBindingType }
     *     
     */
    public ParametersBindingType getParametersBinding() {
        return parametersBinding;
    }

    /**
     * Sets the value of the parametersBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersBindingType }
     *     
     */
    public void setParametersBinding(ParametersBindingType value) {
        this.parametersBinding = value;
    }

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSchedule.Transformation }
     *     
     */
    public ReportSchedule.Transformation getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSchedule.Transformation }
     *     
     */
    public void setTransformation(ReportSchedule.Transformation value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the msdl property.
     * 
     * @return
     *     possible object is
     *     {@link ReportMsdlType }
     *     
     */
    public ReportMsdlType getMsdl() {
        return msdl;
    }

    /**
     * Sets the value of the msdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportMsdlType }
     *     
     */
    public void setMsdl(ReportMsdlType value) {
        this.msdl = value;
    }

    /**
     * Gets the value of the columnsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSettings }
     *     
     */
    public ColumnSettings getColumnsSettings() {
        return columnsSettings;
    }

    /**
     * Sets the value of the columnsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSettings }
     *     
     */
    public void setColumnsSettings(ColumnSettings value) {
        this.columnsSettings = value;
    }

    /**
     * Gets the value of the reportClassGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportClassGuid() {
        return reportClassGuid;
    }

    /**
     * Sets the value of the reportClassGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportClassGuid(String value) {
        this.reportClassGuid = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the fileNameFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameFormat() {
        return fileNameFormat;
    }

    /**
     * Sets the value of the fileNameFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNameFormat(String value) {
        this.fileNameFormat = value;
    }

    /**
     * Gets the value of the customFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFileExt() {
        return customFileExt;
    }

    /**
     * Sets the value of the customFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFileExt(String value) {
        this.customFileExt = value;
    }

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
     * Gets the value of the postOsCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOsCommand() {
        return postOsCommand;
    }

    /**
     * Sets the value of the postOsCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOsCommand(String value) {
        this.postOsCommand = value;
    }

    /**
     * Gets the value of the lag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLag() {
        return lag;
    }

    /**
     * Sets the value of the lag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLag(Long value) {
        this.lag = value;
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
     *         &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Xslt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "xsd",
        "xslt"
    })
    public static class Transformation {

        @XmlElement(name = "Xsd", required = true)
        protected String xsd;
        @XmlElement(name = "Xslt", required = true)
        protected String xslt;

        /**
         * Gets the value of the xsd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXsd() {
            return xsd;
        }

        /**
         * Sets the value of the xsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXsd(String value) {
            this.xsd = value;
        }

        /**
         * Gets the value of the xslt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXslt() {
            return xslt;
        }

        /**
         * Sets the value of the xslt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXslt(String value) {
            this.xslt = value;
        }

    }

}
