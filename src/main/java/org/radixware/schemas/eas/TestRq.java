
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Transaction" type="{http://schemas.radixware.org/eas.xsd}TransactionEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestRq", propOrder = {
    "sessionId",
    "transaction"
})
public class TestRq {

    @XmlElement(name = "SessionId")
    protected long sessionId;
    @XmlElement(name = "Transaction", defaultValue = "No")
    @XmlSchemaType(name = "string")
    protected TransactionEnum transaction;

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnum }
     *     
     */
    public TransactionEnum getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnum }
     *     
     */
    public void setTransaction(TransactionEnum value) {
        this.transaction = value;
    }

}
