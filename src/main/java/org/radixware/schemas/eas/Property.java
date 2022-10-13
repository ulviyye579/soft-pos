
package org.radixware.schemas.eas;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ReadOnly - \u0417\u0430\u043f\u043e\u043b\u043d\u044f\u0435\u0442\u0441\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u043c \u0432 CurrentData
 *                 IsOwnVal - \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e \u0434\u043b\u044f \u0441\u0430\u043c\u043e\u0439 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0438 (\u043d\u0435 \u0443\u043d\u0430\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u043e \u043e\u0442 \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044f)
 *                 IsDefined - \u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0433\u043e \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e
 * 
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Bin" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *           &lt;element name="Bool" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
 *           &lt;element name="Str" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *           &lt;element name="DateTime" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *           &lt;element name="Int" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *           &lt;element name="Num" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *           &lt;element name="Xml" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="Ref" type="{http://schemas.radixware.org/eas.xsd}ObjectReference"/&gt;
 *           &lt;element name="Obj" type="{http://schemas.radixware.org/eas.xsd}PresentableObject"/&gt;
 *           &lt;element name="ArrBin"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}BinBase64" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrBool"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Bool" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrStr"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrDateTime"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrInt"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrNum"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ArrRef"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}ObjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="TableId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="InheritableValue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Path"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ReferenceProperty"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ReferenceValue" type="{http://schemas.radixware.org/eas.xsd}ObjectReference"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Property" type="{http://schemas.radixware.org/eas.xsd}Property"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsOwnVal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="IsDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "content"
})
@XmlSeeAlso({
    org.radixware.schemas.eas.PropertyList.Item.class
})
public class Property {

