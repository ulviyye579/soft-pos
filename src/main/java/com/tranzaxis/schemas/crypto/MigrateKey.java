
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrateKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrateKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MigrateKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}MigrateKeyRq"/&gt;
 *         &lt;element name="MigrateKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}MigrateKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrateKey", propOrder = {
    "migrateKeyRq",
    "migrateKeyRs"
})
public class MigrateKey {

    @XmlElement(name = "MigrateKeyRq")
    protected MigrateKeyRq migrateKeyRq;
    @XmlElement(name = "MigrateKeyRs")
    protected MigrateKeyRs migrateKeyRs;

    /**
     * Gets the value of the migrateKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link MigrateKeyRq }
     *     
     */
    public MigrateKeyRq getMigrateKeyRq() {
        return migrateKeyRq;
    }

    /**
     * Sets the value of the migrateKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateKeyRq }
     *     
     */
    public void setMigrateKeyRq(MigrateKeyRq value) {
        this.migrateKeyRq = value;
    }

    /**
     * Gets the value of the migrateKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link MigrateKeyRs }
     *     
     */
    public MigrateKeyRs getMigrateKeyRs() {
        return migrateKeyRs;
    }

    /**
     * Sets the value of the migrateKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateKeyRs }
     *     
     */
    public void setMigrateKeyRs(MigrateKeyRs value) {
        this.migrateKeyRs = value;
    }

}
