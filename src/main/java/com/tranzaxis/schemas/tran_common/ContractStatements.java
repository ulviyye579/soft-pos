
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ListModifyMode;


/**
 * <p>Java class for ContractStatements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractStatements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractStatement" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractStatement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Sync" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractStatements", propOrder = {
    "contractStatement"
})
public class ContractStatements {

    @XmlElement(name = "ContractStatement")
    protected List<ContractStatement> contractStatement;
    @XmlAttribute(name = "Mode")
    protected ListModifyMode mode;

    /**
     * Gets the value of the contractStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractStatement }
     * 
     * 
     */
    public List<ContractStatement> getContractStatement() {
        if (contractStatement == null) {
            contractStatement = new ArrayList<ContractStatement>();
        }
        return this.contractStatement;
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

}
