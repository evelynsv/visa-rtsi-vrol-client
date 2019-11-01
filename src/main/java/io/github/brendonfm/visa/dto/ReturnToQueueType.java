//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnToQueueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnToQueueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RtqMyQ"/>
 *     &lt;enumeration value="RtqCustA"/>
 *     &lt;enumeration value="RtqCustB"/>
 *     &lt;enumeration value="RtqCustC"/>
 *     &lt;enumeration value="RtqCustD"/>
 *     &lt;enumeration value="RtqCustE"/>
 *     &lt;enumeration value="RtqCustF"/>
 *     &lt;enumeration value="RtqCustG"/>
 *     &lt;enumeration value="RtqCustH"/>
 *     &lt;enumeration value="RtqFrd"/>
 *     &lt;enumeration value="RtqCtSr"/>
 *     &lt;enumeration value="RtqGenQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnToQueueType")
@XmlEnum
public enum ReturnToQueueType {

    @XmlEnumValue("RtqMyQ")
    RTQ_MY_Q("RtqMyQ"),
    @XmlEnumValue("RtqCustA")
    RTQ_CUST_A("RtqCustA"),
    @XmlEnumValue("RtqCustB")
    RTQ_CUST_B("RtqCustB"),
    @XmlEnumValue("RtqCustC")
    RTQ_CUST_C("RtqCustC"),
    @XmlEnumValue("RtqCustD")
    RTQ_CUST_D("RtqCustD"),
    @XmlEnumValue("RtqCustE")
    RTQ_CUST_E("RtqCustE"),
    @XmlEnumValue("RtqCustF")
    RTQ_CUST_F("RtqCustF"),
    @XmlEnumValue("RtqCustG")
    RTQ_CUST_G("RtqCustG"),
    @XmlEnumValue("RtqCustH")
    RTQ_CUST_H("RtqCustH"),
    @XmlEnumValue("RtqFrd")
    RTQ_FRD("RtqFrd"),
    @XmlEnumValue("RtqCtSr")
    RTQ_CT_SR("RtqCtSr"),
    @XmlEnumValue("RtqGenQ")
    RTQ_GEN_Q("RtqGenQ");
    private final String value;

    ReturnToQueueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnToQueueType fromValue(String v) {
        for (ReturnToQueueType c: ReturnToQueueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
