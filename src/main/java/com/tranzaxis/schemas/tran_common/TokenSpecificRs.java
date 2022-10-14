
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.tokens_alias.TokenAlias;


/**
 * <p>Java class for TokenSpecificRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenSpecificRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Card" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="BrandTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DetokenizedPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Person" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}PersonInfo"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="InstTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="NameLocal" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *       &lt;attribute name="LifeCycleRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSpecificRs", propOrder = {
    "card",
    "person",
    "alias"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Response.Specific.Token.class
})
public class TokenSpecificRs {

    @XmlElement(name = "Card")
    protected TokenSpecificRs.Card card;
    @XmlElement(name = "Person")
    protected TokenSpecificRs.Person person;
    @XmlElement(name = "Alias")
    protected TokenSpecificRs.Alias alias;
    @XmlAttribute(name = "LifeCycleRid")
    protected String lifeCycleRid;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSpecificRs.Card }
     *     
     */
    public TokenSpecificRs.Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSpecificRs.Card }
     *     
     */
    public void setCard(TokenSpecificRs.Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSpecificRs.Person }
     *     
     */
    public TokenSpecificRs.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSpecificRs.Person }
     *     
     */
    public void setPerson(TokenSpecificRs.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSpecificRs.Alias }
     *     
     */
    public TokenSpecificRs.Alias getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSpecificRs.Alias }
     *     
     */
    public void setAlias(TokenSpecificRs.Alias value) {
        this.alias = value;
    }

    /**
     * Gets the value of the lifeCycleRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleRid() {
        return lifeCycleRid;
    }

    /**
     * Sets the value of the lifeCycleRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleRid(String value) {
        this.lifeCycleRid = value;
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
     *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="BrandTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DetokenizedPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "panCrypt"
    })
    public static class Card {

        @XmlElement(name = "PanCrypt")
        protected AppEncryptedData panCrypt;
        @XmlAttribute(name = "Pan")
        protected String pan;
        @XmlAttribute(name = "ExpDate")
        protected XMLGregorianCalendar expDate;
        @XmlAttribute(name = "BrandTitle")
        protected String brandTitle;
        @XmlAttribute(name = "DetokenizedPan")
        protected String detokenizedPan;
        @XmlAttribute(name = "DMbr")
        protected Long dMbr;

        /**
         * Gets the value of the panCrypt property.
         * 
         * @return
         *     possible object is
         *     {@link AppEncryptedData }
         *     
         */
        public AppEncryptedData getPanCrypt() {
            return panCrypt;
        }

        /**
         * Sets the value of the panCrypt property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppEncryptedData }
         *     
         */
        public void setPanCrypt(AppEncryptedData value) {
            this.panCrypt = value;
        }

        /**
         * Gets the value of the pan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPan() {
            return pan;
        }

        /**
         * Sets the value of the pan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPan(String value) {
            this.pan = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the brandTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandTitle() {
            return brandTitle;
        }

        /**
         * Sets the value of the brandTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandTitle(String value) {
            this.brandTitle = value;
        }

        /**
         * Gets the value of the detokenizedPan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetokenizedPan() {
            return detokenizedPan;
        }

        /**
         * Sets the value of the detokenizedPan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetokenizedPan(String value) {
            this.detokenizedPan = value;
        }

        /**
         * Gets the value of the dMbr property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDMbr() {
            return dMbr;
        }

        /**
         * Sets the value of the dMbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDMbr(Long value) {
            this.dMbr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}PersonInfo"&gt;
     *       &lt;sequence&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="InstTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="NameLocal" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Person
        extends PersonInfo
    {

        @XmlAttribute(name = "InstTitle")
        protected String instTitle;
        @XmlAttribute(name = "NameLocal")
        protected String nameLocal;

        /**
         * Gets the value of the instTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstTitle() {
            return instTitle;
        }

        /**
         * Sets the value of the instTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstTitle(String value) {
            this.instTitle = value;
        }

        /**
         * Gets the value of the nameLocal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameLocal() {
            return nameLocal;
        }

        /**
         * Sets the value of the nameLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameLocal(String value) {
            this.nameLocal = value;
        }

    }

}
