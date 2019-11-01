//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBodyType")
@XmlSeeAlso({
    SIInquiryExceptionResponseType.class,
    HyperSearchResponseBodyType.class,
    SIGetBatchQueueResponseType.class,
    LinkUnlinkCaseResponseBodyType.class,
    SILinkAsSameDisputeResponseType.class,
    AccountingEntryResponseBodyType.class,
    LoginRequestResponseBodyType.class,
    SIGetQuestionnaireDataResponseType.class,
    SIGetDisputeDetailsResponseType.class,
    SISubmitQFDisputeQuestionnaireResponseType.class,
    SILinkUnlinkCasesResponseType.class,
    SIGetCaseDetailsResponseType.class,
    SISubmitPurchaseInquiryResponseType.class,
    UnmatchedItemResponseBodyType.class,
    SIConfirmFraudReportResponseType.class,
    SICreateCaseFromTransactionResponseType.class,
    SIGetDisputeFilingDetailsResponseType.class,
    SIGetPurchaseInquiryResponseType.class,
    SIGetTransInquiryResultsResponseType.class,
    SIGetTransactionsFromCaseResponseType.class,
    SIGetImageResponseType.class,
    SIUploadImageResponseType.class,
    QuickFormResponseBodyType.class,
    SIGetMerchantNotificationDetailsResponseType.class,
    SISubmitDisputeFilingResponseType.class,
    SICardholderPurchaseInquiryResponseType.class,
    SIUploadMessageImageResponseType.class,
    SICreateDisputePreCompResponseResponseType.class,
    SICloseRFCResponseType.class,
    SIGetRFCNonFulfillmentResponseType.class,
    SISubmitFraudBundleDisputeQuestionnaireResponseType.class,
    SIGetGMFPDetailsResponseType.class,
    SIViewPotentialVDASMatchesResponseType.class,
    SIAssociatedTranSelectionResponseType.class,
    SICloseMiscFeeResponseType.class,
    SIGetQueueResponseType.class,
    SIGetFraudReportDetailsResponseType.class,
    SIIgnoreVDASResponseType.class,
    SISubmitDisputeQuestionnaireResponseType.class,
    ExceptionResponseBodyType.class,
    SIGetMiscFeeDetailsResponseType.class,
    SISubmitAccountingEntryResponseType.class,
    SIAcceptDisputeResponseType.class,
    SIGetDisputePreCompDetailsResponseType.class,
    SIGetAllTransDetailsResponseType.class,
    SICreateDisputeResponseResponseType.class,
    PPCSResponseBodyType.class,
    SIChangeDisputeStatusResponseType.class,
    MessageResponseBodyType.class,
    SIDisputeQuestionnaireResponseType.class,
    SICreateDisputePreArbResponseType.class,
    SIGetExceptionDetailsResponseType.class,
    IgnoreRejectResponseBodyType.class,
    SIGetAdjustmentDetailsResponseType.class,
    FraudReportResponseBodyType.class,
    SIAccountingEntryDetailsResponseType.class,
    SIGetActiveScheduleResponseType.class,
    SIMarkBatchQueueItemAsReadResponseType.class,
    SISubmitMiscFeeResponseType.class,
    SISubmitAdjustmentResponseType.class,
    SISubmitRFCResponseType.class,
    SISetTransactionForCaseResponseType.class,
    SISubmitTranInquiryResponseType.class,
    SIGetDisputeResponseDetailsResponseType.class,
    SIGetVDASDetailsResponseType.class,
    TransactionInquiryResponseBodyType.class,
    SISubmitStopPaymentInquiryResponseType.class,
    DisputeResponseBodyType.class,
    FinancialResponseBodyType.class,
    SIGetPotentialMatchesResponseType.class,
    SISubmitCollaborationResponseType.class,
    SIGetContactMessageResponseType.class,
    SIGetFinancialDetailsResponseType.class,
    SIGetDisputePreArbResponseDetailsResponseType.class,
    SIGetMessageResponseType.class,
    SISubmitFraudReportResponseType.class,
    SICloseTransactionResponseType.class,
    MyQueueResponseBodyType.class,
    SIGetRdrDetailsResponseType.class,
    SISubmitStopPaymentOrderResponseType.class,
    GetGMFPItemDetailsResponseBodyType.class,
    SIGetAssociatedTransactionListResponseType.class,
    SIIgnoreUnmatchedItemResponseType.class,
    SIGetMessageImageResponseType.class,
    ChangePasswordRequestResponseBodyType.class,
    SIRetrieveReportOutputResponseType.class,
    SIGetTransDetailsResponseType.class,
    RFCResponseBodyType.class,
    SIGetDisputeFinancialAdviceDetailsResponseType.class,
    SICloseMessageResponseType.class,
    SIGetCardholderPurchaseInquiryResponseType.class,
    SIGetRFCAdviceResponseType.class,
    UpdateGMFPItemDetailsResponseBodyType.class,
    SIGetAssociatedTranSelectionResponseType.class,
    SIGetDisputePreArbDetailsResponseType.class,
    SIUpdateCaseResolutionStatusResponseType.class,
    SIHyperSearchResponseType.class,
    SICreateDisputePreCompResponseType.class,
    SIIgnoreGMFPResponseType.class,
    AttachmentResponseBodyType.class,
    SIChangeQueueStatusResponseType.class,
    SISubmitMultiTranInquiryResponseType.class,
    SIAddUnmatchedItemToCaseResponseType.class,
    SIGetStopPaymentDetailsResponseType.class,
    SIGetMMIResponseType.class,
    SIIgnoreReverseVDASResponseType.class,
    QnResponseBodyType.class,
    SIGetContactMessageResponseResponseType.class,
    SIIgnoreRejectResponseType.class,
    SISubmitRFCFulfillmentResponseType.class,
    SIGetDisputeFinancialDetailsResponseType.class,
    ManualCaseCreationResponseBodyType.class,
    SIGetRFCFulfillmentResponseType.class,
    MiscFeeResponseBodyType.class,
    SISubmitExceptionResponseType.class,
    SIGetFraudBundleDisputeQuestionnaireStatusResponseType.class,
    SISubmitContactMessageResponseResponseType.class,
    SISubmitFinancialReversalResponseType.class,
    AdjustmentResponseBodyType.class,
    SICreateMessageResponseType.class,
    SIGetAcceptanceNotificationDetailsResponseType.class,
    SISubmitManualCaseCreationResponseType.class,
    SIGetDisputePreCompResponseDetailsResponseType.class,
    SISubmitRFCNonFulfillmentResponseType.class,
    VDASResponseBodyType.class,
    SIGetRFCDetailsResponseType.class,
    SIGetCollaborationDetailsResponseType.class,
    SICreateDisputePreArbResponseResponseType.class,
    SIViewPotentialQnMatchesResponseType.class,
    BatchQueueResponseBodyType.class,
    QuestionnaireRespBodyType.class,
    SIInitiateDisputeFromTransactionOrCaseResponseType.class,
    SIInitiatePreCompFromTransactionOrCaseResponseType.class,
    TIResponseBodyType.class
})
public abstract class ResponseBodyType {


}
