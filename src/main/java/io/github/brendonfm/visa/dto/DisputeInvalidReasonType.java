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
 * <p>Java class for DisputeInvalidReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeInvalidReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDRP1"/>
 *     &lt;enumeration value="IDRP2"/>
 *     &lt;enumeration value="IDRP3"/>
 *     &lt;enumeration value="IDRP4"/>
 *     &lt;enumeration value="IDRC1"/>
 *     &lt;enumeration value="IDRC2"/>
 *     &lt;enumeration value="IDRC3"/>
 *     &lt;enumeration value="IDRC4"/>
 *     &lt;enumeration value="IDRC5"/>
 *     &lt;enumeration value="IDRC6"/>
 *     &lt;enumeration value="IDRC7"/>
 *     &lt;enumeration value="IDRC8"/>
 *     &lt;enumeration value="IDRC9"/>
 *     &lt;enumeration value="IDRC10"/>
 *     &lt;enumeration value="IDRC11"/>
 *     &lt;enumeration value="IDRC12"/>
 *     &lt;enumeration value="IDRC13"/>
 *     &lt;enumeration value="IDRC14"/>
 *     &lt;enumeration value="IDRC15"/>
 *     &lt;enumeration value="IDRC16"/>
 *     &lt;enumeration value="IDRC17"/>
 *     &lt;enumeration value="IDRC18"/>
 *     &lt;enumeration value="IDRC19"/>
 *     &lt;enumeration value="IDRC20"/>
 *     &lt;enumeration value="IDRC21"/>
 *     &lt;enumeration value="IDRC22"/>
 *     &lt;enumeration value="IDRC23"/>
 *     &lt;enumeration value="IDRC24"/>
 *     &lt;enumeration value="IDRC25"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeInvalidReasonType")
@XmlEnum
public enum DisputeInvalidReasonType {

    @XmlEnumValue("IDRP1")
    IDRP_1("IDRP1"),
    @XmlEnumValue("IDRP2")
    IDRP_2("IDRP2"),
    @XmlEnumValue("IDRP3")
    IDRP_3("IDRP3"),
    @XmlEnumValue("IDRP4")
    IDRP_4("IDRP4"),
    @XmlEnumValue("IDRC1")
    IDRC_1("IDRC1"),
    @XmlEnumValue("IDRC2")
    IDRC_2("IDRC2"),
    @XmlEnumValue("IDRC3")
    IDRC_3("IDRC3"),
    @XmlEnumValue("IDRC4")
    IDRC_4("IDRC4"),
    @XmlEnumValue("IDRC5")
    IDRC_5("IDRC5"),
    @XmlEnumValue("IDRC6")
    IDRC_6("IDRC6"),
    @XmlEnumValue("IDRC7")
    IDRC_7("IDRC7"),
    @XmlEnumValue("IDRC8")
    IDRC_8("IDRC8"),
    @XmlEnumValue("IDRC9")
    IDRC_9("IDRC9"),
    @XmlEnumValue("IDRC10")
    IDRC_10("IDRC10"),
    @XmlEnumValue("IDRC11")
    IDRC_11("IDRC11"),
    @XmlEnumValue("IDRC12")
    IDRC_12("IDRC12"),
    @XmlEnumValue("IDRC13")
    IDRC_13("IDRC13"),
    @XmlEnumValue("IDRC14")
    IDRC_14("IDRC14"),
    @XmlEnumValue("IDRC15")
    IDRC_15("IDRC15"),
    @XmlEnumValue("IDRC16")
    IDRC_16("IDRC16"),
    @XmlEnumValue("IDRC17")
    IDRC_17("IDRC17"),
    @XmlEnumValue("IDRC18")
    IDRC_18("IDRC18"),
    @XmlEnumValue("IDRC19")
    IDRC_19("IDRC19"),
    @XmlEnumValue("IDRC20")
    IDRC_20("IDRC20"),
    @XmlEnumValue("IDRC21")
    IDRC_21("IDRC21"),
    @XmlEnumValue("IDRC22")
    IDRC_22("IDRC22"),
    @XmlEnumValue("IDRC23")
    IDRC_23("IDRC23"),
    @XmlEnumValue("IDRC24")
    IDRC_24("IDRC24"),
    @XmlEnumValue("IDRC25")
    IDRC_25("IDRC25");
    private final String value;

    DisputeInvalidReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeInvalidReasonType fromValue(String v) {
        for (DisputeInvalidReasonType c: DisputeInvalidReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
