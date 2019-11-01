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
 * <p>Java class for AdjustmentRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SubmitAdjustmentRequest" type="{http://www.visa.com/ROLSI}RTSISubmitAdjustmentRequestType"/>
 *           &lt;element name="AdjustmentDetailsRequest" type="{http://www.visa.com/ROLSI}RTSIAdjustmentDetailsRequestType"/>
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
@XmlType(name = "AdjustmentRequestBodyType", propOrder = {
    "submitAdjustmentRequest",
    "adjustmentDetailsRequest"
})
public class AdjustmentRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitAdjustmentRequest")
    protected RTSISubmitAdjustmentRequestType submitAdjustmentRequest;
    @XmlElement(name = "AdjustmentDetailsRequest")
    protected RTSIAdjustmentDetailsRequestType adjustmentDetailsRequest;

    /**
     * Gets the value of the submitAdjustmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitAdjustmentRequestType }
     *     
     */
    public RTSISubmitAdjustmentRequestType getSubmitAdjustmentRequest() {
        return submitAdjustmentRequest;
    }

    /**
     * Sets the value of the submitAdjustmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitAdjustmentRequestType }
     *     
     */
    public void setSubmitAdjustmentRequest(RTSISubmitAdjustmentRequestType value) {
        this.submitAdjustmentRequest = value;
    }

    /**
     * Gets the value of the adjustmentDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAdjustmentDetailsRequestType }
     *     
     */
    public RTSIAdjustmentDetailsRequestType getAdjustmentDetailsRequest() {
        return adjustmentDetailsRequest;
    }

    /**
     * Sets the value of the adjustmentDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAdjustmentDetailsRequestType }
     *     
     */
    public void setAdjustmentDetailsRequest(RTSIAdjustmentDetailsRequestType value) {
        this.adjustmentDetailsRequest = value;
    }

}
