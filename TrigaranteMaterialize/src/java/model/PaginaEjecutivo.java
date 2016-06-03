package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PaginaEjecutivo generated by hbm2java
 */
public class PaginaEjecutivo  implements java.io.Serializable {


     private int idPaginaEjecutivo;
     private Usuario usuario;
     private int contador;
     private Date actualizacion;
     private Byte permiso;

    public PaginaEjecutivo() {
    }

	
    public PaginaEjecutivo(int idPaginaEjecutivo, int contador, Date actualizacion) {
        this.idPaginaEjecutivo = idPaginaEjecutivo;
        this.contador = contador;
        this.actualizacion = actualizacion;
    }
    public PaginaEjecutivo(int idPaginaEjecutivo, Usuario usuario, int contador, Date actualizacion, Byte permiso) {
       this.idPaginaEjecutivo = idPaginaEjecutivo;
       this.usuario = usuario;
       this.contador = contador;
       this.actualizacion = actualizacion;
       this.permiso = permiso;
    }
   
    public int getIdPaginaEjecutivo() {
        return this.idPaginaEjecutivo;
    }
    
    public void setIdPaginaEjecutivo(int idPaginaEjecutivo) {
        this.idPaginaEjecutivo = idPaginaEjecutivo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getContador() {
        return this.contador;
    }
    
    public void setContador(int contador) {
        this.contador = contador;
    }
    public Date getActualizacion() {
        return this.actualizacion;
    }
    
    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }
    public Byte getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(Byte permiso) {
        this.permiso = permiso;
    }




}

