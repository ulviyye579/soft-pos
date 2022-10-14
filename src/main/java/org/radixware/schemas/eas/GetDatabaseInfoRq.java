
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDatabaseInfoRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDatabaseInfoRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;attribute name="cfgSegmentsInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="generalDbInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="auxDbInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDatabaseInfoRq")
public class GetDatabaseInfoRq
    extends Request
{

    @XmlAttribute(name = "cfgSegmentsInfo")
    protected Boolean cfgSegmentsInfo;
    @XmlAttribute(name = "generalDbInfo")
    protected Boolean generalDbInfo;
    @XmlAttribute(name = "auxDbInfo")
    protected Boolean auxDbInfo;

    /**
     * Gets the value of the cfgSegmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCfgSegmentsInfo() {
        if (cfgSegmentsInfo == null) {
            return true;
        } else {
            return cfgSegmentsInfo;
        }
    }

    /**
     * Sets the value of the cfgSegmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCfgSegmentsInfo(Boolean value) {
        this.cfgSegmentsInfo = value;
    }

    /**
     * Gets the value of the generalDbInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGeneralDbInfo() {
        if (generalDbInfo == null) {
            return true;
        } else {
            return generalDbInfo;
        }
    }

    /**
     * Sets the value of the generalDbInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralDbInfo(Boolean value) {
        this.generalDbInfo = value;
    }

    /**
     * Gets the value of the auxDbInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAuxDbInfo() {
        if (auxDbInfo == null) {
            return true;
        } else {
            return auxDbInfo;
        }
    }

    /**
     * Sets the value of the auxDbInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuxDbInfo(Boolean value) {
        this.auxDbInfo = value;
    }

}
