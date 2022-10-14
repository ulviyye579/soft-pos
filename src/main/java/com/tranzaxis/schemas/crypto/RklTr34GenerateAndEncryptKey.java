
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RklTr34GenerateAndEncryptKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklTr34GenerateAndEncryptKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RklTr34GenerateAndEncryptKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}RklTr34GenerateAndEncryptKeyRq"/&gt;
 *         &lt;element name="RklTr34GenerateAndEncryptKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}RklTr34GenerateAndEncryptKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklTr34GenerateAndEncryptKey", propOrder = {
    "rklTr34GenerateAndEncryptKeyRq",
    "rklTr34GenerateAndEncryptKeyRs"
})
public class RklTr34GenerateAndEncryptKey {

    @XmlElement(name = "RklTr34GenerateAndEncryptKeyRq")
    protected RklTr34GenerateAndEncryptKeyRq rklTr34GenerateAndEncryptKeyRq;
    @XmlElement(name = "RklTr34GenerateAndEncryptKeyRs")
    protected RklTr34GenerateAndEncryptKeyRs rklTr34GenerateAndEncryptKeyRs;

    /**
     * Gets the value of the rklTr34GenerateAndEncryptKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link RklTr34GenerateAndEncryptKeyRq }
     *     
     */
    public RklTr34GenerateAndEncryptKeyRq getRklTr34GenerateAndEncryptKeyRq() {
        return rklTr34GenerateAndEncryptKeyRq;
    }

    /**
     * Sets the value of the rklTr34GenerateAndEncryptKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklTr34GenerateAndEncryptKeyRq }
     *     
     */
    public void setRklTr34GenerateAndEncryptKeyRq(RklTr34GenerateAndEncryptKeyRq value) {
        this.rklTr34GenerateAndEncryptKeyRq = value;
    }

    /**
     * Gets the value of the rklTr34GenerateAndEncryptKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link RklTr34GenerateAndEncryptKeyRs }
     *     
     */
    public RklTr34GenerateAndEncryptKeyRs getRklTr34GenerateAndEncryptKeyRs() {
        return rklTr34GenerateAndEncryptKeyRs;
    }

    /**
     * Sets the value of the rklTr34GenerateAndEncryptKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RklTr34GenerateAndEncryptKeyRs }
     *     
     */
    public void setRklTr34GenerateAndEncryptKeyRs(RklTr34GenerateAndEncryptKeyRs value) {
        this.rklTr34GenerateAndEncryptKeyRs = value;
    }

}
