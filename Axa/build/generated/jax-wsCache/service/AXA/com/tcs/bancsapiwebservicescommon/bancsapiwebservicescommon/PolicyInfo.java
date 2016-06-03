
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fichaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyType" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyApplicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="policyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="policyExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="policyIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="policyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentMode" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}currency" minOccurs="0"/>
 *         &lt;element name="policyDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="policyDurationUnit" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyDurationUnit" minOccurs="0"/>
 *         &lt;element name="paymentByAgent" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}paymentByAgent" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyFeePaymentFrequency" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyFeePaymentFrequency" minOccurs="0"/>
 *         &lt;element name="bolsaApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bolsaPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bolsaReserveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bolsaAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cupoCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agentWorkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="crossSellingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poliAnnualFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netPremium" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}netPremium" minOccurs="0"/>
 *         &lt;element name="salesChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessTypeCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rcFolioNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subSegmentoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="underwriting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyInfo", propOrder = {
    "fichaCode",
    "fichaVersion",
    "fichaYear",
    "subgroup",
    "policyNumber",
    "policyType",
    "companyId",
    "policyApplicationDate",
    "policyStartDate",
    "policyExpiryDate",
    "policyIssueDate",
    "policyStatus",
    "cancelDate",
    "cancelReason",
    "groupId",
    "contractNumber",
    "sector",
    "paymentMode",
    "currency",
    "policyDuration",
    "policyDurationUnit",
    "paymentByAgent",
    "businessType",
    "policyFeePaymentFrequency",
    "bolsaApprovalCode",
    "bolsaPercentage",
    "bolsaReserveId",
    "bolsaAmount",
    "cupoCode",
    "agentWorkOrderNumber",
    "campaignCode",
    "crossSellingCode",
    "commissionPercentage",
    "previousPolicy",
    "poliAnnualFactor",
    "netPremium",
    "salesChannelId",
    "businessTypeCC",
    "organizationID",
    "organizationName",
    "collectionDay",
    "rcFolioNumber",
    "subSegmentoNegocio",
    "underwriting",
    "authorized"
})
public class PolicyInfo {

    protected String fichaCode;
    protected String fichaVersion;
    protected String fichaYear;
    protected String subgroup;
    protected String policyNumber;
    @XmlSchemaType(name = "string")
    protected PolicyType policyType;
    protected String companyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyApplicationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyExpiryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyIssueDate;
    protected String policyStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    protected String cancelReason;
    protected String groupId;
    protected String contractNumber;
    protected String sector;
    @XmlSchemaType(name = "string")
    protected PaymentMode paymentMode;
    @XmlSchemaType(name = "string")
    protected Currency currency;
    protected BigInteger policyDuration;
    @XmlSchemaType(name = "string")
    protected PolicyDurationUnit policyDurationUnit;
    protected String paymentByAgent;
    protected String businessType;
    @XmlSchemaType(name = "string")
    protected PolicyFeePaymentFrequency policyFeePaymentFrequency;
    protected String bolsaApprovalCode;
    protected String bolsaPercentage;
    protected String bolsaReserveId;
    protected String bolsaAmount;
    protected List<String> cupoCode;
    protected String agentWorkOrderNumber;
    protected List<String> campaignCode;
    protected String crossSellingCode;
    protected String commissionPercentage;
    protected String previousPolicy;
    protected String poliAnnualFactor;
    protected BigDecimal netPremium;
    protected String salesChannelId;
    protected String businessTypeCC;
    protected String organizationID;
    protected String organizationName;
    protected BigInteger collectionDay;
    protected String rcFolioNumber;
    protected String subSegmentoNegocio;
    protected String underwriting;
    protected String authorized;

    /**
     * Gets the value of the fichaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFichaCode() {
        return fichaCode;
    }

    /**
     * Sets the value of the fichaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFichaCode(String value) {
        this.fichaCode = value;
    }

    /**
     * Gets the value of the fichaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFichaVersion() {
        return fichaVersion;
    }

    /**
     * Sets the value of the fichaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFichaVersion(String value) {
        this.fichaVersion = value;
    }

    /**
     * Gets the value of the fichaYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFichaYear() {
        return fichaYear;
    }

    /**
     * Sets the value of the fichaYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFichaYear(String value) {
        this.fichaYear = value;
    }

    /**
     * Gets the value of the subgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubgroup() {
        return subgroup;
    }

    /**
     * Sets the value of the subgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubgroup(String value) {
        this.subgroup = value;
    }

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
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the policyApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyApplicationDate() {
        return policyApplicationDate;
    }

    /**
     * Sets the value of the policyApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyApplicationDate(XMLGregorianCalendar value) {
        this.policyApplicationDate = value;
    }

    /**
     * Gets the value of the policyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyStartDate() {
        return policyStartDate;
    }

    /**
     * Sets the value of the policyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyStartDate(XMLGregorianCalendar value) {
        this.policyStartDate = value;
    }

    /**
     * Gets the value of the policyExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyExpiryDate() {
        return policyExpiryDate;
    }

    /**
     * Sets the value of the policyExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyExpiryDate(XMLGregorianCalendar value) {
        this.policyExpiryDate = value;
    }

    /**
     * Gets the value of the policyIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyIssueDate() {
        return policyIssueDate;
    }

    /**
     * Sets the value of the policyIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyIssueDate(XMLGregorianCalendar value) {
        this.policyIssueDate = value;
    }

    /**
     * Gets the value of the policyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets the value of the policyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
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
     * Gets the value of the policyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPolicyDuration() {
        return policyDuration;
    }

    /**
     * Sets the value of the policyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPolicyDuration(BigInteger value) {
        this.policyDuration = value;
    }

    /**
     * Gets the value of the policyDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDurationUnit }
     *     
     */
    public PolicyDurationUnit getPolicyDurationUnit() {
        return policyDurationUnit;
    }

