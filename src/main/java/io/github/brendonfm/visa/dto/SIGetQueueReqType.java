//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIGetQueueReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGetQueueReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}QueueType"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}PageNum" minOccurs="0"/>
 *         &lt;element name="ReportMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMFPStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.visa.com/ROLSI}GMFPStatus" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGetQueueReqType", propOrder = {
    "queueType",
    "pageNum",
    "reportMonth",
    "gmfpStatusList"
})
public class SIGetQueueReqType {

    @XmlElement(name = "QueueType", required = true)
    @XmlSchemaType(name = "string")
    protected QueueTypeType queueType;
    @XmlElement(name = "PageNum")
    protected Integer pageNum;
    @XmlElement(name = "ReportMonth")
    protected String reportMonth;
    @XmlElement(name = "GMFPStatusList")
    protected SIGetQueueReqType.GMFPStatusList gmfpStatusList;

    /**
     * Gets the value of the queueType property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTypeType }
     *     
     */
    public QueueTypeType getQueueType() {
        return queueType;
    }

    /**
     * Sets the value of the queueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTypeType }
     *     
     */
    public void setQueueType(QueueTypeType value) {
        this.queueType = value;
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

    /**
     * Gets the value of the reportMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMonth() {
        return reportMonth;
    }

    /**
     * Sets the value of the reportMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMonth(String value) {
        this.reportMonth = value;
    }

    /**
     * Gets the value of the gmfpStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link SIGetQueueReqType.GMFPStatusList }
     *     
     */
    public SIGetQueueReqType.GMFPStatusList getGMFPStatusList() {
        return gmfpStatusList;
    }

    /**
     * Sets the value of the gmfpStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGetQueueReqType.GMFPStatusList }
     *     
     */
    public void setGMFPStatusList(SIGetQueueReqType.GMFPStatusList value) {
        this.gmfpStatusList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.visa.com/ROLSI}GMFPStatus" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gmfpStatus"
    })
    public static class GMFPStatusList {

        @XmlElement(name = "GMFPStatus")
        protected List<String> gmfpStatus;

        /**
         * Gets the value of the gmfpStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gmfpStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGMFPStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGMFPStatus() {
            if (gmfpStatus == null) {
                gmfpStatus = new ArrayList<String>();
            }
            return this.gmfpStatus;
        }

    }

}
