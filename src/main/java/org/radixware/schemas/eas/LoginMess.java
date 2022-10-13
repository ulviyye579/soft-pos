
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="LoginRs" type="{http://schemas.radixware.org/eas.xsd}LoginRs"/&gt;
 *         &lt;element name="LoginRq" type="{http://schemas.radixware.org/eas.xsd}LoginRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginMess", propOrder = {
    "loginRs",
    "loginRq"
})
public class LoginMess {

    @XmlElement(name = "LoginRs")
    protected LoginRs loginRs;
    @XmlElement(name = "LoginRq")
    protected LoginRq loginRq;

    /**
     * Gets the value of the loginRs property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRs }
     *     
     */
    public LoginRs getLoginRs() {
        return loginRs;
    }

    /**
     * Sets the value of the loginRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRs }
     *     
     */
    public void setLoginRs(LoginRs value) {
        this.loginRs = value;
    }

    /**
     * Gets the value of the loginRq property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRq }
     *     
     */
    public LoginRq getLoginRq() {
        return loginRq;
    }

    /**
     * Sets the value of the loginRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRq }
     *     
     */
    public void setLoginRq(LoginRq value) {
        this.loginRq = value;
    }

}
