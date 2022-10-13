
package com.tranzaxis.schemas.contracts_standingorder_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AmtAlgo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExecMode" use="required" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}ExecMode" /&gt;
 *       &lt;attribute name="MainContractTypeIds" use="required" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}IntList" /&gt;
 *       &lt;attribute name="NeedCharge" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Ccys" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}IntList" /&gt;
 *       &lt;attribute name="EnabledPayeeIds" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}IntList" /&gt;
 *       &lt;attribute name="DisabledPayeeIds" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}IntList" /&gt;
 *       &lt;attribute name="PayeeContractTypeIds" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}IntList" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeSettings", propOrder = {
    "condition",
    "amtAlgo"
})
public class TypeSettings {

    @XmlElement(name = "Condition")
    protected List<TypeSettings.Condition> condition;
    @XmlElement(name = "AmtAlgo")
    protected List<TypeSettings.AmtAlgo> amtAlgo;
    @XmlAttribute(name = "ClassGuid", required = true)
    protected String classGuid;
    @XmlAttribute(name = "ExecMode", required = true)
    protected String execMode;
    @XmlAttribute(name = "MainContractTypeIds", required = true)
    protected List<Long> mainContractTypeIds;
    @XmlAttribute(name = "NeedCharge")
    protected Boolean needCharge;
    @XmlAttribute(name = "Ccys")
    protected List<Long> ccys;
    @XmlAttribute(name = "EnabledPayeeIds")
    protected List<Long> enabledPayeeIds;
    @XmlAttribute(name = "DisabledPayeeIds")
    protected List<Long> disabledPayeeIds;
    @XmlAttribute(name = "PayeeContractTypeIds")
    protected List<Long> payeeContractTypeIds;

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSettings.Condition }
     * 
     * 
     */
    public List<TypeSettings.Condition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<TypeSettings.Condition>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the amtAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSettings.AmtAlgo }
     * 
     * 
     */
    public List<TypeSettings.AmtAlgo> getAmtAlgo() {
        if (amtAlgo == null) {
            amtAlgo = new ArrayList<TypeSettings.AmtAlgo>();
        }
        return this.amtAlgo;
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
     * Gets the value of the execMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecMode() {
        return execMode;
    }

    /**
     * Sets the value of the execMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecMode(String value) {
        this.execMode = value;
    }

    /**
     * Gets the value of the mainContractTypeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainContractTypeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainContractTypeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMainContractTypeIds() {
        if (mainContractTypeIds == null) {
            mainContractTypeIds = new ArrayList<Long>();
        }
        return this.mainContractTypeIds;
    }

    /**
     * Gets the value of the needCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedCharge() {
        return needCharge;
    }

    /**
     * Sets the value of the needCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedCharge(Boolean value) {
        this.needCharge = value;
    }

    /**
     * Gets the value of the ccys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCcys() {
        if (ccys == null) {
            ccys = new ArrayList<Long>();
        }
        return this.ccys;
    }

    /**
     * Gets the value of the enabledPayeeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabledPayeeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnabledPayeeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEnabledPayeeIds() {
        if (enabledPayeeIds == null) {
            enabledPayeeIds = new ArrayList<Long>();
        }
        return this.enabledPayeeIds;
    }

    /**
     * Gets the value of the disabledPayeeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabledPayeeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabledPayeeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDisabledPayeeIds() {
        if (disabledPayeeIds == null) {
            disabledPayeeIds = new ArrayList<Long>();
        }
        return this.disabledPayeeIds;
    }

    /**
     * Gets the value of the payeeContractTypeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeContractTypeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeContractTypeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getPayeeContractTypeIds() {
        if (payeeContractTypeIds == null) {
            payeeContractTypeIds = new ArrayList<Long>();
        }
        return this.payeeContractTypeIds;
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
     *       &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AmtAlgo {

        @XmlAttribute(name = "ClassGuid")
        protected String classGuid;
        @XmlAttribute(name = "Title")
        protected String title;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Id")
        protected Long id;

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
     *       &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Condition {

        @XmlAttribute(name = "ClassGuid")
        protected String classGuid;
        @XmlAttribute(name = "Title")
        protected String title;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Id")
        protected Long id;

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

    }

}
