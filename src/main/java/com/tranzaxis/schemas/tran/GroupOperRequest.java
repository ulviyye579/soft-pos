
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOperRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOperRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Oper" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="UndoRequest" type="{http://schemas.tranzaxis.com/tran.xsd}UndoRequest"/&gt;
 *                   &lt;element name="SelectContractsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsRequest"/&gt;
 *                   &lt;element name="SelectSubjectsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsRequest"/&gt;
 *                   &lt;element name="SelectTerminalsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsRequest"/&gt;
 *                   &lt;element name="SelectTokensRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensRequest"/&gt;
 *                   &lt;element name="SelectPayeeBillsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsRequest"/&gt;
 *                   &lt;element name="SelectPayeeConsumersRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersRequest"/&gt;
 *                   &lt;element name="SelectTransRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransRequest"/&gt;
 *                   &lt;element name="InquiryRequest" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryRequest"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "GroupOperRequest", propOrder = {
    "oper"
})
public class GroupOperRequest {

    @XmlElement(name = "Oper", required = true)
    protected List<GroupOperRequest.Oper> oper;

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
     * {@link GroupOperRequest.Oper }
     * 
     * 
     */
    public List<GroupOperRequest.Oper> getOper() {
        if (oper == null) {
            oper = new ArrayList<GroupOperRequest.Oper>();
        }
        return this.oper;
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
     *         &lt;element name="UndoRequest" type="{http://schemas.tranzaxis.com/tran.xsd}UndoRequest"/&gt;
     *         &lt;element name="SelectContractsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsRequest"/&gt;
     *         &lt;element name="SelectSubjectsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsRequest"/&gt;
     *         &lt;element name="SelectTerminalsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsRequest"/&gt;
     *         &lt;element name="SelectTokensRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensRequest"/&gt;
     *         &lt;element name="SelectPayeeBillsRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsRequest"/&gt;
     *         &lt;element name="SelectPayeeConsumersRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersRequest"/&gt;
     *         &lt;element name="SelectTransRequest" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransRequest"/&gt;
     *         &lt;element name="InquiryRequest" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryRequest"/&gt;
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
        "undoRequest",
        "selectContractsRequest",
        "selectSubjectsRequest",
        "selectTerminalsRequest",
        "selectTokensRequest",
        "selectPayeeBillsRequest",
        "selectPayeeConsumersRequest",
        "selectTransRequest",
        "inquiryRequest"
    })
    public static class Oper {

        @XmlElement(name = "UndoRequest")
        protected UndoRequest undoRequest;
        @XmlElement(name = "SelectContractsRequest")
        protected SelectContractsRequest selectContractsRequest;
        @XmlElement(name = "SelectSubjectsRequest")
        protected SelectSubjectsRequest selectSubjectsRequest;
        @XmlElement(name = "SelectTerminalsRequest")
        protected SelectTerminalsRequest selectTerminalsRequest;
        @XmlElement(name = "SelectTokensRequest")
        protected SelectTokensRequest selectTokensRequest;
        @XmlElement(name = "SelectPayeeBillsRequest")
        protected SelectPayeeBillsRequest selectPayeeBillsRequest;
        @XmlElement(name = "SelectPayeeConsumersRequest")
        protected SelectPayeeConsumersRequest selectPayeeConsumersRequest;
        @XmlElement(name = "SelectTransRequest")
        protected SelectTransRequest selectTransRequest;
        @XmlElement(name = "InquiryRequest")
        protected InquiryRequest inquiryRequest;

        /**
         * Gets the value of the undoRequest property.
         * 
         * @return
         *     possible object is
         *     {@link UndoRequest }
         *     
         */
        public UndoRequest getUndoRequest() {
            return undoRequest;
        }

        /**
         * Sets the value of the undoRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link UndoRequest }
         *     
         */
        public void setUndoRequest(UndoRequest value) {
            this.undoRequest = value;
        }

        /**
         * Gets the value of the selectContractsRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectContractsRequest }
         *     
         */
        public SelectContractsRequest getSelectContractsRequest() {
            return selectContractsRequest;
        }

        /**
         * Sets the value of the selectContractsRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectContractsRequest }
         *     
         */
        public void setSelectContractsRequest(SelectContractsRequest value) {
            this.selectContractsRequest = value;
        }

        /**
         * Gets the value of the selectSubjectsRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectSubjectsRequest }
         *     
         */
        public SelectSubjectsRequest getSelectSubjectsRequest() {
            return selectSubjectsRequest;
        }

        /**
         * Sets the value of the selectSubjectsRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectSubjectsRequest }
         *     
         */
        public void setSelectSubjectsRequest(SelectSubjectsRequest value) {
            this.selectSubjectsRequest = value;
        }

        /**
         * Gets the value of the selectTerminalsRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTerminalsRequest }
         *     
         */
        public SelectTerminalsRequest getSelectTerminalsRequest() {
            return selectTerminalsRequest;
        }

        /**
         * Sets the value of the selectTerminalsRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTerminalsRequest }
         *     
         */
        public void setSelectTerminalsRequest(SelectTerminalsRequest value) {
            this.selectTerminalsRequest = value;
        }

        /**
         * Gets the value of the selectTokensRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTokensRequest }
         *     
         */
        public SelectTokensRequest getSelectTokensRequest() {
            return selectTokensRequest;
        }

        /**
         * Sets the value of the selectTokensRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTokensRequest }
         *     
         */
        public void setSelectTokensRequest(SelectTokensRequest value) {
            this.selectTokensRequest = value;
        }

        /**
         * Gets the value of the selectPayeeBillsRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectPayeeBillsRequest }
         *     
         */
        public SelectPayeeBillsRequest getSelectPayeeBillsRequest() {
            return selectPayeeBillsRequest;
        }

        /**
         * Sets the value of the selectPayeeBillsRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectPayeeBillsRequest }
         *     
         */
        public void setSelectPayeeBillsRequest(SelectPayeeBillsRequest value) {
            this.selectPayeeBillsRequest = value;
        }

        /**
         * Gets the value of the selectPayeeConsumersRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectPayeeConsumersRequest }
         *     
         */
        public SelectPayeeConsumersRequest getSelectPayeeConsumersRequest() {
            return selectPayeeConsumersRequest;
        }

        /**
         * Sets the value of the selectPayeeConsumersRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectPayeeConsumersRequest }
         *     
         */
        public void setSelectPayeeConsumersRequest(SelectPayeeConsumersRequest value) {
            this.selectPayeeConsumersRequest = value;
        }

        /**
         * Gets the value of the selectTransRequest property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransRequest }
         *     
         */
        public SelectTransRequest getSelectTransRequest() {
            return selectTransRequest;
        }

        /**
         * Sets the value of the selectTransRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransRequest }
         *     
         */
        public void setSelectTransRequest(SelectTransRequest value) {
            this.selectTransRequest = value;
        }

        /**
         * Gets the value of the inquiryRequest property.
         * 
         * @return
         *     possible object is
         *     {@link InquiryRequest }
         *     
         */
        public InquiryRequest getInquiryRequest() {
            return inquiryRequest;
        }

        /**
         * Sets the value of the inquiryRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link InquiryRequest }
         *     
         */
        public void setInquiryRequest(InquiryRequest value) {
            this.inquiryRequest = value;
        }

    }

}
