
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SQL markup language
 * 
 * <p>Java class for Sqml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sqml"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Compatibility" type="{http://schemas.radixware.org/xscml.xsd}SqmlCompatibility" minOccurs="0"/&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CalcField"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ValType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ConstValue"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="EnumId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="ItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TargetDbPreprocessor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                     &lt;attribute name="Value"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="DbTypeName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DbVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CheckVersion" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="VersionOperator"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="CheckOptions" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DbFuncCall"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Params" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="FuncId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DbName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Path" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IfParam"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Operation" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ElseIf"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EndIf"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Id"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Path" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IndexDbName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Join"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChildTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ParentTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="LEFT"/&gt;
 *                                 &lt;enumeration value="RIGHT"/&gt;
 *                                 &lt;enumeration value="INNER"/&gt;
 *                                 &lt;enumeration value="FULL"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ReferenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OracleHint"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Items"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice&gt;
 *                                                 &lt;element name="Index"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                                                         &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                                                         &lt;attribute name="Owner" default="TABLE"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                               &lt;enumeration value="THIS"/&gt;
 *                                                               &lt;enumeration value="TABLE"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                         &lt;attribute name="Order" use="required"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FirstRow"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AllRows"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/choice&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Parameter"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                           &lt;attribute name="Direction"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PropId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ParamValCount"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EntityRefParameter"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                           &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EntityRefValue"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="ReferencedObjectPidAsStr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ParentCondition"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ParentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Operator" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="EQUAL"/&gt;
 *                                 &lt;enumeration value="NOT_EQUAL"/&gt;
 *                                 &lt;enumeration value="IS_NULL"/&gt;
 *                                 &lt;enumeration value="IS_NOT_NULL"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ParentPid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ParentRefPropSqlName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ReferenceId" type="{http://schemas.radixware.org/types.xsd}Id" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PropSqlName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PropAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SuppressedWarnings" type="{http://schemas.radixware.org/utils.xsd}SuppressedWarnings" /&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Owner" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="CHILD"/&gt;
 *                                 &lt;enumeration value="PARENT"/&gt;
 *                                 &lt;enumeration value="THIS"/&gt;
 *                                 &lt;enumeration value="TABLE"/&gt;
 *                                 &lt;enumeration value="NONE"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SequenceDbName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SequenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Postfix" default="NONE"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="CUR_VAL"/&gt;
 *                                 &lt;enumeration value="NEXT_VAL"/&gt;
 *                                 &lt;enumeration value="NONE"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TableSqlName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Task" type="{http://schemas.radixware.org/xscml.xsd}TaskTagType"/&gt;
 *                   &lt;element name="ThisTableId" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ThisTableSqlName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ThisTableRef"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TypifiedValue"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TypifiedCalcField"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="XPath"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="SchemaId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                                     &lt;attribute name="IsAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                                     &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Data"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EventCode"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="OwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                           &lt;attribute name="StringId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ReportColumnsVisibilityPreprocessor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ColumnId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "Sqml", propOrder = {
    "compatibility",
    "item"
})
public class Sqml {

    @XmlElement(name = "Compatibility")
    protected SqmlCompatibility compatibility;
    @XmlElement(name = "Item")
    protected List<Sqml.Item> item;

    /**
     * Gets the value of the compatibility property.
     * 
     * @return
     *     possible object is
     *     {@link SqmlCompatibility }
     *     
     */
    public SqmlCompatibility getCompatibility() {
        return compatibility;
    }

    /**
     * Sets the value of the compatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqmlCompatibility }
     *     
     */
    public void setCompatibility(SqmlCompatibility value) {
        this.compatibility = value;
    }

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
     * {@link Sqml.Item }
     * 
     * 
     */
    public List<Sqml.Item> getItem() {
        if (item == null) {
            item = new ArrayList<Sqml.Item>();
        }
        return this.item;
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
     *       &lt;choice&gt;
     *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CalcField"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ValType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ConstValue"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="EnumId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="ItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TargetDbPreprocessor"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                           &lt;attribute name="Value"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="DbTypeName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DbVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CheckVersion" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="VersionOperator"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CheckOptions" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DbFuncCall"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Params" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="FuncId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DbName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Path" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IfParam"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Operation" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ElseIf"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EndIf"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Id"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Path" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IndexDbName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Join"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ChildTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ParentTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="LEFT"/&gt;
     *                       &lt;enumeration value="RIGHT"/&gt;
     *                       &lt;enumeration value="INNER"/&gt;
     *                       &lt;enumeration value="FULL"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ReferenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OracleHint"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Items"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Item" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;choice&gt;
     *                                       &lt;element name="Index"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                                               &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                                               &lt;attribute name="Owner" default="TABLE"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;enumeration value="THIS"/&gt;
     *                                                     &lt;enumeration value="TABLE"/&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                               &lt;attribute name="Order" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                                                   &lt;/restriction&gt;
     *                                                 &lt;/simpleType&gt;
     *                                               &lt;/attribute&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FirstRow"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="AllRows"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/choice&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Parameter"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                 &lt;attribute name="Direction"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PropId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ParamValCount"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EntityRefParameter"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                 &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EntityRefValue"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="ReferencedObjectPidAsStr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ParentCondition"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ParentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Operator" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="EQUAL"/&gt;
     *                       &lt;enumeration value="NOT_EQUAL"/&gt;
     *                       &lt;enumeration value="IS_NULL"/&gt;
     *                       &lt;enumeration value="IS_NOT_NULL"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ParentPid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ParentRefPropSqlName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ReferenceId" type="{http://schemas.radixware.org/types.xsd}Id" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PropSqlName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PropAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="SuppressedWarnings" type="{http://schemas.radixware.org/utils.xsd}SuppressedWarnings" /&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Owner" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="CHILD"/&gt;
     *                       &lt;enumeration value="PARENT"/&gt;
     *                       &lt;enumeration value="THIS"/&gt;
     *                       &lt;enumeration value="TABLE"/&gt;
     *                       &lt;enumeration value="NONE"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SequenceDbName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="SequenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Postfix" default="NONE"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="CUR_VAL"/&gt;
     *                       &lt;enumeration value="NEXT_VAL"/&gt;
     *                       &lt;enumeration value="NONE"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TableSqlName"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Task" type="{http://schemas.radixware.org/xscml.xsd}TaskTagType"/&gt;
     *         &lt;element name="ThisTableId" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ThisTableSqlName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ThisTableRef"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TypifiedValue"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TypifiedCalcField"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="XPath"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="SchemaId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                           &lt;attribute name="IsAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                           &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Data"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EventCode"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="OwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;attribute name="StringId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ReportColumnsVisibilityPreprocessor"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ColumnId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sql",
        "calcField",
        "constValue",
        "targetDbPreprocessor",
        "dbFuncCall",
        "dbName",
        "ifParam",
        "elseIf",
        "endIf",
        "id",
        "indexDbName",
        "join",
        "oracleHint",
        "parameter",
        "paramValCount",
        "entityRefParameter",
        "entityRefValue",
        "parentCondition",
        "parentRefPropSqlName",
        "propSqlName",
        "sequenceDbName",
        "tableSqlName",
        "task",
        "thisTableId",
        "thisTableSqlName",
        "thisTableRef",
        "typifiedValue",
        "typifiedCalcField",
        "xPath",
        "data",
        "eventCode",
        "reportColumnsVisibilityPreprocessor"
    })
    public static class Item {

