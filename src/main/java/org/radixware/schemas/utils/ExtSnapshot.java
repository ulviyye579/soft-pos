
package org.radixware.schemas.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExtSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtSnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Root" type="{http://schemas.radixware.org/utils.xsd}ExtSnapshotNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CalcBeginTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="CalcEndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSnapshot", propOrder = {
    "root"
})
public class ExtSnapshot {

    @XmlElement(name = "Root")
    protected ExtSnapshotNode root;
    @XmlAttribute(name = "CalcBeginTime")
    protected XMLGregorianCalendar calcBeginTime;
    @XmlAttribute(name = "CalcEndTime")
    protected XMLGregorianCalendar calcEndTime;

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSnapshotNode }
     *     
     */
    public ExtSnapshotNode getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSnapshotNode }
     *     
     */
    public void setRoot(ExtSnapshotNode value) {
        this.root = value;
    }

    /**
     * Gets the value of the calcBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalcBeginTime() {
        return calcBeginTime;
    }

    /**
     * Sets the value of the calcBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalcBeginTime(XMLGregorianCalendar value) {
        this.calcBeginTime = value;
    }

    /**
     * Gets the value of the calcEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalcEndTime() {
        return calcEndTime;
    }

    /**
     * Sets the value of the calcEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalcEndTime(XMLGregorianCalendar value) {
        this.calcEndTime = value;
    }

}
