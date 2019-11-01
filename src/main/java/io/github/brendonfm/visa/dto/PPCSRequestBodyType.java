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
 * <p>Java class for PPCSRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PPCSRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="StopPaymentInquiryRequest" type="{http://www.visa.com/ROLSI}StopPaymentInquiryRequestType"/>
 *           &lt;element name="StopPaymentOrderRequest" type="{http://www.visa.com/ROLSI}StopPaymentOrderRequestType"/>
 *           &lt;element name="StopPaymentDetailRequest" type="{http://www.visa.com/ROLSI}StopPaymentDetailRequestType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PPCSRequestBodyType", propOrder = {
    "stopPaymentInquiryRequest",
    "stopPaymentOrderRequest",
    "stopPaymentDetailRequest"
})
public class PPCSRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "StopPaymentInquiryRequest")
    protected StopPaymentInquiryRequestType stopPaymentInquiryRequest;
    @XmlElement(name = "StopPaymentOrderRequest")
    protected StopPaymentOrderRequestType stopPaymentOrderRequest;
    @XmlElement(name = "StopPaymentDetailRequest")
    protected StopPaymentDetailRequestType stopPaymentDetailRequest;

    /**
     * Gets the value of the stopPaymentInquiryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopPaymentInquiryRequestType }
     *     
     */
    public StopPaymentInquiryRequestType getStopPaymentInquiryRequest() {
        return stopPaymentInquiryRequest;
    }

    /**
     * Sets the value of the stopPaymentInquiryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPaymentInquiryRequestType }
     *     
     */
    public void setStopPaymentInquiryRequest(StopPaymentInquiryRequestType value) {
        this.stopPaymentInquiryRequest = value;
    }

    /**
     * Gets the value of the stopPaymentOrderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopPaymentOrderRequestType }
     *     
     */
    public StopPaymentOrderRequestType getStopPaymentOrderRequest() {
        return stopPaymentOrderRequest;
    }

    /**
     * Sets the value of the stopPaymentOrderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPaymentOrderRequestType }
     *     
     */
    public void setStopPaymentOrderRequest(StopPaymentOrderRequestType value) {
        this.stopPaymentOrderRequest = value;
    }

    /**
     * Gets the value of the stopPaymentDetailRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopPaymentDetailRequestType }
     *     
     */
    public StopPaymentDetailRequestType getStopPaymentDetailRequest() {
        return stopPaymentDetailRequest;
    }

    /**
     * Sets the value of the stopPaymentDetailRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPaymentDetailRequestType }
     *     
     */
    public void setStopPaymentDetailRequest(StopPaymentDetailRequestType value) {
        this.stopPaymentDetailRequest = value;
    }

}
