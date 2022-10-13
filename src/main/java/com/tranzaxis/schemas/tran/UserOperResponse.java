
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ParamValues;


/**
 * <p>Java class for UserOperResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserOperResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="List" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *                   &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ResultCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ResultDescription" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserOperResponse", propOrder = {
    "userAttrs",
    "list",
    "ext"
})
public class UserOperResponse {

    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "List")
    protected UserOperResponse.List list;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "ResultCode")
    protected String resultCode;
    @XmlAttribute(name = "ResultDescription")
    protected String resultDescription;

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link UserOperResponse.List }
     *     
     */
    public UserOperResponse.List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOperResponse.List }
     *     
     */
    public void setList(UserOperResponse.List value) {
        this.list = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExt(Object value) {
        this.ext = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
     *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userAttrs",
        "ext"
    })
    public static class List {

        @XmlElement(name = "UserAttrs")
        protected ParamValues userAttrs;
        @XmlElement(name = "Ext")
        protected Object ext;

        /**
         * Gets the value of the userAttrs property.
         * 
         * @return
         *     possible object is
         *     {@link ParamValues }
         *     
         */
        public ParamValues getUserAttrs() {
            return userAttrs;
        }

        /**
         * Sets the value of the userAttrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParamValues }
         *     
         */
        public void setUserAttrs(ParamValues value) {
            this.userAttrs = value;
        }

        /**
         * Gets the value of the ext property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getExt() {
            return ext;
        }

        /**
         * Sets the value of the ext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setExt(Object value) {
            this.ext = value;
        }

    }

}
