
package org.radixware.schemas.commondef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.groupsettings.CustomFilter;
import org.radixware.schemas.groupsettings.CustomSorting;


/**
 * <p>Java class for NamedDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}Definition"&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedDefinition")
@XmlSeeAlso({
    CustomFilter.class,
    CustomSorting.class,
    DescribedDefinition.class
})
public class NamedDefinition
    extends Definition
{

    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
