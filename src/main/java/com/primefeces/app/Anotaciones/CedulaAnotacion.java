/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones;

import com.primefeces.app.Anotaciones.usuarios.validaciones.Cedula;
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
@Constraint(validatedBy = Cedula.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CedulaAnotacion {

    String doctipoid() default "doctipoid";

    String message() default "debe tener letras de la A a la A, números y el caracter -";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
