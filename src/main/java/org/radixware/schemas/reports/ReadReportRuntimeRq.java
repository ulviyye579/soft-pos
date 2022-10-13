
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadReportRuntimeRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadReportRuntimeRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ReportId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TmpFileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReportClassGuid" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadReportRuntimeRq")
public class ReadReportRuntimeRq {

    @XmlAttribute(name = "ReportId")
    protected String reportId;
    @XmlAttribute(name = "TmpFileName")
    protected String tmpFileName;
    @XmlAttribute(name = "ReportClassGuid")
    protected String reportClassGuid;

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
     * Gets the value of the tmpFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpFileName() {
        return tmpFileName;
    }

    /**
     * Sets the value of the tmpFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpFileName(String value) {
        this.tmpFileName = value;
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

}
