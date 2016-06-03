/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.UsuarioDao;
import dao.UsuarioDaoImplements;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Usuario;
import org.primefaces.context.RequestContext;
import util.MyUtil;

/**
 *
 * @author sazke
 */
@ManagedBean
@SessionScoped
public class loginBean implements Serializable {

    public loginBean() {
        this.usuariodao = new UsuarioDaoImplements();
        if (this.usuario == null) {
            this.usuario = new Usuario();
        }
    }

    private Usuario usuario;
    private UsuarioDao usuariodao;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn;
        String ruta = "";
        this.usuario = this.usuariodao.login(this.usuario);
        System.out.println("Encontre "+this.usuario.toString());
        if (this.usuario != null) {
            loggedIn = true;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario.getUsuario());
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido al sistema trigarante: ", this.usuario.getUsuario());
            ruta = MyUtil.basePathLogin() + "views/" + this.usuario.getRol() + "/dashboard.xhtml";
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Credenciales incorrectas");
            if (this.usuario == null) {
                this.usuario = new Usuario();
            }
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }

}
