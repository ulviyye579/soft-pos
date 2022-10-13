
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.faultdetail.Exception;


/**
 * <p>Java class for ObjectTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTitle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *           &lt;element name="Exception" type="{http://schemas.radixware.org/faultdetail.xsd}Exception"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="State" use="required" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitleResultStateEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTitle", propOrder = {
    "key",
    "title",
    "exception"
})
public class ObjectTitle {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Exception")
    protected Exception exception;
    @XmlAttribute(name = "State", required = true)
    protected GetObjectTitleResultStateEnum state;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setException(Exception value) {
        this.exception = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link GetObjectTitleResultStateEnum }
     *     
     */
    public GetObjectTitleResultStateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetObjectTitleResultStateEnum }
     *     
     */
    public void setState(GetObjectTitleResultStateEnum value) {
        this.state = value;
    }

}
