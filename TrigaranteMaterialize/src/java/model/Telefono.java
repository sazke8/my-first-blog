package model;
// Generated May 24, 2016 9:30:39 AM by Hibernate Tools 4.3.1



/**
 * Telefono generated by hbm2java
 */
public class Telefono  implements java.io.Serializable {


     private int id;
     private Campaña campaña;
     private String numero;

    public Telefono() {
    }

    public Telefono(int id, Campaña campaña, String numero) {
       this.id = id;
       this.campaña = campaña;
       this.numero = numero;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Campaña getCampaña() {
        return this.campaña;
    }
    
    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }




}

