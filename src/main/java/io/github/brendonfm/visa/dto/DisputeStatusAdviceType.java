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
 * <p>Java class for DisputeStatusAdviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeStatusAdviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F1"/>
 *     &lt;enumeration value="R1"/>
 *     &lt;enumeration value="R2"/>
 *     &lt;enumeration value="R3"/>
 *     &lt;enumeration value="P1"/>
 *     &lt;enumeration value="L1"/>
 *     &lt;enumeration value="L2"/>
 *     &lt;enumeration value="L3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeStatusAdviceType")
@XmlEnum
public enum DisputeStatusAdviceType {

    @XmlEnumValue("F1")
    F_1("F1"),
    @XmlEnumValue("R1")
    R_1("R1"),
    @XmlEnumValue("R2")
    R_2("R2"),
    @XmlEnumValue("R3")
    R_3("R3"),
    @XmlEnumValue("P1")
    P_1("P1"),
    @XmlEnumValue("L1")
    L_1("L1"),
    @XmlEnumValue("L2")
    L_2("L2"),
    @XmlEnumValue("L3")
    L_3("L3");
    private final String value;

    DisputeStatusAdviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeStatusAdviceType fromValue(String v) {
        for (DisputeStatusAdviceType c: DisputeStatusAdviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
