
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.CardInfo;


/**
 * <p>Java class for generalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfEndorsement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endorsementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MainAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executeOperation" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}executeOperation"/>
 *         &lt;element name="endorseRiskInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorseRiskInfo" minOccurs="0"/>
 *         &lt;element name="endorseCustomerInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorseCustomerInfo" minOccurs="0"/>
 *         &lt;element name="endorseCoverInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorseCoverInfo" minOccurs="0"/>
 *         &lt;element name="endorsePaymentInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorsePaymentInfo" minOccurs="0"/>
 *         &lt;element name="endorseAgentInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorseAgentInfo" minOccurs="0"/>
 *         &lt;element name="endorseCardInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}cardInfo" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalInfo", propOrder = {
    "userCode",
    "roleCode",
    "requestId",
    "typeOfEndorsement",
    "endorsementEffectiveDate",
    "endorsementReason",
    "policyNumber",
    "policyEffectiveDate",
    "mainAgent",
    "groupId",
    "contractNumber",
    "executeOperation",
    "endorseRiskInfo",
    "endorseCustomerInfo",
    "endorseCoverInfo",
    "endorsePaymentInfo",
    "endorseAgentInfo",
    "endorseCardInfo"
})
public class GeneralInfo {

    protected String userCode;
    protected String roleCode;
    protected String requestId;
    @XmlElement(required = true)
    protected String typeOfEndorsement;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endorsementEffectiveDate;
    protected String endorsementReason;
    @XmlElement(required = true)
    protected String policyNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "MainAgent")
    protected String mainAgent;
    protected String groupId;
    protected String contractNumber;
    @XmlElement(required = true)
    protected String executeOperation;
    protected EndorseRiskInfo endorseRiskInfo;
    protected EndorseCustomerInfo endorseCustomerInfo;
    protected EndorseCoverInfo endorseCoverInfo;
    protected EndorsePaymentInfo endorsePaymentInfo;
    protected EndorseAgentInfo endorseAgentInfo;
    protected List<CardInfo> endorseCardInfo;

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
     * Gets the value of the typeOfEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfEndorsement() {
        return typeOfEndorsement;
    }

    /**
     * Sets the value of the typeOfEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfEndorsement(String value) {
        this.typeOfEndorsement = value;
    }

    /**
     * Gets the value of the endorsementEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndorsementEffectiveDate() {
        return endorsementEffectiveDate;
    }

    /**
     * Sets the value of the endorsementEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndorsementEffectiveDate(XMLGregorianCalendar value) {
        this.endorsementEffectiveDate = value;
    }

    /**
     * Gets the value of the endorsementReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementReason() {
        return endorsementReason;
    }

    /**
     * Sets the value of the endorsementReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementReason(String value) {
        this.endorsementReason = value;
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
     * Gets the value of the policyEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    /**
     * Sets the value of the policyEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyEffectiveDate(XMLGregorianCalendar value) {
        this.policyEffectiveDate = value;
    }

    /**
     * Gets the value of the mainAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainAgent() {
        return mainAgent;
    }

    /**
     * Sets the value of the mainAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainAgent(String value) {
        this.mainAgent = value;
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
     * Gets the value of the executeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteOperation() {
        return executeOperation;
    }

    /**
     * Sets the value of the executeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteOperation(String value) {
        this.executeOperation = value;
    }

    /**
     * Gets the value of the endorseRiskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EndorseRiskInfo }
     *     
     */
    public EndorseRiskInfo getEndorseRiskInfo() {
        return endorseRiskInfo;
    }

    /**
     * Sets the value of the endorseRiskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorseRiskInfo }
     *     
     */
    public void setEndorseRiskInfo(EndorseRiskInfo value) {
        this.endorseRiskInfo = value;
    }

    /**
     * Gets the value of the endorseCustomerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EndorseCustomerInfo }
     *     
     */
    public EndorseCustomerInfo getEndorseCustomerInfo() {
        return endorseCustomerInfo;
    }

    /**
     * Sets the value of the endorseCustomerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorseCustomerInfo }
     *     
     */
    public void setEndorseCustomerInfo(EndorseCustomerInfo value) {
        this.endorseCustomerInfo = value;
    }

    /**
     * Gets the value of the endorseCoverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EndorseCoverInfo }
     *     
     */
    public EndorseCoverInfo getEndorseCoverInfo() {
        return endorseCoverInfo;
    }

    /**
     * Sets the value of the endorseCoverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorseCoverInfo }
     *     
     */
    public void setEndorseCoverInfo(EndorseCoverInfo value) {
        this.endorseCoverInfo = value;
    }

    /**
     * Gets the value of the endorsePaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsePaymentInfo }
     *     
     */
    public EndorsePaymentInfo getEndorsePaymentInfo() {
        return endorsePaymentInfo;
    }

    /**
     * Sets the value of the endorsePaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsePaymentInfo }
     *     
     */
    public void setEndorsePaymentInfo(EndorsePaymentInfo value) {
        this.endorsePaymentInfo = value;
    }

    /**
     * Gets the value of the endorseAgentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EndorseAgentInfo }
     *     
     */
    public EndorseAgentInfo getEndorseAgentInfo() {
        return endorseAgentInfo;
    }

    /**
     * Sets the value of the endorseAgentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorseAgentInfo }
     *     
     */
    public void setEndorseAgentInfo(EndorseAgentInfo value) {
        this.endorseAgentInfo = value;
    }

    /**
     * Gets the value of the endorseCardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorseCardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorseCardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardInfo }
     * 
     * 
     */
    public List<CardInfo> getEndorseCardInfo() {
        if (endorseCardInfo == null) {
            endorseCardInfo = new ArrayList<CardInfo>();
        }
        return this.endorseCardInfo;
    }

}
