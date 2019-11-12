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
 * <p>Java class for CardholderPurchaseInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardholderPurchaseInquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionInformationDetails" type="{http://www.visa.com/ROLSI}TransactionInformationDetailsType" minOccurs="0"/>
 *         &lt;element name="MerchantInformationDetails" type="{http://www.visa.com/ROLSI}MerchantInformationDetailsType" minOccurs="0"/>
 *         &lt;element name="PurchaseInquiryInformationDetails" type="{http://www.visa.com/ROLSI}PurchaseInquiryInformationDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderPurchaseInquiryResponseType", propOrder = {
    "transactionInformationDetails",
    "merchantInformationDetails",
    "purchaseInquiryInformationDetails"
})
public class CardholderPurchaseInquiryResponseType {

    @XmlElement(name = "TransactionInformationDetails")
    protected TransactionInformationDetailsType transactionInformationDetails;
    @XmlElement(name = "MerchantInformationDetails")
    protected MerchantInformationDetailsType merchantInformationDetails;
    @XmlElement(name = "PurchaseInquiryInformationDetails")
    protected PurchaseInquiryInformationDetailType purchaseInquiryInformationDetails;

    /**
     * Gets the value of the transactionInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationDetailsType }
     *     
     */
    public TransactionInformationDetailsType getTransactionInformationDetails() {
        return transactionInformationDetails;
    }

    /**
     * Sets the value of the transactionInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationDetailsType }
     *     
     */
    public void setTransactionInformationDetails(TransactionInformationDetailsType value) {
        this.transactionInformationDetails = value;
    }

    /**
     * Gets the value of the merchantInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantInformationDetailsType }
     *     
     */
    public MerchantInformationDetailsType getMerchantInformationDetails() {
        return merchantInformationDetails;
    }

    /**
     * Sets the value of the merchantInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantInformationDetailsType }
     *     
     */
    public void setMerchantInformationDetails(MerchantInformationDetailsType value) {
        this.merchantInformationDetails = value;
    }

    /**
     * Gets the value of the purchaseInquiryInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInquiryInformationDetailType }
     *     
     */
    public PurchaseInquiryInformationDetailType getPurchaseInquiryInformationDetails() {
        return purchaseInquiryInformationDetails;
    }

    /**
     * Sets the value of the purchaseInquiryInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInquiryInformationDetailType }
     *     
     */
    public void setPurchaseInquiryInformationDetails(PurchaseInquiryInformationDetailType value) {
        this.purchaseInquiryInformationDetails = value;
    }

}