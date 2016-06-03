
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.CoverageInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.Currency;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PartyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PaymentMode;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PolicyType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.RiskInfo;


/**
 * <p>Java class for issuePolicyDeatils complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issuePolicyDeatils">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyType"/>
 *         &lt;element name="policyIssued">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="YES"/>
 *               &lt;enumeration value="NO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="paymentMode" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentMode" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}currency" minOccurs="0"/>
 *         &lt;element name="collectionDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rcFolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subSegmentoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}quoteInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}discount"/>
 *         &lt;element name="vehicleInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}riskInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}partyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverageInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coverageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuePolicyDeatils", propOrder = {
    "policyNumber",
    "policyType",
    "policyIssued",
    "startDate",
    "expiryDate",
    "applicationDate",
    "status",
    "riskCount",
    "paymentMode",
    "currency",
    "collectionDay",
    "rcFolioNumber",
    "subSegmentoNegocio",
    "quoteInfo",
    "discount",
    "vehicleInfo",
    "customerDetails",
    "coverageInfo"
})
public class IssuePolicyDeatils {

    protected String policyNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PolicyType policyType;
    @XmlElement(required = true)
    protected String policyIssued;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    protected String status;
    @XmlElement(required = true)
    protected BigInteger riskCount;
    @XmlSchemaType(name = "string")
    protected PaymentMode paymentMode;
    @XmlSchemaType(name = "string")
    protected Currency currency;
    protected BigInteger collectionDay;
    protected String rcFolioNumber;
    protected String subSegmentoNegocio;
    protected List<QuoteInfo> quoteInfo;
    @XmlElement(required = true)
    protected BigDecimal discount;
    @XmlElement(nillable = true)
    protected List<RiskInfo> vehicleInfo;
    @XmlElement(nillable = true)
    protected List<PartyInfo> customerDetails;
    @XmlElement(nillable = true)
    protected List<CoverageInfo> coverageInfo;

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicyType(PolicyType value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the policyIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyIssued() {
        return policyIssued;
    }

    /**
     * Sets the value of the policyIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyIssued(String value) {
        this.policyIssued = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the riskCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRiskCount() {
        return riskCount;
    }

    /**
     * Sets the value of the riskCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRiskCount(BigInteger value) {
        this.riskCount = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the collectionDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollectionDay() {
        return collectionDay;
    }

    /**
     * Sets the value of the collectionDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollectionDay(BigInteger value) {
        this.collectionDay = value;
    }

    /**
     * Gets the value of the rcFolioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcFolioNumber() {
        return rcFolioNumber;
    }

    /**
     * Sets the value of the rcFolioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcFolioNumber(String value) {
        this.rcFolioNumber = value;
    }

    /**
     * Gets the value of the subSegmentoNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSegmentoNegocio() {
        return subSegmentoNegocio;
    }

    /**
     * Sets the value of the subSegmentoNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSegmentoNegocio(String value) {
        this.subSegmentoNegocio = value;
    }

    /**
     * Gets the value of the quoteInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteInfo }
     * 
     * 
     */
    public List<QuoteInfo> getQuoteInfo() {
        if (quoteInfo == null) {
            quoteInfo = new ArrayList<QuoteInfo>();
        }
        return this.quoteInfo;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInfo }
     * 
     * 
     */
    public List<RiskInfo> getVehicleInfo() {
        if (vehicleInfo == null) {
            vehicleInfo = new ArrayList<RiskInfo>();
        }
        return this.vehicleInfo;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInfo }
     * 
     * 
     */
    public List<PartyInfo> getCustomerDetails() {
        if (customerDetails == null) {
            customerDetails = new ArrayList<PartyInfo>();
        }
        return this.customerDetails;
    }

    /**
     * Gets the value of the coverageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageInfo }
     * 
     * 
     */
    public List<CoverageInfo> getCoverageInfo() {
        if (coverageInfo == null) {
            coverageInfo = new ArrayList<CoverageInfo>();
        }
        return this.coverageInfo;
    }

}
