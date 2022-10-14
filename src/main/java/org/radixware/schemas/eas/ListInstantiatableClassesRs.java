
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListInstantiatableClassesRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListInstantiatableClassesRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classes" type="{http://schemas.radixware.org/eas.xsd}InstantiatableClasses"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListInstantiatableClassesRs", propOrder = {
    "classes"
})
public class ListInstantiatableClassesRs
    extends Response
{

    @XmlElement(name = "Classes", required = true)
    protected InstantiatableClasses classes;

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link InstantiatableClasses }
     *     
     */
    public InstantiatableClasses getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantiatableClasses }
     *     
     */
    public void setClasses(InstantiatableClasses value) {
        this.classes = value;
    }

}
