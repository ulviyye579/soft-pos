
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrParams", propOrder = {
    "params"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.ParamValue.ArrParams.class
})
public class ArrParams {

    @XmlElement(name = "Params")
    protected List<ParamValues> params;

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamValues }
     * 
     * 
     */
    public List<ParamValues> getParams() {
        if (params == null) {
            params = new ArrayList<ParamValues>();
        }
        return this.params;
    }

}
