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
 * <p>Java class for CB_200_85 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CB_200_85">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.visa.com/ROLSI}CBType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssrCaseNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnMethodDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}OtherMethodDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchReceivedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnAuthNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ShipTrackNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SignedByName" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DeliveryAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantInstructionDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnPolicyCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnPolicyDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CancelDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CancelNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SpokeWith" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CancelPolicyCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CancelPolicyDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VoucherReceivedCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VoucherDatedCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VoucherDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}InvoiceReceiptNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactName" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRMerchantResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NotApplicableDueToLocalLawInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NoATRDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargeBackCardholderInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}GoodsServicesCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchandiseReturnedCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantReturnRefusalInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchandiseLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ServiceCancelledCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccommodationsDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccommodationsLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccommodationsProvidedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CopyCreditTranNotProcessedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnToQueue" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}OriginalCreditNotAcceptedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}OriginalCreditNotAcceptedReasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantBilledForMoreThan1NightForNoShowInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantRefusedReturnAuthInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantRefusedReturnedMerchandiseInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantInformedCardholderNotToReturnInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}WasCancellationCodeGivenInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReservationMadeWithin72HrsAndCancelledBy6PMArrivalDayInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantDidNotAcceptCancellationPriorToSpecifiedTimeInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}WhyWasCancellationCodeNotGivenDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CancellationCodeGivenButNotAdvisedToRetainInd" minOccurs="0"/>
 *         &lt;element name="ReservationMadeWithin24HrsOfConfAndCancelledProperlyInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *         &lt;element name="CancelMethodDesc" type="{http://www.visa.com/ROLSI}Desc2000Type" minOccurs="0"/>
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
@XmlType(name = "CB_200_85")
public class CB20085
    extends CBType
{


}