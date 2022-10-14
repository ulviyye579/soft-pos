
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442 Pos - \u0430\u0431\u0441\u043e\u043b\u044e\u0442\u043d\u0430\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u044f
 * 
 * <p>Java class for FileSeekRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSeekRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSeekRs")
public class FileSeekRs {

    @XmlAttribute(name = "Pos", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long pos;

    /**
     * Gets the value of the pos property.
     * 
     */
    public long getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     */
    public void setPos(long value) {
        this.pos = value;
    }

}
