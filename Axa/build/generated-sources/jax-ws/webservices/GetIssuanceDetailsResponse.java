
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceResponse;


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
 *         &lt;element ref="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}issuanceResponse"/>
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
    "issuanceResponse"
})
@XmlRootElement(name = "getIssuanceDetailsResponse")
public class GetIssuanceDetailsResponse {

    @XmlElement(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", required = true)
    protected IssuanceResponse issuanceResponse;

    /**
     * Gets the value of the issuanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceResponse }
     *     
     */
    public IssuanceResponse getIssuanceResponse() {
        return issuanceResponse;
    }

    /**
     * Sets the value of the issuanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceResponse }
     *     
     */
    public void setIssuanceResponse(IssuanceResponse value) {
        this.issuanceResponse = value;
    }

}
