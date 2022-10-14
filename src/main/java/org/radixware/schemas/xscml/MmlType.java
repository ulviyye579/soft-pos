
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Markdown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="IdReference"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
 *                             &lt;attribute name="Path" use="required"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="DefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="LayerUri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Segment"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="MmlTagTable"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="FirstRowHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                               &lt;element name="MmlTagTableCell" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="RowIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                         &lt;element name="ColumnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                         &lt;element name="Content" type="{http://schemas.radixware.org/xscml.xsd}MmlType"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="MarkdownImage"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="MarkdownRef"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Comment"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
 *                             &lt;attribute name="DomainId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;attribute name="IsOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "MmlType", propOrder = {
    "item"
})
public class MmlType {

    @XmlElement(name = "Item")
    protected List<MmlType.Item> item;
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
     * {@link MmlType.Item }
     * 
     * 
     */
    public List<MmlType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<MmlType.Item>();
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
     *           &lt;element name="Markdown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *           &lt;element name="IdReference"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
     *                   &lt;attribute name="Path" use="required"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/attribute&gt;
     *                   &lt;attribute name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="DefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="LayerUri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Segment"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/attribute&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="MmlTagTable"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="FirstRowHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                     &lt;element name="MmlTagTableCell" maxOccurs="unbounded" minOccurs="0"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="RowIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                               &lt;element name="ColumnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                               &lt;element name="Content" type="{http://schemas.radixware.org/xscml.xsd}MmlType"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="MarkdownImage"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="MarkdownRef"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
     *                 &lt;/extension&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Comment"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
     *                   &lt;attribute name="DomainId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="IsOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "markdown",
        "idReference",
        "mmlTagTable",
        "markdownImage",
        "markdownRef",
        "comment"
    })
    public static class Item {

        @XmlElement(name = "Markdown")
        protected String markdown;
        @XmlElement(name = "IdReference")
        protected MmlType.Item.IdReference idReference;
        @XmlElement(name = "MmlTagTable")
        protected MmlType.Item.MmlTagTable mmlTagTable;
        @XmlElement(name = "MarkdownImage")
        protected MmlType.Item.MarkdownImage markdownImage;
        @XmlElement(name = "MarkdownRef")
        protected MmlType.Item.MarkdownRef markdownRef;
        @XmlElement(name = "Comment")
        protected MmlType.Item.Comment comment;

        /**
         * Gets the value of the markdown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarkdown() {
            return markdown;
        }

        /**
         * Sets the value of the markdown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarkdown(String value) {
            this.markdown = value;
        }

        /**
         * Gets the value of the idReference property.
         * 
         * @return
         *     possible object is
         *     {@link MmlType.Item.IdReference }
         *     
         */
        public MmlType.Item.IdReference getIdReference() {
            return idReference;
        }

        /**
         * Sets the value of the idReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link MmlType.Item.IdReference }
         *     
         */
        public void setIdReference(MmlType.Item.IdReference value) {
            this.idReference = value;
        }

        /**
         * Gets the value of the mmlTagTable property.
         * 
         * @return
         *     possible object is
         *     {@link MmlType.Item.MmlTagTable }
         *     
         */
        public MmlType.Item.MmlTagTable getMmlTagTable() {
            return mmlTagTable;
        }

        /**
         * Sets the value of the mmlTagTable property.
         * 
         * @param value
         *     allowed object is
         *     {@link MmlType.Item.MmlTagTable }
         *     
         */
        public void setMmlTagTable(MmlType.Item.MmlTagTable value) {
            this.mmlTagTable = value;
        }

        /**
         * Gets the value of the markdownImage property.
         * 
         * @return
         *     possible object is
         *     {@link MmlType.Item.MarkdownImage }
         *     
         */
        public MmlType.Item.MarkdownImage getMarkdownImage() {
            return markdownImage;
        }

        /**
         * Sets the value of the markdownImage property.
         * 
         * @param value
         *     allowed object is
         *     {@link MmlType.Item.MarkdownImage }
         *     
         */
        public void setMarkdownImage(MmlType.Item.MarkdownImage value) {
            this.markdownImage = value;
        }

        /**
         * Gets the value of the markdownRef property.
         * 
         * @return
         *     possible object is
         *     {@link MmlType.Item.MarkdownRef }
         *     
         */
        public MmlType.Item.MarkdownRef getMarkdownRef() {
            return markdownRef;
        }

        /**
         * Sets the value of the markdownRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link MmlType.Item.MarkdownRef }
         *     
         */
        public void setMarkdownRef(MmlType.Item.MarkdownRef value) {
            this.markdownRef = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link MmlType.Item.Comment }
         *     
         */
        public MmlType.Item.Comment getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link MmlType.Item.Comment }
         *     
         */
        public void setComment(MmlType.Item.Comment value) {
            this.comment = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
         *       &lt;attribute name="DomainId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="IsOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comment
            extends MmlTagItem
        {

            @XmlAttribute(name = "DomainId")
            protected String domainId;
            @XmlAttribute(name = "IsOpen")
            protected Boolean isOpen;

            /**
             * Gets the value of the domainId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDomainId() {
                return domainId;
            }

            /**
             * Sets the value of the domainId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDomainId(String value) {
                this.domainId = value;
            }

            /**
             * Gets the value of the isOpen property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsOpen() {
                return isOpen;
            }

            /**
             * Sets the value of the isOpen property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsOpen(Boolean value) {
                this.isOpen = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
         *       &lt;attribute name="Path" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="LayerUri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Segment"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
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
            extends MmlTagItem
        {

            @XmlAttribute(name = "Path", required = true)
            protected List<String> path;
            @XmlAttribute(name = "ModuleName")
            protected String moduleName;
            @XmlAttribute(name = "DefinitionName")
            protected String definitionName;
            @XmlAttribute(name = "LayerUri")
            protected String layerUri;
            @XmlAttribute(name = "Segment")
            protected String segment;

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
             * Gets the value of the moduleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModuleName() {
                return moduleName;
            }

            /**
             * Sets the value of the moduleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModuleName(String value) {
                this.moduleName = value;
            }

            /**
             * Gets the value of the definitionName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefinitionName() {
                return definitionName;
            }

            /**
             * Sets the value of the definitionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefinitionName(String value) {
                this.definitionName = value;
            }

            /**
             * Gets the value of the layerUri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLayerUri() {
                return layerUri;
            }

            /**
             * Sets the value of the layerUri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLayerUri(String value) {
                this.layerUri = value;
            }

            /**
             * Gets the value of the segment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegment() {
                return segment;
            }

            /**
             * Sets the value of the segment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegment(String value) {
                this.segment = value;
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
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MarkdownImage
            extends Resource
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}Resource"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MarkdownRef
            extends Resource
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="FirstRowHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="MmlTagTableCell" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="RowIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="ColumnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="Content" type="{http://schemas.radixware.org/xscml.xsd}MmlType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstRowHeader",
            "mmlTagTableCell"
        })
        public static class MmlTagTable
            extends MmlTagItem
        {

            @XmlElement(name = "FirstRowHeader", defaultValue = "true")
            protected boolean firstRowHeader;
            @XmlElement(name = "MmlTagTableCell")
            protected List<MmlType.Item.MmlTagTable.MmlTagTableCell> mmlTagTableCell;

            /**
             * Gets the value of the firstRowHeader property.
             * 
             */
            public boolean isFirstRowHeader() {
                return firstRowHeader;
            }

            /**
             * Sets the value of the firstRowHeader property.
             * 
             */
            public void setFirstRowHeader(boolean value) {
                this.firstRowHeader = value;
            }

            /**
             * Gets the value of the mmlTagTableCell property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mmlTagTableCell property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMmlTagTableCell().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MmlType.Item.MmlTagTable.MmlTagTableCell }
             * 
             * 
             */
            public List<MmlType.Item.MmlTagTable.MmlTagTableCell> getMmlTagTableCell() {
                if (mmlTagTableCell == null) {
                    mmlTagTableCell = new ArrayList<MmlType.Item.MmlTagTable.MmlTagTableCell>();
                }
                return this.mmlTagTableCell;
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
             *         &lt;element name="RowIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="ColumnIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="Content" type="{http://schemas.radixware.org/xscml.xsd}MmlType"/&gt;
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
                "rowIndex",
                "columnIndex",
                "content"
            })
            public static class MmlTagTableCell {

                @XmlElement(name = "RowIndex")
                protected int rowIndex;
                @XmlElement(name = "ColumnIndex")
                protected int columnIndex;
                @XmlElement(name = "Content", required = true)
                protected MmlType content;

                /**
                 * Gets the value of the rowIndex property.
                 * 
                 */
                public int getRowIndex() {
                    return rowIndex;
                }

                /**
                 * Sets the value of the rowIndex property.
                 * 
                 */
                public void setRowIndex(int value) {
                    this.rowIndex = value;
                }

                /**
                 * Gets the value of the columnIndex property.
                 * 
                 */
                public int getColumnIndex() {
                    return columnIndex;
                }

                /**
                 * Sets the value of the columnIndex property.
                 * 
                 */
                public void setColumnIndex(int value) {
                    this.columnIndex = value;
                }

                /**
                 * Gets the value of the content property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MmlType }
                 *     
                 */
                public MmlType getContent() {
                    return content;
                }

                /**
                 * Sets the value of the content property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MmlType }
                 *     
                 */
                public void setContent(MmlType value) {
                    this.content = value;
                }

            }

        }

    }

}
