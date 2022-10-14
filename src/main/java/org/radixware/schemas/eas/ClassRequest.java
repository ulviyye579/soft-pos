
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ContextRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Class" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassRequest", propOrder = {
    "clazz"
})
@XmlSeeAlso({
    SetParentRq.class,
    CreateRq.class,
    ObjectRequest.class,
    ObjectOrGroupRequest.class,
    GroupRequest.class
})
public class ClassRequest
    extends ContextRequest
{

    @XmlElement(name = "Class", required = true)
    protected Definition clazz;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setClazz(Definition value) {
        this.clazz = value;
    }

}
