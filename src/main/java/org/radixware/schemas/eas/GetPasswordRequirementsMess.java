
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPasswordRequirementsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPasswordRequirementsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetPasswordRequirementsRs" type="{http://schemas.radixware.org/eas.xsd}GetPasswordRequirementsRs"/&gt;
 *         &lt;element name="GetPasswordRequirementsRq" type="{http://schemas.radixware.org/eas.xsd}GetPasswordRequirementsRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPasswordRequirementsMess", propOrder = {
    "getPasswordRequirementsRs",
    "getPasswordRequirementsRq"
})
public class GetPasswordRequirementsMess {

    @XmlElement(name = "GetPasswordRequirementsRs")
    protected GetPasswordRequirementsRs getPasswordRequirementsRs;
    @XmlElement(name = "GetPasswordRequirementsRq")
    protected GetPasswordRequirementsRq getPasswordRequirementsRq;

    /**
     * Gets the value of the getPasswordRequirementsRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetPasswordRequirementsRs }
     *     
     */
    public GetPasswordRequirementsRs getGetPasswordRequirementsRs() {
        return getPasswordRequirementsRs;
    }

    /**
     * Sets the value of the getPasswordRequirementsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPasswordRequirementsRs }
     *     
     */
    public void setGetPasswordRequirementsRs(GetPasswordRequirementsRs value) {
        this.getPasswordRequirementsRs = value;
    }

    /**
     * Gets the value of the getPasswordRequirementsRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetPasswordRequirementsRq }
     *     
     */
    public GetPasswordRequirementsRq getGetPasswordRequirementsRq() {
        return getPasswordRequirementsRq;
    }

    /**
     * Sets the value of the getPasswordRequirementsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPasswordRequirementsRq }
     *     
     */
    public void setGetPasswordRequirementsRq(GetPasswordRequirementsRq value) {
        this.getPasswordRequirementsRq = value;
    }

}
