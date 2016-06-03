/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trigarante;

import javax.jws.WebService;

/**
 *
 * @author sazke
 */
@WebService(serviceName = "SecureBancsWSService", portName = "integratorBancsSoap", endpointInterface = "integrator.bancs.mx.axa.IntegratorPort", targetNamespace = "http://axa.mx.bancs.integrator", wsdlLocation = "WEB-INF/wsdl/AXA/servicioswebqa.axa.com.mx_9104/BancsAPIWebservices/SecureBancsWS.wsdl")
public class AXA {

    public ws.axa.com.mx.ficherosvehiculosws.DescargarFicheroResponse descargarFicheroOperation(ws.axa.com.mx.ficherosvehiculosws.DescargarFicheroRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueResponse getCatalogueDetails(com.tcs.bancsapiwebservices.bancsapiwebservices.CatalogueRequest catalogueRequest) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementResponse getEndorsementDetails(com.tcs.bancsapiwebservices.bancsapiwebservices.EndorsementRequest endorsementRequest) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceResponse getIssuanceDetails(com.tcs.bancsapiwebservices.bancsapiwebservices.IssuanceRequest issuanceRequest) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public mx.axa.visor.GetDocumentResponse getPolicyDocument(mx.axa.visor.GetDocument parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.tcs.bancsapiwebservices.bancsapiwebservices.SearchResponse searchDetails(com.tcs.bancsapiwebservices.bancsapiwebservices.SearchRequest searchRequest) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String version(java.lang.String parameters) {
        return null;
        
    }
    
}
