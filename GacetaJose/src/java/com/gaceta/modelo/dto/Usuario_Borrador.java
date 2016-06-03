/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dto;

import java.io.Serializable;

public class Usuario_Borrador implements Serializable{
  
    private Usuario idUsuario;
    private Borrador idBorrador;

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Borrador getIdBorrador() {
        return idBorrador;
    }

    public void setIdBorrador(Borrador idBorrador) {
        this.idBorrador = idBorrador;
    }
    
    
}
