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
 * <p>Java class for DisputeAEMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeAEMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerPostingAmount" type="{http://www.visa.com/ROLSI}PostingAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeAEMType", propOrder = {
    "entryType",
    "consumerPostingAmount"
})
public class DisputeAEMType {

    @XmlElement(name = "EntryType")
    protected String entryType;
    @XmlElement(name = "ConsumerPostingAmount")
    protected PostingAmountType consumerPostingAmount;

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryType(String value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the consumerPostingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAmountType }
     *     
     */
    public PostingAmountType getConsumerPostingAmount() {
        return consumerPostingAmount;
    }

    /**
     * Sets the value of the consumerPostingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAmountType }
     *     
     */
    public void setConsumerPostingAmount(PostingAmountType value) {
        this.consumerPostingAmount = value;
    }

}
