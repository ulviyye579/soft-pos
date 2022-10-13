
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcSelectionStatisticMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcSelectionStatisticMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcSelectionStatisticRs" type="{http://schemas.radixware.org/eas.xsd}CalcSelectionStatisticRs"/&gt;
 *         &lt;element name="CalcSelectionStatisticRq" type="{http://schemas.radixware.org/eas.xsd}CalcSelectionStatisticRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcSelectionStatisticMess", propOrder = {
    "calcSelectionStatisticRs",
    "calcSelectionStatisticRq"
})
public class CalcSelectionStatisticMess {

    @XmlElement(name = "CalcSelectionStatisticRs")
    protected CalcSelectionStatisticRs calcSelectionStatisticRs;
    @XmlElement(name = "CalcSelectionStatisticRq")
    protected CalcSelectionStatisticRq calcSelectionStatisticRq;

    /**
     * Gets the value of the calcSelectionStatisticRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcSelectionStatisticRs }
     *     
     */
    public CalcSelectionStatisticRs getCalcSelectionStatisticRs() {
        return calcSelectionStatisticRs;
    }

    /**
     * Sets the value of the calcSelectionStatisticRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcSelectionStatisticRs }
     *     
     */
    public void setCalcSelectionStatisticRs(CalcSelectionStatisticRs value) {
        this.calcSelectionStatisticRs = value;
    }

    /**
     * Gets the value of the calcSelectionStatisticRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcSelectionStatisticRq }
     *     
     */
    public CalcSelectionStatisticRq getCalcSelectionStatisticRq() {
        return calcSelectionStatisticRq;
    }

    /**
     * Sets the value of the calcSelectionStatisticRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcSelectionStatisticRq }
     *     
     */
    public void setCalcSelectionStatisticRq(CalcSelectionStatisticRq value) {
        this.calcSelectionStatisticRq = value;
    }

}
