/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.murdash.web.validators;

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
        if (username.length() < 5) {
            ResourceBundle bundle = ResourceBundle.getBundle("com.murdash.messages");
            FacesMessage facesMsg = new FacesMessage(bundle.getString("login_length_error"));
            facesMsg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMsg);
        }
        
        
        
    }
    
}
