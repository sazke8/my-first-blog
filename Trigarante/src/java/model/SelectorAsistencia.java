package model;
// Generated May 23, 2016 10:25:24 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SelectorAsistencia generated by hbm2java
 */
public class SelectorAsistencia  implements java.io.Serializable {


     private int id;
     private AreaEjecutivo areaEjecutivo;
     private int contador;
     private Date actualizacion;
     private int permiso;

    public SelectorAsistencia() {
    }

    public SelectorAsistencia(int id, AreaEjecutivo areaEjecutivo, int contador, Date actualizacion, int permiso) {
       this.id = id;
       this.areaEjecutivo = areaEjecutivo;
       this.contador = contador;
       this.actualizacion = actualizacion;
       this.permiso = permiso;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public AreaEjecutivo getAreaEjecutivo() {
        return this.areaEjecutivo;
    }
    
    public void setAreaEjecutivo(AreaEjecutivo areaEjecutivo) {
        this.areaEjecutivo = areaEjecutivo;
    }
    public int getContador() {
        return this.contador;
    }
    
    public void setContador(int contador) {
        this.contador = contador;
    }
    public Date getActualizacion() {
        return this.actualizacion;
    }
    
    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }
    public int getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(int permiso) {
        this.permiso = permiso;
    }




}

