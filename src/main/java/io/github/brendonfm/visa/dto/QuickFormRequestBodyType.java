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
 * <p>Java class for QuickFormRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickFormRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;element name="SubmitQuickForm" type="{http://www.visa.com/ROLSI}RTSISubmitQuickFormType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickFormRequestBodyType", propOrder = {
    "submitQuickForm"
})
public class QuickFormRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitQuickForm", required = true)
    protected RTSISubmitQuickFormType submitQuickForm;

    /**
     * Gets the value of the submitQuickForm property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitQuickFormType }
     *     
     */
    public RTSISubmitQuickFormType getSubmitQuickForm() {
        return submitQuickForm;
    }

    /**
     * Sets the value of the submitQuickForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitQuickFormType }
     *     
     */
    public void setSubmitQuickForm(RTSISubmitQuickFormType value) {
        this.submitQuickForm = value;
    }

}
