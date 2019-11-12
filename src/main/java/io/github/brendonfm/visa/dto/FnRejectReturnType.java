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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FnRejectReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FnRejectReturnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RejectReturnType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.visa.com/ROLSI}Financial" minOccurs="0"/>
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
@XmlType(name = "FnRejectReturnType", propOrder = {
    "financial"
})
@XmlSeeAlso({
    RTSIFnRejectReturnType.class
})
public class FnRejectReturnType
    extends RejectReturnType
{

    @XmlElement(name = "Financial")
    protected FinancialResponseType financial;

    /**
     * Gets the value of the financial property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialResponseType }
     *     
     */
    public FinancialResponseType getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResponseType }
     *     
     */
    public void setFinancial(FinancialResponseType value) {
        this.financial = value;
    }

}