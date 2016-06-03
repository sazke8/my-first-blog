/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.facade;

import com.gaceta.modelo.dao.ObservacionesDAO;
import com.gaceta.modelo.dto.Observaciones;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ObservacionesFacade {
    private Connection cnn;
    private ObservacionesDAO dao;
    
    public ObservacionesFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new ObservacionesDAO();
    }
    
    public void crear(Observaciones ob) throws SQLException {
        dao.create(ob, cnn);
    }
    
    public List listar() throws SQLException {
        return dao.loadAll(cnn);
    }
    

    public void elimina(Observaciones ob)throws SQLException {
         dao.delete(ob, cnn);
    }
}
