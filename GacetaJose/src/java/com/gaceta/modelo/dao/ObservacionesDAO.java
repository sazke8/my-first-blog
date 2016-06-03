/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dao;

import com.gaceta.modelo.dto.Observaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObservacionesDAO {
    private static final String SQL_INSERT =
            "INSERT INTO observaciones ("
            + "titulo, subtitulo,  contenido, descripcion_img, breve_descripcion, img"
            + ") VALUES (?,?,?,?,?,?)";
    
    private static final String SQL_SELECT_All =
            "SELECT * FROM observaciones";

    /* SQL to delete data */
    private static final String SQL_DELETE =
            "DELETE FROM observaciones WHERE "
            + "idObservaciones = ?";
    
    public void create(Observaciones ob, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, ob.getTitulo());
            ps.setString(2, ob.getSubtitulo());
            ps.setString(3, ob.getContenido());
            ps.setString(4, ob.getDescripcion_img());
            ps.setString(5, ob.getBreve_descripcion());
            ps.setString(6, ob.getImagen());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    
    public List loadAll(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_All);
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return results;
            } else {
                return null;
            }
        } finally {
            cerrar(rs);
            cerrar(ps);
            cerrar(conn);
        }
    }

    public void delete(Observaciones ob, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, ob.getIdObservaciones());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }

    private List getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList();
        while (rs.next()) {
            Observaciones ob = new Observaciones();
            ob.setTitulo(rs.getString("titulo"));
            ob.setSubtitulo(rs.getString("subtitulo"));
            ob.setContenido(rs.getString("contenido"));
            ob.setDescripcion_img(rs.getString("descripcion_img"));
            ob.setBreve_descripcion(rs.getString("breve_descripcion"));
            ob.setImagen(rs.getString("img"));
            results.add(ob);
        }
        return results;
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
