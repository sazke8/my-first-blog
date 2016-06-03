/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dto;

import java.io.Serializable;

public class Imagen implements Serializable {
    
    private Borrador idimagen;
    private byte[] imagen;

    public Borrador getIdimagen() {
        return idimagen;
    }

    public void setIdimagen(Borrador idimagen) {
        this.idimagen = idimagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
}
