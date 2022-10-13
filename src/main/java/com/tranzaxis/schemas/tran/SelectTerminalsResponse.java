
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTerminalsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTerminalsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Terminal" type="{http://schemas.tranzaxis.com/tran.xsd}TerminalSelectInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasMore" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTerminalsResponse", propOrder = {
    "terminal"
})
public class SelectTerminalsResponse {

    @XmlElement(name = "Terminal")
    protected List<TerminalSelectInfo> terminal;
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;

    /**
     * Gets the value of the terminal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalSelectInfo }
     * 
     * 
     */
    public List<TerminalSelectInfo> getTerminal() {
        if (terminal == null) {
            terminal = new ArrayList<TerminalSelectInfo>();
        }
        return this.terminal;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

}
