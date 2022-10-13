
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepareCreateRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepareCreateRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}PresentableObject" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepareCreateRs", propOrder = {
    "object"
})
public class PrepareCreateRs
    extends Response
{

    @XmlElement(name = "Object", required = true)
    protected List<PresentableObject> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentableObject }
     * 
     * 
     */
    public List<PresentableObject> getObject() {
        if (object == null) {
            object = new ArrayList<PresentableObject>();
        }
        return this.object;
    }

}
