
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibUserFuncsListRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibUserFuncsListRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LibUserFunc" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LibFuncId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LibFuncName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LibId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LibName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "LibUserFuncsListRs", propOrder = {
    "libUserFunc"
})
public class LibUserFuncsListRs {

    @XmlElement(name = "LibUserFunc")
    protected List<LibUserFuncsListRs.LibUserFunc> libUserFunc;

    /**
     * Gets the value of the libUserFunc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libUserFunc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibUserFunc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibUserFuncsListRs.LibUserFunc }
     * 
     * 
     */
    public List<LibUserFuncsListRs.LibUserFunc> getLibUserFunc() {
        if (libUserFunc == null) {
            libUserFunc = new ArrayList<LibUserFuncsListRs.LibUserFunc>();
        }
        return this.libUserFunc;
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
     *       &lt;attribute name="LibFuncId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LibFuncName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LibId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LibName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LibUserFunc {

        @XmlAttribute(name = "LibFuncId")
        protected String libFuncId;
        @XmlAttribute(name = "LibFuncName")
        protected String libFuncName;
        @XmlAttribute(name = "LibId")
        protected String libId;
        @XmlAttribute(name = "LibName")
        protected String libName;

        /**
         * Gets the value of the libFuncId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibFuncId() {
            return libFuncId;
        }

        /**
         * Sets the value of the libFuncId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibFuncId(String value) {
            this.libFuncId = value;
        }

        /**
         * Gets the value of the libFuncName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibFuncName() {
            return libFuncName;
        }

        /**
         * Sets the value of the libFuncName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibFuncName(String value) {
            this.libFuncName = value;
        }

        /**
         * Gets the value of the libId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibId() {
            return libId;
        }

        /**
         * Sets the value of the libId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibId(String value) {
            this.libId = value;
        }

        /**
         * Gets the value of the libName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibName() {
            return libName;
        }

        /**
         * Sets the value of the libName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibName(String value) {
            this.libName = value;
        }

    }

}
