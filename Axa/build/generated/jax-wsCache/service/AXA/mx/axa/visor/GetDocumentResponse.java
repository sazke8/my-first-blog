
package mx.axa.visor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import mx.axa.ecm.DownloadDocumentResponse;
import mx.axa.ecm.ViewDocumentResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="downloadDocumentResponse" type="{http://axa.mx/ecm}downloadDocumentResponse"/>
 *         &lt;element name="viewDocumentResponse" type="{http://axa.mx/ecm}viewDocumentResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "downloadDocumentResponse",
    "viewDocumentResponse"
})
@XmlRootElement(name = "getDocumentResponse")
public class GetDocumentResponse {

    protected DownloadDocumentResponse downloadDocumentResponse;
    protected ViewDocumentResponse viewDocumentResponse;

    /**
     * Gets the value of the downloadDocumentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadDocumentResponse }
     *     
     */
    public DownloadDocumentResponse getDownloadDocumentResponse() {
        return downloadDocumentResponse;
    }

    /**
     * Sets the value of the downloadDocumentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadDocumentResponse }
     *     
     */
    public void setDownloadDocumentResponse(DownloadDocumentResponse value) {
        this.downloadDocumentResponse = value;
    }

    /**
     * Gets the value of the viewDocumentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ViewDocumentResponse }
     *     
     */
    public ViewDocumentResponse getViewDocumentResponse() {
        return viewDocumentResponse;
    }

    /**
     * Sets the value of the viewDocumentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewDocumentResponse }
     *     
     */
    public void setViewDocumentResponse(ViewDocumentResponse value) {
        this.viewDocumentResponse = value;
    }

}
