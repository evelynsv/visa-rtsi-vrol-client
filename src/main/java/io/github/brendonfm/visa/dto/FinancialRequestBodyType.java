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
 * <p>Java class for FinancialRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SubmitFinancialReversal" type="{http://www.visa.com/ROLSI}RTSISubmitFinancialReversalType"/>
 *           &lt;element name="GetFinancialDetail" type="{http://www.visa.com/ROLSI}RTSIGetFinancialDetailType"/>
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
@XmlType(name = "FinancialRequestBodyType", propOrder = {
    "submitFinancialReversal",
    "getFinancialDetail"
})
public class FinancialRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitFinancialReversal")
    protected RTSISubmitFinancialReversalType submitFinancialReversal;
    @XmlElement(name = "GetFinancialDetail")
    protected RTSIGetFinancialDetailType getFinancialDetail;

    /**
     * Gets the value of the submitFinancialReversal property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitFinancialReversalType }
     *     
     */
    public RTSISubmitFinancialReversalType getSubmitFinancialReversal() {
        return submitFinancialReversal;
    }

    /**
     * Sets the value of the submitFinancialReversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitFinancialReversalType }
     *     
     */
    public void setSubmitFinancialReversal(RTSISubmitFinancialReversalType value) {
        this.submitFinancialReversal = value;
    }

    /**
     * Gets the value of the getFinancialDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIGetFinancialDetailType }
     *     
     */
    public RTSIGetFinancialDetailType getGetFinancialDetail() {
        return getFinancialDetail;
    }

    /**
     * Sets the value of the getFinancialDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIGetFinancialDetailType }
     *     
     */
    public void setGetFinancialDetail(RTSIGetFinancialDetailType value) {
        this.getFinancialDetail = value;
    }

}
