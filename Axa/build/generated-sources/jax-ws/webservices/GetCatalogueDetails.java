
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueRequest;


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
 *         &lt;element ref="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}catalogueRequest"/>
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
    "catalogueRequest"
})
@XmlRootElement(name = "getCatalogueDetails")
public class GetCatalogueDetails {

    @XmlElement(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", required = true)
    protected CatalogueRequest catalogueRequest;

    /**
     * Gets the value of the catalogueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueRequest }
     *     
     */
    public CatalogueRequest getCatalogueRequest() {
        return catalogueRequest;
    }

    /**
     * Sets the value of the catalogueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueRequest }
     *     
     */
    public void setCatalogueRequest(CatalogueRequest value) {
        this.catalogueRequest = value;
    }

}
