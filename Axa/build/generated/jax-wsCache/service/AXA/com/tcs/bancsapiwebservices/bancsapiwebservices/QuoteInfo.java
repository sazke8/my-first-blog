
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PaymentFrequency;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;


/**
 * <p>Java class for quoteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quoteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentFrequency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentFrequency"/>
 *         &lt;element name="package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quoteInfo", propOrder = {
    "paymentFrequency",
    "_package",
    "receiptsInfo"
})
public class QuoteInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PaymentFrequency paymentFrequency;
    @XmlElement(name = "package")
    protected String _package;
    @XmlElementRef(name = "receiptsInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReceiptsInfo> receiptsInfo;

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
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the receiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReceiptsInfo }{@code >}
     *     
     */
    public JAXBElement<ReceiptsInfo> getReceiptsInfo() {
        return receiptsInfo;
    }

    /**
     * Sets the value of the receiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReceiptsInfo }{@code >}
     *     
     */
    public void setReceiptsInfo(JAXBElement<ReceiptsInfo> value) {
        this.receiptsInfo = value;
    }

}
