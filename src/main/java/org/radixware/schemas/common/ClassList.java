
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassInfo" type="{http://schemas.radixware.org/common.xsd}ClassInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassList", propOrder = {
    "classInfo"
})
public class ClassList {

    @XmlElement(name = "ClassInfo")
    protected List<ClassInfo> classInfo;

    /**
     * Gets the value of the classInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassInfo }
     * 
     * 
     */
    public List<ClassInfo> getClassInfo() {
        if (classInfo == null) {
            classInfo = new ArrayList<ClassInfo>();
        }
        return this.classInfo;
    }

}
