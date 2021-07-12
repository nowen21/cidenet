/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones;

import com.primefeces.app.Anotaciones.usuarios.validaciones.Sinenie;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author NOWEN
 */
@Constraint(validatedBy = Sinenie.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface  SinenieAnotacion {
    String message() default "no debe contener caracteres como la Ñ o especiales a diferencia del espacio";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
