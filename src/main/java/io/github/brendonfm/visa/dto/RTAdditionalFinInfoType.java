//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTAdditionalFinInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTAdditionalFinInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}AdditionalFnInfoType">
 *       &lt;attribute name="createFinancial" type="{http://www.visa.com/ROLSI}YNOType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTAdditionalFinInfoType")
public class RTAdditionalFinInfoType
    extends AdditionalFnInfoType
{

    @XmlAttribute(name = "createFinancial")
    protected YNOType createFinancial;

    /**
     * Gets the value of the createFinancial property.
     * 
     * @return
     *     possible object is
     *     {@link YNOType }
     *     
     */
    public YNOType getCreateFinancial() {
        return createFinancial;
    }

    /**
     * Sets the value of the createFinancial property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNOType }
     *     
     */
    public void setCreateFinancial(YNOType value) {
        this.createFinancial = value;
    }

}
