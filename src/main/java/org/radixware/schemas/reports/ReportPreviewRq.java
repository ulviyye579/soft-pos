
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPreviewRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPreviewRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
 *         &lt;element name="ExportFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportJar" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="TestDataZip" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="ExportLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPreviewRq", propOrder = {
    "reportId",
    "exportFormat",
    "reportJar",
    "testDataZip",
    "exportLocale"
})
public class ReportPreviewRq {

    @XmlElement(name = "ReportId", required = true)
    protected String reportId;
    @XmlElement(name = "ExportFormat", required = true)
    protected String exportFormat;
    @XmlElement(name = "ReportJar", required = true)
    protected byte[] reportJar;
    @XmlElement(name = "TestDataZip", required = true)
    protected byte[] testDataZip;
    @XmlElement(name = "ExportLocale", required = true)
    protected String exportLocale;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the exportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportFormat() {
        return exportFormat;
    }

    /**
     * Sets the value of the exportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportFormat(String value) {
        this.exportFormat = value;
    }

    /**
     * Gets the value of the reportJar property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportJar() {
        return reportJar;
    }

    /**
     * Sets the value of the reportJar property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportJar(byte[] value) {
        this.reportJar = value;
    }

    /**
     * Gets the value of the testDataZip property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTestDataZip() {
        return testDataZip;
    }

    /**
     * Sets the value of the testDataZip property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTestDataZip(byte[] value) {
        this.testDataZip = value;
    }

    /**
     * Gets the value of the exportLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportLocale() {
        return exportLocale;
    }

    /**
     * Sets the value of the exportLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportLocale(String value) {
        this.exportLocale = value;
    }

}
