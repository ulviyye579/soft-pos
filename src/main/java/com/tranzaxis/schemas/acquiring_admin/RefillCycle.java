
package com.tranzaxis.schemas.acquiring_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefillCycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefillCycle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accounts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="StartBalance" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="OpenToRefill" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClosedId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PreviousId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillCycle", propOrder = {
    "accounts"
})
public class RefillCycle {

    @XmlElement(name = "Accounts", required = true)
    protected RefillCycle.Accounts accounts;
    @XmlAttribute(name = "ClosedId")
    protected Long closedId;
    @XmlAttribute(name = "PreviousId")
    protected Long previousId;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link RefillCycle.Accounts }
     *     
     */
    public RefillCycle.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefillCycle.Accounts }
     *     
     */
    public void setAccounts(RefillCycle.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the closedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClosedId() {
        return closedId;
    }

    /**
     * Sets the value of the closedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClosedId(Long value) {
        this.closedId = value;
    }

    /**
     * Gets the value of the previousId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousId() {
        return previousId;
    }

    /**
     * Sets the value of the previousId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousId(Long value) {
        this.previousId = value;
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
     *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StartBalance" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="OpenToRefill" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
        "account"
    })
    public static class Accounts {

        @XmlElement(name = "Account")
        protected List<RefillCycle.Accounts.Account> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RefillCycle.Accounts.Account }
         * 
         * 
         */
        public List<RefillCycle.Accounts.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<RefillCycle.Accounts.Account>();
            }
            return this.account;
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
         *         &lt;element name="StartBalance" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="OpenToRefill" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "startBalance"
        })
        public static class Account {

            @XmlElementRef(name = "StartBalance", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> startBalance;
            @XmlAttribute(name = "OpenToRefill")
            protected Boolean openToRefill;
            @XmlAttribute(name = "Id")
            protected Long id;

            /**
             * Gets the value of the startBalance property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getStartBalance() {
                return startBalance;
            }

            /**
             * Sets the value of the startBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setStartBalance(JAXBElement<BigDecimal> value) {
                this.startBalance = value;
            }

            /**
             * Gets the value of the openToRefill property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOpenToRefill() {
                return openToRefill;
            }

            /**
             * Sets the value of the openToRefill property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOpenToRefill(Boolean value) {
                this.openToRefill = value;
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

}
