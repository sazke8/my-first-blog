package model;
// Generated May 23, 2016 10:25:24 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoPoliza generated by hbm2java
 */
public class TipoPoliza  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Set registros = new HashSet(0);

    public TipoPoliza() {
    }

	
    public TipoPoliza(int id) {
        this.id = id;
    }
    public TipoPoliza(int id, String descripcion, Set registros) {
       this.id = id;
       this.descripcion = descripcion;
       this.registros = registros;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}


