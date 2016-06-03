
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;


/**
 * <p>Java class for endorseReceiptDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorseReceiptDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalReceipts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalReceiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo"/>
 *         &lt;element name="firstReceiptDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo" minOccurs="0"/>
 *         &lt;element name="otherReceiptDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorseReceiptDetails", propOrder = {
    "riskNumber",
    "currency",
    "totalReceipts",
    "totalReceiptsInfo",
    "firstReceiptDetails",
    "otherReceiptDetails"
})
public class EndorseReceiptDetails {

    protected String riskNumber;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String totalReceipts;
    @XmlElement(required = true)
    protected ReceiptsInfo totalReceiptsInfo;
    protected ReceiptsInfo firstReceiptDetails;
    @XmlElement(nillable = true)
    protected List<ReceiptsInfo> otherReceiptDetails;

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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the totalReceipts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalReceipts() {
        return totalReceipts;
    }

    /**
     * Sets the value of the totalReceipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalReceipts(String value) {
        this.totalReceipts = value;
    }

    /**
     * Gets the value of the totalReceiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsInfo }
     *     
     */
    public ReceiptsInfo getTotalReceiptsInfo() {
        return totalReceiptsInfo;
    }

    /**
     * Sets the value of the totalReceiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsInfo }
     *     
     */
    public void setTotalReceiptsInfo(ReceiptsInfo value) {
        this.totalReceiptsInfo = value;
    }

    /**
     * Gets the value of the firstReceiptDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsInfo }
     *     
     */
    public ReceiptsInfo getFirstReceiptDetails() {
        return firstReceiptDetails;
    }

    /**
     * Sets the value of the firstReceiptDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsInfo }
     *     
     */
    public void setFirstReceiptDetails(ReceiptsInfo value) {
        this.firstReceiptDetails = value;
    }

    /**
     * Gets the value of the otherReceiptDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReceiptDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReceiptDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptsInfo }
     * 
     * 
     */
    public List<ReceiptsInfo> getOtherReceiptDetails() {
        if (otherReceiptDetails == null) {
            otherReceiptDetails = new ArrayList<ReceiptsInfo>();
        }
        return this.otherReceiptDetails;
    }

}
