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
 * <p>Java class for SubmitContactMessageResponseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitContactMessageResponseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element name="ContactMessage" type="{http://www.visa.com/ROLSI}DisputeContactMessageType" minOccurs="0"/>
 *         &lt;element name="DocIdList" type="{http://www.visa.com/ROLSI}DocIdListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitContactMessageResponseResponseType", propOrder = {
    "visaCaseNumber",
    "contactMessage",
    "docIdList"
})
public class SubmitContactMessageResponseResponseType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "ContactMessage")
    protected DisputeContactMessageType contactMessage;
    @XmlElement(name = "DocIdList")
    protected DocIdListType docIdList;

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
     * Gets the value of the contactMessage property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeContactMessageType }
     *     
     */
    public DisputeContactMessageType getContactMessage() {
        return contactMessage;
    }

    /**
     * Sets the value of the contactMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeContactMessageType }
     *     
     */
    public void setContactMessage(DisputeContactMessageType value) {
        this.contactMessage = value;
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

}
