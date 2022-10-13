
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcCvvRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcCvvRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Cvv" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcCvvRs")
public class CalcCvvRs {

    @XmlAttribute(name = "Cvv", required = true)
    protected String cvv;

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

}
