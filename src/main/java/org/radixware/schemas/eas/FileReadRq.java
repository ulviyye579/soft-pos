
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442 ID - \u0418\u0434. \u043e\u0442\u043a\u0440\u044b\u0442\u043e\u0433\u043e \u0444\u0430\u0439\u043b\u0430; \u0430\u0442\u0440\u0438\u0431\u0443\u0442 Len - \u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0431\u0430\u0439\u0442 \u0447\u0438\u0442\u0430\u0442\u044c
 * 
 * <p>Java class for FileReadRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileReadRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Len" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileReadRq")
public class FileReadRq {

    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Len", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long len;

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

    /**
     * Gets the value of the len property.
     * 
     */
    public long getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     */
    public void setLen(long value) {
        this.len = value;
    }

}
