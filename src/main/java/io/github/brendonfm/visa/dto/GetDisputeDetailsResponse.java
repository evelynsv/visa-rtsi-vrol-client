//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetDisputeDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}GetDisputeDetailsResponseType" minOccurs="0"/>
 *         &lt;element name="DisputeAsImageResponseDescriptor" type="{http://www.visa.com/ROLSI}DisputeAsImageResponseDescriptorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeDetailsResponse", propOrder = {
    "transactionInfo",
    "visaCaseNumber",
    "disputeId",
    "fraudReportID",
    "isRdrInfoAvailable",
    "fraudRptInd",
    "ppcsInd",
    "eflInd",
    "aemInd",
    "atrSelectionReqdInd",
    "memberCaseNumber",
    "questionnaireRecalledDate",
    "fraudBundleID",
    "disputeCategory",
    "disputeCondition",
    "disputeCategoryCondition",
    "disputeAmount",
    "exceptionCPD",
    "disputeCardholderInfo",
    "note",
    "disputeAmountChangeReason",
    "createDisputeFinancial",
    "transactionMessageFormat",
    "explanationOfCreditPresented",
    "eflDateCRBRegions",
    "crbRegions",
    "authorization",
    "authorizationNotObtained",
    "fullAuthorizationNotObtained",
    "authorizationNotObtainedForCardType",
    "fraudReportedDate",
    "fullMagStripeNotRead",
    "cvvPresent",
    "pinPadPresentNotWorking",
    "fraud",
    "fraudType",
    "matchingAuthTranId",
    "authorizationDate",
    "authorizationCode",
    "processingError",
    "requestDate",
    "cancellationType",
    "consumer",
    "issuerAcquirerContactInfo",
    "associatedTransGroupId",
    "disputeHistorySummary",
    "recallInd",
    "recallReason",
    "isParcelado",
    "disputeImageAttachment",
    "disputeAsImageResponseDescriptor"
})
public class GetDisputeDetailsResponse {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "DisputeId")
    protected Long disputeId;
    @XmlElement(name = "FraudReportID")
    protected Long fraudReportID;
    @XmlElement(name = "IsRdrInfoAvailable")
    @XmlSchemaType(name = "string")
    protected YNType isRdrInfoAvailable;
    @XmlElement(name = "FraudRptInd")
    @XmlSchemaType(name = "string")
    protected FraudRptIndType fraudRptInd;
    @XmlElement(name = "PPCSInd")
    @XmlSchemaType(name = "string")
    protected PPCSIndType ppcsInd;
    @XmlElement(name = "EFLInd")
    @XmlSchemaType(name = "string")
    protected EFLIndType eflInd;
    @XmlElement(name = "AEMInd")
    @XmlSchemaType(name = "string")
    protected AEMIndType aemInd;
    @XmlElement(name = "ATRSelectionReqdInd")
    @XmlSchemaType(name = "string")
    protected ATRSelectionReqdIndType atrSelectionReqdInd;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "QuestionnaireRecalledDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar questionnaireRecalledDate;
    @XmlElement(name = "FraudBundleID")
    protected Long fraudBundleID;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "DisputeCondition")
    protected String disputeCondition;
    @XmlElement(name = "DisputeCategoryCondition")
    protected String disputeCategoryCondition;
    @XmlElement(name = "DisputeAmount")
    protected AmountType disputeAmount;
    @XmlElement(name = "ExceptionCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exceptionCPD;
    @XmlElement(name = "DisputeCardholderInfo")
    protected DisputeCardholderInfoType disputeCardholderInfo;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "DisputeAmountChangeReason")
    protected String disputeAmountChangeReason;
    @XmlElement(name = "CreateDisputeFinancial")
    @XmlSchemaType(name = "string")
    protected YNType createDisputeFinancial;
    @XmlElement(name = "TransactionMessageFormat")
    protected String transactionMessageFormat;
    @XmlElement(name = "ExplanationOfCreditPresented")
    protected String explanationOfCreditPresented;
    @XmlElement(name = "EFLDateCRBRegions")
    protected String eflDateCRBRegions;
    @XmlElement(name = "CRBRegions")
    protected String crbRegions;
    @XmlElement(name = "Authorization")
    protected DisputeAuthorizationType authorization;
    @XmlElement(name = "AuthorizationNotObtained")
    protected Boolean authorizationNotObtained;
    @XmlElement(name = "FullAuthorizationNotObtained")
    protected Boolean fullAuthorizationNotObtained;
    @XmlElement(name = "AuthorizationNotObtainedForCardType")
    protected Boolean authorizationNotObtainedForCardType;
    @XmlElement(name = "FraudReportedDate")
    protected String fraudReportedDate;
    @XmlElement(name = "FullMagStripeNotRead")
    protected Boolean fullMagStripeNotRead;
    @XmlElement(name = "CVVPresent")
    protected Boolean cvvPresent;
    @XmlElement(name = "PINPadPresentNotWorking")
    protected Boolean pinPadPresentNotWorking;
    @XmlElement(name = "Fraud")
    protected DisputeFraudType fraud;
    @XmlElement(name = "FraudType")
    protected String fraudType;
    @XmlElement(name = "MatchingAuthTranId", type = Long.class)
    protected List<Long> matchingAuthTranId;
    @XmlElement(name = "AuthorizationDate")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> authorizationDate;
    @XmlElement(name = "AuthorizationCode")
    protected List<String> authorizationCode;
    @XmlElement(name = "ProcessingError")
    protected DisputeProcessingErrorType processingError;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "CancellationType")
    protected String cancellationType;
    @XmlElement(name = "Consumer")
    protected ConsumerDisputesType consumer;
    @XmlElement(name = "IssuerAcquirerContactInfo")
    protected IssuerAcquirerContactInfoType issuerAcquirerContactInfo;
    @XmlElement(name = "AssociatedTransGroupId")
    protected Long associatedTransGroupId;
    @XmlElement(name = "DisputeHistorySummary")
    protected DisputeHistorySummaryType disputeHistorySummary;
    @XmlElement(name = "RecallInd")
    protected Boolean recallInd;
    @XmlElement(name = "RecallReason")
    protected String recallReason;
    @XmlElement(name = "IsParcelado")
    @XmlSchemaType(name = "string")
    protected YNType isParcelado;
    @XmlElement(name = "DisputeImageAttachment")
    protected DisputeAttachmentDescriptorType disputeImageAttachment;
    @XmlElement(name = "DisputeAsImageResponseDescriptor")
    protected DisputeAsImageResponseDescriptorType disputeAsImageResponseDescriptor;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public TranHeaderInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public void setTransactionInfo(TranHeaderInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeId() {
        return disputeId;
    }

    /**
     * Sets the value of the disputeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeId(Long value) {
        this.disputeId = value;
    }

    /**
     * Gets the value of the fraudReportID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFraudReportID() {
        return fraudReportID;
    }

    /**
     * Sets the value of the fraudReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFraudReportID(Long value) {
        this.fraudReportID = value;
    }

    /**
     * Gets the value of the isRdrInfoAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getIsRdrInfoAvailable() {
        return isRdrInfoAvailable;
    }

    /**
     * Sets the value of the isRdrInfoAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setIsRdrInfoAvailable(YNType value) {
        this.isRdrInfoAvailable = value;
    }

    /**
     * Gets the value of the fraudRptInd property.
     * 
     * @return
     *     possible object is
     *     {@link FraudRptIndType }
     *     
     */
    public FraudRptIndType getFraudRptInd() {
        return fraudRptInd;
    }

    /**
     * Sets the value of the fraudRptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudRptIndType }
     *     
     */
    public void setFraudRptInd(FraudRptIndType value) {
        this.fraudRptInd = value;
    }

    /**
     * Gets the value of the ppcsInd property.
     * 
     * @return
     *     possible object is
     *     {@link PPCSIndType }
     *     
     */
    public PPCSIndType getPPCSInd() {
        return ppcsInd;
    }

    /**
     * Sets the value of the ppcsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPCSIndType }
     *     
     */
    public void setPPCSInd(PPCSIndType value) {
        this.ppcsInd = value;
    }

    /**
     * Gets the value of the eflInd property.
     * 
     * @return
     *     possible object is
     *     {@link EFLIndType }
     *     
     */
    public EFLIndType getEFLInd() {
        return eflInd;
    }

    /**
     * Sets the value of the eflInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFLIndType }
     *     
     */
    public void setEFLInd(EFLIndType value) {
        this.eflInd = value;
    }

    /**
     * Gets the value of the aemInd property.
     * 
     * @return
     *     possible object is
     *     {@link AEMIndType }
     *     
     */
    public AEMIndType getAEMInd() {
        return aemInd;
    }

    /**
     * Sets the value of the aemInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AEMIndType }
     *     
     */
    public void setAEMInd(AEMIndType value) {
        this.aemInd = value;
    }

    /**
     * Gets the value of the atrSelectionReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link ATRSelectionReqdIndType }
     *     
     */
    public ATRSelectionReqdIndType getATRSelectionReqdInd() {
        return atrSelectionReqdInd;
    }

    /**
     * Sets the value of the atrSelectionReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATRSelectionReqdIndType }
     *     
     */
    public void setATRSelectionReqdInd(ATRSelectionReqdIndType value) {
        this.atrSelectionReqdInd = value;
    }

    /**
     * Gets the value of the memberCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCaseNumber() {
        return memberCaseNumber;
    }

    /**
     * Sets the value of the memberCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCaseNumber(String value) {
        this.memberCaseNumber = value;
    }

    /**
     * Gets the value of the questionnaireRecalledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionnaireRecalledDate() {
        return questionnaireRecalledDate;
    }

    /**
     * Sets the value of the questionnaireRecalledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionnaireRecalledDate(XMLGregorianCalendar value) {
        this.questionnaireRecalledDate = value;
    }

    /**
     * Gets the value of the fraudBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFraudBundleID() {
        return fraudBundleID;
    }

    /**
     * Sets the value of the fraudBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFraudBundleID(Long value) {
        this.fraudBundleID = value;
    }

    /**
     * Gets the value of the disputeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCategoryType }
     *     
     */
    public DisputeCategoryType getDisputeCategory() {
        return disputeCategory;
    }

    /**
     * Sets the value of the disputeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCategoryType }
     *     
     */
    public void setDisputeCategory(DisputeCategoryType value) {
        this.disputeCategory = value;
    }

    /**
     * Gets the value of the disputeCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCondition() {
        return disputeCondition;
    }

    /**
     * Sets the value of the disputeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCondition(String value) {
        this.disputeCondition = value;
    }

    /**
     * Gets the value of the disputeCategoryCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCategoryCondition() {
        return disputeCategoryCondition;
    }

    /**
     * Sets the value of the disputeCategoryCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCategoryCondition(String value) {
        this.disputeCategoryCondition = value;
    }

    /**
     * Gets the value of the disputeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisputeAmount() {
        return disputeAmount;
    }

    /**
     * Sets the value of the disputeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisputeAmount(AmountType value) {
        this.disputeAmount = value;
    }

    /**
     * Gets the value of the exceptionCPD property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceptionCPD() {
        return exceptionCPD;
    }

    /**
     * Sets the value of the exceptionCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceptionCPD(XMLGregorianCalendar value) {
        this.exceptionCPD = value;
    }

    /**
     * Gets the value of the disputeCardholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCardholderInfoType }
     *     
     */
    public DisputeCardholderInfoType getDisputeCardholderInfo() {
        return disputeCardholderInfo;
    }

    /**
     * Sets the value of the disputeCardholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCardholderInfoType }
     *     
     */
    public void setDisputeCardholderInfo(DisputeCardholderInfoType value) {
        this.disputeCardholderInfo = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the disputeAmountChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeAmountChangeReason() {
        return disputeAmountChangeReason;
    }

    /**
     * Sets the value of the disputeAmountChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeAmountChangeReason(String value) {
        this.disputeAmountChangeReason = value;
    }

    /**
     * Gets the value of the createDisputeFinancial property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getCreateDisputeFinancial() {
        return createDisputeFinancial;
    }

    /**
     * Sets the value of the createDisputeFinancial property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setCreateDisputeFinancial(YNType value) {
        this.createDisputeFinancial = value;
    }

    /**
     * Gets the value of the transactionMessageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMessageFormat() {
        return transactionMessageFormat;
    }

    /**
     * Sets the value of the transactionMessageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMessageFormat(String value) {
        this.transactionMessageFormat = value;
    }

    /**
     * Gets the value of the explanationOfCreditPresented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationOfCreditPresented() {
        return explanationOfCreditPresented;
    }

    /**
     * Sets the value of the explanationOfCreditPresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationOfCreditPresented(String value) {
        this.explanationOfCreditPresented = value;
    }

    /**
     * Gets the value of the eflDateCRBRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFLDateCRBRegions() {
        return eflDateCRBRegions;
    }

    /**
     * Sets the value of the eflDateCRBRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFLDateCRBRegions(String value) {
        this.eflDateCRBRegions = value;
    }

    /**
     * Gets the value of the crbRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBRegions() {
        return crbRegions;
    }

    /**
     * Sets the value of the crbRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBRegions(String value) {
        this.crbRegions = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAuthorizationType }
     *     
     */
    public DisputeAuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAuthorizationType }
     *     
     */
    public void setAuthorization(DisputeAuthorizationType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the authorizationNotObtained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizationNotObtained() {
        return authorizationNotObtained;
    }

    /**
     * Sets the value of the authorizationNotObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizationNotObtained(Boolean value) {
        this.authorizationNotObtained = value;
    }

    /**
     * Gets the value of the fullAuthorizationNotObtained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullAuthorizationNotObtained() {
        return fullAuthorizationNotObtained;
    }

    /**
     * Sets the value of the fullAuthorizationNotObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullAuthorizationNotObtained(Boolean value) {
        this.fullAuthorizationNotObtained = value;
    }

    /**
     * Gets the value of the authorizationNotObtainedForCardType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizationNotObtainedForCardType() {
        return authorizationNotObtainedForCardType;
    }

    /**
     * Sets the value of the authorizationNotObtainedForCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizationNotObtainedForCardType(Boolean value) {
        this.authorizationNotObtainedForCardType = value;
    }

    /**
     * Gets the value of the fraudReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudReportedDate() {
        return fraudReportedDate;
    }

    /**
     * Sets the value of the fraudReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudReportedDate(String value) {
        this.fraudReportedDate = value;
    }

    /**
     * Gets the value of the fullMagStripeNotRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullMagStripeNotRead() {
        return fullMagStripeNotRead;
    }

    /**
     * Sets the value of the fullMagStripeNotRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullMagStripeNotRead(Boolean value) {
        this.fullMagStripeNotRead = value;
    }

    /**
     * Gets the value of the cvvPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCVVPresent() {
        return cvvPresent;
    }

    /**
     * Sets the value of the cvvPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCVVPresent(Boolean value) {
        this.cvvPresent = value;
    }

    /**
     * Gets the value of the pinPadPresentNotWorking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINPadPresentNotWorking() {
        return pinPadPresentNotWorking;
    }

    /**
     * Sets the value of the pinPadPresentNotWorking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINPadPresentNotWorking(Boolean value) {
        this.pinPadPresentNotWorking = value;
    }

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFraudType }
     *     
     */
    public DisputeFraudType getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFraudType }
     *     
     */
    public void setFraud(DisputeFraudType value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the fraudType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudType() {
        return fraudType;
    }

    /**
     * Sets the value of the fraudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudType(String value) {
        this.fraudType = value;
    }

    /**
     * Gets the value of the matchingAuthTranId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchingAuthTranId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchingAuthTranId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMatchingAuthTranId() {
        if (matchingAuthTranId == null) {
            matchingAuthTranId = new ArrayList<Long>();
        }
        return this.matchingAuthTranId;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getAuthorizationDate() {
        if (authorizationDate == null) {
            authorizationDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.authorizationDate;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuthorizationCode() {
        if (authorizationCode == null) {
            authorizationCode = new ArrayList<String>();
        }
        return this.authorizationCode;
    }

    /**
     * Gets the value of the processingError property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeProcessingErrorType }
     *     
     */
    public DisputeProcessingErrorType getProcessingError() {
        return processingError;
    }

    /**
     * Sets the value of the processingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeProcessingErrorType }
     *     
     */
    public void setProcessingError(DisputeProcessingErrorType value) {
        this.processingError = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the cancellationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationType() {
        return cancellationType;
    }

    /**
     * Sets the value of the cancellationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationType(String value) {
        this.cancellationType = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerDisputesType }
     *     
     */
    public ConsumerDisputesType getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerDisputesType }
     *     
     */
    public void setConsumer(ConsumerDisputesType value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the issuerAcquirerContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAcquirerContactInfoType }
     *     
     */
    public IssuerAcquirerContactInfoType getIssuerAcquirerContactInfo() {
        return issuerAcquirerContactInfo;
    }

    /**
     * Sets the value of the issuerAcquirerContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAcquirerContactInfoType }
     *     
     */
    public void setIssuerAcquirerContactInfo(IssuerAcquirerContactInfoType value) {
        this.issuerAcquirerContactInfo = value;
    }

    /**
     * Gets the value of the associatedTransGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssociatedTransGroupId() {
        return associatedTransGroupId;
    }

    /**
     * Sets the value of the associatedTransGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssociatedTransGroupId(Long value) {
        this.associatedTransGroupId = value;
    }

    /**
     * Gets the value of the disputeHistorySummary property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeHistorySummaryType }
     *     
     */
    public DisputeHistorySummaryType getDisputeHistorySummary() {
        return disputeHistorySummary;
    }

    /**
     * Sets the value of the disputeHistorySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeHistorySummaryType }
     *     
     */
    public void setDisputeHistorySummary(DisputeHistorySummaryType value) {
        this.disputeHistorySummary = value;
    }

    /**
     * Gets the value of the recallInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecallInd() {
        return recallInd;
    }

    /**
     * Sets the value of the recallInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallInd(Boolean value) {
        this.recallInd = value;
    }

    /**
     * Gets the value of the recallReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecallReason() {
        return recallReason;
    }

    /**
     * Sets the value of the recallReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecallReason(String value) {
        this.recallReason = value;
    }

    /**
     * Gets the value of the isParcelado property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getIsParcelado() {
        return isParcelado;
    }

    /**
     * Sets the value of the isParcelado property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setIsParcelado(YNType value) {
        this.isParcelado = value;
    }

    /**
     * Gets the value of the disputeImageAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public DisputeAttachmentDescriptorType getDisputeImageAttachment() {
        return disputeImageAttachment;
    }

    /**
     * Sets the value of the disputeImageAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public void setDisputeImageAttachment(DisputeAttachmentDescriptorType value) {
        this.disputeImageAttachment = value;
    }

    /**
     * Gets the value of the disputeAsImageResponseDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAsImageResponseDescriptorType }
     *     
     */
    public DisputeAsImageResponseDescriptorType getDisputeAsImageResponseDescriptor() {
        return disputeAsImageResponseDescriptor;
    }

    /**
     * Sets the value of the disputeAsImageResponseDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAsImageResponseDescriptorType }
     *     
     */
    public void setDisputeAsImageResponseDescriptor(DisputeAsImageResponseDescriptorType value) {
        this.disputeAsImageResponseDescriptor = value;
    }

}
