
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AgentInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.SearchType;


/**
 * <p>Java class for search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}agentInfo"/>
 *         &lt;element name="searchType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}searchType"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coverageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchFilter" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GENERAL_INFO"/>
 *               &lt;enumeration value="CUSTOMER_INFO"/>
 *               &lt;enumeration value="FINANCIAL_ENDORSE_INFO"/>
 *               &lt;enumeration value="NONFINANCIAL_ENDORSE_INFO"/>
 *               &lt;enumeration value="RECEIPTS_INFO"/>
 *               &lt;enumeration value="COVERAGE_INFO"/>
 *               &lt;enumeration value="SPECIALEQUIP_INFO"/>
 *               &lt;enumeration value="BENEFICIARY_INFO"/>
 *               &lt;enumeration value="DRIVER_INFO"/>
 *               &lt;enumeration value="ACCIDENT_BENEFICIARY_INFO"/>
 *               &lt;enumeration value="RENEWAL_QUOTE_INFO"/>
 *               &lt;enumeration value="CARD_INFO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="renewalQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fichaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search", propOrder = {
    "userCode",
    "roleCode",
    "requestId",
    "agentInfo",
    "searchType",
    "policyNumber",
    "riskNumber",
    "coverageCode",
    "customerCode",
    "customerRole",
    "endorsementNumber",
    "searchFilter",
    "renewalQuoteNumber",
    "previousPolicyNumber",
    "fichaNumber",
    "fichaVersion",
    "fichaYear",
    "agentCode"
})
public class Search {

    protected String userCode;
    protected String roleCode;
    protected String requestId;
    @XmlElement(required = true)
    protected AgentInfo agentInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SearchType searchType;
    @XmlElement(required = true)
    protected String policyNumber;
    protected String riskNumber;
    protected String coverageCode;
    protected String customerCode;
    protected String customerRole;
    protected String endorsementNumber;
    @XmlElement(required = true)
    protected List<String> searchFilter;
    protected String renewalQuoteNumber;
    protected String previousPolicyNumber;
    protected BigInteger fichaNumber;
    protected String fichaVersion;
    protected String fichaYear;
    @XmlElement(required = true)
    protected String agentCode;

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the agentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo }
     *     
     */
    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    /**
     * Sets the value of the agentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo }
     *     
     */
    public void setAgentInfo(AgentInfo value) {
        this.agentInfo = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearchType(SearchType value) {
        this.searchType = value;
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
     * Gets the value of the riskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskNumber() {
        return riskNumber;
    }

    /**
     * Sets the value of the riskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskNumber(String value) {
        this.riskNumber = value;
    }

    /**
     * Gets the value of the coverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageCode() {
        return coverageCode;
    }

    /**
     * Sets the value of the coverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageCode(String value) {
        this.coverageCode = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the customerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRole() {
        return customerRole;
    }

    /**
     * Sets the value of the customerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRole(String value) {
        this.customerRole = value;
    }

    /**
     * Gets the value of the endorsementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementNumber() {
        return endorsementNumber;
    }

    /**
     * Sets the value of the endorsementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementNumber(String value) {
        this.endorsementNumber = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchFilter() {
        if (searchFilter == null) {
            searchFilter = new ArrayList<String>();
        }
        return this.searchFilter;
    }

    /**
     * Gets the value of the renewalQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalQuoteNumber() {
        return renewalQuoteNumber;
    }

    /**
     * Sets the value of the renewalQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalQuoteNumber(String value) {
        this.renewalQuoteNumber = value;
    }

    /**
     * Gets the value of the previousPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPolicyNumber() {
        return previousPolicyNumber;
    }

    /**
     * Sets the value of the previousPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPolicyNumber(String value) {
        this.previousPolicyNumber = value;
    }

    /**
     * Gets the value of the fichaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFichaNumber() {
        return fichaNumber;
    }

    /**
     * Sets the value of the fichaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFichaNumber(BigInteger value) {
        this.fichaNumber = value;
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
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

}
