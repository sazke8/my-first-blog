package model;
// Generated May 20, 2016 1:01:30 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Aseguradora generated by hbm2java
 */
@Entity
@Table(name="aseguradora"
    ,catalog="trigarante"
)
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
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechaEncuadre", nullable=false, length=19)
    public Date getFechaEncuadre() {
        return this.fechaEncuadre;
    }
    
    public void setFechaEncuadre(Date fechaEncuadre) {
        this.fechaEncuadre = fechaEncuadre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aseguradora")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aseguradora")
    public Set getPaginas() {
        return this.paginas;
    }
    
    public void setPaginas(Set paginas) {
        this.paginas = paginas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aseguradora")
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aseguradora")
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}


