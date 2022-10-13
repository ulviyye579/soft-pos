
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthCert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthCert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Data" type="{http://schemas.radixware.org/types.xsd}BinBase64" /&gt;
 *       &lt;attribute name="Sign" use="required" type="{http://schemas.radixware.org/types.xsd}BinBase64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthCert")
public class AuthCert {

    @XmlAttribute(name = "Data")
    protected byte[] data;
    @XmlAttribute(name = "Sign", required = true)
    protected byte[] sign;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSign(byte[] value) {
        this.sign = value;
    }

}
