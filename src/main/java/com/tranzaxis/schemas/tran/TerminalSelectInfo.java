
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalSelectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSelectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran.xsd}ContractSelectInfo"&gt;
 *       &lt;attribute name="TerminalId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TerminalName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TerminalTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSelectInfo")
public class TerminalSelectInfo
    extends ContractSelectInfo
{

    @XmlAttribute(name = "TerminalId", required = true)
    protected long terminalId;
    @XmlAttribute(name = "TerminalName", required = true)
    protected String terminalName;
    @XmlAttribute(name = "TerminalExtRid")
    protected String terminalExtRid;
    @XmlAttribute(name = "TerminalTitle")
    protected String terminalTitle;

    /**
     * Gets the value of the terminalId property.
     * 
     */
    public long getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     */
    public void setTerminalId(long value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
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
     * Gets the value of the terminalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalTitle() {
        return terminalTitle;
    }

    /**
     * Sets the value of the terminalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalTitle(String value) {
        this.terminalTitle = value;
    }

}
