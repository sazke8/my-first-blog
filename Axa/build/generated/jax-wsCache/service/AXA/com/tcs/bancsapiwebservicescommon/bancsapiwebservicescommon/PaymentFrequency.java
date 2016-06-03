
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Bi-Weekly"/>
 *     &lt;enumeration value="FortNightly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="SemiAnnual"/>
 *     &lt;enumeration value="Annual"/>
 *     &lt;enumeration value="Cash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentFrequency")
@XmlEnum
public enum PaymentFrequency {

    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Bi-Weekly")
    BI_WEEKLY("Bi-Weekly"),
    @XmlEnumValue("FortNightly")
    FORT_NIGHTLY("FortNightly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("SemiAnnual")
    SEMI_ANNUAL("SemiAnnual"),
    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("Cash")
    CASH("Cash");
    private final String value;

    PaymentFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentFrequency fromValue(String v) {
        for (PaymentFrequency c: PaymentFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
