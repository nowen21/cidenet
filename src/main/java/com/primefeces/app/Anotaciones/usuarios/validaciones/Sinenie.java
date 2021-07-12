/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones.usuarios.validaciones;

import com.primefeces.app.Anotaciones.SinenieAnotacion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author NOWEN
 */
public class Sinenie implements ConstraintValidator<SinenieAnotacion, String> {

    @Override
    public void initialize(SinenieAnotacion contactNumber) {
    }

    @Override
    public boolean isValid(String volor, ConstraintValidatorContext contexto) {
        boolean respuest = true;
        // expresion regular para validar que el texto tenga solo letras mayúsculas sin la Ñ
        Pattern pattern = Pattern.compile("^[^Ñ][A-Z\\s]*$");
        Matcher matcher = pattern.matcher(volor);
        if (!matcher.matches()) {
            respuest = false;
        }
        return respuest;
    }
}
