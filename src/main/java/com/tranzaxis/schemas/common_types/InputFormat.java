
package com.tranzaxis.schemas.common_types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lookup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Integer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MinValue" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="MaxValue" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DynamicList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LibName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FuncGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FilePath" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}FileSelectionModeEnum" /&gt;
 *                 &lt;attribute name="MimeTypesFilter" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="DialogTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DialogMode" type="{http://schemas.tranzaxis.com/common-types.xsd}FileDialogOpenModeEnum" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateTime" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DateMask" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DateStyle" type="{http://schemas.tranzaxis.com/common-types.xsd}DateTimeStyleEnum" /&gt;
 *                 &lt;attribute name="TimeStyle" type="{http://schemas.tranzaxis.com/common-types.xsd}DateTimeStyleEnum" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Real" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MinValue" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="MaxValue" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Scale" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="DecPlaces" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Auto" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="ByOtherParam" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="SrcParamRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Section" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TransformKind" use="required" type="{http://schemas.tranzaxis.com/common-types.xsd}AutoTransformKindEnum" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Structure" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mask" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RegularExpression" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MaxStringLength" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DictionaryName" type="{http://schemas.tranzaxis.com/common-types.xsd}ExtDictNameEnum" /&gt;
 *       &lt;attribute name="DictSelectorPresentation" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Section" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsBoolean" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="IsContactAddress" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="IsMandatory" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="IsReadOnly" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="IsMemo" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="IsSecret" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="KeepSeparators" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="NoValueStr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsArrayValue" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="MinItemsCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="MaxItemsCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DuplicatesEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="ItemMandatory" type="{http://schemas.radixware.org/types.xsd}Bool" default="true" /&gt;
 *       &lt;attribute name="ItemNoValueStr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ItemMovable" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputFormat", propOrder = {
    "lookup",
    "integer",
    "dynamicList",
    "filePath",
    "dateTime",
    "real",
    "auto",
    "contactAddress",
    "structure"
})
public class InputFormat {

