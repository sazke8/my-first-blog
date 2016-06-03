
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receiptsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiptsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPremium" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}totalPremium"/>
 *         &lt;element name="netPremium" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}netPremium"/>
 *         &lt;element name="installmentSurcharge" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}installmentSurcharge"/>
 *         &lt;element name="tax" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}tax"/>
 *         &lt;element name="policyFee" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyFee"/>
 *         &lt;element name="endorsementFee" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}endorsementFee"/>
 *         &lt;element name="commission" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}commission"/>
 *         &lt;element name="cession" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}cession"/>
 *         &lt;element name="discount" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}discount"/>
 *         &lt;element name="UDI" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}UDI"/>
 *         &lt;element name="coinsurerPremium" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coinsurerPremium"/>
 *         &lt;element name="coinsurerPolicyFee" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coinsurerPolicyFee"/>
 *         &lt;element name="coinsurerInstSurcharge" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coinsurerInstSurcharge"/>
 *         &lt;element name="refundReceiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}refundReceiptsInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiptsInfo", propOrder = {
    "applicationDate",
    "operationType",
    "operationID",
    "totalPremium",
    "netPremium",
    "installmentSurcharge",
    "tax",
    "policyFee",
    "endorsementFee",
    "commission",
    "cession",
    "discount",
    "udi",
    "coinsurerPremium",
    "coinsurerPolicyFee",
    "coinsurerInstSurcharge",
    "refundReceiptsInfo"
})
public class ReceiptsInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    protected String operationType;
    protected String operationID;
    @XmlElement(required = true)
    protected BigDecimal totalPremium;
    @XmlElement(required = true)
    protected BigDecimal netPremium;
    @XmlElement(required = true)
    protected BigDecimal installmentSurcharge;
    @XmlElement(required = true)
    protected BigDecimal tax;
    @XmlElement(required = true)
    protected BigDecimal policyFee;
    @XmlElement(required = true)
    protected BigDecimal endorsementFee;
    @XmlElement(required = true)
    protected BigDecimal commission;
    @XmlElement(required = true)
    protected BigDecimal cession;
    @XmlElement(required = true)
    protected BigDecimal discount;
    @XmlElement(name = "UDI", required = true)
    protected BigDecimal udi;
    @XmlElement(required = true)
    protected BigDecimal coinsurerPremium;
    @XmlElement(required = true)
    protected BigDecimal coinsurerPolicyFee;
    @XmlElement(required = true)
    protected BigDecimal coinsurerInstSurcharge;
    @XmlElement(required = true)
    protected RefundReceiptsInfo refundReceiptsInfo;

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
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * Gets the value of the totalPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPremium() {
        return totalPremium;
    }

    /**
     * Sets the value of the totalPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPremium(BigDecimal value) {
        this.totalPremium = value;
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
     * Gets the value of the installmentSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentSurcharge() {
        return installmentSurcharge;
    }

    /**
     * Sets the value of the installmentSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentSurcharge(BigDecimal value) {
        this.installmentSurcharge = value;
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
     * Gets the value of the policyFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyFee() {
        return policyFee;
    }

    /**
     * Sets the value of the policyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyFee(BigDecimal value) {
        this.policyFee = value;
    }

    /**
     * Gets the value of the endorsementFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndorsementFee() {
        return endorsementFee;
    }

    /**
     * Sets the value of the endorsementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndorsementFee(BigDecimal value) {
        this.endorsementFee = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * Gets the value of the cession property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCession() {
        return cession;
    }

    /**
     * Sets the value of the cession property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCession(BigDecimal value) {
        this.cession = value;
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
     * Gets the value of the udi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUDI() {
        return udi;
    }

    /**
     * Sets the value of the udi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUDI(BigDecimal value) {
        this.udi = value;
    }

    /**
     * Gets the value of the coinsurerPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoinsurerPremium() {
        return coinsurerPremium;
    }

    /**
     * Sets the value of the coinsurerPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoinsurerPremium(BigDecimal value) {
        this.coinsurerPremium = value;
    }

    /**
     * Gets the value of the coinsurerPolicyFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoinsurerPolicyFee() {
        return coinsurerPolicyFee;
    }

    /**
     * Sets the value of the coinsurerPolicyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoinsurerPolicyFee(BigDecimal value) {
        this.coinsurerPolicyFee = value;
    }

    /**
     * Gets the value of the coinsurerInstSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoinsurerInstSurcharge() {
        return coinsurerInstSurcharge;
    }

    /**
     * Sets the value of the coinsurerInstSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoinsurerInstSurcharge(BigDecimal value) {
        this.coinsurerInstSurcharge = value;
    }

    /**
     * Gets the value of the refundReceiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefundReceiptsInfo }
     *     
     */
    public RefundReceiptsInfo getRefundReceiptsInfo() {
        return refundReceiptsInfo;
    }

    /**
     * Sets the value of the refundReceiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundReceiptsInfo }
     *     
     */
    public void setRefundReceiptsInfo(RefundReceiptsInfo value) {
        this.refundReceiptsInfo = value;
    }

}
