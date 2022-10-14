
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.soap.envelope.Fault;


/**
 * <p>Java class for ScoringModules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoringModules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Module" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ScoringFault" type="{http://schemas.xmlsoap.org/soap/envelope/}Fault" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "ScoringModules", propOrder = {
    "module"
})
public class ScoringModules {

    @XmlElement(name = "Module")
    protected List<ScoringModules.Module> module;

    /**
     * Gets the value of the module property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the module property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoringModules.Module }
     * 
     * 
     */
    public List<ScoringModules.Module> getModule() {
        if (module == null) {
            module = new ArrayList<ScoringModules.Module>();
        }
        return this.module;
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
     *         &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ScoringFault" type="{http://schemas.xmlsoap.org/soap/envelope/}Fault" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "input",
        "score",
        "scoringFault"
    })
    public static class Module {

        @XmlElement(name = "Input")
        protected Object input;
        @XmlElement(name = "Score")
        protected Object score;
        @XmlElement(name = "ScoringFault")
        protected Fault scoringFault;
        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "Title")
        protected String title;

        /**
         * Gets the value of the input property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getInput() {
            return input;
        }

        /**
         * Sets the value of the input property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setInput(Object value) {
            this.input = value;
        }

        /**
         * Gets the value of the score property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setScore(Object value) {
            this.score = value;
        }

        /**
         * Gets the value of the scoringFault property.
         * 
         * @return
         *     possible object is
         *     {@link Fault }
         *     
         */
        public Fault getScoringFault() {
            return scoringFault;
        }

        /**
         * Sets the value of the scoringFault property.
         * 
         * @param value
         *     allowed object is
         *     {@link Fault }
         *     
         */
        public void setScoringFault(Fault value) {
            this.scoringFault = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setId(Long value) {
            this.id = value;
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

    }

}
