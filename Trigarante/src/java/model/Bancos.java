package model;
// Generated May 23, 2016 10:25:24 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bancos generated by hbm2java
 */
public class Bancos  implements java.io.Serializable {


     private int id;
     private String banco;
     private Set datosPagos = new HashSet(0);

    public Bancos() {
    }

	
    public Bancos(int id, String banco) {
        this.id = id;
        this.banco = banco;
    }
    public Bancos(int id, String banco, Set datosPagos) {
       this.id = id;
       this.banco = banco;
       this.datosPagos = datosPagos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public Set getDatosPagos() {
        return this.datosPagos;
    }
    
    public void setDatosPagos(Set datosPagos) {
        this.datosPagos = datosPagos;
    }




}

