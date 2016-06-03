/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dao;

import com.gaceta.modelo.dto.Borrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorradorDAO {
    private static final String SQL_INSERT_G =
            "INSERT INTO borrador(titulo,subtitulo,breve_descripcion,contenido,fecha,descripcion_img,imagen,status,idusuario)"
           +"VALUES (?,?,?,?,?,?,null,'G',?)";
    private static final String SQL_INSERT_PC =
            "INSERT INTO borrador(titulo,subtitulo,breve_descripcion,contenido,fecha,descripcion_img,imagen,status,idusuario)"
           +"VALUES (?,?,?,?,?,?,null,'PC',?)";
    
    private static final String SQL_SELECT_G =
            "SELECT * FROM borrador WHERE status = 'G'";
    
    private static final String SQL_SELECT_PC =
            "SELECT * FROM borrador WHERE status = 'PC'";
    
    private static final String SQL_SELECT_A =
            "SELECT * FROM borrador WHERE status = 'A'";
    
    private static final String SQL_UPDATE_BORRADOR_PC =
            "UPDATE borrador SET "
            + "titulo = ?, subtitulo = ?, breve_descripcion = ?, contenido = ?, fecha = ?, descripcion_img = ?, status = 'PC' "
            + " WHERE "
            + "idarticulo = ? ";
    
    private static final String SQL_SELECT_BORRADOR = 
            "SELECT * FROM borrador WHERE "
            + "idarticulo = ? ";
    
    /* SQL to delete data */
    private static final String SQL_DELETE =
            "DELETE FROM borrador WHERE "
            + "idarticulo = ?";
    
    public void guardar(Borrador b, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT_G);
            ps.setString(1, b.getTitulo());
            ps.setString(2, b.getSubtitulo());
            ps.setString(3, b.getBreve_descripcion());
            ps.setString(4, b.getContenido());
            java.sql.Date sqlDate = new java.sql.Date(b.getFecha().getTime());
            ps.setDate(5, sqlDate);
            ps.setString(6, b.getDescripcion_img());
            ps.setInt(7, b.getIdUsuario());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    public void enviar(Borrador b, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT_PC);
            ps.setString(1, b.getTitulo());
            ps.setString(2, b.getSubtitulo());
            ps.setString(3, b.getBreve_descripcion());
            ps.setString(4, b.getContenido());
            java.sql.Date sqlDate = new java.sql.Date(b.getFecha().getTime());
            ps.setDate(5, sqlDate);
            ps.setString(6, b.getDescripcion_img());
            ps.setInt(7, b.getIdUsuario());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    public List loadStatusG(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_G);
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
    
    public List loadStatusPC(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_PC);
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
    
    public List loadStatusA(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_A);
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
    public Borrador editarBorrador(Borrador b, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_BORRADOR);
            ps.setInt(1, b.getIdArticulo());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return (Borrador) results.get(0);
            } else {
                return null;
            }
        } finally {
            cerrar(rs);
            cerrar(ps);
            cerrar(conn);
        }
    }
    
    public void actualizarBorradorG(Borrador b, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE_BORRADOR_PC);
            ps.setString(1, b.getTitulo());
            ps.setString(2, b.getSubtitulo());
            ps.setString(3, b.getBreve_descripcion());
            ps.setString(4, b.getContenido());
            java.sql.Date sqlDate = new java.sql.Date(b.getFecha().getTime());
            ps.setDate(5, sqlDate);
            ps.setInt(6, b.getIdArticulo());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
 
    public void delete(Borrador b, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, b.getIdArticulo());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }

    private List getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList();
        while (rs.next()) {
            Borrador b = new Borrador();
            //b.setIdBorrador(rs.getInt("idborrador"));
            b.setIdArticulo(rs.getInt("idarticulo"));
            b.setTitulo(rs.getString("titulo"));
            b.setSubtitulo(rs.getString("subtitulo"));
            b.setContenido(rs.getString("contenido"));
            b.setDescripcion_img(rs.getString("descripcion_img"));
            b.setBreve_descripcion(rs.getString("breve_descripcion"));
            b.setFecha(rs.getDate("fecha"));
            //b.setImagen(rs.getBytes("imagen"));
            results.add(b);
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