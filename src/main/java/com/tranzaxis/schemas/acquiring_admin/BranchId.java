
package com.tranzaxis.schemas.acquiring_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ObjectId;


/**
 * <p>Java class for BranchId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId"&gt;
 *       &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchId")
public class BranchId
    extends ObjectId
{

    @XmlAttribute(name = "Code")
    protected Long code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

}
