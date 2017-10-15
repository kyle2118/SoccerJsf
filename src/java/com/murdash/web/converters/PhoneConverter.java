/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.murdash.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("phoneConverter")
public class PhoneConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String result = value.toString();
        result = result.trim();
        if ( (result.contains("-")) || 
             (result.contains(" "))) {
            char[] array = result.toCharArray();
            StringBuilder sb = new StringBuilder(array.length);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '-' || array[i] == ' ') {
                    continue;
                } else {
                    sb.append(array[i]);
                }
            }
            result = sb.toString();
        }
        return result;
    }
    
}
