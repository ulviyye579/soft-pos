
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ObjectGuid;


/**
 * <p>Java class for WriteoffReconDiff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteoffReconDiff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriteoffInstAcctMap" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectGuid"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DiffRegRole" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}RegisterRoleEnum" /&gt;
 *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteoffReconDiff", propOrder = {
    "writeoffInstAcctMap"
})
public class WriteoffReconDiff {

    @XmlElement(name = "WriteoffInstAcctMap", required = true, nillable = true)
    protected ObjectGuid writeoffInstAcctMap;
    @XmlAttribute(name = "DiffRegRole", required = true)
    protected String diffRegRole;
    @XmlAttribute(name = "Ccy", required = true)
    protected long ccy;
    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;

    /**
     * Gets the value of the writeoffInstAcctMap property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectGuid }
     *     
     */
    public ObjectGuid getWriteoffInstAcctMap() {
        return writeoffInstAcctMap;
    }

    /**
     * Sets the value of the writeoffInstAcctMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectGuid }
     *     
     */
    public void setWriteoffInstAcctMap(ObjectGuid value) {
        this.writeoffInstAcctMap = value;
    }

    /**
     * Gets the value of the diffRegRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffRegRole() {
        return diffRegRole;
    }

    /**
     * Sets the value of the diffRegRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffRegRole(String value) {
        this.diffRegRole = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     */
    public long getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     */
    public void setCcy(long value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

}
