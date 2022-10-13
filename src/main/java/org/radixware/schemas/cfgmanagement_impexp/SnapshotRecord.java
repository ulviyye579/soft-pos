
package org.radixware.schemas.cfgmanagement_impexp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SnapshotRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnapshotRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="Prop" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="ValNum" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *                   &lt;element name="ValStr" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *                   &lt;element name="ValDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ValTimestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ValRaw" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *                   &lt;element name="ValClob" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *                   &lt;element name="ValBlob" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="PropGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EntityGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotRecord", propOrder = {
    "pid",
    "prop"
})
public class SnapshotRecord {

    @XmlElement(name = "Pid", required = true)
    protected String pid;
    @XmlElement(name = "Prop")
    protected List<SnapshotRecord.Prop> prop;
    @XmlAttribute(name = "EntityGuid", required = true)
    protected String entityGuid;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the prop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapshotRecord.Prop }
     * 
     * 
     */
    public List<SnapshotRecord.Prop> getProp() {
        if (prop == null) {
            prop = new ArrayList<SnapshotRecord.Prop>();
        }
        return this.prop;
    }

    /**
     * Gets the value of the entityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityGuid() {
        return entityGuid;
    }

    /**
     * Sets the value of the entityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityGuid(String value) {
        this.entityGuid = value;
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
     *         &lt;element name="ValNum" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
     *         &lt;element name="ValStr" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
     *         &lt;element name="ValDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ValTimestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ValRaw" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
     *         &lt;element name="ValClob" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
     *         &lt;element name="ValBlob" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="PropGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "valNum",
        "valStr",
        "valDate",
        "valTimestamp",
        "valRaw",
        "valClob",
        "valBlob"
    })
    public static class Prop {

        @XmlElement(name = "ValNum")
        protected BigDecimal valNum;
        @XmlElement(name = "ValStr")
        protected byte[] valStr;
        @XmlElement(name = "ValDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar valDate;
        @XmlElement(name = "ValTimestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar valTimestamp;
        @XmlElement(name = "ValRaw")
        protected byte[] valRaw;
        @XmlElement(name = "ValClob")
        protected byte[] valClob;
        @XmlElement(name = "ValBlob")
        protected byte[] valBlob;
        @XmlAttribute(name = "PropGuid", required = true)
        protected String propGuid;

        /**
         * Gets the value of the valNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValNum() {
            return valNum;
        }

        /**
         * Sets the value of the valNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValNum(BigDecimal value) {
            this.valNum = value;
        }

        /**
         * Gets the value of the valStr property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValStr() {
            return valStr;
        }

        /**
         * Sets the value of the valStr property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValStr(byte[] value) {
            this.valStr = value;
        }

        /**
         * Gets the value of the valDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValDate() {
            return valDate;
        }

        /**
         * Sets the value of the valDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValDate(XMLGregorianCalendar value) {
            this.valDate = value;
        }

        /**
         * Gets the value of the valTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValTimestamp() {
            return valTimestamp;
        }

        /**
         * Sets the value of the valTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValTimestamp(XMLGregorianCalendar value) {
            this.valTimestamp = value;
        }

        /**
         * Gets the value of the valRaw property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValRaw() {
            return valRaw;
        }

        /**
         * Sets the value of the valRaw property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValRaw(byte[] value) {
            this.valRaw = value;
        }

        /**
         * Gets the value of the valClob property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValClob() {
            return valClob;
        }

        /**
         * Sets the value of the valClob property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValClob(byte[] value) {
            this.valClob = value;
        }

        /**
         * Gets the value of the valBlob property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValBlob() {
            return valBlob;
        }

        /**
         * Sets the value of the valBlob property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValBlob(byte[] value) {
            this.valBlob = value;
        }

        /**
         * Gets the value of the propGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropGuid() {
            return propGuid;
        }

        /**
         * Sets the value of the propGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropGuid(String value) {
            this.propGuid = value;
        }

    }

}
