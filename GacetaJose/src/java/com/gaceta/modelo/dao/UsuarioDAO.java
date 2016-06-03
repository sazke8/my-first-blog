/**
 * TT-A068 GACETA_IPN
     * Cordova Hernandez Stephanie Abigail 
     * Popoca Quintanar Daniel
 */
package com.gaceta.modelo.dao;

import com.gaceta.modelo.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private static final String SQL_INSERT =
            "INSERT INTO usuario"
            + "(nombre, apellido_paterno, apellido_materno, email, usuario, password, sexo, rol)"
            + "VALUES (?,?,?,?,?,?,?,?)";
    
    private static final String SQL_SELECT_All =
            "SELECT * FROM usuario";
    
    private static final String SQL_UPDATE =
            "UPDATE usuario SET "
            + "nombre = ?, apellido_paterno = ?, apellido_materno = ?, email = ?, usuario = ?, password = ?, sexo = ?, rol = ?"
            + " WHERE "
            + "idusuario = ? ";
    
    private static final String SQL_DELETE =
            "DELETE FROM usuario WHERE "
            + "idusuario = ?";
    
    private static final String SQL_SELECT_CREDENCIALES =
            "SELECT * FROM usuario WHERE "
            + "usuario = ? and password = ?";
    
    private static final String SQL_SELECT_USUARIO = 
            "SELECT * FROM usuario WHERE "
            + "idusuario = ? ";
    
    public void create(Usuario u, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellidoP());
            ps.setString(3, u.getApellidoM());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getUsuario());
            ps.setString(6, u.getPassword());
            ps.setString(7, u.getSexo());
            ps.setString(8, u.getRol());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
        
    }
    
    public Usuario iniciarSesion(Usuario us,Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        //Usuario usuario = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_CREDENCIALES);
            ps.setString(1, us.getUsuario());
            ps.setString(2, us.getPassword());
            rs = ps.executeQuery();
            List<Usuario> lista = getResults(rs);
            if (lista.size() > 0) {
                return (Usuario) lista.get(0);
                //return usuario;
            }else{
                return null;
            }
        } finally {
            cerrar(rs);
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
    
    public void update(Usuario u, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellidoP());
            ps.setString(3, u.getApellidoM());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getUsuario());
            ps.setString(6, u.getPassword());
            ps.setString(7, u.getSexo());
            ps.setString(8, u.getRol());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    
    public Usuario verUsuario(Usuario u, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_USUARIO);
            ps.setInt(1, u.getIdUsuario());
            rs = ps.executeQuery();
            List lista = getResults(rs);
            if (lista.size() > 0) {
                return (Usuario) lista.get(0);
            }else{
                return null;
            }
        } finally {
            cerrar(ps);
            cerrar(conn);
            cerrar(rs);
        }
    }
    
    
  
    public void delete(Usuario u, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, u.getIdUsuario());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
        
        private List getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setIdUsuario(rs.getInt("idusuario"));
            u.setNombre(rs.getString("nombre"));
            u.setApellidoP(rs.getString("apellido_paterno"));
            u.setApellidoM(rs.getString("apellido_materno"));
            u.setEmail(rs.getString("email"));
            u.setUsuario(rs.getString("usuario"));
            u.setPassword(rs.getString("password"));
            u.setSexo(rs.getString("sexo"));
            u.setRol(rs.getString("rol"));         
            results.add(u);
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
