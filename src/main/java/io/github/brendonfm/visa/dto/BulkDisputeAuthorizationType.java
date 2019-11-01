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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BulkDisputeAuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkDisputeAuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EFLDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExplanationOfAuthorizationsPresented" type="{http://www.visa.com/ROLSI}Desc10000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkDisputeAuthorizationType", propOrder = {
    "eflDate",
    "explanationOfAuthorizationsPresented"
})
public class BulkDisputeAuthorizationType {

    @XmlElement(name = "EFLDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eflDate;
    @XmlElement(name = "ExplanationOfAuthorizationsPresented")
    protected String explanationOfAuthorizationsPresented;

    /**
     * Gets the value of the eflDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEFLDate() {
        return eflDate;
    }

    /**
     * Sets the value of the eflDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEFLDate(XMLGregorianCalendar value) {
        this.eflDate = value;
    }

    /**
     * Gets the value of the explanationOfAuthorizationsPresented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationOfAuthorizationsPresented() {
        return explanationOfAuthorizationsPresented;
    }

    /**
     * Sets the value of the explanationOfAuthorizationsPresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationOfAuthorizationsPresented(String value) {
        this.explanationOfAuthorizationsPresented = value;
    }

}
