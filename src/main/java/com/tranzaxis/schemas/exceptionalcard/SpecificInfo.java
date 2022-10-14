
package com.tranzaxis.schemas.exceptionalcard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.radixware.schemas.common.MoneyValue;


/**
 * <p>Java class for SpecificInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Visa"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Regions"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterCard"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="VipLimit" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *                   &lt;element name="Regions" maxOccurs="6"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Region" type="{http://schemas.radixware.org/types.xsd}Char" /&gt;
 *                           &lt;attribute name="Country"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                                 &lt;maxInclusive value="999"/&gt;
 *                                 &lt;minInclusive value="0"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="SubCountry"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                                 &lt;minInclusive value="0"/&gt;
 *                                 &lt;maxInclusive value="99"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PurgeDate" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="CardProgram"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CustomerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amex" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Jcb"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Regions"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Japan" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Asia" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Usa" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Europe" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Local" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Discover"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CardType" type="{http://schemas.tranzaxis.com/exceptionalCard.xsd}DiscoverCardType" /&gt;
 *                 &lt;attribute name="CardAssociation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInfo", propOrder = {
    "visa",
    "masterCard",
    "amex",
    "jcb",
    "discover"
})
public class SpecificInfo {

    @XmlElement(name = "Visa")
    protected SpecificInfo.Visa visa;
    @XmlElement(name = "MasterCard")
    protected SpecificInfo.MasterCard masterCard;
    @XmlElement(name = "Amex")
    protected Object amex;
    @XmlElement(name = "Jcb")
    protected SpecificInfo.Jcb jcb;
    @XmlElement(name = "Discover")
    protected SpecificInfo.Discover discover;

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.Visa }
     *     
     */
    public SpecificInfo.Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.Visa }
     *     
     */
    public void setVisa(SpecificInfo.Visa value) {
        this.visa = value;
    }

    /**
     * Gets the value of the masterCard property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.MasterCard }
     *     
     */
    public SpecificInfo.MasterCard getMasterCard() {
        return masterCard;
    }

    /**
     * Sets the value of the masterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.MasterCard }
     *     
     */
    public void setMasterCard(SpecificInfo.MasterCard value) {
        this.masterCard = value;
    }

    /**
     * Gets the value of the amex property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAmex() {
        return amex;
    }

    /**
     * Sets the value of the amex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAmex(Object value) {
        this.amex = value;
    }

    /**
     * Gets the value of the jcb property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.Jcb }
     *     
     */
    public SpecificInfo.Jcb getJcb() {
        return jcb;
    }

    /**
     * Sets the value of the jcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.Jcb }
     *     
     */
    public void setJcb(SpecificInfo.Jcb value) {
        this.jcb = value;
    }

    /**
     * Gets the value of the discover property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.Discover }
     *     
     */
    public SpecificInfo.Discover getDiscover() {
        return discover;
    }

    /**
     * Sets the value of the discover property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.Discover }
     *     
     */
    public void setDiscover(SpecificInfo.Discover value) {
        this.discover = value;
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
     *       &lt;attribute name="CardType" type="{http://schemas.tranzaxis.com/exceptionalCard.xsd}DiscoverCardType" /&gt;
     *       &lt;attribute name="CardAssociation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discover {

        @XmlAttribute(name = "CardType")
        protected String cardType;
        @XmlAttribute(name = "CardAssociation")
        protected String cardAssociation;

        /**
         * Gets the value of the cardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * Sets the value of the cardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardType(String value) {
            this.cardType = value;
        }

        /**
         * Gets the value of the cardAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardAssociation() {
            return cardAssociation;
        }

        /**
         * Sets the value of the cardAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardAssociation(String value) {
            this.cardAssociation = value;
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
     *         &lt;element name="Regions"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Japan" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Asia" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Usa" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Europe" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Local" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "regions"
    })
    public static class Jcb {

        @XmlElement(name = "Regions", required = true)
        protected SpecificInfo.Jcb.Regions regions;

        /**
         * Gets the value of the regions property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificInfo.Jcb.Regions }
         *     
         */
        public SpecificInfo.Jcb.Regions getRegions() {
            return regions;
        }

        /**
         * Sets the value of the regions property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificInfo.Jcb.Regions }
         *     
         */
        public void setRegions(SpecificInfo.Jcb.Regions value) {
            this.regions = value;
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
         *       &lt;attribute name="Japan" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Asia" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Usa" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Europe" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Local" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Regions {

            @XmlAttribute(name = "Japan", required = true)
            protected boolean japan;
            @XmlAttribute(name = "Asia", required = true)
            protected boolean asia;
            @XmlAttribute(name = "Usa", required = true)
            protected boolean usa;
            @XmlAttribute(name = "Europe", required = true)
            protected boolean europe;
            @XmlAttribute(name = "Local", required = true)
            protected boolean local;

            /**
             * Gets the value of the japan property.
             * 
             */
            public boolean isJapan() {
                return japan;
            }

            /**
             * Sets the value of the japan property.
             * 
             */
            public void setJapan(boolean value) {
                this.japan = value;
            }

            /**
             * Gets the value of the asia property.
             * 
             */
            public boolean isAsia() {
                return asia;
            }

            /**
             * Sets the value of the asia property.
             * 
             */
            public void setAsia(boolean value) {
                this.asia = value;
            }

            /**
             * Gets the value of the usa property.
             * 
             */
            public boolean isUsa() {
                return usa;
            }

            /**
             * Sets the value of the usa property.
             * 
             */
            public void setUsa(boolean value) {
                this.usa = value;
            }

            /**
             * Gets the value of the europe property.
             * 
             */
            public boolean isEurope() {
                return europe;
            }

            /**
             * Sets the value of the europe property.
             * 
             */
            public void setEurope(boolean value) {
                this.europe = value;
            }

            /**
             * Gets the value of the local property.
             * 
             */
            public boolean isLocal() {
                return local;
            }

            /**
             * Sets the value of the local property.
             * 
             */
            public void setLocal(boolean value) {
                this.local = value;
            }

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
     *       &lt;choice&gt;
     *         &lt;element name="VipLimit" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
     *         &lt;element name="Regions" maxOccurs="6"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Region" type="{http://schemas.radixware.org/types.xsd}Char" /&gt;
     *                 &lt;attribute name="Country"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *                       &lt;maxInclusive value="999"/&gt;
     *                       &lt;minInclusive value="0"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="SubCountry"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *                       &lt;minInclusive value="0"/&gt;
     *                       &lt;maxInclusive value="99"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PurgeDate" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="CardProgram"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CustomerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vipLimit",
        "regions"
    })
    public static class MasterCard {

        @XmlElement(name = "VipLimit")
        protected MoneyValue vipLimit;
        @XmlElement(name = "Regions")
        protected List<SpecificInfo.MasterCard.Regions> regions;
        @XmlAttribute(name = "CardProgram")
        protected String cardProgram;
        @XmlAttribute(name = "CustomerId")
        protected Long customerId;

        /**
         * Gets the value of the vipLimit property.
         * 
         * @return
         *     possible object is
         *     {@link MoneyValue }
         *     
         */
        public MoneyValue getVipLimit() {
            return vipLimit;
        }

        /**
         * Sets the value of the vipLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link MoneyValue }
         *     
         */
        public void setVipLimit(MoneyValue value) {
            this.vipLimit = value;
        }

        /**
         * Gets the value of the regions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecificInfo.MasterCard.Regions }
         * 
         * 
         */
        public List<SpecificInfo.MasterCard.Regions> getRegions() {
            if (regions == null) {
                regions = new ArrayList<SpecificInfo.MasterCard.Regions>();
            }
            return this.regions;
        }

        /**
         * Gets the value of the cardProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardProgram() {
            return cardProgram;
        }

        /**
         * Sets the value of the cardProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardProgram(String value) {
            this.cardProgram = value;
        }

        /**
         * Gets the value of the customerId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCustomerId() {
            return customerId;
        }

        /**
         * Sets the value of the customerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCustomerId(Long value) {
            this.customerId = value;
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
         *       &lt;attribute name="Region" type="{http://schemas.radixware.org/types.xsd}Char" /&gt;
         *       &lt;attribute name="Country"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
         *             &lt;maxInclusive value="999"/&gt;
         *             &lt;minInclusive value="0"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="SubCountry"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
         *             &lt;minInclusive value="0"/&gt;
         *             &lt;maxInclusive value="99"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PurgeDate" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Regions {

            @XmlAttribute(name = "Region")
            protected String region;
            @XmlAttribute(name = "Country")
            protected Integer country;
            @XmlAttribute(name = "SubCountry")
            protected Integer subCountry;
            @XmlAttribute(name = "PurgeDate", required = true)
            protected XMLGregorianCalendar purgeDate;

            /**
             * Gets the value of the region property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * Sets the value of the region property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCountry(Integer value) {
                this.country = value;
            }

            /**
             * Gets the value of the subCountry property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSubCountry() {
                return subCountry;
            }

            /**
             * Sets the value of the subCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSubCountry(Integer value) {
                this.subCountry = value;
            }

            /**
             * Gets the value of the purgeDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPurgeDate() {
                return purgeDate;
            }

            /**
             * Sets the value of the purgeDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPurgeDate(XMLGregorianCalendar value) {
                this.purgeDate = value;
            }

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
     *       &lt;attribute name="Regions"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Visa {

        @XmlAttribute(name = "Regions")
        protected List<String> regions;

        /**
         * Gets the value of the regions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRegions() {
            if (regions == null) {
                regions = new ArrayList<String>();
            }
            return this.regions;
        }

    }

}
