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
 * <p>Java class for RegionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CEMEA"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="LAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionType")
@XmlEnum
public enum RegionType {

    US("US"),
    AP("AP"),
    CEMEA("CEMEA"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    LAC("LAC");
    private final String value;

    RegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionType fromValue(String v) {
        for (RegionType c: RegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}