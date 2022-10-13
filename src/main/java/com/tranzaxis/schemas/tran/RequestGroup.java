
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tran" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CopyCmd" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="FromTranName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="FromRsPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ToRqPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Rq" type="{http://schemas.tranzaxis.com/tran.xsd}Request"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AbortOnDecline" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ReverseOnAbort" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
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
@XmlType(name = "RequestGroup", propOrder = {
    "tran"
})
public class RequestGroup {

    @XmlElement(name = "Tran", required = true)
    protected List<RequestGroup.Tran> tran;

    /**
     * Gets the value of the tran property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tran property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTran().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestGroup.Tran }
     * 
     * 
     */
    public List<RequestGroup.Tran> getTran() {
        if (tran == null) {
            tran = new ArrayList<RequestGroup.Tran>();
        }
        return this.tran;
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
     *         &lt;element name="CopyCmd" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="FromTranName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="FromRsPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ToRqPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Rq" type="{http://schemas.tranzaxis.com/tran.xsd}Request"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AbortOnDecline" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ReverseOnAbort" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "copyCmd",
        "rq"
    })
    public static class Tran {

        @XmlElement(name = "CopyCmd")
        protected List<RequestGroup.Tran.CopyCmd> copyCmd;
        @XmlElement(name = "Rq", required = true)
        protected Request rq;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "AbortOnDecline", required = true)
        protected boolean abortOnDecline;
        @XmlAttribute(name = "ReverseOnAbort", required = true)
        protected boolean reverseOnAbort;

        /**
         * Gets the value of the copyCmd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the copyCmd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCopyCmd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestGroup.Tran.CopyCmd }
         * 
         * 
         */
        public List<RequestGroup.Tran.CopyCmd> getCopyCmd() {
            if (copyCmd == null) {
                copyCmd = new ArrayList<RequestGroup.Tran.CopyCmd>();
            }
            return this.copyCmd;
        }

        /**
         * Gets the value of the rq property.
         * 
         * @return
         *     possible object is
         *     {@link Request }
         *     
         */
        public Request getRq() {
            return rq;
        }

        /**
         * Sets the value of the rq property.
         * 
         * @param value
         *     allowed object is
         *     {@link Request }
         *     
         */
        public void setRq(Request value) {
            this.rq = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the abortOnDecline property.
         * 
         */
        public boolean isAbortOnDecline() {
            return abortOnDecline;
        }

        /**
         * Sets the value of the abortOnDecline property.
         * 
         */
        public void setAbortOnDecline(boolean value) {
            this.abortOnDecline = value;
        }

        /**
         * Gets the value of the reverseOnAbort property.
         * 
         */
        public boolean isReverseOnAbort() {
            return reverseOnAbort;
        }

        /**
         * Sets the value of the reverseOnAbort property.
         * 
         */
        public void setReverseOnAbort(boolean value) {
            this.reverseOnAbort = value;
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
         *       &lt;attribute name="FromTranName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="FromRsPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ToRqPath" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CopyCmd {

            @XmlAttribute(name = "FromTranName", required = true)
            protected String fromTranName;
            @XmlAttribute(name = "FromRsPath", required = true)
            protected String fromRsPath;
            @XmlAttribute(name = "ToRqPath", required = true)
            protected String toRqPath;

            /**
             * Gets the value of the fromTranName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromTranName() {
                return fromTranName;
            }

            /**
             * Sets the value of the fromTranName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromTranName(String value) {
                this.fromTranName = value;
            }

            /**
             * Gets the value of the fromRsPath property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromRsPath() {
                return fromRsPath;
            }

            /**
             * Sets the value of the fromRsPath property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromRsPath(String value) {
                this.fromRsPath = value;
            }

            /**
             * Gets the value of the toRqPath property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToRqPath() {
                return toRqPath;
            }

            /**
             * Sets the value of the toRqPath property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToRqPath(String value) {
                this.toRqPath = value;
            }

        }

    }

}
