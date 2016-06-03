package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Ucis generated by hbm2java
 */
public class Ucis  implements java.io.Serializable {


     private int id;
     private Usuario usuarioByActualizadoPor;
     private Usuario usuarioByIdUsuario;
     private Usuario usuarioByAsignadoPor;
     private String passwordPersonal;
     private Date fechaCreacion;
     private Date fechaActualizacion;
     private String descripcion;

    public Ucis() {
    }

	
    public Ucis(int id, Usuario usuarioByActualizadoPor, Usuario usuarioByIdUsuario, Usuario usuarioByAsignadoPor, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
        this.usuarioByActualizadoPor = usuarioByActualizadoPor;
        this.usuarioByIdUsuario = usuarioByIdUsuario;
        this.usuarioByAsignadoPor = usuarioByAsignadoPor;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }
    public Ucis(int id, Usuario usuarioByActualizadoPor, Usuario usuarioByIdUsuario, Usuario usuarioByAsignadoPor, String passwordPersonal, Date fechaCreacion, Date fechaActualizacion, String descripcion) {
       this.id = id;
       this.usuarioByActualizadoPor = usuarioByActualizadoPor;
       this.usuarioByIdUsuario = usuarioByIdUsuario;
       this.usuarioByAsignadoPor = usuarioByAsignadoPor;
       this.passwordPersonal = passwordPersonal;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.descripcion = descripcion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuarioByActualizadoPor() {
        return this.usuarioByActualizadoPor;
    }
    
    public void setUsuarioByActualizadoPor(Usuario usuarioByActualizadoPor) {
        this.usuarioByActualizadoPor = usuarioByActualizadoPor;
    }
    public Usuario getUsuarioByIdUsuario() {
        return this.usuarioByIdUsuario;
    }
    
    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }
    public Usuario getUsuarioByAsignadoPor() {
        return this.usuarioByAsignadoPor;
    }
    
    public void setUsuarioByAsignadoPor(Usuario usuarioByAsignadoPor) {
        this.usuarioByAsignadoPor = usuarioByAsignadoPor;
    }
    public String getPasswordPersonal() {
        return this.passwordPersonal;
    }
    
    public void setPasswordPersonal(String passwordPersonal) {
        this.passwordPersonal = passwordPersonal;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }
    
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


