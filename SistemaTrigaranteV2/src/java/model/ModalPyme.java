package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ModalPyme generated by hbm2java
 */
@Entity
@Table(name="modalPyme"
    ,catalog="trigarante"
)
public class ModalPyme  implements java.io.Serializable {


     private int id;
     private AreaEjecutivo areaEjecutivo;
     private Solicitud solicitud;
     private String empresa;
     private String giro;

    public ModalPyme() {
    }

    public ModalPyme(int id, AreaEjecutivo areaEjecutivo, Solicitud solicitud, String empresa, String giro) {
       this.id = id;
       this.areaEjecutivo = areaEjecutivo;
       this.solicitud = solicitud;
       this.empresa = empresa;
       this.giro = giro;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUsuario", nullable=false)
    public AreaEjecutivo getAreaEjecutivo() {
        return this.areaEjecutivo;
    }
    
    public void setAreaEjecutivo(AreaEjecutivo areaEjecutivo) {
        this.areaEjecutivo = areaEjecutivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idSolicitud", nullable=false)
    public Solicitud getSolicitud() {
        return this.solicitud;
    }
    
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    
    @Column(name="empresa", nullable=false, length=50)
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="giro", nullable=false, length=50)
    public String getGiro() {
        return this.giro;
    }
    
    public void setGiro(String giro) {
        this.giro = giro;
    }




}

