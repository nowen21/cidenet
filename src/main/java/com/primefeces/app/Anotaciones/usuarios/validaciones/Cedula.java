/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones.usuarios.validaciones;

import com.primefeces.app.Anotaciones.CedulaAnotacion;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.ocpsoft.shade.org.apache.commons.beanutils.PropertyUtils;

/**
 *
 * @author NOWEN
 */
public class Cedula implements ConstraintValidator<CedulaAnotacion, Object> {

    private String doctipoid;

    @Override
    public void initialize(CedulaAnotacion contactNumber) {
        this.doctipoid = contactNumber.doctipoid();
    }

    /**
     *
     * @param volor
     * @param contexto
     * @return
     */
    @Override
    public boolean isValid(Object volor, ConstraintValidatorContext contexto) {
        boolean respuest = true;
//        try {
//            final Object first = PropertyUtils.getProperty(volor, this.doctipoid);
//            System.out.println(first);
//        } catch (final IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
//
//        }
        // expresion regular para validar que el texto tenga solo letras mayúsculas sin la Ñ
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9-]*$");
        Matcher matcher = pattern.matcher(volor.toString());
        if (!matcher.matches()) {
            respuest = false;
        }
        return respuest;
    }
}
