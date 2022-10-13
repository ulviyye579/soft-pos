
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateClientInfoSpecificRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateClientInfoSpecificRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonAuthQAs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClientInfoSpecificRs", propOrder = {
    "personAuthQAs"
})
public class UpdateClientInfoSpecificRs {

    @XmlElement(name = "PersonAuthQAs")
    protected UpdateClientInfoSpecificRs.PersonAuthQAs personAuthQAs;

    /**
     * Gets the value of the personAuthQAs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateClientInfoSpecificRs.PersonAuthQAs }
     *     
     */
    public UpdateClientInfoSpecificRs.PersonAuthQAs getPersonAuthQAs() {
        return personAuthQAs;
    }

    /**
     * Sets the value of the personAuthQAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateClientInfoSpecificRs.PersonAuthQAs }
     *     
     */
    public void setPersonAuthQAs(UpdateClientInfoSpecificRs.PersonAuthQAs value) {
        this.personAuthQAs = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personAuthQA"
    })
    public static class PersonAuthQAs {

        @XmlElement(name = "PersonAuthQA")
        protected List<PersonAuthQA> personAuthQA;

        /**
         * Gets the value of the personAuthQA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personAuthQA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonAuthQA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonAuthQA }
         * 
         * 
         */
        public List<PersonAuthQA> getPersonAuthQA() {
            if (personAuthQA == null) {
                personAuthQA = new ArrayList<PersonAuthQA>();
            }
            return this.personAuthQA;
        }

    }

}
