//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

public enum EFLActionCodeType {

    EFL_04("EFL04"),
    EFL_05("EFL05"),
    EFL_07("EFL07"),
    EFL_14("EFL14"),
    EFL_41("EFL41"),
    EFL_43("EFL43"),
    EFL_54("EFL54");
	
    private final String value;

    EFLActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EFLActionCodeType fromValue(String v) {
        for (EFLActionCodeType c: EFLActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
