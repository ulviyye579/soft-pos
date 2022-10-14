
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Person" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Person"/&gt;
 *         &lt;element name="Corporation" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Corporation"/&gt;
 *         &lt;element name="Department" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Department"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", propOrder = {
    "person",
    "corporation",
    "department"
})
public class Subject {

    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "Corporation")
    protected Corporation corporation;
    @XmlElement(name = "Department")
    protected Department department;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporation property.
     * 
     * @return
     *     possible object is
     *     {@link Corporation }
     *     
     */
    public Corporation getCorporation() {
        return corporation;
    }

    /**
     * Sets the value of the corporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corporation }
     *     
     */
    public void setCorporation(Corporation value) {
        this.corporation = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

}
