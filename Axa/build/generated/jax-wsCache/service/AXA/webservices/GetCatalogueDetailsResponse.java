
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueResponse;


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
 *         &lt;element ref="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}catalogueResponse"/>
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
    "catalogueResponse"
})
@XmlRootElement(name = "getCatalogueDetailsResponse")
public class GetCatalogueDetailsResponse {

    @XmlElement(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", required = true)
    protected CatalogueResponse catalogueResponse;

    /**
     * Gets the value of the catalogueResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueResponse }
     *     
     */
    public CatalogueResponse getCatalogueResponse() {
        return catalogueResponse;
    }

    /**
     * Sets the value of the catalogueResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueResponse }
     *     
     */
    public void setCatalogueResponse(CatalogueResponse value) {
        this.catalogueResponse = value;
    }

}
