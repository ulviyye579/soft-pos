
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442 ID - \u0418\u0434. \u043e\u0442\u043a\u0440\u044b\u0442\u043e\u0433\u043e \u0444\u0430\u0439\u043b\u0430
 * 
 * <p>Java class for FileWriteRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileWriteRq"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileWriteRq", propOrder = {
    "value"
})
public class FileWriteRq {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
