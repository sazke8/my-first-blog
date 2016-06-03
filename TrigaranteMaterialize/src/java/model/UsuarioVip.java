package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UsuarioVip generated by hbm2java
 */
public class UsuarioVip  implements java.io.Serializable {


     private int id;
     private Usuario usuarioByIdUsuario;
     private Usuario usuarioByModificadoPor;
     private int estado;
     private String descripcion;
     private Date fechaCreacion;
     private Date fechaModificacion;

    public UsuarioVip() {
    }

	
    public UsuarioVip(int id, int estado, Date fechaCreacion, Date fechaModificacion) {
        this.id = id;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    public UsuarioVip(int id, Usuario usuarioByIdUsuario, Usuario usuarioByModificadoPor, int estado, String descripcion, Date fechaCreacion, Date fechaModificacion) {
       this.id = id;
       this.usuarioByIdUsuario = usuarioByIdUsuario;
       this.usuarioByModificadoPor = usuarioByModificadoPor;
       this.estado = estado;
       this.descripcion = descripcion;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuarioByIdUsuario() {
        return this.usuarioByIdUsuario;
    }
    
    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }
    public Usuario getUsuarioByModificadoPor() {
        return this.usuarioByModificadoPor;
    }
    
    public void setUsuarioByModificadoPor(Usuario usuarioByModificadoPor) {
        this.usuarioByModificadoPor = usuarioByModificadoPor;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




}


