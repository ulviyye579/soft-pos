
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyPrearrangement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyPrearrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainEntry" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="DebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="CreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
@XmlType(name = "MoneyPrearrangement", propOrder = {
    "mainEntry"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Moneys.Prearrangement.class
})
public class MoneyPrearrangement {

    @XmlElement(name = "MainEntry")
    protected MoneyPrearrangement.MainEntry mainEntry;

    /**
     * Gets the value of the mainEntry property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyPrearrangement.MainEntry }
     *     
     */
    public MoneyPrearrangement.MainEntry getMainEntry() {
        return mainEntry;
    }

    /**
     * Sets the value of the mainEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyPrearrangement.MainEntry }
     *     
     */
    public void setMainEntry(MoneyPrearrangement.MainEntry value) {
        this.mainEntry = value;
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
     *       &lt;attribute name="DebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="DebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="CreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MainEntry {

        @XmlAttribute(name = "DebitAmt", required = true)
        protected BigDecimal debitAmt;
        @XmlAttribute(name = "DebitCcy", required = true)
        protected long debitCcy;
        @XmlAttribute(name = "CreditAmt", required = true)
        protected BigDecimal creditAmt;
        @XmlAttribute(name = "CreditCcy", required = true)
        protected long creditCcy;

        /**
         * Gets the value of the debitAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDebitAmt() {
            return debitAmt;
        }

        /**
         * Sets the value of the debitAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDebitAmt(BigDecimal value) {
            this.debitAmt = value;
        }

        /**
         * Gets the value of the debitCcy property.
         * 
         */
        public long getDebitCcy() {
            return debitCcy;
        }

        /**
         * Sets the value of the debitCcy property.
         * 
         */
        public void setDebitCcy(long value) {
            this.debitCcy = value;
        }

        /**
         * Gets the value of the creditAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCreditAmt() {
            return creditAmt;
        }

        /**
         * Sets the value of the creditAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCreditAmt(BigDecimal value) {
            this.creditAmt = value;
        }

        /**
         * Gets the value of the creditCcy property.
         * 
         */
        public long getCreditCcy() {
            return creditCcy;
        }

        /**
         * Sets the value of the creditCcy property.
         * 
         */
        public void setCreditCcy(long value) {
            this.creditCcy = value;
        }

    }

}
