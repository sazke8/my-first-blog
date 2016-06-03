package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DatosPago generated by hbm2java
 */
public class DatosPago  implements java.io.Serializable {


     private int id;
     private Bancos bancos;
     private MetodoPago metodoPago;
     private String referencia;
     private int numeroDeAutorizacion;
     private Date vencimiento;
     private String titular;
     private int codigoDeSeguridad;
     private String numeroDeTarjeta;
     private String carrier;
     private Set pagos = new HashSet(0);

    public DatosPago() {
    }

	
    public DatosPago(int id, Bancos bancos, MetodoPago metodoPago, int numeroDeAutorizacion, Date vencimiento, String titular, int codigoDeSeguridad, String numeroDeTarjeta, String carrier) {
        this.id = id;
        this.bancos = bancos;
        this.metodoPago = metodoPago;
        this.numeroDeAutorizacion = numeroDeAutorizacion;
        this.vencimiento = vencimiento;
        this.titular = titular;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.carrier = carrier;
    }
    public DatosPago(int id, Bancos bancos, MetodoPago metodoPago, String referencia, int numeroDeAutorizacion, Date vencimiento, String titular, int codigoDeSeguridad, String numeroDeTarjeta, String carrier, Set pagos) {
       this.id = id;
       this.bancos = bancos;
       this.metodoPago = metodoPago;
       this.referencia = referencia;
       this.numeroDeAutorizacion = numeroDeAutorizacion;
       this.vencimiento = vencimiento;
       this.titular = titular;
       this.codigoDeSeguridad = codigoDeSeguridad;
       this.numeroDeTarjeta = numeroDeTarjeta;
       this.carrier = carrier;
       this.pagos = pagos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Bancos getBancos() {
        return this.bancos;
    }
    
    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }
    public MetodoPago getMetodoPago() {
        return this.metodoPago;
    }
    
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public int getNumeroDeAutorizacion() {
        return this.numeroDeAutorizacion;
    }
    
    public void setNumeroDeAutorizacion(int numeroDeAutorizacion) {
        this.numeroDeAutorizacion = numeroDeAutorizacion;
    }
    public Date getVencimiento() {
        return this.vencimiento;
    }
    
    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getCodigoDeSeguridad() {
        return this.codigoDeSeguridad;
    }
    
    public void setCodigoDeSeguridad(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }
    public String getNumeroDeTarjeta() {
        return this.numeroDeTarjeta;
    }
    
    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }
    public String getCarrier() {
        return this.carrier;
    }
    
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}


