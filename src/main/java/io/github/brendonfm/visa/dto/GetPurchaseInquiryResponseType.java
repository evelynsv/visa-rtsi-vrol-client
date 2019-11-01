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
 * <p>Java class for GetPurchaseInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPurchaseInquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseInquiryInformationDetails" type="{http://www.visa.com/ROLSI}PurchaseInquiryInformationResponseDataType" minOccurs="0"/>
 *         &lt;element name="PurchaseInquiryAttachmentDescriptor" type="{http://www.visa.com/ROLSI}PurchaseInquiryAttachmentDescriptorType" minOccurs="0"/>
 *         &lt;element name="PurchaseInquiryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseInquiryResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPurchaseInquiryResponseType", propOrder = {
    "purchaseInquiryInformationDetails",
    "purchaseInquiryAttachmentDescriptor",
    "purchaseInquiryId",
    "purchaseInquiryResponseStatus"
})
public class GetPurchaseInquiryResponseType {

    @XmlElement(name = "PurchaseInquiryInformationDetails")
    protected PurchaseInquiryInformationResponseDataType purchaseInquiryInformationDetails;
    @XmlElement(name = "PurchaseInquiryAttachmentDescriptor")
    protected PurchaseInquiryAttachmentDescriptorType purchaseInquiryAttachmentDescriptor;
    @XmlElement(name = "PurchaseInquiryId")
    protected Long purchaseInquiryId;
    @XmlElement(name = "PurchaseInquiryResponseStatus")
    protected String purchaseInquiryResponseStatus;

    /**
     * Gets the value of the purchaseInquiryInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public PurchaseInquiryInformationResponseDataType getPurchaseInquiryInformationDetails() {
        return purchaseInquiryInformationDetails;
    }

    /**
     * Sets the value of the purchaseInquiryInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public void setPurchaseInquiryInformationDetails(PurchaseInquiryInformationResponseDataType value) {
        this.purchaseInquiryInformationDetails = value;
    }

    /**
     * Gets the value of the purchaseInquiryAttachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInquiryAttachmentDescriptorType }
     *     
     */
    public PurchaseInquiryAttachmentDescriptorType getPurchaseInquiryAttachmentDescriptor() {
        return purchaseInquiryAttachmentDescriptor;
    }

    /**
     * Sets the value of the purchaseInquiryAttachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInquiryAttachmentDescriptorType }
     *     
     */
    public void setPurchaseInquiryAttachmentDescriptor(PurchaseInquiryAttachmentDescriptorType value) {
        this.purchaseInquiryAttachmentDescriptor = value;
    }

    /**
     * Gets the value of the purchaseInquiryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseInquiryId() {
        return purchaseInquiryId;
    }

    /**
     * Sets the value of the purchaseInquiryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseInquiryId(Long value) {
        this.purchaseInquiryId = value;
    }

    /**
     * Gets the value of the purchaseInquiryResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseInquiryResponseStatus() {
        return purchaseInquiryResponseStatus;
    }

    /**
     * Sets the value of the purchaseInquiryResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseInquiryResponseStatus(String value) {
        this.purchaseInquiryResponseStatus = value;
    }

}
