
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.tokens_alias.TokenAlias;


/**
 * <p>Java class for TokenSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}Token"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alias" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TokenStatus" type="{http://schemas.tranzaxis.com/tran-common.xsd}TokenStatus" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSpecific", propOrder = {
    "alias"
})
public class TokenSpecific
    extends Token
{

    @XmlElement(name = "Alias")
    protected TokenSpecific.Alias alias;
    @XmlAttribute(name = "TokenStatus")
    protected String tokenStatus;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSpecific.Alias }
     *     
     */
    public TokenSpecific.Alias getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSpecific.Alias }
     *     
     */
    public void setAlias(TokenSpecific.Alias value) {
        this.alias = value;
    }

    /**
     * Gets the value of the tokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Sets the value of the tokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenStatus(String value) {
        this.tokenStatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inUse"
    })
    public static class Alias
        extends TokenAlias
    {

        @XmlElement(name = "InUse")
        protected Boolean inUse;

        /**
         * Gets the value of the inUse property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInUse() {
            return inUse;
        }

        /**
         * Sets the value of the inUse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInUse(Boolean value) {
            this.inUse = value;
        }

    }

}
