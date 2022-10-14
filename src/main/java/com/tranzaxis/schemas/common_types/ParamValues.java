
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParamValue" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *       &lt;attribute name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamValues", propOrder = {
    "paramValue"
})
public class ParamValues {

    @XmlElement(name = "ParamValue")
    protected List<ParamValue> paramValue;
    @XmlAttribute(name = "Mode")
    protected ListModifyMode mode;
    @XmlAttribute(name = "Seq")
    protected Long seq;

    /**
     * Gets the value of the paramValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamValue }
     * 
     * 
     */
    public List<ParamValue> getParamValue() {
        if (paramValue == null) {
            paramValue = new ArrayList<ParamValue>();
        }
        return this.paramValue;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ListModifyMode }
     *     
     */
    public ListModifyMode getMode() {
        if (mode == null) {
            return ListModifyMode.SYNC;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListModifyMode }
     *     
     */
    public void setMode(ListModifyMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getSeq() {
        if (seq == null) {
            return  0L;
        } else {
            return seq;
        }
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

}
