
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeDeclaration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}JmlTagItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenericArguments" type="{http://schemas.radixware.org/xscml.xsd}TypeArguments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypeId" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Path"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="extStr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Dimension" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="IsArgumentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDeclaration", propOrder = {
    "genericArguments"
})
@XmlSeeAlso({
    org.radixware.schemas.xscml.JmlFuncProfile.ReturnType.class,
    org.radixware.schemas.xscml.JmlFuncProfile.ThrownExceptions.Exception.class
})
public class TypeDeclaration
    extends JmlTagItem
{

    @XmlElement(name = "GenericArguments")
    protected TypeArguments genericArguments;
    @XmlAttribute(name = "TypeId", required = true)
    protected long typeId;
    @XmlAttribute(name = "Path")
    protected List<String> path;
    @XmlAttribute(name = "extStr")
    protected String extStr;
    @XmlAttribute(name = "Dimension")
    protected Integer dimension;
    @XmlAttribute(name = "IsArgumentType")
    protected Boolean isArgumentType;

    /**
     * Gets the value of the genericArguments property.
     * 
     * @return
     *     possible object is
     *     {@link TypeArguments }
     *     
     */
    public TypeArguments getGenericArguments() {
        return genericArguments;
    }

    /**
     * Sets the value of the genericArguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArguments }
     *     
     */
    public void setGenericArguments(TypeArguments value) {
        this.genericArguments = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
    }

    /**
     * Gets the value of the extStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtStr() {
        return extStr;
    }

    /**
     * Sets the value of the extStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtStr(String value) {
        this.extStr = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDimension() {
        if (dimension == null) {
            return  0;
        } else {
            return dimension;
        }
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDimension(Integer value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the isArgumentType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsArgumentType() {
        if (isArgumentType == null) {
            return false;
        } else {
            return isArgumentType;
        }
    }

    /**
     * Sets the value of the isArgumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArgumentType(Boolean value) {
        this.isArgumentType = value;
    }

}
