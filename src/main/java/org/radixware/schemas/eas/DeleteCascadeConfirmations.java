
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCascadeConfirmations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCascadeConfirmations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Confirmation" type="{http://schemas.radixware.org/eas.xsd}DeleteCascadeConfirmation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCascadeConfirmations", propOrder = {
    "confirmation"
})
public class DeleteCascadeConfirmations {

    @XmlElement(name = "Confirmation", required = true)
    protected List<DeleteCascadeConfirmation> confirmation;

    /**
     * Gets the value of the confirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteCascadeConfirmation }
     * 
     * 
     */
    public List<DeleteCascadeConfirmation> getConfirmation() {
        if (confirmation == null) {
            confirmation = new ArrayList<DeleteCascadeConfirmation>();
        }
        return this.confirmation;
    }

}
