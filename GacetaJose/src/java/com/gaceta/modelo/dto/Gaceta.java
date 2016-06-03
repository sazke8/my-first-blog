
/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class Gaceta implements Serializable{
    
    private int idGaceta;
    private String tipo;
    private Date fecha;
    private int numero;
    private int idUsuario;

    public int getIdGaceta() {
        return idGaceta;
    }

    public void setIdGaceta(int idGaceta) {
        this.idGaceta = idGaceta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

   

    
    
    
}
