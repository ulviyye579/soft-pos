
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadReportRuntimeRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadReportRuntimeRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ReportClassGuid" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadReportRuntimeRs")
public class ReadReportRuntimeRs {

    @XmlAttribute(name = "Status")
    protected Integer status;
    @XmlAttribute(name = "ReportClassGuid")
    protected String reportClassGuid;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
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
