/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author sazke
 */
public class UsuarioDaoImplements implements UsuarioDao{

    @Override
    public Usuario findByUsuario(Usuario usuario) {
        Usuario model=null;
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        String query="From Usuario where usuario='"+usuario.getUsuario()+"'";
        try{
            sesion.beginTransaction();
            model=(Usuario) sesion.createQuery(query).uniqueResult();
            sesion.beginTransaction().commit();
        }catch(Exception e){
            sesion.beginTransaction().rollback();
        }
        return model;
    }

    @Override
    public Usuario login(Usuario usuario) {
        Usuario model = null;
        model = this.findByUsuario(usuario);
        if(model !=null){
            if(usuario.getPassword().equals(model.getPassword())){
                model= null;
            }
        }
        
        return model;
        
        
    }
    
}
