
package com.tranzaxis.schemas.restricting_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.Lexeme;
import com.tranzaxis.schemas.common_types.ListModifyMode;
import com.tranzaxis.schemas.common_types.ParamValues;
import org.radixware.schemas.common.ImpExpEntity;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for Restriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" minOccurs="0"/&gt;
 *         &lt;element name="ClerkCanChange" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ClerkUpperMaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="ClientUpperMaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="CreatedAsOverride" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ClientCanChange" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="BegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpOffBegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpOffEndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxStartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxFinishTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="AccumulatorValue" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="CashbackCurrency" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MaxCashbackAmount" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="ResetPeriodType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ownership" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResetTime" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeclineCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ResetScheduleId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ResetScheduleRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AccumulateCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDescription" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCanSee" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="STIPMode" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="OrderNum" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="ApproveSpecialCondition" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Condition" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxValAdjustFunc" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResetControlFunc" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="AccumulatorPrevValues" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction", propOrder = {
    "rest"
})
public class Restriction
    extends ImpExpEntity
{

    @XmlElementRefs({
        @XmlElementRef(name = "ToDelete", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Mode", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClerkCanChange", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClerkUpperMaxVal", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClientUpperMaxVal", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreatedAsOverride", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RestrictedGuid", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClientCanChange", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InUse", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BegTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EndTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TmpOffBegTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TmpOffEndTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MaxVal", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ccy", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TmpMaxVal", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TmpMaxStartTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TmpMaxFinishTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccumulatorValue", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CashbackCurrency", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MaxCashbackAmount", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResetPeriodType", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ownership", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResetTime", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeclineCode", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResetScheduleId", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResetScheduleRid", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccumulateCnt", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustomerDescription", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustomerCanSee", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "STIPMode", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrderNum", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ApproveSpecialCondition", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ext", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Condition", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MaxValAdjustFunc", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResetControlFunc", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserAttrs", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccumulatorPrevValues", namespace = "http://schemas.tranzaxis.com/restricting-admin.xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "ClassGuid")
    protected String classGuid;
    @XmlAttribute(name = "Guid")
    protected String guid;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Ext" is used by two different parts of a schema. See: 
     * line 144 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/restricting-admin.xsd
     * line 698 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/common.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ListModifyMode }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Restriction.Condition }{@code >}
     * {@link JAXBElement }{@code <}{@link Restriction.MaxValAdjustFunc }{@code >}
     * {@link JAXBElement }{@code <}{@link Restriction.ResetControlFunc }{@code >}
     * {@link JAXBElement }{@code <}{@link ParamValues }{@code >}
     * {@link JAXBElement }{@code <}{@link Restriction.AccumulatorPrevValues }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded"/&gt;
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
        "value"
    })
    public static class AccumulatorPrevValues {

        @XmlElement(name = "Value", required = true)
        protected List<BigDecimal> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getValue() {
            if (value == null) {
                value = new ArrayList<BigDecimal>();
            }
            return this.value;
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
     *         &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userFunc"
    })
    public static class Condition {

        @XmlElement(name = "UserFunc")
        protected UserFunc userFunc;
        @XmlAttribute(name = "HasOwnVal")
        protected Boolean hasOwnVal;

        /**
         * Gets the value of the userFunc property.
         * 
         * @return
         *     possible object is
         *     {@link UserFunc }
         *     
         */
        public UserFunc getUserFunc() {
            return userFunc;
        }

        /**
         * Sets the value of the userFunc property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserFunc }
         *     
         */
        public void setUserFunc(UserFunc value) {
            this.userFunc = value;
        }

        /**
         * Gets the value of the hasOwnVal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasOwnVal() {
            return hasOwnVal;
        }

        /**
         * Sets the value of the hasOwnVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasOwnVal(Boolean value) {
            this.hasOwnVal = value;
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
     *         &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userFunc"
    })
    public static class MaxValAdjustFunc {

        @XmlElement(name = "UserFunc")
        protected UserFunc userFunc;
        @XmlAttribute(name = "HasOwnVal")
        protected Boolean hasOwnVal;

        /**
         * Gets the value of the userFunc property.
         * 
         * @return
         *     possible object is
         *     {@link UserFunc }
         *     
         */
        public UserFunc getUserFunc() {
            return userFunc;
        }

        /**
         * Sets the value of the userFunc property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserFunc }
         *     
         */
        public void setUserFunc(UserFunc value) {
            this.userFunc = value;
        }

        /**
         * Gets the value of the hasOwnVal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasOwnVal() {
            return hasOwnVal;
        }

        /**
         * Sets the value of the hasOwnVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasOwnVal(Boolean value) {
            this.hasOwnVal = value;
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
     *         &lt;element name="UserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HasOwnVal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userFunc"
    })
    public static class ResetControlFunc {

        @XmlElement(name = "UserFunc")
        protected UserFunc userFunc;
        @XmlAttribute(name = "HasOwnVal")
        protected Boolean hasOwnVal;

        /**
         * Gets the value of the userFunc property.
         * 
         * @return
         *     possible object is
         *     {@link UserFunc }
         *     
         */
        public UserFunc getUserFunc() {
            return userFunc;
        }

        /**
         * Sets the value of the userFunc property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserFunc }
         *     
         */
        public void setUserFunc(UserFunc value) {
            this.userFunc = value;
        }

        /**
         * Gets the value of the hasOwnVal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasOwnVal() {
            return hasOwnVal;
        }

        /**
         * Sets the value of the hasOwnVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasOwnVal(Boolean value) {
            this.hasOwnVal = value;
        }

    }

}
