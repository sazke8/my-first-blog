
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issuance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issuance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}productCode"/>
 *         &lt;element name="typeOperation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ExpressQuote"/>
 *               &lt;enumeration value="Quotation"/>
 *               &lt;enumeration value="Issuance"/>
 *               &lt;enumeration value="ReQuotation"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="issuePolicyInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}issuePolicyInfo"/>
 *         &lt;element name="carruselValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="packageCoverInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}packageCoverInfo" maxOccurs="16" minOccurs="0"/>
 *         &lt;element name="quickQuoteInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}quickQuoteInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuance", propOrder = {
    "userCode",
    "roleCode",
    "requestId",
    "productCode",
    "typeOperation",
    "issuePolicyInfo",
    "carruselValidation",
    "packageCoverInfo",
    "quickQuoteInfo"
})
public class Issuance {

    protected String userCode;
    protected String roleCode;
    protected String requestId;
    @XmlElement(required = true)
    protected String productCode;
    @XmlElement(required = true)
    protected String typeOperation;
    @XmlElement(required = true)
    protected IssuePolicyInfo issuePolicyInfo;
    protected Boolean carruselValidation;
    protected List<PackageCoverInfo> packageCoverInfo;
    @XmlElement(required = true)
    protected List<QuickQuoteInfo> quickQuoteInfo;

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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the typeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOperation() {
        return typeOperation;
    }

    /**
     * Sets the value of the typeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOperation(String value) {
        this.typeOperation = value;
    }

    /**
     * Gets the value of the issuePolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssuePolicyInfo }
     *     
     */
    public IssuePolicyInfo getIssuePolicyInfo() {
        return issuePolicyInfo;
    }

    /**
     * Sets the value of the issuePolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuePolicyInfo }
     *     
     */
    public void setIssuePolicyInfo(IssuePolicyInfo value) {
        this.issuePolicyInfo = value;
    }

    /**
     * Gets the value of the carruselValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarruselValidation() {
        return carruselValidation;
    }

    /**
     * Sets the value of the carruselValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarruselValidation(Boolean value) {
        this.carruselValidation = value;
    }

    /**
     * Gets the value of the packageCoverInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageCoverInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageCoverInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageCoverInfo }
     * 
     * 
     */
    public List<PackageCoverInfo> getPackageCoverInfo() {
        if (packageCoverInfo == null) {
            packageCoverInfo = new ArrayList<PackageCoverInfo>();
        }
        return this.packageCoverInfo;
    }

    /**
     * Gets the value of the quickQuoteInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickQuoteInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickQuoteInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickQuoteInfo }
     * 
     * 
     */
    public List<QuickQuoteInfo> getQuickQuoteInfo() {
        if (quickQuoteInfo == null) {
            quickQuoteInfo = new ArrayList<QuickQuoteInfo>();
        }
        return this.quickQuoteInfo;
    }

}
