package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoAsistencia generated by hbm2java
 */
public class EstadoAsistencia  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Set asistencias = new HashSet(0);

    public EstadoAsistencia() {
    }

	
    public EstadoAsistencia(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public EstadoAsistencia(int id, String descripcion, Set asistencias) {
       this.id = id;
       this.descripcion = descripcion;
       this.asistencias = asistencias;
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
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }




}


