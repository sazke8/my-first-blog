/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.facade;

import com.gaceta.modelo.dao.GacetaDAO;
import com.gaceta.modelo.dto.Gaceta;
import java.sql.Connection;
import java.sql.SQLException;

public class GacetaFacade {
    private Connection cnn;
    private GacetaDAO dao;
    
    public GacetaFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new GacetaDAO();
    }
    
    public void crearG(Gaceta g) throws SQLException {
        dao.crearGaceta(g, cnn);
    }
}
