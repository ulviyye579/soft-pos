
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPreviewRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPreviewRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportData" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPreviewRs", propOrder = {
    "reportData"
})
public class ReportPreviewRs {

    @XmlElement(name = "ReportData", required = true)
    protected byte[] reportData;

    /**
     * Gets the value of the reportData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportData() {
        return reportData;
    }

    /**
     * Sets the value of the reportData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportData(byte[] value) {
        this.reportData = value;
    }

}
