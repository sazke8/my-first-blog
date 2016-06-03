/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.view.controller;

import com.gaceta.modelo.delegate.GacetaDelegate;
import com.gaceta.modelo.dto.Borrador;
import com.gaceta.modelo.dto.Usuario;
import java.io.Serializable;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class BorradorController implements Serializable{
    private Borrador borrador;
    private Usuario usuario;
    
    //Getter y Setters
    public Borrador getBorrador() {
        return borrador;
    }

    public void setBorrador(Borrador borrador) {
        this.borrador = borrador;
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
        borrador = new Borrador();
    }

    //Métodos
    public void guardar() {
	GacetaDelegate borrDel = new GacetaDelegate();
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            try{
                borrador.setIdUsuario(us.getIdUsuario());
                borrDel.guardarBorrador(borrador);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Artículo Guardado"));
            }catch(SQLException e){

            }
    }
    public void enviar() {
	GacetaDelegate borrDel = new GacetaDelegate();
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            try{
                borrador.setIdUsuario(us.getIdUsuario());
                borrDel.enviarBorrador(borrador);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Artículo Enviado"));
            }catch(SQLException e){

            }
    }
    
//    public void guardaBorradorG() {
//	GacetaDelegate borrDel = new GacetaDelegate();
//            try{
//                borrDel.actualizaStatusPC(borrador);
//                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Artículo Guardado"));
//            }catch(SQLException e){
//
//            }
//    }
    
    public void enviaBorradorG(ActionEvent event) {
	GacetaDelegate borrDel = new GacetaDelegate();
        String b = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
                        .get("idArticulo");
		int idArticulo = 5;
                borrador = new Borrador();
		borrador.setIdArticulo(idArticulo);
                System.out.println("Soy el ID" + idArticulo);
            try{
                borrDel.actualizaStatusG(borrador);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info","Artículo Enviado"));
            }catch(SQLException e){

            }
    }
}


    