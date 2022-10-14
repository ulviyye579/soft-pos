
package com.tranzaxis.schemas.acquiring_admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ObjectGuid;
import com.tranzaxis.schemas.common_types.ObjectId;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.rc_admin.RcMoratoriums;
import com.tranzaxis.schemas.restricting_admin.Restrictions;
import com.tranzaxis.schemas.tran_common.WriteoffReconDiff;


/**
 * <p>Java class for Terminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Terminal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TermType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InstCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}CharEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastStatusChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastStatusChangeDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="RiskLevel" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultLanguage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://schemas.tranzaxis.com/common-types.xsd}MailAddress" minOccurs="0"/&gt;
 *         &lt;element name="ClientAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LocationDesc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LocationKind" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AreaKind" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClientAccessibility" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviceModel" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceNumber" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeviceStatus" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DeviceStatus" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TimeOffset" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="StationName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AccessSchedule" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Adapter" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Branch" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}BranchId" minOccurs="0"/&gt;
 *         &lt;element name="CashProfile" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="CassetteSet" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Config" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Contract" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="IndicationScheme" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectGuid" minOccurs="0"/&gt;
 *         &lt;element name="OperList" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectGuid" minOccurs="0"/&gt;
 *         &lt;element name="RateGroup" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="RiskProfile" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeTariffPlan" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectGuid" minOccurs="0"/&gt;
 *         &lt;element name="Channels" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}Channels" minOccurs="0"/&gt;
 *         &lt;element name="TraceProfile" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LogMessages" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="OperDayVariant" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecvTimeout" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTimeout" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TranCompletionTimeout" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InactivityPeriod" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MaxCommandAttemps" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LastStan" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LastRqTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastRespTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastOnlineRrn" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastOfflineRrn" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LastOnlineTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LastOfflineTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RefillCycleId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ClosingPeriod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurBatchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PrevBatchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LastOperAcked" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="MacErrorCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CurCfgTimestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="NewCfgTimestamp" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastDispenseAlgo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AwakePortAddress" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CapsProtected" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ExtCutoverWindow" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Inherited" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                 &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtCutoverFinishTime" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Inherited" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                 &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Accounts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran-common.xsd}RegisterRoleEnum" /&gt;
 *                           &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Denomination" type="{http://schemas.radixware.org/types.xsd}Num" default="0" /&gt;
 *                           &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" default="-" /&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Balance" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="IsCreated" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Keys" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pmk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKey" minOccurs="0"/&gt;
 *                   &lt;element name="Pwk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKey" minOccurs="0"/&gt;
 *                   &lt;element name="Mmk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
 *                   &lt;element name="Mwk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
 *                   &lt;element name="Emk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
 *                   &lt;element name="Ewk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
 *                   &lt;element name="Rkl" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}RsaKey" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="NetworkSpecifics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NetworkSpecific" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MccId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *                             &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="NetworkId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RcMoratoriums" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcMoratoriums" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" type="{http://schemas.tranzaxis.com/restricting-admin.xsd}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RefillCycle" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}RefillCycle" minOccurs="0"/&gt;
 *         &lt;element name="WriteoffDiffs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}WriteoffReconDiff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WriteoffTerm" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *                   &lt;element name="WriteoffAcct" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PrototypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PrototypeExternalRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal", propOrder = {
    "classGuid",
    "termType",
    "instName",
    "externalRid",
    "instCode",
    "status",
    "title",
    "notes",
    "createTime",
    "createDay",
    "activateTime",
    "activateDay",
    "lastStatusChangeTime",
    "lastStatusChangeDay",
    "riskLevel",
    "defaultCcy",
    "defaultLanguage",
    "address",
    "clientAddress",
    "locationDesc",
    "locationKind",
    "areaKind",
    "clientAccessibility",
    "deviceModel",
    "deviceNumber",
    "deviceId",
    "deviceStatus",
    "timeZone",
    "timeOffset",
    "stationName",
    "accessSchedule",
    "adapter",
    "branch",
    "cashProfile",
    "cassetteSet",
    "config",
    "contract",
    "indicationScheme",
    "operList",
    "rateGroup",
    "riskProfile",
    "settings",
    "surchargeTariffPlan",
    "channels",
    "traceProfile",
    "logMessages",
    "operDayVariant",
    "curOperDay",
    "recvTimeout",
    "customerTimeout",
    "tranCompletionTimeout",
    "inactivityPeriod",
    "maxCommandAttemps",
    "lastStan",
    "lastRqTime",
    "lastRespTime",
    "lastOnlineRrn",
    "lastOfflineRrn",
    "lastOnlineTranId",
    "lastOfflineTranId",
    "refillCycleId",
    "closingPeriod",
    "curBatchId",
    "prevBatchId",
    "lastOperAcked",
    "macErrorCnt",
    "curCfgTimestamp",
    "newCfgTimestamp",
    "lastDispenseAlgo",
    "awakePortAddress",
    "capsProtected",
    "extCutoverWindow",
    "extCutoverFinishTime",
    "accounts",
    "keys",
    "userAttrs",
    "networkSpecifics",
    "rcMoratoriums",
    "restrictions",
    "ext",
    "refillCycle",
    "writeoffDiffs"
})
public class Terminal {

    @XmlElement(name = "ClassGuid")
    protected String classGuid;
    @XmlElement(name = "TermType")
    protected String termType;
    @XmlElement(name = "InstName")
    protected String instName;
    @XmlElementRef(name = "ExternalRid", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalRid;
    @XmlElementRef(name = "InstCode", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> instCode;
    @XmlElement(name = "Status", defaultValue = "N")
    protected String status;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDay;
    @XmlElementRef(name = "ActivateTime", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateTime;
    @XmlElementRef(name = "ActivateDay", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateDay;
    @XmlElementRef(name = "LastStatusChangeTime", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastStatusChangeTime;
    @XmlElementRef(name = "LastStatusChangeDay", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastStatusChangeDay;
    @XmlElementRef(name = "RiskLevel", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevel;
    @XmlElementRef(name = "DefaultCcy", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultCcy;
    @XmlElementRef(name = "DefaultLanguage", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultLanguage;
    @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MailAddress> address;
    @XmlElementRef(name = "ClientAddress", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientAddress;
    @XmlElementRef(name = "LocationDesc", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDesc;
    @XmlElementRef(name = "LocationKind", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationKind;
    @XmlElementRef(name = "AreaKind", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> areaKind;
    @XmlElementRef(name = "ClientAccessibility", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientAccessibility;
    @XmlElementRef(name = "DeviceModel", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deviceModel;
    @XmlElementRef(name = "DeviceNumber", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deviceNumber;
    @XmlElementRef(name = "DeviceId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deviceId;
    @XmlElement(name = "DeviceStatus")
    protected String deviceStatus;
    @XmlElementRef(name = "TimeZone", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZone;
    @XmlElementRef(name = "TimeOffset", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> timeOffset;
    @XmlElementRef(name = "StationName", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stationName;
    @XmlElementRef(name = "AccessSchedule", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> accessSchedule;
    @XmlElementRef(name = "Adapter", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> adapter;
    @XmlElementRef(name = "Branch", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BranchId> branch;
    @XmlElementRef(name = "CashProfile", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> cashProfile;
    @XmlElementRef(name = "CassetteSet", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> cassetteSet;
    @XmlElementRef(name = "Config", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> config;
    @XmlElementRef(name = "Contract", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> contract;
    @XmlElementRef(name = "IndicationScheme", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectGuid> indicationScheme;
    @XmlElementRef(name = "OperList", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectGuid> operList;
    @XmlElementRef(name = "RateGroup", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> rateGroup;
    @XmlElementRef(name = "RiskProfile", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> riskProfile;
    @XmlElementRef(name = "Settings", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectId> settings;
    @XmlElementRef(name = "SurchargeTariffPlan", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectGuid> surchargeTariffPlan;
    @XmlElementRef(name = "Channels", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Channels> channels;
    @XmlElementRef(name = "TraceProfile", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traceProfile;
    @XmlElement(name = "LogMessages")
    protected Boolean logMessages;
    @XmlElementRef(name = "OperDayVariant", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> operDayVariant;
    @XmlElementRef(name = "CurOperDay", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> curOperDay;
    @XmlElementRef(name = "RecvTimeout", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> recvTimeout;
    @XmlElementRef(name = "CustomerTimeout", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customerTimeout;
    @XmlElementRef(name = "TranCompletionTimeout", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tranCompletionTimeout;
    @XmlElementRef(name = "InactivityPeriod", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inactivityPeriod;
    @XmlElementRef(name = "MaxCommandAttemps", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maxCommandAttemps;
    @XmlElementRef(name = "LastStan", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lastStan;
    @XmlElementRef(name = "LastRqTime", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastRqTime;
    @XmlElementRef(name = "LastRespTime", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastRespTime;
    @XmlElementRef(name = "LastOnlineRrn", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastOnlineRrn;
    @XmlElementRef(name = "LastOfflineRrn", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastOfflineRrn;
    @XmlElementRef(name = "LastOnlineTranId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lastOnlineTranId;
    @XmlElementRef(name = "LastOfflineTranId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lastOfflineTranId;
    @XmlElementRef(name = "RefillCycleId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> refillCycleId;
    @XmlElement(name = "ClosingPeriod")
    protected String closingPeriod;
    @XmlElementRef(name = "CurBatchId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> curBatchId;
    @XmlElementRef(name = "PrevBatchId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prevBatchId;
    @XmlElement(name = "LastOperAcked")
    protected Boolean lastOperAcked;
    @XmlElement(name = "MacErrorCnt")
    protected Long macErrorCnt;
    @XmlElementRef(name = "CurCfgTimestamp", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> curCfgTimestamp;
    @XmlElementRef(name = "NewCfgTimestamp", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> newCfgTimestamp;
    @XmlElement(name = "LastDispenseAlgo")
    protected String lastDispenseAlgo;
    @XmlElementRef(name = "AwakePortAddress", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awakePortAddress;
    @XmlElementRef(name = "CapsProtected", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capsProtected;
    @XmlElement(name = "ExtCutoverWindow")
    protected Terminal.ExtCutoverWindow extCutoverWindow;
    @XmlElement(name = "ExtCutoverFinishTime")
    protected Terminal.ExtCutoverFinishTime extCutoverFinishTime;
    @XmlElement(name = "Accounts")
    protected Terminal.Accounts accounts;
    @XmlElement(name = "Keys")
    protected Terminal.Keys keys;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "NetworkSpecifics")
    protected Terminal.NetworkSpecifics networkSpecifics;
    @XmlElement(name = "RcMoratoriums")
    protected RcMoratoriums rcMoratoriums;
    @XmlElement(name = "Restrictions")
    protected Restrictions restrictions;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlElement(name = "RefillCycle")
    protected RefillCycle refillCycle;
    @XmlElement(name = "WriteoffDiffs")
    protected Terminal.WriteoffDiffs writeoffDiffs;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "PrototypeId")
    protected Long prototypeId;
    @XmlAttribute(name = "PrototypeExternalRid")
    protected String prototypeExternalRid;

    /**
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * Gets the value of the externalRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalRid() {
        return externalRid;
    }

    /**
     * Sets the value of the externalRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalRid(JAXBElement<String> value) {
        this.externalRid = value;
    }

    /**
     * Gets the value of the instCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInstCode() {
        return instCode;
    }

    /**
     * Sets the value of the instCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInstCode(JAXBElement<Long> value) {
        this.instCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDay() {
        return createDay;
    }

    /**
     * Sets the value of the createDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDay(XMLGregorianCalendar value) {
        this.createDay = value;
    }

    /**
     * Gets the value of the activateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateTime() {
        return activateTime;
    }

    /**
     * Sets the value of the activateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.activateTime = value;
    }

    /**
     * Gets the value of the activateDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateDay() {
        return activateDay;
    }

    /**
     * Sets the value of the activateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateDay(JAXBElement<XMLGregorianCalendar> value) {
        this.activateDay = value;
    }

    /**
     * Gets the value of the lastStatusChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastStatusChangeTime() {
        return lastStatusChangeTime;
    }

    /**
     * Sets the value of the lastStatusChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastStatusChangeTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastStatusChangeTime = value;
    }

    /**
     * Gets the value of the lastStatusChangeDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastStatusChangeDay() {
        return lastStatusChangeDay;
    }

    /**
     * Sets the value of the lastStatusChangeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastStatusChangeDay(JAXBElement<XMLGregorianCalendar> value) {
        this.lastStatusChangeDay = value;
    }

    /**
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRiskLevel(JAXBElement<Long> value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the defaultCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultCcy() {
        return defaultCcy;
    }

    /**
     * Sets the value of the defaultCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultCcy(JAXBElement<Long> value) {
        this.defaultCcy = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultLanguage(JAXBElement<String> value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public JAXBElement<MailAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<MailAddress> value) {
        this.address = value;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientAddress() {
        return clientAddress;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientAddress(JAXBElement<String> value) {
        this.clientAddress = value;
    }

    /**
     * Gets the value of the locationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDesc() {
        return locationDesc;
    }

    /**
     * Sets the value of the locationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDesc(JAXBElement<String> value) {
        this.locationDesc = value;
    }

    /**
     * Gets the value of the locationKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationKind() {
        return locationKind;
    }

    /**
     * Sets the value of the locationKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationKind(JAXBElement<String> value) {
        this.locationKind = value;
    }

    /**
     * Gets the value of the areaKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAreaKind() {
        return areaKind;
    }

    /**
     * Sets the value of the areaKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAreaKind(JAXBElement<String> value) {
        this.areaKind = value;
    }

    /**
     * Gets the value of the clientAccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientAccessibility() {
        return clientAccessibility;
    }

    /**
     * Sets the value of the clientAccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientAccessibility(JAXBElement<String> value) {
        this.clientAccessibility = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceModel(JAXBElement<String> value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the deviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceNumber() {
        return deviceNumber;
    }

    /**
     * Sets the value of the deviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceNumber(JAXBElement<String> value) {
        this.deviceNumber = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeviceId(JAXBElement<Long> value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceStatus(String value) {
        this.deviceStatus = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTimeOffset() {
        return timeOffset;
    }

    /**
     * Sets the value of the timeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTimeOffset(JAXBElement<Long> value) {
        this.timeOffset = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationName(JAXBElement<String> value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the accessSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getAccessSchedule() {
        return accessSchedule;
    }

    /**
     * Sets the value of the accessSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setAccessSchedule(JAXBElement<ObjectId> value) {
        this.accessSchedule = value;
    }

    /**
     * Gets the value of the adapter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getAdapter() {
        return adapter;
    }

    /**
     * Sets the value of the adapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setAdapter(JAXBElement<ObjectId> value) {
        this.adapter = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BranchId }{@code >}
     *     
     */
    public JAXBElement<BranchId> getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BranchId }{@code >}
     *     
     */
    public void setBranch(JAXBElement<BranchId> value) {
        this.branch = value;
    }

    /**
     * Gets the value of the cashProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getCashProfile() {
        return cashProfile;
    }

    /**
     * Sets the value of the cashProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setCashProfile(JAXBElement<ObjectId> value) {
        this.cashProfile = value;
    }

    /**
     * Gets the value of the cassetteSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getCassetteSet() {
        return cassetteSet;
    }

    /**
     * Sets the value of the cassetteSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setCassetteSet(JAXBElement<ObjectId> value) {
        this.cassetteSet = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setConfig(JAXBElement<ObjectId> value) {
        this.config = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setContract(JAXBElement<ObjectId> value) {
        this.contract = value;
    }

    /**
     * Gets the value of the indicationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public JAXBElement<ObjectGuid> getIndicationScheme() {
        return indicationScheme;
    }

    /**
     * Sets the value of the indicationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public void setIndicationScheme(JAXBElement<ObjectGuid> value) {
        this.indicationScheme = value;
    }

    /**
     * Gets the value of the operList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public JAXBElement<ObjectGuid> getOperList() {
        return operList;
    }

    /**
     * Sets the value of the operList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public void setOperList(JAXBElement<ObjectGuid> value) {
        this.operList = value;
    }

    /**
     * Gets the value of the rateGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getRateGroup() {
        return rateGroup;
    }

    /**
     * Sets the value of the rateGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setRateGroup(JAXBElement<ObjectId> value) {
        this.rateGroup = value;
    }

    /**
     * Gets the value of the riskProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getRiskProfile() {
        return riskProfile;
    }

    /**
     * Sets the value of the riskProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setRiskProfile(JAXBElement<ObjectId> value) {
        this.riskProfile = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public JAXBElement<ObjectId> getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectId }{@code >}
     *     
     */
    public void setSettings(JAXBElement<ObjectId> value) {
        this.settings = value;
    }

    /**
     * Gets the value of the surchargeTariffPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public JAXBElement<ObjectGuid> getSurchargeTariffPlan() {
        return surchargeTariffPlan;
    }

    /**
     * Sets the value of the surchargeTariffPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectGuid }{@code >}
     *     
     */
    public void setSurchargeTariffPlan(JAXBElement<ObjectGuid> value) {
        this.surchargeTariffPlan = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Channels }{@code >}
     *     
     */
    public JAXBElement<Channels> getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Channels }{@code >}
     *     
     */
    public void setChannels(JAXBElement<Channels> value) {
        this.channels = value;
    }

    /**
     * Gets the value of the traceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraceProfile() {
        return traceProfile;
    }

    /**
     * Sets the value of the traceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraceProfile(JAXBElement<String> value) {
        this.traceProfile = value;
    }

    /**
     * Gets the value of the logMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogMessages() {
        return logMessages;
    }

    /**
     * Sets the value of the logMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogMessages(Boolean value) {
        this.logMessages = value;
    }

    /**
     * Gets the value of the operDayVariant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOperDayVariant() {
        return operDayVariant;
    }

    /**
     * Sets the value of the operDayVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOperDayVariant(JAXBElement<Long> value) {
        this.operDayVariant = value;
    }

    /**
     * Gets the value of the curOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurOperDay() {
        return curOperDay;
    }

    /**
     * Sets the value of the curOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurOperDay(JAXBElement<XMLGregorianCalendar> value) {
        this.curOperDay = value;
    }

    /**
     * Gets the value of the recvTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecvTimeout() {
        return recvTimeout;
    }

    /**
     * Sets the value of the recvTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecvTimeout(JAXBElement<Long> value) {
        this.recvTimeout = value;
    }

    /**
     * Gets the value of the customerTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerTimeout() {
        return customerTimeout;
    }

    /**
     * Sets the value of the customerTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerTimeout(JAXBElement<Long> value) {
        this.customerTimeout = value;
    }

    /**
     * Gets the value of the tranCompletionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTranCompletionTimeout() {
        return tranCompletionTimeout;
    }

    /**
     * Sets the value of the tranCompletionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTranCompletionTimeout(JAXBElement<Long> value) {
        this.tranCompletionTimeout = value;
    }

    /**
     * Gets the value of the inactivityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInactivityPeriod() {
        return inactivityPeriod;
    }

    /**
     * Sets the value of the inactivityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInactivityPeriod(JAXBElement<Long> value) {
        this.inactivityPeriod = value;
    }

    /**
     * Gets the value of the maxCommandAttemps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaxCommandAttemps() {
        return maxCommandAttemps;
    }

    /**
     * Sets the value of the maxCommandAttemps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaxCommandAttemps(JAXBElement<Long> value) {
        this.maxCommandAttemps = value;
    }

    /**
     * Gets the value of the lastStan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLastStan() {
        return lastStan;
    }

    /**
     * Sets the value of the lastStan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLastStan(JAXBElement<Long> value) {
        this.lastStan = value;
    }

    /**
     * Gets the value of the lastRqTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastRqTime() {
        return lastRqTime;
    }

    /**
     * Sets the value of the lastRqTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastRqTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastRqTime = value;
    }

    /**
     * Gets the value of the lastRespTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastRespTime() {
        return lastRespTime;
    }

    /**
     * Sets the value of the lastRespTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastRespTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastRespTime = value;
    }

    /**
     * Gets the value of the lastOnlineRrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastOnlineRrn() {
        return lastOnlineRrn;
    }

    /**
     * Sets the value of the lastOnlineRrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastOnlineRrn(JAXBElement<String> value) {
        this.lastOnlineRrn = value;
    }

    /**
     * Gets the value of the lastOfflineRrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastOfflineRrn() {
        return lastOfflineRrn;
    }

    /**
     * Sets the value of the lastOfflineRrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastOfflineRrn(JAXBElement<String> value) {
        this.lastOfflineRrn = value;
    }

    /**
     * Gets the value of the lastOnlineTranId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLastOnlineTranId() {
        return lastOnlineTranId;
    }

    /**
     * Sets the value of the lastOnlineTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLastOnlineTranId(JAXBElement<Long> value) {
        this.lastOnlineTranId = value;
    }

    /**
     * Gets the value of the lastOfflineTranId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLastOfflineTranId() {
        return lastOfflineTranId;
    }

    /**
     * Sets the value of the lastOfflineTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLastOfflineTranId(JAXBElement<Long> value) {
        this.lastOfflineTranId = value;
    }

    /**
     * Gets the value of the refillCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRefillCycleId() {
        return refillCycleId;
    }

    /**
     * Sets the value of the refillCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRefillCycleId(JAXBElement<Long> value) {
        this.refillCycleId = value;
    }

    /**
     * Gets the value of the closingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingPeriod() {
        return closingPeriod;
    }

    /**
     * Sets the value of the closingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingPeriod(String value) {
        this.closingPeriod = value;
    }

    /**
     * Gets the value of the curBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurBatchId() {
        return curBatchId;
    }

    /**
     * Sets the value of the curBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurBatchId(JAXBElement<Long> value) {
        this.curBatchId = value;
    }

    /**
     * Gets the value of the prevBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrevBatchId() {
        return prevBatchId;
    }

    /**
     * Sets the value of the prevBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrevBatchId(JAXBElement<Long> value) {
        this.prevBatchId = value;
    }

    /**
     * Gets the value of the lastOperAcked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastOperAcked() {
        return lastOperAcked;
    }

    /**
     * Sets the value of the lastOperAcked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastOperAcked(Boolean value) {
        this.lastOperAcked = value;
    }

    /**
     * Gets the value of the macErrorCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMacErrorCnt() {
        return macErrorCnt;
    }

    /**
     * Sets the value of the macErrorCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMacErrorCnt(Long value) {
        this.macErrorCnt = value;
    }

    /**
     * Gets the value of the curCfgTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurCfgTimestamp() {
        return curCfgTimestamp;
    }

    /**
     * Sets the value of the curCfgTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurCfgTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.curCfgTimestamp = value;
    }

    /**
     * Gets the value of the newCfgTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNewCfgTimestamp() {
        return newCfgTimestamp;
    }

    /**
     * Sets the value of the newCfgTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNewCfgTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.newCfgTimestamp = value;
    }

    /**
     * Gets the value of the lastDispenseAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDispenseAlgo() {
        return lastDispenseAlgo;
    }

    /**
     * Sets the value of the lastDispenseAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDispenseAlgo(String value) {
        this.lastDispenseAlgo = value;
    }

    /**
     * Gets the value of the awakePortAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwakePortAddress() {
        return awakePortAddress;
    }

    /**
     * Sets the value of the awakePortAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwakePortAddress(JAXBElement<String> value) {
        this.awakePortAddress = value;
    }

    /**
     * Gets the value of the capsProtected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapsProtected() {
        return capsProtected;
    }

    /**
     * Sets the value of the capsProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapsProtected(JAXBElement<Boolean> value) {
        this.capsProtected = value;
    }

    /**
     * Gets the value of the extCutoverWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.ExtCutoverWindow }
     *     
     */
    public Terminal.ExtCutoverWindow getExtCutoverWindow() {
        return extCutoverWindow;
    }

    /**
     * Sets the value of the extCutoverWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.ExtCutoverWindow }
     *     
     */
    public void setExtCutoverWindow(Terminal.ExtCutoverWindow value) {
        this.extCutoverWindow = value;
    }

    /**
     * Gets the value of the extCutoverFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.ExtCutoverFinishTime }
     *     
     */
    public Terminal.ExtCutoverFinishTime getExtCutoverFinishTime() {
        return extCutoverFinishTime;
    }

    /**
     * Sets the value of the extCutoverFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.ExtCutoverFinishTime }
     *     
     */
    public void setExtCutoverFinishTime(Terminal.ExtCutoverFinishTime value) {
        this.extCutoverFinishTime = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.Accounts }
     *     
     */
    public Terminal.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.Accounts }
     *     
     */
    public void setAccounts(Terminal.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.Keys }
     *     
     */
    public Terminal.Keys getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.Keys }
     *     
     */
    public void setKeys(Terminal.Keys value) {
        this.keys = value;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the networkSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.NetworkSpecifics }
     *     
     */
    public Terminal.NetworkSpecifics getNetworkSpecifics() {
        return networkSpecifics;
    }

    /**
     * Sets the value of the networkSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.NetworkSpecifics }
     *     
     */
    public void setNetworkSpecifics(Terminal.NetworkSpecifics value) {
        this.networkSpecifics = value;
    }

    /**
     * Gets the value of the rcMoratoriums property.
     * 
     * @return
     *     possible object is
     *     {@link RcMoratoriums }
     *     
     */
    public RcMoratoriums getRcMoratoriums() {
        return rcMoratoriums;
    }

    /**
     * Sets the value of the rcMoratoriums property.
     * 
     * @param value
     *     allowed object is
     *     {@link RcMoratoriums }
     *     
     */
    public void setRcMoratoriums(RcMoratoriums value) {
        this.rcMoratoriums = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExt(Object value) {
        this.ext = value;
    }

    /**
     * Gets the value of the refillCycle property.
     * 
     * @return
     *     possible object is
     *     {@link RefillCycle }
     *     
     */
    public RefillCycle getRefillCycle() {
        return refillCycle;
    }

    /**
     * Sets the value of the refillCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefillCycle }
     *     
     */
    public void setRefillCycle(RefillCycle value) {
        this.refillCycle = value;
    }

    /**
     * Gets the value of the writeoffDiffs property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal.WriteoffDiffs }
     *     
     */
    public Terminal.WriteoffDiffs getWriteoffDiffs() {
        return writeoffDiffs;
    }

    /**
     * Sets the value of the writeoffDiffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal.WriteoffDiffs }
     *     
     */
    public void setWriteoffDiffs(Terminal.WriteoffDiffs value) {
        this.writeoffDiffs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the prototypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrototypeId() {
        return prototypeId;
    }

    /**
     * Sets the value of the prototypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrototypeId(Long value) {
        this.prototypeId = value;
    }

    /**
     * Gets the value of the prototypeExternalRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrototypeExternalRid() {
        return prototypeExternalRid;
    }

    /**
     * Sets the value of the prototypeExternalRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrototypeExternalRid(String value) {
        this.prototypeExternalRid = value;
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
     *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran-common.xsd}RegisterRoleEnum" /&gt;
     *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Denomination" type="{http://schemas.radixware.org/types.xsd}Num" default="0" /&gt;
     *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" default="-" /&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Balance" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="IsCreated" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
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
        "account"
    })
    public static class Accounts {

        @XmlElement(name = "Account")
        protected List<Terminal.Accounts.Account> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Terminal.Accounts.Account }
         * 
         * 
         */
        public List<Terminal.Accounts.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<Terminal.Accounts.Account>();
            }
            return this.account;
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
         *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran-common.xsd}RegisterRoleEnum" /&gt;
         *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Denomination" type="{http://schemas.radixware.org/types.xsd}Num" default="0" /&gt;
         *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" default="-" /&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Balance" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="IsCreated" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "RegRole")
            protected String regRole;
            @XmlAttribute(name = "Ccy")
            protected Long ccy;
            @XmlAttribute(name = "Denomination")
            protected BigDecimal denomination;
            @XmlAttribute(name = "Rid")
            protected String rid;
            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Number")
            protected String number;
            @XmlAttribute(name = "ExtNumber")
            protected String extNumber;
            @XmlAttribute(name = "Balance")
            protected BigDecimal balance;
            @XmlAttribute(name = "IsCreated")
            protected Boolean isCreated;

            /**
             * Gets the value of the regRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegRole() {
                return regRole;
            }

            /**
             * Sets the value of the regRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegRole(String value) {
                this.regRole = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCcy(Long value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the denomination property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDenomination() {
                if (denomination == null) {
                    return new BigDecimal("0");
                } else {
                    return denomination;
                }
            }

            /**
             * Sets the value of the denomination property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDenomination(BigDecimal value) {
                this.denomination = value;
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
                if (rid == null) {
                    return "-";
                } else {
                    return rid;
                }
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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setId(Long value) {
                this.id = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the extNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtNumber() {
                return extNumber;
            }

            /**
             * Sets the value of the extNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtNumber(String value) {
                this.extNumber = value;
            }

            /**
             * Gets the value of the balance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBalance() {
                return balance;
            }

            /**
             * Sets the value of the balance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBalance(BigDecimal value) {
                this.balance = value;
            }

            /**
             * Gets the value of the isCreated property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isIsCreated() {
                if (isCreated == null) {
                    return false;
                } else {
                    return isCreated;
                }
            }

            /**
             * Sets the value of the isCreated property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsCreated(Boolean value) {
                this.isCreated = value;
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
     *       &lt;attribute name="Inherited" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *       &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtCutoverFinishTime {

        @XmlAttribute(name = "Inherited")
        protected Boolean inherited;
        @XmlAttribute(name = "Val")
        protected Long val;

        /**
         * Gets the value of the inherited property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isInherited() {
            if (inherited == null) {
                return false;
            } else {
                return inherited;
            }
        }

        /**
         * Sets the value of the inherited property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInherited(Boolean value) {
            this.inherited = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setVal(Long value) {
            this.val = value;
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
     *       &lt;attribute name="Inherited" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *       &lt;attribute name="Val" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtCutoverWindow {

        @XmlAttribute(name = "Inherited")
        protected Boolean inherited;
        @XmlAttribute(name = "Val")
        protected Long val;

        /**
         * Gets the value of the inherited property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isInherited() {
            if (inherited == null) {
                return false;
            } else {
                return inherited;
            }
        }

        /**
         * Sets the value of the inherited property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInherited(Boolean value) {
            this.inherited = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setVal(Long value) {
            this.val = value;
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
     *         &lt;element name="Pmk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKey" minOccurs="0"/&gt;
     *         &lt;element name="Pwk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKey" minOccurs="0"/&gt;
     *         &lt;element name="Mmk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
     *         &lt;element name="Mwk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
     *         &lt;element name="Emk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
     *         &lt;element name="Ewk" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}DesKeyWithKek" minOccurs="0"/&gt;
     *         &lt;element name="Rkl" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}RsaKey" minOccurs="0"/&gt;
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
        "pmk",
        "pwk",
        "mmk",
        "mwk",
        "emk",
        "ewk",
        "rkl"
    })
    public static class Keys {

        @XmlElementRef(name = "Pmk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKey> pmk;
        @XmlElementRef(name = "Pwk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKey> pwk;
        @XmlElementRef(name = "Mmk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKeyWithKek> mmk;
        @XmlElementRef(name = "Mwk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKeyWithKek> mwk;
        @XmlElementRef(name = "Emk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKeyWithKek> emk;
        @XmlElementRef(name = "Ewk", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DesKeyWithKek> ewk;
        @XmlElementRef(name = "Rkl", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<RsaKey> rkl;

        /**
         * Gets the value of the pmk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKey }{@code >}
         *     
         */
        public JAXBElement<DesKey> getPmk() {
            return pmk;
        }

        /**
         * Sets the value of the pmk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKey }{@code >}
         *     
         */
        public void setPmk(JAXBElement<DesKey> value) {
            this.pmk = value;
        }

        /**
         * Gets the value of the pwk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKey }{@code >}
         *     
         */
        public JAXBElement<DesKey> getPwk() {
            return pwk;
        }

        /**
         * Sets the value of the pwk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKey }{@code >}
         *     
         */
        public void setPwk(JAXBElement<DesKey> value) {
            this.pwk = value;
        }

        /**
         * Gets the value of the mmk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public JAXBElement<DesKeyWithKek> getMmk() {
            return mmk;
        }

        /**
         * Sets the value of the mmk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public void setMmk(JAXBElement<DesKeyWithKek> value) {
            this.mmk = value;
        }

        /**
         * Gets the value of the mwk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public JAXBElement<DesKeyWithKek> getMwk() {
            return mwk;
        }

        /**
         * Sets the value of the mwk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public void setMwk(JAXBElement<DesKeyWithKek> value) {
            this.mwk = value;
        }

        /**
         * Gets the value of the emk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public JAXBElement<DesKeyWithKek> getEmk() {
            return emk;
        }

        /**
         * Sets the value of the emk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public void setEmk(JAXBElement<DesKeyWithKek> value) {
            this.emk = value;
        }

        /**
         * Gets the value of the ewk property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public JAXBElement<DesKeyWithKek> getEwk() {
            return ewk;
        }

        /**
         * Sets the value of the ewk property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DesKeyWithKek }{@code >}
         *     
         */
        public void setEwk(JAXBElement<DesKeyWithKek> value) {
            this.ewk = value;
        }

        /**
         * Gets the value of the rkl property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RsaKey }{@code >}
         *     
         */
        public JAXBElement<RsaKey> getRkl() {
            return rkl;
        }

        /**
         * Sets the value of the rkl property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RsaKey }{@code >}
         *     
         */
        public void setRkl(JAXBElement<RsaKey> value) {
            this.rkl = value;
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
     *         &lt;element name="NetworkSpecific" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MccId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
     *                   &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="NetworkId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
        "networkSpecific"
    })
    public static class NetworkSpecifics {

        @XmlElement(name = "NetworkSpecific")
        protected List<Terminal.NetworkSpecifics.NetworkSpecific> networkSpecific;

        /**
         * Gets the value of the networkSpecific property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkSpecific property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkSpecific().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Terminal.NetworkSpecifics.NetworkSpecific }
         * 
         * 
         */
        public List<Terminal.NetworkSpecifics.NetworkSpecific> getNetworkSpecific() {
            if (networkSpecific == null) {
                networkSpecific = new ArrayList<Terminal.NetworkSpecifics.NetworkSpecific>();
            }
            return this.networkSpecific;
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
         *         &lt;element name="MccId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
         *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="NetworkId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mccId",
            "rid"
        })
        public static class NetworkSpecific {

            @XmlElementRef(name = "MccId", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> mccId;
            @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> rid;
            @XmlAttribute(name = "NetworkId", required = true)
            protected long networkId;

            /**
             * Gets the value of the mccId property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getMccId() {
                return mccId;
            }

            /**
             * Sets the value of the mccId property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setMccId(JAXBElement<Long> value) {
                this.mccId = value;
            }

            /**
             * Gets the value of the rid property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRid() {
                return rid;
            }

            /**
             * Sets the value of the rid property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRid(JAXBElement<String> value) {
                this.rid = value;
            }

            /**
             * Gets the value of the networkId property.
             * 
             */
            public long getNetworkId() {
                return networkId;
            }

            /**
             * Sets the value of the networkId property.
             * 
             */
            public void setNetworkId(long value) {
                this.networkId = value;
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
     *         &lt;element name="Item" type="{http://schemas.tranzaxis.com/tran-common.xsd}WriteoffReconDiff" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WriteoffTerm" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
     *         &lt;element name="WriteoffAcct" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
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
        "item",
        "writeoffTerm",
        "writeoffAcct"
    })
    public static class WriteoffDiffs {

        @XmlElement(name = "Item")
        protected List<WriteoffReconDiff> item;
        @XmlElement(name = "WriteoffTerm")
        protected ObjectId writeoffTerm;
        @XmlElement(name = "WriteoffAcct")
        protected ObjectId writeoffAcct;

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
         * {@link WriteoffReconDiff }
         * 
         * 
         */
        public List<WriteoffReconDiff> getItem() {
            if (item == null) {
                item = new ArrayList<WriteoffReconDiff>();
            }
            return this.item;
        }

        /**
         * Gets the value of the writeoffTerm property.
         * 
         * @return
         *     possible object is
         *     {@link ObjectId }
         *     
         */
        public ObjectId getWriteoffTerm() {
            return writeoffTerm;
        }

        /**
         * Sets the value of the writeoffTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObjectId }
         *     
         */
        public void setWriteoffTerm(ObjectId value) {
            this.writeoffTerm = value;
        }

        /**
         * Gets the value of the writeoffAcct property.
         * 
         * @return
         *     possible object is
         *     {@link ObjectId }
         *     
         */
        public ObjectId getWriteoffAcct() {
            return writeoffAcct;
        }

        /**
         * Sets the value of the writeoffAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObjectId }
         *     
         */
        public void setWriteoffAcct(ObjectId value) {
            this.writeoffAcct = value;
        }

    }

}
