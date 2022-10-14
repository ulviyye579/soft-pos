
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.ChangeLog;
import org.radixware.schemas.reports.ParametersBindingType;
import org.radixware.schemas.xscml.JmlFuncProfile;
import org.radixware.schemas.xscml.JmlType;


/**
 * <p>Java class for UserFunc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFunc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JavaSrc" type="{http://schemas.radixware.org/xscml.xsd}JmlType" minOccurs="0"/&gt;
 *         &lt;element name="MethodId" type="{http://schemas.radixware.org/types.xsd}Id" minOccurs="0"/&gt;
 *         &lt;element name="MethodProfile" type="{http://schemas.radixware.org/xscml.xsd}JmlFuncProfile" minOccurs="0"/&gt;
 *         &lt;element name="ExtSrc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ChangeLog" type="{http://schemas.radixware.org/commondef.xsd}ChangeLog" minOccurs="0"/&gt;
 *         &lt;element name="CompatibleVersions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Binding" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LinkedFunctions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Function" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ParamsBinding" type="{http://schemas.radixware.org/reports.xsd}ParametersBindingType" minOccurs="0"/&gt;
 *                   &lt;element name="ParamsBindingList" type="{http://schemas.radixware.org/common.xsd}ParamsBindingList" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Use" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="LibFunc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassGUID" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerPid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerEntityId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerClassId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerPropId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Profile" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ProfileVersion" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFunc", propOrder = {
    "description",
    "javaSrc",
    "methodId",
    "methodProfile",
    "extSrc",
    "changeLog",
    "compatibleVersions",
    "binding"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.UserFunc.class
})
public class UserFunc {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "JavaSrc")
    protected JmlType javaSrc;
    @XmlElement(name = "MethodId")
    protected String methodId;
    @XmlElement(name = "MethodProfile")
    protected JmlFuncProfile methodProfile;
    @XmlElement(name = "ExtSrc")
    protected String extSrc;
    @XmlElement(name = "ChangeLog")
    protected ChangeLog changeLog;
    @XmlElement(name = "CompatibleVersions")
    protected String compatibleVersions;
    @XmlElement(name = "Binding")
    protected UserFunc.Binding binding;
    @XmlAttribute(name = "ClassGUID", required = true)
    protected String classGUID;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "OwnerPid")
    protected String ownerPid;
    @XmlAttribute(name = "OwnerEntityId")
    protected String ownerEntityId;
    @XmlAttribute(name = "OwnerClassId")
    protected String ownerClassId;
    @XmlAttribute(name = "OwnerExtGuid")
    protected String ownerExtGuid;
    @XmlAttribute(name = "OwnerPropId")
    protected String ownerPropId;
    @XmlAttribute(name = "Profile")
    protected String profile;
    @XmlAttribute(name = "ProfileVersion")
    protected Long profileVersion;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
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
     * Gets the value of the javaSrc property.
     * 
     * @return
     *     possible object is
     *     {@link JmlType }
     *     
     */
    public JmlType getJavaSrc() {
        return javaSrc;
    }

    /**
     * Sets the value of the javaSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmlType }
     *     
     */
    public void setJavaSrc(JmlType value) {
        this.javaSrc = value;
    }

    /**
     * Gets the value of the methodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     * Sets the value of the methodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodId(String value) {
        this.methodId = value;
    }

    /**
     * Gets the value of the methodProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JmlFuncProfile }
     *     
     */
    public JmlFuncProfile getMethodProfile() {
        return methodProfile;
    }

    /**
     * Sets the value of the methodProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmlFuncProfile }
     *     
     */
    public void setMethodProfile(JmlFuncProfile value) {
        this.methodProfile = value;
    }

    /**
     * Gets the value of the extSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSrc() {
        return extSrc;
    }

    /**
     * Sets the value of the extSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSrc(String value) {
        this.extSrc = value;
    }

    /**
     * Gets the value of the changeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeLog }
     *     
     */
    public ChangeLog getChangeLog() {
        return changeLog;
    }

    /**
     * Sets the value of the changeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeLog }
     *     
     */
    public void setChangeLog(ChangeLog value) {
        this.changeLog = value;
    }

    /**
     * Gets the value of the compatibleVersions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleVersions() {
        return compatibleVersions;
    }

    /**
     * Sets the value of the compatibleVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleVersions(String value) {
        this.compatibleVersions = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc.Binding }
     *     
     */
    public UserFunc.Binding getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc.Binding }
     *     
     */
    public void setBinding(UserFunc.Binding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the classGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGUID() {
        return classGUID;
    }

    /**
     * Sets the value of the classGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGUID(String value) {
        this.classGUID = value;
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
     * Gets the value of the ownerPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPid() {
        return ownerPid;
    }

    /**
     * Sets the value of the ownerPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPid(String value) {
        this.ownerPid = value;
    }

    /**
     * Gets the value of the ownerEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerEntityId() {
        return ownerEntityId;
    }

    /**
     * Sets the value of the ownerEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerEntityId(String value) {
        this.ownerEntityId = value;
    }

    /**
     * Gets the value of the ownerClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerClassId() {
        return ownerClassId;
    }

    /**
     * Sets the value of the ownerClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerClassId(String value) {
        this.ownerClassId = value;
    }

    /**
     * Gets the value of the ownerExtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerExtGuid() {
        return ownerExtGuid;
    }

    /**
     * Sets the value of the ownerExtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerExtGuid(String value) {
        this.ownerExtGuid = value;
    }

    /**
     * Gets the value of the ownerPropId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPropId() {
        return ownerPropId;
    }

    /**
     * Sets the value of the ownerPropId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPropId(String value) {
        this.ownerPropId = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileVersion(Long value) {
        this.profileVersion = value;
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
     *         &lt;element name="LinkedFunctions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Function" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ParamsBinding" type="{http://schemas.radixware.org/reports.xsd}ParametersBindingType" minOccurs="0"/&gt;
     *         &lt;element name="ParamsBindingList" type="{http://schemas.radixware.org/common.xsd}ParamsBindingList" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Use" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="LibFunc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "linkedFunctions",
        "paramsBinding",
        "paramsBindingList"
    })
    public static class Binding {

        @XmlElement(name = "LinkedFunctions")
        protected UserFunc.Binding.LinkedFunctions linkedFunctions;
        @XmlElement(name = "ParamsBinding")
        protected ParametersBindingType paramsBinding;
        @XmlElement(name = "ParamsBindingList")
        protected ParamsBindingList paramsBindingList;
        @XmlAttribute(name = "Use")
        protected Boolean use;
        @XmlAttribute(name = "LibFunc")
        protected String libFunc;

        /**
         * Gets the value of the linkedFunctions property.
         * 
         * @return
         *     possible object is
         *     {@link UserFunc.Binding.LinkedFunctions }
         *     
         */
        public UserFunc.Binding.LinkedFunctions getLinkedFunctions() {
            return linkedFunctions;
        }

        /**
         * Sets the value of the linkedFunctions property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserFunc.Binding.LinkedFunctions }
         *     
         */
        public void setLinkedFunctions(UserFunc.Binding.LinkedFunctions value) {
            this.linkedFunctions = value;
        }

        /**
         * Gets the value of the paramsBinding property.
         * 
         * @return
         *     possible object is
         *     {@link ParametersBindingType }
         *     
         */
        public ParametersBindingType getParamsBinding() {
            return paramsBinding;
        }

        /**
         * Sets the value of the paramsBinding property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParametersBindingType }
         *     
         */
        public void setParamsBinding(ParametersBindingType value) {
            this.paramsBinding = value;
        }

        /**
         * Gets the value of the paramsBindingList property.
         * 
         * @return
         *     possible object is
         *     {@link ParamsBindingList }
         *     
         */
        public ParamsBindingList getParamsBindingList() {
            return paramsBindingList;
        }

        /**
         * Sets the value of the paramsBindingList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParamsBindingList }
         *     
         */
        public void setParamsBindingList(ParamsBindingList value) {
            this.paramsBindingList = value;
        }

        /**
         * Gets the value of the use property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isUse() {
            if (use == null) {
                return false;
            } else {
                return use;
            }
        }

        /**
         * Sets the value of the use property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUse(Boolean value) {
            this.use = value;
        }

        /**
         * Gets the value of the libFunc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibFunc() {
            return libFunc;
        }

        /**
         * Sets the value of the libFunc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibFunc(String value) {
            this.libFunc = value;
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
         *         &lt;element name="Function" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "function"
        })
        public static class LinkedFunctions {

            @XmlElement(name = "Function")
            protected List<UserFunc.Binding.LinkedFunctions.Function> function;

            /**
             * Gets the value of the function property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the function property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFunction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserFunc.Binding.LinkedFunctions.Function }
             * 
             * 
             */
            public List<UserFunc.Binding.LinkedFunctions.Function> getFunction() {
                if (function == null) {
                    function = new ArrayList<UserFunc.Binding.LinkedFunctions.Function>();
                }
                return this.function;
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
             *       &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Function {

                @XmlAttribute(name = "Guid", required = true)
                protected String guid;

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

            }

        }

    }

}
