/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.murdash.web.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.murdash.web.validators.LoginValidator")  // There could be any name
public class LoginValidator implements Validator {
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String username = value.toString();
        ResourceBundle bundle = ResourceBundle.getBundle("com.murdash.messages");
        try {
            if (username.length() < 5) {
                throw new IllegalArgumentException(bundle.getString("login_length_error"));
            }
            if (!Character.isLetter(username.charAt(0))) {
                throw new IllegalArgumentException(bundle.getString("login_start"));
            }
            if (getUsers().contains(username)) {
                throw new IllegalArgumentException(bundle.getString( "login_taken"));
            }
        } catch(IllegalArgumentException e) {
            FacesMessage message = new FacesMessage(bundle.getString(e.getMessage()));
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
    
    public static List<String> getUsers() { return new ArrayList<>(Arrays.asList("user","login")); }
    
}
