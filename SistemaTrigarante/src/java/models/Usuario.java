package models;
// Generated May 17, 2016 9:49:25 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private Area area;
     private Aseguradora aseguradora;
     private Campaña campaña;
     private Rol rol;
     private String usuario;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String correo;
     private String password;
     private Date fechaIngreso;
     private Date fechaBaja;
     private String commentIng;
     private String commentBaja;
     private int estadoFinanzas;
     private Date fechaReingreso;
     private String reingreso;
     private int isUcis;
     private int isUsuarioVip;
     private Set pagos = new HashSet(0);
     private Set solicituds = new HashSet(0);
     private Set asistencias = new HashSet(0);
     private Set registros = new HashSet(0);
     private Set usuarioVipsForIdUsuario = new HashSet(0);
     private Set areaEjecutivos = new HashSet(0);
     private Set paginaEjecutivos = new HashSet(0);
     private Set rankings = new HashSet(0);
     private Set usuarioVipsForModificadoPor = new HashSet(0);
     private Set nominas = new HashSet(0);
     private Set endosos = new HashSet(0);
     private Set ucisesForActualizadoPor = new HashSet(0);
     private Set ucisesForIdUsuario = new HashSet(0);
     private Set ucisesForAsignadoPor = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, Area area, Aseguradora aseguradora, Campaña campaña, Rol rol, String usuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String password, Date fechaIngreso, Date fechaBaja, int estadoFinanzas, Date fechaReingreso, int isUcis, int isUsuarioVip) {
        this.idUsuario = idUsuario;
        this.area = area;
        this.aseguradora = aseguradora;
        this.campaña = campaña;
        this.rol = rol;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.password = password;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
        this.estadoFinanzas = estadoFinanzas;
        this.fechaReingreso = fechaReingreso;
        this.isUcis = isUcis;
        this.isUsuarioVip = isUsuarioVip;
    }
    public Usuario(int idUsuario, Area area, Aseguradora aseguradora, Campaña campaña, Rol rol, String usuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String password, Date fechaIngreso, Date fechaBaja, String commentIng, String commentBaja, int estadoFinanzas, Date fechaReingreso, String reingreso, int isUcis, int isUsuarioVip, Set pagos, Set solicituds, Set asistencias, Set registros, Set usuarioVipsForIdUsuario, Set areaEjecutivos, Set paginaEjecutivos, Set rankings, Set usuarioVipsForModificadoPor, Set nominas, Set endosos, Set ucisesForActualizadoPor, Set ucisesForIdUsuario, Set ucisesForAsignadoPor) {
       this.idUsuario = idUsuario;
       this.area = area;
       this.aseguradora = aseguradora;
       this.campaña = campaña;
       this.rol = rol;
       this.usuario = usuario;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.correo = correo;
       this.password = password;
       this.fechaIngreso = fechaIngreso;
       this.fechaBaja = fechaBaja;
       this.commentIng = commentIng;
       this.commentBaja = commentBaja;
       this.estadoFinanzas = estadoFinanzas;
       this.fechaReingreso = fechaReingreso;
       this.reingreso = reingreso;
       this.isUcis = isUcis;
       this.isUsuarioVip = isUsuarioVip;
       this.pagos = pagos;
       this.solicituds = solicituds;
       this.asistencias = asistencias;
       this.registros = registros;
       this.usuarioVipsForIdUsuario = usuarioVipsForIdUsuario;
       this.areaEjecutivos = areaEjecutivos;
       this.paginaEjecutivos = paginaEjecutivos;
       this.rankings = rankings;
       this.usuarioVipsForModificadoPor = usuarioVipsForModificadoPor;
       this.nominas = nominas;
       this.endosos = endosos;
       this.ucisesForActualizadoPor = ucisesForActualizadoPor;
       this.ucisesForIdUsuario = ucisesForIdUsuario;
       this.ucisesForAsignadoPor = ucisesForAsignadoPor;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }
    
    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    public Campaña getCampaña() {
        return this.campaña;
    }
    
    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public String getCommentIng() {
        return this.commentIng;
    }
    
    public void setCommentIng(String commentIng) {
        this.commentIng = commentIng;
    }
    public String getCommentBaja() {
        return this.commentBaja;
    }
    
    public void setCommentBaja(String commentBaja) {
        this.commentBaja = commentBaja;
    }
    public int getEstadoFinanzas() {
        return this.estadoFinanzas;
    }
    
    public void setEstadoFinanzas(int estadoFinanzas) {
        this.estadoFinanzas = estadoFinanzas;
    }
    public Date getFechaReingreso() {
        return this.fechaReingreso;
    }
    
    public void setFechaReingreso(Date fechaReingreso) {
        this.fechaReingreso = fechaReingreso;
    }
    public String getReingreso() {
        return this.reingreso;
    }
    
    public void setReingreso(String reingreso) {
        this.reingreso = reingreso;
    }
    public int getIsUcis() {
        return this.isUcis;
    }
    
    public void setIsUcis(int isUcis) {
        this.isUcis = isUcis;
    }
    public int getIsUsuarioVip() {
        return this.isUsuarioVip;
    }
    
    public void setIsUsuarioVip(int isUsuarioVip) {
        this.isUsuarioVip = isUsuarioVip;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }
    public Set getUsuarioVipsForIdUsuario() {
        return this.usuarioVipsForIdUsuario;
    }
    
    public void setUsuarioVipsForIdUsuario(Set usuarioVipsForIdUsuario) {
        this.usuarioVipsForIdUsuario = usuarioVipsForIdUsuario;
    }
    public Set getAreaEjecutivos() {
        return this.areaEjecutivos;
    }
    
    public void setAreaEjecutivos(Set areaEjecutivos) {
        this.areaEjecutivos = areaEjecutivos;
    }
    public Set getPaginaEjecutivos() {
        return this.paginaEjecutivos;
    }
    
    public void setPaginaEjecutivos(Set paginaEjecutivos) {
        this.paginaEjecutivos = paginaEjecutivos;
    }
    public Set getRankings() {
        return this.rankings;
    }
    
    public void setRankings(Set rankings) {
        this.rankings = rankings;
    }
    public Set getUsuarioVipsForModificadoPor() {
        return this.usuarioVipsForModificadoPor;
    }
    
    public void setUsuarioVipsForModificadoPor(Set usuarioVipsForModificadoPor) {
        this.usuarioVipsForModificadoPor = usuarioVipsForModificadoPor;
    }
    public Set getNominas() {
        return this.nominas;
    }
    
    public void setNominas(Set nominas) {
        this.nominas = nominas;
    }
    public Set getEndosos() {
        return this.endosos;
    }
    
    public void setEndosos(Set endosos) {
        this.endosos = endosos;
    }
    public Set getUcisesForActualizadoPor() {
        return this.ucisesForActualizadoPor;
    }
    
    public void setUcisesForActualizadoPor(Set ucisesForActualizadoPor) {
        this.ucisesForActualizadoPor = ucisesForActualizadoPor;
    }
    public Set getUcisesForIdUsuario() {
        return this.ucisesForIdUsuario;
    }
    
    public void setUcisesForIdUsuario(Set ucisesForIdUsuario) {
        this.ucisesForIdUsuario = ucisesForIdUsuario;
    }
    public Set getUcisesForAsignadoPor() {
        return this.ucisesForAsignadoPor;
    }
    
    public void setUcisesForAsignadoPor(Set ucisesForAsignadoPor) {
        this.ucisesForAsignadoPor = ucisesForAsignadoPor;
    }




}


