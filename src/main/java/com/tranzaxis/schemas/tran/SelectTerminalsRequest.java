
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTerminalsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTerminalsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsRequest"&gt;
 *       &lt;attribute name="TerminalType" type="{http://schemas.tranzaxis.com/tran.xsd}TermTypeEnum" /&gt;
 *       &lt;attribute name="TerminalClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalNameLike" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalSettingsId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TerminalSettingsRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalTwoIsPrototype" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTerminalsRequest")
public class SelectTerminalsRequest
    extends SelectContractsRequest
{

    @XmlAttribute(name = "TerminalType")
    protected String terminalType;
    @XmlAttribute(name = "TerminalClassGuid")
    protected String terminalClassGuid;
    @XmlAttribute(name = "TerminalNameLike")
    protected String terminalNameLike;
    @XmlAttribute(name = "TerminalExtRid")
    protected String terminalExtRid;
    @XmlAttribute(name = "TerminalSettingsId")
    protected Long terminalSettingsId;
    @XmlAttribute(name = "TerminalSettingsRid")
    protected String terminalSettingsRid;
    @XmlAttribute(name = "TerminalTwoIsPrototype")
    protected Boolean terminalTwoIsPrototype;

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the terminalClassGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalClassGuid() {
        return terminalClassGuid;
    }

    /**
     * Sets the value of the terminalClassGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalClassGuid(String value) {
        this.terminalClassGuid = value;
    }

    /**
     * Gets the value of the terminalNameLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalNameLike() {
        return terminalNameLike;
    }

    /**
     * Sets the value of the terminalNameLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalNameLike(String value) {
        this.terminalNameLike = value;
    }

    /**
     * Gets the value of the terminalExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalExtRid() {
        return terminalExtRid;
    }

    /**
     * Sets the value of the terminalExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalExtRid(String value) {
        this.terminalExtRid = value;
    }

    /**
     * Gets the value of the terminalSettingsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerminalSettingsId() {
        return terminalSettingsId;
    }

    /**
     * Sets the value of the terminalSettingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerminalSettingsId(Long value) {
        this.terminalSettingsId = value;
    }

    /**
     * Gets the value of the terminalSettingsRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalSettingsRid() {
        return terminalSettingsRid;
    }

    /**
     * Sets the value of the terminalSettingsRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalSettingsRid(String value) {
        this.terminalSettingsRid = value;
    }

    /**
     * Gets the value of the terminalTwoIsPrototype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminalTwoIsPrototype() {
        return terminalTwoIsPrototype;
    }

    /**
     * Sets the value of the terminalTwoIsPrototype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminalTwoIsPrototype(Boolean value) {
        this.terminalTwoIsPrototype = value;
    }

}
