
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisableReportPubsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisableReportPubsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubInfo" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PubId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="PubName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "DisableReportPubsRs", propOrder = {
    "pubInfo"
})
public class DisableReportPubsRs {

    @XmlElement(name = "PubInfo", required = true)
    protected List<DisableReportPubsRs.PubInfo> pubInfo;

    /**
     * Gets the value of the pubInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisableReportPubsRs.PubInfo }
     * 
     * 
     */
    public List<DisableReportPubsRs.PubInfo> getPubInfo() {
        if (pubInfo == null) {
            pubInfo = new ArrayList<DisableReportPubsRs.PubInfo>();
        }
        return this.pubInfo;
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
     *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PubId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="PubName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location"
    })
    public static class PubInfo {

        @XmlElement(name = "Location", required = true)
        protected String location;
        @XmlAttribute(name = "PubId")
        protected Integer pubId;
        @XmlAttribute(name = "PubName")
        protected String pubName;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the pubId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPubId() {
            return pubId;
        }

        /**
         * Sets the value of the pubId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPubId(Integer value) {
            this.pubId = value;
        }

        /**
         * Gets the value of the pubName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPubName() {
            return pubName;
        }

        /**
         * Sets the value of the pubName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPubName(String value) {
            this.pubName = value;
        }

    }

}
