
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOperResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOperResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Oper" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="UndoResponse" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
 *                   &lt;element name="SelectContractsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsResponse"/&gt;
 *                   &lt;element name="SelectSubjectsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsResponse"/&gt;
 *                   &lt;element name="SelectTerminalsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsResponse"/&gt;
 *                   &lt;element name="SelectTokensResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensResponse"/&gt;
 *                   &lt;element name="SelectPayeeBillsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsResponse"/&gt;
 *                   &lt;element name="SelectPayeeConsumersResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersResponse"/&gt;
 *                   &lt;element name="SelectTransResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransResponse"/&gt;
 *                   &lt;element name="InquiryResponse" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryResponse"/&gt;
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
@XmlType(name = "GroupOperResponse", propOrder = {
    "oper"
})
public class GroupOperResponse {

    @XmlElement(name = "Oper", required = true)
    protected List<GroupOperResponse.Oper> oper;

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
     * {@link GroupOperResponse.Oper }
     * 
     * 
     */
    public List<GroupOperResponse.Oper> getOper() {
        if (oper == null) {
            oper = new ArrayList<GroupOperResponse.Oper>();
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
     *         &lt;element name="UndoResponse" type="{http://schemas.tranzaxis.com/tran.xsd}Response"/&gt;
     *         &lt;element name="SelectContractsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsResponse"/&gt;
     *         &lt;element name="SelectSubjectsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsResponse"/&gt;
     *         &lt;element name="SelectTerminalsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTerminalsResponse"/&gt;
     *         &lt;element name="SelectTokensResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTokensResponse"/&gt;
     *         &lt;element name="SelectPayeeBillsResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeBillsResponse"/&gt;
     *         &lt;element name="SelectPayeeConsumersResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectPayeeConsumersResponse"/&gt;
     *         &lt;element name="SelectTransResponse" type="{http://schemas.tranzaxis.com/tran.xsd}SelectTransResponse"/&gt;
     *         &lt;element name="InquiryResponse" type="{http://schemas.tranzaxis.com/tran.xsd}InquiryResponse"/&gt;
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
        "undoResponse",
        "selectContractsResponse",
        "selectSubjectsResponse",
        "selectTerminalsResponse",
        "selectTokensResponse",
        "selectPayeeBillsResponse",
        "selectPayeeConsumersResponse",
        "selectTransResponse",
        "inquiryResponse"
    })
    public static class Oper {

        @XmlElement(name = "UndoResponse")
        protected Response undoResponse;
        @XmlElement(name = "SelectContractsResponse")
        protected SelectContractsResponse selectContractsResponse;
        @XmlElement(name = "SelectSubjectsResponse")
        protected SelectSubjectsResponse selectSubjectsResponse;
        @XmlElement(name = "SelectTerminalsResponse")
        protected SelectTerminalsResponse selectTerminalsResponse;
        @XmlElement(name = "SelectTokensResponse")
        protected SelectTokensResponse selectTokensResponse;
        @XmlElement(name = "SelectPayeeBillsResponse")
        protected SelectPayeeBillsResponse selectPayeeBillsResponse;
        @XmlElement(name = "SelectPayeeConsumersResponse")
        protected SelectPayeeConsumersResponse selectPayeeConsumersResponse;
        @XmlElement(name = "SelectTransResponse")
        protected SelectTransResponse selectTransResponse;
        @XmlElement(name = "InquiryResponse")
        protected InquiryResponse inquiryResponse;

        /**
         * Gets the value of the undoResponse property.
         * 
         * @return
         *     possible object is
         *     {@link Response }
         *     
         */
        public Response getUndoResponse() {
            return undoResponse;
        }

        /**
         * Sets the value of the undoResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response }
         *     
         */
        public void setUndoResponse(Response value) {
            this.undoResponse = value;
        }

        /**
         * Gets the value of the selectContractsResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectContractsResponse }
         *     
         */
        public SelectContractsResponse getSelectContractsResponse() {
            return selectContractsResponse;
        }

        /**
         * Sets the value of the selectContractsResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectContractsResponse }
         *     
         */
        public void setSelectContractsResponse(SelectContractsResponse value) {
            this.selectContractsResponse = value;
        }

        /**
         * Gets the value of the selectSubjectsResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectSubjectsResponse }
         *     
         */
        public SelectSubjectsResponse getSelectSubjectsResponse() {
            return selectSubjectsResponse;
        }

        /**
         * Sets the value of the selectSubjectsResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectSubjectsResponse }
         *     
         */
        public void setSelectSubjectsResponse(SelectSubjectsResponse value) {
            this.selectSubjectsResponse = value;
        }

        /**
         * Gets the value of the selectTerminalsResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTerminalsResponse }
         *     
         */
        public SelectTerminalsResponse getSelectTerminalsResponse() {
            return selectTerminalsResponse;
        }

        /**
         * Sets the value of the selectTerminalsResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTerminalsResponse }
         *     
         */
        public void setSelectTerminalsResponse(SelectTerminalsResponse value) {
            this.selectTerminalsResponse = value;
        }

        /**
         * Gets the value of the selectTokensResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTokensResponse }
         *     
         */
        public SelectTokensResponse getSelectTokensResponse() {
            return selectTokensResponse;
        }

        /**
         * Sets the value of the selectTokensResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTokensResponse }
         *     
         */
        public void setSelectTokensResponse(SelectTokensResponse value) {
            this.selectTokensResponse = value;
        }

        /**
         * Gets the value of the selectPayeeBillsResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectPayeeBillsResponse }
         *     
         */
        public SelectPayeeBillsResponse getSelectPayeeBillsResponse() {
            return selectPayeeBillsResponse;
        }

        /**
         * Sets the value of the selectPayeeBillsResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectPayeeBillsResponse }
         *     
         */
        public void setSelectPayeeBillsResponse(SelectPayeeBillsResponse value) {
            this.selectPayeeBillsResponse = value;
        }

        /**
         * Gets the value of the selectPayeeConsumersResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectPayeeConsumersResponse }
         *     
         */
        public SelectPayeeConsumersResponse getSelectPayeeConsumersResponse() {
            return selectPayeeConsumersResponse;
        }

        /**
         * Sets the value of the selectPayeeConsumersResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectPayeeConsumersResponse }
         *     
         */
        public void setSelectPayeeConsumersResponse(SelectPayeeConsumersResponse value) {
            this.selectPayeeConsumersResponse = value;
        }

        /**
         * Gets the value of the selectTransResponse property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransResponse }
         *     
         */
        public SelectTransResponse getSelectTransResponse() {
            return selectTransResponse;
        }

        /**
         * Sets the value of the selectTransResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransResponse }
         *     
         */
        public void setSelectTransResponse(SelectTransResponse value) {
            this.selectTransResponse = value;
        }

        /**
         * Gets the value of the inquiryResponse property.
         * 
         * @return
         *     possible object is
         *     {@link InquiryResponse }
         *     
         */
        public InquiryResponse getInquiryResponse() {
            return inquiryResponse;
        }

        /**
         * Sets the value of the inquiryResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link InquiryResponse }
         *     
         */
        public void setInquiryResponse(InquiryResponse value) {
            this.inquiryResponse = value;
        }

    }

}
