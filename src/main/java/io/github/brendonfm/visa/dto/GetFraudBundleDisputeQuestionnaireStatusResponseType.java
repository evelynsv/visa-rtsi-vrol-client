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
 * <p>Java class for GetFraudBundleDisputeQuestionnaireStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudBundleDisputeQuestionnaireStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraudBundleDisputeDetails" type="{http://www.visa.com/ROLSI}FraudBundleDisputeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFraudBundleDisputeQuestionnaireStatusResponseType", propOrder = {
    "fraudBundleDisputeDetails"
})
public class GetFraudBundleDisputeQuestionnaireStatusResponseType {

    @XmlElement(name = "FraudBundleDisputeDetails")
    protected FraudBundleDisputeDetailsType fraudBundleDisputeDetails;

    /**
     * Gets the value of the fraudBundleDisputeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FraudBundleDisputeDetailsType }
     *     
     */
    public FraudBundleDisputeDetailsType getFraudBundleDisputeDetails() {
        return fraudBundleDisputeDetails;
    }

    /**
     * Sets the value of the fraudBundleDisputeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudBundleDisputeDetailsType }
     *     
     */
    public void setFraudBundleDisputeDetails(FraudBundleDisputeDetailsType value) {
        this.fraudBundleDisputeDetails = value;
    }

}
