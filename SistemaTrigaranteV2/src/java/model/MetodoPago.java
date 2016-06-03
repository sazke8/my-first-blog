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
 * MetodoPago generated by hbm2java
 */
@Entity
@Table(name="metodoPago"
    ,catalog="trigarante"
)
public class MetodoPago  implements java.io.Serializable {


     private int id;
     private String metodo;
     private Set datosPagos = new HashSet(0);
     private Set asistencias = new HashSet(0);

    public MetodoPago() {
    }

	
    public MetodoPago(int id) {
        this.id = id;
    }
    public MetodoPago(int id, String metodo, Set datosPagos, Set asistencias) {
       this.id = id;
       this.metodo = metodo;
       this.datosPagos = datosPagos;
       this.asistencias = asistencias;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="metodo", length=50)
    public String getMetodo() {
        return this.metodo;
    }
    
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="metodoPago")
    public Set getDatosPagos() {
        return this.datosPagos;
    }
    
    public void setDatosPagos(Set datosPagos) {
        this.datosPagos = datosPagos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="metodoPago")
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }




}


