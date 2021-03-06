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
 * <p>Java class for VDASItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VDASItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VDASAdviceID" type="{http://www.visa.com/ROLSI}VDASAdviceIdType" minOccurs="0"/>
 *         &lt;element name="VDASAdviceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Chargeback"/>
 *               &lt;enumeration value="Representment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VDASAdviceCPD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VDASItemType", propOrder = {
    "vdasAdviceID",
    "vdasAdviceType",
    "vdasAdviceCPD"
})
public class VDASItemType {

    @XmlElement(name = "VDASAdviceID")
    protected VDASAdviceIdType vdasAdviceID;
    @XmlElement(name = "VDASAdviceType")
    protected String vdasAdviceType;
    @XmlElement(name = "VDASAdviceCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vdasAdviceCPD;

    /**
     * Gets the value of the vdasAdviceID property.
     * 
     * @return
     *     possible object is
     *     {@link VDASAdviceIdType }
     *     
     */
    public VDASAdviceIdType getVDASAdviceID() {
        return vdasAdviceID;
    }

    /**
     * Sets the value of the vdasAdviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VDASAdviceIdType }
     *     
     */
    public void setVDASAdviceID(VDASAdviceIdType value) {
        this.vdasAdviceID = value;
    }

    /**
     * Gets the value of the vdasAdviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDASAdviceType() {
        return vdasAdviceType;
    }

    /**
     * Sets the value of the vdasAdviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDASAdviceType(String value) {
        this.vdasAdviceType = value;
    }

    /**
     * Gets the value of the vdasAdviceCPD property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVDASAdviceCPD() {
        return vdasAdviceCPD;
    }

    /**
     * Sets the value of the vdasAdviceCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVDASAdviceCPD(XMLGregorianCalendar value) {
        this.vdasAdviceCPD = value;
    }

}
