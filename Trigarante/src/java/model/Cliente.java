package model;
// Generated May 23, 2016 10:25:24 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String rfc;
     private String password;
     private String nombre;
     private String apPat;
     private String apMat;
     private String correo;
     private int telefono;
     private int telefonoOpc;
     private String correoOpc;
     private Date fechaNac;
     private String nacionalidad;
     private Set registros = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, String rfc, String password, String nombre, String apPat, String apMat, int telefono, int telefonoOpc, Date fechaNac) {
        this.idCliente = idCliente;
        this.rfc = rfc;
        this.password = password;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.telefono = telefono;
        this.telefonoOpc = telefonoOpc;
        this.fechaNac = fechaNac;
    }
    public Cliente(int idCliente, String rfc, String password, String nombre, String apPat, String apMat, String correo, int telefono, int telefonoOpc, String correoOpc, Date fechaNac, String nacionalidad, Set registros) {
       this.idCliente = idCliente;
       this.rfc = rfc;
       this.password = password;
       this.nombre = nombre;
       this.apPat = apPat;
       this.apMat = apMat;
       this.correo = correo;
       this.telefono = telefono;
       this.telefonoOpc = telefonoOpc;
       this.correoOpc = correoOpc;
       this.fechaNac = fechaNac;
       this.nacionalidad = nacionalidad;
       this.registros = registros;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPat() {
        return this.apPat;
    }
    
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    public String getApMat() {
        return this.apMat;
    }
    
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefonoOpc() {
        return this.telefonoOpc;
    }
    
    public void setTelefonoOpc(int telefonoOpc) {
        this.telefonoOpc = telefonoOpc;
    }
    public String getCorreoOpc() {
        return this.correoOpc;
    }
    
    public void setCorreoOpc(String correoOpc) {
        this.correoOpc = correoOpc;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}


