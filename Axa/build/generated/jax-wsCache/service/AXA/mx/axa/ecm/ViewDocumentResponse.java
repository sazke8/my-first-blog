
package mx.axa.ecm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewDocumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axa.mx/ecm}abstractDocumentResponse">
 *       &lt;sequence>
 *         &lt;element name="ViewDocumentUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewDocumentResponse", propOrder = {
    "viewDocumentUrl"
})
public class ViewDocumentResponse
    extends AbstractDocumentResponse
{

    @XmlElement(name = "ViewDocumentUrl", required = true)
    protected String viewDocumentUrl;

    /**
     * Gets the value of the viewDocumentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewDocumentUrl() {
        return viewDocumentUrl;
    }

    /**
     * Sets the value of the viewDocumentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewDocumentUrl(String value) {
        this.viewDocumentUrl = value;
    }

}
