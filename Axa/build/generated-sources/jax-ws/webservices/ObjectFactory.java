
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Version_QNAME = new QName("http://webservices", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://webservices", "versionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIssuanceDetailsResponse }
     * 
     */
    public GetIssuanceDetailsResponse createGetIssuanceDetailsResponse() {
        return new GetIssuanceDetailsResponse();
    }

    /**
     * Create an instance of {@link GetIssuanceDetails }
     * 
     */
    public GetIssuanceDetails createGetIssuanceDetails() {
        return new GetIssuanceDetails();
    }

    /**
     * Create an instance of {@link SearchDetailsResponse }
     * 
     */
    public SearchDetailsResponse createSearchDetailsResponse() {
        return new SearchDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCatalogueDetailsResponse }
     * 
     */
    public GetCatalogueDetailsResponse createGetCatalogueDetailsResponse() {
        return new GetCatalogueDetailsResponse();
    }

    /**
     * Create an instance of {@link SearchDetails }
     * 
     */
    public SearchDetails createSearchDetails() {
        return new SearchDetails();
    }

    /**
     * Create an instance of {@link GetEndorsementDetails }
     * 
     */
    public GetEndorsementDetails createGetEndorsementDetails() {
        return new GetEndorsementDetails();
    }

    /**
     * Create an instance of {@link GetEndorsementDetailsResponse }
     * 
     */
    public GetEndorsementDetailsResponse createGetEndorsementDetailsResponse() {
        return new GetEndorsementDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCatalogueDetails }
     * 
     */
    public GetCatalogueDetails createGetCatalogueDetails() {
        return new GetCatalogueDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices", name = "versionResponse")
    public JAXBElement<String> createVersionResponse(String value) {
        return new JAXBElement<String>(_VersionResponse_QNAME, String.class, null, value);
    }

}
