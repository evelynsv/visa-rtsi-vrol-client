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
 * <p>Java class for SubmitMultiTranInquiryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitMultiTranInquiryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.visa.com/ROLSI}TransactionID" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.visa.com/ROLSI}TIEventID" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitMultiTranInquiryRequestType", propOrder = {
    "transactionID",
    "tiEventID"
})
public class SubmitMultiTranInquiryRequestType {

    @XmlElement(name = "TransactionID")
    protected List<String> transactionID;
    @XmlElement(name = "TIEventID")
    protected Long tiEventID;

    /**
     * Gets the value of the transactionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransactionID() {
        if (transactionID == null) {
            transactionID = new ArrayList<String>();
        }
        return this.transactionID;
    }

    /**
     * Gets the value of the tiEventID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTIEventID() {
        return tiEventID;
    }

    /**
     * Sets the value of the tiEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTIEventID(Long value) {
        this.tiEventID = value;
    }

}