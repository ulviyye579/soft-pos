
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Token" type="{http://schemas.tranzaxis.com/tran-common.xsd}Token" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ActivateCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtCard", propOrder = {
    "token",
    "title",
    "seq"
})
public class ExtCard {

    @XmlElement(name = "Token")
    protected Token token;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ActivateCode")
    protected String activateCode;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setToken(Token value) {
        this.token = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the activateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateCode() {
        return activateCode;
    }

    /**
     * Sets the value of the activateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateCode(String value) {
        this.activateCode = value;
    }

}
