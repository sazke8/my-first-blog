
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyDurationUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policyDurationUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyDurationUnit")
@XmlEnum
public enum PolicyDurationUnit {

    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Year")
    YEAR("Year");
    private final String value;

    PolicyDurationUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyDurationUnit fromValue(String v) {
        for (PolicyDurationUnit c: PolicyDurationUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
