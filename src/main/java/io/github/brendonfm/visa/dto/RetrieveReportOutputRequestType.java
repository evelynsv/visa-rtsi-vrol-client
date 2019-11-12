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
 * <p>Java class for RetrieveReportOutputRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveReportOutputRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RunDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ReportDataFileType" type="{http://www.visa.com/ROLSI}ReportDataFileTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveReportOutputRequestType", propOrder = {
    "scheduleId",
    "runDate",
    "reportDataFileType"
})
public class RetrieveReportOutputRequestType {

    @XmlElement(name = "ScheduleId")
    protected long scheduleId;
    @XmlElement(name = "RunDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar runDate;
    @XmlElement(name = "ReportDataFileType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportDataFileTypeType reportDataFileType;

    /**
     * Gets the value of the scheduleId property.
     * 
     */
    public long getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     */
    public void setScheduleId(long value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the runDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDate() {
        return runDate;
    }

    /**
     * Sets the value of the runDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDate(XMLGregorianCalendar value) {
        this.runDate = value;
    }

    /**
     * Gets the value of the reportDataFileType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDataFileTypeType }
     *     
     */
    public ReportDataFileTypeType getReportDataFileType() {
        return reportDataFileType;
    }

    /**
     * Sets the value of the reportDataFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDataFileTypeType }
     *     
     */
    public void setReportDataFileType(ReportDataFileTypeType value) {
        this.reportDataFileType = value;
    }

}