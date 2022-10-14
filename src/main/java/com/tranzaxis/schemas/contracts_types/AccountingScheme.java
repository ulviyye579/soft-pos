
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.ChangeLog;


/**
 * <p>Java class for AccountingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingScheme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeLog" type="{http://schemas.radixware.org/commondef.xsd}ChangeLog" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="AccountRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasAccountRole" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Oper" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasOper" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExtGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractClassGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingScheme", propOrder = {
    "changeLog",
    "title",
    "accountRole",
    "oper",
    "description"
})
public class AccountingScheme {

    @XmlElement(name = "ChangeLog")
    protected ChangeLog changeLog;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "AccountRole", required = true)
    protected List<CasAccountRole> accountRole;
    @XmlElement(name = "Oper", required = true)
    protected List<CasOper> oper;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "ExtGuid", required = true)
    protected String extGuid;
    @XmlAttribute(name = "ContractClassGuid", required = true)
    protected String contractClassGuid;
    @XmlAttribute(name = "InstName")
    protected String instName;

    /**
     * Gets the value of the changeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeLog }
     *     
     */
    public ChangeLog getChangeLog() {
        return changeLog;
    }

    /**
     * Sets the value of the changeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeLog }
     *     
     */
    public void setChangeLog(ChangeLog value) {
        this.changeLog = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the accountRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasAccountRole }
     * 
     * 
     */
    public List<CasAccountRole> getAccountRole() {
        if (accountRole == null) {
            accountRole = new ArrayList<CasAccountRole>();
        }
        return this.accountRole;
    }

    /**
     * Gets the value of the oper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasOper }
     * 
     * 
     */
    public List<CasOper> getOper() {
        if (oper == null) {
            oper = new ArrayList<CasOper>();
        }
        return this.oper;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the extGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtGuid() {
        return extGuid;
    }

    /**
     * Sets the value of the extGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtGuid(String value) {
        this.extGuid = value;
    }

    /**
     * Gets the value of the contractClassGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractClassGuid() {
        return contractClassGuid;
    }

    /**
     * Sets the value of the contractClassGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractClassGuid(String value) {
        this.contractClassGuid = value;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

}
