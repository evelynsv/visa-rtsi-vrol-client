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
 * <p>Java class for CB_300_62 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CB_300_62">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.visa.com/ROLSI}CBType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssrCaseNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargeBackCardholderInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DateTransReportedAsFraudType4" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DateOfListingOnExceptionFile" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardStatusAtTimeOfTrans" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}OtherStatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ElectronicSignatureInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CopyOfCardholderLetterInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CertificationCvvEncodedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CertificationCvvParticipantInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnToQueue" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CertificationCardholderDeniesTransInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CertificationChipCardInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CertificationTransNotChipDeviceInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/>
 *         &lt;element name="CertificationWithoutTransmitDataInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="CertificationVPayCardInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="CertificationCardTransactionCRDInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="CardholderDeniesAuthorizingDisputedTransactionInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="TransactionIsNotTakenPlaceAtEMVOrVISCompDeviceInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="TransactionisTakenPlaceAtEMVOrVISCompDeviceInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SecureTelephoneBankingSessionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SecureTelephoneBankingSessionDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerRepresentativeName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="createFinancial" type="{http://www.visa.com/ROLSI}YNType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CB_300_62")
public class CB30062
    extends CBType
{


}
