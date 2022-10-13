
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffExplanation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffExplanation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Tariff" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffInfo" minOccurs="0"/&gt;
 *         &lt;element name="Tariffs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tariff" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffInfo"&gt;
 *                           &lt;attribute name="TariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="MainTariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="CellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ResultCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ResultAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "TariffExplanation", propOrder = {
    "tariff",
    "tariffs"
})
public class TariffExplanation {

    @XmlElement(name = "Tariff")
    protected TariffInfo tariff;
    @XmlElement(name = "Tariffs")
    protected TariffExplanation.Tariffs tariffs;

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInfo }
     *     
     */
    public TariffInfo getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInfo }
     *     
     */
    public void setTariff(TariffInfo value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the tariffs property.
     * 
     * @return
     *     possible object is
     *     {@link TariffExplanation.Tariffs }
     *     
     */
    public TariffExplanation.Tariffs getTariffs() {
        return tariffs;
    }

    /**
     * Sets the value of the tariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffExplanation.Tariffs }
     *     
     */
    public void setTariffs(TariffExplanation.Tariffs value) {
        this.tariffs = value;
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
     *         &lt;element name="Tariff" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffInfo"&gt;
     *                 &lt;attribute name="TariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="MainTariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="CellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ResultCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ResultAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/extension&gt;
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
        "tariff"
    })
    public static class Tariffs {

        @XmlElement(name = "Tariff")
        protected List<TariffExplanation.Tariffs.Tariff> tariff;

        /**
         * Gets the value of the tariff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TariffExplanation.Tariffs.Tariff }
         * 
         * 
         */
        public List<TariffExplanation.Tariffs.Tariff> getTariff() {
            if (tariff == null) {
                tariff = new ArrayList<TariffExplanation.Tariffs.Tariff>();
            }
            return this.tariff;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffInfo"&gt;
         *       &lt;attribute name="TariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="MainTariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="CellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ResultCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ResultAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tariff
            extends TariffInfo
        {

            @XmlAttribute(name = "TariffVerId")
            protected Long tariffVerId;
            @XmlAttribute(name = "MainTariffVerId")
            protected Long mainTariffVerId;
            @XmlAttribute(name = "CellId")
            protected Long cellId;
            @XmlAttribute(name = "ResultCcy")
            protected Long resultCcy;
            @XmlAttribute(name = "ResultAmt")
            protected BigDecimal resultAmt;

            /**
             * Gets the value of the tariffVerId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTariffVerId() {
                return tariffVerId;
            }

            /**
             * Sets the value of the tariffVerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTariffVerId(Long value) {
                this.tariffVerId = value;
            }

            /**
             * Gets the value of the mainTariffVerId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMainTariffVerId() {
                return mainTariffVerId;
            }

            /**
             * Sets the value of the mainTariffVerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMainTariffVerId(Long value) {
                this.mainTariffVerId = value;
            }

            /**
             * Gets the value of the cellId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCellId() {
                return cellId;
            }

            /**
             * Sets the value of the cellId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCellId(Long value) {
                this.cellId = value;
            }

            /**
             * Gets the value of the resultCcy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getResultCcy() {
                return resultCcy;
            }

            /**
             * Sets the value of the resultCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setResultCcy(Long value) {
                this.resultCcy = value;
            }

            /**
             * Gets the value of the resultAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getResultAmt() {
                return resultAmt;
            }

            /**
             * Sets the value of the resultAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setResultAmt(BigDecimal value) {
                this.resultAmt = value;
            }

        }

    }

}
