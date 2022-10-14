
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.InputFormat;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.contracts_notify.NotifyContract;
import com.tranzaxis.schemas.contracts_notify.NotifyType;
import com.tranzaxis.schemas.doer_types.Doer;
import com.tranzaxis.schemas.tran.SelectTransResponse;
import org.radixware.schemas.reports.ReportPubTopic;


/**
 * <p>Java class for CustInfoRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfoRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Attribute" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice minOccurs="0"&gt;
 *                             &lt;element name="StrVal" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="IntVal" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *                             &lt;element name="NumVal" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *                             &lt;element name="BoolVal" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
 *                             &lt;element name="DateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *                             &lt;element name="BinVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *                             &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="ArrStrVal" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="ArrIntVal" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="ArrNumVal" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="ArrBoolVal" type="{http://schemas.radixware.org/types.xsd}Bool" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="ArrDateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat"/&gt;
 *                             &lt;element name="PaymentTemplate" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings"/&gt;
 *                             &lt;element name="PaymentParams"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                                 &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                                 &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                                 &lt;element name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
 *                                                 &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                               &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NotifyContract" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyContract"/&gt;
 *                             &lt;element name="NotifyTypes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NotifyType" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ReportPubs" type="{http://schemas.radixware.org/reports.xsd}ReportPubTopic"/&gt;
 *                             &lt;element name="StatementVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *                             &lt;element name="UserAttrsVal" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues"/&gt;
 *                             &lt;element name="PersonAuthQAs"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DigitizedCards"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="StatusTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Doers"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Doer" type="{http://schemas.tranzaxis.com/doer-types.xsd}Doer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PrevTrans"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PrevTran" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs"&gt;
 *                                               &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InvoiceItems"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="InvoiceItem" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TokenAliases"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TokenAlias" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranCustInfoKindEnum" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfoRs", propOrder = {
    "item"
})
@XmlSeeAlso({
    SelectTransResponse.class,
    CustInfoRs.Item.Attribute.PrevTrans.PrevTran.class
})
public class CustInfoRs {

    @XmlElement(name = "Item")
    protected List<CustInfoRs.Item> item;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustInfoRs.Item }
     * 
     * 
     */
    public List<CustInfoRs.Item> getItem() {
        if (item == null) {
            item = new ArrayList<CustInfoRs.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Attribute" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice minOccurs="0"&gt;
     *                   &lt;element name="StrVal" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="IntVal" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
     *                   &lt;element name="NumVal" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
     *                   &lt;element name="BoolVal" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
     *                   &lt;element name="DateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
     *                   &lt;element name="BinVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
     *                   &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="ArrStrVal" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="ArrIntVal" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="ArrNumVal" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="ArrBoolVal" type="{http://schemas.radixware.org/types.xsd}Bool" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="ArrDateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat"/&gt;
     *                   &lt;element name="PaymentTemplate" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings"/&gt;
     *                   &lt;element name="PaymentParams"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                                       &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                                       &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                                       &lt;element name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
     *                                       &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                                     &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NotifyContract" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyContract"/&gt;
     *                   &lt;element name="NotifyTypes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NotifyType" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ReportPubs" type="{http://schemas.radixware.org/reports.xsd}ReportPubTopic"/&gt;
     *                   &lt;element name="StatementVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
     *                   &lt;element name="UserAttrsVal" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues"/&gt;
     *                   &lt;element name="PersonAuthQAs"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DigitizedCards"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="StatusTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Doers"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Doer" type="{http://schemas.tranzaxis.com/doer-types.xsd}Doer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PrevTrans"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PrevTran" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs"&gt;
     *                                     &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="InvoiceItems"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="InvoiceItem" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TokenAliases"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TokenAlias" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranCustInfoKindEnum" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class Item {

        @XmlElement(name = "Attribute", required = true)
        protected List<CustInfoRs.Item.Attribute> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustInfoRs.Item.Attribute }
         * 
         * 
         */
        public List<CustInfoRs.Item.Attribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<CustInfoRs.Item.Attribute>();
            }
            return this.attribute;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice minOccurs="0"&gt;
         *         &lt;element name="StrVal" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="IntVal" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
         *         &lt;element name="NumVal" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
         *         &lt;element name="BoolVal" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
         *         &lt;element name="DateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
         *         &lt;element name="BinVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
         *         &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="ArrStrVal" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded"/&gt;
         *         &lt;element name="ArrIntVal" type="{http://schemas.radixware.org/types.xsd}Int" maxOccurs="unbounded"/&gt;
         *         &lt;element name="ArrNumVal" type="{http://schemas.radixware.org/types.xsd}Num" maxOccurs="unbounded"/&gt;
         *         &lt;element name="ArrBoolVal" type="{http://schemas.radixware.org/types.xsd}Bool" maxOccurs="unbounded"/&gt;
         *         &lt;element name="ArrDateTimeVal" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded"/&gt;
         *         &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat"/&gt;
         *         &lt;element name="PaymentTemplate" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings"/&gt;
         *         &lt;element name="PaymentParams"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                             &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                             &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                             &lt;element name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
         *                             &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                           &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NotifyContract" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyContract"/&gt;
         *         &lt;element name="NotifyTypes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NotifyType" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ReportPubs" type="{http://schemas.radixware.org/reports.xsd}ReportPubTopic"/&gt;
         *         &lt;element name="StatementVal" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
         *         &lt;element name="UserAttrsVal" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues"/&gt;
         *         &lt;element name="PersonAuthQAs"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DigitizedCards"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="StatusTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Doers"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Doer" type="{http://schemas.tranzaxis.com/doer-types.xsd}Doer" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PrevTrans"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PrevTran" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs"&gt;
         *                           &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="InvoiceItems"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="InvoiceItem" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TokenAliases"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TokenAlias" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranCustInfoKindEnum" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "strVal",
            "intVal",
            "numVal",
            "boolVal",
            "dateTimeVal",
            "binVal",
            "xmlVal",
            "arrStrVal",
            "arrIntVal",
            "arrNumVal",
            "arrBoolVal",
            "arrDateTimeVal",
            "inputFormat",
            "paymentTemplate",
            "paymentParams",
            "notifyContract",
            "notifyTypes",
            "reportPubs",
            "statementVal",
            "userAttrsVal",
            "personAuthQAs",
            "digitizedCards",
            "doers",
            "prevTrans",
            "invoiceItems",
            "tokenAliases"
        })
        public static class Attribute {

            @XmlElement(name = "StrVal")
            protected String strVal;
            @XmlElement(name = "IntVal")
            protected Long intVal;
            @XmlElement(name = "NumVal")
            protected BigDecimal numVal;
            @XmlElement(name = "BoolVal")
            protected Boolean boolVal;
            @XmlElement(name = "DateTimeVal")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTimeVal;
            @XmlElement(name = "BinVal")
            protected byte[] binVal;
            @XmlElement(name = "XmlVal")
            protected Object xmlVal;
            @XmlElement(name = "ArrStrVal")
            protected List<String> arrStrVal;
            @XmlElement(name = "ArrIntVal", type = Long.class)
            protected List<Long> arrIntVal;
            @XmlElement(name = "ArrNumVal")
            protected List<BigDecimal> arrNumVal;
            @XmlElement(name = "ArrBoolVal", type = Boolean.class)
            protected List<Boolean> arrBoolVal;
            @XmlElement(name = "ArrDateTimeVal")
            @XmlSchemaType(name = "dateTime")
            protected List<XMLGregorianCalendar> arrDateTimeVal;
            @XmlElement(name = "InputFormat")
            protected InputFormat inputFormat;
            @XmlElement(name = "PaymentTemplate")
            protected PaymentTemplateSettings paymentTemplate;
            @XmlElement(name = "PaymentParams")
            protected CustInfoRs.Item.Attribute.PaymentParams paymentParams;
            @XmlElement(name = "NotifyContract")
            protected NotifyContract notifyContract;
            @XmlElement(name = "NotifyTypes")
            protected CustInfoRs.Item.Attribute.NotifyTypes notifyTypes;
            @XmlElement(name = "ReportPubs")
            protected ReportPubTopic reportPubs;
            @XmlElement(name = "StatementVal")
            protected byte[] statementVal;
            @XmlElement(name = "UserAttrsVal")
            protected ParamValues userAttrsVal;
            @XmlElement(name = "PersonAuthQAs")
            protected CustInfoRs.Item.Attribute.PersonAuthQAs personAuthQAs;
            @XmlElement(name = "DigitizedCards")
            protected CustInfoRs.Item.Attribute.DigitizedCards digitizedCards;
            @XmlElement(name = "Doers")
            protected CustInfoRs.Item.Attribute.Doers doers;
            @XmlElement(name = "PrevTrans")
            protected CustInfoRs.Item.Attribute.PrevTrans prevTrans;
            @XmlElement(name = "InvoiceItems")
            protected CustInfoRs.Item.Attribute.InvoiceItems invoiceItems;
            @XmlElement(name = "TokenAliases")
            protected CustInfoRs.Item.Attribute.TokenAliases tokenAliases;
            @XmlAttribute(name = "Kind", required = true)
            protected String kind;

            /**
             * Gets the value of the strVal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStrVal() {
                return strVal;
            }

            /**
             * Sets the value of the strVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStrVal(String value) {
                this.strVal = value;
            }

            /**
             * Gets the value of the intVal property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIntVal() {
                return intVal;
            }

            /**
             * Sets the value of the intVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIntVal(Long value) {
                this.intVal = value;
            }

            /**
             * Gets the value of the numVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumVal() {
                return numVal;
            }

            /**
             * Sets the value of the numVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumVal(BigDecimal value) {
                this.numVal = value;
            }

            /**
             * Gets the value of the boolVal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBoolVal() {
                return boolVal;
            }

            /**
             * Sets the value of the boolVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBoolVal(Boolean value) {
                this.boolVal = value;
            }

            /**
             * Gets the value of the dateTimeVal property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTimeVal() {
                return dateTimeVal;
            }

            /**
             * Sets the value of the dateTimeVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTimeVal(XMLGregorianCalendar value) {
                this.dateTimeVal = value;
            }

            /**
             * Gets the value of the binVal property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getBinVal() {
                return binVal;
            }

            /**
             * Sets the value of the binVal property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setBinVal(byte[] value) {
                this.binVal = value;
            }

            /**
             * Gets the value of the xmlVal property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getXmlVal() {
                return xmlVal;
            }

            /**
             * Sets the value of the xmlVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setXmlVal(Object value) {
                this.xmlVal = value;
            }

            /**
             * Gets the value of the arrStrVal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrStrVal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrStrVal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getArrStrVal() {
                if (arrStrVal == null) {
                    arrStrVal = new ArrayList<String>();
                }
                return this.arrStrVal;
            }

            /**
             * Gets the value of the arrIntVal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrIntVal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrIntVal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getArrIntVal() {
                if (arrIntVal == null) {
                    arrIntVal = new ArrayList<Long>();
                }
                return this.arrIntVal;
            }

            /**
             * Gets the value of the arrNumVal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrNumVal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrNumVal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigDecimal }
             * 
             * 
             */
            public List<BigDecimal> getArrNumVal() {
                if (arrNumVal == null) {
                    arrNumVal = new ArrayList<BigDecimal>();
                }
                return this.arrNumVal;
            }

            /**
             * Gets the value of the arrBoolVal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrBoolVal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrBoolVal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            public List<Boolean> getArrBoolVal() {
                if (arrBoolVal == null) {
                    arrBoolVal = new ArrayList<Boolean>();
                }
                return this.arrBoolVal;
            }

            /**
             * Gets the value of the arrDateTimeVal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the arrDateTimeVal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArrDateTimeVal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XMLGregorianCalendar }
             * 
             * 
             */
            public List<XMLGregorianCalendar> getArrDateTimeVal() {
                if (arrDateTimeVal == null) {
                    arrDateTimeVal = new ArrayList<XMLGregorianCalendar>();
                }
                return this.arrDateTimeVal;
            }

            /**
             * Gets the value of the inputFormat property.
             * 
             * @return
             *     possible object is
             *     {@link InputFormat }
             *     
             */
            public InputFormat getInputFormat() {
                return inputFormat;
            }

            /**
             * Sets the value of the inputFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link InputFormat }
             *     
             */
            public void setInputFormat(InputFormat value) {
                this.inputFormat = value;
            }

            /**
             * Gets the value of the paymentTemplate property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentTemplateSettings }
             *     
             */
            public PaymentTemplateSettings getPaymentTemplate() {
                return paymentTemplate;
            }

            /**
             * Sets the value of the paymentTemplate property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentTemplateSettings }
             *     
             */
            public void setPaymentTemplate(PaymentTemplateSettings value) {
                this.paymentTemplate = value;
            }

            /**
             * Gets the value of the paymentParams property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.PaymentParams }
             *     
             */
            public CustInfoRs.Item.Attribute.PaymentParams getPaymentParams() {
                return paymentParams;
            }

            /**
             * Sets the value of the paymentParams property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.PaymentParams }
             *     
             */
            public void setPaymentParams(CustInfoRs.Item.Attribute.PaymentParams value) {
                this.paymentParams = value;
            }

            /**
             * Gets the value of the notifyContract property.
             * 
             * @return
             *     possible object is
             *     {@link NotifyContract }
             *     
             */
            public NotifyContract getNotifyContract() {
                return notifyContract;
            }

            /**
             * Sets the value of the notifyContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotifyContract }
             *     
             */
            public void setNotifyContract(NotifyContract value) {
                this.notifyContract = value;
            }

            /**
             * Gets the value of the notifyTypes property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.NotifyTypes }
             *     
             */
            public CustInfoRs.Item.Attribute.NotifyTypes getNotifyTypes() {
                return notifyTypes;
            }

            /**
             * Sets the value of the notifyTypes property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.NotifyTypes }
             *     
             */
            public void setNotifyTypes(CustInfoRs.Item.Attribute.NotifyTypes value) {
                this.notifyTypes = value;
            }

            /**
             * Gets the value of the reportPubs property.
             * 
             * @return
             *     possible object is
             *     {@link ReportPubTopic }
             *     
             */
            public ReportPubTopic getReportPubs() {
                return reportPubs;
            }

            /**
             * Sets the value of the reportPubs property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportPubTopic }
             *     
             */
            public void setReportPubs(ReportPubTopic value) {
                this.reportPubs = value;
            }

            /**
             * Gets the value of the statementVal property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getStatementVal() {
                return statementVal;
            }

            /**
             * Sets the value of the statementVal property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setStatementVal(byte[] value) {
                this.statementVal = value;
            }

            /**
             * Gets the value of the userAttrsVal property.
             * 
             * @return
             *     possible object is
             *     {@link ParamValues }
             *     
             */
            public ParamValues getUserAttrsVal() {
                return userAttrsVal;
            }

            /**
             * Sets the value of the userAttrsVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParamValues }
             *     
             */
            public void setUserAttrsVal(ParamValues value) {
                this.userAttrsVal = value;
            }

            /**
             * Gets the value of the personAuthQAs property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.PersonAuthQAs }
             *     
             */
            public CustInfoRs.Item.Attribute.PersonAuthQAs getPersonAuthQAs() {
                return personAuthQAs;
            }

            /**
             * Sets the value of the personAuthQAs property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.PersonAuthQAs }
             *     
             */
            public void setPersonAuthQAs(CustInfoRs.Item.Attribute.PersonAuthQAs value) {
                this.personAuthQAs = value;
            }

            /**
             * Gets the value of the digitizedCards property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.DigitizedCards }
             *     
             */
            public CustInfoRs.Item.Attribute.DigitizedCards getDigitizedCards() {
                return digitizedCards;
            }

            /**
             * Sets the value of the digitizedCards property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.DigitizedCards }
             *     
             */
            public void setDigitizedCards(CustInfoRs.Item.Attribute.DigitizedCards value) {
                this.digitizedCards = value;
            }

            /**
             * Gets the value of the doers property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.Doers }
             *     
             */
            public CustInfoRs.Item.Attribute.Doers getDoers() {
                return doers;
            }

            /**
             * Sets the value of the doers property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.Doers }
             *     
             */
            public void setDoers(CustInfoRs.Item.Attribute.Doers value) {
                this.doers = value;
            }

            /**
             * Gets the value of the prevTrans property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.PrevTrans }
             *     
             */
            public CustInfoRs.Item.Attribute.PrevTrans getPrevTrans() {
                return prevTrans;
            }

            /**
             * Sets the value of the prevTrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.PrevTrans }
             *     
             */
            public void setPrevTrans(CustInfoRs.Item.Attribute.PrevTrans value) {
                this.prevTrans = value;
            }

            /**
             * Gets the value of the invoiceItems property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.InvoiceItems }
             *     
             */
            public CustInfoRs.Item.Attribute.InvoiceItems getInvoiceItems() {
                return invoiceItems;
            }

            /**
             * Sets the value of the invoiceItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.InvoiceItems }
             *     
             */
            public void setInvoiceItems(CustInfoRs.Item.Attribute.InvoiceItems value) {
                this.invoiceItems = value;
            }

            /**
             * Gets the value of the tokenAliases property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfoRs.Item.Attribute.TokenAliases }
             *     
             */
            public CustInfoRs.Item.Attribute.TokenAliases getTokenAliases() {
                return tokenAliases;
            }

            /**
             * Sets the value of the tokenAliases property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfoRs.Item.Attribute.TokenAliases }
             *     
             */
            public void setTokenAliases(CustInfoRs.Item.Attribute.TokenAliases value) {
                this.tokenAliases = value;
            }

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind(String value) {
                this.kind = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="StatusTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "digitizedCard"
            })
            public static class DigitizedCards {

                @XmlElement(name = "DigitizedCard")
                protected List<CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard> digitizedCard;

                /**
                 * Gets the value of the digitizedCard property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the digitizedCard property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDigitizedCard().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard }
                 * 
                 * 
                 */
                public List<CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard> getDigitizedCard() {
                    if (digitizedCard == null) {
                        digitizedCard = new ArrayList<CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard>();
                    }
                    return this.digitizedCard;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="StatusTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "statusTitle"
                })
                public static class DigitizedCard
                    extends com.tranzaxis.schemas.digitized_card.DigitizedCard
                {

                    @XmlElement(name = "StatusTitle")
                    protected String statusTitle;

                    /**
                     * Gets the value of the statusTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatusTitle() {
                        return statusTitle;
                    }

                    /**
                     * Sets the value of the statusTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatusTitle(String value) {
                        this.statusTitle = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Doer" type="{http://schemas.tranzaxis.com/doer-types.xsd}Doer" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "doer"
            })
            public static class Doers {

                @XmlElement(name = "Doer")
                protected List<Doer> doer;

                /**
                 * Gets the value of the doer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the doer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDoer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Doer }
                 * 
                 * 
                 */
                public List<Doer> getDoer() {
                    if (doer == null) {
                        doer = new ArrayList<Doer>();
                    }
                    return this.doer;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="InvoiceItem" type="{http://schemas.tranzaxis.com/tran-common.xsd}InvoiceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "invoiceItem"
            })
            public static class InvoiceItems {

                @XmlElement(name = "InvoiceItem")
                protected List<InvoiceItem> invoiceItem;

                /**
                 * Gets the value of the invoiceItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the invoiceItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInvoiceItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InvoiceItem }
                 * 
                 * 
                 */
                public List<InvoiceItem> getInvoiceItem() {
                    if (invoiceItem == null) {
                        invoiceItem = new ArrayList<InvoiceItem>();
                    }
                    return this.invoiceItem;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="NotifyType" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "notifyType"
            })
            public static class NotifyTypes {

                @XmlElement(name = "NotifyType")
                protected List<NotifyType> notifyType;

                /**
                 * Gets the value of the notifyType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the notifyType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNotifyType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NotifyType }
                 * 
                 * 
                 */
                public List<NotifyType> getNotifyType() {
                    if (notifyType == null) {
                        notifyType = new ArrayList<NotifyType>();
                    }
                    return this.notifyType;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *                   &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *                   &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *                   &lt;element name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
             *                   &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *                 &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param"
            })
            public static class PaymentParams {

                @XmlElement(name = "Param")
                protected List<CustInfoRs.Item.Attribute.PaymentParams.Param> param;

                /**
                 * Gets the value of the param property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the param property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParam().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CustInfoRs.Item.Attribute.PaymentParams.Param }
                 * 
                 * 
                 */
                public List<CustInfoRs.Item.Attribute.PaymentParams.Param> getParam() {
                    if (param == null) {
                        param = new ArrayList<CustInfoRs.Item.Attribute.PaymentParams.Param>();
                    }
                    return this.param;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
                 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
                 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
                 *         &lt;element name="Format" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
                 *         &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
                 *       &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "val",
                    "title",
                    "description",
                    "format",
                    "group"
                })
                public static class Param {

                    @XmlElement(name = "Val")
                    protected String val;
                    @XmlElement(name = "Title")
                    protected String title;
                    @XmlElement(name = "Description")
                    protected String description;
                    @XmlElement(name = "Format")
                    protected InputFormat format;
                    @XmlElement(name = "Group")
                    protected String group;
                    @XmlAttribute(name = "Rid", required = true)
                    protected String rid;
                    @XmlAttribute(name = "IsHidden")
                    protected Boolean isHidden;

                    /**
                     * Gets the value of the val property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVal() {
                        return val;
                    }

                    /**
                     * Sets the value of the val property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVal(String value) {
                        this.val = value;
                    }

                    /**
                     * Gets the value of the title property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Sets the value of the title property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Gets the value of the format property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InputFormat }
                     *     
                     */
                    public InputFormat getFormat() {
                        return format;
                    }

                    /**
                     * Sets the value of the format property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InputFormat }
                     *     
                     */
                    public void setFormat(InputFormat value) {
                        this.format = value;
                    }

                    /**
                     * Gets the value of the group property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGroup() {
                        return group;
                    }

                    /**
                     * Sets the value of the group property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGroup(String value) {
                        this.group = value;
                    }

                    /**
                     * Gets the value of the rid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRid() {
                        return rid;
                    }

                    /**
                     * Sets the value of the rid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRid(String value) {
                        this.rid = value;
                    }

                    /**
                     * Gets the value of the isHidden property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public boolean isIsHidden() {
                        if (isHidden == null) {
                            return false;
                        } else {
                            return isHidden;
                        }
                    }

                    /**
                     * Sets the value of the isHidden property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsHidden(Boolean value) {
                        this.isHidden = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="PersonAuthQA" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonAuthQA" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "personAuthQA"
            })
            public static class PersonAuthQAs {

                @XmlElement(name = "PersonAuthQA")
                protected List<PersonAuthQA> personAuthQA;

                /**
                 * Gets the value of the personAuthQA property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the personAuthQA property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPersonAuthQA().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PersonAuthQA }
                 * 
                 * 
                 */
                public List<PersonAuthQA> getPersonAuthQA() {
                    if (personAuthQA == null) {
                        personAuthQA = new ArrayList<PersonAuthQA>();
                    }
                    return this.personAuthQA;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="PrevTran" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs"&gt;
             *                 &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "prevTran"
            })
            public static class PrevTrans {

                @XmlElement(name = "PrevTran")
                protected List<CustInfoRs.Item.Attribute.PrevTrans.PrevTran> prevTran;

                /**
                 * Gets the value of the prevTran property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the prevTran property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPrevTran().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CustInfoRs.Item.Attribute.PrevTrans.PrevTran }
                 * 
                 * 
                 */
                public List<CustInfoRs.Item.Attribute.PrevTrans.PrevTran> getPrevTran() {
                    if (prevTran == null) {
                        prevTran = new ArrayList<CustInfoRs.Item.Attribute.PrevTrans.PrevTran>();
                    }
                    return this.prevTran;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRs"&gt;
                 *       &lt;attribute name="LinkKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranLinkKindEnum" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PrevTran
                    extends CustInfoRs
                {

                    @XmlAttribute(name = "LinkKind", required = true)
                    protected String linkKind;

                    /**
                     * Gets the value of the linkKind property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLinkKind() {
                        return linkKind;
                    }

                    /**
                     * Sets the value of the linkKind property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLinkKind(String value) {
                        this.linkKind = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="TokenAlias" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tokenAlias"
            })
            public static class TokenAliases {

                @XmlElement(name = "TokenAlias")
                protected List<CustInfoRs.Item.Attribute.TokenAliases.TokenAlias> tokenAlias;

                /**
                 * Gets the value of the tokenAlias property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tokenAlias property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTokenAlias().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CustInfoRs.Item.Attribute.TokenAliases.TokenAlias }
                 * 
                 * 
                 */
                public List<CustInfoRs.Item.Attribute.TokenAliases.TokenAlias> getTokenAlias() {
                    if (tokenAlias == null) {
                        tokenAlias = new ArrayList<CustInfoRs.Item.Attribute.TokenAliases.TokenAlias>();
                    }
                    return this.tokenAlias;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-alias.xsd}TokenAlias"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "inUse"
                })
                public static class TokenAlias
                    extends com.tranzaxis.schemas.tokens_alias.TokenAlias
                {

                    @XmlElement(name = "InUse")
                    protected Boolean inUse;

                    /**
                     * Gets the value of the inUse property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isInUse() {
                        return inUse;
                    }

                    /**
                     * Sets the value of the inUse property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setInUse(Boolean value) {
                        this.inUse = value;
                    }

                }

            }

        }

    }

}
