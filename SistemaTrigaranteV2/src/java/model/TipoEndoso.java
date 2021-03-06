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
 * TipoEndoso generated by hbm2java
 */
@Entity
@Table(name="tipoEndoso"
    ,catalog="trigarante"
)
public class TipoEndoso  implements java.io.Serializable {


     private int id;
     private String tipo;
     private Set endosos = new HashSet(0);

    public TipoEndoso() {
    }

	
    public TipoEndoso(int id) {
        this.id = id;
    }
    public TipoEndoso(int id, String tipo, Set endosos) {
       this.id = id;
       this.tipo = tipo;
       this.endosos = endosos;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="tipo", length=30)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoEndoso")
    public Set getEndosos() {
        return this.endosos;
    }
    
    public void setEndosos(Set endosos) {
        this.endosos = endosos;
    }




}


