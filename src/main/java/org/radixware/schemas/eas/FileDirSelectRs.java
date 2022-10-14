
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0415\u0441\u043b\u0438 DirName == NULL, \u043d\u0435 \u0432\u044b\u0431\u0440\u0430\u043d\u043e
 * 
 * <p>Java class for FileDirSelectRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirSelectRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DirName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirSelectRs")
public class FileDirSelectRs {

    @XmlAttribute(name = "DirName")
    protected String dirName;

    /**
     * Gets the value of the dirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirName() {
        return dirName;
    }

    /**
     * Sets the value of the dirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirName(String value) {
        this.dirName = value;
    }

}
