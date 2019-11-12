//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This defines the posting
 * 
 * <p>Java class for PostingAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.visa.com/ROLSI>MonetaryAmount">
 *       &lt;attribute name="postingType" type="{http://www.visa.com/ROLSI}DebitCreditType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAmountType", propOrder = {
    "value"
})
public class PostingAmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "postingType")
    protected DebitCreditType postingType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the postingType property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getPostingType() {
        return postingType;
    }

    /**
     * Sets the value of the postingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setPostingType(DebitCreditType value) {
        this.postingType = value;
    }

}