        @XmlElement(name = "Sql")
        protected String sql;
        @XmlElement(name = "CalcField")
        protected Sqml.Item.CalcField calcField;
        @XmlElement(name = "ConstValue")
        protected Sqml.Item.ConstValue constValue;
        @XmlElement(name = "TargetDbPreprocessor")
        protected Sqml.Item.TargetDbPreprocessor targetDbPreprocessor;
        @XmlElement(name = "DbFuncCall")
        protected Sqml.Item.DbFuncCall dbFuncCall;
        @XmlElement(name = "DbName")
        protected Sqml.Item.DbName dbName;
        @XmlElement(name = "IfParam")
        protected Sqml.Item.IfParam ifParam;
        @XmlElement(name = "ElseIf")
        protected Sqml.Item.ElseIf elseIf;
        @XmlElement(name = "EndIf")
        protected Sqml.Item.EndIf endIf;
        @XmlElement(name = "Id")
        protected Sqml.Item.Id id;
        @XmlElement(name = "IndexDbName")
        protected Sqml.Item.IndexDbName indexDbName;
        @XmlElement(name = "Join")
        protected Sqml.Item.Join join;
        @XmlElement(name = "OracleHint")
        protected Sqml.Item.OracleHint oracleHint;
        @XmlElement(name = "Parameter")
        protected Sqml.Item.Parameter parameter;
        @XmlElement(name = "ParamValCount")
        protected Sqml.Item.ParamValCount paramValCount;
        @XmlElement(name = "EntityRefParameter")
        protected Sqml.Item.EntityRefParameter entityRefParameter;
        @XmlElement(name = "EntityRefValue")
        protected Sqml.Item.EntityRefValue entityRefValue;
        @XmlElement(name = "ParentCondition")
        protected Sqml.Item.ParentCondition parentCondition;
        @XmlElement(name = "ParentRefPropSqlName")
        protected Sqml.Item.ParentRefPropSqlName parentRefPropSqlName;
        @XmlElement(name = "PropSqlName")
        protected Sqml.Item.PropSqlName propSqlName;
        @XmlElement(name = "SequenceDbName")
        protected Sqml.Item.SequenceDbName sequenceDbName;
        @XmlElement(name = "TableSqlName")
        protected Sqml.Item.TableSqlName tableSqlName;
        @XmlElement(name = "Task")
        protected TaskTagType task;
        @XmlElement(name = "ThisTableId")
        protected Object thisTableId;
        @XmlElement(name = "ThisTableSqlName")
        protected Object thisTableSqlName;
        @XmlElement(name = "ThisTableRef")
        protected Sqml.Item.ThisTableRef thisTableRef;
        @XmlElement(name = "TypifiedValue")
        protected Sqml.Item.TypifiedValue typifiedValue;
        @XmlElement(name = "TypifiedCalcField")
        protected Sqml.Item.TypifiedCalcField typifiedCalcField;
        @XmlElement(name = "XPath")
        protected Sqml.Item.XPath xPath;
        @XmlElement(name = "Data")
        protected Sqml.Item.Data data;
        @XmlElement(name = "EventCode")
        protected Sqml.Item.EventCode eventCode;
        @XmlElement(name = "ReportColumnsVisibilityPreprocessor")
        protected Sqml.Item.ReportColumnsVisibilityPreprocessor reportColumnsVisibilityPreprocessor;

        /**
         * Gets the value of the sql property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSql() {
            return sql;
        }

        /**
         * Sets the value of the sql property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSql(String value) {
            this.sql = value;
        }

        /**
         * Gets the value of the calcField property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.CalcField }
         *     
         */
        public Sqml.Item.CalcField getCalcField() {
            return calcField;
        }

        /**
         * Sets the value of the calcField property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.CalcField }
         *     
         */
        public void setCalcField(Sqml.Item.CalcField value) {
            this.calcField = value;
        }

        /**
         * Gets the value of the constValue property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ConstValue }
         *     
         */
        public Sqml.Item.ConstValue getConstValue() {
            return constValue;
        }

        /**
         * Sets the value of the constValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ConstValue }
         *     
         */
        public void setConstValue(Sqml.Item.ConstValue value) {
            this.constValue = value;
        }

        /**
         * Gets the value of the targetDbPreprocessor property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.TargetDbPreprocessor }
         *     
         */
        public Sqml.Item.TargetDbPreprocessor getTargetDbPreprocessor() {
            return targetDbPreprocessor;
        }

        /**
         * Sets the value of the targetDbPreprocessor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.TargetDbPreprocessor }
         *     
         */
        public void setTargetDbPreprocessor(Sqml.Item.TargetDbPreprocessor value) {
            this.targetDbPreprocessor = value;
        }

        /**
         * Gets the value of the dbFuncCall property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.DbFuncCall }
         *     
         */
        public Sqml.Item.DbFuncCall getDbFuncCall() {
            return dbFuncCall;
        }

        /**
         * Sets the value of the dbFuncCall property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.DbFuncCall }
         *     
         */
        public void setDbFuncCall(Sqml.Item.DbFuncCall value) {
            this.dbFuncCall = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.DbName }
         *     
         */
        public Sqml.Item.DbName getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.DbName }
         *     
         */
        public void setDbName(Sqml.Item.DbName value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the ifParam property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.IfParam }
         *     
         */
        public Sqml.Item.IfParam getIfParam() {
            return ifParam;
        }

        /**
         * Sets the value of the ifParam property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.IfParam }
         *     
         */
        public void setIfParam(Sqml.Item.IfParam value) {
            this.ifParam = value;
        }

        /**
         * Gets the value of the elseIf property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ElseIf }
         *     
         */
        public Sqml.Item.ElseIf getElseIf() {
            return elseIf;
        }

        /**
         * Sets the value of the elseIf property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ElseIf }
         *     
         */
        public void setElseIf(Sqml.Item.ElseIf value) {
            this.elseIf = value;
        }

