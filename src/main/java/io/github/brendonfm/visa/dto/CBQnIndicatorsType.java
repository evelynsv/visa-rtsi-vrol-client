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
 * <p>Java class for CBQnIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBQnIndicatorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CBQnId" type="{http://www.visa.com/ROLSI}CBIndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBQnIndicatorsType", propOrder = {
    "cbQnId"
})
public class CBQnIndicatorsType {

    @XmlElement(name = "CBQnId")
    protected CBIndicatorType cbQnId;

    /**
     * Gets the value of the cbQnId property.
     * 
     * @return
     *     possible object is
     *     {@link CBIndicatorType }
     *     
     */
    public CBIndicatorType getCBQnId() {
        return cbQnId;
    }

    /**
     * Sets the value of the cbQnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIndicatorType }
     *     
     */
    public void setCBQnId(CBIndicatorType value) {
        this.cbQnId = value;
    }

}