
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchGeneralInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchGeneralInfo" minOccurs="0"/>
 *         &lt;element name="searchCustomerInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchCustomerInfo" minOccurs="0"/>
 *         &lt;element name="financialEndorseInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}financialEndorseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nonFinancialEndorseInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}nonFinancialEndorseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchReceiptsInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchReceiptsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchCoverageInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchCoverageInfo" minOccurs="0"/>
 *         &lt;element name="searchSpecialEquipInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchSpecialEquipInfo" minOccurs="0"/>
 *         &lt;element name="searchBeneficiaryInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchBeneficiaryInfo" minOccurs="0"/>
 *         &lt;element name="searchDriverInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchDriverInfo" minOccurs="0"/>
 *         &lt;element name="searchAccBeneficiaryInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}searchAccBeneficiaryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDetails", propOrder = {
    "searchGeneralInfo",
    "searchCustomerInfo",
    "financialEndorseInfo",
    "nonFinancialEndorseInfo",
    "searchReceiptsInfo",
    "searchCoverageInfo",
    "searchSpecialEquipInfo",
    "searchBeneficiaryInfo",
    "searchDriverInfo",
    "searchAccBeneficiaryInfo"
})
public class SearchDetails {

    @XmlElementRef(name = "searchGeneralInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchGeneralInfo> searchGeneralInfo;
    @XmlElementRef(name = "searchCustomerInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchCustomerInfo> searchCustomerInfo;
    @XmlElement(nillable = true)
    protected List<FinancialEndorseInfo> financialEndorseInfo;
    @XmlElement(nillable = true)
    protected List<NonFinancialEndorseInfo> nonFinancialEndorseInfo;
    @XmlElement(nillable = true)
    protected List<SearchReceiptsInfo> searchReceiptsInfo;
    @XmlElementRef(name = "searchCoverageInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchCoverageInfo> searchCoverageInfo;
    @XmlElementRef(name = "searchSpecialEquipInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchSpecialEquipInfo> searchSpecialEquipInfo;
    @XmlElementRef(name = "searchBeneficiaryInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchBeneficiaryInfo> searchBeneficiaryInfo;
    @XmlElementRef(name = "searchDriverInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchDriverInfo> searchDriverInfo;
    @XmlElementRef(name = "searchAccBeneficiaryInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchAccBeneficiaryInfo> searchAccBeneficiaryInfo;

    /**
     * Gets the value of the searchGeneralInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchGeneralInfo }{@code >}
     *     
     */
    public JAXBElement<SearchGeneralInfo> getSearchGeneralInfo() {
        return searchGeneralInfo;
    }

    /**
     * Sets the value of the searchGeneralInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchGeneralInfo }{@code >}
     *     
     */
    public void setSearchGeneralInfo(JAXBElement<SearchGeneralInfo> value) {
        this.searchGeneralInfo = value;
    }

    /**
     * Gets the value of the searchCustomerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchCustomerInfo }{@code >}
     *     
     */
    public JAXBElement<SearchCustomerInfo> getSearchCustomerInfo() {
        return searchCustomerInfo;
    }

    /**
     * Sets the value of the searchCustomerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchCustomerInfo }{@code >}
     *     
     */
    public void setSearchCustomerInfo(JAXBElement<SearchCustomerInfo> value) {
        this.searchCustomerInfo = value;
    }

    /**
     * Gets the value of the financialEndorseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialEndorseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialEndorseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialEndorseInfo }
     * 
     * 
     */
    public List<FinancialEndorseInfo> getFinancialEndorseInfo() {
        if (financialEndorseInfo == null) {
            financialEndorseInfo = new ArrayList<FinancialEndorseInfo>();
        }
        return this.financialEndorseInfo;
    }

    /**
     * Gets the value of the nonFinancialEndorseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonFinancialEndorseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonFinancialEndorseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonFinancialEndorseInfo }
     * 
     * 
     */
    public List<NonFinancialEndorseInfo> getNonFinancialEndorseInfo() {
        if (nonFinancialEndorseInfo == null) {
            nonFinancialEndorseInfo = new ArrayList<NonFinancialEndorseInfo>();
        }
        return this.nonFinancialEndorseInfo;
    }

    /**
     * Gets the value of the searchReceiptsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchReceiptsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchReceiptsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchReceiptsInfo }
     * 
     * 
     */
    public List<SearchReceiptsInfo> getSearchReceiptsInfo() {
        if (searchReceiptsInfo == null) {
            searchReceiptsInfo = new ArrayList<SearchReceiptsInfo>();
        }
        return this.searchReceiptsInfo;
    }

    /**
     * Gets the value of the searchCoverageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchCoverageInfo }{@code >}
     *     
     */
    public JAXBElement<SearchCoverageInfo> getSearchCoverageInfo() {
        return searchCoverageInfo;
    }

    /**
     * Sets the value of the searchCoverageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchCoverageInfo }{@code >}
     *     
     */
    public void setSearchCoverageInfo(JAXBElement<SearchCoverageInfo> value) {
        this.searchCoverageInfo = value;
    }

    /**
     * Gets the value of the searchSpecialEquipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchSpecialEquipInfo }{@code >}
     *     
     */
    public JAXBElement<SearchSpecialEquipInfo> getSearchSpecialEquipInfo() {
        return searchSpecialEquipInfo;
    }

    /**
     * Sets the value of the searchSpecialEquipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchSpecialEquipInfo }{@code >}
     *     
     */
    public void setSearchSpecialEquipInfo(JAXBElement<SearchSpecialEquipInfo> value) {
        this.searchSpecialEquipInfo = value;
    }

    /**
     * Gets the value of the searchBeneficiaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchBeneficiaryInfo }{@code >}
     *     
     */
    public JAXBElement<SearchBeneficiaryInfo> getSearchBeneficiaryInfo() {
        return searchBeneficiaryInfo;
    }

    /**
     * Sets the value of the searchBeneficiaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchBeneficiaryInfo }{@code >}
     *     
     */
    public void setSearchBeneficiaryInfo(JAXBElement<SearchBeneficiaryInfo> value) {
        this.searchBeneficiaryInfo = value;
    }

    /**
     * Gets the value of the searchDriverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchDriverInfo }{@code >}
     *     
     */
    public JAXBElement<SearchDriverInfo> getSearchDriverInfo() {
        return searchDriverInfo;
    }

    /**
     * Sets the value of the searchDriverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchDriverInfo }{@code >}
     *     
     */
    public void setSearchDriverInfo(JAXBElement<SearchDriverInfo> value) {
        this.searchDriverInfo = value;
    }

    /**
     * Gets the value of the searchAccBeneficiaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchAccBeneficiaryInfo }{@code >}
     *     
     */
    public JAXBElement<SearchAccBeneficiaryInfo> getSearchAccBeneficiaryInfo() {
        return searchAccBeneficiaryInfo;
    }

    /**
     * Sets the value of the searchAccBeneficiaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchAccBeneficiaryInfo }{@code >}
     *     
     */
    public void setSearchAccBeneficiaryInfo(JAXBElement<SearchAccBeneficiaryInfo> value) {
        this.searchAccBeneficiaryInfo = value;
    }

}