    @XmlElementRefs({
        @XmlElementRef(name = "Bin", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bool", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Str", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DateTime", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Int", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Num", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Xml", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ref", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Obj", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrBin", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrBool", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrStr", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrDateTime", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrInt", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrNum", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrRef", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InheritableValue", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "IsOwnVal")
    protected Boolean isOwnVal;
    @XmlAttribute(name = "IsDefined")
    protected Boolean isDefined;

    /**
     * ReadOnly - \u0417\u0430\u043f\u043e\u043b\u043d\u044f\u0435\u0442\u0441\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u043c \u0432 CurrentData
     *                 IsOwnVal - \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e \u0434\u043b\u044f \u0441\u0430\u043c\u043e\u0439 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0438 (\u043d\u0435 \u0443\u043d\u0430\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u043e \u043e\u0442 \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044f)
     *                 IsDefined - \u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0433\u043e \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PresentableObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrBin }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrBool }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrStr }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrDateTime }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrInt }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrNum }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.ArrRef }{@code >}
     * {@link JAXBElement }{@code <}{@link Property.InheritableValue }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the isOwnVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsOwnVal() {
        if (isOwnVal == null) {
            return true;
        } else {
            return isOwnVal;
        }
    }

    /**
     * Sets the value of the isOwnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwnVal(Boolean value) {
        this.isOwnVal = value;
    }

    /**
     * Gets the value of the isDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDefined() {
        if (isDefined == null) {
            return true;
        } else {
            return isDefined;
        }
    }

    /**
     * Sets the value of the isDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefined(Boolean value) {
        this.isDefined = value;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}BinBase64" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrBin {

        @XmlElement(name = "Item", nillable = true)
        protected List<byte[]> item;

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
         * byte[]
         * 
         */
        public List<byte[]> getItem() {
            if (item == null) {
                item = new ArrayList<byte[]>();
            }
            return this.item;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Bool" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrBool {

        @XmlElement(name = "Item", nillable = true)
        protected List<Boolean> item;

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
         * {@link Boolean }
         * 
         * 
         */
        public List<Boolean> getItem() {
            if (item == null) {
                item = new ArrayList<Boolean>();
            }
            return this.item;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrDateTime {

        @XmlElement(name = "Item", nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected List<XMLGregorianCalendar> item;

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
         * {@link XMLGregorianCalendar }
         * 
         * 
         */
        public List<XMLGregorianCalendar> getItem() {
            if (item == null) {
                item = new ArrayList<XMLGregorianCalendar>();
            }
            return this.item;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrInt {

        @XmlElement(name = "Item", nillable = true)
        protected List<Long> item;

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
         * {@link Long }
         * 
         * 
         */
        public List<Long> getItem() {
            if (item == null) {
                item = new ArrayList<Long>();
            }
            return this.item;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrNum {

        @XmlElement(name = "Item", nillable = true)
        protected List<BigDecimal> item;

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
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getItem() {
            if (item == null) {
                item = new ArrayList<BigDecimal>();
            }
            return this.item;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}ObjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TableId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
    public static class ArrRef {

        @XmlElement(name = "Item", nillable = true)
        protected List<ObjectReference> item;
        @XmlAttribute(name = "TableId")
        protected String tableId;

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
         * {@link ObjectReference }
         * 
         * 
         */
        public List<ObjectReference> getItem() {
            if (item == null) {
                item = new ArrayList<ObjectReference>();
            }
            return this.item;
        }

        /**
         * Gets the value of the tableId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableId() {
            return tableId;
        }

        /**
         * Sets the value of the tableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableId(String value) {
            this.tableId = value;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/types.xsd}SafeStr" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ArrStr {

        @XmlElement(name = "Item", nillable = true)
        protected List<String> item;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
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
     *         &lt;element name="Path"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ReferenceProperty"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
     *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ReferenceValue" type="{http://schemas.radixware.org/eas.xsd}ObjectReference"/&gt;
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
     *         &lt;element name="Property" type="{http://schemas.radixware.org/eas.xsd}Property"/&gt;
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
        "path",
        "property"
    })
    public static class InheritableValue {

        @XmlElement(name = "Path", required = true)
        protected Property.InheritableValue.Path path;
        @XmlElement(name = "Property", required = true)
        protected Property property;

        /**
         * Gets the value of the path property.
         * 
         * @return
         *     possible object is
         *     {@link Property.InheritableValue.Path }
         *     
         */
        public Property.InheritableValue.Path getPath() {
            return path;
        }

        /**
         * Sets the value of the path property.
         * 
         * @param value
         *     allowed object is
         *     {@link Property.InheritableValue.Path }
         *     
         */
        public void setPath(Property.InheritableValue.Path value) {
            this.path = value;
        }

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link Property }
         *     
         */
        public Property getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link Property }
         *     
         */
        public void setProperty(Property value) {
            this.property = value;
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
         *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ReferenceProperty"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
         *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ReferenceValue" type="{http://schemas.radixware.org/eas.xsd}ObjectReference"/&gt;
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
        public static class Path {

            @XmlElement(name = "Item")
            protected List<Property.InheritableValue.Path.Item> item;

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
             * {@link Property.InheritableValue.Path.Item }
             * 
             * 
             */
            public List<Property.InheritableValue.Path.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Property.InheritableValue.Path.Item>();
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
             *         &lt;element name="ReferenceProperty"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
             *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ReferenceValue" type="{http://schemas.radixware.org/eas.xsd}ObjectReference"/&gt;
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
                "referenceProperty",
                "referenceValue"
            })
            public static class Item {

                @XmlElement(name = "ReferenceProperty", required = true)
                protected Property.InheritableValue.Path.Item.ReferenceProperty referenceProperty;
                @XmlElement(name = "ReferenceValue", required = true)
                protected ObjectReference referenceValue;

                /**
                 * Gets the value of the referenceProperty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Property.InheritableValue.Path.Item.ReferenceProperty }
                 *     
                 */
                public Property.InheritableValue.Path.Item.ReferenceProperty getReferenceProperty() {
                    return referenceProperty;
                }

                /**
                 * Sets the value of the referenceProperty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Property.InheritableValue.Path.Item.ReferenceProperty }
                 *     
                 */
                public void setReferenceProperty(Property.InheritableValue.Path.Item.ReferenceProperty value) {
                    this.referenceProperty = value;
                }

                /**
                 * Gets the value of the referenceValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ObjectReference }
                 *     
                 */
                public ObjectReference getReferenceValue() {
                    return referenceValue;
                }

                /**
                 * Sets the value of the referenceValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ObjectReference }
                 *     
                 */
                public void setReferenceValue(ObjectReference value) {
                    this.referenceValue = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
                 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ReferenceProperty
                    extends Definition
                {

                    @XmlAttribute(name = "Name", required = true)
                    protected String name;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }

            }

        }

    }

}
