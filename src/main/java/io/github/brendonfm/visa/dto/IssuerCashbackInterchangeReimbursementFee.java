//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.visa.com/ROLSI>AmountType">
 *       &lt;attribute name="IssuerCashbackInterchangeReimbursementFeeDebitCreditInd" type="{http://www.visa.com/ROLSI}DebitCreditType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IssuerCashbackInterchangeReimbursementFee")
public class IssuerCashbackInterchangeReimbursementFee
    extends AmountType
{

    @XmlAttribute(name = "IssuerCashbackInterchangeReimbursementFeeDebitCreditInd")
    protected DebitCreditType issuerCashbackInterchangeReimbursementFeeDebitCreditInd;

    /**
     * Gets the value of the issuerCashbackInterchangeReimbursementFeeDebitCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getIssuerCashbackInterchangeReimbursementFeeDebitCreditInd() {
        return issuerCashbackInterchangeReimbursementFeeDebitCreditInd;
    }

    /**
     * Sets the value of the issuerCashbackInterchangeReimbursementFeeDebitCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setIssuerCashbackInterchangeReimbursementFeeDebitCreditInd(DebitCreditType value) {
        this.issuerCashbackInterchangeReimbursementFeeDebitCreditInd = value;
    }

}
