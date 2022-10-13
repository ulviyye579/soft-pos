
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjTitles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjTitles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjTitle" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
@XmlType(name = "ObjTitles", propOrder = {
    "objTitle"
})
public class ObjTitles {

    @XmlElement(name = "ObjTitle")
    protected List<ObjTitles.ObjTitle> objTitle;

    /**
     * Gets the value of the objTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjTitles.ObjTitle }
     * 
     * 
     */
    public List<ObjTitles.ObjTitle> getObjTitle() {
        if (objTitle == null) {
            objTitle = new ArrayList<ObjTitles.ObjTitle>();
        }
        return this.objTitle;
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
     *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title"
    })
    public static class ObjTitle {

        @XmlElement(name = "Title", required = true, nillable = true)
        protected String title;
        @XmlAttribute(name = "Id", required = true)
        protected long id;

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
         * Gets the value of the id property.
         * 
         */
        public long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(long value) {
            this.id = value;
        }

    }

}
