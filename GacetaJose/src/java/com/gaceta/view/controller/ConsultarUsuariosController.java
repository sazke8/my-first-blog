/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.view.controller;

import com.gaceta.modelo.delegate.GacetaDelegate;
import com.gaceta.modelo.dto.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import static sun.management.Agent.error;
import static sun.management.Agent.error;

@Named
@RequestScoped
public class ConsultarUsuariosController implements Serializable{
    
    
    private Usuario user;
    

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    @PostConstruct
    public void init(){  
        user = new Usuario();
    }
    
    public List getLista() {
	GacetaDelegate userDel = new GacetaDelegate();
        try{     
            return userDel.listarUsuarios();
        }catch(Exception e){
            error("ErrorListaArticulos", "Error al mostrar usuarios");
            return null;
        }
    }
    
    public void verUsuario(ActionEvent event){
        GacetaDelegate userDel = new GacetaDelegate();
        String u = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
                .get("idUsuario");
        int idUsuario = Integer.parseInt(u);
        user = new Usuario();
        user.setIdUsuario(idUsuario);
		try {
			user = userDel.verUsuario(user);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    
 
    public void mostrar(Usuario usuario){
        this.user = usuario;
    }
    
}
