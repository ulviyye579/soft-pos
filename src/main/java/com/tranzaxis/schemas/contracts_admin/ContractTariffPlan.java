
package com.tranzaxis.schemas.contracts_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.tariffs_admin.TariffIds;
import com.tranzaxis.schemas.tariffs_admin.Tariffs;


/**
 * <p>Java class for ContractTariffPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractTariffPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TariffPlanRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TariffPlanExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BaseTariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinishOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="RelativeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="IsUnderConstruction" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Strategies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Strategy" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="StrategyKey" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="TariffPlanExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="TariffPlanRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                             &lt;element name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
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
 *         &lt;element name="Tariffs" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tariffs" minOccurs="0"/&gt;
 *         &lt;element name="InheritedTariffs" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffIds" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedTariffs" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffIds" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsPersonal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="InheritAllTariffs" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTariffPlan", propOrder = {
    "tariffPlanGuid",
    "tariffPlanRid",
    "tariffPlanExtGuid",
    "baseTariffPlanGuid",
    "startTime",
    "startOperDay",
    "finishOperDay",
    "relativeId",
    "title",
    "description",
    "isUnderConstruction",
    "isLocked",
    "strategies",
    "tariffs",
    "inheritedTariffs",
    "excludedTariffs"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.contracts_admin.Contract.TariffPlans.TariffPlan.class
})
public class ContractTariffPlan {

    @XmlElement(name = "TariffPlanGuid")
    protected String tariffPlanGuid;
    @XmlElement(name = "TariffPlanRid")
    protected String tariffPlanRid;
    @XmlElement(name = "TariffPlanExtGuid")
    protected String tariffPlanExtGuid;
    @XmlElement(name = "BaseTariffPlanGuid")
    protected String baseTariffPlanGuid;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StartOperDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOperDay;
    @XmlElementRef(name = "FinishOperDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishOperDay;
    @XmlElementRef(name = "RelativeId", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> relativeId;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsUnderConstruction")
    protected Boolean isUnderConstruction;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;
    @XmlElement(name = "Strategies")
    protected ContractTariffPlan.Strategies strategies;
    @XmlElement(name = "Tariffs")
    protected Tariffs tariffs;
    @XmlElementRef(name = "InheritedTariffs", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TariffIds> inheritedTariffs;
    @XmlElementRef(name = "ExcludedTariffs", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TariffIds> excludedTariffs;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "IsPersonal")
    protected Boolean isPersonal;
    @XmlAttribute(name = "InheritAllTariffs")
    protected Boolean inheritAllTariffs;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the tariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanGuid() {
        return tariffPlanGuid;
    }

    /**
     * Sets the value of the tariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanGuid(String value) {
        this.tariffPlanGuid = value;
    }

    /**
     * Gets the value of the tariffPlanRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanRid() {
        return tariffPlanRid;
    }

    /**
     * Sets the value of the tariffPlanRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanRid(String value) {
        this.tariffPlanRid = value;
    }

    /**
     * Gets the value of the tariffPlanExtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanExtGuid() {
        return tariffPlanExtGuid;
    }

    /**
     * Sets the value of the tariffPlanExtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanExtGuid(String value) {
        this.tariffPlanExtGuid = value;
    }

    /**
     * Gets the value of the baseTariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTariffPlanGuid() {
        return baseTariffPlanGuid;
    }

    /**
     * Sets the value of the baseTariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTariffPlanGuid(String value) {
        this.baseTariffPlanGuid = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOperDay() {
        return startOperDay;
    }

    /**
     * Sets the value of the startOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOperDay(XMLGregorianCalendar value) {
        this.startOperDay = value;
    }

    /**
     * Gets the value of the finishOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishOperDay() {
        return finishOperDay;
    }

    /**
     * Sets the value of the finishOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishOperDay(JAXBElement<XMLGregorianCalendar> value) {
        this.finishOperDay = value;
    }

    /**
     * Gets the value of the relativeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelativeId() {
        return relativeId;
    }

    /**
     * Sets the value of the relativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelativeId(JAXBElement<Long> value) {
        this.relativeId = value;
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
     * Gets the value of the isUnderConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnderConstruction() {
        return isUnderConstruction;
    }

    /**
     * Sets the value of the isUnderConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnderConstruction(Boolean value) {
        this.isUnderConstruction = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTariffPlan.Strategies }
     *     
     */
    public ContractTariffPlan.Strategies getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTariffPlan.Strategies }
     *     
     */
    public void setStrategies(ContractTariffPlan.Strategies value) {
        this.strategies = value;
    }

    /**
     * Gets the value of the tariffs property.
     * 
     * @return
     *     possible object is
     *     {@link Tariffs }
     *     
     */
    public Tariffs getTariffs() {
        return tariffs;
    }

    /**
     * Sets the value of the tariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tariffs }
     *     
     */
    public void setTariffs(Tariffs value) {
        this.tariffs = value;
    }

    /**
     * Gets the value of the inheritedTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public JAXBElement<TariffIds> getInheritedTariffs() {
        return inheritedTariffs;
    }

    /**
     * Sets the value of the inheritedTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public void setInheritedTariffs(JAXBElement<TariffIds> value) {
        this.inheritedTariffs = value;
    }

    /**
     * Gets the value of the excludedTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public JAXBElement<TariffIds> getExcludedTariffs() {
        return excludedTariffs;
    }

    /**
     * Sets the value of the excludedTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public void setExcludedTariffs(JAXBElement<TariffIds> value) {
        this.excludedTariffs = value;
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

    /**
     * Gets the value of the isPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPersonal() {
        return isPersonal;
    }

    /**
     * Sets the value of the isPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPersonal(Boolean value) {
        this.isPersonal = value;
    }

    /**
     * Gets the value of the inheritAllTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritAllTariffs() {
        return inheritAllTariffs;
    }

    /**
     * Sets the value of the inheritAllTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritAllTariffs(Boolean value) {
        this.inheritAllTariffs = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
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
     *         &lt;element name="Strategy" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StrategyKey" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="TariffPlanExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="TariffPlanRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                   &lt;element name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
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
        "strategy"
    })
    public static class Strategies {

        @XmlElement(name = "Strategy")
        protected List<ContractTariffPlan.Strategies.Strategy> strategy;

        /**
         * Gets the value of the strategy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the strategy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStrategy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractTariffPlan.Strategies.Strategy }
         * 
         * 
         */
        public List<ContractTariffPlan.Strategies.Strategy> getStrategy() {
            if (strategy == null) {
                strategy = new ArrayList<ContractTariffPlan.Strategies.Strategy>();
            }
            return this.strategy;
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
         *         &lt;element name="StrategyKey" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="TariffPlanExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="TariffPlanRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *         &lt;element name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
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
            "strategyKey",
            "tariffPlanGuid",
            "tariffPlanExtGuid",
            "tariffPlanRid",
            "toDelete"
        })
        public static class Strategy {

            @XmlElement(name = "StrategyKey", required = true)
            protected String strategyKey;
            @XmlElement(name = "TariffPlanGuid")
            protected String tariffPlanGuid;
            @XmlElement(name = "TariffPlanExtGuid")
            protected String tariffPlanExtGuid;
            @XmlElement(name = "TariffPlanRid")
            protected String tariffPlanRid;
            @XmlElement(name = "ToDelete")
            protected Boolean toDelete;

            /**
             * Gets the value of the strategyKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStrategyKey() {
                return strategyKey;
            }

            /**
             * Sets the value of the strategyKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStrategyKey(String value) {
                this.strategyKey = value;
            }

            /**
             * Gets the value of the tariffPlanGuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTariffPlanGuid() {
                return tariffPlanGuid;
            }

            /**
             * Sets the value of the tariffPlanGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTariffPlanGuid(String value) {
                this.tariffPlanGuid = value;
            }

            /**
             * Gets the value of the tariffPlanExtGuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTariffPlanExtGuid() {
                return tariffPlanExtGuid;
            }

            /**
             * Sets the value of the tariffPlanExtGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTariffPlanExtGuid(String value) {
                this.tariffPlanExtGuid = value;
            }

            /**
             * Gets the value of the tariffPlanRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTariffPlanRid() {
                return tariffPlanRid;
            }

            /**
             * Sets the value of the tariffPlanRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTariffPlanRid(String value) {
                this.tariffPlanRid = value;
            }

            /**
             * Gets the value of the toDelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isToDelete() {
                return toDelete;
            }

            /**
             * Sets the value of the toDelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setToDelete(Boolean value) {
                this.toDelete = value;
            }

        }

    }

}
