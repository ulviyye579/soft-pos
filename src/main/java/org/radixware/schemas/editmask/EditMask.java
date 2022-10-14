
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Int" type="{http://schemas.radixware.org/editmask.xsd}EditMaskInt"/&gt;
 *         &lt;element name="Num" type="{http://schemas.radixware.org/editmask.xsd}EditMaskNum"/&gt;
 *         &lt;element name="Str" type="{http://schemas.radixware.org/editmask.xsd}EditMaskStr"/&gt;
 *         &lt;element name="TimeInterval" type="{http://schemas.radixware.org/editmask.xsd}EditMaskTimeInterval"/&gt;
 *         &lt;element name="Enum" type="{http://schemas.radixware.org/editmask.xsd}EditMaskEnum"/&gt;
 *         &lt;element name="DateTime" type="{http://schemas.radixware.org/editmask.xsd}EditMaskDateTime"/&gt;
 *         &lt;element name="List" type="{http://schemas.radixware.org/editmask.xsd}EditMaskList"/&gt;
 *         &lt;element name="Boolean" type="{http://schemas.radixware.org/editmask.xsd}EditMaskBool"/&gt;
 *         &lt;element name="FilePath" type="{http://schemas.radixware.org/editmask.xsd}EditMaskFilePath"/&gt;
 *         &lt;element name="Reference" type="{http://schemas.radixware.org/editmask.xsd}EditMaskRef"/&gt;
 *         &lt;element name="Dictionary" type="{http://schemas.radixware.org/editmask.xsd}EditMaskDictionary"/&gt;
 *         &lt;element name="DynamicList" type="{http://schemas.radixware.org/editmask.xsd}EditMaskDynamicList"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMask", propOrder = {
    "_int",
    "num",
    "str",
    "timeInterval",
    "_enum",
    "dateTime",
    "list",
    "_boolean",
    "filePath",
    "reference",
    "dictionary",
    "dynamicList"
})
public abstract class EditMask {

    @XmlElement(name = "Int")
    protected EditMaskInt _int;
    @XmlElement(name = "Num")
    protected EditMaskNum num;
    @XmlElement(name = "Str")
    protected EditMaskStr str;
    @XmlElement(name = "TimeInterval")
    protected EditMaskTimeInterval timeInterval;
    @XmlElement(name = "Enum")
    protected EditMaskEnum _enum;
    @XmlElement(name = "DateTime")
    protected EditMaskDateTime dateTime;
    @XmlElement(name = "List")
    protected EditMaskList list;
    @XmlElement(name = "Boolean")
    protected EditMaskBool _boolean;
    @XmlElement(name = "FilePath")
    protected EditMaskFilePath filePath;
    @XmlElement(name = "Reference")
    protected EditMaskRef reference;
    @XmlElement(name = "Dictionary")
    protected EditMaskDictionary dictionary;
    @XmlElement(name = "DynamicList")
    protected EditMaskDynamicList dynamicList;

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskInt }
     *     
     */
    public EditMaskInt getInt() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskInt }
     *     
     */
    public void setInt(EditMaskInt value) {
        this._int = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskNum }
     *     
     */
    public EditMaskNum getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskNum }
     *     
     */
    public void setNum(EditMaskNum value) {
        this.num = value;
    }

    /**
     * Gets the value of the str property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskStr }
     *     
     */
    public EditMaskStr getStr() {
        return str;
    }

    /**
     * Sets the value of the str property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskStr }
     *     
     */
    public void setStr(EditMaskStr value) {
        this.str = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskTimeInterval }
     *     
     */
    public EditMaskTimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskTimeInterval }
     *     
     */
    public void setTimeInterval(EditMaskTimeInterval value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the enum property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskEnum }
     *     
     */
    public EditMaskEnum getEnum() {
        return _enum;
    }

    /**
     * Sets the value of the enum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskEnum }
     *     
     */
    public void setEnum(EditMaskEnum value) {
        this._enum = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskDateTime }
     *     
     */
    public EditMaskDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskDateTime }
     *     
     */
    public void setDateTime(EditMaskDateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskList }
     *     
     */
    public EditMaskList getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskList }
     *     
     */
    public void setList(EditMaskList value) {
        this.list = value;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskBool }
     *     
     */
    public EditMaskBool getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskBool }
     *     
     */
    public void setBoolean(EditMaskBool value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskFilePath }
     *     
     */
    public EditMaskFilePath getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskFilePath }
     *     
     */
    public void setFilePath(EditMaskFilePath value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskRef }
     *     
     */
    public EditMaskRef getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskRef }
     *     
     */
    public void setReference(EditMaskRef value) {
        this.reference = value;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskDictionary }
     *     
     */
    public EditMaskDictionary getDictionary() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskDictionary }
     *     
     */
    public void setDictionary(EditMaskDictionary value) {
        this.dictionary = value;
    }

    /**
     * Gets the value of the dynamicList property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskDynamicList }
     *     
     */
    public EditMaskDynamicList getDynamicList() {
        return dynamicList;
    }

    /**
     * Sets the value of the dynamicList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskDynamicList }
     *     
     */
    public void setDynamicList(EditMaskDynamicList value) {
        this.dynamicList = value;
    }

}
