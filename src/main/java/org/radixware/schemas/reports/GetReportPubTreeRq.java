
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
 *         &lt;element name="Context" type="{http://schemas.radixware.org/reports.xsd}ReportPubContext"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PubListClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="ForInheritance" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context"
})
@XmlRootElement(name = "GetReportPubTreeRq")
public class GetReportPubTreeRq {

    @XmlElement(name = "Context", required = true)
    protected ReportPubContext context;
    @XmlAttribute(name = "PubListClassId", required = true)
    protected String pubListClassId;
    @XmlAttribute(name = "ForInheritance")
    protected Boolean forInheritance;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPubContext }
     *     
     */
    public ReportPubContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPubContext }
     *     
     */
    public void setContext(ReportPubContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the pubListClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubListClassId() {
        return pubListClassId;
    }

    /**
     * Sets the value of the pubListClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubListClassId(String value) {
        this.pubListClassId = value;
    }

    /**
     * Gets the value of the forInheritance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForInheritance() {
        if (forInheritance == null) {
            return false;
        } else {
            return forInheritance;
        }
    }

    /**
     * Sets the value of the forInheritance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForInheritance(Boolean value) {
        this.forInheritance = value;
    }

}
