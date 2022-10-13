
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserReportListRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserReportListRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="moduleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="WithDefinition" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserReportListRq")
public class UserReportListRq {

    @XmlAttribute(name = "moduleId")
    protected String moduleId;
    @XmlAttribute(name = "WithDefinition")
    protected Boolean withDefinition;

    /**
     * Gets the value of the moduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleId(String value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the withDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDefinition() {
        return withDefinition;
    }

    /**
     * Sets the value of the withDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDefinition(Boolean value) {
        this.withDefinition = value;
    }

}
