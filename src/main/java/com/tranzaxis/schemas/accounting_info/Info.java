
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ArrInt;
import com.tranzaxis.schemas.common_types.ArrStr;
import com.tranzaxis.schemas.common_types.ParamValues;
import org.radixware.schemas.common.MoneyValue;


/**
 * <p>Java class for Info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Int1" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Int2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Int3" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ArrInt1" type="{http://schemas.tranzaxis.com/common-types.xsd}ArrInt" minOccurs="0"/&gt;
 *         &lt;element name="ArrInt2" type="{http://schemas.tranzaxis.com/common-types.xsd}ArrInt" minOccurs="0"/&gt;
 *         &lt;element name="ArrInt3" type="{http://schemas.tranzaxis.com/common-types.xsd}ArrInt" minOccurs="0"/&gt;
 *         &lt;element name="Num1" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Num2" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Num3" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Str1" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Str2" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Str3" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ArrStr1" type="{http://schemas.tranzaxis.com/common-types.xsd}ArrStr" minOccurs="0"/&gt;
 *         &lt;element name="Bool1" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Bool2" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Bool3" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Date1" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Date2" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Date3" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Money1" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="Money2" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="Money3" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="Measure1" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Measure2" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Measure3" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Measure4" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Measure5" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Measure6" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Info", propOrder = {
    "ext",
    "params",
    "int1",
    "int2",
    "int3",
    "arrInt1",
    "arrInt2",
    "arrInt3",
    "num1",
    "num2",
    "num3",
    "str1",
    "str2",
    "str3",
    "arrStr1",
    "bool1",
    "bool2",
    "bool3",
    "date1",
    "date2",
    "date3",
    "money1",
    "money2",
    "money3",
    "measure1",
    "measure2",
    "measure3",
    "measure4",
    "measure5",
    "measure6"
})
public class Info {

    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlElement(name = "Params")
    protected ParamValues params;
    @XmlElement(name = "Int1")
    protected Long int1;
    @XmlElement(name = "Int2")
    protected Long int2;
    @XmlElement(name = "Int3")
    protected Long int3;
    @XmlElement(name = "ArrInt1")
    protected ArrInt arrInt1;
    @XmlElement(name = "ArrInt2")
    protected ArrInt arrInt2;
    @XmlElement(name = "ArrInt3")
    protected ArrInt arrInt3;
    @XmlElement(name = "Num1")
    protected BigDecimal num1;
    @XmlElement(name = "Num2")
    protected BigDecimal num2;
    @XmlElement(name = "Num3")
    protected BigDecimal num3;
    @XmlElement(name = "Str1")
    protected String str1;
    @XmlElement(name = "Str2")
    protected String str2;
    @XmlElement(name = "Str3")
    protected String str3;
    @XmlElement(name = "ArrStr1")
    protected ArrStr arrStr1;
    @XmlElement(name = "Bool1")
    protected Boolean bool1;
    @XmlElement(name = "Bool2")
    protected Boolean bool2;
    @XmlElement(name = "Bool3")
    protected Boolean bool3;
    @XmlElement(name = "Date1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date1;
    @XmlElement(name = "Date2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date2;
    @XmlElement(name = "Date3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date3;
    @XmlElement(name = "Money1")
    protected MoneyValue money1;
    @XmlElement(name = "Money2")
    protected MoneyValue money2;
    @XmlElement(name = "Money3")
    protected MoneyValue money3;
    @XmlElement(name = "Measure1")
    protected BigDecimal measure1;
    @XmlElement(name = "Measure2")
    protected BigDecimal measure2;
    @XmlElement(name = "Measure3")
    protected BigDecimal measure3;
    @XmlElement(name = "Measure4")
    protected BigDecimal measure4;
    @XmlElement(name = "Measure5")
    protected BigDecimal measure5;
    @XmlElement(name = "Measure6")
    protected BigDecimal measure6;

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
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setParams(ParamValues value) {
        this.params = value;
    }

    /**
     * Gets the value of the int1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt1() {
        return int1;
    }

    /**
     * Sets the value of the int1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt1(Long value) {
        this.int1 = value;
    }

    /**
     * Gets the value of the int2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt2() {
        return int2;
    }

    /**
     * Sets the value of the int2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt2(Long value) {
        this.int2 = value;
    }

    /**
     * Gets the value of the int3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt3() {
        return int3;
    }

    /**
     * Sets the value of the int3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt3(Long value) {
        this.int3 = value;
    }

    /**
     * Gets the value of the arrInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrInt }
     *     
     */
    public ArrInt getArrInt1() {
        return arrInt1;
    }

    /**
     * Sets the value of the arrInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrInt }
     *     
     */
    public void setArrInt1(ArrInt value) {
        this.arrInt1 = value;
    }

    /**
     * Gets the value of the arrInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrInt }
     *     
     */
    public ArrInt getArrInt2() {
        return arrInt2;
    }

    /**
     * Sets the value of the arrInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrInt }
     *     
     */
    public void setArrInt2(ArrInt value) {
        this.arrInt2 = value;
    }

    /**
     * Gets the value of the arrInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrInt }
     *     
     */
    public ArrInt getArrInt3() {
        return arrInt3;
    }

    /**
     * Sets the value of the arrInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrInt }
     *     
     */
    public void setArrInt3(ArrInt value) {
        this.arrInt3 = value;
    }

    /**
     * Gets the value of the num1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNum1(BigDecimal value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNum2(BigDecimal value) {
        this.num2 = value;
    }

    /**
     * Gets the value of the num3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNum3() {
        return num3;
    }

    /**
     * Sets the value of the num3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNum3(BigDecimal value) {
        this.num3 = value;
    }

    /**
     * Gets the value of the str1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStr1() {
        return str1;
    }

    /**
     * Sets the value of the str1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStr1(String value) {
        this.str1 = value;
    }

    /**
     * Gets the value of the str2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStr2() {
        return str2;
    }

    /**
     * Sets the value of the str2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStr2(String value) {
        this.str2 = value;
    }

    /**
     * Gets the value of the str3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStr3() {
        return str3;
    }

    /**
     * Sets the value of the str3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStr3(String value) {
        this.str3 = value;
    }

    /**
     * Gets the value of the arrStr1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrStr }
     *     
     */
    public ArrStr getArrStr1() {
        return arrStr1;
    }

    /**
     * Sets the value of the arrStr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrStr }
     *     
     */
    public void setArrStr1(ArrStr value) {
        this.arrStr1 = value;
    }

    /**
     * Gets the value of the bool1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool1() {
        return bool1;
    }

    /**
     * Sets the value of the bool1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool1(Boolean value) {
        this.bool1 = value;
    }

    /**
     * Gets the value of the bool2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool2() {
        return bool2;
    }

    /**
     * Sets the value of the bool2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool2(Boolean value) {
        this.bool2 = value;
    }

    /**
     * Gets the value of the bool3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool3() {
        return bool3;
    }

    /**
     * Sets the value of the bool3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool3(Boolean value) {
        this.bool3 = value;
    }

    /**
     * Gets the value of the date1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate1() {
        return date1;
    }

    /**
     * Sets the value of the date1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate1(XMLGregorianCalendar value) {
        this.date1 = value;
    }

    /**
     * Gets the value of the date2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate2() {
        return date2;
    }

    /**
     * Sets the value of the date2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate2(XMLGregorianCalendar value) {
        this.date2 = value;
    }

    /**
     * Gets the value of the date3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate3() {
        return date3;
    }

    /**
     * Sets the value of the date3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate3(XMLGregorianCalendar value) {
        this.date3 = value;
    }

    /**
     * Gets the value of the money1 property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyValue }
     *     
     */
    public MoneyValue getMoney1() {
        return money1;
    }

    /**
     * Sets the value of the money1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyValue }
     *     
     */
    public void setMoney1(MoneyValue value) {
        this.money1 = value;
    }

    /**
     * Gets the value of the money2 property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyValue }
     *     
     */
    public MoneyValue getMoney2() {
        return money2;
    }

    /**
     * Sets the value of the money2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyValue }
     *     
     */
    public void setMoney2(MoneyValue value) {
        this.money2 = value;
    }

    /**
     * Gets the value of the money3 property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyValue }
     *     
     */
    public MoneyValue getMoney3() {
        return money3;
    }

    /**
     * Sets the value of the money3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyValue }
     *     
     */
    public void setMoney3(MoneyValue value) {
        this.money3 = value;
    }

    /**
     * Gets the value of the measure1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure1() {
        return measure1;
    }

    /**
     * Sets the value of the measure1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure1(BigDecimal value) {
        this.measure1 = value;
    }

    /**
     * Gets the value of the measure2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure2() {
        return measure2;
    }

    /**
     * Sets the value of the measure2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure2(BigDecimal value) {
        this.measure2 = value;
    }

    /**
     * Gets the value of the measure3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure3() {
        return measure3;
    }

    /**
     * Sets the value of the measure3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure3(BigDecimal value) {
        this.measure3 = value;
    }

    /**
     * Gets the value of the measure4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure4() {
        return measure4;
    }

    /**
     * Sets the value of the measure4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure4(BigDecimal value) {
        this.measure4 = value;
    }

    /**
     * Gets the value of the measure5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure5() {
        return measure5;
    }

    /**
     * Sets the value of the measure5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure5(BigDecimal value) {
        this.measure5 = value;
    }

    /**
     * Gets the value of the measure6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasure6() {
        return measure6;
    }

    /**
     * Sets the value of the measure6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasure6(BigDecimal value) {
        this.measure6 = value;
    }

}
