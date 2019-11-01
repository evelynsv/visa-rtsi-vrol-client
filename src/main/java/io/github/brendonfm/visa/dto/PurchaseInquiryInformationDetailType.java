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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseInquiryInformationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseInquiryInformationDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseInquiryInformation" type="{http://www.visa.com/ROLSI}PurchaseInquiryInformationResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseInquiryInformationDetailType", propOrder = {
    "status",
    "purchaseInquiryInformation"
})
public class PurchaseInquiryInformationDetailType {

    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "PurchaseInquiryInformation")
    protected PurchaseInquiryInformationResponseDataType purchaseInquiryInformation;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the purchaseInquiryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public PurchaseInquiryInformationResponseDataType getPurchaseInquiryInformation() {
        return purchaseInquiryInformation;
    }

    /**
     * Sets the value of the purchaseInquiryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public void setPurchaseInquiryInformation(PurchaseInquiryInformationResponseDataType value) {
        this.purchaseInquiryInformation = value;
    }

}
