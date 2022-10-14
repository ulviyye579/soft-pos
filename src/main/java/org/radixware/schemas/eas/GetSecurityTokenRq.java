
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetSecurityTokenRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSecurityTokenRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="InputToken" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="HashAlgorithm" type="{http://schemas.radixware.org/eas.xsd}HashAlgorithmEnum" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSecurityTokenRq", propOrder = {

})
public class GetSecurityTokenRq {

    @XmlElement(name = "InputToken", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] inputToken;
    @XmlElement(name = "HashAlgorithm")
    @XmlSchemaType(name = "string")
    protected HashAlgorithmEnum hashAlgorithm;

    /**
     * Gets the value of the inputToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getInputToken() {
        return inputToken;
    }

    /**
     * Sets the value of the inputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputToken(byte[] value) {
        this.inputToken = value;
    }

    /**
     * Gets the value of the hashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithmEnum }
     *     
     */
    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Sets the value of the hashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithmEnum }
     *     
     */
    public void setHashAlgorithm(HashAlgorithmEnum value) {
        this.hashAlgorithm = value;
    }

}
