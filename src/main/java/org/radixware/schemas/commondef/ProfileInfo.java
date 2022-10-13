
package org.radixware.schemas.commondef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="timingSectionId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInfo")
public class ProfileInfo {

    @XmlAttribute(name = "timingSectionId")
    protected String timingSectionId;

    /**
     * Gets the value of the timingSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingSectionId() {
        return timingSectionId;
    }

    /**
     * Sets the value of the timingSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingSectionId(String value) {
        this.timingSectionId = value;
    }

}
