/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.view.controller;

import com.gaceta.modelo.delegate.GacetaDelegate;
import com.gaceta.modelo.dto.Gaceta;
import com.gaceta.modelo.dto.Usuario;
import java.io.Serializable;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class GacetaController implements Serializable{
    private Gaceta gaceta;
    private Usuario usuario;

    public Gaceta getGaceta() {
        return gaceta;
    }

    public void setGaceta(Gaceta gaceta) {
        this.gaceta = gaceta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    //Constructor
    @PostConstruct
    public void init(){
        gaceta = new Gaceta();
    }
    
    //Metodos
    public void registrarG(){
        GacetaDelegate gacetaDel = new GacetaDelegate();
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        try{
            gaceta.setIdUsuario(us.getIdUsuario());
            gacetaDel.crearGaceta(gaceta);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Creación Exitosa"));
        }catch(SQLException e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error al Crear"));
        }
    }
    
    //Sacar datos del usuario en Sesion
    
    public int idusuarioLogeado(){
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return us.getIdUsuario();
    }
}
