package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PaginaEjecutivo generated by hbm2java
 */
@Entity
@Table(name="paginaEjecutivo"
    ,catalog="trigarante"
)
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
   
     @Id 

    
    @Column(name="idPaginaEjecutivo", unique=true, nullable=false)
    public int getIdPaginaEjecutivo() {
        return this.idPaginaEjecutivo;
    }
    
    public void setIdPaginaEjecutivo(int idPaginaEjecutivo) {
        this.idPaginaEjecutivo = idPaginaEjecutivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUsuario")
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="contador", nullable=false)
    public int getContador() {
        return this.contador;
    }
    
    public void setContador(int contador) {
        this.contador = contador;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="actualizacion", nullable=false, length=19)
    public Date getActualizacion() {
        return this.actualizacion;
    }
    
    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }

    
    @Column(name="permiso")
    public Byte getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(Byte permiso) {
        this.permiso = permiso;
    }




}


