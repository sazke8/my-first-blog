package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Area generated by hbm2java
 */
@Entity
@Table(name="area"
    ,catalog="trigarante"
)
public class Area  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private String nombre;
     private Set areaEjecutivos = new HashSet(0);
     private Set estadoDeCuentas = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Area() {
    }

	
    public Area(int id, String descripcion, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    public Area(int id, String descripcion, String nombre, Set areaEjecutivos, Set estadoDeCuentas, Set usuarios) {
       this.id = id;
       this.descripcion = descripcion;
       this.nombre = nombre;
       this.areaEjecutivos = areaEjecutivos;
       this.estadoDeCuentas = estadoDeCuentas;
       this.usuarios = usuarios;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descripcion", nullable=false, length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="nombre", nullable=false, length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="area")
    public Set getAreaEjecutivos() {
        return this.areaEjecutivos;
    }
    
    public void setAreaEjecutivos(Set areaEjecutivos) {
        this.areaEjecutivos = areaEjecutivos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="area")
    public Set getEstadoDeCuentas() {
        return this.estadoDeCuentas;
    }
    
    public void setEstadoDeCuentas(Set estadoDeCuentas) {
        this.estadoDeCuentas = estadoDeCuentas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="area")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

