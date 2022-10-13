
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenAlias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ObjectMustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenAlias", propOrder = {
    "tokenId"
})
public class TokenAlias
    extends com.tranzaxis.schemas.tokens_alias.TokenAlias
{

    @XmlElementRef(name = "TokenId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tokenId;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;
    @XmlAttribute(name = "ObjectMustExist")
    protected Boolean objectMustExist;

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTokenId(JAXBElement<Long> value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

    /**
     * Gets the value of the objectMustExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjectMustExist() {
        return objectMustExist;
    }

    /**
     * Sets the value of the objectMustExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjectMustExist(Boolean value) {
        this.objectMustExist = value;
    }

}
