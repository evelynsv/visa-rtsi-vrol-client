//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionFileListingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionFileListingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EFNEG"/>
 *     &lt;enumeration value="EFVIP"/>
 *     &lt;enumeration value="EFDEL"/>
 *     &lt;enumeration value="EFINQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionFileListingType")
@XmlEnum
public enum ExceptionFileListingType {

    EFNEG,
    EFVIP,
    EFDEL,
    EFINQ;

    public String value() {
        return name();
    }

    public static ExceptionFileListingType fromValue(String v) {
        return valueOf(v);
    }

}
