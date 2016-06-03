
package mx.axa.ecm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadDocumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axa.mx/ecm}abstractDocumentResponse">
 *       &lt;sequence>
 *         &lt;element name="DownloadDocumentUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadDocumentResponse", propOrder = {
    "downloadDocumentUrl"
})
public class DownloadDocumentResponse
    extends AbstractDocumentResponse
{

    @XmlElement(name = "DownloadDocumentUrl", required = true)
    protected String downloadDocumentUrl;

    /**
     * Gets the value of the downloadDocumentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadDocumentUrl() {
        return downloadDocumentUrl;
    }

    /**
     * Sets the value of the downloadDocumentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadDocumentUrl(String value) {
        this.downloadDocumentUrl = value;
    }

}
