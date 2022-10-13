
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestIfFileExistsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestIfFileExistsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IsExists" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestIfFileExistsRs")
public class TestIfFileExistsRs {

    @XmlAttribute(name = "IsExists", required = true)
    protected boolean isExists;

    /**
     * Gets the value of the isExists property.
     * 
     */
    public boolean isIsExists() {
        return isExists;
    }

    /**
     * Sets the value of the isExists property.
     * 
     */
    public void setIsExists(boolean value) {
        this.isExists = value;
    }

}
