
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for CasOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasOper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Handler" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasOperHandler" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SelectAcctRoleFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ExtEntryPartAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FinOperKind" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CFinOperKind" /&gt;
 *       &lt;attribute name="Dir" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CFinOperDir" /&gt;
 *       &lt;attribute name="FinOperType" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CFinOperType" /&gt;
 *       &lt;attribute name="ReverseForBackward" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="NoNeedHandle" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="SelectAcctRoleByUserFunc" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasOper", propOrder = {
    "handler",
    "selectAcctRoleFunc",
    "notes",
    "extEntryPartAcctRole"
})
public class CasOper {

    @XmlElement(name = "Handler", required = true)
    protected List<CasOperHandler> handler;
    @XmlElement(name = "SelectAcctRoleFunc")
    protected UserFunc selectAcctRoleFunc;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "ExtEntryPartAcctRole", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extEntryPartAcctRole;
    @XmlAttribute(name = "FinOperKind", required = true)
    protected String finOperKind;
    @XmlAttribute(name = "Dir", required = true)
    protected String dir;
    @XmlAttribute(name = "FinOperType", required = true)
    protected String finOperType;
    @XmlAttribute(name = "ReverseForBackward", required = true)
    protected boolean reverseForBackward;
    @XmlAttribute(name = "NoNeedHandle", required = true)
    protected boolean noNeedHandle;
    @XmlAttribute(name = "SelectAcctRoleByUserFunc")
    protected Boolean selectAcctRoleByUserFunc;

    /**
     * Gets the value of the handler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasOperHandler }
     * 
     * 
     */
    public List<CasOperHandler> getHandler() {
        if (handler == null) {
            handler = new ArrayList<CasOperHandler>();
        }
        return this.handler;
    }

    /**
     * Gets the value of the selectAcctRoleFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getSelectAcctRoleFunc() {
        return selectAcctRoleFunc;
    }

    /**
     * Sets the value of the selectAcctRoleFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setSelectAcctRoleFunc(UserFunc value) {
        this.selectAcctRoleFunc = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the extEntryPartAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtEntryPartAcctRole() {
        return extEntryPartAcctRole;
    }

    /**
     * Sets the value of the extEntryPartAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtEntryPartAcctRole(JAXBElement<String> value) {
        this.extEntryPartAcctRole = value;
    }

    /**
     * Gets the value of the finOperKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinOperKind() {
        return finOperKind;
    }

    /**
     * Sets the value of the finOperKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinOperKind(String value) {
        this.finOperKind = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the finOperType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinOperType() {
        return finOperType;
    }

    /**
     * Sets the value of the finOperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinOperType(String value) {
        this.finOperType = value;
    }

    /**
     * Gets the value of the reverseForBackward property.
     * 
     */
    public boolean isReverseForBackward() {
        return reverseForBackward;
    }

    /**
     * Sets the value of the reverseForBackward property.
     * 
     */
    public void setReverseForBackward(boolean value) {
        this.reverseForBackward = value;
    }

    /**
     * Gets the value of the noNeedHandle property.
     * 
     */
    public boolean isNoNeedHandle() {
        return noNeedHandle;
    }

    /**
     * Sets the value of the noNeedHandle property.
     * 
     */
    public void setNoNeedHandle(boolean value) {
        this.noNeedHandle = value;
    }

    /**
     * Gets the value of the selectAcctRoleByUserFunc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectAcctRoleByUserFunc() {
        if (selectAcctRoleByUserFunc == null) {
            return false;
        } else {
            return selectAcctRoleByUserFunc;
        }
    }

    /**
     * Sets the value of the selectAcctRoleByUserFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectAcctRoleByUserFunc(Boolean value) {
        this.selectAcctRoleByUserFunc = value;
    }

}
