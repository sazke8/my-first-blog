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
 * EstadoDeCuenta generated by hbm2java
 */
@Entity
@Table(name="estadoDeCuenta"
    ,catalog="trigarante"
)
public class EstadoDeCuenta  implements java.io.Serializable {


     private int id;
     private Area area;
     private CatalogoDeConceptos catalogoDeConceptos;
     private TipoEgreso tipoEgreso;
     private Date fecha;
     private Integer tipo;
     private String descripcion;
     private Float monto;
     private Integer idAseguradora;

    public EstadoDeCuenta() {
    }

	
    public EstadoDeCuenta(int id) {
        this.id = id;
    }
    public EstadoDeCuenta(int id, Area area, CatalogoDeConceptos catalogoDeConceptos, TipoEgreso tipoEgreso, Date fecha, Integer tipo, String descripcion, Float monto, Integer idAseguradora) {
       this.id = id;
       this.area = area;
       this.catalogoDeConceptos = catalogoDeConceptos;
       this.tipoEgreso = tipoEgreso;
       this.fecha = fecha;
       this.tipo = tipo;
       this.descripcion = descripcion;
       this.monto = monto;
       this.idAseguradora = idAseguradora;
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
    @JoinColumn(name="area")
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="concepto")
    public CatalogoDeConceptos getCatalogoDeConceptos() {
        return this.catalogoDeConceptos;
    }
    
    public void setCatalogoDeConceptos(CatalogoDeConceptos catalogoDeConceptos) {
        this.catalogoDeConceptos = catalogoDeConceptos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipoEgreso")
    public TipoEgreso getTipoEgreso() {
        return this.tipoEgreso;
    }
    
    public void setTipoEgreso(TipoEgreso tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="tipo")
    public Integer getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="descripcion", length=250)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="monto", precision=12, scale=0)
    public Float getMonto() {
        return this.monto;
    }
    
    public void setMonto(Float monto) {
        this.monto = monto;
    }

    
    @Column(name="idAseguradora")
    public Integer getIdAseguradora() {
        return this.idAseguradora;
    }
    
    public void setIdAseguradora(Integer idAseguradora) {
        this.idAseguradora = idAseguradora;
    }




}

