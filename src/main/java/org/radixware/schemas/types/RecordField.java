
package org.radixware.schemas.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ValAsStr" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *           &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="InnerRecord" type="{http://schemas.radixware.org/types.xsd}Record"/&gt;
 *           &lt;element name="ArrRecord" type="{http://schemas.radixware.org/types.xsd}ArrRec"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EntityObjectTitles" type="{http://schemas.radixware.org/types.xsd}MapStrStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tableIndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordField", propOrder = {
    "valAsStr",
    "xmlVal",
    "innerRecord",
    "arrRecord",
    "entityObjectTitles"
})
public class RecordField {

    @XmlElementRef(name = "ValAsStr", namespace = "http://schemas.radixware.org/types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valAsStr;
    @XmlElementRef(name = "XmlVal", namespace = "http://schemas.radixware.org/types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> xmlVal;
    @XmlElementRef(name = "InnerRecord", namespace = "http://schemas.radixware.org/types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Record> innerRecord;
    @XmlElementRef(name = "ArrRecord", namespace = "http://schemas.radixware.org/types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrRec> arrRecord;
    @XmlElement(name = "EntityObjectTitles")
    protected MapStrStr entityObjectTitles;
    @XmlAttribute(name = "rid", required = true)
    protected String rid;
    @XmlAttribute(name = "type")
    protected Long type;
    @XmlAttribute(name = "tableIndexId")
    protected String tableIndexId;

    /**
     * Gets the value of the valAsStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValAsStr() {
        return valAsStr;
    }

    /**
     * Sets the value of the valAsStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValAsStr(JAXBElement<String> value) {
        this.valAsStr = value;
    }

    /**
     * Gets the value of the xmlVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getXmlVal() {
        return xmlVal;
    }

    /**
     * Sets the value of the xmlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setXmlVal(JAXBElement<Object> value) {
        this.xmlVal = value;
    }

    /**
     * Gets the value of the innerRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Record }{@code >}
     *     
     */
    public JAXBElement<Record> getInnerRecord() {
        return innerRecord;
    }

    /**
     * Sets the value of the innerRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Record }{@code >}
     *     
     */
    public void setInnerRecord(JAXBElement<Record> value) {
        this.innerRecord = value;
    }

    /**
     * Gets the value of the arrRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     *     
     */
    public JAXBElement<ArrRec> getArrRecord() {
        return arrRecord;
    }

    /**
     * Sets the value of the arrRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrRec }{@code >}
     *     
     */
    public void setArrRecord(JAXBElement<ArrRec> value) {
        this.arrRecord = value;
    }

    /**
     * Gets the value of the entityObjectTitles property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getEntityObjectTitles() {
        return entityObjectTitles;
    }

    /**
     * Sets the value of the entityObjectTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setEntityObjectTitles(MapStrStr value) {
        this.entityObjectTitles = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setType(Long value) {
        this.type = value;
    }

    /**
     * Gets the value of the tableIndexId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableIndexId() {
        return tableIndexId;
    }

    /**
     * Sets the value of the tableIndexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableIndexId(String value) {
        this.tableIndexId = value;
    }

}
