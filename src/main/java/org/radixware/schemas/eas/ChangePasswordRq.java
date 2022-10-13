
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChangePasswordRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewPwdHash"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="68"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SecondAuthFactor" type="{http://schemas.radixware.org/eas.xsd}SecondAuthenticationFactorResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRq", propOrder = {
    "newPwdHash",
    "secondAuthFactor"
})
public class ChangePasswordRq
    extends Request
{

    @XmlElement(name = "NewPwdHash", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] newPwdHash;
    @XmlElement(name = "SecondAuthFactor")
    protected SecondAuthenticationFactorResponse secondAuthFactor;

    /**
     * Gets the value of the newPwdHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getNewPwdHash() {
        return newPwdHash;
    }

    /**
     * Sets the value of the newPwdHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPwdHash(byte[] value) {
        this.newPwdHash = value;
    }

    /**
     * Gets the value of the secondAuthFactor property.
     * 
     * @return
     *     possible object is
     *     {@link SecondAuthenticationFactorResponse }
     *     
     */
    public SecondAuthenticationFactorResponse getSecondAuthFactor() {
        return secondAuthFactor;
    }

    /**
     * Sets the value of the secondAuthFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondAuthenticationFactorResponse }
     *     
     */
    public void setSecondAuthFactor(SecondAuthenticationFactorResponse value) {
        this.secondAuthFactor = value;
    }

}
