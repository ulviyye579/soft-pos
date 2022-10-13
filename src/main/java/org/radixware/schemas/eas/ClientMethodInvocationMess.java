
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientMethodInvocationMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientMethodInvocationMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ClientMethodInvocationRs" type="{http://schemas.radixware.org/eas.xsd}ClientMethodInvocationRs"/&gt;
 *         &lt;element name="ClientMethodInvocationRq" type="{http://schemas.radixware.org/eas.xsd}ClientMethodInvocationRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientMethodInvocationMess", propOrder = {
    "clientMethodInvocationRs",
    "clientMethodInvocationRq"
})
public class ClientMethodInvocationMess {

    @XmlElement(name = "ClientMethodInvocationRs")
    protected ClientMethodInvocationRs clientMethodInvocationRs;
    @XmlElement(name = "ClientMethodInvocationRq")
    protected ClientMethodInvocationRq clientMethodInvocationRq;

    /**
     * Gets the value of the clientMethodInvocationRs property.
     * 
     * @return
     *     possible object is
     *     {@link ClientMethodInvocationRs }
     *     
     */
    public ClientMethodInvocationRs getClientMethodInvocationRs() {
        return clientMethodInvocationRs;
    }

    /**
     * Sets the value of the clientMethodInvocationRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientMethodInvocationRs }
     *     
     */
    public void setClientMethodInvocationRs(ClientMethodInvocationRs value) {
        this.clientMethodInvocationRs = value;
    }

    /**
     * Gets the value of the clientMethodInvocationRq property.
     * 
     * @return
     *     possible object is
     *     {@link ClientMethodInvocationRq }
     *     
     */
    public ClientMethodInvocationRq getClientMethodInvocationRq() {
        return clientMethodInvocationRq;
    }

    /**
     * Sets the value of the clientMethodInvocationRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientMethodInvocationRq }
     *     
     */
    public void setClientMethodInvocationRq(ClientMethodInvocationRq value) {
        this.clientMethodInvocationRq = value;
    }

}
