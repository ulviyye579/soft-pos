
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashDenoms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashDenoms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Denom" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Direction" type="{http://schemas.tranzaxis.com/tran-common.xsd}TermCashTransitDirectionEnum" /&gt;
 *                 &lt;attribute name="DeviceKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TermCassetteDeviceKindEnum" /&gt;
 *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Denomination" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Cnt" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Category" type="{http://schemas.tranzaxis.com/tran-common.xsd}NoteCategoryEnum" /&gt;
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
@XmlType(name = "CashDenoms", propOrder = {
    "denom"
})
public class CashDenoms {

    @XmlElement(name = "Denom", required = true)
    protected List<CashDenoms.Denom> denom;

    /**
     * Gets the value of the denom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashDenoms.Denom }
     * 
     * 
     */
    public List<CashDenoms.Denom> getDenom() {
        if (denom == null) {
            denom = new ArrayList<CashDenoms.Denom>();
        }
        return this.denom;
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
     *       &lt;attribute name="Direction" type="{http://schemas.tranzaxis.com/tran-common.xsd}TermCashTransitDirectionEnum" /&gt;
     *       &lt;attribute name="DeviceKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TermCassetteDeviceKindEnum" /&gt;
     *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Denomination" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Cnt" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Category" type="{http://schemas.tranzaxis.com/tran-common.xsd}NoteCategoryEnum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Denom {

        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DeviceKind", required = true)
        protected String deviceKind;
        @XmlAttribute(name = "Ccy", required = true)
        protected long ccy;
        @XmlAttribute(name = "Denomination", required = true)
        protected BigDecimal denomination;
        @XmlAttribute(name = "Cnt", required = true)
        protected long cnt;
        @XmlAttribute(name = "Rid")
        protected String rid;
        @XmlAttribute(name = "Category")
        protected String category;

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * Gets the value of the deviceKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceKind() {
            return deviceKind;
        }

        /**
         * Sets the value of the deviceKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceKind(String value) {
            this.deviceKind = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         */
        public long getCcy() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         */
        public void setCcy(long value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the denomination property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDenomination() {
            return denomination;
        }

        /**
         * Sets the value of the denomination property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDenomination(BigDecimal value) {
            this.denomination = value;
        }

        /**
         * Gets the value of the cnt property.
         * 
         */
        public long getCnt() {
            return cnt;
        }

        /**
         * Sets the value of the cnt property.
         * 
         */
        public void setCnt(long value) {
            this.cnt = value;
        }

        /**
         * Gets the value of the rid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRid() {
            return rid;
        }

        /**
         * Sets the value of the rid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRid(String value) {
            this.rid = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

    }

}
