
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.CoverageInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PaymentFrequency;


/**
 * <p>Java class for packageCoverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageCoverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentFrequency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentFrequency"/>
 *         &lt;element name="package" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riskCoverDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coverageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageCoverInfo", propOrder = {
    "paymentFrequency",
    "_package",
    "riskCoverDetails"
})
public class PackageCoverInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PaymentFrequency paymentFrequency;
    @XmlElement(name = "package", required = true)
    protected String _package;
    protected List<CoverageInfo> riskCoverDetails;

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
     * Gets the value of the riskCoverDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskCoverDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskCoverDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageInfo }
     * 
     * 
     */
    public List<CoverageInfo> getRiskCoverDetails() {
        if (riskCoverDetails == null) {
            riskCoverDetails = new ArrayList<CoverageInfo>();
        }
        return this.riskCoverDetails;
    }

}
