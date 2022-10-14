
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDatabaseInfoRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDatabaseInfoRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxDbProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxDbProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxDbDriverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxDbDriverVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CfgSegmentInfo" type="{http://schemas.radixware.org/eas.xsd}CfgSegmentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDatabaseInfoRs", propOrder = {
    "productName",
    "productVersion",
    "driverName",
    "driverVersion",
    "auxDbProductName",
    "auxDbProductVersion",
    "auxDbDriverName",
    "auxDbDriverVersion",
    "cfgSegmentInfo"
})
public class GetDatabaseInfoRs
    extends Response
{

    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductVersion")
    protected String productVersion;
    @XmlElement(name = "DriverName")
    protected String driverName;
    @XmlElement(name = "DriverVersion")
    protected String driverVersion;
    @XmlElement(name = "AuxDbProductName")
    protected String auxDbProductName;
    @XmlElement(name = "AuxDbProductVersion")
    protected String auxDbProductVersion;
    @XmlElement(name = "AuxDbDriverName")
    protected String auxDbDriverName;
    @XmlElement(name = "AuxDbDriverVersion")
    protected String auxDbDriverVersion;
    @XmlElement(name = "CfgSegmentInfo")
    protected List<CfgSegmentInfo> cfgSegmentInfo;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the driverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * Sets the value of the driverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverVersion(String value) {
        this.driverVersion = value;
    }

    /**
     * Gets the value of the auxDbProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxDbProductName() {
        return auxDbProductName;
    }

    /**
     * Sets the value of the auxDbProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxDbProductName(String value) {
        this.auxDbProductName = value;
    }

    /**
     * Gets the value of the auxDbProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxDbProductVersion() {
        return auxDbProductVersion;
    }

    /**
     * Sets the value of the auxDbProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxDbProductVersion(String value) {
        this.auxDbProductVersion = value;
    }

    /**
     * Gets the value of the auxDbDriverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxDbDriverName() {
        return auxDbDriverName;
    }

    /**
     * Sets the value of the auxDbDriverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxDbDriverName(String value) {
        this.auxDbDriverName = value;
    }

    /**
     * Gets the value of the auxDbDriverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxDbDriverVersion() {
        return auxDbDriverVersion;
    }

    /**
     * Sets the value of the auxDbDriverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxDbDriverVersion(String value) {
        this.auxDbDriverVersion = value;
    }

    /**
     * Gets the value of the cfgSegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfgSegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfgSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfgSegmentInfo }
     * 
     * 
     */
    public List<CfgSegmentInfo> getCfgSegmentInfo() {
        if (cfgSegmentInfo == null) {
            cfgSegmentInfo = new ArrayList<CfgSegmentInfo>();
        }
        return this.cfgSegmentInfo;
    }

}
