
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LoginRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="32"/&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRs", propOrder = {
    "encKey"
})
public class LoginRs
    extends Response
{

    @XmlElement(name = "EncKey", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] encKey;

    /**
     * Gets the value of the encKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncKey() {
        return encKey;
    }

    /**
     * Sets the value of the encKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncKey(byte[] value) {
        this.encKey = value;
    }

}
