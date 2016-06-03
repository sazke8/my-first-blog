
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}issuanceRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issuanceRequest"
})
@XmlRootElement(name = "getIssuanceDetails")
public class GetIssuanceDetails {

    @XmlElement(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", required = true)
    protected IssuanceRequest issuanceRequest;

    /**
     * Gets the value of the issuanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceRequest }
     *     
     */
    public IssuanceRequest getIssuanceRequest() {
        return issuanceRequest;
    }

    /**
     * Sets the value of the issuanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceRequest }
     *     
     */
    public void setIssuanceRequest(IssuanceRequest value) {
        this.issuanceRequest = value;
    }

}
