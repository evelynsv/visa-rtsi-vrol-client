//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateDisputePreArbResponseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDisputePreArbResponseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputePreArbResponseId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreateDisputeFinancial" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionMessageFormat" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeCardholderInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.visa.com/ROLSI}CreateDisputePreArbResponseRequest" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.visa.com/ROLSI}DisputeCaseActionType" minOccurs="0"/>
 *         &lt;element name="SupplyDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDisputePreArbResponseRequestType", propOrder = {
    "visaCaseNumber",
    "disputePreArbResponseId",
    "memberCaseNumber",
    "createDisputeFinancial",
    "transactionMessageFormat",
    "disputeCardholderInfo",
    "merchantContactInfo",
    "note",
    "exceptionCPD",
    "preArbResponse",
    "acceptanceAmount",
    "providingNewInfoInd",
    "newInformationDetails",
    "liabilityNotAcceptedFully",
    "issuerCertifiesCardholderCompEvidence",
    "cardholderNameAddressNotMatchInd",
    "cardholderContinuesDispute",
    "explainContinuingDispute",
    "atmRecordRequiredForLegalInd",
    "explainATMRecordRequiredForLegal",
    "issuerAcquirerContactInfo",
    "paymentInstructions",
    "howAmountBeSent",
    "disputeAttachmentDescriptor",
    "docIdList",
    "action",
    "supplyDocInd"
})
public class CreateDisputePreArbResponseRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "DisputePreArbResponseId")
    protected Long disputePreArbResponseId;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "CreateDisputeFinancial")
    @XmlSchemaType(name = "string")
    protected YNType createDisputeFinancial;
    @XmlElement(name = "TransactionMessageFormat")
    protected String transactionMessageFormat;
    @XmlElement(name = "DisputeCardholderInfo")
    protected DisputeCardholderInfoType disputeCardholderInfo;
    @XmlElement(name = "MerchantContactInfo")
    protected MerchantContactInfoType merchantContactInfo;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "ExceptionCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exceptionCPD;
    @XmlElement(name = "PreArbResponse")
    @XmlSchemaType(name = "string")
    protected DisputeResponseType preArbResponse;
    @XmlElement(name = "AcceptanceAmount")
    protected AmountType acceptanceAmount;
    @XmlElement(name = "ProvidingNewInfoInd")
    @XmlSchemaType(name = "string")
    protected YNType providingNewInfoInd;
    @XmlElement(name = "NewInformationDetails")
    protected String newInformationDetails;
    @XmlElement(name = "LiabilityNotAcceptedFully")
    protected String liabilityNotAcceptedFully;
    @XmlElement(name = "IssuerCertifiesCardholderCompEvidence")
    @XmlSchemaType(name = "string")
    protected YNType issuerCertifiesCardholderCompEvidence;
    @XmlElement(name = "CardholderNameAddressNotMatchInd")
    @XmlSchemaType(name = "string")
    protected YNType cardholderNameAddressNotMatchInd;
    @XmlElement(name = "CardholderContinuesDispute")
    protected String cardholderContinuesDispute;
    @XmlElement(name = "ExplainContinuingDispute")
    protected String explainContinuingDispute;
    @XmlElement(name = "ATMRecordRequiredForLegalInd")
    protected Boolean atmRecordRequiredForLegalInd;
    @XmlElement(name = "ExplainATMRecordRequiredForLegal")
    protected String explainATMRecordRequiredForLegal;
    @XmlElement(name = "IssuerAcquirerContactInfo")
    protected IssuerAcquirerContactInfoType issuerAcquirerContactInfo;
    @XmlElement(name = "PaymentInstructions")
    protected String paymentInstructions;
    @XmlElement(name = "HowAmountBeSent")
    @XmlSchemaType(name = "string")
    protected AmountSentType howAmountBeSent;
    @XmlElement(name = "DisputeAttachmentDescriptor")
    protected DisputeAttachmentDescriptorType disputeAttachmentDescriptor;
    @XmlElement(name = "DocIdList")
    protected DocIdListType docIdList;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected DisputeCaseActionType action;
    @XmlElement(name = "SupplyDocInd")
    protected Boolean supplyDocInd;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputePreArbResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreArbResponseId() {
        return disputePreArbResponseId;
    }

    /**
     * Sets the value of the disputePreArbResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreArbResponseId(Long value) {
        this.disputePreArbResponseId = value;
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
     * Gets the value of the merchantContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantContactInfoType }
     *     
     */
    public MerchantContactInfoType getMerchantContactInfo() {
        return merchantContactInfo;
    }

    /**
     * Sets the value of the merchantContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantContactInfoType }
     *     
     */
    public void setMerchantContactInfo(MerchantContactInfoType value) {
        this.merchantContactInfo = value;
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
     * Gets the value of the preArbResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResponseType }
     *     
     */
    public DisputeResponseType getPreArbResponse() {
        return preArbResponse;
    }

    /**
     * Sets the value of the preArbResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResponseType }
     *     
     */
    public void setPreArbResponse(DisputeResponseType value) {
        this.preArbResponse = value;
    }

    /**
     * Gets the value of the acceptanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcceptanceAmount() {
        return acceptanceAmount;
    }

    /**
     * Sets the value of the acceptanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcceptanceAmount(AmountType value) {
        this.acceptanceAmount = value;
    }

    /**
     * Gets the value of the providingNewInfoInd property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getProvidingNewInfoInd() {
        return providingNewInfoInd;
    }

    /**
     * Sets the value of the providingNewInfoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setProvidingNewInfoInd(YNType value) {
        this.providingNewInfoInd = value;
    }

    /**
     * Gets the value of the newInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewInformationDetails() {
        return newInformationDetails;
    }

    /**
     * Sets the value of the newInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewInformationDetails(String value) {
        this.newInformationDetails = value;
    }

    /**
     * Gets the value of the liabilityNotAcceptedFully property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiabilityNotAcceptedFully() {
        return liabilityNotAcceptedFully;
    }

    /**
     * Sets the value of the liabilityNotAcceptedFully property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiabilityNotAcceptedFully(String value) {
        this.liabilityNotAcceptedFully = value;
    }

    /**
     * Gets the value of the issuerCertifiesCardholderCompEvidence property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getIssuerCertifiesCardholderCompEvidence() {
        return issuerCertifiesCardholderCompEvidence;
    }

    /**
     * Sets the value of the issuerCertifiesCardholderCompEvidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setIssuerCertifiesCardholderCompEvidence(YNType value) {
        this.issuerCertifiesCardholderCompEvidence = value;
    }

    /**
     * Gets the value of the cardholderNameAddressNotMatchInd property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getCardholderNameAddressNotMatchInd() {
        return cardholderNameAddressNotMatchInd;
    }

    /**
     * Sets the value of the cardholderNameAddressNotMatchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setCardholderNameAddressNotMatchInd(YNType value) {
        this.cardholderNameAddressNotMatchInd = value;
    }

    /**
     * Gets the value of the cardholderContinuesDispute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderContinuesDispute() {
        return cardholderContinuesDispute;
    }

    /**
     * Sets the value of the cardholderContinuesDispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderContinuesDispute(String value) {
        this.cardholderContinuesDispute = value;
    }

    /**
     * Gets the value of the explainContinuingDispute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplainContinuingDispute() {
        return explainContinuingDispute;
    }

    /**
     * Sets the value of the explainContinuingDispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplainContinuingDispute(String value) {
        this.explainContinuingDispute = value;
    }

    /**
     * Gets the value of the atmRecordRequiredForLegalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isATMRecordRequiredForLegalInd() {
        return atmRecordRequiredForLegalInd;
    }

    /**
     * Sets the value of the atmRecordRequiredForLegalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setATMRecordRequiredForLegalInd(Boolean value) {
        this.atmRecordRequiredForLegalInd = value;
    }

    /**
     * Gets the value of the explainATMRecordRequiredForLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplainATMRecordRequiredForLegal() {
        return explainATMRecordRequiredForLegal;
    }

    /**
     * Sets the value of the explainATMRecordRequiredForLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplainATMRecordRequiredForLegal(String value) {
        this.explainATMRecordRequiredForLegal = value;
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
     * Gets the value of the paymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Sets the value of the paymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstructions(String value) {
        this.paymentInstructions = value;
    }

    /**
     * Gets the value of the howAmountBeSent property.
     * 
     * @return
     *     possible object is
     *     {@link AmountSentType }
     *     
     */
    public AmountSentType getHowAmountBeSent() {
        return howAmountBeSent;
    }

    /**
     * Sets the value of the howAmountBeSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountSentType }
     *     
     */
    public void setHowAmountBeSent(AmountSentType value) {
        this.howAmountBeSent = value;
    }

    /**
     * Gets the value of the disputeAttachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public DisputeAttachmentDescriptorType getDisputeAttachmentDescriptor() {
        return disputeAttachmentDescriptor;
    }

    /**
     * Sets the value of the disputeAttachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public void setDisputeAttachmentDescriptor(DisputeAttachmentDescriptorType value) {
        this.disputeAttachmentDescriptor = value;
    }

    /**
     * Gets the value of the docIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DocIdListType }
     *     
     */
    public DocIdListType getDocIdList() {
        return docIdList;
    }

    /**
     * Sets the value of the docIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocIdListType }
     *     
     */
    public void setDocIdList(DocIdListType value) {
        this.docIdList = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCaseActionType }
     *     
     */
    public DisputeCaseActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCaseActionType }
     *     
     */
    public void setAction(DisputeCaseActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the supplyDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplyDocInd() {
        return supplyDocInd;
    }

    /**
     * Sets the value of the supplyDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplyDocInd(Boolean value) {
        this.supplyDocInd = value;
    }

}
