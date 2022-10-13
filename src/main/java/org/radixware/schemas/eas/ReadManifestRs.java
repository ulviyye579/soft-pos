
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadManifestRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadManifestRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScpName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SAPs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AddressCDATA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="SecurityProtocol" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ChannelType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="AadcMemberId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Priority" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ConnectTimeout" type="{http://schemas.radixware.org/types.xsd}Int" default="10" /&gt;
 *                           &lt;attribute name="BlockingPeriod" type="{http://schemas.radixware.org/types.xsd}Int" default="600" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ReadManifestRs", propOrder = {
    "scpName",
    "saPs"
})
public class ReadManifestRs {

    @XmlElement(name = "ScpName", required = true)
    protected String scpName;
    @XmlElement(name = "SAPs", required = true)
    protected ReadManifestRs.SAPs saPs;

    /**
     * Gets the value of the scpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScpName() {
        return scpName;
    }

    /**
     * Sets the value of the scpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScpName(String value) {
        this.scpName = value;
    }

    /**
     * Gets the value of the saPs property.
     * 
     * @return
     *     possible object is
     *     {@link ReadManifestRs.SAPs }
     *     
     */
    public ReadManifestRs.SAPs getSAPs() {
        return saPs;
    }

    /**
     * Sets the value of the saPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadManifestRs.SAPs }
     *     
     */
    public void setSAPs(ReadManifestRs.SAPs value) {
        this.saPs = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AddressCDATA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="SecurityProtocol" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ChannelType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="AadcMemberId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Priority" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ConnectTimeout" type="{http://schemas.radixware.org/types.xsd}Int" default="10" /&gt;
     *                 &lt;attribute name="BlockingPeriod" type="{http://schemas.radixware.org/types.xsd}Int" default="600" /&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class SAPs {

        @XmlElement(name = "Item")
        protected List<ReadManifestRs.SAPs.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReadManifestRs.SAPs.Item }
         * 
         * 
         */
        public List<ReadManifestRs.SAPs.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ReadManifestRs.SAPs.Item>();
            }
            return this.item;
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
         *         &lt;element name="AddressCDATA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="SecurityProtocol" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ChannelType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="AadcMemberId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Priority" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ConnectTimeout" type="{http://schemas.radixware.org/types.xsd}Int" default="10" /&gt;
         *       &lt;attribute name="BlockingPeriod" type="{http://schemas.radixware.org/types.xsd}Int" default="600" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressCDATA"
        })
        public static class Item {

            @XmlElement(name = "AddressCDATA", required = true)
            protected String addressCDATA;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Address", required = true)
            protected String address;
            @XmlAttribute(name = "SecurityProtocol", required = true)
            protected long securityProtocol;
            @XmlAttribute(name = "ChannelType", required = true)
            protected String channelType;
            @XmlAttribute(name = "AadcMemberId")
            protected Long aadcMemberId;
            @XmlAttribute(name = "Priority", required = true)
            protected long priority;
            @XmlAttribute(name = "ConnectTimeout")
            protected Long connectTimeout;
            @XmlAttribute(name = "BlockingPeriod")
            protected Long blockingPeriod;

            /**
             * Gets the value of the addressCDATA property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressCDATA() {
                return addressCDATA;
            }

            /**
             * Sets the value of the addressCDATA property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressCDATA(String value) {
                this.addressCDATA = value;
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
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the securityProtocol property.
             * 
             */
            public long getSecurityProtocol() {
                return securityProtocol;
            }

            /**
             * Sets the value of the securityProtocol property.
             * 
             */
            public void setSecurityProtocol(long value) {
                this.securityProtocol = value;
            }

            /**
             * Gets the value of the channelType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannelType() {
                return channelType;
            }

            /**
             * Sets the value of the channelType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannelType(String value) {
                this.channelType = value;
            }

            /**
             * Gets the value of the aadcMemberId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAadcMemberId() {
                return aadcMemberId;
            }

            /**
             * Sets the value of the aadcMemberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAadcMemberId(Long value) {
                this.aadcMemberId = value;
            }

            /**
             * Gets the value of the priority property.
             * 
             */
            public long getPriority() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             */
            public void setPriority(long value) {
                this.priority = value;
            }

            /**
             * Gets the value of the connectTimeout property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getConnectTimeout() {
                if (connectTimeout == null) {
                    return  10L;
                } else {
                    return connectTimeout;
                }
            }

            /**
             * Sets the value of the connectTimeout property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setConnectTimeout(Long value) {
                this.connectTimeout = value;
            }

            /**
             * Gets the value of the blockingPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getBlockingPeriod() {
                if (blockingPeriod == null) {
                    return  600L;
                } else {
                    return blockingPeriod;
                }
            }

            /**
             * Sets the value of the blockingPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBlockingPeriod(Long value) {
                this.blockingPeriod = value;
            }

        }

    }

}
