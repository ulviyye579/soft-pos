
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Oper" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Kind" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Dir" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}CharEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RegisterRoleParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MoneyParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CcyParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="IntParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="BoolParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TariffVersionParams"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConfirmationMode" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinPlan", propOrder = {
    "oper"
})
public class FinPlan {

    @XmlElement(name = "Oper")
    protected List<FinPlan.Oper> oper;
    @XmlAttribute(name = "ConfirmationMode")
    protected String confirmationMode;

    /**
     * Gets the value of the oper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinPlan.Oper }
     * 
     * 
     */
    public List<FinPlan.Oper> getOper() {
        if (oper == null) {
            oper = new ArrayList<FinPlan.Oper>();
        }
        return this.oper;
    }

    /**
     * Gets the value of the confirmationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationMode() {
        if (confirmationMode == null) {
            return "None";
        } else {
            return confirmationMode;
        }
    }

    /**
     * Sets the value of the confirmationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationMode(String value) {
        this.confirmationMode = value;
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
     *       &lt;attribute name="Kind" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Dir" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}CharEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RegisterRoleParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MoneyParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CcyParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="IntParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="BoolParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TariffVersionParams"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Oper {

        @XmlAttribute(name = "Kind", required = true)
        protected String kind;
        @XmlAttribute(name = "Dir", required = true)
        protected String dir;
        @XmlAttribute(name = "RegisterRoleParams")
        protected List<String> registerRoleParams;
        @XmlAttribute(name = "MoneyParams")
        protected List<BigDecimal> moneyParams;
        @XmlAttribute(name = "CcyParams")
        protected List<Long> ccyParams;
        @XmlAttribute(name = "IntParams")
        protected List<Long> intParams;
        @XmlAttribute(name = "BoolParams")
        protected List<Boolean> boolParams;
        @XmlAttribute(name = "TariffVersionParams")
        protected List<Long> tariffVersionParams;

        /**
         * Gets the value of the kind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKind() {
            return kind;
        }

        /**
         * Sets the value of the kind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKind(String value) {
            this.kind = value;
        }

        /**
         * Gets the value of the dir property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDir() {
            return dir;
        }

        /**
         * Sets the value of the dir property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDir(String value) {
            this.dir = value;
        }

        /**
         * Gets the value of the registerRoleParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registerRoleParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegisterRoleParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRegisterRoleParams() {
            if (registerRoleParams == null) {
                registerRoleParams = new ArrayList<String>();
            }
            return this.registerRoleParams;
        }

        /**
         * Gets the value of the moneyParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the moneyParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMoneyParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getMoneyParams() {
            if (moneyParams == null) {
                moneyParams = new ArrayList<BigDecimal>();
            }
            return this.moneyParams;
        }

        /**
         * Gets the value of the ccyParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ccyParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCcyParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCcyParams() {
            if (ccyParams == null) {
                ccyParams = new ArrayList<Long>();
            }
            return this.ccyParams;
        }

        /**
         * Gets the value of the intParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getIntParams() {
            if (intParams == null) {
                intParams = new ArrayList<Long>();
            }
            return this.intParams;
        }

        /**
         * Gets the value of the boolParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boolParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoolParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Boolean }
         * 
         * 
         */
        public List<Boolean> getBoolParams() {
            if (boolParams == null) {
                boolParams = new ArrayList<Boolean>();
            }
            return this.boolParams;
        }

        /**
         * Gets the value of the tariffVersionParams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariffVersionParams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariffVersionParams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTariffVersionParams() {
            if (tariffVersionParams == null) {
                tariffVersionParams = new ArrayList<Long>();
            }
            return this.tariffVersionParams;
        }

    }

}
