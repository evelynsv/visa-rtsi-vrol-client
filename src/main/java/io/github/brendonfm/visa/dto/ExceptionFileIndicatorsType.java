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
 * <p>Java class for ExceptionFileIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionFileIndicatorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionFileListing" type="{http://www.visa.com/ROLSI}ExceptionFileIdentiferType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionFileIndicatorsType", propOrder = {
    "exceptionFileListing"
})
public class ExceptionFileIndicatorsType {

    @XmlElement(name = "ExceptionFileListing")
    protected ExceptionFileIdentiferType exceptionFileListing;

    /**
     * Gets the value of the exceptionFileListing property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionFileIdentiferType }
     *     
     */
    public ExceptionFileIdentiferType getExceptionFileListing() {
        return exceptionFileListing;
    }

    /**
     * Sets the value of the exceptionFileListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionFileIdentiferType }
     *     
     */
    public void setExceptionFileListing(ExceptionFileIdentiferType value) {
        this.exceptionFileListing = value;
    }

}
