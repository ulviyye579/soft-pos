
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthScheme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthMethods"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="AuthMethod" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthMethod"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthScheme", propOrder = {
    "authMethods"
})
public class AuthScheme {

    @XmlElement(name = "AuthMethods", required = true)
    protected AuthScheme.AuthMethods authMethods;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the authMethods property.
     * 
     * @return
     *     possible object is
     *     {@link AuthScheme.AuthMethods }
     *     
     */
    public AuthScheme.AuthMethods getAuthMethods() {
        return authMethods;
    }

    /**
     * Sets the value of the authMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthScheme.AuthMethods }
     *     
     */
    public void setAuthMethods(AuthScheme.AuthMethods value) {
        this.authMethods = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="AuthMethod" type="{http://schemas.tranzaxis.com/tran-common.xsd}AuthMethod"/&gt;
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
        "authMethod"
    })
    public static class AuthMethods {

        @XmlElement(name = "AuthMethod")
        protected List<AuthMethod> authMethod;

        /**
         * Gets the value of the authMethod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authMethod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuthMethod }
         * 
         * 
         */
        public List<AuthMethod> getAuthMethod() {
            if (authMethod == null) {
                authMethod = new ArrayList<AuthMethod>();
            }
            return this.authMethod;
        }

    }

}
