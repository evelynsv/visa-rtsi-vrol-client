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
 * <p>Java class for GetGMFPItemDetailsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGMFPItemDetailsResponseBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="GetGMFPItemDetailsResponse" type="{http://www.visa.com/ROLSI}GetGMFPItemDetailsResponseType"/>
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
@XmlType(name = "GetGMFPItemDetailsResponseBodyType", propOrder = {
    "getGMFPItemDetailsResponse"
})
public class GetGMFPItemDetailsResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "GetGMFPItemDetailsResponse")
    protected GetGMFPItemDetailsResponseType getGMFPItemDetailsResponse;

    /**
     * Gets the value of the getGMFPItemDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetGMFPItemDetailsResponseType }
     *     
     */
    public GetGMFPItemDetailsResponseType getGetGMFPItemDetailsResponse() {
        return getGMFPItemDetailsResponse;
    }

    /**
     * Sets the value of the getGMFPItemDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGMFPItemDetailsResponseType }
     *     
     */
    public void setGetGMFPItemDetailsResponse(GetGMFPItemDetailsResponseType value) {
        this.getGMFPItemDetailsResponse = value;
    }

}