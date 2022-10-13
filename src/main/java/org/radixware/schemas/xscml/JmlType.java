
package org.radixware.schemas.xscml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Java" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="Literal"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="IdReference"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Path" use="required"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="Invoke" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                             &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                             &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="extStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LocalizedString"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="EventCode"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="DbEntity"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="PidAsStr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="EntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;attribute name="CheckExistance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="IsUFOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="ExtGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="TypeDeclaration" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"/&gt;
 *                     &lt;element name="Task" type="{http://schemas.radixware.org/xscml.xsd}TaskTagType"/&gt;
 *                     &lt;element name="DbCompatibilityInfo" type="{http://schemas.radixware.org/xscml.xsd}SqmlCompatibility"/&gt;
 *                     &lt;element name="Pin"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Data"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="ReadLicense"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                             &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="CheckLicense"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                             &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="ActionBlock"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *                             &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JmlType", propOrder = {
    "item"
})
public class JmlType {

    @XmlElement(name = "Item")
    protected List<JmlType.Item> item;
    @XmlAttribute(name = "Description")
    protected String description;

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
     * {@link JmlType.Item }
     * 
     * 
     */
    public List<JmlType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<JmlType.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        if (description == null) {
            return "";
        } else {
            return description;
        }
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *         &lt;choice&gt;
     *           &lt;element name="Java" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *           &lt;element name="Literal"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="IdReference"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Path" use="required"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/attribute&gt;
     *                   &lt;attribute name="Invoke" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                   &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                   &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *                   &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                   &lt;attribute name="extStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="LocalizedString"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="EventCode"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="DbEntity"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="PidAsStr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="EntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="CheckExistance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                   &lt;attribute name="IsUFOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                   &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="ExtGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="TypeDeclaration" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"/&gt;
     *           &lt;element name="Task" type="{http://schemas.radixware.org/xscml.xsd}TaskTagType"/&gt;
     *           &lt;element name="DbCompatibilityInfo" type="{http://schemas.radixware.org/xscml.xsd}SqmlCompatibility"/&gt;
     *           &lt;element name="Pin"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Data"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="ReadLicense"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                   &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="CheckLicense"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                   &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="ActionBlock"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
     *                   &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
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
        "java",
        "literal",
        "idReference",
        "localizedString",
        "eventCode",
        "dbEntity",
        "typeDeclaration",
        "task",
        "dbCompatibilityInfo",
        "pin",
        "data",
        "readLicense",
        "checkLicense",
        "actionBlock"
    })
    public static class Item {

        @XmlElement(name = "Java")
        protected String java;
        @XmlElement(name = "Literal")
        protected JmlType.Item.Literal literal;
        @XmlElement(name = "IdReference")
        protected JmlType.Item.IdReference idReference;
        @XmlElement(name = "LocalizedString")
        protected JmlType.Item.LocalizedString localizedString;
        @XmlElement(name = "EventCode")
        protected JmlType.Item.EventCode eventCode;
        @XmlElement(name = "DbEntity")
        protected JmlType.Item.DbEntity dbEntity;
        @XmlElement(name = "TypeDeclaration")
        protected TypeDeclaration typeDeclaration;
        @XmlElement(name = "Task")
        protected TaskTagType task;
        @XmlElement(name = "DbCompatibilityInfo")
        protected SqmlCompatibility dbCompatibilityInfo;
        @XmlElement(name = "Pin")
        protected JmlType.Item.Pin pin;
        @XmlElement(name = "Data")
        protected JmlType.Item.Data data;
        @XmlElement(name = "ReadLicense")
        protected JmlType.Item.ReadLicense readLicense;
        @XmlElement(name = "CheckLicense")
        protected JmlType.Item.CheckLicense checkLicense;
        @XmlElement(name = "ActionBlock")
        protected JmlType.Item.ActionBlock actionBlock;

        /**
         * Gets the value of the java property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJava() {
            return java;
        }

        /**
         * Sets the value of the java property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJava(String value) {
            this.java = value;
        }

        /**
         * Gets the value of the literal property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.Literal }
         *     
         */
        public JmlType.Item.Literal getLiteral() {
            return literal;
        }

        /**
         * Sets the value of the literal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.Literal }
         *     
         */
        public void setLiteral(JmlType.Item.Literal value) {
            this.literal = value;
        }

        /**
         * Gets the value of the idReference property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.IdReference }
         *     
         */
        public JmlType.Item.IdReference getIdReference() {
            return idReference;
        }

        /**
         * Sets the value of the idReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.IdReference }
         *     
         */
        public void setIdReference(JmlType.Item.IdReference value) {
            this.idReference = value;
        }

        /**
         * Gets the value of the localizedString property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.LocalizedString }
         *     
         */
        public JmlType.Item.LocalizedString getLocalizedString() {
            return localizedString;
        }

        /**
         * Sets the value of the localizedString property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.LocalizedString }
         *     
         */
        public void setLocalizedString(JmlType.Item.LocalizedString value) {
            this.localizedString = value;
        }

        /**
         * Gets the value of the eventCode property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.EventCode }
         *     
         */
        public JmlType.Item.EventCode getEventCode() {
            return eventCode;
        }

        /**
         * Sets the value of the eventCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.EventCode }
         *     
         */
        public void setEventCode(JmlType.Item.EventCode value) {
            this.eventCode = value;
        }

        /**
         * Gets the value of the dbEntity property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.DbEntity }
         *     
         */
        public JmlType.Item.DbEntity getDbEntity() {
            return dbEntity;
        }

        /**
         * Sets the value of the dbEntity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.DbEntity }
         *     
         */
        public void setDbEntity(JmlType.Item.DbEntity value) {
            this.dbEntity = value;
        }

        /**
         * Gets the value of the typeDeclaration property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDeclaration }
         *     
         */
        public TypeDeclaration getTypeDeclaration() {
            return typeDeclaration;
        }

        /**
         * Sets the value of the typeDeclaration property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDeclaration }
         *     
         */
        public void setTypeDeclaration(TypeDeclaration value) {
            this.typeDeclaration = value;
        }

        /**
         * Gets the value of the task property.
         * 
         * @return
         *     possible object is
         *     {@link TaskTagType }
         *     
         */
        public TaskTagType getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaskTagType }
         *     
         */
        public void setTask(TaskTagType value) {
            this.task = value;
        }

        /**
         * Gets the value of the dbCompatibilityInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SqmlCompatibility }
         *     
         */
        public SqmlCompatibility getDbCompatibilityInfo() {
            return dbCompatibilityInfo;
        }

        /**
         * Sets the value of the dbCompatibilityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SqmlCompatibility }
         *     
         */
        public void setDbCompatibilityInfo(SqmlCompatibility value) {
            this.dbCompatibilityInfo = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.Pin }
         *     
         */
        public JmlType.Item.Pin getPin() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.Pin }
         *     
         */
        public void setPin(JmlType.Item.Pin value) {
            this.pin = value;
        }

        /**
         * Gets the value of the data property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.Data }
         *     
         */
        public JmlType.Item.Data getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.Data }
         *     
         */
        public void setData(JmlType.Item.Data value) {
            this.data = value;
        }

        /**
         * Gets the value of the readLicense property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.ReadLicense }
         *     
         */
        public JmlType.Item.ReadLicense getReadLicense() {
            return readLicense;
        }

        /**
         * Sets the value of the readLicense property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.ReadLicense }
         *     
         */
        public void setReadLicense(JmlType.Item.ReadLicense value) {
            this.readLicense = value;
        }

        /**
         * Gets the value of the checkLicense property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.CheckLicense }
         *     
         */
        public JmlType.Item.CheckLicense getCheckLicense() {
            return checkLicense;
        }

        /**
         * Sets the value of the checkLicense property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.CheckLicense }
         *     
         */
        public void setCheckLicense(JmlType.Item.CheckLicense value) {
            this.checkLicense = value;
        }

        /**
         * Gets the value of the actionBlock property.
         * 
         * @return
         *     possible object is
         *     {@link JmlType.Item.ActionBlock }
         *     
         */
        public JmlType.Item.ActionBlock getActionBlock() {
            return actionBlock;
        }

        /**
         * Sets the value of the actionBlock property.
         * 
         * @param value
         *     allowed object is
         *     {@link JmlType.Item.ActionBlock }
         *     
         */
        public void setActionBlock(JmlType.Item.ActionBlock value) {
            this.actionBlock = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ActionBlock
            extends JmlTagItem
        {

            @XmlAttribute(name = "Id", required = true)
            protected String id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CheckLicense
            extends JmlTagItem
        {

            @XmlAttribute(name = "Id", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "License", required = true)
            protected String license;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets the value of the license property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicense() {
                return license;
            }

            /**
             * Sets the value of the license property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicense(String value) {
                this.license = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Data
            extends JmlTagItem
        {

            @XmlAttribute(name = "Id", required = true)
            protected String id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PidAsStr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="EntityId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="CheckExistance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="IsUFOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ExtGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pidAsStr"
        })
        public static class DbEntity
            extends JmlTagItem
        {

            @XmlElement(name = "PidAsStr", required = true)
            protected String pidAsStr;
            @XmlAttribute(name = "EntityId")
            protected String entityId;
            @XmlAttribute(name = "CheckExistance")
            protected Boolean checkExistance;
            @XmlAttribute(name = "IsUFOwner")
            protected Boolean isUFOwner;
            @XmlAttribute(name = "Title")
            protected String title;
            @XmlAttribute(name = "ExtGuid")
            protected String extGuid;

            /**
             * Gets the value of the pidAsStr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidAsStr() {
                return pidAsStr;
            }

            /**
             * Sets the value of the pidAsStr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidAsStr(String value) {
                this.pidAsStr = value;
            }

            /**
             * Gets the value of the entityId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntityId() {
                return entityId;
            }

            /**
             * Sets the value of the entityId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntityId(String value) {
                this.entityId = value;
            }

            /**
             * Gets the value of the checkExistance property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCheckExistance() {
                return checkExistance;
            }

            /**
             * Sets the value of the checkExistance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCheckExistance(Boolean value) {
                this.checkExistance = value;
            }

            /**
             * Gets the value of the isUFOwner property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsUFOwner() {
                return isUFOwner;
            }

            /**
             * Sets the value of the isUFOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsUFOwner(Boolean value) {
                this.isUFOwner = value;
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

            /**
             * Gets the value of the extGuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtGuid() {
                return extGuid;
            }

            /**
             * Sets the value of the extGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtGuid(String value) {
                this.extGuid = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EventCode
            extends JmlTagItem
        {

            @XmlAttribute(name = "OwnerId")
            protected String ownerId;
            @XmlAttribute(name = "StringId")
            protected String stringId;
            @XmlAttribute(name = "Type")
            protected Integer type;

            /**
             * Gets the value of the ownerId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerId() {
                return ownerId;
            }

            /**
             * Sets the value of the ownerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerId(String value) {
                this.ownerId = value;
            }

            /**
             * Gets the value of the stringId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStringId() {
                return stringId;
            }

            /**
             * Sets the value of the stringId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStringId(String value) {
                this.stringId = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getType() {
                if (type == null) {
                    return  0;
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setType(Integer value) {
                this.type = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Path" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Invoke" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *       &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
         *       &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="extStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IdReference
            extends JmlTagItem
        {

            @XmlAttribute(name = "Path", required = true)
            protected List<String> path;
            @XmlAttribute(name = "Invoke")
            protected Boolean invoke;
            @XmlAttribute(name = "Soft")
            protected Boolean soft;
            @XmlAttribute(name = "Mode")
            protected Integer mode;
            @XmlAttribute(name = "dbName")
            protected Boolean dbName;
            @XmlAttribute(name = "extStr")
            protected String extStr;

            /**
             * Gets the value of the path property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the path property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPath().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPath() {
                if (path == null) {
                    path = new ArrayList<String>();
                }
                return this.path;
            }

            /**
             * Gets the value of the invoke property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInvoke() {
                return invoke;
            }

            /**
             * Sets the value of the invoke property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInvoke(Boolean value) {
                this.invoke = value;
            }

            /**
             * Gets the value of the soft property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isSoft() {
                if (soft == null) {
                    return false;
                } else {
                    return soft;
                }
            }

            /**
             * Sets the value of the soft property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSoft(Boolean value) {
                this.soft = value;
            }

            /**
             * Gets the value of the mode property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getMode() {
                if (mode == null) {
                    return  0;
                } else {
                    return mode;
                }
            }

            /**
             * Sets the value of the mode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMode(Integer value) {
                this.mode = value;
            }

            /**
             * Gets the value of the dbName property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDbName() {
                return dbName;
            }

            /**
             * Sets the value of the dbName property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDbName(Boolean value) {
                this.dbName = value;
            }

            /**
             * Gets the value of the extStr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtStr() {
                return extStr;
            }

            /**
             * Sets the value of the extStr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtStr(String value) {
                this.extStr = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Literal
            extends JmlTagItem
        {

            @XmlAttribute(name = "Literal")
            protected String literal;
            @XmlAttribute(name = "Title")
            protected String title;

            /**
             * Gets the value of the literal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiteral() {
                return literal;
            }

            /**
             * Sets the value of the literal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLiteral(String value) {
                this.literal = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="StringId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocalizedString
            extends JmlTagItem
        {

            @XmlAttribute(name = "OwnerId")
            protected String ownerId;
            @XmlAttribute(name = "StringId")
            protected String stringId;
            @XmlAttribute(name = "Type")
            protected Integer type;

            /**
             * Gets the value of the ownerId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerId() {
                return ownerId;
            }

            /**
             * Sets the value of the ownerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerId(String value) {
                this.ownerId = value;
            }

            /**
             * Gets the value of the stringId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStringId() {
                return stringId;
            }

            /**
             * Sets the value of the stringId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStringId(String value) {
                this.stringId = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getType() {
                if (type == null) {
                    return  0;
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setType(Integer value) {
                this.type = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Pin
            extends JmlTagItem
        {

            @XmlAttribute(name = "Id", required = true)
            protected String id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
         *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ReadLicense
            extends JmlTagItem
        {

            @XmlAttribute(name = "Id", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "License", required = true)
            protected String license;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets the value of the license property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicense() {
                return license;
            }

            /**
             * Sets the value of the license property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicense(String value) {
                this.license = value;
            }

        }

    }

}
