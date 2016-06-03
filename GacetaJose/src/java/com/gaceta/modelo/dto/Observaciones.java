/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dto;

import java.io.Serializable;

public class Observaciones implements Serializable{
    
    private int idObservaciones;
    private String titulo;
    private String subtitulo;
    private String contenido;
    private String imagen;
    private String descripcion_img;
    private String breve_descripcion;

    public int getIdObservaciones() {
        return idObservaciones;
    }

    public void setIdObservaciones(int idObservaciones) {
        this.idObservaciones = idObservaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion_img() {
        return descripcion_img;
    }

    public void setDescripcion_img(String descripcion_img) {
        this.descripcion_img = descripcion_img;
    }

    public String getBreve_descripcion() {
        return breve_descripcion;
    }

    public void setBreve_descripcion(String breve_descripcion) {
        this.breve_descripcion = breve_descripcion;
    }
    
    
    
}
