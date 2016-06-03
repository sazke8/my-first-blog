package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoDeConceptos generated by hbm2java
 */
public class CatalogoDeConceptos  implements java.io.Serializable {


     private int id;
     private int tipo;
     private String descripcion;
     private Set estadoDeCuentas = new HashSet(0);

    public CatalogoDeConceptos() {
    }

	
    public CatalogoDeConceptos(int id, int tipo, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    public CatalogoDeConceptos(int id, int tipo, String descripcion, Set estadoDeCuentas) {
       this.id = id;
       this.tipo = tipo;
       this.descripcion = descripcion;
       this.estadoDeCuentas = estadoDeCuentas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getEstadoDeCuentas() {
        return this.estadoDeCuentas;
    }
    
    public void setEstadoDeCuentas(Set estadoDeCuentas) {
        this.estadoDeCuentas = estadoDeCuentas;
    }




}