    /**
     * Sets the value of the policyDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDurationUnit }
     *     
     */
    public void setPolicyDurationUnit(PolicyDurationUnit value) {
        this.policyDurationUnit = value;
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

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the policyFeePaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyFeePaymentFrequency }
     *     
     */
    public PolicyFeePaymentFrequency getPolicyFeePaymentFrequency() {
        return policyFeePaymentFrequency;
    }

    /**
     * Sets the value of the policyFeePaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyFeePaymentFrequency }
     *     
     */
    public void setPolicyFeePaymentFrequency(PolicyFeePaymentFrequency value) {
        this.policyFeePaymentFrequency = value;
    }

    /**
     * Gets the value of the bolsaApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolsaApprovalCode() {
        return bolsaApprovalCode;
    }

    /**
     * Sets the value of the bolsaApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolsaApprovalCode(String value) {
        this.bolsaApprovalCode = value;
    }

    /**
     * Gets the value of the bolsaPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolsaPercentage() {
        return bolsaPercentage;
    }

    /**
     * Sets the value of the bolsaPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolsaPercentage(String value) {
        this.bolsaPercentage = value;
    }

    /**
     * Gets the value of the bolsaReserveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolsaReserveId() {
        return bolsaReserveId;
    }

    /**
     * Sets the value of the bolsaReserveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolsaReserveId(String value) {
        this.bolsaReserveId = value;
    }

    /**
     * Gets the value of the bolsaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolsaAmount() {
        return bolsaAmount;
    }

    /**
     * Sets the value of the bolsaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolsaAmount(String value) {
        this.bolsaAmount = value;
    }

    /**
     * Gets the value of the cupoCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cupoCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCupoCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCupoCode() {
        if (cupoCode == null) {
            cupoCode = new ArrayList<String>();
        }
        return this.cupoCode;
    }

    /**
     * Gets the value of the agentWorkOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentWorkOrderNumber() {
        return agentWorkOrderNumber;
    }

    /**
     * Sets the value of the agentWorkOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentWorkOrderNumber(String value) {
        this.agentWorkOrderNumber = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCampaignCode() {
        if (campaignCode == null) {
            campaignCode = new ArrayList<String>();
        }
        return this.campaignCode;
    }

    /**
     * Gets the value of the crossSellingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossSellingCode() {
        return crossSellingCode;
    }

    /**
     * Sets the value of the crossSellingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossSellingCode(String value) {
        this.crossSellingCode = value;
    }

    /**
     * Gets the value of the commissionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    /**
     * Sets the value of the commissionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPercentage(String value) {
        this.commissionPercentage = value;
    }

    /**
     * Gets the value of the previousPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPolicy() {
        return previousPolicy;
    }

    /**
     * Sets the value of the previousPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPolicy(String value) {
        this.previousPolicy = value;
    }

    /**
     * Gets the value of the poliAnnualFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliAnnualFactor() {
        return poliAnnualFactor;
    }

    /**
     * Sets the value of the poliAnnualFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliAnnualFactor(String value) {
        this.poliAnnualFactor = value;
    }

    /**
     * Gets the value of the netPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPremium() {
        return netPremium;
    }

    /**
     * Sets the value of the netPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPremium(BigDecimal value) {
        this.netPremium = value;
    }

    /**
     * Gets the value of the salesChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Sets the value of the salesChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Gets the value of the businessTypeCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTypeCC() {
        return businessTypeCC;
    }

    /**
     * Sets the value of the businessTypeCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTypeCC(String value) {
        this.businessTypeCC = value;
    }

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationID(String value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
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
     * Gets the value of the underwriting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwriting() {
        return underwriting;
    }

    /**
     * Sets the value of the underwriting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwriting(String value) {
        this.underwriting = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorized(String value) {
        this.authorized = value;
    }

}
