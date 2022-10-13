
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppEncryptedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppEncryptedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="KeyId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Data" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppEncryptedData")
public class AppEncryptedData {

    @XmlAttribute(name = "KeyId", required = true)
    protected long keyId;
    @XmlAttribute(name = "Data", required = true)
    protected String data;

    /**
     * Gets the value of the keyId property.
     * 
     */
    public long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     */
    public void setKeyId(long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
