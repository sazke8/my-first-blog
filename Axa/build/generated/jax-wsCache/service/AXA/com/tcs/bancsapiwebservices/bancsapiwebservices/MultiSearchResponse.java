
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ErrorDetails;


/**
 * <p>Java class for multiSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiSearchPolicyDetails" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}multiSearchPolicyDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}errorDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiSearchResponse", propOrder = {
    "requestId",
    "multiSearchPolicyDetails",
    "errorDetails"
})
public class MultiSearchResponse {

    protected String requestId;
    @XmlElement(nillable = true)
    protected List<MultiSearchPolicyDetails> multiSearchPolicyDetails;
    @XmlElement(nillable = true)
    protected List<ErrorDetails> errorDetails;

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
     * Gets the value of the multiSearchPolicyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSearchPolicyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSearchPolicyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiSearchPolicyDetails }
     * 
     * 
     */
    public List<MultiSearchPolicyDetails> getMultiSearchPolicyDetails() {
        if (multiSearchPolicyDetails == null) {
            multiSearchPolicyDetails = new ArrayList<MultiSearchPolicyDetails>();
        }
        return this.multiSearchPolicyDetails;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails }
     * 
     * 
     */
    public List<ErrorDetails> getErrorDetails() {
        if (errorDetails == null) {
            errorDetails = new ArrayList<ErrorDetails>();
        }
        return this.errorDetails;
    }

}
