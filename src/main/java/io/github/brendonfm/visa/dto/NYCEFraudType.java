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
 * <p>Java class for NYCEFraudType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NYCEFraudType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F1"/>
 *     &lt;enumeration value="F2"/>
 *     &lt;enumeration value="F3"/>
 *     &lt;enumeration value="F4"/>
 *     &lt;enumeration value="F5"/>
 *     &lt;enumeration value="F6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NYCEFraudType")
@XmlEnum
public enum NYCEFraudType {

    @XmlEnumValue("F1")
    F_1("F1"),
    @XmlEnumValue("F2")
    F_2("F2"),
    @XmlEnumValue("F3")
    F_3("F3"),
    @XmlEnumValue("F4")
    F_4("F4"),
    @XmlEnumValue("F5")
    F_5("F5"),
    @XmlEnumValue("F6")
    F_6("F6");
    private final String value;

    NYCEFraudType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NYCEFraudType fromValue(String v) {
        for (NYCEFraudType c: NYCEFraudType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
