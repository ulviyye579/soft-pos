
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibUserFuncXmlRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibUserFuncXmlRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="LibFuncId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibUserFuncXmlRq")
public class LibUserFuncXmlRq {

    @XmlAttribute(name = "LibFuncId")
    protected String libFuncId;

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

}
