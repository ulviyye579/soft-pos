
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.faultdetail.Exception;


/**
 * <p>Java class for DynamicListRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicListRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://schemas.radixware.org/eas.xsd}DynamicListRq"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Items" type="{http://schemas.radixware.org/eas.xsd}DynamicList"/&gt;
 *           &lt;element name="Exception" type="{http://schemas.radixware.org/faultdetail.xsd}Exception"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicListRs", propOrder = {
    "request",
    "items",
    "exception"
})
public class DynamicListRs {

    @XmlElement(name = "Request", required = true)
    protected DynamicListRq request;
    @XmlElement(name = "Items")
    protected DynamicList items;
    @XmlElement(name = "Exception")
    protected Exception exception;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicListRq }
     *     
     */
    public DynamicListRq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicListRq }
     *     
     */
    public void setRequest(DynamicListRq value) {
        this.request = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicList }
     *     
     */
    public DynamicList getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicList }
     *     
     */
    public void setItems(DynamicList value) {
        this.items = value;
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

}
