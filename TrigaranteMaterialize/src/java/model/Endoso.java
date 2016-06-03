package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Endoso generated by hbm2java
 */
public class Endoso  implements java.io.Serializable {


     private Integer idEndoso;
     private EstadoNomina estadoNomina;
     private TipoEndoso tipoEndoso;
     private Usuario usuario;
     private BigDecimal cantidad;
     private Date fecha;
     private Date fechaEndoso;
     private String numPoliza;
     private Date fechaInicio;
     private Byte idAseguradora;
     private String descripcionEndoso;
     private int idNomina;

    public Endoso() {
    }

	
    public Endoso(EstadoNomina estadoNomina, Usuario usuario, BigDecimal cantidad, Date fecha, Date fechaEndoso, String descripcionEndoso, int idNomina) {
        this.estadoNomina = estadoNomina;
        this.usuario = usuario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.fechaEndoso = fechaEndoso;
        this.descripcionEndoso = descripcionEndoso;
        this.idNomina = idNomina;
    }
    public Endoso(EstadoNomina estadoNomina, TipoEndoso tipoEndoso, Usuario usuario, BigDecimal cantidad, Date fecha, Date fechaEndoso, String numPoliza, Date fechaInicio, Byte idAseguradora, String descripcionEndoso, int idNomina) {
       this.estadoNomina = estadoNomina;
       this.tipoEndoso = tipoEndoso;
       this.usuario = usuario;
       this.cantidad = cantidad;
       this.fecha = fecha;
       this.fechaEndoso = fechaEndoso;
       this.numPoliza = numPoliza;
       this.fechaInicio = fechaInicio;
       this.idAseguradora = idAseguradora;
       this.descripcionEndoso = descripcionEndoso;
       this.idNomina = idNomina;
    }
   
    public Integer getIdEndoso() {
        return this.idEndoso;
    }
    
    public void setIdEndoso(Integer idEndoso) {
        this.idEndoso = idEndoso;
    }
    public EstadoNomina getEstadoNomina() {
        return this.estadoNomina;
    }
    
    public void setEstadoNomina(EstadoNomina estadoNomina) {
        this.estadoNomina = estadoNomina;
    }
    public TipoEndoso getTipoEndoso() {
        return this.tipoEndoso;
    }
    
    public void setTipoEndoso(TipoEndoso tipoEndoso) {
        this.tipoEndoso = tipoEndoso;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFechaEndoso() {
        return this.fechaEndoso;
    }
    
    public void setFechaEndoso(Date fechaEndoso) {
        this.fechaEndoso = fechaEndoso;
    }
    public String getNumPoliza() {
        return this.numPoliza;
    }
    
    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Byte getIdAseguradora() {
        return this.idAseguradora;
    }
    
    public void setIdAseguradora(Byte idAseguradora) {
        this.idAseguradora = idAseguradora;
    }
    public String getDescripcionEndoso() {
        return this.descripcionEndoso;
    }
    
    public void setDescripcionEndoso(String descripcionEndoso) {
        this.descripcionEndoso = descripcionEndoso;
    }
    public int getIdNomina() {
        return this.idNomina;
    }
    
    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }




}


