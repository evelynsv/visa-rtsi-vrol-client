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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTSIManualCaseCreationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSIManualCaseCreationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element name="TransactionInfo" type="{http://www.visa.com/ROLSI}CreateCaseTransactionType"/>
 *         &lt;element name="CaseInfo" type="{http://www.visa.com/ROLSI}RTSIExtendedCreateCaseInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderInfo" minOccurs="0"/>
 *         &lt;element name="AccountOwnerInfo" type="{http://www.visa.com/ROLSI}AccountOwnerContactInfoType" minOccurs="0"/>
 *         &lt;element name="MerchantContactInfo" type="{http://www.visa.com/ROLSI}MerchantContactInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Note" minOccurs="0"/>
 *         &lt;element name="PrivilegeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MasterCaseRequired" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSIManualCaseCreationType", propOrder = {
    "visaCaseNumber",
    "transactionInfo",
    "caseInfo",
    "cardholderInfo",
    "accountOwnerInfo",
    "merchantContactInfo",
    "note",
    "privilegeInd",
    "masterCaseRequired"
})
public class RTSIManualCaseCreationType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "TransactionInfo", required = true)
    protected CreateCaseTransactionType transactionInfo;
    @XmlElement(name = "CaseInfo")
    protected RTSIExtendedCreateCaseInfoType caseInfo;
    @XmlElement(name = "CardholderInfo")
    protected AdditionalCardholderInfoType cardholderInfo;
    @XmlElement(name = "AccountOwnerInfo")
    protected AccountOwnerContactInfoType accountOwnerInfo;
    @XmlElement(name = "MerchantContactInfo")
    protected MerchantContactInfoType merchantContactInfo;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "PrivilegeInd")
    protected Boolean privilegeInd;
    @XmlElement(name = "MasterCaseRequired")
    protected MasterCaseRequiredType masterCaseRequired;

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
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCaseTransactionType }
     *     
     */
    public CreateCaseTransactionType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCaseTransactionType }
     *     
     */
    public void setTransactionInfo(CreateCaseTransactionType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the caseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIExtendedCreateCaseInfoType }
     *     
     */
    public RTSIExtendedCreateCaseInfoType getCaseInfo() {
        return caseInfo;
    }

    /**
     * Sets the value of the caseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIExtendedCreateCaseInfoType }
     *     
     */
    public void setCaseInfo(RTSIExtendedCreateCaseInfoType value) {
        this.caseInfo = value;
    }

    /**
     * Gets the value of the cardholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCardholderInfoType }
     *     
     */
    public AdditionalCardholderInfoType getCardholderInfo() {
        return cardholderInfo;
    }

    /**
     * Sets the value of the cardholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCardholderInfoType }
     *     
     */
    public void setCardholderInfo(AdditionalCardholderInfoType value) {
        this.cardholderInfo = value;
    }

    /**
     * Gets the value of the accountOwnerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnerContactInfoType }
     *     
     */
    public AccountOwnerContactInfoType getAccountOwnerInfo() {
        return accountOwnerInfo;
    }

    /**
     * Sets the value of the accountOwnerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnerContactInfoType }
     *     
     */
    public void setAccountOwnerInfo(AccountOwnerContactInfoType value) {
        this.accountOwnerInfo = value;
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
     * Gets the value of the privilegeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivilegeInd() {
        return privilegeInd;
    }

    /**
     * Sets the value of the privilegeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivilegeInd(Boolean value) {
        this.privilegeInd = value;
    }

    /**
     * Gets the value of the masterCaseRequired property.
     * 
     * @return
     *     possible object is
     *     {@link MasterCaseRequiredType }
     *     
     */
    public MasterCaseRequiredType getMasterCaseRequired() {
        return masterCaseRequired;
    }

    /**
     * Sets the value of the masterCaseRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterCaseRequiredType }
     *     
     */
    public void setMasterCaseRequired(MasterCaseRequiredType value) {
        this.masterCaseRequired = value;
    }

}