    @XmlElement(name = "Lookup")
    protected InputFormat.Lookup lookup;
    @XmlElement(name = "Integer")
    protected InputFormat.Integer integer;
    @XmlElement(name = "DynamicList")
    protected InputFormat.DynamicList dynamicList;
    @XmlElement(name = "FilePath")
    protected InputFormat.FilePath filePath;
    @XmlElement(name = "DateTime")
    protected InputFormat.DateTime dateTime;
    @XmlElement(name = "Real")
    protected InputFormat.Real real;
    @XmlElement(name = "Auto")
    protected InputFormat.Auto auto;
    @XmlElement(name = "ContactAddress")
    protected String contactAddress;
    @XmlElement(name = "Structure")
    protected ParamDescriptions structure;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "RegularExpression")
    protected String regularExpression;
    @XmlAttribute(name = "MaxStringLength")
    protected Long maxStringLength;
    @XmlAttribute(name = "DictionaryName")
    protected String dictionaryName;
    @XmlAttribute(name = "DictSelectorPresentation")
    protected String dictSelectorPresentation;
    @XmlAttribute(name = "Section")
    protected String section;
    @XmlAttribute(name = "IsBoolean")
    protected Boolean isBoolean;
    @XmlAttribute(name = "IsContactAddress")
    protected Boolean isContactAddress;
    @XmlAttribute(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlAttribute(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlAttribute(name = "IsMemo")
    protected Boolean isMemo;
    @XmlAttribute(name = "IsSecret")
    protected Boolean isSecret;
    @XmlAttribute(name = "KeepSeparators")
    protected Boolean keepSeparators;
    @XmlAttribute(name = "NoValueStr")
    protected String noValueStr;
    @XmlAttribute(name = "IsArrayValue")
    protected Boolean isArrayValue;
    @XmlAttribute(name = "MinItemsCount")
    protected Long minItemsCount;
    @XmlAttribute(name = "MaxItemsCount")
    protected Long maxItemsCount;
    @XmlAttribute(name = "DuplicatesEnabled")
    protected Boolean duplicatesEnabled;
    @XmlAttribute(name = "ItemMandatory")
    protected Boolean itemMandatory;
    @XmlAttribute(name = "ItemNoValueStr")
    protected String itemNoValueStr;
    @XmlAttribute(name = "ItemMovable")
    protected Boolean itemMovable;

    /**
     * Gets the value of the lookup property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.Lookup }
     *     
     */
    public InputFormat.Lookup getLookup() {
        return lookup;
    }

    /**
     * Sets the value of the lookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.Lookup }
     *     
     */
    public void setLookup(InputFormat.Lookup value) {
        this.lookup = value;
    }

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.Integer }
     *     
     */
    public InputFormat.Integer getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.Integer }
     *     
     */
    public void setInteger(InputFormat.Integer value) {
        this.integer = value;
    }

    /**
     * Gets the value of the dynamicList property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.DynamicList }
     *     
     */
    public InputFormat.DynamicList getDynamicList() {
        return dynamicList;
    }

    /**
     * Sets the value of the dynamicList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.DynamicList }
     *     
     */
    public void setDynamicList(InputFormat.DynamicList value) {
        this.dynamicList = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.FilePath }
     *     
     */
    public InputFormat.FilePath getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.FilePath }
     *     
     */
    public void setFilePath(InputFormat.FilePath value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.DateTime }
     *     
     */
    public InputFormat.DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.DateTime }
     *     
     */
    public void setDateTime(InputFormat.DateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the real property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.Real }
     *     
     */
    public InputFormat.Real getReal() {
        return real;
    }

    /**
     * Sets the value of the real property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.Real }
     *     
     */
    public void setReal(InputFormat.Real value) {
        this.real = value;
    }

    /**
     * Gets the value of the auto property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat.Auto }
     *     
     */
    public InputFormat.Auto getAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat.Auto }
     *     
     */
    public void setAuto(InputFormat.Auto value) {
        this.auto = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link ParamDescriptions }
     *     
     */
    public ParamDescriptions getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamDescriptions }
     *     
     */
    public void setStructure(ParamDescriptions value) {
        this.structure = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the regularExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }

    /**
     * Gets the value of the maxStringLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Sets the value of the maxStringLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxStringLength(Long value) {
        this.maxStringLength = value;
    }

    /**
     * Gets the value of the dictionaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryName() {
        return dictionaryName;
    }

    /**
     * Sets the value of the dictionaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryName(String value) {
        this.dictionaryName = value;
    }

    /**
     * Gets the value of the dictSelectorPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictSelectorPresentation() {
        return dictSelectorPresentation;
    }

    /**
     * Sets the value of the dictSelectorPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictSelectorPresentation(String value) {
        this.dictSelectorPresentation = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the isBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsBoolean() {
        if (isBoolean == null) {
            return false;
        } else {
            return isBoolean;
        }
    }

    /**
     * Sets the value of the isBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBoolean(Boolean value) {
        this.isBoolean = value;
    }

    /**
     * Gets the value of the isContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsContactAddress() {
        if (isContactAddress == null) {
            return false;
        } else {
            return isContactAddress;
        }
    }

    /**
     * Sets the value of the isContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContactAddress(Boolean value) {
        this.isContactAddress = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMandatory() {
        if (isMandatory == null) {
            return false;
        } else {
            return isMandatory;
        }
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsReadOnly() {
        if (isReadOnly == null) {
            return false;
        } else {
            return isReadOnly;
        }
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isMemo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMemo() {
        if (isMemo == null) {
            return false;
        } else {
            return isMemo;
        }
    }

    /**
     * Sets the value of the isMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMemo(Boolean value) {
        this.isMemo = value;
    }

    /**
     * Gets the value of the isSecret property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSecret() {
        if (isSecret == null) {
            return false;
        } else {
            return isSecret;
        }
    }

    /**
     * Sets the value of the isSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecret(Boolean value) {
        this.isSecret = value;
    }

    /**
     * Gets the value of the keepSeparators property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepSeparators() {
        if (keepSeparators == null) {
            return false;
        } else {
            return keepSeparators;
        }
    }

    /**
     * Sets the value of the keepSeparators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepSeparators(Boolean value) {
        this.keepSeparators = value;
    }

    /**
     * Gets the value of the noValueStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoValueStr() {
        return noValueStr;
    }

    /**
     * Sets the value of the noValueStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoValueStr(String value) {
        this.noValueStr = value;
    }

    /**
     * Gets the value of the isArrayValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsArrayValue() {
        if (isArrayValue == null) {
            return false;
        } else {
            return isArrayValue;
        }
    }

    /**
     * Sets the value of the isArrayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArrayValue(Boolean value) {
        this.isArrayValue = value;
    }

    /**
     * Gets the value of the minItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinItemsCount() {
        return minItemsCount;
    }

    /**
     * Sets the value of the minItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinItemsCount(Long value) {
        this.minItemsCount = value;
    }

    /**
     * Gets the value of the maxItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxItemsCount() {
        return maxItemsCount;
    }

    /**
     * Sets the value of the maxItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxItemsCount(Long value) {
        this.maxItemsCount = value;
    }

    /**
     * Gets the value of the duplicatesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDuplicatesEnabled() {
        if (duplicatesEnabled == null) {
            return false;
        } else {
            return duplicatesEnabled;
        }
    }

    /**
     * Sets the value of the duplicatesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicatesEnabled(Boolean value) {
        this.duplicatesEnabled = value;
    }

    /**
     * Gets the value of the itemMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItemMandatory() {
        if (itemMandatory == null) {
            return true;
        } else {
            return itemMandatory;
        }
    }

    /**
     * Sets the value of the itemMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemMandatory(Boolean value) {
        this.itemMandatory = value;
    }

    /**
     * Gets the value of the itemNoValueStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNoValueStr() {
        return itemNoValueStr;
    }

    /**
     * Sets the value of the itemNoValueStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNoValueStr(String value) {
        this.itemNoValueStr = value;
    }

    /**
     * Gets the value of the itemMovable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItemMovable() {
        if (itemMovable == null) {
            return false;
        } else {
            return itemMovable;
        }
    }

    /**
     * Sets the value of the itemMovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemMovable(Boolean value) {
        this.itemMovable = value;
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
     *         &lt;element name="ByOtherParam" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="SrcParamRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Section" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TransformKind" use="required" type="{http://schemas.tranzaxis.com/common-types.xsd}AutoTransformKindEnum" /&gt;
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
    @XmlType(name = "", propOrder = {
        "byOtherParam"
    })
    public static class Auto {

        @XmlElement(name = "ByOtherParam")
        protected InputFormat.Auto.ByOtherParam byOtherParam;

        /**
         * Gets the value of the byOtherParam property.
         * 
         * @return
         *     possible object is
         *     {@link InputFormat.Auto.ByOtherParam }
         *     
         */
        public InputFormat.Auto.ByOtherParam getByOtherParam() {
            return byOtherParam;
        }

        /**
         * Sets the value of the byOtherParam property.
         * 
         * @param value
         *     allowed object is
         *     {@link InputFormat.Auto.ByOtherParam }
         *     
         */
        public void setByOtherParam(InputFormat.Auto.ByOtherParam value) {
            this.byOtherParam = value;
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
         *       &lt;attribute name="SrcParamRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Section" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TransformKind" use="required" type="{http://schemas.tranzaxis.com/common-types.xsd}AutoTransformKindEnum" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ByOtherParam {

            @XmlAttribute(name = "SrcParamRid", required = true)
            protected String srcParamRid;
            @XmlAttribute(name = "Section")
            protected String section;
            @XmlAttribute(name = "TransformKind", required = true)
            protected String transformKind;

            /**
             * Gets the value of the srcParamRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcParamRid() {
                return srcParamRid;
            }

            /**
             * Sets the value of the srcParamRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcParamRid(String value) {
                this.srcParamRid = value;
            }

            /**
             * Gets the value of the section property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSection() {
                return section;
            }

            /**
             * Sets the value of the section property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSection(String value) {
                this.section = value;
            }

            /**
             * Gets the value of the transformKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransformKind() {
                return transformKind;
            }

            /**
             * Sets the value of the transformKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransformKind(String value) {
                this.transformKind = value;
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
     *       &lt;attribute name="DateMask" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DateStyle" type="{http://schemas.tranzaxis.com/common-types.xsd}DateTimeStyleEnum" /&gt;
     *       &lt;attribute name="TimeStyle" type="{http://schemas.tranzaxis.com/common-types.xsd}DateTimeStyleEnum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateTime {

        @XmlAttribute(name = "DateMask")
        protected String dateMask;
        @XmlAttribute(name = "DateStyle")
        protected Long dateStyle;
        @XmlAttribute(name = "TimeStyle")
        protected Long timeStyle;

        /**
         * Gets the value of the dateMask property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateMask() {
            return dateMask;
        }

        /**
         * Sets the value of the dateMask property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateMask(String value) {
            this.dateMask = value;
        }

        /**
         * Gets the value of the dateStyle property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDateStyle() {
            return dateStyle;
        }

        /**
         * Sets the value of the dateStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDateStyle(Long value) {
            this.dateStyle = value;
        }

        /**
         * Gets the value of the timeStyle property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTimeStyle() {
            return timeStyle;
        }

        /**
         * Sets the value of the timeStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTimeStyle(Long value) {
            this.timeStyle = value;
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
     *       &lt;attribute name="LibName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FuncGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DynamicList {

        @XmlAttribute(name = "LibName")
        protected String libName;
        @XmlAttribute(name = "FuncGuid")
        protected String funcGuid;

        /**
         * Gets the value of the libName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibName() {
            return libName;
        }

        /**
         * Sets the value of the libName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibName(String value) {
            this.libName = value;
        }

        /**
         * Gets the value of the funcGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuncGuid() {
            return funcGuid;
        }

        /**
         * Sets the value of the funcGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuncGuid(String value) {
            this.funcGuid = value;
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
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}FileSelectionModeEnum" /&gt;
     *       &lt;attribute name="MimeTypesFilter" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="DialogTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DialogMode" type="{http://schemas.tranzaxis.com/common-types.xsd}FileDialogOpenModeEnum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FilePath {

        @XmlAttribute(name = "Mode")
        protected Long mode;
        @XmlAttribute(name = "MimeTypesFilter")
        protected String mimeTypesFilter;
        @XmlAttribute(name = "MustExist")
        protected Boolean mustExist;
        @XmlAttribute(name = "DialogTitle")
        protected String dialogTitle;
        @XmlAttribute(name = "DialogMode")
        protected Long dialogMode;

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMode(Long value) {
            this.mode = value;
        }

        /**
         * Gets the value of the mimeTypesFilter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMimeTypesFilter() {
            return mimeTypesFilter;
        }

        /**
         * Sets the value of the mimeTypesFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMimeTypesFilter(String value) {
            this.mimeTypesFilter = value;
        }

        /**
         * Gets the value of the mustExist property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMustExist() {
            return mustExist;
        }

        /**
         * Sets the value of the mustExist property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMustExist(Boolean value) {
            this.mustExist = value;
        }

        /**
         * Gets the value of the dialogTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDialogTitle() {
            return dialogTitle;
        }

        /**
         * Sets the value of the dialogTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDialogTitle(String value) {
            this.dialogTitle = value;
        }

        /**
         * Gets the value of the dialogMode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDialogMode() {
            return dialogMode;
        }

        /**
         * Sets the value of the dialogMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDialogMode(Long value) {
            this.dialogMode = value;
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
     *       &lt;attribute name="MinValue" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="MaxValue" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Integer {

        @XmlAttribute(name = "MinValue")
        protected Long minValue;
        @XmlAttribute(name = "MaxValue")
        protected Long maxValue;

        /**
         * Gets the value of the minValue property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMinValue() {
            return minValue;
        }

        /**
         * Sets the value of the minValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMinValue(Long value) {
            this.minValue = value;
        }

        /**
         * Gets the value of the maxValue property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMaxValue() {
            return maxValue;
        }

        /**
         * Sets the value of the maxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMaxValue(Long value) {
            this.maxValue = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                 &lt;/sequence&gt;
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
        "item"
    })
    public static class Lookup {

        @XmlElement(name = "Item", required = true)
        protected List<InputFormat.Lookup.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InputFormat.Lookup.Item }
         * 
         * 
         */
        public List<InputFormat.Lookup.Item> getItem() {
            if (item == null) {
                item = new ArrayList<InputFormat.Lookup.Item>();
            }
            return this.item;
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
         *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
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
            "value",
            "title"
        })
        public static class Item {

            @XmlElement(name = "Value", required = true, nillable = true)
            protected String value;
            @XmlElement(name = "Title", required = true)
            protected String title;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
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
     *       &lt;attribute name="MinValue" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="MaxValue" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Scale" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="DecPlaces" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Real {

        @XmlAttribute(name = "MinValue")
        protected BigDecimal minValue;
        @XmlAttribute(name = "MaxValue")
        protected BigDecimal maxValue;
        @XmlAttribute(name = "Scale")
        protected Long scale;
        @XmlAttribute(name = "DecPlaces")
        protected Long decPlaces;

        /**
         * Gets the value of the minValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinValue() {
            return minValue;
        }

        /**
         * Sets the value of the minValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinValue(BigDecimal value) {
            this.minValue = value;
        }

        /**
         * Gets the value of the maxValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxValue() {
            return maxValue;
        }

        /**
         * Sets the value of the maxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxValue(BigDecimal value) {
            this.maxValue = value;
        }

        /**
         * Gets the value of the scale property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getScale() {
            return scale;
        }

        /**
         * Sets the value of the scale property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setScale(Long value) {
            this.scale = value;
        }

        /**
         * Gets the value of the decPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDecPlaces() {
            return decPlaces;
        }

        /**
         * Sets the value of the decPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDecPlaces(Long value) {
            this.decPlaces = value;
        }

    }

}
