/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author NOWEN
 */
public class CampoRequeridoValidacion implements ConstraintValidator<CampoRequeridoAnotacion, String> {

    @Override
    public void initialize(CampoRequeridoAnotacion usuariox) {
        ConstraintValidator.super.initialize(usuariox); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean respuest = true;
        if (value.equals("")) {
            respuest = false;
        }
        return respuest;
    }

}
