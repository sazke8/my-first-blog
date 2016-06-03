
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deductibleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deductibleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="variable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deductibleType")
@XmlEnum
public enum DeductibleType {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("variable")
    VARIABLE("variable");
    private final String value;

    DeductibleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeductibleType fromValue(String v) {
        for (DeductibleType c: DeductibleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
