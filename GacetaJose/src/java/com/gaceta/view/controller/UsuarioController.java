/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.view.controller;

import com.gaceta.modelo.delegate.GacetaDelegate;
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
public class UsuarioController implements Serializable{
    private Usuario usuario;
    
    //Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    //Constructor
    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }
    
    //Métodos
    public void registrar(){
        GacetaDelegate userDel = new GacetaDelegate();
        try{
            userDel.crearUsuario(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Registro Exitoso"));
        }catch(SQLException e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error al Registrar"));
        }
    }
    
}
