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

@FacesValidator("com.murdash.web.validators.PasswordValidator")
public class PasswordValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String password = value.toString();
        if (password.length() < 5) {
            ResourceBundle bundle = ResourceBundle.getBundle("com.murdash.messages");
            FacesMessage message =  new FacesMessage(bundle.getString("password_length_error"));
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
    
}
