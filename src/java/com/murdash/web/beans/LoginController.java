package com.murdash.web.beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;

@Named(value = "loginController")
@RequestScoped
public class LoginController implements Serializable {
    @ManagedProperty(value="#page")
    private String page;
    public String getPage() { return "index2"; }
}
