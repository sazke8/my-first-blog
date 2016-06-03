
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyFeePaymentFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policyFeePaymentFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Installments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyFeePaymentFrequency")
@XmlEnum
public enum PolicyFeePaymentFrequency {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Installments")
    INSTALLMENTS("Installments");
    private final String value;

    PolicyFeePaymentFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyFeePaymentFrequency fromValue(String v) {
        for (PolicyFeePaymentFrequency c: PolicyFeePaymentFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
