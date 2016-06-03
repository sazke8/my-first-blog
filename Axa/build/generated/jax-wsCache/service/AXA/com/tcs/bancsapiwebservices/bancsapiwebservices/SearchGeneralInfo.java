
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.OtherPolicyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PolicyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;


/**
 * <p>Java class for searchGeneralInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchGeneralInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchPolicyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyInfo" minOccurs="0"/>
 *         &lt;element name="otherPolicyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}otherPolicyInfo" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contributionCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchVehicleInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchVehicleInfo" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}productCode" minOccurs="0"/>
 *         &lt;element name="policyReceiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchGeneralInfo", propOrder = {
    "searchPolicyInfo",
    "otherPolicyInfo",
    "cancelDate",
    "agentCode",
    "contributionCenter",
    "searchVehicleInfo",
    "productCode",
    "policyReceiptsInfo"
})
public class SearchGeneralInfo {

    protected PolicyInfo searchPolicyInfo;
    protected OtherPolicyInfo otherPolicyInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    protected String agentCode;
    protected String contributionCenter;
    @XmlElementRef(name = "searchVehicleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchVehicleInfo> searchVehicleInfo;
    protected String productCode;
    protected ReceiptsInfo policyReceiptsInfo;

    /**
     * Gets the value of the searchPolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInfo }
     *     
     */
    public PolicyInfo getSearchPolicyInfo() {
        return searchPolicyInfo;
    }

    /**
     * Sets the value of the searchPolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInfo }
     *     
     */
    public void setSearchPolicyInfo(PolicyInfo value) {
        this.searchPolicyInfo = value;
    }

    /**
     * Gets the value of the otherPolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPolicyInfo }
     *     
     */
    public OtherPolicyInfo getOtherPolicyInfo() {
        return otherPolicyInfo;
    }

    /**
     * Sets the value of the otherPolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPolicyInfo }
     *     
     */
    public void setOtherPolicyInfo(OtherPolicyInfo value) {
        this.otherPolicyInfo = value;
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

    /**
     * Gets the value of the contributionCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionCenter() {
        return contributionCenter;
    }

    /**
     * Sets the value of the contributionCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionCenter(String value) {
        this.contributionCenter = value;
    }

    /**
     * Gets the value of the searchVehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchVehicleInfo }{@code >}
     *     
     */
    public JAXBElement<SearchVehicleInfo> getSearchVehicleInfo() {
        return searchVehicleInfo;
    }

    /**
     * Sets the value of the searchVehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchVehicleInfo }{@code >}
     *     
     */
    public void setSearchVehicleInfo(JAXBElement<SearchVehicleInfo> value) {
        this.searchVehicleInfo = value;
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
     * Gets the value of the policyReceiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsInfo }
     *     
     */
    public ReceiptsInfo getPolicyReceiptsInfo() {
        return policyReceiptsInfo;
    }

    /**
     * Sets the value of the policyReceiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsInfo }
     *     
     */
    public void setPolicyReceiptsInfo(ReceiptsInfo value) {
        this.policyReceiptsInfo = value;
    }

}
