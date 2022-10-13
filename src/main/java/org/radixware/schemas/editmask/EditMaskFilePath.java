
package org.radixware.schemas.editmask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskFilePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskFilePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MimeTypes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MimeTypeGroups" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MimeTypeGroup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="GroupNameOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="GroupNameId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InitialPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MimeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="StoreLastPath" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="SelectionMode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FileDialogMode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HandleInputAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FileDialogTitle" type="{http://www.w3.org/2001/XMLSchema}string" default="File Dialog" /&gt;
 *       &lt;attribute name="CheckIfPathExists" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FileDialogTitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TitleOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskFilePath", propOrder = {
    "mimeTypes",
    "mimeTypeGroups",
    "initialPath"
})
public class EditMaskFilePath {

    @XmlElement(name = "MimeTypes")
    protected EditMaskFilePath.MimeTypes mimeTypes;
    @XmlElement(name = "MimeTypeGroups")
    protected EditMaskFilePath.MimeTypeGroups mimeTypeGroups;
    @XmlElement(name = "InitialPath")
    protected String initialPath;
    @XmlAttribute(name = "MimeType")
    protected String mimeType;
    @XmlAttribute(name = "StoreLastPath")
    protected Boolean storeLastPath;
    @XmlAttribute(name = "SelectionMode")
    protected Long selectionMode;
    @XmlAttribute(name = "FileDialogMode")
    protected Long fileDialogMode;
    @XmlAttribute(name = "HandleInputAvailable")
    protected Boolean handleInputAvailable;
    @XmlAttribute(name = "FileDialogTitle")
    protected String fileDialogTitle;
    @XmlAttribute(name = "CheckIfPathExists")
    protected Boolean checkIfPathExists;
    @XmlAttribute(name = "FileDialogTitleId")
    protected String fileDialogTitleId;
    @XmlAttribute(name = "TitleOwnerId")
    protected String titleOwnerId;

    /**
     * Gets the value of the mimeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskFilePath.MimeTypes }
     *     
     */
    public EditMaskFilePath.MimeTypes getMimeTypes() {
        return mimeTypes;
    }

    /**
     * Sets the value of the mimeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskFilePath.MimeTypes }
     *     
     */
    public void setMimeTypes(EditMaskFilePath.MimeTypes value) {
        this.mimeTypes = value;
    }

    /**
     * Gets the value of the mimeTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link EditMaskFilePath.MimeTypeGroups }
     *     
     */
    public EditMaskFilePath.MimeTypeGroups getMimeTypeGroups() {
        return mimeTypeGroups;
    }

    /**
     * Sets the value of the mimeTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMaskFilePath.MimeTypeGroups }
     *     
     */
    public void setMimeTypeGroups(EditMaskFilePath.MimeTypeGroups value) {
        this.mimeTypeGroups = value;
    }

    /**
     * Gets the value of the initialPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialPath() {
        return initialPath;
    }

    /**
     * Sets the value of the initialPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialPath(String value) {
        this.initialPath = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the storeLastPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStoreLastPath() {
        if (storeLastPath == null) {
            return true;
        } else {
            return storeLastPath;
        }
    }

    /**
     * Sets the value of the storeLastPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreLastPath(Boolean value) {
        this.storeLastPath = value;
    }

    /**
     * Gets the value of the selectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSelectionMode() {
        return selectionMode;
    }

    /**
     * Sets the value of the selectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSelectionMode(Long value) {
        this.selectionMode = value;
    }

    /**
     * Gets the value of the fileDialogMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileDialogMode() {
        return fileDialogMode;
    }

    /**
     * Sets the value of the fileDialogMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileDialogMode(Long value) {
        this.fileDialogMode = value;
    }

    /**
     * Gets the value of the handleInputAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHandleInputAvailable() {
        if (handleInputAvailable == null) {
            return false;
        } else {
            return handleInputAvailable;
        }
    }

    /**
     * Sets the value of the handleInputAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleInputAvailable(Boolean value) {
        this.handleInputAvailable = value;
    }

    /**
     * Gets the value of the fileDialogTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDialogTitle() {
        if (fileDialogTitle == null) {
            return "File Dialog";
        } else {
            return fileDialogTitle;
        }
    }

    /**
     * Sets the value of the fileDialogTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDialogTitle(String value) {
        this.fileDialogTitle = value;
    }

    /**
     * Gets the value of the checkIfPathExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCheckIfPathExists() {
        if (checkIfPathExists == null) {
            return false;
        } else {
            return checkIfPathExists;
        }
    }

    /**
     * Sets the value of the checkIfPathExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckIfPathExists(Boolean value) {
        this.checkIfPathExists = value;
    }

    /**
     * Gets the value of the fileDialogTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDialogTitleId() {
        return fileDialogTitleId;
    }

    /**
     * Sets the value of the fileDialogTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDialogTitleId(String value) {
        this.fileDialogTitleId = value;
    }

    /**
     * Gets the value of the titleOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOwnerId() {
        return titleOwnerId;
    }

    /**
     * Sets the value of the titleOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOwnerId(String value) {
        this.titleOwnerId = value;
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
     *         &lt;element name="MimeTypeGroup" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="GroupNameOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="GroupNameId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
        "mimeTypeGroup"
    })
    public static class MimeTypeGroups {

        @XmlElement(name = "MimeTypeGroup")
        protected List<EditMaskFilePath.MimeTypeGroups.MimeTypeGroup> mimeTypeGroup;

        /**
         * Gets the value of the mimeTypeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mimeTypeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMimeTypeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EditMaskFilePath.MimeTypeGroups.MimeTypeGroup }
         * 
         * 
         */
        public List<EditMaskFilePath.MimeTypeGroups.MimeTypeGroup> getMimeTypeGroup() {
            if (mimeTypeGroup == null) {
                mimeTypeGroup = new ArrayList<EditMaskFilePath.MimeTypeGroups.MimeTypeGroup>();
            }
            return this.mimeTypeGroup;
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
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="GroupNameOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="GroupNameId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
        public static class MimeTypeGroup {

            @XmlElement(name = "Item")
            protected List<String> item;
            @XmlAttribute(name = "GroupName")
            protected String groupName;
            @XmlAttribute(name = "GroupNameOwnerId")
            protected String groupNameOwnerId;
            @XmlAttribute(name = "GroupNameId")
            protected String groupNameId;

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

            /**
             * Gets the value of the groupName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupName() {
                return groupName;
            }

            /**
             * Sets the value of the groupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupName(String value) {
                this.groupName = value;
            }

            /**
             * Gets the value of the groupNameOwnerId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupNameOwnerId() {
                return groupNameOwnerId;
            }

            /**
             * Sets the value of the groupNameOwnerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupNameOwnerId(String value) {
                this.groupNameOwnerId = value;
            }

            /**
             * Gets the value of the groupNameId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupNameId() {
                return groupNameId;
            }

            /**
             * Sets the value of the groupNameId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupNameId(String value) {
                this.groupNameId = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    public static class MimeTypes {

        @XmlElement(name = "Item")
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

}
