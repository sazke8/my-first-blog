
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.EndorsementType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.OtherPolicyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PolicyInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.SearchType;


/**
 * <p>Java class for multiSearchPolicyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiSearchPolicyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchPolicyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}policyInfo"/>
 *         &lt;element name="otherPolicyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}otherPolicyInfo" minOccurs="0"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEndorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEndorsementType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}EndorsementType" minOccurs="0"/>
 *         &lt;element name="searchType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}searchType" minOccurs="0"/>
 *         &lt;element name="receiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo"/>
 *         &lt;element name="multiSearchVehicleDetails" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}multiSearchVehicleDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiSearchPolicyDetails", propOrder = {
    "origen",
    "searchPolicyInfo",
    "otherPolicyInfo",
    "agentId",
    "lastEndorsementNumber",
    "lastEndorsementType",
    "searchType",
    "receiptsInfo",
    "multiSearchVehicleDetails"
})
public class MultiSearchPolicyDetails {

    protected String origen;
    @XmlElement(required = true)
    protected PolicyInfo searchPolicyInfo;
    protected OtherPolicyInfo otherPolicyInfo;
    protected String agentId;
    protected String lastEndorsementNumber;
    @XmlSchemaType(name = "string")
    protected EndorsementType lastEndorsementType;
    @XmlSchemaType(name = "string")
    protected SearchType searchType;
    @XmlElement(required = true)
    protected ReceiptsInfo receiptsInfo;
    @XmlElementRef(name = "multiSearchVehicleDetails", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiSearchVehicleDetails> multiSearchVehicleDetails;

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

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
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the lastEndorsementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEndorsementNumber() {
        return lastEndorsementNumber;
    }

    /**
     * Sets the value of the lastEndorsementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEndorsementNumber(String value) {
        this.lastEndorsementNumber = value;
    }

    /**
     * Gets the value of the lastEndorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementType }
     *     
     */
    public EndorsementType getLastEndorsementType() {
        return lastEndorsementType;
    }

    /**
     * Sets the value of the lastEndorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementType }
     *     
     */
    public void setLastEndorsementType(EndorsementType value) {
        this.lastEndorsementType = value;
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
     * Gets the value of the receiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsInfo }
     *     
     */
    public ReceiptsInfo getReceiptsInfo() {
        return receiptsInfo;
    }

    /**
     * Sets the value of the receiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsInfo }
     *     
     */
    public void setReceiptsInfo(ReceiptsInfo value) {
        this.receiptsInfo = value;
    }

    /**
     * Gets the value of the multiSearchVehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiSearchVehicleDetails }{@code >}
     *     
     */
    public JAXBElement<MultiSearchVehicleDetails> getMultiSearchVehicleDetails() {
        return multiSearchVehicleDetails;
    }

    /**
     * Sets the value of the multiSearchVehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiSearchVehicleDetails }{@code >}
     *     
     */
    public void setMultiSearchVehicleDetails(JAXBElement<MultiSearchVehicleDetails> value) {
        this.multiSearchVehicleDetails = value;
    }

}
