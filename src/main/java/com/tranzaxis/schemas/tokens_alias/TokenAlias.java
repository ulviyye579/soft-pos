
package com.tranzaxis.schemas.tokens_alias;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.tran.TokenAliasAuthData;


/**
 * <p>Java class for TokenAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenAlias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAliasType" minOccurs="0"/&gt;
 *         &lt;element name="NetworkType" type="{http://schemas.tranzaxis.com/tokens-alias.xsd}NetworkType" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenAlias", propOrder = {
    "extRid",
    "value",
    "type",
    "networkType",
    "createTime"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tokens_admin.TokenAlias.class,
    TokenAliasAuthData.class,
    com.tranzaxis.schemas.tran_common.CustInfoRs.Item.Attribute.TokenAliases.TokenAlias.class,
    com.tranzaxis.schemas.tran_common.TokenSpecific.Alias.class,
    com.tranzaxis.schemas.tran_common.TokenSpecificRs.Alias.class
})
public class TokenAlias {

    @XmlElementRef(name = "ExtRid", namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRid;
    @XmlElementRef(name = "Value", namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlElementRef(name = "Type", namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "NetworkType", namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkType;
    @XmlElementRef(name = "CreateTime", namespace = "http://schemas.tranzaxis.com/tokens-alias.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createTime;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the extRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRid() {
        return extRid;
    }

    /**
     * Sets the value of the extRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRid(JAXBElement<String> value) {
        this.extRid = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkType(JAXBElement<String> value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.createTime = value;
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

}
