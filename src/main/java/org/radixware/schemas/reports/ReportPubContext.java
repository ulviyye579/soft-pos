
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPubContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPubContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parent" type="{http://schemas.radixware.org/reports.xsd}ReportPubContext" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PubContextClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="PubContextId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPubContext", propOrder = {
    "parent"
})
public class ReportPubContext {

    @XmlElement(name = "Parent")
    protected ReportPubContext parent;
    @XmlAttribute(name = "PubContextClassId", required = true)
    protected String pubContextClassId;
    @XmlAttribute(name = "PubContextId")
    protected String pubContextId;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPubContext }
     *     
     */
    public ReportPubContext getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPubContext }
     *     
     */
    public void setParent(ReportPubContext value) {
        this.parent = value;
    }

    /**
     * Gets the value of the pubContextClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubContextClassId() {
        return pubContextClassId;
    }

    /**
     * Sets the value of the pubContextClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubContextClassId(String value) {
        this.pubContextClassId = value;
    }

    /**
     * Gets the value of the pubContextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubContextId() {
        return pubContextId;
    }

    /**
     * Sets the value of the pubContextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubContextId(String value) {
        this.pubContextId = value;
    }

}
