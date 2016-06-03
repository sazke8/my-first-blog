/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.servlet.http.Part;

/**
 *
 * @author sazke
 */
@ManagedBean
@ApplicationScoped
public class fileUploadFormBean {

    private Part fileUpload;

    public fileUploadFormBean() {
    }

    
    public Part getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(Part fileUpload) {
        this.fileUpload = fileUpload;
    }
}
