/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dao;

import com.gaceta.modelo.dto.Usuario;
import com.gaceta.modelo.dto.Gaceta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GacetaDAO {
    private static final String SQL_INSERT =
            "INSERT INTO gaceta"
            + "(tipo, fecha, numero, idusuario)"
            + "VALUES (?,?,?,?)";
    
    public void crearGaceta(Gaceta g, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, g.getTipo());
            java.sql.Date sqlDate = new java.sql.Date(g.getFecha().getTime());
            ps.setDate(2, sqlDate);
            ps.setInt(3, g.getNumero());
            ps.setInt(4, g.getIdUsuario());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
        
    }
    
    private void cerrar(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }
    
    private void cerrar(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
    }
    
    private void cerrar(Connection cnn) {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException e) {
            }
        }
        
    }
}
