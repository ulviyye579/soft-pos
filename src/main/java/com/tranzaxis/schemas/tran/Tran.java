
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tran complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tran"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://schemas.tranzaxis.com/tran.xsd}Request" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://schemas.tranzaxis.com/tran.xsd}Response" minOccurs="0"/&gt;
 *         &lt;element name="Entries" type="{http://schemas.tranzaxis.com/tran.xsd}Entries" minOccurs="0"/&gt;
 *         &lt;element name="Postings" type="{http://schemas.tranzaxis.com/tran.xsd}Postings" minOccurs="0"/&gt;
 *         &lt;element name="HoldActions" type="{http://schemas.tranzaxis.com/tran.xsd}HoldActions" minOccurs="0"/&gt;
 *         &lt;element name="Doers" type="{http://schemas.tranzaxis.com/tran.xsd}Doers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tran", propOrder = {
    "request",
    "response",
    "entries",
    "postings",
    "holdActions",
    "doers"
})
public class Tran {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "Response")
    protected Response response;
    @XmlElement(name = "Entries")
    protected Entries entries;
    @XmlElement(name = "Postings")
    protected Postings postings;
    @XmlElement(name = "HoldActions")
    protected HoldActions holdActions;
    @XmlElement(name = "Doers")
    protected Doers doers;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link Entries }
     *     
     */
    public Entries getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entries }
     *     
     */
    public void setEntries(Entries value) {
        this.entries = value;
    }

    /**
     * Gets the value of the postings property.
     * 
     * @return
     *     possible object is
     *     {@link Postings }
     *     
     */
    public Postings getPostings() {
        return postings;
    }

    /**
     * Sets the value of the postings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postings }
     *     
     */
    public void setPostings(Postings value) {
        this.postings = value;
    }

    /**
     * Gets the value of the holdActions property.
     * 
     * @return
     *     possible object is
     *     {@link HoldActions }
     *     
     */
    public HoldActions getHoldActions() {
        return holdActions;
    }

    /**
     * Sets the value of the holdActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldActions }
     *     
     */
    public void setHoldActions(HoldActions value) {
        this.holdActions = value;
    }

    /**
     * Gets the value of the doers property.
     * 
     * @return
     *     possible object is
     *     {@link Doers }
     *     
     */
    public Doers getDoers() {
        return doers;
    }

    /**
     * Sets the value of the doers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doers }
     *     
     */
    public void setDoers(Doers value) {
        this.doers = value;
    }

}
