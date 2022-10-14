
package com.tranzaxis.schemas.tariffs_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.ParamValues;


/**
 * <p>Java class for TariffVer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffVer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinishOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}CTariffStatus" minOccurs="0"/&gt;
 *         &lt;element name="BaseValOvrMode" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}CBaseValOverrideMode" minOccurs="0"/&gt;
 *         &lt;element name="BaseVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="MinOvrMode" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}CLimitOvrMode" minOccurs="0"/&gt;
 *         &lt;element name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="MaxOvrMode" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}CLimitOvrMode" minOccurs="0"/&gt;
 *         &lt;element name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="ValUserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Table" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cell" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                             &lt;element name="UseTiers" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *                             &lt;element name="Tiers" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tiers" minOccurs="0"/&gt;
 *                             &lt;element name="Dims" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellDims" minOccurs="0"/&gt;
 *                             &lt;element name="Value" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *                           &lt;attribute name="DimRid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimRid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimRid3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimRid4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimRid5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimRid6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DimVal6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="BaseVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Percent" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Change" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tiers" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffVer", propOrder = {
    "startTime",
    "startOperDay",
    "finishOperDay",
    "isActive",
    "status",
    "baseValOvrMode",
    "baseVal",
    "percent",
    "minOvrMode",
    "minVal",
    "maxOvrMode",
    "maxVal",
    "valUserAttrs",
    "table",
    "tiers"
})
public class TariffVer {

    @XmlElementRef(name = "StartTime", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "StartOperDay", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startOperDay;
    @XmlElementRef(name = "FinishOperDay", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishOperDay;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "BaseValOvrMode")
    protected String baseValOvrMode;
    @XmlElementRef(name = "BaseVal", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> baseVal;
    @XmlElementRef(name = "Percent", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> percent;
    @XmlElement(name = "MinOvrMode")
    protected String minOvrMode;
    @XmlElementRef(name = "MinVal", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> minVal;
    @XmlElement(name = "MaxOvrMode")
    protected String maxOvrMode;
    @XmlElementRef(name = "MaxVal", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> maxVal;
    @XmlElement(name = "ValUserAttrs")
    protected ParamValues valUserAttrs;
    @XmlElement(name = "Table")
    protected TariffVer.Table table;
    @XmlElement(name = "Tiers")
    protected Tiers tiers;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartOperDay() {
        return startOperDay;
    }

    /**
     * Sets the value of the startOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartOperDay(JAXBElement<XMLGregorianCalendar> value) {
        this.startOperDay = value;
    }

    /**
     * Gets the value of the finishOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishOperDay() {
        return finishOperDay;
    }

    /**
     * Sets the value of the finishOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishOperDay(JAXBElement<XMLGregorianCalendar> value) {
        this.finishOperDay = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the baseValOvrMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseValOvrMode() {
        return baseValOvrMode;
    }

    /**
     * Sets the value of the baseValOvrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseValOvrMode(String value) {
        this.baseValOvrMode = value;
    }

    /**
     * Gets the value of the baseVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBaseVal() {
        return baseVal;
    }

    /**
     * Sets the value of the baseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBaseVal(JAXBElement<BigDecimal> value) {
        this.baseVal = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPercent(JAXBElement<BigDecimal> value) {
        this.percent = value;
    }

    /**
     * Gets the value of the minOvrMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinOvrMode() {
        return minOvrMode;
    }

    /**
     * Sets the value of the minOvrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinOvrMode(String value) {
        this.minOvrMode = value;
    }

    /**
     * Gets the value of the minVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMinVal() {
        return minVal;
    }

    /**
     * Sets the value of the minVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMinVal(JAXBElement<BigDecimal> value) {
        this.minVal = value;
    }

    /**
     * Gets the value of the maxOvrMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOvrMode() {
        return maxOvrMode;
    }

    /**
     * Sets the value of the maxOvrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOvrMode(String value) {
        this.maxOvrMode = value;
    }

    /**
     * Gets the value of the maxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaxVal() {
        return maxVal;
    }

    /**
     * Sets the value of the maxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaxVal(JAXBElement<BigDecimal> value) {
        this.maxVal = value;
    }

    /**
     * Gets the value of the valUserAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getValUserAttrs() {
        return valUserAttrs;
    }

    /**
     * Sets the value of the valUserAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setValUserAttrs(ParamValues value) {
        this.valUserAttrs = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TariffVer.Table }
     *     
     */
    public TariffVer.Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffVer.Table }
     *     
     */
    public void setTable(TariffVer.Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the tiers property.
     * 
     * @return
     *     possible object is
     *     {@link Tiers }
     *     
     */
    public Tiers getTiers() {
        return tiers;
    }

    /**
     * Sets the value of the tiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tiers }
     *     
     */
    public void setTiers(Tiers value) {
        this.tiers = value;
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
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isToDelete() {
        if (toDelete == null) {
            return false;
        } else {
            return toDelete;
        }
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
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
     *         &lt;element name="Cell" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *                   &lt;element name="UseTiers" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
     *                   &lt;element name="Tiers" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tiers" minOccurs="0"/&gt;
     *                   &lt;element name="Dims" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellDims" minOccurs="0"/&gt;
     *                   &lt;element name="Value" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellValue" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
     *                 &lt;attribute name="DimRid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimRid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimRid3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimRid4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimRid5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimRid6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DimVal6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="BaseVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Percent" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Change" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cell"
    })
    public static class Table {

        @XmlElement(name = "Cell")
        protected List<TariffVer.Table.Cell> cell;
        @XmlAttribute(name = "Mode")
        protected ListModifyMode mode;

        /**
         * Gets the value of the cell property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cell property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCell().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TariffVer.Table.Cell }
         * 
         * 
         */
        public List<TariffVer.Table.Cell> getCell() {
            if (cell == null) {
                cell = new ArrayList<TariffVer.Table.Cell>();
            }
            return this.cell;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link ListModifyMode }
         *     
         */
        public ListModifyMode getMode() {
            if (mode == null) {
                return ListModifyMode.CHANGE;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListModifyMode }
         *     
         */
        public void setMode(ListModifyMode value) {
            this.mode = value;
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
         *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
         *         &lt;element name="UseTiers" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
         *         &lt;element name="Tiers" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tiers" minOccurs="0"/&gt;
         *         &lt;element name="Dims" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellDims" minOccurs="0"/&gt;
         *         &lt;element name="Value" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellValue" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
         *       &lt;attribute name="DimRid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimRid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimRid3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimRid4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimRid5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimRid6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal3" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal4" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal5" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DimVal6" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="BaseVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Percent" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ccy",
            "useTiers",
            "tiers",
            "dims",
            "value"
        })
        public static class Cell {

            @XmlElementRef(name = "Ccy", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> ccy;
            @XmlElement(name = "UseTiers")
            protected Boolean useTiers;
            @XmlElement(name = "Tiers")
            protected Tiers tiers;
            @XmlElement(name = "Dims")
            protected TariffTableCellDims dims;
            @XmlElement(name = "Value")
            protected TariffTableCellValue value;
            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "ToDelete")
            protected Boolean toDelete;
            @XmlAttribute(name = "DimRid1")
            protected String dimRid1;
            @XmlAttribute(name = "DimRid2")
            protected String dimRid2;
            @XmlAttribute(name = "DimRid3")
            protected String dimRid3;
            @XmlAttribute(name = "DimRid4")
            protected String dimRid4;
            @XmlAttribute(name = "DimRid5")
            protected String dimRid5;
            @XmlAttribute(name = "DimRid6")
            protected String dimRid6;
            @XmlAttribute(name = "DimVal1")
            protected String dimVal1;
            @XmlAttribute(name = "DimVal2")
            protected String dimVal2;
            @XmlAttribute(name = "DimVal3")
            protected String dimVal3;
            @XmlAttribute(name = "DimVal4")
            protected String dimVal4;
            @XmlAttribute(name = "DimVal5")
            protected String dimVal5;
            @XmlAttribute(name = "DimVal6")
            protected String dimVal6;
            @XmlAttribute(name = "BaseVal")
            protected BigDecimal baseVal;
            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "MinVal")
            protected BigDecimal minVal;
            @XmlAttribute(name = "MaxVal")
            protected BigDecimal maxVal;

            /**
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setCcy(JAXBElement<Long> value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the useTiers property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isUseTiers() {
                return useTiers;
            }

            /**
             * Sets the value of the useTiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUseTiers(Boolean value) {
                this.useTiers = value;
            }

            /**
             * Gets the value of the tiers property.
             * 
             * @return
             *     possible object is
             *     {@link Tiers }
             *     
             */
            public Tiers getTiers() {
                return tiers;
            }

            /**
             * Sets the value of the tiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link Tiers }
             *     
             */
            public void setTiers(Tiers value) {
                this.tiers = value;
            }

            /**
             * Gets the value of the dims property.
             * 
             * @return
             *     possible object is
             *     {@link TariffTableCellDims }
             *     
             */
            public TariffTableCellDims getDims() {
                return dims;
            }

            /**
             * Sets the value of the dims property.
             * 
             * @param value
             *     allowed object is
             *     {@link TariffTableCellDims }
             *     
             */
            public void setDims(TariffTableCellDims value) {
                this.dims = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link TariffTableCellValue }
             *     
             */
            public TariffTableCellValue getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link TariffTableCellValue }
             *     
             */
            public void setValue(TariffTableCellValue value) {
                this.value = value;
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
             * Gets the value of the toDelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isToDelete() {
                if (toDelete == null) {
                    return false;
                } else {
                    return toDelete;
                }
            }

            /**
             * Sets the value of the toDelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setToDelete(Boolean value) {
                this.toDelete = value;
            }

            /**
             * Gets the value of the dimRid1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid1() {
                return dimRid1;
            }

            /**
             * Sets the value of the dimRid1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid1(String value) {
                this.dimRid1 = value;
            }

            /**
             * Gets the value of the dimRid2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid2() {
                return dimRid2;
            }

            /**
             * Sets the value of the dimRid2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid2(String value) {
                this.dimRid2 = value;
            }

            /**
             * Gets the value of the dimRid3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid3() {
                return dimRid3;
            }

            /**
             * Sets the value of the dimRid3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid3(String value) {
                this.dimRid3 = value;
            }

            /**
             * Gets the value of the dimRid4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid4() {
                return dimRid4;
            }

            /**
             * Sets the value of the dimRid4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid4(String value) {
                this.dimRid4 = value;
            }

            /**
             * Gets the value of the dimRid5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid5() {
                return dimRid5;
            }

            /**
             * Sets the value of the dimRid5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid5(String value) {
                this.dimRid5 = value;
            }

            /**
             * Gets the value of the dimRid6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimRid6() {
                return dimRid6;
            }

            /**
             * Sets the value of the dimRid6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimRid6(String value) {
                this.dimRid6 = value;
            }

            /**
             * Gets the value of the dimVal1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal1() {
                return dimVal1;
            }

            /**
             * Sets the value of the dimVal1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal1(String value) {
                this.dimVal1 = value;
            }

            /**
             * Gets the value of the dimVal2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal2() {
                return dimVal2;
            }

            /**
             * Sets the value of the dimVal2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal2(String value) {
                this.dimVal2 = value;
            }

            /**
             * Gets the value of the dimVal3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal3() {
                return dimVal3;
            }

            /**
             * Sets the value of the dimVal3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal3(String value) {
                this.dimVal3 = value;
            }

            /**
             * Gets the value of the dimVal4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal4() {
                return dimVal4;
            }

            /**
             * Sets the value of the dimVal4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal4(String value) {
                this.dimVal4 = value;
            }

            /**
             * Gets the value of the dimVal5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal5() {
                return dimVal5;
            }

            /**
             * Sets the value of the dimVal5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal5(String value) {
                this.dimVal5 = value;
            }

            /**
             * Gets the value of the dimVal6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimVal6() {
                return dimVal6;
            }

            /**
             * Sets the value of the dimVal6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimVal6(String value) {
                this.dimVal6 = value;
            }

            /**
             * Gets the value of the baseVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseVal() {
                return baseVal;
            }

            /**
             * Sets the value of the baseVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseVal(BigDecimal value) {
                this.baseVal = value;
            }

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }

            /**
             * Gets the value of the minVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinVal() {
                return minVal;
            }

            /**
             * Sets the value of the minVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinVal(BigDecimal value) {
                this.minVal = value;
            }

            /**
             * Gets the value of the maxVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxVal() {
                return maxVal;
            }

            /**
             * Sets the value of the maxVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxVal(BigDecimal value) {
                this.maxVal = value;
            }

        }

    }

}
