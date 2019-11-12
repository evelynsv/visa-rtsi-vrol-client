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
 * <p>Java class for CreateDisputeResponseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDisputeResponseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element name="DisputeResponseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DisputeFinancialInfo" type="{http://www.visa.com/ROLSI}DisputeFinancialInformationType" minOccurs="0"/>
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
@XmlType(name = "CreateDisputeResponseResponseType", propOrder = {
    "visaCaseNumber",
    "disputeResponseId",
    "disputeFinancialInfo",
    "docIdList"
})
public class CreateDisputeResponseResponseType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "DisputeResponseId")
    protected Long disputeResponseId;
    @XmlElement(name = "DisputeFinancialInfo")
    protected DisputeFinancialInformationType disputeFinancialInfo;
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
     * Gets the value of the disputeResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeResponseId() {
        return disputeResponseId;
    }

    /**
     * Sets the value of the disputeResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeResponseId(Long value) {
        this.disputeResponseId = value;
    }

    /**
     * Gets the value of the disputeFinancialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFinancialInformationType }
     *     
     */
    public DisputeFinancialInformationType getDisputeFinancialInfo() {
        return disputeFinancialInfo;
    }

    /**
     * Sets the value of the disputeFinancialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFinancialInformationType }
     *     
     */
    public void setDisputeFinancialInfo(DisputeFinancialInformationType value) {
        this.disputeFinancialInfo = value;
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