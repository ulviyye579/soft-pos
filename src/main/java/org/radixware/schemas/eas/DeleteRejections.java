
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.faultdetail.Exception;


/**
 * <p>Java class for DeleteRejections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteRejections"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rejection" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ObjectPid" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                   &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="DeleteCascadeRestriction" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                     &lt;element name="DeleteOperationRestricted" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                     &lt;element name="ExceptionOnProcessPreviousObject" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                     &lt;element name="Exception" type="{http://schemas.radixware.org/faultdetail.xsd}Exception"/&gt;
 *                   &lt;/choice&gt;
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
@XmlType(name = "DeleteRejections", propOrder = {
    "rejection"
})
public class DeleteRejections {

    @XmlElement(name = "Rejection")
    protected List<DeleteRejections.Rejection> rejection;

    /**
     * Gets the value of the rejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteRejections.Rejection }
     * 
     * 
     */
    public List<DeleteRejections.Rejection> getRejection() {
        if (rejection == null) {
            rejection = new ArrayList<DeleteRejections.Rejection>();
        }
        return this.rejection;
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
     *         &lt;element name="ObjectPid" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *         &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="DeleteCascadeRestriction" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *           &lt;element name="DeleteOperationRestricted" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *           &lt;element name="ExceptionOnProcessPreviousObject" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *           &lt;element name="Exception" type="{http://schemas.radixware.org/faultdetail.xsd}Exception"/&gt;
     *         &lt;/choice&gt;
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
        "objectPid",
        "objectTitle",
        "deleteCascadeRestriction",
        "deleteOperationRestricted",
        "exceptionOnProcessPreviousObject",
        "exception"
    })
    public static class Rejection {

        @XmlElement(name = "ObjectPid", required = true)
        protected String objectPid;
        @XmlElement(name = "ObjectTitle")
        protected String objectTitle;
        @XmlElementRef(name = "DeleteCascadeRestriction", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> deleteCascadeRestriction;
        @XmlElement(name = "DeleteOperationRestricted")
        protected java.lang.Object deleteOperationRestricted;
        @XmlElement(name = "ExceptionOnProcessPreviousObject")
        protected String exceptionOnProcessPreviousObject;
        @XmlElement(name = "Exception")
        protected Exception exception;

        /**
         * Gets the value of the objectPid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectPid() {
            return objectPid;
        }

        /**
         * Sets the value of the objectPid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectPid(String value) {
            this.objectPid = value;
        }

        /**
         * Gets the value of the objectTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectTitle() {
            return objectTitle;
        }

        /**
         * Sets the value of the objectTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectTitle(String value) {
            this.objectTitle = value;
        }

        /**
         * Gets the value of the deleteCascadeRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDeleteCascadeRestriction() {
            return deleteCascadeRestriction;
        }

        /**
         * Sets the value of the deleteCascadeRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDeleteCascadeRestriction(JAXBElement<String> value) {
            this.deleteCascadeRestriction = value;
        }

        /**
         * Gets the value of the deleteOperationRestricted property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.Object }
         *     
         */
        public java.lang.Object getDeleteOperationRestricted() {
            return deleteOperationRestricted;
        }

        /**
         * Sets the value of the deleteOperationRestricted property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.Object }
         *     
         */
        public void setDeleteOperationRestricted(java.lang.Object value) {
            this.deleteOperationRestricted = value;
        }

        /**
         * Gets the value of the exceptionOnProcessPreviousObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionOnProcessPreviousObject() {
            return exceptionOnProcessPreviousObject;
        }

        /**
         * Sets the value of the exceptionOnProcessPreviousObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionOnProcessPreviousObject(String value) {
            this.exceptionOnProcessPreviousObject = value;
        }

        /**
         * Gets the value of the exception property.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Sets the value of the exception property.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

    }

}
