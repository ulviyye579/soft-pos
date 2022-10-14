
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPasswordRequirementsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPasswordRequirementsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Requirements" type="{http://schemas.radixware.org/eas.xsd}PasswordRequirements"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPasswordRequirementsRs", propOrder = {
    "requirements"
})
public class GetPasswordRequirementsRs
    extends Response
{

    @XmlElement(name = "Requirements", required = true)
    protected PasswordRequirements requirements;

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordRequirements }
     *     
     */
    public PasswordRequirements getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordRequirements }
     *     
     */
    public void setRequirements(PasswordRequirements value) {
        this.requirements = value;
    }

}
