
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecondAuthFactorRequest" type="{http://schemas.radixware.org/eas.xsd}SecondAuthenticationFactorRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRs", propOrder = {
    "secondAuthFactorRequest"
})
public class ChangePasswordRs
    extends Response
{

    @XmlElement(name = "SecondAuthFactorRequest", required = true)
    protected SecondAuthenticationFactorRequest secondAuthFactorRequest;

    /**
     * Gets the value of the secondAuthFactorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SecondAuthenticationFactorRequest }
     *     
     */
    public SecondAuthenticationFactorRequest getSecondAuthFactorRequest() {
        return secondAuthFactorRequest;
    }

    /**
     * Sets the value of the secondAuthFactorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondAuthenticationFactorRequest }
     *     
     */
    public void setSecondAuthFactorRequest(SecondAuthenticationFactorRequest value) {
        this.secondAuthFactorRequest = value;
    }

}
