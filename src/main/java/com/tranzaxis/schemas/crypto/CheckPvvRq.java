
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPvvRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPvvRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/crypto.xsd}CalcPvvRq"&gt;
 *       &lt;attribute name="Pvv" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{4}"/&gt;
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
@XmlType(name = "CheckPvvRq")
public class CheckPvvRq
    extends CalcPvvRq
{

    @XmlAttribute(name = "Pvv", required = true)
    protected String pvv;

    /**
     * Gets the value of the pvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvv() {
        return pvv;
    }

    /**
     * Sets the value of the pvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvv(String value) {
        this.pvv = value;
    }

}
