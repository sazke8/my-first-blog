package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Aseguradora generated by hbm2java
 */
public class Aseguradora  implements java.io.Serializable {


     private int id;
     private String nombre;
     private Date fechaEncuadre;
     private Set usuarios = new HashSet(0);
     private Set paginas = new HashSet(0);
     private Set pagos = new HashSet(0);
     private Set registros = new HashSet(0);

    public Aseguradora() {
    }

	
    public Aseguradora(int id, String nombre, Date fechaEncuadre) {
        this.id = id;
        this.nombre = nombre;
        this.fechaEncuadre = fechaEncuadre;
    }
    public Aseguradora(int id, String nombre, Date fechaEncuadre, Set usuarios, Set paginas, Set pagos, Set registros) {
       this.id = id;
       this.nombre = nombre;
       this.fechaEncuadre = fechaEncuadre;
       this.usuarios = usuarios;
       this.paginas = paginas;
       this.pagos = pagos;
       this.registros = registros;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaEncuadre() {
        return this.fechaEncuadre;
    }
    
    public void setFechaEncuadre(Date fechaEncuadre) {
        this.fechaEncuadre = fechaEncuadre;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getPaginas() {
        return this.paginas;
    }
    
    public void setPaginas(Set paginas) {
        this.paginas = paginas;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}


