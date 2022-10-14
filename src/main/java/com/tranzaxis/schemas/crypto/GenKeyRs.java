
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GenKeyRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenKeyRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkKeyInt" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *         &lt;element name="WorkKeyOut" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Check" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenKeyRs", propOrder = {
    "workKeyInt",
    "workKeyOut"
})
public class GenKeyRs {

    @XmlElement(name = "WorkKeyInt", required = true)
    protected IntKey workKeyInt;
    @XmlElement(name = "WorkKeyOut")
    protected GenKeyRs.WorkKeyOut workKeyOut;
    @XmlAttribute(name = "Check")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] check;

    /**
     * Gets the value of the workKeyInt property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getWorkKeyInt() {
        return workKeyInt;
    }

    /**
     * Sets the value of the workKeyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setWorkKeyInt(IntKey value) {
        this.workKeyInt = value;
    }

    /**
     * Gets the value of the workKeyOut property.
     * 
     * @return
     *     possible object is
     *     {@link GenKeyRs.WorkKeyOut }
     *     
     */
    public GenKeyRs.WorkKeyOut getWorkKeyOut() {
        return workKeyOut;
    }

    /**
     * Sets the value of the workKeyOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenKeyRs.WorkKeyOut }
     *     
     */
    public void setWorkKeyOut(GenKeyRs.WorkKeyOut value) {
        this.workKeyOut = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(byte[] value) {
        this.check = value;
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
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WorkKeyOut {

        @XmlAttribute(name = "Value", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

    }

}
