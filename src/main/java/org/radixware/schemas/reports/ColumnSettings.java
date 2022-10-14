
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResizeMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VisibleColumns" type="{http://schemas.radixware.org/reports.xsd}ReportColumnsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnSettings", propOrder = {
    "resizeMode",
    "visibleColumns"
})
public class ColumnSettings {

    @XmlElement(name = "ResizeMode", required = true)
    protected String resizeMode;
    @XmlElement(name = "VisibleColumns")
    protected ReportColumnsList visibleColumns;
    @XmlAttribute(name = "IsUsed")
    protected Boolean isUsed;

    /**
     * Gets the value of the resizeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResizeMode() {
        return resizeMode;
    }

    /**
     * Sets the value of the resizeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResizeMode(String value) {
        this.resizeMode = value;
    }

    /**
     * Gets the value of the visibleColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ReportColumnsList }
     *     
     */
    public ReportColumnsList getVisibleColumns() {
        return visibleColumns;
    }

    /**
     * Sets the value of the visibleColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportColumnsList }
     *     
     */
    public void setVisibleColumns(ReportColumnsList value) {
        this.visibleColumns = value;
    }

    /**
     * Gets the value of the isUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsUsed() {
        if (isUsed == null) {
            return true;
        } else {
            return isUsed;
        }
    }

    /**
     * Sets the value of the isUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUsed(Boolean value) {
        this.isUsed = value;
    }

}
