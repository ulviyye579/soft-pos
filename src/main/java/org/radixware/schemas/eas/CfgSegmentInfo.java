
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CfgSegmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CfgSegmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *         &lt;element name="LastPackageVersion" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="LastHotfixPackageVersion" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CfgSegmentInfo", propOrder = {
    "segmentTitle",
    "lastPackageVersion",
    "lastHotfixPackageVersion"
})
public class CfgSegmentInfo {

    @XmlElement(name = "SegmentTitle", required = true)
    protected String segmentTitle;
    @XmlElement(name = "LastPackageVersion")
    protected String lastPackageVersion;
    @XmlElement(name = "LastHotfixPackageVersion")
    protected String lastHotfixPackageVersion;

    /**
     * Gets the value of the segmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentTitle() {
        return segmentTitle;
    }

    /**
     * Sets the value of the segmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentTitle(String value) {
        this.segmentTitle = value;
    }

    /**
     * Gets the value of the lastPackageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPackageVersion() {
        return lastPackageVersion;
    }

    /**
     * Sets the value of the lastPackageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPackageVersion(String value) {
        this.lastPackageVersion = value;
    }

    /**
     * Gets the value of the lastHotfixPackageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastHotfixPackageVersion() {
        return lastHotfixPackageVersion;
    }

    /**
     * Sets the value of the lastHotfixPackageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastHotfixPackageVersion(String value) {
        this.lastHotfixPackageVersion = value;
    }

}
