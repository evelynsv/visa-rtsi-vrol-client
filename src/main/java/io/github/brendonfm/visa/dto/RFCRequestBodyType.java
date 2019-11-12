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
 * <p>Java class for RFCRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFCRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SubmitRFC" type="{http://www.visa.com/ROLSI}RTSISubmitRFCType"/>
 *           &lt;element name="GetRFCDetail" type="{http://www.visa.com/ROLSI}RTSIRFCRetrievalType"/>
 *           &lt;element name="RFCFulfillment" type="{http://www.visa.com/ROLSI}RTSIRFCFulfillmentType"/>
 *           &lt;element name="RFCNonFulfillment" type="{http://www.visa.com/ROLSI}RTSIRFCNonFulfillmentWithAttachmentType"/>
 *           &lt;element name="GetRFCFulfillment" type="{http://www.visa.com/ROLSI}RTSIRFCRetrievalType"/>
 *           &lt;element name="GetRFCNonFulfillment" type="{http://www.visa.com/ROLSI}RTSIRFCRetrievalType"/>
 *           &lt;element name="GetRFCAdvice" type="{http://www.visa.com/ROLSI}RTSIRFCRetrievalType"/>
 *           &lt;element name="SubmitIgnore" type="{http://www.visa.com/ROLSI}RTSISubmitIgnoreType"/>
 *           &lt;element name="CloseRFC" type="{http://www.visa.com/ROLSI}RTSICloseRFCType"/>
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
@XmlType(name = "RFCRequestBodyType", propOrder = {
    "submitRFC",
    "getRFCDetail",
    "rfcFulfillment",
    "rfcNonFulfillment",
    "getRFCFulfillment",
    "getRFCNonFulfillment",
    "getRFCAdvice",
    "submitIgnore",
    "closeRFC"
})
public class RFCRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitRFC")
    protected RTSISubmitRFCType submitRFC;
    @XmlElement(name = "GetRFCDetail")
    protected RTSIRFCRetrievalType getRFCDetail;
    @XmlElement(name = "RFCFulfillment")
    protected RTSIRFCFulfillmentType rfcFulfillment;
    @XmlElement(name = "RFCNonFulfillment")
    protected RTSIRFCNonFulfillmentWithAttachmentType rfcNonFulfillment;
    @XmlElement(name = "GetRFCFulfillment")
    protected RTSIRFCRetrievalType getRFCFulfillment;
    @XmlElement(name = "GetRFCNonFulfillment")
    protected RTSIRFCRetrievalType getRFCNonFulfillment;
    @XmlElement(name = "GetRFCAdvice")
    protected RTSIRFCRetrievalType getRFCAdvice;
    @XmlElement(name = "SubmitIgnore")
    protected RTSISubmitIgnoreType submitIgnore;
    @XmlElement(name = "CloseRFC")
    protected RTSICloseRFCType closeRFC;

    /**
     * Gets the value of the submitRFC property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitRFCType }
     *     
     */
    public RTSISubmitRFCType getSubmitRFC() {
        return submitRFC;
    }

    /**
     * Sets the value of the submitRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitRFCType }
     *     
     */
    public void setSubmitRFC(RTSISubmitRFCType value) {
        this.submitRFC = value;
    }

    /**
     * Gets the value of the getRFCDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public RTSIRFCRetrievalType getGetRFCDetail() {
        return getRFCDetail;
    }

    /**
     * Sets the value of the getRFCDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public void setGetRFCDetail(RTSIRFCRetrievalType value) {
        this.getRFCDetail = value;
    }

    /**
     * Gets the value of the rfcFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCFulfillmentType }
     *     
     */
    public RTSIRFCFulfillmentType getRFCFulfillment() {
        return rfcFulfillment;
    }

    /**
     * Sets the value of the rfcFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCFulfillmentType }
     *     
     */
    public void setRFCFulfillment(RTSIRFCFulfillmentType value) {
        this.rfcFulfillment = value;
    }

    /**
     * Gets the value of the rfcNonFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCNonFulfillmentWithAttachmentType }
     *     
     */
    public RTSIRFCNonFulfillmentWithAttachmentType getRFCNonFulfillment() {
        return rfcNonFulfillment;
    }

    /**
     * Sets the value of the rfcNonFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCNonFulfillmentWithAttachmentType }
     *     
     */
    public void setRFCNonFulfillment(RTSIRFCNonFulfillmentWithAttachmentType value) {
        this.rfcNonFulfillment = value;
    }

    /**
     * Gets the value of the getRFCFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public RTSIRFCRetrievalType getGetRFCFulfillment() {
        return getRFCFulfillment;
    }

    /**
     * Sets the value of the getRFCFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public void setGetRFCFulfillment(RTSIRFCRetrievalType value) {
        this.getRFCFulfillment = value;
    }

    /**
     * Gets the value of the getRFCNonFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public RTSIRFCRetrievalType getGetRFCNonFulfillment() {
        return getRFCNonFulfillment;
    }

    /**
     * Sets the value of the getRFCNonFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public void setGetRFCNonFulfillment(RTSIRFCRetrievalType value) {
        this.getRFCNonFulfillment = value;
    }

    /**
     * Gets the value of the getRFCAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public RTSIRFCRetrievalType getGetRFCAdvice() {
        return getRFCAdvice;
    }

    /**
     * Sets the value of the getRFCAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIRFCRetrievalType }
     *     
     */
    public void setGetRFCAdvice(RTSIRFCRetrievalType value) {
        this.getRFCAdvice = value;
    }

    /**
     * Gets the value of the submitIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitIgnoreType }
     *     
     */
    public RTSISubmitIgnoreType getSubmitIgnore() {
        return submitIgnore;
    }

    /**
     * Sets the value of the submitIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitIgnoreType }
     *     
     */
    public void setSubmitIgnore(RTSISubmitIgnoreType value) {
        this.submitIgnore = value;
    }

    /**
     * Gets the value of the closeRFC property.
     * 
     * @return
     *     possible object is
     *     {@link RTSICloseRFCType }
     *     
     */
    public RTSICloseRFCType getCloseRFC() {
        return closeRFC;
    }

    /**
     * Sets the value of the closeRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSICloseRFCType }
     *     
     */
    public void setCloseRFC(RTSICloseRFCType value) {
        this.closeRFC = value;
    }

}