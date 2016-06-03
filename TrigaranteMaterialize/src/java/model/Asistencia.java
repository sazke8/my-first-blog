package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Asistencia generated by hbm2java
 */
public class Asistencia  implements java.io.Serializable {


     private String idAsistencia;
     private EstadoAsistencia estadoAsistencia;
     private MetodoPago metodoPago;
     private Usuario usuario;
     private Date fechaRegistro;
     private Date fechaInicio;
     private BigDecimal monto;
     private String nombre;
     private String apellidoP;
     private String apellidoM;
     private String correo;
     private String telefono;
     private String telefonoOpc;
     private String direccion;
     private String colonia;
     private String cp;
     private String localidad;
     private Integer estado;
     private Date fechaNacimiento;
     private Character sexo;
     private String tarjeta;
     private Date vencimiento;
     private String titular;
     private String codigoSeg;
     private Character cdEstado;
     private Date fechaBaja;
     private Integer column27;

    public Asistencia() {
    }

	
    public Asistencia(String idAsistencia) {
        this.idAsistencia = idAsistencia;
    }
    public Asistencia(String idAsistencia, EstadoAsistencia estadoAsistencia, MetodoPago metodoPago, Usuario usuario, Date fechaRegistro, Date fechaInicio, BigDecimal monto, String nombre, String apellidoP, String apellidoM, String correo, String telefono, String telefonoOpc, String direccion, String colonia, String cp, String localidad, Integer estado, Date fechaNacimiento, Character sexo, String tarjeta, Date vencimiento, String titular, String codigoSeg, Character cdEstado, Date fechaBaja, Integer column27) {
       this.idAsistencia = idAsistencia;
       this.estadoAsistencia = estadoAsistencia;
       this.metodoPago = metodoPago;
       this.usuario = usuario;
       this.fechaRegistro = fechaRegistro;
       this.fechaInicio = fechaInicio;
       this.monto = monto;
       this.nombre = nombre;
       this.apellidoP = apellidoP;
       this.apellidoM = apellidoM;
       this.correo = correo;
       this.telefono = telefono;
       this.telefonoOpc = telefonoOpc;
       this.direccion = direccion;
       this.colonia = colonia;
       this.cp = cp;
       this.localidad = localidad;
       this.estado = estado;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.tarjeta = tarjeta;
       this.vencimiento = vencimiento;
       this.titular = titular;
       this.codigoSeg = codigoSeg;
       this.cdEstado = cdEstado;
       this.fechaBaja = fechaBaja;
       this.column27 = column27;
    }
   
    public String getIdAsistencia() {
        return this.idAsistencia;
    }
    
    public void setIdAsistencia(String idAsistencia) {
        this.idAsistencia = idAsistencia;
    }
    public EstadoAsistencia getEstadoAsistencia() {
        return this.estadoAsistencia;
    }
    
    public void setEstadoAsistencia(EstadoAsistencia estadoAsistencia) {
        this.estadoAsistencia = estadoAsistencia;
    }
    public MetodoPago getMetodoPago() {
        return this.metodoPago;
    }
    
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return this.apellidoP;
    }
    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return this.apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefonoOpc() {
        return this.telefonoOpc;
    }
    
    public void setTelefonoOpc(String telefonoOpc) {
        this.telefonoOpc = telefonoOpc;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Character getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public String getTarjeta() {
        return this.tarjeta;
    }
    
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
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
    public String getCodigoSeg() {
        return this.codigoSeg;
    }
    
    public void setCodigoSeg(String codigoSeg) {
        this.codigoSeg = codigoSeg;
    }
    public Character getCdEstado() {
        return this.cdEstado;
    }
    
    public void setCdEstado(Character cdEstado) {
        this.cdEstado = cdEstado;
    }
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public Integer getColumn27() {
        return this.column27;
    }
    
    public void setColumn27(Integer column27) {
        this.column27 = column27;
    }




}


