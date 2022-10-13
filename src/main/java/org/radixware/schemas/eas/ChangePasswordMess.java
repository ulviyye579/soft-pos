
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ChangePasswordRs" type="{http://schemas.radixware.org/eas.xsd}ChangePasswordRs"/&gt;
 *         &lt;element name="ChangePasswordRq" type="{http://schemas.radixware.org/eas.xsd}ChangePasswordRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordMess", propOrder = {
    "changePasswordRs",
    "changePasswordRq"
})
public class ChangePasswordMess {

    @XmlElement(name = "ChangePasswordRs")
    protected ChangePasswordRs changePasswordRs;
    @XmlElement(name = "ChangePasswordRq")
    protected ChangePasswordRq changePasswordRq;

    /**
     * Gets the value of the changePasswordRs property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordRs }
     *     
     */
    public ChangePasswordRs getChangePasswordRs() {
        return changePasswordRs;
    }

    /**
     * Sets the value of the changePasswordRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordRs }
     *     
     */
    public void setChangePasswordRs(ChangePasswordRs value) {
        this.changePasswordRs = value;
    }

    /**
     * Gets the value of the changePasswordRq property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordRq }
     *     
     */
    public ChangePasswordRq getChangePasswordRq() {
        return changePasswordRq;
    }

    /**
     * Sets the value of the changePasswordRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordRq }
     *     
     */
    public void setChangePasswordRq(ChangePasswordRq value) {
        this.changePasswordRq = value;
    }

}
