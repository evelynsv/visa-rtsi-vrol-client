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
 * <p>Java class for IgnoreRejectResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IgnoreRejectResponseBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType">
 *       &lt;sequence>
 *         &lt;element name="IgnoreRejectResponse" type="{http://www.visa.com/ROLSI}IgnoreRejectResponseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IgnoreRejectResponseBodyType", propOrder = {
    "ignoreRejectResponse"
})
public class IgnoreRejectResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "IgnoreRejectResponse", required = true)
    protected IgnoreRejectResponseType ignoreRejectResponse;

    /**
     * Gets the value of the ignoreRejectResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IgnoreRejectResponseType }
     *     
     */
    public IgnoreRejectResponseType getIgnoreRejectResponse() {
        return ignoreRejectResponse;
    }

    /**
     * Sets the value of the ignoreRejectResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnoreRejectResponseType }
     *     
     */
    public void setIgnoreRejectResponse(IgnoreRejectResponseType value) {
        this.ignoreRejectResponse = value;
    }

}
