
package mx.axa.visor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AgentInfo;
import mx.axa.ecm.DownloadDocument;
import mx.axa.ecm.ViewDocument;


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
 *         &lt;choice>
 *           &lt;element name="downloadDocument" type="{http://axa.mx/ecm}downloadDocument"/>
 *           &lt;element name="viewDocument" type="{http://axa.mx/ecm}viewDocument"/>
 *         &lt;/choice>
 *         &lt;element name="agentInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}agentInfo"/>
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
    "downloadDocument",
    "viewDocument",
    "agentInfo"
})
@XmlRootElement(name = "getDocument")
public class GetDocument {

    protected DownloadDocument downloadDocument;
    protected ViewDocument viewDocument;
    @XmlElement(required = true)
    protected AgentInfo agentInfo;

    /**
     * Gets the value of the downloadDocument property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadDocument }
     *     
     */
    public DownloadDocument getDownloadDocument() {
        return downloadDocument;
    }

    /**
     * Sets the value of the downloadDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadDocument }
     *     
     */
    public void setDownloadDocument(DownloadDocument value) {
        this.downloadDocument = value;
    }

    /**
     * Gets the value of the viewDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ViewDocument }
     *     
     */
    public ViewDocument getViewDocument() {
        return viewDocument;
    }

    /**
     * Sets the value of the viewDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewDocument }
     *     
     */
    public void setViewDocument(ViewDocument value) {
        this.viewDocument = value;
    }

    /**
     * Gets the value of the agentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo }
     *     
     */
    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    /**
     * Sets the value of the agentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo }
     *     
     */
    public void setAgentInfo(AgentInfo value) {
        this.agentInfo = value;
    }

}
