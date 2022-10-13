
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCscRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCscRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}CalcCscRq"&gt;
 *       &lt;attribute name="Csc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{3,5}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCscRq")
public class CheckCscRq
    extends CalcCscRq
{

    @XmlAttribute(name = "Csc", required = true)
    protected String csc;

    /**
     * Gets the value of the csc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsc() {
        return csc;
    }

    /**
     * Sets the value of the csc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsc(String value) {
        this.csc = value;
    }

}