        /**
         * Gets the value of the endIf property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.EndIf }
         *     
         */
        public Sqml.Item.EndIf getEndIf() {
            return endIf;
        }

        /**
         * Sets the value of the endIf property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.EndIf }
         *     
         */
        public void setEndIf(Sqml.Item.EndIf value) {
            this.endIf = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.Id }
         *     
         */
        public Sqml.Item.Id getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.Id }
         *     
         */
        public void setId(Sqml.Item.Id value) {
            this.id = value;
        }

        /**
         * Gets the value of the indexDbName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.IndexDbName }
         *     
         */
        public Sqml.Item.IndexDbName getIndexDbName() {
            return indexDbName;
        }

        /**
         * Sets the value of the indexDbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.IndexDbName }
         *     
         */
        public void setIndexDbName(Sqml.Item.IndexDbName value) {
            this.indexDbName = value;
        }

        /**
         * Gets the value of the join property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.Join }
         *     
         */
        public Sqml.Item.Join getJoin() {
            return join;
        }

        /**
         * Sets the value of the join property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.Join }
         *     
         */
        public void setJoin(Sqml.Item.Join value) {
            this.join = value;
        }

        /**
         * Gets the value of the oracleHint property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.OracleHint }
         *     
         */
        public Sqml.Item.OracleHint getOracleHint() {
            return oracleHint;
        }

        /**
         * Sets the value of the oracleHint property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.OracleHint }
         *     
         */
        public void setOracleHint(Sqml.Item.OracleHint value) {
            this.oracleHint = value;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.Parameter }
         *     
         */
        public Sqml.Item.Parameter getParameter() {
            return parameter;
        }

        /**
         * Sets the value of the parameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.Parameter }
         *     
         */
        public void setParameter(Sqml.Item.Parameter value) {
            this.parameter = value;
        }

        /**
         * Gets the value of the paramValCount property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ParamValCount }
         *     
         */
        public Sqml.Item.ParamValCount getParamValCount() {
            return paramValCount;
        }

        /**
         * Sets the value of the paramValCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ParamValCount }
         *     
         */
        public void setParamValCount(Sqml.Item.ParamValCount value) {
            this.paramValCount = value;
        }

        /**
         * Gets the value of the entityRefParameter property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.EntityRefParameter }
         *     
         */
        public Sqml.Item.EntityRefParameter getEntityRefParameter() {
            return entityRefParameter;
        }

        /**
         * Sets the value of the entityRefParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.EntityRefParameter }
         *     
         */
        public void setEntityRefParameter(Sqml.Item.EntityRefParameter value) {
            this.entityRefParameter = value;
        }

        /**
         * Gets the value of the entityRefValue property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.EntityRefValue }
         *     
         */
        public Sqml.Item.EntityRefValue getEntityRefValue() {
            return entityRefValue;
        }

        /**
         * Sets the value of the entityRefValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.EntityRefValue }
         *     
         */
        public void setEntityRefValue(Sqml.Item.EntityRefValue value) {
            this.entityRefValue = value;
        }

        /**
         * Gets the value of the parentCondition property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ParentCondition }
         *     
         */
        public Sqml.Item.ParentCondition getParentCondition() {
            return parentCondition;
        }

        /**
         * Sets the value of the parentCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ParentCondition }
         *     
         */
        public void setParentCondition(Sqml.Item.ParentCondition value) {
            this.parentCondition = value;
        }

        /**
         * Gets the value of the parentRefPropSqlName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ParentRefPropSqlName }
         *     
         */
        public Sqml.Item.ParentRefPropSqlName getParentRefPropSqlName() {
            return parentRefPropSqlName;
        }

        /**
         * Sets the value of the parentRefPropSqlName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ParentRefPropSqlName }
         *     
         */
        public void setParentRefPropSqlName(Sqml.Item.ParentRefPropSqlName value) {
            this.parentRefPropSqlName = value;
        }

        /**
         * Gets the value of the propSqlName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.PropSqlName }
         *     
         */
        public Sqml.Item.PropSqlName getPropSqlName() {
            return propSqlName;
        }

        /**
         * Sets the value of the propSqlName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.PropSqlName }
         *     
         */
        public void setPropSqlName(Sqml.Item.PropSqlName value) {
            this.propSqlName = value;
        }

        /**
         * Gets the value of the sequenceDbName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.SequenceDbName }
         *     
         */
        public Sqml.Item.SequenceDbName getSequenceDbName() {
            return sequenceDbName;
        }

        /**
         * Sets the value of the sequenceDbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.SequenceDbName }
         *     
         */
        public void setSequenceDbName(Sqml.Item.SequenceDbName value) {
            this.sequenceDbName = value;
        }

        /**
         * Gets the value of the tableSqlName property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.TableSqlName }
         *     
         */
        public Sqml.Item.TableSqlName getTableSqlName() {
            return tableSqlName;
        }

        /**
         * Sets the value of the tableSqlName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.TableSqlName }
         *     
         */
        public void setTableSqlName(Sqml.Item.TableSqlName value) {
            this.tableSqlName = value;
        }

        /**
         * Gets the value of the task property.
         * 
         * @return
         *     possible object is
         *     {@link TaskTagType }
         *     
         */
        public TaskTagType getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaskTagType }
         *     
         */
        public void setTask(TaskTagType value) {
            this.task = value;
        }

        /**
         * Gets the value of the thisTableId property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getThisTableId() {
            return thisTableId;
        }

        /**
         * Sets the value of the thisTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setThisTableId(Object value) {
            this.thisTableId = value;
        }

        /**
         * Gets the value of the thisTableSqlName property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getThisTableSqlName() {
            return thisTableSqlName;
        }

        /**
         * Sets the value of the thisTableSqlName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setThisTableSqlName(Object value) {
            this.thisTableSqlName = value;
        }

        /**
         * Gets the value of the thisTableRef property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ThisTableRef }
         *     
         */
        public Sqml.Item.ThisTableRef getThisTableRef() {
            return thisTableRef;
        }

        /**
         * Sets the value of the thisTableRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ThisTableRef }
         *     
         */
        public void setThisTableRef(Sqml.Item.ThisTableRef value) {
            this.thisTableRef = value;
        }

        /**
         * Gets the value of the typifiedValue property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.TypifiedValue }
         *     
         */
        public Sqml.Item.TypifiedValue getTypifiedValue() {
            return typifiedValue;
        }

        /**
         * Sets the value of the typifiedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.TypifiedValue }
         *     
         */
        public void setTypifiedValue(Sqml.Item.TypifiedValue value) {
            this.typifiedValue = value;
        }

        /**
         * Gets the value of the typifiedCalcField property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.TypifiedCalcField }
         *     
         */
        public Sqml.Item.TypifiedCalcField getTypifiedCalcField() {
            return typifiedCalcField;
        }

        /**
         * Sets the value of the typifiedCalcField property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.TypifiedCalcField }
         *     
         */
        public void setTypifiedCalcField(Sqml.Item.TypifiedCalcField value) {
            this.typifiedCalcField = value;
        }

        /**
         * Gets the value of the xPath property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.XPath }
         *     
         */
        public Sqml.Item.XPath getXPath() {
            return xPath;
        }

        /**
         * Sets the value of the xPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.XPath }
         *     
         */
        public void setXPath(Sqml.Item.XPath value) {
            this.xPath = value;
        }

        /**
         * Gets the value of the data property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.Data }
         *     
         */
        public Sqml.Item.Data getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.Data }
         *     
         */
        public void setData(Sqml.Item.Data value) {
            this.data = value;
        }

        /**
         * Gets the value of the eventCode property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.EventCode }
         *     
         */
        public Sqml.Item.EventCode getEventCode() {
            return eventCode;
        }

        /**
         * Sets the value of the eventCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.EventCode }
         *     
         */
        public void setEventCode(Sqml.Item.EventCode value) {
            this.eventCode = value;
        }

        /**
         * Gets the value of the reportColumnsVisibilityPreprocessor property.
         * 
         * @return
         *     possible object is
         *     {@link Sqml.Item.ReportColumnsVisibilityPreprocessor }
         *     
         */
        public Sqml.Item.ReportColumnsVisibilityPreprocessor getReportColumnsVisibilityPreprocessor() {
            return reportColumnsVisibilityPreprocessor;
        }

        /**
         * Sets the value of the reportColumnsVisibilityPreprocessor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sqml.Item.ReportColumnsVisibilityPreprocessor }
         *     
         */
        public void setReportColumnsVisibilityPreprocessor(Sqml.Item.ReportColumnsVisibilityPreprocessor value) {
            this.reportColumnsVisibilityPreprocessor = value;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ValType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CalcField {

            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "ValType", required = true)
            protected long valType;
            @XmlAttribute(name = "Length")
            protected Long length;

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
             * Gets the value of the valType property.
             * 
             */
            public long getValType() {
                return valType;
            }

            /**
             * Sets the value of the valType property.
             * 
             */
            public void setValType(long value) {
                this.valType = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLength(Long value) {
                this.length = value;
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
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="EnumId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sql"
        })
        public static class ConstValue {

            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "EnumId", required = true)
            protected String enumId;
            @XmlAttribute(name = "ItemId", required = true)
            protected String itemId;

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the enumId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnumId() {
                return enumId;
            }

            /**
             * Sets the value of the enumId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnumId(String value) {
                this.enumId = value;
            }

            /**
             * Gets the value of the itemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemId() {
                return itemId;
            }

            /**
             * Sets the value of the itemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemId(String value) {
                this.itemId = value;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Data {

            @XmlAttribute(name = "Id", required = true)
            protected String id;

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
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Params" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
         *       &lt;attribute name="FuncId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sql",
            "params"
        })
        public static class DbFuncCall {

            @XmlElement(name = "Sql")
            protected String sql;
            @XmlElement(name = "Params")
            protected Sqml.Item.DbFuncCall.Params params;
            @XmlAttribute(name = "FuncId", required = true)
            protected String funcId;

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the params property.
             * 
             * @return
             *     possible object is
             *     {@link Sqml.Item.DbFuncCall.Params }
             *     
             */
            public Sqml.Item.DbFuncCall.Params getParams() {
                return params;
            }

            /**
             * Sets the value of the params property.
             * 
             * @param value
             *     allowed object is
             *     {@link Sqml.Item.DbFuncCall.Params }
             *     
             */
            public void setParams(Sqml.Item.DbFuncCall.Params value) {
                this.params = value;
            }

            /**
             * Gets the value of the funcId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFuncId() {
                return funcId;
            }

            /**
             * Sets the value of the funcId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFuncId(String value) {
                this.funcId = value;
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
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
            public static class Params {

                @XmlElement(name = "Param")
                protected List<Sqml.Item.DbFuncCall.Params.Param> param;

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
                 * {@link Sqml.Item.DbFuncCall.Params.Param }
                 * 
                 * 
                 */
                public List<Sqml.Item.DbFuncCall.Params.Param> getParam() {
                    if (param == null) {
                        param = new ArrayList<Sqml.Item.DbFuncCall.Params.Param>();
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
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Param {

                    @XmlElement(name = "Value")
                    protected String value;
                    @XmlAttribute(name = "ParamId", required = true)
                    protected String paramId;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the paramId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getParamId() {
                        return paramId;
                    }

                    /**
                     * Sets the value of the paramId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setParamId(String value) {
                        this.paramId = value;
                    }

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
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Path" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
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
        @XmlType(name = "", propOrder = {
            "sql"
        })
        public static class DbName {

            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "Path", required = true)
            protected List<String> path;

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ElseIf {


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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EndIf {


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
         *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *       &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EntityRefParameter {

            @XmlAttribute(name = "ParamId", required = true)
            protected String paramId;
            @XmlAttribute(name = "ReferencedTableId", required = true)
            protected String referencedTableId;
            @XmlAttribute(name = "PidTranslationMode")
            protected String pidTranslationMode;
            @XmlAttribute(name = "PidTranslationSecondaryKeyId")
            protected String pidTranslationSecondaryKeyId;
            @XmlAttribute(name = "ExpressionList")
            protected Boolean expressionList;
            @XmlAttribute(name = "Literal")
            protected Boolean literal;

            /**
             * Gets the value of the paramId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamId() {
                return paramId;
            }

            /**
             * Sets the value of the paramId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamId(String value) {
                this.paramId = value;
            }

            /**
             * Gets the value of the referencedTableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencedTableId() {
                return referencedTableId;
            }

            /**
             * Sets the value of the referencedTableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferencedTableId(String value) {
                this.referencedTableId = value;
            }

            /**
             * Gets the value of the pidTranslationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationMode() {
                if (pidTranslationMode == null) {
                    return "PrimaryKeyProps";
                } else {
                    return pidTranslationMode;
                }
            }

            /**
             * Sets the value of the pidTranslationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationMode(String value) {
                this.pidTranslationMode = value;
            }

            /**
             * Gets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationSecondaryKeyId() {
                return pidTranslationSecondaryKeyId;
            }

            /**
             * Sets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationSecondaryKeyId(String value) {
                this.pidTranslationSecondaryKeyId = value;
            }

            /**
             * Gets the value of the expressionList property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isExpressionList() {
                if (expressionList == null) {
                    return false;
                } else {
                    return expressionList;
                }
            }

            /**
             * Sets the value of the expressionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExpressionList(Boolean value) {
                this.expressionList = value;
            }

            /**
             * Gets the value of the literal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isLiteral() {
                if (literal == null) {
                    return false;
                } else {
                    return literal;
                }
            }

            /**
             * Sets the value of the literal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLiteral(Boolean value) {
                this.literal = value;
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
         *         &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ReferencedTableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ReferencedObjectPidAsStr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "displayValue"
        })
        public static class EntityRefValue {

            @XmlElement(name = "DisplayValue", required = true)
            protected String displayValue;
            @XmlAttribute(name = "ReferencedTableId", required = true)
            protected String referencedTableId;
            @XmlAttribute(name = "ReferencedObjectPidAsStr", required = true)
            protected String referencedObjectPidAsStr;
            @XmlAttribute(name = "PidTranslationMode")
            protected String pidTranslationMode;
            @XmlAttribute(name = "PidTranslationSecondaryKeyId")
            protected String pidTranslationSecondaryKeyId;
            @XmlAttribute(name = "Literal")
            protected Boolean literal;

            /**
             * Gets the value of the displayValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayValue() {
                return displayValue;
            }

            /**
             * Sets the value of the displayValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayValue(String value) {
                this.displayValue = value;
            }

            /**
             * Gets the value of the referencedTableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencedTableId() {
                return referencedTableId;
            }

            /**
             * Sets the value of the referencedTableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferencedTableId(String value) {
                this.referencedTableId = value;
            }

            /**
             * Gets the value of the referencedObjectPidAsStr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencedObjectPidAsStr() {
                return referencedObjectPidAsStr;
            }

            /**
             * Sets the value of the referencedObjectPidAsStr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferencedObjectPidAsStr(String value) {
                this.referencedObjectPidAsStr = value;
            }

            /**
             * Gets the value of the pidTranslationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationMode() {
                if (pidTranslationMode == null) {
                    return "PrimaryKeyProps";
                } else {
                    return pidTranslationMode;
                }
            }

            /**
             * Sets the value of the pidTranslationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationMode(String value) {
                this.pidTranslationMode = value;
            }

            /**
             * Gets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationSecondaryKeyId() {
                return pidTranslationSecondaryKeyId;
            }

            /**
             * Sets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationSecondaryKeyId(String value) {
                this.pidTranslationSecondaryKeyId = value;
            }

            /**
             * Gets the value of the literal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isLiteral() {
                if (literal == null) {
                    return false;
                } else {
                    return literal;
                }
            }

            /**
             * Sets the value of the literal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLiteral(Boolean value) {
                this.literal = value;
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
         *       &lt;attribute name="OwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="StringId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EventCode {

            @XmlAttribute(name = "OwnerId")
            protected String ownerId;
            @XmlAttribute(name = "StringId")
            protected String stringId;

            /**
             * Gets the value of the ownerId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerId() {
                return ownerId;
            }

            /**
             * Sets the value of the ownerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerId(String value) {
                this.ownerId = value;
            }

            /**
             * Gets the value of the stringId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStringId() {
                return stringId;
            }

            /**
             * Sets the value of the stringId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStringId(String value) {
                this.stringId = value;
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
         *       &lt;attribute name="Path" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Soft" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Id {

            @XmlAttribute(name = "Path", required = true)
            protected List<String> path;
            @XmlAttribute(name = "Soft")
            protected Boolean soft;

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
             * Gets the value of the soft property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isSoft() {
                if (soft == null) {
                    return false;
                } else {
                    return soft;
                }
            }

            /**
             * Sets the value of the soft property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSoft(Boolean value) {
                this.soft = value;
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
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Operation" use="required"&gt;
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
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class IfParam {

            @XmlElement(name = "Value")
            protected String value;
            @XmlAttribute(name = "ParamId", required = true)
            protected String paramId;
            @XmlAttribute(name = "Operation", required = true)
            protected String operation;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the paramId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamId() {
                return paramId;
            }

            /**
             * Sets the value of the paramId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamId(String value) {
                this.paramId = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperation(String value) {
                this.operation = value;
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
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sql"
        })
        public static class IndexDbName {

            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;
            @XmlAttribute(name = "IndexId")
            protected String indexId;

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
            }

            /**
             * Gets the value of the indexId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndexId() {
                return indexId;
            }

            /**
             * Sets the value of the indexId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndexId(String value) {
                this.indexId = value;
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
         *         &lt;element name="ChildTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ParentTableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="LEFT"/&gt;
         *             &lt;enumeration value="RIGHT"/&gt;
         *             &lt;enumeration value="INNER"/&gt;
         *             &lt;enumeration value="FULL"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ReferenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "childTableAlias",
            "parentTableAlias"
        })
        public static class Join {

            @XmlElement(name = "ChildTableAlias")
            protected String childTableAlias;
            @XmlElement(name = "ParentTableAlias")
            protected String parentTableAlias;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "ReferenceId", required = true)
            protected String referenceId;

            /**
             * Gets the value of the childTableAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChildTableAlias() {
                return childTableAlias;
            }

            /**
             * Sets the value of the childTableAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChildTableAlias(String value) {
                this.childTableAlias = value;
            }

            /**
             * Gets the value of the parentTableAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentTableAlias() {
                return parentTableAlias;
            }

            /**
             * Sets the value of the parentTableAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentTableAlias(String value) {
                this.parentTableAlias = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the referenceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceId() {
                return referenceId;
            }

            /**
             * Sets the value of the referenceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceId(String value) {
                this.referenceId = value;
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
         *         &lt;element name="Items"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element name="Index"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *                                     &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *                                     &lt;attribute name="Owner" default="TABLE"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;enumeration value="THIS"/&gt;
         *                                           &lt;enumeration value="TABLE"/&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                     &lt;attribute name="Order" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *                                         &lt;/restriction&gt;
         *                                       &lt;/simpleType&gt;
         *                                     &lt;/attribute&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FirstRow"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="AllRows"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/choice&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "items",
            "sql"
        })
        public static class OracleHint {

            @XmlElement(name = "Items", required = true)
            protected Sqml.Item.OracleHint.Items items;
            @XmlElement(name = "Sql")
            protected String sql;

            /**
             * Gets the value of the items property.
             * 
             * @return
             *     possible object is
             *     {@link Sqml.Item.OracleHint.Items }
             *     
             */
            public Sqml.Item.OracleHint.Items getItems() {
                return items;
            }

            /**
             * Sets the value of the items property.
             * 
             * @param value
             *     allowed object is
             *     {@link Sqml.Item.OracleHint.Items }
             *     
             */
            public void setItems(Sqml.Item.OracleHint.Items value) {
                this.items = value;
            }

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
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
             *         &lt;element name="Item" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element name="Index"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
             *                           &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
             *                           &lt;attribute name="Owner" default="TABLE"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;enumeration value="THIS"/&gt;
             *                                 &lt;enumeration value="TABLE"/&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                           &lt;attribute name="Order" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
             *                               &lt;/restriction&gt;
             *                             &lt;/simpleType&gt;
             *                           &lt;/attribute&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FirstRow"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="AllRows"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/choice&gt;
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
                "item"
            })
            public static class Items {

                @XmlElement(name = "Item", required = true)
                protected List<Sqml.Item.OracleHint.Items.HintItem> item;

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
                 * {@link Sqml.Item.OracleHint.Items.HintItem }
                 * 
                 * 
                 */
                public List<Sqml.Item.OracleHint.Items.HintItem> getItem() {
                    if (item == null) {
                        item = new ArrayList<Sqml.Item.OracleHint.Items.HintItem>();
                    }
                    return this.item;
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
                 *       &lt;choice&gt;
                 *         &lt;element name="Index"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
                 *                 &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
                 *                 &lt;attribute name="Owner" default="TABLE"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;enumeration value="THIS"/&gt;
                 *                       &lt;enumeration value="TABLE"/&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *                 &lt;attribute name="Order" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
                 *                     &lt;/restriction&gt;
                 *                   &lt;/simpleType&gt;
                 *                 &lt;/attribute&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FirstRow"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="AllRows"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *       &lt;/choice&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "index",
                    "firstRow",
                    "allRows",
                    "custom"
                })
                public static class HintItem {

                    @XmlElement(name = "Index")
                    protected Sqml.Item.OracleHint.Items.HintItem.Index index;
                    @XmlElement(name = "FirstRow")
                    protected Sqml.Item.OracleHint.Items.HintItem.FirstRow firstRow;
                    @XmlElement(name = "AllRows")
                    protected Sqml.Item.OracleHint.Items.HintItem.AllRows allRows;
                    @XmlElement(name = "Custom")
                    protected String custom;

                    /**
                     * Gets the value of the index property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.Index }
                     *     
                     */
                    public Sqml.Item.OracleHint.Items.HintItem.Index getIndex() {
                        return index;
                    }

                    /**
                     * Sets the value of the index property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.Index }
                     *     
                     */
                    public void setIndex(Sqml.Item.OracleHint.Items.HintItem.Index value) {
                        this.index = value;
                    }

                    /**
                     * Gets the value of the firstRow property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.FirstRow }
                     *     
                     */
                    public Sqml.Item.OracleHint.Items.HintItem.FirstRow getFirstRow() {
                        return firstRow;
                    }

                    /**
                     * Sets the value of the firstRow property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.FirstRow }
                     *     
                     */
                    public void setFirstRow(Sqml.Item.OracleHint.Items.HintItem.FirstRow value) {
                        this.firstRow = value;
                    }

                    /**
                     * Gets the value of the allRows property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.AllRows }
                     *     
                     */
                    public Sqml.Item.OracleHint.Items.HintItem.AllRows getAllRows() {
                        return allRows;
                    }

                    /**
                     * Sets the value of the allRows property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Sqml.Item.OracleHint.Items.HintItem.AllRows }
                     *     
                     */
                    public void setAllRows(Sqml.Item.OracleHint.Items.HintItem.AllRows value) {
                        this.allRows = value;
                    }

                    /**
                     * Gets the value of the custom property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCustom() {
                        return custom;
                    }

                    /**
                     * Sets the value of the custom property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCustom(String value) {
                        this.custom = value;
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
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AllRows {


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
                     *       &lt;attribute name="RowCount" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FirstRow {

                        @XmlAttribute(name = "RowCount")
                        protected Long rowCount;

                        /**
                         * Gets the value of the rowCount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Long }
                         *     
                         */
                        public Long getRowCount() {
                            return rowCount;
                        }

                        /**
                         * Sets the value of the rowCount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Long }
                         *     
                         */
                        public void setRowCount(Long value) {
                            this.rowCount = value;
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
                     *         &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
                     *       &lt;attribute name="IndexId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
                     *       &lt;attribute name="Owner" default="TABLE"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;enumeration value="THIS"/&gt;
                     *             &lt;enumeration value="TABLE"/&gt;
                     *           &lt;/restriction&gt;
                     *         &lt;/simpleType&gt;
                     *       &lt;/attribute&gt;
                     *       &lt;attribute name="Order" use="required"&gt;
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
                    @XmlType(name = "", propOrder = {
                        "tableAlias"
                    })
                    public static class Index {

                        @XmlElement(name = "TableAlias")
                        protected String tableAlias;
                        @XmlAttribute(name = "TableId", required = true)
                        protected String tableId;
                        @XmlAttribute(name = "IndexId")
                        protected String indexId;
                        @XmlAttribute(name = "Owner")
                        protected String owner;
                        @XmlAttribute(name = "Order", required = true)
                        protected String order;

                        /**
                         * Gets the value of the tableAlias property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTableAlias() {
                            return tableAlias;
                        }

                        /**
                         * Sets the value of the tableAlias property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTableAlias(String value) {
                            this.tableAlias = value;
                        }

                        /**
                         * Gets the value of the tableId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTableId() {
                            return tableId;
                        }

                        /**
                         * Sets the value of the tableId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTableId(String value) {
                            this.tableId = value;
                        }

                        /**
                         * Gets the value of the indexId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndexId() {
                            return indexId;
                        }

                        /**
                         * Sets the value of the indexId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndexId(String value) {
                            this.indexId = value;
                        }

                        /**
                         * Gets the value of the owner property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOwner() {
                            if (owner == null) {
                                return "TABLE";
                            } else {
                                return owner;
                            }
                        }

                        /**
                         * Sets the value of the owner property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOwner(String value) {
                            this.owner = value;
                        }

                        /**
                         * Gets the value of the order property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrder() {
                            return order;
                        }

                        /**
                         * Sets the value of the order property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrder(String value) {
                            this.order = value;
                        }

                    }

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
         *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ParamValCount {

            @XmlAttribute(name = "ParamId", required = true)
            protected String paramId;

            /**
             * Gets the value of the paramId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamId() {
                return paramId;
            }

            /**
             * Sets the value of the paramId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamId(String value) {
                this.paramId = value;
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
         *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="ExpressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *       &lt;attribute name="Direction"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PropId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Parameter {

            @XmlAttribute(name = "ParamId", required = true)
            protected String paramId;
            @XmlAttribute(name = "Literal")
            protected Boolean literal;
            @XmlAttribute(name = "ExpressionList")
            protected Boolean expressionList;
            @XmlAttribute(name = "Direction")
            protected Long direction;
            @XmlAttribute(name = "PropId")
            protected String propId;

            /**
             * Gets the value of the paramId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamId() {
                return paramId;
            }

            /**
             * Sets the value of the paramId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamId(String value) {
                this.paramId = value;
            }

            /**
             * Gets the value of the literal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLiteral() {
                return literal;
            }

            /**
             * Sets the value of the literal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLiteral(Boolean value) {
                this.literal = value;
            }

            /**
             * Gets the value of the expressionList property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isExpressionList() {
                if (expressionList == null) {
                    return false;
                } else {
                    return expressionList;
                }
            }

            /**
             * Sets the value of the expressionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExpressionList(Boolean value) {
                this.expressionList = value;
            }

            /**
             * Gets the value of the direction property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDirection() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDirection(Long value) {
                this.direction = value;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
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
         *         &lt;element name="ParentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Operator" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="EQUAL"/&gt;
         *             &lt;enumeration value="NOT_EQUAL"/&gt;
         *             &lt;enumeration value="IS_NULL"/&gt;
         *             &lt;enumeration value="IS_NOT_NULL"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ParentPid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "parentTitle"
        })
        public static class ParentCondition {

            @XmlElement(name = "ParentTitle")
            protected String parentTitle;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;
            @XmlAttribute(name = "PropId", required = true)
            protected String propId;
            @XmlAttribute(name = "Operator", required = true)
            protected String operator;
            @XmlAttribute(name = "ParentPid")
            protected String parentPid;

            /**
             * Gets the value of the parentTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentTitle() {
                return parentTitle;
            }

            /**
             * Sets the value of the parentTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentTitle(String value) {
                this.parentTitle = value;
            }

            /**
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
            }

            /**
             * Gets the value of the operator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperator() {
                return operator;
            }

            /**
             * Sets the value of the operator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperator(String value) {
                this.operator = value;
            }

            /**
             * Gets the value of the parentPid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentPid() {
                return parentPid;
            }

            /**
             * Sets the value of the parentPid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentPid(String value) {
                this.parentPid = value;
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
         *         &lt;element name="ReferenceId" type="{http://schemas.radixware.org/types.xsd}Id" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "referenceId"
        })
        public static class ParentRefPropSqlName {

            @XmlElement(name = "ReferenceId", required = true)
            protected List<String> referenceId;
            @XmlAttribute(name = "PropId", required = true)
            protected String propId;

            /**
             * Gets the value of the referenceId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the referenceId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReferenceId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getReferenceId() {
                if (referenceId == null) {
                    referenceId = new ArrayList<String>();
                }
                return this.referenceId;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
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
         *         &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PropAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="SuppressedWarnings" type="{http://schemas.radixware.org/utils.xsd}SuppressedWarnings" /&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Owner" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="CHILD"/&gt;
         *             &lt;enumeration value="PARENT"/&gt;
         *             &lt;enumeration value="THIS"/&gt;
         *             &lt;enumeration value="TABLE"/&gt;
         *             &lt;enumeration value="NONE"/&gt;
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
        @XmlType(name = "", propOrder = {
            "tableAlias",
            "propAlias",
            "sql"
        })
        public static class PropSqlName {

            @XmlElement(name = "TableAlias")
            protected String tableAlias;
            @XmlElement(name = "PropAlias")
            protected String propAlias;
            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "SuppressedWarnings")
            protected List<Integer> suppressedWarnings;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;
            @XmlAttribute(name = "PropId", required = true)
            protected String propId;
            @XmlAttribute(name = "Owner", required = true)
            protected String owner;

            /**
             * Gets the value of the tableAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableAlias() {
                return tableAlias;
            }

            /**
             * Sets the value of the tableAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableAlias(String value) {
                this.tableAlias = value;
            }

            /**
             * Gets the value of the propAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropAlias() {
                return propAlias;
            }

            /**
             * Sets the value of the propAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropAlias(String value) {
                this.propAlias = value;
            }

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the suppressedWarnings property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the suppressedWarnings property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSuppressedWarnings().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getSuppressedWarnings() {
                if (suppressedWarnings == null) {
                    suppressedWarnings = new ArrayList<Integer>();
                }
                return this.suppressedWarnings;
            }

            /**
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
            }

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
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
         *         &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ColumnId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "columnName"
        })
        public static class ReportColumnsVisibilityPreprocessor {

            @XmlElement(name = "ColumnName", required = true)
            protected String columnName;
            @XmlAttribute(name = "ColumnId", required = true)
            protected String columnId;

            /**
             * Gets the value of the columnName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColumnName() {
                return columnName;
            }

            /**
             * Sets the value of the columnName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColumnName(String value) {
                this.columnName = value;
            }

            /**
             * Gets the value of the columnId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColumnId() {
                return columnId;
            }

            /**
             * Sets the value of the columnId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColumnId(String value) {
                this.columnId = value;
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
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="SequenceId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Postfix" default="NONE"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="CUR_VAL"/&gt;
         *             &lt;enumeration value="NEXT_VAL"/&gt;
         *             &lt;enumeration value="NONE"/&gt;
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
        @XmlType(name = "", propOrder = {
            "sql"
        })
        public static class SequenceDbName {

            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "SequenceId", required = true)
            protected String sequenceId;
            @XmlAttribute(name = "Postfix")
            protected String postfix;

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the sequenceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequenceId() {
                return sequenceId;
            }

            /**
             * Sets the value of the sequenceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequenceId(String value) {
                this.sequenceId = value;
            }

            /**
             * Gets the value of the postfix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostfix() {
                if (postfix == null) {
                    return "NONE";
                } else {
                    return postfix;
                }
            }

            /**
             * Sets the value of the postfix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostfix(String value) {
                this.postfix = value;
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
         *         &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tableAlias",
            "sql"
        })
        public static class TableSqlName {

            @XmlElement(name = "TableAlias")
            protected String tableAlias;
            @XmlElement(name = "Sql")
            protected String sql;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;

            /**
             * Gets the value of the tableAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableAlias() {
                return tableAlias;
            }

            /**
             * Sets the value of the tableAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableAlias(String value) {
                this.tableAlias = value;
            }

            /**
             * Gets the value of the sql property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSql() {
                return sql;
            }

            /**
             * Sets the value of the sql property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSql(String value) {
                this.sql = value;
            }

            /**
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
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
         *         &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *                 &lt;attribute name="Value"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="DbTypeName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DbVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CheckVersion" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="VersionOperator"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CheckOptions" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "option"
        })
        public static class TargetDbPreprocessor {

            @XmlElement(name = "Option")
            protected List<Sqml.Item.TargetDbPreprocessor.Option> option;
            @XmlAttribute(name = "DbTypeName", required = true)
            protected String dbTypeName;
            @XmlAttribute(name = "DbVersion")
            protected String dbVersion;
            @XmlAttribute(name = "CheckVersion", required = true)
            protected boolean checkVersion;
            @XmlAttribute(name = "VersionOperator")
            protected String versionOperator;
            @XmlAttribute(name = "CheckOptions", required = true)
            protected boolean checkOptions;

            /**
             * Gets the value of the option property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the option property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Sqml.Item.TargetDbPreprocessor.Option }
             * 
             * 
             */
            public List<Sqml.Item.TargetDbPreprocessor.Option> getOption() {
                if (option == null) {
                    option = new ArrayList<Sqml.Item.TargetDbPreprocessor.Option>();
                }
                return this.option;
            }

            /**
             * Gets the value of the dbTypeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDbTypeName() {
                return dbTypeName;
            }

            /**
             * Sets the value of the dbTypeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDbTypeName(String value) {
                this.dbTypeName = value;
            }

            /**
             * Gets the value of the dbVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDbVersion() {
                return dbVersion;
            }

            /**
             * Sets the value of the dbVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDbVersion(String value) {
                this.dbVersion = value;
            }

            /**
             * Gets the value of the checkVersion property.
             * 
             */
            public boolean isCheckVersion() {
                return checkVersion;
            }

            /**
             * Sets the value of the checkVersion property.
             * 
             */
            public void setCheckVersion(boolean value) {
                this.checkVersion = value;
            }

            /**
             * Gets the value of the versionOperator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersionOperator() {
                return versionOperator;
            }

            /**
             * Sets the value of the versionOperator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVersionOperator(String value) {
                this.versionOperator = value;
            }

            /**
             * Gets the value of the checkOptions property.
             * 
             */
            public boolean isCheckOptions() {
                return checkOptions;
            }

            /**
             * Sets the value of the checkOptions property.
             * 
             */
            public void setCheckOptions(boolean value) {
                this.checkOptions = value;
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
             *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *       &lt;attribute name="Value"&gt;
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
            @XmlType(name = "")
            public static class Option {

                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "Value")
                protected String value;

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
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
         *       &lt;attribute name="PidTranslationMode" default="PrimaryKeyProps"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PidTranslationSecondaryKeyId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ThisTableRef {

            @XmlAttribute(name = "PidTranslationMode")
            protected String pidTranslationMode;
            @XmlAttribute(name = "PidTranslationSecondaryKeyId")
            protected String pidTranslationSecondaryKeyId;

            /**
             * Gets the value of the pidTranslationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationMode() {
                if (pidTranslationMode == null) {
                    return "PrimaryKeyProps";
                } else {
                    return pidTranslationMode;
                }
            }

            /**
             * Sets the value of the pidTranslationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationMode(String value) {
                this.pidTranslationMode = value;
            }

            /**
             * Gets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPidTranslationSecondaryKeyId() {
                return pidTranslationSecondaryKeyId;
            }

            /**
             * Sets the value of the pidTranslationSecondaryKeyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPidTranslationSecondaryKeyId(String value) {
                this.pidTranslationSecondaryKeyId = value;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TypifiedCalcField {

            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;
            @XmlAttribute(name = "PropId", required = true)
            protected String propId;

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
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
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
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TableId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="PropId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="Literal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "displayValue"
        })
        public static class TypifiedValue {

            @XmlElement(name = "Value")
            protected String value;
            @XmlElement(name = "DisplayValue")
            protected String displayValue;
            @XmlAttribute(name = "TableId", required = true)
            protected String tableId;
            @XmlAttribute(name = "PropId", required = true)
            protected String propId;
            @XmlAttribute(name = "Literal")
            protected Boolean literal;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the displayValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayValue() {
                return displayValue;
            }

            /**
             * Sets the value of the displayValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayValue(String value) {
                this.displayValue = value;
            }

            /**
             * Gets the value of the tableId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTableId() {
                return tableId;
            }

            /**
             * Sets the value of the tableId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTableId(String value) {
                this.tableId = value;
            }

            /**
             * Gets the value of the propId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropId() {
                return propId;
            }

            /**
             * Sets the value of the propId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropId(String value) {
                this.propId = value;
            }

            /**
             * Gets the value of the literal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isLiteral() {
                if (literal == null) {
                    return false;
                } else {
                    return literal;
                }
            }

            /**
             * Sets the value of the literal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLiteral(Boolean value) {
                this.literal = value;
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
         *         &lt;element name="Item" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="SchemaId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *                 &lt;attribute name="IsAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *                 &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
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
            "item"
        })
        public static class XPath {

            @XmlElement(name = "Item", required = true)
            protected List<Sqml.Item.XPath.XPathItem> item;

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
             * {@link Sqml.Item.XPath.XPathItem }
             * 
             * 
             */
            public List<Sqml.Item.XPath.XPathItem> getItem() {
                if (item == null) {
                    item = new ArrayList<Sqml.Item.XPath.XPathItem>();
                }
                return this.item;
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
             *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="SchemaId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
             *       &lt;attribute name="IsAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
             *       &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "condition"
            })
            public static class XPathItem {

                @XmlElement(name = "Condition")
                protected String condition;
                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "SchemaId", required = true)
                protected String schemaId;
                @XmlAttribute(name = "IsAttribute")
                protected Boolean isAttribute;
                @XmlAttribute(name = "Index")
                protected Long index;

                /**
                 * Gets the value of the condition property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCondition() {
                    return condition;
                }

                /**
                 * Sets the value of the condition property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCondition(String value) {
                    this.condition = value;
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
                 * Gets the value of the schemaId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchemaId() {
                    return schemaId;
                }

                /**
                 * Sets the value of the schemaId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchemaId(String value) {
                    this.schemaId = value;
                }

                /**
                 * Gets the value of the isAttribute property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isIsAttribute() {
                    if (isAttribute == null) {
                        return false;
                    } else {
                        return isAttribute;
                    }
                }

                /**
                 * Sets the value of the isAttribute property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsAttribute(Boolean value) {
                    this.isAttribute = value;
                }

                /**
                 * Gets the value of the index property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getIndex() {
                    return index;
                }

                /**
                 * Sets the value of the index property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setIndex(Long value) {
                    this.index = value;
                }

            }

        }

    }

}
