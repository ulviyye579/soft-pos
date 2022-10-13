
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReconciliationNetworkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationNetworkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="DinersClub"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RecapState"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="GrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="GrossAmtAlt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="GrossAmtStl" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="SettlementDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="FxRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="SuspensionCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SuspensionMsg" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SuspensionFieldName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SuspensionFieldValue" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "ReconciliationNetworkSpecific", propOrder = {
    "dinersClub"
})
public class ReconciliationNetworkSpecific {

    @XmlElement(name = "DinersClub")
    protected ReconciliationNetworkSpecific.DinersClub dinersClub;

    /**
     * Gets the value of the dinersClub property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationNetworkSpecific.DinersClub }
     *     
     */
    public ReconciliationNetworkSpecific.DinersClub getDinersClub() {
        return dinersClub;
    }

    /**
     * Sets the value of the dinersClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationNetworkSpecific.DinersClub }
     *     
     */
    public void setDinersClub(ReconciliationNetworkSpecific.DinersClub value) {
        this.dinersClub = value;
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
     *       &lt;attribute name="RecapState"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Currency" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="GrossAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="GrossAmtAlt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="GrossAmtStl" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="SettlementDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="FxRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="SuspensionCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SuspensionMsg" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SuspensionFieldName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SuspensionFieldValue" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DinersClub {

        @XmlAttribute(name = "RecapState")
        protected String recapState;
        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "GrossAmt")
        protected BigDecimal grossAmt;
        @XmlAttribute(name = "GrossAmtAlt")
        protected BigDecimal grossAmtAlt;
        @XmlAttribute(name = "GrossAmtStl")
        protected BigDecimal grossAmtStl;
        @XmlAttribute(name = "SettlementDate")
        protected XMLGregorianCalendar settlementDate;
        @XmlAttribute(name = "FxRate")
        protected BigDecimal fxRate;
        @XmlAttribute(name = "SuspensionCode")
        protected String suspensionCode;
        @XmlAttribute(name = "SuspensionMsg")
        protected String suspensionMsg;
        @XmlAttribute(name = "SuspensionFieldName")
        protected String suspensionFieldName;
        @XmlAttribute(name = "SuspensionFieldValue")
        protected String suspensionFieldValue;

        /**
         * Gets the value of the recapState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecapState() {
            return recapState;
        }

        /**
         * Sets the value of the recapState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecapState(String value) {
            this.recapState = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the grossAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossAmt() {
            return grossAmt;
        }

        /**
         * Sets the value of the grossAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossAmt(BigDecimal value) {
            this.grossAmt = value;
        }

        /**
         * Gets the value of the grossAmtAlt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossAmtAlt() {
            return grossAmtAlt;
        }

        /**
         * Sets the value of the grossAmtAlt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossAmtAlt(BigDecimal value) {
            this.grossAmtAlt = value;
        }

        /**
         * Gets the value of the grossAmtStl property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossAmtStl() {
            return grossAmtStl;
        }

        /**
         * Sets the value of the grossAmtStl property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossAmtStl(BigDecimal value) {
            this.grossAmtStl = value;
        }

        /**
         * Gets the value of the settlementDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSettlementDate() {
            return settlementDate;
        }

        /**
         * Sets the value of the settlementDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSettlementDate(XMLGregorianCalendar value) {
            this.settlementDate = value;
        }

        /**
         * Gets the value of the fxRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFxRate() {
            return fxRate;
        }

        /**
         * Sets the value of the fxRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFxRate(BigDecimal value) {
            this.fxRate = value;
        }

        /**
         * Gets the value of the suspensionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspensionCode() {
            return suspensionCode;
        }

        /**
         * Sets the value of the suspensionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspensionCode(String value) {
            this.suspensionCode = value;
        }

        /**
         * Gets the value of the suspensionMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspensionMsg() {
            return suspensionMsg;
        }

        /**
         * Sets the value of the suspensionMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspensionMsg(String value) {
            this.suspensionMsg = value;
        }

        /**
         * Gets the value of the suspensionFieldName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspensionFieldName() {
            return suspensionFieldName;
        }

        /**
         * Sets the value of the suspensionFieldName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspensionFieldName(String value) {
            this.suspensionFieldName = value;
        }

        /**
         * Gets the value of the suspensionFieldValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspensionFieldValue() {
            return suspensionFieldValue;
        }

        /**
         * Sets the value of the suspensionFieldValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspensionFieldValue(String value) {
            this.suspensionFieldValue = value;
        }

    }

}
