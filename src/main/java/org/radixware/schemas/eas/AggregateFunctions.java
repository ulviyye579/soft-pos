
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateFunctions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateFunctions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FunctionCall" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ColumnId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="FunctionName" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "AggregateFunctions", propOrder = {
    "functionCall"
})
public class AggregateFunctions {

    @XmlElement(name = "FunctionCall", required = true)
    protected List<AggregateFunctions.FunctionCall> functionCall;

    /**
     * Gets the value of the functionCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateFunctions.FunctionCall }
     * 
     * 
     */
    public List<AggregateFunctions.FunctionCall> getFunctionCall() {
        if (functionCall == null) {
            functionCall = new ArrayList<AggregateFunctions.FunctionCall>();
        }
        return this.functionCall;
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
     *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ColumnId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="FunctionName" use="required"&gt;
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
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class FunctionCall {

        @XmlElement(name = "Result")
        protected String result;
        @XmlAttribute(name = "ColumnId")
        protected String columnId;
        @XmlAttribute(name = "FunctionName", required = true)
        protected String functionName;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

        /**
         * Gets the value of the columnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnId() {
            return columnId;
        }

        /**
         * Sets the value of the columnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnId(String value) {
            this.columnId = value;
        }

        /**
         * Gets the value of the functionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionName() {
            return functionName;
        }

        /**
         * Sets the value of the functionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunctionName(String value) {
            this.functionName = value;
        }

    }

}
