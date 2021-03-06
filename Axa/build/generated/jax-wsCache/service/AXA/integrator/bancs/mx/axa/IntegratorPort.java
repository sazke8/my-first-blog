
package integrator.bancs.mx.axa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueRequest;
import com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueResponse;
import com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementRequest;
import com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementResponse;
import com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceRequest;
import com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceResponse;
import com.tcs.bancsapiwebservices.bancsapiwebservices.SearchRequest;
import com.tcs.bancsapiwebservices.bancsapiwebservices.SearchResponse;
import mx.axa.visor.GetDocument;
import mx.axa.visor.GetDocumentResponse;
import ws.axa.com.mx.ficherosvehiculosws.DescargarFicheroRequest;
import ws.axa.com.mx.ficherosvehiculosws.DescargarFicheroResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "integratorPort", targetNamespace = "http://axa.mx.bancs.integrator")
@XmlSeeAlso({
    mx.axa.ecm.ObjectFactory.class,
    com.tcs.bancsapiwebservices.bancsapiwebservices.ObjectFactory.class,
    com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ObjectFactory.class,
    mx.axa.visor.ObjectFactory.class,
    org.w3._2005._05.xmlmime.ObjectFactory.class,
    webservices.ObjectFactory.class,
    ws.axa.com.mx.ficherosvehiculosws.ObjectFactory.class
})
public interface IntegratorPort {


    /**
     * 
     * @param parameters
     * @return
     *     returns ws.axa.com.mx.ficherosvehiculosws.DescargarFicheroResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/descargarFichero")
    @WebResult(name = "descargarFicheroResponse", targetNamespace = "http://mx.com.axa.ws/FicherosVehiculosWS/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public DescargarFicheroResponse descargarFicheroOperation(
        @WebParam(name = "descargarFicheroRequest", targetNamespace = "http://mx.com.axa.ws/FicherosVehiculosWS/", partName = "parameters")
        DescargarFicheroRequest parameters);

    /**
     * 
     * @param catalogueRequest
     * @return
     *     returns com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/getCatalogueDetails")
    @WebResult(name = "catalogueResponse", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
    @RequestWrapper(localName = "getCatalogueDetails", targetNamespace = "http://webservices", className = "webservices.GetCatalogueDetails")
    @ResponseWrapper(localName = "getCatalogueDetailsResponse", targetNamespace = "http://webservices", className = "webservices.GetCatalogueDetailsResponse")
    public CatalogueResponse getCatalogueDetails(
        @WebParam(name = "catalogueRequest", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
        CatalogueRequest catalogueRequest);

    /**
     * 
     * @param endorsementRequest
     * @return
     *     returns com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/getEndorsementDetails")
    @WebResult(name = "endorsementResponse", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
    @RequestWrapper(localName = "getEndorsementDetails", targetNamespace = "http://webservices", className = "webservices.GetEndorsementDetails")
    @ResponseWrapper(localName = "getEndorsementDetailsResponse", targetNamespace = "http://webservices", className = "webservices.GetEndorsementDetailsResponse")
    public EndorsementResponse getEndorsementDetails(
        @WebParam(name = "endorsementRequest", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
        EndorsementRequest endorsementRequest);

    /**
     * 
     * @param issuanceRequest
     * @return
     *     returns com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/getIssuanceDetails")
    @WebResult(name = "issuanceResponse", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
    @RequestWrapper(localName = "getIssuanceDetails", targetNamespace = "http://webservices", className = "webservices.GetIssuanceDetails")
    @ResponseWrapper(localName = "getIssuanceDetailsResponse", targetNamespace = "http://webservices", className = "webservices.GetIssuanceDetailsResponse")
    public IssuanceResponse getIssuanceDetails(
        @WebParam(name = "issuanceRequest", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
        IssuanceRequest issuanceRequest);

    /**
     * 
     * @param parameters
     * @return
     *     returns mx.axa.visor.GetDocumentResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/getPolicyDocument")
    @WebResult(name = "getDocumentResponse", targetNamespace = "http://axa.mx/visor", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public GetDocumentResponse getPolicyDocument(
        @WebParam(name = "getDocument", targetNamespace = "http://axa.mx/visor", partName = "parameters")
        GetDocument parameters);

    /**
     * 
     * @param searchRequest
     * @return
     *     returns com.tcs.bancsapiwebservices.bancsapiwebservices.SearchResponse
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/searchDetails")
    @WebResult(name = "searchResponse", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
    @RequestWrapper(localName = "searchDetails", targetNamespace = "http://webservices", className = "webservices.SearchDetails")
    @ResponseWrapper(localName = "searchDetailsResponse", targetNamespace = "http://webservices", className = "webservices.SearchDetailsResponse")
    public SearchResponse searchDetails(
        @WebParam(name = "searchRequest", targetNamespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices")
        SearchRequest searchRequest);

    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://axa.mx.bancs.integrator/version")
    @WebResult(name = "versionResponse", targetNamespace = "http://webservices", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public String version(
        @WebParam(name = "version", targetNamespace = "http://webservices", partName = "parameters")
        String parameters);

}
