
package mx.axa.ecm;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.axa.ecm package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.axa.ecm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DownloadDocument }
     * 
     */
    public DownloadDocument createDownloadDocument() {
        return new DownloadDocument();
    }

    /**
     * Create an instance of {@link ViewDocument }
     * 
     */
    public ViewDocument createViewDocument() {
        return new ViewDocument();
    }

    /**
     * Create an instance of {@link DownloadDocumentResponse }
     * 
     */
    public DownloadDocumentResponse createDownloadDocumentResponse() {
        return new DownloadDocumentResponse();
    }

    /**
     * Create an instance of {@link ViewDocumentResponse }
     * 
     */
    public ViewDocumentResponse createViewDocumentResponse() {
        return new ViewDocumentResponse();
    }

    /**
     * Create an instance of {@link mx.axa.ecm.AbstractDocument.Filtros }
     * 
     */
    public mx.axa.ecm.AbstractDocument.Filtros createAbstractDocumentFiltros() {
        return new mx.axa.ecm.AbstractDocument.Filtros();
    }

}
