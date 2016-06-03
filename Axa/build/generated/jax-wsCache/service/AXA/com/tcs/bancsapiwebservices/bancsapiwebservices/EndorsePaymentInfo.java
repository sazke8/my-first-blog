
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PaymentFrequency;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PaymentMode;


/**
 * <p>Java class for endorsePaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsePaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentFrequency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentFrequency" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentMode" minOccurs="0"/>
 *         &lt;element name="paymentByAgent" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentByAgent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsePaymentInfo", propOrder = {
    "paymentFrequency",
    "paymentMode",
    "paymentByAgent"
})
public class EndorsePaymentInfo {

    @XmlSchemaType(name = "string")
    protected PaymentFrequency paymentFrequency;
    @XmlSchemaType(name = "string")
    protected PaymentMode paymentMode;
    protected String paymentByAgent;

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequency }
     *     
     */
    public PaymentFrequency getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequency }
     *     
     */
    public void setPaymentFrequency(PaymentFrequency value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMode }
     *     
     */
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMode }
     *     
     */
    public void setPaymentMode(PaymentMode value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the paymentByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentByAgent() {
        return paymentByAgent;
    }

    /**
     * Sets the value of the paymentByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentByAgent(String value) {
        this.paymentByAgent = value;
    }

}
