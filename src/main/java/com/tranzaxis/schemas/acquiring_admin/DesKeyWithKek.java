
package com.tranzaxis.schemas.acquiring_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesKeyWithKek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesKeyWithKek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKey"&gt;
 *       &lt;attribute name="Kek" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesKeyWithKek")
public class DesKeyWithKek
    extends DesKey
{

    @XmlAttribute(name = "Kek")
    protected String kek;

    /**
     * Gets the value of the kek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKek() {
        return kek;
    }

    /**
     * Sets the value of the kek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKek(String value) {
        this.kek = value;
    }

}
