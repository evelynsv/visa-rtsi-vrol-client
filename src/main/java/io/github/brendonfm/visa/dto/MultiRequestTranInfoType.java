//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRequestTranInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRequestTranInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.visa.com/ROLSI}SingleRequestTranInfoType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}DisputeRfiGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionAmount" minOccurs="0"/>
 *         &lt;group ref="{http://www.visa.com/ROLSI}MerchantGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ECMOTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReimbursementAttribute" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SpecialConditionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ManualTransactionCategory" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/>
 *         &lt;element name="AdditionalFnInfo" type="{http://www.visa.com/ROLSI}RTAdditionalFinInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}QuestionnaireType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRequestTranInfoType")
public class MultiRequestTranInfoType
    extends SingleRequestTranInfoType
{


}