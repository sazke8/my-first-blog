package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Costos generated by hbm2java
 */
public class Costos  implements java.io.Serializable {


     private int id;
     private Buscador buscador;
     private Pagina pagina;
     private Date fecha;
     private BigDecimal costo;
     private int conversiones;

    public Costos() {
    }

    public Costos(int id, Buscador buscador, Pagina pagina, Date fecha, BigDecimal costo, int conversiones) {
       this.id = id;
       this.buscador = buscador;
       this.pagina = pagina;
       this.fecha = fecha;
       this.costo = costo;
       this.conversiones = conversiones;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Buscador getBuscador() {
        return this.buscador;
    }
    
    public void setBuscador(Buscador buscador) {
        this.buscador = buscador;
    }
    public Pagina getPagina() {
        return this.pagina;
    }
    
    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getCosto() {
        return this.costo;
    }
    
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public int getConversiones() {
        return this.conversiones;
    }
    
    public void setConversiones(int conversiones) {
        this.conversiones = conversiones;
    }




}


