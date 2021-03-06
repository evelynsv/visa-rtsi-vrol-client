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
 * <p>Java class for RequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBodyType">
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
@XmlType(name = "RequestBodyType")
@XmlSeeAlso({
    SICardholderPurchaseInquiryRequestType.class,
    SIRetrieveReportOutputRequestType.class,
    SISubmitPurchaseInquiryRequestType.class,
    SIGetDisputeFinancialAdviceDetailsRequestType.class,
    SICloseMessageRequestType.class,
    IgnoreRejectRequestBodyType.class,
    ChangePasswordRequestBodyType.class,
    SISubmitRFCFulfillmentRequestType.class,
    RFCRequestBodyType.class,
    SIIgnoreGMFPRequestType.class,
    SIGetDisputePreCompResponseDetailsRequestType.class,
    SIGetQueueRequestType.class,
    SIGetCardholderPurchaseInquiryRequestType.class,
    SIGetAdjustmentDetailsRequestType.class,
    SIAssociatedTranSelectionRequestType.class,
    SICreateDisputePreArbResponseRequestType.class,
    SISubmitFraudBundleDisputeQuestionnaireRequestType.class,
    MyQueueRequestType.class,
    SIGetRdrDetailsRequestType.class,
    SIGetRFCFulfillmentRequestType.class,
    SICreateCaseFromTransactionRequestType.class,
    SISetTransactionForCaseRequestType.class,
    GetGMFPDetailsRequestType.class,
    VDASRequestBodyType.class,
    SIGetActiveScheduleRequestType.class,
    SICreateDisputePreCompResponseRequestType.class,
    SIGetDisputeDetailsRequestType.class,
    SISubmitRFCRequestType.class,
    SIGetImageRequestType.class,
    SIIgnoreReverseVDASRequestType.class,
    SISubmitTranInquiryRequestType.class,
    SICloseRFCRequestType.class,
    ContinueDisputeRequestBodyType.class,
    SIGetDisputePreCompDetailsRequestType.class,
    SIGetAcceptanceNotificationDetailsRequestType.class,
    AdjustmentRequestBodyType.class,
    SIHyperSearchRequestType.class,
    SIUploadMessageImageRequestType.class,
    SICreateMessageRequestType.class,
    QuestionnaireRequestBodyType.class,
    SIGetTransactionsFromCaseRequestType.class,
    SIGetAccountingEntryDetailsRequestType.class,
    SISubmitContactMessageResponseRequestType.class,
    SIIgnoreUnmatchedItemRequestType.class,
    SICreateDisputePreArbRequestType.class,
    SIGetCaseDetailsRequestType.class,
    AttachmentRequestBodyType.class,
    SIViewPotentialQnMatchesRequestType.class,
    MiscFeeRequestBodyType.class,
    SIGetVDASDetailsRequestType.class,
    InitiateDisputeRequestBodyType.class,
    SICreateDisputeResponseRequestType.class,
    SIGetAllTransDetailsRequestType.class,
    SIChangeDisputeStatusRequestType.class,
    SIGetCollaborationDetailsRequestType.class,
    SIGetMMIRequestType.class,
    SISubmitRFCNonFulfillmentRequestType.class,
    SISubmitQFDisputeQuestionnaireRequestType.class,
    SIGetMerchantNotificationDetailsRequestType.class,
    SILinkAsSameDisputeRequestType.class,
    SIGetPurchaseInquiryRequestType.class,
    SISubmitStopPaymentOrderRequestType.class,
    UnmatchedItemRequestBodyType.class,
    SIGetGMFPDetailsRequestType.class,
    SIGetQuestionnaireDataRequestType.class,
    SISubmitManualCaseCreationRequestType.class,
    SIDisputeQuestionnaireRequestType.class,
    SISubmitDisputeFilingRequestType.class,
    SIInquiryExceptionRequestType.class,
    MessageRequestBodyType.class,
    SIViewPotentialVDASMatchesRequestType.class,
    SISubmitMultiTranInquiryRequestType.class,
    SIGetRFCNonFulfillmentRequestType.class,
    BatchQueueRequestType.class,
    HyperSearchRequestBodyType.class,
    SISubmitCollaborationRequestType.class,
    SISubmitFinancialReversalRequestType.class,
    SISubmitAdjustmentRequestType.class,
    SIGetDisputePreArbResponseDetailsRequestType.class,
    SIGetBatchQueueRequestType.class,
    SIGetMessageRequestType.class,
    SIGetContactMessageResponseRequestType.class,
    SIGetRFCDetailsRequestType.class,
    LinkUnlinkCaseRequestBodyType.class,
    SISubmitStopPaymentInquiryRequestType.class,
    AccountingEntryRequestBodyType.class,
    SICloseTransactionRequestType.class,
    PPCSRequestBodyType.class,
    SIMarkBatchQueueItemAsReadRequestType.class,
    SISubmitAccountingEntryRequestType.class,
    SIGetRFCAdviceRequestType.class,
    SISubmitExceptionRequestType.class,
    SIIgnoreRejectRequestType.class,
    SIGetMiscFeeDetailsRequestType.class,
    SIInitiateDisputeFromTransactionOrCaseRequestType.class,
    SIGetFraudReportDetailsRequestType.class,
    SIGetDisputeFilingDetailsRequestType.class,
    LogoutRequestBodyType.class,
    SIGetAssociatedTranSelectionRequestType.class,
    SICloseMiscFeeRequestType.class,
    TransactionInquiryRequestBodyType.class,
    SIGetMessageImageRequestType.class,
    SISubmitMiscFeeRequestType.class,
    SIUploadImageRequestType.class,
    SICreateDisputePreCompRequestType.class,
    SISubmitFraudReportRequestType.class,
    SIGetPotentialMatchesRequestType.class,
    SIGetStopPaymentDetailsRequestType.class,
    SILinkUnlinkCasesRequestType.class,
    FraudReportRequestBodyType.class,
    SIAcceptDisputeRequestType.class,
    SISubmitDisputeQuestionnaireRequestType.class,
    ExceptionRequestBodyType.class,
    SIGetTransInquiryResultsRequestType.class,
    SIGetTransDetailsRequestType.class,
    SIGetDisputeFinancialDetailsRequestType.class,
    UpdateGMFPDetailsRequestType.class,
    QuickFormRequestBodyType.class,
    SIUpdateCaseResolutionStatusRequestType.class,
    SIIgnoreVDASRequestType.class,
    SIGetFinancialDetailsRequestType.class,
    SIChangeQueueStatusRequestType.class,
    SIGetDisputeResponseDetailsRequestType.class,
    ManualCaseCreationRequestBodyType.class,
    SIGetDisputePreArbDetailsRequestType.class,
    FinancialRequestBodyType.class,
    SIGetExceptionDetailsRequestType.class,
    SIAddUnmatchedItemToCaseRequestType.class,
    SIGetContactMessageRequestType.class,
    SIGetAssociatedTransactionListRequestType.class,
    SIGetFraudBundleDisputeQuestionnaireStatusRequestType.class
})
public abstract class RequestBodyType {


}
