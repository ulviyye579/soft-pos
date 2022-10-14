
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCascadeConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCascadeConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectPid" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="CustomMessage" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="DeleteSuboboject" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClearReference" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCascadeConfirmation", propOrder = {
    "objectPid",
    "customMessage",
    "deleteSuboboject",
    "clearReference"
})
public class DeleteCascadeConfirmation {

    @XmlElement(name = "ObjectPid")
    protected String objectPid;
    @XmlElement(name = "CustomMessage")
    protected String customMessage;
    @XmlElement(name = "DeleteSuboboject")
    protected List<String> deleteSuboboject;
    @XmlElement(name = "ClearReference")
    protected List<String> clearReference;

    /**
     * Gets the value of the objectPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPid() {
        return objectPid;
    }

    /**
     * Sets the value of the objectPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPid(String value) {
        this.objectPid = value;
    }

    /**
     * Gets the value of the customMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomMessage() {
        return customMessage;
    }

    /**
     * Sets the value of the customMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomMessage(String value) {
        this.customMessage = value;
    }

    /**
     * Gets the value of the deleteSuboboject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteSuboboject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteSuboboject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleteSuboboject() {
        if (deleteSuboboject == null) {
            deleteSuboboject = new ArrayList<String>();
        }
        return this.deleteSuboboject;
    }

    /**
     * Gets the value of the clearReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClearReference() {
        if (clearReference == null) {
            clearReference = new ArrayList<String>();
        }
        return this.clearReference;
    }

}
