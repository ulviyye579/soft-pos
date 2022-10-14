
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ContextRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRequest", propOrder = {
    "entity"
})
@XmlSeeAlso({
    ListInstantiatableClassesRq.class,
    GetObjectTitlesRq.class
})
public class EntityRequest
    extends ContextRequest
{

    @XmlElement(name = "Entity", required = true)
    protected Definition entity;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setEntity(Definition value) {
        this.entity = value;
    }

}
