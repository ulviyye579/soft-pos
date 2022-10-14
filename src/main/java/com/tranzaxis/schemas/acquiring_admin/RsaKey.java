
package com.tranzaxis.schemas.acquiring_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/acquiring-admin.xsd}Key"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exp" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Modulus" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *         &lt;element name="Chain" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cert" type="{http://schemas.radixware.org/types.xsd}BinHex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaKey", propOrder = {
    "exp",
    "modulus",
    "chain"
})
public class RsaKey
    extends Key
{

    @XmlElement(name = "Exp")
    protected Long exp;
    @XmlElement(name = "Modulus", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] modulus;
    @XmlElement(name = "Chain")
    protected RsaKey.Chain chain;

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExp(Long value) {
        this.exp = value;
    }

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulus(byte[] value) {
        this.modulus = value;
    }

    /**
     * Gets the value of the chain property.
     * 
     * @return
     *     possible object is
     *     {@link RsaKey.Chain }
     *     
     */
    public RsaKey.Chain getChain() {
        return chain;
    }

    /**
     * Sets the value of the chain property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaKey.Chain }
     *     
     */
    public void setChain(RsaKey.Chain value) {
        this.chain = value;
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
     *         &lt;element name="Cert" type="{http://schemas.radixware.org/types.xsd}BinHex" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "cert"
    })
    public static class Chain {

        @XmlElement(name = "Cert", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected List<byte[]> cert;

        /**
         * Gets the value of the cert property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cert property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCert().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<byte[]> getCert() {
            if (cert == null) {
                cert = new ArrayList<byte[]>();
            }
            return this.cert;
        }

    }

}
