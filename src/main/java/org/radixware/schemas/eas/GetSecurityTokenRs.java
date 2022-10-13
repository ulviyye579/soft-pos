
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetSecurityTokenRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSecurityTokenRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OutToken" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="KrbEncKey" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSecurityTokenRs", propOrder = {

})
public class GetSecurityTokenRs {

    @XmlElement(name = "OutToken", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] outToken;
    @XmlElement(name = "KrbEncKey", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] krbEncKey;

    /**
     * Gets the value of the outToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOutToken() {
        return outToken;
    }

    /**
     * Sets the value of the outToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutToken(byte[] value) {
        this.outToken = value;
    }

    /**
     * Gets the value of the krbEncKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKrbEncKey() {
        return krbEncKey;
    }

    /**
     * Sets the value of the krbEncKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrbEncKey(byte[] value) {
        this.krbEncKey = value;
    }

}
