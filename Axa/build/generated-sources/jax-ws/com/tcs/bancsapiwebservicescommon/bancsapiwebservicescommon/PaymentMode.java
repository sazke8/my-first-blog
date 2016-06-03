
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Cheque"/>
 *     &lt;enumeration value="Debit"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="PayrollDiscount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentMode")
@XmlEnum
public enum PaymentMode {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    AMEX("AMEX"),
    VISA("VISA"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("PayrollDiscount")
    PAYROLL_DISCOUNT("PayrollDiscount");
    private final String value;

    PaymentMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMode fromValue(String v) {
        for (PaymentMode c: PaymentMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
