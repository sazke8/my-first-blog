/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.delegate;

import com.gaceta.modelo.dto.Borrador;
import com.gaceta.modelo.dto.Gaceta;
import com.gaceta.modelo.dto.Observaciones;
import com.gaceta.modelo.dto.Usuario;
import com.gaceta.modelo.facade.BorradorFacade;
import com.gaceta.modelo.facade.GacetaFacade;
import com.gaceta.modelo.facade.ObservacionesFacade;
import com.gaceta.modelo.facade.UsuarioFacade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GacetaDelegate {
    private Connection cnn;
    private UsuarioFacade usuarioFacade;
    private BorradorFacade borrFacade;
    private ObservacionesFacade obFacade;
    private GacetaFacade gacetaFacade;
    
    public GacetaDelegate() {
        String user = "root";
        String pwd = "root";
        String url = "jdbc:mysql://localhost:3306/gaceta";
        String mySqlDriver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(mySqlDriver);
            cnn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        usuarioFacade = new UsuarioFacade(cnn);
        borrFacade = new BorradorFacade(cnn);
        obFacade = new ObservacionesFacade(cnn);
        gacetaFacade = new GacetaFacade(cnn);
    }
    
    //USUARIO
    public void crearUsuario(Usuario u) throws SQLException {
        usuarioFacade.crear(u);
    }
    
    public List listarUsuarios() throws SQLException  {
        return usuarioFacade.listar();
    }
    
    public void actualizaUsuario(Usuario u) throws SQLException {
        usuarioFacade.actualiza(u);
    }
    
    public void eliminaUsuario(Usuario u) throws SQLException {
        usuarioFacade.elimina(u);
    }
    
    public Usuario iniciarSesion(Usuario us) throws SQLException {
        return usuarioFacade.login(us);
    }
    
    public Usuario verUsuario(Usuario u) throws SQLException{
        return usuarioFacade.verUsr(u);
    }
    
    //BORRADOR
    public void guardarBorrador(Borrador b) throws SQLException {
        borrFacade.guardar(b);
    }
    public void enviarBorrador(Borrador b) throws SQLException {
        borrFacade.enviar(b);
    }
    public Borrador mostrarBorrador(Borrador b) throws SQLException {
        return borrFacade.editBorr(b);
    }    
    public List statusG() throws SQLException {
        return borrFacade.statusG();
    }
    
    public List statusPC() throws SQLException {
        return borrFacade.statusPC();
    }

    public List statusA() throws SQLException {
        return borrFacade.statusA();
    }
    
    public void elimina(Borrador b) throws SQLException {
        borrFacade.elimina(b);
    }
    
    public void actualizaStatusG(Borrador b) throws SQLException {
       borrFacade.actualizaBorradorG(b);
    }
    
    //OBSERVACIONES
    public void crearOb(Observaciones ob) throws SQLException {
        obFacade.crear(ob);
    }
    
    public List listarOb() throws SQLException {
        return obFacade.listar();
    }    
 
    public void elimina(Observaciones ob) throws SQLException {
        obFacade.elimina(ob);
    }
    
    //GACETA
    public void crearGaceta(Gaceta g) throws SQLException {
        gacetaFacade.crearG(g);
    }
    
    public static void main(String[] args) {
        Usuario u = new Usuario();
        GacetaDelegate del = new GacetaDelegate();
        try {
            //System.out.println(del.listar());
            u.setUsuario("dani");
            u.setPassword("123");
            System.out.println(del.iniciarSesion(u));
        } catch (SQLException ex) {
            Logger.getLogger(GacetaDelegate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
