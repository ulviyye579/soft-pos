
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0415\u0441\u043b\u0438 \u0444\u0430\u0439\u043b \u0432\u044b\u0431\u0440\u0430\u043d, \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u0434\u043e\u043b\u0436\u0435\u043d  \u0431\u044b\u0442\u044c \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d \u043a\u0430\u043a \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u044d\u0442\u043e\u0433\u043e \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u0430 FileName
 * 
 * <p>Java class for FileSelectRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSelectRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSelectRs")
public class FileSelectRs {

    @XmlAttribute(name = "FileName")
    protected String fileName;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
