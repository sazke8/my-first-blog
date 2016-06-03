/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.facade;

import com.gaceta.modelo.dao.UsuarioDAO;
import com.gaceta.modelo.dto.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UsuarioFacade {
    private Connection cnn;
    private UsuarioDAO dao;
    
    public UsuarioFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new UsuarioDAO();
    }
    public void crear(Usuario u) throws SQLException {
        dao.create(u, cnn);
    }
    public List listar() throws SQLException {
        return dao.loadAll(cnn);
    }
    public void actualiza(Usuario u)throws SQLException {
         dao.update(u, cnn);
    }
    public void elimina(Usuario u)throws SQLException {
         dao.delete(u, cnn);
    }
    public Usuario login(Usuario us)throws SQLException {
        return dao.iniciarSesion(us, cnn);
    }
    public Usuario verUsr(Usuario u)throws SQLException{
        return dao.verUsuario(u, cnn);
    }
    
}

