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
 * <p>Java class for RepreQnIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepreQnIndicatorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepreQnId" type="{http://www.visa.com/ROLSI}RepreIndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepreQnIndicatorsType", propOrder = {
    "repreQnId"
})
public class RepreQnIndicatorsType {

    @XmlElement(name = "RepreQnId")
    protected RepreIndicatorType repreQnId;

    /**
     * Gets the value of the repreQnId property.
     * 
     * @return
     *     possible object is
     *     {@link RepreIndicatorType }
     *     
     */
    public RepreIndicatorType getRepreQnId() {
        return repreQnId;
    }

    /**
     * Sets the value of the repreQnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepreIndicatorType }
     *     
     */
    public void setRepreQnId(RepreIndicatorType value) {
        this.repreQnId = value;
    }

}
