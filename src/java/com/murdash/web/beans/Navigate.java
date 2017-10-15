/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.murdash.web.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author admin
 */
@Named(value = "navigate")
@RequestScoped
public class Navigate {

    @ManagedProperty(value = "nav")
    private String nav;
    
    public Navigate() {
    }
    
    public String getNav() { return "index2"; }
    public void setNav(String newValue) { nav = newValue; }
    
}
