package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Registro generated by hbm2java
 */
public class Registro  implements java.io.Serializable {


     private String numPoliza;
     private Aseguradora aseguradora;
     private Cliente cliente;
     private Estado estado;
     private EstadoRenovacion estadoRenovacion;
     private Solicitud solicitud;
     private TipoPago tipoPago;
     private TipoPoliza tipoPoliza;
     private Usuario usuario;
     private Date fechaInicio;
     private String numSerie;
     private BigDecimal primaNeta;
     private BigDecimal primaTotal;
     private Byte seriePago;
     private Float descuento;
     private Date fechaRegistro;
     private Date fechaProximaPago;
     private String archivo;
     private Integer renovacion;
     private Integer verificado;
     private String rnumPoliza;
     private Date rfechaInicio;
     private Byte ridAseguradora;
     private String marca;
     private String modelo;
     private String anio;
     private String submarca;

    public Registro() {
    }

	
    public Registro(String numPoliza, TipoPago tipoPago, String numSerie) {
        this.numPoliza = numPoliza;
        this.tipoPago = tipoPago;
        this.numSerie = numSerie;
    }
    public Registro(String numPoliza, Aseguradora aseguradora, Cliente cliente, Estado estado, EstadoRenovacion estadoRenovacion, Solicitud solicitud, TipoPago tipoPago, TipoPoliza tipoPoliza, Usuario usuario, Date fechaInicio, String numSerie, BigDecimal primaNeta, BigDecimal primaTotal, Byte seriePago, Float descuento, Date fechaRegistro, Date fechaProximaPago, String archivo, Integer renovacion, Integer verificado, String rnumPoliza, Date rfechaInicio, Byte ridAseguradora, String marca, String modelo, String anio, String submarca) {
       this.numPoliza = numPoliza;
       this.aseguradora = aseguradora;
       this.cliente = cliente;
       this.estado = estado;
       this.estadoRenovacion = estadoRenovacion;
       this.solicitud = solicitud;
       this.tipoPago = tipoPago;
       this.tipoPoliza = tipoPoliza;
       this.usuario = usuario;
       this.fechaInicio = fechaInicio;
       this.numSerie = numSerie;
       this.primaNeta = primaNeta;
       this.primaTotal = primaTotal;
       this.seriePago = seriePago;
       this.descuento = descuento;
       this.fechaRegistro = fechaRegistro;
       this.fechaProximaPago = fechaProximaPago;
       this.archivo = archivo;
       this.renovacion = renovacion;
       this.verificado = verificado;
       this.rnumPoliza = rnumPoliza;
       this.rfechaInicio = rfechaInicio;
       this.ridAseguradora = ridAseguradora;
       this.marca = marca;
       this.modelo = modelo;
       this.anio = anio;
       this.submarca = submarca;
    }
   
    public String getNumPoliza() {
        return this.numPoliza;
    }
    
    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }
    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }
    
    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public EstadoRenovacion getEstadoRenovacion() {
        return this.estadoRenovacion;
    }
    
    public void setEstadoRenovacion(EstadoRenovacion estadoRenovacion) {
        this.estadoRenovacion = estadoRenovacion;
    }
    public Solicitud getSolicitud() {
        return this.solicitud;
    }
    
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    public TipoPago getTipoPago() {
        return this.tipoPago;
    }
    
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    public TipoPoliza getTipoPoliza() {
        return this.tipoPoliza;
    }
    
    public void setTipoPoliza(TipoPoliza tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getNumSerie() {
        return this.numSerie;
    }
    
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    public BigDecimal getPrimaNeta() {
        return this.primaNeta;
    }
    
    public void setPrimaNeta(BigDecimal primaNeta) {
        this.primaNeta = primaNeta;
    }
    public BigDecimal getPrimaTotal() {
        return this.primaTotal;
    }
    
    public void setPrimaTotal(BigDecimal primaTotal) {
        this.primaTotal = primaTotal;
    }
    public Byte getSeriePago() {
        return this.seriePago;
    }
    
    public void setSeriePago(Byte seriePago) {
        this.seriePago = seriePago;
    }
    public Float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaProximaPago() {
        return this.fechaProximaPago;
    }
    
    public void setFechaProximaPago(Date fechaProximaPago) {
        this.fechaProximaPago = fechaProximaPago;
    }
    public String getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public Integer getRenovacion() {
        return this.renovacion;
    }
    
    public void setRenovacion(Integer renovacion) {
        this.renovacion = renovacion;
    }
    public Integer getVerificado() {
        return this.verificado;
    }
    
    public void setVerificado(Integer verificado) {
        this.verificado = verificado;
    }
    public String getRnumPoliza() {
        return this.rnumPoliza;
    }
    
    public void setRnumPoliza(String rnumPoliza) {
        this.rnumPoliza = rnumPoliza;
    }
    public Date getRfechaInicio() {
        return this.rfechaInicio;
    }
    
    public void setRfechaInicio(Date rfechaInicio) {
        this.rfechaInicio = rfechaInicio;
    }
    public Byte getRidAseguradora() {
        return this.ridAseguradora;
    }
    
    public void setRidAseguradora(Byte ridAseguradora) {
        this.ridAseguradora = ridAseguradora;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAnio() {
        return this.anio;
    }
    
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getSubmarca() {
        return this.submarca;
    }
    
    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }




}


