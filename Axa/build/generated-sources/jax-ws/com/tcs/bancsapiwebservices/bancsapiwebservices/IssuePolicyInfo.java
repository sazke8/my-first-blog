
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AgentInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.CardInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PartyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PolicyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.RiskInfo;


/**
 * <p>Java class for issuePolicyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issuePolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuancePolicyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyInfo" minOccurs="0"/>
 *         &lt;element name="sumInsured" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="netPremium" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}netPremium" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}tax" minOccurs="0"/>
 *         &lt;element name="issuanceRiskInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}riskInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="issuanceCustomerInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}partyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="issuanceCardInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}cardInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="issuanceAgentInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}agentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuePolicyInfo", propOrder = {
    "issuancePolicyInfo",
    "sumInsured",
    "netPremium",
    "tax",
    "issuanceRiskInfo",
    "issuanceCustomerInfo",
    "issuanceCardInfo",
    "issuanceAgentInfo"
})
public class IssuePolicyInfo {

    protected PolicyInfo issuancePolicyInfo;
    protected BigDecimal sumInsured;
    protected BigDecimal netPremium;
    protected BigDecimal tax;
    protected List<RiskInfo> issuanceRiskInfo;
    protected List<PartyInfo> issuanceCustomerInfo;
    protected List<CardInfo> issuanceCardInfo;
    protected List<AgentInfo> issuanceAgentInfo;

    /**
     * Gets the value of the issuancePolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInfo }
     *     
     */
    public PolicyInfo getIssuancePolicyInfo() {
        return issuancePolicyInfo;
    }

    /**
     * Sets the value of the issuancePolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInfo }
     *     
     */
    public void setIssuancePolicyInfo(PolicyInfo value) {
        this.issuancePolicyInfo = value;
    }

    /**
     * Gets the value of the sumInsured property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    /**
     * Sets the value of the sumInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumInsured(BigDecimal value) {
        this.sumInsured = value;
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
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the issuanceRiskInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuanceRiskInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuanceRiskInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInfo }
     * 
     * 
     */
    public List<RiskInfo> getIssuanceRiskInfo() {
        if (issuanceRiskInfo == null) {
            issuanceRiskInfo = new ArrayList<RiskInfo>();
        }
        return this.issuanceRiskInfo;
    }

    /**
     * Gets the value of the issuanceCustomerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuanceCustomerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuanceCustomerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInfo }
     * 
     * 
     */
    public List<PartyInfo> getIssuanceCustomerInfo() {
        if (issuanceCustomerInfo == null) {
            issuanceCustomerInfo = new ArrayList<PartyInfo>();
        }
        return this.issuanceCustomerInfo;
    }

    /**
     * Gets the value of the issuanceCardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuanceCardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuanceCardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardInfo }
     * 
     * 
     */
    public List<CardInfo> getIssuanceCardInfo() {
        if (issuanceCardInfo == null) {
            issuanceCardInfo = new ArrayList<CardInfo>();
        }
        return this.issuanceCardInfo;
    }

    /**
     * Gets the value of the issuanceAgentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuanceAgentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuanceAgentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentInfo }
     * 
     * 
     */
    public List<AgentInfo> getIssuanceAgentInfo() {
        if (issuanceAgentInfo == null) {
            issuanceAgentInfo = new ArrayList<AgentInfo>();
        }
        return this.issuanceAgentInfo;
    }

}
