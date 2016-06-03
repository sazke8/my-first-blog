package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pagina generated by hbm2java
 */
@Entity
@Table(name="pagina"
    ,catalog="trigarante"
)
public class Pagina  implements java.io.Serializable {


     private int id;
     private Aseguradora aseguradora;
     private Campaña campaña;
     private String url;
     private String descripcion;
     private int estatus;
     private Date fechaRegistro;
     private Date fechaActualizacion;
     private Date fechaUltimoCorte;
     private Set solicituds = new HashSet(0);
     private Set costoses = new HashSet(0);

    public Pagina() {
    }

	
    public Pagina(int id, Aseguradora aseguradora, Campaña campaña, String url, int estatus) {
        this.id = id;
        this.aseguradora = aseguradora;
        this.campaña = campaña;
        this.url = url;
        this.estatus = estatus;
    }
    public Pagina(int id, Aseguradora aseguradora, Campaña campaña, String url, String descripcion, int estatus, Date fechaRegistro, Date fechaActualizacion, Date fechaUltimoCorte, Set solicituds, Set costoses) {
       this.id = id;
       this.aseguradora = aseguradora;
       this.campaña = campaña;
       this.url = url;
       this.descripcion = descripcion;
       this.estatus = estatus;
       this.fechaRegistro = fechaRegistro;
       this.fechaActualizacion = fechaActualizacion;
       this.fechaUltimoCorte = fechaUltimoCorte;
       this.solicituds = solicituds;
       this.costoses = costoses;
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
    @JoinColumn(name="idAseguradora", nullable=false)
    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }
    
    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCampaña", nullable=false)
    public Campaña getCampaña() {
        return this.campaña;
    }
    
    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }

    
    @Column(name="url", nullable=false)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="descripcion", length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="estatus", nullable=false)
    public int getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaRegistro", length=19)
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaActualizacion", length=19)
    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }
    
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaUltimoCorte", length=19)
    public Date getFechaUltimoCorte() {
        return this.fechaUltimoCorte;
    }
    
    public void setFechaUltimoCorte(Date fechaUltimoCorte) {
        this.fechaUltimoCorte = fechaUltimoCorte;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagina")
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagina")
    public Set getCostoses() {
        return this.costoses;
    }
    
    public void setCostoses(Set costoses) {
        this.costoses = costoses;
    }




}

