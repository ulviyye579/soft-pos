
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicListRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicListRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UdfPid" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *         &lt;element name="AttrRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ContextObject" type="{http://schemas.radixware.org/eas.xsd}ObjectReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicListRq", propOrder = {
    "udfPid",
    "attrRid",
    "contextObject"
})
public class DynamicListRq {

    @XmlElement(name = "UdfPid", required = true)
    protected String udfPid;
    @XmlElement(name = "AttrRid")
    protected String attrRid;
    @XmlElement(name = "ContextObject")
    protected ObjectReference contextObject;

    /**
     * Gets the value of the udfPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdfPid() {
        return udfPid;
    }

    /**
     * Sets the value of the udfPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdfPid(String value) {
        this.udfPid = value;
    }

    /**
     * Gets the value of the attrRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrRid() {
        return attrRid;
    }

    /**
     * Sets the value of the attrRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrRid(String value) {
        this.attrRid = value;
    }

    /**
     * Gets the value of the contextObject property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReference }
     *     
     */
    public ObjectReference getContextObject() {
        return contextObject;
    }

    /**
     * Sets the value of the contextObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReference }
     *     
     */
    public void setContextObject(ObjectReference value) {
        this.contextObject = value;
    }

}
