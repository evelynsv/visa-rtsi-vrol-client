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


/**
 * <p>Java class for SubmitFraudBundleDisputeQuestionnaireType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitFraudBundleDisputeQuestionnaireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="RolTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="25" minOccurs="2"/>
 *           &lt;element name="VisaCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" maxOccurs="25" minOccurs="2"/>
 *           &lt;element name="FraudBundleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CaseInformation" type="{http://www.visa.com/ROLSI}DisputeFraudBundleCaseInformationType" minOccurs="0"/>
 *         &lt;element name="Fraud" type="{http://www.visa.com/ROLSI}DisputeFraudType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeCardholderInfo" minOccurs="0"/>
 *         &lt;element name="AccountOwnerInfo" type="{http://www.visa.com/ROLSI}DisputeAccountOwnerContactInfoType" minOccurs="0"/>
 *         &lt;element name="TransmittalInfo" type="{http://www.visa.com/ROLSI}QuickformTransmittalInfoType" minOccurs="0"/>
 *         &lt;element name="DisputeEFLInfo" type="{http://www.visa.com/ROLSI}DisputeEFLInfoType" minOccurs="0"/>
 *         &lt;element name="NotesAndDocumentsInfo" type="{http://www.visa.com/ROLSI}QuickformNotesAndDocumentsInfoType" minOccurs="0"/>
 *         &lt;element name="IssuerDisputeReqInfo" type="{http://www.visa.com/ROLSI}IssuerDisputeReqInfoType" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.visa.com/ROLSI}DisputeCaseActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitFraudBundleDisputeQuestionnaireType", propOrder = {
    "rolTransactionId",
    "visaCaseNumber",
    "fraudBundleID",
    "caseInformation",
    "fraud",
    "disputeCardholderInfo",
    "accountOwnerInfo",
    "transmittalInfo",
    "disputeEFLInfo",
    "notesAndDocumentsInfo",
    "issuerDisputeReqInfo",
    "action"
})
public class SubmitFraudBundleDisputeQuestionnaireType {

    @XmlElement(name = "RolTransactionId", type = Long.class)
    protected List<Long> rolTransactionId;
    @XmlElement(name = "VisaCaseNumber", type = Long.class)
    protected List<Long> visaCaseNumber;
    @XmlElement(name = "FraudBundleID")
    protected Long fraudBundleID;
    @XmlElement(name = "CaseInformation")
    protected DisputeFraudBundleCaseInformationType caseInformation;
    @XmlElement(name = "Fraud")
    protected DisputeFraudType fraud;
    @XmlElement(name = "DisputeCardholderInfo")
    protected DisputeCardholderInfoType disputeCardholderInfo;
    @XmlElement(name = "AccountOwnerInfo")
    protected DisputeAccountOwnerContactInfoType accountOwnerInfo;
    @XmlElement(name = "TransmittalInfo")
    protected QuickformTransmittalInfoType transmittalInfo;
    @XmlElement(name = "DisputeEFLInfo")
    protected DisputeEFLInfoType disputeEFLInfo;
    @XmlElement(name = "NotesAndDocumentsInfo")
    protected QuickformNotesAndDocumentsInfoType notesAndDocumentsInfo;
    @XmlElement(name = "IssuerDisputeReqInfo")
    protected IssuerDisputeReqInfoType issuerDisputeReqInfo;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected DisputeCaseActionType action;

    /**
     * Gets the value of the rolTransactionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolTransactionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolTransactionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRolTransactionId() {
        if (rolTransactionId == null) {
            rolTransactionId = new ArrayList<Long>();
        }
        return this.rolTransactionId;
    }

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaCaseNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaCaseNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getVisaCaseNumber() {
        if (visaCaseNumber == null) {
            visaCaseNumber = new ArrayList<Long>();
        }
        return this.visaCaseNumber;
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
     * Gets the value of the caseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFraudBundleCaseInformationType }
     *     
     */
    public DisputeFraudBundleCaseInformationType getCaseInformation() {
        return caseInformation;
    }

    /**
     * Sets the value of the caseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFraudBundleCaseInformationType }
     *     
     */
    public void setCaseInformation(DisputeFraudBundleCaseInformationType value) {
        this.caseInformation = value;
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
     * Gets the value of the accountOwnerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAccountOwnerContactInfoType }
     *     
     */
    public DisputeAccountOwnerContactInfoType getAccountOwnerInfo() {
        return accountOwnerInfo;
    }

    /**
     * Sets the value of the accountOwnerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAccountOwnerContactInfoType }
     *     
     */
    public void setAccountOwnerInfo(DisputeAccountOwnerContactInfoType value) {
        this.accountOwnerInfo = value;
    }

    /**
     * Gets the value of the transmittalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuickformTransmittalInfoType }
     *     
     */
    public QuickformTransmittalInfoType getTransmittalInfo() {
        return transmittalInfo;
    }

    /**
     * Sets the value of the transmittalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickformTransmittalInfoType }
     *     
     */
    public void setTransmittalInfo(QuickformTransmittalInfoType value) {
        this.transmittalInfo = value;
    }

    /**
     * Gets the value of the disputeEFLInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeEFLInfoType }
     *     
     */
    public DisputeEFLInfoType getDisputeEFLInfo() {
        return disputeEFLInfo;
    }

    /**
     * Sets the value of the disputeEFLInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeEFLInfoType }
     *     
     */
    public void setDisputeEFLInfo(DisputeEFLInfoType value) {
        this.disputeEFLInfo = value;
    }

    /**
     * Gets the value of the notesAndDocumentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuickformNotesAndDocumentsInfoType }
     *     
     */
    public QuickformNotesAndDocumentsInfoType getNotesAndDocumentsInfo() {
        return notesAndDocumentsInfo;
    }

    /**
     * Sets the value of the notesAndDocumentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickformNotesAndDocumentsInfoType }
     *     
     */
    public void setNotesAndDocumentsInfo(QuickformNotesAndDocumentsInfoType value) {
        this.notesAndDocumentsInfo = value;
    }

    /**
     * Gets the value of the issuerDisputeReqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerDisputeReqInfoType }
     *     
     */
    public IssuerDisputeReqInfoType getIssuerDisputeReqInfo() {
        return issuerDisputeReqInfo;
    }

    /**
     * Sets the value of the issuerDisputeReqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerDisputeReqInfoType }
     *     
     */
    public void setIssuerDisputeReqInfo(IssuerDisputeReqInfoType value) {
        this.issuerDisputeReqInfo = value;
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

}
