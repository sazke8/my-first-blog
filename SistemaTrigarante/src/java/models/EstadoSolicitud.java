package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoSolicitud generated by hbm2java
 */
public class EstadoSolicitud  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Set solicituds = new HashSet(0);

    public EstadoSolicitud() {
    }

	
    public EstadoSolicitud(int id) {
        this.id = id;
    }
    public EstadoSolicitud(int id, String descripcion, Set solicituds) {
       this.id = id;
       this.descripcion = descripcion;
       this.solicituds = solicituds;
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
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }




}


