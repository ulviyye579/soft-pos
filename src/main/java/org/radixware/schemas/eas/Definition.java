
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definition")
@XmlSeeAlso({
    Presentation.class,
    org.radixware.schemas.eas.Property.InheritableValue.Path.Item.ReferenceProperty.class,
    org.radixware.schemas.eas.ExplorerItemList.Item.class,
    org.radixware.schemas.eas.Sorting.AdditionalSortingColumns.Item.class,
    Form.class,
    Report.class,
    org.radixware.schemas.eas.CreateSessionRs.ExplorerRoots.Item.class,
    org.radixware.schemas.eas.CreateSessionRs.ServerResources.Item.class
})
public class Definition {

    @XmlAttribute(name = "Id")
    protected String id;

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
