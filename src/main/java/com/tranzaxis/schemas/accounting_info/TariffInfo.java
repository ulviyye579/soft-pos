
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.TariffClassifications;


/**
 * <p>Java class for TariffInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EarlierAccrued" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="EarlierNonAccrued" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Conversion" type="{http://schemas.tranzaxis.com/accounting-info.xsd}Conversion" minOccurs="0"/&gt;
 *         &lt;element name="Rounding" type="{http://schemas.tranzaxis.com/accounting-info.xsd}Rounding" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Fee" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffMinMax"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Ranges" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Range" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRange" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Simple" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="SrcForRange" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="Flat" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="LowBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="UpBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="Mult" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;attribute name="Src" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                   &lt;attribute name="InitialSrc" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                   &lt;attribute name="InitialSrcCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;attribute name="Corrections"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Interest" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Day" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRate"&gt;
 *                             &lt;attribute name="Day" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                             &lt;attribute name="RulesVerId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                             &lt;attribute name="SrcForCalc" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="Result" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="Compounded" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                             &lt;attribute name="DayMultiplier" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="Compound" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                   &lt;attribute name="CompoundFormula" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Rate" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRate"&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Classifications" type="{http://schemas.tranzaxis.com/common-types.xsd}TariffClassifications" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TariffObjectEntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TariffObjectId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Negate" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInfo", propOrder = {
    "earlierAccrued",
    "earlierNonAccrued",
    "conversion",
    "rounding",
    "fee",
    "interest",
    "rate",
    "classifications",
    "ext"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.accounting_info.TariffExplanation.Tariffs.Tariff.class
})
public class TariffInfo {

    @XmlElement(name = "EarlierAccrued")
    protected BigDecimal earlierAccrued;
    @XmlElement(name = "EarlierNonAccrued")
    protected BigDecimal earlierNonAccrued;
    @XmlElement(name = "Conversion")
    protected Conversion conversion;
    @XmlElement(name = "Rounding")
    protected Rounding rounding;
    @XmlElement(name = "Fee")
    protected TariffInfo.Fee fee;
    @XmlElement(name = "Interest")
    protected TariffInfo.Interest interest;
    @XmlElement(name = "Rate")
    protected TariffInfo.Rate rate;
    @XmlElement(name = "Classifications")
    protected TariffClassifications classifications;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "TariffObjectEntityId")
    protected String tariffObjectEntityId;
    @XmlAttribute(name = "TariffObjectId")
    protected String tariffObjectId;
    @XmlAttribute(name = "Negate")
    protected Boolean negate;

    /**
     * Gets the value of the earlierAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlierAccrued() {
        return earlierAccrued;
    }

    /**
     * Sets the value of the earlierAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlierAccrued(BigDecimal value) {
        this.earlierAccrued = value;
    }

    /**
     * Gets the value of the earlierNonAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlierNonAccrued() {
        return earlierNonAccrued;
    }

    /**
     * Sets the value of the earlierNonAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlierNonAccrued(BigDecimal value) {
        this.earlierNonAccrued = value;
    }

    /**
     * Gets the value of the conversion property.
     * 
     * @return
     *     possible object is
     *     {@link Conversion }
     *     
     */
    public Conversion getConversion() {
        return conversion;
    }

    /**
     * Sets the value of the conversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversion }
     *     
     */
    public void setConversion(Conversion value) {
        this.conversion = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setRounding(Rounding value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInfo.Fee }
     *     
     */
    public TariffInfo.Fee getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInfo.Fee }
     *     
     */
    public void setFee(TariffInfo.Fee value) {
        this.fee = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInfo.Interest }
     *     
     */
    public TariffInfo.Interest getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInfo.Interest }
     *     
     */
    public void setInterest(TariffInfo.Interest value) {
        this.interest = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInfo.Rate }
     *     
     */
    public TariffInfo.Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInfo.Rate }
     *     
     */
    public void setRate(TariffInfo.Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link TariffClassifications }
     *     
     */
    public TariffClassifications getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffClassifications }
     *     
     */
    public void setClassifications(TariffClassifications value) {
        this.classifications = value;
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
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcy(Long value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the tariffObjectEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffObjectEntityId() {
        return tariffObjectEntityId;
    }

    /**
     * Sets the value of the tariffObjectEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffObjectEntityId(String value) {
        this.tariffObjectEntityId = value;
    }

    /**
     * Gets the value of the tariffObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffObjectId() {
        return tariffObjectId;
    }

    /**
     * Sets the value of the tariffObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffObjectId(String value) {
        this.tariffObjectId = value;
    }

    /**
     * Gets the value of the negate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegate() {
        if (negate == null) {
            return false;
        } else {
            return negate;
        }
    }

    /**
     * Sets the value of the negate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegate(Boolean value) {
        this.negate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffMinMax"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Ranges" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Range" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRange" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Simple" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="SrcForRange" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Flat" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="LowBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="UpBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Mult" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="Src" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="InitialSrc" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="InitialSrcCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Corrections"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ranges",
        "simple"
    })
    public static class Fee
        extends TariffMinMax
    {

        @XmlElement(name = "Ranges")
        protected TariffInfo.Fee.Ranges ranges;
        @XmlElement(name = "Simple")
        protected TariffInfo.Fee.Simple simple;
        @XmlAttribute(name = "Src")
        protected BigDecimal src;
        @XmlAttribute(name = "InitialSrc")
        protected BigDecimal initialSrc;
        @XmlAttribute(name = "InitialSrcCcy")
        protected Long initialSrcCcy;
        @XmlAttribute(name = "Corrections")
        protected List<BigDecimal> corrections;

        /**
         * Gets the value of the ranges property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInfo.Fee.Ranges }
         *     
         */
        public TariffInfo.Fee.Ranges getRanges() {
            return ranges;
        }

        /**
         * Sets the value of the ranges property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInfo.Fee.Ranges }
         *     
         */
        public void setRanges(TariffInfo.Fee.Ranges value) {
            this.ranges = value;
        }

        /**
         * Gets the value of the simple property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInfo.Fee.Simple }
         *     
         */
        public TariffInfo.Fee.Simple getSimple() {
            return simple;
        }

        /**
         * Sets the value of the simple property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInfo.Fee.Simple }
         *     
         */
        public void setSimple(TariffInfo.Fee.Simple value) {
            this.simple = value;
        }

        /**
         * Gets the value of the src property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSrc() {
            return src;
        }

        /**
         * Sets the value of the src property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSrc(BigDecimal value) {
            this.src = value;
        }

        /**
         * Gets the value of the initialSrc property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInitialSrc() {
            return initialSrc;
        }

        /**
         * Sets the value of the initialSrc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInitialSrc(BigDecimal value) {
            this.initialSrc = value;
        }

        /**
         * Gets the value of the initialSrcCcy property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInitialSrcCcy() {
            return initialSrcCcy;
        }

        /**
         * Sets the value of the initialSrcCcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInitialSrcCcy(Long value) {
            this.initialSrcCcy = value;
        }

        /**
         * Gets the value of the corrections property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corrections property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorrections().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getCorrections() {
            if (corrections == null) {
                corrections = new ArrayList<BigDecimal>();
            }
            return this.corrections;
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
         *         &lt;element name="Range" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRange" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "range"
        })
        public static class Ranges {

            @XmlElement(name = "Range", required = true)
            protected List<TariffRange> range;
            @XmlAttribute(name = "CellMin")
            protected BigDecimal cellMin;
            @XmlAttribute(name = "CellMax")
            protected BigDecimal cellMax;

            /**
             * Gets the value of the range property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the range property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TariffRange }
             * 
             * 
             */
            public List<TariffRange> getRange() {
                if (range == null) {
                    range = new ArrayList<TariffRange>();
                }
                return this.range;
            }

            /**
             * Gets the value of the cellMin property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCellMin() {
                return cellMin;
            }

            /**
             * Sets the value of the cellMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCellMin(BigDecimal value) {
                this.cellMin = value;
            }

            /**
             * Gets the value of the cellMax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCellMax() {
                return cellMax;
            }

            /**
             * Sets the value of the cellMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCellMax(BigDecimal value) {
                this.cellMax = value;
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
         *       &lt;attribute name="SrcForRange" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Flat" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="LowBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="UpBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Mult" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="CellMin" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="CellMax" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Simple {

            @XmlAttribute(name = "SrcForRange")
            protected BigDecimal srcForRange;
            @XmlAttribute(name = "Flat")
            protected BigDecimal flat;
            @XmlAttribute(name = "LowBound")
            protected BigDecimal lowBound;
            @XmlAttribute(name = "UpBound")
            protected BigDecimal upBound;
            @XmlAttribute(name = "Mult")
            protected BigDecimal mult;
            @XmlAttribute(name = "CellMin")
            protected BigDecimal cellMin;
            @XmlAttribute(name = "CellMax")
            protected BigDecimal cellMax;

            /**
             * Gets the value of the srcForRange property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSrcForRange() {
                return srcForRange;
            }

            /**
             * Sets the value of the srcForRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSrcForRange(BigDecimal value) {
                this.srcForRange = value;
            }

            /**
             * Gets the value of the flat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFlat() {
                return flat;
            }

            /**
             * Sets the value of the flat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFlat(BigDecimal value) {
                this.flat = value;
            }

            /**
             * Gets the value of the lowBound property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLowBound() {
                return lowBound;
            }

            /**
             * Sets the value of the lowBound property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLowBound(BigDecimal value) {
                this.lowBound = value;
            }

            /**
             * Gets the value of the upBound property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUpBound() {
                return upBound;
            }

            /**
             * Sets the value of the upBound property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUpBound(BigDecimal value) {
                this.upBound = value;
            }

            /**
             * Gets the value of the mult property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMult() {
                return mult;
            }

            /**
             * Sets the value of the mult property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMult(BigDecimal value) {
                this.mult = value;
            }

            /**
             * Gets the value of the cellMin property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCellMin() {
                return cellMin;
            }

            /**
             * Sets the value of the cellMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCellMin(BigDecimal value) {
                this.cellMin = value;
            }

            /**
             * Gets the value of the cellMax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCellMax() {
                return cellMax;
            }

            /**
             * Sets the value of the cellMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCellMax(BigDecimal value) {
                this.cellMax = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Day" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRate"&gt;
     *                 &lt;attribute name="Day" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="RulesVerId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="SrcForCalc" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Result" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Compounded" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="DayMultiplier" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Compound" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="CompoundFormula" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "day"
    })
    public static class Interest {

        @XmlElement(name = "Day")
        protected List<TariffInfo.Interest.Day> day;
        @XmlAttribute(name = "Compound")
        protected Boolean compound;
        @XmlAttribute(name = "CompoundFormula")
        protected Boolean compoundFormula;

        /**
         * Gets the value of the day property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the day property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TariffInfo.Interest.Day }
         * 
         * 
         */
        public List<TariffInfo.Interest.Day> getDay() {
            if (day == null) {
                day = new ArrayList<TariffInfo.Interest.Day>();
            }
            return this.day;
        }

        /**
         * Gets the value of the compound property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCompound() {
            return compound;
        }

        /**
         * Sets the value of the compound property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCompound(Boolean value) {
            this.compound = value;
        }

        /**
         * Gets the value of the compoundFormula property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCompoundFormula() {
            return compoundFormula;
        }

        /**
         * Sets the value of the compoundFormula property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCompoundFormula(Boolean value) {
            this.compoundFormula = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRate"&gt;
         *       &lt;attribute name="Day" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="RulesVerId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="SrcForCalc" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Result" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Compounded" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="DayMultiplier" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Day
            extends TariffRate
        {

            @XmlAttribute(name = "Day", required = true)
            protected XMLGregorianCalendar day;
            @XmlAttribute(name = "RulesVerId", required = true)
            protected long rulesVerId;
            @XmlAttribute(name = "SrcForCalc")
            protected BigDecimal srcForCalc;
            @XmlAttribute(name = "Result", required = true)
            protected BigDecimal result;
            @XmlAttribute(name = "Compounded")
            protected BigDecimal compounded;
            @XmlAttribute(name = "DayMultiplier")
            protected Long dayMultiplier;

            /**
             * Gets the value of the day property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDay() {
                return day;
            }

            /**
             * Sets the value of the day property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDay(XMLGregorianCalendar value) {
                this.day = value;
            }

            /**
             * Gets the value of the rulesVerId property.
             * 
             */
            public long getRulesVerId() {
                return rulesVerId;
            }

            /**
             * Sets the value of the rulesVerId property.
             * 
             */
            public void setRulesVerId(long value) {
                this.rulesVerId = value;
            }

            /**
             * Gets the value of the srcForCalc property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSrcForCalc() {
                return srcForCalc;
            }

            /**
             * Sets the value of the srcForCalc property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSrcForCalc(BigDecimal value) {
                this.srcForCalc = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setResult(BigDecimal value) {
                this.result = value;
            }

            /**
             * Gets the value of the compounded property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCompounded() {
                return compounded;
            }

            /**
             * Sets the value of the compounded property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCompounded(BigDecimal value) {
                this.compounded = value;
            }

            /**
             * Gets the value of the dayMultiplier property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDayMultiplier() {
                return dayMultiplier;
            }

            /**
             * Sets the value of the dayMultiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDayMultiplier(Long value) {
                this.dayMultiplier = value;
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
     *     &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffRate"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Rate
        extends TariffRate
    {


    }

}
