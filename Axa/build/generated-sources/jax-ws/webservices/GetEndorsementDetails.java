
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementRequest;


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
 *         &lt;element ref="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorsementRequest"/>
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
    "endorsementRequest"
})
@XmlRootElement(name = "getEndorsementDetails")
public class GetEndorsementDetails {

    @XmlElement(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", required = true)
    protected EndorsementRequest endorsementRequest;

    /**
     * Gets the value of the endorsementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementRequest }
     *     
     */
    public EndorsementRequest getEndorsementRequest() {
        return endorsementRequest;
    }

    /**
     * Sets the value of the endorsementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementRequest }
     *     
     */
    public void setEndorsementRequest(EndorsementRequest value) {
        this.endorsementRequest = value;
    }

}
