package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Nomina generated by hbm2java
 */
public class Nomina  implements java.io.Serializable {


     private int id;
     private Usuario usuario;
     private Date fechaPago;
     private BigDecimal garantizado;
     private BigDecimal ajustes;
     private int modulos;
     private int asistencias;
     private BigDecimal totalPagado;
     private String comentarios;
     private Set pagos = new HashSet(0);

    public Nomina() {
    }

	
    public Nomina(int id, Usuario usuario, Date fechaPago, BigDecimal garantizado, BigDecimal ajustes, int modulos, int asistencias, BigDecimal totalPagado) {
        this.id = id;
        this.usuario = usuario;
        this.fechaPago = fechaPago;
        this.garantizado = garantizado;
        this.ajustes = ajustes;
        this.modulos = modulos;
        this.asistencias = asistencias;
        this.totalPagado = totalPagado;
    }
    public Nomina(int id, Usuario usuario, Date fechaPago, BigDecimal garantizado, BigDecimal ajustes, int modulos, int asistencias, BigDecimal totalPagado, String comentarios, Set pagos) {
       this.id = id;
       this.usuario = usuario;
       this.fechaPago = fechaPago;
       this.garantizado = garantizado;
       this.ajustes = ajustes;
       this.modulos = modulos;
       this.asistencias = asistencias;
       this.totalPagado = totalPagado;
       this.comentarios = comentarios;
       this.pagos = pagos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
    public BigDecimal getGarantizado() {
        return this.garantizado;
    }
    
    public void setGarantizado(BigDecimal garantizado) {
        this.garantizado = garantizado;
    }
    public BigDecimal getAjustes() {
        return this.ajustes;
    }
    
    public void setAjustes(BigDecimal ajustes) {
        this.ajustes = ajustes;
    }
    public int getModulos() {
        return this.modulos;
    }
    
    public void setModulos(int modulos) {
        this.modulos = modulos;
    }
    public int getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public BigDecimal getTotalPagado() {
        return this.totalPagado;
    }
    
    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }
    public String getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}

