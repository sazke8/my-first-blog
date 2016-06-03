package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ModalSeguroDeVida generated by hbm2java
 */
@Entity
@Table(name="modalSeguroDeVida"
    ,catalog="trigarante"
)
public class ModalSeguroDeVida  implements java.io.Serializable {


     private int id;
     private AreaEjecutivo areaEjecutivo;
     private Solicitud solicitud;
     private String sexo;
     private BigDecimal sumaAseguradora;

    public ModalSeguroDeVida() {
    }

    public ModalSeguroDeVida(int id, AreaEjecutivo areaEjecutivo, Solicitud solicitud, String sexo, BigDecimal sumaAseguradora) {
       this.id = id;
       this.areaEjecutivo = areaEjecutivo;
       this.solicitud = solicitud;
       this.sexo = sexo;
       this.sumaAseguradora = sumaAseguradora;
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

    
    @Column(name="sexo", nullable=false, length=15)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Column(name="sumaAseguradora", nullable=false, precision=10)
    public BigDecimal getSumaAseguradora() {
        return this.sumaAseguradora;
    }
    
    public void setSumaAseguradora(BigDecimal sumaAseguradora) {
        this.sumaAseguradora = sumaAseguradora;
    }




}

