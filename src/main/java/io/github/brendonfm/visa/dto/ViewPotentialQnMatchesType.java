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
 * <p>Java class for ViewPotentialQnMatchesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewPotentialQnMatchesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VDASAdviceID"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}PageNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewPotentialQnMatchesType", propOrder = {
    "vdasAdviceID",
    "pageNum"
})
public class ViewPotentialQnMatchesType {

    @XmlElement(name = "VDASAdviceID")
    protected long vdasAdviceID;
    @XmlElement(name = "PageNum")
    protected Integer pageNum;

    /**
     * Gets the value of the vdasAdviceID property.
     * 
     */
    public long getVDASAdviceID() {
        return vdasAdviceID;
    }

    /**
     * Sets the value of the vdasAdviceID property.
     * 
     */
    public void setVDASAdviceID(long value) {
        this.vdasAdviceID = value;
    }

    /**
     * Gets the value of the pageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * Sets the value of the pageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNum(Integer value) {
        this.pageNum = value;
    }

}
