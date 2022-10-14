
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectOrGroupRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectReference" type="{http://schemas.radixware.org/eas.xsd}ObjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubobjectsDeletePolicy" type="{http://schemas.radixware.org/eas.xsd}LinkedObjectsDeletePolicyEnum" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SkipExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRq", propOrder = {
    "objectReference",
    "subobjectsDeletePolicy"
})
public class DeleteRq
    extends ObjectOrGroupRequest
{

    @XmlElement(name = "ObjectReference")
    protected List<ObjectReference> objectReference;
    @XmlElement(name = "SubobjectsDeletePolicy")
    @XmlSchemaType(name = "string")
    protected List<LinkedObjectsDeletePolicyEnum> subobjectsDeletePolicy;
    @XmlAttribute(name = "SkipExceptions")
    protected Boolean skipExceptions;

    /**
     * Gets the value of the objectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReference }
     * 
     * 
     */
    public List<ObjectReference> getObjectReference() {
        if (objectReference == null) {
            objectReference = new ArrayList<ObjectReference>();
        }
        return this.objectReference;
    }

    /**
     * Gets the value of the subobjectsDeletePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subobjectsDeletePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubobjectsDeletePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedObjectsDeletePolicyEnum }
     * 
     * 
     */
    public List<LinkedObjectsDeletePolicyEnum> getSubobjectsDeletePolicy() {
        if (subobjectsDeletePolicy == null) {
            subobjectsDeletePolicy = new ArrayList<LinkedObjectsDeletePolicyEnum>();
        }
        return this.subobjectsDeletePolicy;
    }

    /**
     * Gets the value of the skipExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkipExceptions() {
        if (skipExceptions == null) {
            return false;
        } else {
            return skipExceptions;
        }
    }

    /**
     * Sets the value of the skipExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipExceptions(Boolean value) {
        this.skipExceptions = value;
    }

}
