/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.view.controller;

import com.gaceta.modelo.delegate.GacetaDelegate;
import com.gaceta.modelo.dto.Borrador;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class MostrarBorradoresController implements Serializable{    
    private Borrador borrador;

    public Borrador getBorrador() {
        return borrador;
    }

    public void setBorrador(Borrador borrador) {
        this.borrador = borrador;
    }
    
    @PostConstruct
    public void init(){  
        borrador = new Borrador();
    }
    
    public List getGuardados() {
	GacetaDelegate gacetaDel = new GacetaDelegate();
       
        try{     
            return gacetaDel.statusG();
        }catch(Exception e){
            return null;
        }
    }
    
    public List getEnviados() {
	GacetaDelegate gacetaDel = new GacetaDelegate();
       
        try{     
            return gacetaDel.statusPC();
        }catch(Exception e){
            return null;
        }
    }
    
    public List getAprobados() {
	GacetaDelegate gacetaDel = new GacetaDelegate();
       
        try{     
            return gacetaDel.statusA();
        }catch(Exception e){
            return null;
        }
    }
    public void editarBorrador(ActionEvent event) {
		GacetaDelegate gacetaDel = new GacetaDelegate();
		String b = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
                        .get("idArticulo");
                
		int idArticulo = Integer.parseInt(b);
                borrador = new Borrador();
		borrador.setIdArticulo(idArticulo);
		try {
			borrador = gacetaDel.mostrarBorrador(borrador);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
    
    
}