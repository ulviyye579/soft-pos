
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritableBusinessPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InheritableBusinessPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}BusinessPeriod"&gt;
 *       &lt;attribute name="IsInherited" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritableBusinessPeriod")
public class InheritableBusinessPeriod
    extends BusinessPeriod
{

    @XmlAttribute(name = "IsInherited")
    protected Boolean isInherited;

    /**
     * Gets the value of the isInherited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInherited() {
        return isInherited;
    }

    /**
     * Sets the value of the isInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInherited(Boolean value) {
        this.isInherited = value;
    }

}
