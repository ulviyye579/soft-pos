
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factor1" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthFactor"/&gt;
 *         &lt;element name="Factor2" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthFactor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthMethod", propOrder = {
    "factor1",
    "factor2"
})
public class AuthMethod {

    @XmlElement(name = "Factor1", required = true)
    protected AuthFactor factor1;
    @XmlElement(name = "Factor2")
    protected AuthFactor factor2;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the factor1 property.
     * 
     * @return
     *     possible object is
     *     {@link AuthFactor }
     *     
     */
    public AuthFactor getFactor1() {
        return factor1;
    }

    /**
     * Sets the value of the factor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthFactor }
     *     
     */
    public void setFactor1(AuthFactor value) {
        this.factor1 = value;
    }

    /**
     * Gets the value of the factor2 property.
     * 
     * @return
     *     possible object is
     *     {@link AuthFactor }
     *     
     */
    public AuthFactor getFactor2() {
        return factor2;
    }

    /**
     * Sets the value of the factor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthFactor }
     *     
     */
    public void setFactor2(AuthFactor value) {
        this.factor2 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
