/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.facade;

import com.gaceta.modelo.dao.BorradorDAO;
import com.gaceta.modelo.dto.Borrador;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BorradorFacade {
    private Connection cnn;
    private BorradorDAO dao;
    
    public BorradorFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new BorradorDAO();
    }
    public void guardar(Borrador b) throws SQLException {
        dao.guardar(b, cnn);
    }
    public void enviar(Borrador b) throws SQLException {
        dao.enviar(b, cnn);
    }
    public Borrador editBorr(Borrador b)throws SQLException{
        return dao.editarBorrador(b, cnn);
    }
    public List statusG()throws SQLException {
        return dao.loadStatusG(cnn);
    }
    public List statusPC()throws SQLException {
        return dao.loadStatusPC(cnn);
    }
    public List statusA()throws SQLException {
        return dao.loadStatusA(cnn);
    }
    public void actualizaBorradorG(Borrador b)throws SQLException {
         dao.actualizarBorradorG(b, cnn);
    }
    public void elimina(Borrador b)throws SQLException {
         dao.delete(b, cnn);
    }
}
