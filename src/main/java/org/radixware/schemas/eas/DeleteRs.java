
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeletedObjectPid" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Rejections" type="{http://schemas.radixware.org/eas.xsd}DeleteRejections" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRs", propOrder = {
    "deletedObjectPid",
    "rejections"
})
public class DeleteRs
    extends Response
{

    @XmlElement(name = "DeletedObjectPid")
    protected List<String> deletedObjectPid;
    @XmlElement(name = "Rejections")
    protected DeleteRejections rejections;

    /**
     * Gets the value of the deletedObjectPid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedObjectPid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedObjectPid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeletedObjectPid() {
        if (deletedObjectPid == null) {
            deletedObjectPid = new ArrayList<String>();
        }
        return this.deletedObjectPid;
    }

    /**
     * Gets the value of the rejections property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRejections }
     *     
     */
    public DeleteRejections getRejections() {
        return rejections;
    }

    /**
     * Sets the value of the rejections property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRejections }
     *     
     */
    public void setRejections(DeleteRejections value) {
        this.rejections = value;
    }

}
