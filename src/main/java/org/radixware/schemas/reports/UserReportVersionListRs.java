
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserReportVersionListRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserReportVersionListRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                 &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
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
@XmlType(name = "UserReportVersionListRs", propOrder = {
    "version"
})
public class UserReportVersionListRs {

    @XmlElement(name = "Version", required = true)
    protected List<UserReportVersionListRs.Version> version;

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserReportVersionListRs.Version }
     * 
     * 
     */
    public List<UserReportVersionListRs.Version> getVersion() {
        if (version == null) {
            version = new ArrayList<UserReportVersionListRs.Version>();
        }
        return this.version;
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
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *       &lt;attribute name="Order" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Version {

        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "Order")
        protected Long order;

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
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrder(Long value) {
            this.order = value;
        }

    }

}
