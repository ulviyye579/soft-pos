
package com.tranzaxis.schemas.applications;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppProcessingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppProcessingParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IncSubtypes" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="SrcStatus" type="{http://schemas.tranzaxis.com/applications.xsd}AppStatus" /&gt;
 *       &lt;attribute name="SrcPhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SrcPhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="DestStatus" type="{http://schemas.tranzaxis.com/applications.xsd}AppStatus" /&gt;
 *       &lt;attribute name="DestPhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DestPhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppProcessingParams")
public class AppProcessingParams {

    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "IncSubtypes")
    protected Boolean incSubtypes;
    @XmlAttribute(name = "SrcStatus")
    protected String srcStatus;
    @XmlAttribute(name = "SrcPhaseId")
    protected Long srcPhaseId;
    @XmlAttribute(name = "SrcPhaseRid")
    protected String srcPhaseRid;
    @XmlAttribute(name = "DestStatus")
    protected String destStatus;
    @XmlAttribute(name = "DestPhaseId")
    protected Long destPhaseId;
    @XmlAttribute(name = "DestPhaseRid")
    protected String destPhaseRid;

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the incSubtypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncSubtypes() {
        return incSubtypes;
    }

    /**
     * Sets the value of the incSubtypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncSubtypes(Boolean value) {
        this.incSubtypes = value;
    }

    /**
     * Gets the value of the srcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcStatus() {
        return srcStatus;
    }

    /**
     * Sets the value of the srcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcStatus(String value) {
        this.srcStatus = value;
    }

    /**
     * Gets the value of the srcPhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcPhaseId() {
        return srcPhaseId;
    }

    /**
     * Sets the value of the srcPhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcPhaseId(Long value) {
        this.srcPhaseId = value;
    }

    /**
     * Gets the value of the srcPhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPhaseRid() {
        return srcPhaseRid;
    }

    /**
     * Sets the value of the srcPhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPhaseRid(String value) {
        this.srcPhaseRid = value;
    }

    /**
     * Gets the value of the destStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestStatus() {
        return destStatus;
    }

    /**
     * Sets the value of the destStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestStatus(String value) {
        this.destStatus = value;
    }

    /**
     * Gets the value of the destPhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestPhaseId() {
        return destPhaseId;
    }

    /**
     * Sets the value of the destPhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestPhaseId(Long value) {
        this.destPhaseId = value;
    }

    /**
     * Gets the value of the destPhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPhaseRid() {
        return destPhaseRid;
    }

    /**
     * Sets the value of the destPhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPhaseRid(String value) {
        this.destPhaseRid = value;
    }

}
