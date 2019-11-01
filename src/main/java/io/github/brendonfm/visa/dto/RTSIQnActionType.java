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
 * <p>Java class for RTSIQnActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RTSIQnActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pend"/>
 *     &lt;enumeration value="Submit"/>
 *     &lt;enumeration value="SubmitForReview"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="ForcePost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RTSIQnActionType")
@XmlEnum
public enum RTSIQnActionType {

    @XmlEnumValue("Pend")
    PEND("Pend"),
    @XmlEnumValue("Submit")
    SUBMIT("Submit"),
    @XmlEnumValue("SubmitForReview")
    SUBMIT_FOR_REVIEW("SubmitForReview"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("ForcePost")
    FORCE_POST("ForcePost");
    private final String value;

    RTSIQnActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RTSIQnActionType fromValue(String v) {
        for (RTSIQnActionType c: RTSIQnActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
